package com.finappproyect.apphoroscopo.domain.model

sealed class HoroscopeInfo (val imgSigno: Int, val nameSigno: Int){

    object Aries: HoroscopeInfo(1,1)

}