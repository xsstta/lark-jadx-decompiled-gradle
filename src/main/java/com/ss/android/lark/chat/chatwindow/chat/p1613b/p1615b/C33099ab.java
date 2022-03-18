package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.base.model.dispatch.RemoveTopNoticeMsgAction;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.view.WindowDialogManager;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.statistics.doc.DocHitPoint;
import com.ss.android.lark.statistics.p2701o.C54970a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.ab */
public class C33099ab implements AbstractC33125n {

    /* renamed from: a */
    public final FragmentActivity f85248a;

    public C33099ab(FragmentActivity fragmentActivity) {
        this.f85248a = fragmentActivity;
    }

    /* renamed from: b */
    private void m128002b(final AbsMessageVO aVar) {
        C32848e.m126401b().mo121096a(aVar.mo121681a(), aVar.mo121695c(), new UIGetDataCallback<String>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33099ab.C331001 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                if (errorResult == null || TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    LKUIToast.show(C33099ab.this.f85248a, UIHelper.getString(R.string.Lark_Legacy_FileWithdrawNow));
                    return;
                }
                Log.m165397w("RecallMenuHandler", errorResult.toString());
                LKUIToast.show(C33099ab.this.f85248a, errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccessed(String str) {
                ContentVO g = aVar.mo121699g();
                if ((g instanceof TextContentVO) && ((TextContentVO) g).mo121792l()) {
                    LKUIToast.show(C33099ab.this.f85248a, (int) R.string.Lark_Legacy_ChatDocMessageRecallTip);
                    DocHitPoint.f135699a.mo187453a();
                } else if (C34352r.m133229a(aVar)) {
                    Log.m165389i("RecallMenuHandler", "doRecallMessage show mail share toast");
                    LKUIToast.show(C33099ab.this.f85248a, (int) R.string.Lark_Legacy_ChatMailMessageRecallTip);
                } else if ((g instanceof AudioContentVO) && C36894a.m145605a().mo136206c(((AudioContentVO) g).mo121816k())) {
                    C36894a.m145605a().mo136207d();
                }
                C32920b.from(C33099ab.this.f85248a).dispatch(new RemoveTopNoticeMsgAction(aVar.mo121681a(), true));
            }
        });
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33125n
    /* renamed from: a */
    public void mo122268a(AbsMessageVO aVar) {
        C25639g gVar = new C25639g(this.f85248a);
        gVar.mo89238b(true);
        if (aVar.mo121695c()) {
            gVar.mo89248g(R.string.Lark_Legacy_MessageRecallTip);
            gVar.mo89251j(2);
        } else {
            gVar.mo89248g(R.string.Lark_Legacy_ChatWithdrow);
            gVar.mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MessageGroupRecallTip, "msg_sender", aVar.mo121657C().mo124205d()));
        }
        C25639g a = gVar.mo89245d(0.3f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(aVar) {
            /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.$$Lambda$ab$LHdCGbpzZ2vHRc01IhtcPdFQjI */
            public final /* synthetic */ AbsMessageVO f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C33099ab.this.m128001a(this.f$1, dialogInterface, i);
            }
        });
        if (DesktopUtil.m144307b()) {
            a.mo89222a(440.0f);
        }
        WindowDialogManager.f91123a.mo129819a(a.mo89239c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m128001a(AbsMessageVO aVar, DialogInterface dialogInterface, int i) {
        C54970a.m213419a(15, true);
        m128002b(aVar);
    }
}
