package com.larksuite.component.webview.container.dto;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebView;
import com.larksuite.component.webview.container.impl.inject.AbstractC25867d;
import com.larksuite.component.webview.container.impl.inject.C25864c;
import com.larksuite.component.webview.container.impl.p1172c.C25858i;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;

public class SimpleWindowOpenDelegate extends WindowOpenDelegate implements Parcelable {
    public static final Parcelable.Creator<SimpleWindowOpenDelegate> CREATOR = new Parcelable.Creator<SimpleWindowOpenDelegate>() {
        /* class com.larksuite.component.webview.container.dto.SimpleWindowOpenDelegate.C258281 */

        /* renamed from: a */
        public SimpleWindowOpenDelegate[] newArray(int i) {
            return new SimpleWindowOpenDelegate[i];
        }

        /* renamed from: a */
        public SimpleWindowOpenDelegate createFromParcel(Parcel parcel) {
            return new SimpleWindowOpenDelegate(parcel);
        }
    };

    /* renamed from: a */
    public void m93436b(Activity activity, Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.WindowOpenDelegate
    public int describeContents() {
        return 0;
    }

    @Override // com.larksuite.component.webview.container.dto.WindowOpenDelegate
    public void writeToParcel(Parcel parcel, int i) {
    }

    public SimpleWindowOpenDelegate() {
    }

    protected SimpleWindowOpenDelegate(Parcel parcel) {
    }

    /* renamed from: a */
    private Bundle m93434a(Context context, Bundle bundle) {
        boolean equals = "p0".equals(C26252ad.m94994c(context));
        Bundle bundle2 = new Bundle();
        ((AbstractC25867d) C25864c.m93607a()).mo92012a(equals, bundle2, bundle);
        return bundle2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m93435a(Bundle bundle, Activity activity) {
        try {
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putAll(m93434a((Context) activity, bundle2));
            bundle2.putBoolean("is_multi_window_open", true);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(activity, bundle2) {
                /* class com.larksuite.component.webview.container.dto.$$Lambda$SimpleWindowOpenDelegate$IhrFM2QN7LJ48nDFR_vDwrXUdPg */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ Bundle f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    SimpleWindowOpenDelegate.lambda$IhrFM2QN7LJ48nDFR_vDwrXUdPg(SimpleWindowOpenDelegate.this, this.f$1, this.f$2);
                }
            });
        } catch (Exception e) {
            Log.m165385e("SimpleWindowOpenDelegate", "biz multi window open impl analyse failed", e, true);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.WindowOpenDelegate
    /* renamed from: a */
    public boolean mo91879a(Activity activity, WebView webView, Message message, Bundle bundle) {
        C25858i.m93551a().mo91952a(message);
        C25858i.m93551a().mo91953a(new WeakReference<>(webView));
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(bundle, activity) {
            /* class com.larksuite.component.webview.container.dto.$$Lambda$SimpleWindowOpenDelegate$_nlpr99Na1XAPAnlUlk5YhLESUE */
            public final /* synthetic */ Bundle f$1;
            public final /* synthetic */ Activity f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                SimpleWindowOpenDelegate.lambda$_nlpr99Na1XAPAnlUlk5YhLESUE(SimpleWindowOpenDelegate.this, this.f$1, this.f$2);
            }
        });
        return true;
    }
}
