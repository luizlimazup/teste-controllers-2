package com.lcardoso.testecontrollers2.presenter;

import com.lcardoso.testecontrollers2.contract.UserDataContract;

public class UserDataPresenter implements UserDataContract.Presenter {

    private UserDataContract.View view;

    public UserDataPresenter(UserDataContract.View view) {
        this.view = view;
    }

    @Override
    public void onStart() {
        view.setTextViews();
        view.setButton();
        view.setFormData();
    }

    @Override
    public void onStop() {
        view = null;
    }

    @Override
    public void onDoneButtonClicked() {
        view.showSnackbar("Cadastro concluído com sucesso");
    }
}
