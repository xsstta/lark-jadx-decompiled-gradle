package com.ss.android.lark.browser.biz.messenger.jsapi.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.GeoLocationStopParams;
import org.json.JSONException;
import org.json.JSONObject;

public class GeoStopLocationHandlerV2 extends AbstractInjectJSApiHandler<GeoLocationStopParams> implements Parcelable {
    public static final Parcelable.Creator<GeoStopLocationHandlerV2> CREATOR = new Parcelable.Creator<GeoStopLocationHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStopLocationHandlerV2.C298521 */

        /* renamed from: a */
        public GeoStopLocationHandlerV2[] newArray(int i) {
            return new GeoStopLocationHandlerV2[i];
        }

        /* renamed from: a */
        public GeoStopLocationHandlerV2 createFromParcel(Parcel parcel) {
            return new GeoStopLocationHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private C29853a f74581a;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public GeoStopLocationHandlerV2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public boolean mo91862a() {
        C29853a aVar = this.f74581a;
        if (aVar == null) {
            return true;
        }
        aVar.mo107479a();
        this.f74581a.mo107485e();
        return true;
    }

    protected GeoStopLocationHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        if (mo91995c("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API") == null) {
            C29853a aVar = new C29853a(mo91997u());
            this.f74581a = aVar;
            mo91992a("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API", aVar);
            return;
        }
        this.f74581a = (C29853a) mo91995c("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(GeoLocationStopParams geoLocationStopParams, AbstractC25832c cVar) {
        C29853a aVar = this.f74581a;
        if (aVar != null && !aVar.mo107486f()) {
            String sceneId = geoLocationStopParams.getSceneId();
            if (sceneId == null) {
                sceneId = "";
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sceneId", sceneId);
            } catch (JSONException e) {
                Log.m165386e("GeoStopLocationHandler", e);
            }
            cVar.mo91902a(jSONObject.toString());
            this.f74581a.mo107485e();
        }
    }
}
