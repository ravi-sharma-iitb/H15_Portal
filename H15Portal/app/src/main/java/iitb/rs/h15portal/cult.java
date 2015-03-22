package iitb.rs.h15portal;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class cult extends ActionBarActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cult);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("    CULTURAL");
        toolbar.setLogo(R.drawable.cultlr);
        Button but=(Button) findViewById(R.id.button1);
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast chk = Toast.makeText(cult.this,"FORM SUBMITTED", Toast.LENGTH_SHORT);
                chk.show();
                EditText mEdit;
                TextView mText;
                EditText mEdit2;
                TextView nText2;
                EditText mEdit3;
                TextView nText3;
                EditText mEdit4;
                TextView nText4;

                mEdit   = (EditText)findViewById(R.id.editText1);
                mEdit2   = (EditText)findViewById(R.id.editText2);
                mEdit3   = (EditText)findViewById(R.id.editText4);
                mEdit4   = (EditText)findViewById(R.id.editText6);
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                String[] recipients = new String[]{"parth.jaimini21@gmail.com", "7nipun7@gmail.com","anantajoshi107@gmail.com","janmoltaj@gmail.com","vishal16babu@gmail.com","ilatoppo97@gmail.com","jhunjhunwala.pranay@gmail.com","aryakrised@gmail.com","pranitanikam1997@gmail.com","amanvijay13@gmail.com","ketaki.kakade12@gmail.com","shahheet95@yahoo.com","nitishfatarpekar@gmail.com","anisrivastava28@gmail.com",""};
                emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);

                emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "COMPLAIN/SUGGESTION");
                emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,mEdit.getText().toString()+"\n"+mEdit2.getText().toString()+"\n"+"WING -"+mEdit3.getText().toString().toUpperCase()+"\n"+mEdit4.getText().toString().toUpperCase());
                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                finish();
            }
        });
    }

}
