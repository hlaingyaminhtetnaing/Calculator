package com.hlaingyaminhtetnaing.mycalculatorviewmodel.viewmodel

import androidx.lifecycle.ViewModel

class calculatorViewModel :ViewModel(){
    private var result:Int=0
    fun add(a:Int,b:Int):Int{
        result=a+b
        return result
    }
    fun sub(a:Int,b: Int):Int{
        result=a-b
        return result
    }
    fun multiply(a:Int,b:Int):Int{
        result=a*b
        return result
    }
    fun Division(a: Int,b: Int):Int{
        result=a/b
        return result
    }
}