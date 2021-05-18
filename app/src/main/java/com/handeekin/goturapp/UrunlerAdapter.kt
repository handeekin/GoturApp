package com.handeekin.goturapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.handeekin.goturapp.databinding.UrunCardBinding

class UrunlerAdapter(var mContext:Context,var urunKategorileri:List<UrunCesitleri>):RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu (cardTasarimBinding: UrunCardBinding):RecyclerView.ViewHolder(cardTasarimBinding.root){
        var cardTasarim:UrunCardBinding

        init{
            this.cardTasarim = cardTasarimBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = UrunCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }


    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunKategorileri.get(position)
       // holder.cardTasarim.textViewUrunKategoriAdi.text = "${urun.urun_kategori}"
        holder.cardTasarim.urunNesnesi = urun

        holder.cardTasarim.imageViewUrunKategori.setImageResource(mContext.resources.getIdentifier(urun.urun_resim_adi,"drawable",mContext.packageName))

        holder.cardTasarim.cardView.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.kategoriDetayGecis(urun)

            Navigation.findNavController(it).navigate(gecis)
        }

    }



    override fun getItemCount(): Int {
        return urunKategorileri.size
    }
}