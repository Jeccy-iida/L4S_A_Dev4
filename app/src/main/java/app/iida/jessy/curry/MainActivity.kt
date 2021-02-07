package app.iida.jessy.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("ちょき","ぐー","ぱー","ぷいぷい")
    val food = arrayOf<String>("かれー","みそしる","ちゃーはん","えびちり")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun serveFood(view: View?){

        val randomName = Random()
        val index = randomName.nextInt(4)
        val name = people  [index]
        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val foodTextView = findViewById<TextView>(R.id.foodTextView)
        val verbTextView = findViewById<TextView>(R.id.verbTextView)
        nameTextView.text = name + "に"

        foodTextView.text = food[Random().nextInt(4)]+"を"

        if(Random().nextInt(100)<50){
            verbTextView.text = "よそえました！"
        }else{
            verbTextView.text = "よそえませんでした"
        }
    }
}