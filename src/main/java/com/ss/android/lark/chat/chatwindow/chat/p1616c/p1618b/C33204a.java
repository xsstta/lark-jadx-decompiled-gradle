package com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatWindowPrepareData;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33212b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33215e;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chatwindow.C35242f;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dto.group.ChatChatterKickInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadwindow.C56146m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.c.b.a */
public class C33204a implements AbstractC33208c<C33212b, C33215e<C35219b>> {

    /* renamed from: b */
    private static final AbstractC34296k f85408b = C32821b.m126120a();

    /* renamed from: c */
    private static final IInnerMessageService f85409c = C32848e.m126401b();

    /* renamed from: d */
    private static final AbstractC36450aa f85410d = C29990c.m110930b().mo134515N();

    /* renamed from: a */
    public ErrorResult f85411a;

    /* renamed from: a */
    public C33215e<C35219b> mo122423a(C33212b bVar) {
        this.f85411a = null;
        C35219b b = m128290b(bVar);
        C33215e<C35219b> eVar = new C33215e<>();
        eVar.mo122445a(b);
        eVar.mo122444a(this.f85411a);
        return eVar;
    }

    /* renamed from: b */
    private C35219b m128290b(final C33212b bVar) {
        int i;
        Map<String, Message> a;
        boolean z = true;
        C29990c.m110930b().mo134577e().mo120960a(true);
        String d = bVar.mo122435d();
        if (!TextUtils.isEmpty(d) && TextUtils.isEmpty(bVar.mo122433b())) {
            m128289a(d, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.C33204a.C332051 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat != null) {
                        bVar.mo122432a(chat.getId());
                        return;
                    }
                    C33204a.this.f85411a = new ErrorResult(2);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (errorResult.getErrorCode() == 4051 || errorResult.getErrorCode() == 5013) {
                        C33204a.this.f85411a = errorResult;
                        return;
                    }
                    C33204a.this.f85411a = new ErrorResult(2);
                }
            });
        }
        String c = bVar.mo122434c();
        if (!TextUtils.isEmpty(c) && (a = f85409c.mo121083a(Collections.singletonList(c))) != null) {
            Message message = a.get(c);
            if (message != null) {
                bVar.mo122431a(message.getPosition());
            } else {
                Log.m165383e("chatwindow", "load init message position failed: " + c);
            }
        }
        ChatWindowPrepareData a2 = C35242f.m137613a().mo129703a(bVar.mo122433b());
        if (a2 == null) {
            Log.m165383e("chatwindow", "getChatLauncherInfo failed, chatId is:" + bVar.mo122433b());
        }
        if (this.f85411a == null) {
            if (a2 == null || a2.chat == null) {
                this.f85411a = new ErrorResult(1);
            } else {
                if (a2.chat.getRole() != Chat.Role.MEMBER) {
                    z = false;
                }
                boolean a3 = C56146m.m218890a(a2.chat, a2.topicGroup);
                if (!z && !a3) {
                    ChatChatterKickInfo aVar = null;
                    if (!a2.chat.isThread()) {
                        aVar = f85408b.mo121074j(bVar.mo122433b());
                    }
                    if (aVar != null) {
                        if (a2.chat.isEdu()) {
                            i = 8;
                        } else {
                            i = 4;
                        }
                        this.f85411a = new ErrorResult(i, aVar.mo136121a());
                    } else {
                        this.f85411a = new ErrorResult(3);
                    }
                }
            }
        }
        C35219b a4 = C35219b.m137557a(bVar.mo122436e(), a2);
        C29990c.m110930b().mo134577e().mo120960a(false);
        return a4;
    }

    /* renamed from: a */
    private void m128289a(String str, final IGetDataCallback<Chat> iGetDataCallback) {
        AbstractC34296k kVar = f85408b;
        Chat g = kVar.mo121064g(str);
        if (g != null) {
            iGetDataCallback.onSuccess(g);
            return;
        }
        new ArrayList(CollectionUtils.asList(new String[]{str, f85410d.mo134394a()}));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        kVar.mo121031a(false, str, (ChatBundle.C29592c) null, (IGetDataCallback<Chat>) new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1616c.p1618b.C33204a.C332062 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                countDownLatch.countDown();
                iGetDataCallback.onSuccess(chat);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                countDownLatch.countDown();
                iGetDataCallback.onError(errorResult);
            }
        });
        try {
            if (!countDownLatch.await(30000, TimeUnit.MILLISECONDS)) {
                iGetDataCallback.onSuccess(null);
            }
        } catch (InterruptedException e) {
            iGetDataCallback.onSuccess(null);
            e.printStackTrace();
        }
    }
}
