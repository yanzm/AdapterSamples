package yanzm.example.adaptersamples;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ArrayAdapterSample3 extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] data = {"夏目漱石", "太宰治"};
        
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item3, data);
        setListAdapter(arrayAdapter);
    }
}
