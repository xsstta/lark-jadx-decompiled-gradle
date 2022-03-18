package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IView;", "rootView", "Landroid/view/View;", "showDepEntrance", "", "(Landroid/view/View;Z)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/INewSearchUserContract$IView$IViewDelegate;", "anim", "", "view", "create", "destroy", "hideEntrance", "hideKeyboard", "setBottomTips", "tips", "", "setNextEnable", "enable", "setViewDelegate", "viewDelegate", "showEntrance", "startHideSelected", "startShowSelected", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.e */
public final class NewSearchUserView implements INewSearchUserContract.IView {

    /* renamed from: a */
    public INewSearchUserContract.IView.IViewDelegate f26779a;

    /* renamed from: b */
    private final View f26780b;

    /* renamed from: c */
    private final boolean f26781c;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView
    /* renamed from: c */
    public void mo37677c() {
        LinearLayout linearLayout = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.permSearchUserSelectLayout");
        linearLayout.setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView
    /* renamed from: d */
    public void mo37678d() {
        LinearLayout linearLayout = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.permSearchUserSelectLayout");
        linearLayout.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView
    /* renamed from: a */
    public void mo37673a() {
        LinearLayout linearLayout = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.permSearchUserSelectLayout");
        float f = -((float) C13749l.m55738a(44));
        linearLayout.setTranslationY(f);
        FrameLayout frameLayout = (FrameLayout) this.f26780b.findViewById(R.id.permSearchUserResultContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.permSearchUserResultContainer");
        frameLayout.setTranslationY(f);
        LinearLayout linearLayout2 = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.permSearchUserSelectLayout");
        m41186b(linearLayout2);
        FrameLayout frameLayout2 = (FrameLayout) this.f26780b.findViewById(R.id.permSearchUserResultContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "rootView.permSearchUserResultContainer");
        m41186b(frameLayout2);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView
    /* renamed from: b */
    public void mo37676b() {
        float a = (float) C13749l.m55738a(44);
        LinearLayout linearLayout = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.permSearchUserSelectLayout");
        linearLayout.setTranslationY(a);
        FrameLayout frameLayout = (FrameLayout) this.f26780b.findViewById(R.id.permSearchUserResultContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.permSearchUserResultContainer");
        frameLayout.setTranslationY(a);
        LinearLayout linearLayout2 = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserSelectLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.permSearchUserSelectLayout");
        m41186b(linearLayout2);
        FrameLayout frameLayout2 = (FrameLayout) this.f26780b.findViewById(R.id.permSearchUserResultContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "rootView.permSearchUserResultContainer");
        m41186b(frameLayout2);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        int i = 8;
        if (!this.f26781c) {
            LinearLayout linearLayout = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserDepLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.permSearchUserDepLayout");
            linearLayout.setVisibility(8);
            View findViewById = this.f26780b.findViewById(R.id.permSearchUserDepDividerTop);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.permSearchUserDepDividerTop");
            findViewById.setVisibility(8);
            View findViewById2 = this.f26780b.findViewById(R.id.permSearchUserDepDividerBottom);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.permSearchUserDepDividerBottom");
            findViewById2.setVisibility(8);
        } else {
            View findViewById3 = this.f26780b.findViewById(R.id.permSearchUserDepDividerTop);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.permSearchUserDepDividerTop");
            findViewById3.setVisibility(0);
            View findViewById4 = this.f26780b.findViewById(R.id.permSearchUserDepDividerBottom);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.permSearchUserDepDividerBottom");
            findViewById4.setVisibility(0);
            LinearLayout linearLayout2 = (LinearLayout) this.f26780b.findViewById(R.id.permSearchUserDepLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.permSearchUserDepLayout");
            if (this.f26781c) {
                i = 0;
            }
            linearLayout2.setVisibility(i);
        }
        ((LinearLayout) this.f26780b.findViewById(R.id.permSearchUserDepLayout)).setOnClickListener(new View$OnClickListenerC9894a(this));
    }

    /* renamed from: a */
    public void setViewDelegate(INewSearchUserContract.IView.IViewDelegate aVar) {
        this.f26779a = aVar;
    }

    /* renamed from: a */
    public final void mo37687a(View view) {
        if (view.requestFocus()) {
            KeyboardUtils.hideKeyboard(view.getContext(), view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.e$a */
    static final class View$OnClickListenerC9894a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSearchUserView f26782a;

        View$OnClickListenerC9894a(NewSearchUserView eVar) {
            this.f26782a = eVar;
        }

        public final void onClick(View view) {
            NewSearchUserView eVar = this.f26782a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            eVar.mo37687a(view);
            INewSearchUserContract.IView.IViewDelegate aVar = this.f26782a.f26779a;
            if (aVar != null) {
                aVar.mo37680b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.e$b */
    static final class View$OnClickListenerC9895b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSearchUserView f26783a;

        /* renamed from: b */
        final /* synthetic */ boolean f26784b;

        View$OnClickListenerC9895b(NewSearchUserView eVar, boolean z) {
            this.f26783a = eVar;
            this.f26784b = z;
        }

        public final void onClick(View view) {
            if (this.f26784b) {
                NewSearchUserView eVar = this.f26783a;
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                eVar.mo37687a(view);
                INewSearchUserContract.IView.IViewDelegate aVar = this.f26783a.f26779a;
                if (aVar != null) {
                    aVar.mo37679a();
                }
            }
        }
    }

    /* renamed from: b */
    private final void m41186b(View view) {
        view.animate().translationY(BitmapDescriptorFactory.HUE_RED).setDuration(300).start();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView
    /* renamed from: a */
    public void mo37674a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tips");
        TextView textView = (TextView) this.f26780b.findViewById(R.id.permSearchUserBottomTips);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.permSearchUserBottomTips");
        textView.setText(str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.INewSearchUserContract.IView
    /* renamed from: a */
    public void mo37675a(boolean z) {
        TextView textView = (TextView) this.f26780b.findViewById(R.id.permSearchUserNextBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.permSearchUserNextBtn");
        textView.setEnabled(z);
        ((TextView) this.f26780b.findViewById(R.id.permSearchUserNextBtn)).setOnClickListener(new View$OnClickListenerC9895b(this, z));
    }

    public NewSearchUserView(View view, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f26780b = view;
        this.f26781c = z;
    }
}
