package com.ss.android.lark.favorite.common.file;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.BaseFileContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.dependency.AbstractC36505s;
import com.ss.android.lark.favorite.common.base.AbstractC37120b;
import com.ss.android.lark.favorite.common.base.C37122d;
import com.ss.android.lark.favorite.common.base.ItemListCommonHolder;
import com.ss.android.lark.widget.fileview.FileView;

/* renamed from: com.ss.android.lark.favorite.common.file.a */
public class C37132a implements AbstractC37120b<RecyclerView.ViewHolder, FavoriteMessageInfo> {

    /* renamed from: a */
    public Context f95414a;

    /* renamed from: b */
    public AbstractC36505s f95415b = C29990c.m110930b().mo134520S();

    public C37132a(Context context) {
        this.f95414a = context;
    }

    /* renamed from: a */
    public void mo136723a(RecyclerView.ViewHolder viewHolder, final FavoriteMessageInfo favoriteMessageInfo, int i) {
        final boolean z;
        int i2;
        String str;
        FileState fileState;
        boolean z2;
        boolean z3;
        final ItemListCommonHolder itemListCommonHolder = (ItemListCommonHolder) viewHolder;
        final FileMessageHolder fileMessageHolder = (FileMessageHolder) itemListCommonHolder.mo136774a();
        final Message sourceMessage = favoriteMessageInfo.getSourceMessage();
        if (sourceMessage.getType() == Message.Type.FOLDER) {
            z = true;
        } else {
            z = false;
        }
        BaseFileContent baseFileContent = (BaseFileContent) sourceMessage.getContent();
        if (z) {
            fileState = FileState.DOWNLOAD;
            str = "";
            i2 = 0;
        } else {
            FileContent fileContent = (FileContent) baseFileContent;
            FileState fileState2 = fileContent.getFileState();
            int progress = fileContent.getProgress();
            str = fileContent.getMime();
            fileState = fileState2;
            i2 = progress;
        }
        fileMessageHolder.mFileView.setTag(sourceMessage.getcId());
        FileView fileView = fileMessageHolder.mFileView;
        boolean isFromDrive = baseFileContent.isFromDrive();
        boolean isLanTransfer = baseFileContent.isLanTransfer();
        boolean isSender = baseFileContent.isSender();
        boolean isSourceFileDelete = sourceMessage.isSourceFileDelete();
        if (sourceMessage.getFileDeletedStatus() == Message.FileDeletedStatus.UNRECOVERABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sourceMessage.getFileDeletedStatus() == Message.FileDeletedStatus.RECOVERABLE) {
            z3 = true;
        } else {
            z3 = false;
        }
        fileView.mo197892a(new FileView.C58449a(isFromDrive, isLanTransfer, isSender, isSourceFileDelete, z2, z3, !sourceMessage.isPreMessage(), str, new FileView.FileState(fileState.getFileStateType(), UIUtils.getString(this.f95414a, fileState.getValue())), baseFileContent.getName(), baseFileContent.getSize(), i2, z), new FileView.C58450b() {
            /* class com.ss.android.lark.favorite.common.file.C37132a.C371331 */

            @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
            /* renamed from: a */
            public void mo122693a(FileView.C58449a aVar) {
                if (z) {
                    C37132a.this.f95415b.mo134706b(C37132a.this.f95414a, sourceMessage, favoriteMessageInfo);
                } else {
                    C37132a.this.f95415b.mo134698a(C37132a.this.f95414a, sourceMessage, favoriteMessageInfo);
                }
            }
        });
        View$OnClickListenerC371342 r2 = new View.OnClickListener() {
            /* class com.ss.android.lark.favorite.common.file.C37132a.View$OnClickListenerC371342 */

            public void onClick(View view) {
                C37122d.m146374b(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        View$OnLongClickListenerC371353 r4 = new View.OnLongClickListener() {
            /* class com.ss.android.lark.favorite.common.file.C37132a.View$OnLongClickListenerC371353 */

            public boolean onLongClick(View view) {
                return C37122d.m146373a(view, itemListCommonHolder, favoriteMessageInfo);
            }
        };
        if (i == 1) {
            itemListCommonHolder.f95392a.setOnClickListener(r2);
            itemListCommonHolder.f95392a.setOnLongClickListener(r4);
            itemListCommonHolder.mContentViewGroup.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.favorite.common.file.C37132a.View$OnClickListenerC371364 */

                public void onClick(View view) {
                    fileMessageHolder.mFileView.mo197896e();
                }
            });
            itemListCommonHolder.mContentViewGroup.setOnLongClickListener(r4);
            fileMessageHolder.mFileView.setOnLongClickListener(r4);
        } else if (i == 2) {
            itemListCommonHolder.mContentViewGroup.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.favorite.common.file.C37132a.View$OnClickListenerC371375 */

                public void onClick(View view) {
                    fileMessageHolder.mFileView.mo197896e();
                }
            });
        }
    }
}
