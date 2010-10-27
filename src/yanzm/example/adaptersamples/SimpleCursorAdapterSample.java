package yanzm.example.adaptersamples;

import android.app.ListActivity;
import android.database.Cursor;
import android.provider.Contacts.People;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class SimpleCursorAdapterSample extends ListActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Cursor c = getContentResolver().query(People.CONTENT_URI, null, null, null, null);
        startManagingCursor(c);

        String[] from = new String[] {People.NUMBER};

        int[] to = new int[] {R.id.textview};
        
        ListAdapter adapter = new SimpleCursorAdapter(this, R.layout.list_item3, c, from, to);
        setListAdapter(adapter);
    }
}
