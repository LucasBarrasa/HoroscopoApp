package com.finappproyect.apphoroscopo.ui.horoscopo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.finappproyect.apphoroscopo.databinding.FragmentHoroscopoBinding
import com.finappproyect.apphoroscopo.ui.horoscopo.adapters.HoroscopoAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HoroscopoFragment : Fragment() {

    private val horoscopoViewModel by viewModels<HoroscopoViewModel>()
    private lateinit var horoscopoAdapter: HoroscopoAdapter

    private var _binding: FragmentHoroscopoBinding? = null
    private val binding get() = _binding!!

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
            layoutManager = GridLayoutManager(context, 2)
            adapter = horoscopoAdapter
        }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopoViewModel.horoscope.collect {
                    horoscopoAdapter.updateList(it)
                }
            }
        }

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