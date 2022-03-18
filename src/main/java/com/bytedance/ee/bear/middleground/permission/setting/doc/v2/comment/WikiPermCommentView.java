package com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/WikiPermCommentView;", "Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/DocPermCommentView;", "rootView", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "create", "", "getConstraintsReason", "", "isBlockFromContainer", "", "greyView", "selectItemView", "Lcom/bytedance/ee/bear/middleground/permission/setting/SelectItemView;", "resId", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.f */
public final class WikiPermCommentView extends DocPermCommentView {

    /* renamed from: e */
    private final View f26958e;

    /* renamed from: f */
    private final DocPermSetInfo f26959f;

    /* renamed from: b */
    private final int m41491b(boolean z) {
        return z ? R.string.CreationMobile_Wiki_DocsMigration_page_NoPermission_ContactAdmin_tips : R.string.CreationMobile_Wiki_DocsMigration_page_NoPermission_ContactOwner_tips;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.DocPermCommentView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (!this.f26959f.mo38840m() && this.f26959f.mo38837j().isCommentConstraintsEdit()) {
            int b = m41491b(this.f26959f.mo38842o());
            SelectItemView selectItemView = (SelectItemView) this.f26958e.findViewById(R.id.commentReadItem);
            Intrinsics.checkExpressionValueIsNotNull(selectItemView, "rootView.commentReadItem");
            m41490a(selectItemView, b);
            SelectItemView selectItemView2 = (SelectItemView) this.f26958e.findViewById(R.id.commentEditItem);
            Intrinsics.checkExpressionValueIsNotNull(selectItemView2, "rootView.commentEditItem");
            m41490a(selectItemView2, b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/setting/doc/v2/comment/WikiPermCommentView$greyView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.a.f$a */
    public static final class C9971a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ Context f26960a;

        /* renamed from: b */
        final /* synthetic */ int f26961b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Toast.showText(this.f26960a, this.f26961b);
        }

        C9971a(Context context, int i) {
            this.f26960a = context;
            this.f26961b = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiPermCommentView(View view, DocPermSetInfo docPermSetInfo) {
        super(view, docPermSetInfo);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26958e = view;
        this.f26959f = docPermSetInfo;
    }

    /* renamed from: a */
    private final void m41490a(SelectItemView selectItemView, int i) {
        Context context = this.f26958e.getContext();
        UDCheckBox checkBox = selectItemView.getCheckBox();
        Intrinsics.checkExpressionValueIsNotNull(checkBox, "selectItemView.checkBox");
        checkBox.setEnabled(false);
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        selectItemView.setTextColor(context.getResources().getColor(R.color.text_disable));
        selectItemView.setOnClickListener(new C9971a(context, i));
    }
}
