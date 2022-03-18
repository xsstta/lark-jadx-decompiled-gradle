package com.ss.android.lark.passport.device.service.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.device.manage.C48966a;
import com.ss.android.lark.passport.device.manage.DevicesManageActivity;
import com.ss.android.lark.passport.device.p2418a.C48952a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.device.service.impl.c */
public class C48987c implements IDeviceManager {

    /* renamed from: a */
    public static final PassportLog f123005a = PassportLog.f123351c.mo171474a();

    /* renamed from: b */
    private DevicesStatus f123006b;

    /* renamed from: c */
    private Devices f123007c;

    /* renamed from: d */
    private final Object f123008d;

    /* renamed from: e */
    private boolean f123009e;

    /* renamed from: f */
    private final IDeviceService f123010f;

    /* renamed from: g */
    private final Object f123011g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.passport.device.service.impl.c$a */
    public static final class C48993a {

        /* renamed from: a */
        public static final C48987c f123019a = new C48987c(null);
    }

    /* renamed from: j */
    public String mo171042j() {
        return "android";
    }

    /* renamed from: a */
    public static C48987c m192916a() {
        return C48993a.f123019a;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: b */
    public boolean mo171032b() {
        return this.f123009e;
    }

    /* renamed from: c */
    public Devices mo171033c() {
        Devices k;
        synchronized (this.f123008d) {
            k = m192919k();
            this.f123007c = k;
        }
        return k;
    }

    /* renamed from: d */
    public DevicesStatus mo171036d() {
        DevicesStatus l;
        synchronized (this.f123011g) {
            l = m192920l();
            this.f123006b = l;
        }
        return l;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: e */
    public int mo171037e() {
        int b;
        synchronized (this.f123008d) {
            b = mo171030b(mo171033c());
        }
        return b;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: h */
    public boolean mo171040h() {
        return UserSP.getInstance().getBoolean("closeAfterDesk", false);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: i */
    public boolean mo171041i() {
        return UserSP.getInstance().getBoolean("notifyatmessage", true);
    }

    /* renamed from: k */
    private Devices m192919k() {
        String string = UserSP.getInstance().getString("devices");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Devices) C38760a.m153056a(string, Devices.class);
    }

    /* renamed from: l */
    private DevicesStatus m192920l() {
        String string = UserSP.getInstance().getString("devicesStatus");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (DevicesStatus) C38760a.m153056a(string, DevicesStatus.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.passport.device.service.impl.c$5 */
    public static /* synthetic */ class C489925 {

        /* renamed from: a */
        static final /* synthetic */ int[] f123018a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus$DeviceStatus$OnLineStatus[] r0 = com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus.DeviceStatus.OnLineStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.passport.device.service.impl.C48987c.C489925.f123018a = r0
                com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus$DeviceStatus$OnLineStatus r1 = com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus.DeviceStatus.OnLineStatus.ONLINE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.passport.device.service.impl.C48987c.C489925.f123018a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus$DeviceStatus$OnLineStatus r1 = com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus.DeviceStatus.OnLineStatus.OFFLINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.passport.device.service.impl.C48987c.C489925.f123018a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus$DeviceStatus$OnLineStatus r1 = com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus.DeviceStatus.OnLineStatus.UNKNOWN_ONLINE_STATUS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.device.service.impl.C48987c.C489925.<clinit>():void");
        }
    }

    private C48987c() {
        boolean z;
        this.f123008d = new Object();
        this.f123010f = ServiceFinder.m193761p();
        this.f123011g = new Object();
        if (!mo171040h() || !mo171039g()) {
            z = true;
        } else {
            z = false;
        }
        this.f123009e = z;
    }

    /* renamed from: f */
    public Devices mo171038f() {
        Devices.Device device = new Devices.Device();
        device.setDeviceName(RomUtils.m94957l());
        device.setDeviceModel(RomUtils.m94959n());
        device.setDeviceId(ServiceFinder.m193762q().getDeviceId());
        device.setTerminalType(3);
        device.setIsOnline(true);
        device.setLoginTime(0);
        device.setIsCurrentDevice(true);
        device.setDeviceOs(RomUtils.m94958m());
        LoginInfo loginInfo = ServiceFinder.m193748c().getLoginInfo();
        if (loginInfo != null) {
            device.tenantName = loginInfo.getTenantName();
        } else {
            device.tenantName = "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(device);
        Devices devices = new Devices();
        devices.setSessions(arrayList);
        return devices;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: g */
    public boolean mo171039g() {
        synchronized (this.f123011g) {
            DevicesStatus d = mo171036d();
            if (d != null) {
                if (d.getDevices() != null) {
                    for (DevicesStatus.DeviceStatus deviceStatus : d.getDevices()) {
                        if (deviceStatus != null && deviceStatus.getTerminalType() == DevicesStatus.DeviceStatus.TerminalType.PC && deviceStatus.getOnlineStatus() == DevicesStatus.DeviceStatus.OnLineStatus.ONLINE) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* synthetic */ C48987c(C489881 r1) {
        this();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: a */
    public void mo171027a(boolean z) {
        this.f123009e = z;
    }

    /* renamed from: a */
    public void mo171024a(Devices devices) {
        synchronized (this.f123008d) {
            this.f123007c = devices;
            m192918d(devices);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: b */
    public void mo171031b(boolean z) {
        UserSP.getInstance().putBoolean("closeAfterDesk", z);
    }

    /* renamed from: b */
    private void m192917b(DevicesStatus devicesStatus) {
        if (devicesStatus != null) {
            String a = C38760a.m153057a(devicesStatus);
            if (!"{}".equals(a) && !TextUtils.isEmpty(a)) {
                UserSP.getInstance().putString("devicesStatus", a);
            }
        }
    }

    /* renamed from: d */
    private void m192918d(Devices devices) {
        if (devices != null) {
            String a = C38760a.m153057a(devices);
            if (!"{}".equals(a) && !TextUtils.isEmpty(a)) {
                UserSP.getInstance().putString("devices", a);
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: a */
    public void mo171023a(final IGetDataCallback<Devices> iGetDataCallback) {
        f123005a.mo171465b("n_action_device_list_request", "in LarkDeviceHelper");
        this.f123010f.fetchDevices(new IGetDataCallback<Devices>() {
            /* class com.ss.android.lark.passport.device.service.impl.C48987c.C489892 */

            /* renamed from: a */
            public void onSuccess(Devices devices) {
                if (devices == null || devices.getSessions() == null || devices.getSessions().size() <= 0) {
                    C48987c.f123005a.mo171471d("n_action_device_list_request_succ", "device is null and getLocalDevice");
                    devices = C48987c.this.mo171038f();
                } else {
                    PassportLog passportLog = C48987c.f123005a;
                    passportLog.mo171465b("n_action_device_list_request_succ", "updateDevices，device.size=" + devices.getSessions().size());
                    C48987c.this.mo171024a(devices);
                }
                C48987c.this.mo171034c(devices);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C48987c.this.mo171021a(devices.getSessions()));
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                PassportLog passportLog = C48987c.f123005a;
                passportLog.mo171471d("n_action_device_list_request_fail", "errMsg=" + errorResult.toString());
                Devices c = C48987c.this.mo171033c();
                if (c == null || c.getSessions() == null || c.getSessions().size() <= 0) {
                    C48987c.f123005a.mo171471d("n_action_device_list_request_fail", "cache device is null,getLocalDevice");
                    c = C48987c.this.mo171038f();
                } else {
                    PassportLog passportLog2 = C48987c.f123005a;
                    passportLog2.mo171471d("n_action_device_list_request_fail", "cache device size=" + c.getSessions().size());
                }
                C48987c.this.mo171034c(c);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C48987c.this.mo171021a(c.getSessions()));
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: c */
    public void mo171035c(boolean z) {
        UserSP.getInstance().putBoolean("notifyatmessage", z);
    }

    /* renamed from: com.ss.android.lark.passport.device.service.impl.c$1 */
    class C489881 implements IGetDataCallback<Devices> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f123012a;

        /* renamed from: b */
        final /* synthetic */ C48987c f123013b;

        /* renamed from: a */
        public void onSuccess(Devices devices) {
            if (this.f123012a != null) {
                int b = this.f123013b.mo171030b(devices);
                PassportLog passportLog = C48987c.f123005a;
                passportLog.mo171465b("n_action_device_count_get_async", "getDeviceCountAsync in LarkDeviceHelper succ count=" + b);
                this.f123012a.onSuccess(Integer.valueOf(b));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            String str;
            if (TextUtils.isEmpty(errorResult.getDebugMsg())) {
                str = "errCode= " + errorResult.getErrorCode();
            } else {
                str = errorResult.getDebugMsg();
            }
            C48987c.f123005a.mo171471d("n_action_device_count_get_async", "getDeviceCountAsync in LarkDeviceHelper errMsg=" + str);
            IGetDataCallback iGetDataCallback = this.f123012a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }
    }

    /* renamed from: a */
    public Devices mo171021a(List<Devices.Device> list) {
        Devices devices = new Devices();
        if (list == null || list.size() <= 1) {
            devices.setSessions(list);
            return devices;
        }
        Collections.sort(list, new Comparator<Devices.Device>() {
            /* class com.ss.android.lark.passport.device.service.impl.C48987c.C489903 */

            /* renamed from: a */
            public int compare(Devices.Device device, Devices.Device device2) {
                return (int) (device2.getLoginTime() - device.getLoginTime());
            }
        });
        Devices.Device device = null;
        Iterator<Devices.Device> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Devices.Device next = it.next();
            if (next.getIsCurrentDevice()) {
                device = next;
                break;
            }
        }
        if (device != null) {
            list.remove(device);
            list.add(0, device);
        }
        devices.setSessions(list);
        return devices;
    }

    /* renamed from: b */
    public int mo171030b(Devices devices) {
        if (devices == null || devices.getSessions() == null) {
            return 1;
        }
        return devices.getSessions().size();
    }

    /* renamed from: c */
    public void mo171034c(Devices devices) {
        DevicesStatus.DeviceStatus.OnLineStatus onLineStatus;
        if (!(devices == null || devices.getSessions() == null)) {
            for (Devices.Device device : devices.getSessions()) {
                DevicesStatus.DeviceStatus deviceStatus = new DevicesStatus.DeviceStatus();
                deviceStatus.setDeviceId(device.getDeviceId());
                if (device.getIsOnline()) {
                    onLineStatus = DevicesStatus.DeviceStatus.OnLineStatus.ONLINE;
                } else {
                    onLineStatus = DevicesStatus.DeviceStatus.OnLineStatus.OFFLINE;
                }
                deviceStatus.setOnlineStatus(onLineStatus);
                mo171025a(deviceStatus);
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: a */
    public DevicesStatus.DeviceStatus mo171022a(String str) {
        String str2;
        synchronized (this.f123011g) {
            DevicesStatus d = mo171036d();
            if (!TextUtils.isEmpty(str) && d != null) {
                if (d.getDeviceCount() > 0) {
                    for (DevicesStatus.DeviceStatus deviceStatus : d.getDevices()) {
                        if (deviceStatus == null) {
                            str2 = "";
                        } else {
                            str2 = deviceStatus.getDeviceId();
                        }
                        if (str.equals(str2)) {
                            return deviceStatus;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public void mo171025a(DevicesStatus.DeviceStatus deviceStatus) {
        if (deviceStatus != null) {
            synchronized (this.f123011g) {
                if (this.f123006b == null) {
                    this.f123006b = new DevicesStatus();
                }
                int i = C489925.f123018a[deviceStatus.getOnlineStatus().ordinal()];
                if (i == 1 || i == 2) {
                    this.f123006b.update(deviceStatus);
                }
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: a */
    public void mo171026a(DevicesStatus devicesStatus) {
        synchronized (this.f123011g) {
            this.f123006b = devicesStatus;
            m192917b(devicesStatus);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager
    /* renamed from: a */
    public boolean mo171028a(Context context) {
        return mo171029a(context, 1);
    }

    /* renamed from: a */
    public boolean mo171029a(Context context, int i) {
        if (DesktopUtil.m144301a(context)) {
            C48966a aVar = new C48966a();
            Bundle bundle = new Bundle();
            bundle.putInt("lkp_launch_mode", i);
            aVar.setArguments(bundle);
            if (i == 1) {
                C36512a.m144041a().mo134762a(aVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134943a(17).mo134930b());
            } else if (i == 0) {
                C36512a.m144041a().mo134761a(aVar, new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b());
            }
        } else {
            Intent intent = new Intent(context, DevicesManageActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.passport.device.service.impl.C48987c.RunnableC489914 */

            public void run() {
                C48952a.m192837a();
            }
        });
        return true;
    }
}
