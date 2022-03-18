package com.ss.android.lark.notification.reaction;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.dependency.al;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.reaction.entity.C48564a;
import com.ss.android.lark.notification.reaction.entity.ReactionNotice;
import com.ss.android.lark.utils.UIHelper;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.notification.reaction.c */
public class C48560c extends AbstractC48500b<ReactionNotice, C48564a> {

    /* renamed from: a */
    public static String f122196a;

    /* renamed from: b */
    private Message f122197b;

    /* renamed from: c */
    private Notice f122198c;

    /* renamed from: d */
    private Chat f122199d;

    /* renamed from: e */
    private al f122200e = C29990c.m110930b().mo134596x();

    /* renamed from: f */
    private AbstractC36509x f122201f = C29990c.m110930b().mo134597y();

    /* renamed from: g */
    private AbstractC36474h.AbstractC36486l f122202g = C29990c.m110930b().ad();

    /* renamed from: h */
    private Context f122203h = C29990c.m110930b().mo134528a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: h */
    public int mo31131h() {
        return R.drawable.ic_notify;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: l */
    public int mo31135l() {
        return R.mipmap.app_launcher;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: d */
    public String mo31127d() {
        return this.f122198c.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f122202g.mo134632a(1);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return mo31130g();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return ((int) (Long.parseLong(this.f122198c.messageId) % 10001)) * UpdateDialogStatusCode.DISMISS;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        return this.f122202g.mo134629a(this.f122197b, false, this.f122199d.isThread());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "normal_v2";
    }

    /* renamed from: q */
    private String m191429q() {
        if (this.f122198c.extra.f122005d == Notice.Extra.ChatType.P2P) {
            return this.f122198c.extra.f122006e;
        }
        return this.f122198c.extra.f122004c;
    }

    /* renamed from: b */
    public C48564a mo169639b() {
        if (this.f122197b == null) {
            return null;
        }
        C48564a aVar = (C48564a) mo169587a(new C48564a());
        aVar.f122208a = m191428p();
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: m */
    public int mo31136m() {
        if (this.f122198c.state == 1) {
            return 0;
        }
        if (this.f122198c.state == 2 || this.f122198c.state == 3) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        this.f122197b = ((ReactionNotice) mo169588o()).getMessage();
        this.f122198c = (Notice) mo169588o();
        this.f122199d = ((ReactionNotice) mo169588o()).getChat();
        f122196a = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        if (this.f122198c.state == 2) {
            return UIHelper.getString(R.string.Lark_Legacy_MessageIsrecalled);
        }
        if (this.f122198c.state == 3) {
            return UIHelper.getString(R.string.Lark_Legacy_MessageRemove);
        }
        if (this.f122200e.mo134464a(true)) {
            return this.f122198c.title;
        }
        return f122196a;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f122202g.mo134634b(1)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f122203h.getPackageName() + "/" + R.raw.notification);
    }

    /* renamed from: p */
    private Bitmap m191428p() {
        if (this.f122198c.extra.f122010i) {
            return BitmapFactory.decodeResource(this.f122203h.getResources(), R.mipmap.app_launcher);
        }
        String str = this.f122198c.extra.f122011j;
        boolean a = this.f122200e.mo134464a(true);
        try {
            if (TextUtils.isEmpty(str) || !a) {
                return BitmapFactory.decodeResource(this.f122203h.getResources(), R.mipmap.app_launcher);
            }
            int dp2px = UIHelper.dp2px(48.0f);
            return ImageLoader.with(this.f122203h).load(AvatarImage.Builder.obtain(str, m191429q(), dp2px, dp2px).build()).asBitmap().centerCrop().error(R.mipmap.app_launcher).getBitmap(dp2px, dp2px);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        if (this.f122198c.state != 2 && this.f122198c.state != 3) {
            String str = this.f122198c.content;
            if (this.f122200e.mo134464a(true)) {
                return str;
            }
            if (this.f122199d.isP2PChat()) {
                return UIHelper.getString(R.string.Lark_Legacy_P2pReaction);
            }
            return UIHelper.getString(R.string.Lark_Legacy_GroupReaction);
        } else if (this.f122199d.isP2PChat()) {
            return UIHelper.getString(R.string.Lark_Legacy_P2pReaction);
        } else {
            return UIHelper.getString(R.string.Lark_Legacy_GroupReaction);
        }
    }

    public C48560c(ReactionNotice reactionNotice) {
        super(reactionNotice);
    }
}
