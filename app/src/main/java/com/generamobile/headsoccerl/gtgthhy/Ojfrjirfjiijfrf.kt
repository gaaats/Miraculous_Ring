package com.generamobile.headsoccerl.gtgthhy

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET

interface NKFrnfrnrfnjrf {
    @GET("go.php?to=1&")
    suspend fun ffrgtgtgth(): Response<OFjrijgjgtigtgtigt>
}

interface Jifrfhuhhfr {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun gbghnnhnh(): Response<Nfjnfrnjfrjnrf>
}

class DevRepo(private val ssdeedfr: NKFrnfrnrfnjrf) {
    suspend fun gthyhyjuujujuj() = ssdeedfr.ffrgtgtgth()
}


class CountryRepo(private val bgbgyhhjuujujuj: Jifrfhuhhfr) {
    suspend fun gthyyhyjuujuj() = bgbgyhhjuujujuj.gbghnnhnh()
}

@Keep
data class OFjrijgjgtigtgtigt(
    @JsonClass(generateAdapter = true)
    @Json(name = "countryrator")
    val countryrator: String,
    @Json(name = "vebpath")
    val vebpath: String,
    @Json(name = "mainnumber")
    val mainnumber: String
)

@Keep
data class Nfjnfrnjfrjnrf(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val gtgthyhyhyhyhy: String,
)