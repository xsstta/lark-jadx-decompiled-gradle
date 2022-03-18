package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.BaseFileContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.FileMessageViewHolder;
import com.ss.android.lark.widget.fileview.FileView;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.e */
public class C51544e extends AbstractC51540b<FileMessageViewHolder> {
    public C51544e(Context context, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
    }

    /* renamed from: a */
    public FileMessageViewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return FileMessageViewHolder.C51597a.m200236a(layoutInflater, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(final FileMessageViewHolder fileMessageViewHolder, PinInfo bVar) {
        super.mo177530a((AbstractC51540b.C51541a) fileMessageViewHolder, bVar);
        fileMessageViewHolder.mFileView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51544e.View$OnClickListenerC515462 */

            public void onClick(View view) {
                fileMessageViewHolder.mFileView.mo197896e();
            }
        });
        fileMessageViewHolder.mFileView.setOnLongClickListener(mo177529a(bVar));
    }

    /* renamed from: a */
    public void mo177520a(FileMessageViewHolder fileMessageViewHolder, int i, PinInfo bVar) {
        final boolean z;
        int i2;
        String str;
        FileState fileState;
        boolean z2;
        boolean z3;
        super.mo31174a((AbstractC51540b.C51541a) fileMessageViewHolder, i, bVar);
        final Message g = bVar.mo177396g();
        fileMessageViewHolder.mFileView.setTag(bVar.mo177396g().getcId());
        if (g.getType() == Message.Type.FOLDER) {
            z = true;
        } else {
            z = false;
        }
        BaseFileContent baseFileContent = (BaseFileContent) g.getContent();
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
        FileView fileView = fileMessageViewHolder.mFileView;
        boolean isFromDrive = baseFileContent.isFromDrive();
        boolean isLanTransfer = baseFileContent.isLanTransfer();
        boolean isSender = baseFileContent.isSender();
        boolean isSourceFileDelete = g.isSourceFileDelete();
        if (g.getFileDeletedStatus() == Message.FileDeletedStatus.UNRECOVERABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (g.getFileDeletedStatus() == Message.FileDeletedStatus.RECOVERABLE) {
            z3 = true;
        } else {
            z3 = false;
        }
        fileView.mo197892a(new FileView.C58449a(isFromDrive, isLanTransfer, isSender, isSourceFileDelete, z2, z3, !g.isPreMessage(), str, new FileView.FileState(fileState.getFileStateType(), UIUtils.getString(this.f146181d, fileState.getValue())), baseFileContent.getName(), baseFileContent.getSize(), i2, z), new FileView.C58450b() {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.C51544e.C515451 */

            @Override // com.ss.android.lark.widget.fileview.FileView.C58450b
            /* renamed from: a */
            public void mo122693a(FileView.C58449a aVar) {
                if (z) {
                    PinModule.m199585b().mo144029c(C51544e.this.f146181d, g);
                } else {
                    PinModule.m199585b().mo144026b(C51544e.this.f146181d, g);
                }
            }
        });
        fileMessageViewHolder.mFileView.setBackgroundResource(R.drawable.item_bg_corner4_white_1dp_border);
        fileMessageViewHolder.mFileView.f143945f.setCornerRadiusDP(4.0f);
        if (bVar.mo177391b()) {
            fileMessageViewHolder.mFileView.setBackgroundResource(R.drawable.item_bg_corner4_white);
            fileMessageViewHolder.mFileView.f143945f.setCornerRadiusDP(BitmapDescriptorFactory.HUE_RED);
        }
        if (!DesktopUtil.m144307b()) {
            fileMessageViewHolder.mFileView.mo197890a();
        }
    }
}
