package com.sense.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class GeneratorActivity extends Activity {
	
	ListView list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_generator);
		
		Intent i = getIntent();
		int button = (int)i.getExtras().get("button");
		int row = (int)i.getExtras().get("row");
		
		list = (ListView) findViewById(R.id.listView1);
		
		ListGeneratorAdapter adapter = new ListGeneratorAdapter(getBaseContext(),button,row);
        list.setAdapter(adapter);
		
	}
}