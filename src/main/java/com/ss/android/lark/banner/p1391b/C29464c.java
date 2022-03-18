package com.ss.android.lark.banner.p1391b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.banner.entity.AbstractC29476b;
import com.ss.android.lark.banner.entity.BannerCarouselContent;
import com.ss.android.lark.banner.entity.BannerNormalContent;
import com.ss.android.lark.banner.entity.BannerTemplateContent;
import com.ss.android.lark.banner.export.AbstractC29484e;
import com.ss.android.lark.banner.view.BannerCarouselView;
import com.ss.android.lark.banner.view.BannerNormalView;
import com.ss.android.lark.banner.view.BannerTemplateView;
import com.ss.android.lark.banner.view.CarouselBannerListener;
import com.ss.android.lark.banner.view.CarouselItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.banner.b.c */
public class C29464c {
    /* renamed from: a */
    public static View m108428a(Context context, BannerCarouselContent aVar, final AbstractC29484e eVar) {
        List<BannerNormalContent> a = aVar.mo104432a();
        if (CollectionUtils.isEmpty(a)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < a.size()) {
            BannerNormalContent bannerNormalContent = a.get(i);
            arrayList.add(new CarouselItem(bannerNormalContent.mo104376e(), bannerNormalContent.mo104377f(), bannerNormalContent.mo104378g(), bannerNormalContent.mo104379h(), bannerNormalContent.mo104380i(), bannerNormalContent.mo104381j(), bannerNormalContent.mo104382k(), bannerNormalContent.mo104373b(), bannerNormalContent.mo104372a(), bannerNormalContent.mo104386o(), bannerNormalContent.mo104375d(), bannerNormalContent.mo104385n()));
            i++;
            a = a;
        }
        final BannerCarouselView bVar = new BannerCarouselView(context);
        bVar.setCarouselListener(new CarouselBannerListener() {
            /* class com.ss.android.lark.banner.p1391b.C29464c.C294651 */

            @Override // com.ss.android.lark.banner.view.CarouselBannerListener
            /* renamed from: a */
            public void mo104340a() {
                AbstractC29484e eVar = eVar;
                if (eVar != null) {
                    eVar.mo104371b(bVar);
                }
            }

            @Override // com.ss.android.lark.banner.view.CarouselBannerListener
            /* renamed from: a */
            public void mo104341a(View view, String str) {
                AbstractC29484e eVar = eVar;
                if (eVar != null) {
                    eVar.mo104368a(view, str);
                }
            }
        });
        bVar.mo104530a(arrayList);
        return bVar;
    }

    /* renamed from: a */
    public static View m108426a(Context context, BannerNormalContent bannerNormalContent, AbstractC29484e eVar) {
        int i = 2;
        if (bannerNormalContent.mo104387p() != 2) {
            i = 1;
        }
        return new BannerNormalView.C29507b().mo104512a(bannerNormalContent.mo104372a()).mo104515b(bannerNormalContent.mo104373b()).mo104510a(bannerNormalContent.mo104374c()).mo104516c(bannerNormalContent.mo104375d()).mo104517d(bannerNormalContent.mo104376e()).mo104518e(bannerNormalContent.mo104377f()).mo104519f(bannerNormalContent.mo104378g()).mo104520g(bannerNormalContent.mo104379h()).mo104521h(bannerNormalContent.mo104380i()).mo104522i(bannerNormalContent.mo104381j()).mo104523j(bannerNormalContent.mo104382k()).mo104513a(bannerNormalContent.mo104383l()).mo104524k(bannerNormalContent.mo104384m()).mo104525l(bannerNormalContent.mo104385n()).mo104526m(bannerNormalContent.mo104386o()).mo104511a(eVar).mo104514a(context, i);
    }

    /* renamed from: a */
    public static View m108427a(Context context, BannerTemplateContent bannerTemplateContent, AbstractC29484e eVar) {
        BannerTemplateView.Builder h = new BannerTemplateView.Builder().mo104543a(bannerTemplateContent.mo104396c()).mo104546b(bannerTemplateContent.mo104398d()).mo104547c(bannerTemplateContent.mo104411k()).mo104548d(bannerTemplateContent.mo104412l()).mo104550f(bannerTemplateContent.mo104388a()).mo104551g(bannerTemplateContent.mo104394b()).mo104549e(bannerTemplateContent.mo104410j()).mo104542a(bannerTemplateContent.mo104400e()).mo104552h(bannerTemplateContent.mo104402f());
        ArrayList arrayList = new ArrayList();
        List<BannerTemplateContent.BannerTemplateCategoryData> h2 = bannerTemplateContent.mo104406h();
        if (h2 != null && h2.size() > 0) {
            arrayList.addAll(h2);
        }
        if (bannerTemplateContent.mo104408i() != null) {
            arrayList.add(bannerTemplateContent.mo104408i());
        }
        h.mo104544a(arrayList).mo104541a(eVar);
        int i = 1;
        if (bannerTemplateContent.mo104404g() != null) {
            i = bannerTemplateContent.mo104404g().intValue();
        }
        return h.mo104545a(context, i);
    }

    /* renamed from: a */
    public static View m108429a(Context context, String str, AbstractC29476b bVar, AbstractC29484e eVar) {
        if (bVar instanceof BannerNormalContent) {
            if (TextUtils.equals(str, "NORMAL")) {
                return m108426a(context, (BannerNormalContent) bVar, eVar);
            }
        } else if (bVar instanceof BannerTemplateContent) {
            if (TextUtils.equals(str, "TEMPLATE")) {
                return m108427a(context, (BannerTemplateContent) bVar, eVar);
            }
        } else if ((bVar instanceof BannerCarouselContent) && TextUtils.equals(str, "CAROUSEL")) {
            return m108428a(context, (BannerCarouselContent) bVar, eVar);
        }
        return null;
    }
}
