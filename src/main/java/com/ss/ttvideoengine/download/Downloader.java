package com.ss.ttvideoengine.download;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.FeatureManager;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.database.KVDBManager;
import com.ss.ttvideoengine.download.DownloadTask;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Downloader {
    private static final Downloader ourInstance = new Downloader();
    public ArrayList<DownloadTask> allTasks;
    public KVDBManager dbObject;
    public ArrayList<Long> indexArray;
    private long limitFreeDiskSize;
    public IDownloaderListener listener;
    public boolean loadData;
    public Context mContext;
    public Handler mHandler;
    private long maxDownloadOperationCount;
    public long maxTaskId;
    public boolean readAllTask;
    private ArrayList<DownloadTask> runingTasks;
    private TaskThread taskThread;
    public ArrayList<DownloadTask> temLoadedTasks;
    private ArrayList<DownloadTask> waitingTasks;

    public static Downloader getInstance() {
        return ourInstance;
    }

    public long getLimitFreeDiskSize() {
        return this.limitFreeDiskSize;
    }

    public IDownloaderListener getListener() {
        return this.listener;
    }

    public long getMaxDownloadOperationCount() {
        return this.maxDownloadOperationCount;
    }

    private void initHandle() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(TTHelper.getLooper()) {
                /* class com.ss.ttvideoengine.download.Downloader.HandlerC654421 */

                public void handleMessage(Message message) {
                    long j;
                    long j2;
                    boolean z;
                    Downloader downloader;
                    if (message != null) {
                        try {
                            super.handleMessage(message);
                            if (message.what == 1) {
                                if (message.obj instanceof ArrayList) {
                                    ArrayList arrayList = (ArrayList) message.obj;
                                    DownloadTask taskForKey = Downloader.this.taskForKey((String) arrayList.get(0));
                                    if (taskForKey != null) {
                                        Error error = (Error) arrayList.get(1);
                                        if (!taskForKey._shouldRetry(error)) {
                                            taskForKey.setState(5);
                                        }
                                        taskForKey.receiveError(error);
                                        if (taskForKey.mediaKeys != null && taskForKey.mediaKeys.size() > 0) {
                                            for (int i = 0; i < taskForKey.mediaKeys.size(); i++) {
                                                DataLoaderHelper.getDataLoader().suspendedDownload(taskForKey.mediaKeys.get(i));
                                            }
                                        }
                                    }
                                }
                            } else if (message.what == 2) {
                                DownloadTask taskForKey2 = Downloader.this.taskForKey((String) message.obj);
                                if (taskForKey2 != null) {
                                    if (!(taskForKey2.getState() == 5 || taskForKey2.getState() == 3)) {
                                        taskForKey2.setState(3);
                                    }
                                    TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] task did suspended " + taskForKey2.toString());
                                    Downloader.this.tryNextWaitingTask(taskForKey2);
                                }
                            } else if (message.what == 0) {
                                try {
                                    String[] split = ((String) message.obj).split(",");
                                    if (split.length >= 4) {
                                        long longValue = Long.valueOf(split[0]).longValue();
                                        long longValue2 = Long.valueOf(split[1]).longValue();
                                        TTVideoEngineLog.m256505i("TTVideoEngine.Downloader", "[downloader] download progress, bytesReceived = " + longValue + " expectedToReceive = " + longValue2);
                                        if (longValue2 > 0) {
                                            String str = split[2];
                                            String str2 = split[3];
                                            DownloadTask taskForKey3 = this.taskForKey(str);
                                            if (taskForKey3 == null) {
                                                TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] exect fail. key = " + str + ", task is null");
                                                DataLoaderHelper.getDataLoader().suspendedDownload(str);
                                            } else if (taskForKey3 != null) {
                                                if (taskForKey3.getState() != 3) {
                                                    if (taskForKey3.getState() != 5) {
                                                        taskForKey3.bytesReceivedMap.put(str, Long.valueOf(longValue));
                                                        taskForKey3.bytesExpectedToReceiveMap.put(str, Long.valueOf(longValue2));
                                                        if (taskForKey3.mediaKeys == null || taskForKey3.mediaKeys.size() <= 0) {
                                                            z = false;
                                                            j2 = 0;
                                                            j = 0;
                                                        } else {
                                                            Iterator<String> it = taskForKey3.mediaKeys.iterator();
                                                            j2 = 0;
                                                            j = 0;
                                                            z = true;
                                                            while (it.hasNext()) {
                                                                String next = it.next();
                                                                if (!taskForKey3.bytesReceivedMap.containsKey(next)) {
                                                                    z = false;
                                                                } else {
                                                                    j2 += taskForKey3.bytesReceivedMap.get(next).longValue();
                                                                    j += taskForKey3.bytesExpectedToReceiveMap.get(next).longValue();
                                                                }
                                                            }
                                                        }
                                                        taskForKey3.bytesReceived = j2;
                                                        taskForKey3.bytesExpectedToReceive = j;
                                                        if (!(taskForKey3.mFirstResumeCallback || (downloader = this) == null || downloader.listener == null)) {
                                                            this.listener.downloaderDidResume(this, taskForKey3, taskForKey3.bytesReceived, taskForKey3.bytesExpectedToReceive);
                                                            taskForKey3.mFirstResumeCallback = true;
                                                        }
                                                        if (!z || taskForKey3.bytesReceived <= 0 || taskForKey3.bytesReceived != taskForKey3.bytesExpectedToReceive) {
                                                            long currentTimeMillis = System.currentTimeMillis();
                                                            long j3 = currentTimeMillis - taskForKey3.updateTs;
                                                            int i2 = (j3 > 1000 ? 1 : (j3 == 1000 ? 0 : -1));
                                                            if (i2 > 0) {
                                                                long freeSize = TTHelper.getFreeSize(Downloader.this.mContext);
                                                                TTVideoEngineLog.m256505i("TTVideoEngine.Downloader", "[downloader] get free size, size = " + freeSize);
                                                                if (freeSize <= Downloader.this.getLimitFreeDiskSize()) {
                                                                    taskForKey3.receiveError(new Error("kTTVideoErrorDomainDownload", -9947, 0, "available size is less than " + Downloader.this.getLimitFreeDiskSize() + " Byte"));
                                                                    if (taskForKey3.mediaKeys != null) {
                                                                        for (int i3 = 0; i3 < taskForKey3.mediaKeys.size(); i3++) {
                                                                            DataLoaderHelper.getDataLoader().suspendedDownload(taskForKey3.mediaKeys.get(i3));
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                            if (taskForKey3.updateTs < 1 || (taskForKey3.updateTs > 0 && i2 >= 0)) {
                                                                TTVideoEngineLog.m256505i("TTVideoEngine.Downloader", "[downloader] notify listener. key = " + str);
                                                                Downloader downloader2 = this;
                                                                if (!(downloader2 == null || downloader2.listener == null || taskForKey3.getState() == 3)) {
                                                                    this.listener.downloaderWriteData(this, taskForKey3, taskForKey3.bytesReceived - taskForKey3.updateBytesReceived, j3);
                                                                }
                                                                taskForKey3.updateTs = currentTimeMillis;
                                                                taskForKey3.updateBytesReceived = taskForKey3.bytesReceived;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        taskForKey3.availableLocalFilePath = str2;
                                                        taskForKey3.downloadEnd();
                                                        return;
                                                    }
                                                }
                                                TTVideoEngineLog.m256505i("TTVideoEngine.Downloader", "[downloader] task should suspend. key = " + str + ", state = " + taskForKey3.getState());
                                                DataLoaderHelper.getDataLoader().suspendedDownload(str);
                                                Downloader.this.tryNextWaitingTask(taskForKey3);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    TTVideoEngineLog.m256501d(th);
                                }
                            } else if (message.what == 5) {
                                this.loadData = false;
                                TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] create KV db fail");
                                if (this.listener != null) {
                                    this.listener.downloaderDidLoadAllTask(this, null, new Error("kTTVideoErrorDomainDownload", -9943, 0, "create kv db fail"));
                                }
                            } else if (message.what == 4 && this.listener != null) {
                                ArrayList arrayList2 = new ArrayList(this.temLoadedTasks);
                                if (arrayList2.size() > 0) {
                                    this.maxTaskId = ((DownloadTask) arrayList2.get(arrayList2.size() - 1)).taskIdentifier;
                                }
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    this.indexArray.add(Long.valueOf(((DownloadTask) it2.next()).taskIdentifier));
                                }
                                this.allTasks.clear();
                                this.allTasks.addAll(arrayList2);
                                this.readAllTask = true;
                                this.loadData = false;
                                TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] did load alltask. size = " + arrayList2.size());
                                this.listener.downloaderDidLoadAllTask(this, arrayList2, null);
                            }
                        } catch (Throwable th2) {
                            TTVideoEngineLog.m256501d(th2);
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: private */
    public static class TaskThread {
        private Handler mHandler;
        private HandlerThread mHandlerThread;

        public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        public TaskThread() {
            try {
                HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("vclould.engine.download.tasks");
                this.mHandlerThread = new_android_os_HandlerThread_by_knot;
                new_android_os_HandlerThread_by_knot.start();
                this.mHandler = new Handler(this.mHandlerThread.getLooper()) {
                    /* class com.ss.ttvideoengine.download.Downloader.TaskThread.HandlerC654431 */

                    public void handleMessage(Message message) {
                        SaveInfos saveInfos;
                        if (message != null) {
                            try {
                                if (!(message.obj instanceof ArrayList)) {
                                    TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                                    return;
                                }
                                ArrayList arrayList = (ArrayList) message.obj;
                                if (arrayList == null) {
                                    TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] obj should instance of ArrayList");
                                    return;
                                }
                                Downloader downloader = (Downloader) arrayList.get(0);
                                int i = message.what;
                                if (i == 10) {
                                    downloader.dbObject = new KVDBManager(downloader.mContext, "TTVideoEngine_download_database_v01");
                                    if (downloader.dbObject != null && downloader.dbObject.isCreateDBSuccess()) {
                                        TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] open db success");
                                        downloader.temLoadedTasks = downloader._loadAllTasks();
                                        if (downloader.mHandler != null) {
                                            downloader.mHandler.sendMessage(Message.obtain(downloader.mHandler, 4));
                                        }
                                    } else if (downloader.mHandler != null) {
                                        downloader.mHandler.sendMessage(Message.obtain(downloader.mHandler, 5));
                                    }
                                } else if (i == 11 && arrayList.size() == 2 && (saveInfos = (SaveInfos) arrayList.get(1)) != null) {
                                    downloader.writeTask(saveInfos.task, saveInfos.alltasks);
                                }
                            } catch (Throwable th) {
                                TTVideoEngineLog.m256501d(th);
                            }
                        }
                    }
                };
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
                this.mHandlerThread = null;
                this.mHandler = null;
            }
        }

        public void postMessage(ArrayList<Object> arrayList, int i) {
            if (this.mHandler != null && this.mHandlerThread != null) {
                Message obtain = Message.obtain();
                obtain.what = i;
                obtain.obj = arrayList;
                this.mHandler.sendMessage(obtain);
            }
        }
    }

    private Downloader() {
        this.limitFreeDiskSize = 1073741824;
        this.taskThread = new TaskThread();
        this.maxTaskId = -1;
        this.allTasks = new ArrayList<>();
        this.indexArray = new ArrayList<>();
        this.waitingTasks = new ArrayList<>();
        this.runingTasks = new ArrayList<>();
        this.maxDownloadOperationCount = 1;
        this.limitFreeDiskSize = 1073741824;
        this.readAllTask = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0188 A[Catch:{ all -> 0x0199 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.ss.ttvideoengine.download.DownloadTask> _loadAllTasks() {
        /*
        // Method dump skipped, instructions count: 445
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.download.Downloader._loadAllTasks():java.util.ArrayList");
    }

    public void setLimitFreeDiskSize(long j) {
        this.limitFreeDiskSize = j;
    }

    public void setListener(IDownloaderListener iDownloaderListener) {
        this.listener = iDownloaderListener;
    }

    public void setMaxDownloadOperationCount(long j) {
        this.maxDownloadOperationCount = j;
    }

    /* access modifiers changed from: private */
    public class SaveInfos {
        ArrayList<DownloadTask> alltasks;
        DownloadTask task;

        private SaveInfos() {
        }
    }

    public void downloadDidSuspened(String str) {
        Handler handler;
        if (!TextUtils.isEmpty(str) && (handler = this.mHandler) != null) {
            handler.sendMessage(Message.obtain(handler, 2, str));
        }
    }

    public void progress(String str) {
        Handler handler;
        if (!TextUtils.isEmpty(str) && (handler = this.mHandler) != null) {
            handler.sendMessage(Message.obtain(handler, 0, str));
        }
    }

    private String indexToString(ArrayList<Long> arrayList) {
        if (arrayList == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    private void saveTaskInfo(DownloadTask downloadTask) {
        SaveInfos saveInfos = new SaveInfos();
        saveInfos.task = downloadTask;
        saveInfos.alltasks = new ArrayList<>(this.allTasks);
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(this);
        arrayList.add(saveInfos);
        this.taskThread.postMessage(arrayList, 11);
    }

    private ArrayList<String> stringToStringArray(String str) {
        Throwable th;
        ArrayList<String> arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split == null || split.length <= 0) {
                return null;
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (String str2 : split) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(str2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    arrayList = arrayList2;
                    try {
                        TTVideoEngineLog.m256501d(th);
                    } catch (Throwable unused) {
                    }
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Throwable th3) {
            th = th3;
            TTVideoEngineLog.m256501d(th);
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    public void cancel(DownloadTask downloadTask) {
        this.allTasks.remove(downloadTask);
        this.indexArray.remove(Long.valueOf(downloadTask.taskIdentifier));
        this.waitingTasks.remove(downloadTask);
        downloadTask.receiveError(new Error("kTTVideoErrorDomainDownload", -9995, 0, "task info: " + downloadTask.toString()));
    }

    /* access modifiers changed from: package-private */
    public boolean suspended(DownloadTask downloadTask) {
        if (!this.waitingTasks.contains(downloadTask)) {
            return true;
        }
        this.waitingTasks.remove(downloadTask);
        TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] task is waiting. key =" + downloadTask.toString());
        downloadTask.setState(3);
        return true;
    }

    private DownloadTask addTask(DownloadTask downloadTask) {
        Throwable th;
        DownloadTask downloadTask2;
        downloadTask.setDownloader(this);
        try {
            if (!this.readAllTask) {
                TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] should load all tasks first.");
                return null;
            } else if (this.allTasks.contains(downloadTask)) {
                downloadTask2 = this.allTasks.get(this.allTasks.indexOf(downloadTask));
                try {
                    downloadTask2.setDownloader(this);
                    return downloadTask2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                long j = this.maxTaskId + 1;
                this.maxTaskId = j;
                downloadTask.taskIdentifier = j;
                if (this.indexArray.contains(Long.valueOf(this.maxTaskId))) {
                    TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] add task fail. taskIdentifier = " + this.maxTaskId);
                    downloadTask = null;
                } else {
                    this.indexArray.add(Long.valueOf(this.maxTaskId));
                    this.allTasks.add(downloadTask);
                }
                saveTaskInfo(downloadTask);
                return downloadTask;
            }
        } catch (Throwable th3) {
            downloadTask2 = downloadTask;
            th = th3;
            try {
                TTVideoEngineLog.m256501d(th);
            } catch (Throwable unused) {
            }
            return downloadTask2;
        }
    }

    private void writeIndexsToDisk(ArrayList<DownloadTask> arrayList) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        Iterator<DownloadTask> it = arrayList.iterator();
        while (it.hasNext()) {
            DownloadTask next = it.next();
            if (!arrayList2.contains(Long.valueOf(next.taskIdentifier))) {
                arrayList2.add(Long.valueOf(next.taskIdentifier));
            }
        }
        Collections.sort(arrayList2);
        String indexToString = indexToString(arrayList2);
        this.dbObject.save("index", indexToString);
        SharedPreferences.Editor edit = this.mContext.getSharedPreferences("TTVideoEngine_download_index_v01", 0).edit();
        edit.putString("index", indexToString);
        edit.commit();
    }

    public void loadAllTasks(Context context) {
        if (context == null) {
            TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] context == null");
            IDownloaderListener iDownloaderListener = this.listener;
            if (iDownloaderListener != null) {
                iDownloaderListener.downloaderDidLoadAllTask(this, null, new Error("kTTVideoErrorDomainDownload", -9999, 0, "context is null"));
            }
        } else if (!DataLoaderHelper.getDataLoader().isRunning()) {
            TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] need start dataloader first.");
            IDownloaderListener iDownloaderListener2 = this.listener;
            if (iDownloaderListener2 != null) {
                iDownloaderListener2.downloaderDidLoadAllTask(this, null, new Error("kTTVideoErrorDomainDownload", -9946, 0, "need start medialoader"));
            }
        } else if (this.readAllTask) {
            if (this.listener != null) {
                this.listener.downloaderDidLoadAllTask(this, new ArrayList(this.allTasks), null);
            }
        } else if (!this.loadData) {
            this.loadData = true;
            this.mContext = context;
            initHandle();
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.add(this);
            this.taskThread.postMessage(arrayList, 10);
        }
    }

    /* access modifiers changed from: package-private */
    public void resume(DownloadTask downloadTask) {
        IDownloaderListener iDownloaderListener;
        if (FeatureManager.hasPermission()) {
            if (!this.runingTasks.contains(downloadTask)) {
                this.runingTasks.add(downloadTask);
            }
            if (this.waitingTasks.contains(downloadTask)) {
                TTVideoEngineLog.m256505i("TTVideoEngine.Downloader", "[downloader] resume task. is waiting,  task = " + downloadTask.toString());
                this.waitingTasks.remove(downloadTask);
            }
            if (downloadTask.bytesReceived >= 1 && downloadTask.bytesExpectedToReceive >= 1 && (iDownloaderListener = this.listener) != null) {
                iDownloaderListener.downloaderDidResume(this, downloadTask, downloadTask.bytesReceived, downloadTask.bytesExpectedToReceive);
            }
        }
    }

    public DownloadTask taskForKey(String str) {
        DownloadTask downloadTask = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = new ArrayList(this.allTasks).iterator();
        while (it.hasNext()) {
            DownloadTask downloadTask2 = (DownloadTask) it.next();
            if (downloadTask2.mediaKeys != null && downloadTask2.mediaKeys.size() > 0) {
                Iterator<String> it2 = downloadTask2.mediaKeys.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (str.equals(it2.next())) {
                            downloadTask = downloadTask2;
                            continue;
                            break;
                        }
                    } else {
                        continue;
                        break;
                    }
                }
            }
            if (downloadTask != null) {
                break;
            }
        }
        return downloadTask;
    }

    /* access modifiers changed from: package-private */
    public void tryNextWaitingTask(DownloadTask downloadTask) {
        if (this.runingTasks.contains(downloadTask)) {
            this.runingTasks.remove(downloadTask);
        }
        if (((long) this.runingTasks.size()) == this.maxDownloadOperationCount) {
            TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] running task count is " + this.runingTasks.size() + " max count is " + this.maxDownloadOperationCount);
        } else if (this.waitingTasks.size() < 1) {
            TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] waiting task is empty");
        } else {
            DownloadTask downloadTask2 = this.waitingTasks.get(0);
            this.waitingTasks.remove(downloadTask2);
            downloadTask2.resume();
            TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] auto resume waiting task: " + downloadTask2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldResume(DownloadTask downloadTask) {
        if (((long) this.runingTasks.size()) < this.maxDownloadOperationCount || (this.runingTasks.contains(downloadTask) && (downloadTask.getState() == 3 || downloadTask.getState() == 5))) {
            long freeSize = TTHelper.getFreeSize(this.mContext);
            TTVideoEngineLog.m256505i("TTVideoEngine.Downloader", "[downloader] get free size, size = " + freeSize + ", limite = " + getLimitFreeDiskSize());
            if (freeSize > getLimitFreeDiskSize()) {
                return true;
            }
            downloadTask.receiveError(new Error("kTTVideoErrorDomainDownload", -9947, 0, "available size is less than 1073741824 M"));
            return false;
        }
        downloadTask.setState(1);
        if (!this.waitingTasks.contains(downloadTask)) {
            this.waitingTasks.add(downloadTask);
        }
        TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] task is waiting, task info " + downloadTask.toString());
        return false;
    }

    public DownloadVidTask vidTask(VideoModel videoModel, Resolution resolution) {
        if (!FeatureManager.hasPermission()) {
            return null;
        }
        DownloadVidTask taskItem = DownloadVidTask.taskItem(videoModel, resolution);
        if (!(taskItem == null || (taskItem = (DownloadVidTask) addTask(taskItem)) == null)) {
            taskItem.mContext = this.mContext;
            taskItem.setVideoModel(videoModel);
        }
        return taskItem;
    }

    public void downloadFail(String str, Error error) {
        if (!TextUtils.isEmpty(str) && error != null && this.mHandler != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add(error);
            Handler handler = this.mHandler;
            handler.sendMessage(Message.obtain(handler, 1, arrayList));
        }
    }

    /* access modifiers changed from: package-private */
    public void completeError(DownloadTask downloadTask, Error error) {
        if (!downloadTask.finished || downloadTask.canceled) {
            if (error != null) {
                TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] error info " + error.toString());
            }
            downloadTask.finished = true;
            saveTaskInfo(downloadTask);
            IDownloaderListener iDownloaderListener = this.listener;
            if (iDownloaderListener != null) {
                iDownloaderListener.downloaderDidComplete(this, downloadTask, error);
            }
            TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] task complete, task info = " + downloadTask.toString());
            tryNextWaitingTask(downloadTask);
            return;
        }
        TTVideoEngineLog.m256500d("TTVideoEngine.Downloader", "[downloader] task did finished, info = " + downloadTask.toString());
    }

    public void writeTask(DownloadTask downloadTask, ArrayList<DownloadTask> arrayList) {
        writeIndexsToDisk(arrayList);
        String jSONObject = downloadTask.jsonObject().toString();
        String valueOf = String.valueOf(downloadTask.taskIdentifier);
        TTVideoEngineLog.m256505i("TTVideoEngine.Downloader", "[downloader] write task. key " + valueOf + " value: " + jSONObject);
        if (arrayList.contains(downloadTask)) {
            if (!this.dbObject.save(valueOf, jSONObject)) {
                TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] save task fail, videoid = " + downloadTask.videoId + " taskIdentifier = " + downloadTask.taskIdentifier);
                downloadTask.receiveError(new Error("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
            }
        } else if (!this.dbObject.remove(valueOf)) {
            TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] remve task fail, videoid = " + downloadTask.videoId + " taskIdentifier = " + downloadTask.taskIdentifier);
            downloadTask.receiveError(new Error("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
        }
    }

    public DownloadVidTask vidTask(String str, Resolution resolution, String str2) {
        return vidTask(str, resolution, null, false, false, str2);
    }

    public DownloadURLTask urlTask(String[] strArr, String str, String str2) {
        if (!FeatureManager.hasPermission()) {
            return null;
        }
        if (strArr == null || strArr.length < 1 || TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] urls or key is invalid.");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str3 : strArr) {
            arrayList.add(str3);
        }
        DownloadURLTask taskItem = DownloadURLTask.taskItem(str, arrayList, str2);
        if (!(taskItem == null || (taskItem = (DownloadURLTask) addTask(taskItem)) == null)) {
            taskItem.updateUrls(arrayList);
        }
        return taskItem;
    }

    public DownloadURLTask urlTask(String[] strArr, String str, String str2, DownloadTask.EncryptVersion encryptVersion) {
        if (!FeatureManager.hasPermission()) {
            return null;
        }
        if (strArr == null || strArr.length < 1 || TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256503e("TTVideoEngine.Downloader", "[downloader] urls or key is invalid.");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str3 : strArr) {
            arrayList.add(str3);
        }
        DownloadURLTask taskItem = DownloadURLTask.taskItem(str, arrayList, str2, encryptVersion);
        if (!(taskItem == null || (taskItem = (DownloadURLTask) addTask(taskItem)) == null)) {
            taskItem.updateUrls(arrayList);
        }
        return taskItem;
    }

    public DownloadVidTask vidTask(String str, Resolution resolution, String str2, boolean z, boolean z2) {
        return vidTask(str, resolution, str2, z, z2, null);
    }

    public DownloadVidTask vidTask(String str, Resolution resolution, boolean z, boolean z2, boolean z3) {
        String str2;
        if (!FeatureManager.hasPermission()) {
            return null;
        }
        if (z) {
            str2 = "bytevc1";
        } else {
            str2 = "h264";
        }
        return vidTask(str, resolution, str2, z2, z3);
    }

    public DownloadVidTask vidTask(String str, Resolution resolution, String str2, boolean z, boolean z2, String str3) {
        if (!FeatureManager.hasPermission()) {
            return null;
        }
        DownloadVidTask taskItem = DownloadVidTask.taskItem(str, resolution, str2, z, z2, str3);
        if (!(taskItem == null || (taskItem = (DownloadVidTask) addTask(taskItem)) == null)) {
            taskItem.mContext = this.mContext;
        }
        return taskItem;
    }
}
