package com.ss.android.lark.mail.impl.compose.image;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.space.drive.v1.PushUploadCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.LarkUriUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.AbstractC41999i;
import com.ss.android.lark.mail.impl.service.upload.AbstractC43390b;
import java.io.File;

/* renamed from: com.ss.android.lark.mail.impl.compose.image.a */
public abstract class AbstractC42000a<T> {

    /* renamed from: a */
    protected int f106593a;

    /* renamed from: b */
    protected String f106594b;

    /* renamed from: c */
    protected AbstractC41999i<T> f106595c;

    /* renamed from: d */
    protected String f106596d;

    /* renamed from: e */
    protected Uri f106597e;

    /* renamed from: f */
    protected String f106598f;

    /* renamed from: g */
    protected AbstractC43390b f106599g;

    /* renamed from: h */
    protected String f106600h;

    /* renamed from: i */
    protected boolean f106601i;

    /* renamed from: j */
    protected T f106602j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo150987a(long j, long j2) {
        return (int) ((((double) j) / ((double) j2)) * 100.0d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo150777b(String str, long j);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo150779d();

    /* renamed from: e */
    public void mo150988e() {
        mo150990g();
    }

    /* renamed from: f */
    public void mo150989f() {
        mo150990g();
    }

    /* renamed from: h */
    public T mo150991h() {
        return this.f106602j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void mo150774a() {
        C41816b.m166115a().mo150158y().mo150165a(new String[]{this.f106598f});
    }

    /* renamed from: c */
    public void mo150778c() {
        Log.m165389i("AbstractUploadTask", "cancel upload,uuid: " + this.f106594b);
        if (!TextUtils.isEmpty(this.f106598f)) {
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$a$yH7NhZiws8NHQ3Qb7Ias4z2aiI */

                public final void run() {
                    AbstractC42000a.this.mo150774a();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo150990g() {
        if (this.f106597e != null) {
            String a = LarkUriUtil.m95300a(C41816b.m166115a().mo150132b(), this.f106597e);
            if (TextUtils.isEmpty(a)) {
                Log.m165383e("AbstractUploadTask", "uploadFile fileName empty");
                this.f106595c.mo150874a(this.f106594b, null, false, 0);
                return;
            }
            CoreThreadPool.getBackgroundHandler().post(new Runnable(a) {
                /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$a$3TZkIIWS0_P9sxmpuBDLDQsqqk */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AbstractC42000a.this.m167122b(this.f$1);
                }
            });
        } else if (TextUtils.isEmpty(this.f106596d)) {
            Log.m165389i("AbstractUploadTask", "uploadFile file path is empty");
        } else {
            File file = new File(this.f106596d);
            if (!file.exists() || !file.isFile()) {
                Log.m165383e("AbstractUploadTask", "uploadFile file not found");
                this.f106595c.mo150874a(this.f106594b, null, false, 0);
                return;
            }
            String name = file.getName();
            this.f106593a = 1;
            CoreThreadPool.getBackgroundHandler().post(new Runnable(name) {
                /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$a$vw4W533KKSHdP0gPpoBdLUCHRTU */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AbstractC42000a.this.m167121a(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m167122b(String str) {
        this.f106598f = C41816b.m166115a().mo150158y().mo150166a(this.f106597e, str, this.f106600h, "email", this.f106599g);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m167121a(String str) {
        this.f106598f = C41816b.m166115a().mo150158y().mo150169a(this.f106596d, str, this.f106600h, "email", this.f106599g);
    }

    public AbstractC42000a(final AbstractC41999i<T> iVar, Uri uri, String str, final String str2, String str3) {
        this.f106595c = iVar;
        this.f106597e = uri;
        this.f106596d = str;
        this.f106594b = str2;
        this.f106600h = str3;
        Log.m165389i("AbstractUploadTask", "new AbstractUploadTask,uuid :" + str2);
        this.f106599g = new AbstractC43390b() {
            /* class com.ss.android.lark.mail.impl.compose.image.AbstractC42000a.C420011 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.lark.mail.impl.compose.i */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43390b
            public boolean onFailed(String str, int i) {
                Log.m165389i("AbstractUploadTask", "uploadFile fail key :" + str + " error code " + i + " uuid " + str2);
                if (!TextUtils.equals(str, AbstractC42000a.this.f106598f)) {
                    return false;
                }
                AbstractC42000a.this.f106593a = 3;
                AbstractC41999i iVar = iVar;
                if (iVar == 0) {
                    return false;
                }
                iVar.mo150874a(str2, AbstractC42000a.this.mo150779d(), false, 0);
                return false;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.lark.mail.impl.compose.i */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.lark.mail.impl.compose.i */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.lark.mail.impl.service.upload.AbstractC43390b
            public boolean updateProgress(String str, int i, long j, long j2, String str2, String str3) {
                AbstractC41999i iVar;
                if (!TextUtils.equals(str, AbstractC42000a.this.f106598f)) {
                    return false;
                }
                if (i == PushUploadCallback.Status.SUCCESS.getValue()) {
                    Log.m165389i("AbstractUploadTask", "uploadFile updateProgress success ,key " + str + " token " + str2 + " uuid " + str2);
                    AbstractC42000a.this.f106593a = 2;
                    AbstractC41999i iVar2 = iVar;
                    if (iVar2 == 0) {
                        return false;
                    }
                    iVar2.mo150874a(str2, AbstractC42000a.this.mo150777b(str2, j2), true, j2);
                    return false;
                } else if (i == PushUploadCallback.Status.INFLIGHT.getValue()) {
                    int a = AbstractC42000a.this.mo150987a(j, j2);
                    Log.m165389i("AbstractUploadTask", "uploadFile updateProgress update :" + a + " uuid " + str2);
                    if (a < 0) {
                        Log.m165389i("AbstractUploadTask", "uploadFile updateProgress error ");
                        return false;
                    }
                    AbstractC41999i iVar3 = iVar;
                    if (iVar3 == null) {
                        return false;
                    }
                    iVar3.mo150872a(str2, a);
                    return false;
                } else if (i == PushUploadCallback.Status.FAILED.getValue()) {
                    Log.m165389i("AbstractUploadTask", "uploadFile updateProgress fail, uuid " + str2);
                    AbstractC42000a.this.f106593a = 3;
                    AbstractC41999i iVar4 = iVar;
                    if (iVar4 == 0) {
                        return false;
                    }
                    iVar4.mo150874a(str2, AbstractC42000a.this.mo150779d(), false, j2);
                    return false;
                } else if (i != PushUploadCallback.Status.READY.getValue() || (iVar = iVar) == null) {
                    return false;
                } else {
                    iVar.mo150871a();
                    return false;
                }
            }
        };
    }
}
