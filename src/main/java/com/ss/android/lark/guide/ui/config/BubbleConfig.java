package com.ss.android.lark.guide.ui.config;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/BubbleConfig;", "", "()V", "bubbleListener", "Lcom/ss/android/lark/guide/ui/config/BubbleListener;", "getBubbleListener", "()Lcom/ss/android/lark/guide/ui/config/BubbleListener;", "setBubbleListener", "(Lcom/ss/android/lark/guide/ui/config/BubbleListener;)V", "focusable", "", "getFocusable", "()Ljava/lang/Boolean;", "setFocusable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "outsideDismiss", "getOutsideDismiss", "setOutsideDismiss", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.config.a */
public abstract class BubbleConfig {

    /* renamed from: a */
    private Boolean f99510a;

    /* renamed from: b */
    private Boolean f99511b;

    /* renamed from: c */
    private BubbleListener f99512c;

    /* renamed from: a */
    public final Boolean mo141755a() {
        return this.f99510a;
    }

    /* renamed from: b */
    public final Boolean mo141758b() {
        return this.f99511b;
    }

    /* renamed from: c */
    public final BubbleListener mo141760c() {
        return this.f99512c;
    }

    /* renamed from: a */
    public final void mo141756a(BubbleListener bVar) {
        this.f99512c = bVar;
    }

    /* renamed from: b */
    public final void mo141759b(Boolean bool) {
        this.f99511b = bool;
    }

    /* renamed from: a */
    public final void mo141757a(Boolean bool) {
        this.f99510a = bool;
    }
}
