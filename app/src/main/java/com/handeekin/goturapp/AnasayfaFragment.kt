package com.handeekin.goturapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.handeekin.goturapp.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding
    private lateinit var urunlerKategorileri:ArrayList<UrunCesitleri>
    private lateinit var adapter: UrunlerAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        tasarim.rvurun.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val uk1 = UrunCesitleri(1,"suicecek","Su & İçecek")
        val uk2 = UrunCesitleri(2,"meyvesebze","Meyve & Sebze")
        val uk3 = UrunCesitleri(3,"firindan","Fırından")
        val uk4 = UrunCesitleri(4,"temelgida","Temel Gıda")
        val uk5 = UrunCesitleri(5,"atistirmalik","Atıştırmalık")
        val uk6 = UrunCesitleri(6,"dondurma","Dondurma")
        val uk7 = UrunCesitleri(7,"yiyecek","Yiyecek")
        val uk8 = UrunCesitleri(8,"sutkahvalti","Süt & Kahvaltı")
        val uk9 = UrunCesitleri(9,"fitform","Fit & Form")
        val uk10 = UrunCesitleri(10,"kisiselbakim","Kişisel Bakım")
        val uk11 = UrunCesitleri(11,"evbakim","Ev Bakım")
        val uk12 = UrunCesitleri(12,"evyasam","Ev & Yaşam")
        val uk13 = UrunCesitleri(13,"teknoloji","Teknoloji")
        val uk14 = UrunCesitleri(14,"evcilhayvan","Evcil Hayvan")
        val uk15 = UrunCesitleri(15,"bebek","Bebek")
        val uk16 = UrunCesitleri(16,"cinselsaglik","Cinsel Sağlık")
        val uk17 = UrunCesitleri(17,"giyim","Giyim")

        urunlerKategorileri = ArrayList()
        urunlerKategorileri .add(uk1)
        urunlerKategorileri .add(uk2)
        urunlerKategorileri .add(uk3)
        urunlerKategorileri .add(uk4)
        urunlerKategorileri .add(uk5)
        urunlerKategorileri .add(uk6)
        urunlerKategorileri .add(uk7)
        urunlerKategorileri .add(uk8)
        urunlerKategorileri .add(uk9)
        urunlerKategorileri .add(uk10)
        urunlerKategorileri .add(uk11)
        urunlerKategorileri .add(uk12)
        urunlerKategorileri .add(uk13)
        urunlerKategorileri .add(uk14)
        urunlerKategorileri .add(uk15)
        urunlerKategorileri .add(uk16)
        urunlerKategorileri .add(uk17)

        adapter = UrunlerAdapter(requireContext(),urunlerKategorileri )
       // tasarim.rvurun.adapter = adapter

        tasarim.urunlerAdapter = adapter




        return tasarim.root

    }


}