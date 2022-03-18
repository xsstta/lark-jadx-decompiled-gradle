package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.larksuite.component.openplatform.core.block.C24421i;
import com.larksuite.component.openplatform.core.loader.meta.C24548a;
import com.larksuite.component.openplatform.core.loader.meta.base.C24552b;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24566e;
import com.larksuite.framework.utils.C26246a;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.refer.common.meta.AbstractC67783a;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.meta.fetch.C67803g;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.c */
public class C24564c extends AbstractC67783a<C24560a, C24566e.C24567a> {

    /* renamed from: g */
    private AbstractC67806i<C24560a> f60552g = new C24568f();

    public C24564c(IAppContext iAppContext) {
        super(iAppContext, new C24570g(), new C24552b());
        mo235264a(new C24421i(iAppContext));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87527a(C24560a aVar) {
        if (aVar != null) {
            String a = mo235259a(aVar.getIdentifier(), aVar.mo87517e());
            AppBrandLogger.m52830i("block_app_start_load_meta_service", "saveBlockMetaToMemoryCache success: metaKey is ", a);
            this.f170714c.put(a, aVar);
            return;
        }
        AppBrandLogger.m52829e("block_app_start_load_meta_service", "saveBlockMetaToMemoryCache fail: appMetaInfo not exist!");
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67783a
    /* renamed from: a */
    public String mo50351a(String str, boolean z) {
        if (z) {
            AppBrandLogger.m52830i("block_app_start_load_meta_service", "getStorageFileName->preview mode and appid:" + str);
            return Storage.getStorageFilePrefix("debug_block_meta_" + str);
        }
        AppBrandLogger.m52830i("block_app_start_load_meta_service", "getStorageFileName->current mode and appid:" + str);
        return Storage.getStorageFilePrefix("block_meta_" + str);
    }

    /* renamed from: a */
    public C24560a mo50349a(Context context, C24566e.C24567a aVar) {
        String string = Storage.getStorageByName(context, mo50351a(aVar.getAppId(), mo235265a(aVar.getVersionType()))).getString(aVar.getIdentifier(), "");
        if (TextUtils.isEmpty(string)) {
            AppBrandLogger.m52830i("block_app_start_load_meta_service", String.format("getAppMetaFromLocal->local meta is empty! appId:%s,blockId:%s", aVar.getAppId(), aVar.getIdentifier()));
            return null;
        }
        AbstractC67806i<C24560a> iVar = this.f60552g;
        if (iVar != null) {
            try {
                C24560a b = this.f60552g.mo50346b(iVar.b_(string));
                this.f60552g.mo235305a(b);
                if (b != null) {
                    String a = mo235258a();
                    String f = b.mo87518f();
                    if (!TextUtils.isEmpty(f) && !f.equals(a)) {
                        AppBrandLogger.m52830i("block_app_start_load_meta_service", String.format("meta lang is not match current language ,delete it! appId is:%s,block id :%s", aVar.getAppId(), aVar.getIdentifier()));
                        mo235257b(context, aVar);
                        return null;
                    }
                }
                return b;
            } catch (Exception e) {
                AppBrandLogger.m52829e("block_app_start_load_meta_service", "getAppMetaFromLocal->parser exception:" + e.getMessage());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.refer.common.meta.AbstractC67783a
    /* renamed from: a */
    public C67803g<? extends C67803g.AbstractC67804a> mo50350a(Context context, List<C24566e.C24567a> list) {
        HashMap hashMap = new HashMap();
        for (C24566e.C24567a aVar : list) {
            C24565d dVar = (C24565d) hashMap.get(aVar.getAppId());
            if (dVar == null) {
                dVar = new C24565d(aVar.getAppId(), aVar.getVersionType());
                hashMap.put(aVar.getAppId(), dVar);
            }
            dVar.f60553a.add(aVar.getIdentifier());
            if (!TextUtils.isEmpty(aVar.mo87528a())) {
                dVar.f60554b.put(aVar.getIdentifier(), aVar.mo87528a());
            }
        }
        String a = ((AbstractC67724a) this.f170715d.findServiceByInterface(AbstractC67724a.class)).mo50438a(this.f170715d);
        if (TextUtils.isEmpty(a)) {
            AppBrandLogger.m52829e("block_app_start_load_meta_service", "createMetaRequest>>> meta url is null!");
            return null;
        }
        String format = String.format("https://%s/open-apis/mina/AppExtensionMetas", a);
        AppBrandLogger.m52830i("block_app_start_load_meta_service", "gadget meta url:", format);
        CrossProcessDataEntity f = C67556a.m262949f();
        if (f != null) {
            String str = new C66467o.C66470b(f).f167782h;
            C67803g<? extends C67803g.AbstractC67804a> gVar = new C67803g<>(format, str, mo235258a(), this.f170716e);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("lark_version", C26246a.m94977a(context));
            gVar.mo235311b(hashMap2);
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry != null) {
                    gVar.mo235308a((C67803g.AbstractC67804a) entry.getValue());
                }
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("Cookie", "session=" + str);
            gVar.mo235309a((Map<String, String>) hashMap3);
            return gVar;
        }
        AppBrandLogger.m52829e("block_app_start_load_meta_service", "getAppMetaSync->session id is null!");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50353a(Context context, C24560a aVar) {
        String a = mo235258a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lang", a).put("value", C24548a.m89535a().toJson(aVar));
            Storage.getStorageByName(context, mo50351a(aVar.getAppId(), mo235265a(aVar.getVersionType()))).edit().putString(aVar.getIdentifier(), jSONObject.toString()).apply();
        } catch (Exception e) {
            AppBrandLogger.m52829e("block_app_start_load_meta_service", "saveAppMeta exception:", e.getMessage());
        }
    }
}
