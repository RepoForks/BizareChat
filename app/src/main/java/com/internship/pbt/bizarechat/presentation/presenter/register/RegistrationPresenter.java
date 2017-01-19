package com.internship.pbt.bizarechat.presentation.presenter.register;

import com.internship.pbt.bizarechat.presentation.model.ValidationInformation;
import com.internship.pbt.bizarechat.presentation.presenter.Presenter;

import rx.Observable;

public interface RegistrationPresenter extends Presenter {

    void showErrorInvalidPassword();

    void showErrorInvalidEmail();

    void showErrorInvalidPhoneNumber();

    void validateInformation(Observable<ValidationInformation> validationInformationObservable);

    void saveUserAccInformation(ValidationInformation validationInformationObservable);

}