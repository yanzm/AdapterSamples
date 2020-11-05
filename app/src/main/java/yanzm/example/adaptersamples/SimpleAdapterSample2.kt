package yanzm.example.adaptersamples

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class SimpleAdapterSample2 : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)

        val data = listOf(
            mapOf(
                "Icon1" to R.drawable.ic_alarm,
                "Icon2" to R.drawable.ic_book
            ),
            mapOf(
                "Icon1" to R.drawable.ic_calculator,
                "Icon2" to R.drawable.ic_camera
            ),
        )

        val from = arrayOf("Icon1", "Icon2")
        val to = intArrayOf(R.id.imageview1, R.id.imageview2)

        listView.adapter = SimpleAdapter(this, data, R.layout.list_item2, from, to)
    }
}
