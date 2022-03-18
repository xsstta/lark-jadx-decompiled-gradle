package com.bytedance.ee.bear.wikiv2.browser.plugin;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.doc.follow.impl.C5438c;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.document.loading.DocLoadingPlugin;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.d */
public class C12211d {
    /* renamed from: a */
    public static C4946h m50843a(C4943e eVar) {
        if (eVar instanceof C6095s) {
            return C4946h.m20451a(m50845b(eVar), m50846c(eVar));
        }
        return m50846c(eVar);
    }

    /* renamed from: a */
    private static boolean m50844a(Bundle bundle) {
        Uri parse;
        String string = bundle.getString("url");
        if (TextUtils.isEmpty(string) || (parse = Uri.parse(string)) == null) {
            return false;
        }
        return TextUtils.equals(parse.getQueryParameter("from"), DocsOpenSource.chat_tab.name());
    }

    /* renamed from: b */
    private static C4946h m50845b(C4943e eVar) {
        return C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) new WikiLoaderPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new DocLoadingPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new WikiLoadFailProcessPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new SetWikiTreeEnablePlugin(), PluginMountStrategy.Immediate));
    }

    /* renamed from: d */
    private static boolean m50847d(C4943e eVar) {
        Bundle arguments = ((FragmentHostAbility) eVar.mo19551b(FragmentHostAbility.class)).mo23794b().getArguments();
        if (!((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20781f().f14914a || C5438c.m22048a(arguments) || m50844a(arguments)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static C4946h m50846c(C4943e eVar) {
        boolean d = m50847d(eVar);
        C13479a.m54764b("WikiPluginsV2", "enableWikiTreeMenu:" + d);
        return C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) new WikiInfoPlugin(), PluginMountStrategy.Immediate), C4946h.m20450a(new WikiTreeMenuPlugin(), d, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new WikiFavoritePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new WikiDeletePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new WikiMakeCopyPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new WikiMultiTaskPlugin(), PluginMountStrategy.Immediate));
    }
}
