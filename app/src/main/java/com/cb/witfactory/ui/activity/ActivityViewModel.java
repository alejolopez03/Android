package com.cb.witfactory.ui.activity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ActivityViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ActivityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Login fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}