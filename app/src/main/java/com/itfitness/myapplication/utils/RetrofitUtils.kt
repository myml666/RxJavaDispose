package com.itfitness.myapplication.utils

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import javax.xml.datatype.DatatypeConstants.SECONDS
import okhttp3.logging.HttpLoggingInterceptor
import java.io.UnsupportedEncodingException
import java.net.URLDecoder
import java.util.concurrent.TimeUnit


/**
 *
 * @ProjectName:    RxJavaDispose
 * @Package:        com.itfitness.myapplication.utils
 * @ClassName:      RetrofitUtils
 * @Description:     java类作用描述 ：
 * @Author:         作者名：lml
 * @CreateDate:     2019/6/13 10:55
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/6/13 10:55
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
object RetrofitUtils {
    private val BASE_URL = "http://192.168.0.137:8080/MPlayer/"
    @Volatile
    private var mRetrofit: Retrofit? = null
    init {
        initRetrofit()
    }
    private fun initRetrofit() {
        val interceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message ->
            try {
                val msg = URLDecoder.decode(message, "utf-8")
            } catch (e: UnsupportedEncodingException) {
                e.printStackTrace()
            }
        })
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        /**okhttp默认时间10秒 请求时间较长时，重新设置下   */
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(15, TimeUnit.SECONDS)
        builder.readTimeout(20, TimeUnit.SECONDS)
        builder.writeTimeout(20, TimeUnit.SECONDS)
        builder.retryOnConnectionFailure(true)
        val client = builder.build()
        mRetrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build()
    }

    fun <T> getApiServier(reqServer: Class<T>): T {
        return mRetrofit!!.create(reqServer)
    }
}