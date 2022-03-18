package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.ThreadTarget;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.forward.template.j */
public class C38521j {
    /* renamed from: a */
    private static AbstractC38405a m151913a(ProfileContent profileContent) {
        return new AbstractC38405a() {
            /* class com.ss.android.lark.forward.template.$$Lambda$j$e7XoZygPVXgfXWyPmqVaFAm_Ls */

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                C38521j.m151914a(ProfileContent.this, list, bundle, aVar);
            }
        };
    }

    /* renamed from: com.ss.android.lark.forward.template.j$a */
    public static class C38523a {

        /* renamed from: a */
        String f99014a;

        /* renamed from: b */
        String f99015b = "";

        public C38523a(String str) {
            this.f99014a = str;
        }

        public C38523a(String str, String str2) {
            this.f99014a = str;
            this.f99015b = str2;
        }
    }

    /* renamed from: a */
    public static ForwardTemplate m151912a(Context context, ProfileContent profileContent) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140898c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PreviewUserCard, "user_name", profileContent.getDisplayName())).mo140897b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(false).mo140851g(false).mo140846b());
        return aVar.mo140617a(m151913a(profileContent));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151914a(ProfileContent profileContent, List list, Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final String a = AppreciablePerformance.f98815c.mo140988a("ForwardPickFragment", 1);
        String string = bundle.getString("key_param_addition_note");
        ArrayList<C38523a> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ForwardTarget forwardTarget = (ForwardTarget) it.next();
            ThreadTarget g = forwardTarget.mo140573g();
            if (g != null) {
                arrayList.add(new C38523a(g.getChatId(), g.getId()));
            } else {
                arrayList.add(new C38523a(forwardTarget.mo140567b()));
            }
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C38523a aVar2 : arrayList) {
            C38364a.m151054a().mo140442d().mo140481a(aVar2.f99014a, aVar2.f99015b, profileContent.getId(), string, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.forward.template.C38521j.C385221 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    AppreciablePerformance.f98815c.mo140996b(a, 1);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (!atomicBoolean.get()) {
                        AppreciablePerformance.f98815c.mo140991a(errorResult.getErrorCode(), errorResult.getMessage(), "ForwardPickFragment", 1);
                        atomicBoolean.set(true);
                        if (!TemplateFactoryUtils.m151923a(errorResult)) {
                            UICallbackExecutor.execute(new Runnable() {
                                /* class com.ss.android.lark.forward.template.$$Lambda$j$1$rTjOOo601YK9_d_q1hOf5NuFIKo */

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
                                        com.ss.android.lark.forward.template.C38521j.C385221.lambda$rTjOOo601YK9_d_q1hOf5NuFIKo(r0)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.forward.template.$$Lambda$j$1$rTjOOo601YK9_d_q1hOf5NuFIKo.run():void");
                                }
                            });
                        }
                    }
                }
            });
        }
        aVar.mo140599a(-1, (Intent) null);
    }
}
