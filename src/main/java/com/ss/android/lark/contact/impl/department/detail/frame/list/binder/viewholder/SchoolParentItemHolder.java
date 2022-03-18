package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/SchoolParentItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "schoolDepartmentName", "Landroid/widget/TextView;", "getSchoolDepartmentName", "()Landroid/widget/TextView;", "schoolInfo", "getSchoolInfo", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.e */
public final class SchoolParentItemHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f92773a = new Companion(null);

    /* renamed from: b */
    private final TextView f92774b;

    /* renamed from: c */
    private final TextView f92775c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/SchoolParentItemHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/SchoolParentItemHolder;", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SchoolParentItemHolder mo132049a(Context context) {
            int i;
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (DesktopUtil.m144307b()) {
                i = R.layout.department_structure_item_chat_desktop;
            } else {
                i = R.layout.school_structure_item_eduer_group;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            LayoutInflater.from(context).inflate(i, frameLayout);
            return new SchoolParentItemHolder(frameLayout, null);
        }
    }

    /* renamed from: a */
    public final TextView mo132047a() {
        return this.f92774b;
    }

    /* renamed from: b */
    public final TextView mo132048b() {
        return this.f92775c;
    }

    private SchoolParentItemHolder(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.school_parent_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById(R.id.school_parent_name)");
        this.f92774b = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.school_parent_info);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "v.findViewById(R.id.school_parent_info)");
        this.f92775c = (TextView) findViewById2;
    }

    public /* synthetic */ SchoolParentItemHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }
}
