package yanzm.example.adaptersamples

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ArrayAdapterSample : AppCompatActivity() {

    private lateinit var arrayAdapter: ArrayAdapter<String>

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)

        arrayAdapter = ArrayAdapter<String>(this, R.layout.list_item3)
        listView.adapter = arrayAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, 0, 0, "Add")
        menu.add(0, 1, 0, "clear")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            0 -> {
                arrayAdapter.add("New Item")
                true
            }
            1 -> {
                arrayAdapter.clear()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}
