package com.larksuite.component.ui.tag;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\u000e\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tJ\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\nJ\t\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/larksuite/component/ui/tag/TextTag;", "", "bd", "Lcom/larksuite/component/ui/tag/TextTag$Builder;", "(Lcom/larksuite/component/ui/tag/TextTag$Builder;)V", "getBd", "()Lcom/larksuite/component/ui/tag/TextTag$Builder;", "bgColor", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "", "id", "getId", "()I", "order", "getOrder", "text", "Lkotlin/Function1;", "", "textColor", "context", "state", "component1", "copy", "equals", "", "other", "hashCode", "toString", "Builder", "Companion", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.tag.h */
public final class TextTag {

    /* renamed from: a */
    public static final Companion f62987a = new Companion(null);

    /* renamed from: b */
    private final int f62988b;

    /* renamed from: c */
    private final int f62989c;

    /* renamed from: d */
    private final Function1<Context, String> f62990d;

    /* renamed from: e */
    private final Function2<Context, DrawableStateSet, Integer> f62991e;

    /* renamed from: f */
    private final Function2<Context, DrawableStateSet, Integer> f62992f;

    /* renamed from: g */
    private final Builder f62993g;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TextTag) && Intrinsics.areEqual(this.f62993g, ((TextTag) obj).f62993g);
        }
        return true;
    }

    public int hashCode() {
        Builder aVar = this.f62993g;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TextTag(bd=" + this.f62993g + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000bH\u0000¢\u0006\u0002\b0J\u0006\u00101\u001a\u000202J\u0019\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e03H\u0000¢\u0006\u0002\b4J\u001f\u00105\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000bH\u0000¢\u0006\u0002\b6R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR.\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R\u001a\u0010)\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R\u001a\u0010,\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016¨\u00067"}, d2 = {"Lcom/larksuite/component/ui/tag/TextTag$Builder;", "", "()V", "bgColorInt", "", "getBgColorInt", "()Ljava/lang/Integer;", "setBgColorInt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bgColorMap", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "getBgColorMap", "()Lkotlin/jvm/functions/Function2;", "setBgColorMap", "(Lkotlin/jvm/functions/Function2;)V", "bgColorRes", "getBgColorRes", "()I", "setBgColorRes", "(I)V", "id", "getId", "setId", "order", "getOrder", "setOrder", "text", "", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textColorInt", "getTextColorInt", "setTextColorInt", "textColorMap", "getTextColorMap", "setTextColorMap", "textColorRes", "getTextColorRes", "setTextColorRes", "textRes", "getTextRes", "setTextRes", "bgColor", "bgColor$avatar_badge_release", "build", "Lcom/larksuite/component/ui/tag/TextTag;", "Lkotlin/Function1;", "text$avatar_badge_release", "textColor", "textColor$avatar_badge_release", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.h$a */
    public static final class Builder {

        /* renamed from: a */
        private int f62994a = -1;

        /* renamed from: b */
        private int f62995b = 100;

        /* renamed from: c */
        private int f62996c;

        /* renamed from: d */
        private String f62997d;

        /* renamed from: e */
        private int f62998e;

        /* renamed from: f */
        private Integer f62999f;

        /* renamed from: g */
        private int f63000g;

        /* renamed from: h */
        private Integer f63001h;

        /* renamed from: i */
        private Function2<? super Context, ? super DrawableStateSet, Integer> f63002i;

        /* renamed from: j */
        private Function2<? super Context, ? super DrawableStateSet, Integer> f63003j;

        /* renamed from: a */
        public final int mo90133a() {
            return this.f62994a;
        }

        /* renamed from: b */
        public final int mo90138b() {
            return this.f62995b;
        }

        /* renamed from: c */
        public final int mo90142c() {
            return this.f62996c;
        }

        /* renamed from: d */
        public final String mo90144d() {
            return this.f62997d;
        }

        /* renamed from: e */
        public final int mo90146e() {
            return this.f62998e;
        }

        /* renamed from: f */
        public final Integer mo90148f() {
            return this.f62999f;
        }

        /* renamed from: g */
        public final int mo90149g() {
            return this.f63000g;
        }

        /* renamed from: h */
        public final Integer mo90150h() {
            return this.f63001h;
        }

        /* renamed from: k */
        public final Function1<Context, String> mo90153k() {
            return new C25703c(this);
        }

        /* renamed from: l */
        public final TextTag mo90154l() {
            return new TextTag(this, null);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super android.content.Context, ? super com.larksuite.component.ui.tag.DrawableStateSet, java.lang.Integer>, kotlin.jvm.functions.k<android.content.Context, com.larksuite.component.ui.tag.DrawableStateSet, java.lang.Integer> */
        /* renamed from: i */
        public final Function2<Context, DrawableStateSet, Integer> mo90151i() {
            Function2 kVar = this.f63002i;
            if (kVar != null) {
                if (kVar == null) {
                    Intrinsics.throwNpe();
                }
                return kVar;
            } else if (this.f62999f != null) {
                return new C25704d(this);
            } else {
                return new C25705e(this);
            }
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.k<? super android.content.Context, ? super com.larksuite.component.ui.tag.DrawableStateSet, java.lang.Integer>, kotlin.jvm.functions.k<android.content.Context, com.larksuite.component.ui.tag.DrawableStateSet, java.lang.Integer> */
        /* renamed from: j */
        public final Function2<Context, DrawableStateSet, Integer> mo90152j() {
            Function2 kVar = this.f63003j;
            if (kVar != null) {
                if (kVar == null) {
                    Intrinsics.throwNpe();
                }
                return kVar;
            } else if (this.f63001h != null) {
                return new C25701a(this);
            } else {
                return new C25702b(this);
            }
        }

        /* renamed from: a */
        public final void mo90134a(int i) {
            this.f62994a = i;
        }

        /* renamed from: b */
        public final void mo90139b(int i) {
            this.f62995b = i;
        }

        /* renamed from: c */
        public final void mo90143c(int i) {
            this.f62996c = i;
        }

        /* renamed from: d */
        public final void mo90145d(int i) {
            this.f62998e = i;
        }

        /* renamed from: e */
        public final void mo90147e(int i) {
            this.f63000g = i;
        }

        /* renamed from: a */
        public final void mo90135a(Integer num) {
            this.f62999f = num;
        }

        /* renamed from: b */
        public final void mo90140b(Integer num) {
            this.f63001h = num;
        }

        /* renamed from: a */
        public final void mo90136a(String str) {
            this.f62997d = str;
        }

        /* renamed from: b */
        public final void mo90141b(Function2<? super Context, ? super DrawableStateSet, Integer> kVar) {
            this.f63003j = kVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/Context;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.h$a$c */
        public static final class C25703c extends Lambda implements Function1<Context, String> {
            final /* synthetic */ Builder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25703c(Builder aVar) {
                super(1);
                this.this$0 = aVar;
            }

            public final String invoke(Context context) {
                Intrinsics.checkParameterIsNotNull(context, "it");
                if (this.this$0.mo90144d() != null) {
                    String d = this.this$0.mo90144d();
                    if (d != null) {
                        return d;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                String string = context.getString(this.this$0.mo90142c());
                Intrinsics.checkExpressionValueIsNotNull(string, "it.getString(textRes)");
                return string;
            }
        }

        /* renamed from: a */
        public final void mo90137a(Function2<? super Context, ? super DrawableStateSet, Integer> kVar) {
            this.f63002i = kVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/Context;", "<anonymous parameter 1>", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.h$a$a */
        public static final class C25701a extends Lambda implements Function2<Context, DrawableStateSet, Integer> {
            final /* synthetic */ Builder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25701a(Builder aVar) {
                super(2);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Integer invoke(Context context, DrawableStateSet drawableStateSet) {
                return Integer.valueOf(invoke(context, drawableStateSet));
            }

            public final int invoke(Context context, DrawableStateSet drawableStateSet) {
                Intrinsics.checkParameterIsNotNull(context, "<anonymous parameter 0>");
                Intrinsics.checkParameterIsNotNull(drawableStateSet, "<anonymous parameter 1>");
                Integer h = this.this$0.mo90150h();
                if (h == null) {
                    Intrinsics.throwNpe();
                }
                return h.intValue();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "<anonymous parameter 1>", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.h$a$b */
        public static final class C25702b extends Lambda implements Function2<Context, DrawableStateSet, Integer> {
            final /* synthetic */ Builder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25702b(Builder aVar) {
                super(2);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Integer invoke(Context context, DrawableStateSet drawableStateSet) {
                return Integer.valueOf(invoke(context, drawableStateSet));
            }

            public final int invoke(Context context, DrawableStateSet drawableStateSet) {
                int i;
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(drawableStateSet, "<anonymous parameter 1>");
                if (this.this$0.mo90149g() > 0) {
                    i = this.this$0.mo90149g();
                } else {
                    i = R.color.LARK_TAG_TEXT_BLUE_BG;
                }
                return ContextCompat.getColor(context, i);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/Context;", "<anonymous parameter 1>", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.h$a$d */
        public static final class C25704d extends Lambda implements Function2<Context, DrawableStateSet, Integer> {
            final /* synthetic */ Builder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25704d(Builder aVar) {
                super(2);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Integer invoke(Context context, DrawableStateSet drawableStateSet) {
                return Integer.valueOf(invoke(context, drawableStateSet));
            }

            public final int invoke(Context context, DrawableStateSet drawableStateSet) {
                Intrinsics.checkParameterIsNotNull(context, "<anonymous parameter 0>");
                Intrinsics.checkParameterIsNotNull(drawableStateSet, "<anonymous parameter 1>");
                Integer f = this.this$0.mo90148f();
                if (f == null) {
                    Intrinsics.throwNpe();
                }
                return f.intValue();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "<anonymous parameter 1>", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.h$a$e */
        public static final class C25705e extends Lambda implements Function2<Context, DrawableStateSet, Integer> {
            final /* synthetic */ Builder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25705e(Builder aVar) {
                super(2);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Integer invoke(Context context, DrawableStateSet drawableStateSet) {
                return Integer.valueOf(invoke(context, drawableStateSet));
            }

            public final int invoke(Context context, DrawableStateSet drawableStateSet) {
                int i;
                Intrinsics.checkParameterIsNotNull(context, "context");
                Intrinsics.checkParameterIsNotNull(drawableStateSet, "<anonymous parameter 1>");
                if (this.this$0.mo90146e() > 0) {
                    i = this.this$0.mo90146e();
                } else {
                    i = R.color.LARK_TAG_TEXT_BLUE;
                }
                return ContextCompat.getColor(context, i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\b¨\u0006\n"}, d2 = {"Lcom/larksuite/component/ui/tag/TextTag$Companion;", "", "()V", "build", "Lcom/larksuite/component/ui/tag/TextTag;", "block", "Lkotlin/Function1;", "Lcom/larksuite/component/ui/tag/TextTag$Builder;", "", "Lkotlin/ExtensionFunctionType;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.h$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TextTag mo90160a(Function1<? super Builder, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "block");
            Builder aVar = new Builder();
            function1.invoke(aVar);
            return aVar.mo90154l();
        }
    }

    /* renamed from: a */
    public final int mo90125a() {
        return this.f62988b;
    }

    /* renamed from: b */
    public final int mo90128b() {
        return this.f62989c;
    }

    /* renamed from: a */
    public final String mo90127a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return this.f62990d.invoke(context);
    }

    private TextTag(Builder aVar) {
        this.f62993g = aVar;
        this.f62988b = aVar.mo90133a();
        this.f62989c = aVar.mo90138b();
        this.f62990d = aVar.mo90153k();
        this.f62991e = aVar.mo90151i();
        this.f62992f = aVar.mo90152j();
    }

    public /* synthetic */ TextTag(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public final int mo90126a(Context context, DrawableStateSet drawableStateSet) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(drawableStateSet, "state");
        return this.f62991e.invoke(context, drawableStateSet).intValue();
    }

    /* renamed from: b */
    public final int mo90129b(Context context, DrawableStateSet drawableStateSet) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(drawableStateSet, "state");
        return this.f62992f.invoke(context, drawableStateSet).intValue();
    }
}
