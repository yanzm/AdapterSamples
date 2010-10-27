package yanzm.example.adaptersamples;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ArrayAdapterSample4 extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] data = {"夏目漱石", "太宰治"};
        
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item4, R.id.textview, data);
        setListAdapter(arrayAdapter);
    }
}
