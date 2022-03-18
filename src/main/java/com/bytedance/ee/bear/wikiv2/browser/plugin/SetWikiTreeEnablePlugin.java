package com.bytedance.ee.bear.wikiv2.browser.plugin;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.AbstractC5887o;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.wikiv2.browser.plugin.SetWikiTreeEnablePlugin;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class SetWikiTreeEnablePlugin extends DocumentPlugin {

    public static class WikiTreeItemEnableInfo implements NonProguard {
        public boolean enable;

        public String toString() {
            return "WikiTreeItemEnableInfo{enable=" + this.enable + '}';
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.SetWikiTreeEnablePlugin$a */
    public class C12203a implements AbstractC7945d<WikiTreeItemEnableInfo> {
        private C12203a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m50822a(WikiTreeItemEnableInfo wikiTreeItemEnableInfo, WikiTreeMenuPlugin wikiTreeMenuPlugin) {
            wikiTreeMenuPlugin.setEnable(wikiTreeItemEnableInfo.enable);
        }

        /* renamed from: a */
        public void handle(WikiTreeItemEnableInfo wikiTreeItemEnableInfo, AbstractC7947h hVar) {
            C13479a.m54764b("SetWikiTreeEnablePlugin", "SetWikiTreeEnable:" + wikiTreeItemEnableInfo);
            if (wikiTreeItemEnableInfo != null) {
                ((C6095s) SetWikiTreeEnablePlugin.this.getHost()).mo19549a(WikiTreeMenuPlugin.class, new AbstractC4942d() {
                    /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$SetWikiTreeEnablePlugin$a$qzPkcm_tdKOvAxT7ur8j1ab4Rk */

                    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
                    public final void onPluginFound(AbstractC4941c cVar) {
                        SetWikiTreeEnablePlugin.C12203a.m50822a(SetWikiTreeEnablePlugin.WikiTreeItemEnableInfo.this, (WikiTreeMenuPlugin) cVar);
                    }
                });
            }
        }
    }

    private void observerTreeMenuEnable(C6095s sVar) {
        sVar.mo24600o().mo23796a(new AbstractC5887o.C5889b() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.SetWikiTreeEnablePlugin.C122021 */

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.C5889b, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadSuccess() {
                ((C6095s) SetWikiTreeEnablePlugin.this.getHost()).mo19549a(WikiTreeMenuPlugin.class, $$Lambda$SetWikiTreeEnablePlugin$1$qaYeNoN_V_A7Yoep7hjDFJIizoo.INSTANCE);
            }

            @Override // com.bytedance.ee.bear.document.AbstractC5887o.C5889b, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
            public void onLoadFail(int i, Throwable th) {
                ((C6095s) SetWikiTreeEnablePlugin.this.getHost()).mo19549a(WikiTreeMenuPlugin.class, new AbstractC4942d(i) {
                    /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$SetWikiTreeEnablePlugin$1$7llCqu51s08PwtAMhTTk5C42T30 */
                    public final /* synthetic */ int f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
                    public final void onPluginFound(AbstractC4941c cVar) {
                        ((WikiTreeMenuPlugin) cVar).setLoadState(this.f$0);
                    }
                });
            }
        });
    }

    private void observerShowingHistory(C6095s sVar) {
        sVar.mo24598m().isShowingHistory().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$SetWikiTreeEnablePlugin$lGuao9mNvVJYoCSkZpX1qNj0Zc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SetWikiTreeEnablePlugin.this.lambda$observerShowingHistory$1$SetWikiTreeEnablePlugin((Boolean) obj);
            }
        });
    }

    public /* synthetic */ void lambda$observerShowingHistory$1$SetWikiTreeEnablePlugin(Boolean bool) {
        ((C6095s) getHost()).mo19549a(WikiTreeMenuPlugin.class, new AbstractC4942d(bool) {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$SetWikiTreeEnablePlugin$Dn1zPwZJaqqQJpBheYS2RANB8uc */
            public final /* synthetic */ Boolean f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
            public final void onPluginFound(AbstractC4941c cVar) {
                ((WikiTreeMenuPlugin) cVar).setShowingHistory(this.f$0.booleanValue());
            }
        });
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C13479a.m54764b("SetWikiTreeEnablePlugin", "onAttachToHost. ");
        observerTreeMenuEnable(sVar);
        observerShowingHistory(sVar);
        bindBridgeHandler("biz.wiki.setWikiTreeEnable", new C12203a());
    }
}
