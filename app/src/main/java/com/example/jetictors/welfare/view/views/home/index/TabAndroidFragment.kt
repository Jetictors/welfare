package com.example.jetictors.welfare.view.views.home.index

import android.annotation.SuppressLint
import com.example.jetictors.welfare.base.BaseFragment
import com.example.jetictors.welfare.view.UI.TabAndroidUI

/**
 * 描述    : android页fragment
 * author  : Jetictors
 * time    :  2017/10/31 14:48
 * version : v1.0.1
 */
class TabAndroidFragment @SuppressLint("ValidFragment")
private constructor(): BaseFragment<TabAndroidUI,TabAndroidFragment>(){

    override fun getAnkoUI(): TabAndroidUI{
        return TabAndroidUI()
    }

    override fun initView() {
    }

    override fun initData() {
    }

    companion object {
        fun newInstance(): TabAndroidFragment {
            val tabAndroidFragment = TabAndroidFragment()
            return tabAndroidFragment
        }
    }

}