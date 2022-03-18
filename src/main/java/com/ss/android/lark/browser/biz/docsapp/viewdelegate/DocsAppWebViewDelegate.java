package com.ss.android.lark.browser.biz.docsapp.viewdelegate;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate;

public class DocsAppWebViewDelegate extends MessengerWebViewDelegate {
    public static final Parcelable.Creator<DocsAppWebViewDelegate> CREATOR = new Parcelable.Creator<DocsAppWebViewDelegate>() {
        /* class com.ss.android.lark.browser.biz.docsapp.viewdelegate.DocsAppWebViewDelegate.C297601 */

        /* renamed from: a */
        public DocsAppWebViewDelegate[] newArray(int i) {
            return new DocsAppWebViewDelegate[i];
        }

        /* renamed from: a */
        public DocsAppWebViewDelegate createFromParcel(Parcel parcel) {
            return new DocsAppWebViewDelegate(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    /* renamed from: c */
    public void mo107184c(Fragment fragment) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    public int describeContents() {
        return 0;
    }

    public DocsAppWebViewDelegate() {
    }

    protected DocsAppWebViewDelegate(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate, com.ss.android.lark.browser.biz.messenger.viewdelegate.MessengerWebViewDelegate
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
