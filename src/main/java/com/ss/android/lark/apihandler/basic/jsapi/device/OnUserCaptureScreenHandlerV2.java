package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;

public class OnUserCaptureScreenHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<OnUserCaptureScreenHandlerV2> CREATOR = new Parcelable.Creator<OnUserCaptureScreenHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.OnUserCaptureScreenHandlerV2.C287421 */

        /* renamed from: a */
        public OnUserCaptureScreenHandlerV2[] newArray(int i) {
            return new OnUserCaptureScreenHandlerV2[i];
        }

        /* renamed from: a */
        public OnUserCaptureScreenHandlerV2 createFromParcel(Parcel parcel) {
            return new OnUserCaptureScreenHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private static final String[] f72293a = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: b */
    private C28749a f72294b;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public OnUserCaptureScreenHandlerV2() {
    }

    /* renamed from: b */
    private void m105377b() {
        C28749a aVar = this.f72294b;
        if (aVar != null) {
            aVar.mo102239a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public boolean mo91862a() {
        C28749a aVar = this.f72294b;
        if (aVar == null) {
            return true;
        }
        aVar.mo102241b();
        return true;
    }

    protected OnUserCaptureScreenHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m105376a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m105377b();
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        this.f72294b = C28749a.m105400a(mo91997u(), cVar);
        new C51331a(mo91997u()).mo176924c(f72293a).subscribe(new Consumer() {
            /* class com.ss.android.lark.apihandler.basic.jsapi.device.$$Lambda$OnUserCaptureScreenHandlerV2$WHXbbh4k5T5yeqUYhj1HWqEq7g */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnUserCaptureScreenHandlerV2.this.m105376a((OnUserCaptureScreenHandlerV2) ((Boolean) obj));
            }
        });
    }
}
