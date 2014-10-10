package com.sense.task;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

public class ListGeneratorAdapter extends BaseAdapter{
	
	private int count;
    private Context context;
    private int button, row;
	
	public ListGeneratorAdapter(Context context,int button, int row)
    {
        this.context = context;
        this.button = button;
        this.count = row;
        
    }
    
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return count;
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
    public View getView(int position, View contentView, ViewGroup arg2) {
    	
    	View view = contentView;
    	LinearLayout linear;
    	final int row_pos = position + 1;
		
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view = inflater.inflate(R.layout.inflate_button_layout, null);
			
		linear = (LinearLayout) view.findViewById(R.id.linear);
			
		for(int i = 1; i <= button; i++){
			Button button_new =new Button(context);
			button_new.setTextColor(Color.parseColor("#000000"));
			final int button_pos = i;
			button_new.setText("B"+i);
			button_new.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
			linear.addView(button_new);
				
			button_new.setOnClickListener(new View.OnClickListener() {
					
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					showToast(button_pos,row_pos);
				}
			});
		}
			
	return view;
        
    }
    
    public void showToast(int button_pos, int row_pos){
    	Toast.makeText(context, "Button " + button_pos + " Row " + row_pos , Toast.LENGTH_SHORT).show();
    }

}
