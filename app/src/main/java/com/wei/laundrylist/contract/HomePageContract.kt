package com.wei.laundrylist.contract

import com.cxz.kotlin.baselibs.mvp.IModel
import com.cxz.kotlin.baselibs.mvp.IPresenter
import com.cxz.kotlin.baselibs.mvp.IView

interface HomePageContract {

    interface View:IView{

    }

    interface Presenter:IPresenter<HomePageContract.View>{

    }

    interface Model : IModel {

    }

}