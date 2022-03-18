package com.tt.frontendapiinterface;

import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;

public interface IJsBridge {
    String invoke(String str, String str2, int i);

    void invokeApi(String str, AbstractC25903n nVar, int i);

    void invokeApi(String str, LKBasePluginResult lKBasePluginResult, int i);

    void onHide();

    void onShow();

    void release();

    void removeHandler();

    void returnAsyncResult(int i, String str, String str2, String str3);

    void sendMsgToJsCore(String str, String str2);

    void sendMsgToJsCore(String str, String str2, int i);

    void sendMsgToJsCore(String str, String str2, int i, boolean z);

    void sendMsgToJsCore2(String str, IApiOutputParam iApiOutputParam, boolean z);
}
