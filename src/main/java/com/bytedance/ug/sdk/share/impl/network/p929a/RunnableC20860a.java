package com.bytedance.ug.sdk.share.impl.network.p929a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ug.sdk.share.impl.network.model.FetchTokenResponse;
import com.bytedance.ug.sdk.share.impl.network.p931c.C20870a;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.google.gson.GsonBuilder;

/* renamed from: com.bytedance.ug.sdk.share.impl.network.a.a */
public class RunnableC20860a implements Runnable {

    /* renamed from: a */
    public AbstractC20864a f51038a;

    /* renamed from: b */
    private String f51039b;

    /* renamed from: c */
    private String f51040c;

    /* renamed from: com.bytedance.ug.sdk.share.impl.network.a.a$a */
    public interface AbstractC20864a {
        /* renamed from: a */
        void mo70316a(int i);

        /* renamed from: a */
        void mo70317a(String str);
    }

    public void run() {
        Handler handler = new Handler(Looper.getMainLooper());
        try {
            StringBuilder sb = new StringBuilder(C20870a.m75931a("/ug_token/info/v1/"));
            sb.append("?");
            sb.append("&token=");
            sb.append(this.f51039b);
            sb.append("&from=");
            sb.append(this.f51040c);
            C20870a.m75934a(sb);
            final FetchTokenResponse fetchTokenResponse = (FetchTokenResponse) new GsonBuilder().create().fromJson(C20826a.m75837a().mo70288a(20480, sb.toString()), FetchTokenResponse.class);
            if (fetchTokenResponse == null || fetchTokenResponse.getStatus() != 0 || fetchTokenResponse.getData() == null) {
                handler.post(new Runnable() {
                    /* class com.bytedance.ug.sdk.share.impl.network.p929a.RunnableC20860a.RunnableC208622 */

                    public void run() {
                        int i;
                        if (RunnableC20860a.this.f51038a != null) {
                            AbstractC20864a aVar = RunnableC20860a.this.f51038a;
                            FetchTokenResponse fetchTokenResponse = fetchTokenResponse;
                            if (fetchTokenResponse != null) {
                                i = fetchTokenResponse.getStatus();
                            } else {
                                i = -1;
                            }
                            aVar.mo70316a(i);
                        }
                    }
                });
            } else {
                handler.post(new Runnable() {
                    /* class com.bytedance.ug.sdk.share.impl.network.p929a.RunnableC20860a.RunnableC208611 */

                    public void run() {
                        FetchTokenResponse fetchTokenResponse;
                        if (RunnableC20860a.this.f51038a != null && (fetchTokenResponse = fetchTokenResponse) != null && fetchTokenResponse.getData() != null) {
                            RunnableC20860a.this.f51038a.mo70317a(fetchTokenResponse.getData().toString());
                        } else if (RunnableC20860a.this.f51038a != null) {
                            RunnableC20860a.this.f51038a.mo70316a(-2);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            handler.post(new Runnable() {
                /* class com.bytedance.ug.sdk.share.impl.network.p929a.RunnableC20860a.RunnableC208633 */

                public void run() {
                    if (RunnableC20860a.this.f51038a != null) {
                        RunnableC20860a.this.f51038a.mo70316a(-1);
                    }
                }
            });
            C20826a.m75837a().mo70285a(th);
        }
    }

    public RunnableC20860a(String str, String str2, AbstractC20864a aVar) {
        this.f51039b = str;
        this.f51038a = aVar;
        this.f51040c = str2;
    }
}
