package com.ss.android.lark.chat.api.service.track.sample;

import androidx.collection.C0517d;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleRecordCache;", "", "tag", "", "(Ljava/lang/String;)V", "mCache", "Landroidx/collection/LruCache;", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleRecordCache$MsgSampleRecord;", "mLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "getTag", "()Ljava/lang/String;", "clear", "", "get", "messageId", "update", "chatId", "Companion", "MsgSampleRecord", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.track.sample.b */
public final class MsgSampleRecordCache {

    /* renamed from: a */
    public static final Companion f84551a = new Companion(null);

    /* renamed from: b */
    private final ReentrantReadWriteLock f84552b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private final C0517d<String, MsgSampleRecord> f84553c = new C0517d<>(1024);

    /* renamed from: d */
    private final String f84554d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleRecordCache$Companion;", "", "()V", "MAX_CACHE_SIZE", "", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleRecordCache$MsgSampleRecord;", "", "messageId", "", "chatId", "lastReportTime", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getLastReportTime", "()J", "setLastReportTime", "(J)V", "getMessageId", "setMessageId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.api.service.track.sample.b$b */
    public static final class MsgSampleRecord {

        /* renamed from: a */
        private String f84555a;

        /* renamed from: b */
        private String f84556b;

        /* renamed from: c */
        private long f84557c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MsgSampleRecord)) {
                return false;
            }
            MsgSampleRecord bVar = (MsgSampleRecord) obj;
            return Intrinsics.areEqual(this.f84555a, bVar.f84555a) && Intrinsics.areEqual(this.f84556b, bVar.f84556b) && this.f84557c == bVar.f84557c;
        }

        public int hashCode() {
            String str = this.f84555a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f84556b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode + i) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f84557c);
        }

        /* renamed from: a */
        public final long mo121490a() {
            return this.f84557c;
        }

        public String toString() {
            return "MsgSampleRecord(messageId='" + this.f84555a + "', chatId='" + this.f84556b + "', lastReportTime=" + this.f84557c + ')';
        }

        /* renamed from: a */
        public final void mo121491a(long j) {
            this.f84557c = j;
        }

        /* renamed from: b */
        public final void mo121493b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f84556b = str;
        }

        /* renamed from: a */
        public final void mo121492a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f84555a = str;
        }

        public MsgSampleRecord(String str, String str2, long j) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            this.f84555a = str;
            this.f84556b = str2;
            this.f84557c = j;
        }
    }

    public MsgSampleRecordCache(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        this.f84554d = str;
    }

    /* renamed from: a */
    public final MsgSampleRecord mo121488a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        try {
            this.f84552b.readLock().lock();
            return this.f84553c.mo2974a(str);
        } finally {
            this.f84552b.readLock().unlock();
        }
    }

    /* renamed from: a */
    public final void mo121489a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        try {
            this.f84552b.writeLock().lock();
            MsgSampleRecord a = this.f84553c.mo2974a(str);
            if (a == null) {
                this.f84553c.mo2975a(str, new MsgSampleRecord(str, str2, System.currentTimeMillis()));
            } else {
                a.mo121492a(str);
                a.mo121493b(str2);
                a.mo121491a(System.currentTimeMillis());
            }
        } finally {
            this.f84552b.writeLock().unlock();
        }
    }
}
