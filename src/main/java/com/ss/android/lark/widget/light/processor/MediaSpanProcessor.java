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
import com.ss.android.lark.widget.light.span.MediaClickSpan;
import com.ss.android.lark.widget.linked_emojicon.C58513g;
import com.ss.android.lark.widget.span.C59154e;
import com.ss.android.lark.widget.span.ImageInfo;
import com.ss.android.lark.widget.span.MediaInfo;
import com.ss.android.lark.widget.span.RemoteMediaSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/MediaSpanProcessor;", "Lcom/ss/android/lark/widget/light/processor/ISpanProcessor;", "Lcom/ss/android/lark/widget/span/MediaInfo;", "()V", "applyMemberImageCache", "", "context", "Landroid/content/Context;", "builder", "Lcom/ss/android/lark/widget/span/RemoteMediaSpan$RemoteMediaSpanBuilder;", "spanInfo", "process", "spanBuilder", "Lcom/ss/android/lark/widget/linked_emojicon/SpannableStringBuilderAllVer;", "params", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.d.h */
public final class MediaSpanProcessor implements ISpanProcessor<MediaInfo> {

    /* renamed from: a */
    public static final Companion f144162a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/light/processor/MediaSpanProcessor$Companion;", "", "()V", "LOG_TAG", "", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.d.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m226843a(Context context, RemoteMediaSpan.C59150b bVar, MediaInfo mediaInfo) {
        Object obj;
        C58314a.AbstractC58315a a = C58314a.m226104a();
        Intrinsics.checkExpressionValueIsNotNull(a, "EmojiModuleDependency.getDependency()");
        if (a.mo102817b()) {
            ImageInfo imageInfo = mediaInfo.originImageInfo;
            String str = imageInfo.key;
            if (!TextUtils.isEmpty(mediaInfo.originPath)) {
                obj = mediaInfo.originPath;
            } else if (imageInfo != null) {
                obj = imageInfo.url;
            } else {
                obj = null;
            }
            if (!TextUtils.isEmpty(str)) {
                obj = new C38824b(str);
            }
            try {
                Bitmap bitmap = ImageLoader.with(context).load(obj).onlyRetrieveFromCache(true).getBitmap(mediaInfo.width, mediaInfo.height);
                if (bitmap != null) {
                    Log.m165379d("MediaSpanProcessor", "apply cache");
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                    if (mediaInfo.borderProperty != null) {
                        bitmapDrawable = C59154e.m229814a(bitmapDrawable, mediaInfo.width, mediaInfo.height, mediaInfo.borderProperty);
                        Intrinsics.checkExpressionValueIsNotNull(bitmapDrawable, "ImageBorderUtils.getDraw… spanInfo.borderProperty)");
                    }
                    bitmapDrawable.setBounds(0, 0, mediaInfo.width, mediaInfo.height);
                    bVar.mo201067a(bitmapDrawable);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo198129a(Context context, C58513g gVar, MediaInfo mediaInfo, SpannableStringExtraParams aVar) {
        RemoteMediaSpan remoteMediaSpan;
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "spanBuilder");
        Intrinsics.checkParameterIsNotNull(mediaInfo, "spanInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        String str2 = mediaInfo.text;
        ImageInfo imageInfo = mediaInfo.originImageInfo;
        RemoteMediaSpan.C59150b a = new RemoteMediaSpan.C59150b().mo201066a(mediaInfo.width).mo201071b(mediaInfo.height).mo201068a(mediaInfo.borderProperty);
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m226843a(context, a, mediaInfo);
        if (imageInfo == null || TextUtils.isEmpty(imageInfo.key)) {
            a.mo201069a(LKUILightTextImageLoader.f144132a.mo198111b());
            if (!TextUtils.isEmpty(mediaInfo.originPath)) {
                str = mediaInfo.originPath;
            } else if (imageInfo != null) {
                str = imageInfo.url;
            } else {
                str = null;
            }
            remoteMediaSpan = a.mo201070a(context, str, mediaInfo.duration);
            Intrinsics.checkExpressionValueIsNotNull(remoteMediaSpan, "builder.build(context, path, spanInfo.duration)");
        } else {
            a.mo201069a(LKUILightTextImageLoader.f144132a.mo198110a());
            remoteMediaSpan = a.mo201070a(context, imageInfo.key, mediaInfo.duration);
            Intrinsics.checkExpressionValueIsNotNull(remoteMediaSpan, "builder.build(context, o…o.key, spanInfo.duration)");
        }
        gVar.append(str2, remoteMediaSpan, 33);
        int length = gVar.length();
        gVar.setSpan(new MediaClickSpan(mediaInfo), length - str2.length(), length, 33);
    }
}
