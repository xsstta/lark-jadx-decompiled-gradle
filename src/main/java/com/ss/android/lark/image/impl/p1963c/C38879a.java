package com.ss.android.lark.image.impl.p1963c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.impl.p1967g.AbstractC38898c;
import com.ss.android.lark.log.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.image.impl.c.a */
public class C38879a extends AbstractC38898c<C38824b> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.image.impl.p1967g.AbstractC38898c
    /* renamed from: e */
    public String mo142337e() {
        return "EncryptImageDataFetcher";
    }

    public C38879a(C38824b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo142336a(C38824b bVar) throws FileNotFoundException {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Resource a = C38792a.m153106a().mo142255a(bVar);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (a != null) {
            str = a.mo105845b();
            Trace c = a.mo105846c();
            if (c != null && CollectionUtils.isNotEmpty(c.spans)) {
                ArrayList arrayList = new ArrayList(c.spans);
                arrayList.add(new Trace.Span.C15346a().mo55749a("sdk_cost").mo55748a(Long.valueOf(elapsedRealtime2)).build());
                c = new Trace.C15348a().mo55754a(arrayList).build();
            }
            bVar.mo142314a(c);
            bVar.mo142315a(a.mo105847d());
        } else {
            str = null;
        }
        Log.m165389i("EncryptImageDataFetcher", "load encrypt image, key is:" + bVar.mo142313a() + ", filePath is:" + str + ", collect_trace:" + bVar.mo142321d() + ", contextId:" + bVar.mo142320c());
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new FileInputStream(str);
    }
}
