package yanzm.example.adaptersamples

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ArrayAdapterSample3 : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)

        val data = arrayOf("夏目漱石", "太宰治")
        listView.adapter = ArrayAdapter(this, R.layout.list_item3, data)
    }
}
