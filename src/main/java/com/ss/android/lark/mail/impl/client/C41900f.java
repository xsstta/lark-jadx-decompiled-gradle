package com.ss.android.lark.mail.impl.client;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.MigrationItem;
import com.ss.android.lark.mail.impl.entity.MigrationStage;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43362e;

/* renamed from: com.ss.android.lark.mail.impl.client.f */
public class C41900f {

    /* renamed from: a */
    private static DialogC25637f f106255a;

    /* renamed from: b */
    private static boolean f106256b;

    /* renamed from: a */
    public static void m166381a() {
        Log.m165389i("MigrationTipView", "autoDismissMigrationDialog");
        f106256b = false;
        DialogC25637f fVar = f106255a;
        if (fVar != null) {
            fVar.dismiss();
            f106255a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.client.f$4 */
    public static /* synthetic */ class C419044 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106264a;

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
                com.ss.android.lark.mail.impl.entity.MigrationStage[] r0 = com.ss.android.lark.mail.impl.entity.MigrationStage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.client.C41900f.C419044.f106264a = r0
                com.ss.android.lark.mail.impl.entity.MigrationStage r1 = com.ss.android.lark.mail.impl.entity.MigrationStage.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.client.C41900f.C419044.f106264a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.MigrationStage r1 = com.ss.android.lark.mail.impl.entity.MigrationStage.INITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.client.C41900f.C419044.f106264a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.entity.MigrationStage r1 = com.ss.android.lark.mail.impl.entity.MigrationStage.IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.client.C41900f.C419044.f106264a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.entity.MigrationStage r1 = com.ss.android.lark.mail.impl.entity.MigrationStage.DONE_WITH_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.client.C41900f.C419044.f106264a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.mail.impl.entity.MigrationStage r1 = com.ss.android.lark.mail.impl.entity.MigrationStage.TERMINATED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.client.C41900f.C419044.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static boolean m166386a(int i) {
        DialogC25637f fVar = f106255a;
        if (fVar == null || !fVar.isShowing()) {
            return false;
        }
        if (String.valueOf(i).equals(f106255a.mo89219b().getTag())) {
            return true;
        }
        f106255a.dismiss();
        return false;
    }

    /* renamed from: a */
    public static boolean m166387a(MigrationItem mVar) {
        boolean a = C43362e.m172201a().mo155084a(mVar);
        if (!a) {
            m166381a();
        }
        return a;
    }

    /* renamed from: a */
    public static void m166382a(Context context, View.OnClickListener onClickListener) {
        f106256b = true;
        m166383a(context, C43362e.m172201a().mo155094i(), onClickListener);
    }

    /* renamed from: a */
    public static void m166383a(Context context, MigrationItem mVar, View.OnClickListener onClickListener) {
        Log.m165389i("MigrationTipView", "showMigrationDoneDialog isTabSelected:" + f106256b + ", stage:" + mVar.mo151996b().ordinal());
        if (f106256b && mVar != null && mVar.mo151995a()) {
            m166388b(context, mVar, onClickListener);
        }
    }

    /* renamed from: b */
    public static void m166388b(Context context, MigrationItem mVar, View.OnClickListener onClickListener) {
        C42087a m = C43277a.m171921a().mo154949m();
        if (m == null || !(UserType.EXCHANGE_API_CLIENT == m.mo151815f() || UserType.GMAIL_API_CLIENT == m.mo151815f())) {
            int i = C419044.f106264a[mVar.mo151996b().ordinal()];
            if (i == 1) {
                m166384a(context, mVar, onClickListener, R.string.Mail_Migration_DoneTitle, R.string.Mail_Migration_DoneDesc);
            } else if (i == 2) {
                m166384a(context, mVar, onClickListener, 0, R.string.Mail_Migration_ProgressToolTip);
            } else if (i == 3) {
                m166384a(context, mVar, onClickListener, 0, R.string.Mail_Migration_ProgressToolTip);
            } else if (i == 4) {
                m166385a(context, mVar, onClickListener, R.string.Mail_Migration_DoneWithErrorsTitle, R.string.Mail_Migration_DoneWithErrorsDesc, true);
                C42209j.m168612a("migration_done_with_error", "alert");
            } else if (i == 5) {
                m166384a(context, mVar, onClickListener, R.string.Mail_Migration_FailTitle, R.string.Mail_Migration_FailDesc);
                C42209j.m168612a("migration_terminated", "alert");
            }
        } else {
            int i2 = C419044.f106264a[mVar.mo151996b().ordinal()];
            if (i2 == 1) {
                m166384a(context, mVar, onClickListener, 0, R.string.Mail_Migration_MigrationCompletedMobile);
            } else if (i2 == 2) {
                m166384a(context, mVar, onClickListener, R.string.Mail_Migration_MailMovingDetailsMobile, R.string.Mail_Migration_MailMovingDescMobile);
            } else if (i2 == 3) {
                m166384a(context, mVar, onClickListener, R.string.Mail_Migration_MailMovingDetailsMobile, R.string.Mail_Migration_MailMovingDescMobile);
            }
        }
    }

    /* renamed from: a */
    private static void m166384a(Context context, MigrationItem mVar, View.OnClickListener onClickListener, int i, int i2) {
        m166385a(context, mVar, onClickListener, i, i2, false);
    }

    /* renamed from: a */
    private static void m166385a(final Context context, final MigrationItem mVar, final View.OnClickListener onClickListener, int i, int i2, boolean z) {
        if (!m166386a(mVar.mo151996b().ordinal())) {
            C25639g gVar = new C25639g(context);
            gVar.mo89242c(context.getString(i2));
            if (i != 0) {
                gVar.mo89237b(context.getString(i));
            }
            if (z) {
                C25639g.C25640a aVar = new C25639g.C25640a();
                aVar.mo89266a(R.id.lkui_dialog_btn_left);
                aVar.mo89268a(context.getString(R.string.Mail_Migration_FailureDetailsButton));
                aVar.mo89272e(context.getResources().getColor(R.color.text_title));
                aVar.mo89270c(16);
                aVar.mo89267a(new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.client.C41900f.DialogInterface$OnClickListenerC419011 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        C42699a.m170272c(context);
                        C43362e.m172201a().mo155078a(mVar.mo151996b());
                        C43362e.m172201a().mo155087b(mVar);
                        MigrationItem mVar = mVar;
                        if (mVar != null && mVar.mo151996b().ordinal() > MigrationStage.IN_PROGRESS.ordinal()) {
                            onClickListener.onClick(null);
                        }
                    }
                });
                gVar.mo89229a(aVar);
            }
            C25639g.C25640a aVar2 = new C25639g.C25640a();
            aVar2.mo89266a(R.id.lkui_dialog_btn_right);
            aVar2.mo89268a(context.getString(R.string.Mail_Alert_OK));
            aVar2.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
            aVar2.mo89270c(16);
            aVar2.mo89267a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.client.C41900f.DialogInterface$OnClickListenerC419022 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C43362e.m172201a().mo155087b(mVar);
                    C43362e.m172201a().mo155078a(mVar.mo151996b());
                    MigrationItem mVar = mVar;
                    if (mVar != null && mVar.mo151996b().ordinal() > MigrationStage.IN_PROGRESS.ordinal()) {
                        onClickListener.onClick(null);
                    }
                    dialogInterface.dismiss();
                }
            });
            gVar.mo89227a(new DialogInterface.OnDismissListener() {
                /* class com.ss.android.lark.mail.impl.client.C41900f.DialogInterface$OnDismissListenerC419033 */

                public void onDismiss(DialogInterface dialogInterface) {
                    C43362e.m172201a().mo155087b(mVar);
                    C43362e.m172201a().mo155078a(mVar.mo151996b());
                    MigrationItem mVar = mVar;
                    if (mVar != null && mVar.mo151996b().ordinal() > MigrationStage.IN_PROGRESS.ordinal()) {
                        onClickListener.onClick(null);
                    }
                }
            });
            gVar.mo89229a(aVar2);
            DialogC25637f c = gVar.mo89239c();
            f106255a = c;
            c.mo89219b().setTag(String.valueOf(mVar.mo151996b().ordinal()));
        }
    }
}
