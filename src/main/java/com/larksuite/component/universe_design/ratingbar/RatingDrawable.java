package com.larksuite.component.universe_design.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.appcompat.p017a.p018a.C0215a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u001e"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/RatingDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "context", "Landroid/content/Context;", "starWidth", "", "starPadding", "starDrawable", "bgDrawable", "mKeepOriginColor", "", "(Landroid/content/Context;IIIIZ)V", "getBgDrawable", "Landroid/graphics/drawable/Drawable;", "getStarDrawable", "getTileDrawableByLayerId", "Lcom/larksuite/component/universe_design/ratingbar/TileDrawable;", "id", "scaleStars", "", "scale", "", "setBgDrawable", "drawable", "setStarCount", "count", "setStarDrawable", "setStarPadding", "setStarWidth", "Companion", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.ratingbar.b */
public class RatingDrawable extends LayerDrawable {

    /* renamed from: a */
    public static final Companion f63559a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0003J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002J8\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J0\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J8\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0003J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/RatingDrawable$Companion;", "", "()V", "createClippedLayerDrawableWithTintColor", "Landroid/graphics/drawable/Drawable;", "tileResId", "", "tintColor", "context", "Landroid/content/Context;", "starWidth", "starPadding", "createDrawableByRes", "tileRes", "createLayerDrawableWithTintAttrRes", "tintAttrRes", "mKeepOriginColor", "", "createLayerDrawableWithTintColor", "createScaleDrawable", "getColorFromAttrRes", "attrRes", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.ratingbar.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m92959a(int i, Context context) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
            try {
                return obtainStyledAttributes.getColor(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        /* renamed from: a */
        private final Drawable m92960a(Context context, int i) {
            Drawable b = C0215a.m655b(context, i);
            if (b != null) {
                return b;
            }
            throw new RuntimeException("createDrawableByRes fail for " + i);
        }

        /* renamed from: b */
        private final Drawable m92961b(int i, int i2, Context context, int i3, int i4) {
            TileDrawable dVar = new TileDrawable(m92960a(context, i), i3, i4);
            dVar.mutate();
            if (i2 != -1) {
                dVar.setTint(i2);
            }
            return dVar;
        }

        /* renamed from: a */
        public final Drawable mo91180a(int i, int i2, Context context, int i3, int i4) {
            return new ScaleDrawable(m92961b(i, i2, context, i3, i4), 3, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }

        /* renamed from: b */
        public final Drawable mo91182b(int i, int i2, Context context, boolean z, int i3, int i4) {
            return new ScaleDrawable(mo91181a(i, i2, context, z, i3, i4), 3, 1.0f, BitmapDescriptorFactory.HUE_RED);
        }

        /* renamed from: a */
        public final Drawable mo91181a(int i, int i2, Context context, boolean z, int i3, int i4) {
            int i5;
            if (!z) {
                i5 = m92959a(i2, context);
            } else {
                i5 = -1;
            }
            return m92961b(i, i5, context, i3, i4);
        }
    }

    /* renamed from: a */
    public final Drawable mo91172a() {
        return m92950d(16908288);
    }

    /* renamed from: b */
    public final Drawable mo91176b() {
        return m92950d(16908301);
    }

    /* renamed from: a */
    public final void mo91175a(Drawable drawable) {
        setDrawableByLayerId(16908288, drawable);
    }

    /* renamed from: b */
    public final void mo91178b(Drawable drawable) {
        setDrawableByLayerId(16908301, drawable);
    }

    /* renamed from: a */
    public final void mo91173a(float f) {
        m92950d(16908303).mo91184a(f);
        m92950d(16908301).mo91184a(f);
    }

    /* renamed from: b */
    public final void mo91177b(int i) {
        m92950d(16908288).mo91188c(i);
        m92950d(16908303).mo91188c(i);
        m92950d(16908301).mo91188c(i);
    }

    /* renamed from: c */
    public final void mo91179c(int i) {
        m92950d(16908288).mo91187b(i);
        m92950d(16908303).mo91187b(i);
        m92950d(16908301).mo91187b(i);
    }

    /* renamed from: a */
    public final void mo91174a(int i) {
        m92950d(16908288).mo91186a(i, true);
        m92950d(16908303).mo91185a(i);
        m92950d(16908301).mo91185a(i);
    }

    /* renamed from: d */
    private final TileDrawable m92950d(int i) {
        String str;
        Drawable findDrawableByLayerId = findDrawableByLayerId(i);
        if (i != 16908288) {
            if (i != 16908301 && i != 16908303) {
                throw new NoSuchElementException("Unknown id for getTileDrawableByLayerId");
            } else if (findDrawableByLayerId != null) {
                ScaleDrawable scaleDrawable = (ScaleDrawable) findDrawableByLayerId;
                if (Build.VERSION.SDK_INT >= 23) {
                    Drawable drawable = scaleDrawable.getDrawable();
                    if (drawable != null) {
                        return (TileDrawable) drawable;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.ratingbar.TileDrawable");
                }
                try {
                    if (Build.VERSION.SDK_INT >= 22) {
                        str = "mState";
                    } else {
                        str = "mScaleState";
                    }
                    Field declaredField = scaleDrawable.getClass().getDeclaredField(str);
                    Intrinsics.checkExpressionValueIsNotNull(declaredField, "clipDrawable.javaClass.g…DeclaredField(fieldState)");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(scaleDrawable);
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawable");
                    Intrinsics.checkExpressionValueIsNotNull(declaredField2, "clipState.javaClass.getDeclaredField(\"mDrawable\")");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(obj);
                    if (obj2 != null) {
                        return (TileDrawable) obj2;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.ratingbar.TileDrawable");
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                    throw new IllegalStateException("Fetch drawable fail for getTileDrawableByLayerId");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.ScaleDrawable");
            }
        } else if (findDrawableByLayerId != null) {
            return (TileDrawable) findDrawableByLayerId;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.ratingbar.TileDrawable");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RatingDrawable(android.content.Context r14, int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r13 = this;
            r0 = r13
            java.lang.String r1 = "context"
            r9 = r14
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r1)
            r1 = 3
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            com.larksuite.component.universe_design.ratingbar.b$a r10 = com.larksuite.component.universe_design.ratingbar.RatingDrawable.f63559a
            r4 = -1
            r2 = r10
            r3 = r18
            r5 = r14
            r6 = r19
            r7 = r15
            r8 = r16
            android.graphics.drawable.Drawable r2 = r2.mo91181a(r3, r4, r5, r6, r7, r8)
            r11 = 0
            r1[r11] = r2
            r2 = r10
            r3 = r17
            r6 = r15
            r7 = r16
            android.graphics.drawable.Drawable r2 = r2.mo91180a(r3, r4, r5, r6, r7)
            r12 = 1
            r1[r12] = r2
            r2 = r10
            r6 = r19
            r7 = r15
            android.graphics.drawable.Drawable r2 = r2.mo91182b(r3, r4, r5, r6, r7, r8)
            r3 = 2
            r1[r3] = r2
            r13.<init>(r1)
            r1 = 16908288(0x1020000, float:2.387723E-38)
            r13.setId(r11, r1)
            r1 = 16908303(0x102000f, float:2.387727E-38)
            r13.setId(r12, r1)
            r1 = 16908301(0x102000d, float:2.3877265E-38)
            r13.setId(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.ratingbar.RatingDrawable.<init>(android.content.Context, int, int, int, int, boolean):void");
    }
}
