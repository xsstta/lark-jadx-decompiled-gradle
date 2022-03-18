package com.ss.android.lark.keyboard.widget.emoji;

import android.graphics.Bitmap;
import com.ss.android.lark.newemoji.EmojiMapManager;
import com.ss.android.lark.p2719t.C55244a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0005H\u0007R(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/emoji/EmojiMapHandler;", "", "()V", "reactionMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/newemoji/EmojiEntity;", "reactionMap$annotations", "getReactionMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "getEmojiKeyFromReactionKey", "key", "getEmojiTextFromReactionKey", "getReactionBitmapFromKey", "Landroid/graphics/Bitmap;", "isBitmapExist", "", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.emoji.a */
public final class EmojiMapHandler {

    /* renamed from: a */
    public static final EmojiMapHandler f104804a = new EmojiMapHandler();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, C55244a> f104805b = EmojiMapManager.m214278b();

    private EmojiMapHandler() {
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m162996d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return EmojiMapManager.f136337c.mo188270b(str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m162994b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C55244a aVar = f104805b.get(str);
        if (aVar != null) {
            return aVar.mo188256a();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final Bitmap m162995c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Bitmap b = EmojiMapManager.f136337c.mo188269b(str, false);
        if (b == null) {
            EmojiMapManager.f136337c.mo188274d(str, false);
        }
        return b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m162993a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return '[' + EmojiMapManager.f136337c.mo188263a(str, false) + ']';
    }
}
