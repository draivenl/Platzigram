package com.platzi.platzigram.login.view;

/**
 * Created by draiven on 9/4/17.
 */

public interface LoginView {
    void goCreateAccount();
    void goHome();

    void enableInputs();
    void disableInputs();

    void showProgressBar();
    void hideProgressBar();


    void loginError(String error);

}
