package com.finappproyect.apphoroscopo.ui.horoscopo.adapters

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.finappproyect.apphoroscopo.databinding.ItemHoroscopoBinding
import com.finappproyect.apphoroscopo.domain.model.HoroscopeInfo

class HoroscopoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopoBinding.bind(view)

    fun render(itemSigno: HoroscopeInfo, onSignoSelected:(HoroscopeInfo)->Unit) {
        val context = binding.root.context

        binding.ivHoroscopeImg.setImageResource(itemSigno.imgSigno)
        binding.tvNameSigno.text = context.getString(itemSigno.nameSigno)

        binding.root.setOnClickListener {
            animationRotationSelection(binding.ivHoroscopeImg, newLambda = {onSignoSelected(itemSigno)})

        }

    }

    private fun animationRotationSelection(view: View, newLambda:()->Unit) {
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction { newLambda() }
            start()
        }

    }

}