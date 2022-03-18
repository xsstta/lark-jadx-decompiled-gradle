package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl;

import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.AbsItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder.DepartmentGroupCreateHolder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.p1756a.C35858b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/DepartmentGroupCreateBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/AbsItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentGroupCreateHolder;", "clickHandler", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;", "(Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;)V", "bindViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;", "createViewHolder", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.b */
public final class DepartmentGroupCreateBinder extends AbsItemBinder<DepartmentGroupCreateHolder> {

    /* renamed from: a */
    public final AbstractC35856a f92733a;

    public DepartmentGroupCreateBinder() {
        this(null, 1, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/DepartmentGroupCreateBinder$bindViewHolder$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.b$a */
    public static final class C35861a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ DepartmentRecyclerViewItem $data$inlined;
        final /* synthetic */ DepartmentGroupCreateBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35861a(DepartmentGroupCreateBinder bVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
            super(1);
            this.this$0 = bVar;
            this.$data$inlined = departmentRecyclerViewItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            AbstractC35856a aVar = this.this$0.f92733a;
            if (aVar != null) {
                aVar.mo131891a(this.$data$inlined);
            }
        }
    }

    public DepartmentGroupCreateBinder(AbstractC35856a aVar) {
        this.f92733a = aVar;
    }

    /* renamed from: b */
    public DepartmentGroupCreateHolder mo131989a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return DepartmentGroupCreateHolder.f92765a.mo132044a(context);
    }

    /* renamed from: a */
    public void mo131990a(DepartmentGroupCreateHolder cVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        Intrinsics.checkParameterIsNotNull(departmentRecyclerViewItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C35858b.m140466a(cVar.mo132043e(), new C35861a(this, departmentRecyclerViewItem));
        cVar.mo132041c().setText(UIUtils.getString(cVar.mo132039a(), R.string.Lark_Contacts_TeamGroupSupervisorCreateStatusName));
        cVar.mo132042d().setText(R.string.Lark_Contacts_TeamGroupSupervisorCreateStatusTip);
        cVar.mo132043e().setText(R.string.Lark_Contacts_TeamGroupSupervisorCreateStatusAction);
        cVar.mo132040b().setImageResource(R.drawable.create_department_chat_icon);
        cVar.mo132040b().setOval(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepartmentGroupCreateBinder(AbstractC35856a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
