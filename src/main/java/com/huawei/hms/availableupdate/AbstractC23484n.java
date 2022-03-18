package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.NetWorkUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.huawei.hms.availableupdate.n */
public abstract class AbstractC23484n implements IBridgeActivityDelegate {

    /* renamed from: a */
    public WeakReference<Activity> f57920a;

    /* renamed from: b */
    public IBridgeActivityDelegate f57921b;

    /* renamed from: c */
    public UpdateBean f57922c = null;

    /* renamed from: d */
    public AbstractC23485o f57923d = null;

    /* renamed from: e */
    public boolean f57924e = false;

    /* renamed from: f */
    public int f57925f = -1;

    /* renamed from: g */
    public String f57926g = null;

    /* renamed from: h */
    public String f57927h = null;

    /* renamed from: i */
    public int f57928i = 0;

    /* renamed from: a */
    public void mo82142a(AbstractC23485o oVar) {
    }

    /* renamed from: a */
    public abstract void mo82129a(Class<? extends AbstractC23485o> cls);

    /* renamed from: b */
    public void mo82145b(AbstractC23485o oVar) {
    }

    /* renamed from: b */
    public Activity mo82172b() {
        WeakReference<Activity> weakReference = this.f57920a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        this.f57920a = null;
        mo82166a();
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.huawei.hms.availableupdate.n */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (!this.f57924e || (iBridgeActivityDelegate = this.f57921b) == null) {
            AbstractC23485o oVar = this.f57923d;
            if (oVar != null) {
                Class<?> cls = oVar.getClass();
                this.f57923d.mo82177b();
                this.f57923d = null;
                mo82129a((Class<? extends AbstractC23485o>) cls);
                return;
            }
            return;
        }
        iBridgeActivityDelegate.onBridgeConfigurationChanged();
    }

    /* renamed from: a */
    public void mo82166a() {
        AbstractC23485o oVar = this.f57923d;
        if (oVar != null) {
            try {
                oVar.mo82177b();
                this.f57923d = null;
            } catch (IllegalStateException e) {
                HMSLog.m86964e("AbsUpdateWizard", "In dismissDialog, Failed to dismiss the dialog." + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo82168a(UpdateBean updateBean) {
        this.f57922c = updateBean;
    }

    /* renamed from: a */
    public static String m85179a(int i) {
        if (i == 0) {
            return e0.class.getName();
        }
        if (i == 5) {
            return C23499x.class.getName();
        }
        if (i == 6) {
            return f0.class.getName();
        }
        if (i != 7) {
            return "";
        }
        return C23487p.class.getName();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f57920a = new WeakReference<>(activity);
        if (this.f57922c == null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                UpdateBean updateBean = (UpdateBean) intent.getSerializableExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO);
                this.f57922c = updateBean;
                if (updateBean == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f57926g = this.f57922c.mo85485b();
        this.f57927h = this.f57922c.getClientAppName();
        this.f57928i = this.f57922c.mo85486c();
        this.f57922c.mo85484a();
        this.f57921b = null;
        this.f57924e = false;
        this.f57925f = -1;
    }

    /* renamed from: a */
    public final void mo82169a(ArrayList arrayList) {
        String str;
        if (arrayList == null || arrayList.size() <= 0) {
            str = null;
        } else {
            str = m85179a(((Integer) arrayList.get(0)).intValue());
        }
        if (str != null) {
            try {
                this.f57921b = (IBridgeActivityDelegate) Class.forName(str).asSubclass(IBridgeActivityDelegate.class).newInstance();
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                HMSLog.m86964e("AbsUpdateWizard", "getBridgeActivityDelegate error" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public boolean mo82171a(boolean z) {
        Activity b = mo82172b();
        boolean z2 = false;
        if (b == null) {
            return false;
        }
        ArrayList typeList = this.f57922c.getTypeList();
        if (typeList.size() > 0) {
            typeList.remove(0);
        }
        if (this.f57921b == null) {
            mo82169a(typeList);
        }
        if (this.f57921b != null) {
            z2 = true;
            this.f57924e = true;
            this.f57922c.setTypeList(typeList);
            this.f57922c.setNeedConfirm(z);
            IBridgeActivityDelegate iBridgeActivityDelegate = this.f57921b;
            if (iBridgeActivityDelegate instanceof AbstractC23484n) {
                ((AbstractC23484n) iBridgeActivityDelegate).mo82168a(this.f57922c);
            }
            this.f57921b.onBridgeActivityCreate(b);
        }
        return z2;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f57924e && (iBridgeActivityDelegate = this.f57921b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        }
    }

    /* renamed from: c */
    public void mo82174c(int i, int i2) {
        Activity b = mo82172b();
        if (b != null && !b.isFinishing()) {
            mo82167a(i, i2);
            Intent intent = new Intent();
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, getClass().getName());
            intent.putExtra(BridgeActivity.EXTRA_RESULT, i);
            b.setResult(-1, intent);
            b.finish();
        }
    }

    /* renamed from: b */
    public final String mo82173b(int i, int i2) {
        String valueOf = String.valueOf(i);
        if (i2 == 0) {
            return "0000" + valueOf;
        } else if (i2 == 5) {
            return "5000" + valueOf;
        } else if (i2 != 6) {
            return valueOf;
        } else {
            return "4000" + valueOf;
        }
    }

    /* renamed from: a */
    public void mo82167a(int i, int i2) {
        if (!SystemUtils.isChinaROM()) {
            HMSLog.m86966i("AbsUpdateWizard", "not ChinaROM ");
            return;
        }
        Activity b = mo82172b();
        if (b != null && !b.isFinishing()) {
            int packageVersionCode = new PackageManagerHelper(b).getPackageVersionCode(this.f57926g);
            HashMap hashMap = new HashMap();
            hashMap.put("package", b.getPackageName());
            hashMap.put(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, this.f57926g);
            hashMap.put(HiAnalyticsConstant.BI_KEY_TARGET_VER, String.valueOf(packageVersionCode));
            hashMap.put(HiAnalyticsConstant.BI_KEY_SDK_VER, String.valueOf(50005300));
            hashMap.put("app_id", AGCUtils.getAppId(b));
            hashMap.put(HiAnalyticsConstant.BI_KEY_TRIGGER_API, "core.connnect");
            hashMap.put(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE, String.valueOf(i2));
            hashMap.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, String.valueOf(NetWorkUtil.getNetworkType(b)));
            hashMap.put("result", mo82173b(i, i2));
            HiAnalyticsUtils.getInstance().onEvent(b, HiAnalyticsConstant.BI_TYPE_UPDATE, hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo82170a(String str, int i) {
        Activity b;
        if (!TextUtils.isEmpty(str) && (b = mo82172b()) != null && !b.isFinishing() && new PackageManagerHelper(b).getPackageVersionCode(str) >= i) {
            return true;
        }
        return false;
    }
}
