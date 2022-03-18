package com.ss.android.lark.sticker.p2714a;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.framework.utils.aq;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.im.api.StickerContent;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.p2715b.AbstractC55066b;
import com.ss.android.lark.sticker.ui.view.ShimmerDrawable;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.widget.AutoRecycleGifImageView;
import java.io.File;

/* renamed from: com.ss.android.lark.sticker.a.f */
public class C55004f implements AbstractC55066b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.a.f$a */
    public static class C55006a {

        /* renamed from: a */
        static C55004f f135948a = new C55004f(null);
    }

    private C55004f() {
    }

    /* renamed from: a */
    public static C55004f m213654a() {
        return C55006a.f135948a;
    }

    /* renamed from: com.ss.android.lark.sticker.a.f$1 */
    static class RunnableC550051 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f135943a;

        /* renamed from: b */
        final /* synthetic */ File f135944b;

        /* renamed from: c */
        final /* synthetic */ int f135945c;

        /* renamed from: d */
        final /* synthetic */ int f135946d;

        /* renamed from: e */
        final /* synthetic */ int f135947e;

        public void run() {
            ImageView imageView = this.f135943a;
            if (imageView == null) {
                Log.m165389i("StickerApp", "loadSticker called. view is null.");
            } else if (imageView instanceof AutoRecycleGifImageView) {
                Log.m165389i("StickerApp", "AutoRecycleGifImageView loadSticker called.");
                ((AutoRecycleGifImageView) this.f135943a).mo197415a(this.f135944b, this.f135945c, this.f135946d, this.f135947e);
            } else {
                Context context = imageView.getContext();
                C54996a.m213619a().mo144101e().mo144116a(context, this.f135943a, this.f135944b.getPath(), new LoadParams().mo105413a(this.f135945c).mo105422b(this.f135946d).mo105431e(false).mo105419a(this.f135944b.getPath()).mo105423b(C0215a.m655b(context, this.f135947e)).mo105416a(new ListenerParams.Builder().mo105405b(true).mo105402a()));
            }
        }
    }

    /* synthetic */ C55004f(RunnableC550051 r1) {
        this();
    }

    /* renamed from: a */
    private static int m213653a(Context context) {
        return UIUtils.dp2px(context, 80.0f);
    }

    /* renamed from: b */
    private static int m213657b(Context context) {
        return UIUtils.dp2px(context, 33.0f);
    }

    /* renamed from: a */
    public static int[] m213656a(Context context, int i, int i2) {
        return ImageUtils.m224136a(context, i, i2, m213653a(context), m213657b(context));
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55066b
    /* renamed from: a */
    public void mo187828a(Context context, ImageView imageView, StickerContent stickerContent) {
        if (stickerContent != null) {
            String key = stickerContent.getKey();
            if (key != null) {
                int[] a = m213656a(context, stickerContent.getWidth(), stickerContent.getHeight());
                int i = a[0];
                int i2 = a[1];
                m213655a(context, i, i2, imageView);
                mo187829a(context, false, UIUtils.dp2px(context, (float) i), UIUtils.dp2px(context, (float) i2), key, imageView, R.color.lkui_N200, R.drawable.common_failed_chat_picture);
                return;
            }
            return;
        }
        imageView.setImageResource(R.color.lkui_N200);
    }

    /* renamed from: a */
    private static void m213655a(Context context, int i, int i2, ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = UIUtils.dp2px(context, (float) i);
        layoutParams.height = UIUtils.dp2px(context, (float) i2);
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55066b
    /* renamed from: a */
    public void mo187829a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
        mo187830a(context, z, i, i2, str, imageView, i3, i4, "");
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55066b
    /* renamed from: a */
    public void mo187830a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
        mo187831a(context, z, i, i2, str, imageView, i3, i4, str2, null);
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55066b
    /* renamed from: a */
    public void mo187831a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h hVar) {
        if (context != null) {
            if (!(context instanceof Activity) || UIUtils.isActivityRunning((Activity) context)) {
                if (i3 >= 0 && imageView != null) {
                    if (imageView.getTag(R.id.tag_first) != null && !imageView.getTag(R.id.tag_first).equals(str)) {
                        imageView.setImageResource(i3);
                    } else if (imageView.getTag(R.id.tag_first) == null) {
                        imageView.setImageResource(i3);
                    }
                    imageView.setTag(R.id.tag_first, str);
                }
                if (aq.m95060c(str)) {
                    Log.m165389i("StickerApp", "current pic key is http.");
                    IRequestCreator fitCenter = ImageLoader.with(context).load(str).override(i, i2).dontAnimate(false).fitCenter();
                    if (i3 == -2) {
                        fitCenter.placeholder(new ShimmerDrawable(context));
                    } else {
                        fitCenter.placeholder(i3);
                    }
                    fitCenter.error(context.getDrawable(i4)).listener(hVar).into(new AnimatableDrawableImageViewTarget(imageView));
                    return;
                }
                IRequestCreator listener = ImageLoader.with(context).load(new C38824b(str)).override(i, i2).dontAnimate(false).fitCenter().error(context.getDrawable(i4)).listener(hVar);
                if (i3 == -2) {
                    listener.placeholder(new ShimmerDrawable(context));
                } else {
                    listener.placeholder(i3);
                }
                listener.into(new AnimatableDrawableImageViewTarget(imageView));
            }
        }
    }
}
