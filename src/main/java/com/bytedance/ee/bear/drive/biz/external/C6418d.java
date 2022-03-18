package com.bytedance.ee.bear.drive.biz.external;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.drive.biz.external.AbstractC6412a;
import com.bytedance.ee.bear.drive.biz.external.C6418d;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6925b;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.AbstractC7006d;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.C7090c;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.loader.p352a.p353a.C6997b;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.ConfirmStorageDialog;
import com.bytedance.ee.bear.widgets.dialog.progressdialog.BearUDProgressDialogController;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p714p.C13719a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.utils.C57805b;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.external.d */
public class C6418d implements AbstractC7006d {

    /* renamed from: a */
    public Context f17729a;

    /* renamed from: b */
    public Dialog f17730b;

    /* renamed from: c */
    public BearUDProgressDialogController f17731c;

    /* renamed from: d */
    public Dialog f17732d;

    /* renamed from: e */
    public C6997b f17733e;

    /* renamed from: f */
    public AbstractC7095c f17734f;

    /* renamed from: g */
    public C7130c f17735g;

    /* renamed from: h */
    public AbstractC6422a f17736h;

    /* renamed from: i */
    public C7207a f17737i;

    /* renamed from: j */
    private C10917c f17738j;

    /* renamed from: k */
    private Dialog f17739k;

    /* renamed from: l */
    private ConfirmStorageDialog f17740l;

    /* renamed from: m */
    private AbstractC6927d f17741m;

    /* renamed from: n */
    private C6880a f17742n;

    /* renamed from: o */
    private C7128a f17743o;

    /* renamed from: p */
    private C68289a f17744p;

    /* renamed from: q */
    private ConnectionService f17745q;

    /* renamed from: r */
    private AbstractC6412a f17746r;

    /* renamed from: com.bytedance.ee.bear.drive.biz.external.d$a */
    public interface AbstractC6422a {
        /* renamed from: a */
        void mo25739a();

        /* renamed from: a */
        void mo25740a(AbstractC6946a aVar);

        /* renamed from: b */
        void mo25741b();

        /* renamed from: c */
        void mo25742c();
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
    /* renamed from: a */
    public C10917c mo25743a() {
        return this.f17738j;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
    /* renamed from: c */
    public C6880a mo25752c() {
        return this.f17742n;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
    /* renamed from: d */
    public AbstractC7095c mo25753d() {
        return this.f17734f;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
    /* renamed from: e */
    public C7128a mo25754e() {
        return this.f17743o;
    }

    /* renamed from: a */
    public void mo25748a(AbstractC6422a aVar) {
        this.f17736h = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
    /* renamed from: a */
    public String mo25744a(String str, String str2) {
        return this.f17741m.mo27240a(new C7086a(new C7086a.C7087a("", 0, null, 0, "", false, str, "", "", 0, "", str2, "", 0, 0)));
    }

    /* renamed from: a */
    public void mo25745a(long j, String str, String str2, String str3, C6414b bVar) {
        m25771a(new Runnable(j, str, str2, str3, bVar) {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$cvTWgzH87TUQx8ETfMo59pqq_RY */
            public final /* synthetic */ long f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ C6414b f$5;

            {
                this.f$1 = r2;
                this.f$2 = r4;
                this.f$3 = r5;
                this.f$4 = r6;
                this.f$5 = r7;
            }

            public final void run() {
                C6418d.this.m25777b(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25773a(String str, long j, String str2, String str3, C6414b bVar, Pair pair) throws Exception {
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        boolean booleanValue2 = ((Boolean) pair.second).booleanValue();
        C13479a.m54764b("DRIVE_OpenExternalHelper", "openFileWithMobileNetWorkAndFileStorageConfirm should block ... :" + booleanValue2);
        if (booleanValue2) {
            Context context = this.f17729a;
            if (context != null) {
                Toast.showText(context, context.getString(R.string.CreationMobile_ECM_ShareSecuritySettingKAToast), 1);
                return;
            }
            return;
        }
        m25775a(booleanValue, str, j, str2, str3, bVar);
    }

    /* renamed from: a */
    private void m25775a(boolean z, final String str, long j, final String str2, final String str3, final C6414b bVar) {
        if (z) {
            Context context = this.f17729a;
            String a = C10539a.m43639a(context, R.string.Drive_Drive_NetworkRemind, "size", C13672c.m55479a(context, j));
            Dialog a2 = this.f17737i.mo28221a(this.f17729a, this.f17729a.getString(R.string.Drive_Drive_NoWifi), a, new C7207a.AbstractC7208a() {
                /* class com.bytedance.ee.bear.drive.biz.external.C6418d.C64191 */

                @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                /* renamed from: a */
                public void mo25758a() {
                    C6418d.this.f17733e.mo27529a();
                }

                @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                /* renamed from: b */
                public void mo25759b() {
                    C6880a.m27087a(true);
                    C6418d dVar = C6418d.this;
                    dVar.mo25746a(dVar.f17729a, str, str2, str3, bVar);
                }
            });
            this.f17739k = a2;
            a2.show();
            return;
        }
        mo25746a(this.f17729a, str, str2, str3, bVar);
    }

    /* renamed from: a */
    public void mo25746a(Context context, String str, String str2, String str3, C6414b bVar) {
        if (context == null) {
            C13479a.m54764b("DRIVE_OpenExternalHelper", "OpenExternalHelper.showFileStorageConfirmDialog(), show failure, context is null !!!");
        } else if (bVar == null || bVar.f17724c) {
            ConfirmStorageDialog bVar2 = new ConfirmStorageDialog(context, new ConfirmStorageDialog.ConfirmCallBack(str, str2, str3, bVar) {
                /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$5lAXIc03grLoV_6OB5HkFmsL3jA */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ C6414b f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                @Override // com.bytedance.ee.bear.widgets.ConfirmStorageDialog.ConfirmCallBack
                public final void onContinue() {
                    C6418d.this.m25778b(this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
            this.f17740l = bVar2;
            bVar2.mo45265d();
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(str, String.valueOf(C8275a.f22375h.mo32555b()), this.f17740l.mo45264c());
        } else {
            C13479a.m54764b("DRIVE_OpenExternalHelper", "OpenExternalHelper.showFileStorageConfirmDialog(),  showStorageDialog=false");
            m25778b(str, str2, str3, bVar);
        }
    }

    /* renamed from: a */
    public void m25778b(final String str, final String str2, String str3, final C6414b bVar) {
        this.f17731c.mo45428a(0);
        this.f17746r.mo25733a(str, str2, str3, new AbstractC6412a.AbstractC6413a() {
            /* class com.bytedance.ee.bear.drive.biz.external.C6418d.C64202 */

            @Override // com.bytedance.ee.bear.drive.biz.external.AbstractC6412a.AbstractC6413a
            /* renamed from: a */
            public void mo25734a() {
                SpaceFileOpenEntity spaceFileOpenEntity = new SpaceFileOpenEntity(str, "");
                spaceFileOpenEntity.setApiExtra(str2);
                C6418d.this.f17733e.mo27530a(spaceFileOpenEntity, new C6423b(bVar));
            }

            @Override // com.bytedance.ee.bear.drive.biz.external.AbstractC6412a.AbstractC6413a
            /* renamed from: b */
            public void mo25735b() {
                C13479a.m54775e("DRIVE_OpenExternalHelper", "open external but check no export permission");
                C6418d.this.mo25757h();
                if (C6418d.this.f17736h != null) {
                    C6418d.this.f17736h.mo25742c();
                }
            }

            @Override // com.bytedance.ee.bear.drive.biz.external.AbstractC6412a.AbstractC6413a
            /* renamed from: c */
            public void mo25736c() {
                C13479a.m54758a("DRIVE_OpenExternalHelper", "check permission error before open external");
                C6418d.this.mo25757h();
                if (C6418d.this.f17736h != null) {
                    C6418d.this.f17736h.mo25742c();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25772a(Runnable runnable, boolean z) {
        if (!z || runnable == null) {
            Context context = this.f17729a;
            Toast.showFailureText(context, context.getResources().getString(R.string.Drive_Drive_SaveFailed), 0);
            return;
        }
        runnable.run();
    }

    /* renamed from: a */
    public void mo25747a(Context context, String str, String str2, String str3, C6414b bVar, Runnable runnable) {
        if (str != null && str3 != null && context != null) {
            File file = new File(str);
            Uri a = C13671b.m55462a(context, C13675f.m55509b(str3), str2, "");
            if (file.exists() && file.isFile()) {
                this.f17744p.mo237937a(AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238020d(new Function(context, file, a) {
                    /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$lusD_aQADjU0WUD31x8jQXwc4l4 */
                    public final /* synthetic */ Context f$1;
                    public final /* synthetic */ File f$2;
                    public final /* synthetic */ Uri f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C6418d.this.m25764a(this.f$1, this.f$2, this.f$3, (Boolean) obj);
                    }
                }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(bVar, context, a, str2, runnable) {
                    /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$hoCmlwF2C43vWGjHqI0d71bQz8c */
                    public final /* synthetic */ C6414b f$1;
                    public final /* synthetic */ Context f$2;
                    public final /* synthetic */ Uri f$3;
                    public final /* synthetic */ String f$4;
                    public final /* synthetic */ Runnable f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6418d.this.m25769a((C6418d) this.f$1, (C6414b) this.f$2, (Context) this.f$3, (Uri) this.f$4, (String) this.f$5, (Runnable) ((Boolean) obj));
                    }
                }, new Consumer(bVar, a) {
                    /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$xQjKiVyjJKJzRZGzK961owNPrlI */
                    public final /* synthetic */ C6414b f$1;
                    public final /* synthetic */ Uri f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C6418d.this.m25770a((C6418d) this.f$1, (C6414b) this.f$2, (Uri) ((Throwable) obj));
                    }
                }));
            }
        }
    }

    /* renamed from: a */
    private boolean m25776a(Context context, File file, Uri uri) {
        try {
            C13671b.m55469a(context, file.toString(), uri);
            return true;
        } catch (Exception e) {
            C13479a.m54761a("DRIVE_OpenExternalHelper", e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo25750a(boolean z) {
        mo25757h();
        AbstractC6422a aVar = this.f17736h;
        if (aVar != null) {
            aVar.mo25742c();
        }
        if (z && this.f17729a != null) {
            if (!this.f17745q.mo20038b().mo20041b()) {
                Context context = this.f17729a;
                Toast.showFailureText(context, context.getResources().getString(R.string.Drive_Drive_NetInterrupt), 0);
                return;
            }
            Context context2 = this.f17729a;
            Toast.showFailureText(context2, context2.getResources().getString(R.string.Drive_Drive_LoadingFail), 0);
        }
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.AbstractC7006d
    /* renamed from: b */
    public AbstractC6927d mo25751b() {
        return this.f17741m;
    }

    /* renamed from: i */
    private boolean m25779i() {
        if (C36808a.m145211c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void mo25757h() {
        Dialog dialog = this.f17730b;
        if (dialog != null && dialog.isShowing()) {
            this.f17730b.dismiss();
        }
    }

    /* renamed from: g */
    public void mo25756g() {
        this.f17729a = null;
        Dialog dialog = this.f17730b;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f17744p.dispose();
        this.f17733e.mo27529a();
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.external.d$3 */
    static /* synthetic */ class C64213 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17756a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17757b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.bytedance.ee.bear.drive.loader.model.ErrCode[] r0 = com.bytedance.ee.bear.drive.loader.model.ErrCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.biz.external.C6418d.C64213.f17757b = r0
                r1 = 1
                com.bytedance.ee.bear.drive.loader.model.ErrCode r2 = com.bytedance.ee.bear.drive.loader.model.ErrCode.MOBILE_NETWORK_NOT_AUTHORIZATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.bytedance.ee.bear.drive.biz.external.C6418d.C64213.f17757b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.loader.model.ErrCode r3 = com.bytedance.ee.bear.drive.loader.model.ErrCode.DRIVE_DOWNLOAD_FILE_OVER_SIZE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bytedance.ee.bear.drive.loader.model.InfoCode[] r2 = com.bytedance.ee.bear.drive.loader.model.InfoCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.bytedance.ee.bear.drive.biz.external.C6418d.C64213.f17756a = r2
                com.bytedance.ee.bear.drive.loader.model.InfoCode r3 = com.bytedance.ee.bear.drive.loader.model.InfoCode.PreFetchFileInfo     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = com.bytedance.ee.bear.drive.biz.external.C6418d.C64213.f17756a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.ee.bear.drive.loader.model.InfoCode r2 = com.bytedance.ee.bear.drive.loader.model.InfoCode.FileInfoSuccess     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = com.bytedance.ee.bear.drive.biz.external.C6418d.C64213.f17756a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.ee.bear.drive.loader.model.InfoCode r1 = com.bytedance.ee.bear.drive.loader.model.InfoCode.HitCache     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.external.C6418d.C64213.<clinit>():void");
        }
    }

    /* renamed from: f */
    public void mo25755f() {
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "cancel open external task");
        this.f17744p.mo237935a();
        this.f17733e.mo27529a();
        Dialog dialog = this.f17730b;
        if (dialog != null && dialog.isShowing()) {
            this.f17730b.dismiss();
        }
        ConfirmStorageDialog bVar = this.f17740l;
        if (!(bVar == null || bVar.mo45264c() == null || !this.f17740l.mo45264c().isShowing())) {
            this.f17740l.mo45264c().dismiss();
        }
        Dialog dialog2 = this.f17732d;
        if (dialog2 != null && dialog2.isShowing()) {
            this.f17732d.dismiss();
        }
        Dialog dialog3 = this.f17739k;
        if (dialog3 != null && dialog3.isShowing()) {
            this.f17739k.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25767a(DialogInterface dialogInterface) {
        this.f17733e.mo27529a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.external.d$b */
    public class C6423b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final AtomicReference<C7086a> f17758a = new AtomicReference<>();

        /* renamed from: c */
        private String f17760c;

        /* renamed from: d */
        private String f17761d;

        /* renamed from: e */
        private String f17762e;

        /* renamed from: f */
        private C6414b f17763f;

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25760a(int i) {
            if (C6418d.this.f17731c != null) {
                C6418d.this.f17731c.mo45428a(i);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m25806b(AbstractC6949c cVar) {
            C6418d.this.f17735g.mo27961f(this.f17762e, cVar.mo27380j());
            if (C6418d.this.f17736h != null) {
                C6418d.this.f17736h.mo25741b();
            }
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25512a(C7553d dVar) {
            super.mo25512a(dVar);
            m25804a(C7090c.m28237a(this.f17758a.get()));
        }

        /* renamed from: a */
        private void m25804a(AbstractC6949c cVar) {
            if (cVar == null) {
                C13479a.m54758a("DRIVE_OpenExternalHelper", "open external fileModel is null");
                return;
            }
            C13479a.m54772d("DRIVE_OpenExternalHelper", "loading file success, path: " + cVar);
            C6418d.this.f17731c.mo45428a(100);
            C6418d dVar = C6418d.this;
            dVar.mo25747a(dVar.f17729a, cVar.mo27381k(), this.f17760c, this.f17761d, this.f17763f, new Runnable(cVar) {
                /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$b$YqLZ_sLQyURggppcRCmYLAefXQ */
                public final /* synthetic */ AbstractC6949c f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C6418d.C6423b.this.m25806b((C6418d.C6423b) this.f$1);
                }
            });
        }

        /* renamed from: a */
        private void m25805a(final C7086a aVar) {
            if (aVar == null) {
                C13479a.m54758a("DRIVE_OpenExternalHelper", "open external onUserNotConfirmDownloadError fileModel is null");
                return;
            }
            String a = C10539a.m43639a(C6418d.this.f17729a, R.string.Drive_Drive_NetworkRemind, "size", C13672c.m55479a(C6418d.this.f17729a, aVar.mo27322a().f18787c));
            String string = C6418d.this.f17729a.getString(R.string.Drive_Drive_NoWifi);
            C6418d dVar = C6418d.this;
            dVar.f17732d = dVar.f17737i.mo28221a(C6418d.this.f17729a, string, a, new C7207a.AbstractC7208a() {
                /* class com.bytedance.ee.bear.drive.biz.external.C6418d.C6423b.C64241 */

                @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                /* renamed from: b */
                public void mo25759b() {
                    C6418d.this.f17733e.mo27531a(aVar, C6423b.this);
                }

                @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                /* renamed from: a */
                public void mo25758a() {
                    C6418d.this.mo25757h();
                    if (C6418d.this.f17736h != null) {
                        C6418d.this.f17736h.mo25742c();
                    }
                }
            });
            C6418d.this.f17732d.show();
        }

        /* renamed from: b */
        private void m25807b(C7086a aVar) {
            C6418d.this.mo25757h();
            if (C6418d.this.f17736h != null) {
                C6418d.this.f17736h.mo25742c();
            }
            if (aVar == null) {
                C13479a.m54758a("DRIVE_OpenExternalHelper", "open external onDownloadFileSizeOverLimitError fileModel is null");
                return;
            }
            Toast.showFailureText(C6418d.this.f17729a, C10539a.m43639a(C6418d.this.f17729a, R.string.CreationMobile_ECM_SaveToLocal_TooLarge_toast, "SIZE", C13719a.m55623c(Long.valueOf(C6920b.m27342f().mo27168c().mo27227i().getDownload_origin_file_max_size()))), 0);
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            int i = C64213.f17757b[errCode.ordinal()];
            if (i == 1) {
                m25805a(this.f17758a.get());
            } else if (i != 2) {
                C6418d.this.mo25750a(true);
            } else {
                m25807b(this.f17758a.get());
            }
        }

        C6423b(C6414b bVar) {
            this.f17763f = bVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25427a(InfoCode infoCode, Object obj) {
            int i = C64213.f17756a[infoCode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!(obj instanceof C7086a)) {
                            C13479a.m54758a("DRIVE_OpenExternalHelper", "HitCache but data is not driveFIleModel");
                        } else {
                            m25804a(C7090c.m28237a((C7086a) obj));
                        }
                    }
                } else if (!(obj instanceof C7086a)) {
                    C13479a.m54758a("DRIVE_OpenExternalHelper", "FileInfoSuccess but data is not driveFIleModel");
                } else {
                    C7086a aVar = (C7086a) obj;
                    this.f17758a.set(aVar);
                    if (!TextUtils.isEmpty(aVar.mo27322a().f18790f)) {
                        this.f17760c = aVar.mo27322a().f18790f;
                        C13479a.m54772d("DRIVE_OpenExternalHelper", "loading file success, mimeType: " + this.f17760c);
                    } else {
                        this.f17760c = C6418d.this.f17734f.mo27711a(aVar.mo27322a().mo27364g(), null).mo27727b();
                        C13479a.m54772d("DRIVE_OpenExternalHelper", "loading file success, mimeType by ext: " + this.f17760c);
                    }
                    this.f17761d = aVar.mo27322a().mo27358a();
                    this.f17762e = aVar.mo27322a().f18785a;
                    if (C6418d.this.f17736h != null) {
                        C6418d.this.f17736h.mo25740a(aVar);
                    }
                }
            } else if (C6418d.this.f17730b != null && C13726a.m55674a(C6418d.this.f17729a)) {
                C6418d.this.f17730b.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Pair m25762a(Boolean bool) throws Exception {
        return new Pair(bool, Boolean.valueOf(m25779i()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m25765a(C7086a aVar) throws Exception {
        return Boolean.valueOf(this.f17741m.mo27244a(this.f17742n, C7090c.m28237a(aVar)));
    }

    /* renamed from: a */
    private void m25771a(Runnable runnable) {
        Context context = this.f17729a;
        if (context != null && (context instanceof Activity)) {
            C57805b.m224333d((Activity) context, new C57805b.AbstractC57809a(runnable) {
                /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$wA7N068J_xAhbIpkH9PD_Pga0Aw */
                public final /* synthetic */ Runnable f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public final void permissionGranted(boolean z) {
                    C6418d.this.m25772a((C6418d) this.f$1, (Runnable) z);
                }
            });
        }
    }

    /* renamed from: a */
    private void m25766a(Context context, C10917c cVar) {
        C6920b f = C6920b.m27342f();
        this.f17741m = f.mo27165a(C6925b.class);
        this.f17742n = f.mo27170e();
        this.f17743o = f.mo27167b();
        this.f17733e = new C6997b(this);
        BearUDProgressDialogController bVar = new BearUDProgressDialogController(this.f17729a);
        this.f17731c = bVar;
        this.f17730b = this.f17737i.mo28220a(this.f17729a, bVar, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$Eoi_qj2GE47GLEahBTKubFR3kE */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C6418d.this.m25768a((C6418d) dialogInterface, (DialogInterface) i);
            }
        }, new DialogInterface.OnDismissListener() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$dby7w9dzksgk8hIXcWmcltUVs */

            public final void onDismiss(DialogInterface dialogInterface) {
                C6418d.this.m25767a((C6418d) dialogInterface);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25768a(DialogInterface dialogInterface, int i) {
        this.f17735g.mo27974k();
        AbstractC6422a aVar = this.f17736h;
        if (aVar != null) {
            aVar.mo25739a();
        }
    }

    public C6418d(Context context, C10917c cVar, AbstractC6412a aVar) {
        this(context, cVar, null, aVar);
    }

    /* renamed from: a */
    public static C6418d m25763a(int i, Context context, C10917c cVar) {
        AbstractC6412a aVar;
        if (i == 3 || i == 5) {
            aVar = new C6426f(cVar);
        } else {
            aVar = new C6425e();
        }
        return new C6418d(context, cVar, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25770a(C6414b bVar, Uri uri, Throwable th) throws Exception {
        C13479a.m54761a("DRIVE_OpenExternalHelper", th);
        if (C13726a.m55674a(this.f17729a)) {
            mo25757h();
            Context context = this.f17729a;
            Toast.showFailureText(context, context.getResources().getString(R.string.Drive_Drive_SaveFailed), 0);
        }
        if (bVar != null && bVar.f17722a != null) {
            bVar.f17722a.mo25737a(false, uri);
        }
    }

    public C6418d(Context context, C10917c cVar, AbstractC6422a aVar, AbstractC6412a aVar2) {
        this.f17729a = context;
        this.f17738j = cVar;
        this.f17736h = aVar;
        this.f17735g = C6920b.m27342f().mo27166a();
        this.f17737i = C6920b.m27342f().mo27178g();
        this.f17734f = C6920b.m27342f().mo27169d();
        this.f17744p = new C68289a();
        this.f17745q = C5084ad.m20847d();
        this.f17746r = aVar2;
        m25766a(context, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m25764a(Context context, File file, Uri uri, Boolean bool) throws Exception {
        return Boolean.valueOf(m25776a(context, file, uri));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25777b(long j, String str, String str2, String str3, C6414b bVar) {
        this.f17744p.mo237937a(AbstractC68307f.m265099b((Callable) new Callable(new C7086a(new C7086a.C7087a("", j, null, 0, "", false, str, "", "", 0, "", "", "", 0, 0, str2, null))) {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$W7QNU9cEpMLJswRrnlcvMPFHtZc */
            public final /* synthetic */ C7086a f$1;

            {
                this.f$1 = r2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6418d.this.m25765a(this.f$1);
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$WHTQVPKAZpuBoYWvlpjH8GTs1l8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6418d.this.m25762a((Boolean) obj);
            }
        }).mo238001b(new Consumer(str, j, str2, str3, bVar) {
            /* class com.bytedance.ee.bear.drive.biz.external.$$Lambda$d$AkXOiaEIu_XRy7g7nQswkzB0n8c */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ long f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ C6414b f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r5;
                this.f$4 = r6;
                this.f$5 = r7;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6418d.this.m25773a((C6418d) this.f$1, (String) this.f$2, (long) this.f$3, this.f$4, (String) this.f$5, (C6414b) ((Pair) obj));
            }
        }, $$Lambda$d$5ITQTWXfpcAa5jw_VUSOf5Gdcsc.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25769a(C6414b bVar, Context context, Uri uri, String str, Runnable runnable, Boolean bool) throws Exception {
        C13479a.m54764b("DRIVE_OpenExternalHelper", "copyDataToSD result=" + bool);
        mo25757h();
        if (!bool.booleanValue() && C13726a.m55674a(this.f17729a)) {
            Context context2 = this.f17729a;
            Toast.showFailureText(context2, context2.getResources().getString(R.string.Drive_Drive_SaveFailed), 0);
        }
        if (bool.booleanValue() && (bVar == null || !bVar.f17723b)) {
            C13671b.m55467a(context, uri, str);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (bVar != null && bVar.f17722a != null) {
            bVar.f17722a.mo25737a(bool.booleanValue(), uri);
        }
    }
}
