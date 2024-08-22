package com.finappproyect.apphoroscopo.ui.horoscopo

import androidx.lifecycle.ViewModel
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopoViewModel @Inject constructor() : ViewModel(){

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = listOf(
            HoroscopeInfo.Aries
        )
    }


}