package com.dbulgakov.amocrmlogin.view;

public interface View {
    void showError(Throwable throwable);
    void startProgressBar();
    void stopProgressBar();
}
