package com.lcardoso.testecontrollers2.contract;

import com.lcardoso.testecontrollers2.model.User;

public interface UserContract {

    interface View {
        void setEditTexts();
        void setSpinners();
        void setButtons();
        void navigateToNextScreen();
        User getFormData();
        void clearForm();
        int isValidForm();
        void showMessage(String message);
        void showMessageP(String message);
    }

    interface Presenter {
        void onStart(UserContract.View view);
        void onStop();
        void onResetButtonClicked();
        void onSendButtonClicked();
    }
}
