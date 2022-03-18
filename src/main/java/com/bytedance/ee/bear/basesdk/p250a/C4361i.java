package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.browser.AbstractC4934l;
import com.bytedance.ee.bear.browser.AbstractC4936n;
import com.bytedance.ee.bear.browser.plugin.AbstractC4948i;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.contract.route.parcelable.WikiPluginsProvider;
import com.bytedance.ee.bear.document.C5857l;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.appsetting.C5653a;
import com.bytedance.ee.bear.document.darkmode.C5738a;
import com.bytedance.ee.bear.document.device.C5741b;
import com.bytedance.ee.bear.document.frontendlog.C5805b;
import com.bytedance.ee.bear.document.offline.C5891b;
import com.bytedance.ee.bear.document.offline.base.C5905c;
import com.bytedance.ee.bear.document.p302c.C5685c;
import com.bytedance.ee.bear.document.p304d.C5737b;
import com.bytedance.ee.bear.document.persistence.C6067a;
import com.bytedance.ee.bear.document.record.C6080b;
import com.bytedance.ee.bear.document.service.SaveImageFromBase64Service;
import com.bytedance.ee.bear.document.statistics.C6157b;
import com.bytedance.ee.bear.document.toast.C6198a;
import com.bytedance.ee.bear.document.vibra.C6279a;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.like.C9516e;
import com.bytedance.ee.bear.mindnote.C10176b;
import com.bytedance.ee.bear.rn.handler.RNSyncWebService;
import com.bytedance.ee.bear.slide.C11371a;
import com.bytedance.ee.bear.wiki.browser.plugin.C11924c;
import com.bytedance.ee.bear.wikiv2.browser.plugin.AbstractC12208a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.a.i */
public class C4361i implements AbstractC4936n, AbstractC4948i {
    static {
        C5685c.m23053a(C8275a.f22371d.mo32553a(), C5869m.class);
        C5685c.m23053a(C8275a.f22372e.mo32553a(), C5869m.class);
        C5685c.m23054a(C8275a.f22376i.mo32553a(), C11371a.class, (int) R.layout.slide_document_fragment);
        C5685c.m23054a(C8275a.f22374g.mo32553a(), C10176b.class, (int) R.layout.mindnote_document_fragment);
        C5685c.m23053a(C8275a.f22377j.mo32553a(), C5869m.class);
        C5685c.m23053a(C8275a.f22378k.mo32553a(), C5869m.class);
        C5685c.m23053a(C8275a.f22373f.mo32553a(), C5869m.class);
        C5685c.m23053a(C8275a.f22369b.mo32553a(), C5869m.class);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4936n
    /* renamed from: a */
    public List<AbstractC4934l> mo17013a() {
        return Arrays.asList(new C5805b(), new C5905c(), new C6279a(), new C6198a(), new C6067a(), new C5857l(), new SaveImageFromBase64Service(), new C9516e(), new C5891b(), new C6157b(), new RNSyncWebService(), new C6080b(), new C5653a(), new C5737b(), new C5741b(), new C5738a());
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4948i
    /* renamed from: a */
    public C4946h mo17011a(C4943e eVar) {
        String str;
        DocOpenConfig.m22760a();
        DocumentMetadata q = ((EditorAbility) eVar.mo19551b(EditorAbility.class)).mo24602q();
        BearUrl bearUrl = q.getBearUrl();
        if (bearUrl == null) {
            str = "";
        } else {
            str = bearUrl.f17446a;
        }
        boolean isType = q.isType(C8275a.f22377j);
        C13479a.m54764b("DocumentBrowserConfigs", "Create plugins, isWiki: " + isType + ", type: " + str);
        if (isType) {
            return m17997c(eVar, str);
        }
        return mo17012a(eVar, str);
    }

    /* renamed from: d */
    private static C4946h m17998d(C4943e eVar, String str) {
        return C11924c.m49441a(eVar);
    }

    /* renamed from: e */
    private static C4946h m17999e(C4943e eVar, String str) {
        return C4946h.m20451a(((WikiPluginsProvider) KoinJavaComponent.m268610a(WikiPluginsProvider.class)).mo17011a(eVar), ((AbstractC12208a) KoinJavaComponent.m268610a(AbstractC12208a.class)).mo30725b(eVar, str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4946h mo17012a(C4943e eVar, String str) {
        return C4946h.m20451a(C4362j.m18003a(eVar.mo19562e(), eVar), mo30725b(eVar, str)).mo19571a(PluginMountStrategy.FirstJSCall);
    }

    /* renamed from: c */
    private static C4946h m17997c(C4943e eVar, String str) {
        boolean c = ((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21071c(eVar);
        C13479a.m54764b("DocumentBrowserConfigs", "createWikiPlugins, isWikiVersionV2: " + c);
        if (c) {
            return m17999e(eVar, str);
        }
        return m17998d(eVar, str);
    }

    /* renamed from: b */
    private C4946h mo30725b(C4943e eVar, String str) {
        if (C8275a.f22371d.mo32553a().equals(str) || C8275a.f22378k.mo32553a().equals(str)) {
            return C4360h.m17993a(eVar);
        }
        if (C8275a.f22372e.mo32553a().equals(str)) {
            return C4371p.m18018a(eVar);
        }
        if (C8275a.f22376i.mo32553a().equals(str)) {
            return C4373q.m18020a(eVar);
        }
        if (C8275a.f22374g.mo32553a().equals(str)) {
            return C4364l.m18006a(eVar);
        }
        if (C8275a.f22373f.mo32553a().equals(str)) {
            return C4356e.m17989a(eVar);
        }
        return C4358g.m17992a(eVar);
    }
}
