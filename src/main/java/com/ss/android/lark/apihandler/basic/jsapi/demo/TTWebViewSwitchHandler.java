package com.ss.android.lark.apihandler.basic.jsapi.demo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.utils.LarkContext;

public class TTWebViewSwitchHandler extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<TTWebViewSwitchHandler> CREATOR = new Parcelable.Creator<TTWebViewSwitchHandler>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.demo.TTWebViewSwitchHandler.C287231 */

        /* renamed from: a */
        public TTWebViewSwitchHandler[] newArray(int i) {
            return new TTWebViewSwitchHandler[i];
        }

        /* renamed from: a */
        public TTWebViewSwitchHandler createFromParcel(Parcel parcel) {
            return new TTWebViewSwitchHandler(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public TTWebViewSwitchHandler() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m105306c() {
        m105303a((Context) LarkContext.getApplication());
    }

    /* renamed from: b */
    private boolean m105305b() {
        if (mo91997u() != null) {
            return mo91997u().getSharedPreferences("ttWebViewStatus", 0).getBoolean("ttWebViewStatus", true);
        }
        Log.m165389i("TTWebViewSwitchHandler", "ttWebViewEnabled return default value");
        return true;
    }

    protected TTWebViewSwitchHandler(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private void m105304a(boolean z) {
        if (mo91997u() != null) {
            SharedPreferences.Editor edit = mo91997u().getSharedPreferences("ttWebViewStatus", 0).edit();
            edit.putBoolean("ttWebViewStatus", z);
            edit.apply();
            Log.m165389i("TTWebViewSwitchHandler", "updateEnabled" + z);
        }
    }

    /* renamed from: a */
    private void m105303a(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.addFlags(32768);
        launchIntentForPackage.addFlags(268435456);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (!TextUtils.equals(runningAppProcessInfo.processName, runningAppProcessInfo.pkgList[0])) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        context.startActivity(launchIntentForPackage);
        System.exit(0);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        Log.m165389i("TTWebViewSwitchHandler", "invoke api");
        if (!C26284k.m95186b(LarkContext.getApplication())) {
            Log.m165389i("TTWebViewSwitchHandler", "is release package will return");
            return;
        }
        if (m105305b()) {
            m105304a(false);
        } else {
            m105304a(true);
        }
        IWebContainerContract.IWebContainerView w = mo91999w();
        if (w != null && w.mo67314g() != null) {
            w.mo67314g().postDelayed(new Runnable() {
                /* class com.ss.android.lark.apihandler.basic.jsapi.demo.$$Lambda$TTWebViewSwitchHandler$fI0IDEyOcBIUmwaPakC50heQAh8 */

                public final void run() {
                    TTWebViewSwitchHandler.this.m105306c();
                }
            }, 500);
        }
    }
}
