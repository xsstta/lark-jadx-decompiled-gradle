package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.space.drive.v1.PushUploadCallback;
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
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.l */
public class C9411l implements C53248k.AbstractC53250a {

    /* renamed from: a */
    public Map<String, Set<C9412a>> f25302a = new ConcurrentHashMap();

    /* renamed from: b */
    C9372b f25303b = new C9372b();

    /* renamed from: c */
    private HandlerC9413b f25304c = new HandlerC9413b(CoreThreadPool.getSerialTaskHandler().getLooper());

    /* renamed from: a */
    public void mo35867a() {
        C9372b bVar = this.f25303b;
        if (bVar != null) {
            bVar.mo35773a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.l$b */
    public final class HandlerC9413b extends Handler {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35873a(UploadCallback uploadCallback) {
            sendMessage(Message.obtain(this, 5, uploadCallback));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo35876b(C9412a aVar) {
            sendMessage(Message.obtain(this, 3, aVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35874a(C9412a aVar) {
            sendMessage(Message.obtain(this, 2, aVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35875a(byte[] bArr) {
            sendMessage(Message.obtain(this, 1, bArr));
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    byte[] bArr = (byte[]) message.obj;
                    if (C9411l.this.f25303b != null) {
                        C9411l.this.f25303b.mo35776a(bArr);
                    }
                    C9411l.this.mo35869a(C9411l.this.mo35866a(bArr));
                    return;
                case 2:
                    C9412a aVar = (C9412a) message.obj;
                    if (aVar != null) {
                        if (C9411l.this.f25302a.get(aVar.f25305a) == null) {
                            C9411l.this.f25302a.put(aVar.f25305a, Collections.synchronizedSet(new HashSet()));
                        }
                        C9411l.this.f25302a.get(aVar.f25305a).add(aVar);
                        return;
                    }
                    return;
                case 3:
                    C9412a aVar2 = (C9412a) message.obj;
                    if (TextUtils.isEmpty(aVar2.f25306b)) {
                        C9411l.this.f25302a.remove(aVar2.f25305a);
                        return;
                    }
                    Set<C9412a> set = C9411l.this.f25302a.get(aVar2.f25305a);
                    if (!CollectionUtils.isEmpty(set)) {
                        Iterator<C9412a> it = set.iterator();
                        while (it.hasNext()) {
                            if (TextUtils.equals(it.next().f25306b, aVar2.f25306b)) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                case 4:
                    C9411l.this.f25302a.clear();
                    return;
                case 5:
                    UploadCallback uploadCallback = (UploadCallback) message.obj;
                    if (uploadCallback != null && C9411l.this.f25303b != null) {
                        C9411l.this.f25303b.mo35774a(uploadCallback);
                        return;
                    }
                    return;
                case 6:
                    UploadCallback uploadCallback2 = (UploadCallback) message.obj;
                    if (C9411l.this.f25303b != null) {
                        C9411l.this.f25303b.mo35778b(uploadCallback2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        HandlerC9413b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public void mo35868a(UploadCallback uploadCallback) {
        C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener setGlobalUploadStateListener: ");
        this.f25304c.mo35873a(uploadCallback);
    }

    /* renamed from: a */
    public PushUploadCallback mo35866a(byte[] bArr) {
        try {
            return PushUploadCallback.ADAPTER.decode(bArr);
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveUploadStateListener", "parse: ", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo35872a(String str) {
        boolean z;
        Set<C9412a> set;
        String a = C9415n.m38907a(str);
        String b = C9415n.m38909b(str);
        if (!TextUtils.isEmpty(b) && (set = this.f25302a.get(a)) != null) {
            Iterator<C9412a> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!TextUtils.equals(b, it.next().f25306b)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "hasOtherRegisterToSameTask, taskId: " + str + ", res: " + z);
            return z;
        }
        z = false;
        C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "hasOtherRegisterToSameTask, taskId: " + str + ", res: " + z);
        return z;
    }

    /* renamed from: a */
    public void mo35869a(PushUploadCallback pushUploadCallback) {
        String str;
        if (pushUploadCallback == null) {
            C13479a.m54758a("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener dispatch: data is null ");
            return;
        }
        String str2 = pushUploadCallback.key;
        if (TextUtils.isEmpty(str2)) {
            C13479a.m54775e("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener dispatch: response key is null");
            return;
        }
        Set<C9412a> set = this.f25302a.get(str2);
        if (!CollectionUtils.isEmpty(set)) {
            try {
                C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener dispatch: has callback,call updateProgress key=" + str2);
                if (pushUploadCallback.failed_info != null) {
                    C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener dispatch: has callback,call onFailed key=" + str2);
                    for (C9412a aVar : set) {
                        aVar.f25307c.onFailed(C9415n.m38908a(pushUploadCallback.failed_info.key, aVar.f25306b), pushUploadCallback.failed_info.error_code.intValue(), pushUploadCallback.mount_node_point, Long.parseLong(pushUploadCallback.bytes_total));
                    }
                } else {
                    for (C9412a aVar2 : set) {
                        String a = C9415n.m38908a(pushUploadCallback.key, aVar2.f25306b);
                        if (pushUploadCallback.extra_info != null) {
                            str = pushUploadCallback.extra_info.node_token;
                        } else {
                            str = "";
                        }
                        aVar2.f25307c.updateProgress(a, DriveFile.Status.from(pushUploadCallback.status.getValue()), Long.parseLong(pushUploadCallback.bytes_transferred), Long.parseLong(pushUploadCallback.bytes_total), pushUploadCallback.file_token, C9376e.m38736a(pushUploadCallback.file_path, pushUploadCallback.uri_str), pushUploadCallback.mount_node_point, pushUploadCallback.data_version, pushUploadCallback.mount_point, str);
                    }
                }
            } catch (Exception e) {
                C13479a.m54759a("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener dispatch: ", e);
            }
            if (pushUploadCallback.status == PushUploadCallback.Status.SUCCESS || ((pushUploadCallback.status == PushUploadCallback.Status.FAILED || pushUploadCallback.status == PushUploadCallback.Status.CANCEL) && pushUploadCallback.failed_info != null)) {
                C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener dispatch: delete callback ,");
                mo35871a(pushUploadCallback.key, "");
                return;
            }
            return;
        }
        C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener dispatch: no callback");
    }

    /* renamed from: a */
    public void mo35870a(String str, UploadCallback uploadCallback) {
        C13479a.m54764b("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener registerUploadCallback: ");
        this.f25304c.mo35874a(new C9412a(str, uploadCallback));
    }

    /* renamed from: a */
    public void mo35871a(String str, String str2) {
        this.f25304c.mo35876b(new C9412a(str, str2, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.l$a */
    public class C9412a {

        /* renamed from: a */
        String f25305a;

        /* renamed from: b */
        String f25306b;

        /* renamed from: c */
        UploadCallback f25307c;

        public C9412a(String str, UploadCallback uploadCallback) {
            String str2;
            this.f25305a = str;
            if (uploadCallback == null) {
                str2 = "";
            } else {
                str2 = String.valueOf(uploadCallback.hashCode());
            }
            this.f25306b = str2;
            this.f25307c = uploadCallback;
        }

        public C9412a(String str, String str2, UploadCallback uploadCallback) {
            this.f25305a = str;
            this.f25306b = str2;
            this.f25307c = uploadCallback;
        }
    }

    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
        C13479a.m54772d("Middleground_Drive_DriveUploadStateListener", "DriveUploadStateListener.onPush: 21 ");
        this.f25304c.mo35875a(bArr);
    }
}
