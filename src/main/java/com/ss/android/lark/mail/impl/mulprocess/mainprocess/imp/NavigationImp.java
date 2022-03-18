package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.ArrayList;

@RemoteServiceImpl(service = INavigation.class)
public class NavigationImp implements INavigation {
    private final Context mContext;

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoCalendar(String str, String str2, long j) {
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoFileReaderActivity(MailAttachment mailAttachment, String str) {
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoReplyAddress(String str, String str2) {
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public boolean viewFileByDrive(String str) {
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public boolean viewMultiImagesByDrive(MailImage mailImage, ArrayList<MailImage> arrayList) {
        return false;
    }

    public NavigationImp(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void gotoLabelMoveToView(ArrayList<String> arrayList, String str) {
        C42699a.m170245a(this.mContext, arrayList, str);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.INavigation
    public void sendToChat(String str, ArrayList<String> arrayList, String str2) {
        C42699a.m170238a(this.mContext, str, arrayList, str2);
    }
}
