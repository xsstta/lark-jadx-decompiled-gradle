package com.ss.android.lark.keyboard.plugin.tool.photo;

import com.larksuite.framework.callback.AbstractC25974h;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import io.reactivex.Observable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003$%&J(\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H&J \u0010\u0013\u001a\u00020\u000e2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H&J(\u0010\u0018\u001a\u00020\u000e2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0015j\b\u0012\u0004\u0012\u00020\u0005`\u00172\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0016\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH&J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#H&¨\u0006'"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "", "extractVideoFrame", "Lio/reactivex/Observable;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "isEnablePostSendVideo", "", "isVideoEnabled", "openAlbum", "", "builder", "Lcom/ss/android/lark/widget/photo_picker/PhotoPicker$PhotoPickerBuilder;", "openImageReview", "Lcom/ss/android/lark/widget/photo_picker/PhotoPreviewPicker$PhotoPreviewPickerBuilder;", "sendFile", "fileList", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "sendImage", "photoPaths", "isKeepOriginPic", "sendVideo", "videoPaths", "", "uploadEncryptImage", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photos", "keepOrigin", "progressListener", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "FrameInfo", "Image", "VideoInfo", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IPhotoDependency {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency$a */
    public static final class C40977a {
        /* renamed from: a */
        public static boolean m162428a(IPhotoDependency iPhotoDependency) {
            return true;
        }
    }

    /* renamed from: a */
    Observable<Map<String, FrameInfo>> mo122036a(List<VideoInfo> list);

    /* renamed from: a */
    Observable<Image> mo122037a(List<String> list, boolean z, AbstractC25974h hVar);

    /* renamed from: a */
    void mo122038a(C58557a.C58559a aVar);

    /* renamed from: a */
    void mo122039a(C58633e.C58634a aVar);

    /* renamed from: a */
    void mo122040a(ArrayList<File> arrayList);

    /* renamed from: a */
    void mo122041a(ArrayList<String> arrayList, boolean z);

    /* renamed from: a */
    boolean mo122042a();

    /* renamed from: b */
    void mo122043b(List<VideoInfo> list);

    /* renamed from: b */
    boolean mo122044b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "Ljava/io/Serializable;", "path", "", "width", "", "height", "(Ljava/lang/String;II)V", "getHeight", "()I", "getPath", "()Ljava/lang/String;", "getWidth", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class FrameInfo implements Serializable {
        private final int height;
        private final String path;
        private final int width;

        public final int getHeight() {
            return this.height;
        }

        public final String getPath() {
            return this.path;
        }

        public final int getWidth() {
            return this.width;
        }

        public FrameInfo(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            this.path = str;
            this.width = i;
            this.height = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "Ljava/io/Serializable;", "urls", "", "", "width", "", "height", "token", "(Ljava/util/List;IILjava/lang/String;)V", "getHeight", "()I", "getToken", "()Ljava/lang/String;", "getUrls", "()Ljava/util/List;", "getWidth", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Image implements Serializable {
        private final int height;
        private final String token;
        private final List<String> urls;
        private final int width;

        public final int getHeight() {
            return this.height;
        }

        public final String getToken() {
            return this.token;
        }

        public final List<String> getUrls() {
            return this.urls;
        }

        public final int getWidth() {
            return this.width;
        }

        public Image(List<String> list, int i, int i2, String str) {
            Intrinsics.checkParameterIsNotNull(list, "urls");
            Intrinsics.checkParameterIsNotNull(str, "token");
            this.urls = list;
            this.width = i;
            this.height = i2;
            this.token = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "Ljava/io/Serializable;", "path", "", "compressPath", "mimeType", "size", "", "duration", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getCompressPath", "()Ljava/lang/String;", "getDuration", "()J", "getMimeType", "getPath", "getSize", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class VideoInfo implements Serializable {
        private final String compressPath;
        private final long duration;
        private final String mimeType;
        private final String path;
        private final long size;

        public final String getCompressPath() {
            return this.compressPath;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getPath() {
            return this.path;
        }

        public final long getSize() {
            return this.size;
        }

        public VideoInfo(String str, String str2, String str3, long j, long j2) {
            Intrinsics.checkParameterIsNotNull(str, "path");
            Intrinsics.checkParameterIsNotNull(str2, "compressPath");
            Intrinsics.checkParameterIsNotNull(str3, "mimeType");
            this.path = str;
            this.compressPath = str2;
            this.mimeType = str3;
            this.size = j;
            this.duration = j2;
        }
    }
}
