package com.ss.android.lark.browser.biz.basic.queryapi;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;
import com.ss.android.lark.log.Log;

public class NavBgQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<NavBgQueryApiHandler> CREATOR = new Parcelable.Creator<NavBgQueryApiHandler>() {
        /* class com.ss.android.lark.browser.biz.basic.queryapi.NavBgQueryApiHandler.C297581 */

        /* renamed from: a */
        public NavBgQueryApiHandler[] newArray(int i) {
            return new NavBgQueryApiHandler[i];
        }

        /* renamed from: a */
        public NavBgQueryApiHandler createFromParcel(Parcel parcel) {
            return new NavBgQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public NavBgQueryApiHandler() {
    }

    protected NavBgQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                mo91999w().mo67308b().mo67315a(Color.parseColor("#" + str));
            } catch (Exception e) {
                Log.m165399w("NavBgQueryApiHandler", e);
            }
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
