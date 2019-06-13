package com.itfitness.myapplication.api

import com.itfitness.myapplication.beans.ResultBean
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET


/**
 *
 * @ProjectName:    RxJavaDispose
 * @Package:        com.itfitness.myapplication.api
 * @ClassName:      Api
 * @Description:     java类作用描述 ：
 * @Author:         作者名：lml
 * @CreateDate:     2019/6/13 10:59
 * @UpdateUser:     更新者：
 * @UpdateDate:     2019/6/13 10:59
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
interface Api {
    @GET("gethomebanner")
    fun getHomeBanner(): Observable<ResultBean>
    @GET("gethomehot")
    fun getHomeHot(): Observable<ResultBean>
}