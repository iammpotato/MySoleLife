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

class ContentsListActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_list)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<ContentModel>()
        items.add(ContentModel("예술의전당","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FXE3Bc%2FbtrIfQ7TyWI%2FxKhzUVJIfA3iqkL89xkMK0%2Fimg.png", "https://guru-andriod-26.tistory.com/1?category=1078549"))
        items.add(ContentModel("하우스도산","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdMlErt%2FbtrIbL1hG2v%2FzyeZZ4veoyhpvmQmwK2G4k%2Fimg.png", "https://guru-andriod-26.tistory.com/3?category=1078549"))
        items.add(ContentModel("아마당","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FV2841%2FbtrH49O2HR6%2F1Sxg9HIBuoTgiUKMfJFTT1%2Fimg.png", "https://guru-andriod-26.tistory.com/15?category=1078549"))
        items.add(ContentModel("빌라레코드","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FejHqMq%2FbtrIc91EhkW%2FPxQQm8QX50mX9crLCKvKd0%2Fimg.png", "https://guru-andriod-26.tistory.com/16?category=1078549"))


        val rvAdapter = ContentRVAdapter(baseContext, items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

        rvAdapter.itemClick = object : ContentRVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {

                Toast.makeText(baseContext, items[position].title, Toast.LENGTH_LONG).show()

                val intent = Intent(this@ContentsListActivity4, ContentShowActivity::class.java)
                intent.putExtra("url", items[position].webUrl)
                startActivity(intent)

            }
        }

    }
}