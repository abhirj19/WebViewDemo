package com.shanks.webviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

	WebView my_webview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		my_webview = (WebView) findViewById(R.id.my_webview);

		my_webview
				.loadUrl("http://www.tutorialspoint.com/android/android_webview_layout.htm");

	}

}
