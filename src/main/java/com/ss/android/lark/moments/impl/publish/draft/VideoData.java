package com.ss.android.lark.moments.impl.publish.draft;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\t\u0010F\u001a\u00020\u0004HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010O\u001a\u00020\u0004HÆ\u0003J\t\u0010P\u001a\u00020\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\u0004HÆ\u0003J¶\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020\bHÖ\u0001J\t\u0010Y\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001a\u0010\u0014\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001a\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001a\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<¨\u0006Z"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/draft/VideoData;", "Ljava/io/Serializable;", "()V", "coverPath", "", "coverUrls", "", "coverWidth", "", "coverHeight", "coverToken", "fileToken", "videoPath", "videoCompressPath", "videoMimeType", "videoSize", "", "videoDuration", "framePath", "frameWidth", "frameHeight", "photo", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;IILcom/ss/android/lark/widget/photo_picker/entity/Photo;)V", "getCoverHeight", "()Ljava/lang/Integer;", "setCoverHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCoverPath", "()Ljava/lang/String;", "setCoverPath", "(Ljava/lang/String;)V", "getCoverToken", "setCoverToken", "getCoverUrls", "()Ljava/util/List;", "setCoverUrls", "(Ljava/util/List;)V", "getCoverWidth", "setCoverWidth", "getFileToken", "setFileToken", "getFrameHeight", "()I", "setFrameHeight", "(I)V", "getFramePath", "setFramePath", "getFrameWidth", "setFrameWidth", "getPhoto", "()Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "setPhoto", "(Lcom/ss/android/lark/widget/photo_picker/entity/Photo;)V", "getVideoCompressPath", "setVideoCompressPath", "getVideoDuration", "()J", "setVideoDuration", "(J)V", "getVideoMimeType", "setVideoMimeType", "getVideoPath", "setVideoPath", "getVideoSize", "setVideoSize", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;IILcom/ss/android/lark/widget/photo_picker/entity/Photo;)Lcom/ss/android/lark/moments/impl/publish/draft/VideoData;", "equals", "", "other", "", "hashCode", "toString", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoData implements Serializable {
    private Integer coverHeight;
    private String coverPath;
    private String coverToken;
    private List<String> coverUrls;
    private Integer coverWidth;
    private String fileToken;
    private int frameHeight;
    private String framePath;
    private int frameWidth;
    private Photo photo;
    private String videoCompressPath;
    private long videoDuration;
    private String videoMimeType;
    private String videoPath;
    private long videoSize;

    public static /* synthetic */ VideoData copy$default(VideoData videoData, String str, List list, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, int i, int i2, Photo photo2, int i3, Object obj) {
        return videoData.copy((i3 & 1) != 0 ? videoData.coverPath : str, (i3 & 2) != 0 ? videoData.coverUrls : list, (i3 & 4) != 0 ? videoData.coverWidth : num, (i3 & 8) != 0 ? videoData.coverHeight : num2, (i3 & 16) != 0 ? videoData.coverToken : str2, (i3 & 32) != 0 ? videoData.fileToken : str3, (i3 & 64) != 0 ? videoData.videoPath : str4, (i3 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? videoData.videoCompressPath : str5, (i3 & DynamicModule.f58006b) != 0 ? videoData.videoMimeType : str6, (i3 & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? videoData.videoSize : j, (i3 & 1024) != 0 ? videoData.videoDuration : j2, (i3 & 2048) != 0 ? videoData.framePath : str7, (i3 & 4096) != 0 ? videoData.frameWidth : i, (i3 & 8192) != 0 ? videoData.frameHeight : i2, (i3 & 16384) != 0 ? videoData.photo : photo2);
    }

    public final String component1() {
        return this.coverPath;
    }

    public final long component10() {
        return this.videoSize;
    }

    public final long component11() {
        return this.videoDuration;
    }

    public final String component12() {
        return this.framePath;
    }

    public final int component13() {
        return this.frameWidth;
    }

    public final int component14() {
        return this.frameHeight;
    }

    public final Photo component15() {
        return this.photo;
    }

    public final List<String> component2() {
        return this.coverUrls;
    }

    public final Integer component3() {
        return this.coverWidth;
    }

    public final Integer component4() {
        return this.coverHeight;
    }

    public final String component5() {
        return this.coverToken;
    }

    public final String component6() {
        return this.fileToken;
    }

    public final String component7() {
        return this.videoPath;
    }

    public final String component8() {
        return this.videoCompressPath;
    }

    public final String component9() {
        return this.videoMimeType;
    }

    public final VideoData copy(String str, List<String> list, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, int i, int i2, Photo photo2) {
        Intrinsics.checkParameterIsNotNull(str, "coverPath");
        Intrinsics.checkParameterIsNotNull(str4, "videoPath");
        Intrinsics.checkParameterIsNotNull(str5, "videoCompressPath");
        Intrinsics.checkParameterIsNotNull(str6, "videoMimeType");
        Intrinsics.checkParameterIsNotNull(str7, "framePath");
        return new VideoData(str, list, num, num2, str2, str3, str4, str5, str6, j, j2, str7, i, i2, photo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoData)) {
            return false;
        }
        VideoData videoData = (VideoData) obj;
        return Intrinsics.areEqual(this.coverPath, videoData.coverPath) && Intrinsics.areEqual(this.coverUrls, videoData.coverUrls) && Intrinsics.areEqual(this.coverWidth, videoData.coverWidth) && Intrinsics.areEqual(this.coverHeight, videoData.coverHeight) && Intrinsics.areEqual(this.coverToken, videoData.coverToken) && Intrinsics.areEqual(this.fileToken, videoData.fileToken) && Intrinsics.areEqual(this.videoPath, videoData.videoPath) && Intrinsics.areEqual(this.videoCompressPath, videoData.videoCompressPath) && Intrinsics.areEqual(this.videoMimeType, videoData.videoMimeType) && this.videoSize == videoData.videoSize && this.videoDuration == videoData.videoDuration && Intrinsics.areEqual(this.framePath, videoData.framePath) && this.frameWidth == videoData.frameWidth && this.frameHeight == videoData.frameHeight && Intrinsics.areEqual(this.photo, videoData.photo);
    }

    public int hashCode() {
        String str = this.coverPath;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.coverUrls;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.coverWidth;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.coverHeight;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.coverToken;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fileToken;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.videoPath;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.videoCompressPath;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.videoMimeType;
        int hashCode9 = (((((hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.videoSize)) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.videoDuration)) * 31;
        String str7 = this.framePath;
        int hashCode10 = (((((hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.frameWidth) * 31) + this.frameHeight) * 31;
        Photo photo2 = this.photo;
        if (photo2 != null) {
            i = photo2.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        return "VideoData(coverPath=" + this.coverPath + ", coverUrls=" + this.coverUrls + ", coverWidth=" + this.coverWidth + ", coverHeight=" + this.coverHeight + ", coverToken=" + this.coverToken + ", fileToken=" + this.fileToken + ", videoPath=" + this.videoPath + ", videoCompressPath=" + this.videoCompressPath + ", videoMimeType=" + this.videoMimeType + ", videoSize=" + this.videoSize + ", videoDuration=" + this.videoDuration + ", framePath=" + this.framePath + ", frameWidth=" + this.frameWidth + ", frameHeight=" + this.frameHeight + ", photo=" + this.photo + ")";
    }

    public final Integer getCoverHeight() {
        return this.coverHeight;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getCoverToken() {
        return this.coverToken;
    }

    public final List<String> getCoverUrls() {
        return this.coverUrls;
    }

    public final Integer getCoverWidth() {
        return this.coverWidth;
    }

    public final String getFileToken() {
        return this.fileToken;
    }

    public final int getFrameHeight() {
        return this.frameHeight;
    }

    public final String getFramePath() {
        return this.framePath;
    }

    public final int getFrameWidth() {
        return this.frameWidth;
    }

    public final Photo getPhoto() {
        return this.photo;
    }

    public final String getVideoCompressPath() {
        return this.videoCompressPath;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final String getVideoMimeType() {
        return this.videoMimeType;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final long getVideoSize() {
        return this.videoSize;
    }

    public VideoData() {
        this("", null, null, null, null, null, "", "", "", 0, 0, "", 0, 0, null);
    }

    public final void setCoverHeight(Integer num) {
        this.coverHeight = num;
    }

    public final void setCoverToken(String str) {
        this.coverToken = str;
    }

    public final void setCoverUrls(List<String> list) {
        this.coverUrls = list;
    }

    public final void setCoverWidth(Integer num) {
        this.coverWidth = num;
    }

    public final void setFileToken(String str) {
        this.fileToken = str;
    }

    public final void setFrameHeight(int i) {
        this.frameHeight = i;
    }

    public final void setFrameWidth(int i) {
        this.frameWidth = i;
    }

    public final void setPhoto(Photo photo2) {
        this.photo = photo2;
    }

    public final void setVideoDuration(long j) {
        this.videoDuration = j;
    }

    public final void setVideoSize(long j) {
        this.videoSize = j;
    }

    public final void setCoverPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.coverPath = str;
    }

    public final void setFramePath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.framePath = str;
    }

    public final void setVideoCompressPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.videoCompressPath = str;
    }

    public final void setVideoMimeType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.videoMimeType = str;
    }

    public final void setVideoPath(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.videoPath = str;
    }

    public VideoData(String str, List<String> list, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7, int i, int i2, Photo photo2) {
        Intrinsics.checkParameterIsNotNull(str, "coverPath");
        Intrinsics.checkParameterIsNotNull(str4, "videoPath");
        Intrinsics.checkParameterIsNotNull(str5, "videoCompressPath");
        Intrinsics.checkParameterIsNotNull(str6, "videoMimeType");
        Intrinsics.checkParameterIsNotNull(str7, "framePath");
        this.coverPath = str;
        this.coverUrls = list;
        this.coverWidth = num;
        this.coverHeight = num2;
        this.coverToken = str2;
        this.fileToken = str3;
        this.videoPath = str4;
        this.videoCompressPath = str5;
        this.videoMimeType = str6;
        this.videoSize = j;
        this.videoDuration = j2;
        this.framePath = str7;
        this.frameWidth = i;
        this.frameHeight = i2;
        this.photo = photo2;
    }
}
