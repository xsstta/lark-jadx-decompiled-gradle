package com.ss.android.lark.filedetail.impl.open;

import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import java.io.Serializable;

public class OpenFileInfo implements Serializable {
    public boolean isFromFolderManage;
    public String mChatId;
    public FavoriteMessageInfo mFavoriteMessage;
    public FileContent mFileContent;
    public boolean mIsSecret;
    public int mJumpPosition = -1;
    public long mMenuFlag;
    public String mMessageId;
    public String mSourceId = "";
    public Message.SourceType mSourceType;
    public String originMergeForwardId;
    public String threadId;

    /* renamed from: com.ss.android.lark.filedetail.impl.open.OpenFileInfo$a */
    public static class C38278a {

        /* renamed from: a */
        public FavoriteMessageInfo f98289a;

        /* renamed from: b */
        public String f98290b;

        /* renamed from: c */
        private FileContent f98291c;

        /* renamed from: d */
        private String f98292d = "";

        /* renamed from: e */
        private Message.SourceType f98293e;

        /* renamed from: f */
        private String f98294f;

        /* renamed from: g */
        private String f98295g;

        /* renamed from: h */
        private int f98296h = -1;

        /* renamed from: i */
        private boolean f98297i;

        /* renamed from: j */
        private long f98298j;

        /* renamed from: k */
        private String f98299k;

        /* renamed from: l */
        private boolean f98300l;

        /* renamed from: a */
        public OpenFileInfo mo140019a() {
            OpenFileInfo openFileInfo = new OpenFileInfo();
            openFileInfo.mFileContent = this.f98291c;
            openFileInfo.mSourceId = this.f98292d;
            openFileInfo.mSourceType = this.f98293e;
            openFileInfo.mMessageId = this.f98294f;
            openFileInfo.mChatId = this.f98295g;
            openFileInfo.mJumpPosition = this.f98296h;
            openFileInfo.mIsSecret = this.f98297i;
            openFileInfo.mMenuFlag = this.f98298j;
            openFileInfo.threadId = this.f98299k;
            openFileInfo.isFromFolderManage = this.f98300l;
            openFileInfo.originMergeForwardId = this.f98290b;
            return openFileInfo;
        }

        /* renamed from: a */
        public C38278a mo140015a(int i) {
            this.f98296h = i;
            return this;
        }

        /* renamed from: b */
        public C38278a mo140020b(String str) {
            this.f98295g = str;
            return this;
        }

        /* renamed from: c */
        public C38278a mo140021c(String str) {
            this.f98299k = str;
            return this;
        }

        /* renamed from: d */
        public C38278a mo140022d(String str) {
            this.f98290b = str;
            return this;
        }

        /* renamed from: a */
        public C38278a mo140016a(FavoriteMessageInfo favoriteMessageInfo) {
            this.f98289a = favoriteMessageInfo;
            return this;
        }

        /* renamed from: a */
        public C38278a mo140017a(FileContent fileContent) {
            this.f98291c = fileContent;
            return this;
        }

        /* renamed from: a */
        public C38278a mo140018a(String str) {
            this.f98294f = str;
            return this;
        }
    }
}
