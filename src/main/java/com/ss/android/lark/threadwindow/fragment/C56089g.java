package com.ss.android.lark.threadwindow.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.aj;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.C33201b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33212b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33215e;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.chatwindow.view.WindowAnimContainer;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2392o.AbstractC48702k;
import com.ss.android.lark.post.C52180b;
import com.ss.android.lark.share_group.C54821f;
import com.ss.android.lark.statistics.chat.ChatHitPointNew;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.threaddetail.C55831i;
import com.ss.android.lark.threadwindow.C56094g;
import com.ss.android.lark.threadwindow.C56119j;
import com.ss.android.lark.threadwindow.C56146m;
import com.ss.android.lark.threadwindow.MultitaskSharedThreadPropertiesViewModel;
import com.ss.android.lark.threadwindow.ThreadWindowView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.Objects;

/* renamed from: com.ss.android.lark.threadwindow.fragment.g */
public class C56089g extends BaseFragment implements AbstractC48702k {

    /* renamed from: a */
    public final AbstractC36474h f138694a;

    /* renamed from: b */
    public final IChatSettingDependency f138695b;

    /* renamed from: c */
    public C56119j f138696c;

    /* renamed from: d */
    public Chat f138697d;

    /* renamed from: e */
    public String f138698e;

    /* renamed from: f */
    public String f138699f;

    /* renamed from: g */
    public WindowAnimContainer f138700g;

    /* renamed from: h */
    public final ThreadWindowView.AbstractC56006a f138701h = new ThreadWindowView.AbstractC56006a() {
        /* class com.ss.android.lark.threadwindow.fragment.C56089g.C560901 */

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: c */
        public void mo191005c(String str) {
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: b */
        public Fragment mo191001b() {
            return C56089g.this;
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: a */
        public Activity mo190994a() {
            return C56089g.this.getActivity();
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: c */
        public void mo191004c() {
            C56089g.this.finish();
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: e */
        public FragmentManager mo191007e() {
            return C56089g.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: d */
        public void mo191006d() {
            C29990c.m110930b().mo134534a(C56089g.this.getContext());
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: a */
        public void mo190997a(ThreadWindowView threadWindowView) {
            ButterKnife.bind(threadWindowView, C56089g.this.f138700g);
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: a */
        public void mo190998a(String str) {
            C56089g.this.f138695b.mo134354a(mo190994a(), str, C56089g.this.f138697d.isThread());
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: b */
        public void mo191002b(Chat chat) {
            C29990c.m110930b().mo134506E().mo134367a(C56089g.this.getContext(), chat);
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: b */
        public void mo191003b(String str) {
            C29990c.m110930b().mo134595w().mo134361b(C56089g.this.getContext(), str);
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: a */
        public void mo190995a(Chat chat) {
            if (chat.getChatAnnouncement().isUseOpenDoc()) {
                Log.m165379d("gotoAnnouncementActivity", "AnnounceUrl = " + chat.getChatAnnouncement().getAnnounceUrl());
                C29990c.m110930b().mo134593u().mo134330a(C56089g.this.getContext(), chat.getChatAnnouncement().getAnnounceUrl() + "&sub_type=community");
                return;
            }
            C56089g.this.f138695b.mo134357a(C56089g.this.getContext(), chat.getId());
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: a */
        public void mo190996a(Chat chat, String str, RichText richText, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_params_chat", chat);
            bundle.putSerializable("key_params_richtext", richText);
            bundle.putString("key_params_text_hint", UIHelper.getString(R.string.Lark_Group_NewTopicRichtextTip));
            bundle.putBoolean("key_params_is_show_group", false);
            bundle.putBoolean("key_params_is_interrupt_at_all", z);
            C52180b.m202455a(mo190994a(), C56089g.this, bundle, 10086);
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: a */
        public void mo191000a(String str, boolean z, boolean z2, boolean z3) {
            C56089g.this.f138695b.mo134358a(C56089g.this.getContext(), str, 0, false, z, z2, z3);
        }

        @Override // com.ss.android.lark.threadwindow.ThreadWindowView.AbstractC56006a
        /* renamed from: a */
        public void mo190999a(String str, ThreadTopic threadTopic, Chat chat, boolean z, boolean z2, boolean z3, int i) {
            C55831i.m216682a(C56089g.this.requireActivity(), new C29604ae.C29606a().mo106670b(str).mo106663a(threadTopic).mo106664a(chat).mo106672c(chat.getName()).mo106673c(z).mo106675d(z2).mo106671b(false).mo106676e(z3).mo106677f(false).mo106662a(i).mo106678g(false).mo106668a());
        }
    };

    /* renamed from: a */
    public boolean mo191358a() {
        mo191360b();
        return true;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFragmentBringToFront() {
        C56119j jVar = this.f138696c;
        if (jVar != null) {
            jVar.mo191437e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C56119j jVar = this.f138696c;
        if (jVar != null) {
            jVar.destroy();
        }
        ChatParamUtils.m133150c();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C56119j jVar = this.f138696c;
        if (jVar != null) {
            jVar.mo191436d();
        }
    }

    public C56089g() {
        AbstractC36474h b = C29990c.m110930b();
        this.f138694a = b;
        this.f138695b = b.mo134595w();
    }

    /* renamed from: b */
    public void mo191360b() {
        C56119j jVar = this.f138696c;
        if (jVar != null) {
            jVar.destroy();
            this.f138696c = null;
        }
        m218517a(getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C56119j jVar = this.f138696c;
        if (jVar != null) {
            jVar.mo191435c();
        }
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.C56089g.RunnableC560923 */

            public void run() {
                if (C56089g.this.f138697d != null) {
                    ChatHitPointNew.f135660c.mo187382a(C56089g.this.f138697d, (String) null);
                    ChatTypeStateKeeper.Companion aVar = ChatTypeStateKeeper.f135671f;
                    boolean z = true;
                    ChatTypeStateKeeper.EnterChatParams.Builder d = new ChatTypeStateKeeper.EnterChatParams.Builder().mo187428a(C56089g.this.f138697d.getId()).mo187429a(C56089g.this.f138697d.isRemind()).mo187435c(true).mo187437d(C56089g.this.f138697d.isGroup());
                    if (C34339g.m133171e(C56089g.this.f138697d) != Chat.MessagePosition.RECENT_LEFT) {
                        z = false;
                    }
                    aVar.mo187406a(d.mo187441f(z).mo187431b(C56089g.this.f138699f).mo187451n());
                    ChatTypeStateKeeper.m213145a("topic_card");
                }
            }
        });
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo191360b();
    }

    @Override // com.ss.android.lark.p2392o.AbstractC48702k
    /* renamed from: a */
    public boolean mo129676a(String str) {
        return !Objects.equals(str, this.f138698e);
    }

    /* renamed from: a */
    private void m218517a(final Bundle bundle) {
        if (bundle != null) {
            final C33212b bVar = new C33212b(ChatBundle.m109260a(bundle));
            ChatParamUtils.m133142a(bVar.mo122433b(), C29990c.m110930b().mo134515N().mo134394a());
            C33201b.m128282a().mo122418a(bVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new UIGetDataCallback(new IGetDataCallback<C33215e>() {
                /* class com.ss.android.lark.threadwindow.fragment.C56089g.C560912 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C56089g.this.mo191357a(errorResult, bVar.mo122433b());
                }

                /* renamed from: a */
                public void onSuccess(C33215e eVar) {
                    boolean z;
                    if (eVar == null) {
                        return;
                    }
                    if (!eVar.mo122447c() || !(eVar.mo122443a() instanceof C35219b)) {
                        C56089g.this.mo191357a(eVar.mo122446b(), bVar.mo122433b());
                        return;
                    }
                    C56094g a = C56089g.this.mo191356a((C35219b) eVar.mo122443a());
                    Chat chat = a.f138711d;
                    MultitaskSharedThreadPropertiesViewModel eVar2 = (MultitaskSharedThreadPropertiesViewModel) aj.m5366a(C56089g.this.getActivity()).mo6005a(MultitaskSharedThreadPropertiesViewModel.class);
                    eVar2.setChatName(chat.getName());
                    eVar2.setChatId(chat.getId());
                    ChatParamUtils.m133138a(chat);
                    boolean z2 = true;
                    if (chat == null || chat.getRole().getNumber() != Chat.Role.MEMBER.getNumber()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean a2 = C56146m.m218890a(chat, a.f138714g);
                    if ((!z && !a2) || !C56089g.this.mo191359a(a)) {
                        z2 = false;
                    }
                    if (z2) {
                        C56089g gVar = C56089g.this;
                        gVar.f138696c = new C56119j(gVar.getActivity(), a, C56089g.this.f138701h);
                        C56089g.this.f138696c.create();
                        C29990c.m110930b().mo134512K().mo134687a(C56089g.this.mContext, a.f138710c);
                        return;
                    }
                    ChatBundle a3 = ChatBundle.m109260a(bundle);
                    C54821f.m212668a(C56089g.this.mContext, chat, a3.f74039m, a3.f74038l);
                    C56089g.this.f138694a.mo134512K().mo134688a(new Channel(Channel.Type.CHAT, a.f138710c));
                    C56089g.this.finish();
                    Log.m165397w(C56089g.this.TAG, "user not in the Chat");
                }
            })));
        }
    }

    /* renamed from: a */
    public C56094g mo191356a(C35219b bVar) {
        C56094g gVar = new C56094g();
        gVar.f138708a = bVar.f90952b;
        gVar.f138709b = bVar.f90953c;
        gVar.f138710c = bVar.f90955e;
        gVar.f138713f = bVar.f90954d;
        gVar.f138711d = bVar.f90956f;
        gVar.f138712e = bVar.f90958h;
        gVar.f138714g = bVar.f90961k;
        this.f138697d = gVar.f138711d;
        this.f138698e = gVar.f138710c;
        this.f138699f = bVar.f90952b;
        return gVar;
    }

    /* renamed from: a */
    public boolean mo191359a(C56094g gVar) {
        if (gVar == null) {
            Log.m165383e(this.TAG, "open thread failed，bundle is null!!!");
            return false;
        }
        String str = gVar.f138710c;
        if (TextUtils.isEmpty(str)) {
            Log.m165383e(this.TAG, "open thread failed，chatId is null!!!");
            return false;
        } else if (gVar.f138711d == null) {
            String str2 = this.TAG;
            Log.m165383e(str2, "open thread failed，chat is null，chatId: " + str);
            return false;
        } else if (gVar.f138712e == null) {
            String str3 = this.TAG;
            Log.m165383e(str3, "open thread failed，self is null，chatId: " + str);
            return false;
        } else {
            if (C29990c.m110930b().mo134586n().mo134685a("group.role.obeserver") && gVar.f138714g == null) {
                Log.m165383e(this.TAG, "open thread failed，topicGroup is null");
            }
            String str4 = this.TAG;
            Log.m165389i(str4, "open thread:" + gVar.f138711d);
            return true;
        }
    }

    /* renamed from: a */
    public void mo191357a(ErrorResult errorResult, String str) {
        LKUIToast.show(this.mContext, (int) R.string.Lark_Legacy_LaunchErrorChatWindow);
        if (errorResult != null && errorResult.getErrorCode() == 3) {
            this.f138694a.mo134512K().mo134688a(new Channel(Channel.Type.CHAT, str));
        }
        finish();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WindowAnimContainer windowAnimContainer = (WindowAnimContainer) layoutInflater.inflate(R.layout.activity_thread_window, viewGroup, false);
        this.f138700g = windowAnimContainer;
        return windowAnimContainer;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m218518a(String str, RichText richText, boolean z) {
        this.f138696c.mo191432a("", C59029c.m229155a());
        this.f138696c.mo191433a(str, richText, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 10086 && intent != null && this.f138696c != null) {
                String stringExtra = intent.getStringExtra("key_params_post_title");
                RichText richText = (RichText) intent.getSerializableExtra("key_params_post_richtext");
                boolean booleanExtra = intent.getBooleanExtra("key_params_is_anonymous", false);
                if (i2 == -1) {
                    UICallbackExecutor.executeDelayed(new Runnable(stringExtra, richText, booleanExtra) {
                        /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$g$n5NTd9pyFKm8IsnvvX1coEL55X8 */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ RichText f$2;
                        public final /* synthetic */ boolean f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            C56089g.this.m218518a(this.f$1, this.f$2, this.f$3);
                        }
                    }, 200);
                } else if (i2 == 0) {
                    this.f138696c.mo191432a(stringExtra, richText);
                }
            }
        } else if (intent != null && this.f138696c != null && i2 == -1) {
            this.f138696c.mo191430a((ThreadTopic) intent.getSerializableExtra("key_params_thread"));
        }
    }
}
