package botapp.bot;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class TelegramBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "OlegPnyFirstBot";
    }

    @Override
    public String getBotToken() {
        return "585826974:AAEi1iTE2e6HORmM5y69TzAt29lA7ReBN0E";
    }
}
