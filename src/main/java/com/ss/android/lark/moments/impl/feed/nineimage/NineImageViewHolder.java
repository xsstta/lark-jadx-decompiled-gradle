package com.ss.android.lark.moments.impl.feed.nineimage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.utils.ImageUtils;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "horizontalMargin", "", "mContext", "Landroid/content/Context;", "singleMaxWidth", "calculateImageSize", "", "bean", "getNormalImageSize", "onBind", "", "onViewRecycled", "setShowProfileRoundBg", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.c */
public final class NineImageViewHolder extends AbstractC58967a<NineImageBean, View> {

    /* renamed from: a */
    public static final int f120003a = UIHelper.dp2px(6.0f);

    /* renamed from: b */
    public static final int f120004b = UIHelper.dp2px(50.0f);

    /* renamed from: c */
    public static final Companion f120005c = new Companion(null);

    /* renamed from: d */
    private final Context f120006d;

    /* renamed from: e */
    private int f120007e = UIHelper.dp2px(80.0f);

    /* renamed from: f */
    private int f120008f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageViewHolder$Companion;", "", "()V", "ITEM_MARGIN", "", "getITEM_MARGIN", "()I", "LOG_TAG", "", "MIN_SINGLE_IMAGE_SIZE", "getMIN_SINGLE_IMAGE_SIZE", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo167104a() {
            return NineImageViewHolder.f120004b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final int m188394c() {
        return (int) ((float) Math.ceil((double) (((float) ((DeviceUtils.getScreenWidth(this.f120006d) - this.f120007e) - (f120003a * 2))) / 3.0f)));
    }

    /* renamed from: a */
    public final void mo167101a() {
        ImageUtils bVar = ImageUtils.f119250a;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.content");
        bVar.mo166200a(lKUIRoundedImageView2);
    }

    /* renamed from: b */
    public final void mo167103b() {
        this.f120007e = UIHelper.dp2px(120.0f);
        this.f120008f = ((int) (((float) DeviceUtils.getScreenWidth(this.f120006d)) * 0.6f)) - UIHelper.dp2px(28.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NineImageViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f120006d = context;
        this.f120008f = (int) (((float) DeviceUtils.getScreenWidth(context)) * 0.6f);
    }

    /* renamed from: b */
    private final int[] m188393b(NineImageBean nineImageBean) {
        Image image;
        ImageSet c = nineImageBean.mo167083c();
        if (c == null || (image = c.origin) == null) {
            Log.m165383e("NineImageViewHolder", "calculateImageSize originImage=null");
            int i = f120004b;
            return new int[]{i, i};
        }
        Intrinsics.checkExpressionValueIsNotNull(image, "bean.imageSet?.origin ?:…GLE_IMAGE_SIZE)\n        }");
        Integer num = image.width;
        Integer num2 = image.height;
        if (nineImageBean.mo167081b() == NineImageBean.NineImageType.TYPE_NORMAL_IMAGE) {
            int c2 = m188394c();
            int[] iArr = new int[2];
            for (int i2 = 0; i2 < 2; i2++) {
                iArr[i2] = c2;
            }
            return iArr;
        }
        Intrinsics.checkExpressionValueIsNotNull(num, "originWidth");
        int intValue = num.intValue();
        Intrinsics.checkExpressionValueIsNotNull(num2, "originHeight");
        int intValue2 = num2.intValue();
        int i3 = this.f120008f;
        int i4 = f120004b;
        int[] a = com.ss.android.lark.utils.ImageUtils.m224135a(intValue, intValue2, i3, i3, i4, i4);
        Intrinsics.checkExpressionValueIsNotNull(a, "com.ss.android.lark.util…E, MIN_SINGLE_IMAGE_SIZE)");
        return a;
    }

    /* renamed from: a */
    public void mo165944a(NineImageBean nineImageBean) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(nineImageBean, "bean");
        super.mo165944a((Object) nineImageBean);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.content");
        lKUIRoundedImageView2.setBorderColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N900), 0.15f));
        if (ImageUtils.f119250a.mo166202a(nineImageBean.mo167083c())) {
            int[] b = m188393b(nineImageBean);
            ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = b[0];
                marginLayoutParams.height = b[1];
                if (nineImageBean.mo167085e()) {
                    i = f120003a;
                } else {
                    i = 0;
                }
                marginLayoutParams.rightMargin = i;
                if (nineImageBean.mo167087f()) {
                    i2 = f120003a;
                } else {
                    i2 = 0;
                }
                marginLayoutParams.bottomMargin = i2;
                ImageUtils.m187225a(ImageUtils.f119250a, nineImageBean.mo167083c(), lKUIRoundedImageView2, b[0], b[1], null, 16, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
