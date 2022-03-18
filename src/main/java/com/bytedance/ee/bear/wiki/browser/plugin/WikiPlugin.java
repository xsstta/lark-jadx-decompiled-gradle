package com.bytedance.ee.bear.wiki.browser.plugin;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.C12008i;
import com.bytedance.ee.bear.wiki.browser.plugin.C11922b;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.exception.WikiException;
import com.bytedance.ee.log.C13479a;
import java.util.Map;

public class WikiPlugin extends DocumentPlugin {
    public C11922b wikiLoader;
    public C12008i wikiViewModel;

    private void bindViewModel() {
        getDocViewModel().liveDocumentInfoData().mo5923a(getLifecycleOwner(), new AbstractC1178x<DocumentInfo>() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.WikiPlugin.C119161 */

            /* renamed from: a */
            public void onChanged(DocumentInfo documentInfo) {
                WikiPlugin.this.getDocViewModel().liveDocumentInfoData().mo5928b(this);
                if (documentInfo == null) {
                    C13479a.m54775e("WikiPlugin", "liveDocInfoData observer receive null result");
                } else {
                    WikiPlugin.this.reportOpen();
                }
            }
        });
    }

    public void reportOpen() {
        boolean isCanEdit = getDocViewModel().isCanEdit();
        if (TextUtils.equals(C11933b.m49472a(this.wikiViewModel.getBearUrl()), "pages")) {
            C11933b.m49479a(((C6095s) getHost()).mo24601p(), "switch_page", this.wikiViewModel.getWikiToken(), this.wikiViewModel.getWikiToken(), isCanEdit);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.WikiPlugin$a */
    public class C11917a implements AbstractC7945d<JSWikiInfo> {
        private C11917a() {
        }

        /* renamed from: a */
        private WikiException m49406a(WikiInfo wikiInfo) {
            boolean z;
            try {
                Context context = WikiPlugin.this.getContext();
                C10917c p = ((C6095s) WikiPlugin.this.getHost()).mo24601p();
                if (WikiPlugin.this.wikiViewModel.getHomePage() != null) {
                    z = true;
                } else {
                    z = false;
                }
                WikiException.validate(context, p, wikiInfo, z);
                return null;
            } catch (WikiException e) {
                return e;
            }
        }

        /* renamed from: a */
        public void handle(JSWikiInfo jSWikiInfo, AbstractC7947h hVar) {
            WikiInfo wikiInfo = jSWikiInfo.toWikiInfo();
            C13479a.m54764b("WikiPlugin", "Wiki info from js :" + wikiInfo);
            WikiException a = m49406a(wikiInfo);
            if (a == null || a.getCode() == -8010) {
                WikiPlugin.this.onWikiInfoConfirmed(wikiInfo);
            } else {
                WikiPlugin.this.wikiLoader.mo24477a(a, (Map<String, String>) null);
            }
        }
    }

    public void onWikiInfoConfirmed(WikiInfo wikiInfo) {
        setupWikiContentUrl(wikiInfo);
        ((C6095s) getHost()).mo19549a(WikiTreeMenuPlugin.class, $$Lambda$S82cqXHjOiRx_52s31Fcl_MCu7Q.INSTANCE);
    }

    private void setupWikiContentUrl(WikiInfo wikiInfo) {
        DocViewModel docViewModel = getDocViewModel();
        String str = docViewModel.getBearUrl().f17453h;
        if (str == null) {
            str = "";
        }
        String a = C6313i.m25327a().mo25382a(C8275a.m34050a(wikiInfo.getObjType()), wikiInfo.getObjToken(), str);
        docViewModel.setUrl(a);
        docViewModel.requestDocumentInfo(a);
    }

    public void onAttachToHost(C6095s sVar) {
        boolean z;
        super.onAttachToHost((C4943e) sVar);
        C12008i iVar = (C12008i) C4950k.m20479a(getHost(), C12008i.class, C12008i.newFactory(((C6095s) getHost()).mo24597l().getArguments()));
        this.wikiViewModel = iVar;
        if (iVar.getHomePage() != null) {
            z = true;
        } else {
            z = false;
        }
        C11922b bVar = new C11922b(sVar, z, new C11922b.AbstractC11923a() {
            /* class com.bytedance.ee.bear.wiki.browser.plugin.$$Lambda$cvVjAmKCPh_ppmx_WoPGYrfRMQ */

            @Override // com.bytedance.ee.bear.wiki.browser.plugin.C11922b.AbstractC11923a
            public final void onWikiInfoConfirmed(WikiInfo wikiInfo) {
                WikiPlugin.this.onWikiInfoConfirmed(wikiInfo);
            }
        });
        this.wikiLoader = bVar;
        sVar.mo24596a(bVar);
        bindViewModel();
        bindBridgeHandler("biz.wiki.setWikiInfo", new C11917a());
    }
}
