package com.bytedance.ee.bear.wiki.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.loading.DocLoadingPlugin;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.c */
public class C11924c {
    /* renamed from: a */
    public static C4946h m49441a(C4943e eVar) {
        boolean b = m49442b(eVar);
        C13479a.m54764b("WikiPlugins", "enableWikiTreeMenu:" + b);
        return C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) new WikiPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new DocLoadingPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new WikiLoadFailProcessPlugin(), PluginMountStrategy.Immediate), C4946h.m20450a(new WikiTreeMenuPlugin(), b, PluginMountStrategy.Immediate));
    }

    /* renamed from: b */
    private static boolean m49442b(C4943e eVar) {
        boolean z;
        boolean z2;
        boolean z3 = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20781f().f14914a;
        EditorAbility vVar = (EditorAbility) eVar.mo19551b(EditorAbility.class);
        if (vVar.mo24602q().getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        if (vVar.mo24602q().getOpenSource() == DocsOpenSource.chat_tab) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3 || z || z2) {
            return false;
        }
        return true;
    }
}
