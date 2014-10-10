package com.sense.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText cntbutton, cntrow;
	Button generate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		cntbutton = (EditText) findViewById(R.id.countButton);
		cntrow = (EditText) findViewById(R.id.countRow);
		generate = (Button) findViewById(R.id.button1);
		
		generate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (cntbutton.getText().toString().equals("") || cntrow.getText().toString().equals("")){
					Toast.makeText(MainActivity.this, "Please fill all field!", Toast.LENGTH_SHORT).show();
				}else{
					int button = Integer.parseInt(cntbutton.getText().toString());
					int row = Integer.parseInt(cntrow.getText().toString());
					
					if(button == 0 || row == 0 ){
						Toast.makeText(MainActivity.this, "Value of field could not zero!", Toast.LENGTH_SHORT).show();
					}else if( button < 2 || button > 5 ){
						Toast.makeText(MainActivity.this, "Value of button field should be in range 2 to 5!", Toast.LENGTH_SHORT).show();
					}else{
						Intent i = new Intent(MainActivity.this, GeneratorActivity.class);
						i.putExtra("button", button);
						i.putExtra("row", row);
						startActivity(i);
					}
				}
			}
		});
		
		
		

		
	}

	
}
