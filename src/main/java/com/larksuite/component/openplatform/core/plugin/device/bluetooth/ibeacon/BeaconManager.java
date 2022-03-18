package com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon;

import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapphost.AppbrandContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Skip;

public class BeaconManager {

    /* renamed from: a */
    public final ConcurrentHashMap<String, BeaconInfo> f60876a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public AbstractC24763c f60877b;

    /* renamed from: c */
    public boolean f60878c = false;

    /* renamed from: d */
    private IAppContext f60879d;

    /* renamed from: e */
    private final BluetoothManager f60880e;

    /* renamed from: f */
    private final AtomicBoolean f60881f = new AtomicBoolean(false);

    /* renamed from: g */
    private BluetoothAdapter f60882g;

    /* renamed from: h */
    private final AtomicBoolean f60883h = new AtomicBoolean(false);

    /* renamed from: i */
    private C24761a f60884i;

    /* renamed from: j */
    private AbstractC24762b f60885j;

    /* renamed from: k */
    private boolean f60886k;

    /* renamed from: l */
    private boolean f60887l;

    /* renamed from: m */
    private boolean f60888m;

    /* renamed from: n */
    private List<String> f60889n = new ArrayList();

    /* renamed from: o */
    private ScanCallback f60890o = new ScanCallback() {
        /* class com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager.C247601 */

        public void onScanFailed(int i) {
            AppBrandLogger.m52829e("BeaconManager", "onScanFailed, errorCode: ", Integer.valueOf(i));
            if (BeaconManager.this.f60877b != null) {
                BeaconManager.this.f60877b.mo87790a(i);
            }
            BeaconManager.this.mo87780d();
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            if (BeaconManager.this.f60877b != null && !BeaconManager.this.f60878c) {
                BeaconManager.this.f60878c = true;
                BeaconManager.this.f60877b.mo87789a();
            }
            AppBrandLogger.m52830i("BeaconManager", "beacon onBatchScanResults callback" + list.size());
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                BeaconInfo a = BeaconManager.this.mo87772a(list.get(i));
                if (a != null) {
                    arrayList.add(a);
                    String str = a.major + a.minor;
                    synchronized (BeaconManager.this.f60876a) {
                        BeaconManager.this.f60876a.put(str, a);
                    }
                }
            }
            if (arrayList.size() > 0 && BeaconManager.this.f60877b != null) {
                BeaconManager.this.f60877b.mo87791a(arrayList);
            }
        }

        public void onScanResult(int i, ScanResult scanResult) {
            if (BeaconManager.this.f60877b != null && !BeaconManager.this.f60878c) {
                BeaconManager.this.f60878c = true;
                BeaconManager.this.f60877b.mo87789a();
            }
            AppBrandLogger.m52830i("BeaconManager", "beacon onScanResult callback");
            BeaconInfo a = BeaconManager.this.mo87772a(scanResult);
            if (a != null) {
                String str = a.major + a.minor;
                if (BeaconManager.this.f60877b != null) {
                    BeaconManager.this.f60877b.mo87791a(Arrays.asList(a));
                }
                synchronized (BeaconManager.this.f60876a) {
                    BeaconManager.this.f60876a.put(str, a);
                }
            }
        }
    };

    public enum ScanState {
        SCAN_ERROR,
        ALREADY_SCANNED,
        SCAN_OK
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager$b */
    public interface AbstractC24762b {
        /* renamed from: a */
        void mo87788a(boolean z, boolean z2);
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager$c */
    public interface AbstractC24763c {
        /* renamed from: a */
        void mo87789a();

        /* renamed from: a */
        void mo87790a(int i);

        /* renamed from: a */
        void mo87791a(List<BeaconInfo> list);
    }

    /* renamed from: a */
    public boolean mo87777a() {
        if (this.f60880e == null) {
            return false;
        }
        return this.f60879d.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* renamed from: f */
    public boolean mo87782f() {
        return this.f60881f.get();
    }

    /* renamed from: d */
    public boolean mo87780d() {
        mo87781e();
        mo87779c();
        this.f60876a.clear();
        this.f60878c = false;
        return !this.f60881f.get();
    }

    /* renamed from: b */
    public boolean mo87778b() {
        BluetoothAdapter adapter = this.f60880e.getAdapter();
        this.f60882g = adapter;
        if (adapter == null) {
            return false;
        }
        return adapter.isEnabled();
    }

    /* renamed from: c */
    public void mo87779c() {
        if (this.f60881f.compareAndSet(true, false)) {
            BluetoothLeScanner bluetoothLeScanner = this.f60882g.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                AppBrandLogger.m52830i("BeaconManager", "beacon stopScan");
                bluetoothLeScanner.stopScan(this.f60890o);
                mo87775a(this.f60882g);
                return;
            }
            AppBrandLogger.m52829e("BeaconManager", "bluetoothLeScanner is null");
        }
    }

    /* renamed from: e */
    public void mo87781e() {
        if (this.f60884i == null || !this.f60883h.compareAndSet(true, false)) {
            AppBrandLogger.m52830i("BeaconManager", "receiver is unRegistered");
            return;
        }
        AppBrandLogger.m52830i("BeaconManager", "unregister beacon service receiver");
        AppbrandContext.getInst().getApplicationContext().unregisterReceiver(this.f60884i);
        this.f60884i = null;
    }

    /* renamed from: g */
    public List<BeaconInfo> mo87783g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f60876a.keySet()) {
            arrayList.add(this.f60876a.get(str));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.ibeacon.BeaconManager$a */
    public class C24761a extends BroadcastReceiver {
        C24761a() {
        }

        public void onReceive(Context context, Intent intent) {
            AppBrandLogger.m52830i("BeaconManager", "beacon state change, action: ", intent.getAction(), ", state: ", Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1)), ", previous state: ", Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)));
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                AppBrandLogger.m52829e("BeaconManager", "BeaconStateReceiver, adapter is null");
                return;
            }
            BeaconManager.this.mo87775a(defaultAdapter);
        }
    }

    /* renamed from: a */
    public static BeaconManager m89833a(IAppContext iAppContext) {
        return C12988a.m53439a(iAppContext).mo48911g();
    }

    /* renamed from: b */
    private boolean m89835b(BluetoothAdapter bluetoothAdapter) {
        if (this.f60886k && this.f60887l == bluetoothAdapter.isEnabled() && this.f60888m == this.f60881f.get()) {
            return false;
        }
        return true;
    }

    public BeaconManager(IAppContext iAppContext) {
        this.f60879d = iAppContext;
        this.f60880e = (BluetoothManager) iAppContext.getApplicationContext().getSystemService("bluetooth");
    }

    /* renamed from: a */
    private boolean m89834a(BeaconInfo beaconInfo) {
        String replaceAll = beaconInfo.uuid.replaceAll("-", "");
        List<String> list = this.f60889n;
        if (list != null) {
            for (String str : list) {
                if (str.replaceAll("-", "").equalsIgnoreCase(replaceAll)) {
                    return false;
                }
            }
        }
        AppBrandLogger.m52828d("BeaconManager", "this device had filter,uuid is not match");
        return true;
    }

    /* renamed from: a */
    public BeaconInfo mo87772a(ScanResult scanResult) {
        if (scanResult == null) {
            AppBrandLogger.m52829e("BeaconManager", "beacon onScanResult result null");
            return null;
        }
        BeaconInfo fromScanData = new BeaconInfo(scanResult.getRssi()).fromScanData(scanResult.getScanRecord().getBytes());
        if (fromScanData == null) {
            AppBrandLogger.m52828d("BeaconManager", "this is not beacon device");
            return null;
        } else if (m89834a(fromScanData)) {
            return null;
        } else {
            AppBrandLogger.m52828d("BeaconManager", fromScanData.toString());
            return fromScanData;
        }
    }

    /* renamed from: a */
    public void mo87775a(BluetoothAdapter bluetoothAdapter) {
        if (m89835b(bluetoothAdapter)) {
            this.f60886k = true;
            this.f60887l = bluetoothAdapter.isEnabled();
            this.f60888m = this.f60881f.get();
            AbstractC24762b bVar = this.f60885j;
            if (bVar != null) {
                bVar.mo87788a(bluetoothAdapter.isEnabled(), this.f60881f.get());
            }
        }
    }

    /* renamed from: a */
    public void mo87776a(AbstractC24762b bVar) {
        if (this.f60884i == null) {
            this.f60884i = new C24761a();
        }
        if (this.f60883h.compareAndSet(false, true)) {
            this.f60885j = bVar;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            AppBrandLogger.m52830i("BeaconManager", "register beacon service receiver");
            m89832a(AppbrandContext.getInst().getApplicationContext(), this.f60884i, intentFilter);
            return;
        }
        AppBrandLogger.m52830i("BeaconManager", "receiver is registered");
    }

    /* renamed from: a */
    public ScanState mo87773a(List<String> list, AbstractC24763c cVar) {
        BluetoothLeScanner bluetoothLeScanner = this.f60882g.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            AppBrandLogger.m52829e("BeaconManager", "leScanner is null");
            return ScanState.SCAN_ERROR;
        } else if (!this.f60881f.compareAndSet(false, true)) {
            return ScanState.ALREADY_SCANNED;
        } else {
            this.f60889n = list;
            this.f60877b = cVar;
            ArrayList arrayList = new ArrayList();
            ScanSettings.Builder builder = new ScanSettings.Builder();
            if (this.f60882g.isOffloadedScanBatchingSupported()) {
                builder.setReportDelay(10);
            }
            bluetoothLeScanner.startScan(arrayList, builder.build(), this.f60890o);
            mo87775a(this.f60882g);
            return ScanState.SCAN_OK;
        }
    }

    /* renamed from: a */
    public void mo87774a(Activity activity, int i) {
        if (activity != null) {
            Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
            AbstractC12888c i2 = C25529d.m91168i(this.f60879d);
            if (i2 != null) {
                i2.startActivityForResult(intent, i);
            } else {
                activity.startActivityForResult(intent, i);
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m89832a(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
