package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.VideoChat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/vc/entity/response/PullVideoChatByShareCodeEntity;", "", "videoChat", "Lcom/ss/android/vc/entity/VideoChat;", "(Lcom/ss/android/vc/entity/VideoChat;)V", "getVideoChat", "()Lcom/ss/android/vc/entity/VideoChat;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.entity.response.aj */
public final class PullVideoChatByShareCodeEntity {

    /* renamed from: a */
    private final VideoChat f152648a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PullVideoChatByShareCodeEntity) && Intrinsics.areEqual(this.f152648a, ((PullVideoChatByShareCodeEntity) obj).f152648a);
        }
        return true;
    }

    public int hashCode() {
        VideoChat videoChat = this.f152648a;
        if (videoChat != null) {
            return videoChat.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PullVideoChatByShareCodeEntity(videoChat=" + this.f152648a + ")";
    }

    /* renamed from: a */
    public final VideoChat mo210112a() {
        return this.f152648a;
    }

    public PullVideoChatByShareCodeEntity(VideoChat videoChat) {
        this.f152648a = videoChat;
    }
}
