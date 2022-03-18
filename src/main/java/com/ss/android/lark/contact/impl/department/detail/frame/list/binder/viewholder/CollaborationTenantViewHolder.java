package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/CollaborationTenantViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "avatarItemView", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "getAvatarItemView", "()Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "imgNextView", "getImgNextView", "()Landroid/view/View;", "selectMode", "", "simpleMode", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.a */
public final class CollaborationTenantViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final int f92753a = View.generateViewId();

    /* renamed from: b */
    public static final int f92754b = View.generateViewId();

    /* renamed from: c */
    public static final Companion f92755c = new Companion(null);

    /* renamed from: d */
    private final AvatarItemView f92756d;

    /* renamed from: e */
    private final View f92757e;

    /* renamed from: b */
    public final void mo132032b() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/CollaborationTenantViewHolder$Companion;", "", "()V", "AVATAR_ITEM_ID", "", "IMG_NEXT_ID", "IMG_NEXT_MARGIN_END", "", "IMG_NEXT_SIZE", "create", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/CollaborationTenantViewHolder;", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final CollaborationTenantViewHolder mo132033a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            AvatarItemView a = new AvatarItemView(context, null, 0, null, 14, null).mo184657a(R.style.AvatarItemDepartment);
            a.setId(CollaborationTenantViewHolder.f92753a);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setId(CollaborationTenantViewHolder.f92754b);
            appCompatImageView.setImageResource(R.drawable.ud_icon_right_outlined);
            appCompatImageView.setImageTintList(UDColorUtils.getColorStateList(context, R.color.icon_n3));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) C25653b.m91892a(context, 16.0f), (int) C25653b.m91892a(context, 16.0f));
            marginLayoutParams.setMarginEnd((int) C25653b.m91892a(context, 6.0f));
            appCompatImageView.setLayoutParams(marginLayoutParams);
            a.mo184659a(appCompatImageView);
            return new CollaborationTenantViewHolder(a, null);
        }
    }

    /* renamed from: a */
    public final AvatarItemView mo132031a() {
        return this.f92756d;
    }

    private CollaborationTenantViewHolder(View view) {
        super(view);
        View findViewById = view.findViewById(f92753a);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById(AVATAR_ITEM_ID)");
        this.f92756d = (AvatarItemView) findViewById;
        View findViewById2 = view.findViewById(f92754b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "v.findViewById(IMG_NEXT_ID)");
        this.f92757e = findViewById2;
    }

    public /* synthetic */ CollaborationTenantViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }
}
