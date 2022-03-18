package com.ss.android.vc.lark.rvc;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.ss.android.vc.common.p3083e.C60775q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/vc/lark/rvc/RvcInjectWebViewDelegate;", "Lcom/larksuite/component/webview/container/dto/AbstractInjectWebViewDelegate;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "describeContents", "", "onCreateWebView", "", "hostFragment", "Landroidx/fragment/app/Fragment;", "webView", "Landroid/webkit/WebView;", "onDataPrepare", "proceedHandler", "Lcom/larksuite/component/webview/container/dto/AbstractInjectWebViewDelegate$IProceedHandler;", "writeToParcel", "flags", "CREATOR", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RvcInjectWebViewDelegate extends AbstractInjectWebViewDelegate implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: a */
    public void mo50984a(AbstractInjectWebViewDelegate.AbstractC25823a aVar) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/lark/rvc/RvcInjectWebViewDelegate$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/vc/lark/rvc/RvcInjectWebViewDelegate;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/vc/lark/rvc/RvcInjectWebViewDelegate;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.rvc.RvcInjectWebViewDelegate$a */
    public static final class CREATOR implements Parcelable.Creator<RvcInjectWebViewDelegate> {
        private CREATOR() {
        }

        /* renamed from: a */
        public RvcInjectWebViewDelegate[] newArray(int i) {
            return new RvcInjectWebViewDelegate[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public RvcInjectWebViewDelegate createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new RvcInjectWebViewDelegate(parcel);
        }
    }

    public RvcInjectWebViewDelegate() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RvcInjectWebViewDelegate(Parcel parcel) {
        super(parcel);
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    /* renamed from: b */
    public void mo50996b(Fragment fragment, WebView webView) {
        super.mo50996b(fragment, webView);
        if (C60775q.m236138a()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        super.writeToParcel(parcel, i);
    }
}
