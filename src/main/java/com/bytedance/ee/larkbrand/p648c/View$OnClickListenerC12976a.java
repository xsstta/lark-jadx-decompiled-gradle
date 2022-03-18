package com.bytedance.ee.larkbrand.p648c;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13345g;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapp.component.nativeview.AbstractC65886f;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.util.C67589g;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.ext.WebEventCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.c.a */
public class View$OnClickListenerC12976a extends ImageView implements View.OnClickListener, AbstractC65886f {

    /* renamed from: a */
    public C67231a f34528a;

    /* renamed from: b */
    public IAppContext f34529b;

    /* renamed from: c */
    private boolean f34530c;

    /* renamed from: d */
    private String f34531d;

    /* renamed from: e */
    private int f34532e;

    /* renamed from: f */
    private int f34533f;

    /* renamed from: g */
    private final IBaseRender f34534g;

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48876a(int i, WebEventCallback webEventCallback) {
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48877a(String str, WebEventCallback webEventCallback) {
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    public void setAppContext(IAppContext iAppContext) {
        this.f34529b = iAppContext;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!C13345g.m54336a() || motionEvent.getAction() == 8) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    public static int m53406a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("px")) {
            return 0;
        }
        try {
            return Integer.parseInt(str.replace("px", ""));
        } catch (NumberFormatException unused) {
            AppBrandLogger.m52829e("CoverImageView", "coverImage style not right");
            return 0;
        }
    }

    public void onClick(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("coverImageId", this.f34532e);
            String str = this.f34531d;
            if (str != null) {
                jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("extra", jSONObject2);
            AppBrandLogger.m52830i("CoverImageView", "click:" + this.f34532e);
            C67432a.m262319a(this.f34529b).getJsBridge().sendMsgToJsCore("onCoverImageTapped", jSONObject.toString(), this.f34533f);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("CoverImageView", "onCoverImageTapped error " + e.toString());
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.c.a$a */
    public static class C12979a {

        /* renamed from: a */
        boolean f34539a;

        /* renamed from: b */
        boolean f34540b;

        /* renamed from: c */
        boolean f34541c;

        /* renamed from: d */
        String f34542d;

        /* renamed from: e */
        int f34543e;

        /* renamed from: f */
        int f34544f;

        /* renamed from: g */
        int f34545g;

        /* renamed from: h */
        int f34546h;

        /* renamed from: i */
        Integer f34547i;

        /* renamed from: j */
        Integer f34548j;

        /* renamed from: k */
        String f34549k;

        /* renamed from: l */
        int f34550l;

        /* renamed from: m */
        boolean f34551m;

        /* renamed from: n */
        boolean f34552n;

        /* renamed from: a */
        public static C12979a m53412a(String str) {
            C12979a aVar = new C12979a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("fixed")) {
                    aVar.f34540b = true;
                    aVar.f34539a = jSONObject.optBoolean("fixed", false);
                }
                if (jSONObject.has("zIndex")) {
                    aVar.f34551m = true;
                    aVar.f34550l = jSONObject.optInt("zIndex");
                }
                aVar.f34541c = jSONObject.optBoolean("hidden", false);
                aVar.f34542d = jSONObject.optString("src");
                aVar.f34549k = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                JSONObject optJSONObject = jSONObject.optJSONObject("style");
                if (optJSONObject != null) {
                    aVar.f34543e = C67589g.m263062a((double) optJSONObject.optInt("width"));
                    aVar.f34544f = C67589g.m263062a((double) optJSONObject.optInt("height"));
                    aVar.f34545g = C67589g.m263062a((double) optJSONObject.optInt("left"));
                    aVar.f34546h = C67589g.m263062a((double) optJSONObject.optInt("top"));
                }
                if (jSONObject.has("absolutelyFixed")) {
                    aVar.f34552n = jSONObject.optBoolean("absolutelyFixed");
                    if (optJSONObject.has("width") && aVar.f34543e == 0) {
                        aVar.f34543e = C67589g.m263062a((double) View$OnClickListenerC12976a.m53406a(optJSONObject.optString("width")));
                    }
                    if (optJSONObject.has("height") && aVar.f34544f == 0) {
                        aVar.f34544f = C67589g.m263062a((double) View$OnClickListenerC12976a.m53406a(optJSONObject.optString("height")));
                    }
                    if (optJSONObject.has("left") && aVar.f34545g == 0) {
                        aVar.f34545g = C67589g.m263062a((double) View$OnClickListenerC12976a.m53406a(optJSONObject.optString("left")));
                    }
                    if (optJSONObject.has("top") && aVar.f34546h == 0) {
                        aVar.f34546h = C67589g.m263062a((double) View$OnClickListenerC12976a.m53406a(optJSONObject.optString("top")));
                    }
                    if (optJSONObject.has("right")) {
                        aVar.f34547i = Integer.valueOf(C67589g.m263062a((double) View$OnClickListenerC12976a.m53406a(optJSONObject.optString("right"))));
                    }
                    if (optJSONObject.has("bottom")) {
                        aVar.f34548j = Integer.valueOf(C67589g.m263062a((double) View$OnClickListenerC12976a.m53406a(optJSONObject.optString("bottom"))));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return aVar;
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: b */
    public void mo48878b(String str, WebEventCallback webEventCallback) {
        final C12979a a = C12979a.m53412a(str);
        if (!TextUtils.isEmpty(a.f34542d)) {
            C67432a.m262319a(this.f34529b).getAppInfo();
            this.f34530c = a.f34539a;
            this.f34531d = a.f34549k;
            Observable.create(new Function<Bitmap>() {
                /* class com.bytedance.ee.larkbrand.p648c.View$OnClickListenerC12976a.C129782 */

                /* renamed from: a */
                public Bitmap fun() {
                    byte[] loadByteFromStream = StreamLoader.loadByteFromStream(a.f34542d, View$OnClickListenerC12976a.this.f34529b);
                    if (loadByteFromStream == null || loadByteFromStream.length <= 0) {
                        return null;
                    }
                    return C67070z.m261385a(loadByteFromStream);
                }
            }).schudleOn(Schedulers.longIO()).observeOn(Schedulers.ui()).subscribe(new Subscriber.ResultableSubscriber<Bitmap>() {
                /* class com.bytedance.ee.larkbrand.p648c.View$OnClickListenerC12976a.C129771 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    AppBrandLogger.m52829e("CoverImageView", "icon error", th);
                }

                /* renamed from: a */
                public void onSuccess(Bitmap bitmap) {
                    if (bitmap != null) {
                        View$OnClickListenerC12976a.this.setImageBitmap(bitmap);
                    } else {
                        AppBrandLogger.m52829e("CoverImageView", "icon file not exists");
                    }
                    C67231a.C67234b bVar = new C67231a.C67234b(a.f34543e, a.f34544f, a.f34545g, a.f34546h);
                    if (a.f34551m) {
                        bVar.f169723c = a.f34550l;
                    }
                    if (a.f34540b) {
                        bVar.f169724d = a.f34539a;
                    }
                    if (a.f34552n) {
                        ViewGroup viewGroup = (ViewGroup) View$OnClickListenerC12976a.this.f34528a.getParent().getParent().getParent().getParent();
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(bVar);
                        marginLayoutParams.leftMargin = Math.max(a.f34545g, 0);
                        marginLayoutParams.topMargin = Math.max(a.f34546h, 0);
                        if (a.f34547i == null || a.f34547i.intValue() == 0) {
                            marginLayoutParams.rightMargin = 0;
                        } else {
                            marginLayoutParams.rightMargin = Math.max(C67590h.m263090d(View$OnClickListenerC12976a.this.f34529b.getApplicationContext()) - a.f34547i.intValue(), 0);
                        }
                        if (a.f34548j == null || a.f34548j.intValue() == 0) {
                            marginLayoutParams.bottomMargin = 0;
                        } else {
                            marginLayoutParams.bottomMargin = Math.max(C67590h.m263091e(View$OnClickListenerC12976a.this.f34529b.getApplicationContext()) - a.f34548j.intValue(), 0);
                        }
                        viewGroup.addView(View$OnClickListenerC12976a.this, marginLayoutParams);
                        return;
                    }
                    View$OnClickListenerC12976a.this.f34528a.addView(View$OnClickListenerC12976a.this, bVar);
                    View$OnClickListenerC12976a.this.setZ(1.0f);
                    AppBrandLogger.m52830i("CoverImageView", "get CoverImage z position = " + View$OnClickListenerC12976a.this.getZ());
                }
            });
        }
    }

    public View$OnClickListenerC12976a(C67231a aVar, int i, int i2, IBaseRender iBaseRender) {
        super(aVar.getContext());
        this.f34528a = aVar;
        this.f34532e = i;
        this.f34533f = i2;
        this.f34534g = iBaseRender;
        setOnClickListener(this);
    }
}
