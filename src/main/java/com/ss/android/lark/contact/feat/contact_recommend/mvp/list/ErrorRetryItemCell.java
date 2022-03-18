package com.ss.android.lark.contact.feat.contact_recommend.mvp.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.contact.feat.common.ContactErrorView;
import com.ss.android.lark.contact.feat.common.ItemCell;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ErrorData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ErrorRetryItemCell;", "Lcom/ss/android/lark/contact/feat/common/ItemCell;", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ErrorData;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ErrorRetryViewHolder;", "callback", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ErrorRetryItemCallback;", "(Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/ErrorRetryItemCallback;)V", "onBindCellViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "onCreateCellViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.a.h */
public final class ErrorRetryItemCell extends ItemCell<ErrorData, ErrorRetryViewHolder> {

    /* renamed from: a */
    public final ErrorRetryItemCallback f91536a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a.h$a */
    public static final class View$OnClickListenerC35418a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ErrorRetryItemCell f91537a;

        View$OnClickListenerC35418a(ErrorRetryItemCell hVar) {
            this.f91537a = hVar;
        }

        public final void onClick(View view) {
            this.f91537a.f91536a.mo130694a(view);
        }
    }

    public ErrorRetryItemCell(ErrorRetryItemCallback gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        this.f91536a = gVar;
    }

    /* renamed from: b */
    public ErrorRetryViewHolder mo130686a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        ContactErrorView contactErrorView = new ContactErrorView(context);
        contactErrorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return new ErrorRetryViewHolder(contactErrorView);
    }

    /* renamed from: a */
    public void mo130688a(ErrorRetryViewHolder iVar, ErrorData cVar, int i) {
        Intrinsics.checkParameterIsNotNull(iVar, "holder");
        iVar.mo130698b().setOnRetryClickListener(new View$OnClickListenerC35418a(this));
    }
}
