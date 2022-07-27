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

class ContentsListActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_list)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<ContentModel>()
        items.add(ContentModel("육미안","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FRSXfL%2FbtrIfSq6Jix%2Fw4XohEhRGSNybeklQC8o41%2Fimg.png", "https://guru-andriod-26.tistory.com/5?category=1078553"))
        items.add(ContentModel("링링","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbA9DbH%2FbtrIc9tTa5C%2FlPjZqJkQfz40ts0Ln5tyjK%2Fimg.png", "https://guru-andriod-26.tistory.com/7?category=1078553"))
        items.add(ContentModel("아마츄어 작업실","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbDKopz%2FbtrIc9tTcpr%2FlLff1SZWhVDYCkBNKxW9K0%2Fimg.png", "https://guru-andriod-26.tistory.com/8?category=1078553"))
        items.add(ContentModel("보마켓","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdUFjMC%2FbtrIaAFi8qq%2FvOc01CvWVOqokOQc3RCKq0%2Fimg.png", "https://guru-andriod-26.tistory.com/13?category=1078553"))
        items.add(ContentModel("런던베이글","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F5aSIY%2FbtrIcGlcZ72%2FKPRtCYf221IEMRZZWfucU1%2Fimg.png", "https://guru-andriod-26.tistory.com/18?category=1078553"))
        items.add(ContentModel("다운타우너","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcRex21%2FbtrH7Q2EUZD%2Fyv6YpPHAvTKbQSZ2iFfT21%2Fimg.png", "https://guru-andriod-26.tistory.com/22?category=1078553"))
        items.add(ContentModel("차마시는뜰","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcLtO19%2FbtrIejbtorC%2FBvgKILeXN6wJ2xR7KrYZQ0%2Fimg.png", "https://guru-andriod-26.tistory.com/24?category=1078553"))
        items.add(ContentModel("뮤직컴플렉스","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbgQ1o1%2FbtrIeMLr6am%2Fq50pfQkNf856vxSaDOics0%2Fimg.png", "https://guru-andriod-26.tistory.com/26?category=1078553"))
        items.add(ContentModel("고집바","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbLOM3f%2FbtrIdaGgdap%2FQ4JelDfBizzQFVbihLRQlk%2Fimg.png", "https://guru-andriod-26.tistory.com/33?category=1078553"))

        val rvAdapter = ContentRVAdapter(baseContext, items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

        rvAdapter.itemClick = object : ContentRVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {

                Toast.makeText(baseContext, items[position].title, Toast.LENGTH_LONG).show()

                val intent = Intent(this@ContentsListActivity8, ContentShowActivity::class.java)
                intent.putExtra("url", items[position].webUrl)
                startActivity(intent)

            }
        }

    }
}