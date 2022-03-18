package com.bytedance.lark.lynxlib;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.AbstractC2265c;
import com.bytedance.lynx.tasm.ui.imageloader.C19899c;
import com.ss.android.lark.image.transform.AbstractC38925a;
import java.security.MessageDigest;

/* renamed from: com.bytedance.lark.lynxlib.d */
public class C14595d extends AbstractC38925a {

    /* renamed from: a */
    private static final byte[] f38640a = "com.bytedance.ee.ref.card.core.1".getBytes(AbstractC2265c.f7599a);

    /* renamed from: b */
    private C19899c.AbstractC19906c f38641b;

    @Override // com.ss.android.lark.image.transform.AbstractC38925a
    /* renamed from: a */
    public void mo53868a(MessageDigest messageDigest) {
        messageDigest.update(f38640a);
    }

    public C14595d(Context context, C19899c.AbstractC19906c cVar) {
        super(context);
        this.f38641b = cVar;
    }

    /* renamed from: a */
    public Bitmap mo53867a(Bitmap bitmap, int i, int i2) {
        C19899c.AbstractC19906c cVar = this.f38641b;
        if (cVar == null) {
            return bitmap;
        }
        Bitmap a = cVar.mo67408a(bitmap);
        bitmap.recycle();
        return a;
    }
}
