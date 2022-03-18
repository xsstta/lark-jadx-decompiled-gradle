package com.he.lynx.aurum;

import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpLoader implements Runnable {
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private final long ptr;
    private final String url;

    private static native void onData(long j, byte[] bArr, int i);

    private static native void onEnd(long j);

    private static native void onFailure(long j);

    private static native void onResponse(long j, int i, int i2);

    public void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.url).openConnection();
            httpURLConnection.setConnectTimeout(CalendarWorkHourUtil.f83805a);
            httpURLConnection.setReadTimeout(120000);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode > 299) {
                httpURLConnection.disconnect();
                onFailure(this.ptr);
                return;
            }
            onResponse(this.ptr, responseCode, httpURLConnection.getContentLength());
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    onEnd(this.ptr);
                    return;
                }
                onData(this.ptr, bArr, read);
            }
        } catch (Exception unused) {
            onFailure(this.ptr);
        }
    }

    private HttpLoader(long j, String str) {
        this.ptr = j;
        this.url = str;
        executorService.execute(this);
    }
}
