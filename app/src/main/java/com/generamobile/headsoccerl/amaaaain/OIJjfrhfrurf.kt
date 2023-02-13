package com.generamobile.headsoccerl.amaaaain

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Jifhurfhrfhfr {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun hyjuujujgvb(): Response<JOIfjijrfrf>

    @GET("toxic.json")
    suspend fun njjkiik(): Response<NJfnrfrhuhfrh>
}


@Keep
data class NJfnrfrhuhfrh(
    @SerializedName("countryrator")
    val mjmkikiklo: String,
    @SerializedName("vebpath")
    val ukilool: String,
    @SerializedName("mainnumber")
    val yhyhyjujuuj: String,
)


@Keep
data class JOIfjijrfrf(
    @SerializedName("city")
    val hjuujujujhyh: String,
    @SerializedName("country")
    val jujujuju: String,
    @SerializedName("countryCode")
    val ololololo: String,
)