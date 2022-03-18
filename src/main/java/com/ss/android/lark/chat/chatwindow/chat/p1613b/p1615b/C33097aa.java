package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b;

import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.base.model.p1602a.C32922c;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33304n;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.service.impl.C34146aa;
import com.ss.android.lark.chatwindow.C35249h;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.chatwindow.p1723b.C35237c;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.reaction.widget.detailwindow.C53002b;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.p2704r.C54984a;
import com.ss.android.lark.statistics.reaction.ReactionHitPoint;
import com.ss.android.lark.statistics.redpacket.RedPacketHitPoint;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.b.aa */
public class C33097aa implements AbstractC33304n {

    /* renamed from: a */
    FragmentActivity f85242a;

    /* renamed from: b */
    String f85243b;

    /* renamed from: c */
    AbstractC33342d f85244c;

    /* renamed from: d */
    boolean f85245d;

    /* renamed from: a */
    private AbstractC34006a m127996a(String str) {
        return (AbstractC34006a) C32920b.from(this.f85242a).dispatchSyncQuery(new C32922c(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m127997b(String str) {
        C29990c.m110930b().mo134523V().mo134436a(this.f85242a, new ProfileSource.C36868a().mo136066c(str).mo136065b(this.f85243b).mo136060a(4).mo136063a());
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33304n
    /* renamed from: a */
    public void mo122265a(String str, String str2) {
        AbstractC34006a a = m127996a(str);
        if (a != null) {
            C53002b a2 = C53002b.m205273a(C35237c.m137597a(a.getReactionInfoList(), this.f85245d), str2);
            a2.mo181046a(new C53002b.AbstractC53005b() {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.$$Lambda$aa$UCqLauSBauDp33qmo3LBQwqUOJ8 */

                @Override // com.ss.android.lark.reaction.widget.detailwindow.C53002b.AbstractC53005b
                public final void onItemClicked(String str) {
                    C33097aa.this.m127997b(str);
                }
            });
            a2.mo181044a(this.f85242a.getSupportFragmentManager());
        }
    }

    public C33097aa(FragmentActivity fragmentActivity, String str, AbstractC33342d dVar) {
        this.f85242a = fragmentActivity;
        this.f85243b = str;
        this.f85244c = dVar;
        this.f85245d = dVar.mo122545i();
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33304n
    /* renamed from: a */
    public void mo122266a(String str, String str2, int i) {
        int i2;
        AbstractC34006a a = m127996a(str);
        if (a != null) {
            boolean a2 = C35249h.m137636a(a.getReactionInfoList(), str2, C29990c.m110930b().mo134515N().mo134394a());
            ReactionHitPoint.Companion aVar = ReactionHitPoint.f135903c;
            boolean j = this.f85244c.mo122546j();
            if (this.f85244c.mo122550n() != null) {
                i2 = this.f85244c.mo122550n().getType().getNumber();
            } else {
                i2 = 0;
            }
            final String a3 = aVar.mo187696a(str2, str, a2, j, i2, a.getMessage().getType().getNumber());
            boolean z = !a2;
            if (z) {
                Message message = a.getMessage();
                MessageHitPoint.f135779d.mo187531a(message.getId(), Integer.valueOf(message.getType().getNumber()), message.getChatId(), str2, Integer.valueOf(i), C54984a.m213523b(), this.f85244c.mo122550n());
                if (a.getMessage().getType() == Message.Type.RED_PACKET) {
                    RedPacketHitPoint.f135904a.mo187703a();
                }
            }
            if (z) {
                C35234b.m137579e().mo121401a(str2);
            }
            ReactionHitPoint.f135903c.mo187700a(a3, "sdk_cost");
            C34146aa.m132620b().mo121409a(str, str2, a2, new IGetDataCallback<Integer>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33097aa.C330981 */

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    ReactionHitPoint.f135903c.mo187702b(a3, "sdk_cost");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (errorResult.getErrorCode() == 6003) {
                        LKUIToast.show(C33097aa.this.f85242a, errorResult.getDisplayMsg());
                    }
                    Log.m165384e("chatwindow", "Reaction send failed:", errorResult);
                    ReactionHitPoint.f135903c.mo187698a(ErrorType.SDK, errorResult.getErrorCode(), errorResult.getDebugMsg());
                }
            });
        }
    }
}
