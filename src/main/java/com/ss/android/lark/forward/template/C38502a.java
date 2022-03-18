package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.FavoriteForwardData;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardCallType;
import com.ss.android.lark.forward.dto.template.ForwardHitPoint;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardLocation;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.impl.statistics.favourite.FavouriteHitPoint;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.forward.template.a */
public class C38502a {
    /* renamed from: a */
    private static AbstractC38405a m151882a(Context context, FavoriteForwardData favoriteForwardData) {
        return new AbstractC38405a(context) {
            /* class com.ss.android.lark.forward.template.$$Lambda$a$d8iCjcnsDAfuOP6OIE2FAX6uqw */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                C38502a.m151883a(FavoriteForwardData.this, this.f$1, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    public static ForwardTemplate m151881a(Context context, FavoriteForwardData favoriteForwardData, ForwardCallType forwardCallType) {
        if (favoriteForwardData.interceptStickerBeforeForward(context, UIHelper.getString(R.string.Lark_Chat_StickerPackNeedBuy))) {
            return null;
        }
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140613a(C38508c.m151888a(context, favoriteForwardData.getSourceMessage()));
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140891a(C38506b.m151886a(context, favoriteForwardData.getSourceMessage())).mo140892a(new MessageForwardEnhancedView()).mo140897b());
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(favoriteForwardData.isForceStandAlone() ? 1 : 0).mo140814b());
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_message", favoriteForwardData.getSourceMessage());
        aVar.mo140609a(bundle);
        ForwardHitPoint forwardHitPoint = new ForwardHitPoint();
        forwardHitPoint.mo140784a(ForwardLocation.FAVOURITE);
        forwardHitPoint.mo140786a(new ArrayList(Collections.singleton(favoriteForwardData.getSourceMessage().getId())));
        forwardHitPoint.mo140783a(forwardCallType);
        return aVar.mo140617a(m151882a(context, favoriteForwardData));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151883a(FavoriteForwardData favoriteForwardData, final Context context, List list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ForwardTarget forwardTarget = (ForwardTarget) it.next();
            if (forwardTarget.mo140573g() == null) {
                arrayList.add(forwardTarget.mo140567b());
            } else {
                AbstractC38365a.C38382q qVar = new AbstractC38365a.C38382q();
                qVar.f98604b = forwardTarget.mo140573g().getId();
                qVar.f98603a = forwardTarget.mo140573g().getChatId();
                arrayList2.add(qVar);
            }
        }
        C38364a.m151054a().mo140438a(favoriteForwardData.getId(), arrayList, arrayList2, new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.forward.template.C38502a.C385031 */

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                m151884a(arrayList, map);
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.forward.template.C38502a.C385031.RunnableC385041 */

                    public void run() {
                        if (C26284k.m95185a(context)) {
                            LKUIToast.show(context, (int) R.string.Lark_Legacy_Success);
                        }
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                if (!TemplateFactoryUtils.m151923a(errorResult)) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.forward.template.C38502a.C385031.RunnableC385052 */

                        public void run() {
                            aVar.mo140601a(errorResult.getMessage(), false);
                        }
                    });
                }
            }

            /* renamed from: a */
            private void m151884a(List<String> list, Map<String, String> map) {
                String string = bundle.getString("key_param_addition_note");
                if (!TextUtils.isEmpty(string)) {
                    for (String str : list) {
                        if (!TextUtils.isEmpty(str)) {
                            C38364a.m151054a().mo140442d().mo140483a(str, string, map, (IGetDataCallback<String>) null);
                        }
                    }
                }
            }
        });
        FavouriteHitPoint.f98833a.mo141014a();
        aVar.mo140599a(-1, (Intent) null);
    }
}
