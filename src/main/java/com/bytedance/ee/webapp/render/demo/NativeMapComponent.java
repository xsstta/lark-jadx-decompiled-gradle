package com.bytedance.ee.webapp.render.demo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13306c;
import com.ss.android.lark.sdk.C53241h;
import com.tt.miniapp.AbstractC66179g;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.util.C67589g;
import com.tt.refer.common.base.AppType;

public class NativeMapComponent extends AbstractNativeComponent implements AbstractC13306c {
    private IAppContext mAppContext;
    private Context mContext;
    private C13820b mData;
    public AbstractC13304a mMapModel;
    private View mRealMapView;

    public String getComponentViewType() {
        return "map";
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onRemove() {
    }

    public void moveToCurrentLocation() {
        C53241h.m205898b("NativeMapComponent", "-----moveToCurrentLocation----");
        AbstractC13304a aVar = this.mMapModel;
        if (aVar != null) {
            aVar.mo49552a();
        }
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13306c
    public void onMapReady() {
        this.mMapModel.mo49562e();
        this.mMapModel.mo49553a(this.mData.f36096f, this.mData.f36095e);
        this.mMapModel.mo49557a(this.mData.f36099i, this.mAppContext);
        this.mMapModel.mo49556a(this.mData.f36100j);
        this.mMapModel.mo49554a((float) this.mData.f36097g);
    }

    /* renamed from: com.bytedance.ee.webapp.render.demo.NativeMapComponent$a */
    private static class C13818a extends FrameLayout {
        public C13818a(Context context) {
            super(context);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            C53241h.m205898b("NativeMapComponent", "onTouchEvent, event = " + motionEvent.getAction());
            return super.onTouchEvent(motionEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            C53241h.m205898b("NativeMapComponent", "onInterceptTouchEvent, ev = " + motionEvent.getAction());
            getParent().requestDisallowInterceptTouchEvent(true);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    private C13820b parse(JSONObject jSONObject) {
        C13820b bVar = new C13820b();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject);
        org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("style");
        if (optJSONObject != null) {
            bVar.f36091a = C67589g.m263062a((double) optJSONObject.optInt("width"));
            bVar.f36092b = C67589g.m263062a((double) optJSONObject.optInt("height"));
            bVar.f36093c = C67589g.m263062a((double) optJSONObject.optInt("left"));
            bVar.f36094d = C67589g.m263062a((double) optJSONObject.optInt("top"));
        }
        bVar.f36096f = jSONObject2.optDouble("latitude", 39.908823d);
        bVar.f36095e = jSONObject2.optDouble("longitude", 116.39747d);
        bVar.f36097g = jSONObject2.optInt("scale", 16);
        bVar.f36099i = jSONObject2.optJSONArray("markers");
        bVar.f36100j = jSONObject2.optJSONArray("circles");
        bVar.f36098h = jSONObject2.optBoolean("showLocation", true);
        this.mData = bVar;
        return bVar;
    }

    private IAppContext generateAppContext(Context context, JSONObject jSONObject) {
        String str;
        AppType appType;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.getString("appId");
        }
        if (jSONObject == null) {
            appType = AppType.WebAPP;
        } else {
            appType = (AppType) jSONObject.getObject("appType", AppType.class);
        }
        return C13282a.m54091a(context, str, appType);
    }

    public void moveCamera(double d, double d2) {
        C53241h.m205898b("NativeMapComponent", "moveToLocation, la: " + d + ", lon: " + d2);
        AbstractC13304a aVar = this.mMapModel;
        if (aVar != null) {
            aVar.mo49553a(d, d2);
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void performAction(String str, JSONObject jSONObject) {
        str.hashCode();
        if (str.equals("moveToLocation")) {
            if (jSONObject == null || !jSONObject.containsKey("latitude") || !jSONObject.containsKey("longitude")) {
                moveToCurrentLocation();
            } else {
                moveCamera(jSONObject.getDouble("latitude").doubleValue(), jSONObject.getDouble("longitude").doubleValue());
            }
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onUpdateView(View view, JSONObject jSONObject) {
        C13820b parse = parse(jSONObject);
        if (!(parse.f36096f == this.mData.f36096f && parse.f36095e == this.mData.f36095e)) {
            this.mMapModel.mo49553a(parse.f36096f, parse.f36095e);
        }
        if (parse.f36097g != this.mData.f36097g) {
            this.mMapModel.mo49554a((float) parse.f36097g);
        }
        this.mMapModel.mo49562e();
        this.mMapModel.mo49557a(parse.f36099i, this.mAppContext);
        this.mMapModel.mo49556a(parse.f36100j);
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public View onCreateView(Context context, JSONObject jSONObject) {
        C53241h.m205898b("NativeMapComponent", "onCreateView");
        C13820b parse = parse(jSONObject);
        this.mAppContext = generateAppContext(context, getDataExtra());
        this.mRealMapView = this.mMapModel.mo49551a(this.mContext, null, TextUtils.equals(LarkExtensionManager.getInstance().getExtension().mo49563a().getLanguage(), "zh"));
        this.mMapModel.mo49558a(parse.f36098h);
        this.mMapModel.mo49553a(parse.f36096f, parse.f36095e);
        this.mMapModel.mo49557a(parse.f36099i, this.mAppContext);
        this.mMapModel.mo49556a(parse.f36100j);
        this.mMapModel.mo49554a((float) parse.f36097g);
        C13818a aVar = new C13818a(this.mContext);
        aVar.addView(this.mRealMapView);
        C138171 r7 = new AbstractC66179g() {
            /* class com.bytedance.ee.webapp.render.demo.NativeMapComponent.C138171 */

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: a */
            public void mo48892a() {
                C53241h.m205898b("NativeMapComponent", "onStart");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: b */
            public void mo48894b() {
                C53241h.m205898b("NativeMapComponent", "onEnterBackground");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: c */
            public void mo48896c() {
                C53241h.m205898b("NativeMapComponent", "onRecoverForeground");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: d */
            public void mo48897d() {
                C53241h.m205898b("NativeMapComponent", "onStop");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: e */
            public void mo48898e() {
                C53241h.m205898b("NativeMapComponent", "onResume");
                if (NativeMapComponent.this.mMapModel != null) {
                    NativeMapComponent.this.mMapModel.mo49559b();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: f */
            public void mo48899f() {
                C53241h.m205898b("NativeMapComponent", "onPause");
                if (NativeMapComponent.this.mMapModel != null) {
                    NativeMapComponent.this.mMapModel.mo49560c();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: g */
            public void mo48900g() {
                C53241h.m205898b("NativeMapComponent", "onDestroyView");
                if (NativeMapComponent.this.mMapModel != null) {
                    NativeMapComponent.this.mMapModel.mo49561d();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: a */
            public void mo48893a(Bundle bundle) {
                C53241h.m205898b("NativeMapComponent", "onCreateView");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: b */
            public void mo48895b(Bundle bundle) {
                C53241h.m205898b("NativeMapComponent", "onSaveInstanceState");
            }
        };
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.mAppContext).getRenderViewManager();
        if (renderViewManager == null) {
            C53241h.m205894a("NativeMapComponent", "onCreateView, renderViewManager is null");
        } else {
            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
            if (currentIRender != null) {
                currentIRender.registerPageLife(r7);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("testKey", "testValue");
        fireEvent("mapLoaded", jSONObject2);
        return aVar;
    }

    public NativeMapComponent(C12717a aVar, String str, String str2) {
        super(aVar, str, str2);
        this.mContext = aVar.mo48166a();
        AbstractC13304a mapModel = LarkExtensionManager.getInstance().getExtension().getMapModel();
        this.mMapModel = mapModel;
        mapModel.mo49555a(this);
    }
}
