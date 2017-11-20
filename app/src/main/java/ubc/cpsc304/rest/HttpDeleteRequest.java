package ubc.cpsc304.rest;


import android.content.Context;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpDeleteRequest extends HttpRequest<Void> {

    private JSONObject requestBody;   // the JSON to send in the DELETE request

    public HttpDeleteRequest(String urlString, JSONObject requestBody, Context context) {
        super(urlString, "DELETE", context);
        this.requestBody = requestBody;
    }

    @Override
    protected Void doInBackground(String... params) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod);
            connection.setDoInput(true);   // TODO: do we need this?
            connection.setDoOutput(true);   // TODO: do we need this?
            connection.setRequestProperty("Content-Type", "application/json");
            connection.connect();

            OutputStream outputStream = connection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(requestBody.toString());
            bufferedWriter.close();

            // TODO: check for server error codes
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return null;
    }
}
