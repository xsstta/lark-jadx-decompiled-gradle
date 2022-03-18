package com.ss.android.lark.contact.impl.department.detail.frame.list.binder;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/AbsItemBinder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "()V", "bindViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;)V", "createViewHolder", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.a */
public abstract class AbsItemBinder<VH extends RecyclerView.ViewHolder> {
    /* renamed from: a */
    public abstract VH mo131989a(Context context);

    /* renamed from: a */
    public abstract void mo131990a(VH vh, DepartmentRecyclerViewItem departmentRecyclerViewItem);
}
