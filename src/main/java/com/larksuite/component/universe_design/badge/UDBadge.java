package com.larksuite.component.universe_design.badge;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0005\u001f !\"#B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\nJ \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001e\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadge;", "", "()V", "align", "Lcom/larksuite/component/universe_design/badge/UDBadgeAlign;", "drawHelper", "Lcom/larksuite/component/universe_design/badge/UDBadge$DrawHelper;", "height", "", "model", "Lcom/larksuite/component/universe_design/badge/UDBadge$Model;", "startX", "getStartX", "()F", "startY", "getStartY", "targetX", "targetY", "width", "getMeasuredHeight", "getMeasuredWidth", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setModel", "newModel", "setTargetPoint", "x", "y", "updateBounds", "BadgeType", "Companion", "DrawHelper", "Editor", "Model", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDBadge {

    /* renamed from: b */
    public static final Companion f63020b = new Companion(null);

    /* renamed from: a */
    public final Model f63021a = new Model();

    /* renamed from: c */
    private final DrawHelper f63022c = new DrawHelper();

    /* renamed from: d */
    private float f63023d;

    /* renamed from: e */
    private float f63024e;

    /* renamed from: f */
    private float f63025f;

    /* renamed from: g */
    private float f63026g;

    /* renamed from: h */
    private UDBadgeAlign f63027h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00028\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H&¢\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0017\u0010\u001a\u001a\u00028\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001dH&¢\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\"\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006$"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadge$Editor;", "T", "", "badgeColor", "color", "", "(I)Ljava/lang/Object;", "badgeSize", "size", "", "(F)Ljava/lang/Object;", "badgeType", ShareHitPoint.f121869d, "Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;", "(Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;)Ljava/lang/Object;", "icon", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/Object;", "iconPadding", "padding", "Landroid/graphics/RectF;", "(Landroid/graphics/RectF;)Ljava/lang/Object;", "innerBorderColor", "borderColor", "innerBorderWidth", "borderWidth", "outerBorderColor", "outerBorderWidth", "text", "", "(Ljava/lang/String;)Ljava/lang/Object;", "textColor", "textMaxLength", "maxLength", "textSize", "textWidthPadding", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.UDBadge$c */
    public interface Editor<T> {
        /* renamed from: a */
        T mo90207a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "DOT", "TEXT", "ICON", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadge$Companion;", "", "()V", "DEFAULT_BADGE_SIZE", "", "DEFAULT_ICON_MORE_PADDING", "DEFAULT_TEXT_PADDING", "DEFAULT_TEXT_SIZE", "fromValue", "Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;", "value", "", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.UDBadge$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BadgeType mo90202a(int i) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR\u001a\u0010<\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000e¨\u0006B"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadge$Model;", "", "()V", "badgeColor", "", "getBadgeColor", "()I", "setBadgeColor", "(I)V", "badgeSize", "", "getBadgeSize", "()F", "setBadgeSize", "(F)V", "badgeType", "Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;", "getBadgeType", "()Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;", "setBadgeType", "(Lcom/larksuite/component/universe_design/badge/UDBadge$BadgeType;)V", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "iconPadding", "Landroid/graphics/RectF;", "getIconPadding", "()Landroid/graphics/RectF;", "setIconPadding", "(Landroid/graphics/RectF;)V", "innerBorderColor", "getInnerBorderColor", "setInnerBorderColor", "innerBorderWidth", "getInnerBorderWidth", "setInnerBorderWidth", "outerBorderColor", "getOuterBorderColor", "setOuterBorderColor", "outerBorderWidth", "getOuterBorderWidth", "setOuterBorderWidth", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textColor", "getTextColor", "setTextColor", "textMaxLength", "getTextMaxLength", "setTextMaxLength", "textSize", "getTextSize", "setTextSize", "textWidthPadding", "getTextWidthPadding", "setTextWidthPadding", "update", "", "newModel", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.UDBadge$d */
    public static class Model {

        /* renamed from: a */
        private BadgeType f63035a = BadgeType.UNKNOWN;

        /* renamed from: b */
        private float f63036b;

        /* renamed from: c */
        private int f63037c;

        /* renamed from: d */
        private float f63038d;

        /* renamed from: e */
        private int f63039e;

        /* renamed from: f */
        private float f63040f;

        /* renamed from: g */
        private int f63041g;

        /* renamed from: h */
        private String f63042h;

        /* renamed from: i */
        private float f63043i;

        /* renamed from: j */
        private int f63044j;

        /* renamed from: k */
        private float f63045k;

        /* renamed from: l */
        private int f63046l = 3;

        /* renamed from: m */
        private Drawable f63047m;

        /* renamed from: n */
        private RectF f63048n;

        public final BadgeType aj_() {
            return this.f63035a;
        }

        /* renamed from: b */
        public final float mo90215b() {
            return this.f63036b;
        }

        /* renamed from: c */
        public final int mo90219c() {
            return this.f63037c;
        }

        /* renamed from: d */
        public final float mo90222d() {
            return this.f63038d;
        }

        /* renamed from: e */
        public final int mo90225e() {
            return this.f63039e;
        }

        /* renamed from: f */
        public final float mo90228f() {
            return this.f63040f;
        }

        /* renamed from: g */
        public final int mo90229g() {
            return this.f63041g;
        }

        /* renamed from: h */
        public final String mo90230h() {
            return this.f63042h;
        }

        /* renamed from: i */
        public final float mo90231i() {
            return this.f63043i;
        }

        /* renamed from: j */
        public final int mo90232j() {
            return this.f63044j;
        }

        /* renamed from: k */
        public final float mo90233k() {
            return this.f63045k;
        }

        /* renamed from: l */
        public final int mo90234l() {
            return this.f63046l;
        }

        /* renamed from: m */
        public final Drawable mo90235m() {
            return this.f63047m;
        }

        /* renamed from: n */
        public final RectF mo90236n() {
            return this.f63048n;
        }

        /* renamed from: a */
        public final void mo90208a(float f) {
            this.f63036b = f;
        }

        /* renamed from: a */
        public final void mo90209a(int i) {
            this.f63037c = i;
        }

        /* renamed from: b */
        public final void mo90216b(float f) {
            this.f63038d = f;
        }

        /* renamed from: c */
        public final void mo90220c(float f) {
            this.f63040f = f;
        }

        /* renamed from: d */
        public final void mo90223d(float f) {
            this.f63043i = f;
        }

        /* renamed from: e */
        public final void mo90226e(float f) {
            this.f63045k = f;
        }

        /* renamed from: a */
        public final void mo90210a(RectF rectF) {
            this.f63048n = rectF;
        }

        /* renamed from: b */
        public final void mo90217b(int i) {
            this.f63039e = i;
        }

        /* renamed from: c */
        public final void mo90221c(int i) {
            this.f63041g = i;
        }

        /* renamed from: d */
        public final void mo90224d(int i) {
            this.f63044j = i;
        }

        /* renamed from: e */
        public final void mo90227e(int i) {
            this.f63046l = i;
        }

        /* renamed from: a */
        public final void mo90211a(Drawable drawable) {
            this.f63047m = drawable;
        }

        /* renamed from: b */
        public final void mo90218b(String str) {
            this.f63042h = str;
        }

        /* renamed from: a */
        public final void mo90212a(BadgeType badgeType) {
            Intrinsics.checkParameterIsNotNull(badgeType, "<set-?>");
            this.f63035a = badgeType;
        }

        /* renamed from: a */
        public final void mo90213a(Model dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "newModel");
            this.f63035a = dVar.f63035a;
            this.f63036b = dVar.f63036b;
            this.f63037c = dVar.f63037c;
            this.f63038d = dVar.f63038d;
            this.f63039e = dVar.f63039e;
            this.f63040f = dVar.f63040f;
            this.f63041g = dVar.f63041g;
            this.f63042h = dVar.f63042h;
            this.f63043i = dVar.f63043i;
            this.f63044j = dVar.f63044j;
            this.f63045k = dVar.f63045k;
            this.f63046l = dVar.f63046l;
            this.f63047m = dVar.f63047m;
            this.f63048n = dVar.f63048n;
        }
    }

    /* renamed from: c */
    public final float mo90199c() {
        return this.f63023d;
    }

    /* renamed from: d */
    public final float mo90200d() {
        return this.f63024e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/larksuite/component/universe_design/badge/UDBadge$DrawHelper;", "", "(Lcom/larksuite/component/universe_design/badge/UDBadge;)V", "badgeBounds", "Landroid/graphics/RectF;", "bodyPaint", "Landroid/graphics/Paint;", "borderPaint", "iconBounds", "textCoordinate", "Landroid/graphics/PointF;", "textPaint", "calculateBounds", "", "draw", "canvas", "Landroid/graphics/Canvas;", "drawBody", "drawIcon", "drawInnerBorder", "drawOuterBorder", "drawText", "getHeight", "", "getWidth", "universe-ui-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.badge.UDBadge$b */
    public final class DrawHelper {

        /* renamed from: b */
        private final Paint f63029b;

        /* renamed from: c */
        private final Paint f63030c;

        /* renamed from: d */
        private final Paint f63031d;

        /* renamed from: e */
        private final RectF f63032e;

        /* renamed from: f */
        private PointF f63033f;

        /* renamed from: g */
        private RectF f63034g;

        /* renamed from: a */
        public final float mo90203a() {
            return this.f63032e.width();
        }

        /* renamed from: b */
        public final float mo90205b() {
            return this.f63032e.height();
        }

        /* renamed from: c */
        public final void mo90206c() {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8 = (float) 2;
            float b = UDBadge.this.f63021a.mo90215b() - (UDBadge.this.f63021a.mo90228f() * f8);
            float d = (UDBadge.this.f63021a.mo90222d() * f8) + (UDBadge.this.f63021a.mo90228f() * f8);
            int i = C25710a.f63067a[UDBadge.this.f63021a.aj_().ordinal()];
            if (i == 1) {
                String h = UDBadge.this.f63021a.mo90230h();
                if (!TextUtils.isEmpty(h)) {
                    this.f63031d.setColor(UDBadge.this.f63021a.mo90232j());
                    this.f63031d.setTextSize(UDBadge.this.f63021a.mo90231i());
                    this.f63031d.setLetterSpacing(0.02f);
                    f2 = this.f63031d.measureText(h);
                    if ((UDBadge.this.f63021a.mo90233k() * f8) + f2 > b) {
                        f = (UDBadge.this.f63021a.mo90233k() * f8) + f2;
                    } else {
                        f = b;
                    }
                } else {
                    f = b;
                    f2 = BitmapDescriptorFactory.HUE_RED;
                }
                RectF rectF = this.f63032e;
                rectF.left = BitmapDescriptorFactory.HUE_RED;
                rectF.top = BitmapDescriptorFactory.HUE_RED;
                rectF.right = f + d;
                rectF.bottom = b + d;
                Paint.FontMetricsInt fontMetricsInt = this.f63031d.getFontMetricsInt();
                PointF pointF = this.f63033f;
                pointF.x = (this.f63032e.centerX() - (f2 / f8)) - 0.5f;
                pointF.y = ((this.f63032e.centerY() - ((float) fontMetricsInt.descent)) + ((float) ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2))) - 0.5f;
            } else if (i != 2) {
                RectF rectF2 = this.f63032e;
                rectF2.left = BitmapDescriptorFactory.HUE_RED;
                rectF2.top = BitmapDescriptorFactory.HUE_RED;
                float f9 = b + d;
                rectF2.right = f9;
                rectF2.bottom = f9;
            } else {
                Drawable m = UDBadge.this.f63021a.mo90235m();
                if (m != null) {
                    RectF n = UDBadge.this.f63021a.mo90236n();
                    if (n != null) {
                        f3 = n.top;
                    } else {
                        f3 = BitmapDescriptorFactory.HUE_RED;
                    }
                    RectF n2 = UDBadge.this.f63021a.mo90236n();
                    if (n2 != null) {
                        f4 = n2.bottom;
                    } else {
                        f4 = BitmapDescriptorFactory.HUE_RED;
                    }
                    RectF n3 = UDBadge.this.f63021a.mo90236n();
                    if (n3 != null) {
                        f5 = n3.left;
                    } else {
                        f5 = BitmapDescriptorFactory.HUE_RED;
                    }
                    RectF n4 = UDBadge.this.f63021a.mo90236n();
                    if (n4 != null) {
                        f6 = n4.right;
                    } else {
                        f6 = BitmapDescriptorFactory.HUE_RED;
                    }
                    float f10 = (b - f3) - f4;
                    float intrinsicWidth = ((float) m.getIntrinsicWidth()) * 1.0f;
                    float intrinsicHeight = ((float) m.getIntrinsicHeight()) * 1.0f;
                    if (intrinsicHeight != f10) {
                        f7 = (f10 / intrinsicHeight) * intrinsicWidth;
                    } else {
                        f10 = intrinsicHeight * 1.0f;
                        f7 = intrinsicWidth * 1.0f;
                    }
                    float f11 = f5 + f7 + f6;
                    if (f11 <= b) {
                        f11 = b;
                    }
                    RectF rectF3 = this.f63032e;
                    rectF3.left = BitmapDescriptorFactory.HUE_RED;
                    rectF3.top = BitmapDescriptorFactory.HUE_RED;
                    rectF3.right = f11 + d;
                    rectF3.bottom = b + d;
                    RectF rectF4 = this.f63034g;
                    float f12 = f7 / f8;
                    rectF4.left = this.f63032e.centerX() - f12;
                    float f13 = f10 / f8;
                    rectF4.top = this.f63032e.centerY() - f13;
                    rectF4.right = this.f63032e.centerX() + f12;
                    rectF4.bottom = this.f63032e.centerY() + f13;
                }
            }
        }

        /* renamed from: e */
        private final void m92385e(Canvas canvas) {
            String h = UDBadge.this.f63021a.mo90230h();
            if (h != null) {
                canvas.drawText(h, this.f63033f.x + UDBadge.this.mo90194a(), this.f63033f.y + UDBadge.this.mo90198b(), this.f63031d);
            }
        }

        /* renamed from: a */
        public final void mo90204a(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            m92382b(canvas);
            m92383c(canvas);
            m92384d(canvas);
            if (UDBadge.this.f63021a.aj_() == BadgeType.TEXT) {
                m92385e(canvas);
            } else if (UDBadge.this.f63021a.aj_() == BadgeType.ICON) {
                m92386f(canvas);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DrawHelper() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            this.f63029b = paint;
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            this.f63030c = paint2;
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            if (Build.VERSION.SDK_INT >= 28) {
                paint3.setTypeface(Typeface.create(paint3.getTypeface(), ParticipantRepo.f117150c, false));
            }
            this.f63031d = paint3;
            this.f63032e = new RectF();
            this.f63033f = new PointF();
            this.f63034g = new RectF();
        }

        /* renamed from: b */
        private final void m92382b(Canvas canvas) {
            this.f63029b.setStyle(Paint.Style.STROKE);
            this.f63029b.setColor(UDBadge.this.f63021a.mo90225e());
            this.f63029b.setStrokeWidth(UDBadge.this.f63021a.mo90222d());
            float f = (float) 2;
            float d = UDBadge.this.f63021a.mo90222d() / f;
            float a = UDBadge.this.mo90194a();
            float b = UDBadge.this.mo90198b();
            RectF rectF = new RectF();
            rectF.left = this.f63032e.left + d + a;
            rectF.top = this.f63032e.top + d + b;
            rectF.right = (this.f63032e.right - d) + a;
            rectF.bottom = (this.f63032e.bottom - d) + b;
            float min = Math.min(rectF.height() / f, rectF.height() / f);
            canvas.drawRoundRect(rectF, min, min, this.f63029b);
        }

        /* renamed from: c */
        private final void m92383c(Canvas canvas) {
            this.f63029b.setStyle(Paint.Style.STROKE);
            this.f63029b.setColor(UDBadge.this.f63021a.mo90229g());
            this.f63029b.setStrokeWidth(UDBadge.this.f63021a.mo90228f());
            float f = (float) 2;
            float f2 = UDBadge.this.f63021a.mo90228f() / f;
            float a = UDBadge.this.mo90194a();
            float b = UDBadge.this.mo90198b();
            RectF rectF = new RectF();
            rectF.left = this.f63032e.left + f2 + a;
            rectF.top = this.f63032e.top + f2 + b;
            rectF.right = (this.f63032e.right - f2) + a;
            rectF.bottom = (this.f63032e.bottom - f2) + b;
            float min = Math.min(rectF.height() / f, rectF.height() / f);
            canvas.drawRoundRect(rectF, min, min, this.f63029b);
        }

        /* renamed from: d */
        private final void m92384d(Canvas canvas) {
            this.f63030c.setStyle(Paint.Style.FILL);
            this.f63030c.setColor(UDBadge.this.f63021a.mo90219c());
            float d = UDBadge.this.f63021a.mo90222d() + UDBadge.this.f63021a.mo90228f();
            float a = UDBadge.this.mo90194a();
            float b = UDBadge.this.mo90198b();
            RectF rectF = new RectF();
            rectF.left = this.f63032e.left + d + a;
            rectF.top = this.f63032e.top + d + b;
            rectF.right = (this.f63032e.right - d) + a;
            rectF.bottom = (this.f63032e.bottom - d) + b;
            float f = (float) 2;
            float min = Math.min(rectF.height() / f, rectF.height() / f);
            canvas.drawRoundRect(rectF, min, min, this.f63030c);
        }

        /* renamed from: f */
        private final void m92386f(Canvas canvas) {
            Drawable m = UDBadge.this.f63021a.mo90235m();
            if (m != null) {
                float a = UDBadge.this.mo90194a();
                float b = UDBadge.this.mo90198b();
                Rect rect = new Rect();
                rect.left = (int) (this.f63034g.left + a);
                rect.top = (int) (this.f63034g.top + b);
                rect.right = (int) (this.f63034g.right + a);
                rect.bottom = (int) (this.f63034g.bottom + b);
                m.setBounds(rect);
                m.draw(canvas);
            }
        }
    }

    /* renamed from: b */
    public final float mo90198b() {
        float f = this.f63026g - (this.f63024e / ((float) 2));
        if (f < ((float) 0)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return f;
    }

    /* renamed from: e */
    private final void m92373e() {
        this.f63022c.mo90206c();
        this.f63023d = this.f63022c.mo90203a();
        this.f63024e = this.f63022c.mo90205b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo90194a() {
        /*
            r4 = this;
            com.larksuite.component.universe_design.badge.UDBadgeAlign r0 = r4.f63027h
            r1 = 2
            if (r0 != 0) goto L_0x0006
            goto L_0x0021
        L_0x0006:
            int[] r2 = com.larksuite.component.universe_design.badge.C25711b.f63068a
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
            float r0 = r4.f63025f
            float r2 = r4.f63023d
            float r3 = r4.f63024e
            float r1 = (float) r1
            float r3 = r3 / r1
            float r2 = r2 - r3
            goto L_0x0027
        L_0x001c:
            float r0 = r4.f63025f
            float r2 = r4.f63023d
            goto L_0x0025
        L_0x0021:
            float r0 = r4.f63025f
            float r2 = r4.f63023d
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
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.badge.UDBadge.mo90194a():float");
    }

    /* renamed from: a */
    public final void mo90196a(Canvas canvas) {
        if (canvas != null) {
            this.f63022c.mo90204a(canvas);
        }
    }

    /* renamed from: a */
    public final void mo90197a(Model dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "newModel");
        if (dVar.aj_() == BadgeType.UNKNOWN) {
            throw new IllegalArgumentException("BadgeType is unknown, please set first.");
        } else if (dVar.mo90215b() > BitmapDescriptorFactory.HUE_RED) {
            this.f63021a.mo90213a(dVar);
            m92373e();
        } else {
            throw new IllegalArgumentException("BadgeSize is 0, please set first.");
        }
    }

    /* renamed from: a */
    public final void mo90195a(float f, float f2, UDBadgeAlign uDBadgeAlign) {
        this.f63025f = f;
        this.f63026g = f2;
        this.f63027h = uDBadgeAlign;
    }
}
