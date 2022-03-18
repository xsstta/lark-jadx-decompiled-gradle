package com.ss.android.lark.moments.impl.personal.p2361new.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.DeviceUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.moments.impl.common.widget.MomentsFollowButton;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.feed.IMomentClickListener;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPoint;
import com.ss.android.lark.moments.impl.hitpoint.MomentsHitPointNew;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileInfoViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/personal/new/viewholder/IMomentsProfileInfo;", "Landroid/view/View;", "itemView", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;)V", "getListener", "()Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "mData", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.new.a.f */
public final class MomentsProfileInfoViewHolder extends AbstractC58967a<IMomentsProfileInfo, View> {

    /* renamed from: b */
    public static final Companion f120633b = new Companion(null);

    /* renamed from: a */
    public IMomentsProfileInfo f120634a;

    /* renamed from: c */
    private final IMomentClickListener f120635c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileInfoViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileInfoViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/lark/moments/impl/feed/IMomentClickListener;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsProfileInfoViewHolder mo167779a(ViewGroup viewGroup, IMomentClickListener aVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(aVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_profile_info_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsProfileInfoViewHolder(inflate, aVar);
        }
    }

    /* renamed from: a */
    public final IMomentClickListener mo167777a() {
        return this.f120635c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileInfoViewHolder$onBind$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a.f$c */
    public static final class C47896c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileInfoViewHolder f120639a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47896c(MomentsProfileInfoViewHolder fVar) {
            this.f120639a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120639a.mo167777a().mo166626d();
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "followed_page", "moments_follow_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileInfoViewHolder$onBind$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a.f$d */
    public static final class C47897d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileInfoViewHolder f120640a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47897d(MomentsProfileInfoViewHolder fVar) {
            this.f120640a = fVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120640a.mo167777a().mo166624c();
            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "follow_page", "moments_follow_page_view", (String) null, (String) null, (Integer) null, 28, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/common/utils/UIUtilsKt$onSingleClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release", "com/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileInfoViewHolder$$special$$inlined$onSingleClickListener$1"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.personal.new.a.f$b */
    public static final class C47894b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsProfileInfoViewHolder f120636a;

        /* renamed from: b */
        final /* synthetic */ IMomentsProfileInfo f120637b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120636a.itemView.postDelayed(new Runnable(this) {
                /* class com.ss.android.lark.moments.impl.personal.p2361new.viewholder.MomentsProfileInfoViewHolder.C47894b.RunnableC478951 */

                /* renamed from: a */
                final /* synthetic */ C47894b f120638a;

                {
                    this.f120638a = r1;
                }

                public final void run() {
                    MomentsUserVM b;
                    IMomentsProfileInfo bVar = this.f120638a.f120636a.f120634a;
                    if (bVar != null && (b = bVar.mo167765b()) != null) {
                        View view = this.f120638a.f120636a.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                        ((MomentsFollowButton) view.findViewById(R.id.btFollow)).mo166233a(b.mo166366e(), b.mo166367f());
                        MomentsHitPoint.f119720a.mo166839a("community_profile", b.mo166366e(), b.mo166364c());
                        if (this.f120638a.f120637b.mo167765b().mo166366e()) {
                            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "follow_cancel", "none", (String) null, (String) null, (Integer) null, 28, (Object) null);
                        } else {
                            MomentsHitPointNew.Companion.m188109a(MomentsHitPointNew.f119721a, "follow", "none", (String) null, (String) null, (Integer) null, 28, (Object) null);
                        }
                    }
                }
            }, 500);
            this.f120637b.mo167765b().mo166369h();
        }

        public C47894b(MomentsProfileInfoViewHolder fVar, IMomentsProfileInfo bVar) {
            this.f120636a = fVar;
            this.f120637b = bVar;
        }
    }

    /* renamed from: a */
    public void mo165944a(IMomentsProfileInfo bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo165944a((Object) bVar);
        this.f120634a = bVar;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/DINAlternateBold.ttf");
        if (bVar.mo167766c() || !MomentsDependencyHolder.f118998b.mo165901b().mo166495g()) {
            z = false;
        } else {
            z = true;
        }
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.post_count_layout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.post_count_layout");
        LinearLayout linearLayout2 = linearLayout;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        View findViewById = view3.findViewById(R.id.space1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.space1");
        if (!z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        TextView textView = (TextView) view4.findViewById(R.id.post_count);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.post_count");
        textView.setTypeface(createFromAsset);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        TextView textView2 = (TextView) view5.findViewById(R.id.post_count);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.post_count");
        textView2.setText(String.valueOf(bVar.mo167769f()));
        String quantityString = UIHelper.getQuantityString(R.plurals.Lark_Community_Dynamic, bVar.mo167769f());
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        TextView textView3 = (TextView) view6.findViewById(R.id.post_count_label);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.post_count_label");
        textView3.setText(quantityString);
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        TextView textView4 = (TextView) view7.findViewById(R.id.follower_count);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.follower_count");
        textView4.setTypeface(createFromAsset);
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        TextView textView5 = (TextView) view8.findViewById(R.id.follower_count);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.follower_count");
        textView5.setText(String.valueOf(bVar.mo167767d()));
        String quantityString2 = UIHelper.getQuantityString(R.plurals.Lark_Community_Followers, bVar.mo167767d());
        View view9 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view9, "itemView");
        TextView textView6 = (TextView) view9.findViewById(R.id.follower_count_label);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.follower_count_label");
        textView6.setText(quantityString2);
        View view10 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view10, "itemView");
        ((LinearLayout) view10.findViewById(R.id.follower_layout)).setOnClickListener(new C47896c(this));
        View view11 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view11, "itemView");
        TextView textView7 = (TextView) view11.findViewById(R.id.following_count);
        Intrinsics.checkExpressionValueIsNotNull(textView7, "itemView.following_count");
        textView7.setTypeface(createFromAsset);
        View view12 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view12, "itemView");
        TextView textView8 = (TextView) view12.findViewById(R.id.following_count);
        Intrinsics.checkExpressionValueIsNotNull(textView8, "itemView.following_count");
        textView8.setText(String.valueOf(bVar.mo167768e()));
        String quantityString3 = UIHelper.getQuantityString(R.plurals.Lark_Community_Following, bVar.mo167768e());
        View view13 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view13, "itemView");
        TextView textView9 = (TextView) view13.findViewById(R.id.following_count_label);
        Intrinsics.checkExpressionValueIsNotNull(textView9, "itemView.following_count_label");
        textView9.setText(quantityString3);
        View view14 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view14, "itemView");
        ((LinearLayout) view14.findViewById(R.id.following_layout)).setOnClickListener(new C47897d(this));
        View view15 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view15, "itemView");
        MomentsFollowButton momentsFollowButton = (MomentsFollowButton) view15.findViewById(R.id.btFollow);
        Intrinsics.checkExpressionValueIsNotNull(momentsFollowButton, "itemView.btFollow");
        MomentsFollowButton momentsFollowButton2 = momentsFollowButton;
        if (!bVar.mo167770g()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        momentsFollowButton2.setVisibility(i3);
        View view16 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view16, "itemView");
        MomentsFollowButton momentsFollowButton3 = (MomentsFollowButton) view16.findViewById(R.id.btFollow);
        MomentsFollowButton momentsFollowButton4 = momentsFollowButton3;
        if (!bVar.mo167766c()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        momentsFollowButton4.setVisibility(i4);
        momentsFollowButton3.mo166233a(bVar.mo167765b().mo166366e(), bVar.mo167765b().mo166367f());
        momentsFollowButton4.setOnClickListener(new C47894b(this, bVar));
        if (z) {
            i5 = 2;
        } else {
            i5 = 3;
        }
        if (bVar.mo167766c()) {
            i6 = 0;
        } else {
            View view17 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view17, "itemView");
            i6 = ((MomentsFollowButton) view17.findViewById(R.id.btFollow)).getFollowButtonMaxWidth();
        }
        View view18 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view18, "itemView");
        TextView textView10 = (TextView) view18.findViewById(R.id.post_count);
        Intrinsics.checkExpressionValueIsNotNull(textView10, "itemView.post_count");
        TextPaint paint = textView10.getPaint();
        View view19 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view19, "itemView");
        TextView textView11 = (TextView) view19.findViewById(R.id.post_count_label);
        Intrinsics.checkExpressionValueIsNotNull(textView11, "itemView.post_count_label");
        TextPaint paint2 = textView11.getPaint();
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = Math.max(paint.measureText(String.valueOf(bVar.mo167769f())), paint2.measureText(quantityString));
        }
        float max = Math.max(paint.measureText(String.valueOf(bVar.mo167767d())), paint2.measureText(quantityString2));
        float max2 = Math.max(paint.measureText(String.valueOf(bVar.mo167768e())), paint2.measureText(quantityString3));
        View view20 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view20, "itemView");
        int screenWidth = ((DeviceUtils.getScreenWidth(view20.getContext()) - i6) - UIHelper.dp2px(84.0f)) / i5;
        float f2 = (float) screenWidth;
        if (f > f2) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (max > f2) {
            i7++;
        }
        if (max2 > f2) {
            i7++;
        }
        if (i7 > 0) {
            int max3 = screenWidth + (((Math.max(0, screenWidth - ((int) f)) + Math.max(0, screenWidth - ((int) max))) + Math.max(0, screenWidth - ((int) max2))) / i7);
            View view21 = this.itemView;
            TextView textView12 = (TextView) view21.findViewById(R.id.post_count);
            Intrinsics.checkExpressionValueIsNotNull(textView12, "post_count");
            textView12.setMaxWidth(max3);
            TextView textView13 = (TextView) view21.findViewById(R.id.post_count_label);
            Intrinsics.checkExpressionValueIsNotNull(textView13, "post_count_label");
            textView13.setMaxWidth(max3);
            TextView textView14 = (TextView) view21.findViewById(R.id.follower_count);
            Intrinsics.checkExpressionValueIsNotNull(textView14, "follower_count");
            textView14.setMaxWidth(max3);
            TextView textView15 = (TextView) view21.findViewById(R.id.follower_count_label);
            Intrinsics.checkExpressionValueIsNotNull(textView15, "follower_count_label");
            textView15.setMaxWidth(max3);
            TextView textView16 = (TextView) view21.findViewById(R.id.following_count);
            Intrinsics.checkExpressionValueIsNotNull(textView16, "following_count");
            textView16.setMaxWidth(max3);
            TextView textView17 = (TextView) view21.findViewById(R.id.following_count_label);
            Intrinsics.checkExpressionValueIsNotNull(textView17, "following_count_label");
            textView17.setMaxWidth(max3);
        }
        View view22 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view22, "itemView");
        int max4 = Math.max(Math.min((int) (((((((float) (DeviceUtils.getScreenWidth(view22.getContext()) - UIHelper.dp2px(60.0f))) - f) - max) - max2) - ((float) i6)) / ((float) i5)), UIHelper.dp2px(32.0f)), UIHelper.dp2px(8.0f));
        View view23 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view23, "itemView");
        View findViewById2 = view23.findViewById(R.id.space1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.space1");
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = null;
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams3 != null) {
            layoutParams3.width = max4;
        }
        View view24 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view24, "itemView");
        View findViewById3 = view24.findViewById(R.id.space2);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.space2");
        ViewGroup.LayoutParams layoutParams4 = findViewById3.getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = layoutParams4;
        }
        LinearLayout.LayoutParams layoutParams5 = layoutParams2;
        if (layoutParams5 != null) {
            layoutParams5.width = max4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsProfileInfoViewHolder(View view, IMomentClickListener aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f120635c = aVar;
    }
}
