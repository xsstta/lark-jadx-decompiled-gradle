package com.bytedance.ee.bear.document.offline.sync.sync;

import android.text.TextUtils;
import com.bytedance.apm.util.C3130n;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.sync.b */
public class C6031b {

    /* renamed from: a */
    private PersistenceSharedPreference f16902a = new PersistenceSharedPreference("sync_offline_retry_recorder");

    /* renamed from: b */
    private ReadWriteLock f16903b = new ReentrantReadWriteLock();

    /* renamed from: b */
    private String m24479b(AccountService.Account account, String str) {
        String a = m24475a(account, str);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        return "last_sync_time_" + a;
    }

    /* renamed from: a */
    private String m24475a(AccountService.Account account, String str) {
        if (account == null || TextUtils.isEmpty(account.f14584a) || TextUtils.isEmpty(account.f14591h) || TextUtils.isEmpty(str)) {
            return "";
        }
        return account.f14584a + "-" + account.f14591h + "-" + str;
    }

    /* renamed from: a */
    private int m24474a(String str, OfflineDoc offlineDoc) {
        try {
            this.f16903b.readLock().lock();
            C13479a.m54772d("SyncOfflineRecorder", "fetchRetryTimes... for doc : " + offlineDoc.getObj_token());
            int i = this.f16902a.getInt(str, 0);
            C13479a.m54772d("SyncOfflineRecorder", "fetchRetryTimes... target doc : " + offlineDoc.getObj_token() + " retry times : " + i);
            return i;
        } catch (Exception e) {
            C13479a.m54759a("SyncOfflineRecorder", "fetchRetryTimes... err happens", e);
            return 0;
        } finally {
            this.f16903b.readLock().unlock();
        }
    }

    /* renamed from: b */
    private long m24478b(String str, OfflineDoc offlineDoc) {
        try {
            this.f16903b.readLock().lock();
            C13479a.m54772d("SyncOfflineRecorder", "fetchLastSyncTimeStamp... for doc : " + offlineDoc.getObj_token());
            long j = this.f16902a.getLong(str, 0);
            C13479a.m54772d("SyncOfflineRecorder", "fetchLastSyncTimeStamp... target doc : " + offlineDoc.getObj_token() + " last sync time : " + j);
            return j;
        } catch (Exception e) {
            C13479a.m54759a("SyncOfflineRecorder", "fetchLastSyncTimeStamp... err happens", e);
            return 0;
        } finally {
            this.f16903b.readLock().unlock();
        }
    }

    /* renamed from: b */
    public void mo24371b(C10917c cVar, OfflineDoc offlineDoc) {
        if (offlineDoc != null && cVar != null && !TextUtils.isEmpty(offlineDoc.getObj_token())) {
            AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
            String a = m24475a(f, offlineDoc.getObj_token());
            if (!TextUtils.isEmpty(a)) {
                m24477a(a, offlineDoc.getObj_token(), true, -1);
                if (m24474a(a, offlineDoc) == 1) {
                    m24476a(m24479b(f, offlineDoc.getObj_token()), System.currentTimeMillis(), offlineDoc.getObj_token());
                }
            }
        }
    }

    /* renamed from: a */
    public C3130n<Boolean, Integer> mo24369a(C10917c cVar, OfflineDoc offlineDoc) {
        boolean z;
        int i = 0;
        F f = (F) false;
        C3130n<Boolean, Integer> nVar = new C3130n<>(f, 0);
        if (offlineDoc == null || cVar == null || TextUtils.isEmpty(offlineDoc.getObj_token())) {
            nVar.f10052a = f;
            return nVar;
        }
        AccountService.Account f2 = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        String a = m24475a(f2, offlineDoc.getObj_token());
        if (TextUtils.isEmpty(a)) {
            nVar.f10052a = f;
            return nVar;
        }
        int a2 = m24474a(a, offlineDoc);
        boolean z2 = true;
        if (a2 <= 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long b = m24478b(m24479b(f2, offlineDoc.getObj_token()), offlineDoc);
            long currentTimeMillis = System.currentTimeMillis();
            C13479a.m54764b("SyncOfflineRecorder", "can`t sync, last sync time = " + b);
            if (Math.abs(currentTimeMillis - b) >= 259200000) {
                C13479a.m54764b("SyncOfflineRecorder", "last sync time is one day ago from: " + b + "to : " + currentTimeMillis);
                mo24370a(cVar, offlineDoc.getObj_token());
                m24476a(m24479b(f2, offlineDoc.getObj_token()), 0, offlineDoc.getObj_token());
                nVar.f10052a = (F) Boolean.valueOf(z2);
                nVar.f10053b = (S) Integer.valueOf(i);
                return nVar;
            }
            C13479a.m54758a("SyncOfflineRecorder", "too many trials within one day, shall be reject");
        }
        i = a2;
        z2 = z;
        nVar.f10052a = (F) Boolean.valueOf(z2);
        nVar.f10053b = (S) Integer.valueOf(i);
        return nVar;
    }

    /* renamed from: a */
    public void mo24370a(C10917c cVar, String str) {
        if (cVar != null && !TextUtils.isEmpty(str)) {
            AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
            String a = m24475a(f, str);
            if (!TextUtils.isEmpty(a)) {
                m24477a(a, str, false, 0);
                m24476a(m24479b(f, str), 0, str);
            }
        }
    }

    /* renamed from: a */
    private void m24476a(String str, long j, String str2) {
        try {
            this.f16903b.writeLock().lock();
            C13479a.m54772d("SyncOfflineRecorder", "writeLastSyncTimeStamp... for doc : " + str2);
            if (j == 0) {
                this.f16902a.mo34036a(str);
            } else {
                this.f16902a.mo34037a(str, Long.valueOf(j));
            }
            C13479a.m54772d("SyncOfflineRecorder", "writeLastSyncTimeStamp... target doc : " + str2 + " last sync time : " + j);
        } catch (Exception e) {
            C13479a.m54759a("SyncOfflineRecorder", "writeLastSyncTimeStamp... err happens", e);
        } catch (Throwable th) {
            this.f16903b.writeLock().unlock();
            throw th;
        }
        this.f16903b.writeLock().unlock();
    }

    /* renamed from: a */
    private void m24477a(String str, String str2, boolean z, int i) {
        try {
            this.f16903b.writeLock().lock();
            C13479a.m54772d("SyncOfflineRecorder", "updateRetryTimes... for doc : " + str2);
            int intValue = ((Integer) this.f16902a.mo34038b(str, 0)).intValue();
            if (z) {
                int i2 = intValue + 1;
                this.f16902a.mo34037a(str, Integer.valueOf(i2));
                C13479a.m54772d("SyncOfflineRecorder", "updateRetryTimes... target doc : " + str2 + " retry times set to be : " + i2);
            } else if (i == 0) {
                this.f16902a.mo34036a(str);
                C13479a.m54772d("SyncOfflineRecorder", "updateRetryTimes... target doc : " + str2 + " retry times shall be removed");
            } else {
                this.f16902a.mo34037a(str, Integer.valueOf(i));
                C13479a.m54772d("SyncOfflineRecorder", "updateRetryTimes... target doc : " + str2 + " retry times set to be : " + i);
            }
        } catch (Exception e) {
            C13479a.m54759a("SyncOfflineRecorder", "updateRetryTimes... err happens : ", e);
        } catch (Throwable th) {
            this.f16903b.writeLock().unlock();
            throw th;
        }
        this.f16903b.writeLock().unlock();
    }
}
