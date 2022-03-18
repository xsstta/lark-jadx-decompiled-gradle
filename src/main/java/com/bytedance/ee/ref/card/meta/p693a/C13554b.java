package com.bytedance.ee.ref.card.meta.p693a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.meta.fetch.MetaException;

/* renamed from: com.bytedance.ee.ref.card.meta.a.b */
public class C13554b extends AbstractC67806i<CardAppInfo> {
    /* renamed from: a */
    public CardAppInfo mo50346b(String str) throws MetaException {
        String str2;
        try {
            AppBrandLogger.m52830i("card_app_meta", "local card meta parser:", str);
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            asJsonObject.get("encryKey").getAsString();
            asJsonObject.get("encryIV").getAsString();
            String asString = asJsonObject.get("lang").getAsString();
            CardAppInfo cardAppInfo = (CardAppInfo) C13551a.m55007a().fromJson(asJsonObject.get("value").getAsString(), new TypeToken<CardAppInfo>() {
                /* class com.bytedance.ee.ref.card.meta.p693a.C13554b.C135551 */
            }.getType());
            if (cardAppInfo != null) {
                cardAppInfo.setMetaSource(1);
                cardAppInfo.mo50326e(asString);
            }
            return cardAppInfo;
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
            sb3.append("LocalCardMetaDataParser->error:");
            if (TextUtils.isEmpty(str)) {
                str = " empty json dta!";
            }
            sb3.append(str);
            objArr[0] = sb3.toString();
            AppBrandLogger.m52829e("card_app_meta", objArr);
            throw new MetaException(ErrorCode.META.UNKNOWN + "", sb2);
        }
    }
}
