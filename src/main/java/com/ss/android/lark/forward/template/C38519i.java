package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import com.ss.android.lark.forward.impl.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.forward.template.i */
public class C38519i {
    /* renamed from: a */
    private static AbstractC38405a m151908a(Chat chat) {
        return new AbstractC38405a() {
            /* class com.ss.android.lark.forward.template.$$Lambda$i$yKFGRi4LtVHvwgyTBeNus8NTkgo */

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                C38519i.m151909a(Chat.this, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    public static ForwardTemplate m151907a(Context context, Chat chat) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        String name = chat.getName();
        if (TextUtils.isEmpty(name)) {
            name = UIUtils.getString(context, R.string.Lark_Legacy_GroupChat);
        }
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140898c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_ShareGroupChatFormat, "chat_name", name)).mo140897b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(!chat.isCrossTenant()).mo140846b());
        return aVar.mo140617a(m151908a(chat));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151909a(final Chat chat, List list, Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final String a = AppreciablePerformance.f98815c.mo140988a("GroupShareFragment", 2);
        String contextId = PerfLog.getContextId();
        PerfLog.start("send_share_group", contextId, "");
        PerfLog.start("get_real_chat", contextId, "");
        Chat a2 = C38364a.m151054a().mo140442d().mo140469a(chat.getId());
        if (a2 == null) {
            aVar.mo140601a(UIHelper.getString(R.string.Lark_Legacy_ShareGroupFailed), false);
            return;
        }
        boolean equals = C38364a.m151054a().mo140445g().mo140457b().equals(a2.getOwnerId());
        boolean isAdmin = a2.isAdmin();
        if (equals || isAdmin || a2.getShareCardPermission() != Chat.ShareCardPermission.NOT_ALLOWED) {
            String string = bundle.getString("key_param_addition_note");
            ChatHitPoint.f98831a.mo141012a(!TextUtils.isEmpty(string));
            ChatHitPoint.f98831a.mo141010a(chat);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ForwardTarget) it.next()).mo140567b());
            }
            Map<String, Chat> d = C38364a.m151054a().mo140442d().mo140498d(arrayList);
            ChatHitPoint.f98831a.mo141011a(a2, equals, string, arrayList.size());
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            PerfLog.end("get_real_chat", contextId, "");
            for (Chat chat2 : d.values()) {
                C38364a.m151054a().mo140442d().mo140479a(contextId, chat2.getId(), a2, string, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.forward.template.C38519i.C385201 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        AppreciablePerformance.f98815c.mo140996b(a, 2);
                        ChatHitPoint.f98831a.mo141013a(chat.isPublic(), chat.isCrossTenant());
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (!atomicBoolean.get()) {
                            atomicBoolean.set(true);
                            AppreciablePerformance.f98815c.mo140991a(errorResult.getErrorCode(), errorResult.getMessage(), "GroupShareFragment", 2);
                            if (!TemplateFactoryUtils.m151923a(errorResult)) {
                                UICallbackExecutor.execute(new Runnable() {
                                    /* class com.ss.android.lark.forward.template.$$Lambda$i$1$AX56QgkH_zETm5YTddAnAJrwMWM */

                                    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                                        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                                        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                                        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                                        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                                        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                                        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
                                        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                                        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                                        */
                                    public final void run() {
                                        /*
                                            r1 = this;
                                            com.ss.android.lark.forward.dto.template.a$a r0 = com.ss.android.lark.forward.dto.template.AbstractC38405a.AbstractC38406a.this
                                            com.ss.android.lark.forward.template.C38519i.C385201.lambda$AX56QgkH_zETm5YTddAnAJrwMWM(r0)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.forward.template.$$Lambda$i$1$AX56QgkH_zETm5YTddAnAJrwMWM.run():void");
                                    }
                                });
                            }
                        }
                    }
                });
            }
            aVar.mo140599a(-1, (Intent) null);
            return;
        }
        aVar.mo140601a(UIHelper.getString(R.string.Lark_Group_ThisGroupCantBeSharedToast), false);
    }
}
