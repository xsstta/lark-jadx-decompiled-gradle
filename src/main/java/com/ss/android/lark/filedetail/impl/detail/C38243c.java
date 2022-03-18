package com.ss.android.lark.filedetail.impl.detail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.drivesdk.plugin.model.menu.OpenExternalMenu;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.impl.DownloadFileUtils;
import com.ss.android.lark.filedetail.impl.FileOpenDialogUtils;
import com.ss.android.lark.filedetail.impl.detail.C38243c;
import com.ss.android.lark.filedetail.impl.open.C38279a;
import com.ss.android.lark.filedetail.impl.open.C38303c;
import com.ss.android.lark.filedetail.impl.open.OpenFileParams;
import com.ss.android.lark.filedetail.monitor.FileDownloadAppreciableKit;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.filedetail.p1886b.C38210b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.utils.C57881t;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ss.android.lark.filedetail.impl.detail.c */
public class C38243c {

    /* renamed from: a */
    WeakReference<AbstractC38253d> f98071a;

    /* renamed from: b */
    CallbackManager f98072b = new CallbackManager();

    /* renamed from: c */
    AbstractC38197a f98073c;

    /* renamed from: d */
    AbstractC38197a.AbstractC38200c f98074d;

    /* renamed from: e */
    AbstractC38197a.AbstractC38199b f98075e;

    /* renamed from: f */
    AbstractC38197a.AbstractC38198a f98076f;

    /* renamed from: g */
    public String f98077g;

    /* renamed from: h */
    public String f98078h;

    /* renamed from: i */
    public FileDownloadState f98079i;

    /* renamed from: j */
    public Context f98080j;

    /* renamed from: k */
    public String f98081k;

    /* renamed from: l */
    public boolean f98082l;

    /* renamed from: m */
    public final boolean f98083m;

    /* renamed from: n */
    private String f98084n;

    /* renamed from: o */
    private String f98085o;

    /* renamed from: p */
    private Message.SourceType f98086p;

    /* renamed from: q */
    private File f98087q;

    /* renamed from: r */
    private String f98088r;

    /* renamed from: s */
    private OpenFileParams f98089s;

    /* renamed from: a */
    public void mo139837a(AbstractC38253d dVar) {
        this.f98071a = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    public boolean mo139840a(String str) {
        return this.f98076f.mo139597a(str, true);
    }

    /* renamed from: a */
    public void mo139838a(String str, String str2, File file) {
        FileDetailController.f98037a.mo139809a();
        UICallbackExecutor.post(new Runnable(file, str2, str) {
            /* class com.ss.android.lark.filedetail.impl.detail.$$Lambda$c$u5_Xu0iwNMkAeZlowLuwGWWKQ */
            public final /* synthetic */ File f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C38243c.this.m150388a((C38243c) this.f$1, (File) this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo139839a(boolean z) {
        File file = this.f98087q;
        if (file != null) {
            mo139832a(this.f98080j, file, this.f98081k, z ? this.f98078h : this.f98077g);
        }
    }

    /* renamed from: a */
    public void mo139836a(FileDownloadState fileDownloadState) {
        this.f98079i = fileDownloadState;
        m150390d();
    }

    /* renamed from: a */
    public void mo139830a() {
        this.f98072b.cancelCallbacks();
    }

    /* renamed from: b */
    public AbstractC38253d mo139842b() {
        WeakReference<AbstractC38253d> weakReference = this.f98071a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: d */
    private void m150390d() {
        String str = this.f98088r;
        if (str != null) {
            int i = C382452.f98095b[this.f98079i.ordinal()];
            if (i == 1) {
                FileDownloadAppreciableKit.m150170a(str);
            } else if (i == 2) {
                FileDownloadAppreciableKit.m150174b(this.f98083m);
            } else if (i == 3) {
                FileDownloadAppreciableKit.m150173b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.filedetail.impl.detail.c$2 */
    public static /* synthetic */ class C382452 {

        /* renamed from: a */
        static final /* synthetic */ int[] f98094a;

        /* renamed from: b */
        static final /* synthetic */ int[] f98095b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.ss.android.lark.filedetail.impl.detail.FileDownloadState[] r0 = com.ss.android.lark.filedetail.impl.detail.FileDownloadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.filedetail.impl.detail.C38243c.C382452.f98095b = r0
                r1 = 1
                com.ss.android.lark.filedetail.impl.detail.FileDownloadState r2 = com.ss.android.lark.filedetail.impl.detail.FileDownloadState.PAUSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.filedetail.impl.detail.C38243c.C382452.f98095b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.filedetail.impl.detail.FileDownloadState r3 = com.ss.android.lark.filedetail.impl.detail.FileDownloadState.RECALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.ss.android.lark.filedetail.impl.detail.C38243c.C382452.f98095b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.filedetail.impl.detail.FileDownloadState r3 = com.ss.android.lark.filedetail.impl.detail.FileDownloadState.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.ss.android.lark.chat.entity.message.content.FileState[] r2 = com.ss.android.lark.chat.entity.message.content.FileState.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.ss.android.lark.filedetail.impl.detail.C38243c.C382452.f98094a = r2
                com.ss.android.lark.chat.entity.message.content.FileState r3 = com.ss.android.lark.chat.entity.message.content.FileState.DONE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.lark.filedetail.impl.detail.C38243c.C382452.f98094a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.android.lark.chat.entity.message.content.FileState r2 = com.ss.android.lark.chat.entity.message.content.FileState.DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.filedetail.impl.detail.C38243c.C382452.<clinit>():void");
        }
    }

    /* renamed from: c */
    public void mo139845c() {
        if (!TextUtils.isEmpty(this.f98084n)) {
            Log.m165389i("FileTransmissionPresent", "stop download,msgId:" + this.f98084n);
            if (TextUtils.isEmpty(this.f98078h)) {
                this.f98074d.mo139612a(this.f98084n, this.f98077g, this.f98085o, this.f98086p.getNumber());
            } else {
                this.f98074d.mo139608a(this.f98084n, this.f98078h);
            }
        }
    }

    /* renamed from: b */
    public int mo139841b(String str) {
        return this.f98074d.mo139605a(str);
    }

    /* renamed from: c */
    public static long m150389c(String str) {
        try {
            File file = new File(str);
            if (file.isFile()) {
                return file.length();
            }
            return 0;
        } catch (Exception e) {
            Log.m165384e("FileTransmissionPresent", "getFileLength error", e);
            return 0;
        }
    }

    /* renamed from: a */
    public void mo139831a(final int i) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38243c.RunnableC382529 */

            public void run() {
                AbstractC38253d dVar;
                if (C38243c.this.f98071a != null && (dVar = C38243c.this.f98071a.get()) != null) {
                    dVar.mo139748a(i, 100);
                }
            }
        });
    }

    public C38243c(boolean z) {
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        this.f98073c = a;
        this.f98074d = a.getDownloadDependency();
        this.f98075e = this.f98073c.getChatDependency();
        this.f98076f = this.f98073c.getAuditDependency();
        this.f98079i = FileDownloadState.NORMAL;
        this.f98082l = false;
        this.f98083m = z;
    }

    /* renamed from: a */
    private OpenExternalMenu m150386a(File file, String str) {
        OpenExternalMenu openExternalMenu = new OpenExternalMenu((BinderMenuAction) null);
        openExternalMenu.mo20435a(new FileTransmissionPresenter$2(this, file, str));
        return openExternalMenu;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m150388a(File file, String str, String str2) {
        ArrayList<BaseMoreMenuAction> arrayList = new ArrayList<>();
        arrayList.add(m150386a(file, str));
        Fragment a = FileDetailController.f98037a.mo139808a(str2, str, file.getAbsolutePath(), arrayList);
        if (a == null) {
            Log.m165383e("FileTransmissionPresent", "Failed to open secret file, fragment is null");
        } else {
            mo139842b().mo139750a(a, file.getAbsolutePath());
        }
    }

    /* renamed from: a */
    public void mo139833a(Message message, FileContent fileContent, Context context) {
        mo139834a(message, fileContent, context, (OpenFileParams) null);
    }

    /* renamed from: b */
    public void mo139843b(final Message message, final FileContent fileContent, final Context context, final OpenFileParams openFileParams) {
        C51327f.f127826a = false;
        Log.m165389i("FileTransmissionPresent", "apply permission");
        C51327f.m199079a((Activity) context, new AbstractC51324c() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38243c.C382507 */

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: a */
            public void mo49823a() {
                C38243c.this.mo139834a(message, fileContent, context, openFileParams);
            }

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: b */
            public void mo49824b() {
                Log.m165389i("FileTransmissionPresent", "apply permission failed");
                C38243c.this.mo139833a(message, fileContent, context);
            }
        });
    }

    /* renamed from: b */
    public void mo139844b(final FileContent fileContent, final String str, final Context context, final OpenFileParams openFileParams) {
        C51327f.f127826a = false;
        C51327f.m199079a((Activity) context, new AbstractC51324c() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38243c.C382518 */

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: a */
            public void mo49823a() {
                C38243c.this.mo139835a(fileContent, str, context, openFileParams);
            }

            @Override // com.ss.android.lark.permission.AbstractC51324c
            /* renamed from: b */
            public void mo49824b() {
                C38243c.this.mo139835a(fileContent, str, context, openFileParams);
            }
        });
    }

    /* renamed from: a */
    private void m150387a(final Message message, final FileContent fileContent, final boolean z, String str) {
        FileContent fileContent2;
        fileContent.setFileState(FileState.DOWNLOADING);
        fileContent.setProgress(0);
        mo139831a(0);
        final String a = FileDownloadAppreciableKit.m150169a(z);
        this.f98088r = a;
        IGetDataCallback<String> iGetDataCallback = (IGetDataCallback) this.f98072b.wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38243c.C382463 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m150407a(DialogInterface dialogInterface) {
                C38243c.this.mo139842b().mo139762f();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m150410b(DialogInterface dialogInterface) {
                C38243c.this.mo139842b().mo139762f();
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m150411c(DialogInterface dialogInterface) {
                C38243c.this.mo139842b().mo139762f();
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                String a = C38303c.m150711a(str);
                FileDownloadAppreciableKit.m150171a(a, C38243c.m150389c(str));
                UICallbackExecutor.execute(new Runnable(a, fileContent) {
                    /* class com.ss.android.lark.filedetail.impl.detail.$$Lambda$c$3$DjDyVHNzSZvHV3kta988p6ChdU */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ FileContent f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C38243c.C382463.this.m150409a(this.f$1, this.f$2);
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165386e("FileTransmissionPresent", errorResult);
                FileDownloadAppreciableKit.m150172a(z, ErrorType.SDK, errorResult.getErrorCode());
                UICallbackExecutor.execute(new Runnable(fileContent, message, errorResult) {
                    /* class com.ss.android.lark.filedetail.impl.detail.$$Lambda$c$3$ukLrNTGbeaa83oslBod68nYHJWo */
                    public final /* synthetic */ FileContent f$1;
                    public final /* synthetic */ Message f$2;
                    public final /* synthetic */ ErrorResult f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C38243c.C382463.this.m150408a(this.f$1, this.f$2, this.f$3);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m150409a(String str, FileContent fileContent) {
                if (TextUtils.isEmpty(str)) {
                    fileContent.setFileState(FileState.DOWNLOAD);
                    C38243c.this.mo139831a(0);
                    Log.m165389i("FileTransmissionPresent", "download success ,filePath is empty");
                } else if (new File(str).exists()) {
                    fileContent.setProgress(100);
                    fileContent.setFilePath(str);
                    fileContent.setFileState(FileState.DONE);
                    C38243c.this.mo139831a(100);
                    Log.m165389i("FileTransmissionPresent", "download success");
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m150408a(FileContent fileContent, Message message, ErrorResult errorResult) {
                fileContent.setFileState(FileState.DOWNLOAD);
                if (!(C38243c.this.f98079i == FileDownloadState.STOP || C38243c.this.f98079i == FileDownloadState.PAUSE)) {
                    C38243c.this.mo139842b().mo139751a(message);
                }
                if (errorResult.getErrorCode() == 410 || errorResult.getErrorCode() == 10006) {
                    message.setSourceFileDelete(true);
                    C38243c.this.mo139842b().mo139761e();
                    C38210b.m150165a(message);
                } else if (errorResult.getErrorCode() == 5601) {
                    FileOpenDialogUtils.m150339a(C38243c.this.f98080j, false, new DialogInterface.OnDismissListener() {
                        /* class com.ss.android.lark.filedetail.impl.detail.$$Lambda$c$3$KRg39Gw1vqzKB0Vg9IPu1OZDNOw */

                        public final void onDismiss(DialogInterface dialogInterface) {
                            C38243c.C382463.this.m150411c(dialogInterface);
                        }
                    });
                } else if (errorResult.getErrorCode() == 5602) {
                    FileOpenDialogUtils.m150339a(C38243c.this.f98080j, true, new DialogInterface.OnDismissListener() {
                        /* class com.ss.android.lark.filedetail.impl.detail.$$Lambda$c$3$LcIXlI0DnuYfHYkoqLsKq5rQJ0Q */

                        public final void onDismiss(DialogInterface dialogInterface) {
                            C38243c.C382463.this.m150410b(dialogInterface);
                        }
                    });
                } else if (errorResult.getErrorCode() == 321000) {
                    C38243c.this.f98076f.mo139595a(C38243c.this.f98080j, errorResult.getDisplayMsg(C38243c.this.f98076f.mo139593a(R.string.Lark_Audit_BlockedActionDownloadFile)), new DialogInterface.OnDismissListener() {
                        /* class com.ss.android.lark.filedetail.impl.detail.$$Lambda$c$3$Vm8NdJrDhla1591P1xyouApeYYA */

                        public final void onDismiss(DialogInterface dialogInterface) {
                            C38243c.C382463.this.m150407a((C38243c.C382463) dialogInterface);
                        }
                    });
                }
            }
        });
        C382474 r0 = new AbstractC25974h() {
            /* class com.ss.android.lark.filedetail.impl.detail.C38243c.C382474 */

            @Override // com.larksuite.framework.callback.AbstractC25974h
            public void onUpdateProgress(long j, int i) {
                if (!C38243c.this.f98082l && !C38243c.this.f98083m) {
                    C38243c.this.f98076f.mo139598b(C38243c.this.f98077g);
                    C38243c.this.f98082l = true;
                }
                if (j > 0) {
                    int i2 = (int) ((((long) i) * 100) / j);
                    fileContent.setProgress(i2);
                    C38243c.this.mo139831a(i2);
                }
            }
        };
        if (message.getType() == Message.Type.FILE) {
            fileContent2 = (FileContent) message.getContent();
        } else {
            fileContent2 = fileContent;
        }
        String a2 = DownloadFileUtils.m150309a(this.f98080j, fileContent2.getName());
        if (z) {
            a2 = null;
        }
        this.f98074d.mo139606a(this.f98080j, message.getId(), message.getSourceId(), str, message.getSourceType().getNumber(), this.f98089s.getDownloadFileScene(), fileContent2.getKey(), a2, iGetDataCallback, r0);
    }

    /* renamed from: a */
    public void mo139832a(Context context, File file, String str, String str2) {
        boolean z;
        if (file.getName().endsWith(".apk")) {
            if (C26311p.m95275a(context) || RomUtils.m94953h()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f98080j = context;
                this.f98087q = file;
                this.f98081k = str;
                if (Build.VERSION.SDK_INT >= 26) {
                    C26311p.m95267a(context, 1);
                    return;
                }
                return;
            }
        }
        C38303c.m150712a(context, file, str, str2);
    }

    /* renamed from: a */
    public void mo139834a(Message message, final FileContent fileContent, final Context context, final OpenFileParams openFileParams) {
        String str;
        this.f98080j = context;
        this.f98084n = message.getId();
        this.f98085o = message.getSourceId();
        this.f98086p = message.getSourceType();
        this.f98077g = fileContent.getKey();
        if (openFileParams == null) {
            openFileParams = OpenFileParams.Companion.mo140044a().mo140035a(fileContent).mo140036a(this.f98084n).mo140037a(false).mo140038a();
        }
        this.f98089s = openFileParams;
        int i = C382452.f98094a[fileContent.getFileState().ordinal()];
        if (i == 1) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.filedetail.impl.detail.C38243c.RunnableC382441 */

                public void run() {
                    File file;
                    String d = C57881t.m224631d(fileContent.getFilePath(), fileContent.getName());
                    String a = C38303c.m150711a(d);
                    if (TextUtils.isEmpty(a)) {
                        file = new File(d);
                    } else {
                        fileContent.setFilePath(a);
                        file = new File(a);
                    }
                    if (C38279a.m150665a().mo140045a(context, fileContent, openFileParams)) {
                        return;
                    }
                    if (openFileParams.isSecret()) {
                        C38243c.this.mo139838a(fileContent.getName(), C38243c.this.f98081k, file);
                    } else {
                        C38243c.this.mo139832a(context, file, fileContent.getMime(), C38243c.this.f98077g);
                    }
                }
            });
        } else if (i == 2) {
            if (TextUtils.isEmpty(openFileParams.getMergeMsgChatId())) {
                str = message.getChatId();
            } else {
                str = openFileParams.getMergeMsgChatId();
            }
            m150387a(message, fileContent, openFileParams.isSecret(), str);
        }
    }

    /* renamed from: a */
    public void mo139835a(final FileContent fileContent, String str, Context context, OpenFileParams openFileParams) {
        this.f98084n = str;
        this.f98078h = fileContent.getKey();
        mo139845c();
        int i = C382452.f98094a[fileContent.getFileState().ordinal()];
        if (i == 1) {
            File file = new File(C57881t.m224631d(fileContent.getFilePath(), fileContent.getName()));
            if (C26311p.m95292l(C26311p.m95279b(file))) {
                WeakReference<AbstractC38253d> weakReference = this.f98071a;
                if (weakReference == null || weakReference.get() == null || !this.f98071a.get().mo139756a(Collections.singletonList(file.getPath()))) {
                    mo139832a(context, file, fileContent.getMime(), this.f98078h);
                }
            } else if (!C38279a.m150665a().mo140045a(context, fileContent, openFileParams)) {
                mo139832a(context, file, fileContent.getMime(), this.f98078h);
            }
        } else if (i == 2) {
            if (!this.f98083m) {
                this.f98076f.mo139598b(this.f98078h);
            }
            fileContent.setFileState(FileState.DOWNLOADING);
            fileContent.setProgress(0);
            mo139831a(0);
            UIGetDataCallback wrapAndAddGetDataCallback = this.f98072b.wrapAndAddGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.filedetail.impl.detail.C38243c.C382485 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        fileContent.setFileState(FileState.DOWNLOAD);
                        C38243c.this.mo139831a(0);
                    } else if (new File(str).exists()) {
                        fileContent.setProgress(100);
                        fileContent.setFileState(FileState.DONE);
                        fileContent.setFilePath(str);
                        C38243c.this.mo139831a(100);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165378d(errorResult.toString());
                    fileContent.setFileState(FileState.DOWNLOAD);
                    if (C38243c.this.f98079i != FileDownloadState.STOP && C38243c.this.f98079i != FileDownloadState.PAUSE) {
                        C38243c.this.mo139842b().mo139751a((Message) null);
                    }
                }
            });
            C382496 r7 = new AbstractC25974h() {
                /* class com.ss.android.lark.filedetail.impl.detail.C38243c.C382496 */

                @Override // com.larksuite.framework.callback.AbstractC25974h
                public void onUpdateProgress(long j, int i) {
                    if (j > 0) {
                        int i2 = (int) ((((long) i) * 100) / j);
                        fileContent.setProgress(i2);
                        C38243c.this.mo139831a(i2);
                    }
                }
            };
            this.f98074d.mo139607a(context, str, fileContent.getKey(), MediaStoreUtil.m94896b(context, fileContent.getName()).getAbsolutePath(), wrapAndAddGetDataCallback, r7);
        }
    }
}
