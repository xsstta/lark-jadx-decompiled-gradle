package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29694g;
import com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29695h;
import com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29697j;
import com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.C29690d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.openapi.p2397a.C48758b;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ScanBluetoothHandlerV2 extends AbstractInjectJSApiHandler<C29678a> implements Parcelable {
    public static final Parcelable.Creator<ScanBluetoothHandlerV2> CREATOR = new Parcelable.Creator<ScanBluetoothHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.ScanBluetoothHandlerV2.C296772 */

        /* renamed from: a */
        public ScanBluetoothHandlerV2[] newArray(int i) {
            return new ScanBluetoothHandlerV2[i];
        }

        /* renamed from: a */
        public ScanBluetoothHandlerV2 createFromParcel(Parcel parcel) {
            return new ScanBluetoothHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private AbstractC29695h f74363a;

    /* renamed from: b */
    private AbstractC25832c f74364b;

    /* renamed from: c */
    private AbstractC29694g f74365c = new AbstractC29694g() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.ScanBluetoothHandlerV2.C296761 */

        /* renamed from: a */
        List<C29680c> f74366a;

        /* renamed from: b */
        Set<String> f74367b;

        @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29694g
        /* renamed from: a */
        public void mo106979a() {
            this.f74366a = new LinkedList();
            this.f74367b = new HashSet();
            Log.m165389i("ScanBluetoothHandlerV2", "blueToothSearch start");
        }

        @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29694g
        /* renamed from: b */
        public void mo106982b() {
            ScanBluetoothHandlerV2.this.mo106977a(0, this.f74366a);
            this.f74366a = null;
            this.f74367b = null;
            Log.m165389i("ScanBluetoothHandlerV2", "blueToothSearch stop");
        }

        @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29694g
        /* renamed from: a */
        public void mo106980a(int i) {
            ScanBluetoothHandlerV2.this.mo106977a(i, (List<C29680c>) null);
            this.f74366a = null;
            this.f74367b = null;
            Log.m165389i("ScanBluetoothHandlerV2", "blueToothSearch error");
        }

        @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29694g
        /* renamed from: a */
        public void mo106981a(AbstractC29697j jVar) {
            String str;
            Set<String> set;
            C29680c cVar = new C29680c();
            String a = jVar.mo107012a();
            if (("blueToothSearch found; Is resultIdSets null? " + this.f74367b) == null) {
                str = "true";
            } else {
                str = "false";
            }
            Log.m165389i("ScanBluetoothHandlerV2", str);
            if (!TextUtils.isEmpty(a) && (set = this.f74367b) != null && !set.contains(a)) {
                cVar.id = a;
                cVar.name = jVar.mo107013b();
                cVar.type = jVar.mo107014c();
                cVar.state = jVar.mo107015d();
                this.f74367b.add(a);
                this.f74366a.add(cVar);
            }
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.ScanBluetoothHandlerV2$a */
    public static class C29678a implements BaseJSModel {
        public long scanTimeout;

        C29678a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.ScanBluetoothHandlerV2$b */
    public static class C29679b implements BaseJSModel {
        int code;
        List<C29680c> data;

        C29679b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.ScanBluetoothHandlerV2$c */
    public static class C29680c implements BaseJSModel {
        String id;
        String name;
        int state;
        int type;

        C29680c() {
        }
    }

    public ScanBluetoothHandlerV2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public boolean mo91862a() {
        AbstractC29695h hVar = this.f74363a;
        if (hVar == null) {
            return true;
        }
        hVar.mo107005e();
        return true;
    }

    protected ScanBluetoothHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public void mo106977a(int i, List<C29680c> list) {
        if (this.f74364b != null) {
            C29679b bVar = new C29679b();
            bVar.code = i;
            bVar.data = list;
            this.f74364b.mo91902a(C48758b.m192085a(bVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29678a aVar, AbstractC25832c cVar) {
        AbstractC29695h hVar = this.f74363a;
        if (hVar != null) {
            hVar.mo107005e();
        }
        this.f74364b = cVar;
        C29690d dVar = new C29690d(mo91997u());
        this.f74363a = dVar;
        dVar.mo107000a(this.f74365c);
        this.f74363a.mo106998a(aVar.scanTimeout);
    }
}
