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
import android.widget.TextView;

public class ExtendsArrayAdapterSample extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        List<bindData> data = new ArrayList<bindData>();
        data.add(new bindData("Clock", R.drawable.alermclock));
        data.add(new bindData("Camera", R.drawable.camera));
        
        MyAdapter adapter = new MyAdapter(this, R.layout.list_item5, data);
        setListAdapter(adapter);
    }
	
	class bindData {
		String text;
		int imageResourceId;
		
		public bindData(String text, int imageResourceId) {
			this.text = text;
			this.imageResourceId = imageResourceId;
		}
	}

	static class ViewHolder {
		TextView textView;
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
				holder.textView = (TextView) convertView.findViewById(R.id.textview);
				holder.imageView = (ImageView) convertView.findViewById(R.id.imageview);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			bindData data= getItem(position);
			holder.textView.setText(data.text);
			holder.imageView.setImageResource(data.imageResourceId);
			return convertView;
		}
	}
}
