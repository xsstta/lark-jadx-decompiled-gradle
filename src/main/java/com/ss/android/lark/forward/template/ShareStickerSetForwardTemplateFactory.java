package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ShareStickerSetForwardTemplateFactory {

    public @interface From {
    }

    /* renamed from: a */
    private static AbstractC38405a m151843a(Context context, String str) {
        return new AbstractC38405a(context, str) {
            /* class com.ss.android.lark.forward.template.$$Lambda$ShareStickerSetForwardTemplateFactory$outw7hPKPLIIV4T7O7GdunAa3k */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                ShareStickerSetForwardTemplateFactory.m151844a(this.f$0, this.f$1, list, bundle, aVar);
            }
        };
    }

    /* renamed from: b */
    private static AbstractC38405a m151847b(Context context, String str) {
        return new AbstractC38405a(str, context) {
            /* class com.ss.android.lark.forward.template.$$Lambda$ShareStickerSetForwardTemplateFactory$ruYxywxNbiCpn1g79UlWskNahs */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Context f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                ShareStickerSetForwardTemplateFactory.m151845a(this.f$0, this.f$1, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    public static void m151846a(List<String> list, String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    C38364a.m151054a().mo140442d().mo140483a(str2, str, (Map<String, String>) null, (IGetDataCallback<String>) null);
                }
            }
        }
    }

    /* renamed from: a */
    public static ForwardTemplate m151842a(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ShareStickerSetForwardTemplateFactory", "getForwardTemplate called. stickerSetId is null.");
            return null;
        }
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140610a(new ForwardFeature.C38394a().mo140776b(false).mo140777b());
        if (i == 1) {
            aVar.mo140615a(new ForwardViewDependency.C38404a().mo140896b(false).mo140897b());
            return aVar.mo140617a(m151847b(context, str));
        } else if (i != 0) {
            return null;
        } else {
            aVar.mo140615a(new ForwardViewDependency.C38404a().mo140898c(UIHelper.getString(R.string.Lark_Chat_TopicToolShareTo)).mo140892a(new MessageForwardEnhancedView()).mo140897b());
            return aVar.mo140617a(m151843a(context, str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151844a(final Context context, String str, List list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        C38364a.m151054a().mo140442d().mo140475a(context, str, arrayList, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.forward.template.ShareStickerSetForwardTemplateFactory.C384921 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ShareStickerSetForwardTemplateFactory.m151846a(arrayList, bundle.getString("key_param_addition_note"));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!TemplateFactoryUtils.m151923a(errorResult)) {
                    aVar.mo140601a(UIUtils.getString(context, R.string.Lark_Chat_TopicMessageShareFailedTip), false);
                }
            }
        });
        aVar.mo140599a(-1, (Intent) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151845a(String str, Context context, List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        UserSP.getInstance().putString("sticker_set_id", str);
        if (!CollectionUtils.isEmpty(arrayList)) {
            C38364a.m151054a().mo140442d().mo140476a(context, (String) arrayList.get(0), false);
        }
    }
}
