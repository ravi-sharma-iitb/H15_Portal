package iitb.rs.h15portal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class sg extends ActionBarActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sg);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Feedback");
        toolbar.setLogo(R.drawable.suggeslr);
    }



    public void gsclicked(View view) {
        startActivity(new Intent(sg.this, general.class));
    }

    public void maClicked(View view) {startActivity(new Intent(sg.this, maint.class));
    }

    public void meclicked(View view) {startActivity(new Intent(sg.this, mess.class));
    }

    public void spclicked(View view) {startActivity(new Intent(sg.this, sports.class));
    }

    public void cuclicked(View view) {startActivity(new Intent(sg.this, cult.class));
    }

    public void teclicked(View view) {startActivity(new Intent(sg.this, tech.class));
    }

    public void coclicked(View view) {startActivity(new Intent(sg.this, comp.class));
    }
}
