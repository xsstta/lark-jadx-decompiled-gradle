package com.bytedance.ee.bear.edit.component.document.at;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.atfinder.AbstractC4269d;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.atfinder.AtFinderJsCallbackData;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.edit.component.document.at.AtFinderHandler;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Map;

public class AtFinderHandler implements AbstractC7945d<AtFinderJsCallbackData> {

    /* renamed from: a */
    private AbstractC7947h f20609a;

    /* renamed from: b */
    private AbstractC7595a f20610b;

    /* renamed from: c */
    private C7599b f20611c;

    /* renamed from: d */
    private AbstractC4269d f20612d = new AbstractC4269d() {
        /* class com.bytedance.ee.bear.edit.component.document.at.AtFinderHandler.C75941 */

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16705a(String str) {
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: b */
        public void mo16706b(String str) {
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16703a() {
            C13479a.m54772d("AtFinderHandler", "onClosedView: ");
            AbstractC68307f.m265083a(Boolean.TRUE).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.edit.component.document.at.$$Lambda$AtFinderHandler$1$RNSo0Pz5JNV3E3EaiIjVJPeEZg0 */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AtFinderHandler.C75941.this.m30464a((AtFinderHandler.C75941) ((Boolean) obj));
                }
            }, $$Lambda$AtFinderHandler$1$W9DBmBmDNgEM6LCRcu70fVqaXUQ.INSTANCE);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m30464a(Boolean bool) throws Exception {
            C13479a.m54772d("AtFinderHandler", "accept: ");
            AtFinderNativeCallbackData atFinderNativeCallbackData = new AtFinderNativeCallbackData();
            atFinderNativeCallbackData.setData(null);
            atFinderNativeCallbackData.setCanceled(true);
            AtFinderHandler.this.mo29871a(atFinderNativeCallbackData);
        }

        @Override // com.bytedance.ee.bear.atfinder.AbstractC4269d
        /* renamed from: a */
        public void mo16704a(AtFinderResultList atFinderResultList) {
            if (AtFinderHandler.this.mo29869a() != null) {
                AtFinderHandler.this.mo29869a().mo16809a(atFinderResultList);
            }
            AtFinderResultList a = AtFinderHandler.this.mo29868a(atFinderResultList);
            AtFinderNativeCallbackData atFinderNativeCallbackData = new AtFinderNativeCallbackData();
            atFinderNativeCallbackData.setData(a.getData());
            atFinderNativeCallbackData.setCanceled(false);
            AtFinderHandler.this.mo29871a(atFinderNativeCallbackData);
        }
    };

    /* renamed from: com.bytedance.ee.bear.edit.component.document.at.AtFinderHandler$a */
    public interface AbstractC7595a {
        /* renamed from: a */
        void mo22655a(String str);

        /* renamed from: a */
        void mo22656a(String str, String str2, String str3);
    }

    public static class AtFinderNativeCallbackData extends AtFinderResultList {
        private boolean isCanceled;

        public boolean isCanceled() {
            return this.isCanceled;
        }

        @Override // com.bytedance.ee.bear.atfinder.AtFinderResultList
        public String toString() {
            return "AtFinderNativeCallbackData{isCanceled=" + this.isCanceled + '}';
        }

        public void setCanceled(boolean z) {
            this.isCanceled = z;
        }
    }

    /* renamed from: a */
    public AbstractC4270e mo29869a() {
        return this.f20611c.getMentionDelegate();
    }

    /* renamed from: a */
    public void mo29872a(AbstractC7595a aVar) {
        this.f20610b = aVar;
    }

    /* renamed from: a */
    public void mo29871a(AtFinderNativeCallbackData atFinderNativeCallbackData) {
        AbstractC7947h hVar = this.f20609a;
        if (hVar == null) {
            C13479a.m54758a("AtFinderHandler", "responseData: mCallbackFun is null");
        } else {
            hVar.mo17189a(atFinderNativeCallbackData);
        }
    }

    /* renamed from: a */
    public void mo29873a(C7599b bVar) {
        this.f20611c = bVar;
        bVar.setDataCallback(this.f20612d);
    }

    /* renamed from: a */
    public AtFinderResultList mo29868a(AtFinderResultList atFinderResultList) {
        String str;
        String str2;
        if (atFinderResultList == null || atFinderResultList.getData() == null || atFinderResultList.getData().getResult_list() == null) {
            C13479a.m54758a("AtFinderHandler", "encode: list is null");
            return atFinderResultList;
        }
        try {
            for (AtObject atObject : atFinderResultList.getData().getResult_list()) {
                String str3 = "";
                if (TextUtils.isEmpty(atObject.getContent())) {
                    str = str3;
                } else {
                    str = Base64.encodeToString(atObject.getContent().getBytes("UTF-8"), 0);
                }
                atObject.setContent(str);
                if (TextUtils.isEmpty(atObject.getDepartment())) {
                    str2 = str3;
                } else {
                    str2 = Base64.encodeToString(atObject.getDepartment().getBytes("UTF-8"), 0);
                }
                atObject.setDepartment(str2);
                if (!TextUtils.isEmpty(atObject.getDesc())) {
                    str3 = Base64.encodeToString(atObject.getDesc().getBytes("UTF-8"), 0);
                }
                atObject.setDesc(str3);
            }
        } catch (Exception e) {
            C13479a.m54759a("AtFinderHandler", "encode: ", e);
        }
        return atFinderResultList;
    }

    /* renamed from: a */
    public void handle(AtFinderJsCallbackData atFinderJsCallbackData, AbstractC7947h hVar) {
        if (atFinderJsCallbackData == null || hVar == null) {
            C13479a.m54758a("AtFinderHandler", "AtFinderHandler.handle:46 data or callback is null");
            return;
        }
        AbstractC7595a aVar = this.f20610b;
        if (aVar != null) {
            aVar.mo22655a("bizCommonParams");
            if (atFinderJsCallbackData.getBizCommonParams() != null) {
                for (Map.Entry<String, String> entry : atFinderJsCallbackData.getBizCommonParams().entrySet()) {
                    this.f20610b.mo22656a("bizCommonParams", entry.getKey(), entry.getValue());
                }
            }
        }
        C13479a.m54772d("AtFinderHandler", "AtFinderHandler.handle data=" + atFinderJsCallbackData.toString());
        this.f20609a = hVar;
        if (atFinderJsCallbackData.getShow() == 1) {
            this.f20611c.setActive(true);
        }
        this.f20611c.setAtFinderLiveData(atFinderJsCallbackData);
    }
}
