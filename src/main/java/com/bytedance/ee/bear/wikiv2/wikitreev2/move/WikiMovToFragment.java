package com.bytedance.ee.bear.wikiv2.wikitreev2.move;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.create.NetObserveView;
import com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiDialogs;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView;
import com.larksuite.suite.R;
import io.reactivex.functions.Function;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/move/WikiMovToFragment;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToFragment;", "()V", "movView", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/NetObserveView;", "wikiDialog", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiDialogs;", "initAction", "", "initContent", "initTitleBar", "setResultThenFinish", "focusToken", "", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.c.a */
public final class WikiMovToFragment extends WikiCreateToFragment {

    /* renamed from: h */
    public static final Companion f33292h = new Companion(null);

    /* renamed from: f */
    public NetObserveView f33293f;

    /* renamed from: g */
    public final WikiDialogs f33294g = new WikiDialogs();

    /* renamed from: i */
    private HashMap f33295i;

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: a */
    public View mo47246a(int i) {
        if (this.f33295i == null) {
            this.f33295i = new HashMap();
        }
        View view = (View) this.f33295i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33295i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: g */
    public void mo47257g() {
        HashMap hashMap = this.f33295i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47257g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/move/WikiMovToFragment$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: b */
    public void mo47252b() {
        ((BaseTitleBar) mo47246a(R.id.wiki_title_bar)).setTitle(mo47247a().getDocumentName());
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: c */
    public void mo47253c() {
        View a = ((BaseTitleBar) mo47246a(R.id.wiki_title_bar)).mo45070a((BaseTitleBar.AbstractC11800a) new BaseTitleBar.C11804e(getText(R.string.Doc_Wiki_ConfirmMove), (int) R.color.primary_pri_500));
        Intrinsics.checkExpressionValueIsNotNull(a, "wiki_title_bar.addRightA…R.color.primary_pri_500))");
        NetObserveView aVar = new NetObserveView(this, a);
        this.f33293f = aVar;
        if (aVar != null) {
            aVar.mo47243a(false);
        }
        NetObserveView aVar2 = this.f33293f;
        if (aVar2 != null) {
            aVar2.mo47242a(new View$OnClickListenerC12406b(this), new View$OnClickListenerC12409c(this));
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: e */
    public void mo47255e() {
        WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) mo47246a(R.id.wiki_tree_ctrl_view);
        WikiMovToFragment aVar = this;
        String spaceId = mo47247a().getSpaceId();
        WikiTreeCtrlView.ViewConfig bVar = new WikiTreeCtrlView.ViewConfig();
        String srcToken = mo47247a().getSrcToken();
        if (srcToken == null) {
            srcToken = "";
        }
        bVar.mo47726a(srcToken);
        bVar.mo47727a(true);
        bVar.mo47729b(false);
        bVar.mo47732c(false);
        bVar.mo47728b("Wiki_WikiMovToFragment");
        bVar.mo47725a(C12410d.f33301a);
        WikiTreeCtrlView.m52069a(wikiTreeCtrlView, aVar, spaceId, "", bVar, null, 16, null);
        ((WikiTreeCtrlView) mo47246a(R.id.wiki_tree_ctrl_view)).setViewDelegate(new C12411e(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/move/WikiMovToFragment$initContent$2", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "onFocusChange", "", "wikiToken", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.c.a$e */
    public static final class C12411e extends WikiTreeCtrlView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiMovToFragment f33302a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12411e(WikiMovToFragment aVar) {
            this.f33302a = aVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47263a(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "wikiToken");
            NetObserveView aVar = this.f33302a.f33293f;
            if (aVar != null) {
                String str2 = str;
                if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, this.f33302a.mo47247a().getSrcToken()) || TextUtils.equals(str2, this.f33302a.mo47247a().getSrcParentToken())) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.mo47243a(z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.c.a$d */
    static final class C12410d<T, R> implements Function<TreeNode, Boolean> {

        /* renamed from: a */
        public static final C12410d f33301a = new C12410d();

        C12410d() {
        }

        /* renamed from: a */
        public final boolean mo47276a(TreeNode treeNode) {
            Intrinsics.checkParameterIsNotNull(treeNode, "it");
            return !treeNode.isShortcut();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(TreeNode treeNode) {
            return Boolean.valueOf(mo47276a(treeNode));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.c.a$c */
    static final class View$OnClickListenerC12409c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiMovToFragment f33300a;

        View$OnClickListenerC12409c(WikiMovToFragment aVar) {
            this.f33300a = aVar;
        }

        public final void onClick(View view) {
            if (!TextUtils.isEmpty(((WikiTreeCtrlView) this.f33300a.mo47246a(R.id.wiki_tree_ctrl_view)).getFocusToken())) {
                Toast.showFailureText(this.f33300a.getContext(), (int) R.string.Doc_Wiki_Move_SelectFather);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.c.a$b */
    static final class View$OnClickListenerC12406b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiMovToFragment f33296a;

        View$OnClickListenerC12406b(WikiMovToFragment aVar) {
            this.f33296a = aVar;
        }

        public final void onClick(View view) {
            final String focusToken = ((WikiTreeCtrlView) this.f33296a.mo47246a(R.id.wiki_tree_ctrl_view)).getFocusToken();
            if (TextUtils.isEmpty(focusToken)) {
                return;
            }
            if (this.f33296a.mo47247a().getSrcIsLock() == 0) {
                WikiReportV2.m50903a(this.f33296a.mo47247a().getSpaceId());
                this.f33296a.f33294g.mo47798a(this.f33296a.getContext(), new View.OnClickListener(this) {
                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.move.WikiMovToFragment.View$OnClickListenerC12406b.View$OnClickListenerC124071 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC12406b f33297a;

                    {
                        this.f33297a = r1;
                    }

                    public final void onClick(View view) {
                        WikiReportV2.m50908a("confirm", "none", this.f33297a.f33296a.mo47247a().getSpaceId());
                        this.f33297a.f33296a.mo47271a(focusToken);
                    }
                }, new View.OnClickListener(this) {
                    /* class com.bytedance.ee.bear.wikiv2.wikitreev2.move.WikiMovToFragment.View$OnClickListenerC12406b.View$OnClickListenerC124082 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC12406b f33299a;

                    {
                        this.f33299a = r1;
                    }

                    public final void onClick(View view) {
                        WikiReportV2.m50908a("cancel", "none", this.f33299a.f33296a.mo47247a().getSpaceId());
                    }
                });
                return;
            }
            this.f33296a.mo47271a(focusToken);
        }
    }

    /* renamed from: a */
    public final void mo47271a(String str) {
        WikiReportV2.m50912a("click_confirm_move", "", str, null, null, null, null, null, null, null, null, 2040, null);
        WikiCreateToFragment.m51575a(this, null, null, 3, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("space_id", mo47247a().getSpaceId());
            intent.putExtra("src_token", mo47247a().getSrcToken());
            intent.putExtra("dest_token", str);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }
}
