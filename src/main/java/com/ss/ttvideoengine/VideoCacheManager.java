package com.ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.ttvideoengine.model.VideoCacheInfo;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class VideoCacheManager {
    private static String TAG = "VideoCacheManager";
    private static volatile File dir;
    private final LinkedHashMap<String, File> cache;
    private volatile float cleanFactor;
    private ClearTask clearTask;
    private volatile boolean isInited;
    private final LinkedHashMap<String, VideoCacheInfo> keyCache;
    private final ReentrantReadWriteLock lock;
    private volatile long maxSize;
    private final ProtectKeyManager protectKeyManager;
    private final ReentrantReadWriteLock.ReadLock readLock;
    private final ReentrantReadWriteLock.WriteLock writeLock;

    /* access modifiers changed from: private */
    public static class VideoCacheManagerSingletonHolder {
        public static final VideoCacheManager instance = new VideoCacheManager();

        private VideoCacheManagerSingletonHolder() {
        }
    }

    public static VideoCacheManager getInstance() {
        return VideoCacheManagerSingletonHolder.instance;
    }

    public void start() {
        this.clearTask.postMessage(this, 0);
    }

    /* access modifiers changed from: private */
    public static final class ProtectKeyManager {
        private final Map<String, Integer> protectKeys;

        private ProtectKeyManager() {
            this.protectKeys = new HashMap();
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean containsKey(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.protectKeys.containsKey(str);
        }

        /* access modifiers changed from: package-private */
        public synchronized void addProtectKey(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.protectKeys.get(str);
                if (num == null) {
                    this.protectKeys.put(str, 1);
                } else {
                    this.protectKeys.put(str, Integer.valueOf(num.intValue() + 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void removeProtectKey(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.protectKeys.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.protectKeys.remove(str);
                } else {
                    this.protectKeys.put(str, Integer.valueOf(num.intValue() - 1));
                }
            }
        }
    }

    private static class ClearTask {
        private Handler mHandler;
        private HandlerThread mHandlerThread;

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        public ClearTask() {
            try {
                HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("clearCacheThread");
                this.mHandlerThread = new_android_os_HandlerThread_by_knot;
                new_android_os_HandlerThread_by_knot.start();
                this.mHandler = new Handler(this.mHandlerThread.getLooper()) {
                    /* class com.ss.ttvideoengine.VideoCacheManager.ClearTask.HandlerC654371 */

                    public void handleMessage(Message message) {
                        if (message != null) {
                            try {
                                VideoCacheManager videoCacheManager = (VideoCacheManager) message.obj;
                                int i = message.what;
                                if (i == 0) {
                                    videoCacheManager.init();
                                } else if (i == 1) {
                                    videoCacheManager.clear();
                                } else if (i == 2) {
                                    videoCacheManager.cleanIfNecessary();
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                };
            } catch (Throwable unused) {
                this.mHandlerThread = null;
                this.mHandler = null;
            }
        }

        public void postMessage(VideoCacheManager videoCacheManager, int i) {
            Handler handler = this.mHandler;
            Message message = new Message();
            message.what = i;
            message.obj = videoCacheManager;
            this.mHandler.sendMessage(message);
        }
    }

    /* access modifiers changed from: package-private */
    public void cleanIfNecessary() {
        TTVideoEngineLog.m256500d(TAG, String.format("start clean file maxSize:%d", Long.valueOf(this.maxSize)));
        trimSize(this.maxSize);
        TTVideoEngineLog.m256500d(TAG, String.format("end clean file maxSize:%d", Long.valueOf(this.maxSize)));
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        TTVideoEngineLog.m256500d(TAG, String.format("start clear all cache", new Object[0]));
        trimSize(0);
        TTVideoEngineLog.m256500d(TAG, String.format("end clear all cache", new Object[0]));
    }

    private VideoCacheManager() {
        this.cache = new LinkedHashMap<>(0, 0.75f, true);
        this.keyCache = new LinkedHashMap<>(0, 0.75f, true);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
        this.maxSize = 209715200;
        this.cleanFactor = 0.3f;
        this.isInited = false;
        this.protectKeyManager = new ProtectKeyManager();
        this.clearTask = new ClearTask();
    }

    /* access modifiers changed from: package-private */
    public void init() {
        String customBase64Encode;
        TTVideoEngineLog.m256505i(TAG, String.format("start init videocachemanager", new Object[0]));
        this.writeLock.lock();
        try {
            if (!this.isInited && isValidDir(dir)) {
                File[] listFiles = dir.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    final HashMap hashMap = new HashMap(listFiles.length);
                    ArrayList arrayList = new ArrayList(listFiles.length);
                    for (File file : listFiles) {
                        if (file.isFile()) {
                            arrayList.add(file);
                            hashMap.put(file, Long.valueOf(file.lastModified()));
                        }
                    }
                    Collections.sort(arrayList, new Comparator<File>() {
                        /* class com.ss.ttvideoengine.VideoCacheManager.C654361 */

                        public int compare(File file, File file2) {
                            int i = ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) > 0 ? 1 : ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) == 0 ? 0 : -1));
                            if (i < 0) {
                                return -1;
                            }
                            if (i > 0) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        TTVideoEngineLog.m256505i(TAG, String.format("add file:%s", file2.getName()));
                        this.cache.put(getKey(file2), file2);
                        String[] extractKeys = extractKeys(file2);
                        if (isValidKeys(extractKeys)) {
                            String format = String.format("%s_%s", extractKeys[0], extractKeys[1]);
                            String format2 = String.format("%s_%s_%s_%s", extractKeys[0], extractKeys[1], extractKeys[2], extractKeys[3]);
                            String str = null;
                            if (extractKeys.length == 5) {
                                str = extractKeys[4];
                            }
                            String canonicalPath = file2.getCanonicalPath();
                            if (str != null && str.length() > 0 && (customBase64Encode = TTHelper.customBase64Encode(str)) != null && !customBase64Encode.equals(str)) {
                                canonicalPath = canonicalPath.replace(str, customBase64Encode);
                                file2.renameTo(new File(canonicalPath));
                                str = customBase64Encode;
                            }
                            this.keyCache.put(format, new VideoCacheInfo(canonicalPath, format2, format2, str));
                        }
                    }
                }
                this.isInited = true;
            }
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
        this.writeLock.unlock();
        TTVideoEngineLog.m256500d(TAG, String.format("end init videocachemanager", new Object[0]));
    }

    public void setMaxSize(long j) {
        this.maxSize = j;
    }

    private String getKey(File file) {
        return file.getName();
    }

    public static void setDir(File file) {
        if (file != null) {
            dir = file;
        }
    }

    private String[] extractKeys(File file) {
        String name = file.getName();
        if (name == null) {
            return null;
        }
        return extractKeys(name);
    }

    private String[] extractKeys(String str) {
        String[] split;
        if (str == null || (split = str.split("\\.")) == null || split.length <= 0) {
            return null;
        }
        return split[0].split("_");
    }

    /* access modifiers changed from: package-private */
    public boolean isValidDir(File file) {
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isValidKeys(String[] strArr) {
        if (strArr == null || !(strArr.length == 4 || strArr.length == 5)) {
            return false;
        }
        for (String str : strArr) {
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    public void addProtectKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i(TAG, String.format("start add protect key:%s", str));
            this.protectKeyManager.addProtectKey(str);
            TTVideoEngineLog.m256500d(TAG, String.format("end add protect key:%s", str));
        }
    }

    public boolean isCacheInfoExist(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.readLock.tryLock()) {
            try {
                z = this.keyCache.containsKey(str);
            } catch (Throwable th) {
                this.readLock.unlock();
                throw th;
            }
            this.readLock.unlock();
        }
        return z;
    }

    public void removeProtectKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i(TAG, String.format("start remove protect key:%s", str));
            this.protectKeyManager.removeProtectKey(str);
            TTVideoEngineLog.m256500d(TAG, String.format("end remove protect key:%s", str));
        }
    }

    public VideoCacheInfo getCacheInfo(String str) {
        Throwable th;
        VideoCacheInfo videoCacheInfo = null;
        if (str == null) {
            return null;
        }
        if (this.readLock.tryLock()) {
            try {
                VideoCacheInfo videoCacheInfo2 = this.keyCache.get(str);
                if (videoCacheInfo2 != null) {
                    try {
                        videoCacheInfo2.spadeaKey = TTHelper.customBase64Decode(videoCacheInfo2.spadeaKey);
                        String[] extractKeys = extractKeys(videoCacheInfo2.fileName);
                        if (!isValidKeys(extractKeys) || !checkMD5(videoCacheInfo2.filePath, extractKeys[2], Long.parseLong(extractKeys[3]))) {
                            TTVideoEngineLog.m256500d(TAG, String.format("get info err", str));
                            this.readLock.unlock();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        videoCacheInfo = videoCacheInfo2;
                        try {
                            TTVideoEngineLog.m256501d(th);
                            this.readLock.unlock();
                            return videoCacheInfo;
                        } catch (Throwable th3) {
                            this.readLock.unlock();
                            throw th3;
                        }
                    }
                }
                videoCacheInfo = videoCacheInfo2;
            } catch (Throwable th4) {
                th = th4;
                TTVideoEngineLog.m256501d(th);
                this.readLock.unlock();
                return videoCacheInfo;
            }
            this.readLock.unlock();
        }
        return videoCacheInfo;
    }

    private void trimSize(long j) {
        Throwable th;
        HashSet hashSet = new HashSet();
        TTVideoEngineLog.m256500d(TAG, String.format("start trim", new Object[0]));
        this.writeLock.lock();
        long j2 = 0;
        try {
            for (Map.Entry<String, File> entry : this.cache.entrySet()) {
                j2 += entry.getValue().length();
            }
            TTVideoEngineLog.m256500d(TAG, String.format("current file size:%d,maxsize:%d", Long.valueOf(j2), Long.valueOf(j)));
            if (j2 <= j) {
                this.writeLock.unlock();
                return;
            }
            long j3 = (long) (((float) j) * this.cleanFactor);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (Map.Entry<String, File> entry2 : this.cache.entrySet()) {
                File value = entry2.getValue();
                if (value == null || !value.exists()) {
                    hashSet2.add(entry2.getKey());
                } else if (!this.protectKeyManager.containsKey(getKey(value))) {
                    long length = value.length();
                    File file = new File(value.getAbsolutePath() + "-tmp");
                    if (value.renameTo(file)) {
                        hashSet.add(file);
                        j2 -= length;
                        hashSet2.add(entry2.getKey());
                        String[] extractKeys = extractKeys(value);
                        if (isValidKeys(extractKeys)) {
                            hashSet3.add(String.format("%s_%s", extractKeys[0], extractKeys[1]));
                        }
                    }
                }
                if (j2 <= j3) {
                    break;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                this.cache.remove((String) it.next());
            }
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                this.keyCache.remove((String) it2.next());
            }
            this.writeLock.unlock();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                File file2 = (File) it3.next();
                try {
                    String str = TAG;
                    try {
                        TTVideoEngineLog.m256500d(str, String.format("delete file name:%s", file2.getName()));
                        file2.delete();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    TTVideoEngineLog.m256501d(th);
                }
            }
            TTVideoEngineLog.m256500d(TAG, String.format("end trim", new Object[0]));
        } catch (Throwable th4) {
            this.writeLock.unlock();
            throw th4;
        }
    }

    public void addCacheInfo(String str, String str2) {
        if (this.writeLock.tryLock()) {
            try {
                String[] extractKeys = extractKeys(str);
                if (isValidKeys(extractKeys)) {
                    String format = String.format("%s_%s", extractKeys[0], extractKeys[1]);
                    String format2 = String.format("%s_%s_%s_%s", extractKeys[0], extractKeys[1], extractKeys[2], extractKeys[3]);
                    String str3 = null;
                    if (extractKeys.length == 5) {
                        str3 = extractKeys[4];
                    }
                    VideoCacheInfo videoCacheInfo = new VideoCacheInfo(str2, format2, format2, str3);
                    if (!this.keyCache.containsKey(format)) {
                        this.keyCache.put(format, videoCacheInfo);
                    }
                }
            } catch (Throwable th) {
                this.writeLock.unlock();
                throw th;
            }
            this.writeLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097 A[SYNTHETIC, Splitter:B:49:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2 A[SYNTHETIC, Splitter:B:55:0x00a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkCacheFileIntegrity(java.lang.String r8, java.lang.String r9, long r10) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.VideoCacheManager.checkCacheFileIntegrity(java.lang.String, java.lang.String, long):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean checkMD5(String str, String str2, long j) {
        if (!(str == null || str2 == null)) {
            long j2 = 0;
            if (j > 0) {
                File file = new File(str);
                if (!file.exists() || file.length() < j) {
                    TTVideoEngineLog.m256503e(TAG, String.format("file not exist or filesize not engough:%s length:%d filesize:%d", str, Long.valueOf(file.length()), Long.valueOf(j)));
                } else {
                    byte[] bArr = new byte[16384];
                    try {
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        FileInputStream fileInputStream = new FileInputStream(file);
                        while (true) {
                            long j3 = j - j2;
                            if (j3 > 16384) {
                                j3 = 16384;
                            }
                            int i = (int) j3;
                            if (i == 0) {
                                break;
                            }
                            int read = fileInputStream.read(bArr, 0, i);
                            if (read < 0) {
                                TTVideoEngineLog.m256503e(TAG, String.format("read data err:%s", str));
                                break;
                            }
                            j2 += (long) read;
                            instance.update(bArr, 0, read);
                        }
                        fileInputStream.close();
                        BigInteger bigInteger = new BigInteger(1, instance.digest());
                        String format = String.format("%032x", bigInteger);
                        TTVideoEngineLog.m256505i(TAG, String.format("cache md5:%s compute md5:%s", str2, bigInteger.toString(16)));
                        if (!str2.equals(format)) {
                            return false;
                        }
                        TTVideoEngineLog.m256505i(TAG, "md5 match right");
                        return true;
                    } catch (Exception e) {
                        TTVideoEngineLog.m256501d(e);
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
