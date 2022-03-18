package com.ss.android.lark.moments.impl.publish.grid.item;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.SpinDrawableUtils;
import com.ss.android.lark.moments.impl.publish.grid.GridVideoData;
import com.ss.android.lark.moments.impl.publish.grid.IPublishMediaRetryUpload;
import com.ss.android.lark.moments.impl.publish.grid.MediaData;
import com.ss.android.lark.moments.impl.publish.grid.OnGridItemActionListener;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishVideoViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "Landroid/view/View;", "itemView", "api", "Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "(Landroid/view/View;Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;)V", "getApi", "()Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "expandTouchAreaSize", "", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getLoadingDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "loadingDrawable$delegate", "Lkotlin/Lazy;", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setClickListener", "listener", "Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "showError", "Lcom/ss/android/lark/moments/impl/publish/grid/GridVideoData;", "showLoading", "showReady", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.d */
public final class MomentsPublishVideoViewHolder extends AbstractC58967a<MediaData, View> {

    /* renamed from: b */
    public static final Companion f120749b = new Companion(null);

    /* renamed from: a */
    public final int f120750a;

    /* renamed from: c */
    private final Lazy f120751c;

    /* renamed from: d */
    private final IPublishMediaRetryUpload f120752d;

    /* renamed from: b */
    private final CircularProgressDrawable m189359b() {
        return (CircularProgressDrawable) this.f120751c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishVideoViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishVideoViewHolder;", "parent", "Landroid/view/ViewGroup;", "api", "Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsPublishVideoViewHolder mo168048a(ViewGroup viewGroup, IPublishMediaRetryUpload dVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(dVar, "api");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_post_grid_item_video, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsPublishVideoViewHolder(inflate, dVar);
        }
    }

    /* renamed from: a */
    public final IPublishMediaRetryUpload mo168046a() {
        return this.f120752d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.d$b */
    static final class C47968b extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47968b(View view) {
            super(0);
            this.$itemView = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            Context context = this.$itemView.getContext();
            int color = UIUtils.getColor(context, R.color.primary_pri_500);
            SpinDrawableUtils iVar = SpinDrawableUtils.f119255a;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            return iVar.mo166216a(context, color, UIUtils.dp2px(context, 8.0f), UIUtils.dp2px(context, 2.0f));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.d$e */
    public static final class RunnableC47971e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishVideoViewHolder f120759a;

        RunnableC47971e(MomentsPublishVideoViewHolder dVar) {
            this.f120759a = dVar;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f120759a.itemView.getHitRect(rect);
            rect.bottom = rect.top + this.f120759a.f120750a;
            rect.left = rect.right - this.f120759a.f120750a;
            View view = this.f120759a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View view2 = this.f120759a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view.setTouchDelegate(new TouchDelegate(rect, (ImageView) view2.findViewById(R.id.icDelete)));
        }
    }

    /* renamed from: d */
    private final void m189361d() {
        m189359b().stop();
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_ic_play);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_ic_play");
        imageView.setVisibility(0);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.iv_state");
        imageView2.setVisibility(8);
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.shadow)).setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.static_black), 0.4f));
    }

    /* renamed from: c */
    private final void m189360c() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_state");
        if (!Intrinsics.areEqual(imageView.getDrawable(), m189359b())) {
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((ImageView) view2.findViewById(R.id.iv_state)).setImageDrawable(m189359b());
        }
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ImageView imageView2 = (ImageView) view3.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.iv_state");
        imageView2.setVisibility(0);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((ImageView) view4.findViewById(R.id.iv_state)).setOnClickListener(null);
        if (!m189359b().isRunning()) {
            m189359b().start();
        }
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        ImageView imageView3 = (ImageView) view5.findViewById(R.id.iv_ic_play);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "itemView.iv_ic_play");
        imageView3.setVisibility(8);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        ((LKUIRoundedImageView2) view6.findViewById(R.id.shadow)).setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N00), 0.7f));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishVideoViewHolder$showError$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.d$f */
    public static final class C47972f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishVideoViewHolder f120760a;

        /* renamed from: b */
        final /* synthetic */ GridVideoData f120761b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120760a.mo168046a().mo168061a(this.f120761b);
        }

        C47972f(MomentsPublishVideoViewHolder dVar, GridVideoData cVar) {
            this.f120760a = dVar;
            this.f120761b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.d$c */
    public static final class View$OnClickListenerC47969c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishVideoViewHolder f120753a;

        /* renamed from: b */
        final /* synthetic */ OnGridItemActionListener f120754b;

        /* renamed from: c */
        final /* synthetic */ MediaData f120755c;

        View$OnClickListenerC47969c(MomentsPublishVideoViewHolder dVar, OnGridItemActionListener hVar, MediaData fVar) {
            this.f120753a = dVar;
            this.f120754b = hVar;
            this.f120755c = fVar;
        }

        public final void onClick(View view) {
            OnGridItemActionListener hVar = this.f120754b;
            View view2 = this.f120753a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            hVar.mo168090a(view2, this.f120755c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.d$d */
    public static final class View$OnClickListenerC47970d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishVideoViewHolder f120756a;

        /* renamed from: b */
        final /* synthetic */ OnGridItemActionListener f120757b;

        /* renamed from: c */
        final /* synthetic */ MediaData f120758c;

        View$OnClickListenerC47970d(MomentsPublishVideoViewHolder dVar, OnGridItemActionListener hVar, MediaData fVar) {
            this.f120756a = dVar;
            this.f120757b = hVar;
            this.f120758c = fVar;
        }

        public final void onClick(View view) {
            OnGridItemActionListener hVar = this.f120757b;
            View view2 = this.f120756a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            hVar.mo168091b(view2, this.f120758c);
        }
    }

    /* renamed from: a */
    private final void m189357a(GridVideoData cVar) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_state");
        imageView.setVisibility(0);
        m189359b().stop();
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        Context context = view2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_warning_hollow_filled, UIHelper.getColor(R.color.ud_R500));
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((ImageView) view3.findViewById(R.id.iv_state)).setImageDrawable(iconDrawable);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((ImageView) view4.findViewById(R.id.iv_state)).setOnClickListener(new C47972f(this, cVar));
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        ImageView imageView2 = (ImageView) view5.findViewById(R.id.iv_ic_play);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.iv_ic_play");
        imageView2.setVisibility(8);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        ((LKUIRoundedImageView2) view6.findViewById(R.id.shadow)).setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N00), 0.7f));
    }

    /* renamed from: a */
    public void mo165944a(MediaData fVar) {
        MediaData fVar2;
        String str;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        int dp2px = UIUtils.dp2px(view.getContext(), 90.0f);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view2.findViewById(R.id.media_cover)).setBorderColor(C25653b.m91894a(view3.getContext(), R.color.ud_N900, 0.15f));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view4.findViewById(R.id.media_cover);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.media_cover");
        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) view5.findViewById(R.id.media_cover);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "itemView.media_cover");
        IRequestCreator with = ImageLoader.with(lKUIRoundedImageView22.getContext());
        boolean z = fVar instanceof GridVideoData;
        GridVideoData cVar = null;
        if (!z) {
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        GridVideoData cVar2 = (GridVideoData) fVar2;
        if (cVar2 != null) {
            str = cVar2.mo168059b();
        } else {
            str = null;
        }
        IRequestCreator override = with.load(str).override(dp2px, dp2px);
        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(itemVie…    .override(size, size)");
        IRequestCreator a = C47282k.m187256a(override, ListenerParams.FromType.COVER, dp2px, dp2px, false, null, 24, null);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        a.into((LKUIRoundedImageView2) view6.findViewById(R.id.media_cover));
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        View view8 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view8, "itemView");
        Context context = view8.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        ((ImageView) view7.findViewById(R.id.icDelete)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_close_filled, UIHelper.getColor(R.color.icon_n2)));
        if (z) {
            cVar = fVar;
        }
        GridVideoData cVar3 = cVar;
        if (cVar3 != null) {
            m189358a(cVar3.mo168060c(), fVar);
            int i = C47973e.f120762a[cVar3.mo168065f().ordinal()];
            if (i == 1) {
                m189357a((GridVideoData) fVar);
            } else if (i != 2) {
                m189361d();
            } else {
                m189360c();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPublishVideoViewHolder(View view, IPublishMediaRetryUpload dVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(dVar, "api");
        this.f120752d = dVar;
        this.f120750a = UIUtils.dp2px(view.getContext(), 40.0f);
        this.f120751c = LazyKt.lazy(new C47968b(view));
    }

    /* renamed from: a */
    private final void m189358a(OnGridItemActionListener hVar, MediaData fVar) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        Context context = view2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        ((ImageView) view.findViewById(R.id.iv_ic_play)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_play_filled, UIHelper.getColor(R.color.static_white)));
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((LKUIRoundedImageView2) view3.findViewById(R.id.media_cover)).setOnClickListener(new View$OnClickListenerC47969c(this, hVar, fVar));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((ImageView) view4.findViewById(R.id.icDelete)).setOnClickListener(new View$OnClickListenerC47970d(this, hVar, fVar));
        this.itemView.post(new RunnableC47971e(this));
    }
}
