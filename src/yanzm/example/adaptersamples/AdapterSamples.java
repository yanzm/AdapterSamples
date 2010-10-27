package yanzm.example.adaptersamples;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdapterSamples extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.sampleactivities, R.layout.list_item3);

		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent;
		switch (position) {
		case 0:
			intent = new Intent(this, SimpleAdapterSample.class);
			startActivity(intent);
			break;
		case 1:
			intent = new Intent(this, SimpleAdapterSample2.class);
			startActivity(intent);
			break;
		case 2:
			intent = new Intent(this, SimpleCursorAdapterSample.class);
			startActivity(intent);
			break;
		case 3:
			intent = new Intent(this, ArrayAdapterSample.class);
			startActivity(intent);
			break;
		case 4:
			intent = new Intent(this, ArrayAdapterSample2.class);
			startActivity(intent);
			break;
		case 5:
			intent = new Intent(this, ArrayAdapterSample3.class);
			startActivity(intent);
			break;
		case 6:
			intent = new Intent(this, ArrayAdapterSample4.class);
			startActivity(intent);
			break;
		case 7:
			intent = new Intent(this, ArrayAdapterSample5.class);
			startActivity(intent);
			break;
		case 8:
			intent = new Intent(this, ArrayAdapterSample6.class);
			startActivity(intent);
			break;
		case 9:
			intent = new Intent(this, ExtendsArrayAdapterSample.class);
			startActivity(intent);
			break;
		case 10:
			intent = new Intent(this, ExtendsArrayAdapterSample2.class);
			startActivity(intent);
			break;
		case 11:
			intent = new Intent(this, SimpleExpandableListAdapterSample.class);
			startActivity(intent);
			break;
		case 12:
			intent = new Intent(this, ExtendsArrayAdapterSample3.class);
			startActivity(intent);
			break;
		}
	}
}