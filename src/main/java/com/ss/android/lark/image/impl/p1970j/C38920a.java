package com.ss.android.lark.image.impl.p1970j;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.image.entity.C38826d;
import com.ss.android.lark.image.impl.p1967g.AbstractC38898c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.j.a */
public class C38920a extends AbstractC38898c<C38826d> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.image.impl.p1967g.AbstractC38898c
    /* renamed from: e */
    public String mo142337e() {
        return "VideoImageDataFetcher";
    }

    public C38920a(C38826d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo142336a(C38826d dVar) throws FileNotFoundException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a = dVar.mo142327a();
        String a2 = dVar.mo142328a(UIHelper.getContext());
        if (!new File(a2).exists()) {
            Log.m165379d(mo142337e(), "regenerate video cover");
            Bitmap d = ao.m224315d(a);
            if (d != null) {
                a2 = C26311p.m95265a(d, a2);
            } else {
                Log.m165382e("Get video first frame failed");
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        String e = mo142337e();
        Log.m165379d(e, "getResourceStream: cost=" + elapsedRealtime2 + ", coverPath=" + a2 + ", path=" + a);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new FileInputStream(a2);
    }
}
