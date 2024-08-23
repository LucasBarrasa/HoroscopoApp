package com.finappproyect.apphoroscopo.ui.horoscopo.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finappproyect.apphoroscopo.R
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo

class HoroscopoAdapter(private var signo: List<HoroscopeInfo> = emptyList()) :
    RecyclerView.Adapter<HoroscopoViewHolder>() {

    fun updateList (listSignos: List<HoroscopeInfo>){
        this.signo = listSignos

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopoViewHolder {
        return HoroscopoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_horoscopo, parent, false))
    }

    override fun onBindViewHolder(viewHolder: HoroscopoViewHolder, position: Int) {
        viewHolder.render(signo[position])
    }

    override fun getItemCount() = signo.size
}