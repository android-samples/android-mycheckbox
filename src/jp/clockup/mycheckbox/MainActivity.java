package jp.clockup.mycheckbox;

import jp.clockup.mycheckbox.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void checkMethod(View _checkBox){
		CheckBox checkBox = (CheckBox)_checkBox;
		TextView text1 = (TextView)findViewById(R.id.textView1);
		text1.setText(checkBox.getText().toString() + " was " + (checkBox.isChecked() ? "CHECKED" : "UNCHECKED"));
	}
	
	public void buttonMethod(View button){
		CheckBox[] checks = new CheckBox[]{
			(CheckBox)findViewById(R.id.checkBox1),
			(CheckBox)findViewById(R.id.checkBox2),
			(CheckBox)findViewById(R.id.checkBox3)
		};
		String states = "";
		for(int i = 0; i < checks.length; i++){
			states += checks[i].getText().toString() + " is " + (checks[i].isChecked() ? "CHECKED" : "UNCHECKED") + "\n";
		}
		TextView text2 = (TextView)findViewById(R.id.textView2);
		text2.setText(states);
	}
}
