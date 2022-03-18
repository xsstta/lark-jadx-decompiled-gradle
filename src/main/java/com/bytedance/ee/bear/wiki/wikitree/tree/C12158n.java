package com.bytedance.ee.bear.wiki.wikitree.tree;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.route.parcelable.WikiRouteBean;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.p578c.C11927a;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.n */
public class C12158n {
    /* renamed from: a */
    public static String[] m50512a(int i, int i2, Intent intent) {
        if (i != 4097) {
            return null;
        }
        boolean z = true;
        if (i2 != 1 || intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("RESULT_MOVETO_SRC_TOKEN");
        String stringExtra2 = intent.getStringExtra("RESULT_MOVETO_DEST_TOKEN");
        int intExtra = intent.getIntExtra("RESULT_MOVETO_FOLLOW_PARENT_PERM", -1);
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || intExtra == -1) {
            return null;
        }
        String[] strArr = new String[3];
        strArr[0] = stringExtra;
        strArr[1] = stringExtra2;
        if (intExtra != 1) {
            z = false;
        }
        strArr[2] = String.valueOf(z);
        return strArr;
    }

    /* renamed from: a */
    public static void m50510a(C10917c cVar, String str, String str2, HomePage homePage, boolean z) {
        m50511a(cVar, str, str2, homePage, z, null);
    }

    /* renamed from: a */
    public static void m50509a(C10917c cVar, HomePage homePage, String str, String str2, String str3) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wiki/treehome/activity").mo17314a("space_id", homePage.getSpaceId()).mo17314a("obj_token", str).mo17314a("node_name", homePage.getSpaceName()).mo17314a("EXTRA_MOVETO_SRC_PARENT_TOKEN", str3).mo17314a("EXTRA_MOVETO_SRC_TOKEN", str).mo17314a("EXTRA_MOVETO_SRC_AREA_ID", str2).mo17308a("EXTRA_PAGE_MODE", 2).mo17318b(4097).mo17317a();
    }

    /* renamed from: a */
    public static void m50511a(C10917c cVar, String str, String str2, HomePage homePage, boolean z, Bundle bundle) {
        String a = C11927a.m49456a(str2, "pages");
        WikiRouteBean wikiRouteBean = new WikiRouteBean(str, z);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (homePage != null) {
            bundle.putParcelable("home_node", homePage);
        }
        bundle.putString("wiki_version", "1");
        wikiRouteBean.mo40613b(bundle);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(a, wikiRouteBean);
    }
}
