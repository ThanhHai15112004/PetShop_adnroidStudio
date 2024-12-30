package com.example.petshop
import PetAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petshop.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Dữ liệu mẫu
        val petList = listOf(
            Pet(R.drawable.husky, "Chó Husky", "HK445", "8,000,000 VND"),
            Pet(R.drawable.border_collie, "Chó Border Collie", "BCL652", "9,000,000 VND"),
            Pet(R.drawable.bicolor_cat, "Mèo Anh lông dài", "ALD789", "8,000,000 VND"),
            Pet(R.drawable.persian_cat, "Mèo Ba Tư", "HML854", "9,000,000 VND")
        )

        val gridLayoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.adapter = PetAdapter(petList)
    }
}
