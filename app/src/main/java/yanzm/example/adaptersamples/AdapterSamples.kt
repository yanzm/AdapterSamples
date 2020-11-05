package yanzm.example.adaptersamples

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class AdapterSamples : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)

        val items = listOf(
            Item("SimpleAdapterSample") {
                val intent = Intent(this, SimpleAdapterSample::class.java)
                startActivity(intent)
            },
            Item("SimpleAdapterSample2") {
                val intent = Intent(this, SimpleAdapterSample2::class.java)
                startActivity(intent)
            },
            Item("ArrayAdapterSample") {
                val intent = Intent(this, ArrayAdapterSample::class.java)
                startActivity(intent)
            },
            Item("ArrayAdapterSample2") {
                val intent = Intent(this, ArrayAdapterSample2::class.java)
                startActivity(intent)
            },
            Item("ArrayAdapterSample3") {
                val intent = Intent(this, ArrayAdapterSample3::class.java)
                startActivity(intent)
            },
            Item("ArrayAdapterSample4") {
                val intent = Intent(this, ArrayAdapterSample4::class.java)
                startActivity(intent)
            },
            Item("ArrayAdapterSample5") {
                val intent = Intent(this, ArrayAdapterSample5::class.java)
                startActivity(intent)
            },
            Item("ArrayAdapterSample6") {
                val intent = Intent(this, ArrayAdapterSample6::class.java)
                startActivity(intent)
            },
            Item("ExtendsArrayAdapterSample") {
                val intent = Intent(this, ExtendsArrayAdapterSample::class.java)
                startActivity(intent)
            },
            Item("ExtendsArrayAdapterSample2") {
                val intent = Intent(this, ExtendsArrayAdapterSample2::class.java)
                startActivity(intent)
            },
            Item("SimpleExpandableListAdapterSample") {
                val intent = Intent(this, SimpleExpandableListAdapterSample::class.java)
                startActivity(intent)
            },
            Item("ExtendsArrayAdapterSample3") {
                val intent = Intent(this, ExtendsArrayAdapterSample3::class.java)
                startActivity(intent)
            },
        )

        listView.adapter =
            ArrayAdapter(this, R.layout.list_item3, items.map { it.text }.toTypedArray())
        listView.onItemClickListener = OnItemClickListener { _, _, position, _ ->
            items[position].action()
        }
    }

    private data class Item(val text: String, val action: () -> Unit)
}
