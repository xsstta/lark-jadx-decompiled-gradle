package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "avatarItemView", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "getAvatarItemView", "()Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "imgNextView", "getImgNextView", "()Landroid/view/View;", "subItemsView", "Landroid/widget/TextView;", "getSubItemsView", "()Landroid/widget/TextView;", "selectMode", "", "simpleMode", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.b */
public final class DepartItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final int f92758a = View.generateViewId();

    /* renamed from: b */
    public static final int f92759b = View.generateViewId();

    /* renamed from: c */
    public static final int f92760c = View.generateViewId();

    /* renamed from: d */
    public static final Companion f92761d = new Companion(null);

    /* renamed from: e */
    private final AvatarItemView f92762e;

    /* renamed from: f */
    private final TextView f92763f;

    /* renamed from: g */
    private final View f92764g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartItemViewHolder$Companion;", "", "()V", "AVATAR_ITEM_ID", "", "IMG_NEXT_ID", "IMG_NEXT_MARGIN_END", "", "IMG_NEXT_SIZE", "SUB_ITEMS_ID", "create", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartItemViewHolder;", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final DepartItemViewHolder mo132038a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            AvatarItemView a = new AvatarItemView(context, null, 0, null, 14, null).mo184657a(R.style.AvatarItemDepartment);
            a.setId(DepartItemViewHolder.f92758a);
            TextView textView = new TextView(context);
            textView.setTextSize(14.0f);
            textView.setTextColor(ContextCompat.getColor(context, R.color.text_link_normal));
            textView.setText(R.string.Lark_Legacy_Subdepartment);
            textView.setId(DepartItemViewHolder.f92759b);
            textView.setLayoutParams(new ViewGroup.LayoutParams((int) C25653b.m91892a(context, 28.0f), (int) C25653b.m91892a(context, 22.0f)));
            textView.setGravity(17);
            a.mo184659a((View) textView);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setId(DepartItemViewHolder.f92760c);
            appCompatImageView.setImageResource(R.drawable.ud_icon_right_outlined);
            appCompatImageView.setImageTintList(UDColorUtils.getColorStateList(context, R.color.icon_n3));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) C25653b.m91892a(context, 16.0f), (int) C25653b.m91892a(context, 16.0f));
            marginLayoutParams.setMarginEnd((int) C25653b.m91892a(context, 6.0f));
            appCompatImageView.setLayoutParams(marginLayoutParams);
            a.mo184659a(appCompatImageView);
            return new DepartItemViewHolder(a, null);
        }
    }

    /* renamed from: a */
    public final AvatarItemView mo132034a() {
        return this.f92762e;
    }

    /* renamed from: b */
    public final TextView mo132035b() {
        return this.f92763f;
    }

    /* renamed from: c */
    public final void mo132036c() {
        this.f92763f.setVisibility(8);
        this.f92764g.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo132037d() {
        this.f92763f.setVisibility(0);
        this.f92764g.setVisibility(8);
    }

    private DepartItemViewHolder(View view) {
        super(view);
        View findViewById = view.findViewById(f92758a);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById(AVATAR_ITEM_ID)");
        this.f92762e = (AvatarItemView) findViewById;
        View findViewById2 = view.findViewById(f92759b);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "v.findViewById(SUB_ITEMS_ID)");
        this.f92763f = (TextView) findViewById2;
        View findViewById3 = view.findViewById(f92760c);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "v.findViewById(IMG_NEXT_ID)");
        this.f92764g = findViewById3;
    }

    public /* synthetic */ DepartItemViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }
}
