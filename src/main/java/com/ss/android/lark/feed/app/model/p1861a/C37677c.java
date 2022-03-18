package com.ss.android.lark.feed.app.model.p1861a;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.larkconfig.export.p2105c.AbstractC41160a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.feed.app.model.a.c */
public class C37677c implements AbstractC41160a {
    /* renamed from: a */
    public C37673a mo103073b(String str) {
        C37673a aVar = new C37673a();
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("FeedLoadCountConfigHelp", "Feed load config is empty, use default value!");
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                int intValue = parseObject.getInteger("refresh").intValue();
                int intValue2 = parseObject.getInteger("loadmore").intValue();
                int intValue3 = parseObject.getInteger("buffer").intValue();
                aVar.mo138111a(intValue);
                aVar.mo138115c(intValue3);
                aVar.mo138113b(intValue2);
            } catch (Exception e) {
                Log.m165383e("FeedLoadCountConfigHelp", "parse Feed load config fail :" + e.getMessage());
            }
        }
        return aVar;
    }
}
