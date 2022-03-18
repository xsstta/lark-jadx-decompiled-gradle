package com.ss.android.lark.guide.biz.p1923c;

import android.net.Uri;
import com.ss.android.lark.guide.biz.onboarding.C38597b;
import com.ss.android.lark.sdk.C53241h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.guide.biz.c.b */
public class C38590b {

    /* renamed from: a */
    private static final List<AbstractC38589a> f99145a = new ArrayList<AbstractC38589a>() {
        /* class com.ss.android.lark.guide.biz.p1923c.C38590b.C385911 */

        {
            add(new C38597b());
        }
    };

    /* renamed from: a */
    public static boolean m152191a(Uri uri) {
        int size = f99145a.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC38589a aVar = f99145a.get(i);
                if (aVar != null) {
                    if (aVar.mo141342a(uri)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                C53241h.m205898b("RouterDispatcher", "not find handler to process the uri = " + uri);
            }
        }
        return false;
    }
}
