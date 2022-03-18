package com.ss.android.lark.simple.web;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/simple/web/SimpleWebViewDelegate;", "Lcom/larksuite/component/webview/container/dto/AbstractInjectWebViewDelegate;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "describeContents", "", "onCreateWebView", "", "hostFragment", "Landroidx/fragment/app/Fragment;", "webView", "Landroid/webkit/WebView;", "onDataPrepare", "proceedHandler", "Lcom/larksuite/component/webview/container/dto/AbstractInjectWebViewDelegate$IProceedHandler;", "writeToParcel", "flags", "CREATOR", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SimpleWebViewDelegate extends AbstractInjectWebViewDelegate implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo50984a(AbstractInjectWebViewDelegate.AbstractC25823a aVar) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: b */
    public void mo50996b(Fragment fragment, WebView webView) {
        Intrinsics.checkParameterIsNotNull(fragment, "hostFragment");
        Intrinsics.checkParameterIsNotNull(webView, "webView");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/simple/web/SimpleWebViewDelegate$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/simple/web/SimpleWebViewDelegate;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/simple/web/SimpleWebViewDelegate;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.web.SimpleWebViewDelegate$a */
    public static final class CREATOR implements Parcelable.Creator<SimpleWebViewDelegate> {
        private CREATOR() {
        }

        /* renamed from: a */
        public SimpleWebViewDelegate[] newArray(int i) {
            return new SimpleWebViewDelegate[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public SimpleWebViewDelegate createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new SimpleWebViewDelegate(parcel);
        }
    }

    public SimpleWebViewDelegate() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleWebViewDelegate(Parcel parcel) {
        this();
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        super.writeToParcel(parcel, i);
    }
}
