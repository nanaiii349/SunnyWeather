package com.sunnyweather.android.service.model

import com.sunnyweather.android.R

class Sky (val info: String, val icon: Int, val bg: Int)

private val sky = mapOf(
    "CLEAR_DAY" to Sky("晴", R.drawable.ic_clear_day, R.drawable.sunny),
    "CLEAR_NIGHT" to Sky("晴", R.drawable.ic_clear_night, R.drawable.sunny),
    "PARTLY_CLOUDY_DAY" to Sky("多云", R.drawable.ic_partly_cloud_day, R.drawable.wind_day),
    "PARTLY_CLOUDY_NIGHT" to Sky("多云", R.drawable.ic_partly_cloud_night, R.drawable.wind_day),
    "CLOUDY" to Sky("阴", R.drawable.ic_cloudy, R.drawable.wind_day),
    "WIND" to Sky("大风", R.drawable.ic_cloudy, R.drawable.wind_day),
    "LIGHT_RAIN" to Sky("小雨", R.drawable.ic_light_rain, R.drawable.rain_day),
    "MODERATE_RAIN" to Sky("中雨", R.drawable.ic_moderate_rain, R.drawable.rain_day),
    "HEAVY_RAIN" to Sky("大雨", R.drawable.ic_heavy_rain, R.drawable.rain_day),
    "STORM_RAIN" to Sky("暴雨", R.drawable.ic_storm_rain, R.drawable.rain_day),
    "THUNDER_SHOWER" to Sky("雷阵雨", R.drawable.ic_thunder_shower, R.drawable.rain_day),
    "SLEET" to Sky("雨夹雪", R.drawable.ic_sleet, R.drawable.rain_day),
    "LIGHT_SNOW" to Sky("小雪", R.drawable.ic_light_snow, R.drawable.snow_day),
    "MODERATE_SNOW" to Sky("中雪", R.drawable.ic_moderate_snow, R.drawable.snow_day),
    "HEAVY_SNOW" to Sky("大雪", R.drawable.ic_heavy_snow, R.drawable.snow_day),
    "STORM_SNOW" to Sky("暴雪", R.drawable.ic_heavy_snow, R.drawable.snow_day),
    "HAIL" to Sky("冰雹", R.drawable.ic_hail, R.drawable.snow_day),
    "LIGHT_HAZE" to Sky("轻度雾霾", R.drawable.ic_light_haze, R.drawable.og_day),
    "MODERATE_HAZE" to Sky("中度雾霾", R.drawable.ic_moderate_haze, R.drawable.og_day),
    "HEAVY_HAZE" to Sky("重度雾霾", R.drawable.ic_heavy_haze, R.drawable.og_day),
    "FOG" to Sky("雾", R.drawable.ic_fog, R.drawable.og_day),
    "DUST" to Sky("浮尘", R.drawable.ic_fog, R.drawable.og_day)
    )

fun getSky(skycon: String): Sky {
    return sky[skycon] ?: sky["CLEAR_DAY"]!!
}