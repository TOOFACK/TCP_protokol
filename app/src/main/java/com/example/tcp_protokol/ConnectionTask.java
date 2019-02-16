package com.example.tcp_protokol;

import android.os.AsyncTask;
import android.widget.EditText;

public class ConnectionTask extends AsyncTask<String, Void, Void> {
    @Override
    protected Void doInBackground(String... voids) {
        tcpClient simpleTcpClient = new tcpClient();
        simpleTcpClient.startClient(voids);
        return null;
    }


}
