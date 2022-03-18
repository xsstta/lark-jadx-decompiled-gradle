package com.lynx.tasm;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.devtoolwrapper.C26491c;
import com.lynx.jsbridge.C26507b;
import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxSetModule;
import com.lynx.jsbridge.LynxUIMethodModule;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.AbstractC26617e;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26674h;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26689n;
import com.lynx.tasm.behavior.C26690o;
import com.lynx.tasm.behavior.C26694q;
import com.lynx.tasm.behavior.C26737t;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.p1222b.C26630b;
import com.lynx.tasm.behavior.p1223c.p1224a.AbstractC26638a;
import com.lynx.tasm.behavior.p1223c.p1224a.C26639b;
import com.lynx.tasm.behavior.p1223c.p1224a.C26640c;
import com.lynx.tasm.behavior.p1223c.p1224a.C26644d;
import com.lynx.tasm.behavior.p1223c.p1224a.C26646e;
import com.lynx.tasm.behavior.shadow.AbstractC26702c;
import com.lynx.tasm.behavior.shadow.C26698a;
import com.lynx.tasm.behavior.shadow.C26700b;
import com.lynx.tasm.behavior.shadow.C26709j;
import com.lynx.tasm.behavior.shadow.MeasureMode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.p1227d.C26886a;
import com.lynx.tasm.provider.AbstractC26934b;
import com.lynx.tasm.provider.AbstractC26940g;
import com.lynx.tasm.provider.AbstractC26943j;
import com.lynx.tasm.provider.CanvasProvider;
import com.lynx.tasm.utils.C26959m;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class LynxTemplateRender {
    static boolean sIsFirstRender = true;
    private TemplateData globalProps;
    private boolean mAsyncRender;
    public C26910m mBuilder;
    public final C26931o mClient = new C26931o();
    private Context mContext;
    public C26491c mDevtool;
    private C26737t mEventDispatcher;
    private long mFirstMeasureTime = -1;
    public boolean mFirstScreen = false;
    private C26908k mGroup;
    private boolean mHasDestory;
    private boolean mHasEnvPrepared;
    private boolean mHasPageStart;
    public long mInitEnd;
    public long mInitStart;
    private C26689n mIntersectionObserverManager;
    private AbstractC26684l mLynxContext;
    public C26690o mLynxUIOwner;
    public LynxView mLynxView;
    private LynxModuleManager mModuleManager;
    private long mPageLoadedTime;
    private PaintingContext mPaintingContext;
    private int mPreHeightMeasureSpec;
    private int mPreWidthMeasureSpec;
    private C26694q mShadowNodeOwner;
    private boolean mShouldUpdateViewport = true;
    private List<AbstractC26885d> mStateListeners;
    public TemplateAssembler mTemplateAssembler;
    public C26886a mTheme;
    private ThreadStrategyForRendering mThreadStrategyForRendering;
    private String mUrl;
    private C26709j mViewLayoutTick;
    private boolean mWillContentSizeChange;
    private boolean reload;

    /* access modifiers changed from: package-private */
    public void onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    public void onTouchEvent(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.LynxTemplateRender$c */
    public static class C26538c extends AbstractC26911n {

        /* renamed from: a */
        private long f65622a;

        C26538c() {
        }

        @Override // com.lynx.tasm.AbstractC26911n
        /* renamed from: a */
        public void mo11457a() {
            LLog.m96423b("LynxTemplateRender", "onLoadSuccess time: " + (System.currentTimeMillis() - this.f65622a));
        }

        @Override // com.lynx.tasm.AbstractC26911n
        /* renamed from: b */
        public void mo11461b() {
            LLog.m96423b("LynxTemplateRender", "onFirstScreen time: " + (System.currentTimeMillis() - this.f65622a));
        }

        @Override // com.lynx.tasm.AbstractC26911n
        /* renamed from: d */
        public void mo11463d() {
            LLog.m96423b("LynxTemplateRender", "onPageUpdate time:" + (System.currentTimeMillis() - this.f65622a));
        }

        @Override // com.lynx.tasm.AbstractC26911n
        /* renamed from: a */
        public void mo11460a(String str) {
            this.f65622a = System.currentTimeMillis();
        }
    }

    private boolean checkIfEnvPrepared() {
        return this.mHasEnvPrepared;
    }

    public C26491c getDevTool() {
        return this.mDevtool;
    }

    /* access modifiers changed from: package-private */
    public long getFirstMeasureTime() {
        return this.mFirstMeasureTime;
    }

    public AbstractC26684l getLynxContext() {
        return this.mLynxContext;
    }

    public C26886a getTheme() {
        return this.mTheme;
    }

    public final ThreadStrategyForRendering getThreadStrategyForRendering() {
        return this.mThreadStrategyForRendering;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        destroyNative();
    }

    public UIGroup<UIBody.UIBodyView> getLynxRootUI() {
        return this.mLynxUIOwner.mo94760i();
    }

    public String getTemplateUrl() {
        String str = this.mUrl;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void onEnterBackground() {
        onEnterBackground(true);
    }

    public void onEnterForeground() {
        onEnterForeground(true);
    }

    public void pauseRootLayoutAnimation() {
        this.mLynxUIOwner.mo94714a();
    }

    public void resumeRootLayoutAnimation() {
        this.mLynxUIOwner.mo94744b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.LynxTemplateRender$b */
    public class C26534b implements AbstractC26617e {
        @Override // com.lynx.tasm.base.AbstractC26617e
        /* renamed from: c */
        public void mo94216c() {
            try {
                C26959m.m97969a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.C26534b.RunnableC265373 */

                    public void run() {
                        if (LynxTemplateRender.this.mClient != null) {
                            LynxTemplateRender.this.mClient.mo53710f();
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.lynx.tasm.base.AbstractC26617e
        /* renamed from: a */
        public void mo94214a() {
            LLog.m96425c("LynxTemplateRender", "onFirstScreen");
            LynxTemplateRender.this.mLynxUIOwner.mo94749c();
            try {
                C26959m.m97969a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.C26534b.RunnableC265351 */

                    public void run() {
                        LynxTemplateRender.this.mFirstScreen = true;
                        if (LynxTemplateRender.this.mTemplateAssembler != null) {
                            LynxTemplateRender.this.mTemplateAssembler.mo94318g();
                        }
                        if (LynxTemplateRender.this.mClient != null) {
                            LynxTemplateRender.this.mClient.mo11461b();
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.lynx.tasm.base.AbstractC26617e
        /* renamed from: b */
        public void mo94215b() {
            try {
                LLog.m96425c("LynxTemplateRender", "onPageUpdate");
                C26959m.m97969a(new Runnable() {
                    /* class com.lynx.tasm.LynxTemplateRender.C26534b.RunnableC265362 */

                    public void run() {
                        if (LynxTemplateRender.this.mClient != null) {
                            LynxTemplateRender.this.mClient.mo11463d();
                        }
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private C26534b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.LynxTemplateRender$d */
    public class C26539d implements TemplateAssembler.AbstractC26543a {

        /* renamed from: b */
        private TemplateAssembler f65624b;

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: b */
        public void mo94226b() {
            if (LynxTemplateRender.this.mClient != null) {
                LynxTemplateRender.this.mClient.mo11462c();
            }
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: a */
        public void mo94221a() {
            C26630b.m96516b().mo94594a(LynxTemplateRender.this.mLynxView, (C26630b.AbstractC26634b) null);
            if (LynxTemplateRender.this.mClient != null) {
                LynxTemplateRender.this.dispatchLoadSuccess(this.f65624b.mo94315d());
            }
            if (LynxTemplateRender.this.mDevtool != null) {
                LynxTemplateRender.this.mDevtool.mo93940d();
            }
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: a */
        public void mo94224a(C26886a aVar) {
            if (aVar != null) {
                if (LynxTemplateRender.this.mTheme == null) {
                    LynxTemplateRender.this.mTheme = aVar;
                } else {
                    LynxTemplateRender.this.mTheme.mo95679a(aVar);
                }
            }
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: b */
        public void mo94227b(LynxPerfMetric lynxPerfMetric) {
            if (LynxTemplateRender.this.mClient != null) {
                LynxTemplateRender.this.mClient.mo50245b(lynxPerfMetric);
            }
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: a */
        public void mo94223a(LynxPerfMetric lynxPerfMetric) {
            lynxPerfMetric.setInitTiming(LynxTemplateRender.this.mInitStart, LynxTemplateRender.this.mInitEnd);
            lynxPerfMetric.setIsColdBoot(LynxTemplateRender.sIsFirstRender);
            if (!(LynxTemplateRender.this.mLynxView == null || LynxTemplateRender.this.mLynxView.getLynxUIRoot() == null || LynxTemplateRender.this.mLynxView.getLynxUIRoot().av() == null)) {
                lynxPerfMetric.correctFirstPageLayout(((UIBody.UIBodyView) LynxTemplateRender.this.mLynxView.getLynxUIRoot().av()).getMeaningfulPaintTiming());
            }
            LynxTemplateRender.sIsFirstRender = false;
            if (LynxTemplateRender.this.mClient != null) {
                LynxTemplateRender.this.mClient.mo11458a(lynxPerfMetric);
            }
            LynxTemplateRender.this.mBuilder.f66818g.mo94368a(lynxPerfMetric);
        }

        public C26539d(TemplateAssembler templateAssembler) {
            this.f65624b = templateAssembler;
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: a */
        public void mo94222a(int i, String str) {
            LynxTemplateRender.this.onNativeErrorOccurred(i, str);
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: a */
        public String mo94220a(String str, String str2) {
            AbstractC26943j i = LynxEnv.m96123e().mo94102i();
            if (i != null) {
                if (str2 != null) {
                    try {
                        if (str2.isEmpty()) {
                            str2 = null;
                        }
                    } catch (Throwable th) {
                        LLog.m96423b("LynxTemplateRender", "translateResourceForTheme exception " + th.toString());
                    }
                }
                return i.mo95799a(str, LynxTemplateRender.this.mTheme, str2, LynxTemplateRender.this.mLynxView);
            }
            return null;
        }

        @Override // com.lynx.tasm.TemplateAssembler.AbstractC26543a
        /* renamed from: a */
        public void mo94225a(String str, String str2, int i) {
            if (LynxTemplateRender.this.mClient != null) {
                LynxTemplateRender.this.mClient.mo53709a(str, str2, i);
            }
        }
    }

    public void destroy() {
        destroyNative();
        this.mLynxUIOwner.mo94753d();
        this.mShadowNodeOwner = null;
        this.mLynxContext = null;
    }

    public boolean enableEventThrough() {
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler == null || !templateAssembler.mo94321i()) {
            return false;
        }
        return true;
    }

    public Map<String, Object> getAllJsSource() {
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler != null) {
            return templateAssembler.mo94320h();
        }
        return null;
    }

    public String getPageVersion() {
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler == null) {
            return "";
        }
        return templateAssembler.mo94314c();
    }

    private void requestLayoutWhenSafepointEnable() {
        if (this.mLynxView != null && this.mBuilder.f66816e && getThreadStrategyForRendering() == ThreadStrategyForRendering.PART_ON_LAYOUT) {
            this.mLynxView.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public C26903g getLynxConfigInfo() {
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler == null) {
            return new C26903g("", "", "", "");
        }
        return templateAssembler.mo94322j();
    }

    public void syncFlush() {
        C26959m.m97973b();
        if (this.mAsyncRender) {
            LLog.m96425c("LynxTemplateRender", "syncFlush wait layout finish");
            this.mPaintingContext.flush();
        }
    }

    private void destroyNative() {
        LLog.m96425c("LynxTemplateRender", "destroyNative url " + getTemplateUrl() + " in " + toString());
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler != null) {
            templateAssembler.mo94316e();
            this.mTemplateAssembler = null;
        }
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93928a();
            this.mDevtool = null;
        }
        this.mHasDestory = true;
    }

    /* access modifiers changed from: package-private */
    public void onAttachedToWindow() {
        UIBody i;
        LLog.m96425c("LynxTemplateRender", "lynxview onAttachedToWindow " + toString());
        onEnterForeground(false);
        C26690o oVar = this.mLynxUIOwner;
        if (oVar != null && (i = oVar.mo94760i()) != null) {
            i.an();
        }
    }

    /* access modifiers changed from: package-private */
    public void onDetachedFromWindow() {
        UIBody i;
        LLog.m96425c("LynxTemplateRender", "lynxview onDetachedFromWindow " + toString());
        C26690o oVar = this.mLynxUIOwner;
        if (!(oVar == null || (i = oVar.mo94760i()) == null)) {
            i.T_();
        }
        onEnterBackground(false);
    }

    private void reloadAndInit() {
        if (!this.mHasDestory) {
            if (this.reload) {
                this.mHasPageStart = false;
                if (this.mLynxView != null) {
                    if (C26959m.m97972a()) {
                        this.mLynxView.removeAllViews();
                    } else {
                        C26959m.m97969a(new Runnable() {
                            /* class com.lynx.tasm.LynxTemplateRender.RunnableC265292 */

                            public void run() {
                                LynxTemplateRender.this.mLynxView.removeAllViews();
                            }
                        });
                    }
                }
                PaintingContext paintingContext = this.mPaintingContext;
                if (paintingContext != null) {
                    paintingContext.mo94538a();
                }
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    templateAssembler.mo94316e();
                    this.mTemplateAssembler = null;
                }
                int i = this.mPreWidthMeasureSpec;
                int i2 = this.mPreHeightMeasureSpec;
                this.mPreWidthMeasureSpec = 0;
                this.mPreHeightMeasureSpec = 0;
                this.mLynxUIOwner.mo94762k();
                createTemplateAssembler();
                updateViewport(i, i2);
                return;
            }
            this.reload = true;
        }
    }

    private void createTemplateAssembler() {
        AbstractC26702c cVar;
        AbstractC26702c cVar2;
        AbstractC26638a dVar;
        AbstractC26684l lVar;
        if (checkIfEnvPrepared()) {
            if (this.mThreadStrategyForRendering == ThreadStrategyForRendering.ALL_ON_UI) {
                this.mViewLayoutTick = new C26709j(this.mLynxView);
                dVar = new C26639b(this.mLynxUIOwner);
                cVar2 = this.mViewLayoutTick;
            } else {
                if (Build.VERSION.SDK_INT >= 16) {
                    cVar = new C26698a();
                } else {
                    cVar = new C26700b();
                }
                cVar2 = cVar;
                if (this.mThreadStrategyForRendering == ThreadStrategyForRendering.PART_ON_LAYOUT) {
                    dVar = new C26646e(this.mLynxUIOwner);
                } else if (this.mThreadStrategyForRendering == ThreadStrategyForRendering.MULTI_THREADS) {
                    dVar = new C26640c(this.mLynxUIOwner);
                } else {
                    dVar = new C26644d(this.mLynxUIOwner);
                }
            }
            this.mPaintingContext = new PaintingContext(this.mLynxUIOwner, dVar);
            ExternalSourceLoader externalSourceLoader = null;
            C26694q qVar = new C26694q(this.mLynxContext, this.mBuilder.f66813b, this.mPaintingContext, cVar2, new C26534b());
            this.mShadowNodeOwner = qVar;
            this.mLynxContext.mo94662a(qVar);
            TemplateAssembler templateAssembler = new TemplateAssembler(this.mPaintingContext, this.mShadowNodeOwner, new DynamicComponentLoader(this.mBuilder.f66820i, this), this.mGroup, this.mThreadStrategyForRendering, this.mBuilder.f66816e, this.mBuilder.f66822l);
            this.mTemplateAssembler = templateAssembler;
            this.mLynxContext.mo94657a(new EventEmitter(templateAssembler));
            this.mLynxContext.mo94658a(this.mLynxView);
            this.mLynxContext.mo94667a(new C26888f(this.mTemplateAssembler));
            C26491c cVar3 = this.mDevtool;
            if (cVar3 != null) {
                cVar3.mo93938b(this.mTemplateAssembler.mo94290a());
            }
            this.mTemplateAssembler.mo94301a(this.mLynxContext);
            LynxModuleManager lynxModuleManager = new LynxModuleManager(this.mLynxContext);
            this.mModuleManager = lynxModuleManager;
            lynxModuleManager.mo93960a(this.mBuilder.f66814c);
            this.mModuleManager.mo93959a("IntersectionObserverModule", LynxIntersectionObserverModule.class, null);
            this.mModuleManager.mo93959a("LynxUIMethodModule", LynxUIMethodModule.class, null);
            this.mModuleManager.mo93959a("LynxSetModule", LynxSetModule.class, null);
            AbstractC26940g gVar = this.mBuilder.f66821j.get("ExternalJSSourceProvider");
            TemplateAssembler templateAssembler2 = this.mTemplateAssembler;
            LynxModuleManager lynxModuleManager2 = this.mModuleManager;
            if (gVar != null) {
                externalSourceLoader = new ExternalSourceLoader(gVar, this);
            }
            templateAssembler2.mo94296a(lynxModuleManager2, externalSourceLoader, this.mBuilder.f66823m, this.mBuilder.f66817f);
            this.mLynxContext.mo94666a(this.mTemplateAssembler.mo94309b());
            C26689n nVar = new C26689n(this.mLynxContext, this.mTemplateAssembler.mo94309b());
            this.mIntersectionObserverManager = nVar;
            this.mLynxContext.mo94660a(nVar);
            this.mLynxContext.mo94687i().mo94074a(this.mIntersectionObserverManager);
            C26886a aVar = this.mTheme;
            if (aVar != null) {
                this.mTemplateAssembler.mo94302a(aVar);
            }
            TemplateData templateData = this.globalProps;
            if (templateData != null) {
                this.mTemplateAssembler.mo94297a(templateData);
            }
            C26491c cVar4 = this.mDevtool;
            if (cVar4 != null && (lVar = this.mLynxContext) != null) {
                cVar4.mo93930a(lVar.mo94690l().longValue());
            }
        }
    }

    public void addLStateListener(AbstractC26885d dVar) {
        if (dVar != null) {
            this.mStateListeners.add(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.mEventDispatcher.mo94914a(motionEvent, (UIGroup) null);
    }

    public LynxBaseUI findUIByIdSelector(String str) {
        return this.mLynxUIOwner.mo94741b(str);
    }

    public LynxBaseUI findUIByIndex(int i) {
        return this.mLynxUIOwner.mo94740b(i);
    }

    public LynxBaseUI findUIByName(String str) {
        return this.mLynxUIOwner.mo94711a(str);
    }

    public void onDispatchTouchEvent(MotionEvent motionEvent) {
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93931a(motionEvent);
        }
    }

    public void removeStateListener(AbstractC26885d dVar) {
        if (dVar != null) {
            this.mStateListeners.remove(dVar);
        }
    }

    public void setImageInterceptor(AbstractC26674h hVar) {
        this.mLynxContext.mo94659a(hVar);
    }

    /* access modifiers changed from: package-private */
    public void showErrorMessage(String str) {
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93934a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.LynxTemplateRender$a */
    public class C26533a implements AbstractC26934b.AbstractC26935a {

        /* renamed from: a */
        public TemplateData f65613a;

        /* renamed from: b */
        public String f65614b;

        /* renamed from: c */
        public Map<String, Object> f65615c;

        /* renamed from: e */
        private String f65617e;

        @Override // com.lynx.tasm.provider.AbstractC26934b.AbstractC26935a
        /* renamed from: a */
        public void mo94212a(String str) {
            m96162b("onFailed");
            LynxTemplateRender.this.onErrorOccurred(103, str);
        }

        /* renamed from: b */
        private void m96162b(String str) {
            if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
                throw new IllegalThreadStateException("Callback " + str + "must be fired on main thread.");
            }
        }

        @Override // com.lynx.tasm.provider.AbstractC26934b.AbstractC26935a
        /* renamed from: a */
        public void mo94213a(byte[] bArr) {
            m96162b("onSuccess");
            if (bArr == null || bArr.length == 0) {
                mo94212a("Source is null!");
                return;
            }
            TemplateData templateData = this.f65613a;
            if (templateData != null) {
                LynxTemplateRender.this.renderTemplate(bArr, templateData);
                return;
            }
            Map<String, Object> map = this.f65615c;
            if (map != null) {
                LynxTemplateRender.this.renderTemplate(bArr, map);
                return;
            }
            LynxTemplateRender lynxTemplateRender = LynxTemplateRender.this;
            String str = this.f65614b;
            if (str == null) {
                str = "";
            }
            lynxTemplateRender.renderTemplate(bArr, str);
        }

        public C26533a(String str, TemplateData templateData) {
            this.f65613a = templateData;
            this.f65617e = str;
        }

        public C26533a(String str, String str2) {
            this.f65614b = str2;
            this.f65617e = str;
        }

        public C26533a(String str, Map<String, Object> map) {
            this.f65615c = map;
            this.f65617e = str;
        }
    }

    private void setUrl(String str) {
        this.mUrl = str;
        AbstractC26684l lVar = this.mLynxContext;
        if (lVar != null) {
            lVar.mo94683f(str);
        }
    }

    public void addLynxViewClient(AbstractC26911n nVar) {
        if (nVar != null) {
            this.mClient.mo95771a(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public C26507b getJSModule(String str) {
        AbstractC26684l lVar = this.mLynxContext;
        if (lVar != null) {
            return lVar.mo94673b(str);
        }
        return null;
    }

    public void removeLynxViewClient(AbstractC26911n nVar) {
        C26931o oVar;
        if (nVar != null && (oVar = this.mClient) != null) {
            oVar.mo95772b(nVar);
        }
    }

    /* access modifiers changed from: package-private */
    public View findViewByIdSelector(String str) {
        LynxBaseUI findUIByIdSelector = findUIByIdSelector(str);
        if (findUIByIdSelector instanceof LynxUI) {
            return ((LynxUI) findUIByIdSelector).av();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View findViewByName(String str) {
        LynxBaseUI findUIByName = findUIByName(str);
        if (findUIByName instanceof LynxUI) {
            return ((LynxUI) findUIByName).av();
        }
        return null;
    }

    public void getCurrentData(AbstractC26907j jVar) {
        TemplateAssembler templateAssembler;
        if (!checkIfEnvPrepared() || (templateAssembler = this.mTemplateAssembler) == null) {
            jVar.mo95715a("LynxView Not Initialized Yet");
        } else {
            templateAssembler.mo94303a(jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setGlobalProps(TemplateData templateData) {
        TemplateAssembler templateAssembler;
        if (templateData != null) {
            this.globalProps = templateData;
            if (checkIfEnvPrepared() && (templateAssembler = this.mTemplateAssembler) != null) {
                templateAssembler.mo94297a(this.globalProps);
            }
        }
    }

    private void dispatchOnPageStart(String str) {
        C26931o oVar;
        LLog.m96425c("LynxTemplateRender", "dispatchOnPageStart url " + str + " in " + toString());
        if (!this.mHasPageStart && (oVar = this.mClient) != null) {
            this.mHasPageStart = true;
            oVar.mo11460a(str);
        }
    }

    private void onEnterBackground(boolean z) {
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93939c();
        }
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler != null) {
            templateAssembler.mo94312b(z);
        }
        for (AbstractC26885d dVar : this.mStateListeners) {
            dVar.mo95675b();
        }
    }

    private void onEnterForeground(boolean z) {
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93937b();
        }
        TemplateAssembler templateAssembler = this.mTemplateAssembler;
        if (templateAssembler != null) {
            templateAssembler.mo94305a(z);
        }
        for (AbstractC26885d dVar : this.mStateListeners) {
            dVar.mo95675b();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean attach(LynxView lynxView) {
        if (this.mLynxView != null) {
            LLog.m96427d(LynxKitALogDelegate.f38587a, "already attached " + lynxView.toString());
            return false;
        }
        this.mLynxView = lynxView;
        lynxView.removeAllViews();
        C26709j jVar = this.mViewLayoutTick;
        if (jVar != null) {
            jVar.mo94824a(lynxView);
        }
        this.mLynxUIOwner.mo94738a(lynxView);
        C26491c cVar = this.mDevtool;
        if (cVar == null) {
            return true;
        }
        cVar.mo93932a(lynxView);
        return true;
    }

    public void dispatchLoadSuccess(int i) {
        LLog.m96425c("LynxTemplateRender", "dispatchLoadSuccess templateSize in " + toString());
        C26931o oVar = this.mClient;
        if (oVar != null) {
            oVar.mo11457a();
        }
    }

    /* access modifiers changed from: package-private */
    public void setGlobalProps(Map<String, Object> map) {
        if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
            setGlobalProps(TemplateData.m96225a(map));
        }
    }

    public void setTheme(C26886a aVar) {
        if (aVar != null) {
            C26886a aVar2 = this.mTheme;
            if (aVar2 == null) {
                this.mTheme = aVar;
            } else {
                aVar2.mo95679a(aVar);
            }
            if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
                this.mWillContentSizeChange = true;
                this.mPaintingContext.mo94540b();
                requestLayoutWhenSafepointEnable();
                this.mTemplateAssembler.mo94302a(aVar);
            }
        }
    }

    public void updateData(TemplateData templateData) {
        if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
            if (templateData == null) {
                LLog.m96429e("LynxTemplateRender", "updateData with null TemplateData");
                return;
            }
            templateData.mo94337c();
            if (templateData.mo94334b() == 0) {
                LLog.m96429e("LynxTemplateRender", "updateData with TemplateData after flush is nullptr");
                return;
            }
            C26491c cVar = this.mDevtool;
            if (cVar != null) {
                cVar.mo93933a(templateData);
            }
            this.mWillContentSizeChange = true;
            this.mPaintingContext.mo94540b();
            requestLayoutWhenSafepointEnable();
            this.mTemplateAssembler.mo94311b(templateData);
        }
    }

    private void init(Context context) {
        this.reload = false;
        this.mHasPageStart = false;
        this.mHasDestory = false;
        this.mLynxContext.mo94659a((AbstractC26674h) this.mClient);
        this.mLynxContext.mo94668a((AbstractC26911n) this.mClient);
        C26690o oVar = new C26690o(this.mLynxContext, this.mBuilder.f66813b, this.mLynxView);
        this.mLynxUIOwner = oVar;
        this.mLynxContext.mo94661a(oVar);
        C26737t tVar = new C26737t(this.mLynxUIOwner);
        this.mEventDispatcher = tVar;
        this.mLynxContext.mo94663a(tVar);
        this.mDevtool = new C26491c(this.mLynxView, this);
        createTemplateAssembler();
    }

    private String[] processUrl(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("=|&");
        String str2 = "";
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 < split.length) {
                if (split[i].equalsIgnoreCase("compile_path") || split[i].equalsIgnoreCase("compilePath")) {
                    str = split[i2];
                } else if (split[i].equalsIgnoreCase("post_url") || split[i].equalsIgnoreCase("postUrl")) {
                    str2 = split[i2];
                }
                i += 2;
            } else {
                arrayList.add(str);
                arrayList.add(str2);
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
    }

    public void onErrorOccurred(int i, String str) {
        onErrorOccurred(-3, i, str, null);
    }

    public void onNativeErrorOccurred(int i, String str) {
        onErrorOccurred(-1, i, str, null);
    }

    public void renderTemplateUrl(String str, TemplateData templateData) {
        renderTemplateUrlInternal(str, new C26533a(str, templateData));
    }

    /* access modifiers changed from: package-private */
    public void updateData(String str, String str2) {
        TemplateData a = TemplateData.m96224a(str);
        a.mo94335b(str2);
        a.mo94340f();
        updateData(a);
    }

    /* access modifiers changed from: package-private */
    public void renderTemplateUrl(String str, String str2) {
        renderTemplateUrlInternal(str, new C26533a(str, str2));
    }

    /* access modifiers changed from: package-private */
    public void updateData(Map<String, Object> map, String str) {
        TemplateData a = TemplateData.m96225a(map);
        a.mo94335b(str);
        a.mo94340f();
        updateData(a);
    }

    LynxTemplateRender(Context context, C26909l lVar) {
        init(context, null, lVar);
    }

    private void dispatchError(int i, C26906i iVar) {
        int a = iVar.mo95711a();
        if (a == 100 || a == 103) {
            this.mClient.mo50246c(iVar.mo95712b());
        } else {
            this.mClient.mo50247d(iVar.mo95712b());
        }
        this.mClient.mo11459a(iVar);
        if (a == 201) {
            this.mClient.mo87261c(iVar);
        } else if (i == -1) {
            this.mClient.mo87262d(iVar);
        } else {
            this.mClient.mo87260b(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void renderTemplateUrl(String str, Map<String, Object> map) {
        renderTemplateUrlInternal(str, new C26533a(str, map));
    }

    /* access modifiers changed from: package-private */
    public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
        AbstractC26684l lVar;
        if (!checkIfEnvPrepared() || (lVar = this.mLynxContext) == null) {
            LLog.m96429e("LynxTemplateRender", "sendGlobalEvent error, can't get GlobalEventEmitter in " + toString());
            return;
        }
        lVar.mo94670a(str, javaOnlyArray);
    }

    public void updateScreenMetrics(int i, int i2) {
        if (i != this.mLynxContext.mo94672b().widthPixels || i2 != this.mLynxContext.mo94672b().heightPixels) {
            this.mShouldUpdateViewport = true;
            this.mLynxContext.mo94654a(i, i2);
            this.mTemplateAssembler.mo94310b(i, i2);
            C26491c cVar = this.mDevtool;
            if (cVar != null) {
                cVar.mo93929a(i, i2, this.mLynxContext.mo94672b().density);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateViewport(int i, int i2) {
        if (checkIfEnvPrepared() && this.mTemplateAssembler != null) {
            if (this.mPreWidthMeasureSpec != i || this.mPreHeightMeasureSpec != i2 || this.mShouldUpdateViewport) {
                if (this.mShouldUpdateViewport) {
                    this.mShouldUpdateViewport = false;
                }
                int fromMeasureSpec = MeasureMode.fromMeasureSpec(i);
                int size = View.MeasureSpec.getSize(i);
                int fromMeasureSpec2 = MeasureMode.fromMeasureSpec(i2);
                this.mTemplateAssembler.mo94293a(size, fromMeasureSpec, View.MeasureSpec.getSize(i2), fromMeasureSpec2);
                this.mPreWidthMeasureSpec = i;
                this.mPreHeightMeasureSpec = i2;
            }
        }
    }

    private void renderTemplateUrlInternal(String str, C26533a aVar) {
        if (!checkIfEnvPrepared()) {
            onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
            return;
        }
        String[] processUrl = processUrl(str);
        setUrl(processUrl[0]);
        String str2 = processUrl[1];
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93935a(this.mUrl, str2, aVar.f65613a, aVar.f65615c, aVar.f65614b);
        }
        if (this.mBuilder.f66812a == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("LynxTemplateRender template url is null or TemplateProvider is not init");
        }
        dispatchOnPageStart(this.mUrl);
        this.mBuilder.f66812a.mo53786a(this.mUrl, aVar);
    }

    /* access modifiers changed from: package-private */
    public void renderTemplate(final byte[] bArr, final TemplateData templateData) {
        if (this.mAsyncRender || C26959m.m97972a()) {
            this.mBuilder.f66818g.mo94367a(8);
            if (!checkIfEnvPrepared()) {
                onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                return;
            }
            this.mWillContentSizeChange = true;
            this.mPaintingContext.mo94540b();
            reloadAndInit();
            TemplateAssembler templateAssembler = this.mTemplateAssembler;
            if (templateAssembler != null) {
                templateAssembler.mo94304a(this.mClient);
                dispatchOnPageStart(this.mUrl);
                this.mTemplateAssembler.mo94306a(bArr, templateData, getTemplateUrl(), new C26539d(this.mTemplateAssembler));
            }
            this.mBuilder.f66818g.mo94369b(8);
            return;
        }
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.LynxTemplateRender.RunnableC265314 */

            public void run() {
                LynxTemplateRender.this.renderTemplate(bArr, templateData);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onMeasure(int i, int i2) {
        long j;
        int i3;
        int i4;
        TemplateAssembler templateAssembler;
        this.mBuilder.f66818g.mo94367a(4);
        if (this.mFirstMeasureTime == -1) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        TraceEvent.m96443a("LynxTemplateRender.onMeasure");
        syncFlush();
        updateViewport(i, i2);
        if (this.mThreadStrategyForRendering == ThreadStrategyForRendering.PART_ON_LAYOUT && (templateAssembler = this.mTemplateAssembler) != null && !this.mFirstScreen && this.mWillContentSizeChange) {
            templateAssembler.mo94317f();
            this.mFirstScreen = true;
            this.mWillContentSizeChange = false;
        }
        C26709j jVar = this.mViewLayoutTick;
        if (jVar != null) {
            jVar.mo94823a();
        }
        this.mLynxUIOwner.mo94755e();
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            i3 = this.mLynxUIOwner.mo94758g();
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            i4 = this.mLynxUIOwner.mo94759h();
        } else {
            i4 = View.MeasureSpec.getSize(i2);
        }
        this.mLynxView.innerSetMeasuredDimension(i3, i4);
        TraceEvent.m96444b("LynxTemplateRender.onMeasure");
        this.mBuilder.f66818g.mo94369b(4);
        if (this.mFirstMeasureTime == -1) {
            this.mFirstMeasureTime = System.currentTimeMillis() - j;
        }
    }

    public void renderTemplate(final byte[] bArr, final String str) {
        if (this.mAsyncRender || C26959m.m97972a()) {
            this.mBuilder.f66818g.mo94367a(8);
            if (!checkIfEnvPrepared()) {
                onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                return;
            }
            this.mWillContentSizeChange = true;
            this.mPaintingContext.mo94540b();
            reloadAndInit();
            TemplateAssembler templateAssembler = this.mTemplateAssembler;
            if (templateAssembler != null) {
                templateAssembler.mo94304a(this.mClient);
                dispatchOnPageStart(this.mUrl);
                this.mTemplateAssembler.mo94307a(bArr, str, getTemplateUrl(), new C26539d(this.mTemplateAssembler));
            }
            this.mBuilder.f66818g.mo94369b(8);
            return;
        }
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.LynxTemplateRender.RunnableC265325 */

            public void run() {
                LynxTemplateRender.this.renderTemplate(bArr, str);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void renderTemplate(final byte[] bArr, final Map<String, Object> map) {
        if (this.mAsyncRender || C26959m.m97972a()) {
            this.mBuilder.f66818g.mo94367a(8);
            if (!checkIfEnvPrepared()) {
                onErrorOccurred(100, "LynxEnv has not been prepared successfully!");
                return;
            }
            this.mWillContentSizeChange = true;
            this.mPaintingContext.mo94540b();
            reloadAndInit();
            TemplateAssembler templateAssembler = this.mTemplateAssembler;
            if (templateAssembler != null) {
                templateAssembler.mo94304a(this.mClient);
                dispatchOnPageStart(this.mUrl);
                this.mTemplateAssembler.mo94308a(bArr, map, getTemplateUrl(), new C26539d(this.mTemplateAssembler));
            }
            this.mBuilder.f66818g.mo94369b(8);
            return;
        }
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.LynxTemplateRender.RunnableC265303 */

            public void run() {
                LynxTemplateRender.this.renderTemplate(bArr, map);
            }
        });
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93936a(bArr, templateData, str);
        }
        setUrl(str);
        renderTemplate(bArr, templateData);
    }

    LynxTemplateRender(Context context, LynxView lynxView, C26910m mVar) {
        init(context, lynxView, mVar);
    }

    /* access modifiers changed from: package-private */
    public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93936a(bArr, TemplateData.m96224a(str), str2);
        }
        setUrl(str2);
        renderTemplate(bArr, str);
    }

    /* access modifiers changed from: package-private */
    public void renderTemplateWithBaseUrl(byte[] bArr, Map<String, Object> map, String str) {
        C26491c cVar = this.mDevtool;
        if (cVar != null) {
            cVar.mo93936a(bArr, TemplateData.m96225a(map), str);
        }
        setUrl(str);
        renderTemplate(bArr, map);
    }

    /* access modifiers changed from: package-private */
    public void init(Context context, LynxView lynxView, C26910m mVar) {
        boolean z;
        this.mInitStart = System.currentTimeMillis();
        this.mContext = context;
        this.mLynxView = lynxView;
        this.mGroup = mVar.f66815d;
        ThreadStrategyForRendering threadStrategyForRendering = mVar.f66824n;
        this.mThreadStrategyForRendering = threadStrategyForRendering;
        if (threadStrategyForRendering == ThreadStrategyForRendering.MULTI_THREADS || this.mThreadStrategyForRendering == ThreadStrategyForRendering.MULTI_THREADS_ULTRA) {
            z = true;
        } else {
            z = false;
        }
        this.mAsyncRender = z;
        this.mBuilder = mVar;
        this.mHasEnvPrepared = LynxEnv.m96123e().mo94107n();
        DisplayMetricsHolder.m97902a(context, mVar.f66819h);
        DisplayMetrics a = DisplayMetricsHolder.m97898a();
        if (!(mVar.f66827q == -1 || mVar.f66828r == -1)) {
            a.widthPixels = mVar.f66827q;
            a.heightPixels = mVar.f66828r;
        }
        this.mLynxContext = new AbstractC26684l(context, a) {
            /* class com.lynx.tasm.LynxTemplateRender.C265281 */

            @Override // com.lynx.tasm.behavior.AbstractC26672f, com.lynx.tasm.behavior.AbstractC26684l
            /* renamed from: a */
            public void mo94207a(Exception exc) {
                LynxTemplateRender.this.onErrorOccurred(-3, 601, Log.getStackTraceString(exc), exc);
            }
        };
        init(context);
        updateViewport(mVar.f66825o, mVar.f66826p);
        this.mClient.mo95771a(LynxEnv.m96123e().mo94115t());
        this.mClient.mo95771a(new C26538c());
        CanvasProvider a2 = LynxEnv.m96123e().mo94081a();
        if (a2 != null) {
            a2.mo95204b(context);
        }
        this.mInitEnd = System.currentTimeMillis();
        this.mStateListeners = new ArrayList();
    }

    public void onErrorOccurred(int i, int i2, String str, Throwable th) {
        if (this.mClient != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.mUrl);
                if (th == null) {
                    jSONObject.put("error", str);
                } else {
                    jSONObject.put("throwable", th);
                }
                TemplateAssembler templateAssembler = this.mTemplateAssembler;
                if (templateAssembler != null) {
                    jSONObject.put("card_version", templateAssembler.mo94314c());
                }
                jSONObject.put("sdk", LynxEnv.m96123e().mo94114s());
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            dispatchError(i, new C26906i(jSONObject, i2));
            LLog.m96429e("LynxTemplateRender", "LynxTemplateRender " + toString() + ": onErrorOccurred type " + i + ",errCode:" + i2 + ",detail:" + jSONObject.toString());
        }
        showErrorMessage(str);
    }

    /* access modifiers changed from: package-private */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mBuilder.f66818g.mo94367a(2);
        TraceEvent.m96443a("LynxTemplateRender.onLayout");
        this.mLynxUIOwner.mo94757f();
        TraceEvent.m96444b("LynxTemplateRender.onLayout");
        this.mBuilder.f66818g.mo94369b(2);
    }
}
