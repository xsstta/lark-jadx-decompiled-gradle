package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.log.C13479a;
import com.bytedance.lark.pb.space.drive.v1.PushUploadCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.b */
public class C9372b {

    /* renamed from: a */
    public Set<UploadCallback> f25202a = new HashSet();

    /* renamed from: b */
    private HandlerC9373a f25203b = new HandlerC9373a(CoreThreadPool.getSerialTaskHandler().getLooper());

    /* renamed from: a */
    public void mo35773a() {
    }

    /* renamed from: a */
    public void mo35774a(UploadCallback uploadCallback) {
        this.f25203b.mo35779a(uploadCallback);
    }

    /* renamed from: b */
    public void mo35778b(UploadCallback uploadCallback) {
        this.f25203b.mo35781b(uploadCallback);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.b$a */
    protected final class HandlerC9373a extends Handler {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35779a(UploadCallback uploadCallback) {
            sendMessage(Message.obtain(this, 2, uploadCallback));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo35781b(UploadCallback uploadCallback) {
            sendMessage(Message.obtain(this, 3, uploadCallback));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35780a(byte[] bArr) {
            sendMessage(Message.obtain(this, 1, bArr));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C9372b.this.mo35775a(C9372b.this.mo35777b((byte[]) message.obj));
            } else if (i == 2) {
                UploadCallback uploadCallback = (UploadCallback) message.obj;
                if (uploadCallback != null) {
                    C9372b.this.f25202a.add(uploadCallback);
                }
            } else if (i == 3) {
                C9372b.this.f25202a.remove((UploadCallback) message.obj);
            } else if (i == 4) {
                C9372b.this.f25202a.clear();
            }
        }

        HandlerC9373a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public void mo35776a(byte[] bArr) {
        C13479a.m54772d("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener.onPush: 19 ");
        this.f25203b.mo35780a(bArr);
    }

    /* renamed from: b */
    public PushUploadCallback mo35777b(byte[] bArr) {
        try {
            PushUploadCallback decode = PushUploadCallback.ADAPTER.decode(bArr);
            C13479a.m54772d("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener parse: PushUploadCallback=" + decode.toString());
            return decode;
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener parse: ", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo35775a(PushUploadCallback pushUploadCallback) {
        String str;
        if (pushUploadCallback == null) {
            C13479a.m54772d("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener.dispatch: data is null ");
            return;
        }
        try {
            Set<UploadCallback> set = this.f25202a;
            if (set == null || set.size() <= 0) {
                C13479a.m54772d("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener dispatch: no callback");
                return;
            }
            for (UploadCallback uploadCallback : this.f25202a) {
                C13479a.m54772d("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener dispatch: has callback,call updateProgress ");
                if (pushUploadCallback.failed_info != null) {
                    C13479a.m54772d("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener dispatch: has callback,call onFailed ");
                    uploadCallback.onFailed(pushUploadCallback.failed_info.key, pushUploadCallback.failed_info.error_code.intValue(), pushUploadCallback.mount_node_point, Long.parseLong(pushUploadCallback.bytes_total));
                } else {
                    if (pushUploadCallback.extra_info != null) {
                        str = pushUploadCallback.extra_info.node_token;
                    } else {
                        str = "";
                    }
                    uploadCallback.updateProgress(pushUploadCallback.key, DriveFile.Status.from(pushUploadCallback.status.getValue()), Long.parseLong(pushUploadCallback.bytes_transferred), Long.parseLong(pushUploadCallback.bytes_total), pushUploadCallback.file_token, C9376e.m38736a(pushUploadCallback.file_path, pushUploadCallback.uri_str), pushUploadCallback.mount_node_point, pushUploadCallback.data_version, pushUploadCallback.mount_point, str);
                }
            }
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveGlobalUploadStateListener", "DriveGlobalUploadStateListener dispatch: ", e);
        }
    }
}
