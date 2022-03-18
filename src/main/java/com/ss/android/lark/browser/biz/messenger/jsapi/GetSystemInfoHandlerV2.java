package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.openapi.p2397a.C48758b;
import com.ss.android.lark.utils.C57859q;
import java.io.Serializable;

public class GetSystemInfoHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetSystemInfoHandlerV2> CREATOR = new Parcelable.Creator<GetSystemInfoHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetSystemInfoHandlerV2.C297931 */

        /* renamed from: a */
        public GetSystemInfoHandlerV2[] newArray(int i) {
            return new GetSystemInfoHandlerV2[i];
        }

        /* renamed from: a */
        public GetSystemInfoHandlerV2 createFromParcel(Parcel parcel) {
            return new GetSystemInfoHandlerV2(parcel);
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

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.GetSystemInfoHandlerV2$a */
    public class C29794a implements Serializable {
        private String appVersion;
        private String deviceID;
        private String model;
        private float pixelRatio;
        private String platform;
        private String system;

        public String getAppVersion() {
            return this.appVersion;
        }

        public String getDeviceID() {
            return this.deviceID;
        }

        public String getModel() {
            return this.model;
        }

        public float getPixelRatio() {
            return this.pixelRatio;
        }

        public String getPlatform() {
            return this.platform;
        }

        public String getSystem() {
            return this.system;
        }

        public void setAppVersion(String str) {
            this.appVersion = str;
        }

        public void setModel(String str) {
            this.model = str;
        }

        public void setPixelRatio(float f) {
            this.pixelRatio = f;
        }

        public void setPlatform(String str) {
            this.platform = str;
        }

        public void setSystem(String str) {
            this.system = str;
        }

        private C29794a() {
        }

        public void setDeviceID(String str) {
            this.deviceID = C57859q.m224566b(str);
        }
    }

    public GetSystemInfoHandlerV2() {
    }

    /* renamed from: b */
    private Object m110161b() {
        C29794a aVar = new C29794a();
        aVar.setSystem(DeviceUtils.getOSVersion());
        aVar.setAppVersion(C26246a.m94977a(mo91997u()));
        aVar.setPlatform("android");
        aVar.setModel(DeviceUtils.getModel());
        aVar.setPixelRatio(DeviceUtils.getScreenDensity(mo91997u()));
        aVar.setDeviceID(C29638a.m109622a().getDeviceId());
        return aVar;
    }

    protected GetSystemInfoHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        cVar.mo91902a(C48758b.m192085a(m110161b()));
    }
}
