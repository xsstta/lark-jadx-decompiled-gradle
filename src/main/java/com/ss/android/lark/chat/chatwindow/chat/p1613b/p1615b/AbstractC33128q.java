package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.p1690c.C34438a;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.q */
public interface AbstractC33128q {
    /* renamed from: a */
    <M extends AbsMessageVO<?>> void mo122318a(View view, M m);

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.q$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Incorrect args count in method signature: <M:Lcom/ss/android/lark/chat/e/a<*>;>(Landroid/view/View;TM;)V */
        public static void $default$a(AbstractC33128q qVar, View view, AbsMessageVO aVar) {
            if (aVar.mo121710r() == Message.Type.TEXT || aVar.mo121710r() == Message.Type.POST) {
                CharSequence b = C34438a.m133586b(view.getContext(), aVar.mo121699g().mo126168z());
                CharSequence a = C34438a.m133569a(aVar);
                if (!TextUtils.isEmpty(a)) {
                    b = a;
                }
                if (!TextUtils.isEmpty(b)) {
                    C29990c.m110930b().ae().mo134460a(view.getContext(), b.toString(), "", 0);
                }
            }
        }
    }
}
