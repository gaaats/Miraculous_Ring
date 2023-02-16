package com.generamobile.headsoccerl.vevvev

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.generamobile.headsoccerl.amaaaain.Iffjirfi
import com.generamobile.headsoccerl.gtgthhy.Jifrfhuhhfr
import com.generamobile.headsoccerl.gtgthhy.CountryRepo
import com.generamobile.headsoccerl.gtgthhy.DevRepo
import com.generamobile.headsoccerl.gtgthhy.NKFrnfrnrfnjrf
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val gtgtgtgthy = module {
    single<NKFrnfrnrfnjrf>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(NKFrnfrnrfnjrf::class.java)
    }

    single <Jifrfhuhhfr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Jifrfhuhhfr::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://miraculousring.xyz/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    factory(named("DevRep")) {
        DevRepo(get(named("HostInter")))
    }
    factory (named("CountryRep")) {
        CountryRepo(get(named("ApiInter")))
    }

    single {
        dedfrfrgtgtgt()
    }
    single(named("SharedPreferences")) {
        jukiikikkiololol(androidApplication())
    }

}
fun jukiikikkiololol(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun dedfrfrgtgtgt(): Moshi {
    return Moshi.Builder().build()
}

val bgbhnhhyjuujujujuj = module {
    viewModel (named("MainModel")){
        Iffjirfi(get(named("CountryRep")), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
}