package com.ss.android.lark.search.impl.func.chatinside.common;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.common.a */
public class C53412a {

    /* renamed from: a */
    private static ISearchModuleDependency.AbstractC53317e f132019a = C53258a.m205939a().mo181756f();

    /* renamed from: b */
    private static ISearchModuleDependency.AbstractC53328n f132020b = C53258a.m205939a().mo181761j();

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.common.a$a */
    public static class C53415a {

        /* renamed from: a */
        private String f132023a;

        /* renamed from: b */
        private boolean f132024b;

        /* renamed from: a */
        public String mo182447a() {
            return this.f132023a;
        }

        /* renamed from: b */
        public boolean mo182448b() {
            return this.f132024b;
        }

        public C53415a(String str, boolean z) {
            this.f132023a = str;
            this.f132024b = z;
        }
    }

    /* renamed from: a */
    public static Chatter m206843a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f132019a.mo181777a(str);
    }

    /* renamed from: a */
    public static boolean m206846a(Chat chat) {
        return TextUtils.equals(chat.getOwnerId(), f132020b.mo181815a());
    }

    /* renamed from: b */
    public static void m206847b(String str, final IGetDataCallback<C53415a> iGetDataCallback) {
        f132019a.mo181783a(str, new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.common.C53412a.C534142 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                iGetDataCallback.onSuccess(new C53415a(C53412a.m206844a(chat, C53412a.m206843a(chat.getP2pChatterId())), C53412a.m206846a(chat)));
            }
        });
    }

    /* renamed from: a */
    public static void m206845a(String str, final IGetDataCallback<String> iGetDataCallback) {
        f132019a.mo181783a(str, new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.search.impl.func.chatinside.common.C53412a.C534131 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                iGetDataCallback.onSuccess(C53412a.m206844a(chat, C53412a.m206843a(chat.getP2pChatterId())));
            }
        });
    }

    /* renamed from: a */
    public static String m206844a(Chat chat, Chatter chatter) {
        if (chat.isMeeting()) {
            return "meeting";
        }
        if (chat.isP2PChat()) {
            if (chatter == null || !chatter.isBot()) {
                return "single";
            }
            return "single_bot";
        } else if (chat.isThread()) {
            return ChatTypeStateKeeper.f135670e;
        } else {
            return "group";
        }
    }
}
