package com.example.loginmodule;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CreateAccount extends AppCompatActivity {


    private EditText studentnum, firstname, year, section, middlename, lastname, email, mobilenum, bday, contactperson, contactnum, address;
    private Button signupbutt;
    private String status = "Pending";

    private DatabaseReference dbr = FirebaseDatabase.getInstance().getReference();
    private ValueEventListener eventListener;
    Members member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        register();
    }

    private void writeNewUser(String userID, String snum, String fname, String mname, String lname, Integer year,
                              Integer section, String email, Long mobilenum, String bday, String contactperson,
                              Long contactnum, String address ) {

        dbr.child("users").child(userID).setValue(snum);



    }

    private void register() {
        studentnum = findViewById(R.id.studentnum);
        signupbutt = findViewById(R.id.loginbutton);
        firstname = findViewById(R.id.firstname);
        middlename = findViewById(R.id.middlename);
        lastname = findViewById(R.id.lastname);
        year = findViewById(R.id.year);
        section = findViewById(R.id.section);
        email =  findViewById(R.id.email);
        mobilenum = findViewById(R.id.mobilenum);
        bday = findViewById(R.id.birthday);
        contactperson = findViewById(R.id.contactperson);
        contactnum = findViewById(R.id.contactnum);
        address = findViewById(R.id.address);

        member = new Members();

        dbr = FirebaseDatabase.getInstance().getReference().child("access_members").child(studentnum.getText().toString().trim());

        signupbutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //dbr.child("access_members").child(studentnum.getText().toString().trim()).setValue(member);
                member.setMembership_status(status);
                member.setFname(firstname.getText().toString().trim() + " " + middlename.getText().toString().trim() + " " + lastname.getText().toString().trim());
                member.setYear(Integer.parseInt(year.getText().toString().trim()));
                member.setSection(Integer.parseInt(section.getText().toString().trim()));
                member.setEmail(email.getText().toString().trim());
                member.setMobilenum(Long.parseLong(mobilenum.getText().toString().trim()));
                member.setBday(bday.getText().toString().trim());
                member.setContactperson(contactperson.getText().toString().trim());
                member.setContactnum(Long.parseLong(contactnum.getText().toString().trim()));
                member.setAddress(address.getText().toString().trim());

                dbr.push().setValue(member);
                Toast.makeText(CreateAccount.this, "Registered Successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
/*
    private void register() {
        String email = username.getText().toString().trim();
        String pass = password.getText().toString().trim();
        String lastn = lname.getText().toString().trim();
        String firstn = fname.getText().toString().trim();
        String middlen = mname.getText().toString().trim();
        String studentn = snum.getText().toString().trim();

        if (email.isEmpty()) {
            //prompt email is empty
            Toast.makeText(this, "Please enter Email", Toast.LENGTH_SHORT).show();
            //stopping the execution further
            return;
        }

        if (pass.isEmpty()) {
            //prompt password is empty
            Toast.makeText(this, "Please enter Password", Toast.LENGTH_SHORT).show();
            //stopping the execution further
            return;
        }
        pBar.setMessage("Registering User..");
        pBar.show();

        firebaseAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            //user is succesfully logged in
                            Toast.makeText(CreateAccount.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(CreateAccount.this, "Registered Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    @Override
    public void onClick(View v) {
        if (v == loginbutton) {
            register();
        }

        if (v == signupbutt) {
            //opens create account
        }
    }*/
}
