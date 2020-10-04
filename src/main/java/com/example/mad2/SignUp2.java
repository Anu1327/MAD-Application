package com.example.mad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class SignUp2 extends AppCompatActivity {

    EditText regName, regUsername, regEmail, regPhoneNo, regPassword;
    Button regGo, regBack;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userdata);

        //Hooks to save all xml elements in activity_sign_up.xml
        regName = findViewById(R.id.name);
        regUsername = findViewById(R.id.username);
        regEmail = findViewById(R.id.email);
        regPhoneNo = findViewById(R.id.phone);
        regPassword = findViewById(R.id.password);
        regGo = findViewById(R.id.button4);
        regBack = findViewById(R.id.button5);

        reference = FirebaseDatabase.getInstance().getReference("courses");

        //Save data in FireBase on button link
        regGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                rootNode = FirebaseDatabase.getInstance();
//                reference = FirebaseDatabase.getInstance().getReference("courses");
                addUser();
            }
        });
    }

//    private void storeNewUserData() {
//        FirebaseDatabase rootNode = FirebaseDatabase.getInstance();
//        DatabaseReference reference = rootNode.getReference("user");
//
//        DatabaseReference reference1= FirebaseDatabase.getInstance().getReference();
//
//        reference.setValue("First record!");
//        userHelperClass addNewUser = new userHelperClass(regName, regUsername);
//
//    }

    private void addUser() {

        //get all the value
        String name = regName.getText().toString();
        String username = regUsername.getText().toString();
        String email = regEmail.getText().toString();
        String phone = regPhoneNo.getText().toString();
        String password = regPassword.getText().toString();

//        if (TextUtils.isEmpty(name)) {
//            Toast.makeText(this, "Enter the name", Toast.LENGTH_SHORT).show();
//        }
//        if (TextUtils.isEmpty(username)) {
//            Toast.makeText(this, "Enter the username", Toast.LENGTH_SHORT).show();
//        }
//        if (TextUtils.isEmpty(email)) {
//            Toast.makeText(this, "Enater the valid email", Toast.LENGTH_SHORT).show();
//        }
//        if (TextUtils.isEmpty(phone)) {
//            Toast.makeText(this, "Enter the phone Number", Toast.LENGTH_SHORT).show();
//        } else {
            String id = reference.push().getKey();
            userHelperClass helperClass = new userHelperClass(name, username, email, password, id,phone);
            Toast.makeText(this,"Data is Saved",Toast.LENGTH_SHORT).show();

            reference.child(id).setValue(helperClass);
//        }
    }
}
               // userHelperClass helperClass = new userHelperClass(name,username,email,phoneNo,password);

               // reference.setValue(helperClass);



           // }
       // });




          //  }

           // private void storeNewUserData() {

           // FirebaseDatabase rootNode =FirebaseDatabase.getInstance();
           // DatabaseReference reference=rootNode.getReference("user");

           // DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

                //reference.setValue("First record!");
            //userHelperClass addNewUser = new userHelperClass(regName,regUsername);
    //}
        //}

