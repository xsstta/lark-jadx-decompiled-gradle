package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentGroupCreateHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "createTipTv", "Landroid/widget/TextView;", "getCreateTipTv", "()Landroid/widget/TextView;", "departmentNameTv", "getDepartmentNameTv", "groupChatIconIv", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "getGroupChatIconIv", "()Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "groupChatNameTv", "getGroupChatNameTv", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.c */
public final class DepartmentGroupCreateHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f92765a = new Companion(null);

    /* renamed from: b */
    private final Context f92766b;

    /* renamed from: c */
    private final LKUIRoundedImageView f92767c;

    /* renamed from: d */
    private final TextView f92768d;

    /* renamed from: e */
    private final TextView f92769e;

    /* renamed from: f */
    private final TextView f92770f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentGroupCreateHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartmentGroupCreateHolder;", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final DepartmentGroupCreateHolder mo132044a(Context context) {
            int i;
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (DesktopUtil.m144307b()) {
                i = R.layout.department_structure_item_chat_desktop;
            } else {
                i = R.layout.department_structure_item_chat;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            LayoutInflater.from(context).inflate(i, frameLayout);
            return new DepartmentGroupCreateHolder(frameLayout, null);
        }
    }

    /* renamed from: a */
    public final Context mo132039a() {
        return this.f92766b;
    }

    /* renamed from: b */
    public final LKUIRoundedImageView mo132040b() {
        return this.f92767c;
    }

    /* renamed from: c */
    public final TextView mo132041c() {
        return this.f92768d;
    }

    /* renamed from: d */
    public final TextView mo132042d() {
        return this.f92769e;
    }

    /* renamed from: e */
    public final TextView mo132043e() {
        return this.f92770f;
    }

    private DepartmentGroupCreateHolder(View view) {
        super(view);
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        this.f92766b = context;
        View findViewById = view.findViewById(R.id.chat_img);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.chat_img)");
        this.f92767c = (LKUIRoundedImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.chat_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.chat_name_tv)");
        this.f92768d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.department_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.department_name_tv)");
        this.f92769e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.create_tip_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.create_tip_tv)");
        this.f92770f = (TextView) findViewById4;
    }

    public /* synthetic */ DepartmentGroupCreateHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }
}
