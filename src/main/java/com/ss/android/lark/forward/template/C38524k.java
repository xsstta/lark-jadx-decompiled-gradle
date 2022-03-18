package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.biz.core.api.ShareTextForwardData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.forward.template.k */
public class C38524k {
    /* renamed from: b */
    private static AbstractC38405a m151919b(Context context, ShareTextForwardData shareTextForwardData) {
        return new AbstractC38405a(context) {
            /* class com.ss.android.lark.forward.template.$$Lambda$k$nlvXYBv7gtDtpAdqWv8NFR7uXM */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                C38524k.m151918a(ShareTextForwardData.this, this.f$1, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    public static ForwardTemplate m151917a(Context context, ShareTextForwardData shareTextForwardData) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140610a(new ForwardFeature.C38394a().mo140780e(shareTextForwardData.isSupportAdditionNote()).mo140777b());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140891a(new BasicDialogContent.C38391a().mo140730a(shareTextForwardData.getTitle()).mo140735b(shareTextForwardData.getContent()).mo140732a()).mo140893a(shareTextForwardData.getTitleBarText()).mo140897b());
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(shareTextForwardData.isForceStandAlone() ? 1 : 0).mo140814b());
        return aVar.mo140617a(m151919b(context, shareTextForwardData));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151918a(ShareTextForwardData shareTextForwardData, Context context, List list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        String str;
        final String a = AppreciablePerformance.f98815c.mo140988a("ForwardPickFragment", 4);
        if (shareTextForwardData != null && !shareTextForwardData.isLocalShare()) {
            if (TextUtils.isEmpty(shareTextForwardData.getSourceName())) {
                str = "";
            } else {
                str = shareTextForwardData.getSourceName();
            }
            C38364a.m151054a().mo140437a(context, "", str, new Bundle());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ForwardTarget forwardTarget = (ForwardTarget) it.next();
            arrayList.add(forwardTarget.mo140567b());
            if (forwardTarget.mo140572f() != null && forwardTarget.mo140572f().getType() == Chat.Type.P2P) {
                arrayList2.add(forwardTarget.mo140567b());
            }
        }
        String content = shareTextForwardData.getContent();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ArrayList<String> arrayList3 = new ArrayList<>();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final String next = it2.next();
            if (!TextUtils.isEmpty(next)) {
                C38364a.m151054a().mo140442d().mo140483a(next, content, (Map<String, String>) null, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.forward.template.C38524k.C385251 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        AppreciablePerformance.f98815c.mo140996b(a, 4);
                        m151921a(next, str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        arrayList3.add(next);
                        if (!atomicBoolean.get()) {
                            AppreciablePerformance.f98815c.mo140991a(errorResult.getErrorCode(), errorResult.getMessage(), "ForwardPickFragment", 4);
                            atomicBoolean.set(true);
                            if (!TemplateFactoryUtils.m151923a(errorResult)) {
                                UICallbackExecutor.execute(new Runnable() {
                                    /* class com.ss.android.lark.forward.template.$$Lambda$k$1$21olnZfPE5qdW51BX00lPC4MS0 */

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
                                            com.ss.android.lark.forward.template.C38524k.C385251.m270564lambda$21olnZfPE5qdW51BX00lPC4MS0(r0)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.forward.template.$$Lambda$k$1$21olnZfPE5qdW51BX00lPC4MS0.run():void");
                                    }
                                });
                            }
                        }
                    }

                    /* renamed from: a */
                    private void m151921a(String str, String str2) {
                        String string = bundle.getString("key_param_addition_note");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(str)) {
                            C38364a.m151054a().mo140442d().mo140483a(str, string, (Map<String, String>) null, (IGetDataCallback<String>) null);
                        }
                    }
                });
                atomicBoolean = atomicBoolean;
                a = a;
            }
        }
        Intent intent = new Intent();
        intent.putStringArrayListExtra("key_result_totle_share_chatter_ids", arrayList);
        intent.putStringArrayListExtra("key_result_p2p_share_chatter_ids", arrayList2);
        intent.putStringArrayListExtra("key_result_error_share_chatter_ids", arrayList3);
        aVar.mo140599a(-1, intent);
    }
}
