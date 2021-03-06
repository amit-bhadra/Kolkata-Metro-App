package com.amit.metro_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Thread timer = new Thread() {
			public void run() {
				try{
					sleep(3000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}finally {
					Intent splashscreen = new Intent("com.amit.metro_app.MainActivity");
					startActivity(splashscreen);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
}
