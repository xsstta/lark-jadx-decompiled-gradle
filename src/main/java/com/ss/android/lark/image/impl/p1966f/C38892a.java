package com.ss.android.lark.image.impl.p1966f;

import android.text.TextUtils;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.entity.C38825c;
import com.ss.android.lark.image.impl.p1967g.AbstractC38898c;
import com.ss.android.lark.log.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.f.a */
public class C38892a extends AbstractC38898c<C38825c> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.image.impl.p1967g.AbstractC38898c
    /* renamed from: e */
    public String mo142337e() {
        return "ReactionImageFetcher";
    }

    public C38892a(C38825c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo142336a(C38825c cVar) throws FileNotFoundException {
        String a = C38792a.m153106a().mo142257a(cVar);
        Log.m165389i("ReactionImageFetcher", "load reaction image, key is:" + cVar.mo142325a() + ", path is:" + a);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new FileInputStream(a);
    }
}
