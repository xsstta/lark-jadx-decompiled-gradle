package com.ss.android.lark.moments.impl.feed.empty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/empty/MomentsNoPostViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/feed/empty/IMomentsNoPost;", "Landroid/view/View;", "itemView", "clickListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "getClickListener", "()Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "hasReLayout", "", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.a.c */
public final class MomentsNoPostViewHolder extends AbstractC58967a<IMomentsNoPost, View> {

    /* renamed from: a */
    public static final Companion f119801a = new Companion(null);

    /* renamed from: b */
    private boolean f119802b;

    /* renamed from: c */
    private final IMomentClickListener f119803c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/empty/MomentsNoPostViewHolder$Companion;", "", "()V", "HEADER_HEIGHT", "", "MIN_PADDING_TOP", "create", "Lcom/ss/android/lark/moments/impl/feed/empty/MomentsNoPostViewHolder;", "parent", "Landroid/view/ViewGroup;", "clickListener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsNoPostViewHolder mo166938a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_item_no_post, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsNoPostViewHolder(inflate, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.a.c$b */
    public static final class RunnableC47491b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsNoPostViewHolder f119804a;

        /* renamed from: b */
        final /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC47492c f119805b;

        RunnableC47491b(MomentsNoPostViewHolder cVar, ViewTreeObserver$OnGlobalLayoutListenerC47492c cVar2) {
            this.f119804a = cVar;
            this.f119805b = cVar2;
        }

        public final void run() {
            View view = this.f119804a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f119805b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/moments/impl/feed/empty/MomentsNoPostViewHolder$onBind$listener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.a.c$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC47492c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ MomentsNoPostViewHolder f119806a;

        /* renamed from: b */
        final /* synthetic */ Context f119807b;

        public void onGlobalLayout() {
            View view = this.f119806a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int[] iArr = new int[2];
            this.f119806a.itemView.getLocationOnScreen(iArr);
            View view2 = this.f119806a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            int screenHeight = ((DeviceUtils.getScreenHeight(view2.getContext()) - iArr[1]) - UIUtils.dp2px(this.f119807b, 250.0f)) / 2;
            if (screenHeight > UIUtils.dp2px(this.f119807b, 64.0f)) {
                this.f119806a.itemView.setPadding(0, screenHeight, 0, 0);
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC47492c(MomentsNoPostViewHolder cVar, Context context) {
            this.f119806a = cVar;
            this.f119807b = context;
        }
    }

    /* renamed from: a */
    public void mo165944a(IMomentsNoPost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) aVar);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        if (aVar.mo166932b()) {
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.tvMessage);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.tvMessage");
            textView.setText(UIUtils.getString(context, R.string.Lark_Community_FailedToLoad));
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            ImageView imageView = (ImageView) view3.findViewById(R.id.ivFollowEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.ivFollowEmpty");
            imageView.setVisibility(8);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ImageView imageView2 = (ImageView) view4.findViewById(R.id.ivPostEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.ivPostEmpty");
            imageView2.setVisibility(0);
            View view5 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            ((ImageView) view5.findViewById(R.id.ivPostEmpty)).setImageDrawable(UIUtils.getDrawable(context, R.drawable.illustration_empty_negative_load_failed));
        } else if (aVar.mo166934d()) {
            View view6 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
            TextView textView2 = (TextView) view6.findViewById(R.id.tvMessage);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.tvMessage");
            textView2.setText(UIUtils.getString(context, R.string.Lark_Community_HotTopicEmptyDesc));
            View view7 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
            ImageView imageView3 = (ImageView) view7.findViewById(R.id.ivFollowEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "itemView.ivFollowEmpty");
            imageView3.setVisibility(0);
            View view8 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
            ImageView imageView4 = (ImageView) view8.findViewById(R.id.ivPostEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "itemView.ivPostEmpty");
            imageView4.setVisibility(8);
            View view9 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
            ((ImageView) view9.findViewById(R.id.ivFollowEmpty)).setImageDrawable(UIUtils.getDrawable(context, R.drawable.illustration_empty_neutral_no_content));
        } else if (Intrinsics.areEqual(aVar.mo166933c(), String.valueOf(Tab.FeedTabId.FEED_FOLLOWING.ordinal()))) {
            View view10 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
            TextView textView3 = (TextView) view10.findViewById(R.id.tvMessage);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.tvMessage");
            textView3.setText(UIUtils.getString(context, R.string.Lark_Community_NoFollowingContentEmptyState));
            View view11 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
            ImageView imageView5 = (ImageView) view11.findViewById(R.id.ivFollowEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView5, "itemView.ivFollowEmpty");
            imageView5.setVisibility(0);
            View view12 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
            ImageView imageView6 = (ImageView) view12.findViewById(R.id.ivPostEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView6, "itemView.ivPostEmpty");
            imageView6.setVisibility(8);
            View view13 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
            ((ImageView) view13.findViewById(R.id.ivFollowEmpty)).setImageDrawable(UIUtils.getDrawable(context, R.drawable.illustration_empty_neutral_no_content));
        } else {
            View view14 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
            TextView textView4 = (TextView) view14.findViewById(R.id.tvMessage);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.tvMessage");
            textView4.setText(UIUtils.getString(context, R.string.Lark_Community_ShareAPost));
            View view15 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
            ImageView imageView7 = (ImageView) view15.findViewById(R.id.ivFollowEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView7, "itemView.ivFollowEmpty");
            imageView7.setVisibility(8);
            View view16 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
            ImageView imageView8 = (ImageView) view16.findViewById(R.id.ivPostEmpty);
            Intrinsics.checkExpressionValueIsNotNull(imageView8, "itemView.ivPostEmpty");
            imageView8.setVisibility(0);
            View view17 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
            ((ImageView) view17.findViewById(R.id.ivPostEmpty)).setImageDrawable(UIUtils.getDrawable(context, R.drawable.illustration_empty_neutral_no_posts));
        }
        View view18 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view18, "itemView");
        TextView textView5 = (TextView) view18.findViewById(R.id.tvCreatePost);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.tvCreatePost");
        textView5.setVisibility(8);
        if (!this.f119802b) {
            this.f119802b = true;
            ViewTreeObserver$OnGlobalLayoutListenerC47492c cVar = new ViewTreeObserver$OnGlobalLayoutListenerC47492c(this, context);
            View view19 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view19, "itemView");
            view19.getViewTreeObserver().addOnGlobalLayoutListener(cVar);
            this.itemView.postDelayed(new RunnableC47491b(this, cVar), 500);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsNoPostViewHolder(View view, IMomentClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f119803c = aVar;
    }
}
