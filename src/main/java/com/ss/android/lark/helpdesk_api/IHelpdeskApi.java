package com.ss.android.lark.helpdesk_api;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl;
import java.util.Map;

public interface IHelpdeskApi {
    Map<? extends String, ? extends AbstractC29186b> getAppLinkHandlers(Context context);

    void getKbTopExtendData(String str, int i, int i2, String str2);

    View getKbTopView(Context context);

    void initRecycleViewData(Context context, String str);

    void registerKbTopExtendControl(KbTopExtendControl aVar, Context context);

    void registerKbTopExtendPush();

    void unRegisterKbTopExtendPush();
}
