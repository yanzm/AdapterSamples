package yanzm.example.adaptersamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class SimpleAdapterSample extends ListActivity {
	
    @SuppressWarnings({ "unchecked", "serial" })
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final List<HashMap<String, String>> data = 
            Arrays.asList(
                new HashMap<String, String>() {{
                    put("Title", "我輩は猫である");
                    put("Author", "夏目漱石");
                }},
                new HashMap<String, String>() {{
                    put("Title", "走れメロス");
                    put("Author", "太宰治");
                }}
            );

        String[] from = {"Title", "Author"};
        
        int[] to = {R.id.textview1, R.id.textview2};
        
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, data, R.layout.list_item, from, to);
        setListAdapter(simpleAdapter);
    }
}
