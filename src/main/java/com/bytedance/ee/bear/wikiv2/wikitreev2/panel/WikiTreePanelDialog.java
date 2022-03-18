package com.bytedance.ee.bear.wikiv2.wikitreev2.panel;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.wikiv2.common.widget.FullBottomSheetFragment;
import com.bytedance.ee.bear.wikiv2.p588b.C12198b;
import com.bytedance.ee.bear.wikiv2.report.WikiDevReportV2;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.bear.wikiv2.searchv2.C12360b;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.C12432c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.SpaceInfo;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.C12504l;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\u00020\u0001:\u0002./B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0002J0\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002J\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\u001a\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010)\u001a\u00020\bH\u0002J\u0018\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/panel/WikiTreePanelDialog;", "Lcom/bytedance/ee/bear/wikiv2/common/widget/FullBottomSheetFragment;", "()V", "onBoardingTask", "Ljava/lang/Runnable;", "viewModel", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/panel/WikiTreePanelDialog$_ViewModel;", "bindListener", "", "bindView", "closeIfLoseFocus", "getCtx", "Landroidx/fragment/app/FragmentActivity;", "initView", "context", "navigation", "targetToken", "", "popLast", "", "targetSpace", "dismissNow", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onStart", "onViewCreated", "view", "showOnBoarding", "switchWorkspace", "toSpaceId", "wikiToken", "updateTitle", "Companion", "_ViewModel", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.d.a */
public final class WikiTreePanelDialog extends FullBottomSheetFragment {

    /* renamed from: d */
    public static final Companion f33305d = new Companion(null);

    /* renamed from: c */
    public _ViewModel f33306c;

    /* renamed from: e */
    private Runnable f33307e;

    /* renamed from: f */
    private HashMap f33308f;

    @JvmStatic
    /* renamed from: a */
    public static final WikiTreePanelDialog m51620a(FragmentActivity fragmentActivity) {
        return f33305d.mo47284a(fragmentActivity);
    }

    @JvmStatic
    /* renamed from: a */
    public static final WikiTreePanelDialog m51621a(FragmentActivity fragmentActivity, String str, String str2, String str3, boolean z) {
        return f33305d.mo47285a(fragmentActivity, str, str2, str3, z);
    }

    /* renamed from: k */
    private final void m51625k() {
    }

    @Override // com.bytedance.ee.bear.wikiv2.common.widget.FullBottomSheetFragment
    /* renamed from: a */
    public View mo46790a(int i) {
        if (this.f33308f == null) {
            this.f33308f = new HashMap();
        }
        View view = (View) this.f33308f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f33308f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.wikiv2.common.widget.FullBottomSheetFragment
    /* renamed from: g */
    public void mo46793g() {
        HashMap hashMap = this.f33308f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.wikiv2.common.widget.FullBottomSheetFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46793g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J6\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/panel/WikiTreePanelDialog$Companion;", "", "()V", "TAG", "", "find", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/panel/WikiTreePanelDialog;", "context", "Landroidx/fragment/app/FragmentActivity;", "getWorkspace", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Workspace;", "show", "title", "spaceId", "wikiToken", "needOnBoarding", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final C12504l mo47286b(FragmentActivity fragmentActivity) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
            return WikiTreeCtrlView.f33573g.mo47723a(fragmentActivity).getWorkspace();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiTreePanelDialog mo47284a(FragmentActivity fragmentActivity) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(WikiTreePanelDialog.class.getName());
            if (!(findFragmentByTag instanceof WikiTreePanelDialog)) {
                findFragmentByTag = null;
            }
            WikiTreePanelDialog aVar = (WikiTreePanelDialog) findFragmentByTag;
            StringBuilder sb = new StringBuilder();
            sb.append("find dialog, dialog is null: ");
            if (aVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C13479a.m54772d("Wiki_WikiTreePanelDialog", sb.toString());
            return aVar;
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiTreePanelDialog mo47285a(FragmentActivity fragmentActivity, String str, String str2, String str3, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
            Intrinsics.checkParameterIsNotNull(str2, "spaceId");
            _ViewModel bVar = (_ViewModel) aj.m5366a(fragmentActivity).mo6005a(_ViewModel.class);
            if (str == null) {
                str = "";
            }
            bVar.setTitle(str);
            bVar.setSpaceId(str2);
            if (str3 == null) {
                str3 = "";
            }
            bVar.setWikiToken(str3);
            bVar.setNeedOnBoarding(z);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, WikiTreePanelDialog.class.getName());
            if (instantiate != null) {
                WikiTreePanelDialog aVar = (WikiTreePanelDialog) instantiate;
                aVar.mo5511a(fragmentActivity.getSupportFragmentManager(), WikiTreePanelDialog.class.getName());
                return aVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.wikitreev2.panel.WikiTreePanelDialog");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/panel/WikiTreePanelDialog$_ViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "needOnBoarding", "", "getNeedOnBoarding", "()Z", "setNeedOnBoarding", "(Z)V", "spaceId", "", "getSpaceId", "()Ljava/lang/String;", "setSpaceId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "wikiToken", "getWikiToken", "setWikiToken", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.d.a$b */
    public static final class _ViewModel extends AbstractC1142af {
        private boolean needOnBoarding;
        private String spaceId = "";
        private String title = "";
        private String wikiToken = "";

        public final boolean getNeedOnBoarding() {
            return this.needOnBoarding;
        }

        public final String getSpaceId() {
            return this.spaceId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getWikiToken() {
            return this.wikiToken;
        }

        public final void setNeedOnBoarding(boolean z) {
            this.needOnBoarding = z;
        }

        public final void setSpaceId(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.spaceId = str;
        }

        public final void setTitle(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.title = str;
        }

        public final void setWikiToken(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.wikiToken = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/panel/WikiTreePanelDialog$bindListener$1", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchView2$ViewDelegate;", "onEnterSearch", "", "onExitSearch", "onSearchItemClick", "wikiSearchResult", "Lcom/bytedance/ee/bear/wikiv2/searchv2/WikiSearchResult;", "position", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.d.a$c */
    public static final class C12413c implements WikiSearchView2.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiTreePanelDialog f33309a;

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: b */
        public void mo46932b() {
            WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) this.f33309a.mo46790a(R.id.wiki_tree_ctrl_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiTreeCtrlView, "wiki_tree_ctrl_view");
            wikiTreeCtrlView.setVisibility(0);
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46930a() {
            WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) this.f33309a.mo46790a(R.id.wiki_tree_ctrl_view);
            Intrinsics.checkExpressionValueIsNotNull(wikiTreeCtrlView, "wiki_tree_ctrl_view");
            wikiTreeCtrlView.setVisibility(8);
            BottomSheetBehavior<FrameLayout> f = this.f33309a.mo46792f();
            if (f != null) {
                f.mo76718d(3);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12413c(WikiTreePanelDialog aVar) {
            this.f33309a = aVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2.ViewDelegate
        /* renamed from: a */
        public void mo46931a(C12360b bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "wikiSearchResult");
            WikiTreePanelDialog aVar = this.f33309a;
            String str = bVar.f33161f;
            Intrinsics.checkExpressionValueIsNotNull(str, "wikiSearchResult.wikiToken");
            WikiTreePanelDialog.m51622a(aVar, str, false, null, false, 12, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0016J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/panel/WikiTreePanelDialog$bindListener$2", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiTreeCtrlView$ViewDelegate;", "onInsert", "", "newToken", "", "onItemClick", "wikiToken", "onMov", "toSpaceId", "movToken", "focusToken", "onPushDel", "delParentToken", "onPushMov", "onReady", "onRemove", "onShortcutTo", "toToken", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.d.a$d */
    public static final class C12414d extends WikiTreeCtrlView.ViewDelegate {

        /* renamed from: a */
        final /* synthetic */ WikiTreePanelDialog f33310a;

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47295a() {
            this.f33310a.mo47281h();
            if (WikiTreePanelDialog.m51619a(this.f33310a).getNeedOnBoarding()) {
                this.f33310a.mo47282i();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12414d(WikiTreePanelDialog aVar) {
            this.f33310a = aVar;
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: d */
        public void mo47301d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "delParentToken");
            this.f33310a.mo47283j();
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: e */
        public void mo47302e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "delParentToken");
            this.f33310a.mo47283j();
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: b */
        public void mo47298b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "newToken");
            WikiTreePanelDialog.m51622a(this.f33310a, str, false, null, false, 14, null);
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: c */
        public void mo47300c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "wikiToken");
            WikiTreePanelDialog.m51622a(this.f33310a, str, false, null, false, 14, null);
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47296a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "toToken");
            WikiTreePanelDialog.m51622a(this.f33310a, str2, false, str, false, 8, null);
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: b */
        public void mo47299b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "movToken");
            Intrinsics.checkParameterIsNotNull(str3, "focusToken");
            this.f33310a.mo47283j();
        }

        @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiTreeCtrlView.ViewDelegate
        /* renamed from: a */
        public void mo47297a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "toSpaceId");
            Intrinsics.checkParameterIsNotNull(str2, "movToken");
            Intrinsics.checkParameterIsNotNull(str3, "focusToken");
            boolean z = !TextUtils.equals(str, ((WikiTreeCtrlView) this.f33310a.mo46790a(R.id.wiki_tree_ctrl_view)).getSpaceId());
            boolean equals = TextUtils.equals(str2, str3);
            if (z && equals) {
                this.f33310a.mo47280a(str, str2);
            }
        }
    }

    /* renamed from: m */
    private final FragmentActivity m51627m() {
        if (getParentFragment() == null) {
            return getActivity();
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment.getActivity();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("Wiki_WikiTreePanelDialog", "onDestroy. ");
        Runnable runnable = this.f33307e;
        if (runnable != null) {
            C13742g.m55710c(runnable);
        }
    }

    /* renamed from: l */
    private final void m51626l() {
        ((WikiSearchView2) mo46790a(R.id.wiki_search_view)).setViewDelegate(new C12413c(this));
        ((WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view)).setViewDelegate(new C12414d(this));
    }

    /* renamed from: h */
    public final void mo47281h() {
        String str;
        SpaceInfo spaceInfo = ((WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view)).getSpaceInfo();
        if (spaceInfo != null) {
            str = spaceInfo.space_name;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            _ViewModel bVar = this.f33306c;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            str = bVar.getTitle();
        }
        TextView textView = (TextView) mo46790a(R.id.wiki_panel_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "wiki_panel_title");
        textView.setText(str);
    }

    /* renamed from: i */
    public final void mo47282i() {
        FragmentActivity m;
        String focusToken = ((WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view)).getFocusToken();
        if (!TextUtils.isEmpty(focusToken) && (m = m51627m()) != null) {
            this.f33307e = new C12198b(m, (WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view)).mo46656a(focusToken, v_());
        }
    }

    /* renamed from: j */
    public final void mo47283j() {
        if (TextUtils.isEmpty(((WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view)).getFocusToken())) {
            mo5513b();
            FragmentActivity m = m51627m();
            if (m != null) {
                m.finish();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.wikiv2.common.widget.FullBottomSheetFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null && (window = v_.getWindow()) != null) {
            IWatermarkManager aVar = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
            View decorView = window.getDecorView();
            if (decorView != null) {
                aVar.mo40646a((FrameLayout) decorView);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ _ViewModel m51619a(WikiTreePanelDialog aVar) {
        _ViewModel bVar = aVar.f33306c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WikiDevReportV2.f32880a = Long.valueOf(System.currentTimeMillis());
        C13479a.m54764b("Wiki_WikiTreePanelDialog", "onCreate. ");
    }

    /* renamed from: b */
    private final void m51624b(FragmentActivity fragmentActivity) {
        WikiTreeCtrlView wikiTreeCtrlView = (WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view);
        WikiTreePanelDialog aVar = this;
        _ViewModel bVar = this.f33306c;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        String spaceId = bVar.getSpaceId();
        _ViewModel bVar2 = this.f33306c;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        String wikiToken = bVar2.getWikiToken();
        WikiTreeCtrlView.ViewConfig bVar3 = new WikiTreeCtrlView.ViewConfig();
        bVar3.mo47732c(true);
        bVar3.mo47734d(true);
        bVar3.mo47736e(true);
        bVar3.mo47728b("Wiki_WikiTreePanelDialog");
        bVar3.mo47731c("panel");
        wikiTreeCtrlView.mo47699a(aVar, spaceId, wikiToken, bVar3, fragmentActivity);
        WikiSearchView2 wikiSearchView2 = (WikiSearchView2) mo46790a(R.id.wiki_search_view);
        _ViewModel bVar4 = this.f33306c;
        if (bVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        wikiSearchView2.mo47045a(aVar, bVar4.getSpaceId());
        mo47281h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity m = m51627m();
        if (m != null) {
            AbstractC1142af a = aj.m5366a(m).mo6005a(_ViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(it…t(_ViewModel::class.java)");
            _ViewModel bVar = (_ViewModel) a;
            this.f33306c = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            String spaceId = bVar.getSpaceId();
            _ViewModel bVar2 = this.f33306c;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            WikiReportV2.m50919b(spaceId, bVar2.getWikiToken());
            m51624b(m);
            m51625k();
            m51626l();
        }
    }

    /* renamed from: a */
    public final void mo47280a(String str, String str2) {
        m51623a(str2, true, str, false);
        WikiTreeCtrlView.m52070a((WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view), str, str2, null, 4, null);
        ((WikiSearchView2) mo46790a(R.id.wiki_search_view)).setSpaceId(str);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.wiki_tree_panel_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        WikiTreeCtrlView wikiTreeCtrlView;
        super.onActivityResult(i, i2, intent);
        if (!isDetached() && (wikiTreeCtrlView = (WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view)) != null) {
            wikiTreeCtrlView.mo47698a(i, i2, intent);
        }
    }

    /* renamed from: a */
    private final void m51623a(String str, boolean z, String str2, boolean z2) {
        if (z2) {
            mo5513b();
        }
        Bundle bundle = null;
        if (z) {
            bundle = new Bundle();
            bundle.putBoolean("popLastDocument", true);
        }
        if (str2 == null) {
            str2 = ((WikiTreeCtrlView) mo46790a(R.id.wiki_tree_ctrl_view)).getSpaceId();
        }
        C12432c.m51716a(str2, "", str, bundle);
    }

    /* renamed from: a */
    static /* synthetic */ void m51622a(WikiTreePanelDialog aVar, String str, boolean z, String str2, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        aVar.m51623a(str, z, str2, z2);
    }
}
