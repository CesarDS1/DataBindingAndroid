package com.example.ironbit.bindingdata;

/**
 * Created by ironbit on 10/4/2017.
 */

public interface MainActivityContract {

    interface Presenter{
        void onShowData(TemperatureData temperatureData);
    }
    interface View {
        void showData(TemperatureData temperatureData);
    }
}
