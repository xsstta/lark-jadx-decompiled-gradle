package com.ss.android.lark.widget.light.image;

import com.ss.android.lark.widget.span.C59160j;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/widget/light/image/LKUILightTextImageLoader;", "", "()V", "CHAT_WINDOW_PAGE", "", "IMAGE_LOAD_ERROR_CODE", "", "extraCategory", "", "extraMetric", "", "imageLoadKey", "sEncryptImageFetcher", "Lcom/ss/android/lark/widget/span/RemoteDrawableSpan$ImageFetcher;", "getSEncryptImageFetcher", "()Lcom/ss/android/lark/widget/span/RemoteDrawableSpan$ImageFetcher;", "sEncryptImageFetcher$delegate", "Lkotlin/Lazy;", "sLocalImageFetcher", "getSLocalImageFetcher", "sLocalImageFetcher$delegate", "getEncryptImageFetcher", "getLocalImageFetcher", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.b.a */
public final class LKUILightTextImageLoader {

    /* renamed from: a */
    public static final LKUILightTextImageLoader f144132a = new LKUILightTextImageLoader();

    /* renamed from: b */
    private static final Map<String, Object> f144133b = MapsKt.mutableMapOf(TuplesKt.to("resource_content_length", -1));

    /* renamed from: c */
    private static final Map<String, Object> f144134c = MapsKt.mapOf(TuplesKt.to("from_type", 2), TuplesKt.to("image_type", "jpeg"), TuplesKt.to("chat_type", 0), TuplesKt.to("load_type", 1), TuplesKt.to("color_space", "SRGB"));

    /* renamed from: d */
    private static String f144135d = "";

    /* renamed from: e */
    private static final Lazy f144136e = LazyKt.lazy(C58478a.INSTANCE);

    /* renamed from: f */
    private static final Lazy f144137f = LazyKt.lazy(C58482b.INSTANCE);

    /* renamed from: c */
    private final C59160j.AbstractC59162a m226796c() {
        return (C59160j.AbstractC59162a) f144136e.getValue();
    }

    /* renamed from: d */
    private final C59160j.AbstractC59162a m226798d() {
        return (C59160j.AbstractC59162a) f144137f.getValue();
    }

    private LKUILightTextImageLoader() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/span/RemoteDrawableSpan$ImageFetcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.b.a$a */
    static final class C58478a extends Lambda implements Function0<C59160j.AbstractC59162a> {
        public static final C58478a INSTANCE = new C58478a();

        C58478a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C59160j.AbstractC59162a invoke() {
            return C584791.f144138a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/widget/span/RemoteDrawableSpan$ImageFetcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.b.a$b */
    static final class C58482b extends Lambda implements Function0<C59160j.AbstractC59162a> {
        public static final C58482b INSTANCE = new C58482b();

        C58482b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C59160j.AbstractC59162a invoke() {
            return C584831.f144144a;
        }
    }

    /* renamed from: b */
    public final C59160j.AbstractC59162a mo198111b() {
        return m226798d();
    }

    /* renamed from: a */
    public final C59160j.AbstractC59162a mo198110a() {
        return m226796c();
    }
}
