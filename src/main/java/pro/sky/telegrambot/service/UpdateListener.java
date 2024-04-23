package pro.sky.telegrambot.service;

import com.pengrad.telegrambot.model.Update;

import java.util.List;

public interface UpdateListener {

    int CONFIRMED_UPDATES_ALL = -1;
    int CONFIRMED_UPDATES_NON = -2;

    int process(List<Update> updates);
}
