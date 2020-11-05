package yanzm.example.adaptersamples

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class SimpleAdapterSample : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)

        val data = listOf(
            mapOf(
                "Title" to "我輩は猫である",
                "Author" to "夏目漱石"
            ),
            mapOf(
                "Title" to "走れメロス",
                "Author" to "太宰治"
            ),
        )
        val from = arrayOf("Title", "Author")
        val to = intArrayOf(R.id.textview1, R.id.textview2)

        listView.adapter = SimpleAdapter(this, data, R.layout.list_item, from, to)
    }
}
