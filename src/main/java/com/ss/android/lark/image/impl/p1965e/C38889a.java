package com.ss.android.lark.image.impl.p1965e;

import android.text.TextUtils;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.image.impl.p1967g.AbstractC38898c;
import com.ss.android.lark.log.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.e.a */
public class C38889a extends AbstractC38898c<PassThroughImage> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.image.impl.p1967g.AbstractC38898c
    /* renamed from: e */
    public String mo142337e() {
        return "PassThroughImageDataFetcher";
    }

    public C38889a(PassThroughImage passThroughImage) {
        super(passThroughImage);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo142336a(PassThroughImage passThroughImage) throws FileNotFoundException {
        String a = C38792a.m153106a().mo142256a(passThroughImage);
        Log.m165389i("PassThroughImageDataFetcher", "load passThrough image, key is:" + passThroughImage.getImageKey() + ", fsUnit:" + passThroughImage.getFsUnit() + ", filePath is:" + a);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new FileInputStream(a);
    }
}
