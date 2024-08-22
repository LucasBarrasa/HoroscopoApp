package com.finappproyect.apphoroscopo.ui.horoscopo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.finappproyect.apphoroscopo.databinding.FragmentHoroscopoBinding
import com.finappproyect.apphoroscopo.ui.horoscopo.adapters.HoroscopoAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HoroscopoFragment : Fragment() {

    private val HoroscopoViewModel by viewModels<HoroscopoViewModel>()

    private var _binding: FragmentHoroscopoBinding? = null
    private val binding get() = _binding!!

    private lateinit var horoscopoAdapter: HoroscopoAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initUIState()
        initList()
    }

    private fun initList() {
        horoscopoAdapter = HoroscopoAdapter()
        binding.rvSignosHoroscopo.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = horoscopoAdapter
        }

    }

    private fun initUIState() {

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHoroscopoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}