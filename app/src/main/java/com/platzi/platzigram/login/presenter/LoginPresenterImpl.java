package com.platzi.platzigram.login.presenter;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;
import com.platzi.platzigram.login.interactor.LoginInteractor;
import com.platzi.platzigram.login.interactor.LoginInteractorImpl;
import com.platzi.platzigram.login.view.LoginView;

/**
 * Created by draiven on 9/4/17.
 */

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth) {
        loginView.disableInputs();
        loginView.showProgressBar();
        loginInteractor.signIn(username, password, activity, firebaseAuth);

    }

    @Override
    public void loginSuccess() {
        loginView.goHome();
        loginView.hideProgressBar();
    }

    @Override
    public void loginError(String error) {
        loginView.enableInputs();
        loginView.hideProgressBar();
        loginView.loginError(error);
    }
}
