package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.larksuite.component.openplatform.core.loader.meta.C24548a;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.refer.common.meta.fetch.AbstractC67806i;
import com.tt.refer.common.meta.fetch.MetaException;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.f */
public class C24568f extends AbstractC67806i<C24560a> {
    /* renamed from: c */
    public C24560a mo50346b(String str) throws MetaException {
        String str2;
        try {
            AppBrandLogger.m52830i("LocalBlockMetaDataParse", "local block meta parser:", str);
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            String asString = asJsonObject.get("lang").getAsString();
            C24560a aVar = (C24560a) C24548a.m89535a().fromJson(asJsonObject.get("value").getAsString(), new TypeToken<C24560a>() {
                /* class com.larksuite.component.openplatform.core.loader.meta.impl.block.C24568f.C245691 */
            }.getType());
            if (aVar != null) {
                aVar.setMetaSource(1);
                aVar.mo87514c(asString);
            }
            return aVar;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(Log.getStackTraceString(e));
            if (TextUtils.isEmpty(str)) {
                str2 = " empty json data!";
            } else {
                str2 = str;
            }
            sb.append(str2);
            String sb2 = sb.toString();
            Object[] objArr = new Object[1];
            StringBuilder sb3 = new StringBuilder();
            sb3.append("LocalBlockMetaDataParser->error:");
            if (TextUtils.isEmpty(str)) {
                str = " empty json dta!";
            }
            sb3.append(str);
            objArr[0] = sb3.toString();
            AppBrandLogger.m52829e("LocalBlockMetaDataParse", objArr);
            throw new MetaException(ErrorCode.META.UNKNOWN + "", sb2);
        }
    }
}
