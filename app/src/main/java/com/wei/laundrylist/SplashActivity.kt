package com.wei.laundrylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cxz.kotlin.baselibs.base.BaseMvpActivity
import com.wei.laundrylist.R
import com.wei.laundrylist.contract.SplashContract
import com.wei.laundrylist.presenter.SplashPresenter
import java.util.*

class SplashActivity : BaseMvpActivity<SplashContract.View,SplashContract.Presenter>(),SplashContract.View {

    override fun createPresenter(): SplashContract.Presenter {
        return SplashPresenter()
    }

    override fun attachLayoutRes(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        super.initData()
        (mPresenter as SplashPresenter).initParams()
    }

    override fun start() {

    }

}