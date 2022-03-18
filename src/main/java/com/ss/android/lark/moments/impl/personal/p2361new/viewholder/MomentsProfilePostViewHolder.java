package com.ss.android.lark.moments.impl.personal.p2361new.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.commonvo.IMomentsUser;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageAdapter;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfilePostViewHolder;", "Lcom/ss/android/lark/moments/impl/feed/MomentsPostViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "bindAvatarClickListener", "", "sender", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsUser;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "getNineImageAdapter", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageAdapter;", "post", "images", "", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "getReactionWrapperMargin", "", "onBind", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.new.a.g */
public final class MomentsProfilePostViewHolder extends MomentsPostViewHolder {

    /* renamed from: a */
    public static final Companion f120641a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a.g$b */
    public static final class C47898b extends OnSingleClickListener {
        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfilePostViewHolder$Companion;", "", "()V", "PROFILE_ROOT_MARGIN", "", "create", "Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfilePostViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsProfilePostViewHolder mo167781a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_post, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsProfilePostViewHolder(inflate, aVar);
        }
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: a */
    public int mo166541a() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "itemView.reaction_wrapper");
        if (!(frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.reaction_wrapper);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "itemView.reaction_wrapper");
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams != null) {
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + 0;
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            FrameLayout frameLayout3 = (FrameLayout) view3.findViewById(R.id.reaction_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "itemView.reaction_wrapper");
            ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
            if (layoutParams2 != null) {
                return i + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + (UIHelper.dp2px(14.0f) * 2);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: m */
    public void mo165944a(IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a(bVar);
        int dp2px = UIHelper.dp2px(14.0f);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.root_container);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "itemView.root_container");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(dp2px);
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(dp2px);
        }
        int i = 0;
        if (Intrinsics.areEqual((Object) bVar.mo166430O(), (Object) true) && Intrinsics.areEqual((Object) bVar.mo166431P(), (Object) true)) {
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((ConstraintLayout) view2.findViewById(R.id.root_container)).setBackgroundResource(R.drawable.moments_profile_item_rec_bg);
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = UIHelper.dp2px(80.0f);
            }
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            View findViewById = view3.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.divider");
            findViewById.setVisibility(8);
        } else if (Intrinsics.areEqual((Object) bVar.mo166430O(), (Object) true)) {
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ((ConstraintLayout) view4.findViewById(R.id.root_container)).setBackgroundResource(R.drawable.moments_profile_item_top_rec_bg);
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED);
            }
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            View findViewById2 = view5.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.divider");
            findViewById2.setVisibility(0);
        } else if (Intrinsics.areEqual((Object) bVar.mo166431P(), (Object) true)) {
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            ((ConstraintLayout) view6.findViewById(R.id.root_container)).setBackgroundResource(R.drawable.moments_profile_item_bottom_rec_bg);
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = UIHelper.dp2px(80.0f);
            }
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            View findViewById3 = view7.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.divider");
            findViewById3.setVisibility(8);
        } else {
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            ((ConstraintLayout) view8.findViewById(R.id.root_container)).setBackgroundColor(UIHelper.getColor(R.color.bg_body));
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED);
            }
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            View findViewById4 = view9.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.divider");
            findViewById4.setVisibility(0);
        }
        if (marginLayoutParams != null) {
            if (UserGlobalConfigAndSettingsManager.f120180a.mo167311i() && !bVar.mo166464w() && Intrinsics.areEqual((Object) bVar.mo166430O(), (Object) true)) {
                View view10 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
                i = UIUtils.dp2px(view10.getContext(), 12.0f);
            }
            marginLayoutParams.topMargin = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsProfilePostViewHolder(View view, IMomentClickListener aVar) {
        super(view, aVar);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: a */
    public NineImageAdapter mo166958a(IMomentsPost bVar, List<NineImageBean> list) {
        Intrinsics.checkParameterIsNotNull(bVar, "post");
        Intrinsics.checkParameterIsNotNull(list, "images");
        NineImageAdapter a = super.mo166958a(bVar, list);
        a.mo167091a();
        return a;
    }

    @Override // com.ss.android.lark.moments.impl.feed.MomentsPostViewHolder
    /* renamed from: a */
    public void mo166961a(IMomentsUser cVar, IMomentsPost bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.avatar);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.avatar");
        lKUIRoundedImageView2.setOnClickListener(new C47898b());
    }
}
