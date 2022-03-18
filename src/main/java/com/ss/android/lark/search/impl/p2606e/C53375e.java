package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.search.impl.entity.viewdata.SearchFileViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchFileInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;

/* renamed from: com.ss.android.lark.search.impl.e.e */
public class C53375e extends AbstractC53371a<SearchFileViewData, SearchBaseInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public SearchFileViewData mo182051a(SearchBaseInfo searchBaseInfo) {
        return new SearchFileViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchFileViewData searchFileViewData, SearchBaseInfo searchBaseInfo) {
        FolderContent folderContent;
        if (searchBaseInfo instanceof SearchFileInfo) {
            SearchFileInfo searchFileInfo = (SearchFileInfo) searchBaseInfo;
            searchFileViewData.setChatId(searchFileInfo.getChatId());
            if (searchFileInfo.getFileContent() != null) {
                searchFileViewData.setFileContent(searchFileInfo.getFileContent());
            }
            searchFileViewData.setPosition(searchFileInfo.getPosition());
            searchFileViewData.setUpdateTime(searchFileInfo.getUpdateTime());
        } else if (searchBaseInfo instanceof SearchMessageInfo) {
            SearchMessageInfo searchMessageInfo = (SearchMessageInfo) searchBaseInfo;
            searchFileViewData.setChatId(searchMessageInfo.getChatId());
            searchFileViewData.setThreadId(searchMessageInfo.getThreadId());
            if (searchMessageInfo.getMsgType() == Message.Type.FILE) {
                FileContent fileContent = searchMessageInfo.getFileContent();
                if (fileContent != null) {
                    searchFileViewData.setFileContent(fileContent);
                }
            } else if (searchMessageInfo.getMsgType() == Message.Type.FOLDER && (folderContent = searchMessageInfo.getFolderContent()) != null) {
                searchFileViewData.setFolderContent(folderContent);
            }
            searchFileViewData.setPosition(searchMessageInfo.getPosition());
            searchFileViewData.setUpdateTime(searchMessageInfo.getUpdateTime());
            searchFileViewData.setThreadId(searchMessageInfo.getThreadId());
            searchFileViewData.setThreadPosition(searchMessageInfo.getMessageThreadPosition());
        }
    }
}
