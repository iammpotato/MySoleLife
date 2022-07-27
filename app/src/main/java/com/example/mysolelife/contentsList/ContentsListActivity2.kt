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

class ContentsListActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_list)

        val rv : RecyclerView = findViewById(R.id.rv)

        val items = ArrayList<ContentModel>()
        items.add(ContentModel("토이쩔어스","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Ft6jod%2FbtrIc9N7ayp%2FSg4TDOrV5kg3JTGgzrKSt0%2Fimg.png", "https://guru-andriod-26.tistory.com/9?category=1078547"))
        items.add(ContentModel("더블식스버거","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fb28W3T%2FbtrIc8Pd4CG%2FdA3ggwY0Et0kGsBXk0mgM0%2Fimg.png","https://guru-andriod-26.tistory.com/10?category=1078547"))
        items.add(ContentModel("아더스페이스","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FKXwsr%2FbtrH9H579VF%2FGcVaokAvMe0SOpOaKdliNK%2Fimg.png", "https://guru-andriod-26.tistory.com/12?category=1078547"))
        items.add(ContentModel("진작다이닝","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmV291%2FbtrIdYZGt5j%2FDDHMmSxlYBH4iPkQeh9qTk%2Fimg.png","https://guru-andriod-26.tistory.com/17?category=1078547"))
        items.add(ContentModel("티프","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F1Dm6M%2FbtrIc9N7B7W%2F5q6mVietosOvnEyCMwosO0%2Fimg.png", "https://guru-andriod-26.tistory.com/20?category=1078547"))
        items.add(ContentModel("마티스토어","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbfNsah%2FbtrH9IqrDJH%2FV8QOmz9yX8KpESnpn7EjKk%2Fimg.png", "https://guru-andriod-26.tistory.com/21?category=1078547"))
        items.add(ContentModel("중랑장미공원","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbkLVrl%2FbtrH74AyEdl%2FW6Wjxsw0UlD8CkvXw4RhJ0%2Fimg.png", "https://guru-andriod-26.tistory.com/23?category=1078547"))
        items.add(ContentModel("도쿄빙수","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FRzjPK%2FbtrIazTWjXC%2FiWEkeb3Oh0xhKx2VWiCWn0%2Fimg.png","https://guru-andriod-26.tistory.com/25?category=1078547"))
        items.add(ContentModel("서울앵무새","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Feeyzxq%2FbtrIc8V0ERO%2FBUFBdmXigJGsr6DNtvLl01%2Fimg.png","https://guru-andriod-26.tistory.com/27?category=1078547"))
        items.add(ContentModel("서울숲","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdxmHIp%2FbtrIddv1UV4%2FvY4onYVmxVaXSvUOugChKK%2Fimg.png","https://guru-andriod-26.tistory.com/32?category=1078547"))
        items.add(ContentModel("테디스오븐","https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmgsgK%2FbtrIdxnHQ3s%2Fk1l4yVX1XlcTOK10eIBv01%2Fimg.png","https://guru-andriod-26.tistory.com/29?category=1078547"))

        val rvAdapter = ContentRVAdapter(baseContext, items)
        rv.adapter = rvAdapter

        rv.layoutManager = GridLayoutManager(this, 2)

        rvAdapter.itemClick = object : ContentRVAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {

                Toast.makeText(baseContext, items[position].title, Toast.LENGTH_LONG).show()

                val intent = Intent(this@ContentsListActivity2, ContentShowActivity::class.java)
                intent.putExtra("url", items[position].webUrl)
                startActivity(intent)

            }
        }

    }
}