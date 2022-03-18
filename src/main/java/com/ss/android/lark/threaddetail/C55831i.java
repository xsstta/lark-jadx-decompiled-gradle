package com.ss.android.lark.threaddetail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32881i;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.dependency.AbstractC36473g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.threaddetail.C55831i;
import com.ss.android.lark.threaddetail.p2749a.C55772a;
import com.ss.android.lark.threadwindow.C56146m;
import java.util.Collections;

/* renamed from: com.ss.android.lark.threaddetail.i */
public class C55831i {
    /* renamed from: a */
    public static void m216684a(Context context, String str) {
        m216689c(context, str, "");
    }

    /* renamed from: a */
    public static void m216682a(Context context, C29604ae aeVar) {
        if (TextUtils.isEmpty(aeVar.f74174a)) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_LaunchErrorChatWindow);
        } else {
            m216681a(context, aeVar.mo106661a());
        }
    }

    /* renamed from: a */
    private static void m216681a(Context context, Bundle bundle) {
        C29990c.m110930b().mo134577e().mo120957a(ChatBundle.SourceType.FEED.value);
        if (DesktopUtil.m144301a(context)) {
            C55772a aVar = new C55772a();
            aVar.setArguments(bundle);
            if (bundle.getBoolean("key_params_is_open_in_right_window")) {
                C36512a.m144041a().mo134763a(aVar, new MainWindowParams(ContainerType.Right, C29990c.m110930b().mo134512K().mo134692b()));
                return;
            }
            C36512a.m144041a().mo134761a(aVar, new DrawerParams.C36565a().mo134928a(-1).mo134930b());
            return;
        }
        Intent intent = new Intent(context, ThreadDetailActivity.class);
        intent.putExtras(bundle);
        boolean z = context instanceof Activity;
        if (!z) {
            intent.addFlags(268435456);
        }
        Activity b = C29990c.m110930b().aa().mo134607b();
        if ((b instanceof ThreadDetailActivity) && TextUtils.equals(b.getIntent().getStringExtra("key_params_thread_id"), bundle.getString("key_params_thread_id"))) {
            return;
        }
        if (z) {
            ((Activity) context).startActivityForResult(intent, 1);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: c */
    private static void m216689c(Context context, String str, String str2) {
        C29604ae.C29606a aVar = new C29604ae.C29606a();
        aVar.mo106670b(str);
        aVar.mo106674d(str2);
        m216682a(context, aVar.mo106668a());
    }

    /* renamed from: a */
    private static void m216683a(Context context, Chat chat, String str) {
        if (chat.getAddMemberApply() == Chat.AddMemberApply.NEED_APPLY) {
            AbstractC36474h b = C29990c.m110930b();
            Activity b2 = b.aa().mo134607b();
            if (b2 != null) {
                b.mo134595w().mo134355a(b2, new IChatSettingDependency.AbstractC36448a(b2, chat) {
                    /* class com.ss.android.lark.threaddetail.$$Lambda$i$adSALSFajBmoDzQGdJIKrSTC0M */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ Chat f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.dependency.IChatSettingDependency.AbstractC36448a
                    public final void onClick(View view, String str) {
                        C55831i.m216680a(this.f$0, this.f$1, view, str);
                    }
                });
                return;
            }
            return;
        }
        m216687b(context, chat, str);
    }

    /* renamed from: b */
    private static void m216687b(final Context context, Chat chat, final String str) {
        C558321 r0 = new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.threaddetail.C55831i.C558321 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                C55831i.m216684a(context, str);
                C29990c.m110930b().mo134512K().mo134694b(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC36473g v = C29990c.m110930b().mo134594v();
                if (errorResult.getErrorCode() == v.mo134498b()) {
                    v.mo134499b(context, errorResult.getDisplayMsg(v.mo134501c()));
                } else if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    UICallbackExecutor.execute(new Runnable(context, errorResult) {
                        /* class com.ss.android.lark.threaddetail.$$Lambda$i$1$v22ATdXtZgV8mOfFEKf6GZGZeW0 */
                        public final /* synthetic */ Context f$0;
                        public final /* synthetic */ ErrorResult f$1;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C55831i.C558321.m216692a(this.f$0, this.f$1);
                        }
                    });
                    Log.m165386e("CardMessageUrlInterceptor", errorResult.getException());
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m216692a(Context context, ErrorResult errorResult) {
                LKUIToast.show(context, errorResult.getDisplayMsg());
            }
        };
        C32821b.m126120a().mo121007a(chat.getId(), (Iterable<String>) Collections.singletonList(C29990c.m110930b().mo134515N().mo134394a()), (IGetDataCallback<Chat>) r0);
    }

    /* renamed from: d */
    private static void m216690d(final Context context, String str, String str2) {
        C32821b.m126120a().mo120995a(str, AddChatChatterApply.Ways.VIA_SEARCH, Collections.singletonList(C29990c.m110930b().mo134515N().mo134394a()), str2, (String) null, "", new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.threaddetail.C55831i.C558332 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                UICallbackExecutor.execute(new Runnable(context) {
                    /* class com.ss.android.lark.threaddetail.$$Lambda$i$2$mbCH2KlVzq3L8GuCMwyqTzdqW6o */
                    public final /* synthetic */ Context f$0;

                    {
                        this.f$0 = r1;
                    }

                    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.replaceUnknownTypes(MethodInvokeVisitor.java:299)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:258)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                        */
                    public final void run() {
                        /*
                            r1 = this;
                            android.content.Context r0 = r1.f$0
                            com.ss.android.lark.threaddetail.C55831i.C558332.lambda$mbCH2KlVzq3L8GuCMwyqTzdqW6o(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.threaddetail.$$Lambda$i$2$mbCH2KlVzq3L8GuCMwyqTzdqW6o.run():void");
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                    UICallbackExecutor.execute(new Runnable(context, errorResult) {
                        /* class com.ss.android.lark.threaddetail.$$Lambda$i$2$SNn2IcUvOW2UyCr5F5uvhPwotw */
                        public final /* synthetic */ Context f$0;
                        public final /* synthetic */ ErrorResult f$1;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C55831i.C558332.m216695a(this.f$0, this.f$1);
                        }
                    });
                    Log.m165386e("CardMessageUrlInterceptor", errorResult.getException());
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m216695a(Context context, ErrorResult errorResult) {
                LKUIToast.show(context, errorResult.getDisplayMsg());
            }
        }));
    }

    /* renamed from: a */
    public static void m216685a(Context context, String str, String str2) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(context, str, str2) {
            /* class com.ss.android.lark.threaddetail.$$Lambda$i$ztSYHd_BYeli6RIQ4pVhPt7Eo4 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C55831i.m216688b(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m216688b(Context context, String str, String str2) {
        Chat chat = C32821b.m126120a().mo121046c(Collections.singletonList(str)).get(str);
        if (chat == null || !chat.isPublic()) {
            Log.m165383e("CardMessageUrlInterceptor", "cannot get chat before apply for group, chatId: " + str);
            return;
        }
        UICallbackExecutor.execute(new Runnable(C32881i.m126556a().mo106482a(str, false), context, str2) {
            /* class com.ss.android.lark.threaddetail.$$Lambda$i$CwvgBzDEwsKgkptkeTbhzniQj20 */
            public final /* synthetic */ TopicGroup f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C55831i.m216686a(Chat.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m216680a(Activity activity, Chat chat, View view, String str) {
        MessageHitPoint.m213275a(TextUtils.isEmpty(str));
        m216690d(activity, chat.getId(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m216686a(Chat chat, TopicGroup topicGroup, Context context, String str) {
        if (C56146m.m218890a(chat, topicGroup)) {
            m216689c(context, str, "forward");
        } else if (chat.getRole() == Chat.Role.VISITOR) {
            m216683a(context, chat, str);
        } else {
            m216689c(context, str, "forward");
        }
    }
}
