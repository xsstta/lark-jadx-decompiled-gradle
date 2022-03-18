package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.wikiv2.browser.plugin.C12209b;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public class WikiLoaderPlugin extends DocumentPlugin {
    public C12209b wikiLoader;
    private WikiViewModel wikiViewModel;

    public void onWikiInfoConfirmed(WikiInfo wikiInfo) {
    }

    private void bindViewModel() {
        getDocViewModel().liveDocumentInfoData().mo5923a(getLifecycleOwner(), new AbstractC1178x<DocumentInfo>() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.WikiLoaderPlugin.C122041 */

            /* renamed from: a */
            public void onChanged(DocumentInfo documentInfo) {
                WikiLoaderPlugin.this.getDocViewModel().liveDocumentInfoData().mo5928b(this);
                if (documentInfo == null) {
                    C13479a.m54775e("WikiLoaderPlugin", "liveDocInfoData observer receive null result");
                } else {
                    WikiLoaderPlugin.this.reportOpen();
                }
            }
        });
    }

    public void reportOpen() {
        boolean isCanEdit = getDocViewModel().isCanEdit();
        if (TextUtils.equals(C12237b.m50895a(this.wikiViewModel.getBearUrl()), "pages")) {
            WikiReportV2.m50910a("switch_page", this.wikiViewModel.getWikiToken(), this.wikiViewModel.getWikiToken(), Integer.valueOf(getDocViewModel().getDocumentTypeValue()), null, Boolean.valueOf(isCanEdit));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.WikiLoaderPlugin$a */
    public class C12205a implements AbstractC7945d<JSWikiInfo> {
        private C12205a() {
        }

        /* renamed from: a */
        private WikiException m50825a(WikiInfo wikiInfo) {
            try {
                WikiException.validate(WikiLoaderPlugin.this.getContext(), ((C6095s) WikiLoaderPlugin.this.getHost()).mo24601p(), wikiInfo);
                return null;
            } catch (WikiException e) {
                return e;
            }
        }

        /* renamed from: a */
        public void handle(JSWikiInfo jSWikiInfo, AbstractC7947h hVar) {
            WikiInfo wikiInfo = jSWikiInfo.toWikiInfo();
            C13479a.m54764b("WikiLoaderPlugin", "Wiki info from js :" + wikiInfo);
            WikiException a = m50825a(wikiInfo);
            if (a == null) {
                WikiLoaderPlugin.this.onWikiInfoConfirmed(wikiInfo);
            } else if (a.getCode() != -8010) {
                WikiLoaderPlugin.this.wikiLoader.mo24477a(a, (Map<String, String>) null);
            }
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.wikiViewModel = (WikiViewModel) C4950k.m20479a(getHost(), WikiViewModel.class, WikiViewModel.newFactory(((C6095s) getHost()).mo24597l().getArguments()));
        C12209b bVar = new C12209b(sVar, new C12209b.AbstractC12210a() {
            /* class com.bytedance.ee.bear.wikiv2.browser.plugin.$$Lambda$8lNF2fOFvShA1DDyv3tnwmklBs0 */

            public final void onWikiInfoConfirmed(WikiInfo wikiInfo) {
                WikiLoaderPlugin.this.onWikiInfoConfirmed(wikiInfo);
            }
        });
        this.wikiLoader = bVar;
        sVar.mo24596a(bVar);
        bindViewModel();
        bindBridgeHandler("biz.wiki.setWikiInfo", new C12205a());
    }
}
