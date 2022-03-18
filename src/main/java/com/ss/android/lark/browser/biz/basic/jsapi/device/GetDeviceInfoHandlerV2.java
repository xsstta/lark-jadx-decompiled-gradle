package com.ss.android.lark.browser.biz.basic.jsapi.device;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.utils.C57878s;
import java.io.Serializable;

public class GetDeviceInfoHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetDeviceInfoHandlerV2> CREATOR = new Parcelable.Creator<GetDeviceInfoHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.device.GetDeviceInfoHandlerV2.C296641 */

        /* renamed from: a */
        public GetDeviceInfoHandlerV2[] newArray(int i) {
            return new GetDeviceInfoHandlerV2[i];
        }

        /* renamed from: a */
        public GetDeviceInfoHandlerV2 createFromParcel(Parcel parcel) {
            return new GetDeviceInfoHandlerV2(parcel);
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
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.GetDeviceInfoHandlerV2$a */
    public class C29665a implements Serializable {
        private String brand;
        private String model;
        private C29666b resolution;

        public String getBrand() {
            return this.brand;
        }

        public String getModel() {
            return this.model;
        }

        public C29666b getResolution() {
            return this.resolution;
        }

        public void setBrand(String str) {
            this.brand = str;
        }

        public void setModel(String str) {
            this.model = str;
        }

        public void setResolution(C29666b bVar) {
            this.resolution = bVar;
        }

        private C29665a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.GetDeviceInfoHandlerV2$b */
    public class C29666b implements Serializable {
        private int height;
        private int width;

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        private C29666b() {
        }
    }

    public GetDeviceInfoHandlerV2() {
    }

    /* renamed from: b */
    private C29665a m109778b() {
        C29665a aVar = new C29665a();
        aVar.setBrand(DeviceUtils.getBrand());
        aVar.setModel(DeviceUtils.getModel());
        C29666b bVar = new C29666b();
        bVar.setWidth(DeviceUtils.getScreenWidth(mo91997u()));
        bVar.setHeight(DeviceUtils.getScreenHeight(mo91997u()));
        aVar.setResolution(bVar);
        return aVar;
    }

    protected GetDeviceInfoHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        cVar.mo91902a(C57878s.m224591a(m109778b()));
    }
}
