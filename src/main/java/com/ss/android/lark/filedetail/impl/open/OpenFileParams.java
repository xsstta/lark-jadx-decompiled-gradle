package com.ss.android.lark.filedetail.impl.open;

import com.ss.android.lark.chat.entity.message.content.FileContent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\b\u0000\u0018\u0000  2\u00020\u0001:\u0002\u001f BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/OpenFileParams;", "Ljava/io/Serializable;", "fileContent", "Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "messageId", "", "chatId", "jumpPosition", "", "isSecret", "", "menuFlag", "", "mergeMsgChatId", "downloadFileScene", "threadId", "isFromFolderManager", "(Lcom/ss/android/lark/chat/entity/message/content/FileContent;Ljava/lang/String;Ljava/lang/String;IZJLjava/lang/String;ILjava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "getDownloadFileScene", "()I", "getFileContent", "()Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "()Z", "getJumpPosition", "getMenuFlag", "()J", "getMergeMsgChatId", "getMessageId", "getThreadId", "Builder", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class OpenFileParams implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final String chatId;
    private final int downloadFileScene;
    private final FileContent fileContent;
    private final boolean isFromFolderManager;
    private final boolean isSecret;
    private final int jumpPosition;
    private final long menuFlag;
    private final String mergeMsgChatId;
    private final String messageId;
    private final String threadId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/OpenFileParams$Companion;", "", "()V", "builder", "Lcom/ss/android/lark/filedetail/impl/open/OpenFileParams$Builder;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.OpenFileParams$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final Builder mo140044a() {
            return new Builder();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getDownloadFileScene() {
        return this.downloadFileScene;
    }

    public final FileContent getFileContent() {
        return this.fileContent;
    }

    public final int getJumpPosition() {
        return this.jumpPosition;
    }

    public final long getMenuFlag() {
        return this.menuFlag;
    }

    public final String getMergeMsgChatId() {
        return this.mergeMsgChatId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final boolean isFromFolderManager() {
        return this.isFromFolderManager;
    }

    public final boolean isSecret() {
        return this.isSecret;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010.\u001a\u00020/J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u00100\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001a\u0010(\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\b¨\u00062"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/OpenFileParams$Builder;", "", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "downloadFileScene", "", "getDownloadFileScene", "()I", "setDownloadFileScene", "(I)V", "fileContent", "Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "getFileContent", "()Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "setFileContent", "(Lcom/ss/android/lark/chat/entity/message/content/FileContent;)V", "isFormFolderManager", "", "()Z", "setFormFolderManager", "(Z)V", "isSecret", "setSecret", "jumpPosition", "getJumpPosition", "setJumpPosition", "menuFlag", "", "getMenuFlag", "()J", "setMenuFlag", "(J)V", "mergeMsgChatId", "getMergeMsgChatId", "setMergeMsgChatId", "messageId", "getMessageId", "setMessageId", "threadId", "getThreadId", "setThreadId", "build", "Lcom/ss/android/lark/filedetail/impl/open/OpenFileParams;", "scene", "isFromFolderManager", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.open.OpenFileParams$a */
    public static final class Builder {

        /* renamed from: a */
        public FileContent f98301a;

        /* renamed from: b */
        public String f98302b;

        /* renamed from: c */
        private int f98303c = -1;

        /* renamed from: d */
        private String f98304d = "";

        /* renamed from: e */
        private boolean f98305e;

        /* renamed from: f */
        private long f98306f = 7;

        /* renamed from: g */
        private String f98307g = "";

        /* renamed from: h */
        private int f98308h = -99;

        /* renamed from: i */
        private String f98309i;

        /* renamed from: j */
        private boolean f98310j;

        /* renamed from: a */
        public final OpenFileParams mo140038a() {
            FileContent fileContent = this.f98301a;
            if (fileContent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileContent");
            }
            String str = this.f98302b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageId");
            }
            return new OpenFileParams(fileContent, str, this.f98304d, this.f98303c, this.f98305e, this.f98306f, this.f98307g, this.f98308h, this.f98309i, this.f98310j);
        }

        /* renamed from: a */
        public final Builder mo140033a(int i) {
            this.f98303c = i;
            return this;
        }

        /* renamed from: b */
        public final Builder mo140039b(int i) {
            this.f98308h = i;
            return this;
        }

        /* renamed from: a */
        public final Builder mo140034a(long j) {
            this.f98306f = j;
            return this;
        }

        /* renamed from: b */
        public final Builder mo140040b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            this.f98304d = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo140042c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "mergeMsgChatId");
            this.f98307g = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo140043d(String str) {
            Builder aVar = this;
            aVar.f98309i = str;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140035a(FileContent fileContent) {
            Intrinsics.checkParameterIsNotNull(fileContent, "fileContent");
            this.f98301a = fileContent;
            return this;
        }

        /* renamed from: b */
        public final Builder mo140041b(boolean z) {
            Builder aVar = this;
            aVar.f98310j = aVar.f98310j;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo140036a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            this.f98302b = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo140037a(boolean z) {
            this.f98305e = z;
            return this;
        }
    }

    public OpenFileParams(FileContent fileContent2, String str, String str2, int i, boolean z, long j, String str3, int i2, String str4, boolean z2) {
        Intrinsics.checkParameterIsNotNull(fileContent2, "fileContent");
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        Intrinsics.checkParameterIsNotNull(str3, "mergeMsgChatId");
        this.fileContent = fileContent2;
        this.messageId = str;
        this.chatId = str2;
        this.jumpPosition = i;
        this.isSecret = z;
        this.menuFlag = j;
        this.mergeMsgChatId = str3;
        this.downloadFileScene = i2;
        this.threadId = str4;
        this.isFromFolderManager = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OpenFileParams(com.ss.android.lark.chat.entity.message.content.FileContent r14, java.lang.String r15, java.lang.String r16, int r17, boolean r18, long r19, java.lang.String r21, int r22, java.lang.String r23, boolean r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r0 = r25
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x000b
            r0 = -99
            r10 = -99
            goto L_0x000d
        L_0x000b:
            r10 = r22
        L_0x000d:
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r11 = r23
            r12 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.filedetail.impl.open.OpenFileParams.<init>(com.ss.android.lark.chat.entity.message.content.FileContent, java.lang.String, java.lang.String, int, boolean, long, java.lang.String, int, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
