package com.example.cmr_blog;

    private Button login;
    private TextView signup;
    private FirebaseAuth firebaseAuth;

    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);
        firebaseAuth=FirebaseAuth.getInstance();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login_mail = editText.getText().toString();
                String pass_mail = password.getText().toString();

                if (!TextUtils.isEmpty(login_mail) && !TextUtil
















                s.isEmpty(pass_mail)) ;
                {
                    firebaseAuth.signInWithEmailAndPassword(login_mail, pass_mail).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Intent profile_activity = new Intent(MainActivity.this, profile_activity.class);
                                startActivity(profile_activity);
                                finish();
                            } else {
                                Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_LONG).show();
                            }
                        }
                    });


                }
            }


        });
        signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent signup_intent = new Intent(MainActivity.this,signup.class);
                startActivity(signup_intent);
            }
        });

    }
}
