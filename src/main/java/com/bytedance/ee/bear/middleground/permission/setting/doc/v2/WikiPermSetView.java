package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.universedesign.SimpleTagTextView;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/WikiPermSetView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetView;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "getPermSetInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "setPermSetInfo", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "getRootView", "()Landroid/view/View;", "singlePageEnable", "", "create", "", "setExternalAccessDisable", "updateShareLayoutVisible", "visible", "updateView", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.k */
public final class WikiPermSetView extends DocPermissionSetView {

    /* renamed from: c */
    private boolean f27062c;

    /* renamed from: d */
    private final View f27063d;

    /* renamed from: e */
    private DocPermSetInfo f27064e;

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetView
    /* renamed from: b */
    public View mo38241b() {
        return this.f27063d;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetView
    /* renamed from: c */
    public DocPermSetInfo mo38244c() {
        return this.f27064e;
    }

    /* renamed from: d */
    private final void m41653d() {
        ((LinearLayout) mo38241b().findViewById(R.id.externalAccessLayout)).setOnClickListener(new C10014a(this));
        Context context = mo38241b().getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        ((TextView) mo38241b().findViewById(R.id.externalAccessText)).setTextColor(context.getResources().getColor(R.color.text_disable));
        UDSwitch uDSwitch = (UDSwitch) mo38241b().findViewById(R.id.externalAccessSwitch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "rootView.externalAccessSwitch");
        uDSwitch.setEnabled(false);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        boolean c = PermFGUtils.m39534c();
        this.f27062c = c;
        if (!c) {
            mo38240a(false);
        }
        mo38245c(false);
        if (this.f27062c && mo38244c().mo38843p()) {
            m41653d();
        }
        if (this.f27062c && !mo38244c().mo38847t() && mo38244c().mo38849u()) {
            Context context = mo38241b().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
            Resources resources = context.getResources();
            LinearLayout linearLayout = (LinearLayout) mo38241b().findViewById(R.id.securityLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.securityLayout");
            linearLayout.setEnabled(false);
            int color = resources.getColor(R.color.text_disable);
            ((TextView) mo38241b().findViewById(R.id.securityModifyText)).setTextColor(color);
            ImageView imageView = (ImageView) mo38241b().findViewById(R.id.securityArrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.securityArrow");
            imageView.setImageTintList(resources.getColorStateList(R.color.text_disable));
            LinearLayout linearLayout2 = (LinearLayout) mo38241b().findViewById(R.id.commentLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.commentLayout");
            linearLayout2.setEnabled(false);
            ((TextView) mo38241b().findViewById(R.id.commentModifyText)).setTextColor(color);
            ImageView imageView2 = (ImageView) mo38241b().findViewById(R.id.commentArrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.commentArrow");
            imageView2.setImageTintList(resources.getColorStateList(R.color.text_disable));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/WikiPermSetView$setExternalAccessDisable$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.k$a */
    public static final class C10014a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiPermSetView f27065a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10014a(WikiPermSetView kVar) {
            this.f27065a = kVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Toast.showText(this.f27065a.mo38241b().getContext(), (int) R.string.CreationMobile_Wiki_SharePanel_ExternalOffSpace);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetView
    /* renamed from: b */
    public void mo38242b(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "<set-?>");
        this.f27064e = docPermSetInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetView
    /* renamed from: b */
    public void mo38243b(boolean z) {
        LinearLayout linearLayout = (LinearLayout) mo38241b().findViewById(R.id.shareLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.shareLayout");
        linearLayout.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetView, com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetContract.IView
    /* renamed from: a */
    public void mo38239a(DocPermSetInfo docPermSetInfo) {
        int i;
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        super.mo38239a(docPermSetInfo);
        SimpleTagTextView simpleTagTextView = (SimpleTagTextView) mo38241b().findViewById(R.id.externalAccessTagView);
        Intrinsics.checkExpressionValueIsNotNull(simpleTagTextView, "rootView.externalAccessTagView");
        if (!this.f27062c || !docPermSetInfo.mo38812U()) {
            i = 8;
        } else {
            i = 0;
        }
        simpleTagTextView.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiPermSetView(View view, DocPermSetInfo docPermSetInfo) {
        super(view, docPermSetInfo);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f27063d = view;
        this.f27064e = docPermSetInfo;
    }
}
