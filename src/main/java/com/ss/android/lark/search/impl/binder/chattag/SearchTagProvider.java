package com.ss.android.lark.search.impl.binder.chattag;

import android.app.Application;
import android.content.Context;
import com.larksuite.component.ui.tag.DefaultTagProvider;
import com.larksuite.component.ui.tag.DrawableStateSet;
import com.larksuite.component.ui.tag.IconTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0015\u0010,\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0016¢\u0006\u0002\u0010-R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0004¢\u0006\u0004\n\u0002\u0010&¨\u0006."}, d2 = {"Lcom/ss/android/lark/search/impl/binder/chattag/SearchTagProvider;", "Lcom/larksuite/component/ui/tag/DefaultTagProvider;", "()V", "allStaffTag", "Lcom/larksuite/component/ui/tag/TextTag;", "getAllStaffTag", "()Lcom/larksuite/component/ui/tag/TextTag;", "appTag", "getAppTag", "approvalTag", "getApprovalTag", "botTag", "getBotTag", "departmentTag", "getDepartmentTag", "externalTag", "getExternalTag", "meetingTag", "getMeetingTag", "noDisturbTag", "Lcom/larksuite/component/ui/tag/IconTag;", "getNoDisturbTag", "()Lcom/larksuite/component/ui/tag/IconTag;", "officialTag", "getOfficialTag", "offlineOnCallTag", "getOfflineOnCallTag", "onCallTag", "getOnCallTag", "onLevelTag", "getOnLevelTag", "publicTag", "getPublicTag", "secretTag", "getSecretTag", "stateSet", "", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "[Lcom/larksuite/component/ui/tag/DrawableStateSet;", "selectableIconTag", "originTag", "selectedResId", "", "selectableTextTag", "supportedStateSets", "()[Lcom/larksuite/component/ui/tag/DrawableStateSet;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.binder.a.a */
public final class SearchTagProvider extends DefaultTagProvider {

    /* renamed from: a */
    public static final SearchTagProvider f131848a;

    /* renamed from: b */
    private static final DrawableStateSet[] f131849b = {DrawableStateSet.SELECTED};

    /* renamed from: c */
    private static final TextTag f131850c;

    /* renamed from: d */
    private static final TextTag f131851d;

    /* renamed from: e */
    private static final TextTag f131852e;

    /* renamed from: f */
    private static final TextTag f131853f;

    /* renamed from: g */
    private static final TextTag f131854g;

    /* renamed from: h */
    private static final TextTag f131855h;

    /* renamed from: i */
    private static final TextTag f131856i;

    /* renamed from: j */
    private static final IconTag f131857j;

    /* renamed from: k */
    private static final TextTag f131858k;

    /* renamed from: l */
    private static final IconTag f131859l;

    /* renamed from: m */
    private static final IconTag f131860m;

    /* renamed from: n */
    private static final TextTag f131861n;

    /* renamed from: o */
    private static final TextTag f131862o;

    /* renamed from: p */
    private static final IconTag f131863p;

    private SearchTagProvider() {
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: a */
    public TextTag mo89961a() {
        return f131853f;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: b */
    public IconTag mo89962b() {
        return f131863p;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: c */
    public TextTag mo89963c() {
        return f131856i;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: d */
    public TextTag mo89964d() {
        return f131852e;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: e */
    public IconTag mo89965e() {
        return f131859l;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: f */
    public IconTag mo89966f() {
        return f131860m;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: g */
    public TextTag mo89967g() {
        return f131858k;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: h */
    public IconTag mo89968h() {
        return f131857j;
    }

    @Override // com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: i */
    public TextTag mo89969i() {
        return f131861n;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: n */
    public TextTag mo89974n() {
        return f131855h;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: p */
    public TextTag mo89976p() {
        return f131854g;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: r */
    public TextTag mo89978r() {
        return f131850c;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: s */
    public TextTag mo89979s() {
        return f131862o;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: t */
    public TextTag mo89980t() {
        return f131851d;
    }

    @Override // com.larksuite.component.ui.tag.ITagProvider, com.larksuite.component.ui.tag.DefaultTagProvider
    /* renamed from: w */
    public DrawableStateSet[] mo89983w() {
        return f131849b;
    }

    static {
        SearchTagProvider aVar = new SearchTagProvider();
        f131848a = aVar;
        f131850c = aVar.m206478a(super.mo89978r());
        f131851d = aVar.m206478a(super.mo89980t());
        f131852e = aVar.m206478a(super.mo89964d());
        f131853f = aVar.m206478a(super.mo89961a());
        f131854g = aVar.m206478a(super.mo89976p());
        f131855h = aVar.m206478a(super.mo89974n());
        f131856i = aVar.m206478a(super.mo89963c());
        f131857j = super.mo89968h();
        f131858k = aVar.m206478a(super.mo89967g());
        f131859l = super.mo89965e();
        f131860m = super.mo89966f();
        f131861n = aVar.m206478a(super.mo89969i());
        f131862o = aVar.m206478a(super.mo89979s());
        f131863p = super.mo89962b();
    }

    /* renamed from: a */
    private final TextTag m206478a(TextTag hVar) {
        TextTag.Companion bVar = TextTag.f62987a;
        TextTag.Builder aVar = new TextTag.Builder();
        aVar.mo90134a(hVar.mo90125a());
        aVar.mo90139b(hVar.mo90128b());
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        aVar.mo90136a(hVar.mo90127a(application));
        aVar.mo90137a(new C53351a(hVar));
        aVar.mo90141b(new C53352b(hVar));
        return aVar.mo90154l();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "state", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke", "com/ss/android/lark/search/impl/binder/chattag/SearchTagProvider$selectableTextTag$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.binder.a.a$a */
    public static final class C53351a extends Lambda implements Function2<Context, DrawableStateSet, Integer> {
        final /* synthetic */ TextTag $originTag$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53351a(TextTag hVar) {
            super(2);
            this.$originTag$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Integer invoke(Context context, DrawableStateSet drawableStateSet) {
            return Integer.valueOf(invoke(context, drawableStateSet));
        }

        public final int invoke(Context context, DrawableStateSet drawableStateSet) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(drawableStateSet, "state");
            if (drawableStateSet == DrawableStateSet.SELECTED) {
                return UIHelper.getColor(R.color.lkui_B500);
            }
            return this.$originTag$inlined.mo90126a(context, DrawableStateSet.EMPTY);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "context", "Landroid/content/Context;", "state", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "invoke", "com/ss/android/lark/search/impl/binder/chattag/SearchTagProvider$selectableTextTag$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.binder.a.a$b */
    public static final class C53352b extends Lambda implements Function2<Context, DrawableStateSet, Integer> {
        final /* synthetic */ TextTag $originTag$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53352b(TextTag hVar) {
            super(2);
            this.$originTag$inlined = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Integer invoke(Context context, DrawableStateSet drawableStateSet) {
            return Integer.valueOf(invoke(context, drawableStateSet));
        }

        public final int invoke(Context context, DrawableStateSet drawableStateSet) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(drawableStateSet, "state");
            if (drawableStateSet == DrawableStateSet.SELECTED) {
                return UIHelper.getColor(R.color.lkui_N00);
            }
            return this.$originTag$inlined.mo90129b(context, DrawableStateSet.EMPTY);
        }
    }
}
