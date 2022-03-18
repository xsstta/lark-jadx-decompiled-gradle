package com.bytedance.ee.bear.doc.resupdate;

import android.content.Context;
import com.bytedance.ee.log.C13479a;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.c */
public class C5452c implements AbstractC5467g {
    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5467g
    /* renamed from: a */
    public File mo21824a(Context context) {
        return null;
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.AbstractC5467g
    /* renamed from: a */
    public String mo21825a() {
        return "";
    }

    /* renamed from: a */
    public static AbstractC5467g m22107a(String str) {
        str.hashCode();
        if (str.equals("DOC_CHANNEL")) {
            return new C5453d();
        }
        C13479a.m54775e("DefaultResource", "newInstance: empty cause channel " + str + "is invalid");
        return new C5452c();
    }
}
