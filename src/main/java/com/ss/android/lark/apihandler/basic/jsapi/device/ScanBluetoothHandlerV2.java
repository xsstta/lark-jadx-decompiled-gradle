package com.ss.android.lark.apihandler.basic.jsapi.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28761g;
import com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28762h;
import com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28764j;
import com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.C28757d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.openapi.p2397a.C48758b;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ScanBluetoothHandlerV2 extends AbstractInjectJSApiHandler<C28745a> implements Parcelable {
    public static final Parcelable.Creator<ScanBluetoothHandlerV2> CREATOR = new Parcelable.Creator<ScanBluetoothHandlerV2>() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.ScanBluetoothHandlerV2.C287442 */

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
    private AbstractC28762h f72295a;

    /* renamed from: b */
    private AbstractC25832c f72296b;

    /* renamed from: c */
    private AbstractC28761g f72297c = new AbstractC28761g() {
        /* class com.ss.android.lark.apihandler.basic.jsapi.device.ScanBluetoothHandlerV2.C287431 */

        /* renamed from: a */
        List<C28747c> f72298a;

        /* renamed from: b */
        Set<String> f72299b;

        @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28761g
        /* renamed from: a */
        public void mo102226a() {
            this.f72298a = new LinkedList();
            this.f72299b = new HashSet();
            Log.m165389i("ScanBluetoothHandlerV2", "blueToothSearch start");
        }

        @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28761g
        /* renamed from: b */
        public void mo102229b() {
            ScanBluetoothHandlerV2.this.mo102224a(0, this.f72298a);
            this.f72298a = null;
            this.f72299b = null;
            Log.m165389i("ScanBluetoothHandlerV2", "blueToothSearch stop");
        }

        @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28761g
        /* renamed from: a */
        public void mo102227a(int i) {
            ScanBluetoothHandlerV2.this.mo102224a(i, (List<C28747c>) null);
            this.f72298a = null;
            this.f72299b = null;
            Log.m165389i("ScanBluetoothHandlerV2", "blueToothSearch error");
        }

        @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28761g
        /* renamed from: a */
        public void mo102228a(AbstractC28764j jVar) {
            String str;
            Set<String> set;
            C28747c cVar = new C28747c();
            String a = jVar.mo102259a();
            if (("blueToothSearch found; Is resultIdSets null? " + this.f72299b) == null) {
                str = "true";
            } else {
                str = "false";
            }
            Log.m165389i("ScanBluetoothHandlerV2", str);
            if (!TextUtils.isEmpty(a) && (set = this.f72299b) != null && !set.contains(a)) {
                cVar.id = a;
                cVar.name = jVar.mo102260b();
                cVar.type = jVar.mo102261c();
                cVar.state = jVar.mo102262d();
                this.f72299b.add(a);
                this.f72298a.add(cVar);
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
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.ScanBluetoothHandlerV2$a */
    public static class C28745a implements BaseJSModel {
        public long scanTimeout;

        C28745a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.ScanBluetoothHandlerV2$b */
    public static class C28746b implements BaseJSModel {
        int code;
        List<C28747c> data;

        C28746b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.ScanBluetoothHandlerV2$c */
    public static class C28747c implements BaseJSModel {
        String id;
        String name;
        int state;
        int type;

        C28747c() {
        }
    }

    public ScanBluetoothHandlerV2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public boolean mo91862a() {
        AbstractC28762h hVar = this.f72295a;
        if (hVar == null) {
            return true;
        }
        hVar.mo102252e();
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
    public void mo102224a(int i, List<C28747c> list) {
        if (this.f72296b != null) {
            C28746b bVar = new C28746b();
            bVar.code = i;
            bVar.data = list;
            this.f72296b.mo91902a(C48758b.m192085a(bVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C28745a aVar, AbstractC25832c cVar) {
        AbstractC28762h hVar = this.f72295a;
        if (hVar != null) {
            hVar.mo102252e();
        }
        this.f72296b = cVar;
        C28757d dVar = new C28757d(mo91997u());
        this.f72295a = dVar;
        dVar.mo102247a(this.f72297c);
        this.f72295a.mo102245a(aVar.scanTimeout);
    }
}
