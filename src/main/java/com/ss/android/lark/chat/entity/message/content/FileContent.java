package com.ss.android.lark.chat.entity.message.content;

import android.app.Application;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.alibaba.fastjson.annotation.JSONType;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0002\u0010\u0004J\r\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "Lcom/ss/android/lark/chat/entity/message/content/BaseFileContent;", "()V", "content", "(Lcom/ss/android/lark/chat/entity/message/content/FileContent;)V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "fileState", "Lcom/ss/android/lark/chat/entity/message/content/FileState;", "getFileState", "()Lcom/ss/android/lark/chat/entity/message/content/FileState;", "setFileState", "(Lcom/ss/android/lark/chat/entity/message/content/FileState;)V", "mime", "getMime", "setMime", "progress", "", "getProgress", "()I", "setProgress", "(I)V", "uriString", "getUriString", "setUriString", "getFd", "", "()Ljava/lang/Long;", "isContentSame", "", "diffable", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "isItemSame", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "FileContent")
public final class FileContent extends BaseFileContent<FileContent> {
    public static final Companion Companion = new Companion(null);
    private String filePath;
    private FileState fileState = FileState.DOWNLOAD;
    private String mime = "";
    private int progress;
    private String uriString;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/FileContent$Companion;", "", "()V", "TAG", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.entity.message.content.FileContent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final FileState getFileState() {
        return this.fileState;
    }

    public final String getMime() {
        return this.mime;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getUriString() {
        return this.uriString;
    }

    public FileContent() {
    }

    public final Long getFd() {
        ContentResolver contentResolver;
        ParcelFileDescriptor parcelFileDescriptor;
        String str = this.uriString;
        if (str != null) {
            Uri parse = Uri.parse(str);
            Application application = LarkContext.getApplication();
            if (!(application == null || (contentResolver = application.getContentResolver()) == null)) {
                try {
                    parcelFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                } catch (Exception e) {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException)) {
                        Log.m165383e("FileContent", "cannot open fd in r, message: " + e.getMessage() + ", uri: " + this.uriString);
                    } else {
                        Log.m165383e("FileContent", "cannot open fd in r, message: " + e.getMessage() + ", uri: " + this.uriString);
                    }
                    parcelFileDescriptor = null;
                }
                if (parcelFileDescriptor != null) {
                    return Long.valueOf((long) parcelFileDescriptor.detachFd());
                }
            }
        }
        return null;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setUriString(String str) {
        this.uriString = str;
    }

    public final void setFileState(FileState fileState2) {
        Intrinsics.checkParameterIsNotNull(fileState2, "<set-?>");
        this.fileState = fileState2;
    }

    public final void setMime(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mime = str;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content, com.ss.android.lark.chat.entity.message.content.BaseFileContent
    public boolean isContentSame(Content content) {
        if (!super.isContentSame(content) || !(content instanceof FileContent) || this.progress != ((FileContent) content).progress) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content, com.ss.android.lark.chat.entity.message.content.BaseFileContent
    public boolean isItemSame(Content content) {
        if (content == null || !(content instanceof FileContent) || !Intrinsics.areEqual(getKey(), ((FileContent) content).getKey())) {
            return false;
        }
        return true;
    }

    public FileContent(FileContent fileContent) {
        Intrinsics.checkParameterIsNotNull(fileContent, "content");
        setKey(fileContent.getKey());
        setName(fileContent.getName());
        setSize(fileContent.getSize());
        this.mime = fileContent.mime;
        this.filePath = fileContent.filePath;
        setNameSpace(fileContent.getNameSpace());
        setSource(fileContent.getSource());
        setSaveToDrive(fileContent.getSaveToDrive());
        this.progress = fileContent.progress;
        this.fileState = fileContent.fileState;
        setInMyNutStore(fileContent.isInMyNutStore());
        setLanTransStatus(fileContent.getLanTransStatus());
        this.uriString = fileContent.uriString;
    }
}
