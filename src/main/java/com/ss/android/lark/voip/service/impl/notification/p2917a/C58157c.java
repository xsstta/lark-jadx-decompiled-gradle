package com.ss.android.lark.voip.service.impl.notification.p2917a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.service.impl.notification.p2917a.p2918a.C58155a;
import com.ss.android.lark.voip.service.impl.util.VoipUtil;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.voip.service.impl.notification.a.c */
public class C58157c extends AbstractC48500b<Notice, C58155a> {

    /* renamed from: a */
    private Context f143061a = C57977a.m224905c().getContext();

    /* renamed from: b */
    private AbstractC57987d.AbstractC57995f f143062b = C57977a.m224905c().getNotificationDependency();

    /* renamed from: c */
    private AbstractC57987d.AbstractC57988a f143063c = C57977a.m224905c().getChatDependency();

    /* renamed from: d */
    private AbstractC57987d.AbstractC57991c f143064d = C57977a.m224905c().getImageDependency();

    /* renamed from: e */
    private Notice f143065e;

    /* renamed from: f */
    private Chatter f143066f;

    /* renamed from: g */
    private Intent f143067g;

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
    /* renamed from: m */
    public int mo31136m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: d */
    public String mo31127d() {
        return this.f143065e.key;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
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
        return this.f143065e.key.hashCode();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f143062b.mo145490a(10004);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: n */
    public String mo31137n() {
        if (!C26326z.m95343g()) {
            return null;
        }
        return "at_v2";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        this.f143065e = (Notice) mo169588o();
        this.f143066f = VoipUtil.m225811f();
        this.f143067g = VoipUtil.m225810e();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        return PendingIntent.getActivity(ar.m236694a(), (int) SystemClock.uptimeMillis(), this.f143067g, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return UIHelper.mustacheFormat((int) R.string.View_E_IncomingEncryptedCallBraces, "name", this.f143063c.mo145505a((OpenChatter) this.f143066f));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f143062b.mo145492b(10004)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f143061a.getPackageName() + "/" + R.raw.notification);
    }

    /* renamed from: b */
    public C58155a mo197067b() {
        C60700b.m235851b("VoipRingNotificationDataPacker", "[buildShowUnitData]", "start");
        if (this.f143065e == null || this.f143066f == null || this.f143067g == null) {
            C60700b.m235864f("VoipRingNotificationDataPacker", "[buildShowUnitData2]", "caller or intent = null");
            return null;
        }
        C58155a aVar = (C58155a) mo169587a(new C58155a());
        aVar.f143060a = m225647a(this.f143066f.getAvatarKey(), this.f143066f.getId());
        C60700b.m235851b("VoipRingNotificationDataPacker", "[buildShowUnitData3]", "end");
        return aVar;
    }

    public C58157c(Notice notice) {
        super(notice);
    }

    /* renamed from: a */
    private Bitmap m225647a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return BitmapFactory.decodeResource(this.f143061a.getResources(), R.mipmap.app_launcher);
            }
            int a = C60773o.m236115a(72.0d);
            return ImageLoader.with(this.f143061a).load(this.f143064d.mo145509a(str, str2, a, a)).asBitmap().centerCrop().error(R.mipmap.app_launcher).getBitmap(a, a);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
