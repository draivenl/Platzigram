package com.platzi.platzigram.login.presenter;

/**
 * Created by draiven on 9/4/17.
 */

public interface LoginPresenter {

    void signIn(String username, String password); // Interactor
    void loginSuccess();
    void loginError(String error);


}
