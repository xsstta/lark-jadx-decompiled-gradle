package com.bytedance.ee.bear.notification.db;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.notification.bean.Notification;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.notification.db.a */
public class C10327a {

    /* renamed from: com.bytedance.ee.bear.notification.db.a$a */
    private class C10329a extends TypeReference<List<String>> {
        private C10329a() {
        }
    }

    /* renamed from: a */
    public String mo39436a(Notification.ContentBean contentBean) {
        return JSON.toJSONString(contentBean);
    }

    /* renamed from: a */
    public Notification.ContentBean mo39435a(String str) {
        return (Notification.ContentBean) JSON.parseObject(str, Notification.ContentBean.class);
    }

    /* renamed from: a */
    public String mo39437a(List<String> list) {
        return JSON.toJSONString(list);
    }

    /* renamed from: b */
    public List<String> mo39438b(String str) {
        return (List) JSON.parseObject(str, new C10329a().getType(), new Feature[0]);
    }
}
