package com.platzi.platzigram.login.repository;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by draiven on 9/4/17.
 */

public interface LoginRepository {
    void signIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth);
}
