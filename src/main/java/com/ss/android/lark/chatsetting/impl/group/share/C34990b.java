package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.billing.BillingTipsDialog;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.b */
public class C34990b extends AbstractC29186b {

    /* renamed from: a */
    public final AbstractC34461c.AbstractC34466e f90314a = ChatSettingModule.m133639a().mo127274d();

    /* renamed from: b */
    private final AbstractC34461c.AbstractC34473l f90315b = ChatSettingModule.m133639a().mo127281k();

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: a */
    public boolean mo103482a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.applink.AbstractC29186b
    /* renamed from: b */
    public boolean mo103462b(Context context, AppLink appLink) {
        return true;
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: d */
    public boolean mo103484d(Context context, AppLink appLink) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Chat m136240a(String str) {
        return this.f90314a.mo127349b(str);
    }

    /* renamed from: a */
    public static void m136242a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            UDToast.show(context, str);
        }
    }

    /* renamed from: a */
    public static void m136241a(Context context, ErrorResult errorResult) {
        if (BillingTipsDialog.m226153a(errorResult.getErrorCode())) {
            BillingTipsDialog.m226151a(context, errorResult.getDisplayMsg(), BillingTipsDialog.Type.CHAT_JOIN_GROUP_NUMBER_LIMIT);
        } else {
            new C25639g(context).mo89237b(errorResult.getDisplayMsg()).mo89251j(2).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    @Override // com.ss.android.lark.applink.AbstractC29194f
    /* renamed from: c */
    public boolean mo103483c(Context context, AppLink appLink) {
        if (context == null) {
            return false;
        }
        String a = appLink.mo103435a();
        Uri parse = Uri.parse(a);
        String queryParameter = parse.getQueryParameter("chatId");
        String queryParameter2 = parse.getQueryParameter(BottomDialog.f17198f);
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            Log.m165389i("GroupJoinAppLinkHandler", "chatId or chatterId is empty");
            return true;
        }
        Log.m165389i("GroupJoinAppLinkHandler", "handle:" + a);
        C57865c.m224574a(new C57865c.AbstractC57873d(queryParameter) {
            /* class com.ss.android.lark.chatsetting.impl.group.share.$$Lambda$b$7pFnfeT0TuibE5nTPhldAvNzpc */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C34990b.this.m136240a(this.f$1);
            }
        }, new C57865c.AbstractC57871b(context, queryParameter, Collections.singletonList(queryParameter2)) {
            /* class com.ss.android.lark.chatsetting.impl.group.share.$$Lambda$b$XoC2KTcmwVA2Jakd8r1lR7jXvYg */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ List f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                C34990b.this.m136244a(this.f$1, this.f$2, this.f$3, (Chat) obj);
            }
        });
        return true;
    }

    /* renamed from: a */
    private void m136243a(final Context context, String str, List<String> list) {
        this.f90315b.mo127405a(context, str, list, 2, new AbstractC44896a() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.C34990b.C349911 */

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: b */
            public void mo128966b() {
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128963a() {
                C34990b.m136242a(context, UIHelper.getString(R.string.Lark_Legacy_RequestSentApprovalPendingToast));
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128964a(ErrorResult errorResult) {
                C34990b.m136241a(context, errorResult);
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128965a(String str) {
                C34990b.this.f90314a.mo127318a(context, str);
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: b */
            public void mo128967b(ErrorResult errorResult) {
                C34990b.m136242a(context, errorResult.getDisplayMsg());
                Log.m165383e("GroupJoinAppLinkHandler", errorResult.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m136244a(Context context, String str, List list, Chat chat) {
        if (chat == null) {
            Log.m165389i("GroupJoinAppLinkHandler", "unable to get chatChatter");
        } else if (chat.getRole() == Chat.Role.MEMBER) {
            this.f90314a.mo127318a(context, str);
        } else {
            m136243a(context, str, list);
        }
    }
}
