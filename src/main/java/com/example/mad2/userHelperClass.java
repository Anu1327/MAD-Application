package com.example.mad2;

import com.google.android.material.textfield.TextInputLayout;

public class userHelperClass {

    String name, username, email, phone, password,id;


        public userHelperClass(){
         }


        public userHelperClass(String name, String username, String email, String phone, String password, String id) {
            this.name = name;
            this.username = username;
            this.email = email;
            this.phone = phone;
            this.password = password;
            this.id = id;
        }

//        public userHelperClass(TextInputLayout regName, TextInputLayout regUsername) {
//        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

