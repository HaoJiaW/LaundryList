package com.wei.laundrylist.presenter

import com.cxz.kotlin.baselibs.mvp.BasePresenter
import com.wei.laundrylist.contract.SplashContract
import com.wei.laundrylist.model.SplashModel

class SplashPresenter : BasePresenter<SplashContract.Model, SplashContract.View>(), SplashContract.Presenter {

    override fun createModel(): SplashContract.Model? {
        return SplashModel()
    }


}