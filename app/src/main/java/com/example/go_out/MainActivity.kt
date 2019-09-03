package com.example.go_out

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(){
    //表示するアイテムの配列リストを作成　
    val placeList = arrayListOf("池袋","渋谷","原宿","六本木","新宿","上野","動物園","水族館","浅草","ディズニーランド")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //外出先を決めるボタンを押下した時に、ランダムの番号をRandom()で決めて、配列リストの中から添字のものを選ぶ。
        decideBtn.setOnClickListener{
            val random = Random()
            var randomPlace = random.nextInt(placeList.count())
            selectedPlayTxt.text = placeList[randomPlace]
        }

        //新しく外出先を追加し、配列のリストに追加・表示
        //追加が終了したら、入力欄の文字を削除(clear)
        addItemBtn.setOnClickListener{
            val newPlace = addPlayitem.text.toString()
            placeList.add(newPlace)
            addPlayitem.text.clear()

        }


    }
}
