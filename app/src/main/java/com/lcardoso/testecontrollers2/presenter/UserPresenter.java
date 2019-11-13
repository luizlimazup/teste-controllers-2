package com.lcardoso.testecontrollers2.presenter;

import com.lcardoso.testecontrollers2.contract.UserContract;

public class UserPresenter implements UserContract.Presenter {

    private UserContract.View view;

    public UserPresenter() {
    }

    @Override
    public void onStart(UserContract.View view) {
        this.view = view;
        view.setEditTexts();
        view.setSpinners();
        view.setButtons();
    }

    @Override
    public void onStop() {
        view = null;
    }

    @Override
    public void onResetButtonClicked() {
        view.clearForm();
    }

    @Override
    public void onSendButtonClicked() {
        switch (view.isValidForm()) {
            case 0:
                view.navigateToNextScreen();
                break;
            case 1:
                view.showMessage("Nome");
                break;
            case 2:
                view.showMessage("Sobrenome");
                break;
            case 3:
                view.showMessage("Telefone");
                break;
            case 4:
                view.showMessage("Celular");
                break;
            case 5:
                view.showMessage("CPF");
                break;
            case 6:
                view.showMessage("Escolaridade");
                break;
            case 7:
                view.showMessage("Endereço");
                break;
            case 8:
                view.showMessage("Bairro");
                break;
            case 9:
                view.showMessage("Estado");
                break;
            case 10:
                view.showMessage("Senha");
                break;
            case 11:
                view.showMessageP("As senhas não correspondem");
                break;
        }
    }
}
