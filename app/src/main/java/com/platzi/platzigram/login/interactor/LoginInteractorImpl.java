package com.platzi.platzigram.login.interactor;

import com.platzi.platzigram.login.presenter.LoginPresenter;
import com.platzi.platzigram.login.repository.LoginRepository;
import com.platzi.platzigram.login.repository.LoginRepositoryImpl;

/**
 * Created by draiven on 9/4/17.
 */

public class LoginInteractorImpl implements LoginInteractor {

    private LoginPresenter loginPresenter;
    private LoginRepository repository;

    public LoginInteractorImpl(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
        repository = new LoginRepositoryImpl(loginPresenter);
    }

    @Override
    public void signIn(String username, String password) {

        repository.signIn(username, password);
    }
}
