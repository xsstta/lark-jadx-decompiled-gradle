package com.ss.android.lark.threadtab;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.threadtab.C55973a;
import com.ss.android.lark.threadwindow.C56095h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import java.util.Collections;

/* renamed from: com.ss.android.lark.threadtab.a */
public class C55973a {

    /* renamed from: com.ss.android.lark.threadtab.a$a */
    public interface AbstractC55975a {
        /* renamed from: a */
        void mo187054a(String str);

        /* renamed from: b */
        void mo187055b(String str);

        /* renamed from: c */
        void mo187056c(String str);

        /* renamed from: d */
        void mo187057d(String str);

        /* renamed from: e */
        void mo187058e(String str);
    }

    /* renamed from: a */
    public static void m217525a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            UDToast.show(context, str);
        }
    }

    /* renamed from: a */
    public static void m217524a(Context context, ErrorResult errorResult) {
        if (BillingTipsDialog.m226153a(errorResult.getErrorCode())) {
            BillingTipsDialog.m226151a(context, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
        } else {
            new C25639g(context).mo89237b(errorResult.getDisplayMsg()).mo89251j(2).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    /* renamed from: a */
    private static void m217528a(String str, Context context) {
        C56095h.m218564a().mo191239a(Navigation.from(context), str, "group_share_card");
    }

    /* renamed from: a */
    public static void m217526a(Context context, String str, AbstractC55975a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str, context, aVar) {
            /* class com.ss.android.lark.threadtab.$$Lambda$a$8RAtCzl4WfBGgRpotFRMHB1vFs */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ C55973a.AbstractC55975a f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C55973a.m217529a(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m217529a(String str, Context context, AbstractC55975a aVar) {
        UICallbackExecutor.execute(new Runnable(context, str, aVar) {
            /* class com.ss.android.lark.threadtab.$$Lambda$a$xulVJ44VrgfoTPr0BT_JEbbvnWo */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ C55973a.AbstractC55975a f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C55973a.m217527a(Chat.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m217527a(Chat chat, final Context context, final String str, final AbstractC55975a aVar) {
        if (chat == null) {
            if (aVar != null) {
                aVar.mo187056c(str);
            }
        } else if (chat.getRole().getNumber() == Chat.Role.MEMBER.getNumber()) {
            m217528a(str, context);
            if (aVar != null) {
                aVar.mo187055b(str);
            }
        } else if (chat.isPublic() && chat.getRole().getNumber() != Chat.Role.MEMBER.getNumber()) {
            C29990c.m110930b().mo134521T().mo134715a(context, str, Collections.singletonList(C29990c.m110930b().mo134515N().mo134394a()), 4, new AbstractC44896a() {
                /* class com.ss.android.lark.threadtab.C55973a.C559741 */

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: b */
                public void mo128966b() {
                    AbstractC55975a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo187058e(str);
                    }
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128963a() {
                    AbstractC55975a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo187054a(str);
                    }
                    C55973a.m217525a(context, UIHelper.getString(R.string.Lark_Legacy_RequestSentApprovalPendingToast));
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128965a(String str) {
                    AbstractC55975a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo187055b(str);
                    }
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128964a(ErrorResult errorResult) {
                    AbstractC55975a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo187056c(str);
                    }
                    C55973a.m217524a(context, errorResult);
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: b */
                public void mo128967b(ErrorResult errorResult) {
                    AbstractC55975a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo187057d(str);
                    }
                    C55973a.m217525a(context, errorResult.getDisplayMsg());
                    Log.m165382e(errorResult.toString());
                }
            });
        } else if (aVar != null) {
            aVar.mo187056c(str);
        }
    }
}
