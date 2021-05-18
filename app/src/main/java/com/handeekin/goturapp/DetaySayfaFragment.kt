package com.handeekin.goturapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.handeekin.goturapp.databinding.FragmentDetaySayfaBinding


class DetaySayfaFragment : Fragment() {

    private lateinit var tasarim : FragmentDetaySayfaBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_detay_sayfa,container,false)

        val b: DetaySayfaFragmentArgs by navArgs()
        val gelenUrun = b.urunNesne

        tasarim.imageViewKategoriResim.setImageResource(resources.getIdentifier(gelenUrun.urun_resim_adi,"drawable",requireContext().packageName))
        //tasarim.textViewKategoriBaslik.text = gelenUrun.urun_kategori

        tasarim.urunNesnesi = gelenUrun

        return tasarim.root
    }


}