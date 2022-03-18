package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardCallType;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardHitPoint;
import com.ss.android.lark.forward.dto.template.ForwardLocation;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.forward.template.f */
public class C38512f {
    /* renamed from: a */
    private static BasicDialogContent m151895a(Chat chat) {
        BasicDialogContent.C38391a aVar = new BasicDialogContent.C38391a();
        aVar.mo140735b("[" + UIHelper.getString(R.string.Lark_Chat_OneByOneForwardButton) + "]" + chat.getName());
        return aVar.mo140732a();
    }

    /* renamed from: a */
    private static AbstractC38405a m151896a(Context context, ArrayList<String> arrayList, String str) {
        return new AbstractC38405a(arrayList, str, context) {
            /* class com.ss.android.lark.forward.template.$$Lambda$f$29OPqME6WgeEq9SmcVv5F7jyqpI */
            public final /* synthetic */ ArrayList f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                C38512f.m151898a(this.f$0, this.f$1, this.f$2, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    public static void m151897a(String str, List<String> list, BatchTransmitResponse batchTransmitResponse) {
        if (!TextUtils.isEmpty(str) && batchTransmitResponse != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    C38364a.m151054a().mo140442d().mo140483a(str2, str, (Map<String, String>) null, (IGetDataCallback<String>) null);
                }
            }
        }
    }

    /* renamed from: a */
    public static ForwardTemplate m151894a(Context context, Chat chat, ArrayList<String> arrayList, ForwardCallType forwardCallType, ForwardLocation forwardLocation, String str) {
        if (chat == null) {
            return null;
        }
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140851g(true).mo140852h(true).mo140846b());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140891a(m151895a(chat)).mo140892a(new MessageForwardEnhancedView()).mo140897b());
        aVar.mo140611a(new ForwardHitPoint.Builder().mo140797a(arrayList).mo140794a(forwardCallType).mo140795a(forwardLocation).mo140798a());
        aVar.mo140610a(new ForwardFeature.C38394a().mo140778c(false).mo140777b());
        return aVar.mo140617a(m151896a(context, arrayList, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151898a(ArrayList arrayList, String str, final Context context, List list, final Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ForwardTarget forwardTarget = (ForwardTarget) it.next();
            arrayList3.add(new TransmitTarget(forwardTarget.mo140567b()));
            arrayList2.add(forwardTarget.mo140567b());
        }
        C38364a.m151054a().mo140442d().mo140488a(arrayList, arrayList3, str, new IGetDataCallback<BatchTransmitResponse>() {
            /* class com.ss.android.lark.forward.template.C38512f.C385131 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                if (!TemplateFactoryUtils.m151923a(errorResult)) {
                    C26171w.m94675a(new Runnable() {
                        /* class com.ss.android.lark.forward.template.C38512f.C385131.RunnableC385141 */

                        public void run() {
                            C385131.this.mo141173a(errorResult);
                        }
                    });
                }
            }

            /* renamed from: a */
            public void onSuccess(BatchTransmitResponse batchTransmitResponse) {
                C38512f.m151897a(bundle.getString("key_param_addition_note"), arrayList2, batchTransmitResponse);
                LKUIToast.show(context, (int) R.string.Lark_Legacy_Success);
            }

            /* renamed from: a */
            public void mo141173a(ErrorResult errorResult) {
                new C25639g(context).mo89237b(UIUtils.getString(context, R.string.Lark_Chat_TopicToolForward)).mo89238b(true).mo89242c(errorResult.getDisplayMsg()).mo89224a(R.id.lkui_dialog_btn_center, R.string.Lark_Legacy_Confirm, $$Lambda$f$1$Rg6lfygRRKtRaxGgUiwL1F_0Wdk.INSTANCE).mo89239c();
            }
        });
        aVar.mo140599a(-1, new Intent());
    }
}
