package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.space.drive.v1.PushDownloadCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.sdk.C53248k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.a */
public class C9369a implements C53248k.AbstractC53250a {

    /* renamed from: a */
    public Map<String, Set<C9370a>> f25195a = new ConcurrentHashMap();

    /* renamed from: b */
    private HandlerC9371b f25196b = new HandlerC9371b(CoreThreadPool.getSerialTaskHandler().getLooper());

    /* renamed from: a */
    public void mo35763a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.a$b */
    public final class HandlerC9371b extends Handler {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35769a(C9370a aVar) {
            sendMessage(Message.obtain(this, 2, aVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo35771b(C9370a aVar) {
            sendMessage(Message.obtain(this, 3, aVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35770a(byte[] bArr) {
            sendMessage(Message.obtain(this, 1, bArr));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C9369a.this.mo35764a(C9369a.this.mo35762a((byte[]) message.obj));
            } else if (i == 2) {
                C9370a aVar = (C9370a) message.obj;
                if (aVar != null) {
                    if (C9369a.this.f25195a.get(aVar.f25197a) == null) {
                        C9369a.this.f25195a.put(aVar.f25197a, Collections.synchronizedSet(new HashSet()));
                    }
                    C9369a.this.f25195a.get(aVar.f25197a).add(aVar);
                }
            } else if (i == 3) {
                C9370a aVar2 = (C9370a) message.obj;
                if (TextUtils.isEmpty(aVar2.f25198b)) {
                    C9369a.this.f25195a.remove(aVar2.f25197a);
                    return;
                }
                Set<C9370a> set = C9369a.this.f25195a.get(aVar2.f25197a);
                if (!CollectionUtils.isEmpty(set)) {
                    Iterator<C9370a> it = set.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(it.next().f25198b, aVar2.f25198b)) {
                            it.remove();
                        }
                    }
                }
            } else if (i == 4) {
                C9369a.this.f25195a.clear();
            }
        }

        HandlerC9371b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public PushDownloadCallback mo35762a(byte[] bArr) {
        try {
            return PushDownloadCallback.ADAPTER.decode(bArr);
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener parse: ", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo35764a(PushDownloadCallback pushDownloadCallback) {
        if (pushDownloadCallback == null) {
            C13479a.m54758a("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: data is null ");
            return;
        }
        String str = pushDownloadCallback.key;
        if (TextUtils.isEmpty(str)) {
            C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: respone key is null");
            return;
        }
        Set<C9370a> set = this.f25195a.get(str);
        if (!CollectionUtils.isEmpty(set)) {
            try {
                if (pushDownloadCallback.status == PushDownloadCallback.Status.FAILED || pushDownloadCallback.status == PushDownloadCallback.Status.CANCEL) {
                    if (pushDownloadCallback.failed_info != null) {
                        C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: has callback,call onFailed key=" + str);
                        for (C9370a aVar : set) {
                            aVar.f25199c.onFailed(pushDownloadCallback.failed_info.key, pushDownloadCallback.failed_info.error_code.intValue());
                        }
                    }
                    if (pushDownloadCallback.status != PushDownloadCallback.Status.SUCCESS || ((pushDownloadCallback.status == PushDownloadCallback.Status.FAILED || pushDownloadCallback.status == PushDownloadCallback.Status.CANCEL) && pushDownloadCallback.failed_info != null)) {
                        C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: delete callback key=" + pushDownloadCallback.key);
                        mo35765a(pushDownloadCallback.key, "");
                    }
                    return;
                }
                C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: has callback,call updateProgress key=" + str);
                for (C9370a aVar2 : set) {
                    aVar2.f25199c.updateProgress(C9415n.m38908a(pushDownloadCallback.key, aVar2.f25198b), DriveFile.Status.from(pushDownloadCallback.status.getValue()), Long.parseLong(pushDownloadCallback.bytes_transferred), Long.parseLong(pushDownloadCallback.bytes_total), pushDownloadCallback.data_version);
                }
                if (pushDownloadCallback.status != PushDownloadCallback.Status.SUCCESS) {
                }
                C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: delete callback key=" + pushDownloadCallback.key);
                mo35765a(pushDownloadCallback.key, "");
            } catch (Exception e) {
                C13479a.m54759a("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: ", e);
            }
        } else {
            C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener dispatch: no callback");
        }
    }

    /* renamed from: a */
    public boolean mo35767a(String str) {
        boolean z;
        String a = C9415n.m38907a(str);
        String b = C9415n.m38909b(str);
        Set<C9370a> set = this.f25195a.get(a);
        if (set != null) {
            Iterator<C9370a> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!TextUtils.equals(b, it.next().f25198b)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        C13479a.m54764b("Middleground_Drive_DriveDownloadStateListener", "hasOtherRegisterToSameTask, taskId: " + str + ", res: " + z);
        return z;
    }

    /* renamed from: a */
    public void mo35765a(String str, String str2) {
        C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener unRegisterDownloadCallback, uniqueKey: " + str + ", callbackKey: " + str2);
        this.f25196b.mo35771b(new C9370a(str, str2, null));
    }

    /* renamed from: a */
    public void mo35766a(String str, String str2, DownloadCallback downloadCallback) {
        C13479a.m54775e("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener registerDownloadCallback: ");
        this.f25196b.mo35769a(new C9370a(str, str2, downloadCallback));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.a$a */
    public class C9370a {

        /* renamed from: a */
        String f25197a;

        /* renamed from: b */
        String f25198b;

        /* renamed from: c */
        DownloadCallback f25199c;

        public C9370a(String str, String str2, DownloadCallback downloadCallback) {
            this.f25197a = str;
            this.f25198b = str2;
            this.f25199c = downloadCallback;
        }
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        C13479a.m54772d("Middleground_Drive_DriveDownloadStateListener", "DriveDownloadStateListener.onPush: 21 ");
        this.f25196b.mo35770a(bArr);
    }
}
