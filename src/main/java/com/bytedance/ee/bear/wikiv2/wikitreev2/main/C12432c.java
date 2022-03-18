package com.bytedance.ee.bear.wikiv2.wikitreev2.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.wikiv2.home.api.WikiSpaceRepository;
import com.bytedance.ee.bear.wikiv2.route.C12339a;
import com.bytedance.ee.bear.wikiv2.route.WikiRouteBean;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract;
import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.c */
public class C12432c {
    /* renamed from: c */
    public static String[] m51720c(Intent intent) {
        return m51719b(intent);
    }

    /* renamed from: a */
    public static String[] m51718a(Intent intent) {
        return m51719b(intent);
    }

    /* renamed from: b */
    public static String[] m51719b(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("src_token");
            String stringExtra2 = intent.getStringExtra("space_id");
            String stringExtra3 = intent.getStringExtra("dest_token");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3)) {
                return new String[]{stringExtra, stringExtra2, stringExtra3};
            }
        }
        C13479a.m54764b("Wiki_WikiNavigator", "parseShortcutToResult, return null. ");
        return null;
    }

    /* renamed from: a */
    public static void m51715a(String str, String str2) {
        WikiSpaceRepository.m51027a(str).mo238001b(new Consumer(str2) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.main.$$Lambda$c$Hc3bt3fsh3l9cxz1fLePitRgM */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12432c.m51714a(this.f$0, (Document) obj);
            }
        }, $$Lambda$c$RboeMDeV5Y8uL3KlLzXUCbx4h4.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m51714a(String str, Document document) throws Exception {
        WikiTreeActivityContract wikiTreeActivityContract = new WikiTreeActivityContract();
        wikiTreeActivityContract.setSpaceId(document.mo32399O());
        wikiTreeActivityContract.setDocumentToken(str);
        wikiTreeActivityContract.setDocumentName(document.mo32469n());
        wikiTreeActivityContract.setWikiDocument((WikiDocument) document);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wikiv2/treehome/activity").mo17311a(WikiTreeActivityContract.class.getName(), (Parcelable) wikiTreeActivityContract).mo17317a();
    }

    /* renamed from: a */
    public static void m51716a(String str, String str2, String str3, Bundle bundle) {
        if (str == null || str2 == null || str3 == null) {
            C13479a.m54758a("Wiki_WikiNavigator", "navigateToDetailPage failed ---- param contains null");
        }
        String a = C12339a.m51374a(str3, "pages");
        WikiRouteBean wikiRouteBean = new WikiRouteBean(str, str2);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("wiki_version", "2");
        wikiRouteBean.mo40613b(bundle);
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a(a, wikiRouteBean);
    }

    /* renamed from: a */
    public static void m51713a(String str, int i, int i2, Integer num, Bundle bundle) {
        PostCard a = ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/wikiv2/spacelist/activity").mo17314a("src_token", str).mo17308a("src_obj_type", i).mo17308a("EXTRA_PAGE_MODE", i2).mo17307a(bundle);
        if (num != null) {
            a.mo17318b(num.intValue());
        }
        a.mo17317a();
    }
}
