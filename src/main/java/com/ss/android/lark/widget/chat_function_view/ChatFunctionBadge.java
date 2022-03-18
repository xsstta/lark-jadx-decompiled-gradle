package com.ss.android.lark.widget.chat_function_view;

import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge;", "", "()V", "badgeCount", "", "getBadgeCount", "()I", "setBadgeCount", "(I)V", "badgeDrawableRes", "getBadgeDrawableRes", "setBadgeDrawableRes", "badgePriority", "getBadgePriority", "setBadgePriority", "showBadge", "", "getShowBadge", "()Z", "setShowBadge", "(Z)V", "Companion", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.chat_function_view.a */
public final class ChatFunctionBadge {

    /* renamed from: a */
    public static final Companion f143604a = new Companion(null);

    /* renamed from: b */
    private int f143605b = R.drawable.ic_svg_badge;

    /* renamed from: c */
    private boolean f143606c;

    /* renamed from: d */
    private int f143607d;

    /* renamed from: e */
    private int f143608e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionBadge$Companion;", "", "()V", "PRIORITY_HEIGHT", "", "PRIORITY_LOW", "PRIORITY_NORMAL", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.chat_function_view.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo197611a() {
        return this.f143605b;
    }

    /* renamed from: c */
    public final int mo197616c() {
        return this.f143607d;
    }

    /* renamed from: d */
    public final int mo197617d() {
        return this.f143608e;
    }

    /* renamed from: b */
    public final boolean mo197615b() {
        return this.f143606c;
    }

    /* renamed from: b */
    public final void mo197614b(int i) {
        this.f143608e = i;
    }

    /* renamed from: a */
    public final void mo197612a(int i) {
        this.f143605b = i;
    }

    /* renamed from: a */
    public final void mo197613a(boolean z) {
        this.f143606c = z;
    }
}
