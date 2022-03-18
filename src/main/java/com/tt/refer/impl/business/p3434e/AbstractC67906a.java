package com.tt.refer.impl.business.p3434e;

import android.app.Activity;
import android.app.Dialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.component.openplatform.core.plugin.messenger.appbadge.C25103a;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.p3301m.C66335f;
import com.tt.miniapp.p3301m.C66344j;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.util.C67029c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.C67590h;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.tt.refer.impl.business.e.a */
public abstract class AbstractC67906a implements AbstractC67733a {

    /* renamed from: c */
    public static final Object f171030c = new Object();

    /* renamed from: d */
    public static final Object f171031d = new Object();

    /* renamed from: b */
    public IAppContext f171032b;

    /* renamed from: com.tt.refer.impl.business.e.a$a */
    public static class C67915a {

        /* renamed from: a */
        public SparseArray<List<AbstractC67540b>> f171057a = new SparseArray<>();

        /* renamed from: b */
        public SparseArray<List<AbstractC67539a>> f171058b = new SparseArray<>();
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        this.f171032b = null;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f171032b;
    }

    public AbstractC67906a(IAppContext iAppContext) {
        this.f171032b = iAppContext;
    }

    /* renamed from: b */
    public static C67915a m264221b(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170185l;
    }

    /* renamed from: a */
    private LinkedHashMap<Integer, String> m264220a(Set<C66578b.C66579a> set) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (C66578b.C66579a aVar : set) {
            linkedHashMap.put(Integer.valueOf(aVar.mo232177a()), "ok");
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public Set<C66578b.C66579a> mo50177a(String str, Set<C66578b.C66579a> set) {
        return HostDependManager.getInst().filterNeedRequestPermission(str, set, this.f171032b);
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public void mo235102a(Set<C66578b.C66579a> set, LinkedHashMap<Integer, String> linkedHashMap) {
        HashSet<String> hashSet;
        Activity currentActivity = this.f171032b.getCurrentActivity();
        Iterator<C66578b.C66579a> it = set.iterator();
        while (it.hasNext()) {
            C66578b.C66579a next = it.next();
            boolean a = C66578b.C66579a.m260112a(next, this.f171032b);
            boolean shouldFilterPermission = HostDependManager.getInst().shouldFilterPermission(next.mo232177a(), this.f171032b);
            if (next.mo232182f() == null) {
                hashSet = new HashSet();
            } else {
                hashSet = new HashSet(Arrays.asList(next.mo232182f()));
            }
            PackageManager packageManager = currentActivity.getPackageManager();
            boolean z = true;
            boolean z2 = true;
            for (String str : hashSet) {
                if (-1 == packageManager.checkPermission(str, currentActivity.getPackageName())) {
                    z2 = false;
                }
            }
            if (a || (!shouldFilterPermission && !mo50181a(next))) {
                z = false;
            }
            if (z) {
                if (!mo50179a(next.mo232177a(), false)) {
                    linkedHashMap.put(Integer.valueOf(next.mo232177a()), "auth deny");
                } else if (z2) {
                    linkedHashMap.put(Integer.valueOf(next.mo232177a()), "ok");
                } else {
                    linkedHashMap.put(Integer.valueOf(next.mo232177a()), "system auth deny");
                }
                it.remove();
            }
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo232184a(Activity activity, String str, Set<String> set, AbstractC67709b.AbstractC67711b bVar) {
        ((AbstractC67724a) this.f171032b.findServiceByInterface(AbstractC67724a.class)).mo50441a(activity, (String[]) set.toArray(new String[0]), bVar);
        return true;
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public boolean mo235103a(Activity activity, final String str, final C66578b.C66579a aVar, final AbstractC67540b bVar) {
        if (this.f171032b.getAppType() == AppType.GadgetAPP || this.f171032b.getAppType() == AppType.WebAPP) {
            mo235569a(activity, str, aVar, null, new AbstractC67540b() {
                /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.C679071 */

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87199a() {
                    AppBrandLogger.m52830i("AbsPermissionServiceImp", "api:" + str + " requestAppPermission" + aVar.mo232181e() + " onGranted");
                    bVar.mo87199a();
                }

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87200a(String str) {
                    AppBrandLogger.m52830i("AbsPermissionServiceImp", "api:" + str + " requestAppPermission" + aVar.mo232181e() + " onDenied");
                    bVar.mo87200a(str);
                }
            });
            return true;
        }
        bVar.mo87199a();
        return true;
    }

    /* renamed from: a */
    public void mo235569a(final Activity activity, String str, C66578b.C66579a aVar, final String str2, final AbstractC67540b bVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(aVar);
        Set<C66578b.C66579a> a = mo50177a(str, hashSet);
        if (a == null || a.isEmpty()) {
            bVar.mo87199a();
            return;
        }
        final C66578b.C66579a next = a.iterator().next();
        boolean a2 = C66578b.C66579a.m260112a(next, this.f171032b);
        if (!a2) {
            if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info") && 11 == next.f168120b && C66335f.m259465a(this.f171032b)) {
                HostDependManager.getInst().savePermissionGrant(11, C66335f.m259466b(this.f171032b), this.f171032b);
            }
            if (mo50179a(next.f168120b, false)) {
                bVar.mo87199a();
                return;
            }
        }
        if (activity != null) {
            if (a2 || !mo50184b(next.f168120b)) {
                synchronized (f171030c) {
                    SparseArray<List<AbstractC67540b>> sparseArray = m264221b(this.f171032b).f171057a;
                    List<AbstractC67540b> list = sparseArray.get(next.f168120b);
                    if (list == null || list.size() <= 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bVar);
                        sparseArray.put(next.f168120b, arrayList);
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.RunnableC679114 */

                            public void run() {
                                String str = next.f168121c;
                                if (!TextUtils.isEmpty(str2)) {
                                    str = str + str2;
                                }
                                C25103a.m90433b(AbstractC67906a.this.f171032b.getAppId(), AppbrandApplicationImpl.getInst(AbstractC67906a.this.f171032b).getAppInfo().appName, AbstractC67906a.this.f171032b.getAppType(), next.mo232181e());
                                final Dialog showPermissionDialog = HostDependManager.getInst().showPermissionDialog(activity, next.f168120b, str, new AbstractC67540b() {
                                    /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.RunnableC679114.C679121 */

                                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                                    /* renamed from: a */
                                    public void mo87199a() {
                                        AbstractC67906a.this.mo50183b(next.f168120b, true);
                                        m264233a(next, true);
                                        if (AppbrandContext.getInst().isGame()) {
                                            C67029c.m261245a(activity);
                                        }
                                        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(AbstractC67906a.this.f171032b).getAppInfo();
                                        if (appInfo != null) {
                                            C25103a.m90432a(AbstractC67906a.this.f171032b.getAppId(), appInfo.appName, AbstractC67906a.this.f171032b.getAppType(), next.mo232181e(), "approved");
                                        }
                                        HostDependManager.getInst().syncPermissionToService(AbstractC67906a.this.f171032b);
                                    }

                                    @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                                    /* renamed from: a */
                                    public void mo87200a(String str) {
                                        AbstractC67906a.this.mo50183b(next.f168120b, false);
                                        m264233a(next, false);
                                        if (AppbrandContext.getInst().isGame()) {
                                            C67029c.m261245a(activity);
                                        }
                                        C25103a.m90432a(AbstractC67906a.this.f171032b.getAppId(), AppbrandApplicationImpl.getInst(AbstractC67906a.this.f171032b).getAppInfo().appName, AbstractC67906a.this.f171032b.getAppType(), next.mo232181e(), "rejected");
                                        HostDependManager.getInst().syncPermissionToService(AbstractC67906a.this.f171032b);
                                    }

                                    /* renamed from: a */
                                    private void m264233a(C66578b.C66579a aVar, boolean z) {
                                        synchronized (AbstractC67906a.f171030c) {
                                            List<AbstractC67540b> list = AbstractC67906a.m264221b(AbstractC67906a.this.f171032b).f171057a.get(aVar.f168120b);
                                            if (list != null) {
                                                if (z) {
                                                    for (AbstractC67540b bVar : list) {
                                                        bVar.mo87199a();
                                                    }
                                                } else {
                                                    for (AbstractC67540b bVar2 : list) {
                                                        bVar2.mo87200a(aVar.mo232178b());
                                                    }
                                                }
                                                list.clear();
                                            }
                                        }
                                    }
                                }, AbstractC67906a.this.f171032b);
                                if (showPermissionDialog == null) {
                                    showPermissionDialog = new Dialog(activity, R.style.microapp_m_DialogTheme);
                                    showPermissionDialog.requestWindowFeature(1);
                                    showPermissionDialog.setCancelable(false);
                                    showPermissionDialog.setContentView(R.layout.microapp_m_dialog_permission);
                                    Window window = showPermissionDialog.getWindow();
                                    if (window != null) {
                                        window.setBackgroundDrawableResource(R.color.microapp_m_transparent);
                                        ((TextView) window.findViewById(R.id.microapp_m_permission_title)).setVisibility(8);
                                        ((TextView) window.findViewById(R.id.microapp_m_title)).setText(String.format(C67590h.m263073a((int) R.string.microapp_m_require_following_permission_with_appname), C67432a.m262319a(AbstractC67906a.this.f171032b).getAppInfo().appName));
                                        ((TextView) window.findViewById(R.id.microapp_m_msg)).setText(str);
                                        ((TextView) window.findViewById(R.id.microapp_m_button1)).setOnClickListener(new View.OnClickListener() {
                                            /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.RunnableC679114.View$OnClickListenerC679132 */

                                            public void onClick(View view) {
                                                AbstractC67906a.this.mo50183b(next.f168120b, true);
                                                bVar.mo87199a();
                                                showPermissionDialog.dismiss();
                                                if (AppbrandContext.getInst().isGame()) {
                                                    C67029c.m261245a(activity);
                                                }
                                            }
                                        });
                                        ((TextView) window.findViewById(R.id.microapp_m_button2)).setOnClickListener(new View.OnClickListener() {
                                            /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.RunnableC679114.View$OnClickListenerC679143 */

                                            public void onClick(View view) {
                                                AbstractC67906a.this.mo50183b(next.f168120b, false);
                                                bVar.mo87200a(next.mo232178b());
                                                showPermissionDialog.dismiss();
                                                if (AppbrandContext.getInst().isGame()) {
                                                    C67029c.m261245a(activity);
                                                }
                                            }
                                        });
                                        if (TextUtils.equals(Build.BRAND.toLowerCase(), "huawei") && Build.VERSION.SDK_INT >= 19) {
                                            window.setFlags(67108864, 67108864);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                if (!activity.isFinishing()) {
                                    C66020b.m258530a("mp_auth_alert_show", AbstractC67906a.this.f171032b).mo231090a("alert_type", "old").mo231090a("auth_type", AbstractC67906a.this.mo50175a(next.f168120b)).mo231092a();
                                    showPermissionDialog.show();
                                }
                            }
                        });
                        return;
                    }
                    list.add(bVar);
                    return;
                }
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.RunnableC679103 */

                public void run() {
                    HostDependManager.getInst().onDeniedWhenHasRequested(activity, next.f168121c, AbstractC67906a.this.f171032b);
                }
            });
            bVar.mo87200a(next.mo232178b());
        }
    }

    @Override // com.tt.refer.p3400a.p3412i.AbstractC67733a
    /* renamed from: a */
    public void mo235101a(final Activity activity, String str, Set<C66578b.C66579a> set, final LinkedHashMap<Integer, String> linkedHashMap, AbstractC67539a aVar, final HashMap<String, String> hashMap) {
        int i;
        if (set == null || set.size() <= 0) {
            AppBrandLogger.m52829e("AbsPermissionServiceImp", "showPermissionsDialog", "permissions is empty!");
            return;
        }
        final Set<C66578b.C66579a> filterNeedRequestPermission = HostDependManager.getInst().filterNeedRequestPermission(str, set, this.f171032b);
        if (filterNeedRequestPermission == null || filterNeedRequestPermission.isEmpty()) {
            aVar.mo87589a(m264220a(set));
            return;
        }
        if (!LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.scope.add_user_info") && filterNeedRequestPermission.contains(C66578b.C66579a.m260109a(this.f171032b)) && C66335f.m259465a(this.f171032b)) {
            HostDependManager.getInst().savePermissionGrant(11, C66335f.m259466b(this.f171032b), this.f171032b);
        }
        mo235102a(filterNeedRequestPermission, linkedHashMap);
        if (filterNeedRequestPermission.size() <= 0) {
            if (linkedHashMap.keySet().size() <= 0) {
                return;
            }
            if (mo50179a(linkedHashMap.keySet().iterator().next().intValue(), false)) {
                aVar.mo87589a(linkedHashMap);
            } else {
                aVar.mo87590b(linkedHashMap);
            }
        } else if (!filterNeedRequestPermission.contains(C66578b.C66579a.m260109a(this.f171032b)) || new C66467o.C66470b(C67556a.m262949f()).f167780f) {
            synchronized (f171031d) {
                if (filterNeedRequestPermission.size() > 1) {
                    i = -1;
                } else if (filterNeedRequestPermission.size() == 1) {
                    i = filterNeedRequestPermission.iterator().next().f168120b;
                } else {
                    AppBrandLogger.m52829e("AbsPermissionServiceImp", "needAuthPermissions is empty");
                    return;
                }
                SparseArray<List<AbstractC67539a>> sparseArray = m264221b(this.f171032b).f171058b;
                List<AbstractC67539a> list = sparseArray.get(i);
                if (list == null || list.size() <= 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    sparseArray.put(i, arrayList);
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.RunnableC679082 */

                        public void run() {
                            final int i;
                            HashSet hashSet = new HashSet();
                            for (C66578b.C66579a aVar : filterNeedRequestPermission) {
                                hashSet.add(Integer.valueOf(aVar.f168120b));
                            }
                            if (filterNeedRequestPermission.size() > 1) {
                                i = -1;
                            } else if (filterNeedRequestPermission.size() == 1) {
                                i = ((C66578b.C66579a) filterNeedRequestPermission.iterator().next()).f168120b;
                            } else {
                                AppBrandLogger.m52829e("AbsPermissionServiceImp", "needAuthPermissions is empty");
                                return;
                            }
                            C679091 r9 = new AbstractC67539a() {
                                /* class com.tt.refer.impl.business.p3434e.AbstractC67906a.RunnableC679082.C679091 */

                                @Override // com.tt.miniapphost.p3373f.AbstractC67539a
                                /* renamed from: a */
                                public void mo87589a(LinkedHashMap<Integer, String> linkedHashMap) {
                                    AbstractC67906a.this.mo50178a(linkedHashMap);
                                    m264230a(linkedHashMap, true, i);
                                    if (AppbrandContext.getInst().isGame()) {
                                        C67029c.m261245a(activity);
                                    }
                                    HostDependManager.getInst().syncPermissionToService(AbstractC67906a.this.f171032b);
                                }

                                @Override // com.tt.miniapphost.p3373f.AbstractC67539a
                                /* renamed from: b */
                                public void mo87590b(LinkedHashMap<Integer, String> linkedHashMap) {
                                    AbstractC67906a.this.mo50178a(linkedHashMap);
                                    m264230a(linkedHashMap, false, i);
                                    if (AppbrandContext.getInst().isGame()) {
                                        C67029c.m261245a(activity);
                                    }
                                    HostDependManager.getInst().syncPermissionToService(AbstractC67906a.this.f171032b);
                                }

                                /* renamed from: a */
                                private void m264230a(LinkedHashMap<Integer, String> linkedHashMap, boolean z, int i) {
                                    synchronized (AbstractC67906a.f171031d) {
                                        List<AbstractC67539a> list = AbstractC67906a.m264221b(AbstractC67906a.this.f171032b).f171058b.get(i);
                                        if (z) {
                                            for (AbstractC67539a aVar : list) {
                                                aVar.mo87589a(linkedHashMap);
                                            }
                                        } else {
                                            for (AbstractC67539a aVar2 : list) {
                                                aVar2.mo87590b(linkedHashMap);
                                            }
                                        }
                                        list.clear();
                                    }
                                }
                            };
                            Dialog showPermissionsDialog = HostDependManager.getInst().showPermissionsDialog(activity, hashSet, linkedHashMap, r9, hashMap, AbstractC67906a.this.f171032b);
                            if (showPermissionsDialog == null) {
                                showPermissionsDialog = new C66344j().showPermissionsDialog(activity, hashSet, linkedHashMap, r9, hashMap, AbstractC67906a.this.f171032b);
                            }
                            String str = null;
                            if (filterNeedRequestPermission.size() > 1) {
                                str = "multiple";
                            } else if (filterNeedRequestPermission.iterator().hasNext()) {
                                str = AbstractC67906a.this.mo50175a(((C66578b.C66579a) filterNeedRequestPermission.iterator().next()).f168120b);
                            }
                            C66020b.m258530a("mp_auth_alert_show", AbstractC67906a.this.f171032b).mo231090a("alert_type", "new").mo231090a("auth_type", str).mo231092a();
                            showPermissionsDialog.show();
                        }
                    });
                    return;
                }
                list.add(aVar);
            }
        } else {
            linkedHashMap.put(11, "platform auth deny");
            aVar.mo87590b(linkedHashMap);
        }
    }
}
