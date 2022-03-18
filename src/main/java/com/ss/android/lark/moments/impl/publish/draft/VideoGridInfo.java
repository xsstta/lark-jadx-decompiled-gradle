package com.ss.android.lark.moments.impl.publish.draft;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003JI\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0006HÖ\u0001J\u0006\u00105\u001a\u00020\u0003R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00066"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "Ljava/io/Serializable;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/publish/draft/VideoData;", "(Lcom/ss/android/lark/moments/impl/publish/draft/VideoData;)V", "coverPath", "", "cover", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "fileToken", "videoInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "frameInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "photo", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "(Ljava/lang/String;Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;Ljava/lang/String;Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;Lcom/ss/android/lark/widget/photo_picker/entity/Photo;)V", "getCover", "()Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "setCover", "(Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;)V", "getCoverPath", "()Ljava/lang/String;", "setCoverPath", "(Ljava/lang/String;)V", "getFileToken", "setFileToken", "getFrameInfo", "()Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "setFrameInfo", "(Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;)V", "getPhoto", "()Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "setPhoto", "(Lcom/ss/android/lark/widget/photo_picker/entity/Photo;)V", "getVideoInfo", "()Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "setVideoInfo", "(Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "toVideoData", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoGridInfo implements Serializable {
    private IPhotoDependency.Image cover;
    private String coverPath;
    private String fileToken;
    private IPhotoDependency.FrameInfo frameInfo;
    private Photo photo;
    private IPhotoDependency.VideoInfo videoInfo;

    public static /* synthetic */ VideoGridInfo copy$default(VideoGridInfo videoGridInfo, String str, IPhotoDependency.Image image, String str2, IPhotoDependency.VideoInfo videoInfo2, IPhotoDependency.FrameInfo frameInfo2, Photo photo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoGridInfo.coverPath;
        }
        if ((i & 2) != 0) {
            image = videoGridInfo.cover;
        }
        if ((i & 4) != 0) {
            str2 = videoGridInfo.fileToken;
        }
        if ((i & 8) != 0) {
            videoInfo2 = videoGridInfo.videoInfo;
        }
        if ((i & 16) != 0) {
            frameInfo2 = videoGridInfo.frameInfo;
        }
        if ((i & 32) != 0) {
            photo2 = videoGridInfo.photo;
        }
        return videoGridInfo.copy(str, image, str2, videoInfo2, frameInfo2, photo2);
    }

    public final String component1() {
        return this.coverPath;
    }

    public final IPhotoDependency.Image component2() {
        return this.cover;
    }

    public final String component3() {
        return this.fileToken;
    }

    public final IPhotoDependency.VideoInfo component4() {
        return this.videoInfo;
    }

    public final IPhotoDependency.FrameInfo component5() {
        return this.frameInfo;
    }

    public final Photo component6() {
        return this.photo;
    }

    public final VideoGridInfo copy(String str, IPhotoDependency.Image image, String str2, IPhotoDependency.VideoInfo videoInfo2, IPhotoDependency.FrameInfo frameInfo2, Photo photo2) {
        Intrinsics.checkParameterIsNotNull(str, "coverPath");
        Intrinsics.checkParameterIsNotNull(videoInfo2, "videoInfo");
        Intrinsics.checkParameterIsNotNull(frameInfo2, "frameInfo");
        Intrinsics.checkParameterIsNotNull(photo2, "photo");
        return new VideoGridInfo(str, image, str2, videoInfo2, frameInfo2, photo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGridInfo)) {
            return false;
        }
        VideoGridInfo videoGridInfo = (VideoGridInfo) obj;
        return Intrinsics.areEqual(this.coverPath, videoGridInfo.coverPath) && Intrinsics.areEqual(this.cover, videoGridInfo.cover) && Intrinsics.areEqual(this.fileToken, videoGridInfo.fileToken) && Intrinsics.areEqual(this.videoInfo, videoGridInfo.videoInfo) && Intrinsics.areEqual(this.frameInfo, videoGridInfo.frameInfo) && Intrinsics.areEqual(this.photo, videoGridInfo.photo);
    }

    public int hashCode() {
        String str = this.coverPath;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        IPhotoDependency.Image image = this.cover;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        String str2 = this.fileToken;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        IPhotoDependency.VideoInfo videoInfo2 = this.videoInfo;
        int hashCode4 = (hashCode3 + (videoInfo2 != null ? videoInfo2.hashCode() : 0)) * 31;
        IPhotoDependency.FrameInfo frameInfo2 = this.frameInfo;
        int hashCode5 = (hashCode4 + (frameInfo2 != null ? frameInfo2.hashCode() : 0)) * 31;
        Photo photo2 = this.photo;
        if (photo2 != null) {
            i = photo2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "VideoGridInfo(coverPath=" + this.coverPath + ", cover=" + this.cover + ", fileToken=" + this.fileToken + ", videoInfo=" + this.videoInfo + ", frameInfo=" + this.frameInfo + ", photo=" + this.photo + ")";
    }

    public final IPhotoDependency.Image getCover() {
        return this.cover;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getFileToken() {
        return this.fileToken;
    }

    public final IPhotoDependency.FrameInfo getFrameInfo() {
        return this.frameInfo;
    }

    public final Photo getPhoto() {
        return this.photo;
    }

    public final IPhotoDependency.VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final VideoData toVideoData() {
        List<String> list;
        Integer num;
        Integer num2;
        String str;
        String str2 = this.coverPath;
        IPhotoDependency.Image image = this.cover;
        if (image != null) {
            list = image.getUrls();
        } else {
            list = null;
        }
        IPhotoDependency.Image image2 = this.cover;
        if (image2 != null) {
            num = Integer.valueOf(image2.getWidth());
        } else {
            num = null;
        }
        IPhotoDependency.Image image3 = this.cover;
        if (image3 != null) {
            num2 = Integer.valueOf(image3.getHeight());
        } else {
            num2 = null;
        }
        IPhotoDependency.Image image4 = this.cover;
        if (image4 != null) {
            str = image4.getToken();
        } else {
            str = null;
        }
        return new VideoData(str2, list, num, num2, str, this.fileToken, this.videoInfo.getPath(), this.videoInfo.getCompressPath(), this.videoInfo.getMimeType(), this.videoInfo.getSize(), this.videoInfo.getDuration(), this.frameInfo.getPath(), this.frameInfo.getWidth(), this.frameInfo.getHeight(), this.photo);
    }

    public final void setCover(IPhotoDependency.Image image) {
        this.cover = image;
    }

    public final void setFileToken(String str) {
        this.fileToken = str;
    }

    public final void setCoverPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.coverPath = str;
    }

    public final void setFrameInfo(IPhotoDependency.FrameInfo frameInfo2) {
        Intrinsics.checkParameterIsNotNull(frameInfo2, "<set-?>");
        this.frameInfo = frameInfo2;
    }

    public final void setPhoto(Photo photo2) {
        Intrinsics.checkParameterIsNotNull(photo2, "<set-?>");
        this.photo = photo2;
    }

    public final void setVideoInfo(IPhotoDependency.VideoInfo videoInfo2) {
        Intrinsics.checkParameterIsNotNull(videoInfo2, "<set-?>");
        this.videoInfo = videoInfo2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoGridInfo(com.ss.android.lark.moments.impl.publish.draft.VideoData r14) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.publish.draft.VideoGridInfo.<init>(com.ss.android.lark.moments.impl.publish.draft.VideoData):void");
    }

    public VideoGridInfo(String str, IPhotoDependency.Image image, String str2, IPhotoDependency.VideoInfo videoInfo2, IPhotoDependency.FrameInfo frameInfo2, Photo photo2) {
        Intrinsics.checkParameterIsNotNull(str, "coverPath");
        Intrinsics.checkParameterIsNotNull(videoInfo2, "videoInfo");
        Intrinsics.checkParameterIsNotNull(frameInfo2, "frameInfo");
        Intrinsics.checkParameterIsNotNull(photo2, "photo");
        this.coverPath = str;
        this.cover = image;
        this.fileToken = str2;
        this.videoInfo = videoInfo2;
        this.frameInfo = frameInfo2;
        this.photo = photo2;
    }
}
