package com.ss.android.lark.littleapp.p2126d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26326z;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.p2126d.p2127a.C41320a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.export.entity.AbstractC48500b;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.utils.UIHelper;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.littleapp.d.b */
public class C41321b extends AbstractC48500b<Notice, C41320a> {

    /* renamed from: a */
    private Notice f105102a;

    /* renamed from: b */
    private String f105103b;

    /* renamed from: c */
    private Context f105104c = C41354g.m163939a().getContext();

    /* renamed from: d */
    private AbstractC41301a.AbstractC41308g f105105d = C41354g.m163939a().getNotificationDependency();

    /* renamed from: e */
    private AbstractC41301a.AbstractC41309h f105106e = C41354g.m163939a().getSettingDependency();

    /* renamed from: f */
    private AbstractC41301a.AbstractC41307f f105107f = C41354g.m163939a().getMainDependency();

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
        return this.f105102a.key;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: g */
    public String mo31130g() {
        return this.f105102a.content;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: k */
    public String mo31134k() {
        return UIHelper.getString(R.string.Lark_Legacy_NewMessage);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: a */
    public void mo31124a() {
        Notice notice = (Notice) mo169588o();
        this.f105102a = notice;
        this.f105103b = notice.messageId;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: c */
    public int mo31126c() {
        return (((int) Long.parseLong(this.f105103b)) % 50001) * 50001;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: j */
    public boolean mo31133j() {
        return this.f105105d.mo144233a(10);
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
    private String m163787q() {
        if (this.f105102a.extra.f122005d == Notice.Extra.ChatType.P2P) {
            return this.f105102a.extra.f122006e;
        }
        return this.f105102a.extra.f122004c;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: f */
    public String mo31129f() {
        String str = this.f105102a.title;
        if (TextUtils.isEmpty(str)) {
            return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_AppNameRelease);
        }
        return str;
    }

    /* renamed from: b */
    public C41320a mo148762b() {
        if (this.f105103b == null) {
            Log.m165383e("LittleAppNotification", "appId is null");
            return null;
        }
        C41320a aVar = (C41320a) mo169587a(new C41320a());
        Bitmap p = m163786p();
        if (p != null) {
            aVar.f105101a = p;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: e */
    public PendingIntent mo31128e() {
        Bundle bundle = new Bundle();
        bundle.putString("appId", this.f105103b);
        bundle.putString("schema", this.f105102a.extra.f122021t);
        bundle.putString("last_notification_seq_id", this.f105102a.extra.f122022u);
        Intent a = this.f105107f.mo144240a(this.f105104c, bundle, 335544320);
        return PendingIntent.getActivity(this.f105104c, (int) SystemClock.uptimeMillis(), a, 134217728);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.notification.export.entity.AbstractC48500b
    /* renamed from: i */
    public Uri mo31132i() {
        if (!this.f105105d.mo144234b(10)) {
            return null;
        }
        return Uri.parse("android.resource://" + this.f105104c.getPackageName() + "/" + R.raw.notification);
    }

    /* renamed from: p */
    private Bitmap m163786p() {
        String str = this.f105102a.extra.f122011j;
        boolean a = this.f105106e.mo144236a(true);
        try {
            if (TextUtils.isEmpty(str) || !a) {
                return BitmapFactory.decodeResource(this.f105104c.getResources(), R.mipmap.app_launcher);
            }
            int dp2px = UIHelper.dp2px(48.0f);
            return ImageLoader.with(this.f105104c).load(AvatarImage.Builder.obtain(str, m163787q(), dp2px, dp2px).build()).asBitmap().centerCrop().error(R.mipmap.app_launcher).getBitmap(dp2px, dp2px);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public C41321b(Notice notice) {
        super(notice);
    }
}
