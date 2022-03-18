package com.ss.android.lark.platform.batterymonitor.p2480d;

import android.content.Context;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import com.ss.android.lark.utils.C57765ac;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.b */
public class C51738b {

    /* renamed from: a */
    private List<AbstractC51736a> f128638a;

    /* renamed from: a */
    public boolean mo177855a() {
        AbstractC51736a aVar;
        if (!CollectionUtils.isEmpty(this.f128638a) && (aVar = this.f128638a.get(0)) != null) {
            return aVar.mo177848a();
        }
        return false;
    }

    /* renamed from: b */
    public void mo177856b() {
        AbstractC51736a aVar = this.f128638a.get(0);
        if (aVar == null) {
            Log.m165383e("BatteryMonitor", "removeProcDozeState found current proc AbsBatteryStrategy object is null.");
        } else {
            aVar.mo177853e();
        }
    }

    private C51738b(List<AbstractC51736a> list) {
        ArrayList arrayList = new ArrayList();
        this.f128638a = arrayList;
        arrayList.clear();
        this.f128638a.addAll(list);
    }

    /* renamed from: a */
    public void mo177854a(ConditionState conditionState) {
        if (!CollectionUtils.isEmpty(this.f128638a)) {
            mo177855a();
            for (AbstractC51736a aVar : this.f128638a) {
                if (aVar != null) {
                    aVar.mo177847a(conditionState);
                }
            }
        }
    }

    /* renamed from: a */
    public static C51738b m200605a(Context context) {
        if (context == null) {
            Log.m165383e("BatteryMonitor", "newProxyInstance called. But return null because context is null.");
            return null;
        }
        Log.m165389i("BatteryMonitor", "BatteryStrategyProxy execute called. current process: " + C26252ad.m94992a(context));
        ArrayList arrayList = new ArrayList();
        if (C57765ac.m224188b(context)) {
            arrayList.add(new C51741e(context));
            arrayList.add(new C51739c(context, false));
            return new C51738b(arrayList);
        } else if (C57765ac.m224187a(context)) {
            arrayList.add(new C51739c(context, true));
            return new C51738b(arrayList);
        } else if (C57765ac.m224189c(context)) {
            arrayList.add(new C51743f(context));
            return new C51738b(arrayList);
        } else if (!C57765ac.m224193g(context)) {
            return null;
        } else {
            arrayList.add(new C51746h(context));
            return new C51738b(arrayList);
        }
    }
}
