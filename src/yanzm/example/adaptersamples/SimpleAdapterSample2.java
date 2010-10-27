package yanzm.example.adaptersamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class SimpleAdapterSample2 extends ListActivity {
	
    @SuppressWarnings({ "unchecked", "serial" })
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final List<HashMap<String, Integer>> data = 
            Arrays.asList(
                new HashMap<String, Integer>() {{
                    put("Icon1", R.drawable.alermclock);  
                    put("Icon2", R.drawable.bookopen);
                }},
                new HashMap<String, Integer>() {{
                    put("Icon1", R.drawable.calculator);  
                    put("Icon2", R.drawable.camera);
                }}
            );

        String[] from = {"Icon1", "Icon2"};
        
        int[] to = {R.id.imageview1, R.id.imageview2};
        
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, data, R.layout.list_item2, from, to);
        setListAdapter(simpleAdapter);
    }
}
