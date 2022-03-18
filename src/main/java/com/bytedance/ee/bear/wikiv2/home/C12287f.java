package com.bytedance.ee.bear.wikiv2.home;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectPanelDialog;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.f */
public class C12287f {
    /* renamed from: a */
    public static void m51166a(C10917c cVar, FragmentActivity fragmentActivity) {
        C13479a.m54764b("WikiTitleHelper", "startAddWiki");
        WikiReportV2.m50923c("create", "ccm_wiki_create_new_view");
        WikiReportV2.m50922c();
        WikiCreateSelectPanelDialog.m51145a(fragmentActivity, new WikiCreateSelectPanelDialog.ViewDelegate(fragmentActivity) {
            /* class com.bytedance.ee.bear.wikiv2.home.$$Lambda$f$7EG9fZTcEvYsTpUjGVBtqT_EU */
            public final /* synthetic */ FragmentActivity f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectPanelDialog.ViewDelegate
            public final void onSelected(int i) {
                C12287f.m51168b(C10917c.this, this.f$1, i);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m51168b(C10917c cVar, FragmentActivity fragmentActivity, int i) {
        WikiReportV2.m50928e(WikiReportV2.Utils.m50929a(i), "ccm_wiki_file_location_select_view");
        m51167a(cVar, fragmentActivity, i);
    }

    /* renamed from: a */
    private static void m51167a(C10917c cVar, FragmentActivity fragmentActivity, int i) {
        C12237b.m50899a("add_page", "navigation_bar", i, -1, -1);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wikiv2/spacelist/activity").mo17315a("space_list_data", (ArrayList<? extends Parcelable>) WikiHomeViewModel.get(fragmentActivity).getSpaceList()).mo17308a("EXTRA_PAGE_MODE", 1).mo17308a("createDocumentType", i).mo17317a();
    }
}
