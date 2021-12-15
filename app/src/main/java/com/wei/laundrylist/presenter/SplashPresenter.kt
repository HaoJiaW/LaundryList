package com.wei.laundrylist.presenter

import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.cxz.kotlin.baselibs.base.BaseActivity
import com.cxz.kotlin.baselibs.mvp.BasePresenter
import com.wei.laundrylist.HomeActivity
import com.wei.laundrylist.contract.SplashContract
import com.wei.laundrylist.model.SplashModel
import java.lang.ref.WeakReference

class SplashPresenter : BasePresenter<SplashContract.Model, SplashContract.View>(), SplashContract.Presenter {


    override fun createModel(): SplashContract.Model? {
        return SplashModel()
    }

    //函数默认是public修饰符
    fun initParams(){
        val context:Context = mView as Context
        MainHandler(context).postDelayed({
            val activity = mView as BaseActivity
            activity.startActivity(Intent(activity,HomeActivity::class.java))
            activity.finish()
        },1000)
    }

    class MainHandler(context: Context) : Handler(Looper.getMainLooper()){

        var mContext:WeakReference<Context>? = null

        init {
            mContext = WeakReference<Context>(context)
        }

    }


}