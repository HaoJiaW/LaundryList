package com.wei.laundrylist.presenter

import com.cxz.kotlin.baselibs.mvp.BasePresenter
import com.wei.laundrylist.bean.EventRecord
import com.wei.laundrylist.contract.HomePageContract
import com.wei.laundrylist.model.HomePageModel
import org.litepal.LitePal

class HomePagePresenter :BasePresenter<HomePageContract.Model,HomePageContract.View>(), HomePageContract.Presenter {

    override fun createModel(): HomePageContract.Model? {
        return HomePageModel()
    }

    fun getRecordList() = LitePal.findAll(EventRecord::class.java)



}