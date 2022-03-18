package com.larksuite.component.webview.container.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.impl.inject.C25862a;
import com.ss.android.lark.log.Log;

public abstract class AbstractInjectQueryApiHandler extends C25862a implements Parcelable {
    /* renamed from: a */
    public abstract void mo91866a(String str);

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public AbstractInjectQueryApiHandler() {
    }

    protected AbstractInjectQueryApiHandler(Parcel parcel) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo91865a(String str, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            return Integer.parseInt(str);
        } catch (Exception unused) {
            Log.m165389i("InjectQueryApiHandler", "parseInt error with " + str);
            return i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo91867a(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            Log.m165389i("InjectQueryApiHandler", "parseBoolean error with " + str);
            return z;
        }
    }
}
