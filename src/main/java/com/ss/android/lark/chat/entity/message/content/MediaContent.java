package com.ss.android.lark.chat.entity.message.content;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONType;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 G2\u00020\u0001:\u0002GHB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0002\u0010\u0004J\u0012\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010C\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u0016J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020/R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001a\u0010#\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001a\u0010&\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001c\u0010)\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u0013\u0010,\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010\bR\u001a\u0010.\u001a\u00020/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000e\"\u0004\b6\u0010\u0010R\u001a\u00107\u001a\u000208X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\b\"\u0004\b?\u0010\n¨\u0006I"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/MediaContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "content", "(Lcom/ss/android/lark/chat/entity/message/content/MediaContent;)V", "compressPath", "", "getCompressPath", "()Ljava/lang/String;", "setCompressPath", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "filePath", "getFilePath", "setFilePath", "fileState", "Lcom/ss/android/lark/chat/entity/message/content/FileState;", "getFileState", "()Lcom/ss/android/lark/chat/entity/message/content/FileState;", "setFileState", "(Lcom/ss/android/lark/chat/entity/message/content/FileState;)V", "imageSet", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "getImageSet", "()Lcom/ss/android/lark/chat/entity/image/ImageSet;", "setImageSet", "(Lcom/ss/android/lark/chat/entity/image/ImageSet;)V", "key", "getKey", "setKey", "mime", "getMime", "setMime", "name", "getName", "setName", "originPath", "getOriginPath", "setOriginPath", "playPath", "getPlayPath", "progress", "", "getProgress", "()I", "setProgress", "(I)V", "size", "getSize", "setSize", ShareHitPoint.f121868c, "Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;", "getSource", "()Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;", "setSource", "(Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;)V", "url", "getUrl", "setUrl", "isContentSame", "", "diffable", "isItemSame", "setUploadProgress", "", "uploadProgress", "Companion", "Source", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "MediaContent")
public final class MediaContent extends Content {
    public static final Companion Companion = new Companion(null);
    private String compressPath = "";
    private long duration;
    private String filePath = "";
    private FileState fileState;
    private ImageSet imageSet;
    private String key = "";
    private String mime = "";
    private String name = "";
    private String originPath = "";
    private int progress;
    private long size;
    private Source source = Source.LARK;
    private String url = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "LARK", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Source {
        UNKNOWN(0),
        LARK(1);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Source;", "value", "", "valueOf", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.message.content.MediaContent$Source$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Source mo125515a(int i) {
                if (i == 0) {
                    return Source.UNKNOWN;
                }
                if (i != 1) {
                    return Source.UNKNOWN;
                }
                return Source.LARK;
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private Source(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/MediaContent$Companion;", "", "()V", "COMPRESS_PROGRESS_PROPORTION", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.MediaContent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getCompressPath() {
        return this.compressPath;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final FileState getFileState() {
        return this.fileState;
    }

    public final ImageSet getImageSet() {
        return this.imageSet;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMime() {
        return this.mime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginPath() {
        return this.originPath;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final long getSize() {
        return this.size;
    }

    public final Source getSource() {
        return this.source;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getPlayPath() {
        if (!TextUtils.isEmpty(this.originPath)) {
            return this.originPath;
        }
        return this.filePath;
    }

    public MediaContent() {
    }

    public final void setCompressPath(String str) {
        this.compressPath = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setFileState(FileState fileState2) {
        this.fileState = fileState2;
    }

    public final void setImageSet(ImageSet imageSet2) {
        this.imageSet = imageSet2;
    }

    public final void setOriginPath(String str) {
        this.originPath = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }

    public final void setMime(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mime = str;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setSource(Source source2) {
        Intrinsics.checkParameterIsNotNull(source2, "<set-?>");
        this.source = source2;
    }

    public final void setUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.url = str;
    }

    public final void setUploadProgress(int i) {
        this.progress = (int) (((float) 60) + (((float) i) * 0.4f));
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (content == null || !(content instanceof MediaContent) || this.progress != ((MediaContent) content).progress) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isItemSame(Content content) {
        if (!(content instanceof MediaContent)) {
            return false;
        }
        if (this == content) {
            return true;
        }
        ImageSet imageSet2 = ((MediaContent) content).imageSet;
        ImageSet imageSet3 = this.imageSet;
        if (imageSet3 == null || imageSet2 == null) {
            return false;
        }
        if (imageSet3 == null) {
            Intrinsics.throwNpe();
        }
        return Intrinsics.areEqual(imageSet3.getKey(), imageSet2.getKey());
    }

    public MediaContent(MediaContent mediaContent) {
        Intrinsics.checkParameterIsNotNull(mediaContent, "content");
        this.key = mediaContent.key;
        this.name = mediaContent.name;
        this.size = mediaContent.size;
        this.mime = mediaContent.mime;
        this.source = mediaContent.source;
        this.imageSet = mediaContent.imageSet;
        this.duration = mediaContent.duration;
        this.progress = mediaContent.progress;
        this.originPath = mediaContent.originPath;
        this.filePath = mediaContent.filePath;
        this.compressPath = mediaContent.compressPath;
        this.fileState = mediaContent.fileState;
        this.url = mediaContent.url;
    }
}
