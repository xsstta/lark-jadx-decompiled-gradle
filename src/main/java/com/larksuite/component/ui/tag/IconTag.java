package com.larksuite.component.ui.tag;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\rHÖ\u0001J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\nJ\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/larksuite/component/ui/tag/IconTag;", "", "bd", "Lcom/larksuite/component/ui/tag/IconTag$Builder;", "(Lcom/larksuite/component/ui/tag/IconTag$Builder;)V", "getBd", "()Lcom/larksuite/component/ui/tag/IconTag$Builder;", "icon", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "Landroid/graphics/drawable/Drawable;", "id", "", "getId", "()I", "order", "getOrder", "component1", "copy", "equals", "", "other", "hashCode", "context", "state", "toString", "", "Builder", "Companion", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.tag.c */
public final class IconTag {

    /* renamed from: a */
    public static final Companion f62887a = new Companion(null);

    /* renamed from: b */
    private final int f62888b;

    /* renamed from: c */
    private final int f62889c;

    /* renamed from: d */
    private final Function2<Context, DrawableStateSet, Drawable> f62890d;

    /* renamed from: e */
    private final Builder f62891e;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof IconTag) && Intrinsics.areEqual(this.f62891e, ((IconTag) obj).f62891e);
        }
        return true;
    }

    public int hashCode() {
        Builder aVar = this.f62891e;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "IconTag(bd=" + this.f62891e + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010 \u001a\u00020!J!\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010H\u0000¢\u0006\u0002\b#R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\b¨\u0006$"}, d2 = {"Lcom/larksuite/component/ui/tag/IconTag$Builder;", "", "()V", "backgroudColorRes", "", "getBackgroudColorRes", "()I", "setBackgroudColorRes", "(I)V", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "iconMap", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "getIconMap", "()Lkotlin/jvm/functions/Function2;", "setIconMap", "(Lkotlin/jvm/functions/Function2;)V", "iconRes", "getIconRes", "setIconRes", "id", "getId", "setId", "order", "getOrder", "setOrder", "build", "Lcom/larksuite/component/ui/tag/IconTag;", "icon", "icon$avatar_badge_release", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.c$a */
    public static final class Builder {

        /* renamed from: a */
        private int f62892a = -1;

        /* renamed from: b */
        private int f62893b = 100;

        /* renamed from: c */
        private int f62894c;

        /* renamed from: d */
        private Drawable f62895d;

        /* renamed from: e */
        private Function2<? super Context, ? super DrawableStateSet, ? extends Drawable> f62896e;

        /* renamed from: a */
        public final int mo89992a() {
            return this.f62892a;
        }

        /* renamed from: b */
        public final int mo89995b() {
            return this.f62893b;
        }

        /* renamed from: c */
        public final int mo89997c() {
            return this.f62894c;
        }

        /* renamed from: d */
        public final Drawable mo89999d() {
            return this.f62895d;
        }

        /* renamed from: f */
        public final IconTag mo90001f() {
            return new IconTag(this, null);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super android.content.Context, ? super com.larksuite.component.ui.tag.DrawableStateSet, ? extends android.graphics.drawable.Drawable>, kotlin.jvm.functions.k<android.content.Context, com.larksuite.component.ui.tag.DrawableStateSet, android.graphics.drawable.Drawable> */
        /* renamed from: e */
        public final Function2<Context, DrawableStateSet, Drawable> mo90000e() {
            Function2 kVar = this.f62896e;
            if (kVar == null) {
                return new C25693a(this);
            }
            if (kVar == null) {
                Intrinsics.throwNpe();
            }
            return kVar;
        }

        /* renamed from: a */
        public final void mo89993a(int i) {
            this.f62892a = i;
        }

        /* renamed from: b */
        public final void mo89996b(int i) {
            this.f62893b = i;
        }

        /* renamed from: c */
        public final void mo89998c(int i) {
            this.f62894c = i;
        }

        /* renamed from: a */
        public final void mo89994a(Function2<? super Context, ? super DrawableStateSet, ? extends Drawable> kVar) {
            this.f62896e = kVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "<anonymous parameter 1>", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.c$a$a */
        public static final class C25693a extends Lambda implements Function2<Context, DrawableStateSet, Drawable> {
            final /* synthetic */ Builder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25693a(Builder aVar) {
                super(2);
                this.this$0 = aVar;
            }

            public final Drawable invoke(Context context, DrawableStateSet drawableStateSet) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(drawableStateSet, "<anonymous parameter 1>");
                if (this.this$0.mo89997c() > 0) {
                    return ContextCompat.getDrawable(context, this.this$0.mo89997c());
                }
                return this.this$0.mo89999d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\b¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/tag/IconTag$Companion;", "", "()V", "build", "Lcom/larksuite/component/ui/tag/IconTag;", "block", "Lkotlin/Function1;", "Lcom/larksuite/component/ui/tag/IconTag$Builder;", "", "Lkotlin/ExtensionFunctionType;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.c$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo89986a() {
        return this.f62888b;
    }

    /* renamed from: b */
    public final int mo89988b() {
        return this.f62889c;
    }

    private IconTag(Builder aVar) {
        this.f62891e = aVar;
        this.f62888b = aVar.mo89992a();
        this.f62889c = aVar.mo89995b();
        this.f62890d = aVar.mo90000e();
    }

    public /* synthetic */ IconTag(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public final Drawable mo89987a(Context context, DrawableStateSet drawableStateSet) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(drawableStateSet, "state");
        return this.f62890d.invoke(context, drawableStateSet);
    }
}
