package botapp.bot;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.telegram.telegrambots.ApiContext;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class BotApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();

        TelegramBotsApi botsApi = new TelegramBotsApi();

        DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);

        HttpHost httpHost = new HttpHost("80.211.142.200", 1080);

        RequestConfig requestConfig = RequestConfig.custom().setProxy(httpHost).setAuthenticationEnabled(false).build();
        botOptions.setRequestConfig(requestConfig);
        botOptions.setHttpProxy(httpHost);

        try {
            botsApi.registerBot(new OlegPnyFirstBot(botOptions));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
