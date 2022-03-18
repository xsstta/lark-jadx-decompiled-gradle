package com.ss.android.lark.mm;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.live.settings.C41524a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.external.AccountLogoutInterceptor;
import com.ss.android.lark.mm.module.detail.MmDetailActivity;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.player.core.C46687n;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService;
import com.ss.android.lark.mm.module.record.upload.MmAudioUploadCenter;
import com.ss.android.lark.mm.module.tab.MmTabPageSpec;
import com.ss.android.lark.mm.p2284a.AbstractC45836a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.service.IMmService;
import com.ss.android.lark.mm.service.MmService;
import com.ss.android.lark.mm.utils.C47113m;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Set;

/* renamed from: com.ss.android.lark.mm.a */
public class C45833a implements AbstractC45836a {

    /* renamed from: a */
    public static C41524a f115631a;

    /* renamed from: c */
    private static IMmService f115632c;

    /* renamed from: d */
    private static C45852d f115633d;

    /* renamed from: b */
    private C47113m f115634b = new C47113m();

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: b */
    public boolean mo161087b() {
        return true;
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: c */
    public boolean mo161088c() {
        return MmRecordManager.m185552y();
    }

    /* renamed from: a */
    public static IMmDepend m181559a() {
        return (IMmDepend) ApiUtils.getApi(IMmDepend.class);
    }

    /* renamed from: i */
    private void m181566i() {
        C45857i.m181676a(new Runnable() {
            /* class com.ss.android.lark.mm.C45833a.RunnableC458352 */

            public void run() {
                C45833a.f115631a.mo149411b();
            }
        });
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: d */
    public void mo161089d() {
        MmAudioRecordService.f117956f.mo164590c(C45851c.m181646a());
        C45859k.m181685a($$Lambda$a$Ykl7rhB3nz7gtAmVoKF8_0Pv2Y.INSTANCE);
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: e */
    public boolean mo161090e() {
        return C45852d.m181651a().mo161151b().mo164278h();
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: f */
    public void mo161091f() {
        C45852d.m181651a().mo161151b().mo164284t();
    }

    /* renamed from: g */
    public static IMmService m181564g() {
        if (f115632c == null) {
            synchronized (C45833a.class) {
                if (f115632c == null) {
                    f115632c = new MmService();
                }
            }
        }
        return f115632c;
    }

    /* renamed from: h */
    public static C45852d m181565h() {
        if (f115633d == null) {
            synchronized (C45852d.class) {
                if (f115633d == null) {
                    f115633d = new C45852d();
                }
            }
        }
        return f115633d;
    }

    public C45833a(Context context) {
        mo161082a(context);
    }

    /* renamed from: b */
    private void m181561b(final Context context) {
        C45857i.m181676a(new Runnable() {
            /* class com.ss.android.lark.mm.C45833a.RunnableC458341 */

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
                r3 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r1.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
                r2.addSuppressed(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
                throw r3;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 111
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.C45833a.RunnableC458341.run():void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m181563c(String str) {
        C45852d.m181651a().mo161151b().mo164284t();
        MmAudioUploadCenter.m185966c();
    }

    /* renamed from: b */
    private boolean m181562b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !TextUtils.isEmpty(Uri.parse(str).getHost());
        }
        return false;
    }

    /* renamed from: a */
    public void mo161082a(Context context) {
        m181561b(context);
        f115631a = new C41524a();
        m181566i();
        C46687n.m184667a(context);
        MmService.m181864c();
        C45899c.m181859a().getLoginDepend().mo144648a(new AccountLogoutInterceptor());
        C45899c.m181859a().getLoginDepend().mo144649a($$Lambda$a$gC16chSIFZAiVnn7SGzNTrzGKc.INSTANCE);
    }

    /* renamed from: a */
    public void mo161085a(Set<String> set) {
        for (String str : set) {
            try {
                Class.forName(str);
            } catch (Exception e) {
                C45855f.m181666e("MmModule", "[initPreloadDetailClass] exception: " + e);
            }
        }
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: a */
    public boolean mo161086a(String str) {
        return f115631a.mo149413c().getSettingHelper().mo165352a(str);
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: a */
    public void mo161083a(Context context, int i) {
        MinutesListActivity.m183512a(context, "", i, (String) null);
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: a */
    public AbstractC44552i mo161081a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        return new MmTabPageSpec(context, iTitleController);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m181560a(String str, Context context, int i) {
        C45855f.m181663b("MmModule", "openMm startActivity");
        if (f115631a.mo149414c(str)) {
            MinutesListActivity.m183512a(context, str, i, (String) null);
        } else {
            MmDetailActivity.m181970a(context, str, i);
        }
    }

    @Override // com.ss.android.lark.mm.p2284a.AbstractC45836a
    /* renamed from: a */
    public void mo161084a(Context context, String str, int i) {
        C45855f.m181663b("MmModule", "openMm " + str);
        if (m181562b(str)) {
            this.f115634b.mo165501a(new Runnable(str, context, i) {
                /* class com.ss.android.lark.mm.$$Lambda$a$imi1tPCeOpisAvoxWInaGgA4IKA */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ Context f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C45833a.m181560a(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }
}
