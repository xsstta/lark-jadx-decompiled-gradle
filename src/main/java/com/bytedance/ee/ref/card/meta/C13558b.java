package com.bytedance.ee.ref.card.meta;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.bytedance.ee.ref.card.meta.p693a.C13551a;
import com.bytedance.ee.ref.card.meta.p693a.C13554b;
import com.bytedance.ee.ref.card.meta.p693a.C13556c;
import com.bytedance.ee.ref.card.p687b.C13521a;
import com.bytedance.ee.ref.card.p687b.C13523c;
import com.bytedance.ee.ref.card.p690e.C13538c;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.meta.AbstractC67783a;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.meta.fetch.C67801e;
import com.tt.refer.common.meta.fetch.C67803g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.meta.b */
public class C13558b extends AbstractC67783a<CardAppInfo, C13523c.C13524a> {

    /* renamed from: g */
    private AbstractC67806i<CardAppInfo> f35672g = new C13554b();

    public C13558b(IAppContext iAppContext) {
        super(iAppContext, new C13556c(), new C67801e());
        mo235264a(new C13538c(iAppContext));
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67783a
    /* renamed from: a */
    public String mo50351a(String str, boolean z) {
        if (z) {
            AppBrandLogger.m52830i("card_app_start_load_meta_service", "getStorageFileName->preview mode and appid:" + str);
            return Storage.getStorageFilePrefix("debug_card_meta_" + str);
        }
        AppBrandLogger.m52830i("card_app_start_load_meta_service", "getStorageFileName->current mode and appid:" + str);
        return Storage.getStorageFilePrefix("card_meta_" + str);
    }

    /* renamed from: a */
    public CardAppInfo mo50349a(Context context, C13523c.C13524a aVar) {
        String string = Storage.getStorageByName(context, mo50351a(aVar.getAppId(), mo235265a(aVar.getVersionType()))).getString(aVar.getIdentifier(), "");
        if (TextUtils.isEmpty(string)) {
            AppBrandLogger.m52830i("card_app_start_load_meta_service", String.format("getAppMetaFromLocal->local meta is empty! appId:%s,cardId:%s", aVar.getAppId(), aVar.getIdentifier()));
            return null;
        }
        AbstractC67806i<CardAppInfo> iVar = this.f35672g;
        if (iVar != null) {
            try {
                CardAppInfo b = this.f35672g.mo50346b(iVar.b_(string));
                this.f35672g.mo235305a(b);
                if (b != null) {
                    String a = mo235258a();
                    String f = b.mo50327f();
                    if (!TextUtils.isEmpty(f) && !f.equals(a)) {
                        AppBrandLogger.m52830i("card_app_start_load_meta_service", String.format("meta lang is not match current language ,delete it! appid is:%s,card id :%s", aVar.getAppId(), aVar.getIdentifier()));
                        mo235257b(context, aVar);
                        return null;
                    }
                }
                return b;
            } catch (Exception e) {
                AppBrandLogger.m52829e("card_app_start_load_meta_service", "getAppMetaFromLocal->parser exception:" + e.getMessage());
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.tt.refer.common.meta.fetch.g<com.bytedance.ee.ref.card.meta.c> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67783a
    /* renamed from: a */
    public C67803g<C13559c> mo50350a(Context context, List<C13523c.C13524a> list) {
        HashMap hashMap = new HashMap();
        for (C13523c.C13524a aVar : list) {
            C13559c cVar = (C13559c) hashMap.get(aVar.getAppId());
            if (cVar == null) {
                cVar = new C13559c(aVar.getAppId(), aVar.getVersionType());
                cVar.f170768e = aVar.mo50280b();
                hashMap.put(aVar.getAppId(), cVar);
            }
            cVar.mo50355a(aVar.getIdentifier());
        }
        String a = C13521a.m54927a().mo50285a();
        CrossProcessDataEntity f = C67556a.m262949f();
        if (f != null) {
            String str = new C66467o.C66470b(f).f167782h;
            String a2 = mo235258a();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("need_card_info", true);
            hashMap2.put("need_pc_mini", false);
            hashMap2.put("need_mobile_mini", false);
            C67803g<C13559c> gVar = new C67803g<>(a, str, a2, this.f170716e);
            gVar.mo235311b(hashMap2);
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry != null) {
                    gVar.mo235308a((C13559c) ((C67803g.AbstractC67804a) entry.getValue()));
                }
            }
            return gVar;
        }
        AppBrandLogger.m52829e("card_app_start_load_meta_service", "getAppMetaSync->sessionid is null!");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50353a(Context context, CardAppInfo cardAppInfo) {
        String a = mo235258a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("encryKey", this.f170716e.f167668a).put("encryIV", this.f170716e.f167669b).put("lang", a).put("value", C13551a.m55007a().toJson(cardAppInfo));
            Storage.getStorageByName(context, mo50351a(cardAppInfo.getAppId(), mo235265a(cardAppInfo.getVersionType()))).edit().putString(cardAppInfo.getIdentifier(), jSONObject.toString()).apply();
        } catch (Exception e) {
            AppBrandLogger.m52829e("card_app_start_load_meta_service", "saveAppMeta exception:", e.getMessage());
        }
    }
}
