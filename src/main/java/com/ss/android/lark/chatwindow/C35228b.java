package com.ss.android.lark.chatwindow;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.service.AbstractC32816a;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.chatwindow.chat.model.p1636b.C33397a;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.C33201b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33212b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33213c;
import com.ss.android.lark.chat.chatwindow.chat.v2.ChatWindowFragment;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share_group.C54834h;
import com.ss.android.lark.threadwindow.C56095h;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.utils.statistics.PerfLog;

/* renamed from: com.ss.android.lark.chatwindow.b */
public class C35228b implements AbstractC32816a {

    /* renamed from: a */
    private final AbstractC34296k f90980a = C32821b.m126120a();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatwindow.b$a */
    public static final class C35231a {

        /* renamed from: a */
        public static final C35228b f90987a = new C35228b();
    }

    /* renamed from: a */
    public static AbstractC32816a m137564a() {
        return C35231a.f90987a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137565a(Bundle bundle) {
        UICallbackExecutor.execute(new Runnable(bundle) {
            /* class com.ss.android.lark.chatwindow.$$Lambda$b$yxLGmmxsd55hRkcaY3i99zOdR4g */
            public final /* synthetic */ Bundle f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                C35228b.m137570b(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137567a(Navigation navigation) {
        LKUIToast.show(navigation.getContext(), (int) R.string.Lark_Legacy_ChatInexistent);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m137570b(Bundle bundle) {
        ChatWindowFragment aVar = new ChatWindowFragment();
        aVar.setArguments(bundle);
        String b = C29990c.m110930b().mo134512K().mo134692b();
        C36512a.m144041a().mo134763a(aVar, (MainWindowParams) new MainWindowParams.C36570a(ContainerType.Right).mo134958a(b).mo134953b(true).mo134930b());
        PerfLog.end("prepare_chat_window", "in desk mode");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137566a(Chat chat, Bundle bundle) {
        if (chat != null) {
            bundle.putBoolean("extra_is_secret_chat", chat.isSecret());
            bundle.putInt("extra_chat_mode", chat.getChatMode().getNumber());
        }
    }

    /* renamed from: a */
    private void m137569a(final Navigation navigation, final ChatBundle chatBundle) {
        Log.m165389i("ChatLauncher", "start checkChatType");
        if (!TextUtils.isEmpty(chatBundle.f74028b)) {
            this.f90980a.mo121031a(false, chatBundle.f74028b, chatBundle.f74046t, (IGetDataCallback<Chat>) new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatwindow.C35228b.C352291 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat == null) {
                        Log.m165397w("ChatLauncher", "create chat failed, chat is empty");
                        return;
                    }
                    chatBundle.mo105918a(chat.getId());
                    C35228b.this.mo129688a(navigation, chat.getChatMode(), chat, chatBundle);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("ChatLauncher", "create chat failed:" + errorResult.getDisplayMsg());
                    C35212a.m137528a(navigation.getContext(), errorResult, (DialogInterface.OnClickListener) null);
                    C35212a.m137538a(ChatBundle.ChatType.SINGLE, false, errorResult);
                }
            });
        } else {
            this.f90980a.mo120994a(chatBundle.f74027a, new IGetDataCallback<Chat>() {
                /* class com.ss.android.lark.chatwindow.C35228b.C352302 */

                /* renamed from: a */
                public void onSuccess(Chat chat) {
                    if (chat == null) {
                        Log.m165397w("ChatLauncher", "openChat failed, chat is empty");
                    } else {
                        C35228b.this.mo129688a(navigation, chat.getChatMode(), chat, chatBundle);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (errorResult.getErrorCode() == 0) {
                        C35228b.this.mo129688a(navigation, chatBundle.f74035i, (Chat) null, chatBundle);
                    }
                    Log.m165383e("ChatLauncher", "openChat get chat failed");
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32816a
    /* renamed from: a */
    public void mo121114a(Context context, ChatBundle chatBundle) {
        boolean z;
        Navigation from = Navigation.from(context);
        C33397a.m129383a();
        if (!TextUtils.isEmpty(chatBundle.f74027a) || !TextUtils.isEmpty(chatBundle.f74028b)) {
            if (!(chatBundle.f74034h == null || chatBundle.f74034h == ChatBundle.SourceType.FEED || chatBundle.f74034h == ChatBundle.SourceType.SHORTCUT)) {
                C29990c.m110930b().mo134577e().mo120957a(chatBundle.f74034h.value);
                PerfLog.start("open_chat", "");
            }
            if (TextUtils.isEmpty(chatBundle.f74027a) || chatBundle.f74035i == Chat.ChatMode.UNKNOWN) {
                z = true;
            } else {
                z = false;
            }
            Log.m165389i("ChatLauncher", "openChat isChatTypeUnknown: " + z + "/" + chatBundle.f74035i);
            if (z) {
                m137569a(from, chatBundle);
            } else {
                mo129688a(from, chatBundle.f74035i, (Chat) null, chatBundle);
            }
        } else {
            Log.m165397w("ChatLauncher", "openChat failed, chatId or chatterId is empty");
        }
    }

    /* renamed from: a */
    private void m137568a(Navigation navigation, Bundle bundle, int i, int i2) {
        PerfLog.start("prepare_chat_window", "");
        ChatBundle a = ChatBundle.m109260a(bundle);
        C33201b.m128282a().mo122421b(new C33212b(a));
        C33201b.m128282a().mo122421b(new C33213c(a.f74027a, a.f74029c));
        if (DesktopUtil.m144301a(navigation.getContext())) {
            navigation.openActivity(ChatWindowFragment.class.getName(), new Navigation.AbstractC57856b(bundle) {
                /* class com.ss.android.lark.chatwindow.$$Lambda$b$NnvXS09kEV6adbQd7sfDv3Ps8 */
                public final /* synthetic */ Bundle f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57856b
                public final void onOpenPage() {
                    C35228b.m137565a(this.f$0);
                }
            });
            return;
        }
        Intent intent = new Intent(navigation.getContext(), ChatWindowActivity.class);
        if (i2 != -1) {
            intent.setFlags(i2);
        }
        intent.putExtras(bundle);
        intent.putExtra("multi_task_transition", i);
        ChatWindowManager.m137600b().mo129697a(navigation, intent, i2);
        PerfLog.end("prepare_chat_window", "");
        C29990c.m110930b().mo134577e().mo120966b(true);
    }

    /* renamed from: a */
    public void mo129688a(Navigation navigation, Chat.ChatMode chatMode, Chat chat, ChatBundle chatBundle) {
        boolean z;
        boolean z2 = true;
        if (chatMode == Chat.ChatMode.THREAD_V2) {
            z = true;
        } else {
            z = false;
        }
        if (chat == null || chat.getRole().getNumber() == Chat.Role.MEMBER.getNumber()) {
            z2 = false;
        }
        if (z2 && chatBundle.f74052z) {
            C54834h.m212701a(navigation.getContext(), chatBundle.f74027a, chatBundle.f74039m, chatBundle.f74038l);
        } else if (z) {
            C56095h.m218564a().mo191239a(navigation, chatBundle.f74027a, chatBundle.f74030d);
        } else if (z2) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.chatwindow.$$Lambda$b$skXxVTXvilDkP0KN3zLthePd96Y */

                public final void run() {
                    C35228b.m137567a(Navigation.this);
                }
            });
        } else {
            m137568a(navigation, chatBundle.mo105916a(new ChatBundle.AbstractC29591b() {
                /* class com.ss.android.lark.chatwindow.$$Lambda$b$_T4acLXHGrGSFxXRfI_I2ZYURU8 */

                @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
                public final void inject(Bundle bundle) {
                    C35228b.m137566a(Chat.this, bundle);
                }
            }), chatBundle.f74043q, chatBundle.f74033g);
        }
    }
}
