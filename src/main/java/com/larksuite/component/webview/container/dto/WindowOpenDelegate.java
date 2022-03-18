package com.larksuite.component.webview.container.dto;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebView;

public class WindowOpenDelegate implements Parcelable {
    public static final Parcelable.Creator<WindowOpenDelegate> CREATOR = new Parcelable.Creator<WindowOpenDelegate>() {
        /* class com.larksuite.component.webview.container.dto.WindowOpenDelegate.C258291 */

        /* renamed from: a */
        public WindowOpenDelegate[] newArray(int i) {
            return new WindowOpenDelegate[i];
        }

        /* renamed from: a */
        public WindowOpenDelegate createFromParcel(Parcel parcel) {
            return new WindowOpenDelegate(parcel);
        }
    };

    /* renamed from: a */
    public boolean mo91879a(Activity activity, WebView webView, Message message, Bundle bundle) {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public WindowOpenDelegate() {
    }

    protected WindowOpenDelegate(Parcel parcel) {
    }
}
