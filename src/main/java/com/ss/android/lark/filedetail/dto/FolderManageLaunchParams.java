package com.ss.android.lark.filedetail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 J2\u00020\u0001:\u0002IJB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010E\u001a\u00020\rH\u0016J\u0018\u0010F\u001a\u00020G2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001c\u0010*\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001c\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR\u001a\u00109\u001a\u00020:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\t\"\u0004\bA\u0010\u000bR\u001a\u0010B\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000f\"\u0004\bD\u0010\u0011¨\u0006K"}, d2 = {"Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "downloadFileScene", "", "getDownloadFileScene", "()I", "setDownloadFileScene", "(I)V", "favoriteMessageInfo", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "getFavoriteMessageInfo", "()Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "setFavoriteMessageInfo", "(Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;)V", "folderKey", "getFolderKey", "setFolderKey", "folderName", "getFolderName", "setFolderName", "folderSize", "", "getFolderSize", "()J", "setFolderSize", "(J)V", "from", "getFrom", "setFrom", "jumpPosition", "getJumpPosition", "setJumpPosition", "mergeChatId", "getMergeChatId", "setMergeChatId", "mergeMsgId", "getMergeMsgId", "setMergeMsgId", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "getMessage", "()Lcom/ss/android/lark/chat/entity/message/Message;", "setMessage", "(Lcom/ss/android/lark/chat/entity/message/Message;)V", "messageId", "getMessageId", "setMessageId", "needHitPoint", "", "getNeedHitPoint", "()Z", "setNeedHitPoint", "(Z)V", "threadId", "getThreadId", "setThreadId", "threadPosition", "getThreadPosition", "setThreadPosition", "describeContents", "writeToParcel", "", "flags", "Builder", "CREATOR", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FolderManageLaunchParams implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private String f97922a;

    /* renamed from: b */
    private String f97923b;

    /* renamed from: c */
    private int f97924c;

    /* renamed from: d */
    private boolean f97925d;

    /* renamed from: e */
    private int f97926e;

    /* renamed from: f */
    private int f97927f;

    /* renamed from: g */
    private String f97928g;

    /* renamed from: h */
    private String f97929h;

    /* renamed from: i */
    private String f97930i;

    /* renamed from: j */
    private String f97931j;

    /* renamed from: k */
    private String f97932k;

    /* renamed from: l */
    private int f97933l;

    /* renamed from: m */
    private Message f97934m;

    /* renamed from: n */
    private long f97935n;

    /* renamed from: o */
    private FavoriteMessageInfo f97936o;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.dto.FolderManageLaunchParams$b */
    public static final class CREATOR implements Parcelable.Creator<FolderManageLaunchParams> {
        private CREATOR() {
        }

        /* renamed from: a */
        public FolderManageLaunchParams[] newArray(int i) {
            return new FolderManageLaunchParams[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public FolderManageLaunchParams createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new FolderManageLaunchParams(parcel);
        }
    }

    /* renamed from: a */
    public final String mo139672a() {
        return this.f97922a;
    }

    /* renamed from: b */
    public final String mo139679b() {
        return this.f97923b;
    }

    /* renamed from: c */
    public final int mo139682c() {
        return this.f97924c;
    }

    /* renamed from: e */
    public final int mo139689e() {
        return this.f97926e;
    }

    /* renamed from: f */
    public final int mo139691f() {
        return this.f97927f;
    }

    /* renamed from: g */
    public final String mo139693g() {
        return this.f97928g;
    }

    /* renamed from: h */
    public final String mo139695h() {
        return this.f97929h;
    }

    /* renamed from: i */
    public final String mo139696i() {
        return this.f97930i;
    }

    /* renamed from: j */
    public final String mo139697j() {
        return this.f97931j;
    }

    /* renamed from: k */
    public final String mo139698k() {
        return this.f97932k;
    }

    /* renamed from: l */
    public final int mo139699l() {
        return this.f97933l;
    }

    /* renamed from: m */
    public final long mo139700m() {
        return this.f97935n;
    }

    /* renamed from: n */
    public final FavoriteMessageInfo mo139701n() {
        return this.f97936o;
    }

    /* renamed from: d */
    public final boolean mo139687d() {
        return this.f97925d;
    }

    public FolderManageLaunchParams() {
        this.f97922a = "";
        this.f97923b = "";
        this.f97924c = -1;
        this.f97927f = -99;
        this.f97928g = "";
        this.f97929h = "";
        this.f97933l = -1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nR\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams$Builder;", "", "messageId", "", "(Ljava/lang/String;)V", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "(Lcom/ss/android/lark/chat/entity/message/Message;)V", "chatId", "downloadFileScene", "", "favoriteMessage", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "folderKey", "folderName", "folderSize", "", "from", "jumpPosition", "mergeChatId", "mergeMsgId", "needHitPoint", "", "threadId", "threadPosition", "build", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "favoriteMessageInfo", "msgId", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.dto.FolderManageLaunchParams$a */
    public static final class Builder {

        /* renamed from: a */
        private Message f97937a;

        /* renamed from: b */
        private String f97938b = "";

        /* renamed from: c */
        private String f97939c = "";

        /* renamed from: d */
        private int f97940d = -1;

        /* renamed from: e */
        private boolean f97941e;

        /* renamed from: f */
        private int f97942f = -1;

        /* renamed from: g */
        private String f97943g;

        /* renamed from: h */
        private String f97944h;

        /* renamed from: i */
        private int f97945i = -99;

        /* renamed from: j */
        private String f97946j = "";

        /* renamed from: k */
        private String f97947k = "";

        /* renamed from: l */
        private String f97948l;

        /* renamed from: m */
        private int f97949m = -1;

        /* renamed from: n */
        private long f97950n;

        /* renamed from: o */
        private FavoriteMessageInfo f97951o;

        /* renamed from: a */
        public final FolderManageLaunchParams mo139708a() {
            FolderManageLaunchParams folderManageLaunchParams = new FolderManageLaunchParams();
            folderManageLaunchParams.mo139677a(this.f97938b);
            folderManageLaunchParams.mo139681b(this.f97939c);
            folderManageLaunchParams.mo139673a(this.f97940d);
            folderManageLaunchParams.mo139678a(this.f97941e);
            folderManageLaunchParams.mo139680b(this.f97942f);
            folderManageLaunchParams.mo139683c(this.f97945i);
            folderManageLaunchParams.mo139684c(this.f97946j);
            folderManageLaunchParams.mo139686d(this.f97947k);
            folderManageLaunchParams.mo139690e(this.f97943g);
            folderManageLaunchParams.mo139692f(this.f97944h);
            folderManageLaunchParams.mo139694g(this.f97948l);
            folderManageLaunchParams.mo139685d(this.f97949m);
            folderManageLaunchParams.mo139676a(this.f97937a);
            folderManageLaunchParams.mo139674a(this.f97950n);
            folderManageLaunchParams.mo139675a(this.f97951o);
            return folderManageLaunchParams;
        }

        /* renamed from: a */
        public final Builder mo139703a(int i) {
            Builder aVar = this;
            aVar.f97940d = i;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo139709b(int i) {
            Builder aVar = this;
            aVar.f97942f = i;
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo139711c(int i) {
            Builder aVar = this;
            aVar.f97945i = i;
            return aVar;
        }

        /* renamed from: d */
        public final Builder mo139713d(int i) {
            Builder aVar = this;
            aVar.f97949m = i;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo139704a(long j) {
            Builder aVar = this;
            aVar.f97950n = j;
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo139710b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "mergeMsgId");
            Builder aVar = this;
            aVar.f97943g = str;
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo139712c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "mergeChatId");
            Builder aVar = this;
            aVar.f97944h = str;
            return aVar;
        }

        /* renamed from: d */
        public final Builder mo139714d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "folderKey");
            Builder aVar = this;
            aVar.f97946j = str;
            return aVar;
        }

        /* renamed from: e */
        public final Builder mo139715e(String str) {
            Intrinsics.checkParameterIsNotNull(str, "folderName");
            Builder aVar = this;
            aVar.f97947k = str;
            return aVar;
        }

        /* renamed from: f */
        public final Builder mo139716f(String str) {
            Intrinsics.checkParameterIsNotNull(str, "threadId");
            Builder aVar = this;
            aVar.f97948l = str;
            return aVar;
        }

        public Builder(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            this.f97938b = str;
        }

        /* renamed from: a */
        public final Builder mo139705a(FavoriteMessageInfo favoriteMessageInfo) {
            Intrinsics.checkParameterIsNotNull(favoriteMessageInfo, "favoriteMessageInfo");
            Builder aVar = this;
            aVar.f97951o = favoriteMessageInfo;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo139706a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Builder aVar = this;
            aVar.f97939c = str;
            return aVar;
        }

        public Builder(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "message");
            this.f97937a = message;
            String id = message.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "message.id");
            this.f97938b = id;
            this.f97946j = ((FolderContent) message.getContent()).getKey();
            this.f97947k = ((FolderContent) message.getContent()).getName();
            this.f97950n = ((FolderContent) message.getContent()).getSize();
        }

        /* renamed from: a */
        public final Builder mo139707a(boolean z) {
            Builder aVar = this;
            aVar.f97941e = z;
            return aVar;
        }
    }

    /* renamed from: d */
    public final void mo139685d(int i) {
        this.f97933l = i;
    }

    /* renamed from: a */
    public final void mo139673a(int i) {
        this.f97924c = i;
    }

    /* renamed from: b */
    public final void mo139680b(int i) {
        this.f97926e = i;
    }

    /* renamed from: c */
    public final void mo139683c(int i) {
        this.f97927f = i;
    }

    /* renamed from: d */
    public final void mo139686d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f97929h = str;
    }

    /* renamed from: e */
    public final void mo139690e(String str) {
        this.f97930i = str;
    }

    /* renamed from: f */
    public final void mo139692f(String str) {
        this.f97931j = str;
    }

    /* renamed from: g */
    public final void mo139694g(String str) {
        this.f97932k = str;
    }

    /* renamed from: a */
    public final void mo139674a(long j) {
        this.f97935n = j;
    }

    /* renamed from: b */
    public final void mo139681b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f97923b = str;
    }

    /* renamed from: c */
    public final void mo139684c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f97928g = str;
    }

    /* renamed from: a */
    public final void mo139675a(FavoriteMessageInfo favoriteMessageInfo) {
        this.f97936o = favoriteMessageInfo;
    }

    /* renamed from: a */
    public final void mo139676a(Message message) {
        this.f97934m = message;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FolderManageLaunchParams(Parcel parcel) {
        this();
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        String readString = parcel.readString();
        String str = "";
        this.f97922a = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f97923b = readString2 == null ? str : readString2;
        this.f97924c = parcel.readInt();
        this.f97925d = parcel.readByte() != ((byte) 0);
        this.f97926e = parcel.readInt();
        this.f97927f = parcel.readInt();
        String readString3 = parcel.readString();
        this.f97928g = readString3 == null ? str : readString3;
        String readString4 = parcel.readString();
        this.f97929h = readString4 != null ? readString4 : str;
        this.f97930i = parcel.readString();
        this.f97931j = parcel.readString();
        this.f97932k = parcel.readString();
        this.f97933l = parcel.readInt();
        this.f97934m = (Message) parcel.readSerializable();
        this.f97935n = parcel.readLong();
        this.f97936o = (FavoriteMessageInfo) parcel.readSerializable();
    }

    /* renamed from: a */
    public final void mo139677a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f97922a = str;
    }

    /* renamed from: a */
    public final void mo139678a(boolean z) {
        this.f97925d = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f97922a);
        parcel.writeString(this.f97923b);
        parcel.writeInt(this.f97924c);
        parcel.writeByte(this.f97925d ? (byte) 1 : 0);
        parcel.writeInt(this.f97926e);
        parcel.writeInt(this.f97927f);
        parcel.writeString(this.f97928g);
        parcel.writeString(this.f97929h);
        parcel.writeString(this.f97930i);
        parcel.writeString(this.f97931j);
        parcel.writeString(this.f97932k);
        parcel.writeInt(this.f97933l);
        parcel.writeSerializable(this.f97934m);
        parcel.writeLong(this.f97935n);
        parcel.writeSerializable(this.f97936o);
    }
}
