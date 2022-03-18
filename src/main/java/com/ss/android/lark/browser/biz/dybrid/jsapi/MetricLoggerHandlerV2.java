package com.ss.android.lark.browser.biz.dybrid.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.dybrid.model.MetricLoggerModel;

public class MetricLoggerHandlerV2 extends AbstractInjectJSApiHandler<MetricLoggerModel> implements Parcelable {
    public static final Parcelable.Creator<MetricLoggerHandlerV2> CREATOR = new Parcelable.Creator<MetricLoggerHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.dybrid.jsapi.MetricLoggerHandlerV2.C297651 */

        /* renamed from: a */
        public MetricLoggerHandlerV2[] newArray(int i) {
            return new MetricLoggerHandlerV2[i];
        }

        /* renamed from: a */
        public MetricLoggerHandlerV2 createFromParcel(Parcel parcel) {
            return new MetricLoggerHandlerV2(parcel);
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

    public MetricLoggerHandlerV2() {
    }

    protected MetricLoggerHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(MetricLoggerModel metricLoggerModel, AbstractC25832c cVar) {
        if (metricLoggerModel != null) {
            C29638a.m109622a().getManisDependency().mo107697a(metricLoggerModel.isTimer(), metricLoggerModel.getEmitValue(), metricLoggerModel.getType(), metricLoggerModel.getId(), metricLoggerModel.getDomains(), metricLoggerModel.getParams());
        }
    }
}
