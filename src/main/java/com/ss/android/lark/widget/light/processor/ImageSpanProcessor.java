package com.ss.android.lark.widget.light.processor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.C58314a;
import com.ss.android.lark.widget.light.SpannableStringExtraParams;
import com.ss.android.lark.widget.light.image.LKUILightTextImageLoader;
import com.ss.android.lark.widget.light.span.ImageClickSpan;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.span.C59154e;
import com.ss.android.lark.widget.span.C59160j;
import com.ss.android.lark.widget.span.ImageInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/ImageSpanProcessor;", "Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "Lcom/ss/android/lark/widget/span/ImageInfo;", "()V", "applyMemberImageCache", "", "context", "Landroid/content/Context;", "builder", "Lcom/ss/android/lark/widget/span/RemoteDrawableSpan$RemoteDrawableSpanBuilder;", "spanInfo", "process", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.f */
public final class ImageSpanProcessor implements ISpanProcessor<ImageInfo> {

    /* renamed from: a */
    public static final Companion f144161a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/ImageSpanProcessor$Companion;", "", "()V", "LOG_TAG", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.d.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m226838a(Context context, C59160j.C59164c cVar, ImageInfo imageInfo) {
        C58314a.AbstractC58315a a = C58314a.m226104a();
        Intrinsics.checkExpressionValueIsNotNull(a, "EmojiModuleDependency.getDependency()");
        if (a.mo102817b()) {
            String str = imageInfo.key;
            Object obj = imageInfo.url;
            if (!TextUtils.isEmpty(str)) {
                obj = new C38824b(str);
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Bitmap bitmap = ImageLoader.with(context).load(obj).onlyRetrieveFromCache(true).getBitmap(imageInfo.width, imageInfo.height);
                Log.m165379d("ImageSpanProcessor", "time cost:" + (System.currentTimeMillis() - currentTimeMillis) + ", bitmap:" + bitmap);
                if (bitmap != null) {
                    Log.m165379d("ImageSpanProcessor", "apply cache");
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                    if (imageInfo.borderProperty != null) {
                        bitmapDrawable = C59154e.m229814a(bitmapDrawable, imageInfo.width, imageInfo.height, imageInfo.borderProperty);
                        Intrinsics.checkExpressionValueIsNotNull(bitmapDrawable, "ImageBorderUtils.getDraw… spanInfo.borderProperty)");
                    }
                    bitmapDrawable.setBounds(0, 0, imageInfo.width, imageInfo.height);
                    cVar.mo201104a(bitmapDrawable);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo198129a(Context context, C58513g gVar, ImageInfo imageInfo, SpannableStringExtraParams aVar) {
        C59160j jVar;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "spanBuilder");
        Intrinsics.checkParameterIsNotNull(imageInfo, "spanInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        String str = imageInfo.text;
        String str2 = imageInfo.key;
        String str3 = imageInfo.url;
        C59160j.C59164c a = new C59160j.C59164c().mo201103a(imageInfo.width).mo201109b(imageInfo.height).mo201105a(imageInfo.borderProperty);
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m226838a(context, a, imageInfo);
        if (!TextUtils.isEmpty(str2)) {
            a.mo201106a(LKUILightTextImageLoader.f144132a.mo198110a());
            jVar = a.mo201108a(context, str2);
            Intrinsics.checkExpressionValueIsNotNull(jVar, "builder.build(context, key)");
        } else {
            a.mo201106a(LKUILightTextImageLoader.f144132a.mo198111b());
            jVar = a.mo201108a(context, str3);
            Intrinsics.checkExpressionValueIsNotNull(jVar, "builder.build(context, url)");
        }
        gVar.append(str, jVar, 33);
        int length = gVar.length();
        gVar.setSpan(new ImageClickSpan(imageInfo), length - str.length(), length, 33);
    }
}
