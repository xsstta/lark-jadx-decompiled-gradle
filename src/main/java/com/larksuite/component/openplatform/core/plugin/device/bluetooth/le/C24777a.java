package com.larksuite.component.openplatform.core.plugin.device.bluetooth.le;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.C24758b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a */
public class C24777a {

    /* renamed from: a */
    public Map<String, C24779b> f60913a = new HashMap();

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$a */
    public interface AbstractC24778a<Second, Result> {
        void onResult(BluetoothGatt bluetoothGatt, Second second, Result result);
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$d */
    public interface AbstractC24781d extends AbstractC24778a<BluetoothGattCharacteristic, Integer> {
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$e */
    public interface AbstractC24782e extends AbstractC24778a<Integer, Integer> {
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$f */
    public interface AbstractC24783f extends AbstractC24778a<BluetoothGattDescriptor, Integer> {
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$g */
    public interface AbstractC24784g extends AbstractC24778a<Integer, List<BluetoothGattService>> {
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$h */
    public interface AbstractC24785h extends AbstractC24778a<Integer, Integer> {
    }

    /* renamed from: a */
    public BluetoothError mo87823a(String str, String str2, String str3, String str4, boolean z) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("BluetoothTAG", "setCharacteristicNotification, deviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_DEVICE_ID;
        } else if (TextUtils.isEmpty(str2)) {
            AppBrandLogger.m52829e("BluetoothTAG", "setCharacteristicNotification, serviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_SERVICE_ID;
        } else if (TextUtils.isEmpty(str3)) {
            AppBrandLogger.m52829e("BluetoothTAG", "setCharacteristicNotification, characteristicId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_CHARACTERISTIC_ID;
        } else {
            C24779b bVar = this.f60913a.get(str);
            if (bVar == null || bVar.f60916c != 2) {
                AppBrandLogger.m52829e("BluetoothTAG", "setCharacteristicNotification, no connection for deviceId: " + str);
                return BluetoothError.BLUETOOTH_API_NO_CONNECTION;
            }
            BluetoothGattService service = bVar.f60915b.getService(UUID.fromString(str2));
            if (service == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "setCharacteristicNotification, service not found, serviceId: " + str2);
                return BluetoothError.BLUETOOTH_API_SERVICE_NOT_FOUND;
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(str3));
            if (characteristic == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "setCharacteristicNotification, characteristic not found, characteristicId: " + str3);
                return BluetoothError.BLUETOOTH_API_CHARACTERISTIC_ID_NOT_FOUND;
            }
            AppBrandLogger.m52830i("BluetoothTAG", "setCharacteristicNotification, deviceId: " + str + ", serviceId: " + str2 + ", characteristicId: " + str3 + ", descriptorId: " + str4 + ", enabled: " + z);
            if (!bVar.f60915b.setCharacteristicNotification(characteristic, z)) {
                AppBrandLogger.m52829e("BluetoothTAG", "setCharacteristicNotification failed");
                return BluetoothError.BLUETOOTH_API_SYSTEM_ERROR;
            } else if (TextUtils.isEmpty(str4)) {
                BluetoothError a = m89865a(bVar.f60915b, characteristic, "00002902-0000-1000-8000-00805f9b34fb", z ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                AppBrandLogger.m52830i("BluetoothTAG", "setCharacteristicNotification, write default descriptor result: " + a);
                return BluetoothError.BLUETOOTH_API_NO_ERROR;
            } else {
                return m89865a(bVar.f60915b, characteristic, str4, z ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            }
        }
    }

    /* renamed from: a */
    public BluetoothError mo87822a(String str, String str2, String str3, String str4, AbstractC24781d dVar) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, deviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_DEVICE_ID;
        } else if (TextUtils.isEmpty(str2)) {
            AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, serviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_SERVICE_ID;
        } else if (TextUtils.isEmpty(str3)) {
            AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, characteristicId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_CHARACTERISTIC_ID;
        } else {
            C24779b bVar = this.f60913a.get(str);
            if (bVar == null || bVar.f60916c != 2) {
                AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, no connection for deviceId: " + str);
                return BluetoothError.BLUETOOTH_API_NO_CONNECTION;
            }
            BluetoothGattService service = bVar.f60915b.getService(UUID.fromString(str2));
            if (service == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, service not found, serviceId: " + str2);
                return BluetoothError.BLUETOOTH_API_SERVICE_NOT_FOUND;
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(str3));
            if (characteristic == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, characteristic not found, characteristicId: " + str3);
                return BluetoothError.BLUETOOTH_API_CHARACTERISTIC_ID_NOT_FOUND;
            }
            byte[] a = C24758b.m89829a(str4);
            if (a == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, invalid hexValue: " + str4);
                return BluetoothError.BLUETOOTH_API_INVALID_DATA;
            }
            AppBrandLogger.m52830i("BluetoothTAG", "writeBLECharacteristicValue, deviceId: " + str + ", serviceId: " + str2 + ", characteristicId: " + str3 + ", value: " + str4);
            bVar.f60918e.mo87832b(dVar);
            if (!characteristic.setValue(a) || !bVar.f60915b.writeCharacteristic(characteristic)) {
                return BluetoothError.BLUETOOTH_API_FAILED_TO_WRITE;
            }
            return BluetoothError.BLUETOOTH_API_NO_ERROR;
        }
    }

    /* renamed from: a */
    public void mo87824a() {
        AppBrandLogger.m52830i("BluetoothTAG", "close BLE");
        Map<String, C24779b> map = this.f60913a;
        if (!(map == null || map.isEmpty())) {
            AppBrandLogger.m52830i("BluetoothTAG", "remaining connections: " + this.f60913a.size());
            for (C24779b bVar : this.f60913a.values()) {
                if (!(bVar == null || bVar.f60915b == null)) {
                    bVar.f60915b.close();
                }
            }
            this.f60913a.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$b */
    public static class C24779b {

        /* renamed from: a */
        String f60914a;

        /* renamed from: b */
        BluetoothGatt f60915b;

        /* renamed from: c */
        int f60916c;

        /* renamed from: d */
        int f60917d = 1;

        /* renamed from: e */
        C24780c f60918e;

        /* renamed from: a */
        public boolean mo87825a() {
            BluetoothGatt bluetoothGatt = this.f60915b;
            if (bluetoothGatt == null || !bluetoothGatt.connect()) {
                return false;
            }
            this.f60916c = 1;
            return true;
        }

        /* renamed from: b */
        public void mo87826b() {
            BluetoothGatt bluetoothGatt = this.f60915b;
            if (bluetoothGatt != null) {
                bluetoothGatt.disconnect();
                this.f60916c = 3;
            }
        }

        /* renamed from: c */
        public boolean mo87827c() {
            BluetoothGatt bluetoothGatt = this.f60915b;
            if (bluetoothGatt == null) {
                return false;
            }
            this.f60917d = 2;
            return bluetoothGatt.discoverServices();
        }

        C24779b(String str) {
            this.f60914a = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.bluetooth.le.a$c */
    public static class C24780c extends BluetoothGattCallback {

        /* renamed from: a */
        private C24777a f60919a;

        /* renamed from: b */
        private C24779b f60920b;

        /* renamed from: c */
        private AbstractC24782e f60921c;

        /* renamed from: d */
        private AbstractC24782e f60922d;

        /* renamed from: e */
        private AbstractC24784g f60923e;

        /* renamed from: f */
        private AbstractC24781d f60924f;

        /* renamed from: g */
        private AbstractC24781d f60925g;

        /* renamed from: h */
        private AbstractC24783f f60926h;

        /* renamed from: i */
        private AbstractC24783f f60927i;

        /* renamed from: j */
        private AbstractC24785h f60928j;

        /* renamed from: k */
        private IAppContext f60929k;

        /* renamed from: a */
        public void mo87828a(AbstractC24781d dVar) {
            this.f60924f = dVar;
        }

        /* renamed from: b */
        public void mo87832b(AbstractC24781d dVar) {
            this.f60925g = dVar;
        }

        /* renamed from: a */
        public void mo87829a(AbstractC24782e eVar) {
            this.f60921c = eVar;
        }

        /* renamed from: b */
        public void mo87833b(AbstractC24782e eVar) {
            this.f60922d = eVar;
        }

        /* renamed from: a */
        public void mo87830a(AbstractC24784g gVar) {
            this.f60923e = gVar;
        }

        /* renamed from: a */
        public void mo87831a(AbstractC24785h hVar) {
            this.f60928j = hVar;
        }

        /* renamed from: a */
        private void m89878a(String str, boolean z) {
            try {
                JSONObject put = new JSONObject().put("deviceId", str).put("connected", z);
                AppBrandLogger.m52830i("BluetoothTAG", "notifyConnectionStateChange, deviceId: " + str + ", connected: " + z);
                C67432a.m262319a(this.f60929k).getJsBridge().sendMsgToJsCore("BLEConnectionStateChange", put.toString());
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "notifyConnectionStateChange error: " + e.getMessage(), e);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            try {
                String address = bluetoothGatt.getDevice().getAddress();
                AppBrandLogger.m52830i("BluetoothTAG", "onServicesDiscovered, deviceId: " + address + ", status: " + i);
                if (i == 0) {
                    this.f60920b.f60917d = 3;
                } else {
                    this.f60920b.f60917d = 1;
                }
                if (this.f60923e != null) {
                    this.f60923e.onResult(bluetoothGatt, Integer.valueOf(i), this.f60920b.f60915b.getServices());
                    this.f60923e = null;
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onServicesDiscovered error: " + e.getMessage(), e);
            }
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            try {
                String address = bluetoothGatt.getDevice().getAddress();
                String uuid = bluetoothGattCharacteristic.getService().getUuid().toString();
                String uuid2 = bluetoothGattCharacteristic.getUuid().toString();
                String a = C24758b.m89825a(bluetoothGattCharacteristic.getValue());
                AppBrandLogger.m52830i("BluetoothTAG", "onCharacteristicChanged, deviceId: " + address + ", serviceId: " + uuid + ", characteristicId: " + uuid2 + ", value: " + a);
                C67432a.m262319a(this.f60929k).getJsBridge().sendMsgToJsCore("BLECharacteristicValueChange", new JSONObject().put("deviceId", address).put("serviceId", uuid).put("characteristicId", uuid2).put("value", a).toString());
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onCharacteristicChanged error: " + e.getMessage(), e);
            }
        }

        C24780c(C24777a aVar, C24779b bVar, IAppContext iAppContext) {
            this.f60919a = aVar;
            this.f60920b = bVar;
            this.f60929k = iAppContext;
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            try {
                AppBrandLogger.m52830i("BluetoothTAG", "onCharacteristicRead, deviceId: " + bluetoothGatt.getDevice().getAddress() + ", status: " + i + ", characteristicId: " + bluetoothGattCharacteristic.getUuid().toString());
                AbstractC24781d dVar = this.f60924f;
                if (dVar != null) {
                    dVar.onResult(bluetoothGatt, bluetoothGattCharacteristic, Integer.valueOf(i));
                    this.f60924f = null;
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onCharacteristicRead error: " + e.getMessage(), e);
            }
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            try {
                AppBrandLogger.m52830i("BluetoothTAG", "onCharacteristicWrite, deviceId: " + bluetoothGatt.getDevice().getAddress() + ", status: " + i + ", characteristicId: " + bluetoothGattCharacteristic.getUuid().toString());
                AbstractC24781d dVar = this.f60925g;
                if (dVar != null) {
                    dVar.onResult(bluetoothGatt, bluetoothGattCharacteristic, Integer.valueOf(i));
                    this.f60925g = null;
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onCharacteristicWrite error: " + e.getMessage(), e);
            }
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            try {
                AppBrandLogger.m52830i("BluetoothTAG", "onDescriptorRead, deviceId: " + bluetoothGatt.getDevice().getAddress() + ", status: " + i + ", descriptorId: " + bluetoothGattDescriptor.getUuid().toString());
                AbstractC24783f fVar = this.f60926h;
                if (fVar != null) {
                    fVar.onResult(bluetoothGatt, bluetoothGattDescriptor, Integer.valueOf(i));
                    this.f60926h = null;
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onDescriptorRead error: " + e.getMessage(), e);
            }
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            try {
                AppBrandLogger.m52830i("BluetoothTAG", "onDescriptorWrite, deviceId: " + bluetoothGatt.getDevice().getAddress() + ", status: " + i + ", descriptorId: " + bluetoothGattDescriptor.getUuid().toString());
                AbstractC24783f fVar = this.f60927i;
                if (fVar != null) {
                    fVar.onResult(bluetoothGatt, bluetoothGattDescriptor, Integer.valueOf(i));
                    this.f60927i = null;
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onDescriptorWrite error: " + e.getMessage(), e);
            }
        }

        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            try {
                AppBrandLogger.m52830i("BluetoothTAG", "onMtuChanged, deviceId: " + bluetoothGatt.getDevice().getAddress() + ", mtu: " + i + ", status: " + i2);
                AbstractC24785h hVar = this.f60928j;
                if (hVar != null) {
                    hVar.onResult(bluetoothGatt, Integer.valueOf(i), Integer.valueOf(i2));
                    this.f60928j = null;
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onMtuChanged error: " + e.getMessage(), e);
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            boolean z;
            AppBrandLogger.m52830i("BluetoothTAG", "onConnectionStateChange, gatt: " + bluetoothGatt + ", status: " + i + ", newState: " + i2);
            try {
                String address = bluetoothGatt.getDevice().getAddress();
                AbstractC24782e eVar = this.f60921c;
                AbstractC24782e eVar2 = this.f60922d;
                if (i2 == 2) {
                    AppBrandLogger.m52830i("BluetoothTAG", "connected to device: " + address);
                    this.f60920b.f60916c = 2;
                    this.f60921c = null;
                    z = true;
                } else {
                    if (i2 == 0) {
                        AppBrandLogger.m52830i("BluetoothTAG", "disconnected from device: " + address);
                        this.f60920b.f60916c = 0;
                        this.f60922d = null;
                        this.f60920b.f60915b.close();
                        this.f60919a.f60913a.remove(address);
                    }
                    z = false;
                }
                m89878a(address, z);
                if (eVar != null) {
                    eVar.onResult(bluetoothGatt, Integer.valueOf(i), Integer.valueOf(i2));
                }
                if (eVar2 != null) {
                    eVar2.onResult(bluetoothGatt, Integer.valueOf(i), Integer.valueOf(i2));
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("BluetoothTAG", "onConnectionStateChange error: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: a */
    public static C24777a m89866a(IAppContext iAppContext) {
        return C12988a.m53439a(iAppContext).mo48910f();
    }

    /* renamed from: a */
    public BluetoothError mo87818a(String str, AbstractC24782e eVar) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("BluetoothTAG", "disconnectBLEDevice, deviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_DEVICE_ID;
        }
        C24779b bVar = this.f60913a.get(str);
        if (bVar == null) {
            AppBrandLogger.m52829e("BluetoothTAG", "no connection for deviceId: " + str);
            return BluetoothError.BLUETOOTH_API_NO_CONNECTION;
        }
        AppBrandLogger.m52830i("BluetoothTAG", "disconnect deviceId: " + str);
        bVar.f60918e.mo87833b(eVar);
        bVar.mo87826b();
        return BluetoothError.BLUETOOTH_API_NO_ERROR;
    }

    /* renamed from: a */
    public BluetoothError mo87820a(String str, AbstractC24784g gVar) {
        List<BluetoothGattService> services;
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("BluetoothTAG", "getBLEDeviceServices, deviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_DEVICE_ID;
        }
        C24779b bVar = this.f60913a.get(str);
        if (bVar == null || bVar.f60916c != 2) {
            AppBrandLogger.m52829e("BluetoothTAG", "no connection for deviceId: " + str);
            return BluetoothError.BLUETOOTH_API_NO_CONNECTION;
        } else if (gVar != null) {
            AppBrandLogger.m52830i("BluetoothTAG", "getServices, deviceId: " + str);
            if (bVar.f60917d != 3 || (services = bVar.f60915b.getServices()) == null || services.isEmpty()) {
                bVar.f60918e.mo87830a(gVar);
                if (bVar.f60917d == 1) {
                    AppBrandLogger.m52830i("BluetoothTAG", "discoverServices begin");
                    bVar.mo87827c();
                }
                return BluetoothError.BLUETOOTH_API_NO_ERROR;
            }
            gVar.onResult(bVar.f60915b, 0, services);
            return BluetoothError.BLUETOOTH_API_NO_ERROR;
        } else {
            AppBrandLogger.m52829e("BluetoothTAG", "getBLEDeviceServices, callback is null");
            throw new IllegalArgumentException("callback can't be null");
        }
    }

    /* renamed from: a */
    public BluetoothError mo87817a(String str, int i, AbstractC24785h hVar) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("BluetoothTAG", "setBLEMTU, deviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_DEVICE_ID;
        } else if (i < 22 || i > 512) {
            AppBrandLogger.m52829e("BluetoothTAG", "setBLEMTU, invalid mtu: " + i);
            return BluetoothError.BLUETOOTH_API_INVALID_DATA;
        } else {
            C24779b bVar = this.f60913a.get(str);
            if (bVar == null || bVar.f60916c != 2) {
                AppBrandLogger.m52829e("BluetoothTAG", "writeBLECharacteristicValue, no connection for deviceId: " + str);
                return BluetoothError.BLUETOOTH_API_NO_CONNECTION;
            }
            AppBrandLogger.m52830i("BluetoothTAG", "setMtu, deviceId: " + str + ", mtu: " + i);
            bVar.f60918e.mo87831a(hVar);
            if (bVar.f60915b.requestMtu(i)) {
                return BluetoothError.BLUETOOTH_API_NO_ERROR;
            }
            return BluetoothError.BLUETOOTH_API_SYSTEM_ERROR;
        }
    }

    /* renamed from: a */
    public BluetoothError mo87819a(String str, AbstractC24782e eVar, IAppContext iAppContext) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("BluetoothTAG", "connectBLEDevice deviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_DEVICE_ID;
        }
        C24779b bVar = this.f60913a.get(str);
        if (bVar != null && bVar.f60916c == 0) {
            AppBrandLogger.m52830i("BluetoothTAG", "Trying to use an existing mBluetoothGatt for connection.");
            bVar.f60918e.mo87829a(eVar);
            if (bVar.mo87825a()) {
                return BluetoothError.BLUETOOTH_API_NO_ERROR;
            }
            AppBrandLogger.m52829e("BluetoothTAG", "re-connect error");
            return BluetoothError.BLUETOOTH_API_CONNECTION_FAIL;
        } else if (bVar == null || bVar.f60916c != 2) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "bluetooth adapter is null");
                return BluetoothError.BLUETOOTH_API_DEVICE_NOT_AVAILABLE;
            }
            BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "failed to find device for deviceId: " + str);
                return BluetoothError.BLUETOOTH_API_DEVICE_NOT_FOUND;
            }
            AppBrandLogger.m52830i("BluetoothTAG", "connect device: " + str);
            C24779b bVar2 = new C24779b(str);
            C24780c cVar = new C24780c(this, bVar2, iAppContext);
            if (Build.VERSION.SDK_INT >= 23) {
                AppBrandLogger.m52830i("BluetoothTAG", "sdk > M use le, so connect device: " + str);
                bVar2.f60915b = remoteDevice.connectGatt(AppbrandContext.getInst().getApplicationContext(), false, cVar, 2);
            } else {
                AppBrandLogger.m52830i("BluetoothTAG", "sdk <= M use auto, so connect device: " + str);
                bVar2.f60915b = remoteDevice.connectGatt(AppbrandContext.getInst().getApplicationContext(), false, cVar);
            }
            bVar2.f60918e = cVar;
            if (bVar2.f60915b == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "bluetoothGatt is null");
                return BluetoothError.BLUETOOTH_API_BLE_NOT_AVAILABLE;
            }
            bVar2.f60918e.mo87829a(eVar);
            bVar2.f60916c = 1;
            this.f60913a.put(str, bVar2);
            return BluetoothError.BLUETOOTH_API_NO_ERROR;
        } else {
            AppBrandLogger.m52830i("BluetoothTAG", "has connected return success");
            eVar.onResult(bVar.f60915b, 2, 2);
            return BluetoothError.BLUETOOTH_API_NO_ERROR;
        }
    }

    /* renamed from: a */
    private BluetoothError m89865a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, String str, byte[] bArr) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString(str));
        if (descriptor == null) {
            return BluetoothError.BLUETOOTH_API_DESCRIPTOR_NOT_FOUND;
        }
        descriptor.setValue(bArr);
        if (bluetoothGatt.writeDescriptor(descriptor)) {
            return BluetoothError.BLUETOOTH_API_NO_ERROR;
        }
        return BluetoothError.BLUETOOTH_API_SYSTEM_ERROR;
    }

    /* renamed from: a */
    public BluetoothError mo87821a(String str, String str2, String str3, AbstractC24781d dVar) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("BluetoothTAG", "readBLECharacteristicValue, deviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_DEVICE_ID;
        } else if (TextUtils.isEmpty(str2)) {
            AppBrandLogger.m52829e("BluetoothTAG", "readBLECharacteristicValue, serviceId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_SERVICE_ID;
        } else if (TextUtils.isEmpty(str3)) {
            AppBrandLogger.m52829e("BluetoothTAG", "readBLECharacteristicValue, characteristicId is empty");
            return BluetoothError.BLUETOOTH_API_INVALID_CHARACTERISTIC_ID;
        } else {
            C24779b bVar = this.f60913a.get(str);
            if (bVar == null || bVar.f60916c != 2) {
                AppBrandLogger.m52829e("BluetoothTAG", "readBLECharacteristicValue, no connection for deviceId: " + str);
                return BluetoothError.BLUETOOTH_API_NO_CONNECTION;
            }
            BluetoothGattService service = bVar.f60915b.getService(UUID.fromString(str2));
            if (service == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "readBLECharacteristicValue, service not found, serviceId: " + str2);
                return BluetoothError.BLUETOOTH_API_SERVICE_NOT_FOUND;
            }
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(str3));
            if (characteristic == null) {
                AppBrandLogger.m52829e("BluetoothTAG", "readBLECharacteristicValue, characteristic not found, characteristicId: " + str3);
                return BluetoothError.BLUETOOTH_API_CHARACTERISTIC_ID_NOT_FOUND;
            }
            AppBrandLogger.m52830i("BluetoothTAG", "readBLECharacteristicValue, deviceId: " + str + ", serviceId: " + str2 + ", characteristicId: " + str3);
            bVar.f60918e.mo87828a(dVar);
            if (bVar.f60915b.readCharacteristic(characteristic)) {
                return BluetoothError.BLUETOOTH_API_NO_ERROR;
            }
            AppBrandLogger.m52829e("BluetoothTAG", "readCharacteristic failed");
            return BluetoothError.BLUETOOTH_API_FAILED_TO_READ;
        }
    }
}
