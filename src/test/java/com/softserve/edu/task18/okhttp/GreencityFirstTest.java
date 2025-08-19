package com.softserve.edu.task18.okhttp;
import okhttp3.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class GreencityFirstTest {

    @Test
    public void test() throws IOException {

        Request request;
        Response response;

        String token = SigninFunctions.login();
        OkHttpClient client = new OkHttpClient();

        request = new Request.Builder()
                .url("https://greencity.greencity.cx.ua/eco-news/349/comments/active?page=0&size=5")
                .addHeader("accept", "*/*")
                .addHeader("Authorization", "Bearer " + token)
                .get()
                .build();
        response = client.newCall(request).execute();
        String resultJson = response.body().string();
        System.out.println(resultJson);

    }

}
