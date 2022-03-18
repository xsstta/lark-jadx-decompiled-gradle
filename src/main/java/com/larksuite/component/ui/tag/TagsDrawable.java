package com.larksuite.component.ui.tag;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.TypedValue;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00056789:B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0001H\u0002J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020*H\u0016J\u0012\u00102\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020\u001bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/larksuite/component/ui/tag/TagsDrawable;", "Landroid/graphics/drawable/Drawable;", "builder", "Lcom/larksuite/component/ui/tag/TagsDrawable$Builder;", "(Lcom/larksuite/component/ui/tag/TagsDrawable$Builder;)V", "getBuilder", "()Lcom/larksuite/component/ui/tag/TagsDrawable$Builder;", "iconSize", "", "layoutHeight", "tagBounds", "Ljava/util/HashMap;", "Lcom/larksuite/component/ui/tag/TagsDrawable$TagModel;", "Landroid/graphics/Rect;", "Lkotlin/collections/HashMap;", "tagPadding", "tags", "", "textPadding", "textPaint", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "textPaint$delegate", "Lkotlin/Lazy;", "textSize", "calculateIconTagBounds", "", "tag", "bound", "calculateTagBound", "it", "calculateTextTagBounds", "draw", "canvas", "Landroid/graphics/Canvas;", "drawTag", "equals", "", "other", "", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "hashCode", "resizeIconIfNeed", "drawable", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "updateBounds", "Builder", "Companion", "ScaledIconDrawable", "SimpleGradientDrawable", "TagModel", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.tag.g */
public final class TagsDrawable extends Drawable {

    /* renamed from: a */
    public static final Companion f62950a = new Companion(null);

    /* renamed from: b */
    private float f62951b;

    /* renamed from: c */
    private float f62952c;

    /* renamed from: d */
    private float f62953d;

    /* renamed from: e */
    private float f62954e;

    /* renamed from: f */
    private float f62955f;

    /* renamed from: g */
    private final Lazy f62956g;

    /* renamed from: h */
    private List<TagModel> f62957h;

    /* renamed from: i */
    private HashMap<TagModel, Rect> f62958i;

    /* renamed from: j */
    private final Builder f62959j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001a\u001a\u00020\fH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/ui/tag/TagsDrawable$TagModel;", "", "builder", "Lcom/larksuite/component/ui/tag/TagsDrawable$TagModel$Builder;", "(Lcom/larksuite/component/ui/tag/TagsDrawable$TagModel$Builder;)V", "background", "Landroid/graphics/drawable/Drawable;", "getBackground", "()Landroid/graphics/drawable/Drawable;", "icon", "getIcon", "id", "", "getId", "()I", "order", "getOrder", "text", "", "getText", "()Ljava/lang/String;", "textColor", "getTextColor", "equals", "", "other", "hashCode", "Builder", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.g$e */
    public static final class TagModel {

        /* renamed from: a */
        private final int f62974a;

        /* renamed from: b */
        private final int f62975b;

        /* renamed from: c */
        private final String f62976c;

        /* renamed from: d */
        private final int f62977d;

        /* renamed from: e */
        private final Drawable f62978e;

        /* renamed from: f */
        private final Drawable f62979f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011J\u0006\u0010$\u001a\u00020%J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006&"}, d2 = {"Lcom/larksuite/component/ui/tag/TagsDrawable$TagModel$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "background", "Landroid/graphics/drawable/Drawable;", "getBackground$avatar_badge_release", "()Landroid/graphics/drawable/Drawable;", "setBackground$avatar_badge_release", "(Landroid/graphics/drawable/Drawable;)V", "getContext", "()Landroid/content/Context;", "icon", "getIcon$avatar_badge_release", "setIcon$avatar_badge_release", "id", "", "getId$avatar_badge_release", "()I", "setId$avatar_badge_release", "(I)V", "order", "getOrder$avatar_badge_release", "setOrder$avatar_badge_release", "text", "", "getText$avatar_badge_release", "()Ljava/lang/String;", "setText$avatar_badge_release", "(Ljava/lang/String;)V", "textColor", "getTextColor$avatar_badge_release", "setTextColor$avatar_badge_release", "backgroundColor", "color", "build", "Lcom/larksuite/component/ui/tag/TagsDrawable$TagModel;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.g$e$a */
        public static final class Builder {

            /* renamed from: a */
            private int f62980a = -1;

            /* renamed from: b */
            private int f62981b = 10;

            /* renamed from: c */
            private String f62982c;

            /* renamed from: d */
            private int f62983d = -1;

            /* renamed from: e */
            private Drawable f62984e;

            /* renamed from: f */
            private Drawable f62985f;

            /* renamed from: g */
            private final Context f62986g;

            /* renamed from: a */
            public final int mo90112a() {
                return this.f62980a;
            }

            /* renamed from: b */
            public final int mo90116b() {
                return this.f62981b;
            }

            /* renamed from: c */
            public final String mo90119c() {
                return this.f62982c;
            }

            /* renamed from: d */
            public final int mo90120d() {
                return this.f62983d;
            }

            /* renamed from: e */
            public final Drawable mo90122e() {
                return this.f62984e;
            }

            /* renamed from: f */
            public final Drawable mo90123f() {
                return this.f62985f;
            }

            /* renamed from: g */
            public final TagModel mo90124g() {
                return new TagModel(this);
            }

            /* renamed from: a */
            public final Builder mo90113a(int i) {
                Builder aVar = this;
                aVar.f62980a = i;
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo90117b(int i) {
                Builder aVar = this;
                aVar.f62981b = i;
                return aVar;
            }

            /* renamed from: d */
            public final Builder mo90121d(int i) {
                Builder aVar = this;
                aVar.f62983d = i;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo90115a(String str) {
                Builder aVar = this;
                aVar.f62982c = str;
                return aVar;
            }

            public Builder(Context context) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.f62986g = context;
            }

            /* renamed from: a */
            public final Builder mo90114a(Drawable drawable) {
                Builder aVar = this;
                if (drawable != null) {
                    if (drawable instanceof UDTagsDrawable) {
                        aVar.f62984e = drawable;
                    } else {
                        aVar.f62984e = new ScaledIconDrawable(drawable);
                    }
                }
                return aVar;
            }

            /* renamed from: c */
            public final Builder mo90118c(int i) {
                Builder aVar = this;
                if (aVar.f62985f == null) {
                    SimpleGradientDrawable dVar = new SimpleGradientDrawable();
                    dVar.setShape(0);
                    dVar.setCornerRadius(TagsDrawable.f62950a.mo90090a(aVar.f62986g, 4.0f));
                    aVar.f62985f = dVar;
                }
                Drawable drawable = aVar.f62985f;
                if (drawable != null && (drawable instanceof GradientDrawable)) {
                    ((GradientDrawable) drawable).setColor(i);
                }
                return aVar;
            }
        }

        /* renamed from: a */
        public final int mo90104a() {
            return this.f62974a;
        }

        /* renamed from: b */
        public final int mo90105b() {
            return this.f62975b;
        }

        /* renamed from: c */
        public final String mo90106c() {
            return this.f62976c;
        }

        /* renamed from: d */
        public final int mo90107d() {
            return this.f62977d;
        }

        /* renamed from: e */
        public final Drawable mo90108e() {
            return this.f62978e;
        }

        /* renamed from: f */
        public final Drawable mo90110f() {
            return this.f62979f;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = this.f62975b * 31;
            String str = this.f62976c;
            int i4 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i5 = (((i3 + i) * 31) + this.f62977d) * 31;
            Drawable drawable = this.f62978e;
            if (drawable != null) {
                i2 = drawable.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            Drawable drawable2 = this.f62979f;
            if (drawable2 != null) {
                i4 = drawable2.hashCode();
            }
            return i6 + i4;
        }

        public TagModel(Builder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            this.f62974a = aVar.mo90112a();
            this.f62975b = aVar.mo90116b();
            this.f62976c = aVar.mo90119c();
            this.f62977d = aVar.mo90120d();
            this.f62978e = aVar.mo90122e();
            this.f62979f = aVar.mo90123f();
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                TagModel eVar = (TagModel) obj;
                if (this.f62975b == eVar.f62975b && !(!Intrinsics.areEqual(this.f62976c, eVar.f62976c)) && this.f62977d == eVar.f62977d && !(!Intrinsics.areEqual(this.f62978e, eVar.f62978e)) && !(!Intrinsics.areEqual(this.f62979f, eVar.f62979f))) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.tag.TagsDrawable.TagModel");
        }
    }

    /* renamed from: b */
    private final TextPaint m92288b() {
        return (TextPaint) this.f62956g.getValue();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010$\u001a\u00020\u00002\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u001bJ\b\u0010(\u001a\u0004\u0018\u00010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010-\u001a\u00020\bH\u0016J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000eR>\u0010\u0005\u001a2\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t`\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012¨\u0006."}, d2 = {"Lcom/larksuite/component/ui/tag/TagsDrawable$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constraintList", "Ljava/util/ArrayList;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "Lkotlin/collections/ArrayList;", "getContext", "()Landroid/content/Context;", "iconSize", "", "getIconSize$avatar_badge_release", "()F", "setIconSize$avatar_badge_release", "(F)V", "layoutHeight", "getLayoutHeight$avatar_badge_release", "setLayoutHeight$avatar_badge_release", "tagPadding", "getTagPadding$avatar_badge_release", "setTagPadding$avatar_badge_release", "tags", "", "Lcom/larksuite/component/ui/tag/TagsDrawable$TagModel;", "getTags$avatar_badge_release", "()Ljava/util/List;", "textPadding", "getTextPadding$avatar_badge_release", "setTextPadding$avatar_badge_release", "textSize", "getTextSize$avatar_badge_release", "setTextSize$avatar_badge_release", "addExclusiveConstraint", "constraint", "addTag", "tag", "build", "Lcom/larksuite/component/ui/tag/TagsDrawable;", "equals", "", "other", "hashCode", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.g$a */
    public static final class Builder {

        /* renamed from: a */
        private float f62960a;

        /* renamed from: b */
        private float f62961b;

        /* renamed from: c */
        private float f62962c;

        /* renamed from: d */
        private float f62963d;

        /* renamed from: e */
        private float f62964e;

        /* renamed from: f */
        private final List<TagModel> f62965f = new ArrayList(2);

        /* renamed from: g */
        private final ArrayList<HashSet<Integer>> f62966g = new ArrayList<>();

        /* renamed from: h */
        private final Context f62967h;

        /* renamed from: a */
        public final float mo90076a() {
            return this.f62960a;
        }

        /* renamed from: b */
        public final float mo90080b() {
            return this.f62961b;
        }

        /* renamed from: c */
        public final float mo90082c() {
            return this.f62962c;
        }

        /* renamed from: d */
        public final float mo90083d() {
            return this.f62963d;
        }

        /* renamed from: e */
        public final float mo90084e() {
            return this.f62964e;
        }

        /* renamed from: f */
        public final List<TagModel> mo90086f() {
            return this.f62965f;
        }

        public int hashCode() {
            return ((((((((((0 + Float.valueOf(this.f62960a).hashCode()) * 31) + Float.valueOf(this.f62961b).hashCode()) * 31) + Float.valueOf(this.f62962c).hashCode()) * 31) + Float.valueOf(this.f62963d).hashCode()) * 31) + this.f62965f.hashCode()) * 31) + Float.valueOf(this.f62964e).hashCode();
        }

        /* renamed from: g */
        public final TagsDrawable mo90087g() {
            List<TagModel> list = this.f62965f;
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new C25699a());
            }
            HashSet hashSet = new HashSet();
            int size = this.f62966g.size();
            ArrayList arrayList = new ArrayList();
            for (T t : this.f62965f) {
                T t2 = t;
                boolean contains = hashSet.contains(Integer.valueOf(t2.mo90104a()));
                if (!contains && size > 0) {
                    for (T t3 : this.f62966g) {
                        if (t3.contains(Integer.valueOf(t2.mo90104a()))) {
                            hashSet.addAll(t3);
                            size--;
                        }
                    }
                }
                if (!contains) {
                    arrayList.add(t);
                }
            }
            this.f62965f.clear();
            this.f62965f.addAll(arrayList);
            if (this.f62965f.isEmpty()) {
                return null;
            }
            return new TagsDrawable(this, null);
        }

        /* renamed from: a */
        public final void mo90079a(float f) {
            this.f62960a = f;
        }

        /* renamed from: b */
        public final void mo90081b(float f) {
            this.f62964e = f;
        }

        /* renamed from: a */
        public final Builder mo90077a(TagModel eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "tag");
            Builder aVar = this;
            aVar.f62965f.add(eVar);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo90078a(HashSet<Integer> hashSet) {
            Intrinsics.checkParameterIsNotNull(hashSet, "constraint");
            Builder aVar = this;
            aVar.f62966g.add(hashSet);
            return aVar;
        }

        public Builder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f62967h = context;
            this.f62960a = TagsDrawable.f62950a.mo90090a(context, 12.0f);
            this.f62961b = TagsDrawable.f62950a.mo90090a(context, 4.0f);
            this.f62962c = TagsDrawable.f62950a.mo90090a(context, 18.0f);
            this.f62963d = TagsDrawable.f62950a.mo90090a(context, 4.0f);
            this.f62964e = TagsDrawable.f62950a.mo90090a(context, 18.0f);
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                Builder aVar = (Builder) obj;
                if (this.f62960a == aVar.f62960a && this.f62961b == aVar.f62961b && this.f62962c == aVar.f62962c && this.f62963d == aVar.f62963d && !(!Intrinsics.areEqual(this.f62965f, aVar.f62965f)) && this.f62964e == aVar.f62964e) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.tag.TagsDrawable.Builder");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.g$a$a */
        public static final class C25699a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(t.mo90105b()), Integer.valueOf(t2.mo90105b()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/tag/TagsDrawable$Companion;", "", "()V", "DEFAULT_TAG_ICON_SIZE", "", "DEFAULT_TAG_TEXT_SIZE", "dp2px", "context", "Landroid/content/Context;", "dp", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.g$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float mo90090a(Context context, float f) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/larksuite/component/ui/tag/TagsDrawable$ScaledIconDrawable;", "Landroid/graphics/drawable/Drawable;", "origin", "(Landroid/graphics/drawable/Drawable;)V", "scaledHeight", "", "scaledWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setBounds", "left", "top", "right", "bottom", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setScaledSize", "iconScaledSize", "", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.g$c */
    public static final class ScaledIconDrawable extends Drawable {

        /* renamed from: a */
        private int f62968a;

        /* renamed from: b */
        private int f62969b;

        /* renamed from: c */
        private final Drawable f62970c;

        public int getIntrinsicHeight() {
            return this.f62969b;
        }

        public int getIntrinsicWidth() {
            return this.f62968a;
        }

        public int getOpacity() {
            return this.f62970c.getOpacity();
        }

        public void setAlpha(int i) {
            this.f62970c.setAlpha(i);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.f62970c.setColorFilter(colorFilter);
        }

        public ScaledIconDrawable(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "origin");
            this.f62970c = drawable;
            this.f62968a = drawable.getIntrinsicWidth();
            this.f62969b = drawable.getIntrinsicHeight();
        }

        /* renamed from: a */
        public final void mo90091a(float f) {
            float intrinsicHeight = f / ((float) this.f62970c.getIntrinsicHeight());
            this.f62969b = (int) f;
            this.f62968a = (int) (((float) this.f62970c.getIntrinsicWidth()) * intrinsicHeight);
        }

        public void draw(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            canvas.save();
            canvas.scale(((float) this.f62968a) / ((float) this.f62970c.getIntrinsicWidth()), ((float) this.f62969b) / ((float) this.f62970c.getIntrinsicHeight()), (float) getBounds().left, (float) getBounds().top);
            this.f62970c.draw(canvas);
            canvas.restore();
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            Drawable drawable = this.f62970c;
            drawable.setBounds(i, i2, drawable.getIntrinsicWidth() + i, this.f62970c.getIntrinsicHeight() + i2);
        }
    }

    /* renamed from: a */
    public final Builder mo90067a() {
        return this.f62959j;
    }

    public int hashCode() {
        return this.f62959j.hashCode();
    }

    public int getIntrinsicHeight() {
        return getBounds().height();
    }

    public int getIntrinsicWidth() {
        return getBounds().width();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/ui/tag/TagsDrawable$SimpleGradientDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "()V", "color2", "", "radiu2", "", "shape2", "equals", "", "other", "", "hashCode", "setColor", "", "colorInt", "setCornerRadius", "radius", "setShape", "shape", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.g$d */
    public static final class SimpleGradientDrawable extends GradientDrawable {

        /* renamed from: a */
        private int f62971a;

        /* renamed from: b */
        private float f62972b;

        /* renamed from: c */
        private int f62973c;

        public int hashCode() {
            return (((this.f62971a * 31) + Float.valueOf(this.f62972b).hashCode()) * 31) + this.f62973c;
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setColor(int i) {
            super.setColor(i);
            this.f62973c = i;
        }

        public void setCornerRadius(float f) {
            super.setCornerRadius(f);
            this.f62972b = f;
        }

        public void setShape(int i) {
            super.setShape(i);
            this.f62971a = i;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                SimpleGradientDrawable dVar = (SimpleGradientDrawable) obj;
                if (this.f62971a == dVar.f62971a && this.f62972b == dVar.f62972b && this.f62973c == dVar.f62973c) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.tag.TagsDrawable.SimpleGradientDrawable");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/TextPaint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.g$f */
    static final class C25700f extends Lambda implements Function0<TextPaint> {
        public static final C25700f INSTANCE = new C25700f();

        C25700f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextPaint invoke() {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            textPaint.setAntiAlias(true);
            return textPaint;
        }
    }

    /* renamed from: c */
    private final void m92290c() {
        int i;
        int i2;
        m92288b().setTextSize(this.f62951b);
        List<TagModel> list = this.f62957h;
        if (list != null) {
            i2 = 0;
            i = 0;
            int i3 = 0;
            for (T t : list) {
                Rect rect = new Rect(i3, 0, 0, 0);
                m92287a(t, rect);
                this.f62958i.put(t, rect);
                i3 = (int) (((float) rect.right) + this.f62954e);
                i2 = rect.right;
                i = Math.max(i, rect.bottom);
            }
        } else {
            i2 = 0;
            i = 0;
        }
        setBounds(0, 0, i2, i);
        invalidateSelf();
    }

    /* renamed from: a */
    private final void m92286a(Drawable drawable) {
        if (drawable instanceof ScaledIconDrawable) {
            ((ScaledIconDrawable) drawable).mo90091a(this.f62955f);
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        List<TagModel> list = this.f62957h;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m92285a(canvas, it.next());
            }
        }
    }

    private TagsDrawable(Builder aVar) {
        this.f62959j = aVar;
        this.f62956g = LazyKt.lazy(C25700f.INSTANCE);
        this.f62958i = new HashMap<>(2);
        this.f62951b = aVar.mo90076a();
        this.f62952c = aVar.mo90080b();
        this.f62953d = aVar.mo90082c();
        this.f62954e = aVar.mo90083d();
        this.f62955f = aVar.mo90084e();
        this.f62957h = aVar.mo90086f();
        m92290c();
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            TagsDrawable gVar = (TagsDrawable) obj;
            if (this.f62951b == gVar.f62951b && this.f62952c == gVar.f62952c && this.f62953d == gVar.f62953d && this.f62954e == gVar.f62954e && !(!Intrinsics.areEqual(this.f62957h, gVar.f62957h))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.tag.TagsDrawable");
    }

    public /* synthetic */ TagsDrawable(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    private final void m92287a(TagModel eVar, Rect rect) {
        if (eVar.mo90106c() != null) {
            m92289b(eVar, rect);
        } else if (eVar.mo90108e() != null) {
            m92291c(eVar, rect);
        }
    }

    /* renamed from: b */
    private final void m92289b(TagModel eVar, Rect rect) {
        float f = this.f62953d;
        String c = eVar.mo90106c();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (c != null) {
            Rect rect2 = new Rect();
            m92288b().getTextBounds(c, 0, c.length(), rect2);
            int width = rect2.width();
            int height = rect2.height();
            f2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, ((float) width) + (this.f62952c * ((float) 2)));
            f = Math.max(f, ((float) height) + this.f62952c);
        }
        Drawable f3 = eVar.mo90110f();
        if (f3 != null) {
            int intrinsicWidth = f3.getIntrinsicWidth();
            int intrinsicHeight = f3.getIntrinsicHeight();
            f2 = Math.max(f2, (float) intrinsicWidth);
            f = Math.max(f, (float) intrinsicHeight);
            f3.setBounds(rect.left, rect.top, (int) (((float) rect.left) + f2), (int) (((float) rect.top) + f));
        }
        rect.set(rect.left, rect.top, (int) (((float) rect.left) + f2), (int) (((float) rect.top) + f));
    }

    /* renamed from: a */
    private final void m92285a(Canvas canvas, TagModel eVar) {
        Rect rect = this.f62958i.get(eVar);
        if (rect != null) {
            Drawable f = eVar.mo90110f();
            if (f != null) {
                f.draw(canvas);
            }
            String c = eVar.mo90106c();
            if (c != null) {
                m92288b().setTextSize(this.f62951b);
                m92288b().setColor(eVar.mo90107d());
                float f2 = (m92288b().getFontMetrics().top + m92288b().getFontMetrics().bottom) / ((float) 2);
                if (rect == null) {
                    Intrinsics.throwNpe();
                }
                canvas.drawText(c, (float) rect.centerX(), ((float) rect.centerY()) - f2, m92288b());
            }
            if (eVar.mo90108e() instanceof UDTagsDrawable) {
                canvas.save();
                canvas.translate((float) ((UDTagsDrawable) eVar.mo90108e()).getBounds().left, BitmapDescriptorFactory.HUE_RED);
                eVar.mo90108e().draw(canvas);
                canvas.restore();
                return;
            }
            Drawable e = eVar.mo90108e();
            if (e != null) {
                e.draw(canvas);
            }
        }
    }

    /* renamed from: c */
    private final void m92291c(TagModel eVar, Rect rect) {
        float f = this.f62953d;
        Drawable e = eVar.mo90108e();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (e != null) {
            m92286a(e);
            int intrinsicWidth = e.getIntrinsicWidth();
            int intrinsicHeight = e.getIntrinsicHeight();
            float f3 = (float) intrinsicWidth;
            f2 = Math.max(f3, (float) BitmapDescriptorFactory.HUE_RED);
            float f4 = (float) intrinsicHeight;
            f = Math.max(f4, f);
            rect.set(rect.left, rect.top, rect.left + ((int) f2), rect.top + ((int) f));
            float f5 = (float) 2;
            int i = (int) ((f2 - f3) / f5);
            int i2 = (int) ((f - f4) / f5);
            e.setBounds(rect.left + i, rect.top + i2, rect.right - i, rect.bottom - i2);
        }
        Drawable f6 = eVar.mo90110f();
        if (f6 != null) {
            int intrinsicWidth2 = f6.getIntrinsicWidth();
            int intrinsicHeight2 = f6.getIntrinsicHeight();
            f6.setBounds(rect.left, rect.top, (int) (((float) rect.left) + Math.max(f2, (float) intrinsicWidth2)), (int) (((float) rect.top) + Math.max(f, (float) intrinsicHeight2)));
        }
    }
}
