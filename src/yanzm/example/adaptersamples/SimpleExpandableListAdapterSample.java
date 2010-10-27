package yanzm.example.adaptersamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

public class SimpleExpandableListAdapterSample extends ExpandableListActivity {

	@SuppressWarnings({ "unchecked", "serial" })
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // for group
        final List<HashMap<String, String>> groupData = 
            Arrays.asList(
                new HashMap<String, String>() {{
                    put("Author", "夏目漱石");
                }},
                new HashMap<String, String>() {{
                    put("Author", "太宰治");
                }},
                new HashMap<String, String>() {{
                    put("Author", "夏目漱石");
                }},
                new HashMap<String, String>() {{
                    put("Author", "太宰治");
                }},
                new HashMap<String, String>() {{
                    put("Author", "夏目漱石");
                }},
                new HashMap<String, String>() {{
                    put("Author", "太宰治");
                }},
                new HashMap<String, String>() {{
                    put("Author", "夏目漱石");
                }},
                new HashMap<String, String>() {{
                    put("Author", "太宰治");
                }},
                new HashMap<String, String>() {{
                    put("Author", "夏目漱石");
                }},
                new HashMap<String, String>() {{
                    put("Author", "太宰治");
                }}
            );

        String[] groupFrom = {"Author"};
        
        int[] groupTo = {R.id.textview};

        // for child
        List<List<HashMap<String, String>>> childData = new ArrayList<List<HashMap<String, String>>>();

        final List<HashMap<String, String>> firstChildData = 
            Arrays.asList(
                new HashMap<String, String>() {{
                    put("Title", "我輩は猫である");
                    put("Date", "1905年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "坊ちゃん");
                    put("Date", "1906年");
                }}
            );
		
		final List<HashMap<String, String>> secondChildData = 
            Arrays.asList(
                new HashMap<String, String>() {{
                    put("Title", "人間失格");
                    put("Date", "1948年");
                }},
                new HashMap<String, String>() {{
                    put("Title", "走れメロス");
                    put("Date", "1940年");
                }}
            );
        
        childData.add(firstChildData);
        childData.add(secondChildData);
        childData.add(firstChildData);
        childData.add(secondChildData);
        childData.add(firstChildData);
        childData.add(secondChildData);
        childData.add(firstChildData);
        childData.add(secondChildData);
        childData.add(firstChildData);
        childData.add(secondChildData);

        String[] childFrom = {"Title", "Date"};
        
        int[] childTo = {R.id.textview1, R.id.textview2};

        ExpandableListView el = getExpandableListView();
        el.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
			
			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,
					int groupPosition, long id) {
				//((ExpandableListView)getExpandableListView()).setSelectionFromTop(groupPosition, 0);
				((ExpandableListView)getExpandableListView()).smoothScrollToPosition(groupPosition);
				//((ExpandableListView)getExpandableListView()).scrollTo(0, groupPosition * 32);
				return false;
			}
		});
        setContentView(el);
        
        SimpleExpandableListAdapter simpleAdapter = new SimpleExpandableListAdapter(this, 
        		groupData, R.layout.list_item6, groupFrom, groupTo,
        		childData, R.layout.list_item7, childFrom, childTo);
        setListAdapter(simpleAdapter);
        
    }

}
