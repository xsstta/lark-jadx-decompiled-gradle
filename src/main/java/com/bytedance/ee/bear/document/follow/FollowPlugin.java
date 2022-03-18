package com.bytedance.ee.bear.document.follow;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.doc.follow.event.ContentEvent;
import com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent;
import com.bytedance.ee.bear.doc.follow.event.TitleChangedEvent;
import com.bytedance.ee.bear.doc.follow.impl.BaseFollowImpl;
import com.bytedance.ee.bear.doc.follow.impl.WebRNFollowImpl;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5421a;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c;
import com.bytedance.ee.bear.doc.follow.p296b.C5425d;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.titlebar.AbstractC6196a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

public class FollowPlugin extends DocumentPlugin {
    public C5425d curTitleBarState;
    private AbstractC5424c docFollowStateObserver = new AbstractC5422b() {
        /* class com.bytedance.ee.bear.document.follow.FollowPlugin.C58011 */

        @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b
        /* renamed from: a */
        public View mo21679a() {
            TitleBar titleBar = FollowPlugin.this.getTitleBar();
            if (titleBar != null) {
                return titleBar.mo19508a();
            }
            return null;
        }

        @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c, com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b
        /* renamed from: a */
        public void mo21680a(AbstractC5421a aVar) {
            super.mo21680a(aVar);
            if (aVar instanceof C5425d) {
                FollowPlugin.this.curTitleBarState = (C5425d) aVar;
            }
        }
    };
    private BaseFollowImpl documentFollow;
    public boolean isLoadFinished;

    static /* synthetic */ boolean lambda$setTitleBarState$1(AbstractC5421a aVar) {
        return true;
    }

    public C5425d getCurTitleBarState() {
        return this.curTitleBarState;
    }

    public BaseFollowImpl getDocumentFollow() {
        return this.documentFollow;
    }

    public void processMoveToWiki() {
        processEvent(new LoadStateChangedEvent(LoadStateChangedEvent.LoadState.LoadWikiToReplaceDoc));
    }

    private void bindFollowEvents() {
        bindLoad();
        bindTitle();
        if (C8275a.f22371d.mo32553a().equals(getDocViewModel().getDocumentType())) {
            bindPositionKeeperEvent();
        }
    }

    private void bindLoad() {
        bindBridgeHandler("biz.vcSdk.followReady", new C5804a());
        ((C6095s) getHost()).mo24600o().mo23796a(new AbstractC5887o.AbstractC5888a() {
            /* class com.bytedance.ee.bear.document.follow.FollowPlugin.C58022 */

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadStart() {
            }

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadSuccess() {
            }

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadFail(int i, Throwable th) {
                if (FollowPlugin.this.isLoadFinished) {
                    C13479a.m54775e("FollowPlugin", "callback result:load fail");
                    return;
                }
                FollowPlugin.this.isLoadFinished = true;
                FollowPlugin.this.processEvent(new LoadStateChangedEvent(LoadStateChangedEvent.LoadState.LoadFail));
            }
        });
    }

    private void bindPositionKeeperEvent() {
        C13479a.m54764b("FollowPlugin", "bindPositionKeeperEvent()...");
        processEvent(new PositionKeeperApiCreatedEvent(new PositionKeeperApiCreatedEvent.AbstractC5429a() {
            /* class com.bytedance.ee.bear.document.follow.FollowPlugin.C58033 */

            @Override // com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent.AbstractC5429a
            /* renamed from: a */
            public void mo21691a() {
                FollowPlugin.this.execJS("javascript:lark.biz.positionKeeper.keepCurrentPosition");
                C13479a.m54764b("FollowPlugin", "bindPositionKeeperEvent()... keepCurrentPosition");
            }

            @Override // com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent.AbstractC5429a
            /* renamed from: b */
            public void mo21692b() {
                FollowPlugin.this.execJS("javascript:lark.biz.positionKeeper.backToLastPosition");
                C13479a.m54764b("FollowPlugin", "bindPositionKeeperEvent()... backToLastPosition");
            }

            @Override // com.bytedance.ee.bear.doc.follow.event.PositionKeeperApiCreatedEvent.AbstractC5429a
            /* renamed from: c */
            public void mo21693c() {
                FollowPlugin.this.execJS("javascript:lark.biz.positionKeeper.clearLastPosition");
                C13479a.m54764b("FollowPlugin", "bindPositionKeeperEvent()... clearAllDocumentLastPosition");
            }
        }));
    }

    private void bindTitle() {
        getDocViewModel().getDocName().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.follow.$$Lambda$FollowPlugin$cQ70PiUJJKGudBAzbtY6pW2ipMM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                FollowPlugin.this.lambda$bindTitle$0$FollowPlugin((String) obj);
            }
        });
    }

    private void setTitleBarState() {
        TitleBar titleBar = getTitleBar();
        if (titleBar != null) {
            if (!((AbstractC6196a) KoinJavaComponent.m268610a(AbstractC6196a.class)).mo25028a()) {
                titleBar.mo19525e(false);
                titleBar.mo19526f(false);
                titleBar.mo19515a(false);
                return;
            }
            BaseTitleBar a = titleBar.mo19508a();
            if (a != null) {
                a.setVisibility(8);
                addTitleBarStateInterceptor($$Lambda$FollowPlugin$6J6GgddXaMafgGGtvQ8pofZHAkQ.INSTANCE);
            }
        }
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.follow.FollowPlugin$a */
    public class C5804a implements AbstractC7945d<Void> {
        private C5804a() {
        }

        /* renamed from: a */
        public void handle(Void r2, AbstractC7947h hVar) {
            C13479a.m54764b("FollowPlugin", "followReady");
            if (FollowPlugin.this.isLoadFinished) {
                C13479a.m54775e("FollowPlugin", "JS handler result:follow success");
                return;
            }
            FollowPlugin.this.isLoadFinished = true;
            FollowPlugin.this.processEvent(new LoadStateChangedEvent(LoadStateChangedEvent.LoadState.LoadSuccess));
        }
    }

    public boolean processEvent(ContentEvent contentEvent) {
        return this.documentFollow.processContentEvent(contentEvent);
    }

    public void addTitleBarStateInterceptor(AbstractC5422b.AbstractC5423a aVar) {
        AbstractC5424c cVar = this.docFollowStateObserver;
        if (cVar instanceof AbstractC5422b) {
            ((AbstractC5422b) cVar).mo21681a(aVar);
        }
    }

    public void removeTitleBarStateInterceptor(AbstractC5422b.AbstractC5423a aVar) {
        AbstractC5424c cVar = this.docFollowStateObserver;
        if (cVar instanceof AbstractC5422b) {
            ((AbstractC5422b) cVar).mo21682b(aVar);
        }
    }

    public /* synthetic */ void lambda$bindTitle$0$FollowPlugin(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.toString();
        }
        processEvent(new TitleChangedEvent(str2));
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.documentFollow = new DocumentWebFollowImpl(sVar.mo24597l(), getWeb(), sVar.mo24598m().getToken());
        bindFollowEvents();
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        nVar.mo19603h();
        setTitleBarState();
        this.documentFollow.registerDocFollowStateObserver(this.docFollowStateObserver);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.documentFollow.unregisterDocFollowStateObserver(this.docFollowStateObserver);
    }

    /* access modifiers changed from: private */
    public class DocumentWebFollowImpl extends WebRNFollowImpl {
        DocumentWebFollowImpl(Fragment fragment, AbstractC4931i iVar, String str) {
            super(fragment, iVar, str);
        }
    }
}
