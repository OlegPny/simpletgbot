package botapp.bot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class OlegPnyFirstBot extends TelegramLongPollingBot {

    protected OlegPnyFirstBot(DefaultBotOptions botOptions) {
        super(botOptions);
    }

    @Override
    public void onUpdateReceived(Update update) {


        System.out.println("There was an update");

        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            System.out.println(chatId + ":" + messageText);

            SendMessage message = new SendMessage()
                    .setChatId(chatId)
                    .setText("Your message was: " + messageText);

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
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
