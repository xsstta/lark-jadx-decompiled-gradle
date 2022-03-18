package com.ss.android.lark.widget.linked_emojicon.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import com.ss.android.lark.newemoji.EmojiMapManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007JD\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiHandler;", "", "()V", "EMOJI_THRESHOLD", "", "descToEmojiMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "descToEmojiMap$annotations", "getDescToEmojiMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "pattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "patternString", "addEmojis", "", "context", "Landroid/content/Context;", "text", "Landroid/text/Spannable;", "emojiSize", "emojiAlignment", "textSize", "index", "length", "getEmojiDrawableFromKey", "Landroid/graphics/drawable/Drawable;", "key", "getEmojiDrawableFromReactionKey", "getEmojiTextFromKey", "getEmojiTextFromReactionKey", "preloadEmojiDrawableFromReactionKey", "EmojiAlignment", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EmojiHandler {

    /* renamed from: a */
    public static final EmojiHandler f144322a = new EmojiHandler();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, String> f144323b = EmojiMapManager.m214280c();

    /* renamed from: c */
    private static final String f144324c = f144324c;

    /* renamed from: d */
    private static final Pattern f144325d = Pattern.compile(f144324c);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiHandler$EmojiAlignment;", "", "Companion", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EmojiAlignment {
        public static final Companion Companion = Companion.f144326a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiHandler$EmojiAlignment$Companion;", "", "()V", "EMOJI_ALIGN_BASELINE", "", "EMOJI_ALIGN_BOTTOM", "EMOJI_ALIGN_CENTER", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler$EmojiAlignment$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f144326a = new Companion();

            private Companion() {
            }
        }
    }

    private EmojiHandler() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m226951d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        EmojiMapManager.f136337c.mo188269b(str, false);
    }

    @JvmStatic
    /* renamed from: a */
    public static final Drawable m226946a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Bitmap b = EmojiMapManager.f136337c.mo188269b(str, true);
        if (b != null) {
            return new BitmapDrawable(b);
        }
        EmojiMapManager.f136337c.mo188274d(str, true);
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final Drawable m226950c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Bitmap b = EmojiMapManager.f136337c.mo188269b(str, false);
        if (b != null) {
            return new BitmapDrawable(b);
        }
        EmojiMapManager.f136337c.mo188274d(str, false);
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m226949b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return '[' + EmojiMapManager.f136337c.mo188263a(str, true) + ']';
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m226952e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return '[' + EmojiMapManager.f136337c.mo188263a(str, false) + ']';
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m226947a(Context context, Spannable spannable, int i, int i2, int i3) {
        m226948a(context, spannable, i, i2, i3, 0, -1);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m226948a(Context context, Spannable spannable, int i, int i2, int i3, int i4, int i5) {
        Matcher matcher;
        int i6 = i4;
        if (!(spannable == null || context == null)) {
            int length = spannable.length();
            int i7 = length - i6;
            if (i5 >= 0 && i5 < i7) {
                length = i5 + i6;
            }
            C58504c[] cVarArr = (C58504c[]) spannable.getSpans(i6, length, C58504c.class);
            Intrinsics.checkExpressionValueIsNotNull(cVarArr, "oldSpans");
            for (C58504c cVar : cVarArr) {
                spannable.removeSpan(cVar);
            }
            Spannable spannable2 = spannable;
            Matcher matcher2 = f144325d.matcher(spannable2.subSequence(i6, length).toString());
            if (matcher2.find()) {
                matcher2.reset();
                int i8 = 0;
                while (matcher2.find()) {
                    String group = matcher2.group(1);
                    if (!TextUtils.isEmpty(group)) {
                        String str = '[' + group + ']';
                        String str2 = f144323b.get(group);
                        if (str2 != null) {
                            Intrinsics.checkExpressionValueIsNotNull(str2, "descToEmojiMap[desc] ?: continue");
                            Drawable a = m226946a(str2);
                            if (a != null) {
                                int indexOf$default = StringsKt.indexOf$default((CharSequence) spannable2, str, i6, false, 4, (Object) null);
                                int length2 = indexOf$default + str.length();
                                if (indexOf$default >= 0 && length2 <= length) {
                                    matcher = matcher2;
                                    spannable.setSpan(new C58504c(context, a, str2, i, i2, i3), indexOf$default, length2, 33);
                                    int i9 = i8 + 1;
                                    if (i9 < 200) {
                                        i8 = i9;
                                        i6 = length2;
                                        matcher2 = matcher;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    matcher = matcher2;
                    matcher2 = matcher;
                }
            }
        }
    }
}
