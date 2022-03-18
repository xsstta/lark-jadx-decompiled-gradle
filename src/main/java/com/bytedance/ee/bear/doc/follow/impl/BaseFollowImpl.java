package com.bytedance.ee.bear.doc.follow.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1174u;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.bytedance.ee.bear.doc.follow.AbstractC5419b;
import com.bytedance.ee.bear.doc.follow.AbstractC5426c;
import com.bytedance.ee.bear.doc.follow.FollowInvokeResult;
import com.bytedance.ee.bear.doc.follow.event.AbstractC5430a;
import com.bytedance.ee.bear.doc.follow.event.KeyboardStateChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.OpenLinkEvent;
import com.bytedance.ee.bear.doc.follow.event.PresenterLocationChangedEvent;
import com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEvent;
import com.bytedance.ee.bear.doc.follow.impl.rn.RNFollowEventTypes;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5421a;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c;
import com.bytedance.ee.bear.doc.follow.p296b.C5425d;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.route.AbstractC10738c;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13742g;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public abstract class BaseFollowImpl implements LifecycleObserver, AbstractC5419b, AbstractC7666d {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String EMPTY_PARAMS = null;
    String TAG = ("CCMFollow_impl#" + Integer.toHexString(hashCode()));
    private AbstractC7665c backPressDispatcher;
    private AbstractC5430a contentEventHandler;
    private Context context;
    private List<AbstractC5424c> docFollowStateObservers = new ArrayList();
    private C1174u<Boolean> docSubKeyboardPanelActive = new C1174u<>();
    protected String documentToken;
    private LiveData<AbstractC6214a> editPanelLiveData;
    private Fragment fragment;
    private boolean isGuest;
    private C1177w<Boolean> isKeyboardShowing = new C1177w<>();
    private boolean isPresenter;
    private AbstractC10549e keyboardHeightObserver = new AbstractC10549e() {
        /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$LqkCbmhgMhCyMkyhOjt4J8fqWM */

        @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
        public final void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
            BaseFollowImpl.this.lambda$new$0$BaseFollowImpl(fVar, i, i2);
        }
    };
    private AbstractC10550f keyboardHeightProvider;
    protected IFollowBridge mFollowBridge;
    private AbstractC10738c routeInterceptor = new AbstractC10738c() {
        /* class com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl.C54321 */

        @Override // com.bytedance.ee.bear.route.AbstractC10738c
        /* renamed from: a */
        public boolean mo17284a(BearUrl bearUrl, RouteBean routeBean) {
            return BaseFollowImpl.this.processRouterEvent(bearUrl);
        }
    };
    private C10917c serviceContext;

    public /* synthetic */ void lambda$registerBaseRNEventHandler$7$BaseFollowImpl(RNFollowEvent rNFollowEvent) {
    }

    public IFollowBridge getFollowBridge() {
        return this.mFollowBridge;
    }

    public boolean isPresenter() {
        return this.isPresenter;
    }

    private static class ActivityLifecycleObserver implements LifecycleObserver, C11789c.AbstractC11791a {

        /* renamed from: a */
        private final String f15482a;

        /* renamed from: b */
        private FragmentActivity f15483b;

        @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
        public boolean interceptSetStatusBarColor(Activity activity, int i, boolean z) {
            return true;
        }

        @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
        public boolean interceptSetSystemUiVisibility(Activity activity, int i) {
            return true;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public void onActivityCreate() {
            C11789c.m48866a(this.f15483b, this);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onActivityDestroy() {
            C5438c.m22047a(this.f15482a);
            this.f15483b.getLifecycle().removeObserver(this);
            C11789c.m48871b(this.f15483b, this);
            this.f15483b = null;
        }

        ActivityLifecycleObserver(Fragment fragment, FragmentActivity fragmentActivity) {
            this.f15483b = fragmentActivity;
            this.f15482a = C5438c.m22050b(fragment);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onFragmentCreate() {
        C13479a.m54764b(this.TAG, "onFragmentCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onFragmentPause() {
        C13479a.m54764b(this.TAG, "onFragmentPause");
        unbindFollowEvents();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onFragmentResume() {
        C13479a.m54764b(this.TAG, "onFragmentResume");
        bindFollowEvents();
    }

    private void bindFollowEvents() {
        updateInterceptRouterDispatch(true);
        AbstractC7665c cVar = this.backPressDispatcher;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
        AbstractC10550f fVar = this.keyboardHeightProvider;
        if (fVar != null) {
            fVar.mo39924a(this.keyboardHeightObserver);
        }
    }

    private void unbindFollowEvents() {
        updateInterceptRouterDispatch(false);
        AbstractC7665c cVar = this.backPressDispatcher;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
        AbstractC10550f fVar = this.keyboardHeightProvider;
        if (fVar != null) {
            fVar.mo39928b(this.keyboardHeightObserver);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onFragmentDestroy() {
        C13479a.m54764b(this.TAG, "onFragmentDestroy");
        this.fragment = null;
        this.context = null;
        unregisterBaseRNEventHandler();
        this.mFollowBridge.mo21769a(this.documentToken);
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void startReplay() {
        this.isPresenter = false;
        invoke("startReplay");
        notifyDocFollowStateChanged(new C5425d(false, this.isGuest));
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void stopRecord() {
        this.isPresenter = false;
        invoke("stopRecord");
        this.mFollowBridge.mo21770a(this.documentToken, "", RNFollowEventTypes.NEW_ACTIONS.name());
        C10548d.m43696a(this.context);
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void stopReplay() {
        this.isPresenter = false;
        invoke("stopReplay");
        if (this.context != null) {
            notifyDocFollowStateChanged(new C5425d(true, this.isGuest));
        }
    }

    private void notifyDocSubKeyboardPanelActiveChanged() {
        boolean z;
        AbstractC6214a b = this.editPanelLiveData.mo5927b();
        C1174u<Boolean> uVar = this.docSubKeyboardPanelActive;
        if (this.isKeyboardShowing.mo5927b() == Boolean.TRUE || (b != null && b.shouldNotifyVCKeyboardEvent())) {
            z = true;
        } else {
            z = false;
        }
        uVar.mo5929b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        Fragment fragment2 = this.fragment;
        if (!(fragment2 instanceof AbstractC7666d) || !((AbstractC7666d) fragment2).onBackPressed()) {
            return false;
        }
        String str = this.TAG;
        C13479a.m54764b(str, "Back press consumed by :" + this.fragment);
        return true;
    }

    public void registerBaseRNEventHandler() {
        this.mFollowBridge.mo21771a(this.documentToken, (String) null, RNFollowEventTypes.FOLLOW_LOG.name(), (AbstractC5440a) new AbstractC5440a() {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$dd9CrSIPpdJjLQ8co7FflCPGgsI */

            @Override // com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a
            public final void onEvent(RNFollowEvent rNFollowEvent) {
                BaseFollowImpl.this.lambda$registerBaseRNEventHandler$7$BaseFollowImpl(rNFollowEvent);
            }
        }, true);
        this.mFollowBridge.mo21771a(this.documentToken, (String) null, RNFollowEventTypes.PRESENTER_FOLLOWER_LOCATION.name(), (AbstractC5440a) new AbstractC5440a() {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$7PeqHkhk9RNH2eaPdgz9n93N6zE */

            @Override // com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a
            public final void onEvent(RNFollowEvent rNFollowEvent) {
                BaseFollowImpl.this.notifyPresenterLocationChangedEvent(rNFollowEvent);
            }
        }, true);
    }

    public void unregisterBaseRNEventHandler() {
        this.mFollowBridge.mo21770a(this.documentToken, "", RNFollowEventTypes.FOLLOW_LOG.name());
        this.mFollowBridge.mo21770a(this.documentToken, "", RNFollowEventTypes.NEW_ACTIONS.name());
        this.mFollowBridge.mo21770a(this.documentToken, "", RNFollowEventTypes.PRESENTER_FOLLOWER_LOCATION.name());
    }

    public /* synthetic */ void lambda$new$1$BaseFollowImpl(AbstractC6214a aVar) {
        notifyDocSubKeyboardPanelActiveChanged();
    }

    public /* synthetic */ void lambda$new$2$BaseFollowImpl(Boolean bool) {
        notifyDocSubKeyboardPanelActiveChanged();
    }

    private void invoke(String str) {
        invoke(str, EMPTY_PARAMS, null);
    }

    public /* synthetic */ void lambda$updateInterceptRouterDispatch$11$BaseFollowImpl(Throwable th) throws Exception {
        C13479a.m54759a(this.TAG, "Get RouteService err resume!", th);
    }

    public /* synthetic */ void lambda$updateInterceptRouterDispatch$9$BaseFollowImpl(Throwable th) throws Exception {
        C13479a.m54759a(this.TAG, "Get RouteService err resume!", th);
    }

    public void unregisterDocFollowStateObserver(AbstractC5424c cVar) {
        this.docFollowStateObservers.remove(cVar);
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void updateOptions(String str) {
        invoke("updateOptions", str, null, null);
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void getStates(AbstractC5419b.AbstractC5420a aVar) {
        invoke("getCurrentStatus", EMPTY_PARAMS, new AbstractC5426c(aVar) {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$SkPvT9LbwcAGvnJMmXTT2YAi57k */
            public final /* synthetic */ AbstractC5419b.AbstractC5420a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.doc.follow.AbstractC5426c
            public final void onInvokeResult(FollowInvokeResult followInvokeResult) {
                BaseFollowImpl.this.lambda$getStates$4$BaseFollowImpl(this.f$1, followInvokeResult);
            }
        });
    }

    public /* synthetic */ void lambda$onInvoke$6$BaseFollowImpl(String str) {
        this.mFollowBridge.mo21765a().mo21758a(str);
    }

    public boolean processRouterEvent(BearUrl bearUrl) {
        if (bearUrl == null || !processRouterEvent(bearUrl.f17450e)) {
            return false;
        }
        return true;
    }

    public void registerDocFollowStateObserver(AbstractC5424c cVar) {
        if (!this.docFollowStateObservers.contains(cVar)) {
            this.docFollowStateObservers.add(cVar);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void unregisterRNEventHandler(String str) {
        this.mFollowBridge.mo21770a(this.documentToken, "", str);
    }

    /* access modifiers changed from: private */
    public void notifyPresenterLocationChangedEvent(RNFollowEvent rNFollowEvent) {
        try {
            PresenterLocationChangedEvent presenterLocationChangedEvent = (PresenterLocationChangedEvent) C5437b.m22043a(rNFollowEvent.dataJson, PresenterLocationChangedEvent.class);
            if (presenterLocationChangedEvent != null) {
                processContentEvent(presenterLocationChangedEvent);
            }
        } catch (Exception e) {
            C13479a.m54759a(this.TAG, "notifyPresenterLocationChangedEvent", e);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void setContentEventHandler(AbstractC5430a aVar) {
        String str = this.TAG;
        C13479a.m54764b(str, "setContentEventHandler:" + aVar);
        this.contentEventHandler = aVar;
    }

    private String objArrayToJsonArray(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i != strArr.length - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private boolean shouldIntercept(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((str.startsWith("http:") || str.startsWith("https:")) && !C5171a.m21152b(str)) {
            return true;
        }
        return false;
    }

    private void updateInterceptRouterDispatch(boolean z) {
        AbstractC68307f.m265083a(KoinJavaComponent.m268610a(AbstractC10740f.class)).mo238004b(C11678b.m48480d()).mo238001b(new Consumer(z) {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$3mwDHG_0fLcimiT4irZ7PQ_ZCHo */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseFollowImpl.this.lambda$updateInterceptRouterDispatch$8$BaseFollowImpl(this.f$1, (AbstractC10740f) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$tgJGUsPzqrqPcwq4FN10DDCyD0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseFollowImpl.this.lambda$updateInterceptRouterDispatch$9$BaseFollowImpl((Throwable) obj);
            }
        });
        AbstractC68307f.m265083a(KoinJavaComponent.m268610a(AbstractC10740f.class)).mo238004b(C11678b.m48480d()).mo238001b(new Consumer(z) {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$ylOG_TFS4QN3vtgu1jyTWNAklJo */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseFollowImpl.this.lambda$updateInterceptRouterDispatch$10$BaseFollowImpl(this.f$1, (AbstractC10740f) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$BAy_j6Dz8GFNXFj7rEkBfuMsUc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseFollowImpl.this.lambda$updateInterceptRouterDispatch$11$BaseFollowImpl((Throwable) obj);
            }
        });
    }

    public void notifyDocFollowStateChanged(AbstractC5421a aVar) {
        String str = this.TAG;
        C13479a.m54764b(str, "notifyDocFollowStateChanged:" + aVar);
        for (AbstractC5424c cVar : this.docFollowStateObservers) {
            cVar.mo21680a(aVar);
        }
    }

    public boolean processRouterEvent(String str) {
        boolean shouldIntercept = shouldIntercept(str);
        String str2 = this.TAG;
        C13479a.m54764b(str2, "should intercept url?" + C13598b.m55197d(str));
        if (!shouldIntercept || !processContentEvent(new OpenLinkEvent(str))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean processContentEvent(com.bytedance.ee.bear.doc.follow.event.ContentEvent r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent
            if (r0 == 0) goto L_0x0012
            r0 = r7
            com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent r0 = (com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent) r0
            com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent$LoadState r0 = r0.getLoadState()
            com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent$LoadState r1 = com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent.LoadState.LoadSuccess
            if (r0 != r1) goto L_0x0012
            r6.registerBaseRNEventHandler()
        L_0x0012:
            r0 = 1
            r1 = 0
            com.bytedance.ee.bear.doc.follow.event.a r2 = r6.contentEventHandler     // Catch:{ Exception -> 0x0020 }
            if (r2 == 0) goto L_0x0028
            boolean r2 = r2.mo21709a(r7)     // Catch:{ Exception -> 0x0020 }
            if (r2 == 0) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0020:
            r2 = move-exception
            java.lang.String r3 = r6.TAG
            java.lang.String r4 = "processContentEvent err"
            com.bytedance.ee.log.C13479a.m54759a(r3, r4, r2)
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.lang.String r3 = r6.TAG
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r7 = r7.toString()
            r4[r1] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r4[r0] = r7
            r7 = 2
            com.bytedance.ee.bear.doc.follow.event.a r5 = r6.contentEventHandler
            if (r5 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4[r7] = r0
            java.lang.String r7 = "processContentEvent:%s,processed?%b,hasHandler?%b"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            com.bytedance.ee.log.C13479a.m54764b(r3, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl.processContentEvent(com.bytedance.ee.bear.doc.follow.event.ContentEvent):boolean");
    }

    static /* synthetic */ void lambda$startRecord$3(AbstractC5419b.AbstractC5420a aVar, RNFollowEvent rNFollowEvent) {
        if (aVar != null) {
            aVar.mo21678a(C5437b.m22044a(rNFollowEvent.dataJson));
        }
    }

    public /* synthetic */ void lambda$updateInterceptRouterDispatch$10$BaseFollowImpl(boolean z, AbstractC10740f fVar) throws Exception {
        if (z) {
            fVar.mo17290a(this.routeInterceptor);
        } else {
            fVar.mo17296b(this.routeInterceptor);
        }
    }

    public /* synthetic */ void lambda$updateInterceptRouterDispatch$8$BaseFollowImpl(boolean z, AbstractC10740f fVar) throws Exception {
        if (z) {
            fVar.mo17290a(this.routeInterceptor);
        } else {
            fVar.mo17296b(this.routeInterceptor);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void registerRNEventHandler(String str, AbstractC5440a aVar) {
        this.mFollowBridge.mo21771a(this.documentToken, (String) null, str, aVar, true);
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void setStates(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0) {
            C13479a.m54772d(this.TAG, "setStates Empty !");
        } else {
            invoke("replayActions", objArrayToJsonArray(strArr), str, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: returnGetStatesResult */
    public void lambda$getStates$4$BaseFollowImpl(FollowInvokeResult followInvokeResult, AbstractC5419b.AbstractC5420a aVar) {
        String[] strArr = null;
        try {
            if (!TextUtils.isEmpty(followInvokeResult.resultJson)) {
                List parseArray = JSONObject.parseArray(followInvokeResult.resultJson, String.class);
                strArr = (String[]) parseArray.toArray(new String[parseArray.size()]);
            }
            aVar.mo21678a(strArr);
        } catch (Exception e) {
            C13479a.m54759a(this.TAG, "returnGetStatesResult", e);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5419b
    public void startRecord(AbstractC5419b.AbstractC5420a aVar, String[] strArr) {
        this.isPresenter = true;
        if (strArr == null || strArr.length == 0) {
            C13479a.m54772d(this.TAG, "startRecord: followStates is empty");
            invoke("startRecord");
        } else {
            invoke("startRecord", objArrayToJsonArray(strArr), null);
        }
        this.mFollowBridge.mo21771a(this.documentToken, "", RNFollowEventTypes.NEW_ACTIONS.name(), (AbstractC5440a) new AbstractC5440a() {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$R41SIDE_F2jLEkeS7GFswfLsSJM */

            @Override // com.bytedance.ee.bear.doc.follow.impl.rn.AbstractC5440a
            public final void onEvent(RNFollowEvent rNFollowEvent) {
                BaseFollowImpl.lambda$startRecord$3(AbstractC5419b.AbstractC5420a.this, rNFollowEvent);
            }
        }, true);
        Context context2 = this.context;
        if (!(context2 == null || context2.getResources().getConfiguration().orientation == 2)) {
            notifyDocFollowStateChanged(new C5425d(true, this.isGuest));
        }
        C10548d.m43696a(this.context);
    }

    public void invoke(String str, String str2, AbstractC5426c cVar) {
        invoke(str, str2, null, cVar);
    }

    public /* synthetic */ void lambda$new$0$BaseFollowImpl(AbstractC10550f fVar, int i, int i2) {
        boolean z;
        C1177w<Boolean> wVar = this.isKeyboardShowing;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        wVar.mo5929b(Boolean.valueOf(z));
    }

    BaseFollowImpl(Fragment fragment2, String str, IFollowBridge dVar) {
        C13479a.m54764b(this.TAG, "constructed");
        this.fragment = fragment2;
        this.context = fragment2.getContext();
        this.mFollowBridge = dVar;
        this.documentToken = str;
        this.serviceContext = new C10917c(new C10929e());
        this.isGuest = C4511g.m18594d().mo17353N();
        String str2 = this.TAG;
        C13479a.m54764b(str2, "BaseFollowImpl is guest " + this.isGuest + " process name " + C13629i.m55303b(this.context));
        AbstractC5415a a = C5438c.m22045a(fragment2);
        if (a == null) {
            C13479a.m54774d(this.TAG, new IllegalStateException("Follow host not found !"));
        } else {
            a.onFollowApiCreated(this);
            C13479a.m54764b(this.TAG, "Follow host bind ok");
        }
        FragmentActivity activity = fragment2.getActivity();
        activity.getLifecycle().addObserver(new ActivityLifecycleObserver(fragment2, activity));
        fragment2.getLifecycle().addObserver(this);
        this.backPressDispatcher = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(activity, AbstractC7665c.class);
        this.keyboardHeightProvider = AbstractC10550f.AbstractC10551a.m43717b(activity);
        LiveData<AbstractC6214a> activeEditPanel = ((C6215b) aj.m5366a(activity).mo6005a(C6215b.class)).getActiveEditPanel();
        this.editPanelLiveData = activeEditPanel;
        this.docSubKeyboardPanelActive.mo6042a(activeEditPanel, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$h4MiSQ1RYkJdzNc2dBpH9ThDc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseFollowImpl.this.lambda$new$1$BaseFollowImpl((AbstractC6214a) obj);
            }
        });
        this.docSubKeyboardPanelActive.mo6042a(this.isKeyboardShowing, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$Qc6LQvpVDaat3vsweK4b0RDVWS0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseFollowImpl.this.lambda$new$2$BaseFollowImpl((Boolean) obj);
            }
        });
        this.docSubKeyboardPanelActive.mo5923a(fragment2, new AbstractC13687a<Boolean>() {
            /* class com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl.C54332 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo18510a(Boolean bool) {
                boolean z;
                BaseFollowImpl baseFollowImpl = BaseFollowImpl.this;
                if (bool == Boolean.TRUE) {
                    z = true;
                } else {
                    z = false;
                }
                baseFollowImpl.processContentEvent(new KeyboardStateChangedEvent(z));
            }
        });
    }

    public void invoke(String str, String str2, String str3, AbstractC5426c cVar) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54774d(this.TAG, new IllegalStateException("invoke with bad funcName"));
        } else {
            C13742g.m55711d(new Runnable(str, str2, str3, cVar) {
                /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$v7Cd2hLOeQv7mz9FXG6X7b4zrq0 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ AbstractC5426c f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    BaseFollowImpl.this.lambda$invoke$5$BaseFollowImpl(this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: onInvoke */
    public void lambda$invoke$5$BaseFollowImpl(String str, String str2, String str3, AbstractC5426c cVar) {
        if (cVar != null) {
            C13742g.m55706a(new Runnable(this.mFollowBridge.mo21766a(this.documentToken, str, str2, str3, cVar)) {
                /* class com.bytedance.ee.bear.doc.follow.impl.$$Lambda$BaseFollowImpl$plsB00R5AE3igslpi52jEJEDIzA */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    BaseFollowImpl.this.lambda$onInvoke$6$BaseFollowImpl(this.f$1);
                }
            }, 5000);
        }
        this.mFollowBridge.mo21766a(this.documentToken, str, str2, str3, cVar);
    }
}
