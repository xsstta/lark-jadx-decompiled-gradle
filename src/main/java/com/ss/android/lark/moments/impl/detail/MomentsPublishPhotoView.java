package com.ss.android.lark.moments.impl.detail;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
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
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsPublishPhotoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "expandTouchAreaSize", "", "isKeepOriginPhoto", "", "listener", "Lcom/ss/android/lark/moments/impl/detail/ItemActionListener;", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "getLoadingDrawable", "()Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "loadingDrawable$delegate", "Lkotlin/Lazy;", "photoSize", "setActionListener", "", "setImage", "imagePath", "", "setIsKeepOriginPhoto", "showError", "photoPath", "showLoading", "showReady", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.detail.i */
public final class MomentsPublishPhotoView extends FrameLayout {

    /* renamed from: a */
    public final int f119672a;

    /* renamed from: b */
    public ItemActionListener f119673b;

    /* renamed from: c */
    public boolean f119674c;

    /* renamed from: d */
    private final int f119675d;

    /* renamed from: e */
    private final Lazy f119676e;

    /* renamed from: f */
    private HashMap f119677f;

    private final CircularProgressDrawable getLoadingDrawable() {
        return (CircularProgressDrawable) this.f119676e.getValue();
    }

    /* renamed from: a */
    public View mo166705a(int i) {
        if (this.f119677f == null) {
            this.f119677f = new HashMap();
        }
        View view = (View) this.f119677f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119677f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.i$a */
    static final class C47444a extends Lambda implements Function0<CircularProgressDrawable> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47444a(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CircularProgressDrawable invoke() {
            return SpinDrawableUtils.f119255a.mo166216a(this.$context, UIUtils.getColor(this.$context, R.color.primary_pri_500), UIUtils.dp2px(this.$context, 8.0f), UIUtils.dp2px(this.$context, 2.0f));
        }
    }

    /* renamed from: b */
    public final void mo166708b() {
        getLoadingDrawable().stop();
        ImageView imageView = (ImageView) mo166705a(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_state");
        imageView.setVisibility(8);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo166705a(R.id.shadow);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "shadow");
        lKUIRoundedImageView2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo166706a() {
        ImageView imageView = (ImageView) mo166705a(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_state");
        if (!Intrinsics.areEqual(imageView.getDrawable(), getLoadingDrawable())) {
            ((ImageView) mo166705a(R.id.iv_state)).setImageDrawable(getLoadingDrawable());
        }
        ImageView imageView2 = (ImageView) mo166705a(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "iv_state");
        imageView2.setVisibility(0);
        ((ImageView) mo166705a(R.id.iv_state)).setOnClickListener(null);
        if (!getLoadingDrawable().isRunning()) {
            getLoadingDrawable().start();
        }
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo166705a(R.id.shadow);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "shadow");
        lKUIRoundedImageView2.setVisibility(0);
        ((LKUIRoundedImageView2) mo166705a(R.id.shadow)).setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N00), 0.7f));
    }

    public final void setIsKeepOriginPhoto(boolean z) {
        this.f119674c = z;
    }

    public final void setActionListener(ItemActionListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f119673b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/detail/MomentsPublishPhotoView$showError$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.i$b */
    public static final class C47445b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ MomentsPublishPhotoView f119681a;

        /* renamed from: b */
        final /* synthetic */ String f119682b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            ItemActionListener aVar = this.f119681a.f119673b;
            if (aVar != null) {
                aVar.mo166506a(this.f119682b, this.f119681a.f119674c);
            }
        }

        C47445b(MomentsPublishPhotoView iVar, String str) {
            this.f119681a = iVar;
            this.f119682b = str;
        }
    }

    /* renamed from: a */
    public final void mo166707a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "photoPath");
        ImageView imageView = (ImageView) mo166705a(R.id.iv_state);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "iv_state");
        imageView.setVisibility(0);
        getLoadingDrawable().stop();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((ImageView) mo166705a(R.id.iv_state)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_warning_hollow_filled, UIHelper.getColor(R.color.ud_R500)));
        ((ImageView) mo166705a(R.id.iv_state)).setOnClickListener(new C47445b(this, str));
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo166705a(R.id.shadow);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "shadow");
        lKUIRoundedImageView2.setVisibility(0);
        ((LKUIRoundedImageView2) mo166705a(R.id.shadow)).setBackgroundColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N00), 0.7f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsPublishPhotoView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f119672a = UIUtils.dp2px(context, 40.0f);
        this.f119675d = UIUtils.dp2px(context, 90.0f);
        this.f119676e = LazyKt.lazy(new C47444a(context));
        LayoutInflater.from(getContext()).inflate(R.layout.moments_post_grid_item_photo, (ViewGroup) this, true);
        int min = Math.min((DeviceUtils.getScreenWidth(context) - UIUtils.dp2px(context, 60.0f)) / 3, UIUtils.dp2px(context, 90.0f));
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo166705a(R.id.ivContent);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "ivContent");
        ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView2.getLayoutParams();
        layoutParams.width = min;
        layoutParams.height = min;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ((LKUIRoundedImageView2) mo166705a(R.id.ivContent)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.moments.impl.detail.MomentsPublishPhotoView.View$OnClickListenerC474411 */

            /* renamed from: a */
            final /* synthetic */ MomentsPublishPhotoView f119678a;

            {
                this.f119678a = r1;
            }

            public final void onClick(View view) {
                ItemActionListener aVar = this.f119678a.f119673b;
                if (aVar != null) {
                    aVar.mo166505a(this.f119678a);
                }
            }
        });
        ((ImageView) mo166705a(R.id.icDelete)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.moments.impl.detail.MomentsPublishPhotoView.View$OnClickListenerC474422 */

            /* renamed from: a */
            final /* synthetic */ MomentsPublishPhotoView f119679a;

            {
                this.f119679a = r1;
            }

            public final void onClick(View view) {
                ItemActionListener aVar = this.f119679a.f119673b;
                if (aVar != null) {
                    aVar.mo166507b(this.f119679a);
                }
            }
        });
        post(new Runnable(this) {
            /* class com.ss.android.lark.moments.impl.detail.MomentsPublishPhotoView.RunnableC474433 */

            /* renamed from: a */
            final /* synthetic */ MomentsPublishPhotoView f119680a;

            {
                this.f119680a = r1;
            }

            public final void run() {
                Rect rect = new Rect();
                this.f119680a.getHitRect(rect);
                rect.bottom = rect.top + this.f119680a.f119672a;
                rect.left = rect.right - this.f119680a.f119672a;
                this.f119680a.setTouchDelegate(new TouchDelegate(rect, (ImageView) this.f119680a.mo166705a(R.id.icDelete)));
            }
        });
    }

    public final void setImage(String str) {
        Intrinsics.checkParameterIsNotNull(str, "imagePath");
        ((LKUIRoundedImageView2) mo166705a(R.id.ivContent)).setBorderColor(C25653b.m91894a(getContext(), R.color.ud_N900, 0.15f));
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) mo166705a(R.id.ivContent);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "ivContent");
        lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        LKUIRoundedImageView2 lKUIRoundedImageView22 = (LKUIRoundedImageView2) mo166705a(R.id.ivContent);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView22, "ivContent");
        IRequestCreator load = ImageLoader.with(lKUIRoundedImageView22.getContext()).load(str);
        int i = this.f119675d;
        IRequestCreator override = load.override(i, i);
        Intrinsics.checkExpressionValueIsNotNull(override, "ImageLoader.with(ivConte…ide(photoSize, photoSize)");
        ListenerParams.FromType fromType = ListenerParams.FromType.IMAGE;
        int i2 = this.f119675d;
        C47282k.m187256a(override, fromType, i2, i2, false, null, 24, null).into((LKUIRoundedImageView2) mo166705a(R.id.ivContent));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((ImageView) mo166705a(R.id.icDelete)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_close_filled, UIHelper.getColor(R.color.icon_n1)));
    }
}
