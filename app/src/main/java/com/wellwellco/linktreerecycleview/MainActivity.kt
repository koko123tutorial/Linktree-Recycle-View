package com.wellwellco.linktreerecycleview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        adapter()
    }

    private fun adapter(){
        val listData = listOf<ListData>(
            ListData(R.drawable.yt, "SeNau", "https://youtube.com/@Se-Nau"),
            ListData(R.drawable.ig, "@SeNau", "https://www.instagram.com/se_nau_sn?igsh=MWNmemU5YWlzcjd1cQ=="),
            ListData(R.drawable.wa, "SeNau", "https://wa.me/6283826050026"),
            ListData(R.drawable.web, "SeNau", "https://github.com/koko123tutorial")
        )

        val mainAdapter = ListAdapter(listData, object : ListAdapter.OnClickListener{
            override fun onClick(models: ListData) {
//                Toast.makeText(this@MainActivity, models.uri, Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(models.uri)
                startActivity(intent)
            }

        })
        findViewById<RecyclerView>(R.id.recycleView).adapter = mainAdapter
    }
}