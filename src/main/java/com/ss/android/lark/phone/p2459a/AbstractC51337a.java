package com.ss.android.lark.phone.p2459a;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;

/* renamed from: com.ss.android.lark.phone.a.a */
public interface AbstractC51337a {

    /* renamed from: com.ss.android.lark.phone.a.a$a */
    public interface AbstractC51338a {
        /* renamed from: a */
        Message mo144007a(String str);

        /* renamed from: a */
        CardContent mo144008a(com.bytedance.lark.pb.basic.v1.CardContent cardContent);

        /* renamed from: a */
        void mo144009a(Context context, String str, int i);

        /* renamed from: a */
        void mo144010a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo144011a(String str, CardContent cardContent, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo144012b(String str);

        /* renamed from: b */
        void mo144013b(String str, IGetDataCallback<Chat> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.phone.a.a$b */
    public interface AbstractC51339b {
        /* renamed from: a */
        void mo144015a(IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.phone.a.a$c */
    public interface AbstractC51340c {
        void openJoinMeetingPage(Context context, String str);
    }

    /* renamed from: a */
    void mo143998a(Activity activity, String str);

    /* renamed from: a */
    void mo143999a(Context context, String str);

    /* renamed from: a */
    boolean mo144000a();

    /* renamed from: a */
    boolean mo144001a(String str);

    /* renamed from: b */
    String mo144002b();

    /* renamed from: c */
    Context mo144003c();

    /* renamed from: d */
    AbstractC51338a mo144004d();

    /* renamed from: e */
    AbstractC51339b mo144005e();

    /* renamed from: f */
    AbstractC51340c mo144006f();
}
