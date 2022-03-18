package com.ss.android.lark.newemoji.api;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.newemoji.loader.EmojiImageResource;
import com.ss.android.lark.p2719t.p2721b.C55251c;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/newemoji/api/LarkEmojiModuleDependency;", "", "()V", "LOG_TAG", "", "emojiDependency", "Lcom/ss/android/lark/newemoji/api/LarkEmojiModuleDependency$IEmojiDependency;", "getEmojiDependency", "()Lcom/ss/android/lark/newemoji/api/LarkEmojiModuleDependency$IEmojiDependency;", "setEmojiDependency", "(Lcom/ss/android/lark/newemoji/api/LarkEmojiModuleDependency$IEmojiDependency;)V", "getDependency", "init", "", "context", "Landroid/content/Context;", "dependency", "IEmojiDependency", "lark-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.t.a.a */
public final class LarkEmojiModuleDependency {

    /* renamed from: a */
    public static final LarkEmojiModuleDependency f136333a = new LarkEmojiModuleDependency();

    /* renamed from: b */
    private static volatile IEmojiDependency f136334b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/newemoji/api/LarkEmojiModuleDependency$IEmojiDependency;", "", "getEmojiImageFromNet", "", "imageKey", "getResMapFromNet", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "triggerKeys", "", "isOversea", "", "lark-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.t.a.a$a */
    public interface IEmojiDependency {
        /* renamed from: a */
        String mo43820a(String str);

        /* renamed from: a */
        void mo43821a(int i, List<String> list);

        /* renamed from: a */
        boolean mo43822a();
    }

    private LarkEmojiModuleDependency() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final IEmojiDependency m214269a() {
        return f136334b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m214270a(Context context, IEmojiDependency aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f136334b = aVar;
        ImageLoader.registerLoadModelHook(context, EmojiImageResource.class, InputStream.class, new C55251c.C55252a());
    }
}
