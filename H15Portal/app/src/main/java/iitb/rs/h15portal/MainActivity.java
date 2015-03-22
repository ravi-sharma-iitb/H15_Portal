package iitb.rs.h15portal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("    The Trident: Portal");
        toolbar.setLogo(R.drawable.logo);
    }

    public void dbclicked(View view) {
        startActivity(new Intent(MainActivity.this, db.class));
    }

    public void sgclicked(View view) {
        startActivity(new Intent(MainActivity.this, sg.class));
    }
}
