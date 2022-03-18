package com.ss.android.lark.mm.module.detail.baseinfo;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/MediaType;", "", "mediaType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMediaType", "()Ljava/lang/String;", "Audio", "Video", "Unknown", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum MediaType {
    Audio("audio"),
    Video("video"),
    Unknown("");
    
    public static final Companion Companion = new Companion(null);
    private final String mediaType;

    @JvmStatic
    public static final MediaType fromValue(String str) {
        return Companion.mo161472a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/MediaType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MediaType;", "mediaType", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.MediaType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final MediaType mo161472a(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 93166550) {
                    if (hashCode == 112202875 && str.equals("video")) {
                        return MediaType.Video;
                    }
                } else if (str.equals("audio")) {
                    return MediaType.Audio;
                }
            }
            return MediaType.Unknown;
        }
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    private MediaType(String str) {
        this.mediaType = str;
    }
}
