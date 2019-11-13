package com.lcardoso.testecontrollers2.presenter;

import com.lcardoso.testecontrollers2.contract.UserContract;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserPresenterTest {

    private UserPresenter presenter = new UserPresenter();
    @Mock
    private UserContract.View view;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter.onStart(view);
    }

    @Test
    public void when_OnResetButtonClicked() {
        presenter.onResetButtonClicked();
        Mockito.verify(view, Mockito.times(1)).clearForm();
    }

    @Test
    public void when_OnSendButtonClicked() {
        presenter.onSendButtonClicked();
        Mockito.verify(view, Mockito.times(1)).navigateToNextScreen();
        Mockito.verify(view, Mockito.times(1)).isValidForm();
    }
}