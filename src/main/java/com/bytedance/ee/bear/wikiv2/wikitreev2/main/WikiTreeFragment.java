package com.bytedance.ee.bear.wikiv2.wikitreev2.main;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.bear.wikiv2.p589c.C12237b;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.searchv2.C12360b;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceMoreDialog;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.StarSpacePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.UnStarSpacePuller;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12477f;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13746i;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u000e\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u001c\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J\"\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010/\u001a\u00020\u0013H\u0016J\b\u00100\u001a\u00020\u0013H\u0016J\u001a\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u00103\u001a\u00020\u0013H\u0002J\b\u00104\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "contract", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "flexCollapseView", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiFlexCollapseView;", "getFlexCollapseView", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiFlexCollapseView;", "flexCollapseView$delegate", "Lkotlin/Lazy;", "spacemoreViewDelegate", "com/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$spacemoreViewDelegate$2$1", "getSpacemoreViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$spacemoreViewDelegate$2$1;", "spacemoreViewDelegate$delegate", "adjustTitleBar", "", "titleBar", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "bindListener", "bindView", "hideSearching", "initView", "navigation", "targetToken", "", "targetSpaceId", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onResume", "onViewCreated", "view", "showSearching", "showWikiDeleted", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d */
public final class WikiTreeFragment extends C7667e {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f33365a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiTreeFragment.class), "flexCollapseView", "getFlexCollapseView()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiFlexCollapseView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WikiTreeFragment.class), "spacemoreViewDelegate", "getSpacemoreViewDelegate()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$spacemoreViewDelegate$2$1;"))};

    /* renamed from: d */
    public static final Companion f33366d = new Companion(null);

    /* renamed from: b */
    public WikiTreeActivityContract f33367b;

    /* renamed from: c */
    public final C68289a f33368c = new C68289a();

    /* renamed from: e */
    private final Lazy f33369e = LazyKt.lazy(new C12437f(this));

    /* renamed from: f */
    private final Lazy f33370f = LazyKt.lazy(new C12438g(this));

    /* renamed from: g */
    private HashMap f33371g;

    /* renamed from: h */
    private final void m51725h() {
    }

    /* renamed from: a */
    public View mo47369a(int i) {
        if (this.f33371g == null) {
            this.f33371g = new HashMap();
        }
        View view = (View) this.f33371g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33371g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C12430b mo47370a() {
        Lazy lazy = this.f33369e;
        KProperty kProperty = f33365a[0];
        return (C12430b) lazy.getValue();
    }

    /* renamed from: e */
    public final C12438g.C124391 mo47375e() {
        Lazy lazy = this.f33370f;
        KProperty kProperty = f33365a[1];
        return (C12438g.C124391) lazy.getValue();
    }

    /* renamed from: f */
    public void mo47376f() {
        HashMap hashMap = this.f33371g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47376f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$bindListener$2", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "onInsert", "", "newToken", "", "onItemClick", "wikiToken", "onMov", "toSpaceId", "movToken", "focusToken", "onPushMov", "onReady", "onShortcutTo", "toToken", "onWikiDeleted", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$c */
    public static final class C12434c extends WikiTreeCtrlView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiTreeFragment f33373a;

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: b */
        public void mo47299b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "movToken");
            Intrinsics.checkParameterIsNotNull(str3, "focusToken");
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: b */
        public void mo47377b() {
            this.f33373a.mo47372b();
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47295a() {
            CommonCreateButton commonCreateButton = (CommonCreateButton) this.f33373a.mo47369a(R.id.common_create_button);
            Intrinsics.checkExpressionValueIsNotNull(commonCreateButton, "common_create_button");
            commonCreateButton.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12434c(WikiTreeFragment dVar) {
            this.f33373a = dVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: b */
        public void mo47298b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "newToken");
            WikiTreeFragment.m51723a(this.f33373a, str, null, 2, null);
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: c */
        public void mo47300c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "wikiToken");
            WikiTreeFragment.m51723a(this.f33373a, str, null, 2, null);
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47296a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "toToken");
            this.f33373a.mo47371a(str2, str);
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47297a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "movToken");
            Intrinsics.checkParameterIsNotNull(str3, "focusToken");
            boolean z = !TextUtils.equals(str, ((WikiTreeCtrlView) this.f33373a.mo47369a(R.id.wiki_tree_ctrl_view)).getSpaceId());
            boolean equals = TextUtils.equals(str2, str3);
            if (z && equals) {
                C12432c.m51715a(str, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$spacemoreViewDelegate$2$1", "invoke", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$spacemoreViewDelegate$2$1;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g */
    public static final class C12438g extends Lambda implements Function0<C124391> {
        final /* synthetic */ WikiTreeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12438g(WikiTreeFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C124391 invoke() {
            return new SpaceMoreDialog.ViewDelegate(this) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiTreeFragment.C12438g.C124391 */

                /* renamed from: a */
                final /* synthetic */ C12438g f33376a;

                @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceMoreDialog.ViewDelegate
                /* renamed from: a */
                public void mo47357a() {
                    String str;
                    WikiReportV2.m50907a("workspace_detail", "none", (Boolean) null, WikiTreeFragment.m51721a(this.f33376a.this$0).getSpaceId(), (String) null, (Boolean) null, (String) null, (String) null, 244, (Object) null);
                    String str2 = null;
                    PostCard b = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/wikiv2/space/detail/activity");
                    WikiDocument wikiDocument = WikiTreeFragment.m51721a(this.f33376a.this$0).getWikiDocument();
                    if (wikiDocument != null) {
                        str = wikiDocument.mo32399O();
                    } else {
                        str = null;
                    }
                    PostCard a = b.mo17314a("space_id", str);
                    WikiDocument wikiDocument2 = WikiTreeFragment.m51721a(this.f33376a.this$0).getWikiDocument();
                    if (wikiDocument2 != null) {
                        str2 = wikiDocument2.mo21008b();
                    }
                    a.mo17314a("EXTRA_WIKI_DESCRIPTION", str2).mo17317a();
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g$1$f */
                public static final class C12445f<T> implements Consumer<Boolean> {

                    /* renamed from: a */
                    public static final C12445f f33383a = new C12445f();

                    C12445f() {
                    }

                    /* renamed from: a */
                    public final void accept(Boolean bool) {
                        C13479a.m54764b("Wiki_WikiTreeFragment", "setCacheStar ok. ");
                    }
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g$1$g */
                public static final class C12446g<T> implements Consumer<Throwable> {

                    /* renamed from: a */
                    public static final C12446g f33384a = new C12446g();

                    C12446g() {
                    }

                    /* renamed from: a */
                    public final void accept(Throwable th) {
                        C13479a.m54761a("Wiki_WikiTreeFragment", th);
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f33376a = r1;
                }

                /* access modifiers changed from: package-private */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "listDataService", "Lcom/bytedance/ee/bear/contract/ListDataService;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g$1$e */
                public static final class C12444e<T, R> implements Function<T, R> {

                    /* renamed from: a */
                    final /* synthetic */ String f33381a;

                    /* renamed from: b */
                    final /* synthetic */ boolean f33382b;

                    C12444e(String str, boolean z) {
                        this.f33381a = str;
                        this.f33382b = z;
                    }

                    /* renamed from: a */
                    public final boolean mo47384a(am amVar) {
                        Intrinsics.checkParameterIsNotNull(amVar, "listDataService");
                        amVar.starSpace(this.f33381a, this.f33382b);
                        return true;
                    }

                    @Override // io.reactivex.functions.Function
                    public /* synthetic */ Object apply(Object obj) {
                        return Boolean.valueOf(mo47384a((am) obj));
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g$1$d */
                static final class C12443d<T> implements Consumer<Throwable> {

                    /* renamed from: a */
                    final /* synthetic */ C124391 f33380a;

                    C12443d(C124391 r1) {
                        this.f33380a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(Throwable th) {
                        Toast.showFailureText(this.f33380a.f33376a.this$0.getContext(), (int) R.string.Doc_Wiki_UnstarFail);
                        C13479a.m54765b("Wiki_WikiTreeFragment", "unstar space fail. ", th);
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g$1$a */
                static final class C12440a<T> implements Consumer<Boolean> {

                    /* renamed from: a */
                    final /* synthetic */ C124391 f33377a;

                    C12440a(C124391 r1) {
                        this.f33377a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(Boolean bool) {
                        WikiDocument wikiDocument = WikiTreeFragment.m51721a(this.f33377a.f33376a.this$0).getWikiDocument();
                        if (wikiDocument != null) {
                            wikiDocument.mo32412a(true);
                        }
                        Toast.showSuccessText(this.f33377a.f33376a.this$0.getContext(), (int) R.string.Doc_Wiki_StarSuccess);
                        C124391 r3 = this.f33377a;
                        r3.mo47379a(WikiTreeFragment.m51721a(r3.f33376a.this$0).getSpaceId(), true);
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g$1$b */
                static final class C12441b<T> implements Consumer<Throwable> {

                    /* renamed from: a */
                    final /* synthetic */ C124391 f33378a;

                    C12441b(C124391 r1) {
                        this.f33378a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(Throwable th) {
                        int i;
                        if (C12477f.m51914a(th, 920004024)) {
                            i = R.string.CreationMobile_Wiki_Favorited_Max;
                        } else {
                            i = R.string.Doc_Wiki_StarFail;
                        }
                        Toast.showFailureText(this.f33378a.f33376a.this$0.getContext(), i);
                        C13479a.m54765b("Wiki_WikiTreeFragment", "star space fail. ", th);
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$g$1$c */
                static final class C12442c<T> implements Consumer<Boolean> {

                    /* renamed from: a */
                    final /* synthetic */ C124391 f33379a;

                    C12442c(C124391 r1) {
                        this.f33379a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(Boolean bool) {
                        WikiDocument wikiDocument = WikiTreeFragment.m51721a(this.f33379a.f33376a.this$0).getWikiDocument();
                        if (wikiDocument != null) {
                            wikiDocument.mo32412a(false);
                        }
                        Toast.showSuccessText(this.f33379a.f33376a.this$0.getContext(), (int) R.string.Doc_Wiki_UnstarSuccess);
                        C124391 r3 = this.f33379a;
                        r3.mo47379a(WikiTreeFragment.m51721a(r3.f33376a.this$0).getSpaceId(), false);
                    }
                }

                @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceMoreDialog.ViewDelegate
                /* renamed from: a */
                public void mo47358a(boolean z) {
                    if (z) {
                        WikiReportV2.m50907a("star_workspace", "none", (Boolean) null, WikiTreeFragment.m51721a(this.f33376a.this$0).getSpaceId(), (String) null, (Boolean) null, (String) null, (String) null, 244, (Object) null);
                        this.f33376a.this$0.f33368c.mo237937a(C12455c.m51802m((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new StarSpacePuller.Params(WikiTreeFragment.m51721a(this.f33376a.this$0).getSpaceId())).mo238001b(new C12440a(this), new C12441b(this)));
                        return;
                    }
                    WikiReportV2.m50907a("unstar_workspace", "none", (Boolean) null, WikiTreeFragment.m51721a(this.f33376a.this$0).getSpaceId(), (String) null, (Boolean) null, (String) null, (String) null, 244, (Object) null);
                    this.f33376a.this$0.f33368c.mo237937a(C12455c.m51803n((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new UnStarSpacePuller.Params(WikiTreeFragment.m51721a(this.f33376a.this$0).getSpaceId())).mo238001b(new C12442c(this), new C12443d(this)));
                }

                /* renamed from: a */
                public final void mo47379a(String str, boolean z) {
                    this.f33376a.this$0.f33368c.mo237937a(ar.f14811a.mo41508c(am.class).mo238020d(new C12444e(str, z)).mo238001b(C12445f.f33383a, C12446g.f33384a));
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$ViewDelegate;", "onMoreClick", "", "onSearchClick", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$b */
    public static final class C12433b implements SpaceCoverView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiTreeFragment f33372a;

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView.ViewDelegate
        /* renamed from: a */
        public void mo47329a() {
            C12237b.m50900a("wiki_pages", "wiki_pages_view", "click_search_item");
            this.f33372a.mo47373c();
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView.ViewDelegate
        /* renamed from: b */
        public void mo47330b() {
            Boolean bool;
            if (this.f33372a.getActivity() != null) {
                SpaceMoreDialog.Companion aVar = SpaceMoreDialog.f33348d;
                FragmentActivity activity = this.f33372a.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                RectF moreRectF = ((SpaceCoverView) this.f33372a.mo47369a(R.id.wiki_cover_view)).getMoreRectF();
                WikiDocument wikiDocument = WikiTreeFragment.m51721a(this.f33372a).getWikiDocument();
                if (wikiDocument != null) {
                    bool = Boolean.valueOf(wikiDocument.mo32456j());
                } else {
                    bool = null;
                }
                aVar.mo47356a(activity, moreRectF, bool, this.f33372a.mo47375e());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12433b(WikiTreeFragment dVar) {
            this.f33372a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiTreeFragment$bindListener$3", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;", "onEnterSearch", "", "onExitSearch", "onSearchItemClick", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$d */
    public static final class C12435d implements WikiSearchView2.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiTreeFragment f33374a;

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46930a() {
            this.f33374a.mo47370a().mo47368b();
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: b */
        public void mo46932b() {
            this.f33374a.mo47374d();
            this.f33374a.mo47370a().mo47368b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12435d(WikiTreeFragment dVar) {
            this.f33374a = dVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46931a(C12360b bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "wikiSearchResult");
            WikiTreeFragment dVar = this.f33374a;
            String str = bVar.f33161f;
            Intrinsics.checkExpressionValueIsNotNull(str, "wikiSearchResult.wikiToken");
            WikiTreeFragment.m51723a(dVar, str, null, 2, null);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        this.f33368c.mo237935a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo47370a().mo47368b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiFlexCollapseView;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$f */
    static final class C12437f extends Lambda implements Function0<C12430b> {
        final /* synthetic */ WikiTreeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12437f(WikiTreeFragment dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C12430b invoke() {
            return new C12430b(this.this$0.getActivity(), this.this$0.getView());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (((WikiSearchView2) mo47369a(R.id.wiki_search_view)).mo47061i() || super.onBackPressed()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo47373c() {
        WikiCoverCoordinatorLayout wikiCoverCoordinatorLayout = (WikiCoverCoordinatorLayout) mo47369a(R.id.wiki_coordinator_layout);
        Intrinsics.checkExpressionValueIsNotNull(wikiCoverCoordinatorLayout, "wiki_coordinator_layout");
        wikiCoverCoordinatorLayout.setVisibility(8);
        WikiSearchView2 wikiSearchView2 = (WikiSearchView2) mo47369a(R.id.wiki_search_view);
        Intrinsics.checkExpressionValueIsNotNull(wikiSearchView2, "wiki_search_view");
        wikiSearchView2.setVisibility(0);
        ((WikiSearchView2) mo47369a(R.id.wiki_search_view)).mo47060h();
    }

    /* renamed from: d */
    public final void mo47374d() {
        WikiSearchView2 wikiSearchView2 = (WikiSearchView2) mo47369a(R.id.wiki_search_view);
        Intrinsics.checkExpressionValueIsNotNull(wikiSearchView2, "wiki_search_view");
        wikiSearchView2.setVisibility(8);
        WikiCoverCoordinatorLayout wikiCoverCoordinatorLayout = (WikiCoverCoordinatorLayout) mo47369a(R.id.wiki_coordinator_layout);
        Intrinsics.checkExpressionValueIsNotNull(wikiCoverCoordinatorLayout, "wiki_coordinator_layout");
        wikiCoverCoordinatorLayout.setVisibility(0);
    }

    /* renamed from: i */
    private final void m51726i() {
        ((SpaceCoverView) mo47369a(R.id.wiki_cover_view)).setViewDelegate(new C12433b(this));
        ((WikiTreeCtrlView) mo47369a(R.id.wiki_tree_ctrl_view)).setViewDelegate(new C12434c(this));
        ((WikiSearchView2) mo47369a(R.id.wiki_search_view)).setViewDelegate(new C12435d(this));
        ((CommonCreateButton) mo47369a(R.id.common_create_button)).setOnClickListener(new View$OnClickListenerC12436e(this));
    }

    /* renamed from: g */
    private final void m51724g() {
        String str;
        WikiDocument.SpaceCover spaceCover;
        mo47370a().mo47367a();
        ((BaseTitleBar) mo47369a(R.id.wiki_floating_title_bar)).setActionIconTint(R.color.icon_n1);
        BaseTitleBar baseTitleBar = (BaseTitleBar) mo47369a(R.id.wiki_floating_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(baseTitleBar, "wiki_floating_title_bar");
        ((SpaceCoverView) mo47369a(R.id.wiki_cover_view)).setFloatingTitleBar(baseTitleBar);
        SpaceCoverView spaceCoverView = (SpaceCoverView) mo47369a(R.id.wiki_cover_view);
        WikiTreeActivityContract wikiTreeActivityContract = this.f33367b;
        if (wikiTreeActivityContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        WikiDocument wikiDocument = wikiTreeActivityContract.getWikiDocument();
        Boolean bool = null;
        if (wikiDocument != null) {
            str = wikiDocument.mo32469n();
        } else {
            str = null;
        }
        spaceCoverView.setTitle(str);
        SpaceCoverView spaceCoverView2 = (SpaceCoverView) mo47369a(R.id.wiki_cover_view);
        WikiTreeActivityContract wikiTreeActivityContract2 = this.f33367b;
        if (wikiTreeActivityContract2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        WikiDocument wikiDocument2 = wikiTreeActivityContract2.getWikiDocument();
        if (wikiDocument2 != null) {
            spaceCover = wikiDocument2.mo21014d();
        } else {
            spaceCover = null;
        }
        spaceCoverView2.setCover(spaceCover);
        SpaceCoverView spaceCoverView3 = (SpaceCoverView) mo47369a(R.id.wiki_cover_view);
        WikiTreeActivityContract wikiTreeActivityContract3 = this.f33367b;
        if (wikiTreeActivityContract3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        WikiDocument wikiDocument3 = wikiTreeActivityContract3.getWikiDocument();
        if (wikiDocument3 != null) {
            bool = Boolean.valueOf(wikiDocument3.mo21020h());
        }
        spaceCoverView3.setScope(bool);
        WikiSearchView2 wikiSearchView2 = (WikiSearchView2) mo47369a(R.id.wiki_search_view);
        WikiTreeFragment dVar = this;
        WikiTreeActivityContract wikiTreeActivityContract4 = this.f33367b;
        if (wikiTreeActivityContract4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        wikiSearchView2.mo47045a(dVar, wikiTreeActivityContract4.getSpaceId());
        WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) mo47369a(R.id.wiki_tree_ctrl_view);
        WikiTreeActivityContract wikiTreeActivityContract5 = this.f33367b;
        if (wikiTreeActivityContract5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        String spaceId = wikiTreeActivityContract5.getSpaceId();
        WikiTreeActivityContract wikiTreeActivityContract6 = this.f33367b;
        if (wikiTreeActivityContract6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        String documentToken = wikiTreeActivityContract6.getDocumentToken();
        WikiTreeCtrlView.ViewConfig bVar = new WikiTreeCtrlView.ViewConfig();
        bVar.mo47732c(true);
        bVar.mo47734d(true);
        bVar.mo47736e(true);
        bVar.mo47728b("Wiki_WikiTreeFragment");
        bVar.mo47731c("fullscreen");
        WikiTreeCtrlView.m52069a(wikiTreeCtrlView, dVar, spaceId, documentToken, bVar, null, 16, null);
        CommonCreateButton commonCreateButton = (CommonCreateButton) mo47369a(R.id.common_create_button);
        Intrinsics.checkExpressionValueIsNotNull(commonCreateButton, "common_create_button");
        commonCreateButton.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo47372b() {
        BaseTitleBar baseTitleBar;
        UDEmptyState uDEmptyState;
        UDEmptyState uDEmptyState2;
        WikiCoverCoordinatorLayout wikiCoverCoordinatorLayout = (WikiCoverCoordinatorLayout) mo47369a(R.id.wiki_coordinator_layout);
        if (wikiCoverCoordinatorLayout != null) {
            wikiCoverCoordinatorLayout.setVisibility(8);
        }
        WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) mo47369a(R.id.wiki_tree_ctrl_view);
        if (wikiTreeCtrlView != null) {
            wikiTreeCtrlView.setVisibility(8);
        }
        CommonCreateButton commonCreateButton = (CommonCreateButton) mo47369a(R.id.common_create_button);
        if (commonCreateButton != null) {
            commonCreateButton.setVisibility(8);
        }
        View a = mo47369a(R.id.wiki_err_view);
        if (a != null) {
            a.setVisibility(0);
        }
        View a2 = mo47369a(R.id.wiki_err_view);
        if (a2 != null) {
            baseTitleBar = (BaseTitleBar) a2.findViewById(R.id.title_bar);
        } else {
            baseTitleBar = null;
        }
        m51722a(baseTitleBar);
        View a3 = mo47369a(R.id.wiki_err_view);
        if (!(a3 == null || (uDEmptyState2 = (UDEmptyState) a3.findViewById(R.id.common_error_state)) == null)) {
            uDEmptyState2.setDesc(getText(R.string.CreationMobile_wiki_DeleteWiki_deleted_return_toast));
        }
        View a4 = mo47369a(R.id.wiki_err_view);
        if (a4 != null && (uDEmptyState = (UDEmptyState) a4.findViewById(R.id.common_error_state)) != null) {
            uDEmptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_preview));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.d$e */
    public static final class View$OnClickListenerC12436e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiTreeFragment f33375a;

        View$OnClickListenerC12436e(WikiTreeFragment dVar) {
            this.f33375a = dVar;
        }

        public final void onClick(View view) {
            ((WikiTreeCtrlView) this.f33375a.mo47369a(R.id.wiki_tree_ctrl_view)).mo47697a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ WikiTreeActivityContract m51721a(WikiTreeFragment dVar) {
        WikiTreeActivityContract wikiTreeActivityContract = dVar.f33367b;
        if (wikiTreeActivityContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        return wikiTreeActivityContract;
    }

    /* renamed from: a */
    private final void m51722a(BaseTitleBar baseTitleBar) {
        String str;
        if (baseTitleBar != null) {
            WikiTreeActivityContract wikiTreeActivityContract = this.f33367b;
            if (wikiTreeActivityContract == null) {
                Intrinsics.throwUninitializedPropertyAccessException("contract");
            }
            WikiDocument wikiDocument = wikiTreeActivityContract.getWikiDocument();
            if (wikiDocument != null) {
                str = wikiDocument.mo32469n();
            } else {
                str = null;
            }
            baseTitleBar.setTitle(str);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) baseTitleBar.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C13746i.m55722a(getContext());
                baseTitleBar.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        WikiTreeActivityContract wikiTreeActivityContract;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            wikiTreeActivityContract = (WikiTreeActivityContract) arguments.getParcelable(WikiTreeActivityContract.class.getName());
        } else {
            wikiTreeActivityContract = null;
        }
        if (wikiTreeActivityContract == null) {
            Intrinsics.throwNpe();
        }
        this.f33367b = wikiTreeActivityContract;
        if (wikiTreeActivityContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        String spaceId = wikiTreeActivityContract.getSpaceId();
        WikiTreeActivityContract wikiTreeActivityContract2 = this.f33367b;
        if (wikiTreeActivityContract2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        WikiReportV2.m50919b(spaceId, wikiTreeActivityContract2.getDocumentToken());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m51724g();
        m51725h();
        m51726i();
    }

    /* renamed from: a */
    public final void mo47371a(String str, String str2) {
        String str3;
        if (str2 == null) {
            str2 = ((WikiTreeCtrlView) mo47369a(R.id.wiki_tree_ctrl_view)).getSpaceId();
        }
        SpaceInfo spaceInfo = ((WikiTreeCtrlView) mo47369a(R.id.wiki_tree_ctrl_view)).getSpaceInfo();
        if (spaceInfo != null) {
            str3 = spaceInfo.space_name;
        } else {
            str3 = null;
        }
        C12432c.m51716a(str2, str3, str, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((WikiTreeCtrlView) mo47369a(R.id.wiki_tree_ctrl_view)).mo47698a(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_tree_fragment, viewGroup, false);
    }

    /* renamed from: a */
    static /* synthetic */ void m51723a(WikiTreeFragment dVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        dVar.mo47371a(str, str2);
    }
}
