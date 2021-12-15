package com.wei.laundrylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cxz.kotlin.baselibs.base.BaseMvpActivity
import com.wei.laundrylist.contract.HomeContract
import com.wei.laundrylist.presenter.HomePresenter

class HomeActivity : BaseMvpActivity<HomeContract.View,HomeContract.Presenter>(),HomeContract.View {

    override fun createPresenter() = HomePresenter()

    override fun attachLayoutRes() = R.layout.activity_home

    override fun initData() {
        super.initData()
    }

    override fun start() {

    }

}