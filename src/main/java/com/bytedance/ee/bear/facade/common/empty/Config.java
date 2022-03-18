package com.bytedance.ee.bear.facade.common.empty;

import android.content.Context;
import com.larksuite.suite.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J \u0010\"\u001a\u00020\u001e2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050%0$J\u0014\u0010\u0003\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$J\u0014\u0010&\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050$J \u0010'\u001a\u00020\u001e2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140%0$J\u0014\u0010\u0013\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$J \u0010(\u001a\u00020\u001e2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140%0$J\u0014\u0010\u0018\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$J \u0010)\u001a\u00020\u001e2\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140%0$R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0017¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/facade/common/empty/Config;", "", "()V", "icons", "", "", "getIcons", "()Ljava/util/Map;", "language", "", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "loadingView", "getLoadingView", "()I", "setLoadingView", "(I)V", "subTips", "", "getSubTips", "setSubTips", "(Ljava/util/Map;)V", "tips", "getTips", "viewsTxt", "getViewsTxt", "setViewsTxt", "defaultIcons", "", "defaultTips", "context", "Landroid/content/Context;", "icon", "build", "Lkotlin/Function0;", "Lkotlin/Pair;", "loading", "subTip", "tip", "viewText", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.facade.common.empty.a */
public final class Config {

    /* renamed from: a */
    private final Map<Integer, CharSequence> f20795a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<Integer, Integer> f20796b = new LinkedHashMap();

    /* renamed from: c */
    private Map<Integer, CharSequence> f20797c = new LinkedHashMap();

    /* renamed from: d */
    private int f20798d;

    /* renamed from: e */
    private String f20799e;

    /* renamed from: f */
    private Map<Integer, CharSequence> f20800f;

    /* renamed from: a */
    public final Map<Integer, CharSequence> mo30142a() {
        return this.f20795a;
    }

    /* renamed from: b */
    public final Map<Integer, Integer> mo30146b() {
        return this.f20796b;
    }

    /* renamed from: c */
    public final int mo30148c() {
        return this.f20798d;
    }

    /* renamed from: d */
    public final String mo30150d() {
        return this.f20799e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$i */
    public static final class C7677i extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        public static final C7677i INSTANCE = new C7677i();

        C7677i() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(2, "");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$a */
    public static final class C7669a extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7669a INSTANCE = new C7669a();

        C7669a() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(2, Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$b */
    public static final class C7670b extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7670b INSTANCE = new C7670b();

        C7670b() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(0, Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$c */
    public static final class C7671c extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7671c INSTANCE = new C7671c();

        C7671c() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(1, Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$d */
    public static final class C7672d extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7672d INSTANCE = new C7672d();

        C7672d() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(3, Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$e */
    public static final class C7673e extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7673e INSTANCE = new C7673e();

        C7673e() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(4, Integer.valueOf((int) R.drawable.illustration_empty_negative_no_wifi));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$f */
    public static final class C7674f extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7674f INSTANCE = new C7674f();

        C7674f() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(5, Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$g */
    public static final class C7675g extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7675g INSTANCE = new C7675g();

        C7675g() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(7, Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$h */
    public static final class C7676h extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {
        public static final C7676h INSTANCE = new C7676h();

        C7676h() {
            super(0);
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends Integer> invoke() {
            return TuplesKt.to(99, Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$j */
    public static final class C7678j extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7678j(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(0, this.$context.getString(R.string.Doc_Facade_Loading));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$k */
    public static final class C7679k extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7679k(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(1, this.$context.getString(R.string.Doc_Facade_NoContent));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$l */
    public static final class C7680l extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7680l(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(3, this.$context.getString(R.string.Doc_Facade_LoadFailed));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$m */
    public static final class C7681m extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7681m(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(4, this.$context.getString(R.string.Doc_Facade_NetworkInterrutedRetry));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$n */
    public static final class C7682n extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7682n(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(5, this.$context.getString(R.string.Doc_Facade_FolderNoExist));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$o */
    public static final class C7683o extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7683o(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(7, this.$context.getString(R.string.Doc_Facade_LoadOverTime));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.facade.common.empty.a$p */
    public static final class C7684p extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7684p(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'kotlin.Pair<java.lang.Integer, java.lang.String>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends Integer, ? extends String> invoke() {
            return TuplesKt.to(99, this.$context.getString(R.string.Doc_Facade_LoadFailed));
        }
    }

    public Config() {
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "Locale.ENGLISH.language");
        this.f20799e = language;
        this.f20800f = new LinkedHashMap();
    }

    /* renamed from: e */
    public final void mo30152e() {
        mo30151d(C7669a.INSTANCE);
        mo30151d(C7670b.INSTANCE);
        mo30151d(C7671c.INSTANCE);
        mo30151d(C7672d.INSTANCE);
        mo30151d(C7673e.INSTANCE);
        mo30151d(C7674f.INSTANCE);
        mo30151d(C7675g.INSTANCE);
        mo30151d(C7676h.INSTANCE);
    }

    /* renamed from: a */
    public final void mo30144a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f20799e = str;
    }

    /* renamed from: a */
    public final void mo30145a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "build");
        function0.invoke();
    }

    /* renamed from: b */
    public final void mo30147b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "build");
        function0.invoke();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.Map<java.lang.Integer, java.lang.CharSequence> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void mo30149c(Function0<? extends Pair<Integer, ? extends CharSequence>> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "build");
        Pair pair = (Pair) function0.invoke();
        this.f20795a.put(pair.getFirst(), pair.getSecond());
    }

    /* renamed from: d */
    public final void mo30151d(Function0<Pair<Integer, Integer>> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "build");
        Pair<Integer, Integer> invoke = function0.invoke();
        this.f20796b.put(invoke.getFirst(), invoke.getSecond());
    }

    /* renamed from: e */
    public final void mo30153e(Function0<Integer> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "build");
        this.f20798d = function0.invoke().intValue();
    }

    /* renamed from: a */
    public final void mo30143a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        mo30149c(C7677i.INSTANCE);
        mo30149c(new C7678j(context));
        mo30149c(new C7679k(context));
        mo30149c(new C7680l(context));
        mo30149c(new C7681m(context));
        mo30149c(new C7682n(context));
        mo30149c(new C7683o(context));
        mo30149c(new C7684p(context));
    }
}
