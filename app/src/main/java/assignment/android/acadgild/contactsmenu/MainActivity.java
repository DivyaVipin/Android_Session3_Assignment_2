package assignment.android.acadgild.contactsmenu;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnRead;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRead=(Button)findViewById(R.id.btnRead);
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent read=new Intent();
                read.setAction(android.content.Intent.ACTION_VIEW);
                read.setData(ContactsContract.Contacts.CONTENT_URI);
                startActivity(read);
            }
        });
    }
}
