package com.larksuite.component.openplatform.core.block;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tt.miniapphost.host.HostDependManager;

/* renamed from: com.larksuite.component.openplatform.core.block.d */
public class C24412d {

    /* renamed from: com.larksuite.component.openplatform.core.block.d$a */
    public static class C24413a {

        /* renamed from: a */
        private final boolean f60243a;

        /* renamed from: b */
        private final boolean f60244b;

        /* renamed from: c */
        private String f60245c;

        /* renamed from: b */
        public boolean mo87212b() {
            return this.f60244b;
        }

        /* renamed from: c */
        public String mo87213c() {
            return this.f60245c;
        }

        /* renamed from: a */
        public boolean mo87211a() {
            return this.f60243a;
        }

        /* renamed from: a */
        public void mo87210a(String str) {
            this.f60245c = str;
        }

        public C24413a(boolean z, boolean z2) {
            this.f60243a = z;
            this.f60244b = z2;
        }
    }

    /* renamed from: a */
    public C24413a mo87208a(Context context, String str) {
        if (HostDependManager.getInst().getFeatureGating("openplatform.block.enable.apicache", false)) {
            AppBrandLogger.m52830i("OP_SDK_BlockInfoAPICache", "check block available status from cache");
            SharedPreferences storageByName = Storage.getStorageByName(context, "BlockInfoAPICache2");
            String string = storageByName.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                JsonObject asJsonObject = new JsonParser().parse(string).getAsJsonObject();
                if (System.currentTimeMillis() - asJsonObject.get("time").getAsLong() < 86400000) {
                    C24413a aVar = new C24413a(true, asJsonObject.get("result").getAsBoolean());
                    aVar.mo87210a(asJsonObject.get("original_result").getAsString());
                    return aVar;
                }
                storageByName.edit().remove(str).apply();
            }
        }
        return new C24413a(false, false);
    }

    /* renamed from: a */
    public void mo87209a(Context context, String str, boolean z, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("result", Boolean.valueOf(z));
        jsonObject.addProperty("original_result", str2);
        jsonObject.addProperty("time", Long.valueOf(System.currentTimeMillis()));
        Storage.getStorageByName(context, "BlockInfoAPICache2").edit().putString(str, jsonObject.toString()).apply();
    }
}
