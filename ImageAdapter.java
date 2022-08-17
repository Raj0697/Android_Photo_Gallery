package com.example.gallery_gridview;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.GridView;
import android.widget.Toast;

public class ImageAdapter extends BaseAdapter {
	Context c;
	public Integer[] i = {R.drawable.taj,R.drawable.apple,R.drawable.orange,R.drawable.ic_launcher};
	ImageView img;
	
	ImageAdapter(Context c)
	{
		this.c = c;
	}
	
	public ImageAdapter(MainActivity mainActivity) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return i.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemViewType(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View v, ViewGroup vg) {
		try{ 
		// TODO Auto-generated method stub
		
		if(v == null)
		{
			img = new ImageView(c);
			img.setLayoutParams(new GridView.LayoutParams(85, 85));
			img.setScaleType(ImageView.ScaleType.CENTER_CROP);
			img.setPadding(8, 8, 8, 8);
		}
		else
		{
			img = (ImageView) v;
		}
		img.setImageResource(i[position]);
		
	}
		catch(Exception e){
			Toast.makeText(c, e.getMessage(), Toast.LENGTH_LONG).show();
		}
		return img;
	}
	
	

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

