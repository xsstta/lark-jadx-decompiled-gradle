package com.tt.miniapp.permission;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.util.AppbrandUtil;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tt.miniapp.permission.h */
public class C66588h implements AbstractC67477a {

    /* renamed from: a */
    private final Set<String> f168133a = new HashSet(1);

    /* renamed from: b */
    private final Set<String> f168134b = new HashSet(1);

    /* renamed from: c */
    private final List<SoftReference<AbstractC66590i>> f168135c = new ArrayList(1);

    /* renamed from: d */
    private final List<AbstractC66590i> f168136d = new ArrayList(1);

    /* renamed from: e */
    private final List<SoftReference<AbstractC66595j>> f168137e = new ArrayList();

    /* renamed from: f */
    private Map<String, Integer> f168138f = new HashMap();

    @Override // com.tt.miniapphost.p3370d.AbstractC67477a
    public void onLanguageChange() {
        m260191c();
    }

    /* renamed from: a */
    public synchronized boolean mo232195a(Context context, String str) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        if (C67043j.m261284f()) {
            if (C66584f.m260175a(context, str) && (C66585g.m260179a(context, str) == 0 || !this.f168134b.contains(str))) {
                z = true;
            }
            return z;
        }
        if (C66585g.m260179a(context, str) == 0 || !this.f168134b.contains(str)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public synchronized void mo232192a(Activity activity, String[] strArr, int[] iArr) {
        try {
            ArrayList arrayList = new ArrayList(3);
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (iArr[i] == -1 || (C67043j.m261284f() && !C66584f.m260175a(activity, str))) {
                    if (iArr[i] != -1) {
                        iArr[i] = -1;
                    }
                    if (!C66585g.m260181a(activity, str) && this.f168138f.containsKey(str)) {
                        arrayList.add(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                String a = m260184a(activity, arrayList);
                if (!TextUtils.isEmpty(a)) {
                    m260185a(activity, strArr, (String[]) arrayList.toArray(new String[arrayList.size()]), iArr, a);
                    return;
                }
            }
            mo232194a(strArr, iArr, (String[]) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public void mo232194a(String[] strArr, int[] iArr, String[] strArr2) {
        int i;
        try {
            int length = strArr.length;
            if (iArr.length < length) {
                length = iArr.length;
            }
            Iterator<SoftReference<AbstractC66590i>> it = this.f168135c.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC66590i iVar = it.next().get();
                if (strArr2 == null || strArr2.length <= 0 || !(iVar instanceof AbstractC66580c)) {
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (iVar == null) {
                            break;
                        } else if (iVar.mo232198a(strArr[i], iArr[i])) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    it.remove();
                } else {
                    ((AbstractC66580c) iVar).mo232183a(strArr2);
                }
            }
            Iterator<AbstractC66590i> it2 = this.f168136d.iterator();
            while (it2.hasNext()) {
                it2.next();
                it2.remove();
            }
            while (i < length) {
                this.f168133a.remove(strArr[i]);
                i++;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo232193a(String str, int i) {
        List<SoftReference<AbstractC66595j>> list = this.f168137e;
        if (!(list == null || list.isEmpty())) {
            for (SoftReference<AbstractC66595j> softReference : this.f168137e) {
                AbstractC66595j jVar = softReference.get();
                if (jVar != null) {
                    jVar.mo232205a(str, i);
                }
            }
        }
    }

    /* renamed from: a */
    public static C66588h m260183a() {
        return ContextSingletonInstance.getInstance().getPermissionsManager();
    }

    public C66588h() {
        m260191c();
        m260188b();
        C67479c.m262467a().mo234226a(this);
    }

    /* renamed from: c */
    private synchronized void m260191c() {
        for (Field field : Manifest.permission.class.getFields()) {
            String str = null;
            try {
                str = (String) field.get("");
            } catch (IllegalAccessException e) {
                Log.e("PermissionsManager", "Could not access field", e);
            }
            this.f168134b.add(str);
        }
    }

    /* renamed from: b */
    private void m260188b() {
        Map<String, Integer> map = this.f168138f;
        Integer valueOf = Integer.valueOf((int) R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_LOCATION);
        map.put("android.permission.ACCESS_COARSE_LOCATION", valueOf);
        this.f168138f.put("android.permission.ACCESS_FINE_LOCATION", valueOf);
        this.f168138f.put("android.permission.READ_CONTACTS", Integer.valueOf((int) R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_CONTACT));
        this.f168138f.put("android.permission.CAMERA", Integer.valueOf((int) R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_CAMERA));
        this.f168138f.put("android.permission.RECORD_AUDIO", Integer.valueOf((int) R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_RECORD_AUDIO));
        this.f168138f.put("android.permission.READ_PHONE_STATE", Integer.valueOf((int) R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_READ_PHONE_STATE));
        Map<String, Integer> map2 = this.f168138f;
        Integer valueOf2 = Integer.valueOf((int) R.string.microapp_m_REQUEST_PERMISSION_DESCRIPT_EXTERNAL_STORAGE);
        map2.put("android.permission.WRITE_EXTERNAL_STORAGE", valueOf2);
        if (Build.VERSION.SDK_INT >= 16) {
            this.f168138f.put("android.permission.READ_EXTERNAL_STORAGE", valueOf2);
        }
    }

    /* renamed from: a */
    private synchronized void m260186a(AbstractC66590i iVar) {
        Iterator<SoftReference<AbstractC66590i>> it = this.f168135c.iterator();
        while (it.hasNext()) {
            SoftReference<AbstractC66590i> next = it.next();
            if (next.get() == iVar || next.get() == null) {
                it.remove();
            }
        }
        Iterator<AbstractC66590i> it2 = this.f168136d.iterator();
        while (it2.hasNext()) {
            if (it2.next() == iVar) {
                it2.remove();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m260187a(Set<String> set, AbstractC66590i iVar) {
        if (iVar != null) {
            iVar.mo232197a(set);
            this.f168136d.add(iVar);
            this.f168135c.add(new SoftReference<>(iVar));
        }
    }

    /* renamed from: a */
    public void mo232190a(Activity activity, boolean z) {
        if (z) {
            Set<String> set = this.f168133a;
            if (set != null && !set.isEmpty()) {
                Set<String> set2 = this.f168133a;
                String[] strArr = (String[]) set2.toArray(new String[set2.size()]);
                if (activity != null) {
                    C66585g.m260180a(activity, strArr, 1);
                    return;
                }
                return;
            }
            return;
        }
        List<SoftReference<AbstractC66590i>> list = this.f168135c;
        if (list != null) {
            list.clear();
        }
        Set<String> set3 = this.f168133a;
        if (set3 != null) {
            set3.clear();
        }
        List<AbstractC66590i> list2 = this.f168136d;
        if (list2 != null) {
            list2.clear();
        }
    }

    /* renamed from: a */
    private String m260184a(Context context, List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.contains("android.permission.ACCESS_COARSE_LOCATION") && list.contains("android.permission.ACCESS_FINE_LOCATION")) {
            list.remove("android.permission.ACCESS_FINE_LOCATION");
        }
        char c = 2;
        if (list.size() > 1) {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                int intValue = this.f168138f.get(str).intValue();
                if (intValue > 0) {
                    sb.append(context.getString(intValue));
                    sb.append("、");
                }
            }
            int length = sb.length() - 1;
            if (length >= 0) {
                sb.deleteCharAt(length);
            }
            return context.getString(R.string.microapp_m_permission_multi_tip, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())), sb.toString());
        }
        String str2 = list.get(0);
        try {
            switch (str2.hashCode()) {
                case -1888586689:
                    if (str2.equals("android.permission.ACCESS_FINE_LOCATION")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -406040016:
                    if (str2.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -63024214:
                    if (str2.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -5573545:
                    if (str2.equals("android.permission.READ_PHONE_STATE")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 463403621:
                    if (str2.equals("android.permission.CAMERA")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1365911975:
                    if (str2.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1780337063:
                    if (str2.equals("android.permission.ACTIVITY_RECOGNITION")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1831139720:
                    if (str2.equals("android.permission.RECORD_AUDIO")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1977429404:
                    if (str2.equals("android.permission.READ_CONTACTS")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return context.getString(R.string.microapp_m_permission_device_id_tip, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())));
                case 1:
                case 2:
                    return context.getString(R.string.microapp_m_permission_location_tip, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())));
                case 3:
                    return context.getString(R.string.microapp_m_permission_contacts_tip, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())));
                case 4:
                    return context.getString(R.string.microapp_m_permission_camera_tip, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())));
                case 5:
                    return context.getString(R.string.microapp_m_permission_microphone_tip, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())));
                case 6:
                case 7:
                    return context.getString(R.string.microapp_m_permission_storage_tip, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())));
                case '\b':
                    return context.getString(R.string.LittleApp_StepsApi_PermissionRequestAndroid, AppbrandContext.getInst().getInitParams().mo234501a(101, AppbrandUtil.getApplicationName(AppbrandContext.getInst().getApplicationContext())));
                default:
                    return "";
            }
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "PermissionsManager", e.getStackTrace());
            return "";
        }
    }

    /* renamed from: b */
    private void m260189b(Activity activity, Set<String> set, AbstractC66590i iVar) {
        boolean z;
        for (String str : set) {
            if (iVar != null) {
                try {
                    if (!this.f168134b.contains(str)) {
                        z = iVar.mo232199a(str, Permissions.NOT_FOUND);
                    } else if (C66585g.m260179a((Context) activity, str) != 0) {
                        z = iVar.mo232199a(str, Permissions.DENIED);
                    } else {
                        z = iVar.mo232199a(str, Permissions.GRANTED);
                    }
                    if (z) {
                        break;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        m260186a(iVar);
    }

    /* renamed from: c */
    private List<String> m260190c(Activity activity, Set<String> set, AbstractC66590i iVar) {
        ArrayList arrayList = new ArrayList(set.size());
        boolean z = false;
        for (String str : set) {
            if (!this.f168134b.contains(str)) {
                if (iVar != null) {
                    iVar.mo232199a(str, Permissions.NOT_FOUND);
                }
            } else if (!mo232195a(activity, str)) {
                if (!this.f168133a.contains(str)) {
                    arrayList.add(str);
                } else {
                    z = true;
                }
            } else if (iVar != null) {
                iVar.mo232199a(str, Permissions.GRANTED);
            }
        }
        if (arrayList.isEmpty() && !z) {
            m260186a(iVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo232189a(Activity activity, Set<String> set, AbstractC66590i iVar) {
        if (activity != null) {
            try {
                m260187a(set, iVar);
                if (Build.VERSION.SDK_INT < 23) {
                    m260189b(activity, set, iVar);
                } else {
                    List<String> c = m260190c(activity, set, iVar);
                    if (!c.isEmpty()) {
                        this.f168133a.addAll(c);
                        C66585g.m260180a(activity, (String[]) c.toArray(new String[c.size()]), 1);
                    }
                }
            } catch (Throwable th) {
                AppBrandLogger.m52829e("PermissionsManager", "requestPermissionsIfNecessaryForResult", th.getMessage());
            }
            return;
        }
        return;
    }

    /* renamed from: a */
    public void mo232191a(Activity activity, String[] strArr, AbstractC66590i iVar) {
        mo232189a(activity, new HashSet(Arrays.asList(strArr)), iVar);
    }

    /* renamed from: a */
    private void m260185a(final Activity activity, final String[] strArr, final String[] strArr2, final int[] iArr, String str) {
        if (activity != null && strArr != null && strArr.length > 0) {
            try {
                HostDependManager.getInst().showModal(activity, null, activity.getString(R.string.microapp_m_permission_request), str, true, activity.getString(R.string.microapp_m_permission_cancel), null, activity.getString(R.string.microapp_m_permission_go_to_settings), null, new AbstractC67550j.AbstractC67551a<Integer>() {
                    /* class com.tt.miniapp.permission.C66588h.C665891 */

                    /* renamed from: a */
                    public void onNativeModuleCall(Integer num) {
                        if (num.intValue() == 1) {
                            if (C67043j.m261284f()) {
                                C66584f.m260172a(activity);
                            } else {
                                try {
                                    activity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                            C66588h.this.mo232194a(strArr, iArr, strArr2);
                            return;
                        }
                        C66588h.this.mo232194a(strArr, iArr, (String[]) null);
                    }
                }, activity);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
