package com.bytedance.ee.bear.sheet.exportimage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareMinaConfig;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.AbstractC11005b;
import com.bytedance.ee.bear.sheet.exportimage.C11094a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13680g;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.sheet.exportimage.a */
public class C11094a {

    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.a$a */
    public interface AbstractC11098a {
        /* renamed from: a */
        void mo42313a(ShareType shareType);

        /* renamed from: a */
        void mo42314a(ShareType shareType, String str);
    }

    /* renamed from: a */
    public static boolean m46179a(Context context, String str) {
        ClipData newPlainText = ClipData.newPlainText(null, str);
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null) {
            return false;
        }
        clipboardManager.setPrimaryClip(newPlainText);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46178a(AbstractC11098a aVar, ShareType shareType, Throwable th) throws Exception {
        C13479a.m54759a("ShareImageHelper", "hostService shareTextPlain fail", th);
        if (aVar != null) {
            aVar.mo42314a(shareType, th.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.a$3 */
    public static /* synthetic */ class C110973 {

        /* renamed from: a */
        static final /* synthetic */ int[] f29804a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.bizwidget.shareview.ShareType[] r0 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.exportimage.C11094a.C110973.f29804a = r0
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Download     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.exportimage.C11094a.C110973.f29804a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.QQ     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.exportimage.C11094a.C110973.f29804a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Wechat     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.sheet.exportimage.C11094a.C110973.f29804a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.WechatMoments     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.sheet.exportimage.C11094a.C110973.f29804a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Weibo     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.sheet.exportimage.C11094a.C110973.f29804a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.bizwidget.shareview.ShareType r1 = com.bytedance.ee.bear.bizwidget.shareview.ShareType.Lark     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.exportimage.C11094a.C110973.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m46168a(ShareType shareType) {
        if (shareType == null) {
            return "";
        }
        switch (C110973.f29804a[shareType.ordinal()]) {
            case 1:
                return "local";
            case 2:
                return "qq";
            case 3:
                return "wechat";
            case 4:
                return "wechat_moment";
            case 5:
                return "weibo";
            case 6:
                boolean z = true;
                if (C4511g.m18594d().mo17344E() != 1 || !((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41777a()) {
                    z = false;
                }
                if (z) {
                    return "lark";
                }
                return "feishu";
            default:
                return shareType.name().toLowerCase();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46174a(Context context, Throwable th) throws Exception {
        C13479a.m54761a("ShareImageHelper", th);
        Toast.showFailureTextWithMargin(context, context.getString(R.string.Doc_Facade_SaveFailed), 0);
    }

    /* renamed from: a */
    public static void m46172a(Context context, File file, AbstractC11098a aVar) {
        m46180b(context, file, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m46169a(File file, ArrayList arrayList, ak akVar) throws Exception {
        akVar.shareImages(file.getAbsolutePath(), null, arrayList, true);
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m46181b(AbstractC11098a aVar, ShareType shareType, String str) throws Exception {
        C13479a.m54772d("ShareImageHelper", "hostService shareImages success ");
        if (aVar != null) {
            aVar.mo42313a(shareType);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Comparable m46167a(Context context, File file, File file2) throws Exception {
        if (file2 == null) {
            return "";
        }
        Uri a = C13671b.m55462a(context.getApplicationContext(), file.getName(), null, C13680g.f35878a);
        C13671b.m55469a(context.getApplicationContext(), file.getAbsolutePath(), a);
        return a;
    }

    /* renamed from: b */
    private static void m46180b(Context context, File file, AbstractC11098a aVar) {
        C13708c.m55598a(C13615c.f35773a, "android.permission.WRITE_EXTERNAL_STORAGE", C13615c.f35773a.getString(R.string.Doc_Facade_PermissionStorage), new AbstractC13707b(context, file, aVar) {
            /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$ANlKaoUDdLuzOwPxVYR_6uHSFw */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ File f$1;
            public final /* synthetic */ C11094a.AbstractC11098a f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                C11094a.m269932lambda$ANlKaoUDdLuzOwPxVYR_6uHSFw(this.f$0, this.f$1, this.f$2, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46171a(Context context, AbstractC11098a aVar, Comparable comparable) throws Exception {
        if (comparable != null) {
            C13671b.m55476e(context, (Uri) comparable);
            Toast.showSuccessTextWithMargin(context, context.getString(R.string.Doc_Doc_ShotSaveSuccessfully), 0);
            if (aVar != null) {
                aVar.mo42313a(ShareType.Download);
                return;
            }
            return;
        }
        Toast.showFailureTextWithMargin(context, context.getString(R.string.Doc_Facade_SaveFailed), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m46182b(AbstractC11098a aVar, ShareType shareType, Throwable th) throws Exception {
        C13479a.m54758a("ShareImageHelper", "hostService shareImages fail ");
        if (aVar != null) {
            aVar.mo42314a(shareType, th.getMessage());
        }
    }

    /* renamed from: c */
    private static void m46183c(Context context, File file, AbstractC11098a aVar) {
        if (C36808a.m145211c() == 1) {
            Toast.showText(context, context.getString(R.string.CreationMobile_ECM_SecuritySettingKAToast), 1, true);
        } else {
            AbstractC68307f.m265083a(file).mo237985a(C11678b.m48477a()).mo238020d(new Function(context, file) {
                /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$1LKf_7G8LmzzOEJwX8KppugSM8g */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ File f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C11094a.lambda$1LKf_7G8LmzzOEJwX8KppugSM8g(this.f$0, this.f$1, (File) obj);
                }
            }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(context, aVar) {
                /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$XZO7dZ3NrS9irpwNTXvrS4tSVCM */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ C11094a.AbstractC11098a f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11094a.lambda$XZO7dZ3NrS9irpwNTXvrS4tSVCM(this.f$0, this.f$1, (Comparable) obj);
                }
            }, new Consumer(context) {
                /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$GWNBsDrFD731iTzIDDr9s7DIwI0 */
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11094a.lambda$GWNBsDrFD731iTzIDDr9s7DIwI0(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46177a(AbstractC11098a aVar, ShareType shareType, String str) throws Exception {
        C13479a.m54772d("ShareImageHelper", "hostService shareTextPlain success ");
        if (aVar != null) {
            aVar.mo42313a(shareType);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46173a(Context context, File file, AbstractC11098a aVar, boolean z) {
        C13479a.m54764b("ShareImageHelper", "checkStoragePermissions()... isGrant = " + z);
        if (z) {
            m46183c(context, file, aVar);
        } else {
            Toast.showFailureTextWithMargin(context, context.getString(R.string.Doc_Facade_FailNoPermission), 0);
        }
    }

    /* renamed from: a */
    public static void m46175a(C10917c cVar, Context context, final ShareType shareType, File file, final AbstractC11098a aVar) {
        boolean z;
        if (file != null && context != null && file.exists() && file.isFile()) {
            if (shareType.equals(ShareType.Lark)) {
                Uri fromFile = Uri.fromFile(file);
                ArrayList arrayList = new ArrayList();
                arrayList.add(fromFile);
                cVar.mo41508c(ak.class).mo238020d(new Function(file, arrayList) {
                    /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$CW4DKJGTPdqVDEeMPWv8xKtzA */
                    public final /* synthetic */ File f$0;
                    public final /* synthetic */ ArrayList f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C11094a.m269933lambda$CW4DKJGTPdqVDEeMPWv8xKtzA(this.f$0, this.f$1, (ak) obj);
                    }
                }).mo238001b(new Consumer(shareType) {
                    /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$LrHKvFMyfEjJujnkvIYnIu4T5m0 */
                    public final /* synthetic */ ShareType f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C11094a.lambda$LrHKvFMyfEjJujnkvIYnIu4T5m0(C11094a.AbstractC11098a.this, this.f$1, (String) obj);
                    }
                }, new Consumer(shareType) {
                    /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$BR3fn5hz0yHrxOZu90ssev8HMsE */
                    public final /* synthetic */ ShareType f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C11094a.lambda$BR3fn5hz0yHrxOZu90ssev8HMsE(C11094a.AbstractC11098a.this, this.f$1, (Throwable) obj);
                    }
                });
                return;
            }
            C110951 r5 = new AbstractC11005b() {
                /* class com.bytedance.ee.bear.sheet.exportimage.C11094a.C110951 */

                @Override // com.bytedance.ee.bear.share.export.AbstractC11005b
                /* renamed from: a */
                public void mo42003a() {
                    AbstractC11098a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo42313a(shareType);
                    }
                }

                @Override // com.bytedance.ee.bear.share.export.AbstractC11005b
                /* renamed from: a */
                public void mo42004a(String str) {
                    AbstractC11098a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo42314a(shareType, str);
                    }
                }
            };
            if (shareType.equals(ShareType.More)) {
                ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41773a(context, file, r5);
            } else if (((ExternalShareMinaConfig) C4211a.m17514a().mo16532a("external_share_config", ExternalShareMinaConfig.class, new ExternalShareMinaConfig())).isShareChannelBanned(shareType)) {
                ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41771a(context, shareType, file, (String) null, r5);
            } else {
                if (C4511g.m18594d().mo17344E() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41775a(z, context, shareType, file, r5);
            }
        }
    }

    /* renamed from: a */
    public static void m46176a(C10917c cVar, Context context, final ShareType shareType, String str, final AbstractC11098a aVar) {
        boolean z;
        if (shareType.equals(ShareType.Lark)) {
            cVar.mo41508c(ak.class).mo238020d(new Function(str) {
                /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$C5oQxE5fI9RNm9xxmJTx29pUAsc */
                public final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C11094a.lambda$C5oQxE5fI9RNm9xxmJTx29pUAsc(this.f$0, (ak) obj);
                }
            }).mo238001b(new Consumer(shareType) {
                /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$Ghyc1WayVLEWs67g5yxtxYt908 */
                public final /* synthetic */ ShareType f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11094a.m269934lambda$Ghyc1WayVLEWs67g5yxtxYt908(C11094a.AbstractC11098a.this, this.f$1, (String) obj);
                }
            }, new Consumer(shareType) {
                /* class com.bytedance.ee.bear.sheet.exportimage.$$Lambda$a$BayKje9cvbcsy3MAgIGJyDuYtQ8 */
                public final /* synthetic */ ShareType f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11094a.lambda$BayKje9cvbcsy3MAgIGJyDuYtQ8(C11094a.AbstractC11098a.this, this.f$1, (Throwable) obj);
                }
            });
            return;
        }
        ExternalShareMinaConfig externalShareMinaConfig = (ExternalShareMinaConfig) C4211a.m17514a().mo16532a("external_share_config", ExternalShareMinaConfig.class, new ExternalShareMinaConfig());
        C110962 r5 = new AbstractC11005b() {
            /* class com.bytedance.ee.bear.sheet.exportimage.C11094a.C110962 */

            @Override // com.bytedance.ee.bear.share.export.AbstractC11005b
            /* renamed from: a */
            public void mo42003a() {
                AbstractC11098a aVar = aVar;
                if (aVar != null) {
                    aVar.mo42313a(shareType);
                }
            }

            @Override // com.bytedance.ee.bear.share.export.AbstractC11005b
            /* renamed from: a */
            public void mo42004a(String str) {
                AbstractC11098a aVar = aVar;
                if (aVar != null) {
                    aVar.mo42314a(shareType, str);
                }
            }
        };
        if (shareType.equals(ShareType.More)) {
            ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41774a(context, str, r5);
        } else if (externalShareMinaConfig.isShareChannelBanned(shareType)) {
            ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41772a(context, shareType, str, r5);
        } else {
            if (C4511g.m18594d().mo17344E() == 2) {
                z = true;
            } else {
                z = false;
            }
            ((AbstractC11003a) KoinJavaComponent.m268610a(AbstractC11003a.class)).mo41762a().mo41776a(z, context, shareType, str, r5);
        }
    }
}
