package com.softserve.edu.task18.okhttp;
import com.google.gson.Gson;
import okhttp3.*;
import java.io.IOException;

public class SigninFunctions {

    public static String login() throws IOException {

        Gson gson = new Gson();

        OkHttpClient client = new OkHttpClient();

        RequestBody requestBody;
        Request request;
        Response response;
        GreencityLogin greencityLogin;

        String resultJson;
        String token;

        // Login
        String jsonBody = new StringBuilder()
                .append("{")
                .append("\"email\":\"xvr89922@toaik.com\",")
                .append("\"password\":\"Qwerty_1\",")
                .append("\"secretKey\":\"UD~3tDW<$K.rEk$IELFTVQwWU$-tN%IX~q>`NuMpxhUMb$D\"")
                .append("}").toString();

        requestBody = RequestBody.create(jsonBody,
                MediaType.parse("application/json; charset=utf-8"));
        request = new Request.Builder()
                .url("https://greencity-user.greencity.cx.ua/api/testers/sign-in")
                .addHeader("accept", "*/*")
                .post(requestBody)
                .build();
        response = client.newCall(request).execute();
        resultJson = response.body().string();
        greencityLogin = gson.fromJson(resultJson, GreencityLogin.class);
        token = greencityLogin.getAccessToken();

        return token;

    }
}
