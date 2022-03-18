package com.ss.android.lark.chat.base.model;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29629v;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.MonitorMessageSendCallback;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.dto.p1813b.C36866b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.ImageUtils;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.lark.chat.base.model.a */
public class C32915a {

    /* renamed from: a */
    public MonitorMessageSendCallback f84588a;

    /* renamed from: b */
    public AbstractC32918a f84589b;

    /* renamed from: c */
    public final IInnerMessageService f84590c = C32848e.m126401b();

    /* renamed from: d */
    private final String f84591d;

    /* renamed from: e */
    private final List<String> f84592e;

    /* renamed from: f */
    private boolean f84593f;

    /* renamed from: g */
    private String f84594g;

    /* renamed from: h */
    private String f84595h;

    /* renamed from: i */
    private int f84596i;

    /* renamed from: j */
    private boolean f84597j;

    /* renamed from: k */
    private boolean f84598k;

    /* renamed from: l */
    private Biz f84599l;

    /* renamed from: m */
    private Scene f84600m;

    /* renamed from: n */
    private int f84601n;

    /* renamed from: o */
    private final AbstractC36509x f84602o = C29990c.m110930b().mo134597y();

    /* renamed from: com.ss.android.lark.chat.base.model.a$a */
    public interface AbstractC32918a {
        void onExceedLimitSizeOrReadFail(File file);
    }

    /* renamed from: a */
    private float m126761a(long j) {
        return ((((float) j) * 1.0f) / 1024.0f) / 1024.0f;
    }

    /* renamed from: a */
    public C32915a mo121547a(boolean z) {
        this.f84593f = z;
        return this;
    }

    /* renamed from: a */
    public void mo121548a() {
        C32848e.m126401b().mo121084a().execute(new Runnable() {
            /* class com.ss.android.lark.chat.base.model.$$Lambda$a$UMw5LhemGeeKylsR1EaCdFQlaA */

            public final void run() {
                C32915a.this.m126766b();
            }
        });
    }

    /* renamed from: a */
    public void mo121549a(File file, IGetDataCallback<C36866b> iGetDataCallback) {
        int[] b = C57820d.m224436b(file.getPath());
        String name = file.getName();
        if (m126765a(b)) {
            Log.m165389i("ImageSender", "send image - origin, " + name);
            iGetDataCallback.onSuccess(new C36866b(file, b));
            return;
        }
        Log.m165389i("ImageSender", "send image - origin read fail, " + name);
        iGetDataCallback.onError(new ErrorResult("read origin image failed"));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m126766b() {
        String str;
        boolean z;
        if (!CollectionUtils.isEmpty(this.f84592e)) {
            String str2 = "";
            if (TextUtils.isEmpty(this.f84594g)) {
                str = str2;
            } else {
                str = this.f84594g;
            }
            if (!TextUtils.isEmpty(this.f84595h)) {
                str2 = this.f84595h;
            }
            if (this.f84592e.size() > 1) {
                Log.m165389i("ImageSender", String.format("send multi images, count: %d, keepOrigin: %s", Integer.valueOf(this.f84592e.size()), Boolean.valueOf(this.f84593f)));
            }
            for (String str3 : this.f84592e) {
                if (!TextUtils.isEmpty(str3)) {
                    this.f84588a.mo126558a(Message.Type.IMAGE);
                    final File c = m126767c(str3);
                    if (c == null) {
                        Log.m165383e("ImageSender", "[cipher] image file decrypt failed, original path = " + str3);
                    } else {
                        long c2 = C26311p.m95281c(c);
                        C57820d.C57821a a = C57820d.m224434a(str3);
                        this.f84588a.mo126647a(c2, (long) a.f142420a, (long) a.f142421b, ImageUtils.m224131a(c).getValue(), this.f84593f);
                        if (!C32848e.m126401b().mo121261a(c2, (long) (a.f142420a * a.f142421b), a.f142422c)) {
                            this.f84588a.mo126652k();
                            Log.m165379d("ImageSender", "sendImageMessage mime type:" + a.f142422c);
                            final C29629v.C29630a aVar = (C29629v.C29630a) ((C29629v.C29630a) ((C29629v.C29630a) ((C29629v.C29630a) ((C29629v.C29630a) ((C29629v.C29630a) C29629v.m109556a().mo125332j(this.f84591d)).mo106709g(UUID.randomUUID().toString())).mo125330h(str)).mo125331i(str2)).mo125328c(this.f84596i)).mo106761a(str3).mo106760a(a.f142420a).mo106764b(a.f142421b).mo106762a(false).mo106765b(this.f84593f).mo125334l(this.f84588a.mo126560b());
                            this.f84590c.mo121254a(aVar.mo106763a(), this.f84588a);
                            if (this.f84593f || a.mo196168a()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            m126764a(c, z, new IGetDataCallback<C36866b>() {
                                /* class com.ss.android.lark.chat.base.model.C32915a.C329161 */

                                /* renamed from: a */
                                public void onSuccess(C36866b bVar) {
                                    C32915a.this.f84588a.mo126650a(false, bVar);
                                    C32915a.this.f84590c.mo121267b(aVar.mo106761a(bVar.mo136025c()).mo106760a(bVar.mo136023a()).mo106764b(bVar.mo136024b()).mo106763a(), C32915a.this.f84588a);
                                }

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                    Log.m165389i("ImageSender", "pre process image failed, convert to file: " + errorResult.getDebugMsg());
                                    if (C32915a.this.f84589b != null) {
                                        C32915a.this.f84589b.onExceedLimitSizeOrReadFail(c);
                                    }
                                }
                            });
                        } else if (this.f84589b != null) {
                            Log.m165389i("ImageSender", String.format("send image - exceed size limit, send by file:%.2f, %d, %d, %s, %s", Float.valueOf(m126761a(c2)), Integer.valueOf(a.f142420a), Integer.valueOf(a.f142421b), a.f142422c, c.getName()));
                            this.f84589b.onExceedLimitSizeOrReadFail(c);
                            this.f84588a.mo126650a(true, (C36866b) null);
                        } else {
                            Log.m165383e("ImageSender", "imageCallback is null, so image convert to file failed for " + c.getName());
                            this.f84588a.mo126650a(false, (C36866b) null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C32915a mo121541a(int i) {
        this.f84596i = i;
        return this;
    }

    /* renamed from: b */
    public C32915a mo121550b(int i) {
        this.f84601n = i;
        return this;
    }

    /* renamed from: c */
    public C32915a mo121553c(boolean z) {
        this.f84597j = z;
        return this;
    }

    /* renamed from: b */
    public C32915a mo121551b(String str) {
        this.f84595h = str;
        return this;
    }

    /* renamed from: b */
    public C32915a mo121552b(boolean z) {
        this.f84598k = z;
        return this;
    }

    /* renamed from: a */
    private boolean m126765a(int[] iArr) {
        if (iArr == null || iArr.length < 2 || iArr[0] <= 0 || iArr[1] <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m126763a(File file) {
        this.f84590c.mo121267b(((C29613e.C29615a) ((C29613e.C29615a) C29613e.m109504a().mo125332j(this.f84591d)).mo125328c(this.f84596i)).mo106709g(UUID.randomUUID().toString()).mo106704b(file.getName()).mo106702a(file.getPath()).mo106701a(FileState.UPLOADING).mo106699a(C26311p.m95281c(file)).mo106706d(C26311p.m95279b(file)).mo106703a(), this.f84588a);
    }

    /* renamed from: c */
    private File m126767c(String str) {
        File file = null;
        try {
            file = C36808a.m145210b(new File(str));
            Log.m165389i("ImageSender", "[cipher] file decrypt success, original path = " + str + ", new path = " + file.getAbsolutePath());
            return file;
        } catch (DecryptException unused) {
            Log.m165383e("ImageSender", "[cipher] file decrypt failed, original path = " + str);
            return file;
        }
    }

    /* renamed from: a */
    public C32915a mo121542a(Biz biz) {
        this.f84599l = biz;
        return this;
    }

    /* renamed from: a */
    public C32915a mo121543a(Scene scene) {
        this.f84600m = scene;
        return this;
    }

    /* renamed from: a */
    public C32915a mo121544a(AbstractC32918a aVar) {
        this.f84589b = aVar;
        return this;
    }

    /* renamed from: a */
    public C32915a mo121545a(MonitorMessageSendCallback monitorMessageSendCallback) {
        this.f84588a = monitorMessageSendCallback;
        return this;
    }

    /* renamed from: a */
    public C32915a mo121546a(String str) {
        this.f84594g = str;
        return this;
    }

    /* renamed from: a */
    public static C32915a m126762a(String str, List<String> list) {
        return new C32915a(str, list);
    }

    private C32915a(String str, List<String> list) {
        this.f84591d = str;
        this.f84592e = list;
        this.f84589b = new AbstractC32918a() {
            /* class com.ss.android.lark.chat.base.model.$$Lambda$a$nD6Pk3S_aicMNogFPBpabAoEY */

            @Override // com.ss.android.lark.chat.base.model.C32915a.AbstractC32918a
            public final void onExceedLimitSizeOrReadFail(File file) {
                C32915a.this.m126763a((C32915a) file);
            }
        };
    }

    /* renamed from: a */
    private void m126764a(final File file, boolean z, final IGetDataCallback<C36866b> iGetDataCallback) {
        if (z) {
            mo121549a(file, iGetDataCallback);
            return;
        }
        final String name = file.getName();
        Log.m165389i("ImageSender", "send image - compress start: " + name);
        this.f84602o.mo134736a(C29990c.m110930b().mo134528a(), file, this.f84597j, new IGetDataCallback<C36866b>() {
            /* class com.ss.android.lark.chat.base.model.C32915a.C329172 */

            /* renamed from: a */
            public void onSuccess(C36866b bVar) {
                Log.m165389i("ImageSender", String.format("send image - compress success: %s", name));
                iGetDataCallback.onSuccess(bVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165382e("send image - compress fail, will try to send origin : " + errorResult.getDebugMsg());
                C32915a.this.mo121549a(file, iGetDataCallback);
            }
        });
    }
}
