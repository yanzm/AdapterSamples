package yanzm.example.adaptersamples;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ArrayAdapterSample5 extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<String> data = new ArrayList<String>();
        data.add("夏目漱石");
        data.add("太宰治");
        
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item3, data);
        setListAdapter(arrayAdapter);
    }
}
