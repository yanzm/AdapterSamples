package yanzm.example.adaptersamples;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class ArrayAdapterSample extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item3);
        setListAdapter(arrayAdapter);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 0, 0, "Add");
		menu.add(0, 1, 0, "clear");
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case 0:
			((ArrayAdapter<String>)getListAdapter()).add("New Item");
			return true;
		case 1:
			((ArrayAdapter<String>)getListAdapter()).clear();			
			return true;
		}
		return false;
	}
}
