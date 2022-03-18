package com.ss.android.lark.feed.service.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/feed/service/impl/FeedCursor;", "", "rankTime", "", "feedId", "(JJ)V", "getFeedId", "()J", "getRankTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.service.impl.d */
public final class FeedCursor {

    /* renamed from: a */
    public static final FeedCursor f97762a = new FeedCursor(Long.MAX_VALUE, 0);

    /* renamed from: b */
    public static final FeedCursor f97763b = new FeedCursor(0, 0);

    /* renamed from: c */
    public static final Companion f97764c = new Companion(null);

    /* renamed from: d */
    private final long f97765d;

    /* renamed from: e */
    private final long f97766e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedCursor)) {
            return false;
        }
        FeedCursor dVar = (FeedCursor) obj;
        return this.f97765d == dVar.f97765d && this.f97766e == dVar.f97766e;
    }

    public int hashCode() {
        long j = this.f97765d;
        long j2 = this.f97766e;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "FeedCursor(rankTime=" + this.f97765d + ", feedId=" + this.f97766e + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/feed/service/impl/FeedCursor$Companion;", "", "()V", "INVALID_CURSOR", "", "MAX_CURSOR", "Lcom/ss/android/lark/feed/service/impl/FeedCursor;", "getMAX_CURSOR", "()Lcom/ss/android/lark/feed/service/impl/FeedCursor;", "MIN_CURSOR", "getMIN_CURSOR", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.service.impl.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final FeedCursor mo139471a() {
            return FeedCursor.f97762a;
        }

        /* renamed from: b */
        public final FeedCursor mo139472b() {
            return FeedCursor.f97763b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final long mo139466a() {
        return this.f97765d;
    }

    /* renamed from: b */
    public final long mo139467b() {
        return this.f97766e;
    }

    public FeedCursor(long j, long j2) {
        this.f97765d = j;
        this.f97766e = j2;
    }
}
