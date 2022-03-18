package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.reflect.TypeToken;
import com.larksuite.component.openplatform.core.loader.meta.C24548a;
import com.larksuite.component.openplatform.core.loader.meta.base.AbstractC24551a;
import com.larksuite.component.openplatform.core.loader.meta.base.ApplicationMeta;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.refer.common.meta.fetch.MetaException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.g */
public class C24570g extends AbstractC24551a<List<C24560a>> {
    /* renamed from: c */
    public List<C24560a> mo50346b(String str) throws MetaException {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            try {
                List<ApplicationMeta> list = (List) C24548a.m89535a().fromJson(str, new TypeToken<List<ApplicationMeta>>() {
                    /* class com.larksuite.component.openplatform.core.loader.meta.impl.block.C24570g.C245711 */
                }.getType());
                if (list != null && !list.isEmpty()) {
                    for (ApplicationMeta applicationMeta : list) {
                        if (applicationMeta != null) {
                            arrayList.addAll(C24560a.m89577a(applicationMeta));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                AppBrandLogger.m52829e("NetBlockMetaDataParser", "block list is empty");
                throw new MetaException(ErrorCode.META.META_INVALID + "", ErrorCode.META.META_INVALID.getDesc() + " block list is empty");
            } catch (Exception e) {
                if (!(e instanceof MetaException)) {
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
                    sb3.append("NetBlockMetaDataParser->onParser error:");
                    if (TextUtils.isEmpty(str)) {
                        str = " empty json dta!";
                    }
                    sb3.append(str);
                    objArr[0] = sb3.toString();
                    AppBrandLogger.m52829e("NetBlockMetaDataParser", objArr);
                    throw new MetaException(ErrorCode.META.UNKNOWN + "", sb2);
                }
                throw e;
            }
        } else {
            AppBrandLogger.m52829e("NetBlockMetaDataParser", "NetBlockMetaDataParser->onParser:meta data info is null!");
            throw new MetaException(ErrorCode.META.NULL.getCode(), ErrorCode.META.NULL.getDesc());
        }
    }
}
