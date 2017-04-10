package com.example.ironbit.bindingdata;

/**
 * Created by ironbit on 10/4/2017.
 */

public class MainActivityPresenter {

    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view)
    {
        this.view=view;
    }
    public void onShowData(TemperatureData temperatureData)
    {
        view.showData(temperatureData);
    }
}
