package com.bytedance.ee.larkbrand.p648c;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13304a;
import com.bytedance.ee.larkbrand.service.p663a.AbstractC13306c;
import com.tt.miniapp.AbstractC66179g;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.AbstractC65886f;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapphost.util.C67589g;
import com.tt.option.ext.WebEventCallback;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.c.b */
public class C12980b extends FrameLayout implements AbstractC13306c, AbstractC65886f {

    /* renamed from: a */
    public AbstractC13304a f34553a;

    /* renamed from: b */
    private C67231a f34554b;

    /* renamed from: c */
    private int f34555c;

    /* renamed from: d */
    private int f34556d;

    /* renamed from: e */
    private final RenderViewManager.IRender f34557e;

    /* renamed from: f */
    private View f34558f;

    /* renamed from: g */
    private C12984a f34559g;

    /* renamed from: h */
    private IAppContext f34560h;

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48876a(int i, WebEventCallback webEventCallback) {
    }

    /* renamed from: a */
    public void mo48884a() {
        AppBrandLogger.m52830i("MapView", "-----moveToCurrentLocation----");
        AbstractC13304a aVar = this.f34553a;
        if (aVar != null) {
            aVar.mo49552a();
        }
    }

    @Override // com.bytedance.ee.larkbrand.service.p663a.AbstractC13306c
    public void onMapReady() {
        this.f34553a.mo49562e();
        this.f34553a.mo49553a(this.f34559g.f34570f, this.f34559g.f34569e);
        this.f34553a.mo49557a(this.f34559g.f34573i, this.f34560h);
        this.f34553a.mo49556a(this.f34559g.f34574j);
        this.f34553a.mo49554a((float) this.f34559g.f34571g);
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    public void setAppContext(IAppContext iAppContext) {
        this.f34560h = iAppContext;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: com.bytedance.ee.larkbrand.c.b$a */
    public static class C12984a {

        /* renamed from: a */
        int f34565a;

        /* renamed from: b */
        int f34566b;

        /* renamed from: c */
        int f34567c;

        /* renamed from: d */
        int f34568d;

        /* renamed from: e */
        double f34569e;

        /* renamed from: f */
        double f34570f;

        /* renamed from: g */
        int f34571g;

        /* renamed from: h */
        boolean f34572h;

        /* renamed from: i */
        JSONArray f34573i;

        /* renamed from: j */
        JSONArray f34574j;

        /* renamed from: a */
        public static C12984a m53430a(String str) {
            C12984a aVar = new C12984a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("style");
                if (optJSONObject != null) {
                    aVar.f34565a = C67589g.m263062a((double) optJSONObject.optInt("width"));
                    aVar.f34566b = C67589g.m263062a((double) optJSONObject.optInt("height"));
                    aVar.f34567c = C67589g.m263062a((double) optJSONObject.optInt("left"));
                    aVar.f34568d = C67589g.m263062a((double) optJSONObject.optInt("top"));
                }
                aVar.f34570f = jSONObject.optDouble("latitude", 39.908823d);
                aVar.f34569e = jSONObject.optDouble("longitude", 116.39747d);
                aVar.f34571g = jSONObject.optInt("scale", 16);
                aVar.f34573i = jSONObject.optJSONArray("markers");
                aVar.f34574j = jSONObject.optJSONArray("circles");
                aVar.f34572h = jSONObject.optBoolean("showLocation");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public void mo48886a(String str) {
        this.f34559g = C12984a.m53430a(str);
        this.f34558f = this.f34553a.mo49551a(this.f34554b.getContext(), null, TextUtils.equals(LarkExtensionManager.getInstance().getExtension().mo49563a().getLanguage(), "zh"));
        if (this.f34559g.f34572h) {
            HashSet hashSet = new HashSet();
            hashSet.add("android.permission.ACCESS_COARSE_LOCATION");
            hashSet.add("android.permission.ACCESS_FINE_LOCATION");
            C66588h.m260183a().mo232189a(this.f34560h.getCurrentActivity(), hashSet, new AbstractC66590i() {
                /* class com.bytedance.ee.larkbrand.p648c.C12980b.C129822 */

                @Override // com.tt.miniapp.permission.AbstractC66590i
                /* renamed from: a */
                public void mo48890a() {
                    C12980b.this.f34553a.mo49558a(true);
                    AppBrandLogger.m52830i("MapView", "permission granted");
                }

                @Override // com.tt.miniapp.permission.AbstractC66590i
                /* renamed from: a */
                public void mo48891a(String str) {
                    AppBrandLogger.m52830i("MapView", "permission denied");
                    C12980b.this.f34553a.mo49558a(false);
                }
            });
        }
        C67231a.C67234b bVar = new C67231a.C67234b(this.f34559g.f34565a, this.f34559g.f34566b, this.f34559g.f34567c, this.f34559g.f34568d);
        this.f34553a.mo49553a(this.f34559g.f34570f, this.f34559g.f34569e);
        this.f34553a.mo49557a(this.f34559g.f34573i, this.f34560h);
        this.f34553a.mo49556a(this.f34559g.f34574j);
        this.f34553a.mo49554a((float) this.f34559g.f34571g);
        addView(this.f34558f);
        this.f34554b.addView(this, bVar);
        this.f34557e.registerPageLife(new AbstractC66179g() {
            /* class com.bytedance.ee.larkbrand.p648c.C12980b.C129833 */

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: a */
            public void mo48892a() {
                AppBrandLogger.m52830i("MapView", "onStart");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: b */
            public void mo48894b() {
                AppBrandLogger.m52830i("MapView", "onEnterBackground");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: c */
            public void mo48896c() {
                AppBrandLogger.m52830i("MapView", "onRecoverForeground");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: d */
            public void mo48897d() {
                AppBrandLogger.m52830i("MapView", "onStop");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: e */
            public void mo48898e() {
                AppBrandLogger.m52830i("MapView", "onResume");
                if (C12980b.this.f34553a != null) {
                    C12980b.this.f34553a.mo49559b();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: f */
            public void mo48899f() {
                AppBrandLogger.m52830i("MapView", "onPause");
                if (C12980b.this.f34553a != null) {
                    C12980b.this.f34553a.mo49560c();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: g */
            public void mo48900g() {
                AppBrandLogger.m52830i("MapView", "onDestroyView");
                if (C12980b.this.f34553a != null) {
                    C12980b.this.f34553a.mo49561d();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: a */
            public void mo48893a(Bundle bundle) {
                AppBrandLogger.m52830i("MapView", "onCreateView");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: b */
            public void mo48895b(Bundle bundle) {
                AppBrandLogger.m52830i("MapView", "onSaveInstanceState");
            }
        });
    }

    /* renamed from: a */
    public void mo48885a(double d, double d2) {
        AppBrandLogger.m52830i("MapView", "-----moveTo----", Double.valueOf(d), Double.valueOf(d2));
        AbstractC13304a aVar = this.f34553a;
        if (aVar != null) {
            aVar.mo49553a(d, d2);
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: b */
    public void mo48878b(final String str, WebEventCallback webEventCallback) {
        AppBrandLogger.m52830i("MapView", "------addview------", str);
        AppbrandApplicationImpl.getInst(this.f34560h).getMainHandler().postDelayed(new Runnable() {
            /* class com.bytedance.ee.larkbrand.p648c.C12980b.RunnableC129811 */

            public void run() {
                C12980b.this.mo48886a(str);
            }
        }, 300);
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48877a(String str, WebEventCallback webEventCallback) {
        AppBrandLogger.m52830i("MapView", "-----update---", str);
        C12984a a = C12984a.m53430a(str);
        if (!(a.f34570f == this.f34559g.f34570f && a.f34569e == this.f34559g.f34569e)) {
            this.f34553a.mo49553a(a.f34570f, a.f34569e);
        }
        if (a.f34571g != this.f34559g.f34571g) {
            this.f34553a.mo49554a((float) a.f34571g);
        }
        this.f34553a.mo49562e();
        this.f34553a.mo49557a(a.f34573i, this.f34560h);
        this.f34553a.mo49556a(a.f34574j);
        if (!(this.f34559g.f34565a == a.f34565a && this.f34559g.f34566b == a.f34566b)) {
            C67231a.C67234b bVar = (C67231a.C67234b) getLayoutParams();
            bVar.width = a.f34565a;
            bVar.height = a.f34566b;
            requestLayout();
        }
        this.f34559g = a;
    }

    public C12980b(C67231a aVar, int i, int i2, RenderViewManager.IRender iRender) {
        super(aVar.getContext());
        this.f34554b = aVar;
        this.f34555c = i;
        this.f34556d = i2;
        this.f34557e = iRender;
        AbstractC13304a mapModel = LarkExtensionManager.getInstance().getExtension().getMapModel();
        this.f34553a = mapModel;
        mapModel.mo49555a(this);
    }
}
