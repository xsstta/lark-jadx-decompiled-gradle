package com.bytedance.ee.ref.card.meta;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.bytedance.ee.ref.card.p690e.C13538c;
import com.tt.miniapp.util.C67043j;
import com.tt.refer.common.meta.AbstractC67788b;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.pkg.PackageEntity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class CardMetaFetcher extends AbstractC67788b<C13523c.C13524a, CardAppInfo> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardMetaLegalityCheckResultType {
    }

    /* renamed from: com.bytedance.ee.ref.card.meta.CardMetaFetcher$a */
    public interface AbstractC13549a {
        /* renamed from: a */
        void mo50219a(String str, String str2);

        /* renamed from: a */
        void mo50220a(List<CardAppInfo> list);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67788b
    /* renamed from: a */
    public boolean mo50336a(int i) {
        return i != 0;
    }

    public CardMetaFetcher(IAppContext iAppContext) {
        super((C13558b) iAppContext.findServiceByInterface(IAppMetaService.class), iAppContext);
        mo235275a(new C13538c(iAppContext));
    }

    /* renamed from: a */
    public PackageEntity mo50334a(CardAppInfo cardAppInfo) {
        PackageEntity packageEntity = new PackageEntity();
        packageEntity.setAppId(cardAppInfo.getAppId());
        packageEntity.setIdentifier(cardAppInfo.getIdentifier());
        packageEntity.setPackageName(cardAppInfo.getAppVersion());
        packageEntity.setUrls(cardAppInfo.mo50325e());
        packageEntity.setMd5(cardAppInfo.mo50323d());
        packageEntity.setJsonMeta(cardAppInfo.toString());
        return packageEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo50332a(CardAppInfo cardAppInfo, C13523c.C13524a aVar, Context context) {
        if (TextUtils.isEmpty(cardAppInfo.mo50319b()) || C67043j.m261268a(context, cardAppInfo.mo50319b()) <= 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo50335a(final Context context, final List<C13523c.C13524a> list, final AbstractC13549a aVar) {
        this.f170739a.mo235263a(context, list, new IAppMetaService.AbstractC67782a<List<CardAppInfo>>() {
            /* class com.bytedance.ee.ref.card.meta.CardMetaFetcher.C135481 */

            /* renamed from: a */
            public void mo50337a(List<CardAppInfo> list) {
                C13523c.C13524a aVar;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        CardAppInfo cardAppInfo = list.get(i);
                        if (cardAppInfo != null) {
                            if (i < list.size()) {
                                aVar = (C13523c.C13524a) list.get(i);
                            } else {
                                AppBrandLogger.m52829e("card_app_meta", "entities index not match:" + i);
                                aVar = null;
                            }
                            int a = CardMetaFetcher.this.mo50332a(cardAppInfo, aVar, context);
                            if (a == 0) {
                                arrayList.add(cardAppInfo);
                            } else {
                                AppBrandLogger.m52830i("card_app_meta", "requestMetaForBatch success,but not invalide appId is:" + cardAppInfo.getAppId(), "card id:", cardAppInfo.getIdentifier(), " invalideType:", Integer.valueOf(a));
                            }
                        }
                    }
                }
                aVar.mo50220a(arrayList);
            }

            @Override // com.tt.refer.common.meta.IAppMetaService.AbstractC67782a
            /* renamed from: a */
            public void mo50338a(String str, String str2) {
                AppBrandLogger.m52829e("card_app_meta", "requestMetaForBatch failed!", list.toString(), " code:", str, " errorMsg:", str2);
                aVar.mo50219a(str, str2);
            }
        }, 2);
    }
}
