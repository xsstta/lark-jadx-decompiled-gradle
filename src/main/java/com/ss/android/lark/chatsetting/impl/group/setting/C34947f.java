package com.ss.android.lark.chatsetting.impl.group.setting;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.f */
public class C34947f {

    /* renamed from: a */
    private static AbstractC34461c f90224a;

    /* renamed from: b */
    private static AbstractC34461c.AbstractC34466e f90225b;

    /* renamed from: c */
    private static AbstractC34461c.AbstractC34476o f90226c = ChatSettingModule.m133639a().mo127277g();

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.setting.f$a */
    public static class C34949a {

        /* renamed from: a */
        public ChatChatter f90231a;

        /* renamed from: b */
        public Chat f90232b;

        /* renamed from: c */
        public List<ChatChatter> f90233c = new ArrayList();

        /* renamed from: d */
        public ChatSetting f90234d;

        /* renamed from: e */
        public boolean f90235e;

        /* renamed from: f */
        public String f90236f;

        /* renamed from: g */
        public int f90237g;

        /* renamed from: h */
        public TopicGroup f90238h;
    }

    static {
        AbstractC34461c a = ChatSettingModule.m133639a();
        f90224a = a;
        f90225b = a.mo127274d();
    }

    /* renamed from: b */
    private static C34949a m136046b(String str, Chat chat, IGetDataCallback<C34949a> iGetDataCallback) {
        List<ChatChatter> a = f90225b.mo127315a(str, C34945e.m136037c());
        C34949a aVar = new C34949a();
        aVar.f90232b = chat;
        aVar.f90233c.clear();
        aVar.f90233c.addAll(a);
        return aVar;
    }

    /* renamed from: a */
    public static C34949a m136044a(String str, Chat chat, IGetDataCallback<C34949a> iGetDataCallback) {
        List<ChatChatter> b = f90225b.mo127351b(str, C34945e.m136037c());
        if (CollectionUtils.isEmpty(b)) {
            iGetDataCallback.onError(new ErrorResult("pull chatChatter failed"));
            return null;
        }
        C34949a aVar = new C34949a();
        aVar.f90232b = chat;
        aVar.f90233c.clear();
        aVar.f90233c.addAll(b);
        return aVar;
    }

    /* renamed from: a */
    public static void m136045a(final String str, IGetDataCallback<C34949a> iGetDataCallback, final IGetDataCallback<C34949a> iGetDataCallback2) {
        C34949a b;
        final Chat b2 = f90225b.mo127349b(str);
        if (b2 == null) {
            String str2 = "cannot get get currentChat, chatId: " + str;
            Log.m165383e("GroupSettingDataHelper", str2);
            if (iGetDataCallback2 != null) {
                iGetDataCallback2.onError(new ErrorResult(str2));
                return;
            }
            return;
        }
        final boolean[] zArr = {false};
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.C34947f.RunnableC349481 */

            public void run() {
                C34949a a;
                IGetDataCallback iGetDataCallback = iGetDataCallback2;
                if (iGetDataCallback != null && (a = C34947f.m136044a(str, b2, iGetDataCallback)) != null) {
                    synchronized (C34947f.class) {
                        iGetDataCallback2.onSuccess(a);
                        zArr[0] = true;
                    }
                }
            }
        });
        if (iGetDataCallback != null && (b = m136046b(str, b2, iGetDataCallback)) != null) {
            synchronized (C34947f.class) {
                if (!zArr[0]) {
                    iGetDataCallback.onSuccess(b);
                }
            }
        }
    }
}
