package com.bytedance.ee.ref.card.meta.p693a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.refer.common.meta.fetch.AbstractC67798b;
import com.tt.refer.common.meta.fetch.MetaException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.ref.card.meta.a.c */
public class C13556c extends AbstractC67798b<List<CardAppInfo>> {
    /* renamed from: a */
    public List<CardAppInfo> mo50346b(String str) throws MetaException {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Gson a = C13551a.m55007a();
                JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    JsonArray asJsonArray = entry.getValue().getAsJsonObject().getAsJsonArray("card_meta");
                    if (asJsonArray == null) {
                        AppBrandLogger.m52830i("card_app_meta", "getAppMetaSync->card metas is empty!");
                    } else {
                        List<CardAppInfo> list = (List) a.fromJson(asJsonArray.toString(), new TypeToken<List<CardAppInfo>>() {
                            /* class com.bytedance.ee.ref.card.meta.p693a.C13556c.C135571 */
                        }.getType());
                        if (list != null) {
                            for (CardAppInfo cardAppInfo : list) {
                                if (cardAppInfo != null) {
                                    cardAppInfo.setMetaSource(2);
                                }
                            }
                            arrayList.addAll(list);
                        }
                    }
                }
                return arrayList;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append(Log.getStackTraceString(e));
                if (TextUtils.isEmpty(str)) {
                    str2 = " empty json dta!";
                } else {
                    str2 = str;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                Object[] objArr = new Object[1];
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getAppMetaSync->onParser error:");
                if (TextUtils.isEmpty(str)) {
                    str = " empty json dta!";
                }
                sb3.append(str);
                objArr[0] = sb3.toString();
                AppBrandLogger.m52829e("card_app_meta", objArr);
                throw new MetaException(ErrorCode.META.UNKNOWN + "", sb2);
            }
        } else {
            AppBrandLogger.m52829e("card_app_meta", "getAppMetaSync->onParser:meta data info is null!");
            throw new MetaException(ErrorCode.META.NULL.getCode(), ErrorCode.META.NULL.getDesc());
        }
    }
}
