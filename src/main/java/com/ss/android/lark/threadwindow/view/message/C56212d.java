package com.ss.android.lark.threadwindow.view.message;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.FileContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.DesktopFileMessageCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33299i;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.threadwindow.view.message.d */
public class C56212d extends DesktopFileMessageCell {
    public C56212d(AbstractC33342d dVar, AbstractC33299i iVar) {
        super(dVar, iVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.DesktopFileMessageCell
    /* renamed from: a */
    public void mo122649a(DesktopFileMessageCell.DesktopFileMessageViewHolder desktopFileMessageViewHolder, AbsMessageVO<FileContentVO> aVar) {
        super.mo122649a(desktopFileMessageViewHolder, aVar);
        desktopFileMessageViewHolder.mFileView.setBackground(UIHelper.getDrawable(R.drawable.thread_item_white_bg));
        desktopFileMessageViewHolder.mFileView.getFileIconView().setCornerRadiusDP(10.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f);
    }
}
