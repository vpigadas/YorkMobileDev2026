package gr.york.mobiledev2026.fragment;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private int counter = 0;


    public void incrementCounter() {
        counter++;
    }

    public void decrementCounter() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
