package com.bytedance.ee.bear.slide.common.export.p551a;

import android.graphics.Bitmap;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.slide.common.export.a.e */
public class C11402e {
    /* renamed from: a */
    static Bitmap m47354a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap copy = view.getDrawingCache().copy(Bitmap.Config.RGB_565, false);
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return copy;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0013 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        java.lang.System.gc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        r14 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x008d */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m47355a(java.util.List<android.graphics.Bitmap> r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.slide.common.export.p551a.C11402e.m47355a(java.util.List, int, int):android.graphics.Bitmap");
    }
}
