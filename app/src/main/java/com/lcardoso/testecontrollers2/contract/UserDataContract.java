package com.lcardoso.testecontrollers2.contract;

public interface UserDataContract {

    interface View {
        void setTextViews();
        void setButton();
        void setFormData();
        void finishActivity();
        void showSnackbar(String message);
    }

    interface Presenter {
        void onStart();
        void onStop();
        void onDoneButtonClicked();
    }
}
