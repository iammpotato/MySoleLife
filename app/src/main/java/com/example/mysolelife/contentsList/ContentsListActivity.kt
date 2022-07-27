package com.example.mysolelife.contentsList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mysolelife.R

class ContentsListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_list)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<ContentModel>()
        items.add(ContentModel("시엔나 카페","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FIB10W%2FbtrH5a1rjKg%2FnDNUuE1wcbO0KHBKZInBXk%2Fimg.png", "https://guru-andriod-26.tistory.com/2?category=1078546"))
        items.add(ContentModel("그릭앤놀라","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbuY9m5%2FbtrIfSkk9WM%2FajsISUuObg8IalIuojiKK0%2Fimg.png","https://guru-andriod-26.tistory.com/11?category=1078546"))
        items.add(ContentModel("달 루프탑","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbquDtB%2FbtrIfRTgX9W%2FQ6W9xCRoXsd2zeBMaIpak1%2Fimg.png","https://guru-andriod-26.tistory.com/28"))
        items.add(ContentModel("메모아","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrkN5V%2FbtrIdx2kYiR%2FLuLDZ7f2y2cb4RG1ueMByk%2Fimg.png","https://guru-andriod-26.tistory.com/30?category=1078546"))

        val rvAdapter = ContentRVAdapter(baseContext, items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

        rvAdapter.itemClick = object : ContentRVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {

                Toast.makeText(baseContext, items[position].title, Toast.LENGTH_LONG).show()

                val intent = Intent(this@ContentsListActivity, ContentShowActivity::class.java)
                intent.putExtra("url", items[position].webUrl)
                startActivity(intent)

            }
        }

    }
}