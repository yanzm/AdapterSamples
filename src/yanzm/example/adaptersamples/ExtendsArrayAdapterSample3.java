package yanzm.example.adaptersamples;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ExtendsArrayAdapterSample3 extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<bindData> data = new ArrayList<bindData>();
        data.add(new bindData("Libraroid - 図書館予約", "インストール", "2010/10/23", "version 1.0", R.drawable.icon1));
        data.add(new bindData("Wolfraroid", "インストール", "2010/10/23", "version 1.0", R.drawable.icon2));
        data.add(new bindData("BooXpress", "インストール", "2010/10/23", "version 1.0", R.drawable.icon3));
        data.add(new bindData("Libraroid - 図書館予約", "インストール", "2010/10/23", "version 1.0", R.drawable.icon1));
        data.add(new bindData("Wolfraroid", "インストール", "2010/10/23", "version 1.0", R.drawable.icon2));
        data.add(new bindData("BooXpress", "インストール", "2010/10/23", "version 1.0", R.drawable.icon3));
        data.add(new bindData("Libraroid - 図書館予約", "インストール", "2010/10/23", "version 1.0", R.drawable.icon1));
        data.add(new bindData("Wolfraroid", "インストール", "2010/10/23", "version 1.0", R.drawable.icon2));
        data.add(new bindData("BooXpress", "インストール", "2010/10/23", "version 1.0", R.drawable.icon3));


        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.header, null);

        ListView listView = getListView();
        listView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
        listView.setDivider(null);
        listView.addHeaderView(v);
        setContentView(listView);

        MyAdapter adapter = new MyAdapter(this, R.layout.list_item_sample, data);
        setListAdapter(adapter);        
	}
	
	class bindData {
		String title;
		String detail;
		String date;
		String version;
		int imageResourceId;
		
		public bindData(String title, String detail, String date, String version, int imageResourceId) {
			this.title = title;
			this.detail = detail;
			this.date = date;
			this.version = version;
			this.imageResourceId = imageResourceId;
		}
	}

	static class ViewHolder {
		TextView titleTextView;
		TextView detailTextView;
		TextView dateTextView;
		TextView versionTextView;
		ImageView imageView;
	} 

	public class MyAdapter extends ArrayAdapter<bindData> {
		private LayoutInflater inflater;
		private int layoutId;

		public MyAdapter(Context context, int layoutId, List<bindData> objects) {
			super(context, 0, objects);
			this.inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			this.layoutId = layoutId;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder holder;

			if (convertView == null) {
				convertView = inflater.inflate(layoutId, parent, false);
				holder = new ViewHolder();
				holder.titleTextView = (TextView) convertView.findViewById(R.id.titletextview);
				holder.detailTextView = (TextView) convertView.findViewById(R.id.detailtextview);
				holder.dateTextView = (TextView) convertView.findViewById(R.id.datetextview);
				holder.versionTextView = (TextView) convertView.findViewById(R.id.versiontextview);
				holder.imageView = (ImageView) convertView.findViewById(R.id.imageview);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			bindData data= getItem(position);
			holder.titleTextView.setText(data.title);
			holder.detailTextView.setText(data.detail);
			holder.dateTextView.setText(data.date);
			holder.versionTextView.setText(data.version);
			holder.imageView.setImageResource(data.imageResourceId);
			return convertView;
		}
	}
}
