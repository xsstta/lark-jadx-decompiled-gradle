package com.ss.android.lark.openplatform.manis;

import android.content.Context;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.openplatform.OpenPlatformModule;

@RemoteServiceImpl(service = OpenPlatformIpc.class)
public class OpenPlatformIpcImpl implements OpenPlatformIpc {
    private Context mContext;

    public OpenPlatformIpcImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.openplatform.manis.OpenPlatformIpc
    public void startChatWindowActivityByChatIdAndPos(String str, int i) {
        OpenPlatformModule.m192198d().startChatWindowActivityByChatIdAndPos(this.mContext, str, i);
    }
}
