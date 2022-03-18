package com.bytedance.ee.larkbrand.nativeMoudule.photo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p095a.AbstractC2523k;
import com.bumptech.glide.request.p095a.C2517e;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.BitmapUtils;
import com.bytedance.ee.larkbrand.utils.LarkGlideImageUtils;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AppbrandContext;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u0001:\u00016B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*J\u001a\u0010,\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u0010-\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010/\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u00010%J\u0012\u00101\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u000105H\u0016R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR?\u0010\f\u001a'\u0012\u001b\u0012\u0019\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/LargeImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageDisplayHeight", "getImageDisplayHeight", "()I", "loadFailListener", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/ParameterName;", "name", "e", "", "getLoadFailListener", "()Lkotlin/jvm/functions/Function1;", "setLoadFailListener", "(Lkotlin/jvm/functions/Function1;)V", "loadPreviewSuccessListener", "Lkotlin/Function0;", "getLoadPreviewSuccessListener", "()Lkotlin/jvm/functions/Function0;", "setLoadPreviewSuccessListener", "(Lkotlin/jvm/functions/Function0;)V", "mImageView", "Landroid/widget/ImageView;", "mScaleImageView", "Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;", "scaleImageViewDisplayHeight", "ensureBounds", "bounds", "", "loadGif", "glide", "Lcom/bumptech/glide/RequestManager;", "file", "Ljava/io/File;", "loadImage", "loadLargeImage", "loadLargeImageByGlide", "loadLargeImageByImageLoader", "setMaxAvailableSize", "maxAvailableSize", "setOnClickListener", "l", "Landroid/view/View$OnClickListener;", "setOnLongClickListener", "Landroid/view/View$OnLongClickListener;", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LargeImageView extends FrameLayout {

    /* renamed from: c */
    public static int[] f34889c = new int[2];

    /* renamed from: d */
    public static final Companion f34890d = new Companion(null);

    /* renamed from: a */
    public SubsamplingScaleImageView f34891a;

    /* renamed from: b */
    public ImageView f34892b;

    /* renamed from: e */
    private Function0<Unit> f34893e;

    /* renamed from: f */
    private Function1<? super Exception, Unit> f34894f;

    /* renamed from: g */
    private int f34895g;

    public LargeImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LargeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J \u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J \u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/LargeImageView$Companion;", "", "()V", "ARRAY_SIZE", "", "DEFAULT_MULTIPLE", "DEFAULT_MULTIPLE_2", "DEFAULT_MULTIPLE_4", "DEFAULT_SCALE", "DEFAULT_VALUE", "EDGE_MIN_SCALE", "", "INDEX_HEIGHT", "INDEX_WIDTH", "LONG_PIC_THRESHOLD", "TAG", "", "mMaxAvailable", "", "getMMaxAvailable", "()[I", "setMMaxAvailable", "([I)V", "getMaxScale", "view", "Landroid/view/View;", "width", "height", "getMinScale", "getPreviewBounds", "bitmapWidth", "bitmapHeight", "setUpParamForLargeImage", "", "Lcom/davemorrissey/labs/subscaleview/SubsamplingScaleImageView;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int[] mo49239a() {
            return LargeImageView.f34889c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        private final float m53790c(View view, int i, int i2) {
            int i3 = mo49239a()[0];
            int screenHeight = DeviceUtils.getScreenHeight(view.getContext());
            float f = (float) i2;
            float f2 = (float) i;
            if (f / f2 >= ((float) 3)) {
                return ((float) i3) / f2;
            }
            return Math.min(((float) i3) / f2, ((float) screenHeight) / f);
        }

        /* renamed from: a */
        public final float mo49237a(View view, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            float b = ((float) i) / ((float) C67043j.m261275b(view.getContext()));
            float a = ((float) i2) / ((float) C67043j.m261267a(view.getContext()));
            float f = (float) 1;
            if (b < f) {
                b = 1.5f / b;
            }
            if (a < f) {
                a = 1.5f / a;
            }
            return RangesKt.coerceAtLeast(Math.max(b, a), f);
        }

        /* renamed from: a */
        public final void mo49238a(SubsamplingScaleImageView subsamplingScaleImageView, int i, int i2) {
            Companion aVar = this;
            SubsamplingScaleImageView subsamplingScaleImageView2 = subsamplingScaleImageView;
            float c = aVar.m53790c(subsamplingScaleImageView2, i, i2);
            subsamplingScaleImageView.setMaxScale(aVar.mo49237a((View) subsamplingScaleImageView2, i, i2));
            subsamplingScaleImageView.setScaleAndCenter(c, new PointF(((float) subsamplingScaleImageView.getSWidth()) / ((float) 2), (float) 1));
            if (i2 / i > 3) {
                subsamplingScaleImageView.setMinimumScaleType(1);
                subsamplingScaleImageView.setMinScale(c);
            }
        }

        /* renamed from: b */
        public final int[] mo49240b(View view, int i, int i2) {
            int[] iArr = new int[2];
            int width = view.getWidth();
            int height = view.getHeight();
            int b = C67043j.m261275b(view.getContext());
            int a = C67043j.m261267a(view.getContext());
            if (width <= 0) {
                width = b;
            }
            if (height <= 0) {
                height = a;
            }
            if (i2 >= height || i >= width) {
                float f = ((float) i) / ((float) i2);
                float f2 = (float) height;
                float f3 = f2 * f;
                if (f3 > f2) {
                    iArr[0] = width;
                    iArr[1] = (int) (((float) width) / f);
                } else {
                    iArr[1] = height;
                    iArr[0] = (int) f3;
                }
            } else {
                iArr[0] = i;
                iArr[1] = i2;
            }
            if (iArr[0] > b / 2 && iArr[1] > a / 4) {
                iArr[0] = iArr[0] / 2;
                iArr[1] = iArr[1] / 2;
            }
            return iArr;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Exception, kotlin.Unit> */
    public final Function1<Exception, Unit> getLoadFailListener() {
        return this.f34894f;
    }

    public final Function0<Unit> getLoadPreviewSuccessListener() {
        return this.f34893e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/LargeImageView$loadImage$1", "Lcom/bytedance/ee/lark/infra/foundation/schedulers/Action;", "act", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView$c */
    public static final class C13161c extends Action {

        /* renamed from: a */
        final /* synthetic */ LargeImageView f34897a;

        /* renamed from: b */
        final /* synthetic */ File f34898b;

        /* renamed from: c */
        final /* synthetic */ ComponentCallbacks2C2126g f34899c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView$c$a */
        static final class RunnableC13162a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C13161c f34900a;

            RunnableC13162a(C13161c cVar) {
                this.f34900a = cVar;
            }

            public final void run() {
                this.f34900a.f34897a.mo49228c(this.f34900a.f34899c, this.f34900a.f34898b);
            }
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
        public void act() {
            boolean z;
            if (LarkGlideImageUtils.ImageType.TYPE_GIF == LarkGlideImageUtils.m54239a(this.f34898b)) {
                z = true;
            } else {
                z = false;
            }
            if (this.f34897a.getContext() != null) {
                if (this.f34897a.getContext() instanceof Activity) {
                    Context context = this.f34897a.getContext();
                    if (context == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    } else if (((Activity) context).isDestroyed()) {
                        return;
                    }
                }
                if (z) {
                    AppbrandContext.getMainHandler().post(new RunnableC13162a(this));
                } else {
                    this.f34897a.mo49227b(this.f34899c, this.f34898b);
                }
            }
        }

        C13161c(LargeImageView largeImageView, File file, ComponentCallbacks2C2126g gVar) {
            this.f34897a = largeImageView;
            this.f34898b = file;
            this.f34899c = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView$d */
    public static final class RunnableC13163d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LargeImageView f34901a;

        /* renamed from: b */
        final /* synthetic */ ComponentCallbacks2C2126g f34902b;

        /* renamed from: c */
        final /* synthetic */ File f34903c;

        /* renamed from: d */
        final /* synthetic */ int[] f34904d;

        /* renamed from: e */
        final /* synthetic */ int f34905e;

        /* renamed from: f */
        final /* synthetic */ int f34906f;

        /* renamed from: g */
        final /* synthetic */ int f34907g;

        /* renamed from: h */
        final /* synthetic */ ImageSource f34908h;

        RunnableC13163d(LargeImageView largeImageView, ComponentCallbacks2C2126g gVar, File file, int[] iArr, int i, int i2, int i3, ImageSource imageSource) {
            this.f34901a = largeImageView;
            this.f34902b = gVar;
            this.f34903c = file;
            this.f34904d = iArr;
            this.f34905e = i;
            this.f34906f = i2;
            this.f34907g = i3;
            this.f34908h = imageSource;
        }

        public final void run() {
            C2124f<Bitmap> i;
            C2124f<Bitmap> a;
            this.f34901a.f34892b.setVisibility(8);
            this.f34901a.f34891a.setVisibility(0);
            ComponentCallbacks2C2126g gVar = this.f34902b;
            if (gVar != null && (i = gVar.mo10430i()) != null && (a = i.mo10393a(this.f34903c)) != null) {
                int[] iArr = this.f34904d;
                C2124f fVar = (C2124f) a.mo11144c(iArr[0], iArr[1]);
                if (fVar != null) {
                    C131641 r0 = (C131641) fVar.mo10397a((AbstractC2522j) new AbstractC2523k<SubsamplingScaleImageView, Bitmap>(this, this.f34901a.f34891a) {
                        /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView.RunnableC13163d.C131641 */

                        /* renamed from: b */
                        final /* synthetic */ RunnableC13163d f34909b;

                        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
                        /* renamed from: b */
                        public void mo10444b(Drawable drawable) {
                            super.mo10444b(drawable);
                            Exception exc = new Exception("load failed");
                            Function1<Exception, Unit> loadFailListener = this.f34909b.f34901a.getLoadFailListener();
                            if (loadFailListener != null) {
                                loadFailListener.invoke(exc);
                            }
                        }

                        {
                            this.f34909b = r1;
                        }

                        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
                        /* renamed from: a */
                        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                            mo49244a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
                        }

                        /* renamed from: a */
                        public void mo49244a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
                            Intrinsics.checkParameterIsNotNull(bitmap, "resource");
                            if (this.f34909b.f34901a.getContext() != null) {
                                if (this.f34909b.f34901a.getContext() instanceof Activity) {
                                    Context context = this.f34909b.f34901a.getContext();
                                    if (context == null) {
                                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                                    } else if (((Activity) context).isDestroyed()) {
                                        return;
                                    }
                                }
                                ImageSource bitmap2 = ImageSource.bitmap(BitmapUtils.f35241a.mo49647a(-this.f34909b.f34905e, bitmap));
                                Intrinsics.checkExpressionValueIsNotNull(bitmap2, "ImageSource.bitmap(rotateBitmap)");
                                this.f34909b.f34901a.f34891a.setOrientation(this.f34909b.f34905e);
                                if (this.f34909b.f34906f < C67043j.m261267a(this.f34909b.f34901a.getContext()) || ((float) this.f34909b.f34906f) / ((float) this.f34909b.f34907g) < 1.5f) {
                                    this.f34909b.f34901a.f34891a.setImage(this.f34909b.f34908h, bitmap2);
                                    this.f34909b.f34901a.f34891a.setMinimumScaleType(3);
                                } else {
                                    this.f34909b.f34901a.f34891a.setMinimumScaleType(2);
                                    this.f34909b.f34901a.f34891a.setImage(this.f34909b.f34908h, new ImageViewState((float) (C67043j.m261275b(this.f34909b.f34901a.getContext()) / this.f34909b.f34907g), new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), this.f34909b.f34905e));
                                }
                                Function0<Unit> loadPreviewSuccessListener = this.f34909b.f34901a.getLoadPreviewSuccessListener();
                                if (loadPreviewSuccessListener != null) {
                                    loadPreviewSuccessListener.invoke();
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView$e */
    public static final class RunnableC13165e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LargeImageView f34910a;

        /* renamed from: b */
        final /* synthetic */ File f34911b;

        /* renamed from: c */
        final /* synthetic */ int[] f34912c;

        /* renamed from: d */
        final /* synthetic */ int f34913d;

        /* renamed from: e */
        final /* synthetic */ ImageSource f34914e;

        /* renamed from: f */
        final /* synthetic */ int f34915f;

        /* renamed from: g */
        final /* synthetic */ int f34916g;

        RunnableC13165e(LargeImageView largeImageView, File file, int[] iArr, int i, ImageSource imageSource, int i2, int i3) {
            this.f34910a = largeImageView;
            this.f34911b = file;
            this.f34912c = iArr;
            this.f34913d = i;
            this.f34914e = imageSource;
            this.f34915f = i2;
            this.f34916g = i3;
        }

        public final void run() {
            this.f34910a.f34892b.setVisibility(8);
            this.f34910a.f34891a.setVisibility(0);
            IRequestCreator asBitmap = ImageLoader.with(this.f34910a.getContext()).load(this.f34911b).diskCacheStrategy(DiskCacheStrategy.ALL).asBitmap();
            int[] iArr = this.f34912c;
            asBitmap.override(iArr[0], iArr[1]).into(new C38818i<Bitmap>(this) {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView.RunnableC13165e.C131661 */

                /* renamed from: a */
                final /* synthetic */ RunnableC13165e f34917a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f34917a = r1;
                }

                @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
                /* renamed from: a */
                public void mo49247a(Drawable drawable) {
                    super.mo49247a(drawable);
                    AppBrandLogger.m52829e("LargeImageView", "onLoadFailed");
                    Exception exc = new Exception("load failed");
                    Function1<Exception, Unit> loadFailListener = this.f34917a.f34910a.getLoadFailListener();
                    if (loadFailListener != null) {
                        loadFailListener.invoke(exc);
                    }
                }

                /* renamed from: a */
                public void mo49248a(Bitmap bitmap) {
                    super.mo49248a((Object) bitmap);
                    BitmapUtils bVar = BitmapUtils.f35241a;
                    int i = -this.f34917a.f34913d;
                    if (bitmap == null) {
                        Intrinsics.throwNpe();
                    }
                    Bitmap a = bVar.mo49647a(i, bitmap);
                    if (a != null) {
                        ImageSource cachedBitmap = ImageSource.cachedBitmap(a);
                        Intrinsics.checkExpressionValueIsNotNull(cachedBitmap, "ImageSource.cachedBitmap(rotateBitmap)");
                        this.f34917a.f34910a.f34891a.setOrientation(this.f34917a.f34913d);
                        this.f34917a.f34910a.f34891a.setImage(this.f34917a.f34914e, cachedBitmap);
                    } else {
                        this.f34917a.f34910a.f34891a.setOrientation(this.f34917a.f34913d);
                        this.f34917a.f34910a.f34891a.setImage(this.f34917a.f34914e);
                    }
                    LargeImageView.f34890d.mo49238a(this.f34917a.f34910a.f34891a, this.f34917a.f34915f, this.f34917a.f34916g);
                    AppBrandLogger.m52828d("LargeImageView", "onResourceReady");
                    Function0<Unit> loadPreviewSuccessListener = this.f34917a.f34910a.getLoadPreviewSuccessListener();
                    if (loadPreviewSuccessListener != null) {
                        loadPreviewSuccessListener.invoke();
                    }
                }
            });
        }
    }

    public final int getImageDisplayHeight() {
        if (this.f34892b.getVisibility() == 0) {
            Drawable drawable = this.f34892b.getDrawable();
            int measuredHeight = this.f34892b.getMeasuredHeight();
            if (drawable == null) {
                return measuredHeight;
            }
            int height = drawable.getBounds().height();
            float[] fArr = new float[10];
            this.f34892b.getImageMatrix().getValues(fArr);
            return (int) (((float) height) * fArr[4]);
        } else if (this.f34891a.getVisibility() == 0) {
            return this.f34895g;
        } else {
            return getMeasuredHeight();
        }
    }

    public final void setLoadFailListener(Function1<? super Exception, Unit> function1) {
        this.f34894f = function1;
    }

    public final void setLoadPreviewSuccessListener(Function0<Unit> function0) {
        this.f34893e = function0;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f34892b.setOnClickListener(onClickListener);
        this.f34891a.setOnClickListener(onClickListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f34892b.setOnLongClickListener(onLongClickListener);
        this.f34891a.setOnLongClickListener(onLongClickListener);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0005\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/LargeImageView$loadGif$1", "Lcom/bumptech/glide/request/target/DrawableImageViewTarget;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "animation", "Lcom/bumptech/glide/request/transition/Transition;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.LargeImageView$b */
    public static final class C13160b extends C2517e {

        /* renamed from: b */
        final /* synthetic */ LargeImageView f34896b;

        @Override // com.bumptech.glide.request.p095a.AbstractC2518f, com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: b */
        public void mo10444b(Drawable drawable) {
            super.mo10444b(drawable);
            Exception exc = new Exception("load failed");
            Function1<Exception, Unit> loadFailListener = this.f34896b.getLoadFailListener();
            if (loadFailListener != null) {
                loadFailListener.invoke(exc);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13160b(LargeImageView largeImageView, ImageView imageView) {
            super(imageView);
            this.f34896b = largeImageView;
        }

        /* renamed from: a */
        public void mo10442a(Drawable drawable, AbstractC2529b<? super Drawable> bVar) {
            Intrinsics.checkParameterIsNotNull(drawable, "resource");
            if (this.f34896b.getContext() != null) {
                if (this.f34896b.getContext() instanceof Activity) {
                    Context context = this.f34896b.getContext();
                    if (context == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    } else if (((Activity) context).isDestroyed()) {
                        return;
                    }
                }
                super.mo10442a((Object) drawable, (AbstractC2529b) bVar);
                Function0<Unit> loadPreviewSuccessListener = this.f34896b.getLoadPreviewSuccessListener();
                if (loadPreviewSuccessListener != null) {
                    loadPreviewSuccessListener.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m53785a(int[] iArr) {
        if (iArr[0] <= 0) {
            iArr[0] = C67043j.m261275b(getContext());
        }
        if (iArr[1] <= 0) {
            iArr[1] = C67043j.m261267a(getContext());
        }
    }

    public final void setMaxAvailableSize(int[] iArr) {
        int[] iArr2;
        Integer num;
        if (iArr != null) {
            iArr2 = iArr;
        } else {
            iArr2 = new int[2];
        }
        f34889c = iArr2;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("set setMaxAvailableSize height = ");
        Integer num2 = null;
        if (iArr != null) {
            num = Integer.valueOf(iArr[0]);
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(" width = ");
        if (iArr != null) {
            num2 = Integer.valueOf(iArr[1]);
        }
        sb.append(num2);
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("LargeImageView", objArr);
    }

    /* renamed from: a */
    private final void m53784a(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i <= 0 || i2 <= 0) {
            AppBrandLogger.m52829e("LargeImageView", "ImageLoader cannot get image file width or height");
            return;
        }
        this.f34895g = i2;
        SubsamplingScaleImageView subsamplingScaleImageView = this.f34891a;
        Companion aVar = f34890d;
        subsamplingScaleImageView.setMaxScale(aVar.mo49237a((View) subsamplingScaleImageView, i, i2));
        ImageSource uri = ImageSource.uri(Uri.fromFile(file));
        Intrinsics.checkExpressionValueIsNotNull(uri, "ImageSource.uri(Uri.fromFile(file))");
        uri.dimensions(i, i2);
        int[] b = aVar.mo49240b(this.f34891a, i, i2);
        m53785a(b);
        BitmapUtils bVar = BitmapUtils.f35241a;
        String path = file.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "file.path");
        int a = bVar.mo49646a(path);
        StringBuilder sb = new StringBuilder();
        sb.append("load image width = ");
        sb.append(i);
        sb.append(" , height = ");
        sb.append(i2);
        sb.append(" , bounds = ");
        String arrays = Arrays.toString(b);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        AppBrandLogger.m52830i("LargeImageView", sb.toString());
        UICallbackExecutor.execute(new RunnableC13165e(this, file, b, a, uri, i, i2));
    }

    /* renamed from: a */
    public final void mo49226a(ComponentCallbacks2C2126g gVar, File file) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        Observable.create(new C13161c(this, file, gVar)).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    /* renamed from: b */
    public final void mo49227b(ComponentCallbacks2C2126g gVar, File file) {
        String str;
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
        boolean featureGating = instance.getExtension().getFeatureGating("gadget.loadimage.use.imageloader");
        if (featureGating) {
            m53784a(file);
        } else {
            m53786d(gVar, file);
        }
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("loadLargeImage by ");
        if (featureGating) {
            str = "ImageLoader";
        } else {
            str = "Glide";
        }
        sb.append(str);
        objArr[0] = sb.toString();
        AppBrandLogger.m52830i("LargeImageView", objArr);
    }

    /* renamed from: c */
    public final void mo49228c(ComponentCallbacks2C2126g gVar, File file) {
        C2124f fVar;
        C2124f<Drawable> a;
        this.f34892b.setVisibility(0);
        this.f34891a.setVisibility(8);
        if (gVar == null || (a = gVar.mo10411a(file)) == null) {
            fVar = null;
        } else {
            fVar = (C2124f) a.mo11156m();
        }
        if (fVar != null) {
            C2124f fVar2 = (C2124f) fVar.mo11129a(AbstractC2354j.f7812b);
        }
        if (fVar != null) {
            C13160b bVar = (C13160b) fVar.mo10397a((AbstractC2522j) new C13160b(this, this.f34892b));
        }
    }

    /* renamed from: d */
    private final void m53786d(ComponentCallbacks2C2126g gVar, File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i <= 0 || i2 <= 0) {
            AppBrandLogger.m52829e("LargeImageView", "cannot get image file width or height");
            return;
        }
        this.f34895g = i2;
        SubsamplingScaleImageView subsamplingScaleImageView = this.f34891a;
        Companion aVar = f34890d;
        subsamplingScaleImageView.setMaxScale(aVar.mo49237a((View) subsamplingScaleImageView, i, i2));
        ImageSource uri = ImageSource.uri(Uri.fromFile(file));
        Intrinsics.checkExpressionValueIsNotNull(uri, "ImageSource.uri(Uri.fromFile(file))");
        uri.dimensions(i, i2);
        int[] b = aVar.mo49240b(this.f34891a, i, i2);
        m53785a(b);
        BitmapUtils bVar = BitmapUtils.f35241a;
        String path = file.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "file.path");
        int a = bVar.mo49646a(path);
        StringBuilder sb = new StringBuilder();
        sb.append("load image width = ");
        sb.append(i);
        sb.append(" , height = ");
        sb.append(i2);
        sb.append(" , bounds = ");
        String arrays = Arrays.toString(b);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        AppBrandLogger.m52830i("LargeImageView", sb.toString());
        AppbrandContext.getMainHandler().post(new RunnableC13163d(this, gVar, file, b, a, i2, i, uri));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LargeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f34891a = new SubsamplingScaleImageView(context);
        ImageView imageView = new ImageView(context);
        this.f34892b = imageView;
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f34891a, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LargeImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
