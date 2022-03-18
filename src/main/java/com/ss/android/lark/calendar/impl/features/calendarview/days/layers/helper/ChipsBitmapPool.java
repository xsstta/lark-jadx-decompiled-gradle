package com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.UICallbackExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u001e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool;", "", "factory", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool$BitmapFactory;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool$BitmapFactory;)V", "count", "", "mFactory", "mPool", "", "Landroid/graphics/Bitmap;", "[Landroid/graphics/Bitmap;", "maxCount", "regularCleaner", "Ljava/lang/Runnable;", "acquireBitmap", "width", "height", "clear", "", "clearRemainOne", "isContain", "", "bitmap", "prepareBitmap", "num", "returnBitmap", "BitmapFactory", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.b */
public final class ChipsBitmapPool {

    /* renamed from: a */
    public static final Companion f77365a = new Companion(null);

    /* renamed from: b */
    private final BitmapFactory f77366b;

    /* renamed from: c */
    private Bitmap[] f77367c;

    /* renamed from: d */
    private int f77368d;

    /* renamed from: e */
    private int f77369e;

    /* renamed from: f */
    private Runnable f77370f = new RunnableC30785c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool$BitmapFactory;", "", "create", "Landroid/graphics/Bitmap;", "width", "", "height", "maxCount", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.b$a */
    public interface BitmapFactory {
        /* renamed from: a */
        int mo111128a();

        /* renamed from: a */
        Bitmap mo111129a(int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool$Companion;", "", "()V", "TIME_CLEAR", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.a.b$c */
    static final class RunnableC30785c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChipsBitmapPool f77371a;

        RunnableC30785c(ChipsBitmapPool bVar) {
            this.f77371a = bVar;
        }

        public final void run() {
            this.f77371a.mo111343b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo111340a() {
        int length = this.f77367c.length;
        for (int i = 0; i < length; i++) {
            Bitmap bitmap = this.f77367c[i];
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f77367c[i] = null;
        }
        this.f77369e = 0;
        UICallbackExecutor.removeCallbacks(this.f77370f);
    }

    /* renamed from: b */
    public final synchronized void mo111343b() {
        int i = this.f77369e;
        if (i > 1) {
            for (int i2 = i - 1; i2 >= 1; i2--) {
                Bitmap bitmap = this.f77367c[i2];
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f77367c[i2] = null;
            }
            this.f77369e = 1;
        }
    }

    /* renamed from: b */
    private final boolean m114803b(Bitmap bitmap) {
        int i = this.f77369e;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.areEqual(bitmap, this.f77367c[i2])) {
                return true;
            }
        }
        return false;
    }

    public ChipsBitmapPool(BitmapFactory aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "factory");
        int a = aVar.mo111128a();
        this.f77368d = a;
        this.f77369e = 0;
        Bitmap[] bitmapArr = new Bitmap[a];
        for (int i = 0; i < a; i++) {
            bitmapArr[i] = null;
        }
        this.f77367c = bitmapArr;
        this.f77366b = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo111342a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.f77369e >= this.f77368d) {
                bitmap.recycle();
            } else if (!m114803b(bitmap)) {
                Bitmap[] bitmapArr = this.f77367c;
                int i = this.f77369e;
                this.f77369e = i + 1;
                bitmapArr[i] = bitmap;
            }
        }
    }

    /* renamed from: a */
    public final synchronized Bitmap mo111339a(int i, int i2) {
        UICallbackExecutor.removeCallbacks(this.f77370f);
        UICallbackExecutor.executeDelayed(this.f77370f, 5000);
        while (true) {
            int i3 = this.f77369e;
            if (i3 > 0) {
                Bitmap[] bitmapArr = this.f77367c;
                Bitmap bitmap = bitmapArr[i3 - 1];
                int i4 = i3 - 1;
                this.f77369e = i4;
                bitmapArr[i4] = null;
                if (bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                    return bitmap;
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } else {
                return this.f77366b.mo111129a(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo111341a(int i, int i2, int i3) {
        while (true) {
            int i4 = this.f77369e;
            if (i4 < i && i4 < this.f77368d) {
                Bitmap[] bitmapArr = this.f77367c;
                this.f77369e = i4 + 1;
                bitmapArr[i4] = this.f77366b.mo111129a(i2, i3);
            }
        }
    }
}
