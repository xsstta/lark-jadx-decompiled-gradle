package com.ss.android.lark.moments.impl.categorydetail;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.dependency.idependency.IProfileModuleDependency;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminData;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.e */
public final class CategoryAdminViewHolder extends AbstractC58967a<CategoryAdminData, View> {

    /* renamed from: a */
    public static final Companion f119121a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/categorydetail/CategoryAdminViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CategoryAdminViewHolder mo165995a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_category_admin_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new CategoryAdminViewHolder(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryAdminViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.e$b */
    public static final class C47227b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ CategoryAdminViewHolder f119122a;

        /* renamed from: b */
        final /* synthetic */ CategoryAdminData f119123b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            IProfileModuleDependency profileModuleDependency = MomentsDependencyHolder.f118998b.mo165899a().profileModuleDependency();
            View view2 = this.f119122a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            profileModuleDependency.mo144727a(context, this.f119123b.mo165989a());
        }

        public C47227b(CategoryAdminViewHolder eVar, CategoryAdminData bVar) {
            this.f119122a = eVar;
            this.f119123b = bVar;
        }
    }

    /* renamed from: a */
    public void mo165944a(CategoryAdminData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        int dp2px = UIUtils.dp2px(view.getContext(), 14.0f);
        AvatarImage build = AvatarImage.Builder.obtain(bVar.mo165991c(), bVar.mo165989a(), dp2px, dp2px).build();
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        IRequestCreator override = ImageLoader.with(view2.getContext()).load(build).placeholder(new ColorDrawable(UIHelper.getColor(R.color.ud_N200))).override(dp2px, dp2px);
        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(itemVie…e(avatarSize, avatarSize)");
        IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.AVATAR, dp2px, dp2px, false, null, 24, null);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        a.into((LKUIRoundedImageView2) view3.findViewById(R.id.avatar));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        TextView textView = (TextView) view4.findViewById(R.id.name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.name");
        textView.setText(bVar.mo165990b());
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        ((TextView) view5.findViewById(R.id.name)).setTextColor(C25653b.m91893a(UIHelper.getColor(R.color.static_white), 0.7f));
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        view6.setOnClickListener(new C47227b(this, bVar));
    }
}
