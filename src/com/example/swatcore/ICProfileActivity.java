package com.example.swatcore;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ICProfileActivity extends ListActivity {

	private String courseTitle, instructor, objID;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_icprofile);
		
		Intent i = this.getIntent();
		courseTitle = i.getStringExtra("title");
		instructor = i.getStringExtra("fullName");
		objID = i.getStringExtra("objectId");
		
		TextView titleValueView = (TextView) findViewById(R.id.icprofile_titleValue);
		titleValueView.setText(courseTitle);
		
		TextView insValueView = (TextView) findViewById(R.id.icprofile_insValue);
		insValueView.setText(instructor);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.icprofile, menu);
		return true;
	}
	
	public void onAddButtonClick(View v) {
		// TODO Auto-generated method stub
		Log.v("ICProfile: ", "Preparing AddReview Intent");
		Intent intent = new Intent(this, AddReviewActivity.class);
		intent.putExtra("objectID", objID);
		Log.v("ICProfile: ", "Sending AddReview Intent");
		startActivity(intent);

	}

}
