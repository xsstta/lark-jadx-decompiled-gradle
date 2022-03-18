package com.ss.android.lark.filedetail.dto;

import android.content.Context;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b#\u0018\u00002\u00020\u0001:\u00017B±\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0002\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u001c\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010+R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010+R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010+R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\u001d\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0019\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 ¨\u00068"}, d2 = {"Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;", "Ljava/io/Serializable;", "context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "favoriteMessage", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "fileContent", "Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "messageId", "", "chatId", "isSecret", "", "jumpPosition", "", "isSearch", "needHitPoint", "from", "", "menuFlag", "mergeMsgId", "mergeMsgChatId", "showMenu", "downloadFileScene", "threadId", "isFromFolderManage", "originMergeForwardId", "(Ljava/lang/ref/WeakReference;Lcom/ss/android/lark/chat/entity/message/Message;Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;Lcom/ss/android/lark/chat/entity/message/content/FileContent;Ljava/lang/String;Ljava/lang/String;ZIZZJJLjava/lang/String;Ljava/lang/String;ZILjava/lang/String;ZLjava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getContext", "()Ljava/lang/ref/WeakReference;", "getDownloadFileScene", "()I", "getFavoriteMessage", "()Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "getFileContent", "()Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "getFrom", "()J", "()Z", "getJumpPosition", "getMenuFlag", "getMergeMsgChatId", "getMergeMsgId", "getMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "getMessageId", "getNeedHitPoint", "getOriginMergeForwardId", "getShowMenu", "getThreadId", "Builder", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FileDetailLaunchParams implements Serializable {
    private final String chatId;
    private final transient WeakReference<Context> context;
    private final int downloadFileScene;
    private final FavoriteMessageInfo favoriteMessage;
    private final FileContent fileContent;
    private final long from;
    private final boolean isFromFolderManage;
    private final boolean isSearch;
    private final boolean isSecret;
    private final int jumpPosition;
    private final long menuFlag;
    private final String mergeMsgChatId;
    private final String mergeMsgId;
    private final Message message;
    private final String messageId;
    private final boolean needHitPoint;
    private final String originMergeForwardId;
    private final boolean showMenu;
    private final String threadId;

    public final String getChatId() {
        return this.chatId;
    }

    public final WeakReference<Context> getContext() {
        return this.context;
    }

    public final int getDownloadFileScene() {
        return this.downloadFileScene;
    }

    public final FavoriteMessageInfo getFavoriteMessage() {
        return this.favoriteMessage;
    }

    public final FileContent getFileContent() {
        return this.fileContent;
    }

    public final long getFrom() {
        return this.from;
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

    public final String getMergeMsgId() {
        return this.mergeMsgId;
    }

    public final Message getMessage() {
        return this.message;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final boolean getNeedHitPoint() {
        return this.needHitPoint;
    }

    public final String getOriginMergeForwardId() {
        return this.originMergeForwardId;
    }

    public final boolean getShowMenu() {
        return this.showMenu;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final boolean isFromFolderManage() {
        return this.isFromFolderManage;
    }

    public final boolean isSearch() {
        return this.isSearch;
    }

    public final boolean isSecret() {
        return this.isSecret;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0006\u0010Q\u001a\u00020RJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010/\u001a\u00020+J\u000e\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u00020+J\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0015J\u000e\u00109\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010E\u001a\u00020+J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0007J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020+J\u000e\u0010W\u001a\u00020\u00002\u0006\u0010V\u001a\u00020+J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020+J\u000e\u0010X\u001a\u00020\u00002\u0006\u0010V\u001a\u00020+J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0007R\u001a\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001a\u00101\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001a\u00103\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R\u001a\u00106\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u001a\u00109\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R\u001a\u0010<\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000f\"\u0004\b>\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011R\u001a\u0010E\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u001a\u0010H\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R\u001a\u0010K\u001a\u00020+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R\u001c\u0010N\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u000f\"\u0004\bP\u0010\u0011¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams$Builder;", "", "context", "Landroid/content/Context;", "fileContent", "Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "messageId", "", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/message/content/FileContent;Ljava/lang/String;)V", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/message/Message;)V", "(Landroid/content/Context;)V", "chatId", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "downloadFileScene", "", "getDownloadFileScene", "()I", "setDownloadFileScene", "(I)V", "favoriteMessage", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "getFavoriteMessage", "()Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "setFavoriteMessage", "(Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;)V", "getFileContent", "()Lcom/ss/android/lark/chat/entity/message/content/FileContent;", "setFileContent", "(Lcom/ss/android/lark/chat/entity/message/content/FileContent;)V", "from", "", "getFrom", "()J", "setFrom", "(J)V", "isFromFolderManage", "", "()Z", "setFromFolderManage", "(Z)V", "isSearch", "setSearch", "isSecret", "setSecret", "jumpPosition", "getJumpPosition", "setJumpPosition", "menuFlag", "getMenuFlag", "setMenuFlag", "mergeMsgChatId", "getMergeMsgChatId", "setMergeMsgChatId", "mergeMsgId", "getMergeMsgId", "setMergeMsgId", "getMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "setMessage", "(Lcom/ss/android/lark/chat/entity/message/Message;)V", "getMessageId", "setMessageId", "needHitPoint", "getNeedHitPoint", "setNeedHitPoint", "originMergeForwardId", "getOriginMergeForwardId", "setOriginMergeForwardId", "showMenu", "getShowMenu", "setShowMenu", "threadId", "getThreadId", "setThreadId", "build", "Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;", "scene", "id", "showAddToFavorites", "show", "showForward", "showSaveToDrive", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.dto.FileDetailLaunchParams$a */
    public static final class Builder {

        /* renamed from: a */
        public FileContent f97903a;

        /* renamed from: b */
        private Message f97904b;

        /* renamed from: c */
        private FavoriteMessageInfo f97905c;

        /* renamed from: d */
        private String f97906d;

        /* renamed from: e */
        private boolean f97907e;

        /* renamed from: f */
        private int f97908f;

        /* renamed from: g */
        private String f97909g;

        /* renamed from: h */
        private long f97910h;

        /* renamed from: i */
        private boolean f97911i;

        /* renamed from: j */
        private boolean f97912j;

        /* renamed from: k */
        private long f97913k;

        /* renamed from: l */
        private String f97914l;

        /* renamed from: m */
        private String f97915m;

        /* renamed from: n */
        private boolean f97916n;

        /* renamed from: o */
        private int f97917o;

        /* renamed from: p */
        private String f97918p;

        /* renamed from: q */
        private boolean f97919q;

        /* renamed from: r */
        private String f97920r;

        /* renamed from: s */
        private final Context f97921s;

        /* renamed from: a */
        public final FileDetailLaunchParams mo139659a() {
            WeakReference weakReference = new WeakReference(this.f97921s);
            Message message = this.f97904b;
            FavoriteMessageInfo favoriteMessageInfo = this.f97905c;
            FileContent fileContent = this.f97903a;
            if (fileContent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileContent");
            }
            return new FileDetailLaunchParams(weakReference, message, favoriteMessageInfo, fileContent, this.f97909g, this.f97906d, this.f97907e, this.f97908f, this.f97911i, this.f97912j, this.f97910h, this.f97913k, this.f97914l, this.f97915m, this.f97916n, this.f97917o, this.f97918p, this.f97919q, this.f97920r);
        }

        /* renamed from: a */
        public final Builder mo139653a(int i) {
            this.f97908f = i;
            return this;
        }

        /* renamed from: b */
        public final Builder mo139660b(int i) {
            this.f97917o = i;
            return this;
        }

        /* renamed from: c */
        public final Builder mo139664c(boolean z) {
            this.f97912j = z;
            return this;
        }

        /* renamed from: g */
        public final Builder mo139669g(boolean z) {
            this.f97916n = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo139654a(long j) {
            this.f97910h = j;
            return this;
        }

        /* renamed from: b */
        public final Builder mo139661b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            this.f97914l = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo139663c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            this.f97915m = str;
            return this;
        }

        /* renamed from: h */
        public final Builder mo139670h(boolean z) {
            Builder aVar = this;
            aVar.f97919q = z;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo139655a(FavoriteMessageInfo favoriteMessageInfo) {
            Intrinsics.checkParameterIsNotNull(favoriteMessageInfo, "message");
            this.f97905c = favoriteMessageInfo;
            return this;
        }

        /* renamed from: b */
        public final Builder mo139662b(boolean z) {
            this.f97911i = z;
            return this;
        }

        /* renamed from: d */
        public final Builder mo139665d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "originMergeForwardId");
            Builder aVar = this;
            aVar.f97920r = str;
            return aVar;
        }

        /* renamed from: e */
        public final Builder mo139667e(boolean z) {
            long j = this.f97913k | 2;
            this.f97913k = j;
            if (!z) {
                this.f97913k = j ^ 2;
            }
            return this;
        }

        /* renamed from: f */
        public final Builder mo139668f(boolean z) {
            long j = this.f97913k | 4;
            this.f97913k = j;
            if (!z) {
                this.f97913k = j ^ 4;
            }
            return this;
        }

        private Builder(Context context) {
            this.f97921s = context;
            this.f97906d = "";
            this.f97908f = -1;
            this.f97909g = "";
            this.f97913k = 7;
            this.f97914l = "";
            this.f97915m = "";
            this.f97916n = true;
            this.f97917o = -99;
            this.f97920r = "";
        }

        /* renamed from: a */
        public final Builder mo139656a(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "message");
            this.f97904b = message;
            return this;
        }

        /* renamed from: d */
        public final Builder mo139666d(boolean z) {
            long j = this.f97913k | 1;
            this.f97913k = j;
            if (!z) {
                this.f97913k = j ^ 1;
            }
            return this;
        }

        /* renamed from: a */
        public final Builder mo139657a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            this.f97906d = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo139658a(boolean z) {
            this.f97907e = z;
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Context context, Message message) {
            this(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(message, "message");
            this.f97904b = message;
            String id = message.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "message.id");
            this.f97909g = id;
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent()");
            this.f97903a = (FileContent) content;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Context context, FileContent fileContent, String str) {
            this(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(fileContent, "fileContent");
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            this.f97903a = fileContent;
            this.f97909g = str;
        }
    }

    public FileDetailLaunchParams(WeakReference<Context> weakReference, Message message2, FavoriteMessageInfo favoriteMessageInfo, FileContent fileContent2, String str, String str2, boolean z, int i, boolean z2, boolean z3, long j, long j2, String str3, String str4, boolean z4, int i2, String str5, boolean z5, String str6) {
        Intrinsics.checkParameterIsNotNull(weakReference, "context");
        Intrinsics.checkParameterIsNotNull(fileContent2, "fileContent");
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        Intrinsics.checkParameterIsNotNull(str3, "mergeMsgId");
        Intrinsics.checkParameterIsNotNull(str4, "mergeMsgChatId");
        Intrinsics.checkParameterIsNotNull(str6, "originMergeForwardId");
        this.context = weakReference;
        this.message = message2;
        this.favoriteMessage = favoriteMessageInfo;
        this.fileContent = fileContent2;
        this.messageId = str;
        this.chatId = str2;
        this.isSecret = z;
        this.jumpPosition = i;
        this.isSearch = z2;
        this.needHitPoint = z3;
        this.from = j;
        this.menuFlag = j2;
        this.mergeMsgId = str3;
        this.mergeMsgChatId = str4;
        this.showMenu = z4;
        this.downloadFileScene = i2;
        this.threadId = str5;
        this.isFromFolderManage = z5;
        this.originMergeForwardId = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FileDetailLaunchParams(java.lang.ref.WeakReference r26, com.ss.android.lark.chat.entity.message.Message r27, com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo r28, com.ss.android.lark.chat.entity.message.content.FileContent r29, java.lang.String r30, java.lang.String r31, boolean r32, int r33, boolean r34, boolean r35, long r36, long r38, java.lang.String r40, java.lang.String r41, boolean r42, int r43, java.lang.String r44, boolean r45, java.lang.String r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r25 = this;
            r0 = r47
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000b
            r18 = r2
            goto L_0x000d
        L_0x000b:
            r18 = r40
        L_0x000d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0014
            r19 = r2
            goto L_0x0016
        L_0x0014:
            r19 = r41
        L_0x0016:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x001e
            r1 = 1
            r20 = 1
            goto L_0x0020
        L_0x001e:
            r20 = r42
        L_0x0020:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x002b
            r0 = -99
            r21 = -99
            goto L_0x002d
        L_0x002b:
            r21 = r43
        L_0x002d:
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r16 = r38
            r22 = r44
            r23 = r45
            r24 = r46
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.filedetail.dto.FileDetailLaunchParams.<init>(java.lang.ref.WeakReference, com.ss.android.lark.chat.entity.message.Message, com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo, com.ss.android.lark.chat.entity.message.content.FileContent, java.lang.String, java.lang.String, boolean, int, boolean, boolean, long, long, java.lang.String, java.lang.String, boolean, int, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
