package com.itfitness.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.LogUtils
import com.itfitness.myapplication.api.Api
import com.itfitness.myapplication.utils.RetrofitUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private var mDis:CompositeDisposable = CompositeDisposable()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_one.setOnClickListener {
            getHomeBanner()//获取首页Banner
            getHomeHot()//获取首页热门
        }
    }

    /**
     * 获取首页Banner
     */
    fun getHomeBanner(){
        mDis.add(RetrofitUtils.getApiServier(Api::class.java)
                .getHomeBanner()
                .delay(3,TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    for (v in it.data){
                        LogUtils.eTag("首页Banner",v.toString())
                    }
                },{
                    LogUtils.eTag("首页Banner",it.message)
                }))
    }

    /**
     * 获取首页热门
     */
    fun getHomeHot(){
        mDis.add(
                RetrofitUtils.getApiServier(Api::class.java)
                        .getHomeHot()
                        .delay(4,TimeUnit.SECONDS)//延时4秒执行请求
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe({
                            for (v in it.data){
                                LogUtils.eTag("首页热门",v.toString())
                            }
                        },{
                            LogUtils.eTag("首页热门",it.message)
                        })
        )
    }
//    override fun onDestroy() {
//        super.onDestroy()
//        mDis.clear()
//        LogUtils.eTag("请求取消","所有请求已取消")
//    }
}
