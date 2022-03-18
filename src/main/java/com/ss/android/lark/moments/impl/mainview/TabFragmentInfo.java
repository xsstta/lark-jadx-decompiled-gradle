package com.ss.android.lark.moments.impl.mainview;

import com.ss.android.lark.moments.impl.feed.MomentsFeedFragment;
import com.ss.android.lark.moments.impl.feed.TitleApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/TabFragmentInfo;", "", "id", "", "title", "order", "", "titleApi", "Lcom/ss/android/lark/moments/impl/feed/TitleApi;", "outPageApi", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;", "tabFeedApi", "Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OnDisableTabListener;", "from", "hashTagContent", "topRound", "", "(Ljava/lang/String;Ljava/lang/String;ILcom/ss/android/lark/moments/impl/feed/TitleApi;Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OnDisableTabListener;Ljava/lang/String;Ljava/lang/String;Z)V", "getFrom", "()Ljava/lang/String;", "getHashTagContent", "getId", "getOrder", "()I", "getOutPageApi", "()Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OutPageApi;", "getTabFeedApi", "()Lcom/ss/android/lark/moments/impl/feed/MomentsFeedFragment$OnDisableTabListener;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getTitleApi", "()Lcom/ss/android/lark/moments/impl/feed/TitleApi;", "getTopRound", "()Z", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.h */
public final class TabFragmentInfo {

    /* renamed from: a */
    private final String f120302a;

    /* renamed from: b */
    private String f120303b;

    /* renamed from: c */
    private final int f120304c;

    /* renamed from: d */
    private final TitleApi f120305d;

    /* renamed from: e */
    private final MomentsFeedFragment.OutPageApi f120306e;

    /* renamed from: f */
    private final MomentsFeedFragment.OnDisableTabListener f120307f;

    /* renamed from: g */
    private final String f120308g;

    /* renamed from: h */
    private final String f120309h;

    /* renamed from: i */
    private final boolean f120310i;

    /* renamed from: a */
    public final String mo167434a() {
        return this.f120302a;
    }

    /* renamed from: b */
    public final String mo167436b() {
        return this.f120303b;
    }

    /* renamed from: c */
    public final int mo167437c() {
        return this.f120304c;
    }

    /* renamed from: d */
    public final TitleApi mo167438d() {
        return this.f120305d;
    }

    /* renamed from: e */
    public final MomentsFeedFragment.OutPageApi mo167439e() {
        return this.f120306e;
    }

    /* renamed from: f */
    public final MomentsFeedFragment.OnDisableTabListener mo167440f() {
        return this.f120307f;
    }

    /* renamed from: g */
    public final String mo167441g() {
        return this.f120308g;
    }

    /* renamed from: h */
    public final String mo167442h() {
        return this.f120309h;
    }

    /* renamed from: i */
    public final boolean mo167443i() {
        return this.f120310i;
    }

    /* renamed from: a */
    public final void mo167435a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f120303b = str;
    }

    public TabFragmentInfo(String str, String str2, int i, TitleApi fVar, MomentsFeedFragment.OutPageApi cVar, MomentsFeedFragment.OnDisableTabListener bVar, String str3, String str4, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        Intrinsics.checkParameterIsNotNull(str3, "from");
        Intrinsics.checkParameterIsNotNull(str4, "hashTagContent");
        this.f120302a = str;
        this.f120303b = str2;
        this.f120304c = i;
        this.f120305d = fVar;
        this.f120306e = cVar;
        this.f120307f = bVar;
        this.f120308g = str3;
        this.f120309h = str4;
        this.f120310i = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TabFragmentInfo(java.lang.String r13, java.lang.String r14, int r15, com.ss.android.lark.moments.impl.feed.TitleApi r16, com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.OutPageApi r17, com.ss.android.lark.moments.impl.feed.MomentsFeedFragment.OnDisableTabListener r18, java.lang.String r19, java.lang.String r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r10 = r1
            goto L_0x000c
        L_0x000a:
            r10 = r20
        L_0x000c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0013
            r0 = 0
            r11 = 0
            goto L_0x0015
        L_0x0013:
            r11 = r21
        L_0x0015:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.mainview.TabFragmentInfo.<init>(java.lang.String, java.lang.String, int, com.ss.android.lark.moments.impl.feed.f, com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$c, com.ss.android.lark.moments.impl.feed.MomentsFeedFragment$b, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
