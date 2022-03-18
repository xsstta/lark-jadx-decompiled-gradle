package com.serenegiant.usb;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import me.ele.lancet.base.annotations.Skip;

/* access modifiers changed from: package-private */
public final class USBMonitor {
    public final String ACTION_USB_PERMISSION = ("com.serenegiant.USB_PERMISSION." + hashCode());
    public volatile boolean destroyed;
    public final Handler mAsyncHandler;
    public final ConcurrentHashMap<UsbDevice, UsbControlBlock> mCtrlBlocks = new ConcurrentHashMap<>();
    private final Runnable mDeviceCheckRunnable = new Runnable() {
        /* class com.serenegiant.usb.USBMonitor.RunnableC271742 */

        public void run() {
            int size;
            int size2;
            if (!USBMonitor.this.destroyed) {
                List<UsbDevice> deviceList = USBMonitor.this.getDeviceList();
                int size3 = deviceList.size();
                synchronized (USBMonitor.this.mHasPermissions) {
                    size = USBMonitor.this.mHasPermissions.size();
                    USBMonitor.this.mHasPermissions.clear();
                    for (UsbDevice usbDevice : deviceList) {
                        USBMonitor.this.hasPermission(usbDevice);
                    }
                    size2 = USBMonitor.this.mHasPermissions.size();
                }
                if (size3 > USBMonitor.this.mDeviceCounts || size2 > size) {
                    USBMonitor.this.mDeviceCounts = size3;
                    if (USBMonitor.this.mOnDeviceConnectListener != null) {
                        for (int i = 0; i < size3; i++) {
                            final UsbDevice usbDevice2 = deviceList.get(i);
                            USBMonitor.this.mAsyncHandler.post(new Runnable() {
                                /* class com.serenegiant.usb.USBMonitor.RunnableC271742.RunnableC271751 */

                                public void run() {
                                    USBMonitor.this.mOnDeviceConnectListener.onAttach(usbDevice2);
                                }
                            });
                        }
                    }
                }
                USBMonitor.this.mAsyncHandler.postDelayed(this, 2000);
            }
        }
    };
    public volatile int mDeviceCounts = 0;
    private List<DeviceFilter> mDeviceFilters = new ArrayList();
    public final SparseArray<WeakReference<UsbDevice>> mHasPermissions = new SparseArray<>();
    public final OnDeviceConnectListener mOnDeviceConnectListener;
    private PendingIntent mPermissionIntent = null;
    public final UsbManager mUsbManager;
    private final BroadcastReceiver mUsbReceiver = new BroadcastReceiver() {
        /* class com.serenegiant.usb.USBMonitor.C271731 */

        public void onReceive(Context context, Intent intent) {
            UsbDevice usbDevice;
            if (!USBMonitor.this.destroyed) {
                String action = intent.getAction();
                if (USBMonitor.this.ACTION_USB_PERMISSION.equals(action)) {
                    synchronized (USBMonitor.this) {
                        UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
                        if (!intent.getBooleanExtra("permission", false)) {
                            USBMonitor.this.processCancel(usbDevice2);
                        } else if (usbDevice2 != null) {
                            USBMonitor.this.processConnect(usbDevice2);
                        }
                    }
                } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                    UsbDevice usbDevice3 = (UsbDevice) intent.getParcelableExtra("device");
                    USBMonitor uSBMonitor = USBMonitor.this;
                    uSBMonitor.updatePermission(usbDevice3, uSBMonitor.hasPermission(usbDevice3));
                    USBMonitor.this.processAttach(usbDevice3);
                } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action) && (usbDevice = (UsbDevice) intent.getParcelableExtra("device")) != null) {
                    UsbControlBlock remove = USBMonitor.this.mCtrlBlocks.remove(usbDevice);
                    if (remove != null) {
                        remove.close();
                    }
                    USBMonitor.this.mDeviceCounts = 0;
                    USBMonitor.this.processDettach(usbDevice);
                }
            }
        }
    };
    private final WeakReference<Context> mWeakContext;

    public interface OnDeviceConnectListener {
        void onAttach(UsbDevice usbDevice);

        void onCancel(UsbDevice usbDevice);

        void onConnect(UsbDevice usbDevice, UsbControlBlock usbControlBlock, boolean z);

        void onDettach(UsbDevice usbDevice);

        void onDisconnect(UsbDevice usbDevice, UsbControlBlock usbControlBlock);
    }

    public static final class UsbControlBlock implements Cloneable {
        private final int mBusNum;
        protected UsbDeviceConnection mConnection;
        private final int mDevNum;
        protected final UsbDeviceInfo mInfo;
        private final SparseArray<SparseArray<UsbInterface>> mInterfaces;
        private final WeakReference<UsbDevice> mWeakDevice;
        private final WeakReference<USBMonitor> mWeakMonitor;

        public int getBusNum() {
            return this.mBusNum;
        }

        public int getDevNum() {
            return this.mDevNum;
        }

        public synchronized UsbDeviceConnection getConnection() {
            return this.mConnection;
        }

        public String getManufacture() {
            return this.mInfo.manufacturer;
        }

        public String getProductName() {
            return this.mInfo.product;
        }

        public String getSerial() {
            return this.mInfo.serial;
        }

        public String getUsbVersion() {
            return this.mInfo.usb_version;
        }

        public String getVersion() {
            return this.mInfo.version;
        }

        public final UsbDevice getDevice() {
            return this.mWeakDevice.get();
        }

        public int getDeviceKey() throws IllegalStateException {
            checkConnection();
            return USBMonitor.getDeviceKey(this.mWeakDevice.get());
        }

        public String getDeviceKeyName() {
            return USBMonitor.getDeviceKeyName(this.mWeakDevice.get());
        }

        public int getDeviceKeyWithSerial() {
            return getDeviceKeyNameWithSerial().hashCode();
        }

        public synchronized int getFileDescriptor() throws IllegalStateException {
            checkConnection();
            return this.mConnection.getFileDescriptor();
        }

        public synchronized byte[] getRawDescriptors() throws IllegalStateException {
            checkConnection();
            return this.mConnection.getRawDescriptors();
        }

        public USBMonitor getUSBMonitor() {
            return this.mWeakMonitor.get();
        }

        private synchronized void checkConnection() throws IllegalStateException {
            if (this.mConnection == null) {
                throw new IllegalStateException("already closed");
            }
        }

        @Override // java.lang.Object
        public UsbControlBlock clone() throws CloneNotSupportedException {
            try {
                return new UsbControlBlock(this);
            } catch (IllegalStateException e) {
                throw new CloneNotSupportedException(e.getMessage());
            }
        }

        public int getDeviceId() {
            UsbDevice usbDevice = this.mWeakDevice.get();
            if (usbDevice != null) {
                return usbDevice.getDeviceId();
            }
            return 0;
        }

        public String getDeviceKeyNameWithSerial() {
            return USBMonitor.getDeviceKeyName(this.mWeakDevice.get(), this.mInfo.serial, false);
        }

        public String getDeviceName() {
            UsbDevice usbDevice = this.mWeakDevice.get();
            if (usbDevice != null) {
                return usbDevice.getDeviceName();
            }
            return "";
        }

        public int getProductId() {
            UsbDevice usbDevice = this.mWeakDevice.get();
            if (usbDevice != null) {
                return usbDevice.getProductId();
            }
            return 0;
        }

        public int getVenderId() {
            UsbDevice usbDevice = this.mWeakDevice.get();
            if (usbDevice != null) {
                return usbDevice.getVendorId();
            }
            return 0;
        }

        public synchronized void close() {
            Log.i("USBMonitor", "UsbControlBlock#close:");
            if (this.mConnection != null) {
                int size = this.mInterfaces.size();
                for (int i = 0; i < size; i++) {
                    SparseArray<UsbInterface> valueAt = this.mInterfaces.valueAt(i);
                    if (valueAt != null) {
                        int size2 = valueAt.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            this.mConnection.releaseInterface(valueAt.valueAt(i2));
                        }
                        valueAt.clear();
                    }
                }
                this.mInterfaces.clear();
                this.mConnection.close();
                this.mConnection = null;
                USBMonitor uSBMonitor = this.mWeakMonitor.get();
                if (uSBMonitor != null) {
                    if (uSBMonitor.mOnDeviceConnectListener != null) {
                        uSBMonitor.mOnDeviceConnectListener.onDisconnect(this.mWeakDevice.get(), this);
                    }
                    uSBMonitor.mCtrlBlocks.remove(getDevice());
                }
            }
        }

        public synchronized void claimInterface(UsbInterface usbInterface) {
            claimInterface(usbInterface, true);
        }

        public synchronized UsbInterface getInterface(int i) throws IllegalStateException {
            return getInterface(i, 0);
        }

        public int getDeviceKey(boolean z) throws IllegalStateException {
            if (z) {
                checkConnection();
            }
            return USBMonitor.getDeviceKey(this.mWeakDevice.get(), this.mInfo.serial, z);
        }

        public String getDeviceKeyName(boolean z) throws IllegalStateException {
            if (z) {
                checkConnection();
            }
            return USBMonitor.getDeviceKeyName(this.mWeakDevice.get(), this.mInfo.serial, z);
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof UsbControlBlock) {
                UsbDevice device = ((UsbControlBlock) obj).getDevice();
                if (device != null) {
                    return device.equals(this.mWeakDevice.get());
                }
                if (this.mWeakDevice.get() == null) {
                    return true;
                }
                return false;
            } else if (obj instanceof UsbDevice) {
                return obj.equals(this.mWeakDevice.get());
            } else {
                return super.equals(obj);
            }
        }

        public synchronized void releaseInterface(UsbInterface usbInterface) throws IllegalStateException {
            checkConnection();
            SparseArray<UsbInterface> sparseArray = this.mInterfaces.get(usbInterface.getId());
            if (sparseArray != null) {
                sparseArray.removeAt(sparseArray.indexOfValue(usbInterface));
                if (sparseArray.size() == 0) {
                    this.mInterfaces.remove(usbInterface.getId());
                }
            }
            this.mConnection.releaseInterface(usbInterface);
        }

        private UsbControlBlock(UsbControlBlock usbControlBlock) throws IllegalStateException {
            this.mInterfaces = new SparseArray<>();
            USBMonitor uSBMonitor = usbControlBlock.getUSBMonitor();
            UsbDevice device = usbControlBlock.getDevice();
            if (device != null) {
                UsbDeviceConnection openDevice = uSBMonitor.mUsbManager.openDevice(device);
                this.mConnection = openDevice;
                if (openDevice != null) {
                    this.mInfo = USBMonitor.updateDeviceInfo(uSBMonitor.mUsbManager, device, null);
                    this.mWeakMonitor = new WeakReference<>(uSBMonitor);
                    this.mWeakDevice = new WeakReference<>(device);
                    this.mBusNum = usbControlBlock.mBusNum;
                    this.mDevNum = usbControlBlock.mDevNum;
                    return;
                }
                throw new IllegalStateException("device may already be removed or have no permission");
            }
            throw new IllegalStateException("device may already be removed");
        }

        public synchronized void claimInterface(UsbInterface usbInterface, boolean z) {
            checkConnection();
            this.mConnection.claimInterface(usbInterface, z);
        }

        public synchronized UsbInterface getInterface(int i, int i2) throws IllegalStateException {
            UsbInterface usbInterface;
            checkConnection();
            SparseArray<UsbInterface> sparseArray = this.mInterfaces.get(i);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                this.mInterfaces.put(i, sparseArray);
            }
            usbInterface = sparseArray.get(i2);
            if (usbInterface == null) {
                UsbDevice usbDevice = this.mWeakDevice.get();
                int interfaceCount = usbDevice.getInterfaceCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= interfaceCount) {
                        break;
                    }
                    UsbInterface usbInterface2 = usbDevice.getInterface(i3);
                    if (usbInterface2.getId() == i && usbInterface2.getAlternateSetting() == i2) {
                        usbInterface = usbInterface2;
                        break;
                    }
                    i3++;
                }
                if (usbInterface != null) {
                    sparseArray.append(i2, usbInterface);
                }
            }
            return usbInterface;
        }

        private UsbControlBlock(USBMonitor uSBMonitor, UsbDevice usbDevice) {
            int i;
            int i2;
            this.mInterfaces = new SparseArray<>();
            Log.i("USBMonitor", "UsbControlBlock:constructor");
            this.mWeakMonitor = new WeakReference<>(uSBMonitor);
            this.mWeakDevice = new WeakReference<>(usbDevice);
            this.mConnection = uSBMonitor.mUsbManager.openDevice(usbDevice);
            String[] strArr = null;
            this.mInfo = USBMonitor.updateDeviceInfo(uSBMonitor.mUsbManager, usbDevice, null);
            String deviceName = usbDevice.getDeviceName();
            strArr = !TextUtils.isEmpty(deviceName) ? deviceName.split("/") : strArr;
            if (strArr != null) {
                i = Integer.parseInt(strArr[strArr.length - 2]);
                i2 = Integer.parseInt(strArr[strArr.length - 1]);
            } else {
                i2 = 0;
                i = 0;
            }
            this.mBusNum = i;
            this.mDevNum = i2;
            UsbDeviceConnection usbDeviceConnection = this.mConnection;
            if (usbDeviceConnection != null) {
                int fileDescriptor = usbDeviceConnection.getFileDescriptor();
                byte[] rawDescriptors = this.mConnection.getRawDescriptors();
                Log.i("USBMonitor", String.format(Locale.US, "name=%s,desc=%d,busnum=%d,devnum=%d,rawDesc=", deviceName, Integer.valueOf(fileDescriptor), Integer.valueOf(i), Integer.valueOf(i2)) + rawDescriptors);
                return;
            }
            Log.e("USBMonitor", "could not connect to device " + deviceName);
        }
    }

    public static class UsbDeviceInfo {
        public String manufacturer;
        public String product;
        public String serial;
        public String usb_version;
        public String version;

        public void clear() {
            this.serial = null;
            this.version = null;
            this.product = null;
            this.manufacturer = null;
            this.usb_version = null;
        }

        public String toString() {
            Object[] objArr = new Object[5];
            String str = this.usb_version;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            objArr[0] = str;
            String str3 = this.manufacturer;
            if (str3 == null) {
                str3 = str2;
            }
            objArr[1] = str3;
            String str4 = this.product;
            if (str4 == null) {
                str4 = str2;
            }
            objArr[2] = str4;
            String str5 = this.version;
            if (str5 == null) {
                str5 = str2;
            }
            objArr[3] = str5;
            String str6 = this.serial;
            if (str6 != null) {
                str2 = str6;
            }
            objArr[4] = str2;
            return String.format("UsbDevice:usb_version=%s,manufacturer=%s,product=%s,version=%s,serial=%s", objArr);
        }
    }

    public int getDeviceCount() throws IllegalStateException {
        if (!this.destroyed) {
            return getDeviceList().size();
        }
        throw new IllegalStateException("already destroyed");
    }

    public List<UsbDevice> getDeviceList() throws IllegalStateException {
        if (!this.destroyed) {
            return getDeviceList(this.mDeviceFilters);
        }
        throw new IllegalStateException("already destroyed");
    }

    public Iterator<UsbDevice> getDevices() throws IllegalStateException {
        if (!this.destroyed) {
            HashMap<String, UsbDevice> deviceList = this.mUsbManager.getDeviceList();
            if (deviceList != null) {
                return deviceList.values().iterator();
            }
            return null;
        }
        throw new IllegalStateException("already destroyed");
    }

    public synchronized boolean isRegistered() {
        boolean z;
        if (this.destroyed || this.mPermissionIntent == null) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public synchronized void unregister() throws IllegalStateException {
        this.mDeviceCounts = 0;
        if (!this.destroyed) {
            this.mAsyncHandler.removeCallbacks(this.mDeviceCheckRunnable);
        }
        if (this.mPermissionIntent != null) {
            Context context = this.mWeakContext.get();
            if (context != null) {
                try {
                    context.unregisterReceiver(this.mUsbReceiver);
                } catch (Exception e) {
                    Log.w("USBMonitor", e);
                }
            }
            this.mPermissionIntent = null;
        }
    }

    public void destroy() {
        Log.i("USBMonitor", "destroy:");
        unregister();
        if (!this.destroyed) {
            this.destroyed = true;
            Set<UsbDevice> keySet = this.mCtrlBlocks.keySet();
            if (keySet != null) {
                try {
                    for (UsbDevice usbDevice : keySet) {
                        UsbControlBlock remove = this.mCtrlBlocks.remove(usbDevice);
                        if (remove != null) {
                            remove.close();
                        }
                    }
                } catch (Exception e) {
                    Log.e("USBMonitor", "destroy:", e);
                }
            }
            this.mCtrlBlocks.clear();
            try {
                this.mAsyncHandler.getLooper().quit();
            } catch (Exception e2) {
                Log.e("USBMonitor", "destroy:", e2);
            }
        }
    }

    public synchronized void register() throws IllegalStateException {
        if (this.destroyed) {
            throw new IllegalStateException("already destroyed");
        } else if (this.mPermissionIntent == null) {
            Log.i("USBMonitor", "register:");
            Context context = this.mWeakContext.get();
            if (context != null) {
                this.mPermissionIntent = PendingIntent.getBroadcast(context, 0, new Intent(this.ACTION_USB_PERMISSION), 0);
                IntentFilter intentFilter = new IntentFilter(this.ACTION_USB_PERMISSION);
                intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
                INVOKEVIRTUAL_com_serenegiant_usb_USBMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context, this.mUsbReceiver, intentFilter);
            }
            this.mDeviceCounts = 0;
            this.mAsyncHandler.postDelayed(this.mDeviceCheckRunnable, 10);
        }
    }

    public final void dumpDevices() {
        int i;
        HashMap<String, UsbDevice> deviceList = this.mUsbManager.getDeviceList();
        if (deviceList != null) {
            Set<String> keySet = deviceList.keySet();
            if (keySet == null || keySet.size() <= 0) {
                Log.i("USBMonitor", "no device");
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str : keySet) {
                UsbDevice usbDevice = deviceList.get(str);
                if (usbDevice != null) {
                    i = usbDevice.getInterfaceCount();
                } else {
                    i = 0;
                }
                sb.setLength(0);
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(String.format(Locale.US, "interface%d:%s", Integer.valueOf(i2), usbDevice.getInterface(i2).toString()));
                }
                Log.i("USBMonitor", "key=" + str + ":" + usbDevice + ":" + sb.toString());
            }
            return;
        }
        Log.i("USBMonitor", "no device");
    }

    public static final String getDeviceKeyName(UsbDevice usbDevice) {
        return getDeviceKeyName(usbDevice, null, false);
    }

    public UsbDeviceInfo getDeviceInfo(UsbDevice usbDevice) {
        return updateDeviceInfo(this.mUsbManager, usbDevice, null);
    }

    public static final int getDeviceKey(UsbDevice usbDevice) {
        if (usbDevice != null) {
            return getDeviceKeyName(usbDevice, null, false).hashCode();
        }
        return 0;
    }

    public void addDeviceFilter(DeviceFilter deviceFilter) throws IllegalStateException {
        if (!this.destroyed) {
            this.mDeviceFilters.add(deviceFilter);
            return;
        }
        throw new IllegalStateException("already destroyed");
    }

    public final boolean hasPermission(UsbDevice usbDevice) throws IllegalStateException {
        boolean z = false;
        if (this.destroyed) {
            return false;
        }
        if (usbDevice != null && this.mUsbManager.hasPermission(usbDevice)) {
            z = true;
        }
        return updatePermission(usbDevice, z);
    }

    public final void processAttach(final UsbDevice usbDevice) {
        if (!this.destroyed) {
            Log.v("USBMonitor", "processAttach:");
            if (this.mOnDeviceConnectListener != null) {
                this.mAsyncHandler.post(new Runnable() {
                    /* class com.serenegiant.usb.USBMonitor.RunnableC271785 */

                    public void run() {
                        USBMonitor.this.mOnDeviceConnectListener.onAttach(usbDevice);
                    }
                });
            }
        }
    }

    public final void processCancel(final UsbDevice usbDevice) {
        if (!this.destroyed) {
            Log.v("USBMonitor", "processCancel:");
            updatePermission(usbDevice, false);
            if (this.mOnDeviceConnectListener != null) {
                this.mAsyncHandler.post(new Runnable() {
                    /* class com.serenegiant.usb.USBMonitor.RunnableC271774 */

                    public void run() {
                        USBMonitor.this.mOnDeviceConnectListener.onCancel(usbDevice);
                    }
                });
            }
        }
    }

    public final void processConnect(final UsbDevice usbDevice) {
        if (!this.destroyed) {
            updatePermission(usbDevice, true);
            this.mAsyncHandler.post(new Runnable() {
                /* class com.serenegiant.usb.USBMonitor.RunnableC271763 */

                public void run() {
                    boolean z;
                    Log.v("USBMonitor", "processConnect:device=" + usbDevice);
                    UsbControlBlock usbControlBlock = USBMonitor.this.mCtrlBlocks.get(usbDevice);
                    if (usbControlBlock == null) {
                        usbControlBlock = new UsbControlBlock(usbDevice);
                        USBMonitor.this.mCtrlBlocks.put(usbDevice, usbControlBlock);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (USBMonitor.this.mOnDeviceConnectListener != null) {
                        USBMonitor.this.mOnDeviceConnectListener.onConnect(usbDevice, usbControlBlock, z);
                    }
                }
            });
        }
    }

    public final void processDettach(final UsbDevice usbDevice) {
        if (!this.destroyed) {
            Log.v("USBMonitor", "processDettach:");
            if (this.mOnDeviceConnectListener != null) {
                this.mAsyncHandler.post(new Runnable() {
                    /* class com.serenegiant.usb.USBMonitor.RunnableC271796 */

                    public void run() {
                        USBMonitor.this.mOnDeviceConnectListener.onDettach(usbDevice);
                    }
                });
            }
        }
    }

    public void removeDeviceFilter(DeviceFilter deviceFilter) throws IllegalStateException {
        if (!this.destroyed) {
            this.mDeviceFilters.remove(deviceFilter);
            return;
        }
        throw new IllegalStateException("already destroyed");
    }

    public void setDeviceFilter(DeviceFilter deviceFilter) throws IllegalStateException {
        if (!this.destroyed) {
            this.mDeviceFilters.clear();
            this.mDeviceFilters.add(deviceFilter);
            return;
        }
        throw new IllegalStateException("already destroyed");
    }

    public void addDeviceFilter(List<DeviceFilter> list) throws IllegalStateException {
        if (!this.destroyed) {
            this.mDeviceFilters.addAll(list);
            return;
        }
        throw new IllegalStateException("already destroyed");
    }

    public List<UsbDevice> getDeviceList(DeviceFilter deviceFilter) throws IllegalStateException {
        if (!this.destroyed) {
            HashMap<String, UsbDevice> deviceList = this.mUsbManager.getDeviceList();
            ArrayList arrayList = new ArrayList();
            if (deviceList != null) {
                for (UsbDevice usbDevice : deviceList.values()) {
                    if (deviceFilter == null || (deviceFilter.matches(usbDevice) && !deviceFilter.isExclude)) {
                        arrayList.add(usbDevice);
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("already destroyed");
    }

    public UsbControlBlock openDevice(UsbDevice usbDevice) throws SecurityException {
        if (hasPermission(usbDevice)) {
            UsbControlBlock usbControlBlock = this.mCtrlBlocks.get(usbDevice);
            if (usbControlBlock != null) {
                return usbControlBlock;
            }
            UsbControlBlock usbControlBlock2 = new UsbControlBlock(usbDevice);
            this.mCtrlBlocks.put(usbDevice, usbControlBlock2);
            return usbControlBlock2;
        }
        throw new SecurityException("has no permission");
    }

    public void removeDeviceFilter(List<DeviceFilter> list) throws IllegalStateException {
        if (!this.destroyed) {
            this.mDeviceFilters.removeAll(list);
            return;
        }
        throw new IllegalStateException("already destroyed");
    }

    public synchronized boolean requestPermission(UsbDevice usbDevice) {
        boolean z;
        z = false;
        if (!isRegistered()) {
            processCancel(usbDevice);
        } else if (usbDevice == null) {
            processCancel(usbDevice);
        } else if (this.mUsbManager.hasPermission(usbDevice)) {
            processConnect(usbDevice);
        } else {
            try {
                this.mUsbManager.requestPermission(usbDevice, this.mPermissionIntent);
            } catch (Exception e) {
                Log.w("USBMonitor", e);
                processCancel(usbDevice);
            }
        }
        z = true;
        return z;
    }

    public void setDeviceFilter(List<DeviceFilter> list) throws IllegalStateException {
        if (!this.destroyed) {
            this.mDeviceFilters.clear();
            this.mDeviceFilters.addAll(list);
            return;
        }
        throw new IllegalStateException("already destroyed");
    }

    public List<UsbDevice> getDeviceList(List<DeviceFilter> list) throws IllegalStateException {
        if (!this.destroyed) {
            HashMap<String, UsbDevice> deviceList = this.mUsbManager.getDeviceList();
            ArrayList arrayList = new ArrayList();
            if (deviceList != null) {
                if (list == null || list.isEmpty()) {
                    arrayList.addAll(deviceList.values());
                } else {
                    for (UsbDevice usbDevice : deviceList.values()) {
                        Iterator<DeviceFilter> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            DeviceFilter next = it.next();
                            if (next != null && next.matches(usbDevice)) {
                                if (!next.isExclude) {
                                    arrayList.add(usbDevice);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("already destroyed");
    }

    public static final String getDeviceKeyName(UsbDevice usbDevice, boolean z) {
        return getDeviceKeyName(usbDevice, null, z);
    }

    public static UsbDeviceInfo getDeviceInfo(Context context, UsbDevice usbDevice) {
        return updateDeviceInfo((UsbManager) context.getSystemService("usb"), usbDevice, new UsbDeviceInfo());
    }

    public static final int getDeviceKey(UsbDevice usbDevice, boolean z) {
        if (usbDevice != null) {
            return getDeviceKeyName(usbDevice, null, z).hashCode();
        }
        return 0;
    }

    public boolean updatePermission(UsbDevice usbDevice, boolean z) {
        int deviceKey = getDeviceKey(usbDevice, true);
        synchronized (this.mHasPermissions) {
            if (!z) {
                this.mHasPermissions.remove(deviceKey);
            } else if (this.mHasPermissions.get(deviceKey) == null) {
                this.mHasPermissions.put(deviceKey, new WeakReference<>(usbDevice));
            }
        }
        return z;
    }

    public USBMonitor(Context context, OnDeviceConnectListener onDeviceConnectListener) {
        Log.v("USBMonitor", "USBMonitor:Constructor");
        if (onDeviceConnectListener != null) {
            this.mWeakContext = new WeakReference<>(context);
            UsbManager usbManager = (UsbManager) context.getSystemService("usb");
            this.mUsbManager = usbManager;
            this.mOnDeviceConnectListener = onDeviceConnectListener;
            this.mAsyncHandler = HandlerThreadHandler.createHandler("USBMonitor");
            this.destroyed = false;
            Log.v("USBMonitor", "USBMonitor:mUsbManager=" + usbManager);
            return;
        }
        throw new IllegalArgumentException("OnDeviceConnectListener should not null.");
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_serenegiant_usb_USBMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public static final int getDeviceKey(UsbDevice usbDevice, String str, boolean z) {
        if (usbDevice != null) {
            return getDeviceKeyName(usbDevice, str, z).hashCode();
        }
        return 0;
    }

    public static final String getDeviceKeyName(UsbDevice usbDevice, String str, boolean z) {
        if (usbDevice == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(usbDevice.getVendorId());
        sb.append("#");
        sb.append(usbDevice.getProductId());
        sb.append("#");
        sb.append(usbDevice.getDeviceClass());
        sb.append("#");
        sb.append(usbDevice.getDeviceSubclass());
        sb.append("#");
        sb.append(usbDevice.getDeviceProtocol());
        if (!TextUtils.isEmpty(str)) {
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public static UsbDeviceInfo updateDeviceInfo(UsbManager usbManager, UsbDevice usbDevice, UsbDeviceInfo usbDeviceInfo) {
        int i;
        if (usbDeviceInfo == null) {
            usbDeviceInfo = new UsbDeviceInfo();
        }
        usbDeviceInfo.clear();
        if (usbDevice != null) {
            if (BuildCheck.isLollipop()) {
                usbDeviceInfo.manufacturer = usbDevice.getManufacturerName();
                usbDeviceInfo.product = usbDevice.getProductName();
                usbDeviceInfo.serial = usbDevice.getSerialNumber();
            }
            if (BuildCheck.isMarshmallow()) {
                usbDeviceInfo.usb_version = usbDevice.getVersion();
            }
            if (usbManager != null && usbManager.hasPermission(usbDevice)) {
                UsbDeviceConnection openDevice = usbManager.openDevice(usbDevice);
                byte[] rawDescriptors = openDevice.getRawDescriptors();
                if (TextUtils.isEmpty(usbDeviceInfo.usb_version)) {
                    usbDeviceInfo.usb_version = String.format("%x.%02x", Integer.valueOf(rawDescriptors[3] & 255), Integer.valueOf(rawDescriptors[2] & 255));
                }
                if (TextUtils.isEmpty(usbDeviceInfo.version)) {
                    usbDeviceInfo.version = String.format("%x.%02x", Integer.valueOf(rawDescriptors[13] & 255), Integer.valueOf(rawDescriptors[12] & 255));
                }
                if (TextUtils.isEmpty(usbDeviceInfo.serial)) {
                    usbDeviceInfo.serial = openDevice.getSerial();
                }
                byte[] bArr = new byte[DynamicModule.f58006b];
                try {
                    int controlTransfer = openDevice.controlTransfer(SmActions.ACTION_ONTHECALL_EXIT, 6, 768, 0, bArr, DynamicModule.f58006b, 0);
                    if (controlTransfer > 0) {
                        i = (controlTransfer - 2) / 2;
                    } else {
                        i = 0;
                    }
                    if (i > 0) {
                        if (TextUtils.isEmpty(usbDeviceInfo.manufacturer)) {
                            usbDeviceInfo.manufacturer = getString(openDevice, rawDescriptors[14], i, bArr);
                        }
                        if (TextUtils.isEmpty(usbDeviceInfo.product)) {
                            usbDeviceInfo.product = getString(openDevice, rawDescriptors[15], i, bArr);
                        }
                        if (TextUtils.isEmpty(usbDeviceInfo.serial)) {
                            usbDeviceInfo.serial = getString(openDevice, rawDescriptors[16], i, bArr);
                        }
                    }
                } finally {
                    openDevice.close();
                }
            }
            if (TextUtils.isEmpty(usbDeviceInfo.manufacturer)) {
                usbDeviceInfo.manufacturer = USBVendorId.vendorName(usbDevice.getVendorId());
            }
            if (TextUtils.isEmpty(usbDeviceInfo.manufacturer)) {
                usbDeviceInfo.manufacturer = String.format("%04x", Integer.valueOf(usbDevice.getVendorId()));
            }
            if (TextUtils.isEmpty(usbDeviceInfo.product)) {
                usbDeviceInfo.product = String.format("%04x", Integer.valueOf(usbDevice.getProductId()));
            }
        }
        return usbDeviceInfo;
    }

    private static String getString(UsbDeviceConnection usbDeviceConnection, int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[DynamicModule.f58006b];
        String str = null;
        for (int i3 = 1; i3 <= i2; i3++) {
            int controlTransfer = usbDeviceConnection.controlTransfer(SmActions.ACTION_ONTHECALL_EXIT, 6, i | 768, bArr[i3], bArr2, DynamicModule.f58006b, 0);
            if (controlTransfer > 2 && bArr2[0] == controlTransfer && bArr2[1] == 3) {
                try {
                    String str2 = new String(bArr2, 2, controlTransfer - 2, "UTF-16LE");
                    try {
                        if (!"Љ".equals(str2)) {
                            return str2;
                        }
                        str = null;
                    } catch (UnsupportedEncodingException unused) {
                        str = str2;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    continue;
                }
            }
        }
        return str;
    }
}
