package com.huawei.updatesdk.p1029a.p1039b.p1041b;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.common.PackageConstants;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23838d;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;
import com.huawei.updatesdk.p1029a.p1039b.p1043c.C23862b;
import com.huawei.updatesdk.p1046b.p1051c.C23884c;
import com.huawei.updatesdk.p1046b.p1052d.C23886a;
import com.huawei.updatesdk.p1046b.p1053e.p1054a.C23888b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: com.huawei.updatesdk.a.b.b.b */
public class AsyncTaskC23856b extends AsyncTask<Void, Void, Void> {

    /* renamed from: a */
    private String f59084a = PackageConstants.SERVICES_PACKAGE_APPMARKET;

    /* renamed from: b */
    private HttpURLConnection f59085b;

    /* renamed from: c */
    private boolean f59086c = false;

    /* renamed from: d */
    private C23855a f59087d;

    /* renamed from: e */
    private Handler f59088e = new HandlerC23858b(null);

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.a.b.b.b$a */
    public class RunnableC23857a implements Runnable {
        RunnableC23857a() {
        }

        public void run() {
            if (AsyncTaskC23856b.this.f59085b != null) {
                AsyncTaskC23856b.this.f59086c = true;
                AsyncTaskC23856b.this.f59085b.disconnect();
            }
            AbstractC23838d.m87129a(new File(AsyncTaskC23856b.m87229e()));
        }
    }

    /* renamed from: com.huawei.updatesdk.a.b.b.b$b */
    private static class HandlerC23858b extends Handler {
        private HandlerC23858b() {
        }

        /* synthetic */ HandlerC23858b(RunnableC23857a aVar) {
            this();
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof C23855a) {
                C23855a aVar = (C23855a) obj;
                Intent intent = new Intent();
                C23862b a = C23862b.m87240a(intent);
                int i = message.what;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            Context a2 = C23854a.m87210c().mo85582a();
                            C23886a.m87343a(a2, AsyncTaskC23856b.m87229e() + "/appmarket.apk", aVar.mo85589c());
                        } else if (i != 5) {
                            return;
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("download_status_param", message.what);
                    intent.putExtras(bundle);
                    C23884c.m87335b().mo85683b(a);
                    return;
                }
                intent.putExtra("download_apk_size", aVar.mo85591e());
                intent.putExtra("download_apk_already", aVar.mo85584a());
                C23884c.m87335b().mo85682a(a);
            }
        }
    }

    public AsyncTaskC23856b(C23855a aVar) {
        this.f59087d = aVar;
        if (!TextUtils.isEmpty(aVar.mo85589c())) {
            this.f59084a = aVar.mo85589c();
        }
    }

    /* renamed from: a */
    private void m87222a(int i, long j, String str, int i2) {
        C23855a aVar = new C23855a();
        aVar.mo85585a(i);
        aVar.mo85586a(j);
        aVar.mo85587a(str);
        Handler handler = this.f59088e;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(i2, aVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[SYNTHETIC, Splitter:B:31:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m87223a(com.huawei.updatesdk.p1029a.p1039b.p1041b.C23855a r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1039b.p1041b.AsyncTaskC23856b.m87223a(com.huawei.updatesdk.a.b.b.a, java.lang.String):void");
    }

    /* renamed from: a */
    private void m87224a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                C23834a.m87118b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + e.toString());
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                C23834a.m87118b("DownloadMarketTask", "downloadUrlToStream(String urlString,OutputStream outputStream) " + e2.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee A[SYNTHETIC, Splitter:B:64:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0118  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m87225a(com.huawei.updatesdk.p1029a.p1039b.p1041b.C23855a r21, java.io.OutputStream r22, java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 443
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1039b.p1041b.AsyncTaskC23856b.m87225a(com.huawei.updatesdk.a.b.b.a, java.io.OutputStream, java.lang.String):boolean");
    }

    /* renamed from: d */
    private void m87228d() {
        HttpURLConnection httpURLConnection = this.f59085b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m87229e() {
        String b = C23854a.m87210c().mo85583b();
        if (TextUtils.isEmpty(b)) {
            return "";
        }
        String str = b + "/updatesdk";
        File file = new File(str);
        return (file.exists() || file.mkdirs()) ? str : "";
    }

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        C23888b.m87348a(this);
        m87223a(this.f59087d, m87229e());
        return null;
    }

    /* renamed from: a */
    public void mo85593a() {
        new_insert_after_java_lang_Thread_by_knot(new Thread(new RunnableC23857a())).start();
    }

    /* renamed from: b */
    public void mo85594b() {
        this.f59088e = null;
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        mo85593a();
    }
}
