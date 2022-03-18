package com.serenegiant.usb;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.usb.UsbDevice;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import com.larksuite.suite.R;
import com.serenegiant.usb.USBMonitor;
import com.smt.usbcam.FrameCallback;
import com.smt.usbcam.OnConnectListener;
import com.smt.usbcam.USBCamApi;
import com.smt.usbcam.USBCamPixelFormat;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class USBCamApiImp implements USBCamApi {
    public static final String TAG = "USBCamApiImp";
    public boolean isPhoneCamOpen;
    private CameraManager.AvailabilityCallback mAvailabilityCallback = new CameraManager.AvailabilityCallback() {
        /* class com.serenegiant.usb.USBCamApiImp.C271681 */

        public void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
        }

        public void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            String str2 = USBCamApiImp.TAG;
            Logger.m98782d(str2, "onCameraAvailable = " + str);
            USBCamApiImp.this.isPhoneCamOpen = false;
        }

        public void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            String str2 = USBCamApiImp.TAG;
            Logger.m98782d(str2, "onCameraUnavailable = " + str);
            USBCamApiImp.this.isPhoneCamOpen = true;
            if (USBCamApiImp.this.mOnConnectListener != null) {
                USBCamApiImp.this.mOnConnectListener.onBusy(false);
            }
        }
    };
    private CameraManager mCameraManager;
    private Context mContext;
    public FrameCallback mFrameCallback = null;
    public int mFrameFormat;
    public IFrameCallback mIFrameCallback = new IFrameCallback() {
        /* class com.serenegiant.usb.USBCamApiImp.C271692 */

        @Override // com.serenegiant.usb.IFrameCallback
        public void onFrame(ByteBuffer byteBuffer) {
            USBCamApiImp.this.mFrameCallback.onFrameAvailable(byteBuffer);
        }
    };
    public OnConnectListener mOnConnectListener = null;
    private final USBMonitor.OnDeviceConnectListener mOnDeviceConnectListener = new USBMonitor.OnDeviceConnectListener() {
        /* class com.serenegiant.usb.USBCamApiImp.C271703 */

        @Override // com.serenegiant.usb.USBMonitor.OnDeviceConnectListener
        public void onCancel(UsbDevice usbDevice) {
            Logger.m98782d(USBCamApiImp.TAG, "onCancel:");
            if (USBCamApiImp.this.mOnConnectListener != null) {
                USBCamApiImp.this.mOnConnectListener.onCancel();
            }
        }

        @Override // com.serenegiant.usb.USBMonitor.OnDeviceConnectListener
        public void onDettach(UsbDevice usbDevice) {
            Logger.m98782d(USBCamApiImp.TAG, "onDettach:");
            if (USBCamApiImp.this.mOnConnectListener != null) {
                USBCamApiImp.this.mOnConnectListener.onDettach();
            }
        }

        @Override // com.serenegiant.usb.USBMonitor.OnDeviceConnectListener
        public void onAttach(UsbDevice usbDevice) {
            Logger.m98782d(USBCamApiImp.TAG, "onAttach:");
            if (USBCamApiImp.this.getUsbDeviceCount() > 0) {
                Logger.m98782d(USBCamApiImp.TAG, "onAttach usbcamera:");
                if (USBCamApiImp.this.mOnConnectListener != null) {
                    USBCamApiImp.this.mOnConnectListener.onAttach();
                }
            }
        }

        @Override // com.serenegiant.usb.USBMonitor.OnDeviceConnectListener
        public void onDisconnect(UsbDevice usbDevice, USBMonitor.UsbControlBlock usbControlBlock) {
            Logger.m98782d(USBCamApiImp.TAG, "onDisconnect:");
            if (USBCamApiImp.this.mOnConnectListener != null) {
                USBCamApiImp.this.mOnConnectListener.onDisconnect();
            }
        }

        @Override // com.serenegiant.usb.USBMonitor.OnDeviceConnectListener
        public void onConnect(UsbDevice usbDevice, final USBMonitor.UsbControlBlock usbControlBlock, boolean z) {
            Logger.m98782d(USBCamApiImp.TAG, "onConnect:");
            synchronized (USBCamApiImp.this.mSync) {
                if (USBCamApiImp.this.mUVCCamera != null) {
                    USBCamApiImp.this.mUVCCamera.destroy();
                    USBCamApiImp.this.mUVCCamera = null;
                }
            }
            USBCamApiImp.this.queueEvent(new Runnable() {
                /* class com.serenegiant.usb.USBCamApiImp.C271703.RunnableC271711 */

                public void run() {
                    synchronized (USBCamApiImp.this.mSync) {
                        UVCCamera uVCCamera = new UVCCamera();
                        try {
                            uVCCamera.open(usbControlBlock);
                            String str = USBCamApiImp.TAG;
                            Logger.m98782d(str, "supportedSize:" + uVCCamera.getSupportedSizeList().toString());
                            try {
                                uVCCamera.setPreviewSize(USBCamApiImp.this.mPreviewSize.getWidth(), USBCamApiImp.this.mPreviewSize.getHeight(), 1);
                            } catch (IllegalArgumentException e) {
                                e.printStackTrace();
                            }
                            if (USBCamApiImp.this.mPreviewSurface != null) {
                                uVCCamera.setPreviewDisplay(USBCamApiImp.this.mPreviewSurface);
                            }
                            if (USBCamApiImp.this.mFrameCallback != null) {
                                uVCCamera.setFrameCallback(USBCamApiImp.this.mIFrameCallback, USBCamApiImp.this.mFrameFormat);
                            }
                            uVCCamera.startPreview();
                            synchronized (USBCamApiImp.this.mSync) {
                                USBCamApiImp.this.mUVCCamera = uVCCamera;
                            }
                            Logger.m98782d(USBCamApiImp.TAG, "onConnect usbcamera:");
                            if (USBCamApiImp.this.mOnConnectListener != null) {
                                USBCamApiImp.this.mOnConnectListener.onConnect();
                            }
                        } catch (UnsupportedOperationException e2) {
                            e2.printStackTrace();
                            Logger.m98782d(USBCamApiImp.TAG, "onBusy usbcamera:");
                            if (USBCamApiImp.this.mOnConnectListener != null) {
                                USBCamApiImp.this.mOnConnectListener.onBusy(true);
                            }
                        }
                    }
                }
            }, 0);
        }
    };
    public Size mPreviewSize = null;
    public Surface mPreviewSurface = null;
    private List<Size> mSupportSize;
    public final Object mSync = new Object();
    private USBMonitor mUSBMonitor;
    public UVCCamera mUVCCamera;
    private Handler mWorkerHandler;
    private long mWorkerThreadID = -1;

    @Override // com.smt.usbcam.USBCamApi
    public List<Size> getSupportSize() {
        return this.mSupportSize;
    }

    @Override // com.smt.usbcam.USBCamApi
    public void stopPreview() {
        Logger.m98782d(TAG, "close:");
        releaseUVCCam();
    }

    /* renamed from: com.serenegiant.usb.USBCamApiImp$4 */
    static /* synthetic */ class C271724 {
        static final /* synthetic */ int[] $SwitchMap$com$smt$usbcam$USBCamPixelFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.smt.usbcam.USBCamPixelFormat[] r0 = com.smt.usbcam.USBCamPixelFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.serenegiant.usb.USBCamApiImp.C271724.$SwitchMap$com$smt$usbcam$USBCamPixelFormat = r0
                com.smt.usbcam.USBCamPixelFormat r1 = com.smt.usbcam.USBCamPixelFormat.YUV420SP_NV12     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.serenegiant.usb.USBCamApiImp.C271724.$SwitchMap$com$smt$usbcam$USBCamPixelFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smt.usbcam.USBCamPixelFormat r1 = com.smt.usbcam.USBCamPixelFormat.YUV420SP_NV21     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.serenegiant.usb.USBCamApiImp.C271724.<clinit>():void");
        }
    }

    private void releaseUVCCam() {
        String str = TAG;
        Logger.m98782d(str, "releaseUVCCam:");
        synchronized (this.mSync) {
            if (this.mUVCCamera != null) {
                Logger.m98782d(str, "mUVCCamera.destroy()");
                this.mUVCCamera.destroy();
            }
            this.mUVCCamera = null;
        }
    }

    public int getUsbDeviceCount() {
        List<UsbDevice> usbDeviceList = getUsbDeviceList();
        if (usbDeviceList == null || usbDeviceList.size() == 0) {
            return 0;
        }
        return usbDeviceList.size();
    }

    public List<UsbDevice> getUsbDeviceList() {
        List<DeviceFilter> deviceFilters = DeviceFilter.getDeviceFilters(this.mContext, R.xml.device_filter);
        USBMonitor uSBMonitor = this.mUSBMonitor;
        if (uSBMonitor == null || deviceFilters == null) {
            return null;
        }
        return uSBMonitor.getDeviceList(deviceFilters.get(0));
    }

    USBCamApiImp() {
    }

    @Override // com.smt.usbcam.USBCamApi
    public void deinit() {
        Logger.m98782d(TAG, "deinit:");
        synchronized (this.mSync) {
            USBMonitor uSBMonitor = this.mUSBMonitor;
            if (uSBMonitor != null) {
                uSBMonitor.unregister();
            }
            USBMonitor uSBMonitor2 = this.mUSBMonitor;
            if (uSBMonitor2 != null) {
                uSBMonitor2.destroy();
                this.mUSBMonitor = null;
            }
        }
        Handler handler = this.mWorkerHandler;
        if (handler != null) {
            try {
                handler.getLooper().quit();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mWorkerHandler = null;
        }
        this.mPreviewSize = null;
        this.mPreviewSurface = null;
        this.mFrameCallback = null;
    }

    @Override // com.smt.usbcam.USBCamApi
    public boolean startPreview() {
        String str = TAG;
        Logger.m98782d(str, "startPreview:");
        if (this.mPreviewSize == null) {
            Logger.m98782d(str, "startPreview: mPreviewSize is null");
            throw new IllegalStateException("need setPreviewSize befor startPreview");
        } else if (this.mPreviewSurface == null && this.mFrameCallback == null) {
            Logger.m98782d(str, "startPreview: mPreviewSurface or mFrameCallback is null");
            throw new IllegalStateException("need setPreviewSurface or setFrameCallback befor startPreview");
        } else if (this.isPhoneCamOpen) {
            return false;
        } else {
            return !this.mUSBMonitor.requestPermission(getUsbDeviceList().get(0));
        }
    }

    @Override // com.smt.usbcam.USBCamApi
    public void setBufferSize(Size size) {
        this.mPreviewSize = size;
    }

    @Override // com.smt.usbcam.USBCamApi
    public void setSurface(Surface surface) {
        this.mPreviewSurface = surface;
    }

    @Override // com.smt.usbcam.USBCamApi
    public void setFrameCallback(FrameCallback frameCallback, USBCamPixelFormat uSBCamPixelFormat) {
        this.mFrameCallback = frameCallback;
        int i = C271724.$SwitchMap$com$smt$usbcam$USBCamPixelFormat[uSBCamPixelFormat.ordinal()];
        if (i == 1) {
            this.mFrameFormat = 5;
        } else if (i != 2) {
            this.mFrameFormat = 4;
        } else {
            this.mFrameFormat = 4;
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void queueEvent(Runnable runnable, long j) {
        if (runnable != null) {
            Handler handler = this.mWorkerHandler;
            if (handler != null) {
                try {
                    handler.removeCallbacks(runnable);
                    if (j > 0) {
                        this.mWorkerHandler.postDelayed(runnable, j);
                    } else if (this.mWorkerThreadID == Thread.currentThread().getId()) {
                        runnable.run();
                    } else {
                        this.mWorkerHandler.post(runnable);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.smt.usbcam.USBCamApi
    public void init(Context context, OnConnectListener onConnectListener) {
        String str = TAG;
        Logger.m98782d(str, "init: 20201110");
        this.mContext = context;
        this.mCameraManager = (CameraManager) context.getSystemService("camera");
        this.mOnConnectListener = onConnectListener;
        if (this.mWorkerHandler == null) {
            HandlerThreadHandler createHandler = HandlerThreadHandler.createHandler(str);
            this.mWorkerHandler = createHandler;
            this.mWorkerThreadID = createHandler.getLooper().getThread().getId();
        }
        this.mUSBMonitor = new USBMonitor(context, this.mOnDeviceConnectListener);
        synchronized (this.mSync) {
            USBMonitor uSBMonitor = this.mUSBMonitor;
            if (uSBMonitor != null) {
                uSBMonitor.register();
            }
        }
        this.mCameraManager.registerAvailabilityCallback(this.mAvailabilityCallback, this.mWorkerHandler);
        ArrayList arrayList = new ArrayList();
        this.mSupportSize = arrayList;
        arrayList.add(new Size(640, 480));
        this.mSupportSize.add(new Size(1280, 720));
        this.mSupportSize.add(new Size(1920, 1080));
        this.mSupportSize.add(new Size(2560, CalendarWorkHourUtil.f83805a));
        this.mSupportSize.add(new Size(2592, 1944));
    }
}
