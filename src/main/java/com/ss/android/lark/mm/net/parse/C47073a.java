package com.ss.android.lark.mm.net.parse;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.net.HttpBaseResponse;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47088k;
import java.lang.reflect.ParameterizedType;

/* renamed from: com.ss.android.lark.mm.net.parse.a */
public final class C47073a {
    /* renamed from: a */
    public static HttpBaseResponse m186343a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HttpBaseResponse httpBaseResponse = new HttpBaseResponse();
        JSONObject a = C47088k.m186459a(str);
        if (a != null) {
            httpBaseResponse.code = a.getIntValue("code");
            httpBaseResponse.data = a.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            httpBaseResponse.isApiResp = true;
        } else {
            httpBaseResponse.code = -1;
            httpBaseResponse.data = str;
            httpBaseResponse.isApiResp = false;
        }
        return httpBaseResponse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> T m186344a(AbstractC47070c cVar, String str) {
        ParameterizedType a;
        if (!(str == 0 || cVar == null || (a = cVar.mo165311a()) == null || a.getActualTypeArguments().length != 1)) {
            try {
                if (((Class) a.getActualTypeArguments()[0]).getName().equals(String.class.getName())) {
                    return str;
                }
            } catch (Exception e) {
                e.printStackTrace();
                C45855f.m181666e("MmRespConvert", "error:" + e.getMessage());
            }
            try {
                return (T) JSON.parseObject(str, a.getActualTypeArguments()[0], new Feature[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
                C45855f.m181666e("MmRespConvert", "error:" + e2.getMessage());
            }
        }
        return null;
    }
}
