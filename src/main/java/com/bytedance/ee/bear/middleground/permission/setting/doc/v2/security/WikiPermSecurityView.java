package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.setting.SelectItemView;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/WikiPermSecurityView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/DocPermSecurityView;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "getPermSetInfo", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "setPermSetInfo", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "getRootView", "()Landroid/view/View;", "create", "", "getConstraintsReason", "", "isBlockFromContainer", "", "greyView", "selectItemView", "Lcom/bytedance/ee/bear/middleground/permission/setting/SelectItemView;", "resId", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.f */
public final class WikiPermSecurityView extends DocPermSecurityView {

    /* renamed from: e */
    private final View f27039e;

    /* renamed from: f */
    private DocPermSetInfo f27040f;

    /* renamed from: b */
    private final int m41598b(boolean z) {
        return z ? R.string.CreationMobile_Wiki_DocsMigration_page_NoPermission_ContactAdmin_tips : R.string.CreationMobile_Wiki_DocsMigration_page_NoPermission_ContactOwner_tips;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle, com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.DocPermSecurityView
    public void create() {
        super.create();
        if (!this.f27040f.mo38839l()) {
            int b = m41598b(this.f27040f.mo38841n());
            if (this.f27040f.mo38837j().isSecurityConstraintsFa()) {
                SelectItemView selectItemView = (SelectItemView) this.f27039e.findViewById(R.id.securityReadItem);
                Intrinsics.checkExpressionValueIsNotNull(selectItemView, "rootView.securityReadItem");
                m41597a(selectItemView, b);
                SelectItemView selectItemView2 = (SelectItemView) this.f27039e.findViewById(R.id.securityEditItem);
                Intrinsics.checkExpressionValueIsNotNull(selectItemView2, "rootView.securityEditItem");
                m41597a(selectItemView2, b);
                SelectItemView selectItemView3 = (SelectItemView) this.f27039e.findViewById(R.id.securityFaItem);
                Intrinsics.checkExpressionValueIsNotNull(selectItemView3, "rootView.securityFaItem");
                m41597a(selectItemView3, b);
            } else if (this.f27040f.mo38837j().isSecurityConstraintsEdit()) {
                SelectItemView selectItemView4 = (SelectItemView) this.f27039e.findViewById(R.id.securityReadItem);
                Intrinsics.checkExpressionValueIsNotNull(selectItemView4, "rootView.securityReadItem");
                m41597a(selectItemView4, b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/security/WikiPermSecurityView$greyView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.c.f$a */
    public static final class C10002a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ Context f27041a;

        /* renamed from: b */
        final /* synthetic */ int f27042b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Toast.showText(this.f27041a, this.f27042b);
        }

        C10002a(Context context, int i) {
            this.f27041a = context;
            this.f27042b = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiPermSecurityView(View view, DocPermSetInfo docPermSetInfo) {
        super(view, docPermSetInfo);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f27039e = view;
        this.f27040f = docPermSetInfo;
    }

    /* renamed from: a */
    private final void m41597a(SelectItemView selectItemView, int i) {
        Context context = this.f27039e.getContext();
        UDCheckBox checkBox = selectItemView.getCheckBox();
        Intrinsics.checkExpressionValueIsNotNull(checkBox, "selectItemView.checkBox");
        checkBox.setEnabled(false);
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        selectItemView.setTextColor(context.getResources().getColor(R.color.text_disable));
        selectItemView.setOnClickListener(new C10002a(context, i));
    }
}
