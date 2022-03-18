package com.larksuite.component.universe_design.tag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
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
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 82\u00020\u0001:\u0005789:;B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020'H\u0016J\u0012\u0010-\u001a\u00020\u001b2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u000e\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "Landroid/graphics/drawable/Drawable;", "builder", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$Builder;", "(Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$Builder;)V", "iconSize", "", "layoutHeight", "tagBounds", "Ljava/util/HashMap;", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "Landroid/graphics/Rect;", "Lkotlin/collections/HashMap;", "tagMaxWidth", "tagMinWidth", "tagPadding", "tags", "", "textPadding", "textPaint", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "textPaint$delegate", "Lkotlin/Lazy;", "textSize", "calculateTagBound", "", "tag", "bound", "draw", "canvas", "Landroid/graphics/Canvas;", "drawTag", "equals", "", "other", "", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "hashCode", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "toTextRight", "textView", "Landroid/widget/TextView;", "toView", "view", "Landroid/view/View;", "updateBounds", "Builder", "Companion", "SimpleGradientDrawable", "TagColorSet", "TagModel", "universe-ui-tag_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDTagsDrawable extends Drawable {

    /* renamed from: a */
    public static final Companion f63643a = new Companion(null);

    /* renamed from: b */
    private final float f63644b;

    /* renamed from: c */
    private final float f63645c;

    /* renamed from: d */
    private final float f63646d;

    /* renamed from: e */
    private final float f63647e;

    /* renamed from: f */
    private final float f63648f;

    /* renamed from: g */
    private final float f63649g;

    /* renamed from: h */
    private final float f63650h;

    /* renamed from: i */
    private final Lazy f63651i;

    /* renamed from: j */
    private List<TagModel> f63652j;

    /* renamed from: k */
    private HashMap<TagModel, Rect> f63653k;

    /* renamed from: l */
    private final Builder f63654l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001!B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010 \u001a\u00020\u0012H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0016\u0010\u001b\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006\""}, d2 = {"Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "", "builder", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel$Builder;", "(Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel$Builder;)V", "background", "Landroid/graphics/drawable/Drawable;", "getBackground", "()Landroid/graphics/drawable/Drawable;", "ellipsizedText", "", "getEllipsizedText$universe_ui_tag_release", "()Ljava/lang/String;", "setEllipsizedText$universe_ui_tag_release", "(Ljava/lang/String;)V", "icon", "getIcon", "iconColor", "", "getIconColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "order", "getOrder", "()I", "text", "getText", "textColor", "getTextColor", "equals", "", "other", "hashCode", "Builder", "universe-ui-tag_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tag.UDTagsDrawable$e */
    public static final class TagModel {

        /* renamed from: a */
        private final int f63667a;

        /* renamed from: b */
        private final String f63668b;

        /* renamed from: c */
        private final int f63669c;

        /* renamed from: d */
        private final Drawable f63670d;

        /* renamed from: e */
        private final Integer f63671e;

        /* renamed from: f */
        private final Drawable f63672f;

        /* renamed from: g */
        private String f63673g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u00020\u00002\b\b\u0001\u0010$\u001a\u00020\u000fJ\u0006\u0010%\u001a\u00020&J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010 \u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019¨\u0006)"}, d2 = {"Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "background", "Landroid/graphics/drawable/Drawable;", "getBackground$universe_ui_tag_release", "()Landroid/graphics/drawable/Drawable;", "setBackground$universe_ui_tag_release", "(Landroid/graphics/drawable/Drawable;)V", "icon", "getIcon$universe_ui_tag_release", "setIcon$universe_ui_tag_release", "iconColor", "", "getIconColor$universe_ui_tag_release", "()Ljava/lang/Integer;", "setIconColor$universe_ui_tag_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "order", "getOrder$universe_ui_tag_release", "()I", "setOrder$universe_ui_tag_release", "(I)V", "text", "", "getText$universe_ui_tag_release", "()Ljava/lang/String;", "setText$universe_ui_tag_release", "(Ljava/lang/String;)V", "textColor", "getTextColor$universe_ui_tag_release", "setTextColor$universe_ui_tag_release", "backgroundColor", "color", "build", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "colorSet", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagColorSet;", "universe-ui-tag_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.tag.UDTagsDrawable$e$a */
        public static final class Builder {

            /* renamed from: a */
            private int f63674a = 10;

            /* renamed from: b */
            private String f63675b;

            /* renamed from: c */
            private int f63676c;

            /* renamed from: d */
            private Drawable f63677d;

            /* renamed from: e */
            private Integer f63678e;

            /* renamed from: f */
            private Drawable f63679f;

            /* renamed from: g */
            private final Context f63680g;

            /* renamed from: a */
            public final int mo91414a() {
                return this.f63674a;
            }

            /* renamed from: b */
            public final String mo91420b() {
                return this.f63675b;
            }

            /* renamed from: c */
            public final int mo91421c() {
                return this.f63676c;
            }

            /* renamed from: d */
            public final Drawable mo91423d() {
                return this.f63677d;
            }

            /* renamed from: e */
            public final Integer mo91425e() {
                return this.f63678e;
            }

            /* renamed from: f */
            public final Drawable mo91426f() {
                return this.f63679f;
            }

            /* renamed from: g */
            public final TagModel mo91427g() {
                Integer num;
                Drawable drawable = this.f63677d;
                if (!(drawable == null || (num = this.f63678e) == null)) {
                    int intValue = num.intValue();
                    drawable.mutate();
                    drawable.setTint(intValue);
                }
                return new TagModel(this);
            }

            /* renamed from: a */
            public final Builder mo91415a(int i) {
                Builder aVar = this;
                aVar.f63674a = i;
                return aVar;
            }

            /* renamed from: c */
            public final Builder mo91422c(int i) {
                Builder aVar = this;
                aVar.f63676c = i;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo91416a(Drawable drawable) {
                Builder aVar = this;
                aVar.f63677d = drawable;
                return aVar;
            }

            /* renamed from: d */
            public final Builder mo91424d(int i) {
                Builder aVar = this;
                aVar.f63678e = Integer.valueOf(i);
                return aVar;
            }

            public Builder(Context context) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                this.f63680g = context;
                this.f63676c = UDColorUtils.getColor(context, R.color.udtoken_tag_neutral_text_inverse);
            }

            /* renamed from: a */
            public final Builder mo91418a(String str) {
                Builder aVar = this;
                aVar.f63675b = str;
                return aVar;
            }

            /* renamed from: a */
            public final Builder mo91417a(TagColorSet tagColorSet) {
                Intrinsics.checkParameterIsNotNull(tagColorSet, "colorSet");
                Builder aVar = this;
                aVar.mo91419b(UDColorUtils.getColor(aVar.f63680g, tagColorSet.getBackgroundColorRes()));
                aVar.mo91422c(UDColorUtils.getColor(aVar.f63680g, tagColorSet.getTextColorRes()));
                aVar.mo91424d(UDColorUtils.getColor(aVar.f63680g, tagColorSet.getIconColorRes()));
                return aVar;
            }

            /* renamed from: b */
            public final Builder mo91419b(int i) {
                Builder aVar = this;
                if (aVar.f63679f == null) {
                    SimpleGradientDrawable dVar = new SimpleGradientDrawable();
                    dVar.setShape(0);
                    dVar.setCornerRadius(UDDimenUtils.m93307a(aVar.f63680g, 4.0f));
                    aVar.f63679f = dVar;
                }
                Drawable drawable = aVar.f63679f;
                if (drawable != null && (drawable instanceof GradientDrawable)) {
                    ((GradientDrawable) drawable).setColor(i);
                }
                return aVar;
            }
        }

        /* renamed from: a */
        public final int mo91405a() {
            return this.f63667a;
        }

        /* renamed from: b */
        public final String mo91407b() {
            return this.f63668b;
        }

        /* renamed from: c */
        public final int mo91408c() {
            return this.f63669c;
        }

        /* renamed from: d */
        public final Drawable mo91409d() {
            return this.f63670d;
        }

        /* renamed from: e */
        public final Drawable mo91410e() {
            return this.f63672f;
        }

        /* renamed from: f */
        public final String mo91412f() {
            return this.f63673g;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = this.f63667a * 31;
            String str = this.f63668b;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (((i4 + i) * 31) + this.f63669c) * 31;
            Drawable drawable = this.f63670d;
            if (drawable != null) {
                i2 = drawable.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            Integer num = this.f63671e;
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            Drawable drawable2 = this.f63672f;
            if (drawable2 != null) {
                i5 = drawable2.hashCode();
            }
            return i8 + i5;
        }

        /* renamed from: a */
        public final void mo91406a(String str) {
            this.f63673g = str;
        }

        public TagModel(Builder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            this.f63667a = aVar.mo91414a();
            this.f63668b = aVar.mo91420b();
            this.f63669c = aVar.mo91421c();
            this.f63670d = aVar.mo91423d();
            this.f63671e = aVar.mo91425e();
            this.f63672f = aVar.mo91426f();
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
                if (this.f63667a == eVar.f63667a && !(!Intrinsics.areEqual(this.f63668b, eVar.f63668b)) && this.f63669c == eVar.f63669c && !(!Intrinsics.areEqual(this.f63670d, eVar.f63670d)) && !(!Intrinsics.areEqual(this.f63671e, eVar.f63671e)) && !(!Intrinsics.areEqual(this.f63672f, eVar.f63672f))) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.tag.UDTagsDrawable.TagModel");
        }
    }

    /* renamed from: a */
    private final TextPaint m93046a() {
        return (TextPaint) this.f63651i.getValue();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagColorSet;", "", "backgroundColorRes", "", "textColorRes", "iconColorRes", "(Ljava/lang/String;IIII)V", "getBackgroundColorRes", "()I", "getIconColorRes", "getTextColorRes", "GRAY", "BLUE", "INDIGO", "WATHET", "RAD", "GREEN", "ORANGE", "VIOLET", "PURPLE", "THROUGH", "LIME", "YELLOW", "CARMINE", "DARK_BLUE", "DARK_CARMINE", "DARK_RAD", "DARK_GRAY", "LIGHT_GRAY", "universe-ui-tag_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TagColorSet {
        GRAY(R.color.udtoken_tag_neutral_bg_normal, R.color.udtoken_tag_neutral_text_normal, R.color.udtoken_tag_neutral_text_normal),
        BLUE(R.color.udtoken_tag_bg_blue, R.color.udtoken_tag_text_s_blue, R.color.udtoken_tag_text_s_blue),
        INDIGO(R.color.udtoken_tag_bg_indigo, R.color.udtoken_tag_text_s_indigo, R.color.udtoken_tag_text_s_indigo),
        WATHET(R.color.udtoken_tag_bg_wathet, R.color.udtoken_tag_text_s_wathet, R.color.udtoken_tag_text_s_wathet),
        RAD(R.color.udtoken_tag_bg_red, R.color.udtoken_tag_text_s_red, R.color.udtoken_tag_text_s_red),
        GREEN(R.color.udtoken_tag_bg_green, R.color.udtoken_tag_text_s_green, R.color.udtoken_tag_text_s_green),
        ORANGE(R.color.udtoken_tag_bg_orange, R.color.udtoken_tag_text_s_orange, R.color.udtoken_tag_text_s_orange),
        VIOLET(R.color.udtoken_tag_bg_violet, R.color.udtoken_tag_text_s_violet, R.color.udtoken_tag_text_s_violet),
        PURPLE(R.color.udtoken_tag_bg_purple, R.color.udtoken_tag_text_s_purple, R.color.udtoken_tag_text_s_purple),
        THROUGH(R.color.udtoken_tag_bg_turquoise, R.color.udtoken_tag_text_s_turquoise, R.color.udtoken_tag_text_s_turquoise),
        LIME(R.color.udtoken_tag_bg_lime, R.color.udtoken_tag_text_s_lime, R.color.udtoken_tag_text_s_lime),
        YELLOW(R.color.udtoken_tag_bg_yellow, R.color.udtoken_tag_text_s_yellow, R.color.udtoken_tag_text_s_yellow),
        CARMINE(R.color.udtoken_tag_bg_carmine, R.color.udtoken_tag_text_s_carmine, R.color.udtoken_tag_text_s_carmine),
        DARK_BLUE(R.color.function_info_400, R.color.udtoken_tag_neutral_text_inverse, R.color.static_white),
        DARK_CARMINE(R.color.ud_C400, R.color.udtoken_tag_neutral_text_inverse, R.color.static_white),
        DARK_RAD(R.color.function_danger_400, R.color.udtoken_tag_neutral_text_inverse, R.color.static_white),
        DARK_GRAY(R.color.udtoken_tag_neutral_bg_inverse, R.color.udtoken_tag_neutral_text_inverse, R.color.static_white),
        LIGHT_GRAY(R.color.udtoken_tag_neutral_bg_solid, R.color.udtoken_tag_neutral_text_normal, R.color.udtoken_tag_neutral_text_normal);
        
        private final int backgroundColorRes;
        private final int iconColorRes;
        private final int textColorRes;

        public final int getBackgroundColorRes() {
            return this.backgroundColorRes;
        }

        public final int getIconColorRes() {
            return this.iconColorRes;
        }

        public final int getTextColorRes() {
            return this.textColorRes;
        }

        private TagColorSet(int i, int i2, int i3) {
            this.backgroundColorRes = i;
            this.textColorRes = i2;
            this.iconColorRes = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001bJ\b\u0010&\u001a\u0004\u0018\u00010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010+\u001a\u00020,H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\f¨\u0006-"}, d2 = {"Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "iconSize", "", "getIconSize$universe_ui_tag_release", "()F", "setIconSize$universe_ui_tag_release", "(F)V", "layoutHeight", "getLayoutHeight$universe_ui_tag_release", "setLayoutHeight$universe_ui_tag_release", "tagMaxWidth", "getTagMaxWidth$universe_ui_tag_release", "setTagMaxWidth$universe_ui_tag_release", "tagMinWidth", "getTagMinWidth$universe_ui_tag_release", "setTagMinWidth$universe_ui_tag_release", "tagPadding", "getTagPadding$universe_ui_tag_release", "setTagPadding$universe_ui_tag_release", "tags", "", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "getTags$universe_ui_tag_release", "()Ljava/util/List;", "textPadding", "getTextPadding$universe_ui_tag_release", "setTextPadding$universe_ui_tag_release", "textSize", "getTextSize$universe_ui_tag_release", "setTextSize$universe_ui_tag_release", "addTag", "tag", "build", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "equals", "", "other", "hashCode", "", "universe-ui-tag_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tag.UDTagsDrawable$b */
    public static final class Builder {

        /* renamed from: a */
        private float f63655a;

        /* renamed from: b */
        private float f63656b;

        /* renamed from: c */
        private float f63657c;

        /* renamed from: d */
        private float f63658d;

        /* renamed from: e */
        private float f63659e = FloatCompanionObject.f173206a.mo239331a();

        /* renamed from: f */
        private float f63660f;

        /* renamed from: g */
        private float f63661g;

        /* renamed from: h */
        private final List<TagModel> f63662h;

        /* renamed from: i */
        private final Context f63663i;

        /* renamed from: a */
        public final float mo91382a() {
            return this.f63655a;
        }

        /* renamed from: b */
        public final float mo91385b() {
            return this.f63656b;
        }

        /* renamed from: c */
        public final float mo91387c() {
            return this.f63657c;
        }

        /* renamed from: d */
        public final float mo91389d() {
            return this.f63658d;
        }

        /* renamed from: e */
        public final float mo91391e() {
            return this.f63659e;
        }

        /* renamed from: f */
        public final float mo91394f() {
            return this.f63660f;
        }

        /* renamed from: g */
        public final float mo91395g() {
            return this.f63661g;
        }

        /* renamed from: h */
        public final List<TagModel> mo91396h() {
            return this.f63662h;
        }

        /* renamed from: j */
        public final Context mo91399j() {
            return this.f63663i;
        }

        /* renamed from: i */
        public final UDTagsDrawable mo91398i() {
            if (this.f63662h.isEmpty()) {
                return null;
            }
            return new UDTagsDrawable(this, null);
        }

        public int hashCode() {
            return ((((((((((((0 + this.f63662h.hashCode()) * 31) + Float.floatToIntBits(this.f63655a)) * 31) + Float.floatToIntBits(this.f63656b)) * 31) + Float.floatToIntBits(this.f63657c)) * 31) + Float.floatToIntBits(this.f63658d)) * 31) + Float.floatToIntBits(this.f63660f)) * 31) + Float.floatToIntBits(this.f63661g);
        }

        /* renamed from: a */
        public final Builder mo91383a(float f) {
            Builder bVar = this;
            bVar.f63655a = f;
            return bVar;
        }

        /* renamed from: b */
        public final Builder mo91386b(float f) {
            Builder bVar = this;
            bVar.f63656b = f;
            return bVar;
        }

        /* renamed from: c */
        public final Builder mo91388c(float f) {
            Builder bVar = this;
            bVar.f63657c = f;
            return bVar;
        }

        /* renamed from: d */
        public final Builder mo91390d(float f) {
            Builder bVar = this;
            bVar.f63659e = f;
            return bVar;
        }

        /* renamed from: e */
        public final Builder mo91392e(float f) {
            Builder bVar = this;
            bVar.f63660f = f;
            return bVar;
        }

        /* renamed from: a */
        public final Builder mo91384a(TagModel eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "tag");
            Builder bVar = this;
            bVar.f63662h.add(eVar);
            return bVar;
        }

        public Builder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f63663i = context;
            this.f63655a = (float) UDDimenUtils.m93312c(context, 12.0f);
            this.f63656b = UDDimenUtils.m93307a(context, 4.0f);
            this.f63657c = UDDimenUtils.m93307a(context, 18.0f);
            this.f63658d = UDDimenUtils.m93307a(context, 18.0f);
            this.f63660f = UDDimenUtils.m93307a(context, 4.0f);
            this.f63661g = UDDimenUtils.m93307a(context, 12.0f);
            this.f63662h = new ArrayList(2);
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
                Builder bVar = (Builder) obj;
                if (!(!Intrinsics.areEqual(this.f63662h, bVar.f63662h)) && this.f63655a == bVar.f63655a && this.f63656b == bVar.f63656b && this.f63657c == bVar.f63657c && this.f63658d == bVar.f63658d && this.f63660f == bVar.f63660f && this.f63661g == bVar.f63661g) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.tag.UDTagsDrawable.Builder");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$Companion;", "", "()V", "ICON_SIZE_DP", "", "TAG_HEIGHT_DP", "TAG_MIN_WIDTH_DP", "TAG_PADDING_DP", "TAG_RADIUS_DP", "TEXT_PADDING_DP", "TEXT_SIZE_SP", "universe-ui-tag_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tag.UDTagsDrawable$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public int hashCode() {
        return this.f63654l.hashCode();
    }

    public int getIntrinsicHeight() {
        return getBounds().height();
    }

    public int getIntrinsicWidth() {
        return getBounds().width();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$SimpleGradientDrawable;", "Landroid/graphics/drawable/GradientDrawable;", "()V", "mColor", "", "mRadius", "", "mShape", "equals", "", "other", "", "hashCode", "setColor", "", "colorInt", "setCornerRadius", "radius", "setShape", "shape", "universe-ui-tag_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tag.UDTagsDrawable$d */
    public static final class SimpleGradientDrawable extends GradientDrawable {

        /* renamed from: a */
        private int f63664a;

        /* renamed from: b */
        private float f63665b;

        /* renamed from: c */
        private int f63666c;

        public int hashCode() {
            return (((this.f63664a * 31) + Float.floatToIntBits(this.f63665b)) * 31) + this.f63666c;
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setColor(int i) {
            super.setColor(i);
            this.f63666c = i;
        }

        public void setCornerRadius(float f) {
            super.setCornerRadius(f);
            this.f63665b = f;
        }

        public void setShape(int i) {
            super.setShape(i);
            this.f63664a = i;
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
                if (this.f63664a == dVar.f63664a && this.f63665b == dVar.f63665b && this.f63666c == dVar.f63666c) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.tag.UDTagsDrawable.SimpleGradientDrawable");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/TextPaint;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tag.UDTagsDrawable$f */
    static final class C25786f extends Lambda implements Function0<TextPaint> {
        public static final C25786f INSTANCE = new C25786f();

        C25786f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextPaint invoke() {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.CENTER);
            if (Build.VERSION.SDK_INT >= 28) {
                textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, ParticipantRepo.f117150c, false));
            } else {
                textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            }
            textPaint.setAntiAlias(true);
            return textPaint;
        }
    }

    /* renamed from: b */
    private final void m93049b() {
        int i;
        int i2;
        m93046a().setTextSize(this.f63644b);
        List<TagModel> list = this.f63652j;
        if (list != null) {
            i2 = 0;
            i = 0;
            int i3 = 0;
            for (T t : list) {
                Rect rect = new Rect(i3, 0, 0, 0);
                m93048a(t, rect);
                this.f63653k.put(t, rect);
                i3 = (int) (((float) rect.right) + this.f63649g);
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
    public final void mo91368a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!Intrinsics.areEqual(view.getBackground(), this)) {
            view.setBackground(this);
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        List<TagModel> list = this.f63652j;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m93047a(canvas, it.next());
            }
        }
    }

    /* renamed from: a */
    public final void mo91369a(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Intrinsics.checkExpressionValueIsNotNull(compoundDrawables, "textView.compoundDrawables");
        if (!Intrinsics.areEqual(compoundDrawables[2], this)) {
            textView.setCompoundDrawablePadding((int) UDDimenUtils.m93307a(this.f63654l.mo91399j(), 4.0f));
            textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], this, compoundDrawables[3]);
        }
    }

    private UDTagsDrawable(Builder bVar) {
        this.f63654l = bVar;
        this.f63651i = LazyKt.lazy(C25786f.INSTANCE);
        this.f63653k = new HashMap<>(2);
        this.f63644b = bVar.mo91382a();
        this.f63645c = bVar.mo91385b();
        this.f63646d = bVar.mo91387c();
        this.f63647e = bVar.mo91389d();
        this.f63648f = bVar.mo91391e();
        this.f63649g = bVar.mo91394f();
        this.f63650h = bVar.mo91395g();
        List<TagModel> h = bVar.mo91396h();
        if (h.size() > 1) {
            CollectionsKt.sortWith(h, new C25785a());
        }
        this.f63652j = bVar.mo91396h();
        m93049b();
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
            UDTagsDrawable uDTagsDrawable = (UDTagsDrawable) obj;
            if (this.f63644b == uDTagsDrawable.f63644b && this.f63645c == uDTagsDrawable.f63645c && this.f63646d == uDTagsDrawable.f63646d && this.f63647e == uDTagsDrawable.f63647e && this.f63648f == uDTagsDrawable.f63648f && this.f63649g == uDTagsDrawable.f63649g && this.f63650h == uDTagsDrawable.f63650h && !(!Intrinsics.areEqual(this.f63652j, uDTagsDrawable.f63652j))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.universe_design.tag.UDTagsDrawable");
    }

    public /* synthetic */ UDTagsDrawable(Builder bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tag.UDTagsDrawable$a */
    public static final class C25785a<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(t.mo91405a()), Integer.valueOf(t2.mo91405a()));
        }
    }

    /* renamed from: a */
    private final void m93047a(Canvas canvas, TagModel eVar) {
        Rect rect = this.f63653k.get(eVar);
        if (rect != null) {
            Drawable e = eVar.mo91410e();
            if (e != null) {
                e.draw(canvas);
            }
            String b = eVar.mo91407b();
            if (b != null) {
                m93046a().setTextSize(this.f63644b);
                m93046a().setColor(eVar.mo91408c());
                Paint.FontMetrics fontMetrics = m93046a().getFontMetrics();
                float f = (fontMetrics.ascent + fontMetrics.descent) / ((float) 2);
                String f2 = eVar.mo91412f();
                if (f2 != null) {
                    b = f2;
                }
                canvas.drawText(b, rect.exactCenterX(), rect.exactCenterY() - f, m93046a());
            }
            Drawable d = eVar.mo91409d();
            if (d != null) {
                d.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private final void m93048a(TagModel eVar, Rect rect) {
        float f = this.f63647e;
        float f2 = this.f63646d;
        String b = eVar.mo91407b();
        if (b != null) {
            Paint.FontMetrics fontMetrics = m93046a().getFontMetrics();
            float measureText = m93046a().measureText(b, 0, b.length());
            float f3 = fontMetrics.descent - fontMetrics.ascent;
            float f4 = (float) 2;
            f = Math.max(f, measureText + (this.f63645c * f4));
            if (f > this.f63648f) {
                String obj = TextUtils.ellipsize(b, m93046a(), this.f63648f - (this.f63645c * f4), TextUtils.TruncateAt.END).toString();
                eVar.mo91406a(obj);
                f = m93046a().measureText(obj, 0, obj.length()) + (this.f63645c * f4);
            }
            f2 = Math.max(f2, f3);
        }
        Drawable e = eVar.mo91410e();
        if (e != null) {
            int intrinsicWidth = e.getIntrinsicWidth();
            int intrinsicHeight = e.getIntrinsicHeight();
            f = Math.min(Math.max(f, (float) intrinsicWidth), this.f63648f);
            f2 = Math.max(f2, (float) intrinsicHeight);
            e.setBounds(rect.left, rect.top, rect.left + ((int) f), rect.top + ((int) f2));
        }
        rect.set(rect.left, rect.top, rect.left + ((int) f), rect.top + ((int) f2));
        Drawable d = eVar.mo91409d();
        if (d != null) {
            float f5 = this.f63650h;
            float min = Math.min(Math.max(f, f5), this.f63648f);
            float max = Math.max(f2, f5);
            rect.set(rect.left, rect.top, rect.left + ((int) min), rect.top + ((int) max));
            float f6 = (float) 2;
            int i = (int) ((min - f5) / f6);
            int i2 = (int) ((max - f5) / f6);
            d.setBounds(rect.left + i, rect.top + i2, rect.right - i, rect.bottom - i2);
        }
    }
}
