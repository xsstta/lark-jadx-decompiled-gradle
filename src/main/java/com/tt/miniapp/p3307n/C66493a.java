package com.tt.miniapp.p3307n;

import android.app.Activity;
import android.app.Application;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IKeyboardObserver;
import com.tt.miniapp.util.C67033g;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.n.a */
public class C66493a extends PopupWindow {

    /* renamed from: a */
    public View f167838a;

    /* renamed from: b */
    public Activity f167839b;

    /* renamed from: c */
    private IKeyboardObserver f167840c;

    /* renamed from: d */
    private View f167841d;

    /* renamed from: e */
    private long f167842e;

    /* renamed from: f */
    private int f167843f;

    /* renamed from: d */
    private int m259860d() {
        return this.f167839b.getResources().getConfiguration().orientation;
    }

    /* renamed from: b */
    public void mo232068b() {
        this.f167840c = null;
        this.f167839b = null;
        dismiss();
    }

    /* renamed from: a */
    public void mo232066a() {
        if (!this.f167839b.isFinishing() && !this.f167839b.isDestroyed() && !isShowing() && this.f167841d.getWindowToken() != null) {
            setBackgroundDrawable(new ColorDrawable(0));
            try {
                showAtLocation(this.f167841d, 0, 0, 0);
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("tma_sample_KeyboardHeightProvider", "start", e);
            }
        }
    }

    /* renamed from: c */
    public void mo232069c() {
        Point point = new Point();
        this.f167839b.getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        this.f167838a.getWindowVisibleDisplayFrame(rect);
        AppBrandLogger.m52828d("tma_sample_KeyboardHeightProvider", "popupView.getHeight() ", Integer.valueOf(this.f167838a.getHeight()), " rect top", Integer.valueOf(rect.top), " rect bottom", Integer.valueOf(rect.bottom), " screenSize.y ", Integer.valueOf(point.y));
        int d = m259860d();
        int i = point.y - rect.bottom;
        if (C67033g.m261251a()) {
            if (i == 0) {
                i = SmEvents.EVENT_NW;
            } else if (Math.abs(i - this.f167843f) < 20) {
                return;
            }
        } else if (C67033g.m261255d(this.f167839b) && HostDependManager.getInst().getFeatureGating("gadget.keyboard.refine")) {
            i += rect.top;
        } else if (Math.abs(i - this.f167843f) < 20) {
            return;
        }
        AppBrandLogger.m52828d("tma_sample_KeyboardHeightProvider", "keyboardHeight ", Integer.valueOf(i), " mLastChangeHeight ", Integer.valueOf(this.f167843f));
        if (this.f167843f != Math.abs(i) || System.currentTimeMillis() - this.f167842e >= 100) {
            this.f167843f = Math.abs(i);
            if (i != 0) {
                if (d == 1) {
                    ContextSingletonInstance.getInstance().fixedKeyboardPortraitHeight = i;
                } else {
                    ContextSingletonInstance.getInstance().fixedKeyboardLandscapeHeight = i;
                }
            }
            if (d != 1) {
                ContextSingletonInstance.getInstance().keyboardLandscapeHeight = i;
                m259859a(ContextSingletonInstance.getInstance().keyboardLandscapeHeight, d);
            } else if (i > point.y / 2) {
                AppBrandLogger.m52829e("tma_sample_KeyboardHeightProvider", "keyboard height exceed half screen size, keyboardHeight: " + i + " screenSize: " + point.y);
                return;
            } else {
                ContextSingletonInstance.getInstance().keyboardPortraitHeight = i;
                m259859a(ContextSingletonInstance.getInstance().keyboardPortraitHeight, d);
            }
            this.f167842e = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo232067a(IKeyboardObserver iKeyboardObserver) {
        this.f167840c = iKeyboardObserver;
    }

    /* renamed from: a */
    public static int m259858a(IAppContext iAppContext) {
        int i = iAppContext.getCurrentActivity().getResources().getConfiguration().orientation;
        if (i == 1) {
            return ContextSingletonInstance.getInstance().keyboardPortraitHeight;
        }
        if (i == 2) {
            return ContextSingletonInstance.getInstance().keyboardLandscapeHeight;
        }
        return 0;
    }

    /* renamed from: a */
    private void m259859a(int i, int i2) {
        IKeyboardObserver iKeyboardObserver = this.f167840c;
        if (iKeyboardObserver != null) {
            iKeyboardObserver.onKeyboardHeightChanged(i, i2);
        }
    }

    public C66493a(Activity activity, IAppContext iAppContext) {
        super(activity);
        Application application;
        this.f167839b = activity;
        try {
            if (activity instanceof MiniappHostBase) {
                application = AppbrandContext.getInst().getApplicationContext();
            } else {
                application = activity;
            }
            View inflate = LayoutInflater.from(application).inflate(R.layout.microapp_m_popupwindow, (ViewGroup) null, false);
            this.f167838a = inflate;
            setContentView(inflate);
        } catch (Throwable th) {
            AppBrandLogger.m52829e("tma_sample_KeyboardHeightProvider", th);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "KeyboardHeightProvider inflator fail ");
                jSONObject.put("throwable", th.toString());
                C67509b.m262587a("mp_start_error", 5000, jSONObject, iAppContext);
                Thread.sleep(200);
                activity.finish();
            } catch (Exception unused) {
                AppBrandLogger.m52829e("tma_sample_KeyboardHeightProvider", th);
            }
        }
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f167841d = activity.findViewById(16908290);
        setWidth(0);
        setHeight(-1);
        View view = this.f167838a;
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.tt.miniapp.p3307n.C66493a.ViewTreeObserver$OnGlobalLayoutListenerC664941 */

                public void onGlobalLayout() {
                    if (C66493a.this.f167838a != null && C66493a.this.f167839b != null) {
                        C66493a.this.mo232069c();
                    }
                }
            });
        }
    }
}
