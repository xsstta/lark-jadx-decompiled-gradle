package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.base.model.dispatch.RemoveTopNoticeMsgAction;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.base.model.p1602a.C32923d;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33395d;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.p2701o.C54970a;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.a */
public class C33095a implements AbstractC33115d {

    /* renamed from: a */
    FragmentActivity f85239a;

    public C33095a(FragmentActivity fragmentActivity) {
        this.f85239a = fragmentActivity;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33115d
    /* renamed from: a */
    public void mo122263a(ChatMessageVO<?> cVar) {
        String a = cVar.mo121681a();
        boolean ai2 = cVar.ai();
        boolean U = cVar.mo124248U();
        if (DesktopUtil.m144307b()) {
            new C25639g(this.f85239a).mo89222a(440.0f).mo89248g(R.string.Lark_Legacy_Delete).mo89238b(true).mo89254m(R.string.Lark_Legacy_ChatDeleteTip).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener(a, ai2, U) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.$$Lambda$a$Njm25spXPJUc000VClPvuxUbSP4 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ boolean f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C33095a.this.m127993a(this.f$1, this.f$2, this.f$3, dialogInterface, i);
                }
            }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89239c();
        } else {
            ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(this.f85239a).mo89248g(R.string.Lark_Legacy_ChatDeleteTip)).mo89251j(2)).mo89206a(UIUtils.getString(this.f85239a, R.string.Lark_Legacy_Delete))).mo89202a(new DialogInterface.OnClickListener(cVar, a, ai2, U) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.$$Lambda$a$qte09qFU44Kj00CvoVCCvlGykCM */
                public final /* synthetic */ ChatMessageVO f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C33095a.this.m127991a(this.f$1, this.f$2, this.f$3, this.f$4, dialogInterface, i);
                }
            })).mo89290y(0).mo89209c(R.color.function_danger_500)).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_cancel).mo89269b(R.string.Lark_Legacy_Cancel).mo89271d(R.color.text_title))).mo89239c();
        }
        MessageHitPoint.f135779d.mo187539b();
        ChatHitPointNew.f135660c.mo187389a(cVar.mo121692b(), ChatParamUtils.f88665a.mo126912a(cVar));
    }

    /* renamed from: a */
    private void m127992a(final String str, boolean z, boolean z2) {
        MessageHitPoint.f135779d.mo187548c();
        C54970a.m213419a(23, true);
        PerfChatPerformanceMonitor.m213458a(str);
        C32848e.m126401b().mo121097a(str, z, z2, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33095a.C330961 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                LKUIToast.show(C33095a.this.f85239a, errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_DeleteFail)));
                PerfChatPerformanceMonitor.m213454a();
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                C32923d dVar = new C32923d(new AbstractC34417b.C34425g(str), new C33395d());
                RemoveTopNoticeMsgAction fVar = new RemoveTopNoticeMsgAction(str, false);
                C32920b from = C32920b.from(C33095a.this.f85239a);
                from.dispatch(dVar);
                from.dispatch(fVar);
                PerfChatPerformanceMonitor.m213454a();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m127993a(String str, boolean z, boolean z2, DialogInterface dialogInterface, int i) {
        m127992a(str, z, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m127991a(ChatMessageVO cVar, String str, boolean z, boolean z2, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            ChatHitPointNew.f135660c.mo187398c(cVar.mo121692b(), "delete", "im_chat_main_view", ChatParamUtils.f88665a.mo126912a(cVar));
            m127992a(str, z, z2);
        }
    }
}
