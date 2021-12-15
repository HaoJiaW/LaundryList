package com.wei.laundrylist.presenter

import android.content.Context
import android.os.Handler
import android.os.Looper
import com.cxz.kotlin.baselibs.mvp.BasePresenter
import com.wei.laundrylist.contract.HomeContract
import com.wei.laundrylist.model.HomeModel
import java.lang.ref.WeakReference

class HomePresenter : BasePresenter<HomeContract.Model, HomeContract.View>(), HomeContract.Presenter {


    override fun createModel(): HomeContract.Model? {
        return HomeModel()
    }

    //函数默认是public修饰符
    fun initParams(){
        val context: Context = mView as Context
        MainHandler(context).postDelayed({

        },1000)
    }

    class MainHandler(context: Context) : Handler(Looper.getMainLooper()){

        var mContext: WeakReference<Context>? = null

        init {
            mContext = WeakReference<Context>(context)
        }

    }


}