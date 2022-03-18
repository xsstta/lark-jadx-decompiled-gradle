package com.ss.android.lark.chat.entity.message;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/PreviewVideo;", "Ljava/io/Serializable;", "site", "Lcom/ss/android/lark/chat/entity/message/PreviewVideo$Site;", "vid", "", "iFrameUrl", "(Lcom/ss/android/lark/chat/entity/message/PreviewVideo$Site;Ljava/lang/String;Ljava/lang/String;)V", "getIFrameUrl", "()Ljava/lang/String;", "getSite", "()Lcom/ss/android/lark/chat/entity/message/PreviewVideo$Site;", "getVid", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Site", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PreviewVideo implements Serializable {
    private final String iFrameUrl;
    private final Site site;
    private final String vid;

    public static /* synthetic */ PreviewVideo copy$default(PreviewVideo previewVideo, Site site2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            site2 = previewVideo.site;
        }
        if ((i & 2) != 0) {
            str = previewVideo.vid;
        }
        if ((i & 4) != 0) {
            str2 = previewVideo.iFrameUrl;
        }
        return previewVideo.copy(site2, str, str2);
    }

    public final Site component1() {
        return this.site;
    }

    public final String component2() {
        return this.vid;
    }

    public final String component3() {
        return this.iFrameUrl;
    }

    public final PreviewVideo copy(Site site2, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(site2, "site");
        return new PreviewVideo(site2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewVideo)) {
            return false;
        }
        PreviewVideo previewVideo = (PreviewVideo) obj;
        return Intrinsics.areEqual(this.site, previewVideo.site) && Intrinsics.areEqual(this.vid, previewVideo.vid) && Intrinsics.areEqual(this.iFrameUrl, previewVideo.iFrameUrl);
    }

    public int hashCode() {
        Site site2 = this.site;
        int i = 0;
        int hashCode = (site2 != null ? site2.hashCode() : 0) * 31;
        String str = this.vid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.iFrameUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PreviewVideo(site=" + this.site + ", vid=" + this.vid + ", iFrameUrl=" + this.iFrameUrl + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/PreviewVideo$Site;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "XIGUA", "DOUYIN", "HUOSHAN", "YOUTUBE", "IQIYI", "YOUKU", "QQ", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Site {
        UNKNOWN(0),
        XIGUA(1),
        DOUYIN(2),
        HUOSHAN(3),
        YOUTUBE(4),
        IQIYI(5),
        YOUKU(6),
        QQ(7);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private Site(int i) {
            this.value = i;
        }
    }

    public final String getIFrameUrl() {
        return this.iFrameUrl;
    }

    public final Site getSite() {
        return this.site;
    }

    public final String getVid() {
        return this.vid;
    }

    public PreviewVideo(Site site2, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(site2, "site");
        this.site = site2;
        this.vid = str;
        this.iFrameUrl = str2;
    }
}
