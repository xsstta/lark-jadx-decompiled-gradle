package com.ss.android.lark.mail.impl.mulprocess.webprocess.imp;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush;
import com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a;
import com.ss.android.lark.mail.impl.service.p2215a.C43298e;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IMailPush.class)
public class MailPushImp implements IMailPush {
    private Context mContext;

    public MailPushImp(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush
    public void push(int i, ByteArray byteArray, String str, boolean z, boolean z2) {
        AbstractC43286a a = C43298e.m172008a().mo154974a(Command.fromValue(i));
        if (a != null) {
            a.mo154969a(byteArray.mo154623a(), str, z, z2);
        }
    }
}
