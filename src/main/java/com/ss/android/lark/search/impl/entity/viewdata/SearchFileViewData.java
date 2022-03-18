package com.ss.android.lark.search.impl.entity.viewdata;

import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;

public class SearchFileViewData extends SearchBaseViewData {
    private static final long serialVersionUID = 3084536760833391976L;
    private String chatId;
    private FileContent fileContent;
    private FolderContent folderContent;
    private int position;
    private String threadId;
    private int threadPosition;
    private long updateTime;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 10000001;
    }

    public String getChatId() {
        return this.chatId;
    }

    public FileContent getFileContent() {
        return this.fileContent;
    }

    public FolderContent getFolderContent() {
        return this.folderContent;
    }

    public int getPosition() {
        return this.position;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public int getThreadPosition() {
        return this.threadPosition;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setFileContent(FileContent fileContent2) {
        this.fileContent = fileContent2;
    }

    public void setFolderContent(FolderContent folderContent2) {
        this.folderContent = folderContent2;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setThreadPosition(int i) {
        this.threadPosition = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }
}
