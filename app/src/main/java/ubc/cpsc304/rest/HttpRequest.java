package ubc.cpsc304.rest;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

public abstract class HttpRequest<T> extends AsyncTask<String, Void, T> {
    protected String urlString;
    protected String requestMethod;
    protected ProgressDialog progressDialog;

    public HttpRequest(String urlString, String requestMethod, Context context) {
        this.urlString = urlString;
        this.requestMethod = requestMethod;
        this.progressDialog = new ProgressDialog(context);
    }

    @Override
    protected void onPreExecute() {
        progressDialog.setMessage("Message: Executing HTTP " + requestMethod + " request.");
        progressDialog.show();
    }

    @Override
    protected abstract T doInBackground(String... params);

    @Override
    protected void onProgressUpdate(Void... values) {
    }

    @Override
    protected void onPostExecute(T result) {
        super.onPostExecute(result);

        if (progressDialog.isShowing()) {   // TODO: do we really need isShowing()?
            progressDialog.dismiss();
        }
    }
}
