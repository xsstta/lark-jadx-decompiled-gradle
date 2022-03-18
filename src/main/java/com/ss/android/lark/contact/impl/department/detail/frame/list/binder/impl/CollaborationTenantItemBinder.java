package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl;

import android.content.Context;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.AbsItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder.CollaborationTenantViewHolder;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/CollaborationTenantItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/AbsItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/CollaborationTenantViewHolder;", "selectDependency", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;", "clickHandler", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;", "(Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;)V", "bindClick", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;", "bindViewHolder", "createViewHolder", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.a */
public final class CollaborationTenantItemBinder extends AbsItemBinder<CollaborationTenantViewHolder> {

    /* renamed from: a */
    public final AbstractC35856a f92729a;

    /* renamed from: b */
    private final ISelectDependency f92730b;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.a$a */
    public static final class View$OnClickListenerC35860a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CollaborationTenantItemBinder f92731a;

        /* renamed from: b */
        final /* synthetic */ DepartmentRecyclerViewItem f92732b;

        View$OnClickListenerC35860a(CollaborationTenantItemBinder aVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
            this.f92731a = aVar;
            this.f92732b = departmentRecyclerViewItem;
        }

        public final void onClick(View view) {
            AbstractC35856a aVar = this.f92731a.f92729a;
            if (aVar != null) {
                aVar.mo131891a(this.f92732b);
            }
        }
    }

    /* renamed from: b */
    public CollaborationTenantViewHolder mo131989a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return CollaborationTenantViewHolder.f92755c.mo132033a(context);
    }

    public CollaborationTenantItemBinder(ISelectDependency cVar, AbstractC35856a aVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectDependency");
        this.f92730b = cVar;
        this.f92729a = aVar;
    }

    /* renamed from: b */
    private final void m140467b(CollaborationTenantViewHolder aVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setOnClickListener(new View$OnClickListenerC35860a(this, departmentRecyclerViewItem));
    }

    /* renamed from: a */
    public void mo131990a(CollaborationTenantViewHolder aVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(departmentRecyclerViewItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        aVar.mo132032b();
        Department department = departmentRecyclerViewItem.getDepartment();
        Intrinsics.checkExpressionValueIsNotNull(department, "department");
        String name = department.getName();
        aVar.mo132031a().mo184680b(false);
        aVar.mo132031a().mo184670a(new TitleModel(name, false, null, 0, 14, null));
        aVar.mo132031a().mo184662a(((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88957a(R.drawable.icon_department_department_avatar)).mo88976k());
        m140467b(aVar, departmentRecyclerViewItem);
    }
}
