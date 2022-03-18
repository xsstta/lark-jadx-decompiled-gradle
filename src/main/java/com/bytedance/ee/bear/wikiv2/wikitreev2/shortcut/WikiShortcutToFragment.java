package com.bytedance.ee.bear.wikiv2.wikitreev2.shortcut;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.create.NetObserveView;
import com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView;
import com.larksuite.suite.R;
import io.reactivex.functions.Function;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/shortcut/WikiShortcutToFragment;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/WikiCreateToFragment;", "()V", "confirmView", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/create/NetObserveView;", "initAction", "", "initContent", "initTitleBar", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.e.a */
public final class WikiShortcutToFragment extends WikiCreateToFragment {

    /* renamed from: g */
    public static final Companion f33314g = new Companion(null);

    /* renamed from: f */
    public NetObserveView f33315f;

    /* renamed from: h */
    private HashMap f33316h;

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: a */
    public View mo47246a(int i) {
        if (this.f33316h == null) {
            this.f33316h = new HashMap();
        }
        View view = (View) this.f33316h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33316h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: g */
    public void mo47257g() {
        HashMap hashMap = this.f33316h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo47257g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/shortcut/WikiShortcutToFragment$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.e.a$a */
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
        View a = ((BaseTitleBar) mo47246a(R.id.wiki_title_bar)).mo45070a((BaseTitleBar.AbstractC11800a) new BaseTitleBar.C11804e(getText(R.string.CreationMobile_Wiki_Shortcuts_Confirm_Button), (int) R.color.primary_pri_500));
        Intrinsics.checkExpressionValueIsNotNull(a, "wiki_title_bar.addRightA…R.color.primary_pri_500))");
        NetObserveView aVar = new NetObserveView(this, a);
        this.f33315f = aVar;
        if (aVar != null) {
            aVar.mo47243a(false);
        }
        NetObserveView aVar2 = this.f33315f;
        if (aVar2 != null) {
            NetObserveView.m51571a(aVar2, new View$OnClickListenerC12415b(this), null, 2, null);
        }
    }

    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.create.WikiCreateToFragment
    /* renamed from: e */
    public void mo47255e() {
        String spaceId = mo47247a().getSpaceId();
        WikiTreeCtrlView.ViewConfig bVar = new WikiTreeCtrlView.ViewConfig();
        bVar.mo47726a("");
        bVar.mo47727a(true);
        bVar.mo47729b(false);
        bVar.mo47732c(false);
        bVar.mo47728b("Wiki_WikiShortcutToFragment");
        bVar.mo47725a(C12416c.f33318a);
        WikiTreeCtrlView.m52069a((WikiTreeCtrlView) mo47246a(R.id.wiki_tree_ctrl_view), this, spaceId, "", bVar, null, 16, null);
        ((WikiTreeCtrlView) mo47246a(R.id.wiki_tree_ctrl_view)).setViewDelegate(new C12417d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/shortcut/WikiShortcutToFragment$initContent$2", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "onFocusChange", "", "wikiToken", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.e.a$d */
    public static final class C12417d extends WikiTreeCtrlView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiShortcutToFragment f33319a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12417d(WikiShortcutToFragment aVar) {
            this.f33319a = aVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47263a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "wikiToken");
            NetObserveView aVar = this.f33319a.f33315f;
            if (aVar != null) {
                aVar.mo47243a(!TextUtils.isEmpty(str));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/bean/TreeNode;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.e.a$c */
    static final class C12416c<T, R> implements Function<TreeNode, Boolean> {

        /* renamed from: a */
        public static final C12416c f33318a = new C12416c();

        C12416c() {
        }

        /* renamed from: a */
        public final boolean mo47307a(TreeNode treeNode) {
            Intrinsics.checkParameterIsNotNull(treeNode, "it");
            return !treeNode.isShortcut();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(TreeNode treeNode) {
            return Boolean.valueOf(mo47307a(treeNode));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.e.a$b */
    static final class View$OnClickListenerC12415b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WikiShortcutToFragment f33317a;

        View$OnClickListenerC12415b(WikiShortcutToFragment aVar) {
            this.f33317a = aVar;
        }

        public final void onClick(View view) {
            String focusToken = ((WikiTreeCtrlView) this.f33317a.mo47246a(R.id.wiki_tree_ctrl_view)).getFocusToken();
            String srcToken = this.f33317a.mo47247a().getSrcToken();
            if (srcToken == null) {
                srcToken = "";
            }
            WikiReportV2.m50912a("confirm_shortcut_to", "", srcToken, null, null, null, null, null, focusToken, null, null, 1784, null);
            if (!TextUtils.isEmpty(focusToken)) {
                WikiShortcutToFragment aVar = this.f33317a;
                aVar.mo47249a(Integer.valueOf(aVar.mo47247a().getSrcObjType()), "none");
                FragmentActivity activity = this.f33317a.getActivity();
                if (activity != null) {
                    Intent intent = new Intent();
                    intent.putExtra("space_id", this.f33317a.mo47247a().getSpaceId());
                    intent.putExtra("src_token", this.f33317a.mo47247a().getSrcToken());
                    intent.putExtra("dest_token", focusToken);
                    activity.setResult(-1, intent);
                    activity.finish();
                }
            }
        }
    }
}
