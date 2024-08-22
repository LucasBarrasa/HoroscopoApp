package com.finappproyect.apphoroscopo.ui.horoscopo.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.finappproyect.apphoroscopo.databinding.ItemHoroscopoBinding
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo

class HoroscopoViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopoBinding.bind(view)

    fun render(itemSigno: HoroscopeInfo){
        val context = binding.root.context

        binding.ivHoroscopeImg.setImageResource(itemSigno.imgSigno)
        binding.tvNameSigno.text = context.getString(itemSigno.nameSigno)

    }


}