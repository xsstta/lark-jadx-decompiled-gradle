package com.bytedance.ee.bear.block.jira;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.block.jira.JiraActionData;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\u001a\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010'\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraActionFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "dragView", "Lcom/bytedance/ee/bear/facade/common/widget/helper/DragView;", "dragViewContainer", "Landroid/view/View;", "jiraDesc", "Landroid/widget/TextView;", "jiraItemList", "", "jiraTitle", "jiraTitleBar", "jiraViewModel", "Lcom/bytedance/ee/bear/block/jira/JiraViewModel;", "maxHeight", "", "midHeight", "minHeight", "bindView", "", "jiraActionData", "Lcom/bytedance/ee/bear/block/jira/JiraActionData;", "initDragView", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onViewCreated", "view", "updateDragViewHeight", "Companion", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.jira.a */
public final class JiraActionFragment extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: d */
    public static final String f14431d;

    /* renamed from: e */
    public static final Companion f14432e = new Companion(null);

    /* renamed from: c */
    public JiraViewModel f14433c;

    /* renamed from: f */
    private C7728a f14434f;

    /* renamed from: g */
    private View f14435g;

    /* renamed from: h */
    private View f14436h;

    /* renamed from: i */
    private TextView f14437i;

    /* renamed from: j */
    private TextView f14438j;

    /* renamed from: k */
    private final List<View> f14439k = new ArrayList();

    /* renamed from: l */
    private float f14440l;

    /* renamed from: m */
    private float f14441m;

    /* renamed from: n */
    private float f14442n = (((float) C13749l.m55748b()) * 0.85f);

    /* renamed from: o */
    private HashMap f14443o;

    /* renamed from: f */
    public void mo19279f() {
        HashMap hashMap = this.f14443o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraActionFragment$Companion;", "", "()V", "ACTION_CANCEL", "", "TAG", "TAG_JIRA_DESCRIPTION", "TAG_JIRA_ITEM_TEXT", "TAG_JIRA_TITLE", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = JiraActionFragment.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "JiraActionFragment::class.java.simpleName");
        f14431d = simpleName;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        JiraViewModel eVar = this.f14433c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jiraViewModel");
        }
        eVar.setActive(false);
        mo19279f();
    }

    /* renamed from: h */
    private final void m20215h() {
        View view = this.f14435g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewContainer");
        }
        view.measure(0, 0);
        View view2 = this.f14435g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewContainer");
        }
        float min = Math.min((float) view2.getMeasuredHeight(), this.f14441m);
        C7728a aVar = this.f14434f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        aVar.mo30249a(min);
    }

    /* renamed from: g */
    private final void m20214g() {
        View view;
        this.f14441m = getResources().getDimension(R.dimen.jira_action_panel_height);
        Context context = getContext();
        View view2 = this.f14435g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewContainer");
        }
        C7728a aVar = new C7728a(context, view2, this.f14440l, this.f14441m, this.f14442n);
        this.f14434f = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        View view3 = getView();
        if (view3 != null) {
            view = view3.findViewById(R.id.jira_action_top_bar);
        } else {
            view = null;
        }
        aVar.mo30252a(view);
        C7728a aVar2 = this.f14434f;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        aVar2.mo30253a(new C4913c(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        WindowManager.LayoutParams layoutParams = null;
        if (v_ != null) {
            window = v_.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.gravity = 80;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.ActionSheetWindowStyle;
        }
        if (layoutParams != null) {
            layoutParams.y = C13746i.m55722a(getContext());
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.setLayout(-1, -1);
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/block/jira/JiraActionData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.a$d */
    static final class C4914d<T> implements AbstractC1178x<JiraActionData> {

        /* renamed from: a */
        final /* synthetic */ JiraActionFragment f14448a;

        C4914d(JiraActionFragment aVar) {
            this.f14448a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(JiraActionData jiraActionData) {
            this.f14448a.mo19278a(jiraActionData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/block/jira/JiraActionFragment$onViewCreated$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.a$e */
    public static final class C4915e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ JiraActionFragment f14449a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4915e(JiraActionFragment aVar) {
            this.f14449a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            JiraActionFragment.m20213a(this.f14449a).setActive(false);
            JiraActionFragment.m20213a(this.f14449a).callback("Cancel");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ JiraViewModel m20213a(JiraActionFragment aVar) {
        JiraViewModel eVar = aVar.f14433c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jiraViewModel");
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/block/jira/JiraActionFragment$bindView$3$1$1$1", "com/bytedance/ee/bear/block/jira/JiraActionFragment$$special$$inlined$let$lambda$1", "com/bytedance/ee/bear/block/jira/JiraActionFragment$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.a$b */
    public static final class View$OnClickListenerC4912b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f14444a;

        /* renamed from: b */
        final /* synthetic */ JiraActionData.ActionSheetItem f14445b;

        /* renamed from: c */
        final /* synthetic */ JiraActionFragment f14446c;

        View$OnClickListenerC4912b(String str, JiraActionData.ActionSheetItem actionSheetItem, JiraActionFragment aVar) {
            this.f14444a = str;
            this.f14445b = actionSheetItem;
            this.f14446c = aVar;
        }

        public final void onClick(View view) {
            JiraActionFragment.m20213a(this.f14446c).callback(this.f14444a);
            JiraActionFragment.m20213a(this.f14446c).setActive(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onHeightChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.block.jira.a$c */
    public static final class C4913c implements C7728a.AbstractC7730a {

        /* renamed from: a */
        final /* synthetic */ JiraActionFragment f14447a;

        C4913c(JiraActionFragment aVar) {
            this.f14447a = aVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
        public final void onHeightChange(int i) {
            if (i == 0) {
                JiraActionFragment.m20213a(this.f14447a).setActive(false);
                JiraActionFragment.m20213a(this.f14447a).callback("Cancel");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        this.f14442n = ((float) C13749l.m55748b()) * 0.85f;
        C7728a aVar = this.f14434f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        aVar.mo30250a(this.f14440l, this.f14441m, this.f14442n);
        m20215h();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, JiraViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…iraViewModel::class.java)");
        JiraViewModel eVar = (JiraViewModel) a;
        this.f14433c = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jiraViewModel");
        }
        eVar.getJiraActionData().mo5923a(this, new C4914d(this));
    }

    /* renamed from: a */
    public final void mo19278a(JiraActionData jiraActionData) {
        View view;
        JiraActionData.ActionSheetItem[] actions;
        View view2 = this.f14436h;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        Iterator<T> it = this.f14439k.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
        this.f14439k.clear();
        View view3 = getView();
        if (view3 != null) {
            view = view3.findViewWithTag(jiraActionData != null ? jiraActionData.getId() : null);
        } else {
            view = null;
        }
        this.f14436h = view;
        if (view != null) {
            view.setVisibility(0);
            TextView textView = (TextView) view.findViewWithTag("title");
            this.f14437i = textView;
            if (textView != null) {
                textView.setText(jiraActionData != null ? jiraActionData.getTitle() : null);
            }
            TextView textView2 = (TextView) view.findViewWithTag("desc");
            this.f14438j = textView2;
            if (textView2 != null) {
                textView2.setText(jiraActionData != null ? jiraActionData.getDesc() : null);
            }
        }
        if (!(jiraActionData == null || (actions = jiraActionData.getActions()) == null)) {
            for (JiraActionData.ActionSheetItem actionSheetItem : actions) {
                String id = actionSheetItem.getId();
                if (id != null) {
                    View view4 = getView();
                    View findViewWithTag = view4 != null ? view4.findViewWithTag(id) : null;
                    if (findViewWithTag != null) {
                        this.f14439k.add(findViewWithTag);
                        findViewWithTag.setVisibility(0);
                        TextView textView3 = (TextView) findViewWithTag.findViewWithTag("text");
                        if (textView3 != null) {
                            textView3.setText(actionSheetItem.getText());
                        }
                        findViewWithTag.setOnClickListener(new View$OnClickListenerC4912b(id, actionSheetItem, this));
                    }
                }
            }
        }
        m20215h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new C4915e(this));
        View findViewById = view.findViewById(R.id.jira_action_drag_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.jira_action_drag_view)");
        this.f14435g = findViewById;
        m20214g();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.jira_action_fragment, viewGroup, false);
    }
}
