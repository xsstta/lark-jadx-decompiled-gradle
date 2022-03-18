package com.bytedance.ee.bear.middleground.comment.card;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\b\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\b\u0010\u001b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/AnimatorUtils;", "", "()V", "NO_SET", "", "cardIsShowing", "", "cardIsShowing$annotations", "getCardIsShowing", "()Z", "setCardIsShowing", "(Z)V", "enterHeight", "exitHeight", "newCommentCardFg", "newCommentCardFg$annotations", "getNewCommentCardFg", "setNewCommentCardFg", "commentSetTitleBarTran", "enterNotSet", "exitNotSet", "getEnterHeight", "getExitHeight", "setEnterHeight", "", "height", "setExitHeight", "toCommentAndCloseFeedNow", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.card.a */
public final class AnimatorUtils {

    /* renamed from: a */
    public static final AnimatorUtils f24486a = new AnimatorUtils();

    /* renamed from: b */
    private static int f24487b;

    /* renamed from: c */
    private static int f24488c;

    /* renamed from: d */
    private static boolean f24489d;

    /* renamed from: e */
    private static boolean f24490e;

    private AnimatorUtils() {
    }

    @JvmStatic
    /* renamed from: f */
    public static final boolean m37828f() {
        return f24489d;
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m37822b() {
        int i = f24487b;
        f24487b = 0;
        return i;
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m37825c() {
        if (f24487b == 0) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: d */
    public static final int m37826d() {
        int i = f24488c;
        f24488c = 0;
        return i;
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m37827e() {
        if (f24488c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m37821a() {
        return f24489d;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m37819a(int i) {
        f24487b = i;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m37823b(int i) {
        f24488c = i;
    }

    /* renamed from: a */
    public static final void m37820a(boolean z) {
        f24489d = z;
    }

    /* renamed from: b */
    public static final void m37824b(boolean z) {
        f24490e = z;
    }
}
