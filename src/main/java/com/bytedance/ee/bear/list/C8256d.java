package com.bytedance.ee.bear.list;

import android.text.TextUtils;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.AbstractC5094ag;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineCacheConfig;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.d */
public class C8256d {

    /* renamed from: a */
    private static boolean f22272a;

    /* renamed from: a */
    public static OfflineCacheConfig m33892a() {
        return (OfflineCacheConfig) C4211a.m17514a().mo16532a("offline_cache_config", OfflineCacheConfig.class, new OfflineCacheConfig());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m33895a(Boolean bool) throws Exception {
        C13479a.m54764b("DocCacheHelper", " preloadDrive(): ret:" + bool);
    }

    /* renamed from: a */
    public static void m33894a(C10917c cVar, ArrayList<Document> arrayList) {
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48479c()).mo238001b(new Consumer(arrayList, cVar) {
            /* class com.bytedance.ee.bear.list.$$Lambda$d$4iDSW_NCu4R4vhqHduJStx1nuQ0 */
            public final /* synthetic */ ArrayList f$0;
            public final /* synthetic */ C10917c f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8256d.m33898a(this.f$0, this.f$1, (String) obj);
            }
        }, $$Lambda$d$aLZNmayFtA1thI0woHzKJpZIN94.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m33898a(ArrayList arrayList, C10917c cVar, String str) throws Exception {
        String str2;
        if (!(arrayList == null || arrayList.size() == 0 || !C5084ad.m20847d().mo20038b().mo20041b() || f22272a)) {
            f22272a = true;
            m33892a();
            int min = Math.min(arrayList.size(), m33892a().getRecent_list_preload_clientvar_number());
            ArrayList arrayList2 = new ArrayList();
            ArrayList<DriveOfflineDoc> arrayList3 = new ArrayList<>();
            for (int i = 0; i < min; i++) {
                Document document = (Document) arrayList.get(i);
                if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20316a(Integer.valueOf(document.mo32483t()).intValue())) {
                    arrayList2.add(new OfflineDoc(document.mo32472o(), C8292f.m34185d(document), Integer.valueOf(document.mo32483t()).intValue(), "tab_recent", m33892a().isOnly_wifi()));
                } else if (Integer.valueOf(document.mo32483t()).intValue() == C8275a.f22375h.mo32555b()) {
                    DriveOfflineDoc driveOfflineDoc = new DriveOfflineDoc(document.mo32472o(), document.mo32481s(), document.mo32377C());
                    if (TextUtils.isEmpty(document.mo32395L())) {
                        str2 = "explorer";
                    } else {
                        str2 = document.mo32395L();
                    }
                    arrayList3.add(driveOfflineDoc.mo20395a(str2));
                }
            }
            C13479a.m54764b("DocCacheHelper", "preloadRecentListData offlineDocList: " + arrayList2.size() + "  drives: " + arrayList3.size());
            if (!arrayList2.isEmpty()) {
                cVar.mo41508c(AbstractC5094ag.class).mo238020d(new Function(arrayList2) {
                    /* class com.bytedance.ee.bear.list.$$Lambda$d$xVE5FiBmQQVElRAKurbe_eY80Bc */
                    public final /* synthetic */ List f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return ((AbstractC5094ag) obj).preloadDocsInterval(this.f$0);
                    }
                }).mo238001b($$Lambda$d$KmcNRfLUWZKZy4YXLQ4M4YTHCEA.INSTANCE, $$Lambda$d$dmUXRg7mU1zW4pwj5L4Areppy5U.INSTANCE);
            }
            if (!arrayList3.isEmpty()) {
                ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19646a(1, arrayList3).mo238001b($$Lambda$d$clEyYAbjA4BI3kY7qIavJMHpik.INSTANCE, $$Lambda$d$ufn9G3G88cTs55xKPXxzLf6WPo.INSTANCE);
            }
        }
    }
}
