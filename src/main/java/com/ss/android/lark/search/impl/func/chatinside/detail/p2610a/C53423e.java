package com.ss.android.lark.search.impl.func.chatinside.detail.p2610a;

import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.C53451c;
import com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53420c;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchFileInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.a.e */
public class C53423e extends C53451c implements C53420c.AbstractC53421a {
    public C53423e(BaseFragment baseFragment, View view) {
        super(baseFragment, view);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.p2610a.C53420c.AbstractC53421a
    /* renamed from: a */
    public void mo182471a(SearchBaseInfo searchBaseInfo, boolean z) {
        int i;
        boolean z2 = true;
        if (searchBaseInfo instanceof SearchFileInfo) {
            SearchFileInfo searchFileInfo = (SearchFileInfo) searchBaseInfo;
            FileContent fileContent = searchFileInfo.getFileContent();
            if (fileContent == null || !fileContent.isLanTransfer()) {
                z2 = false;
            }
            if (z2) {
                LKUIToast.show(this.f132088b.getContext(), (int) R.string.Lark_Message_file_lan_searchsendreceived);
            } else {
                C53258a.m205939a().mo181736a(this.f132088b.getContext(), fileContent, searchFileInfo.getId(), searchFileInfo.getChatId(), searchFileInfo.getPosition(), true, z, false);
            }
        } else if (searchBaseInfo instanceof SearchMessageInfo) {
            SearchMessageInfo searchMessageInfo = (SearchMessageInfo) searchBaseInfo;
            FileContent fileContent2 = searchMessageInfo.getFileContent();
            FolderContent folderContent = searchMessageInfo.getFolderContent();
            if ((fileContent2 == null || !fileContent2.isLanTransfer()) && (folderContent == null || !folderContent.isLanTransfer())) {
                z2 = false;
            }
            if (z2) {
                LKUIToast.show(this.f132088b.getContext(), (int) R.string.Lark_Message_file_lan_searchsendreceived);
            } else if (fileContent2 != null) {
                C53258a.m205939a().mo181736a(this.f132088b.getContext(), fileContent2, searchMessageInfo.getId(), searchMessageInfo.getChatId(), searchMessageInfo.getPosition(), true, z, false);
            } else if (folderContent != null) {
                if (TextUtils.isEmpty(searchMessageInfo.getThreadId())) {
                    i = searchMessageInfo.getPosition();
                } else {
                    i = searchMessageInfo.getMessageThreadPosition();
                }
                C53258a.m205939a().mo181738a(this.f132088b.getContext(), folderContent.getKey(), folderContent.getName(), searchMessageInfo.getId(), searchMessageInfo.getChatId(), searchMessageInfo.getThreadId(), i, true, z, folderContent.getSize());
            }
        }
    }
}
