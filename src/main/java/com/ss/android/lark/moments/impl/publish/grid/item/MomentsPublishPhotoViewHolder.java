package com.ss.android.lark.moments.impl.publish.grid.item;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.moments.impl.common.utils.C47282k;
import com.ss.android.lark.moments.impl.common.utils.SpinDrawableUtils;
import com.ss.android.lark.moments.impl.publish.grid.GridImageData;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishPhotoViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/publish/grid/MediaData;", "Landroid/view/View;", "itemView", "helper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "api", "Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "(Landroid/view/View;Landroidx/recyclerview/widget/ItemTouchHelper;Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;)V", "getApi", "()Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "expandTouchAreaSize", "", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getLoadingDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "loadingDrawable$delegate", "Lkotlin/Lazy;", "photoSize", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setClickListener", "listener", "Lcom/ss/android/lark/moments/impl/publish/grid/OnGridItemActionListener;", "setImage", "imagePath", "", "showError", "Lcom/ss/android/lark/moments/impl/publish/grid/GridImageData;", "showLoading", "showReady", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b */
public final class MomentsPublishPhotoViewHolder extends AbstractC58967a<MediaData, View> {

    /* renamed from: c */
    public static final Companion f120732c = new Companion(null);

    /* renamed from: a */
    public final int f120733a;

    /* renamed from: b */
    public final ItemTouchHelper f120734b;

    /* renamed from: d */
    private final int f120735d;

    /* renamed from: e */
    private final Lazy f120736e;

    /* renamed from: f */
    private final IPublishMediaRetryUpload f120737f;

    /* renamed from: b */
    private final CircularProgressDrawable m189350b() {
        return (CircularProgressDrawable) this.f120736e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishPhotoViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishPhotoViewHolder;", "parent", "Landroid/view/ViewGroup;", "helper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "api", "Lcom/ss/android/lark/moments/impl/publish/grid/IPublishMediaRetryUpload;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsPublishPhotoViewHolder mo168041a(ViewGroup viewGroup, ItemTouchHelper itemTouchHelper, IPublishMediaRetryUpload dVar) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Intrinsics.checkParameterIsNotNull(itemTouchHelper, "helper");
            Intrinsics.checkParameterIsNotNull(dVar, "api");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moments_post_grid_item_photo, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsPublishPhotoViewHolder(inflate, itemTouchHelper, dVar);
        }
    }

    /* renamed from: a */
    public final IPublishMediaRetryUpload mo168039a() {
        return this.f120737f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b$b */
    static final class C47961b extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ View $itemView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47961b(View view) {
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
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b$e */
    public static final class RunnableC47964e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishPhotoViewHolder f120744a;

        RunnableC47964e(MomentsPublishPhotoViewHolder bVar) {
            this.f120744a = bVar;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f120744a.itemView.getHitRect(rect);
            rect.bottom = rect.top + this.f120744a.f120733a;
            rect.left = rect.right - this.f120744a.f120733a;
            View view = this.f120744a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View view2 = this.f120744a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view.setTouchDelegate(new TouchDelegate(rect, (ImageView) view2.findViewById(R.id.icDelete)));
        }
    }

    /* renamed from: d */
    private final void m189352d() {
        m189350b().stop();
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_state");
        imageView.setVisibility(8);
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view2.findViewById(R.id.shadow);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.shadow");
        lKUIRoundedImageView2.setVisibility(8);
    }

    /* renamed from: c */
    private final void m189351c() {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_state");
        if (!Intrinsics.areEqual(imageView.getDrawable(), m189350b())) {
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((ImageView) view2.findViewById(R.id.iv_state)).setImageDrawable(m189350b());
        }
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ImageView imageView2 = (ImageView) view3.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "itemView.iv_state");
        imageView2.setVisibility(0);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((ImageView) view4.findViewById(R.id.iv_state)).setOnClickListener(null);
        if (!m189350b().isRunning()) {
            m189350b().start();
        }
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view5.findViewById(R.id.shadow);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.shadow");
        lKUIRoundedImageView2.setVisibility(0);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        ((LKUIRoundedImageView2) view6.findViewById(R.id.shadow)).setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N00), 0.7f));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b$f */
    public static final class View$OnLongClickListenerC47965f implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishPhotoViewHolder f120745a;

        View$OnLongClickListenerC47965f(MomentsPublishPhotoViewHolder bVar) {
            this.f120745a = bVar;
        }

        public final boolean onLongClick(View view) {
            this.f120745a.f120734b.startDrag(this.f120745a);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/publish/grid/item/MomentsPublishPhotoViewHolder$showError$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b$g */
    public static final class C47966g extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishPhotoViewHolder f120746a;

        /* renamed from: b */
        final /* synthetic */ GridImageData f120747b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f120746a.mo168039a().mo168061a(this.f120747b);
        }

        C47966g(MomentsPublishPhotoViewHolder bVar, GridImageData bVar2) {
            this.f120746a = bVar;
            this.f120747b = bVar2;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b$c */
    public static final class View$OnClickListenerC47962c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishPhotoViewHolder f120738a;

        /* renamed from: b */
        final /* synthetic */ OnGridItemActionListener f120739b;

        /* renamed from: c */
        final /* synthetic */ MediaData f120740c;

        View$OnClickListenerC47962c(MomentsPublishPhotoViewHolder bVar, OnGridItemActionListener hVar, MediaData fVar) {
            this.f120738a = bVar;
            this.f120739b = hVar;
            this.f120740c = fVar;
        }

        public final void onClick(View view) {
            OnGridItemActionListener hVar = this.f120739b;
            View view2 = this.f120738a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            hVar.mo168090a(view2, this.f120740c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.grid.a.b$d */
    public static final class View$OnClickListenerC47963d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishPhotoViewHolder f120741a;

        /* renamed from: b */
        final /* synthetic */ OnGridItemActionListener f120742b;

        /* renamed from: c */
        final /* synthetic */ MediaData f120743c;

        View$OnClickListenerC47963d(MomentsPublishPhotoViewHolder bVar, OnGridItemActionListener hVar, MediaData fVar) {
            this.f120741a = bVar;
            this.f120742b = hVar;
            this.f120743c = fVar;
        }

        public final void onClick(View view) {
            OnGridItemActionListener hVar = this.f120742b;
            View view2 = this.f120741a.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            hVar.mo168091b(view2, this.f120743c);
        }
    }

    /* renamed from: a */
    private final void m189347a(GridImageData bVar) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_state");
        imageView.setVisibility(0);
        m189350b().stop();
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
        ((ImageView) view4.findViewById(R.id.iv_state)).setOnClickListener(new C47966g(this, bVar));
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view5.findViewById(R.id.shadow);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.shadow");
        lKUIRoundedImageView2.setVisibility(0);
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        ((LKUIRoundedImageView2) view6.findViewById(R.id.shadow)).setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N00), 0.7f));
    }

    /* renamed from: a */
    private final void m189349a(String str) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ((LKUIRoundedImageView2) view.findViewById(R.id.ivContent)).setBorderColor(C25653b.m91894a(view2.getContext(), R.color.ud_N900, 0.15f));
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view3.findViewById(R.id.ivContent);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.ivContent");
        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        IRequestCreator load = ImageLoader.with(view4.getContext()).load(str);
        int i = this.f120735d;
        IRequestCreator override = load.override(i, i);
        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(itemVie…ide(photoSize, photoSize)");
        ListenerParams.FromType fromType = ListenerParams.FromType.IMAGE;
        int i2 = this.f120735d;
        IRequestCreator a = C47282k.m187256a(override, fromType, i2, i2, false, null, 24, null);
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        a.into((LKUIRoundedImageView2) view5.findViewById(R.id.ivContent));
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        View view7 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view7, "itemView");
        Context context = view7.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        ((ImageView) view6.findViewById(R.id.icDelete)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_close_filled, UIHelper.getColor(R.color.icon_n2)));
    }

    /* renamed from: a */
    public void mo165944a(MediaData fVar) {
        MediaData fVar2;
        Intrinsics.checkParameterIsNotNull(fVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        int screenWidth = DeviceUtils.getScreenWidth(view.getContext());
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        int min = Math.min((screenWidth - UIUtils.dp2px(view2.getContext(), 60.0f)) / 3, UIUtils.dp2px(view3.getContext(), 90.0f));
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view4.findViewById(R.id.ivContent);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.ivContent");
        ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView2.getLayoutParams();
        layoutParams.width = min;
        layoutParams.height = min;
        if (!(fVar instanceof GridImageData)) {
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        GridImageData bVar = (GridImageData) fVar2;
        if (bVar != null) {
            m189349a(bVar.mo168052a());
            m189348a(bVar.mo168056d(), fVar);
            int i = C47967c.f120748a[bVar.mo168065f().ordinal()];
            if (i == 1) {
                m189347a((GridImageData) fVar);
            } else if (i != 2) {
                m189352d();
            } else {
                m189351c();
            }
        }
    }

    /* renamed from: a */
    private final void m189348a(OnGridItemActionListener hVar, MediaData fVar) {
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((LKUIRoundedImageView2) view.findViewById(R.id.ivContent)).setOnClickListener(new View$OnClickListenerC47962c(this, hVar, fVar));
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ((ImageView) view2.findViewById(R.id.icDelete)).setOnClickListener(new View$OnClickListenerC47963d(this, hVar, fVar));
        this.itemView.post(new RunnableC47964e(this));
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        view3.setLongClickable(true);
        View view4 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
        ((LKUIRoundedImageView2) view4.findViewById(R.id.ivContent)).setOnLongClickListener(new View$OnLongClickListenerC47965f(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPublishPhotoViewHolder(View view, ItemTouchHelper itemTouchHelper, IPublishMediaRetryUpload dVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(itemTouchHelper, "helper");
        Intrinsics.checkParameterIsNotNull(dVar, "api");
        this.f120734b = itemTouchHelper;
        this.f120737f = dVar;
        this.f120733a = UIUtils.dp2px(view.getContext(), 40.0f);
        this.f120735d = UIUtils.dp2px(view.getContext(), 90.0f);
        this.f120736e = LazyKt.lazy(new C47961b(view));
    }
}
