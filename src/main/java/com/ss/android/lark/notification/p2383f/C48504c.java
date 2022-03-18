package com.ss.android.lark.notification.p2383f;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.dependency.AbstractC36454ac;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2383f.p2384a.C48502a;
import com.ss.android.lark.utils.UIHelper;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.notification.f.c */
public class C48504c extends AbstractC48500b<Notice, C48502a> {

    /* renamed from: e */
    private static String f122080e;

    /* renamed from: a */
    public String f122081a;

    /* renamed from: b */
    public int f122082b;

    /* renamed from: c */
    public AbstractC36504r f122083c = C29990c.m110930b().mo134512K();

    /* renamed from: d */
    public AbstractC36454ac f122084d = C29990c.m110930b().mo134592t();

    /* renamed from: f */
    private Notice f122085f;

    /* renamed from: g */
    private String f122086g;

    /* renamed from: h */
    private String f122087h;

    /* renamed from: i */
    private Notice.Extra.ChatType f122088i;

    /* renamed from: j */
    private Notice.Extra.ChatMode f122089j;

    /* renamed from: k */
    private Context f122090k = C29990c.m110930b().mo134528a();

    /* renamed from: l */
    private al f122091l = C29990c.m110930b().mo134596x();

    /* renamed from: m */
    private AbstractC36474h.AbstractC36486l f122092m = C29990c.m110930b().ad();

    /* renamed from: n */
    private AbstractC36509x f122093n = C29990c.m110930b().mo134597y();

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: h */
    public int mo31131h() {
        return R.drawable.ic_notify;
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: l */
    public int mo31135l() {
        return R.mipmap.app_launcher;
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: d */
    public String mo31127d() {
        return this.f122086g;
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return UIHelper.getString(R.string.Lark_Legacy_NewMessage);
    }

    /* renamed from: p */
    public boolean mo169590p() {
        if (this.f122085f.type == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m191264q() {
        if (this.f122085f.extra.f122005d == null) {
            Log.m165383e("MessageNotificationDataPacker", "notice chat type is null！");
            return false;
        } else if (this.f122085f.extra.f122005d == Notice.Extra.ChatType.GROUP) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: r */
    private int m191265r() {
        if ((!mo169590p() || !m191264q()) && this.f122085f.extra.f122012k >= 1) {
            return this.f122085f.extra.f122012k;
        }
        return 1;
    }

    /* renamed from: t */
    private Intent m191267t() {
        return this.f122084d.mo134411a(this.f122090k, this.f122083c.mo134692b(), m191262a(mo169590p(), new ChatBundle.AbstractC29591b() {
            /* class com.ss.android.lark.notification.p2383f.C48504c.C485051 */

            @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
            public void inject(Bundle bundle) {
                bundle.putBoolean(C48504c.this.f122083c.mo134695c(), true);
                bundle.putString("key_thread_id", C48504c.this.f122081a);
                bundle.putInt("key_message_position", C48504c.this.f122082b);
                if (C48504c.this.mo169590p() || C48504c.this.f122082b != -1) {
                    C48504c.this.f122084d.mo134412a(bundle);
                } else {
                    C48504c.this.f122084d.mo134415b(bundle);
                }
            }
        }));
    }

    /* renamed from: v */
    private String m191269v() {
        if (this.f122085f.extra.f122005d == Notice.Extra.ChatType.P2P) {
            return this.f122085f.extra.f122006e;
        }
        return this.f122085f.extra.f122004c;
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        if (this.f122088i != Notice.Extra.ChatType.GROUP) {
            return f122080e;
        }
        if (this.f122091l.mo134464a(true)) {
            return this.f122085f.title;
        }
        return f122080e;
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        if (mo169590p()) {
            return this.f122092m.mo134632a(2);
        }
        return this.f122092m.mo134632a(1);
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: m */
    public int mo31136m() {
        if (this.f122085f.state == 1) {
            return 0;
        }
        if (this.f122085f.state == 2 || this.f122085f.state == 3) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        if (mo169590p()) {
            return "at_v2";
        }
        return "normal_v2";
    }

    /* renamed from: s */
    private String m191266s() {
        if (mo169590p() && m191264q()) {
            return null;
        }
        return "[" + m191265r() + UIUtils.getString(this.f122090k, R.string.Lark_Legacy_AmountNotificationUnit) + "]";
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        int parseLong;
        if (!mo169590p() || !m191264q()) {
            parseLong = ((int) Long.parseLong(this.f122087h)) % HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        } else {
            parseLong = ((int) Long.parseLong(this.f122086g)) % HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        }
        return parseLong * HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    }

    /* renamed from: u */
    private Bitmap m191268u() {
        String str = this.f122085f.extra.f122011j;
        boolean a = this.f122091l.mo134464a(true);
        try {
            if (TextUtils.isEmpty(str) || !a) {
                return BitmapFactory.decodeResource(this.f122090k.getResources(), R.mipmap.app_launcher);
            }
            int dp2px = UIHelper.dp2px(48.0f);
            return ImageLoader.with(this.f122090k).load(AvatarImage.Builder.obtain(str, m191269v(), dp2px, dp2px).build()).asBitmap().centerCrop().error(R.mipmap.app_launcher).getBitmap(dp2px, dp2px);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        Notice notice = (Notice) mo169588o();
        this.f122085f = notice;
        this.f122086g = notice.messageId;
        this.f122087h = this.f122085f.extra.f122004c;
        this.f122088i = this.f122085f.extra.f122005d;
        this.f122089j = this.f122085f.extra.f122008g;
        this.f122081a = this.f122085f.extra.f122009h;
        this.f122082b = this.f122085f.extra.f122018q;
        f122080e = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
    }

    /* renamed from: b */
    public C48502a mo169589b() {
        if (this.f122086g == null || this.f122087h == null || this.f122088i == null) {
            Log.m165383e("MessageNotificationDataPacker", "messageId or getChatId is null");
            return null;
        }
        C48502a aVar = (C48502a) mo169587a(new C48502a());
        aVar.f122074b = m191265r();
        aVar.f122076p = m191264q();
        aVar.f122075o = mo169590p();
        Bitmap u = m191268u();
        if (u != null) {
            aVar.f122073a = u;
        }
        aVar.f122078r = m191266s();
        aVar.f122077q = this.f122085f.createTime;
        aVar.f122079s = this.f122085f.state;
        return aVar;
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        String str = this.f122085f.content;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (this.f122085f.state == 2) {
            return UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled);
        }
        if (this.f122085f.state == 3) {
            return UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled);
        }
        String str2 = this.f122085f.content;
        if (this.f122085f.extra.f122010i) {
            return UIHelper.getString(R.string.Lark_Legacy_EncryptMessageReceived);
        }
        if (this.f122091l.mo134464a(true)) {
            return str2;
        }
        if (this.f122088i == Notice.Extra.ChatType.GROUP) {
            if (mo169590p()) {
                return UIHelper.getString(R.string.Lark_Legacy_GroupAtMe);
            }
            return UIHelper.getString(R.string.Lark_Legacy_NewGroupMessage);
        } else if (mo169590p()) {
            return UIHelper.getString(R.string.Lark_Legacy_SomeoneAtYou);
        } else {
            return UIHelper.getString(R.string.Lark_Legacy_NewMessage);
        }
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (mo169590p() && this.f122092m.mo134634b(2)) {
            return Uri.parse("android.resource://" + this.f122090k.getPackageName() + "/" + R.raw.notification_at);
        } else if (this.f122085f.type != 1 || !this.f122092m.mo134634b(1)) {
            return null;
        } else {
            return Uri.parse("android.resource://" + this.f122090k.getPackageName() + "/" + R.raw.notification);
        }
    }

    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Intent intent;
        if (!this.f122091l.mo134464a(true)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(this.f122084d.mo134417c(), true);
            bundle.putBoolean(this.f122083c.mo134695c(), true);
            intent = this.f122084d.mo134411a(this.f122090k, this.f122083c.mo134692b(), bundle);
        } else if (this.f122089j == Notice.Extra.ChatMode.THREAD_V2) {
            intent = m191267t();
        } else if (this.f122088i == Notice.Extra.ChatType.P2P || (this.f122088i == Notice.Extra.ChatType.GROUP && !mo169590p())) {
            intent = m191261a(false);
        } else if (this.f122085f.extra.f122005d != Notice.Extra.ChatType.GROUP || !mo169590p()) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(this.f122084d.mo134417c(), true);
            bundle2.putBoolean(this.f122083c.mo134695c(), true);
            intent = this.f122084d.mo134411a(this.f122090k, this.f122083c.mo134692b(), bundle2);
        } else {
            intent = m191261a(true);
        }
        return PendingIntent.getActivity(this.f122090k, (int) SystemClock.uptimeMillis(), intent, 134217728);
    }

    /* renamed from: a */
    private Intent m191261a(boolean z) {
        return this.f122084d.mo134410a(this.f122090k, m191262a(z, new ChatBundle.AbstractC29591b() {
            /* class com.ss.android.lark.notification.p2383f.C48504c.C485062 */

            @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
            public void inject(Bundle bundle) {
                bundle.putBoolean(C48504c.this.f122083c.mo134695c(), true);
                C48504c.this.f122084d.mo134415b(bundle);
            }
        }), 335544320);
    }

    protected C48504c(Notice notice) {
        super(notice);
    }

    /* renamed from: a */
    public static /* synthetic */ void m191263a(ChatBundle.AbstractC29591b bVar, Bundle bundle) {
        if (bVar != null) {
            bVar.inject(bundle);
        }
    }

    /* renamed from: a */
    private Bundle m191262a(boolean z, ChatBundle.AbstractC29591b bVar) {
        return ChatBundle.m109259a().mo105927a(this.f122087h).mo105932b(z).mo105937e(this.f122086g).mo105933c("notification").mo105929a().mo105916a(new ChatBundle.AbstractC29591b() {
            /* class com.ss.android.lark.notification.p2383f.$$Lambda$c$s9MOVgboKC9kefUSDXjfv_9E9Gk */

            @Override // com.ss.android.lark.biz.im.api.ChatBundle.AbstractC29591b
            public final void inject(Bundle bundle) {
                C48504c.lambda$s9MOVgboKC9kefUSDXjfv_9E9Gk(ChatBundle.AbstractC29591b.this, bundle);
            }
        });
    }
}
