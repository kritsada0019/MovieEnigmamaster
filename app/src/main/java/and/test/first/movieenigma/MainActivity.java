package and.test.first.movieenigma;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
public class MainActivity extends AppCompatActivity {
    //ประกาศตัวแปร
    EditText nameEditText;
    Button startButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //ผูกตัวแปรบนjava
        nameEditText = findViewById(R.id.editText);
        startButton = findViewById(R.id.btnStart);
        //ดักฟังว่ากดปุ่มรึป่าว
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //เอาข้อความในedittextมาเก็บไว้ในตัวแปรnamestring
                nameString = nameEditText.getText().toString().trim();
                //ตรวจสอบค่าว่าง
                if (nameString.length() == 0) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ชื่อด้วย", Toast.LENGTH_SHORT).show();
                } else {
                    //เปิดหน้าgame
                    Intent startIntent = new Intent(MainActivity.this, GameActivity.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                } //end else
            }// end on click
        });
    }//end onCreate method


}//end Class



