package com.ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.socialbase.downloader.downloader.AbstractC60063m;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.C60048c;
import com.ss.android.socialbase.downloader.downloader.IDownloadAidlService;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import com.ss.android.socialbase.downloader.utils.C60162e;

/* renamed from: com.ss.android.socialbase.downloader.impls.m */
public class ServiceConnectionC60105m extends AbstractC60044a implements ServiceConnection {

    /* renamed from: f */
    private static final String f149924f = "m";

    /* renamed from: g */
    private IDownloadAidlService f149925g;

    /* renamed from: h */
    private AbstractC60063m f149926h;

    /* renamed from: i */
    private int f149927i = -1;

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: f */
    public void mo204668f() {
        if (this.f149925g == null) {
            mo204655a(C60046b.m232945G(), this);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: a */
    public void mo204657a(AbstractC60063m mVar) {
        this.f149926h = mVar;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: a */
    public void mo204653a(int i) {
        IDownloadAidlService iDownloadAidlService = this.f149925g;
        if (iDownloadAidlService == null) {
            this.f149927i = i;
            return;
        }
        try {
            iDownloadAidlService.setLogLevel(i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onBindingDied(ComponentName componentName) {
        this.f149925g = null;
        AbstractC60063m mVar = this.f149926h;
        if (mVar != null) {
            mVar.mo204833h();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: c */
    public void mo204665c(DownloadTask downloadTask) {
        if (downloadTask != null) {
            C60048c.m233017a().mo204678a(downloadTask.getDownloadId(), true);
            AbstractC60081a x = C60046b.m233014x();
            if (x != null) {
                x.mo204905a(downloadTask);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C59990a.m232838b(f149924f, "onServiceDisconnected ");
        this.f149925g = null;
        this.f149677c = false;
        AbstractC60063m mVar = this.f149926h;
        if (mVar != null) {
            mVar.mo204833h();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: a */
    public IBinder mo204652a(Intent intent) {
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            Log.w(f149924f, "downloader process sync database on main process!");
            C60148a.m233724a("fix_sigbus_downloader_db", true);
        }
        C59990a.m232838b(f149924f, "onBind IndependentDownloadBinder");
        return new IndependentDownloadBinder();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60064n, com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: b */
    public void mo204662b(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            String str = f149924f;
            StringBuilder sb = new StringBuilder();
            sb.append("tryDownload aidlService == null:");
            if (this.f149925g == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C59990a.m232838b(str, sb.toString());
            if (this.f149925g == null) {
                mo204658a(downloadTask);
                mo204655a(C60046b.m232945G(), this);
                return;
            }
            if (this.f149676b.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.f149676b) {
                    if (this.f149676b.get(downloadTask.getDownloadId()) != null) {
                        this.f149676b.remove(downloadTask.getDownloadId());
                    }
                }
            }
            try {
                this.f149925g.tryDownload(C60162e.m233855a(downloadTask));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            synchronized (this.f149676b) {
                SparseArray clone = this.f149676b.clone();
                this.f149676b.clear();
                if (C60046b.m233014x() != null) {
                    for (int i = 0; i < clone.size(); i++) {
                        if (((DownloadTask) clone.get(clone.keyAt(i))) != null) {
                            try {
                                this.f149925g.tryDownload(C60162e.m233855a(downloadTask));
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60044a
    /* renamed from: a */
    public void mo204655a(Context context, ServiceConnection serviceConnection) {
        try {
            C59990a.m232838b(f149924f, "bindService");
            Intent intent = new Intent(context, IndependentProcessDownloadService.class);
            if (C60161d.m233768a()) {
                intent.putExtra("fix_downloader_db_sigbus", C60148a.m233727c().mo205473a("fix_sigbus_downloader_db"));
            }
            if (serviceConnection != null) {
                context.bindService(intent, serviceConnection, 1);
            }
            context.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        String str = f149924f;
        C59990a.m232838b(str, "onServiceConnected ");
        this.f149925g = IDownloadAidlService.Stub.asInterface(iBinder);
        AbstractC60063m mVar = this.f149926h;
        if (mVar != null) {
            mVar.mo204832a(iBinder);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onServiceConnected aidlService!=null");
        if (this.f149925g != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" pendingTasks.size:");
        sb.append(this.f149676b.size());
        C59990a.m232838b(str, sb.toString());
        if (this.f149925g != null) {
            C60048c.m233017a().mo204687b();
            this.f149677c = true;
            this.f149679e = false;
            int i = this.f149927i;
            if (i != -1) {
                try {
                    this.f149925g.setLogLevel(i);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            synchronized (this.f149676b) {
                if (this.f149925g != null) {
                    SparseArray clone = this.f149676b.clone();
                    this.f149676b.clear();
                    for (int i2 = 0; i2 < clone.size(); i2++) {
                        DownloadTask downloadTask = (DownloadTask) clone.get(clone.keyAt(i2));
                        if (downloadTask != null) {
                            try {
                                this.f149925g.tryDownload(C60162e.m233855a(downloadTask));
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
