package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep;

import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.MainViewPager;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.ISelectDepContract;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/ISelectDepContract$IView$IViewDelegate;", "anim", "", "view", "create", "destroy", "setBottomTips", "tips", "", "setNextEnable", "enable", "", "setViewDelegate", "viewDelegate", "startHideSelected", "startShowSelected", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.e */
public final class SelectDepView implements ISelectDepContract.IView {

    /* renamed from: a */
    public ISelectDepContract.IView.IViewDelegate f26764a;

    /* renamed from: b */
    private final View f26765b;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.ISelectDepContract.IView
    /* renamed from: a */
    public void mo37660a() {
        View findViewById = this.f26765b.findViewById(R.id.permSelectDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.permSelectDivider");
        float f = -((float) C13749l.m55738a(44));
        findViewById.setTranslationY(f);
        MainViewPager mainViewPager = (MainViewPager) this.f26765b.findViewById(R.id.permSelectContainer);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "rootView.permSelectContainer");
        mainViewPager.setTranslationY(f);
        View findViewById2 = this.f26765b.findViewById(R.id.permSelectDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.permSelectDivider");
        m41152a(findViewById2);
        MainViewPager mainViewPager2 = (MainViewPager) this.f26765b.findViewById(R.id.permSelectContainer);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager2, "rootView.permSelectContainer");
        m41152a(mainViewPager2);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.ISelectDepContract.IView
    /* renamed from: b */
    public void mo37663b() {
        float a = (float) C13749l.m55738a(44);
        View findViewById = this.f26765b.findViewById(R.id.permSelectDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.permSelectDivider");
        findViewById.setTranslationY(a);
        MainViewPager mainViewPager = (MainViewPager) this.f26765b.findViewById(R.id.permSelectContainer);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "rootView.permSelectContainer");
        mainViewPager.setTranslationY(a);
        View findViewById2 = this.f26765b.findViewById(R.id.permSelectDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.permSelectDivider");
        m41152a(findViewById2);
        MainViewPager mainViewPager2 = (MainViewPager) this.f26765b.findViewById(R.id.permSelectContainer);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager2, "rootView.permSelectContainer");
        m41152a(mainViewPager2);
    }

    /* renamed from: a */
    public void setViewDelegate(ISelectDepContract.IView.IViewDelegate aVar) {
        this.f26764a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.e$a */
    static final class View$OnClickListenerC9893a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectDepView f26766a;

        /* renamed from: b */
        final /* synthetic */ boolean f26767b;

        View$OnClickListenerC9893a(SelectDepView eVar, boolean z) {
            this.f26766a = eVar;
            this.f26767b = z;
        }

        public final void onClick(View view) {
            ISelectDepContract.IView.IViewDelegate aVar;
            if (this.f26767b && (aVar = this.f26766a.f26764a) != null) {
                aVar.mo37664a();
            }
        }
    }

    public SelectDepView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f26765b = view;
    }

    /* renamed from: a */
    private final void m41152a(View view) {
        view.animate().translationY(BitmapDescriptorFactory.HUE_RED).setDuration(300).start();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.ISelectDepContract.IView
    /* renamed from: a */
    public void mo37661a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tips");
        TextView textView = (TextView) this.f26765b.findViewById(R.id.permSelectDepBottomTips);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.permSelectDepBottomTips");
        textView.setText(str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.ISelectDepContract.IView
    /* renamed from: a */
    public void mo37662a(boolean z) {
        TextView textView = (TextView) this.f26765b.findViewById(R.id.permSelectDepNextBtn);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.permSelectDepNextBtn");
        textView.setEnabled(z);
        ((TextView) this.f26765b.findViewById(R.id.permSelectDepNextBtn)).setOnClickListener(new View$OnClickListenerC9893a(this, z));
    }
}
