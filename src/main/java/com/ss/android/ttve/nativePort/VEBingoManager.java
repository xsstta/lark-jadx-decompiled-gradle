package com.ss.android.ttve.nativePort;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttve.common.C60189g;
import com.ss.android.vesdk.AbstractC64077u;
import com.ss.android.vesdk.C63929ab;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class VEBingoManager {
    public static int Bingo_TransBlack = 2;
    public static int Bingo_TransDissolve = 1;
    public static int Bingo_TransNull = 0;
    public static int Bingo_TransWhite = 3;
    public static int Bingo_TransZoomIn = 5;
    public static int Bingo_TransZoomOut = 4;
    private Handler imageHandler;
    private HandlerThread imageHandlerThread;
    private volatile long mNative = 0;
    private Map<Integer, Handler> workThreadHandlerMap = new HashMap();
    private Map<Integer, HandlerThread> workThreadMap = new HashMap();

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$e */
    private interface AbstractC60258e {
        /* renamed from: a */
        void mo206290a(int i, String str);

        /* renamed from: a */
        boolean mo206291a(int i, int i2);
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$g */
    public interface AbstractC60261g {
        /* renamed from: a */
        void mo206295a(int i, String str);

        /* renamed from: a */
        void mo206296a(VETransitionResult[] vETransitionResultArr);

        /* renamed from: a */
        boolean mo206297a(int i);
    }

    private native int[] addVideoClipsByNative(long j, String[] strArr, int i);

    private native VETransitionResult[] getBingoTransitionResultsByNative(long j);

    private native long init(int i);

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private native int processBingoImageFrameByNative(long j, Bitmap bitmap, float f, String str);

    private native int processBingoVideoFrameByNative(long j, ByteBuffer byteBuffer, int i, int i2, float f, String str);

    public native int destroy(long j);

    static {
        TENativeLibsLoader.m234143a();
    }

    public void destroy() {
        reset();
        if (this.mNative > 0) {
            destroy(this.mNative);
            this.mNative = 0;
        }
    }

    public VETransitionResult[] getBingoTransitionResults() {
        if (this.mNative <= 0) {
            return null;
        }
        return getBingoTransitionResultsByNative(this.mNative);
    }

    public long initBingoWithTransition() {
        reset();
        if (this.mNative > 0) {
            return this.mNative;
        }
        this.mNative = init(EnumC60253a.BingoModelVideoTrans.value);
        return this.mNative;
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$f */
    private class C60259f {

        /* renamed from: a */
        public AbstractC60261g f150408a;

        /* renamed from: b */
        public volatile boolean f150409b;

        /* renamed from: d */
        private final int f150411d;

        /* renamed from: e */
        private final AtomicInteger f150412e;

        /* renamed from: a */
        public synchronized boolean mo206293a() {
            int incrementAndGet = this.f150412e.incrementAndGet();
            if (!this.f150409b) {
                this.f150409b = this.f150408a.mo206297a((int) (((((float) incrementAndGet) * 1.0f) / ((float) this.f150411d)) * 100.0f));
                if (incrementAndGet == this.f150411d) {
                    new Handler(Looper.myLooper()).post(new Runnable() {
                        /* class com.ss.android.ttve.nativePort.VEBingoManager.C60259f.RunnableC602601 */

                        public void run() {
                            C60259f.this.f150408a.mo206296a(VEBingoManager.this.getBingoTransitionResults());
                        }
                    });
                }
            }
            return this.f150409b;
        }

        /* renamed from: a */
        public synchronized void mo206292a(int i, String str) {
            if (!this.f150409b) {
                this.f150409b = true;
                this.f150408a.mo206295a(i, str);
            }
        }

        private C60259f(int i, AbstractC60261g gVar) {
            this.f150412e = new AtomicInteger(0);
            this.f150409b = false;
            this.f150411d = i;
            this.f150408a = gVar;
        }
    }

    private void reset() {
        for (HandlerThread handlerThread : this.workThreadMap.values()) {
            if (handlerThread != null) {
                handlerThread.quit();
            }
        }
        this.workThreadMap.clear();
        this.workThreadHandlerMap.clear();
        HandlerThread handlerThread2 = this.imageHandlerThread;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
        this.imageHandlerThread = null;
        this.imageHandler = null;
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$b */
    private class HandlerC60254b extends Handler {

        /* renamed from: b */
        private String[] f150386b;

        /* renamed from: c */
        private List<Integer> f150387c;

        /* renamed from: d */
        private C60259f f150388d;

        /* renamed from: e */
        private TEVideoUtilsCallback f150389e = new TEVideoUtilsCallback();

        /* renamed from: f */
        private final AtomicInteger f150390f = new AtomicInteger(0);

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && !this.f150388d.f150409b && this.f150390f.get() < this.f150387c.size()) {
                String str = this.f150386b[this.f150387c.get(this.f150390f.getAndIncrement()).intValue()];
                Bitmap decodeBitmap = VEBingoManager.this.decodeBitmap(str);
                if (decodeBitmap == null || decodeBitmap.isRecycled()) {
                    C63929ab.m250980d("VEBingoManager", "decodeBitmap fail, path: " + str);
                    C60259f fVar = this.f150388d;
                    fVar.mo206292a(-2050, "decodeBitmap fail, path: " + str);
                    return;
                }
                int processBingoImageFrame = VEBingoManager.this.processBingoImageFrame(decodeBitmap, BitmapDescriptorFactory.HUE_RED, str);
                decodeBitmap.recycle();
                if (processBingoImageFrame < 0) {
                    C63929ab.m250980d("VEBingoManager", "processBingoImageFrame fail, path: " + str);
                    C60259f fVar2 = this.f150388d;
                    fVar2.mo206292a(-2100, "processBingoImageFrame fail, path: " + str);
                } else if (!this.f150388d.mo206293a()) {
                    Message.obtain(this, 1).sendToTarget();
                }
            }
        }

        HandlerC60254b(Looper looper, String[] strArr, List<Integer> list, C60259f fVar) {
            super(looper);
            this.f150386b = strArr;
            this.f150387c = list;
            this.f150388d = fVar;
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$c */
    private class HandlerC60255c extends Handler {

        /* renamed from: a */
        public C60259f f150391a;

        /* renamed from: c */
        private Map<Integer, int[]> f150393c;

        /* renamed from: d */
        private String[] f150394d;

        /* renamed from: e */
        private Map<Integer, C60189g> f150395e;

        /* renamed from: f */
        private List<Integer> f150396f;

        /* renamed from: g */
        private TEVideoUtilsCallback f150397g = new TEVideoUtilsCallback();

        /* renamed from: h */
        private final AtomicInteger f150398h = new AtomicInteger(0);

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && !this.f150391a.f150409b && this.f150398h.get() < this.f150396f.size()) {
                final int intValue = this.f150396f.get(this.f150398h.getAndIncrement()).intValue();
                final String str = this.f150394d[intValue];
                int[] iArr = this.f150393c.get(Integer.valueOf(intValue));
                C60189g gVar = this.f150395e.get(Integer.valueOf(intValue));
                this.f150397g.setListener(new C60257d(intValue, str, iArr.length, new AbstractC60258e() {
                    /* class com.ss.android.ttve.nativePort.VEBingoManager.HandlerC60255c.C602561 */

                    @Override // com.ss.android.ttve.nativePort.VEBingoManager.AbstractC60258e
                    /* renamed from: a */
                    public void mo206290a(int i, String str) {
                        HandlerC60255c.this.f150391a.mo206292a(i, str);
                    }

                    @Override // com.ss.android.ttve.nativePort.VEBingoManager.AbstractC60258e
                    /* renamed from: a */
                    public boolean mo206291a(int i, int i2) {
                        boolean a = HandlerC60255c.this.f150391a.mo206293a();
                        if (i == i2) {
                            C63929ab.m250974a("VEBingoManager", "index: " + intValue + ", videoPath: " + str + ", complete " + i2 + " frame, thread: " + Thread.currentThread().getName());
                            if (!a) {
                                Message.obtain(HandlerC60255c.this, 1).sendToTarget();
                            }
                        }
                        return a;
                    }
                }));
                int videoFramesMore = TEVideoUtils.getVideoFramesMore(str, iArr, gVar.f150219a, gVar.f150220b, false, false, 1, true, this.f150397g);
                String str2 = "getVideoFramesMore result: " + videoFramesMore + " , index: " + intValue + ", videoPath: " + str + ", thread: " + Thread.currentThread().getName();
                C63929ab.m250974a("VEBingoManager", str2);
                if (videoFramesMore != 0) {
                    removeCallbacksAndMessages(null);
                    this.f150391a.mo206292a(-2000, str2);
                }
            }
        }

        HandlerC60255c(Looper looper, Map<Integer, int[]> map, String[] strArr, Map<Integer, C60189g> map2, List<Integer> list, C60259f fVar) {
            super(looper);
            this.f150393c = map;
            this.f150394d = strArr;
            this.f150395e = map2;
            this.f150396f = list;
            this.f150391a = fVar;
        }
    }

    public Bitmap decodeBitmap(String str) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth > 0) {
                if (options.outHeight > 0) {
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    int i5 = 320;
                    if (i3 > i4) {
                        float f = (((float) i3) * 1.0f) / 320.0f;
                        i2 = (int) f;
                        int i6 = (int) (((float) i4) / f);
                        int i7 = i6 % 16;
                        if (i7 >= 8) {
                            i6 += 16;
                        }
                        i = i6 - i7;
                    } else {
                        float f2 = (((float) i4) * 1.0f) / 320.0f;
                        i2 = (int) f2;
                        int i8 = (int) (((float) i3) / f2);
                        int i9 = i8 % 16;
                        if (i9 >= 8) {
                            i8 += 16;
                        }
                        i5 = i8 - i9;
                        i = 320;
                    }
                    if (i5 <= 0 || i <= 0) {
                        C63929ab.m250980d("VEBingoManager", "imagePath: " + str + " invalid scale size, scaleWidth: " + i5 + ", scaleHeight: " + i + ", bitmap origin width: " + i3 + ", height: " + i4);
                        return null;
                    }
                    if (i2 > 1) {
                        options.inSampleSize = i2;
                    }
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                    if (decodeFile == null) {
                        C63929ab.m250980d("VEBingoManager", "BitmapFactory.decodeFile(inJustDecodeBounds false) failed: " + str);
                        return null;
                    }
                    C63929ab.m250974a("VEBingoManager", "imagePath: " + str + ", origin size: " + i3 + "*" + i4 + ", scale size: " + i5 + "*" + i + ", inSampleSize: " + i2 + ", final size: " + decodeFile.getWidth() + "*" + decodeFile.getHeight() + ", thread: " + Thread.currentThread().getName());
                    if (decodeFile.getConfig() == Bitmap.Config.ARGB_8888 && decodeFile.getWidth() == i5 && decodeFile.getHeight() == i) {
                        return decodeFile;
                    }
                    C63929ab.m250974a("VEBingoManager", "switch bitmap, config from " + decodeFile.getConfig().name() + " to " + Bitmap.Config.ARGB_8888.name() + ", size from " + decodeFile.getWidth() + "*" + decodeFile.getHeight() + " to " + i5 + "*" + i);
                    Bitmap createBitmap = Bitmap.createBitmap(i5, i, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawBitmap(decodeFile, (Rect) null, new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i5, (float) i), (Paint) null);
                    decodeFile.recycle();
                    return createBitmap;
                }
            }
            C63929ab.m250980d("VEBingoManager", "inJustDecodeBounds true, invalid out size, outWidth: " + options.outWidth + ", outHeight: " + options.outHeight);
            return null;
        } catch (Exception e) {
            C63929ab.m250980d("VEBingoManager", "decodeBitmap, imagePath: " + str + ", exception: " + e.toString());
            return null;
        }
    }

    private int[] addVideoClips(String[] strArr, int i) {
        if (this.mNative > 0) {
            return addVideoClipsByNative(this.mNative, strArr, i);
        }
        C63929ab.m250980d("VEBingoManager", "addVideoClips, invalid mNative: " + this.mNative);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[SYNTHETIC, Splitter:B:23:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void saveBitmap(java.lang.String r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.io.File r3 = r0.getParentFile()
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0016
            java.io.File r3 = r0.getParentFile()
            r3.mkdir()
        L_0x0016:
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0030, all -> 0x002c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0030, all -> 0x002c }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x002a }
            r0 = 100
            r4.compress(r3, r0, r1)     // Catch:{ Exception -> 0x002a }
            r1.flush()     // Catch:{ Exception -> 0x002a }
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0040
        L_0x002a:
            r3 = move-exception
            goto L_0x0033
        L_0x002c:
            r4 = move-exception
            r1 = r3
            r3 = r4
            goto L_0x0042
        L_0x0030:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x0033:
            r3.printStackTrace()     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0040
            r1.close()
            goto L_0x0040
        L_0x003c:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r4 = move-exception
            r4.printStackTrace()
        L_0x004c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.VEBingoManager.saveBitmap(java.lang.String, android.graphics.Bitmap):void");
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$a */
    private enum EnumC60253a {
        BingoModelAfterEffect(0),
        BingoModelVideoTrans(1);
        
        public final int value;

        private EnumC60253a(int i) {
            this.value = i;
        }
    }

    public int processBingoImageFrame(Bitmap bitmap, float f, String str) {
        if (this.mNative <= 0) {
            return -112;
        }
        return processBingoImageFrameByNative(this.mNative, bitmap, f, str);
    }

    /* renamed from: com.ss.android.ttve.nativePort.VEBingoManager$d */
    private class C60257d implements AbstractC64077u {

        /* renamed from: b */
        private final int f150403b;

        /* renamed from: c */
        private final String f150404c;

        /* renamed from: d */
        private volatile int f150405d;

        /* renamed from: e */
        private final AtomicInteger f150406e = new AtomicInteger(0);

        /* renamed from: f */
        private AbstractC60258e f150407f;

        @Override // com.ss.android.vesdk.AbstractC64077u
        public boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
            int processBingoVideoFrame = VEBingoManager.this.processBingoVideoFrame(byteBuffer, i, i2, (float) i3, this.f150404c);
            if (processBingoVideoFrame < 0) {
                C63929ab.m250980d("VEBingoManager", "index: " + this.f150403b + ", videoPath: " + this.f150404c + ", processBingoVideoFrame fail: " + processBingoVideoFrame + ", thread: " + Thread.currentThread().getName());
                AbstractC60258e eVar = this.f150407f;
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(this.f150403b);
                sb.append(", videoPath: ");
                sb.append(this.f150404c);
                sb.append(", processBingoVideoFrame fail: ");
                sb.append(processBingoVideoFrame);
                eVar.mo206290a(-805, sb.toString());
                return false;
            }
            this.f150406e.incrementAndGet();
            if (this.f150407f.mo206291a(this.f150406e.get(), this.f150405d) || this.f150406e.get() == this.f150405d) {
                return false;
            }
            return true;
        }

        C60257d(int i, String str, int i2, AbstractC60258e eVar) {
            this.f150403b = i;
            this.f150404c = str;
            this.f150405d = i2;
            this.f150407f = eVar;
        }
    }

    public void detectTransition(String[] strArr, int i, int i2, AbstractC60261g gVar) {
        ArrayList arrayList;
        HashMap hashMap;
        ArrayList arrayList2;
        HashMap hashMap2;
        int i3;
        HashMap hashMap3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i4;
        int i5;
        int i6;
        String[] strArr2 = strArr;
        int i7 = i;
        AbstractC60261g gVar2 = gVar;
        if (strArr2 == null || strArr2.length < 2 || i7 < 1 || i2 < 1) {
            gVar2.mo206295a(-100, "invalid param");
            return;
        }
        reset();
        int[] addVideoClips = addVideoClips(strArr2, 1000 / i2);
        if (addVideoClips == null || addVideoClips.length != strArr2.length) {
            gVar2.mo206295a(-305, "addVideoClips fail");
            return;
        }
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < strArr2.length) {
            String str = strArr2[i8];
            int i11 = addVideoClips[i8];
            if (2 == i11) {
                arrayList5.add(Integer.valueOf(i8));
                i10++;
                hashMap3 = hashMap5;
                arrayList3 = arrayList5;
                arrayList4 = arrayList6;
            } else if (1 == i11) {
                arrayList6.add(Integer.valueOf(i8));
                int[] iArr = new int[10];
                TEVideoUtils.getVideoFileInfo(str, iArr);
                arrayList4 = arrayList6;
                arrayList3 = arrayList5;
                if (iArr[0] <= 0 || iArr[1] <= 0 || iArr[3] <= 0) {
                    String str2 = "invalid video info, index: " + i8 + ", videoPath: " + str + ", duration: " + iArr[3] + ", size: " + iArr[0] + "*" + iArr[1];
                    C63929ab.m250980d("VEBingoManager", str2);
                    gVar2.mo206295a(-310, str2);
                    return;
                }
                if (iArr[0] > iArr[1]) {
                    int i12 = (int) (((float) iArr[1]) / ((((float) iArr[0]) * 1.0f) / 320.0f));
                    int i13 = i12 % 16;
                    if (i13 >= 8) {
                        i12 += 16;
                    }
                    i4 = i12 - i13;
                    i5 = 320;
                } else {
                    int i14 = (int) (((float) iArr[0]) / ((((float) iArr[1]) * 1.0f) / 320.0f));
                    int i15 = i14 % 16;
                    if (i15 >= 8) {
                        i14 += 16;
                    }
                    i5 = i14 - i15;
                    i4 = 320;
                }
                if (i5 <= 0 || i4 <= 0) {
                    String str3 = "invalid scale size, index: " + i8 + ", videoPath: " + str + ", size: " + i5 + "*" + i4;
                    C63929ab.m250980d("VEBingoManager", str3);
                    gVar.mo206295a(-315, str3);
                    return;
                }
                hashMap5.put(Integer.valueOf(i8), new C60189g(i5, i4));
                int i16 = iArr[3];
                LinkedList linkedList = new LinkedList();
                if (i8 != 0) {
                    i6 = i4;
                    hashMap3 = hashMap5;
                    if (i8 != strArr2.length - 1) {
                        int i17 = 0;
                        for (int i18 = 0; i18 < i7; i18++) {
                            int i19 = i18 * i2;
                            if (i19 > i16) {
                                break;
                            }
                            if (i19 > i17) {
                                i17 = i19;
                            }
                            linkedList.add(Integer.valueOf(i19));
                        }
                        int i20 = 0;
                        while (i20 < i7) {
                            int i21 = i16 - (i20 * i2);
                            if (i21 < 0 || i21 <= i17) {
                                break;
                            }
                            if (!linkedList.contains(Integer.valueOf(i21))) {
                                linkedList.add(Integer.valueOf(i21));
                            }
                            i20++;
                            i7 = i;
                        }
                    } else {
                        for (int i22 = 0; i22 < i7; i22++) {
                            int i23 = i22 * i2;
                            if (i23 > i16) {
                                break;
                            }
                            linkedList.add(Integer.valueOf(i23));
                        }
                    }
                } else {
                    hashMap3 = hashMap5;
                    int i24 = 0;
                    while (i24 < i7) {
                        int i25 = i16 - (i24 * i2);
                        if (i25 < 0) {
                            break;
                        }
                        linkedList.add(Integer.valueOf(i25));
                        i24++;
                        i4 = i4;
                    }
                    i6 = i4;
                }
                Collections.sort(linkedList);
                int size = linkedList.size();
                int[] iArr2 = new int[size];
                for (int i26 = 0; i26 < linkedList.size(); i26++) {
                    iArr2[i26] = ((Integer) linkedList.get(i26)).intValue();
                }
                hashMap4.put(Integer.valueOf(i8), iArr2);
                i9 += size;
                C63929ab.m250974a("VEBingoManager", "video clip, index: " + i8 + ", videoPath: " + str + ", duration: " + i16 + ", origin size: " + iArr[0] + "*" + iArr[1] + ", scale size: " + i5 + "*" + i6 + ", ptsList: " + linkedList);
                i10 = i10;
            } else {
                gVar2.mo206295a(-320, "invalid clip type: " + i11 + ", index: " + i8 + ", videoPath: " + str);
                return;
            }
            i8++;
            strArr2 = strArr;
            i7 = i;
            gVar2 = gVar;
            addVideoClips = addVideoClips;
            arrayList6 = arrayList4;
            arrayList5 = arrayList3;
            hashMap5 = hashMap3;
        }
        ArrayList arrayList7 = arrayList6;
        StringBuilder sb = new StringBuilder();
        sb.append("total video frame num: ");
        sb.append(i9);
        sb.append(", total image frame num: ");
        sb.append(i10);
        sb.append(", image clip: ");
        ArrayList arrayList8 = arrayList5;
        sb.append(arrayList8);
        C63929ab.m250974a("VEBingoManager", sb.toString());
        C60259f fVar = new C60259f(i9 + i10, gVar2);
        HashMap hashMap6 = new HashMap();
        if (arrayList7.size() > 2) {
            int size2 = arrayList7.size() / 3;
            int size3 = arrayList7.size() % 3;
            if (size2 > 0) {
                int i27 = 0;
                for (int i28 = 3; i27 < i28; i28 = 3) {
                    ArrayList arrayList9 = new ArrayList();
                    int i29 = i27 * size2;
                    while (true) {
                        i3 = i27 + 1;
                        if (i29 < i3 * size2 && i29 < arrayList7.size()) {
                            arrayList9.add(arrayList7.get(i29));
                            i29++;
                        }
                    }
                    if (arrayList9.size() > 0) {
                        if (hashMap6.get(Integer.valueOf(i27)) == null) {
                            hashMap6.put(Integer.valueOf(i27), arrayList9);
                        } else {
                            ((List) hashMap6.get(Integer.valueOf(i27))).addAll(arrayList9);
                        }
                    }
                    i27 = i3;
                    arrayList7 = arrayList7;
                }
            }
            if (size3 > 0) {
                int i30 = 0;
                for (int size4 = arrayList7.size() - size3; size4 < arrayList7.size(); size4++) {
                    if (hashMap6.get(Integer.valueOf(i30)) == null) {
                        ArrayList arrayList10 = new ArrayList();
                        arrayList10.add(arrayList7.get(size4));
                        hashMap6.put(Integer.valueOf(i30), arrayList10);
                    } else {
                        ((List) hashMap6.get(Integer.valueOf(i30))).add(arrayList7.get(size4));
                    }
                    i30 = (i30 + 1) % 3;
                }
            }
            int i31 = 0;
            for (int i32 = 3; i31 < i32; i32 = 3) {
                List list = (List) hashMap6.get(Integer.valueOf(i31));
                if (list == null || list.size() <= 0) {
                    arrayList2 = arrayList8;
                    hashMap2 = hashMap4;
                    hashMap = hashMap6;
                } else {
                    HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("HandlerThread_Video_" + i31);
                    new_android_os_HandlerThread_by_knot.start();
                    hashMap = hashMap6;
                    arrayList2 = arrayList8;
                    hashMap2 = hashMap4;
                    HandlerC60255c cVar = new HandlerC60255c(new_android_os_HandlerThread_by_knot.getLooper(), hashMap4, strArr, hashMap5, list, fVar);
                    this.workThreadMap.put(Integer.valueOf(i31), new_android_os_HandlerThread_by_knot);
                    this.workThreadHandlerMap.put(Integer.valueOf(i31), cVar);
                    Message.obtain(cVar, 1).sendToTarget();
                    C63929ab.m250974a("VEBingoManager", "HandlerThread_Video_" + i31 + " is responsible for " + list);
                }
                i31++;
                hashMap6 = hashMap;
                hashMap4 = hashMap2;
                arrayList8 = arrayList2;
            }
            arrayList = arrayList8;
        } else {
            arrayList = arrayList8;
            if (arrayList7.size() > 0) {
                HandlerThread new_android_os_HandlerThread_by_knot2 = new_android_os_HandlerThread_by_knot("HandlerThread_Video_Single");
                new_android_os_HandlerThread_by_knot2.start();
                HandlerC60255c cVar2 = new HandlerC60255c(new_android_os_HandlerThread_by_knot2.getLooper(), hashMap4, strArr, hashMap5, arrayList7, fVar);
                this.workThreadMap.put(0, new_android_os_HandlerThread_by_knot2);
                this.workThreadHandlerMap.put(0, cVar2);
                Message.obtain(cVar2, 1).sendToTarget();
                C63929ab.m250974a("VEBingoManager", "HandlerThread_Single  is responsible for " + arrayList7);
            }
        }
        if (arrayList.size() > 0) {
            HandlerThread new_android_os_HandlerThread_by_knot3 = new_android_os_HandlerThread_by_knot("HandlerThread_Image");
            this.imageHandlerThread = new_android_os_HandlerThread_by_knot3;
            new_android_os_HandlerThread_by_knot3.start();
            HandlerC60254b bVar = new HandlerC60254b(this.imageHandlerThread.getLooper(), strArr, arrayList, fVar);
            this.imageHandler = bVar;
            Message.obtain(bVar, 1).sendToTarget();
        }
    }

    public int processBingoVideoFrame(ByteBuffer byteBuffer, int i, int i2, float f, String str) {
        if (this.mNative <= 0) {
            return -112;
        }
        return processBingoVideoFrameByNative(this.mNative, byteBuffer, i, i2, f, str);
    }
}
