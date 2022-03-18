package com.ss.android.lark.moments.impl.feed.nineimage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Media;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineVideoViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "horizontalMargin", "", "mContext", "Landroid/content/Context;", "videoMaxSize", "videoMinSize", "calculateVideoSize", "", "originWidth", "originHeight", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onViewRecycled", "setShowProfileRoundBg", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.d */
public final class NineVideoViewHolder extends AbstractC58967a<NineImageBean, View> {

    /* renamed from: a */
    public static final Companion f120009a = new Companion(null);

    /* renamed from: b */
    private final Context f120010b;

    /* renamed from: c */
    private final int f120011c;

    /* renamed from: d */
    private final int f120012d = UIHelper.dp2px(120.0f);

    /* renamed from: e */
    private int f120013e = UIHelper.dp2px(80.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineVideoViewHolder$Companion;", "", "()V", "LOG_TAG", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo167105a() {
        this.f120013e = UIHelper.dp2px(120.0f);
    }

    /* renamed from: b */
    public final void mo167107b() {
        ImageUtils bVar = ImageUtils.f119250a;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.media_cover);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.media_cover");
        bVar.mo166200a(lKUIRoundedImageView2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NineVideoViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f120010b = context;
        this.f120011c = (int) (((float) DeviceUtils.getScreenWidth(context)) * 0.6f);
    }

    /* renamed from: a */
    public void mo165944a(NineImageBean nineImageBean) {
        Media d;
        ImageSet imageSet;
        super.mo165944a((Object) nineImageBean);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        LKUIRoundedImageView2 lKUIRoundedImageView2 = (LKUIRoundedImageView2) view.findViewById(R.id.media_cover);
        Intrinsics.checkExpressionValueIsNotNull(lKUIRoundedImageView2, "itemView.media_cover");
        lKUIRoundedImageView2.setBorderColor(C25653b.m91893a(UIHelper.getColor(R.color.ud_N900), 0.15f));
        if (nineImageBean != null && (d = nineImageBean.mo167084d()) != null && (imageSet = d.cover) != null) {
            Intrinsics.checkExpressionValueIsNotNull(imageSet, "media.cover ?: return");
            Image image = imageSet.origin;
            if (image != null) {
                Intrinsics.checkExpressionValueIsNotNull(image, "cover.origin ?: return");
                Integer num = image.width;
                Intrinsics.checkExpressionValueIsNotNull(num, "origin.width");
                int intValue = num.intValue();
                Integer num2 = image.height;
                Intrinsics.checkExpressionValueIsNotNull(num2, "origin.height");
                int[] a = m188400a(intValue, num2.intValue());
                ViewGroup.LayoutParams layoutParams = lKUIRoundedImageView2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.width = a[0];
                    marginLayoutParams.height = a[1];
                    lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    ImageUtils.f119250a.mo166201a(imageSet, lKUIRoundedImageView2, a[0], a[1], ListenerParams.FromType.COVER);
                    if (Intrinsics.compare(nineImageBean.mo167084d().duration_sec.intValue(), 0) > 0) {
                        String format = new SimpleDateFormat("mm:ss", Locale.ENGLISH).format(Integer.valueOf(nineImageBean.mo167084d().duration_sec.intValue() * 1000));
                        Intrinsics.checkExpressionValueIsNotNull(format, "formatter.format(data.media.duration_sec * 1000)");
                        View view2 = this.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                        TextView textView = (TextView) view2.findViewById(R.id.media_duration);
                        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.media_duration");
                        textView.setVisibility(0);
                        View view3 = this.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                        TextView textView2 = (TextView) view3.findViewById(R.id.media_duration);
                        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.media_duration");
                        textView2.setText(format);
                        return;
                    }
                    Log.m165389i("NineVideoViewHolder", "media duration is 0, hide media_duration");
                    View view4 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                    TextView textView3 = (TextView) view4.findViewById(R.id.media_duration);
                    Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.media_duration");
                    textView3.setVisibility(8);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: a */
    private final int[] m188400a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            Log.m165389i("NineVideoViewHolder", "cover size is 0, skip");
            return new int[]{i, i2};
        } else if (i >= i2) {
            int screenWidth = DeviceUtils.getScreenWidth(this.f120010b) - this.f120013e;
            return new int[]{screenWidth, (screenWidth * 9) / 16};
        } else {
            return new int[]{(int) (((float) ((DeviceUtils.getScreenWidth(this.f120010b) - this.f120013e) * 2)) / 3.0f), DeviceUtils.getScreenWidth(this.f120010b) - this.f120013e};
        }
    }
}
