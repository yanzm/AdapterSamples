package yanzm.example.adaptersamples

import android.os.Bundle
import android.widget.ExpandableListView
import android.widget.SimpleExpandableListAdapter
import androidx.appcompat.app.AppCompatActivity

class SimpleExpandableListAdapterSample : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listView = ExpandableListView(this)
        setContentView(listView)

        // for group
        val groupData = listOf(
            mapOf("Author" to "夏目漱石"),
            mapOf("Author" to "太宰治"),
            mapOf("Author" to "夏目漱石"),
            mapOf("Author" to "太宰治"),
            mapOf("Author" to "夏目漱石"),
            mapOf("Author" to "太宰治"),
            mapOf("Author" to "夏目漱石"),
            mapOf("Author" to "太宰治"),
            mapOf("Author" to "夏目漱石"),
            mapOf("Author" to "太宰治"),
        )
        val groupFrom = arrayOf("Author")
        val groupTo = intArrayOf(R.id.textview)

        // for child
        val firstChildData = listOf(
            mapOf(
                "Title" to "我輩は猫である",
                "Date" to "1905年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
            mapOf(
                "Title" to "坊ちゃん",
                "Date" to "1906年",
            ),
        )
        val secondChildData = listOf(
            mapOf(
                "Title" to "人間失格",
                "Date" to "1948年",
            ),
            mapOf(
                "Title" to "走れメロス",
                "Date" to "1940年",
            ),
        )
        val childData = listOf(
            firstChildData,
            secondChildData,
            firstChildData,
            secondChildData,
            firstChildData,
            secondChildData,
            firstChildData,
            secondChildData,
            firstChildData,
            secondChildData,
        )
        val childFrom = arrayOf("Title", "Date")
        val childTo = intArrayOf(R.id.textview1, R.id.textview2)

        listView.setOnGroupClickListener { _, _, groupPosition, _ ->
            listView.smoothScrollToPosition(groupPosition)
            false
        }

        val simpleAdapter = SimpleExpandableListAdapter(
            this,
            groupData, R.layout.list_item6, groupFrom, groupTo,
            childData, R.layout.list_item7, childFrom, childTo
        )

        listView.setAdapter(simpleAdapter)
    }
}
