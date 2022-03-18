package com.ss.android.lark.aa;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.media.v1.FileState;
import com.bytedance.lark.pb.media.v1.PushUploadFileResponse;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.AbstractC29544ah;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.aa.b */
public class C28481b {

    /* renamed from: a */
    public List<AbstractC29544ah> f71612a;

    /* renamed from: b */
    private Map<String, C28487a> f71613b;

    /* renamed from: com.ss.android.lark.aa.b$b */
    private static class C28488b {

        /* renamed from: a */
        public static final C28481b f71625a = new C28481b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.aa.b$a */
    public class C28487a<T> {

        /* renamed from: a */
        private AbstractC25974h f71623a;

        /* renamed from: b */
        private IGetDataCallback<T> f71624b;

        /* renamed from: a */
        public AbstractC25974h mo101346a() {
            return this.f71623a;
        }

        /* renamed from: b */
        public IGetDataCallback<T> mo101347b() {
            return this.f71624b;
        }
    }

    /* renamed from: a */
    public static final C28481b m104358a() {
        return C28488b.f71625a;
    }

    private C28481b() {
        this.f71613b = new HashMap();
        this.f71612a = new CopyOnWriteArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.aa.b$4 */
    public static /* synthetic */ class C284864 {

        /* renamed from: a */
        static final /* synthetic */ int[] f71622a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.lark.pb.media.v1.FileState[] r0 = com.bytedance.lark.pb.media.v1.FileState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.aa.C28481b.C284864.f71622a = r0
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.UPLOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.aa.C28481b.C284864.f71622a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.UPLOAD_FAIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.aa.C28481b.C284864.f71622a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.UPLOAD_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.aa.C28481b.C284864.f71622a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.media.v1.FileState r1 = com.bytedance.lark.pb.media.v1.FileState.UPLOAD_CANCEL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.aa.C28481b.C284864.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo101342a(AbstractC29544ah ahVar) {
        C53246j.m205910a(this.f71612a, ahVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.aa.C28481b.C284821 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_UPLOAD_FILE, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.aa.C28481b.C284821.C284831 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C28481b.this.mo101343a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo101344b(AbstractC29544ah ahVar) {
        C53246j.m205911b(this.f71612a, ahVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.aa.C28481b.C284842 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_UPLOAD_FILE);
            }
        });
    }

    /* renamed from: a */
    private void m104359a(final String str, final String str2, final boolean z, final int i) {
        CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
            /* class com.ss.android.lark.aa.C28481b.RunnableC284853 */

            public void run() {
                for (AbstractC29544ah ahVar : C28481b.this.f71612a) {
                    ahVar.mo105589a(str, str2, z, i);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo101343a(byte[] bArr, String str, boolean z, boolean z2) {
        PushUploadFileResponse pushUploadFileResponse;
        AbstractC25974h hVar;
        IGetDataCallback iGetDataCallback = null;
        try {
            pushUploadFileResponse = PushUploadFileResponse.ADAPTER.decode(bArr);
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
            pushUploadFileResponse = null;
        }
        if (pushUploadFileResponse != null) {
            String str2 = pushUploadFileResponse.local_key;
            int intValue = pushUploadFileResponse.progress.intValue();
            File.EntityType entityType = pushUploadFileResponse.type;
            FileState fileState = pushUploadFileResponse.state;
            String str3 = pushUploadFileResponse.channel_id;
            C28487a aVar = this.f71613b.get(str2);
            if (aVar != null) {
                iGetDataCallback = aVar.mo101347b();
                hVar = aVar.mo101346a();
            } else {
                hVar = null;
            }
            int i = C284864.f71622a[fileState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (entityType == File.EntityType.MESSAGE) {
                                m104359a(str2, str3, true, intValue);
                            } else if (entityType == File.EntityType.EMAIL && iGetDataCallback != null) {
                                this.f71613b.remove(aVar);
                                iGetDataCallback.onError(new ErrorResult("UPLOAD_CANCEL"));
                            }
                        }
                    } else if (entityType == File.EntityType.EMAIL && iGetDataCallback != null) {
                        this.f71613b.remove(aVar);
                        iGetDataCallback.onSuccess(pushUploadFileResponse.key);
                    }
                } else if (entityType == File.EntityType.MESSAGE) {
                    m104359a(str2, str3, true, intValue);
                } else if (entityType == File.EntityType.EMAIL && iGetDataCallback != null) {
                    this.f71613b.remove(aVar);
                    iGetDataCallback.onError(new ErrorResult("UPLOAD_FAIL"));
                }
            } else if (entityType == File.EntityType.MESSAGE) {
                m104359a(str2, str3, false, intValue);
            } else if (entityType == File.EntityType.EMAIL && hVar != null) {
                hVar.onUpdateProgress(100, intValue);
            }
        }
    }
}
