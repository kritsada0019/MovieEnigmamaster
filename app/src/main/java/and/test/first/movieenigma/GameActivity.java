package and.test.first.movieenigma;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.Attributes;

public class GameActivity extends AppCompatActivity {
    //ประกาศตัวแปรนะจ้ะ
    Button btn1, btn2, btn3, btn4;
    ImageView questionImageView;
    int questionCount = 20; //เก็บจำนวนขอคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();//ตัวแปรqid ไว้สำหรับ random คำถาม ชนิด arrayแบบintegerด้วย
    String answer;//เก็บคำตอบชนิด string
    int score = 0;//คะแนน
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ผูกอีลีเม้นกับตัวแปรบนjava
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);

        //แสดงคำถาม
        for (int i = 1; i <= questionCount; i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));
    }//end oncreate method

    private void setQuestion(int qID) { //method serQuestion ใช้สำหรับกำหนดคำถามและเฉลยแต่ละข้อ
        if (qID == 1) {
            answer = "pacificrim";
            questionImageView.setImageResource(R.drawable.pacificrim);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("pacificrim");
            choice.add("Das boot");
            choice.add("M");
            choice.add("transformers");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 2) {
            answer = "Juno";
            questionImageView.setImageResource(R.drawable.juno);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Gone Girl");
            choice.add("Juno");
            choice.add("Her");
            choice.add("Whiplash");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer = "world war z";
            questionImageView.setImageResource(R.drawable.world_war_z);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("day of the dead");
            choice.add("world war z");
            choice.add("28 day later");
            choice.add("REC");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer = "Back to the Future";
            questionImageView.setImageResource(R.drawable.back_to_the_future);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Exam");
            choice.add("Cast Away");
            choice.add("Back to the Future");
            choice.add("Back to the Future2");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer = "American Hustle";
            questionImageView.setImageResource(R.drawable.american_hustle);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("American Hustle");
            choice.add("Focus");
            choice.add("The big shot");
            choice.add("Project X");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer = "Her";
            questionImageView.setImageResource(R.drawable.her);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Her");
            choice.add("Cinderella Man");
            choice.add("Focus");
            choice.add("Gone Girl");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer = "Gone Girl";
            questionImageView.setImageResource(R.drawable.gone_girl);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Gone Girl");
            choice.add("Juno");
            choice.add("Intouchables");
            choice.add("Jarhead");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        //if (qID == 8) {
            //answer = "Das boot";
            //questionImageView.setImageResource(R.drawable.das_boot);


           // ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            //choice.add("Das boot");
            //choice.add("U 21");
           // choice.add("under the sea");
           // choice.add("The Prestige");
            //Collections.shuffle(choice);
           // btn1.setText(choice.remove(0));
           // btn2.setText(choice.remove(0));
           // btn3.setText(choice.remove(0));
           // btn4.setText(choice.remove(0));
       // }
        if (qID == 8) {
            answer = "Das boot";
            questionImageView.setImageResource(R.drawable.das_boot);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("The Prestige");
            choice.add("Das boot");
            choice.add("U 21");
            choice.add("under the sea");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "The Prestige";
            questionImageView.setImageResource(R.drawable.the_prestige);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("The Prestige");
            choice.add("now you see me");
            choice.add("Source Code");
            choice.add("Momento");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer = "Focus";
            questionImageView.setImageResource(R.drawable.focus);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("now you see me");
            choice.add("Focus");
            choice.add("Catch me if you can");
            choice.add("Exam");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 11) {
            answer = "Memento";
            questionImageView.setImageResource(R.drawable.memento);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("now you see me");
            choice.add("Memento");
            choice.add("The Prestige");
            choice.add("Sherlock Holmes");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 12) {
            answer = "La La Land";
            questionImageView.setImageResource(R.drawable.la_la_land);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Gone Girl");
            choice.add("La La Land");
            choice.add("Her");
            choice.add("Begin Again");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 13) {
            answer = "Begin Again";
            questionImageView.setImageResource(R.drawable.begin_again);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Begin Again");
            choice.add("Her");
            choice.add("La La Land");
            choice.add("Before Sunrise");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 14) {
            answer = "Gravity";
            questionImageView.setImageResource(R.drawable.gravity);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Gravity");
            choice.add("Looper");
            choice.add("Invincible");
            choice.add("Lost in Translation");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 15) {
            answer = "Looper";
            questionImageView.setImageResource(R.drawable.looper);

            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Looper");
            choice.add("Gravity");
            choice.add("Platoon");
            choice.add("The Lobster");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 16) {
            answer = "Edge of tomorrow";
            questionImageView.setImageResource(R.drawable.edge_of_tomorrow);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Edge of tomorrow");
            choice.add("Platoon");
            choice.add("The man from earth");
            choice.add("Patch Adams");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 17) {
            answer = "The Lobster";
            questionImageView.setImageResource(R.drawable.the_lobster);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("The Lobster");
            choice.add("Exam");
            choice.add("The King's speech");
            choice.add("Twelve monkeys");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 18) {
            answer = "The social network";
            questionImageView.setImageResource(R.drawable.the_social_network);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("The social network");
            choice.add("Source Code");
            choice.add("Gravity");
            choice.add("Edge of tomorrow");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 19) {
            answer = "Apollo 13";
            questionImageView.setImageResource(R.drawable.apollo_13);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Apollo 13");
            choice.add("Gravity");
            choice.add("Back to the future");
            choice.add("Edge of tomorrow");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 20) {
            answer = "Exam";
            questionImageView.setImageResource(R.drawable.exam);


            ArrayList<String> choice = new ArrayList<String>(); //กำหนดการrandom choice
            choice.add("Exam");
            choice.add("Focus");
            choice.add("Das boot");
            choice.add("Buried");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    }//end setQuestion

    // public  void  choiceAns(View view)

    public void choiceAns(View view) { //ตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString(); //เอาข้อความบนปุ่มมาเก็บไว้บนตัวแปรbutton string
        if (buttonString.equals(answer)) {
            score++; //เลือกคำตอบถูก+1
        }
        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อ
            getNameString = getIntent().getStringExtra("Name");
            dialogboxScore(getNameString);//แสดงคำแนนรวม
        }   else {//ถ้ายังทำไม่ครบทุกข้อ
            setQuestion(qID.remove(0));//เรียกmethod setQuestion แสดงคำถามต่อไป
        }
    } //end method choiceAns

        private void dialogboxScore (String name){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("สรุปคะแนน");
            builder.setMessage(name + "ได้คะแนน " + score + " คะแนน")
                    .setCancelable(false)
                    .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    })
                    .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }//end dialogboxScore
    }

