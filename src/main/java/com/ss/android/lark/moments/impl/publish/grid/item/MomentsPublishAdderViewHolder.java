package com.ss.android.lark.moments.impl.publish.grid.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.publish.grid.AdderData;
import com.ss.android.lark.moments.impl.publish.grid.MediaData;
import com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishAdderViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setClickListener", "listener", "Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.a */
public final class MomentsPublishAdderViewHolder extends AbstractC58967a<MediaData, View> {

    /* renamed from: a */
    public static final Companion f120729a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishAdderViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishAdderViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsPublishAdderViewHolder mo168037a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_post_grid_item_adder, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsPublishAdderViewHolder(inflate);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.a$b */
    public static final class View$OnClickListenerC47960b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishAdderViewHolder f120730a;

        /* renamed from: b */
        final /* synthetic */ OnGridItemActionListener f120731b;

        View$OnClickListenerC47960b(MomentsPublishAdderViewHolder aVar, OnGridItemActionListener hVar) {
            this.f120730a = aVar;
            this.f120731b = hVar;
        }

        public final void onClick(View view) {
            OnGridItemActionListener hVar = this.f120731b;
            View view2 = this.f120730a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            hVar.mo168089a(view2, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPublishAdderViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    private final void m189343a(OnGridItemActionListener hVar) {
        this.itemView.setOnClickListener(new View$OnClickListenerC47960b(this, hVar));
    }

    /* renamed from: a */
    public void mo165944a(MediaData fVar) {
        OnGridItemActionListener a;
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        int min = Math.min((DeviceUtils.getScreenWidth(context) - UIUtils.dp2px(context, 60.0f)) / 3, UIUtils.dp2px(context, 90.0f));
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view2.findViewById(R.id.ivContent);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.ivContent");
        ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView2.getLayoutParams();
        layoutParams.width = min;
        layoutParams.height = min;
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.ivContent)).setBorderColor(C25653b.m91894a(context, R.color.ud_N900, 0.15f));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        Context context2 = view5.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
        ((ImageView) view4.findViewById(R.id.icAdd)).setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_add_outlined, UIHelper.getColor(R.color.icon_n3)));
        if (!(fVar instanceof AdderData)) {
            fVar = null;
        }
        AdderData aVar = (AdderData) fVar;
        if (aVar != null && (a = aVar.mo168035a()) != null) {
            m189343a(a);
        }
    }
}
