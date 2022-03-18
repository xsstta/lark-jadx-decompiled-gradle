package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.DepartmentPersonItemView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentPersonItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "departmentPersonItemView", "Lcom/ss/android/lark/searchcommon/view/DepartmentPersonItemView;", "(Lcom/ss/android/lark/searchcommon/view/DepartmentPersonItemView;)V", "getDepartmentPersonItemView", "()Lcom/ss/android/lark/searchcommon/view/DepartmentPersonItemView;", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.d */
public final class DepartmentPersonItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f92771a = new Companion(null);

    /* renamed from: b */
    private final DepartmentPersonItemView f92772b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentPersonItemViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentPersonItemViewHolder;", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final DepartmentPersonItemViewHolder mo132046a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new DepartmentPersonItemViewHolder(new DepartmentPersonItemView(context, null, 0, null, 14, null), null);
        }
    }

    /* renamed from: a */
    public final DepartmentPersonItemView mo132045a() {
        return this.f92772b;
    }

    private DepartmentPersonItemViewHolder(DepartmentPersonItemView departmentPersonItemView) {
        super(departmentPersonItemView);
        this.f92772b = departmentPersonItemView;
        departmentPersonItemView.mo184657a(R.style.AvatarItemDepartment);
    }

    public /* synthetic */ DepartmentPersonItemViewHolder(DepartmentPersonItemView departmentPersonItemView, DefaultConstructorMarker defaultConstructorMarker) {
        this(departmentPersonItemView);
    }
}
