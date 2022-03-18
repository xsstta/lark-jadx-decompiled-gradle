package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.text.TextUtils;
import androidx.core.util.C0844e;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.ProgressingEntity;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.lark.pb.space.drive.v1.PushDownloadCallback;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.j */
public class C9403j {

    /* renamed from: a */
    public static final int f25279a = PushDownloadCallback.Status.READY.getValue();

    /* renamed from: b */
    public static final int f25280b = PushDownloadCallback.Status.QUEUE.getValue();

    /* renamed from: c */
    public static final int f25281c = PushDownloadCallback.Status.PENDING.getValue();

    /* renamed from: d */
    public static final int f25282d = PushDownloadCallback.Status.INFLIGHT.getValue();

    /* renamed from: e */
    public static final int f25283e = PushDownloadCallback.Status.FAILED.getValue();

    /* renamed from: f */
    public static final int f25284f = PushDownloadCallback.Status.CANCEL.getValue();

    /* renamed from: g */
    public static final int f25285g = PushDownloadCallback.Status.SUCCESS.getValue();

    /* renamed from: i */
    private static volatile C9403j f25286i;

    /* renamed from: h */
    public ConcurrentHashMap<String, Set<C9407c>> f25287h;

    /* renamed from: j */
    private int f25288j;

    /* renamed from: k */
    private final UploadCallback f25289k = new UploadCallback() {
        /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9403j.C94041 */

        /* renamed from: a */
        private List<C9407c> m38882a(Set<C9407c> set, String str) {
            ArrayList arrayList = new ArrayList();
            for (C9407c cVar : set) {
                if (TextUtils.equals(cVar.f25300c, str)) {
                    arrayList.add(cVar);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m38883a(String str, String str2, int i) {
            Set<C9407c> set = C9403j.this.f25287h.get(str);
            if (set == null) {
                C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl onFailed empty monitors");
                return;
            }
            for (C9407c cVar : set) {
                cVar.f25301d.onUploadErrorCode(str2, i);
            }
        }

        /* renamed from: a */
        private void m38884a(String str, String str2, C9406b bVar) {
            C13479a.m54764b("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl notifyPath, path: " + C13598b.m55197d(str) + ", mountPoint: " + str2);
            Set<C9407c> set = C9403j.this.f25287h.get(str);
            if (set == null) {
                C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl notifyPath, empty monitors");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (TextUtils.equals(str, "all_files_token")) {
                arrayList.addAll(m38882a(set, str2));
            } else {
                arrayList.addAll(set);
            }
            C9403j.this.mo35861a(str, str2, arrayList, bVar);
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
        public boolean onFailed(String str, int i, String str2, long j) {
            C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl globalUploadCallback.onFailed: key= " + str + ", error_code" + i + ", bytesTotal=" + j);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            m38883a(str2, str, i);
            m38883a("all_files_token", str, i);
            return false;
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.UploadCallback
        public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7) {
            String str8;
            C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl globalUploadCallback.updateProgress: key= " + str + ", status = " + status + ", mountNodeToken: " + C13598b.m55197d(str4) + ", mountPoint: " + str6);
            if (!TextUtils.isEmpty(str4)) {
                str8 = str4;
            } else {
                str8 = "";
            }
            C9406b bVar = new C9406b(str, status, j, j2, str3, str4, str2, str7);
            m38884a(str8, str6, bVar);
            m38884a("all_files_token", str6, bVar);
            return false;
        }
    };

    /* renamed from: c */
    public int mo35863c() {
        return this.f25288j;
    }

    private C9403j() {
        m38876d();
    }

    /* renamed from: a */
    public static C9403j m38871a() {
        if (f25286i == null) {
            synchronized (C9403j.class) {
                if (f25286i == null) {
                    f25286i = new C9403j();
                }
            }
        }
        return f25286i;
    }

    /* renamed from: d */
    private void m38876d() {
        this.f25287h = new ConcurrentHashMap<>();
        C9379g.m38738a().mo35794a(this.f25289k);
    }

    /* renamed from: b */
    public void mo35862b() {
        String next;
        Set<C9407c> set;
        C13479a.m54764b("Middleground_Drive_DriveStateMonitorImpl", "notifyAllAfterInit...");
        Iterator<String> it = this.f25287h.keySet().iterator();
        while (it.hasNext() && (set = this.f25287h.get((next = it.next()))) != null) {
            for (C9407c cVar : set) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(cVar);
                m38873a(arrayList, cVar.f25300c, next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.j$c */
    public static class C9407c {

        /* renamed from: a */
        int f25298a;

        /* renamed from: b */
        int f25299b;

        /* renamed from: c */
        String f25300c;

        /* renamed from: d */
        BinderIUploadStateMonitor f25301d;

        C9407c(BinderIUploadStateMonitor binderIUploadStateMonitor) {
            this.f25301d = binderIUploadStateMonitor;
        }
    }

    /* renamed from: a */
    public void mo35859a(BinderIUploadStateMonitor binderIUploadStateMonitor) {
        C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl unRegisterUploadStateMonitor");
        ArrayList<String> arrayList = new ArrayList();
        for (String str : this.f25287h.keySet()) {
            Set<C9407c> set = this.f25287h.get(str);
            if (set != null) {
                ArrayList arrayList2 = new ArrayList();
                for (C9407c cVar : set) {
                    if (cVar.f25301d == binderIUploadStateMonitor) {
                        arrayList2.add(cVar);
                    }
                }
                set.removeAll(arrayList2);
                if (set.size() == 0) {
                    arrayList.add(str);
                }
            }
        }
        for (String str2 : arrayList) {
            this.f25287h.remove(str2);
        }
    }

    /* renamed from: b */
    private DriveFile m38874b(String str, String str2) {
        List<DriveFile> a = C9379g.m38738a().mo35792a(str, str2);
        if (a != null && a.size() > 0) {
            return a.get(0);
        }
        C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl getFirstUnsuccessFile: DriveRustUploaderWrapper.getAllUploadFileList is null");
        return null;
    }

    /* renamed from: a */
    private C0844e<Integer, Integer> m38870a(String str, String str2) {
        List<DriveFile> a = C9379g.m38738a().mo35792a(str, str2);
        int i = 0;
        if (a == null || a.size() == 0) {
            return new C0844e<>(0, 0);
        }
        int i2 = 0;
        for (DriveFile driveFile : a) {
            if (driveFile.status == DriveFile.Status.INFLIGHT || driveFile.status == DriveFile.Status.PENDING || driveFile.status == DriveFile.Status.READY || driveFile.status == DriveFile.Status.QUEUE) {
                i++;
            }
            if (driveFile.status != DriveFile.Status.SUCCESS) {
                i2++;
            }
        }
        if (str.equals("all_files_token")) {
            this.f25288j = i;
        }
        return new C0844e<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: c */
    private C0844e<Integer, Integer> m38875c(String str, String str2) {
        List<DriveFile> b = C9379g.m38738a().mo35800b(str, str2);
        int i = 0;
        int i2 = 0;
        for (DriveFile driveFile : b) {
            if (!(driveFile.status == DriveFile.Status.FAILED || driveFile.status == DriveFile.Status.CANCEL)) {
                i2++;
            }
            if (driveFile.status == DriveFile.Status.SUCCESS) {
                i++;
            }
        }
        C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl calculateTotalProgress path = " + str + ", file count = " + b.size() + ", finishCount = " + i + ", totalCount = " + i2);
        return new C0844e<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    private void m38873a(List<C9407c> list, String str, String str2) {
        C13479a.m54764b("Middleground_Drive_DriveStateMonitorImpl", "notifyGlobalFirstTime...");
        AbstractC68307f.m265099b((Callable) new Callable(str2, str, list) {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$j$KoY292k7eBQClx4LVdx5nB8DpoQ */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ List f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C9403j.this.m38872a(this.f$1, this.f$2, this.f$3);
            }
        }).mo238004b(C11678b.m48479c()).mo238010b((Object) false).mo238036k();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m38872a(String str, String str2, List list) throws Exception {
        DriveFile b = m38874b(str, str2);
        if (b != null) {
            mo35861a(str, str2, list, new C9406b(b.key, b.status, b.bytesTransferred, b.bytesTotal, b.path, b.mountNodePoint, "", ""));
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9407c cVar = (C9407c) it.next();
                if (cVar.f25298a > 0) {
                    cVar.f25301d.onUploadFinished();
                }
                cVar.f25298a = 0;
                cVar.f25299b = 0;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo35860a(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor) {
        C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl registerUploadStateMonitor path = " + C13598b.m55197d(str) + ", mountPoint: " + str2);
        Set<C9407c> set = this.f25287h.get(str);
        if (set == null) {
            set = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        C9407c cVar = new C9407c(binderIUploadStateMonitor);
        cVar.f25300c = str2;
        set.add(cVar);
        this.f25287h.put(str, set);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        m38873a(arrayList, str2, str);
    }

    /* renamed from: a */
    public void mo35861a(String str, String str2, List<C9407c> list, C9406b bVar) {
        int i;
        String str3;
        C0844e<Integer, Integer> a = m38870a(str, str2);
        int intValue = a.f3317a.intValue();
        int intValue2 = a.f3318b.intValue();
        if (!(list == null || list.size() == 0)) {
            C0844e<Integer, Integer> c = m38875c(str, str2);
            int intValue3 = c.f3317a.intValue();
            int intValue4 = c.f3318b.intValue();
            if (intValue4 == 0) {
                i = 100;
            } else {
                i = (intValue3 * 100) / intValue4;
            }
            int i2 = (int) (((((float) bVar.f25295f) * 1.0f) / ((float) bVar.f25296g)) * 100.0f);
            C9407c cVar = list.get(0);
            C13479a.m54775e("Middleground_Drive_DriveStateMonitorImpl", "DriveStateMonitorImpl notifyGlobalProgress path = " + str + ", key = " + bVar.f25290a + ", currentCount = " + intValue2 + " currentQueueCount = " + intValue + " lastUploadFilesCount = " + cVar.f25298a + ", lastQueueCount=" + cVar.f25299b + ", status = " + bVar.f25291b + ", totalProgress = " + i);
            if (bVar.f25297h.contains("/")) {
                str3 = bVar.f25297h.substring(bVar.f25297h.lastIndexOf("/") + 1);
            } else {
                str3 = bVar.f25297h;
            }
            ProgressingEntity progressingEntity = new ProgressingEntity();
            progressingEntity.mo35706b(bVar.f25290a);
            progressingEntity.mo35703a(str3);
            progressingEntity.mo35702a(i2);
            progressingEntity.mo35705b(bVar.f25291b.value());
            progressingEntity.mo35708c(bVar.f25297h);
            progressingEntity.mo35710d(str);
            for (C9407c cVar2 : list) {
                if ((cVar2.f25299b == 0 && intValue > 0) || (cVar2.f25298a == 0 && intValue2 > 0)) {
                    cVar2.f25301d.onExistUploadingFile();
                }
                if (intValue2 > 0 && intValue == 0) {
                    cVar2.f25301d.onUploadError(intValue2);
                    i = 0;
                }
                cVar2.f25301d.onFileProgressChange(i, progressingEntity);
                if (bVar.f25291b == DriveFile.Status.SUCCESS) {
                    cVar2.f25301d.onUploadFileSuccess(bVar.f25290a, bVar.f25293d, bVar.f25294e);
                }
                if (!(intValue2 == cVar2.f25298a && intValue == cVar2.f25299b)) {
                    cVar2.f25301d.onFileCountChange(intValue3, intValue4);
                }
                if (cVar2.f25298a > 0 && intValue2 == 0) {
                    cVar2.f25301d.onUploadFinished();
                }
                cVar2.f25298a = intValue2;
                cVar2.f25299b = intValue;
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.j$a */
    private static class C9405a {

        /* renamed from: a */
        String f25290a;

        /* renamed from: b */
        DriveFile.Status f25291b;

        /* renamed from: c */
        String f25292c;

        /* renamed from: d */
        String f25293d;

        /* renamed from: e */
        String f25294e;

        C9405a(String str, DriveFile.Status status, String str2, String str3, String str4) {
            this.f25290a = str;
            this.f25291b = status;
            this.f25292c = str2;
            this.f25293d = str3;
            this.f25294e = str4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.j$b */
    public static class C9406b extends C9405a {

        /* renamed from: f */
        long f25295f;

        /* renamed from: g */
        long f25296g;

        /* renamed from: h */
        String f25297h;

        C9406b(String str, DriveFile.Status status, long j, long j2, String str2, String str3, String str4, String str5) {
            super(str, status, str3, str4, str5);
            this.f25295f = j;
            this.f25296g = j2;
            this.f25297h = str2;
        }
    }
}
