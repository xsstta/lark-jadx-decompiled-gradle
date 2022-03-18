package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.ArrayList;

@RemoteService
public interface INavigation extends IHookInterface {
    void gotoCalendar(String str, String str2, long j);

    void gotoFileReaderActivity(MailAttachment mailAttachment, String str);

    void gotoLabelMoveToView(ArrayList<String> arrayList, String str);

    void gotoReplyAddress(String str, String str2);

    void sendToChat(String str, ArrayList<String> arrayList, String str2);

    boolean viewFileByDrive(String str);

    boolean viewMultiImagesByDrive(MailImage mailImage, ArrayList<MailImage> arrayList);
}
