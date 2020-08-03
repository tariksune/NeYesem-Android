package com.tariksune.neyesem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val yemekListesi = arrayListOf("Pizza","Hamburger","Kuru Fasulye","Döner","İskender","Kebap","Tantuni","Ciğer","Büryan","Patates Kızartması","Köfte","Tavuk","Kuzu Şiş","Kanat","Biber Dolması")
    val araSicakListesi = arrayListOf("Patates","Sigara Böreği","Çiğköfte")
    val icecekListesi = arrayListOf("Kola","Fanta","Gazoz","Su","Ayran","Şalgam","Meyve Suyu","Limonata","Ice Tea")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        degistirmeButonu.setOnClickListener {
            val random = Random()
            val randomYemek = random.nextInt(yemekListesi.count())
            yemekEkrani.text = yemekListesi[randomYemek]
            val randomYanUrun = random.nextInt(araSicakListesi.count())
            yanUrunEkrani.text = araSicakListesi[randomYanUrun]
            val randomIcecek = random.nextInt(icecekListesi.count())
            icecekEkrani.text = icecekListesi[randomIcecek]
        }
    }
}
