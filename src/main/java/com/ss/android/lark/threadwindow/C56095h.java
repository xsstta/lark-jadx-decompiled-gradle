package com.ss.android.lark.threadwindow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.C33201b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33212b;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadwindow.fragment.C56089g;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.utils.statistics.PerfLog;

/* renamed from: com.ss.android.lark.threadwindow.h */
public class C56095h implements AbstractC56055d {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.threadwindow.h$a */
    public static final class C56096a {

        /* renamed from: a */
        public static final C56095h f138715a = new C56095h();
    }

    /* renamed from: a */
    public static AbstractC56055d m218564a() {
        return C56096a.f138715a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m218565a(Bundle bundle) {
        C56089g gVar = new C56089g();
        gVar.setArguments(bundle);
        UICallbackExecutor.execute(new Runnable((MainWindowParams) new MainWindowParams.C36570a(ContainerType.Right).mo134958a(C29990c.m110930b().mo134512K().mo134692b()).mo134953b(true).mo134930b()) {
            /* class com.ss.android.lark.threadwindow.$$Lambda$h$2KlzpskTkdIFnWWnimse9dsx_0U */
            public final /* synthetic */ MainWindowParams f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C56095h.m218566a(C56089g.this, this.f$1);
            }
        });
        PerfLog.end("prepare_chat_window", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m218566a(C56089g gVar, MainWindowParams mainWindowParams) {
        C36512a.m144041a().mo134763a(gVar, mainWindowParams);
    }

    /* renamed from: a */
    private void m218568a(String str, String str2) {
        C33201b.m128282a().mo122421b(new C33212b(ChatBundle.m109259a().mo105927a(str).mo105933c(str2).mo105926a(Chat.ChatMode.THREAD).mo105929a()));
    }

    @Override // com.ss.android.lark.threadwindow.AbstractC56055d
    /* renamed from: a */
    public void mo191239a(Navigation navigation, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.m165382e("topicGroupId == null");
        } else {
            m218569b(navigation, str, str2);
        }
    }

    /* renamed from: b */
    private void m218569b(Navigation navigation, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            LKUIToast.show(navigation.getContext(), (int) R.string.Lark_Legacy_LaunchErrorChatWindow);
            return;
        }
        AbstractC32812c e = C29990c.m110930b().mo134577e();
        if (str2 != null) {
            str3 = str2;
        } else {
            str3 = "";
        }
        e.mo120957a(ChatBundle.SourceType.fromValue(str3).value);
        PerfLog.start("open_chat", "");
        m218568a(str, str2);
        m218567a(navigation, str, -1, str2);
    }

    /* renamed from: a */
    private void m218567a(Navigation navigation, String str, int i, String str2) {
        PerfLog.start("prepare_chat_window", "");
        Bundle a = ChatBundle.m109259a().mo105927a(str).mo105933c(str2).mo105929a().mo105916a((ChatBundle.AbstractC29591b) null);
        if (DesktopUtil.m144301a(navigation.getContext())) {
            navigation.openActivity(C56089g.class.getName(), new Navigation.AbstractC57856b(a) {
                /* class com.ss.android.lark.threadwindow.$$Lambda$h$Ci0lImtfGzeH17puqKGD4CHDgnw */
                public final /* synthetic */ Bundle f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57856b
                public final void onOpenPage() {
                    C56095h.m218565a(this.f$0);
                }
            });
            return;
        }
        Intent intent = new Intent(navigation.getContext(), ThreadWindowActivity.class);
        intent.putExtras(a);
        if (i != -1) {
            intent.setFlags(i);
        }
        if (!(navigation.getContext() instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Activity b = C29990c.m110930b().aa().mo134607b();
        if (!(b instanceof ThreadWindowActivity) || !TextUtils.equals(b.getIntent().getStringExtra("chatID"), str)) {
            navigation.openActivity(intent);
            PerfLog.end("prepare_chat_window", "");
            PerfLog.start("open_thread_activity", "");
            return;
        }
        Log.m165389i("ThreadWindowLauncher", "ThreadWindowActivity repeat entry，chatId =  " + str);
    }
}
