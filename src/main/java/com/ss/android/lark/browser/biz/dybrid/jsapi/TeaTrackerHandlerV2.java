package com.ss.android.lark.browser.biz.dybrid.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.biz.dybrid.model.TeaTrackerModel;
import com.ss.android.lark.statistics.Statistics;

public class TeaTrackerHandlerV2 extends AbstractInjectJSApiHandler<TeaTrackerModel> implements Parcelable {
    public static final Parcelable.Creator<TeaTrackerHandlerV2> CREATOR = new Parcelable.Creator<TeaTrackerHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.dybrid.jsapi.TeaTrackerHandlerV2.C297661 */

        /* renamed from: a */
        public TeaTrackerHandlerV2[] newArray(int i) {
            return new TeaTrackerHandlerV2[i];
        }

        /* renamed from: a */
        public TeaTrackerHandlerV2 createFromParcel(Parcel parcel) {
            return new TeaTrackerHandlerV2(parcel);
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

    public TeaTrackerHandlerV2() {
    }

    protected TeaTrackerHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(TeaTrackerModel teaTrackerModel, AbstractC25832c cVar) {
        if (teaTrackerModel != null) {
            Statistics.sendEvent(teaTrackerModel.getEventName(), teaTrackerModel.getEventParams());
        }
    }
}
