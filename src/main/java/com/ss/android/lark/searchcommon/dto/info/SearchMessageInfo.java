package com.ss.android.lark.searchcommon.dto.info;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.doc.entity.Doc;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class SearchMessageInfo extends SearchBaseInfo {
    private static final long serialVersionUID = -265524418720780540L;
    private boolean binderByFile;
    private String chatId;
    private long createTime;
    private FileContent fileContent;
    private FolderContent folderContent;
    private String fromAvatarKey;
    private String fromId;
    private String fromName;
    private boolean isP2pChat;
    private List<Doc> messageDocInfoList;
    private int messageThreadPosition;
    private Message.Type msgType;
    private String p2pBotId;
    private long p2pChatterId;
    private int position;
    private int threadChatPosition;
    private String threadId;
    private List<C53895a> typeInfoList;
    private long updateTime;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AvatarType {
    }

    /* renamed from: com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo$a */
    public static class C53895a {

        /* renamed from: a */
        private final int f133187a;

        /* renamed from: b */
        private final String f133188b;

        /* renamed from: c */
        private final int f133189c;

        /* renamed from: a */
        public int mo184201a() {
            return this.f133187a;
        }

        /* renamed from: b */
        public String mo184202b() {
            return this.f133188b;
        }

        /* renamed from: c */
        public int mo184203c() {
            return this.f133189c;
        }

        public C53895a(int i, String str, int i2) {
            this.f133187a = i;
            this.f133188b = str;
            this.f133189c = i2;
        }
    }

    public String getChatId() {
        return this.chatId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public FileContent getFileContent() {
        return this.fileContent;
    }

    public FolderContent getFolderContent() {
        return this.folderContent;
    }

    public String getFromAvatarKey() {
        return this.fromAvatarKey;
    }

    public String getFromId() {
        return this.fromId;
    }

    public String getFromName() {
        return this.fromName;
    }

    public List<Doc> getMessageDocInfoList() {
        return this.messageDocInfoList;
    }

    public int getMessageThreadPosition() {
        return this.messageThreadPosition;
    }

    public Message.Type getMsgType() {
        return this.msgType;
    }

    public String getP2pBotId() {
        return this.p2pBotId;
    }

    public long getP2pChatterId() {
        return this.p2pChatterId;
    }

    public int getPosition() {
        return this.position;
    }

    public int getThreadChatPosition() {
        return this.threadChatPosition;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public List<C53895a> getTypeInfoList() {
        return this.typeInfoList;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isBinderByFile() {
        return this.binderByFile;
    }

    public boolean isP2pChat() {
        return this.isP2pChat;
    }

    public SearchMessageInfo() {
        this.type = 3;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        if (!this.binderByFile) {
            return "messages";
        }
        if (this.fileContent != null) {
            return "file";
        }
        if (this.folderContent != null) {
            return "folder";
        }
        return "messages";
    }

    public void setBinderByFile(boolean z) {
        this.binderByFile = z;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setFileContent(FileContent fileContent2) {
        this.fileContent = fileContent2;
    }

    public void setFolderContent(FolderContent folderContent2) {
        this.folderContent = folderContent2;
    }

    public void setFromAvatarKey(String str) {
        this.fromAvatarKey = str;
    }

    public void setFromId(String str) {
        this.fromId = str;
    }

    public void setFromName(String str) {
        this.fromName = str;
    }

    public void setMessageDocInfoList(List<Doc> list) {
        this.messageDocInfoList = list;
    }

    public void setMessageThreadPosition(int i) {
        this.messageThreadPosition = i;
    }

    public void setMsgType(Message.Type type) {
        this.msgType = type;
    }

    public void setP2pBotId(String str) {
        this.p2pBotId = str;
    }

    public void setP2pChat(boolean z) {
        this.isP2pChat = z;
    }

    public void setP2pChatterId(long j) {
        this.p2pChatterId = j;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setThreadChatPosition(int i) {
        this.threadChatPosition = i;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setTypeInfoList(List<C53895a> list) {
        this.typeInfoList = list;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public String getAvatarId(int i) {
        if (i != 0) {
            return this.fromId;
        }
        if (this.isP2pChat) {
            return String.valueOf(this.p2pChatterId);
        }
        return this.chatId;
    }
}
