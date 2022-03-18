package com.ss.android.vc.dependency;

import android.app.Activity;
import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.dependency.h */
public interface AbstractC60892h {
    /* renamed from: a */
    void mo196346a(Activity activity, String str);

    /* renamed from: a */
    boolean mo196347a(OpenChat openChat);

    void createP2PChats(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback);

    void emergencyCall(Activity activity, String str);

    Map<String, OpenChatter> fromPbChatterMap(Map<String, Chatter> map);

    OpenChat getChatById(String str);

    void getChatById(String str, IGetDataCallback<OpenChat> iGetDataCallback);

    OpenChatter getChatterById(String str);

    void getChatterById(String str, IGetDataCallback<OpenChatter> iGetDataCallback);

    void getChattersByIds(List<String> list, IGetDataCallback<Map<String, OpenChatter>> iGetDataCallback);

    OpenChatter getLoginChatter();

    void getLoginChatter(IGetDataCallback<OpenChatter> iGetDataCallback);

    void openChatById(Context context, String str);

    void queryPhoneNumber(Activity activity, String str);

    void sendMessage(String str, File file, IGetDataCallback<String> iGetDataCallback);

    Map<String, OpenChat> syncGetChatsByIds(List<String> list);

    Map<String, com.ss.android.lark.chat.entity.chatter.Chatter> syncGetChattersByIds(List<String> list);
}
