package com.whatsthehapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class WelcomePage extends Activity implements OnClickListener{

	EditText etUsername, etPassword;
	Button bLogin, bRegister;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		etUsername = (EditText) findViewById(R.id.etUsername);
		etPassword = (EditText) findViewById(R.id.etPassword);
		bLogin = (Button) findViewById(R.id.btnLogin);
		bRegister = (Button) findViewById(R.id.btnRegister);
		bLogin.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
		case R.id.btnLogin:
			
			
			
			break;
			
		case R.id.btnRegister:
		
		break;
		}
	}

	
	
	
} //end of class