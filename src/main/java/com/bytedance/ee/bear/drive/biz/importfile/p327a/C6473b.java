package com.bytedance.ee.bear.drive.biz.importfile.p327a;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveCannotImportBySizeException;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveCannotImportByTypeException;
import com.bytedance.ee.bear.drive.biz.importfile.p329c.AbstractC6479b;
import com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c;
import com.bytedance.ee.bear.drive.biz.importfile.request.C6497b;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.biz.p326a.C6322a;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.a.b */
public class C6473b extends AbstractC6905a<AbstractC6479b> implements AbstractC6498c.AbstractC6500a {

    /* renamed from: a */
    public ImportFailedType f17878a;

    /* renamed from: b */
    private C6322a f17879b = new C6322a((an) KoinJavaComponent.m268610a(an.class));

    /* renamed from: c */
    private AbstractC6498c f17880c = AbstractC6498c.m26083a();

    /* renamed from: d */
    private C6497b f17881d = new C6497b();

    /* renamed from: e */
    private ImportFileEntity f17882e;

    /* renamed from: f */
    private C7130c f17883f = C6920b.m27342f().mo27166a();

    /* renamed from: g */
    private C10917c f17884g;

    /* renamed from: h */
    private C6923a f17885h = C6920b.m27342f().mo27168c();

    /* renamed from: i */
    private boolean f17886i = false;

    /* renamed from: a */
    public void mo25889a(boolean z) {
        this.f17880c.mo25994a(z);
    }

    public C68289a r_() {
        return this.f17880c.mo25997d();
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c.AbstractC6500a
    /* renamed from: e */
    public void mo25892e() {
        if (mo27154m() != null) {
            ((AbstractC6479b) mo27154m()).mo25879c();
        }
    }

    /* renamed from: c */
    public void mo25890c() {
        this.f17880c.mo25993a(this.f17882e.mo27485a(), this.f17882e.mo27487b());
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d, com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a
    /* renamed from: f */
    public void mo25893f() {
        super.mo25893f();
        this.f17880c.mo25942f();
        ImportFailedType importFailedType = this.f17878a;
        if (importFailedType != null && importFailedType == ImportFailedType.FailedOverLimitCount && !this.f17886i) {
            this.f17883f.mo27927a(false, this.f17882e);
        }
    }

    /* renamed from: a */
    public C6497b mo25882a() {
        this.f17883f.mo27927a(true, this.f17882e);
        this.f17886i = true;
        return this.f17881d;
    }

    /* renamed from: d */
    public void mo25891d() {
        this.f17879b.mo25419b(this.f17882e.mo27485a()).mo238001b($$Lambda$b$CBafdlKjMThv244D_lGOIC1PWnM.INSTANCE, $$Lambda$b$aBrqtPzAm4qUwYkDsfAjf2m3U9k.INSTANCE);
        this.f17884g.mo41508c(ak.class).mo238020d($$Lambda$b$VOljegdNixrrN1fOo4sOuQYu41U.INSTANCE).mo238001b($$Lambda$b$sBjUjl3tsTzwqDVRMQ7XLUoprA.INSTANCE, $$Lambda$b$3ZBmAD6ZYmYRhJ0gxCPEyz5i5Qw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25999a(DocMoreInfo aVar) throws Exception {
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38972a(aVar, "contact");
    }

    /* renamed from: a */
    public String mo25883a(int i) {
        return C10539a.m43639a(mo27152k(), i, "size", String.valueOf(this.f17885h.mo27226h()));
    }

    /* renamed from: a */
    public void mo25884a(LiveData<ConnectionService.NetworkState> liveData) {
        this.f17880c.mo25991a(liveData);
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c.AbstractC6500a
    /* renamed from: a */
    public void mo25885a(final ImportFailedType importFailedType) {
        if (mo27154m() != null) {
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48481e()).mo238018d(new Consumer<String>() {
                /* class com.bytedance.ee.bear.drive.biz.importfile.p327a.C6473b.C64741 */

                /* renamed from: a */
                public void accept(String str) throws Exception {
                    C6473b.this.f17878a = importFailedType;
                    ((AbstractC6479b) C6473b.this.mo27154m()).mo25875a(importFailedType);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo25886a(ImportFileEntity importFileEntity) {
        this.f17882e = importFileEntity;
        this.f17883f.mo27913a(importFileEntity);
        this.f17880c.mo25992a(importFileEntity, this.f17879b, this);
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c.AbstractC6500a
    /* renamed from: a */
    public void mo25888a(Throwable th) {
        if (th instanceof DriveCannotImportBySizeException) {
            ((AbstractC6479b) mo27154m()).mo25872a(((DriveCannotImportBySizeException) th).getFileModel().mo27322a().f18787c);
        } else if (th instanceof DriveCannotImportByTypeException) {
            ((AbstractC6479b) mo27154m()).mo25872a(((DriveCannotImportByTypeException) th).getFileModel().mo27322a().f18787c);
        }
    }

    public C6473b(Context context, C10917c cVar) {
        super(context);
        this.f17884g = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c.AbstractC6500a
    /* renamed from: a */
    public void mo25887a(String str, String str2, String str3) {
        if (mo27154m() != null) {
            if (!C8275a.f22378k.mo32553a().equalsIgnoreCase(str) || TextUtils.isEmpty(str3)) {
                str3 = C6313i.m25327a().mo25382a(str, str2, "imported_file_create");
            }
            ((AbstractC6479b) mo27154m()).mo25876a(str3);
        }
    }
}
