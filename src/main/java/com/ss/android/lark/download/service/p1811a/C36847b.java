package com.ss.android.lark.download.service.p1811a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.media.v1.FileState;
import com.bytedance.lark.pb.media.v1.PushDownloadFileResponse;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.AbstractC29575r;
import com.ss.android.lark.biz.core.api.FileDownloadState;
import com.ss.android.lark.download.service.DownloadProgress;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.download.service.a.b */
public class C36847b {

    /* renamed from: a */
    public List<AbstractC36863d> f94705a;

    /* renamed from: b */
    private Map<String, AbstractC29575r.C29576a<AbstractC29575r.C29577b>> f94706b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.download.service.a.b$a */
    public static class C36852a {

        /* renamed from: a */
        public static final C36847b f94712a = new C36847b();
    }

    /* renamed from: a */
    public static C36847b m145432a() {
        return C36852a.f94712a;
    }

    /* renamed from: b */
    public Map<String, AbstractC29575r.C29576a<AbstractC29575r.C29577b>> mo136008b() {
        return this.f94706b;
    }

    private C36847b() {
        this.f94706b = new HashMap();
        this.f94705a = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.download.service.a.b$3 */
    public static /* synthetic */ class C368513 {

        /* renamed from: a */
        static final /* synthetic */ int[] f94711a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.lark.pb.media.v1.FileState[] r0 = com.bytedance.lark.pb.media.v1.FileState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.download.service.p1811a.C36847b.C368513.f94711a = r0
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.DOWNLOAD_WAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36847b.C368513.f94711a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36847b.C368513.f94711a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.DOWNLOAD_FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36847b.C368513.f94711a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.DOWNLOAD_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.download.service.p1811a.C36847b.C368513.f94711a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.DOWNLOAD_CANCEL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.download.service.p1811a.C36847b.C368513.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo136006a(AbstractC36863d dVar) {
        C53246j.m205910a(this.f94705a, dVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.download.service.p1811a.C36847b.C368481 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_DOWNLOAD_FILE, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.download.service.p1811a.C36847b.C368481.C368491 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C36847b.this.mo136007a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private static String m145433a(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        if (i != 0) {
            sb.append(i);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo136007a(byte[] bArr, String str, boolean z, boolean z2) {
        PushDownloadFileResponse pushDownloadFileResponse;
        String str2;
        try {
            pushDownloadFileResponse = PushDownloadFileResponse.ADAPTER.decode(bArr);
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
            pushDownloadFileResponse = null;
        }
        if (pushDownloadFileResponse != null) {
            if (pushDownloadFileResponse.type == File.EntityType.MESSAGE) {
                str2 = m145433a(pushDownloadFileResponse.message_id, pushDownloadFileResponse.key, pushDownloadFileResponse.source_id, pushDownloadFileResponse.source_type.getValue());
            } else {
                str2 = pushDownloadFileResponse.message_id + pushDownloadFileResponse.key;
            }
            int intValue = pushDownloadFileResponse.progress.intValue();
            FileState fileState = pushDownloadFileResponse.state;
            AbstractC29575r.C29576a<AbstractC29575r.C29577b> aVar = this.f94706b.get(str2);
            if (aVar != null) {
                String c = aVar.mo105841c();
                IGetDataCallback<AbstractC29575r.C29577b> b = aVar.mo105840b();
                int i = C368513.f94711a[fileState.ordinal()];
                if (i == 1) {
                    Log.m165389i("DownloadFile", "onPushDownloadFileProgress-wait:" + str2 + "/" + intValue);
                } else if (i == 2) {
                    AbstractC25974h a = aVar.mo105839a();
                    if (a != null) {
                        a.onUpdateProgress(100, intValue);
                    }
                } else if (i == 3) {
                    if (b != null) {
                        this.f94706b.remove(str2);
                        b.onError(new ErrorResult("network is abnormal, download failed"));
                    }
                    Log.m165389i("DownloadFile", "onPushDownloadFileProgress-failed:" + str2 + "/" + intValue);
                } else if (i == 4) {
                    if (b != null) {
                        this.f94706b.remove(str2);
                        b.onSuccess(new AbstractC29575r.C29577b(c));
                    }
                    Log.m165389i("DownloadFile", "onPushDownloadFileProgress-success:" + str2 + "/" + intValue);
                } else if (i == 5) {
                    if (b != null) {
                        this.f94706b.remove(str2);
                        b.onError(new ErrorResult("下载取消"));
                    }
                    Log.m165389i("DownloadFile", "onPushDownloadFileProgress-cancel:" + str2 + "/" + intValue);
                }
            }
            final DownloadProgress downloadProgress = new DownloadProgress();
            downloadProgress.setChannelId(pushDownloadFileResponse.channel_id);
            downloadProgress.setKey(pushDownloadFileResponse.key);
            downloadProgress.setMessageId(pushDownloadFileResponse.message_id);
            downloadProgress.setProgress(pushDownloadFileResponse.progress.intValue());
            downloadProgress.setSourceId(pushDownloadFileResponse.source_id);
            downloadProgress.setState(FileDownloadState.valueOf(pushDownloadFileResponse.state.getValue()));
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.download.service.p1811a.C36847b.RunnableC368502 */

                public void run() {
                    for (AbstractC36863d dVar : C36847b.this.f94705a) {
                        dVar.mo136005a(downloadProgress);
                    }
                }
            });
        }
    }
}
