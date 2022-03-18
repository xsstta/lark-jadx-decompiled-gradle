package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRangeCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.space.drive.v1.DownloadRange;
import com.bytedance.lark.pb.space.drive.v1.PushDownloadRangeCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.sdk.C53248k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.i */
public class C9392i implements C53248k.AbstractC53250a {

    /* renamed from: a */
    public Map<String, Set<C9393a>> f25249a = new ConcurrentHashMap();

    /* renamed from: b */
    private Handler f25250b;

    public C9392i(HandlerThread handlerThread) {
        this.f25250b = new HandlerC9394b(handlerThread.getLooper());
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.i$b */
    private class HandlerC9394b extends Handler {
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    C9392i.this.mo35832a(PushDownloadRangeCallback.ADAPTER.decode((byte[]) message.obj));
                } catch (Throwable th) {
                    C13479a.m54761a("DriveRustRangeDownloadListener", th);
                }
            } else if (i == 2) {
                C9393a aVar = (C9393a) message.obj;
                if (aVar != null) {
                    if (C9392i.this.f25249a.get(aVar.f25251a) == null) {
                        C9392i.this.f25249a.put(aVar.f25251a, Collections.synchronizedSet(new HashSet()));
                    }
                    C9392i.this.f25249a.get(aVar.f25251a).add(aVar);
                }
            } else if (i == 3) {
                C9393a aVar2 = (C9393a) message.obj;
                if (!TextUtils.isEmpty(aVar2.f25251a)) {
                    Set<C9393a> set = C9392i.this.f25249a.get(aVar2.f25251a);
                    if (!CollectionUtils.isEmpty(set)) {
                        Iterator<C9393a> it = set.iterator();
                        while (it.hasNext()) {
                            if (TextUtils.equals(it.next().f25251a, aVar2.f25251a)) {
                                it.remove();
                            }
                        }
                    }
                }
            }
        }

        public HandlerC9394b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public void mo35832a(PushDownloadRangeCallback pushDownloadRangeCallback) {
        C13479a.m54764b("DriveRustRangeDownloadListener", "dispatchProgressCallback start ");
        if (pushDownloadRangeCallback == null) {
            C13479a.m54758a("DriveRustRangeDownloadListener", "dispatchProgressCallback dispatch: data is null ");
            return;
        }
        String str = pushDownloadRangeCallback.key;
        if (TextUtils.isEmpty(str)) {
            C13479a.m54775e("DriveRustRangeDownloadListener", "dispatchProgressCallback dispatch: respone key is null");
            return;
        }
        Set<C9393a> set = this.f25249a.get(str);
        if (!CollectionUtils.isEmpty(set)) {
            try {
                if (pushDownloadRangeCallback.status == PushDownloadRangeCallback.Status.FAILED || pushDownloadRangeCallback.status == PushDownloadRangeCallback.Status.CANCEL) {
                    if (pushDownloadRangeCallback.failed_info != null) {
                        C13479a.m54775e("DriveRustRangeDownloadListener", "dispatchProgressCallback dispatch: has callback,call onFailed key=" + str);
                        for (C9393a aVar : set) {
                            aVar.f25252b.onFailed(pushDownloadRangeCallback.failed_info.key, pushDownloadRangeCallback.failed_info.error_code.intValue());
                        }
                    }
                    if (pushDownloadRangeCallback.status != PushDownloadRangeCallback.Status.SUCCESS || ((pushDownloadRangeCallback.status == PushDownloadRangeCallback.Status.FAILED || pushDownloadRangeCallback.status == PushDownloadRangeCallback.Status.CANCEL) && pushDownloadRangeCallback.failed_info != null)) {
                        C13479a.m54775e("DriveRustRangeDownloadListener", "dispatchProgressCallback dispatch: delete callback key=" + pushDownloadRangeCallback.key);
                        mo35834a(pushDownloadRangeCallback.key, "");
                    }
                    return;
                }
                C13479a.m54775e("DriveRustRangeDownloadListener", "dispatchProgressCallback dispatch: has callback,call updateProgress key=" + str);
                for (C9393a aVar2 : set) {
                    ArrayList arrayList = new ArrayList();
                    if (!CollectionUtils.isEmpty(pushDownloadRangeCallback.downloaded_ranges)) {
                        for (DownloadRange downloadRange : pushDownloadRangeCallback.downloaded_ranges) {
                            arrayList.add(new C9361b.C9362a(downloadRange.start.longValue(), downloadRange.end.longValue()));
                        }
                    }
                    aVar2.f25252b.updateProgress(str, DriveFile.Status.from(pushDownloadRangeCallback.status.getValue()), arrayList);
                }
                if (pushDownloadRangeCallback.status != PushDownloadRangeCallback.Status.SUCCESS) {
                }
                C13479a.m54775e("DriveRustRangeDownloadListener", "dispatchProgressCallback dispatch: delete callback key=" + pushDownloadRangeCallback.key);
                mo35834a(pushDownloadRangeCallback.key, "");
            } catch (Exception e) {
                C13479a.m54759a("DriveRustRangeDownloadListener", "dispatchProgressCallback dispatch: ", e);
            }
        } else {
            C13479a.m54775e("DriveRustRangeDownloadListener", "DriveDownloadStateListener dispatch: no callback");
        }
    }

    /* renamed from: a */
    public void mo35833a(String str, DownloadRangeCallback downloadRangeCallback) {
        C13479a.m54775e("DriveRustRangeDownloadListener", "registerDownloadCallback: uniqueKey=" + str);
        Handler handler = this.f25250b;
        handler.sendMessage(Message.obtain(handler, 2, new C9393a(str, downloadRangeCallback)));
    }

    /* renamed from: a */
    public void mo35834a(String str, String str2) {
        C13479a.m54775e("DriveRustRangeDownloadListener", "unRegisterDownloadCallback, uniqueKey: " + str + ", callbackKey: " + str2);
        Handler handler = this.f25250b;
        handler.sendMessage(Message.obtain(handler, 3, new C9393a(str, null)));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.i$a */
    public class C9393a {

        /* renamed from: a */
        String f25251a;

        /* renamed from: b */
        DownloadRangeCallback f25252b;

        public C9393a(String str, DownloadRangeCallback downloadRangeCallback) {
            this.f25251a = str;
            this.f25252b = downloadRangeCallback;
        }
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        Handler handler = this.f25250b;
        handler.sendMessage(Message.obtain(handler, 1, bArr));
    }
}
