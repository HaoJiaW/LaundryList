package com.wei.laundrylist

import com.cxz.kotlin.baselibs.base.BaseMvpFragment
import com.wei.laundrylist.contract.HomePageContract
import com.wei.laundrylist.presenter.HomePagePresenter

class HomePageFragment : BaseMvpFragment<HomePageContract.View,HomePageContract.Presenter>(),HomePageContract.View {

    override fun createPresenter() = HomePagePresenter()

    var presenter : HomePagePresenter? = null;

    override fun attachLayoutRes() = R.layout.fragment_home_page

    override fun lazyLoad() {
        presenter = mPresenter as HomePagePresenter

        val recordList = presenter?.getRecordList()


    }
}