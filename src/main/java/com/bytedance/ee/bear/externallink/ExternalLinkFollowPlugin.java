package com.bytedance.ee.bear.externallink;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.doc.follow.event.ContentEvent;
import com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.OpenLinkEvent;
import com.bytedance.ee.bear.doc.follow.event.TitleChangedEvent;
import com.bytedance.ee.bear.doc.follow.impl.WebRNFollowImpl;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.externallink.C7649b;
import com.bytedance.ee.bear.externallink.ExternalLinkFollowApi;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.rn.handler.RNSyncWebService;
import com.bytedance.ee.bear.rn.handler.RnMessageHandler;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import org.koin.java.KoinJavaComponent;

public class ExternalLinkFollowPlugin extends DocumentPlugin {
    private AbstractC7947h callBack;
    private AbstractC5424c docFollowStateObserver = new AbstractC5422b() {
        /* class com.bytedance.ee.bear.externallink.ExternalLinkFollowPlugin.C76461 */

        @Override // com.bytedance.ee.bear.doc.follow.p296b.AbstractC5422b
        /* renamed from: a */
        public View mo21679a() {
            TitleBar titleBar = ExternalLinkFollowPlugin.this.getTitleBar();
            if (titleBar != null) {
                return titleBar.mo19508a();
            }
            return null;
        }
    };
    private WebRNFollowImpl externalLinkFollow;
    public boolean loading;
    private C7649b.AbstractC7653b loadingCallback;

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public C7656c getHost() {
        return (C7656c) super.getHost();
    }

    private void bindLoad() {
        this.loadingCallback = new C7649b.AbstractC7653b() {
            /* class com.bytedance.ee.bear.externallink.ExternalLinkFollowPlugin.C76472 */

            @Override // com.bytedance.ee.bear.externallink.C7649b.AbstractC7653b
            /* renamed from: a */
            public void mo30041a() {
                C13479a.m54764b("ExternalLinkFollowPlugin", "Load start.");
                ExternalLinkFollowPlugin.this.loading = true;
                ExternalLinkFollowPlugin.this.processEvent(new LoadStateChangedEvent(LoadStateChangedEvent.LoadState.Loading));
            }

            @Override // com.bytedance.ee.bear.externallink.C7649b.AbstractC7653b
            /* renamed from: b */
            public void mo30044b() {
                C13479a.m54764b("ExternalLinkFollowPlugin", "Load success.");
                if (!ExternalLinkFollowPlugin.this.loading) {
                    C13479a.m54775e("ExternalLinkFollowPlugin", "Duplicate load result:success");
                    return;
                }
                ExternalLinkFollowPlugin.this.loading = false;
                ExternalLinkFollowPlugin.this.processEvent(new LoadStateChangedEvent(LoadStateChangedEvent.LoadState.LoadSuccess));
            }

            @Override // com.bytedance.ee.bear.externallink.C7649b.AbstractC7653b
            /* renamed from: a */
            public boolean mo30043a(String str) {
                C13479a.m54764b("ExternalLinkFollowPlugin", "Load url : " + C13598b.m55197d(str));
                return ExternalLinkFollowPlugin.this.processEvent(new OpenLinkEvent("", str));
            }

            @Override // com.bytedance.ee.bear.externallink.C7649b.AbstractC7653b
            /* renamed from: b */
            public void mo30045b(String str) {
                C13479a.m54764b("ExternalLinkFollowPlugin", "Load title : " + C13598b.m55197d(str));
                ExternalLinkFollowPlugin.this.processEvent(new TitleChangedEvent(str));
            }

            @Override // com.bytedance.ee.bear.externallink.C7649b.AbstractC7653b
            /* renamed from: a */
            public void mo30042a(int i, String str) {
                if (!ExternalLinkFollowPlugin.this.loading) {
                    C13479a.m54775e("ExternalLinkFollowPlugin", "Duplicate load result:fail");
                    return;
                }
                ExternalLinkFollowPlugin.this.loading = false;
                ExternalLinkFollowPlugin.this.processEvent(new LoadStateChangedEvent(LoadStateChangedEvent.LoadState.LoadFail));
            }
        };
        getHost().mo30067s().mo30048a(this.loadingCallback);
    }

    /* access modifiers changed from: private */
    public class ExternalLinkWebFollowImpl extends WebRNFollowImpl implements ExternalLinkFollowApi {
        public void injectJS(String str) throws ExternalLinkFollowApi.InjectBeforeLoadFinishException {
            ExternalLinkFollowPlugin.this.innerInjectJS(str);
        }

        ExternalLinkWebFollowImpl(Fragment fragment, AbstractC4931i iVar, String str) {
            super(fragment, iVar, str);
        }
    }

    public boolean processEvent(ContentEvent contentEvent) {
        C13479a.m54772d("ExternalLinkFollowPlugin", "Process event.");
        return this.externalLinkFollow.processContentEvent(contentEvent);
    }

    public void innerInjectJS(String str) throws ExternalLinkFollowApi.InjectBeforeLoadFinishException {
        if (!this.loading) {
            getHost().mo30067s().mo30052b(str);
            return;
        }
        throw new ExternalLinkFollowApi.InjectBeforeLoadFinishException();
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        getHost().mo30067s().mo30051b(this.loadingCallback);
        if (this.callBack != null) {
            ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40258b(this.callBack);
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.externalLinkFollow = new ExternalLinkWebFollowImpl(getHost().mo30067s(), getWeb(), getHost().mo30067s().mo30057j());
        bindLoad();
        RnMessageHandler eVar = (RnMessageHandler) KoinJavaComponent.m268610a(RnMessageHandler.class);
        bindBridgeHandler(RNSyncWebService.f28561a, eVar.mo40360a());
        bindBridgeHandler(RNSyncWebService.f28562b, eVar.mo40361a(new AbstractC7945d() {
            /* class com.bytedance.ee.bear.externallink.$$Lambda$ExternalLinkFollowPlugin$YWbDPRfI_RQFLvkBBqlY6FFr0SU */

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7948j
            public final void handle(Object obj, AbstractC7947h hVar) {
                ExternalLinkFollowPlugin.this.lambda$onAttachToHost$0$ExternalLinkFollowPlugin((String) obj, hVar);
            }
        }));
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.externalLinkFollow.unregisterDocFollowStateObserver(this.docFollowStateObserver);
    }

    public /* synthetic */ void lambda$onAttachToHost$0$ExternalLinkFollowPlugin(String str, AbstractC7947h hVar) {
        C13479a.m54772d("ExternalLinkFollowPlugin", "handle handleMessage callback:" + hVar);
        if (hVar != null) {
            this.callBack = hVar;
            ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40250a(hVar);
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        if (!(getActivity() == null || getResources().getConfiguration().orientation == 1)) {
            getActivity().setRequestedOrientation(1);
        }
        getTitleBar().mo19524d(false);
        this.externalLinkFollow.registerDocFollowStateObserver(this.docFollowStateObserver);
    }
}
