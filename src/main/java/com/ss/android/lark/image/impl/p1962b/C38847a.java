package com.ss.android.lark.image.impl.p1962b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.b.a */
class C38847a {

    /* renamed from: a */
    private final C38848b f99818a;

    /* renamed from: b */
    private final AbstractC38857g f99819b;

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018c A[ADDED_TO_REGION, Catch:{ all -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.image.impl.p1962b.C38852d mo142345a(com.ss.android.lark.image.impl.p1962b.C38849c r18) throws java.io.IOException, java.lang.IllegalStateException {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.image.impl.p1962b.C38847a.mo142345a(com.ss.android.lark.image.impl.b.c):com.ss.android.lark.image.impl.b.d");
    }

    C38847a(C38848b bVar, AbstractC38857g gVar) {
        this.f99818a = bVar;
        this.f99819b = gVar;
    }

    /* renamed from: a */
    private Bitmap m153348a(InputStream inputStream, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* renamed from: a */
    private Bitmap m153347a(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float min = (((float) i) * 1.0f) / ((float) Math.min(width, height));
        return Bitmap.createScaledBitmap(bitmap, (int) (((float) width) * min), (int) (((float) height) * min), false);
    }
}
