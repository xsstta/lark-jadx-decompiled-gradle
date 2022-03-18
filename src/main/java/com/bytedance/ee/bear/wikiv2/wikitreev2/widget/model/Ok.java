package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Ok;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Result;", "action", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;)V", "addToken", "", "getAddToken", "()Ljava/lang/String;", "setAddToken", "(Ljava/lang/String;)V", "getData", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiUIList;", "delParentToken", "getDelParentToken", "setDelParentToken", "destSpaceId", "getDestSpaceId", "setDestSpaceId", "focusToken", "getFocusToken", "setFocusToken", "loadToken", "getLoadToken", "setLoadToken", "movToken", "getMovToken", "setMovToken", "shortcutToken", "getShortcutToken", "setShortcutToken", "udeToken", "getUdeToken", "setUdeToken", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.d */
public final class Ok extends Result {

    /* renamed from: b */
    private String f33427b = "";

    /* renamed from: c */
    private String f33428c = "";

    /* renamed from: d */
    private String f33429d = "";

    /* renamed from: e */
    private String f33430e = "";

    /* renamed from: f */
    private String f33431f = "";

    /* renamed from: g */
    private String f33432g = "";

    /* renamed from: h */
    private String f33433h = "";

    /* renamed from: i */
    private String f33434i = "";

    /* renamed from: j */
    private final WikiUIList f33435j;

    /* renamed from: a */
    public final String mo47487a() {
        return this.f33427b;
    }

    /* renamed from: b */
    public final String mo47489b() {
        return this.f33428c;
    }

    /* renamed from: c */
    public final String mo47491c() {
        return this.f33429d;
    }

    /* renamed from: d */
    public final String mo47493d() {
        return this.f33430e;
    }

    /* renamed from: e */
    public final String mo47495e() {
        return this.f33431f;
    }

    /* renamed from: f */
    public final String mo47497f() {
        return this.f33432g;
    }

    /* renamed from: g */
    public final String mo47499g() {
        return this.f33433h;
    }

    /* renamed from: h */
    public final String mo47501h() {
        return this.f33434i;
    }

    /* renamed from: i */
    public final WikiUIList mo47503i() {
        return this.f33435j;
    }

    /* renamed from: a */
    public final void mo47488a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33427b = str;
    }

    /* renamed from: b */
    public final void mo47490b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33428c = str;
    }

    /* renamed from: c */
    public final void mo47492c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33429d = str;
    }

    /* renamed from: d */
    public final void mo47494d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33430e = str;
    }

    /* renamed from: e */
    public final void mo47496e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33431f = str;
    }

    /* renamed from: f */
    public final void mo47498f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33432g = str;
    }

    /* renamed from: g */
    public final void mo47500g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33433h = str;
    }

    /* renamed from: h */
    public final void mo47502h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f33434i = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Ok(WikiAction wikiAction, WikiUIList kVar) {
        super(wikiAction, null);
        Intrinsics.checkParameterIsNotNull(wikiAction, "action");
        this.f33435j = kVar;
    }
}
