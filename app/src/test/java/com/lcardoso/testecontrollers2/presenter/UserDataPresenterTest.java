package com.lcardoso.testecontrollers2.presenter;

import com.lcardoso.testecontrollers2.contract.UserDataContract;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserDataPresenterTest {

    @Mock
    private UserDataContract.View view;
    private UserDataPresenter presenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter = new UserDataPresenter(this.view);
        presenter.onStart();
    }

    @Test
    public void when_OnDoneButtonClicked() {
        presenter.onDoneButtonClicked();
        Mockito.verify(view, Mockito.times(1)).showSnackbar("Cadastro concluído com sucesso");
    }
}