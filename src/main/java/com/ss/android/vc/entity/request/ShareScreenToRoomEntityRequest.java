package com.ss.android.vc.entity.request;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003!\"#B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest;", "", "()V", "docUrl", "", "getDocUrl", "()Ljava/lang/String;", "setDocUrl", "(Ljava/lang/String;)V", "joinPath", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;", "getJoinPath", "()Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;", "setJoinPath", "(Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;)V", "magicShareInfo", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$MagicShareInfo;", "getMagicShareInfo", "()Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$MagicShareInfo;", "setMagicShareInfo", "(Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$MagicShareInfo;)V", "meetingId", "getMeetingId", "setMeetingId", "shareCodeOrMeetingNumber", "getShareCodeOrMeetingNumber", "setShareCodeOrMeetingNumber", "shareType", "Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "getShareType", "()Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "setShareType", "(Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;)V", "JoinPath", "MagicShareInfo", "ShareType", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareScreenToRoomEntityRequest {

    /* renamed from: a */
    private ShareType f152565a;

    /* renamed from: b */
    private String f152566b;

    /* renamed from: c */
    private MagicShareInfo f152567c;

    /* renamed from: d */
    private String f152568d;

    /* renamed from: e */
    private JoinPath f152569e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$JoinPath;", "", "(Ljava/lang/String;I)V", "JOIN_BY_SHARE_CODE", "JOIN_BY_MEETING_NUMBER", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum JoinPath {
        JOIN_BY_SHARE_CODE,
        JOIN_BY_MEETING_NUMBER
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$ShareType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "SCREEN", "MAGIC_SHARE", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ShareType {
        UNKNOWN(0),
        SCREEN(1),
        MAGIC_SHARE(2);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private ShareType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/entity/request/ShareScreenToRoomEntityRequest$MagicShareInfo;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.entity.request.ShareScreenToRoomEntityRequest$a */
    public static final class MagicShareInfo {

        /* renamed from: a */
        private final String f152570a;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MagicShareInfo) && Intrinsics.areEqual(this.f152570a, ((MagicShareInfo) obj).f152570a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.f152570a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "MagicShareInfo(url=" + this.f152570a + ")";
        }

        /* renamed from: a */
        public final String mo210058a() {
            return this.f152570a;
        }

        public MagicShareInfo(String str) {
            this.f152570a = str;
        }
    }

    /* renamed from: a */
    public final ShareType mo210047a() {
        return this.f152565a;
    }

    /* renamed from: b */
    public final String mo210052b() {
        return this.f152566b;
    }

    /* renamed from: c */
    public final MagicShareInfo mo210054c() {
        return this.f152567c;
    }

    /* renamed from: d */
    public final String mo210055d() {
        return this.f152568d;
    }

    /* renamed from: e */
    public final JoinPath mo210056e() {
        return this.f152569e;
    }

    /* renamed from: a */
    public final void mo210048a(JoinPath joinPath) {
        this.f152569e = joinPath;
    }

    /* renamed from: b */
    public final void mo210053b(String str) {
        this.f152568d = str;
    }

    /* renamed from: a */
    public final void mo210049a(ShareType shareType) {
        this.f152565a = shareType;
    }

    /* renamed from: a */
    public final void mo210050a(MagicShareInfo aVar) {
        this.f152567c = aVar;
    }

    /* renamed from: a */
    public final void mo210051a(String str) {
        this.f152566b = str;
    }
}
