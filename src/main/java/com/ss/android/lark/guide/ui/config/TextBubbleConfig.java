package com.ss.android.lark.guide.ui.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/guide/ui/config/TextBubbleConfig;", "Lcom/ss/android/lark/guide/ui/config/BubbleConfig;", "anchorConfig", "Lcom/ss/android/lark/guide/ui/config/AnchorConfig;", "maskConfig", "Lcom/ss/android/lark/guide/ui/config/MaskConfig;", "title", "", "detail", "(Lcom/ss/android/lark/guide/ui/config/AnchorConfig;Lcom/ss/android/lark/guide/ui/config/MaskConfig;Ljava/lang/String;Ljava/lang/String;)V", "getAnchorConfig", "()Lcom/ss/android/lark/guide/ui/config/AnchorConfig;", "getDetail", "()Ljava/lang/String;", "getMaskConfig", "()Lcom/ss/android/lark/guide/ui/config/MaskConfig;", "getTitle", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.config.k */
public final class TextBubbleConfig extends BubbleConfig {

    /* renamed from: a */
    private final AnchorConfig f99534a;

    /* renamed from: b */
    private final MaskConfig f99535b;

    /* renamed from: c */
    private final String f99536c;

    /* renamed from: d */
    private final String f99537d;

    /* renamed from: d */
    public final AnchorConfig mo141783d() {
        return this.f99534a;
    }

    /* renamed from: e */
    public final MaskConfig mo141784e() {
        return this.f99535b;
    }

    /* renamed from: f */
    public final String mo141785f() {
        return this.f99536c;
    }

    /* renamed from: g */
    public final String mo141786g() {
        return this.f99537d;
    }

    public TextBubbleConfig(AnchorConfig anchorConfig, MaskConfig maskConfig, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(anchorConfig, "anchorConfig");
        Intrinsics.checkParameterIsNotNull(str2, "detail");
        this.f99534a = anchorConfig;
        this.f99535b = maskConfig;
        this.f99536c = str;
        this.f99537d = str2;
    }
}
