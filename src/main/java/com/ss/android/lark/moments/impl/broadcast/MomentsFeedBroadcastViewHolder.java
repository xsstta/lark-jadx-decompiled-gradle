package com.ss.android.lark.moments.impl.broadcast;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.moments.v1.Broadcast;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsBroadcastItem;
import com.ss.android.lark.moments.impl.detail.MomentsDetailLauncher;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\f\r\u000eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsBroadcastItem;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "mRootItemHeight", "", "adjustBackgroundIfNeed", "", "onBind", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "BroadcastListHolder", "BroadcastListItemAdapter", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.broadcast.d */
public final class MomentsFeedBroadcastViewHolder extends AbstractC58967a<MomentsBroadcastItem, View> {

    /* renamed from: b */
    public static final Companion f119057b = new Companion(null);

    /* renamed from: a */
    public int f119058a;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder$BroadcastListHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.d$a */
    public static final class BroadcastListHolder extends AbstractC58967a<Broadcast, View> {

        /* renamed from: a */
        public static final Companion f119059a = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder$BroadcastListHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder$BroadcastListHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.broadcast.d$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final BroadcastListHolder mo165954a(ViewGroup viewGroup) {
                Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_broadcast_feed_item, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
                return new BroadcastListHolder(inflate);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BroadcastListHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }

        /* renamed from: a */
        public void mo165944a(Broadcast broadcast) {
            Intrinsics.checkParameterIsNotNull(broadcast, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.broadcast_title_tv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.broadcast_title_tv");
            textView.setText(broadcast.title);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder$Companion;", "", "()V", "LOG_TAG", "", "create", "Lcom/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.d$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsFeedBroadcastViewHolder mo165957a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_broadcast, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsFeedBroadcastViewHolder(inflate);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\"\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder$BroadcastListItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Landroid/view/View;", "broadcastList", "", "Lcom/bytedance/lark/pb/moments/v1/Broadcast;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.d$b */
    public static final class BroadcastListItemAdapter extends RecyclerView.Adapter<AbstractC58967a<?, View>> {

        /* renamed from: a */
        private final List<Broadcast> f119060a;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f119060a.size();
        }

        public BroadcastListItemAdapter(List<Broadcast> list) {
            Intrinsics.checkParameterIsNotNull(list, "broadcastList");
            this.f119060a = list;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder$BroadcastListItemAdapter$onBindViewHolder$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.broadcast.d$b$a */
        public static final class C47203a extends OnSingleClickListener {

            /* renamed from: a */
            final /* synthetic */ Broadcast f119061a;

            /* renamed from: b */
            final /* synthetic */ AbstractC58967a f119062b;

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "top", "moments_detail_page_view", this.f119061a.post_id, (String) null, (Integer) null, 24, (Object) null);
                MomentsDetailLauncher eVar = MomentsDetailLauncher.f119660a;
                View view2 = this.f119062b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                Context context = view2.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "holder.itemView.context");
                String str = this.f119061a.post_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "broadcast.post_id");
                MomentsDetailLauncher.m187945a(eVar, context, str, false, (String) null, "feed_page", false, false, 108, (Object) null);
            }

            C47203a(Broadcast broadcast, AbstractC58967a aVar) {
                this.f119061a = broadcast;
                this.f119062b = aVar;
            }
        }

        /* renamed from: a */
        public AbstractC58967a<?, View> onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            return BroadcastListHolder.f119059a.mo165954a(viewGroup);
        }

        /* renamed from: a */
        public void onBindViewHolder(AbstractC58967a<?, View> aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "holder");
            Broadcast broadcast = this.f119060a.get(i);
            ((BroadcastListHolder) aVar).mo165944a(broadcast);
            aVar.itemView.setOnClickListener(new C47203a(broadcast, aVar));
        }
    }

    /* renamed from: a */
    private final void m187031a() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.broadcast_iv);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.broadcast_iv");
        lKUIRoundedImageView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC47204d(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/MomentsFeedBroadcastViewHolder$adjustBackgroundIfNeed$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.d$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC47204d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ MomentsFeedBroadcastViewHolder f119063a;

        public void onGlobalLayout() {
            View view = this.f119063a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.broadcast_iv);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.broadcast_iv");
            lKUIRoundedImageView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view2 = this.f119063a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) view2.findViewById(R.id.broadcast_iv);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "itemView.broadcast_iv");
            int height = lKUIRoundedImageView22.getHeight();
            View view3 = this.f119063a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            LKUIRoundedImageView2 lKUIRoundedImageView23 = (LKUIRoundedImageView2) view3.findViewById(R.id.broadcast_iv);
            Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView23, "itemView.broadcast_iv");
            int width = lKUIRoundedImageView23.getWidth();
            if (height != 0 && width != 0 && height != this.f119063a.f119058a) {
                Drawable drawable = UIHelper.getDrawable(R.drawable.moments_bg_top_post);
                Intrinsics.checkExpressionValueIsNotNull(drawable, "UIHelper.getDrawable(R.d…able.moments_bg_top_post)");
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getIntrinsicWidth() != 0 && bitmapDrawable.getIntrinsicHeight() != 0) {
                        float intrinsicWidth = (((float) width) * 1.0f) / ((float) bitmapDrawable.getIntrinsicWidth());
                        float intrinsicHeight = ((float) bitmapDrawable.getIntrinsicHeight()) * intrinsicWidth;
                        float f = (float) height;
                        if (intrinsicHeight < f) {
                            Log.m165383e("MomentsFeedBroadcastViewHolder", "scaleHeight is:" + intrinsicHeight + ", currentHeight is" + height);
                            return;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(intrinsicWidth, intrinsicWidth);
                        float f2 = f - intrinsicHeight;
                        matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, f2);
                        Log.m165389i("MomentsFeedBroadcastViewHolder", "matrix, scale:" + intrinsicWidth + ", translateY:" + f2);
                        View view4 = this.f119063a.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                        LKUIRoundedImageView2 lKUIRoundedImageView24 = (LKUIRoundedImageView2) view4.findViewById(R.id.broadcast_iv);
                        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView24, "itemView.broadcast_iv");
                        lKUIRoundedImageView24.setScaleType(ImageView.ScaleType.MATRIX);
                        View view5 = this.f119063a.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                        LKUIRoundedImageView2 lKUIRoundedImageView25 = (LKUIRoundedImageView2) view5.findViewById(R.id.broadcast_iv);
                        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView25, "itemView.broadcast_iv");
                        lKUIRoundedImageView25.setImageMatrix(matrix);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC47204d(MomentsFeedBroadcastViewHolder dVar) {
            this.f119063a = dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsFeedBroadcastViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(MomentsBroadcastItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) cVar);
        List<Broadcast> b = cVar.mo166474b();
        if (b.isEmpty()) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        view2.setVisibility(0);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "itemView.recycler");
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        recyclerView.setLayoutManager(new LinearLayoutManager(view4.getContext()));
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        RecyclerView recyclerView2 = (RecyclerView) view5.findViewById(R.id.recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "itemView.recycler");
        recyclerView2.setAdapter(new BroadcastListItemAdapter(b));
        String a = MomentsDependencyHolder.f118998b.mo165899a().languageDependency().mo144716a();
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        if (a != null) {
            String lowerCase = a.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, "zh")) {
                View view6 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                View view7 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
                ((ImageView) view6.findViewById(R.id.iv_title)).setImageDrawable(UIUtils.getDrawable(view7.getContext(), R.drawable.moments_icon_top_post_title_cn));
            } else {
                View view8 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
                View view9 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
                ((ImageView) view8.findViewById(R.id.iv_title)).setImageDrawable(UIUtils.getDrawable(view9.getContext(), R.drawable.moments_icon_top_post_title_en));
            }
            m187031a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
