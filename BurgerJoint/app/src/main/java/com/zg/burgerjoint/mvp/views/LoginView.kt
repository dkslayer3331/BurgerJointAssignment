package com.zg.burgerjoint.mvp.views

/**
 * Created by Moe Htet on 11,July,2020
 */
interface LoginView : BaseView{
    fun navigateToMainScreen()
    fun showErrorMessage(message : String)
}