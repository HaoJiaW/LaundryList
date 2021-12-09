package com.wei.laundrylist.contract

import com.cxz.kotlin.baselibs.mvp.IModel
import com.cxz.kotlin.baselibs.mvp.IPresenter
import com.cxz.kotlin.baselibs.mvp.IView

interface SplashContract {

    interface View : IView{

    }

    interface Presenter : IPresenter<View>{

    }

    interface Model : IModel{

    }
}