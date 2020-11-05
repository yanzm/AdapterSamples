package yanzm.example.adaptersamples

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExtendsArrayAdapterSample3 : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ListView(this)
        setContentView(listView)

        val data = listOf(
            Item(
                "Book",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_book
            ),
            Item(
                "Alarm",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_alarm
            ),
            Item(
                "Calculator",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_calculator
            ),
            Item(
                "Camera",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_camera
            ),
            Item(
                "Book",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_book
            ),
            Item(
                "Alarm",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_alarm
            ),
            Item(
                "Calculator",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_calculator
            ),
            Item(
                "Camera",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_camera
            ),
            Item(
                "Book",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et",
                "2010/10/23",
                "version 1.0",
                R.drawable.ic_book
            ),
        )

        listView.scrollBarStyle = View.SCROLLBARS_OUTSIDE_OVERLAY
        listView.divider = null
        listView.addHeaderView(layoutInflater.inflate(R.layout.header, listView, false))
        listView.adapter = MyAdapter(this, R.layout.list_item_sample, data)
    }

    data class Item(
        val title: String,
        val detail: String,
        val date: String,
        val version: String,
        val imageResourceId: Int
    )

    data class ViewHolder(val itemView: View) {
        private val titleTextView: TextView = itemView.findViewById(R.id.titletextview)
        private val detailTextView: TextView = itemView.findViewById(R.id.detailtextview)
        private val dateTextView: TextView = itemView.findViewById(R.id.datetextview)
        private val versionTextView: TextView = itemView.findViewById(R.id.versiontextview)
        private val imageView: ImageView = itemView.findViewById(R.id.imageview)

        fun bind(item: Item) {
            titleTextView.text = item.title
            detailTextView.text = item.detail
            dateTextView.text = item.date
            versionTextView.text = item.version
            imageView.setImageResource(item.imageResourceId)
        }
    }

    class MyAdapter(context: Context, private val layoutId: Int, objects: List<Item>) :
        ArrayAdapter<Item?>(context, 0, objects) {

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

            val item = getItem(position)!!
            holder.bind(item)

            return holder.itemView
        }
    }
}
