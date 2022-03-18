package com.ss.android.lark.mm.module.podcast;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "Ljava/io/Serializable;", "url", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmPodcastLinkInfo implements Serializable {
    private String title;
    private final String url;

    public static /* synthetic */ MmPodcastLinkInfo copy$default(MmPodcastLinkInfo mmPodcastLinkInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mmPodcastLinkInfo.url;
        }
        if ((i & 2) != 0) {
            str2 = mmPodcastLinkInfo.title;
        }
        return mmPodcastLinkInfo.copy(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final MmPodcastLinkInfo copy(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        return new MmPodcastLinkInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmPodcastLinkInfo)) {
            return false;
        }
        MmPodcastLinkInfo mmPodcastLinkInfo = (MmPodcastLinkInfo) obj;
        return Intrinsics.areEqual(this.url, mmPodcastLinkInfo.url) && Intrinsics.areEqual(this.title, mmPodcastLinkInfo.title);
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "MmPodcastLinkInfo(url=" + this.url + ", title=" + this.title + ")";
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.title = str;
    }

    public MmPodcastLinkInfo(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        this.url = str;
        this.title = str2;
    }
}
