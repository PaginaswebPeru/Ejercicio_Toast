package com.example.ejercicio_toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button boton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		boton = (Button) findViewById(R.id.button1);
		boton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "Toast Simple", Toast.LENGTH_SHORT).show();
				LayoutInflater inflador= getLayoutInflater();
				View la= inflador.inflate(R.layout.layout_t,(ViewGroup) findViewById(R.id.toast_la));
				TextView texto= (TextView) la.findViewById(R.id.txt_toast);
				texto.setText("Esto es un toast");
				Toast t= new Toast(getApplicationContext());
				t.setGravity(Gravity.TOP, 0, 0);
				t.setDuration(Toast.LENGTH_SHORT);
				t.setView(la);
				t.show();				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
