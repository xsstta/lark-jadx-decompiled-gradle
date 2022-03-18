package com.tt.miniapp.view.webcore;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkwebview.service.AbstractC13471f;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.IKeyBoardStateChange;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.AbstractC65853c;
import com.tt.miniapp.component.nativeview.C65887g;
import com.tt.miniapp.component.nativeview.InputBean;
import com.tt.miniapp.component.nativeview.p3270b.C65852b;
import com.tt.miniapp.component.nativeview.p3271c.C65854a;
import com.tt.miniapp.component.nativeview.p3271c.C65868b;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.render.C66721a;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.view.refresh.SwipeToLoadLayout;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.p3351c.AbstractC67254c;
import com.tt.miniapp.view.webcore.p3351c.AbstractC67256e;
import com.tt.miniapp.view.webcore.p3351c.C67255d;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.util.C67590h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.view.webcore.d */
public class C67257d extends AbstractC67261e implements IKeyBoardStateChange, AbstractC67256e, AbstractC67477a {

    /* renamed from: A */
    private AbstractC67254c f169754A;

    /* renamed from: B */
    private int f169755B;

    /* renamed from: C */
    private AppbrandFragment f169756C;

    /* renamed from: a */
    public int f169757a;

    /* renamed from: b */
    public int f169758b;

    /* renamed from: c */
    public C67231a f169759c;

    /* renamed from: d */
    public C67231a f169760d;

    /* renamed from: e */
    public LinearLayout f169761e;

    /* renamed from: f */
    public int f169762f;

    /* renamed from: g */
    public int f169763g;

    /* renamed from: h */
    public AbstractC67282j.AbstractC67284b f169764h;

    /* renamed from: i */
    public int f169765i;

    /* renamed from: t */
    private C67279h f169766t;

    /* renamed from: u */
    private C67279h f169767u;

    /* renamed from: v */
    private Button f169768v;

    /* renamed from: w */
    private int f169769w;

    /* renamed from: x */
    private boolean f169770x;

    /* renamed from: y */
    private int f169771y;

    /* renamed from: z */
    private SwipeRefreshTargetDelegate f169772z;

    public C67231a getAbsoluteLayout() {
        return this.f169759c;
    }

    public C67231a getBackAbsoluteLayout() {
        return this.f169760d;
    }

    public LinearLayout getConfirmHolder() {
        return this.f169761e;
    }

    public AppbrandFragment getFragment() {
        return this.f169756C;
    }

    public int getKeyboardHeight() {
        return this.f169769w;
    }

    public View getOffsetTargetView() {
        return this.f169772z;
    }

    public AbstractC67254c getScroller() {
        return this.f169754A;
    }

    public boolean getShowConfirmBar() {
        return this.f169770x;
    }

    public WebViewWrapper getWebView() {
        return this.f169779j;
    }

    public Button getmConfirmTV() {
        return this.f169768v;
    }

    /* renamed from: a */
    public boolean mo233866a() {
        if (this.f169757a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m262090g() {
        this.f169768v.setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.view.webcore.C67257d.View$OnClickListenerC672603 */

            public void onClick(View view) {
                int i;
                InputBean currentInputValue = C67257d.this.f169782m.getNativeViewManager().getCurrentInputValue();
                if (!(currentInputValue == null || (i = currentInputValue.inputId) == -1)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("inputId", i);
                        jSONObject.put("value", currentInputValue.value);
                        jSONObject.put("cursor", currentInputValue.cursor);
                        jSONObject.put("srollTop", currentInputValue.scrollTop);
                        AppBrandLogger.m52828d("testConfirm", Integer.valueOf(i), ",", currentInputValue.value, ",", Integer.valueOf(currentInputValue.cursor));
                        AppbrandApplicationImpl.getInst(C67257d.this.f169786q).getRenderViewManager().publish(C67257d.this.f169782m.getRenderViewId(), "onKeyboardConfirm", jSONObject.toString());
                    } catch (JSONException e) {
                        AppBrandLogger.stacktrace(6, "tma_NativeNestWebView", e.getStackTrace());
                    }
                }
                C67047m.m261304a(C67257d.this.f169786q.getCurrentActivity());
            }
        });
    }

    @Override // com.tt.miniapp.view.webcore.AbstractC67261e
    /* renamed from: b */
    public RenderViewManager.IRender mo233868b() {
        AppbrandFragment appbrandFragment = new AppbrandFragment(new C66721a(this), this.f169786q);
        this.f169756C = appbrandFragment;
        return appbrandFragment;
    }

    public C67231a getAvailableLayout() {
        if (this.f169782m.isRenderInBrowserEnabled()) {
            return this.f169760d;
        }
        return this.f169759c;
    }

    /* renamed from: h */
    private void m262091h() {
        Point point = new Point();
        this.f169786q.getCurrentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.f169763g = point.y;
    }

    /* renamed from: i */
    private void m262092i() {
        Point point = new Point();
        this.f169786q.getCurrentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.f169762f = point.y;
    }

    /* renamed from: j */
    private void m262093j() {
        if (this.f169772z == null) {
            ViewParent parent = getParent();
            if (parent instanceof SwipeRefreshTargetDelegate) {
                this.f169772z = (SwipeRefreshTargetDelegate) parent;
            }
        }
    }

    @Override // com.tt.miniapp.view.webcore.p3351c.AbstractC67256e
    /* renamed from: c */
    public void mo233859c() {
        this.f169771y = this.f169772z.getBottom();
    }

    @Override // com.tt.miniapphost.p3370d.AbstractC67477a
    public void onLanguageChange() {
        this.f169768v.setText(getContext().getString(R.string.microapp_m_done));
    }

    @Override // com.tt.miniapp.IKeyBoardStateChange, com.tt.miniapp.view.webcore.p3351c.AbstractC67256e
    public void onKeyboardHide() {
        m262093j();
        if (this.f169772z != null) {
            m262088a(false);
            if (this.f169772z.getBottom() == this.f169771y) {
                this.f169754A.mo233851a();
            } else {
                m262089c(this.f169754A.mo233851a());
            }
        }
    }

    private void setKeyboardHeight(int i) {
        this.f169769w = i;
    }

    public void setScrollListener(AbstractC67282j.AbstractC67284b bVar) {
        this.f169764h = bVar;
    }

    public boolean canScrollVertically(int i) {
        return mo233866a();
    }

    public void setShowConfirmBar(Boolean bool) {
        this.f169770x = bool.booleanValue();
    }

    /* renamed from: c */
    private void m262089c(int i) {
        m262093j();
        SwipeRefreshTargetDelegate swipeRefreshTargetDelegate = this.f169772z;
        if (swipeRefreshTargetDelegate != null) {
            swipeRefreshTargetDelegate.offsetTopAndBottom(i);
        }
    }

    /* renamed from: a */
    private void m262088a(boolean z) {
        int i;
        m262093j();
        SwipeRefreshTargetDelegate swipeRefreshTargetDelegate = this.f169772z;
        if (swipeRefreshTargetDelegate != null) {
            ViewParent parent = swipeRefreshTargetDelegate.getParent();
            if (parent instanceof SwipeToLoadLayout) {
                if (z) {
                    i = this.f169772z.getTop();
                } else {
                    i = 0;
                }
                ((SwipeToLoadLayout) parent).mo233655a(i);
            }
        }
    }

    /* renamed from: b */
    public int mo233867b(int i) {
        Point point = new Point();
        this.f169786q.getCurrentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        int i2 = point.y - i;
        this.f169762f = point.y;
        return i2;
    }

    /* renamed from: a */
    public int mo233861a(int i) {
        Point point = new Point();
        this.f169786q.getCurrentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        return point.y - i;
    }

    public void setConfirmBar(int i) {
        C67231a.C67234b bVar = new C67231a.C67234b(-1, -2, 0, i);
        this.f169759c.addView(this.f169761e, bVar);
        bVar.height = this.f169765i;
        this.f169768v.setText(getContext().getString(R.string.microapp_m_done));
        this.f169768v.setBackground(null);
        this.f169768v.bringToFront();
        this.f169768v.setGravity(16);
        this.f169768v.setTextColor(Color.rgb(76, 70, 68));
        this.f169768v.setTextSize(20.0f);
        this.f169761e.setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        this.f169768v.setPadding(10, 10, 20, 20);
        layoutParams.gravity = SmEvents.EVENT_NE_RR;
        this.f169761e.addView(this.f169768v, layoutParams);
        this.f169761e.setBackground(getResources().getDrawable(R.drawable.microapp_m_confirmbar_boder));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f169782m.getNativeViewManager().getFocusedInput() != null) {
            if (motionEvent.getAction() == 0) {
                this.f169755B = (int) motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                if (Math.abs(this.f169755B - ((int) motionEvent.getY())) > 50) {
                    AppBrandLogger.m52830i("tma_NativeNestWebView", "FocusInput move, remove native view");
                    C67047m.m261304a(this.f169786q.getCurrentActivity());
                }
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (!dispatchTouchEvent) {
            if (action == 0 && this.f169779j.mo233957e()) {
                return true;
            }
            this.f169779j.mo233948a().dispatchTouchEvent(motionEvent);
        } else if (action == 0 && !this.f169779j.mo233957e()) {
            View findViewWithCoordinates = this.f169782m.getNativeViewManager().findViewWithCoordinates(motionEvent.getX(), motionEvent.getY());
            AppBrandLogger.m52830i("tma_NativeNestWebView", "touchTargetView: " + findViewWithCoordinates);
            if (!(findViewWithCoordinates instanceof AbstractC65853c) && !(findViewWithCoordinates instanceof C65887g)) {
                this.f169779j.mo233948a().dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.view.webcore.AbstractC67261e
    /* renamed from: a */
    public void mo233865a(Context context) {
        super.mo233865a(context);
        this.f169779j.mo233948a().setFocusableInTouchMode(true);
        this.f169779j.mo233950a(new AbstractC67282j.AbstractC67284b() {
            /* class com.tt.miniapp.view.webcore.C67257d.C672581 */

            @Override // com.tt.miniapp.view.webcore.AbstractC67282j.AbstractC67284b
            /* renamed from: a */
            public void mo232559a(int i, int i2, int i3, int i4) {
                C67257d.this.f169758b = i;
                C67257d.this.f169757a = i2;
                C67257d.this.f169759c.mo233797a(i, i2, i3, i4);
                if (C67257d.this.f169764h != null) {
                    C67257d.this.f169764h.mo232559a(i, i2, i3, i4);
                }
            }
        });
        if (this.f169766t == null) {
            C67279h hVar = new C67279h(getContext());
            this.f169766t = hVar;
            hVar.setVerticalScrollBarEnabled(false);
            addView(this.f169766t, new FrameLayout.LayoutParams(-1, -1));
            this.f169759c = new C67231a(getContext(), this.f169779j, 0, this.f169786q);
            this.f169766t.addView(this.f169759c, new ViewGroup.LayoutParams(-1, -2));
        }
        if (this.f169767u == null) {
            if (!getWebView().mo233955c() || !(getWebView().mo233948a() instanceof C67268f)) {
                C67279h hVar2 = new C67279h(getContext());
                this.f169767u = hVar2;
                hVar2.setVerticalScrollBarEnabled(false);
                addView(this.f169767u, 0, new FrameLayout.LayoutParams(-1, -1));
                this.f169760d = new C67231a(getContext(), this.f169779j, 1, this.f169786q);
                this.f169767u.addView(this.f169760d, new ViewGroup.LayoutParams(-1, -2));
            } else {
                this.f169760d = new C67231a(getContext(), this.f169779j, 1, this.f169786q);
                ((AbstractC13471f) ((C67268f) getWebView().mo233948a()).getServiceManager().mo49931b(AbstractC13471f.class)).mo49910a().addPluginFactory(new C65852b(this.f169760d));
            }
        }
        this.f169759c.setOppositeAbsoluteLayout(this.f169760d);
        this.f169760d.setOppositeAbsoluteLayout(this.f169759c);
        if (this.f169754A == null) {
            AbstractC67254c a = C67255d.m262085a(context);
            this.f169754A = a;
            a.mo233856a(this);
        }
    }

    /* renamed from: a */
    public void mo233862a(int i, int i2) {
        if (this.f169779j != null) {
            this.f169779j.mo233948a().scrollBy(i, i2);
        }
    }

    C67257d(Context context, IAppContext iAppContext) {
        super(context, iAppContext);
        this.f169765i = (int) C67590h.m263065a(context, 50.0f);
        this.f169766t.setRender(this.f169782m);
        if (!getWebView().mo233955c()) {
            this.f169767u.setRender(this.f169782m);
        }
    }

    /* renamed from: a */
    public static C67257d m262087a(Context context, IAppContext iAppContext) {
        LarkInnerEventHelper.mpWebViewLoadStart(HostDependManager.getInst().isTTWebView(), HostDependManager.getInst().getTTWebViewVersion(), iAppContext);
        C67257d dVar = new C67257d(context, iAppContext);
        AppBrandLogger.m52830i("tma_NativeNestWebView", "preload, init webView done");
        LarkInnerEventHelper.mpWebViewLoadResult("success", null, 0, null, null, iAppContext);
        return dVar;
    }

    /* renamed from: a */
    public void mo233863a(int i, View view) {
        AppBrandLogger.m52829e("tma_NativeNestWebView", "smoothOffsetTopAndBottom:" + i);
        if (!(view instanceof AbstractC65853c) || ((AbstractC65853c) view).mo230588a()) {
            m262089c(i);
            AppBrandLogger.m52829e("Textarea", "this.getTop():" + this.f169772z.getTop());
            m262088a(true);
            if (view instanceof C65868b) {
                ((C65868b) view).mo230640a(i);
            }
            if (view instanceof C65854a) {
                ((C65854a) view).mo230610a(i);
                return;
            }
            return;
        }
        AppBrandLogger.m52830i("tma_NativeNestWebView", "smoothOffsetTopAndBottom: don't adjust position");
    }

    @Override // com.tt.miniapp.IKeyBoardStateChange
    public void onKeyboardShow(int i, int i2) {
        View view;
        AppBrandLogger.m52830i("tma_NativeNestWebView", "onKeyboardShow keyboardHeight ", Integer.valueOf(i), " inputId ", Integer.valueOf(i2));
        m262093j();
        if (this.f169772z != null && (view = this.f169782m.getNativeViewManager().getView(i2)) != null) {
            if (this.f169754A != null) {
                Rect rect = new Rect();
                this.f169766t.getGlobalVisibleRect(rect);
                mo233863a(this.f169754A.mo233853a(view, i, rect), view);
            }
            int titleBarHeight = this.f169782m.getTitleBarHeight();
            int g = C67043j.m261285g(AppbrandContext.getInst().getApplicationContext());
            this.f169770x = false;
            if (this.f169782m != null && TextUtils.equals("textarea", this.f169782m.getNativeViewManager().getViewType()) && this.f169770x) {
                m262092i();
                m262091h();
                setKeyboardHeight(i);
                this.f169761e = new LinearLayout(getContext());
                this.f169768v = new Button(getContext());
                int e = C67590h.m263091e(getContext()) - (((i + g) + titleBarHeight) + this.f169765i);
                this.f169761e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class com.tt.miniapp.view.webcore.C67257d.ViewTreeObserver$OnGlobalLayoutListenerC672592 */

                    public void onGlobalLayout() {
                        if (C67257d.this.f169761e.getLayoutParams() != null) {
                            C67257d dVar = C67257d.this;
                            int b = dVar.mo233867b(dVar.f169762f);
                            C67257d dVar2 = C67257d.this;
                            int a = dVar2.mo233861a(dVar2.f169763g);
                            int keyboardHeight = C67257d.this.getKeyboardHeight();
                            int e = C67590h.m263091e(C67257d.this.getContext()) - ((((keyboardHeight + C67043j.m261285g(AppbrandContext.getInst().getApplicationContext())) + C67257d.this.f169782m.getTitleBarHeight()) + C67257d.this.f169765i) - a);
                            if (b != 0) {
                                C67257d.this.f169761e.removeAllViews();
                                C67257d.this.f169759c.removeView(C67257d.this.f169761e);
                                C67257d.this.setConfirmBar(e);
                            }
                        }
                    }
                });
                m262090g();
                if (this.f169768v.getLayoutParams() == null) {
                    setConfirmBar(e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo233864a(int i, boolean z, View view) {
        if (z) {
            this.f169754A.mo233855a(i);
            mo233863a(i, view);
        }
    }
}
