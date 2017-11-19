package ubc.cpsc304.rest;

import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpGetRequest extends HttpRequest<String> {

    public HttpGetRequest(String urlString, Context context) {
        super(urlString, "GET", context);
    }

    @Override
    protected String doInBackground(String... params) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod);
            connection.connect();

            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder resultSoFar = new StringBuilder();

            while (true) {
                String currLine = bufferedReader.readLine();
                if (currLine == null) {
                    break;
                } else {
                    resultSoFar.append(currLine);
                }
            }

            inputStreamReader.close();
            bufferedReader.close();

            return resultSoFar.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
