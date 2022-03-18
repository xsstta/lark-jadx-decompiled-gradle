package com.larksuite.component.ui.badge;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.TextDrawableHelper;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0006J\u0010\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u000fJ\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rXD¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/larksuite/component/ui/badge/BadgeModelBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "colorType", "", "hasBorder", "", "showEllipsis", "text", "", "textColor", "", "textSize", "", "tintColor", "undefine", "build", "Lcom/larksuite/component/ui/badge/BadgeModel;", "getTextColorFormType", "getTintColorFromType", "setBackgroundColor", "color", "setBackgroundColorRes", "colorRes", "setColorType", ShareHitPoint.f121869d, "setHasBorder", "setShowEllipsis", "setText", "setTextColor", "setTextColorRes", "setTextSize", "size", "validColor", "Companion", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.a.d */
public final class BadgeModelBuilder {

    /* renamed from: a */
    public static final Companion f62381a = new Companion(null);

    /* renamed from: b */
    private final long f62382b = -2147483649L;

    /* renamed from: c */
    private String f62383c = "";

    /* renamed from: d */
    private int f62384d = 1;

    /* renamed from: e */
    private boolean f62385e = true;

    /* renamed from: f */
    private long f62386f = -2147483649L;

    /* renamed from: g */
    private long f62387g = -2147483649L;

    /* renamed from: h */
    private boolean f62388h;

    /* renamed from: i */
    private float f62389i = 12.0f;

    /* renamed from: j */
    private final Context f62390j;

    /* renamed from: a */
    private final boolean m91483a(long j) {
        return ((long) Integer.MIN_VALUE) <= j && ((long) Integer.MAX_VALUE) >= j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/badge/BadgeModelBuilder$Companion;", "", "()V", "COLOR_GRAY", "", "COLOR_ORANGE", "COLOR_PINK", "ETC_COUNT", "MULTI_COUNT", "NO_COUNT", "SINGLE_COUNT", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final BadgeModel mo88941a() {
        int i;
        int i2;
        int i3;
        Drawable drawable;
        BadgeModel cVar = new BadgeModel();
        float a = C25653b.m91892a(this.f62390j, this.f62389i);
        int i4 = 0;
        if (!this.f62388h) {
            cVar.mo88927a(this.f62383c);
            cVar.mo88924a(a);
            i = this.f62383c.length();
        } else {
            i = 0;
        }
        if (!this.f62388h) {
            if (i == 1) {
                i4 = 3;
            } else if (i > 1) {
                i4 = 2;
            } else {
                i4 = 1;
            }
        }
        TextDrawableHelper cVar2 = new TextDrawableHelper();
        cVar2.mo89430a(this.f62383c);
        BadgeBackgroundProvider aVar = new BadgeBackgroundProvider(this.f62390j, this.f62389i);
        if (m91483a(this.f62386f)) {
            i2 = (int) this.f62386f;
        } else {
            i2 = m91484b(this.f62384d);
        }
        cVar.mo88925a(i2);
        if (m91483a(this.f62387g)) {
            i3 = (int) this.f62387g;
        } else {
            i3 = m91482a(this.f62390j, this.f62384d);
        }
        if (i4 == 0) {
            drawable = aVar.mo88908a(i3, i2, this.f62385e);
        } else {
            drawable = aVar.mo88909a(i3, cVar2, i4, this.f62385e);
        }
        cVar.mo88926a(drawable);
        cVar.mo88932c(BitmapDescriptorFactory.HUE_RED);
        cVar.mo88929b(BitmapDescriptorFactory.HUE_RED);
        cVar.mo88930b(1);
        return cVar;
    }

    /* renamed from: a */
    public final BadgeModelBuilder mo88942a(int i) {
        BadgeModelBuilder dVar = this;
        dVar.f62384d = i;
        return dVar;
    }

    /* renamed from: a */
    public final BadgeModelBuilder mo88943a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        BadgeModelBuilder dVar = this;
        dVar.f62383c = str;
        return dVar;
    }

    public BadgeModelBuilder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62390j = context;
    }

    /* renamed from: b */
    private final int m91484b(int i) {
        if (i == 0) {
            return ContextCompat.getColor(this.f62390j, R.color.lkui_N00);
        }
        if (i == 1) {
            return ContextCompat.getColor(this.f62390j, R.color.lkui_N00);
        }
        if (i != 2) {
            return ContextCompat.getColor(this.f62390j, R.color.lkui_N00);
        }
        return ContextCompat.getColor(this.f62390j, R.color.lkui_R500);
    }

    /* renamed from: a */
    private final int m91482a(Context context, int i) {
        if (i == 0) {
            return ContextCompat.getColor(context, R.color.lkui_N400);
        }
        if (i == 1) {
            return ContextCompat.getColor(context, R.color.lkui_R500);
        }
        if (i != 2) {
            return ContextCompat.getColor(context, R.color.lkui_N400);
        }
        return ContextCompat.getColor(context, R.color.lkui_R100);
    }
}
