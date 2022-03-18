package com.bytedance.ee.bear.wikiv2.wikitreev2.create;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wikiv2.home.create.SelectIndex;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.searchv2.C12360b;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivityContract;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.C12432c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiAction;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.WikiTips;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView;
import com.bytedance.ee.util.p718t.C13727b;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70022d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0003J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\"\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u0010H\u0016J\u001a\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J#\u0010+\u001a\u00020\u00102\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0010H\u0002J\u0010\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "contract", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;", "getContract", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;", "setContract", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/WikiTreeActivityContract;)V", "createView", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/NetObserveView;", "loadingDialog", "Lcom/bytedance/ee/bear/bizwidget/LoadingDialog;", "titleBarHeight", "", "createDocument", "", "parentToken", "", "documentType", "initAction", "initContent", "initSearchView", "initTitleBar", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "reportWikiFileLocationSelectClick", "children_file_type", "children_page_token", "(Ljava/lang/Integer;Ljava/lang/String;)V", "setResultOkAndFinish", "setTitleBarVisible", "visible", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b */
public class WikiCreateToFragment extends C7667e {

    /* renamed from: e */
    public static final Companion f33266e = new Companion(null);

    /* renamed from: a */
    public WikiTreeActivityContract f33267a;

    /* renamed from: b */
    public int f33268b;

    /* renamed from: c */
    public NetObserveView f33269c;

    /* renamed from: d */
    public C4878c f33270d;

    /* renamed from: f */
    private HashMap f33271f;

    /* renamed from: a */
    public View mo47246a(int i) {
        if (this.f33271f == null) {
            this.f33271f = new HashMap();
        }
        View view = (View) this.f33271f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33271f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public void mo47257g() {
        HashMap hashMap = this.f33271f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47257g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToFragment$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$c */
    public static final class C12395c implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ WikiCreateToFragment f33273a;

        C12395c(WikiCreateToFragment bVar) {
            this.f33273a = bVar;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            C4878c cVar = this.f33273a.f33270d;
            if (cVar != null) {
                cVar.mo19130b();
            }
        }
    }

    /* renamed from: a */
    public WikiTreeActivityContract mo47247a() {
        WikiTreeActivityContract wikiTreeActivityContract = this.f33267a;
        if (wikiTreeActivityContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contract");
        }
        return wikiTreeActivityContract;
    }

    /* renamed from: d */
    public final void mo47254d() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, null);
            activity.finish();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C4878c cVar = this.f33270d;
        if (cVar != null) {
            cVar.mo19130b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToFragment$initSearchView$1", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;", "onEnterSearch", "", "onExitSearch", "onSearchItemClick", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$i */
    public static final class C12401i implements WikiSearchView2.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiCreateToFragment f33279a;

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: b */
        public void mo46932b() {
            this.f33279a.mo47251a(true);
            WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) this.f33279a.mo47246a(R.id.wiki_tree_ctrl_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiTreeCtrlView, "wiki_tree_ctrl_view");
            wikiTreeCtrlView.setVisibility(0);
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46930a() {
            WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) this.f33279a.mo47246a(R.id.wiki_tree_ctrl_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiTreeCtrlView, "wiki_tree_ctrl_view");
            wikiTreeCtrlView.setVisibility(8);
            WikiCreateToFragment bVar = this.f33279a;
            AppBarLayout appBarLayout = (AppBarLayout) bVar.mo47246a(R.id.appbar_layout);
            Intrinsics.checkExpressionValueIsNotNull(appBarLayout, "appbar_layout");
            bVar.f33268b = appBarLayout.getHeight();
            this.f33279a.mo47251a(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12401i(WikiCreateToFragment bVar) {
            this.f33279a = bVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46931a(C12360b bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "wikiSearchResult");
            this.f33279a.mo47251a(true);
            ((WikiSearchView2) this.f33279a.mo47246a(R.id.wiki_search_view)).mo47061i();
            WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) this.f33279a.mo47246a(R.id.wiki_tree_ctrl_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiTreeCtrlView, "wiki_tree_ctrl_view");
            wikiTreeCtrlView.setVisibility(0);
            String str = bVar.f33161f;
            Intrinsics.checkExpressionValueIsNotNull(str, "wikiSearchResult.wikiToken");
            ((WikiTreeCtrlView) this.f33279a.mo47246a(R.id.wiki_tree_ctrl_view)).mo47706a(str);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (((WikiSearchView2) mo47246a(R.id.wiki_search_view)).mo47061i() || super.onBackPressed()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo47256f() {
        ((WikiSearchView2) mo47246a(R.id.wiki_search_view)).mo47045a(this, mo47247a().getSpaceId());
        ((WikiSearchView2) mo47246a(R.id.wiki_search_view)).setViewDelegate(new C12401i(this));
        ((WikiSearchView2) mo47246a(R.id.wiki_search_view)).setSource("wiki_pages_operation");
    }

    /* renamed from: b */
    public void mo47252b() {
        String str;
        BaseTitleBar baseTitleBar = (BaseTitleBar) mo47246a(R.id.wiki_title_bar);
        if (SelectIndex.Companion.mo46851b(mo47247a().getCreateDocumentType())) {
            str = C10539a.m43639a(getContext(), R.string.CreationMobile_Wiki_Common_UploadToWorkspace_title, "workspace", mo47247a().getDocumentName());
        } else {
            str = C10539a.m43639a(getContext(), R.string.Doc_Wiki_CreateTo, "Workspace_Name", mo47247a().getDocumentName());
        }
        baseTitleBar.setTitle(str);
    }

    /* renamed from: c */
    public void mo47253c() {
        int i;
        WikiCreateToFragment bVar = this;
        BaseTitleBar baseTitleBar = (BaseTitleBar) mo47246a(R.id.wiki_title_bar);
        if (SelectIndex.Companion.mo46851b(mo47247a().getCreateDocumentType())) {
            i = R.string.CreationMobile_Wiki_Common_upload_title;
        } else {
            i = R.string.Doc_Wiki_Create;
        }
        View a = baseTitleBar.mo45070a((BaseTitleBar.AbstractC11800a) new BaseTitleBar.C11804e(getText(i), (int) R.color.primary_pri_500));
        Intrinsics.checkExpressionValueIsNotNull(a, "wiki_title_bar.addRightA…R.color.primary_pri_500))");
        NetObserveView aVar = new NetObserveView(bVar, a);
        this.f33269c = aVar;
        if (aVar != null) {
            aVar.mo47243a(false);
        }
        NetObserveView aVar2 = this.f33269c;
        if (aVar2 != null) {
            NetObserveView.m51571a(aVar2, new View$OnClickListenerC12398f(this), null, 2, null);
        }
    }

    /* renamed from: e */
    public void mo47255e() {
        String spaceId = mo47247a().getSpaceId();
        String srcToken = mo47247a().getSrcToken();
        WikiTreeCtrlView.ViewConfig bVar = new WikiTreeCtrlView.ViewConfig();
        bVar.mo47727a(true);
        bVar.mo47729b(false);
        bVar.mo47732c(false);
        bVar.mo47728b("Wiki_WikiCreateToFragment");
        bVar.mo47725a(C12399g.f33277a);
        WikiTreeCtrlView.m52069a((WikiTreeCtrlView) mo47246a(R.id.wiki_tree_ctrl_view), this, spaceId, srcToken, bVar, null, 16, null);
        ((WikiTreeCtrlView) mo47246a(R.id.wiki_tree_ctrl_view)).setViewDelegate(new C12400h(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToFragment$initContent$2", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "onFocusChange", "", "wikiToken", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$h */
    public static final class C12400h extends WikiTreeCtrlView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiCreateToFragment f33278a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12400h(WikiCreateToFragment bVar) {
            this.f33278a = bVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47263a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "wikiToken");
            NetObserveView aVar = this.f33278a.f33269c;
            if (aVar != null) {
                aVar.mo47243a(!TextUtils.isEmpty(str));
            }
        }
    }

    /* renamed from: a */
    public void mo47248a(WikiTreeActivityContract wikiTreeActivityContract) {
        Intrinsics.checkParameterIsNotNull(wikiTreeActivityContract, "<set-?>");
        this.f33267a = wikiTreeActivityContract;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$b */
    public static final class C12394b<T> implements Consumer<AbstractC70022d> {

        /* renamed from: a */
        final /* synthetic */ WikiCreateToFragment f33272a;

        C12394b(WikiCreateToFragment bVar) {
            this.f33272a = bVar;
        }

        /* renamed from: a */
        public final void accept(AbstractC70022d dVar) {
            C4878c cVar = this.f33272a.f33270d;
            if (cVar != null) {
                cVar.mo19132c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$g */
    public static final class C12399g<T, R> implements Function<TreeNode, Boolean> {

        /* renamed from: a */
        public static final C12399g f33277a = new C12399g();

        C12399g() {
        }

        /* renamed from: a */
        public final boolean mo47262a(TreeNode treeNode) {
            Intrinsics.checkParameterIsNotNull(treeNode, "it");
            return !treeNode.isShortcut();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(TreeNode treeNode) {
            return Boolean.valueOf(mo47262a(treeNode));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$e */
    public static final class C12397e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ WikiCreateToFragment f33275a;

        C12397e(WikiCreateToFragment bVar) {
            this.f33275a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.showFailureText(this.f33275a.getContext(), WikiTips.f33454a.mo47515a(WikiAction.ADD, th));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "newInsert", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$d */
    public static final class C12396d<T> implements Consumer<TreeNode> {

        /* renamed from: a */
        final /* synthetic */ WikiCreateToFragment f33274a;

        C12396d(WikiCreateToFragment bVar) {
            this.f33274a = bVar;
        }

        /* renamed from: a */
        public final void accept(TreeNode treeNode) {
            String str;
            String spaceId = this.f33274a.mo47247a().getSpaceId();
            SpaceInfo spaceInfo = ((WikiTreeCtrlView) this.f33274a.mo47246a(R.id.wiki_tree_ctrl_view)).getSpaceInfo();
            if (spaceInfo != null) {
                str = spaceInfo.space_name;
            } else {
                str = null;
            }
            C12432c.m51716a(spaceId, str, treeNode.wiki_token, null);
            this.f33274a.mo47254d();
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
        mo47248a(wikiTreeActivityContract);
        WikiReportV2.m50904a(WikiReportV2.Utils.m50930a(mo47247a().getPageMode(), mo47247a().getCreateDocumentType()), mo47247a().getSpaceId());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.a.b$f */
    public static final class View$OnClickListenerC12398f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiCreateToFragment f33276a;

        View$OnClickListenerC12398f(WikiCreateToFragment bVar) {
            this.f33276a = bVar;
        }

        public final void onClick(View view) {
            String focusToken = ((WikiTreeCtrlView) this.f33276a.mo47246a(R.id.wiki_tree_ctrl_view)).getFocusToken();
            if (!TextUtils.isEmpty(focusToken)) {
                WikiReportV2.m50912a("confirm_create_new", "", focusToken, null, null, null, null, null, null, null, null, 2040, null);
                SelectIndex a = SelectIndex.Companion.mo46850a(this.f33276a.mo47247a().getCreateDocumentType());
                int documentType = a.getDocumentType();
                this.f33276a.mo47249a(Integer.valueOf(documentType), "none");
                if (documentType != 12) {
                    this.f33276a.mo47250a(focusToken, documentType);
                } else if (a == SelectIndex.MEDIA) {
                    ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19662b(focusToken, "wiki", new Bundle(), 0);
                } else if (a == SelectIndex.FILE) {
                    ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19654a(focusToken, "wiki", new Bundle(), 0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo47251a(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = this.f33268b;
        }
        if (z) {
            i2 = this.f33268b;
        }
        C13727b.m55679a((View) ((AppBarLayout) mo47246a(R.id.appbar_layout)), i, i2, (int) LocationRequest.PRIORITY_HD_ACCURACY).start();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo47252b();
        mo47253c();
        mo47256f();
        mo47255e();
    }

    /* renamed from: a */
    public final void mo47249a(Integer num, String str) {
        String str2;
        String a = WikiReportV2.Utils.m50930a(mo47247a().getPageMode(), mo47247a().getCreateDocumentType());
        String spaceId = mo47247a().getSpaceId();
        if (num != null) {
            str2 = C8275a.m34050a(num.intValue());
        } else {
            str2 = null;
        }
        WikiReportV2.m50915a("confirm", "ccm_docs_page_view", a, spaceId, str2, str, mo47247a().getSpaceId(), ((WikiTreeCtrlView) mo47246a(R.id.wiki_tree_ctrl_view)).getFocusToken());
    }

    /* renamed from: a */
    public final void mo47250a(String str, int i) {
        WikiCreateToViewModel a = WikiCreateToViewModel.Companion.mo47265a(this);
        if (this.f33270d == null) {
            C4878c cVar = new C4878c(getContext());
            cVar.mo19131b(R.string.Doc_Wiki_CreateDialog);
            this.f33270d = cVar;
        }
        a.createWiki(mo47247a().getSpaceId(), str, i).mo238013c(new C12394b(this)).mo237995a(new C12395c(this)).mo238001b(new C12396d(this), new C12397e(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            mo47254d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_tree_create_fragment, viewGroup, false);
    }

    /* renamed from: a */
    public static /* synthetic */ void m51575a(WikiCreateToFragment bVar, Integer num, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            bVar.mo47249a(num, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportWikiFileLocationSelectClick");
    }
}
