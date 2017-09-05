package com.platzi.platzigram.login.repository;

/**
 * Created by draiven on 9/4/17.
 */

public interface LoginRepository {
    void signIn(String username, String password);
}
