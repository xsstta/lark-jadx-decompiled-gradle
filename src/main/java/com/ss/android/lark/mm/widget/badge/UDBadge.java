package com.ss.android.lark.mm.widget.badge;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0005\u001f !\"#B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\nJ \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001e\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/UDBadge;", "", "()V", "align", "Lcom/ss/android/lark/mm/widget/badge/UDBadgeAlign;", "drawHelper", "Lcom/ss/android/lark/mm/widget/badge/UDBadge$DrawHelper;", "height", "", "model", "Lcom/ss/android/lark/mm/widget/badge/UDBadge$Model;", "startX", "getStartX", "()F", "startY", "getStartY", "targetX", "targetY", "width", "getMeasuredHeight", "getMeasuredWidth", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setModel", "newModel", "setTargetPoint", "x", "y", "updateBounds", "BadgeType", "Companion", "DrawHelper", "Editor", "Model", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDBadge {

    /* renamed from: b */
    public static final Companion f118808b = new Companion(null);

    /* renamed from: a */
    public final Model f118809a = new Model();

    /* renamed from: c */
    private final DrawHelper f118810c = new DrawHelper();

    /* renamed from: d */
    private float f118811d;

    /* renamed from: e */
    private float f118812e;

    /* renamed from: f */
    private float f118813f;

    /* renamed from: g */
    private float f118814g;

    /* renamed from: h */
    private UDBadgeAlign f118815h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00028\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H&¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0017\u0010\u001a\u001a\u00028\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001dH&¢\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010 \u001a\u00028\u00002\u0006\u0010 \u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010!\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/UDBadge$Editor;", "T", "", "badgeColor", "color", "", "(I)Ljava/lang/Object;", "badgeSize", "size", "", "(F)Ljava/lang/Object;", "badgeType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;", "(Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;)Ljava/lang/Object;", "icon", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/Object;", "iconPadding", "padding", "Landroid/graphics/RectF;", "(Landroid/graphics/RectF;)Ljava/lang/Object;", "innerBorderColor", "borderColor", "innerBorderWidth", "borderWidth", "outerBorderColor", "outerBorderWidth", "text", "", "(Ljava/lang/String;)Ljava/lang/Object;", "textColor", "textSize", "textWidthPadding", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.badge.UDBadge$c */
    public interface Editor<T> {
        /* renamed from: b */
        T mo165709b(float f);

        /* renamed from: b */
        T mo165710b(RectF rectF);

        /* renamed from: b */
        T mo165711b(Drawable drawable);

        /* renamed from: c */
        T mo165712c(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "DOT", "TEXT", "ICON", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum BadgeType {
        UNKNOWN(-1),
        DOT(0),
        TEXT(1),
        ICON(2);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private BadgeType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/UDBadge$Companion;", "", "()V", "DEFAULT_BADGE_SIZE", "", "DEFAULT_ICON_MORE_PADDING", "DEFAULT_TEXT_PADDING", "DEFAULT_TEXT_SIZE", "fromValue", "Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;", "value", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.badge.UDBadge$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BadgeType mo165704a(int i) {
            if (i == 0) {
                return BadgeType.DOT;
            }
            if (i == 1) {
                return BadgeType.TEXT;
            }
            if (i != 2) {
                return BadgeType.UNKNOWN;
            }
            return BadgeType.ICON;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0000R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u000fR\u001a\u0010*\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010-\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001a\u00109\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000fR\u001a\u0010<\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\r\"\u0004\b>\u0010\u000f¨\u0006B"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/UDBadge$Model;", "", "()V", "badgeColor", "", "getBadgeColor", "()Ljava/lang/Integer;", "setBadgeColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "badgeSize", "", "getBadgeSize", "()F", "setBadgeSize", "(F)V", "badgeType", "Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;", "getBadgeType", "()Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;", "setBadgeType", "(Lcom/ss/android/lark/mm/widget/badge/UDBadge$BadgeType;)V", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "iconPadding", "Landroid/graphics/RectF;", "getIconPadding", "()Landroid/graphics/RectF;", "setIconPadding", "(Landroid/graphics/RectF;)V", "innerBorderColor", "getInnerBorderColor", "()I", "setInnerBorderColor", "(I)V", "innerBorderWidth", "getInnerBorderWidth", "setInnerBorderWidth", "outerBorderColor", "getOuterBorderColor", "setOuterBorderColor", "outerBorderWidth", "getOuterBorderWidth", "setOuterBorderWidth", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textColor", "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "textWidthPadding", "getTextWidthPadding", "setTextWidthPadding", "update", "", "newModel", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.badge.UDBadge$d */
    public static class Model {

        /* renamed from: a */
        private BadgeType f118823a = BadgeType.UNKNOWN;

        /* renamed from: b */
        private float f118824b;

        /* renamed from: c */
        private Integer f118825c;

        /* renamed from: d */
        private float f118826d;

        /* renamed from: e */
        private int f118827e;

        /* renamed from: f */
        private float f118828f;

        /* renamed from: g */
        private int f118829g;

        /* renamed from: h */
        private String f118830h;

        /* renamed from: i */
        private float f118831i;

        /* renamed from: j */
        private int f118832j;

        /* renamed from: k */
        private float f118833k;

        /* renamed from: l */
        private Drawable f118834l;

        /* renamed from: m */
        private RectF f118835m;

        /* renamed from: f */
        public final BadgeType mo165724f() {
            return this.f118823a;
        }

        /* renamed from: g */
        public final float mo165727g() {
            return this.f118824b;
        }

        /* renamed from: h */
        public final Integer mo165729h() {
            return this.f118825c;
        }

        /* renamed from: i */
        public final float mo165730i() {
            return this.f118826d;
        }

        /* renamed from: j */
        public final int mo165731j() {
            return this.f118827e;
        }

        /* renamed from: k */
        public final float mo165732k() {
            return this.f118828f;
        }

        /* renamed from: l */
        public final int mo165733l() {
            return this.f118829g;
        }

        /* renamed from: m */
        public final String mo165734m() {
            return this.f118830h;
        }

        /* renamed from: n */
        public final float mo165735n() {
            return this.f118831i;
        }

        /* renamed from: o */
        public final int mo165736o() {
            return this.f118832j;
        }

        /* renamed from: p */
        public final float mo165737p() {
            return this.f118833k;
        }

        /* renamed from: q */
        public final Drawable mo165738q() {
            return this.f118834l;
        }

        /* renamed from: r */
        public final RectF mo165739r() {
            return this.f118835m;
        }

        /* renamed from: a */
        public final void mo165715a(Integer num) {
            this.f118825c = num;
        }

        /* renamed from: c */
        public final void mo165717c(float f) {
            this.f118824b = f;
        }

        /* renamed from: d */
        public final void mo165720d(float f) {
            this.f118826d = f;
        }

        /* renamed from: e */
        public final void mo165722e(float f) {
            this.f118828f = f;
        }

        /* renamed from: a */
        public final void mo165713a(BadgeType badgeType) {
            Intrinsics.checkParameterIsNotNull(badgeType, "<set-?>");
            this.f118823a = badgeType;
        }

        /* renamed from: c */
        public final void mo165718c(RectF rectF) {
            this.f118835m = rectF;
        }

        /* renamed from: d */
        public final void mo165721d(int i) {
            this.f118827e = i;
        }

        /* renamed from: e */
        public final void mo165723e(int i) {
            this.f118829g = i;
        }

        /* renamed from: f */
        public final void mo165725f(float f) {
            this.f118831i = f;
        }

        /* renamed from: g */
        public final void mo165728g(float f) {
            this.f118833k = f;
        }

        /* renamed from: a */
        public final void mo165716a(String str) {
            this.f118830h = str;
        }

        /* renamed from: c */
        public final void mo165719c(Drawable drawable) {
            this.f118834l = drawable;
        }

        /* renamed from: f */
        public final void mo165726f(int i) {
            this.f118832j = i;
        }

        /* renamed from: a */
        public final void mo165714a(Model dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "newModel");
            this.f118823a = dVar.f118823a;
            this.f118824b = dVar.f118824b;
            this.f118825c = dVar.f118825c;
            this.f118826d = dVar.f118826d;
            this.f118827e = dVar.f118827e;
            this.f118828f = dVar.f118828f;
            this.f118829g = dVar.f118829g;
            this.f118830h = dVar.f118830h;
            this.f118831i = dVar.f118831i;
            this.f118832j = dVar.f118832j;
            this.f118833k = dVar.f118833k;
            this.f118834l = dVar.f118834l;
            this.f118835m = dVar.f118835m;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/widget/badge/UDBadge$DrawHelper;", "", "(Lcom/ss/android/lark/mm/widget/badge/UDBadge;)V", "badgeBounds", "Landroid/graphics/RectF;", "bodyPaint", "Landroid/graphics/Paint;", "borderPaint", "iconBounds", "textCoordinate", "Landroid/graphics/PointF;", "textPaint", "calculateBounds", "", "draw", "canvas", "Landroid/graphics/Canvas;", "drawBody", "drawIcon", "drawInnerBorder", "drawOuterBorder", "drawText", "getHeight", "", "getWidth", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.badge.UDBadge$b */
    public final class DrawHelper {

        /* renamed from: b */
        private final Paint f118817b;

        /* renamed from: c */
        private final Paint f118818c;

        /* renamed from: d */
        private final Paint f118819d;

        /* renamed from: e */
        private final RectF f118820e;

        /* renamed from: f */
        private PointF f118821f;

        /* renamed from: g */
        private RectF f118822g;

        /* renamed from: a */
        public final float mo165705a() {
            return this.f118820e.width();
        }

        /* renamed from: b */
        public final float mo165707b() {
            return this.f118820e.height();
        }

        /* renamed from: c */
        public final void mo165708c() {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8 = (float) 2;
            float g = UDBadge.this.f118809a.mo165727g() - (UDBadge.this.f118809a.mo165732k() * f8);
            float i = (UDBadge.this.f118809a.mo165730i() * f8) + (UDBadge.this.f118809a.mo165732k() * f8);
            int i2 = C47146c.f118849a[UDBadge.this.f118809a.mo165724f().ordinal()];
            if (i2 == 1) {
                String m = UDBadge.this.f118809a.mo165734m();
                if (!TextUtils.isEmpty(m)) {
                    this.f118819d.setColor(UDBadge.this.f118809a.mo165736o());
                    this.f118819d.setTextSize(UDBadge.this.f118809a.mo165735n());
                    this.f118819d.setLetterSpacing(0.02f);
                    f2 = this.f118819d.measureText(m);
                    if ((UDBadge.this.f118809a.mo165737p() * f8) + f2 > g) {
                        f = (UDBadge.this.f118809a.mo165737p() * f8) + f2;
                    } else {
                        f = g;
                    }
                } else {
                    f = g;
                    f2 = BitmapDescriptorFactory.HUE_RED;
                }
                RectF rectF = this.f118820e;
                rectF.left = BitmapDescriptorFactory.HUE_RED;
                rectF.top = BitmapDescriptorFactory.HUE_RED;
                rectF.right = f + i;
                rectF.bottom = g + i;
                Paint.FontMetricsInt fontMetricsInt = this.f118819d.getFontMetricsInt();
                PointF pointF = this.f118821f;
                pointF.x = (this.f118820e.centerX() - (f2 / f8)) - 0.5f;
                pointF.y = ((this.f118820e.centerY() - ((float) fontMetricsInt.bottom)) + ((float) ((fontMetricsInt.bottom - fontMetricsInt.top) / 2))) - 0.5f;
            } else if (i2 != 2) {
                RectF rectF2 = this.f118820e;
                rectF2.left = BitmapDescriptorFactory.HUE_RED;
                rectF2.top = BitmapDescriptorFactory.HUE_RED;
                float f9 = g + i;
                rectF2.right = f9;
                rectF2.bottom = f9;
            } else {
                Drawable q = UDBadge.this.f118809a.mo165738q();
                if (q != null) {
                    RectF r = UDBadge.this.f118809a.mo165739r();
                    if (r != null) {
                        f3 = r.top;
                    } else {
                        f3 = BitmapDescriptorFactory.HUE_RED;
                    }
                    RectF r2 = UDBadge.this.f118809a.mo165739r();
                    if (r2 != null) {
                        f4 = r2.bottom;
                    } else {
                        f4 = BitmapDescriptorFactory.HUE_RED;
                    }
                    RectF r3 = UDBadge.this.f118809a.mo165739r();
                    if (r3 != null) {
                        f5 = r3.left;
                    } else {
                        f5 = BitmapDescriptorFactory.HUE_RED;
                    }
                    RectF r4 = UDBadge.this.f118809a.mo165739r();
                    if (r4 != null) {
                        f6 = r4.right;
                    } else {
                        f6 = BitmapDescriptorFactory.HUE_RED;
                    }
                    float f10 = (g - f3) - f4;
                    float intrinsicWidth = ((float) q.getIntrinsicWidth()) * 1.0f;
                    float intrinsicHeight = ((float) q.getIntrinsicHeight()) * 1.0f;
                    if (intrinsicHeight != f10) {
                        f7 = (f10 / intrinsicHeight) * intrinsicWidth;
                    } else {
                        f10 = intrinsicHeight * 1.0f;
                        f7 = intrinsicWidth * 1.0f;
                    }
                    float f11 = f5 + f7 + f6;
                    if (f11 <= g) {
                        f11 = g;
                    }
                    RectF rectF3 = this.f118820e;
                    rectF3.left = BitmapDescriptorFactory.HUE_RED;
                    rectF3.top = BitmapDescriptorFactory.HUE_RED;
                    rectF3.right = f11 + i;
                    rectF3.bottom = g + i;
                    RectF rectF4 = this.f118822g;
                    float f12 = f7 / f8;
                    rectF4.left = this.f118820e.centerX() - f12;
                    float f13 = f10 / f8;
                    rectF4.top = this.f118820e.centerY() - f13;
                    rectF4.right = this.f118820e.centerX() + f12;
                    rectF4.bottom = this.f118820e.centerY() + f13;
                }
            }
        }

        /* renamed from: e */
        private final void m186722e(Canvas canvas) {
            String m = UDBadge.this.f118809a.mo165734m();
            if (m != null) {
                canvas.drawText(m, this.f118821f.x + UDBadge.this.mo165698a(), this.f118821f.y + UDBadge.this.mo165702b(), this.f118819d);
            }
        }

        /* renamed from: a */
        public final void mo165706a(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            m186719b(canvas);
            m186720c(canvas);
            m186721d(canvas);
            if (UDBadge.this.f118809a.mo165724f() == BadgeType.TEXT) {
                m186722e(canvas);
            } else if (UDBadge.this.f118809a.mo165724f() == BadgeType.ICON) {
                m186723f(canvas);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DrawHelper() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            this.f118817b = paint;
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            this.f118818c = paint2;
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            if (Build.VERSION.SDK_INT >= 28) {
                paint3.setTypeface(Typeface.create(paint3.getTypeface(), ParticipantRepo.f117150c, false));
            }
            this.f118819d = paint3;
            this.f118820e = new RectF();
            this.f118821f = new PointF();
            this.f118822g = new RectF();
        }

        /* renamed from: b */
        private final void m186719b(Canvas canvas) {
            this.f118817b.setStyle(Paint.Style.STROKE);
            this.f118817b.setColor(UDBadge.this.f118809a.mo165731j());
            this.f118817b.setStrokeWidth(UDBadge.this.f118809a.mo165730i());
            float f = (float) 2;
            float i = UDBadge.this.f118809a.mo165730i() / f;
            float a = UDBadge.this.mo165698a();
            float b = UDBadge.this.mo165702b();
            RectF rectF = new RectF();
            rectF.left = this.f118820e.left + i + a;
            rectF.top = this.f118820e.top + i + b;
            rectF.right = (this.f118820e.right - i) + a;
            rectF.bottom = (this.f118820e.bottom - i) + b;
            float min = Math.min(rectF.height() / f, rectF.height() / f);
            canvas.drawRoundRect(rectF, min, min, this.f118817b);
        }

        /* renamed from: c */
        private final void m186720c(Canvas canvas) {
            this.f118817b.setStyle(Paint.Style.STROKE);
            this.f118817b.setColor(UDBadge.this.f118809a.mo165733l());
            this.f118817b.setStrokeWidth(UDBadge.this.f118809a.mo165732k());
            float f = (float) 2;
            float k = UDBadge.this.f118809a.mo165732k() / f;
            float a = UDBadge.this.mo165698a();
            float b = UDBadge.this.mo165702b();
            RectF rectF = new RectF();
            rectF.left = this.f118820e.left + k + a;
            rectF.top = this.f118820e.top + k + b;
            rectF.right = (this.f118820e.right - k) + a;
            rectF.bottom = (this.f118820e.bottom - k) + b;
            float min = Math.min(rectF.height() / f, rectF.height() / f);
            canvas.drawRoundRect(rectF, min, min, this.f118817b);
        }

        /* renamed from: d */
        private final void m186721d(Canvas canvas) {
            int i;
            this.f118818c.setStyle(Paint.Style.FILL);
            Paint paint = this.f118818c;
            Integer h = UDBadge.this.f118809a.mo165729h();
            if (h != null) {
                i = h.intValue();
            } else {
                i = 0;
            }
            paint.setColor(i);
            float i2 = UDBadge.this.f118809a.mo165730i() + UDBadge.this.f118809a.mo165732k();
            float a = UDBadge.this.mo165698a();
            float b = UDBadge.this.mo165702b();
            RectF rectF = new RectF();
            rectF.left = this.f118820e.left + i2 + a;
            rectF.top = this.f118820e.top + i2 + b;
            rectF.right = (this.f118820e.right - i2) + a;
            rectF.bottom = (this.f118820e.bottom - i2) + b;
            float f = (float) 2;
            float min = Math.min(rectF.height() / f, rectF.height() / f);
            canvas.drawRoundRect(rectF, min, min, this.f118818c);
        }

        /* renamed from: f */
        private final void m186723f(Canvas canvas) {
            Drawable q = UDBadge.this.f118809a.mo165738q();
            if (q != null) {
                float a = UDBadge.this.mo165698a();
                float b = UDBadge.this.mo165702b();
                Rect rect = new Rect();
                rect.left = (int) (this.f118822g.left + a);
                rect.top = (int) (this.f118822g.top + b);
                rect.right = (int) (this.f118822g.right + a);
                rect.bottom = (int) (this.f118822g.bottom + b);
                q.setBounds(rect);
                q.draw(canvas);
            }
        }
    }

    /* renamed from: b */
    public final float mo165702b() {
        float f = this.f118814g - (this.f118812e / ((float) 2));
        if (f < ((float) 0)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return f;
    }

    /* renamed from: c */
    private final void m186712c() {
        this.f118810c.mo165708c();
        this.f118811d = this.f118810c.mo165705a();
        this.f118812e = this.f118810c.mo165707b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo165698a() {
        /*
            r4 = this;
            com.ss.android.lark.mm.widget.badge.UDBadgeAlign r0 = r4.f118815h
            r1 = 2
            if (r0 != 0) goto L_0x0006
            goto L_0x0021
        L_0x0006:
            int[] r2 = com.ss.android.lark.mm.widget.badge.C47147d.f118850a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            switch(r0) {
                case 1: goto L_0x001c;
                case 2: goto L_0x001c;
                case 3: goto L_0x001c;
                case 4: goto L_0x0012;
                case 5: goto L_0x0012;
                case 6: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0021
        L_0x0012:
            float r0 = r4.f118813f
            float r2 = r4.f118811d
            float r3 = r4.f118812e
            float r1 = (float) r1
            float r3 = r3 / r1
            float r2 = r2 - r3
            goto L_0x0027
        L_0x001c:
            float r0 = r4.f118813f
            float r2 = r4.f118811d
            goto L_0x0025
        L_0x0021:
            float r0 = r4.f118813f
            float r2 = r4.f118811d
        L_0x0025:
            float r1 = (float) r1
            float r2 = r2 / r1
        L_0x0027:
            float r0 = r0 - r2
            r1 = 0
            float r1 = (float) r1
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x002f
            r0 = 0
        L_0x002f:
            return r0
            switch-data {1->0x001c, 2->0x001c, 3->0x001c, 4->0x0012, 5->0x0012, 6->0x0012, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.widget.badge.UDBadge.mo165698a():float");
    }

    /* renamed from: a */
    public final void mo165700a(Canvas canvas) {
        if (canvas != null) {
            this.f118810c.mo165706a(canvas);
        }
    }

    /* renamed from: a */
    public final void mo165701a(Model dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "newModel");
        if (dVar.mo165724f() == BadgeType.UNKNOWN) {
            throw new IllegalArgumentException("BadgeType is unknown, please set first.");
        } else if (dVar.mo165727g() > BitmapDescriptorFactory.HUE_RED) {
            this.f118809a.mo165714a(dVar);
            m186712c();
        } else {
            throw new IllegalArgumentException("BadgeSize is 0, please set first.");
        }
    }

    /* renamed from: a */
    public final void mo165699a(float f, float f2, UDBadgeAlign uDBadgeAlign) {
        this.f118813f = f;
        this.f118814g = f2;
        this.f118815h = uDBadgeAlign;
    }
}
