package com.bytedance.ee.bear.more.rename;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.rename.RenameSheetExecutor;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

public class RenameSheetExecutor {

    /* renamed from: a */
    private NetService f27669a;

    public static class RenameResult extends NetService.Result {
        String editTime;
    }

    /* renamed from: com.bytedance.ee.bear.more.rename.RenameSheetExecutor$a */
    public interface AbstractC10248a {
        /* renamed from: a */
        void mo39138a();

        /* renamed from: a */
        void mo39139a(RenameResult renameResult);
    }

    /* renamed from: com.bytedance.ee.bear.more.rename.RenameSheetExecutor$b */
    private static class C10249b implements NetService.AbstractC5074c<RenameResult> {
        private C10249b() {
        }

        /* renamed from: a */
        public RenameResult parse(String str) {
            C13479a.m54772d("RenameParser", "parse: json = " + str);
            RenameResult renameResult = new RenameResult();
            try {
                JSONObject jSONObject = new JSONObject(str);
                renameResult.code = jSONObject.optInt("code");
                JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optJSONObject != null) {
                    renameResult.editTime = optJSONObject.optString("edit_time");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return renameResult;
        }
    }

    public RenameSheetExecutor(NetService netService) {
        this.f27669a = netService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m42743a(AbstractC10248a aVar, RenameResult renameResult) throws Exception {
        if (((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39496a(renameResult.code)) {
            ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39499a(C13615c.f35773a, null);
        } else if (renameResult.code == 0) {
            aVar.mo39139a(renameResult);
        } else {
            aVar.mo39138a();
        }
    }

    /* renamed from: a */
    private NetService.C5076e m42742a(String str, int i, String str2) {
        boolean z;
        String str3;
        if (C8275a.f22372e.mo32555b() == i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str3 = "/api/sheet/update_meta/";
        } else {
            str3 = "/api/bitable/update_meta/";
        }
        NetService.C5077f fVar = new NetService.C5077f(str3);
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        hashMap.put("title", str2);
        hashMap.put(ShareHitPoint.f121869d, String.valueOf(i));
        fVar.mo20147a(hashMap);
        return fVar;
    }

    /* renamed from: a */
    public void mo39193a(String str, int i, String str2, final AbstractC10248a aVar) {
        this.f27669a.mo20117a(new C10249b()).mo20141a(m42742a(str, i, str2)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.more.rename.$$Lambda$RenameSheetExecutor$Me3dOZSDh0dY85hwdu2QLYIzRs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RenameSheetExecutor.m42743a(RenameSheetExecutor.AbstractC10248a.this, (RenameSheetExecutor.RenameResult) obj);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.more.rename.RenameSheetExecutor.C102471 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("RenameSheetExecutor", "rename: ", th);
                if (((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39501a(th)) {
                    ((AbstractC10365a) KoinJavaComponent.m268610a(AbstractC10365a.class)).mo39499a(C13615c.f35773a, null);
                } else {
                    aVar.mo39138a();
                }
            }
        });
    }
}
