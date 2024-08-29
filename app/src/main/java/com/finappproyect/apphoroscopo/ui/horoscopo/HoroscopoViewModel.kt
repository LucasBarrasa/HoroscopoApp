package com.finappproyect.apphoroscopo.ui.horoscopo

import androidx.lifecycle.ViewModel
import com.finappproyect.apphoroscopo.data.providers.HoroscopeProvider
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Aquarius
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Aries
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Cancer
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Capricorn
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Gemini
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Leo
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Libra
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Pisces
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Sagittarius
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Scorpio
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Taurus
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo.Virgo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopoViewModel @Inject constructor(horoscopoProvider: HoroscopeProvider) : ViewModel(){

    private var _horoscopo = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscopo: StateFlow<List<HoroscopeInfo>> = _horoscopo

    init {
        _horoscopo.value = horoscopoProvider.getHoroscope()
    }

}
