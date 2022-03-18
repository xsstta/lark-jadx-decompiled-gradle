package com.ss.android.lark.simple.web.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.LinkItem;
import com.ss.android.lark.simple.ui.SimpleMainLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u001c\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/simple/web/api/OpenUrlJsApiHandler;", "Lcom/larksuite/component/webview/container/dto/AbstractInjectJSApiHandler;", "Lcom/ss/android/lark/openapi/jsapi/entity/LinkItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "describeContents", "", "init", "", "extra", "Landroid/os/Bundle;", "onRequest", "item", "callback", "Lcom/larksuite/component/webview/container/dto/IJSApiRequestCallback;", "openNewLink", "context", "Landroid/content/Context;", "writeToParcel", "flags", "CREATOR", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class OpenUrlJsApiHandler extends AbstractInjectJSApiHandler<LinkItem> implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001d\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/simple/web/api/OpenUrlJsApiHandler$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/simple/web/api/OpenUrlJsApiHandler;", "()V", "TAG", "", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/simple/web/api/OpenUrlJsApiHandler;", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.web.api.OpenUrlJsApiHandler$a */
    public static final class CREATOR implements Parcelable.Creator<OpenUrlJsApiHandler> {
        private CREATOR() {
        }

        /* renamed from: a */
        public OpenUrlJsApiHandler[] newArray(int i) {
            return new OpenUrlJsApiHandler[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public OpenUrlJsApiHandler createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new OpenUrlJsApiHandler(parcel);
        }
    }

    public OpenUrlJsApiHandler() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OpenUrlJsApiHandler(Parcel parcel) {
        this();
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(LinkItem linkItem, AbstractC25832c cVar) {
        Intrinsics.checkParameterIsNotNull(linkItem, "item");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        m212879a(mo91997u(), linkItem);
    }

    /* renamed from: a */
    private final void m212879a(Context context, LinkItem linkItem) {
        if (context == null || linkItem == null) {
            Log.m165389i("OpenUrlJsApiHandler", "context == null || item == null");
            return;
        }
        Boolean newTab = linkItem.getNewTab();
        Intrinsics.checkExpressionValueIsNotNull(newTab, "item.newTab");
        if (newTab.booleanValue()) {
            new SimpleMainLauncher().mo187170a(context, linkItem.getUrl());
            return;
        }
        IWebContainerContract.IWebContainerView w = mo91999w();
        Intrinsics.checkExpressionValueIsNotNull(w, "webContainerView");
        w.mo67314g().loadUrl(linkItem.getUrl());
    }
}
