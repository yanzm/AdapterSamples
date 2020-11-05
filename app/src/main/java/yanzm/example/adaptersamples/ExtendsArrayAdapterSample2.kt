package yanzm.example.adaptersamples

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExtendsArrayAdapterSample2 : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)

        val data = listOf(
            Item("Clock", R.drawable.ic_alarm),
            Item("-", 0),
            Item("Camera", R.drawable.ic_camera),
            Item("-", 0),
            Item("Book", R.drawable.ic_book),
            Item("-", 0),
            Item("Calculator", R.drawable.ic_calculator),
            Item("-", 0),
        )

        listView.adapter = MyAdapter(this, R.layout.list_item5, data)
    }

    data class Item(val text: String, val imageResourceId: Int)

    data class ViewHolder(val itemView: View) {
        private val textView: TextView = itemView.findViewById(R.id.textview)
        private val imageView: ImageView = itemView.findViewById(R.id.imageview)

        fun bind(item: Item) {
            textView.text = item.text
            imageView.setImageResource(item.imageResourceId)
        }
    }

    class MyAdapter(context: Context, private val layoutId: Int, objects: List<Item?>?) :
        ArrayAdapter<Item?>(context, 0, objects!!) {

        private val inflater = LayoutInflater.from(context)

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val holder: ViewHolder = if (convertView == null) {
                val view = inflater.inflate(layoutId, parent, false)
                ViewHolder(view).apply {
                    view.tag = this
                }
            } else {
                convertView.tag as ViewHolder
            }

            if (!isEnabled(position)) {
                holder.itemView.setBackgroundColor(Color.BLACK)
            } else {
                val item = getItem(position)!!
                holder.bind(item)
            }

            return holder.itemView
        }

        override fun isEnabled(position: Int): Boolean {
            return !getItem(position)!!.text.startsWith("-")
        }
    }
}
