package com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.widget.photo_picker.animation.activity_transition.a.c */
public class C58589c {
    /* renamed from: a */
    public static Thread m227242a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: a */
    private static String m227241a(final Context context, final Bitmap bitmap) {
        String str = context.getFilesDir().getAbsolutePath() + "/activity_transition/";
        new File(str).mkdirs();
        final File file = new File(str, "activity_transition_image.png");
        String absolutePath = file.getAbsolutePath();
        m227242a(new Thread(new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58589c.RunnableC585901 */

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
                if (r0.booleanValue() == false) goto L_0x008d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
                if (r0.booleanValue() == false) goto L_0x008d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
                if (r0.booleanValue() == false) goto L_0x008d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
                com.ss.android.lark.log.Log.m165390i("Transition", "fail save image", r2);
             */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ all -> 0x0051 }] */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0092 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 177
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.animation.activity_transition.p2946a.C58589c.RunnableC585901.run():void");
            }
        })).start();
        return absolutePath;
    }

    /* renamed from: a */
    public static Bundle m227240a(Context context, ActivityTransitionLauncher.LocationInfo locationInfo, Bitmap bitmap, int[] iArr) {
        String str;
        int i;
        if (bitmap != null) {
            C58587b.f144672b = new WeakReference<>(bitmap);
            str = m227241a(context, bitmap);
        } else {
            str = null;
        }
        int i2 = locationInfo.width;
        int i3 = locationInfo.height;
        float f = (float) i2;
        float f2 = (float) i3;
        float f3 = ((float) iArr[0]) / ((float) iArr[1]);
        int[] iArr2 = new int[2];
        if (f / f2 > f3) {
            int i4 = (int) (f / f3);
            iArr2[0] = locationInfo.left;
            iArr2[1] = (locationInfo.top + (i3 / 2)) - (i4 / 2);
            i = i4;
        } else {
            int i5 = (int) (f2 * f3);
            iArr2[1] = locationInfo.top;
            iArr2[0] = (locationInfo.left + (i2 / 2)) - (i5 / 2);
            i = i3;
            i2 = i5;
        }
        return new C58591d(context, iArr2[0], iArr2[1], i2, i, str).mo198600a();
    }
}
