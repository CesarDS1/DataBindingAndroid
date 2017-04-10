package com.example.ironbit.bindingdata;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class TemperatureData extends BaseObservable {
    private String celsius;

    public TemperatureData(String celsius)
    {
        this.celsius=celsius;
    }
    private String farenheit;

    @Bindable
    public String getCelsius()
    {
        return celsius;
    }
    public void setCelsius(String celsius)
    {
        this.celsius=celsius;
        notifyPropertyChanged(BR.celsius);
    }
}
