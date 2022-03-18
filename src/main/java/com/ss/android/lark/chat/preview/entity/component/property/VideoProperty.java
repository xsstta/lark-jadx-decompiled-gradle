package com.ss.android.lark.chat.preview.entity.component.property;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.tangram.base.props.Props;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "site", "Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty$Site;", "coverImage", "Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "duration", "", "srcUrl", "", "vid", "iframeUrl", "(Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty$Site;Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoverImage", "()Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "getDuration", "()J", "getIframeUrl", "()Ljava/lang/String;", "getSite", "()Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty$Site;", "getSrcUrl", "getVid", "clone", "Lcom/ss/android/lark/tangram/base/props/Props;", "equals", "", "other", "", "hashCode", "", "Site", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoProperty extends BaseProperty {
    private final ImageSet coverImage;
    private final long duration;
    private final String iframeUrl;
    private final Site site;
    private final String srcUrl;
    private final String vid;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty$Site;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "XIGUA", "DOUYIN", "HUOSHAN", "YOUTUBE", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Site {
        UNKNOWN(0),
        XIGUA(1),
        DOUYIN(2),
        HUOSHAN(3),
        YOUTUBE(4);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty$Site$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty$Site;", "value", "", "valueOf", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.preview.entity.component.property.VideoProperty$Site$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Site mo126534a(int i) {
                return m132486b(i);
            }

            /* renamed from: b */
            private final Site m132486b(int i) {
                if (i == 1) {
                    return Site.XIGUA;
                }
                if (i == 2) {
                    return Site.DOUYIN;
                }
                if (i == 3) {
                    return Site.HUOSHAN;
                }
                if (i != 4) {
                    return Site.UNKNOWN;
                }
                return Site.YOUTUBE;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private Site(int i) {
            this.value = i;
        }
    }

    public final ImageSet getCoverImage() {
        return this.coverImage;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getIframeUrl() {
        return this.iframeUrl;
    }

    public final Site getSite() {
        return this.site;
    }

    public final String getSrcUrl() {
        return this.srcUrl;
    }

    public final String getVid() {
        return this.vid;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public Props clone() {
        ImageSet imageSet;
        Site site2 = this.site;
        ImageSet imageSet2 = this.coverImage;
        if (imageSet2 != null) {
            imageSet = imageSet2.clone();
        } else {
            imageSet = null;
        }
        VideoProperty videoProperty = new VideoProperty(site2, imageSet, this.duration, this.srcUrl, this.vid, this.iframeUrl);
        videoProperty.setMarginLeft(getMarginLeft());
        videoProperty.setMarginRight(getMarginRight());
        videoProperty.setMarginTop(getMarginTop());
        videoProperty.setMarginBottom(getMarginBottom());
        return videoProperty;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int hashCode = ((super.hashCode() * 31) + this.site.hashCode()) * 31;
        ImageSet imageSet = this.coverImage;
        if (imageSet != null) {
            i = imageSet.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + Long.valueOf(this.duration).hashCode()) * 31) + this.srcUrl.hashCode()) * 31) + this.vid.hashCode()) * 31) + this.iframeUrl.hashCode();
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoProperty) || !super.equals(obj)) {
            return false;
        }
        VideoProperty videoProperty = (VideoProperty) obj;
        if (this.site == videoProperty.site && !(!Intrinsics.areEqual(this.coverImage, videoProperty.coverImage)) && this.duration == videoProperty.duration && !(!Intrinsics.areEqual(this.srcUrl, videoProperty.srcUrl)) && !(!Intrinsics.areEqual(this.vid, videoProperty.vid)) && !(!Intrinsics.areEqual(this.iframeUrl, videoProperty.iframeUrl))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoProperty(Site site2, ImageSet imageSet, long j, String str, String str2, String str3) {
        super(Type.VIDEO);
        Intrinsics.checkParameterIsNotNull(site2, "site");
        Intrinsics.checkParameterIsNotNull(str, "srcUrl");
        Intrinsics.checkParameterIsNotNull(str2, "vid");
        Intrinsics.checkParameterIsNotNull(str3, "iframeUrl");
        this.site = site2;
        this.coverImage = imageSet;
        this.duration = j;
        this.srcUrl = str;
        this.vid = str2;
        this.iframeUrl = str3;
    }
}
