package com.bytedance.geckox;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.debug.C14263a;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.policy.loop.C14315b;
import com.bytedance.geckox.policy.p776b.C14298a;
import com.bytedance.geckox.policy.p779e.C14313a;
import com.bytedance.geckox.policy.v4.C14321a;
import com.bytedance.geckox.statistic.p781a.C14329a;
import com.bytedance.geckox.utils.C14362h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.geckox.b */
public final class C14205b {

    /* renamed from: a */
    public C14218d f37355a;

    /* renamed from: b */
    public File f37356b;

    /* renamed from: c */
    private final List<String> f37357c = new ArrayList();

    /* renamed from: d */
    private C14298a f37358d;

    /* renamed from: a */
    public void mo52087a() {
        mo52089a("default", null, null, null);
    }

    /* renamed from: a */
    public void mo52090a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        mo52089a("default", null, map, null);
    }

    /* renamed from: a */
    public static C14205b m57334a(C14218d dVar) {
        if (dVar != null) {
            List<String> e = dVar.mo52139e();
            if (e == null || e.isEmpty()) {
                throw new IllegalArgumentException("access key empty");
            }
            C14362h.m57834a(dVar.mo52133a());
            C14205b bVar = new C14205b(dVar);
            GeckoClientManager.f37390a.mo52127a(dVar.mo52140f(), bVar);
            return bVar;
        }
        throw new IllegalArgumentException("config == null");
    }

    /* renamed from: b */
    private boolean m57335b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> e = this.f37355a.mo52139e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                boolean z = false;
                for (String str : e) {
                    if (TextUtils.equals(str, entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    private C14205b(C14218d dVar) {
        this.f37355a = dVar;
        File n = dVar.mo52148n();
        this.f37356b = n;
        n.mkdirs();
        C14263a.m57550a(this, this.f37355a);
        C14313a.m57700a().mo52367a(this.f37355a);
        if (dVar.mo52152r()) {
            for (String str : this.f37355a.mo52138d()) {
                C14264e.m57551a().mo52226b(str, this.f37356b.getAbsolutePath());
            }
        }
        for (String str2 : this.f37355a.mo52139e()) {
            C14264e.m57551a().mo52223a(str2, this.f37356b.getAbsolutePath());
        }
        C14321a.m57717a().mo52394a(dVar, C14264e.m57551a().mo52225b());
        C14329a.m57726a().mo52456a(dVar.mo52133a(), dVar);
        C14298a aVar = new C14298a();
        this.f37358d = aVar;
        aVar.mo52343a(dVar);
    }

    /* renamed from: a */
    public void mo52091a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map, AbstractC14267a aVar) {
        mo52089a("default", null, map, aVar);
    }

    /* renamed from: a */
    public void mo52088a(final String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, final OptionCheckUpdateParams optionCheckUpdateParams) {
        boolean j = C14264e.m57551a().mo52235j();
        C14276b.m57604a("gecko-debug-tag", "gecko update enable:", Boolean.valueOf(j));
        if (!j) {
            if (!(optionCheckUpdateParams == null || optionCheckUpdateParams.getListener() == null)) {
                optionCheckUpdateParams.getListener().mo21863a((Map<String, List<Pair<String, Long>>>) null, new IllegalStateException("gecko is disabled"));
            }
        } else if (m57335b(map)) {
            if (TextUtils.isEmpty(str)) {
                str = "default";
            }
            if (optionCheckUpdateParams == null) {
                optionCheckUpdateParams = new OptionCheckUpdateParams();
            }
            if (optionCheckUpdateParams.isLazyUpdate()) {
                this.f37358d.mo52344a(str, map, optionCheckUpdateParams);
                return;
            }
            boolean a = C14264e.m57551a().mo52224a(optionCheckUpdateParams.isEnableThrottle());
            C14276b.m57604a("gecko-debug-tag", "gecko update throttle enable:", Boolean.valueOf(a));
            optionCheckUpdateParams.setEnableThrottle(a);
            if (optionCheckUpdateParams.getLoopLevel() != null) {
                for (String str2 : this.f37355a.mo52138d()) {
                    C14264e.m57551a().mo52228c(str2, this.f37356b.getAbsolutePath());
                }
            }
            if (!optionCheckUpdateParams.isLazyUpdate() && this.f37355a.mo52151q() && optionCheckUpdateParams != null && optionCheckUpdateParams.getLoopLevel() != null) {
                C14315b.m57703a().mo52370a(str, this.f37355a.mo52139e(), map, optionCheckUpdateParams);
            }
            this.f37355a.mo52142h().execute(new Runnable() {
                /* class com.bytedance.geckox.C14205b.RunnableC142061 */

                /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
                /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
                /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 224
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.C14205b.RunnableC142061.run():void");
                }
            });
        } else {
            throw new IllegalArgumentException("target keys are not in deployments keys");
        }
    }

    /* renamed from: a */
    public void mo52089a(String str, Map<String, Map<String, Object>> map, Map<String, List<CheckRequestBodyModel.TargetChannel>> map2, AbstractC14267a aVar) {
        mo52088a(str, map2, new OptionCheckUpdateParams().setCustomParam(map).setListener(aVar));
    }
}
