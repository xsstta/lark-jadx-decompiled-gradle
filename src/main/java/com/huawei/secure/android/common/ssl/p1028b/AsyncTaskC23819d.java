package com.huawei.secure.android.common.ssl.p1028b;

import android.content.Context;
import android.os.AsyncTask;
import com.huawei.secure.android.common.ssl.C23826e;
import java.io.InputStream;

/* renamed from: com.huawei.secure.android.common.ssl.b.d */
public class AsyncTaskC23819d extends AsyncTask<Context, Integer, InputStream> {

    /* renamed from: a */
    private static final String f58999a = "d";

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        String str = f58999a;
        C23821f.m87074a(str, "onPreExecute: current thread name is : " + Thread.currentThread().getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onProgressUpdate(Integer... numArr) {
        String str = f58999a;
        C23821f.m87076b(str, "onProgressUpdate: current thread name is : " + Thread.currentThread().getName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(InputStream inputStream) {
        String str = f58999a;
        C23821f.m87074a(str, "onPostExecute: current thread name is : " + Thread.currentThread().getName());
        if (inputStream == null) {
            C23821f.m87078d(str, "get bks from tss error , result is null");
        } else {
            C23826e.m87094a(inputStream);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream doInBackground(Context... contextArr) {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = C23816a.m87051a(contextArr[0]);
        } catch (Exception e) {
            String str = f58999a;
            C23821f.m87078d(str, "doInBackground: exception : " + e.getMessage());
            inputStream = null;
        }
        String str2 = f58999a;
        C23821f.m87074a(str2, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return inputStream;
    }
}
