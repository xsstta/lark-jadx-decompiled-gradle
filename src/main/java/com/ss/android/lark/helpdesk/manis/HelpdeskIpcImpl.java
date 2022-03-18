package com.ss.android.lark.helpdesk.manis;

import android.content.Context;
import com.ss.android.lark.helpdesk.C38732a;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = HelpdeskIpc.class)
public class HelpdeskIpcImpl implements HelpdeskIpc {
    private Context mContext;

    public HelpdeskIpcImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.helpdesk.manis.HelpdeskIpc
    public void openOncallChatId(String str, String str2, String str3) {
        C38732a.m152978a(this.mContext, str, str2, str3);
    }

    @Override // com.ss.android.lark.helpdesk.manis.HelpdeskIpc
    public void openOncallChatId(String str, String str2, String str3, String str4) {
        C38732a.m152979a(this.mContext, str, str2, str3, str4);
    }
}
