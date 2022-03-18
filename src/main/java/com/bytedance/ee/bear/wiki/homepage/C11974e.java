package com.bytedance.ee.bear.wiki.homepage;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.homepage.WikiCreateTypeSelector;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.e */
public class C11974e {
    /* renamed from: a */
    private static ArrayList<WikiDocument> m49587a(FragmentActivity fragmentActivity) {
        ArrayList<WikiDocument> arrayList = new ArrayList<>();
        List<Document> b = ((C11973d) aj.m5366a(fragmentActivity).mo6005a(C11973d.class)).getBannerList().mo5927b();
        if (b != null) {
            for (Document document : b) {
                if (document instanceof WikiDocument) {
                    arrayList.add((WikiDocument) document);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m49588a(C10917c cVar, FragmentActivity fragmentActivity) {
        C13479a.m54764b("WikiTitleHelper", "startAddWiki");
        WikiCreateTypeSelector.m49553a(cVar, fragmentActivity, new WikiCreateTypeSelector.SelectorResultHandler(fragmentActivity) {
            /* class com.bytedance.ee.bear.wiki.homepage.$$Lambda$e$AfsGpXY6D7_0mT1L1QfCioEEoc */
            public final /* synthetic */ FragmentActivity f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.wiki.homepage.WikiCreateTypeSelector.SelectorResultHandler
            public final void onCreateTypeSelected(int i, String str) {
                C11974e.m270025lambda$AfsGpXY6D7_0mT1L1QfCioEEoc(C10917c.this, this.f$1, i, str);
            }
        });
    }

    /* renamed from: a */
    public static void m49589a(C10917c cVar, FragmentActivity fragmentActivity, int i, String str) {
        C11933b.m49482a("add_page", "navigation_bar", i, -1, -1);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wiki/spacelist/activity").mo17315a("space_list_data", (ArrayList<? extends Parcelable>) m49587a(fragmentActivity)).mo17308a("EXTRA_PAGE_MODE", 1).mo17308a("createDocumentType", i).mo17317a();
        if ("wiki_recent".equals(str)) {
            C11933b.m49478a(cVar, "create_new", (String) null, (String) null, C8275a.m34050a(i));
        }
    }
}
