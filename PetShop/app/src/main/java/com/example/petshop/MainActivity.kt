package com.example.petshop
import PetAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petshop.R
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    //*************************************************************
    //Chưa tìm các chèn tất cả giao diện vô 1 cái main đc
    //nên toi fix bằng các muốn xài giao diện nào thì gỡ cmt cái đó
    //rồi bỏ cmt vô cái khác là nó chạy
    //****************************************************************
    //Trang Chu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
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
    //*******************************************************************************
    //Thong tin ca nhan
    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
            val btnEdit: Button = findViewById(R.id.btnEdit)

            btnEdit.setOnClickListener {
                Toast.makeText(this, "Bạn đã bấm nút Chỉnh sửa", Toast.LENGTH_SHORT).show()
                }
        }
    */
    //******************************************************************************
    //Uu dai
    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promotion)
        val btnUseNow: Button = findViewById(R.id.btnUseNow)
        btnUseNow.setOnClickListener {
            Toast.makeText(this, "Bạn đã bấm nút Dùng ngay", Toast.LENGTH_SHORT).show()
        }
    }
    */
    //*********************************************************************************
    //Lich su giao dich
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_history)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val transactions = listOf(
            Transaction("902 Tạ Quang Bửu | 15/12 23:37:26", "#123456", "Nguyễn Văn A", "Chó Husky", "Không có"),
            Transaction("902 Tạ Quang Bửu | 15/12 23:30:26", "#123457", "Trần Văn B", "Chó Alaska", "Đổi trả"),
            Transaction("902 Tạ Quang Bửu | 15/12 23:20:26", "#123458", "Lê Thị C", "Mèo Ba Tư", "Không có"),
            Transaction("902 Tạ Quang Bửu | 15/12 23:10:26", "#123459", "Phạm Văn D", "Cá cảnh", "Không có"),
            Transaction("902 Tạ Quang Bửu | 15/12 23:00:26", "#123460", "Đỗ Thị E", "Chó Poodle", "Không có")
        )
        val adapter = TransactionAdapter(transactions)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
     */
}
