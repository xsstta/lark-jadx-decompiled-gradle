package com.tt.miniapp.component.nativeview;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AbstractC66179g;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.video.TTVideoView;
import com.tt.miniapp.video.base.ITTVideoController;
import com.tt.miniapp.video.core.C67093a;
import com.tt.miniapp.video.p3341d.p3343b.C67102b;
import com.tt.miniapp.view.C67160b;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67589g;
import com.tt.miniapphost.util.C67590h;
import com.tt.option.ext.WebEventCallback;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.component.nativeview.j */
public class C65903j extends TTVideoView implements IBackPressedListener, AbstractC65886f, C67160b.AbstractC67162a {

    /* renamed from: g */
    private static final SparseArray<C67093a> f166264g = new SparseArray<>();

    /* renamed from: a */
    public C65910c f166265a;

    /* renamed from: b */
    public C67231a f166266b;

    /* renamed from: c */
    public RenderViewManager.IRender f166267c;

    /* renamed from: d */
    public C65909b f166268d;

    /* renamed from: e */
    private int f166269e = C67590h.m263090d(getContext());

    /* renamed from: f */
    private int f166270f = C67590h.m263091e(getContext());

    /* renamed from: h */
    private String f166271h;

    /* renamed from: i */
    private ViewTreeObserver.OnScrollChangedListener f166272i;

    /* renamed from: j */
    private IAppContext f166273j;

    /* renamed from: k */
    private AbstractC66179g f166274k;

    /* renamed from: com.tt.miniapp.component.nativeview.j$a */
    public class C65908a extends C67093a {
        @Override // com.tt.miniapp.video.core.C67093a
        /* renamed from: a */
        public void mo230773a() {
            if (C65903j.this.getVideoController().mo233274n()) {
                C65903j jVar = C65903j.this;
                jVar.mo230767a(jVar.f166265a);
            }
            super.mo230773a();
        }

        @Override // com.tt.miniapp.video.base.C67084a
        /* renamed from: c */
        public void mo230777c() {
            super.mo230777c();
            C65903j jVar = C65903j.this;
            jVar.f166268d = C65909b.m258184a(jVar);
            C67590h.m263076a(C65903j.this);
            View decorView = C65903j.this.f166267c.getCurrentActivity().getWindow().getDecorView();
            if (decorView instanceof ViewGroup) {
                ((ViewGroup) decorView).addView(C65903j.this, new ViewGroup.LayoutParams(-1, -1));
            }
        }

        @Override // com.tt.miniapp.video.core.C67093a, com.tt.miniapp.video.base.C67084a
        /* renamed from: b */
        public void mo230776b() {
            super.mo230776b();
            AppBrandLogger.m52828d("tma_VideoView", "onBufferStart");
            C67432a.m262319a(this.f169125n).getJsBridge().sendMsgToJsCore("onVideoWaiting", new C67587d().mo234783a("videoPlayerId", Integer.valueOf(C65903j.this.f166265a.f166290a)).mo234784a().toString(), C65903j.this.f166267c.getRenderViewId());
        }

        @Override // com.tt.miniapp.video.base.C67084a
        /* renamed from: d */
        public void mo230778d() {
            if (mo233275o()) {
                super.mo230778d();
                C67590h.m263076a(C65903j.this);
                if (C65903j.this.f166266b != null) {
                    if (C65903j.this.f166268d == null) {
                        C65903j jVar = C65903j.this;
                        jVar.f166268d = new C65909b(jVar);
                    }
                    C65909b.m258185a(C65903j.this.f166268d, C65903j.this);
                    C67231a aVar = C65903j.this.f166266b;
                    C65903j jVar2 = C65903j.this;
                    aVar.addView(jVar2, jVar2.f166268d.f166283a);
                    C67231a aVar2 = C65903j.this.f166266b;
                    C65903j jVar3 = C65903j.this;
                    aVar2.mo233799a(jVar3, jVar3.f166268d.f166284b);
                }
            }
        }

        @Override // com.tt.miniapp.video.core.C67093a, com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
        public void onCompletion(TTVideoEngine tTVideoEngine) {
            super.onCompletion(tTVideoEngine);
            C67432a.m262319a(this.f169125n).getJsBridge().sendMsgToJsCore("onVideoEnded", new C67587d().mo234783a("videoPlayerId", Integer.valueOf(C65903j.this.f166265a.f166290a)).mo234783a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C65903j.this.f166265a.f166306q.toString()).mo234784a().toString(), C65903j.this.f166267c.getRenderViewId());
        }

        @Override // com.tt.miniapp.video.core.C67093a, com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
        public void onError(Error error) {
            String str;
            super.onError(error);
            try {
                str = new JSONObject(error.toMap()).toString();
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("tma_VideoView", "video error 2 json failed", e);
                str = "";
            }
            C66020b.m258530a("mp_video_error", this.f169125n).mo231090a("error_msg", str).mo231092a();
            AppBrandLogger.m52829e("tma_VideoView", "ended:给js发消息--onVideoError--: videoPlayerId =", Integer.valueOf(C65903j.this.f166265a.f166290a), "errMsg =", str);
            C67432a.m262319a(this.f169125n).getJsBridge().sendMsgToJsCore("onVideoError", new C67587d().mo234783a("videoPlayerId", Integer.valueOf(C65903j.this.f166265a.f166290a)).mo234783a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C65903j.this.f166265a.f166306q.toString()).mo234783a(ApiHandler.API_CALLBACK_ERRMSG, str).mo234784a().toString(), C65903j.this.f166267c.getRenderViewId());
        }

        public C65908a(IAppContext iAppContext) {
            super(iAppContext);
        }

        /* access modifiers changed from: protected */
        @Override // com.tt.miniapp.video.core.C67093a, com.tt.miniapp.video.base.C67084a
        /* renamed from: a */
        public void mo230774a(int i, int i2) {
            super.mo230774a(i, i2);
            C67432a.m262319a(this.f169125n).getJsBridge().sendMsgToJsCore("onVideoTimeUpdate", new C67587d().mo234783a("videoPlayerId", Integer.valueOf(C65903j.this.f166265a.f166290a)).mo234783a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C65903j.this.f166265a.f166306q.toString()).mo234783a("currentTime", Integer.valueOf(i)).mo234783a("duration", Integer.valueOf(i2)).mo234784a().toString(), C65903j.this.f166267c.getRenderViewId());
        }

        @Override // com.tt.miniapp.video.p3339b.AbstractC67081a, com.tt.miniapp.video.core.C67093a
        /* renamed from: a */
        public void mo230775a(boolean z, int i) {
            String str;
            super.mo230775a(z, i);
            C67587d a = new C67587d().mo234783a("videoPlayerId", Integer.valueOf(C65903j.this.f166265a.f166290a)).mo234783a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C65903j.this.f166265a.f166306q.toString()).mo234783a("fullScreen", Boolean.valueOf(z));
            if (i == 0 || i == 8) {
                str = "horizontal";
            } else {
                str = "vertical";
            }
            C67432a.m262319a(this.f169125n).getJsBridge().sendMsgToJsCore("onVideoFullScreenChange", a.mo234783a(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str).mo234784a().toString(), C65903j.this.f166267c.getRenderViewId());
        }

        @Override // com.tt.miniapp.video.core.C67093a, com.tt.miniapp.video.base.C67084a, com.ss.ttvideoengine.VideoEngineListener
        public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
            super.onPlaybackStateChanged(tTVideoEngine, i);
            if (i == 1) {
                C65903j jVar = C65903j.this;
                jVar.mo230765a(jVar.f166265a.f166290a);
                C67432a.m262319a(this.f169125n).getJsBridge().sendMsgToJsCore("onVideoPlay", new C67587d().mo234783a("videoPlayerId", Integer.valueOf(C65903j.this.f166265a.f166290a)).mo234783a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C65903j.this.f166265a.f166306q.toString()).mo234784a().toString(), C65903j.this.f166267c.getRenderViewId());
            } else if (i == 2) {
                C67432a.m262319a(this.f169125n).getJsBridge().sendMsgToJsCore("onVideoPause", new C67587d().mo234783a("videoPlayerId", Integer.valueOf(C65903j.this.f166265a.f166290a)).mo234783a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, C65903j.this.f166265a.f166306q.toString()).mo234784a().toString(), C65903j.this.f166267c.getRenderViewId());
            }
        }
    }

    /* renamed from: h */
    private void m258160h() {
        ViewGroup viewGroup;
        C67231a aVar = this.f166266b;
        if (aVar != null && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
            viewGroup.removeView(this.f166266b);
            viewGroup.addView(this.f166266b);
            requestLayout();
        }
    }

    @Override // com.tt.frontendapiinterface.IBackPressedListener
    public boolean onBackPressed() {
        C67093a videoController = getVideoController();
        if (videoController == null || !videoController.mo233275o()) {
            return false;
        }
        videoController.mo230778d();
        return true;
    }

    /* renamed from: g */
    private void m258159g() {
        AppBrandLogger.m52828d("tma_VideoView", "release");
        if (getVideoController().mo233275o()) {
            mo233197f();
        }
        getVideoController().mo233270j();
        mo233197f();
        if ((getContext() instanceof Activity) && ((Activity) getContext()).getRequestedOrientation() == 0) {
            ((Activity) getContext()).setRequestedOrientation(1);
        }
    }

    /* renamed from: com.tt.miniapp.component.nativeview.j$c */
    public static class C65910c {

        /* renamed from: A */
        public boolean f166287A = true;

        /* renamed from: B */
        public String f166288B = "contain";

        /* renamed from: C */
        public String f166289C = "center";

        /* renamed from: a */
        public int f166290a;

        /* renamed from: b */
        public boolean f166291b;

        /* renamed from: c */
        public boolean f166292c;

        /* renamed from: d */
        public boolean f166293d;

        /* renamed from: e */
        public String f166294e;

        /* renamed from: f */
        public boolean f166295f;

        /* renamed from: g */
        public boolean f166296g;

        /* renamed from: h */
        public boolean f166297h;

        /* renamed from: i */
        public int f166298i;

        /* renamed from: j */
        public boolean f166299j;

        /* renamed from: k */
        public String f166300k;

        /* renamed from: l */
        public boolean f166301l;

        /* renamed from: m */
        public int f166302m;

        /* renamed from: n */
        public int f166303n;

        /* renamed from: o */
        public int f166304o;

        /* renamed from: p */
        public int f166305p;

        /* renamed from: q */
        public JSONObject f166306q;

        /* renamed from: r */
        public String f166307r;

        /* renamed from: s */
        public int f166308s;

        /* renamed from: t */
        public boolean f166309t;

        /* renamed from: u */
        public boolean f166310u;

        /* renamed from: v */
        public boolean f166311v;

        /* renamed from: w */
        public int f166312w = -1;

        /* renamed from: x */
        public boolean f166313x = true;

        /* renamed from: y */
        public boolean f166314y = true;

        /* renamed from: z */
        public boolean f166315z = true;

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("filePath", this.f166300k);
                jSONObject.put("videoPlayerId", this.f166290a);
                jSONObject.put("hide", this.f166291b);
                jSONObject.put("needEvent", this.f166292c);
                jSONObject.put("autoplay", this.f166293d);
                jSONObject.put("poster", this.f166294e);
                jSONObject.put("controls", this.f166313x);
                jSONObject.put("live", this.f166295f);
                jSONObject.put("muted", this.f166296g);
                jSONObject.put("loop", this.f166299j);
                jSONObject.put("showFullscreenBtn", this.f166314y);
                jSONObject.put("showPlayBtn", this.f166315z);
                jSONObject.put("objectFit", this.f166288B);
                jSONObject.put("playBtnPosition", this.f166289C);
                jSONObject.put("showMuteBtn", this.f166287A);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("top", this.f166302m);
                jSONObject2.put("left", this.f166303n);
                jSONObject2.put("width", this.f166304o);
                jSONObject2.put("height", this.f166305p);
                jSONObject.put("position", jSONObject2);
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_VideoView", "toString", e);
            }
            return jSONObject.toString();
        }

        /* renamed from: a */
        private static C65910c m258186a(String str) {
            JSONObject jSONObject;
            AppBrandLogger.m52830i("tma_VideoView", "standardParseVideoMode");
            C65910c cVar = new C65910c();
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                cVar.f166300k = jSONObject2.optString("filePath");
                cVar.f166291b = jSONObject2.optBoolean("hide");
                cVar.f166292c = jSONObject2.optBoolean("needEvent");
                cVar.f166293d = jSONObject2.optBoolean("autoplay");
                cVar.f166294e = jSONObject2.optString("poster");
                cVar.f166312w = jSONObject2.optInt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, cVar.f166312w);
                cVar.f166313x = jSONObject2.optBoolean("controls", cVar.f166313x);
                cVar.f166295f = jSONObject2.optBoolean("live");
                cVar.f166296g = jSONObject2.optBoolean("muted");
                cVar.f166297h = jSONObject2.optBoolean("autoFullscreen", cVar.f166297h);
                cVar.f166298i = jSONObject2.optInt("initialTime", cVar.f166298i);
                cVar.f166299j = jSONObject2.optBoolean("loop", cVar.f166299j);
                cVar.f166307r = jSONObject2.optString("encrypt_token");
                cVar.f166314y = jSONObject2.optBoolean("showFullscreenBtn", cVar.f166314y);
                cVar.f166315z = jSONObject2.optBoolean("showPlayBtn", cVar.f166315z);
                cVar.f166288B = jSONObject2.optString("objectFit", cVar.f166288B);
                cVar.f166289C = jSONObject2.optString("playBtnPosition", cVar.f166289C);
                cVar.f166287A = jSONObject2.optBoolean("showMuteBtn", cVar.f166287A);
                String optString = jSONObject2.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (TextUtils.isEmpty(optString)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(optString);
                }
                cVar.f166306q = jSONObject;
                JSONObject optJSONObject = jSONObject2.optJSONObject("position");
                if (optJSONObject != null) {
                    cVar.f166301l = true;
                    cVar.f166302m = C67589g.m263062a((double) optJSONObject.optInt("top"));
                    cVar.f166303n = C67589g.m263062a((double) optJSONObject.optInt("left"));
                    int optInt = optJSONObject.optInt("width");
                    cVar.f166304o = optInt;
                    AppBrandLogger.m52828d("tma_VideoView", "videoMode.width = ", Integer.valueOf(optInt));
                    int i = cVar.f166304o;
                    if (i > 0) {
                        cVar.f166304o = C67589g.m263062a((double) i);
                    }
                    int optInt2 = optJSONObject.optInt("height");
                    cVar.f166305p = optInt2;
                    AppBrandLogger.m52828d("tma_VideoView", "videoMode.height = ", Integer.valueOf(optInt2));
                    int i2 = cVar.f166305p;
                    if (i2 > 0) {
                        cVar.f166305p = C67589g.m263062a((double) i2);
                    }
                } else {
                    cVar.f166301l = false;
                }
                if (jSONObject2.has("zIndex")) {
                    cVar.f166309t = true;
                    cVar.f166308s = jSONObject2.optInt("zIndex");
                }
                if (jSONObject2.has("fixed")) {
                    cVar.f166311v = true;
                    cVar.f166310u = jSONObject2.optBoolean("fixed");
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_VideoView", "standardParseVideoMode exception", e);
            }
            return cVar;
        }

        /* renamed from: a */
        public static C65910c m258187a(String str, IAppContext iAppContext) {
            JSONObject jSONObject;
            if (TTFileHelper.m264259a("videoComponent", iAppContext)) {
                return m258186a(str);
            }
            C65910c cVar = new C65910c();
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String optString = jSONObject2.optString("filePath");
                cVar.f166300k = optString;
                if (!TextUtils.isEmpty(optString) && cVar.f166300k.startsWith("ttfile://")) {
                    cVar.f166300k = C67404a.m262266a(iAppContext).mo234082c(cVar.f166300k);
                }
                cVar.f166291b = jSONObject2.optBoolean("hide");
                cVar.f166292c = jSONObject2.optBoolean("needEvent");
                cVar.f166293d = jSONObject2.optBoolean("autoplay");
                cVar.f166294e = jSONObject2.optString("poster");
                cVar.f166312w = jSONObject2.optInt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, cVar.f166312w);
                cVar.f166313x = jSONObject2.optBoolean("controls", cVar.f166313x);
                cVar.f166295f = jSONObject2.optBoolean("live");
                cVar.f166296g = jSONObject2.optBoolean("muted");
                cVar.f166297h = jSONObject2.optBoolean("autoFullscreen", cVar.f166297h);
                cVar.f166298i = jSONObject2.optInt("initialTime", cVar.f166298i);
                cVar.f166299j = jSONObject2.optBoolean("loop", cVar.f166299j);
                cVar.f166307r = jSONObject2.optString("encrypt_token");
                cVar.f166314y = jSONObject2.optBoolean("showFullscreenBtn", cVar.f166314y);
                cVar.f166315z = jSONObject2.optBoolean("showPlayBtn", cVar.f166315z);
                cVar.f166288B = jSONObject2.optString("objectFit", cVar.f166288B);
                cVar.f166289C = jSONObject2.optString("playBtnPosition", cVar.f166289C);
                cVar.f166287A = jSONObject2.optBoolean("showMuteBtn", cVar.f166287A);
                String optString2 = jSONObject2.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (TextUtils.isEmpty(optString2)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(optString2);
                }
                cVar.f166306q = jSONObject;
                JSONObject optJSONObject = jSONObject2.optJSONObject("position");
                if (optJSONObject != null) {
                    cVar.f166301l = true;
                    cVar.f166302m = C67589g.m263062a((double) optJSONObject.optInt("top"));
                    cVar.f166303n = C67589g.m263062a((double) optJSONObject.optInt("left"));
                    int optInt = optJSONObject.optInt("width");
                    cVar.f166304o = optInt;
                    AppBrandLogger.m52828d("tma_VideoView", "videoMode.width = ", Integer.valueOf(optInt));
                    int i = cVar.f166304o;
                    if (i > 0) {
                        cVar.f166304o = C67589g.m263062a((double) i);
                    }
                    int optInt2 = optJSONObject.optInt("height");
                    cVar.f166305p = optInt2;
                    AppBrandLogger.m52828d("tma_VideoView", "videoMode.height = ", Integer.valueOf(optInt2));
                    int i2 = cVar.f166305p;
                    if (i2 > 0) {
                        cVar.f166305p = C67589g.m263062a((double) i2);
                    }
                } else {
                    cVar.f166301l = false;
                }
                if (jSONObject2.has("zIndex")) {
                    cVar.f166309t = true;
                    cVar.f166308s = jSONObject2.optInt("zIndex");
                }
                if (jSONObject2.has("fixed")) {
                    cVar.f166311v = true;
                    cVar.f166310u = jSONObject2.optBoolean("fixed");
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_VideoView", "parseVideoMode exception", e);
            }
            return cVar;
        }
    }

    /* renamed from: a */
    public boolean mo230768a() {
        Rect rect = new Rect(0, 0, C67043j.m261275b(getContext()), C67043j.m261267a(getContext()));
        getLocationInWindow(new int[2]);
        return getLocalVisibleRect(rect);
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    public void setAppContext(IAppContext iAppContext) {
        this.f166273j = iAppContext;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.TTVideoView
    /* renamed from: a */
    public C67093a mo230764a(IAppContext iAppContext) {
        return new C65908a(iAppContext);
    }

    /* renamed from: com.tt.miniapp.component.nativeview.j$b */
    private static class C65909b {

        /* renamed from: a */
        public C67231a.C67234b f166283a;

        /* renamed from: b */
        public C67231a.C67235c f166284b;

        /* renamed from: c */
        private int f166285c;

        /* renamed from: d */
        private int f166286d;

        public C65909b(C65903j jVar) {
            if (jVar != null) {
                this.f166283a = (C67231a.C67234b) jVar.getLayoutParams();
            }
        }

        /* renamed from: a */
        public static C65909b m258184a(C65903j jVar) {
            if (jVar == null) {
                return null;
            }
            C65909b bVar = new C65909b(jVar);
            if (jVar.f166266b != null) {
                C67231a aVar = jVar.f166266b;
                bVar.f166284b = aVar.mo233801b(jVar.getId());
                bVar.f166285c = aVar.getCurScrollX();
                bVar.f166286d = aVar.getCurScrollY();
            }
            return bVar;
        }

        /* renamed from: a */
        public static void m258185a(C65909b bVar, C65903j jVar) {
            if (bVar != null && jVar != null && jVar.f166266b != null && !jVar.f166266b.mo233800a()) {
                int curScrollX = jVar.f166266b.getCurScrollX() - bVar.f166285c;
                int curScrollY = jVar.f166266b.getCurScrollY() - bVar.f166286d;
                bVar.f166283a.f169721a -= curScrollX;
                bVar.f166283a.f169722b -= curScrollY;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo230765a(int i) {
        C67093a valueAt;
        if (i != -1) {
            int size = f166264g.size();
            for (int i2 = 0; i2 < size; i2++) {
                SparseArray<C67093a> sparseArray = f166264g;
                if (!(sparseArray.keyAt(i2) == i || (valueAt = sparseArray.valueAt(i2)) == null)) {
                    valueAt.mo233255a(new C67102b(108));
                    valueAt.mo233270j();
                }
            }
        }
    }

    /* renamed from: b */
    private void m258158b(C65910c cVar) {
        AppBrandLogger.m52830i("tma_VideoView", "standardPlayVideo");
        String str = cVar.f166300k;
        if (!TextUtils.isEmpty(str)) {
            try {
                TTFile gVar = new TTFile(str);
                if (gVar.mo235649c()) {
                    File i = ((AbstractC67722a) this.f166273j.findServiceByInterface(AbstractC67722a.class)).mo235635i(gVar, new TTFileContext(null, "videoComponent"));
                    if (i != null) {
                        str = i.getPath();
                    } else {
                        AppBrandLogger.m52830i("tma_VideoView", "getSystemFile return null");
                    }
                }
            } catch (TTFileException e) {
                AppBrandLogger.m52829e("tma_VideoView", "getSystemFile failed", e);
            }
        }
        mo233188a(new ITTVideoController.C67083a().mo233232c(str).mo233231b(cVar.f166293d).mo233225a(cVar.f166294e).mo233230b(cVar.f166307r).mo233235d(cVar.f166296g).mo233229b(cVar.f166312w).mo233224a(cVar.f166298i).mo233226a(cVar.f166297h).mo233233c(cVar.f166299j));
    }

    /* renamed from: a */
    public void mo230767a(C65910c cVar) {
        if (TTFileHelper.m264259a("videoComponent", this.f166273j)) {
            m258158b(cVar);
            return;
        }
        String str = cVar.f166300k;
        if (!TextUtils.isEmpty(str) && str.startsWith("ttfile")) {
            str = C67404a.m262266a(this.f166273j).mo234079b(str);
        }
        mo233188a(new ITTVideoController.C67083a().mo233232c(str).mo233231b(cVar.f166293d).mo233225a(cVar.f166294e).mo233230b(cVar.f166307r).mo233235d(cVar.f166296g).mo233229b(cVar.f166312w).mo233224a(cVar.f166298i).mo233226a(cVar.f166297h).mo233233c(cVar.f166299j));
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48876a(int i, WebEventCallback webEventCallback) {
        f166264g.delete(i);
        m258159g();
        AbstractC66179g gVar = this.f166274k;
        if (gVar != null) {
            this.f166267c.unregisterPageLife(gVar);
        }
        if (this.f166272i != null) {
            getViewTreeObserver().removeOnScrollChangedListener(this.f166272i);
        }
        this.f166267c.unregisterBackPressedListener(this);
    }

    @Override // com.tt.miniapp.view.C67160b.AbstractC67162a
    /* renamed from: a */
    public void mo230766a(View view, boolean z) {
        AppBrandLogger.m52828d("tma_VideoView", "onScreenVisibilityChanged isShow", Boolean.valueOf(z));
        C67093a videoController = getVideoController();
        if (videoController != null && !videoController.mo233275o()) {
            if (z) {
                videoController.mo233294A();
            } else {
                videoController.mo233295B();
            }
        }
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: b */
    public void mo48878b(String str, WebEventCallback webEventCallback) {
        AppBrandLogger.m52830i("tma_VideoView", "addView position ", " width ", Integer.valueOf(this.f166265a.f166304o), " height ", Integer.valueOf(this.f166265a.f166305p), " x ", Integer.valueOf(this.f166265a.f166303n), " y ", Integer.valueOf(this.f166265a.f166302m));
        this.f166267c.registerBackPressedListener(this);
        mo233192b(this.f166273j);
        int i = this.f166265a.f166303n;
        int i2 = this.f166265a.f166302m;
        if (!this.f166265a.f166310u) {
            i -= this.f166266b.getCurScrollX();
            i2 -= this.f166266b.getCurScrollY();
        }
        this.f166266b.addView(this, new C67231a.C67234b(this.f166265a.f166304o, this.f166265a.f166305p, i, i2));
        m258160h();
        C659052 r0 = new AbstractC66179g() {
            /* class com.tt.miniapp.component.nativeview.C65903j.C659052 */

            /* renamed from: a */
            public Runnable f166276a;

            /* renamed from: b */
            public Runnable f166277b;

            /* renamed from: d */
            private boolean f166279d;

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: a */
            public void mo48892a() {
                AppBrandLogger.m52828d("tma_VideoView", "onStart");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: g */
            public void mo48900g() {
                AppBrandLogger.m52830i("tma_VideoView", "onDestroyView");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: d */
            public void mo48897d() {
                AppBrandLogger.m52830i("tma_VideoView", "onStop");
                C65903j.this.getVideoController().mo233270j();
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: b */
            public void mo48894b() {
                AppBrandLogger.m52830i("tma_VideoView", "onEnterBackground");
                if (C65903j.this.getVideoController() != null) {
                    this.f166279d = C65903j.this.getVideoController().mo233272l();
                    C65903j.this.getVideoController().mo233268h();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: c */
            public void mo48896c() {
                AppBrandLogger.m52830i("tma_VideoView", "onRecoverForeground");
                C65903j.this.getVideoController().mo233282v();
                if (C65903j.this.getVideoController() != null && this.f166279d) {
                    C65903j.this.getVideoController().mo233267g();
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: e */
            public void mo48898e() {
                AppBrandLogger.m52830i("tma_VideoView", "onResume");
                if (C65903j.this.getVideoController() != null && this.f166279d) {
                    RunnableC659061 r0 = new Runnable() {
                        /* class com.tt.miniapp.component.nativeview.C65903j.C659052.RunnableC659061 */

                        public void run() {
                            C65903j.this.getVideoController().mo233267g();
                            C659052.this.f166276a = null;
                            if (C659052.this.f166277b != null) {
                                C65903j.this.removeCallbacks(C659052.this.f166277b);
                                C659052.this.f166277b = null;
                            }
                        }
                    };
                    this.f166276a = r0;
                    C65903j.this.postDelayed(r0, 100);
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: f */
            public void mo48899f() {
                AppBrandLogger.m52830i("tma_VideoView", "onPause");
                Runnable runnable = this.f166276a;
                if (runnable != null) {
                    C65903j.this.removeCallbacks(runnable);
                    this.f166276a = null;
                } else if (C65903j.this.getVideoController() != null) {
                    boolean l = C65903j.this.getVideoController().mo233272l();
                    this.f166279d = l;
                    if (l) {
                        RunnableC659072 r0 = new Runnable() {
                            /* class com.tt.miniapp.component.nativeview.C65903j.C659052.RunnableC659072 */

                            public void run() {
                                C65903j.this.getVideoController().mo233268h();
                                C659052.this.f166277b = null;
                            }
                        };
                        this.f166277b = r0;
                        C65903j.this.postDelayed(r0, 300);
                    }
                }
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: b */
            public void mo48895b(Bundle bundle) {
                AppBrandLogger.m52830i("tma_VideoView", "onSaveInstanceState");
            }

            @Override // com.tt.miniapp.AbstractC66179g
            /* renamed from: a */
            public void mo48893a(Bundle bundle) {
                AppBrandLogger.m52830i("tma_VideoView", "onCreateView");
            }
        };
        this.f166274k = r0;
        this.f166267c.registerPageLife(r0);
        f166264g.put(this.f166265a.f166290a, getVideoController());
        mo48877a(str, webEventCallback);
    }

    @Override // com.tt.miniapp.component.nativeview.AbstractC65886f
    /* renamed from: a */
    public void mo48877a(String str, WebEventCallback webEventCallback) {
        boolean z;
        C65910c a = C65910c.m258187a(str, this.f166273j);
        a.f166290a = this.f166265a.f166290a;
        int i = a.f166304o;
        int i2 = this.f166269e;
        if (i > i2) {
            a.f166304o = i2;
        }
        int i3 = a.f166305p;
        int i4 = this.f166270f;
        if (i3 > i4) {
            a.f166305p = i4;
        }
        AppBrandLogger.m52830i("tma_VideoView", "updateView, hasPosition: ", Boolean.valueOf(a.f166301l), ", hide: ", Boolean.valueOf(a.f166291b), ", filePath: ", a.f166300k);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C67231a.C67234b) {
            C67231a.C67234b bVar = (C67231a.C67234b) layoutParams;
            if (a.f166301l) {
                int i5 = a.f166303n;
                int i6 = a.f166302m;
                if (!a.f166310u) {
                    i5 -= this.f166266b.getCurScrollX();
                    i6 -= this.f166266b.getCurScrollY();
                }
                bVar.height = a.f166305p;
                bVar.width = a.f166304o;
                bVar.f169721a = i5;
                bVar.f169722b = i6;
                z = true;
            } else {
                z = false;
            }
            if (a.f166311v) {
                bVar.f169724d = a.f166310u;
            }
            if (a.f166309t) {
                bVar.f169723c = a.f166308s;
                z = true;
            }
            if (z) {
                requestLayout();
            }
        }
        boolean z2 = !TextUtils.isEmpty(getVideoController().mo233266f());
        boolean z3 = !TextUtils.isEmpty(a.f166307r);
        if (!z2 && z3 && !getVideoController().mo233274n()) {
            getVideoController().mo233270j();
            mo230767a(a);
        }
        if (!a.f166291b) {
            mo233187a(new ITTVideoController.ShowStateEntity().mo233207c(a.f166313x).mo233203a(a.f166299j).mo233205b(a.f166296g).mo233201a(a.f166298i).mo233209d(a.f166314y).mo233212e(a.f166315z).mo233204b(a.f166289C).mo233214f(a.f166287A).mo233202a(a.f166288B));
            setVisibility(0);
            if (!TextUtils.isEmpty(a.f166300k)) {
                this.f166271h = a.f166300k;
                mo230767a(a);
            }
            if (!getVideoController().mo233273m()) {
                Bundle bundle = new Bundle();
                bundle.putString("poster", a.f166294e);
                mo233189a(new C67102b(208, bundle));
            }
            C67102b bVar2 = new C67102b(108);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("duration", 0);
            bVar2.mo233319a(bundle2);
            mo233189a(bVar2);
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("muted", a.f166296g);
            mo233189a(new C67102b(SmEvents.EVENT_TO, bundle3));
        } else if (getVisibility() == 0) {
            setVisibility(8);
            mo233193c();
        }
    }

    public C65903j(C67231a aVar, RenderViewManager.IRender iRender, C65910c cVar) {
        super(aVar.getContext());
        this.f166265a = cVar;
        this.f166266b = aVar;
        this.f166267c = iRender;
        int i = this.f166265a.f166304o;
        int i2 = this.f166269e;
        if (i > i2) {
            this.f166265a.f166304o = i2;
        }
        int i3 = this.f166265a.f166305p;
        int i4 = this.f166270f;
        if (i3 > i4) {
            this.f166265a.f166305p = i4;
        }
        this.f166272i = new ViewTreeObserver.OnScrollChangedListener() {
            /* class com.tt.miniapp.component.nativeview.C65903j.ViewTreeObserver$OnScrollChangedListenerC659041 */

            public void onScrollChanged() {
                if (!C65903j.this.mo230768a() && C65903j.this.getVideoController().mo233272l()) {
                    C65903j.this.mo233193c();
                }
            }
        };
        getViewTreeObserver().addOnScrollChangedListener(this.f166272i);
        setClickable(true);
    }
}
