package com.bytedance.ee.bear.drive.biz.importfile.request;

import androidx.core.util.C0844e;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveCannotImportBySizeException;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveCannotImportByTypeException;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveFailedImportCanSupportException;
import com.bytedance.ee.bear.drive.biz.importfile.p328b.C6476a;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.loader.download.platform.api.C7058b;
import com.bytedance.ee.bear.drive.loader.download.platform.api.drive.FileInfoV1Puller;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.DriveException;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.a */
public class C6496a {

    /* renamed from: a */
    protected C7128a f17913a = C6920b.m27342f().mo27167b();

    /* renamed from: b */
    private C6923a f17914b = C6920b.m27342f().mo27168c();

    /* renamed from: c */
    private ConnectionService f17915c = C5084ad.m20847d();

    /* renamed from: d */
    private NetService f17916d = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: a */
    public ImportFailedType mo25987a(Throwable th) {
        if (th instanceof DriveFailedImportCanSupportException) {
            return ImportFailedType.FailedCanContactSupport;
        }
        if (th instanceof DriveCannotImportBySizeException) {
            return ImportFailedType.FailedSize;
        }
        if (th instanceof DriveCannotImportByTypeException) {
            return ImportFailedType.FailedType;
        }
        return ImportFailedType.FailedCanRetry;
    }

    public C6496a(C10917c cVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ AbstractC70020b m26076c(Throwable th) throws Exception {
        C13479a.m54764b("CanImportRequester", "getImportType throwable = " + th);
        if (th instanceof DriveException) {
            return AbstractC68307f.m265084a((Throwable) new DriveFailedImportCanSupportException(((DriveException) th).getErrorCode()));
        }
        return AbstractC68307f.m265084a(th);
    }

    /* renamed from: b */
    public C0844e<String, String> mo25989b(Throwable th) {
        String str;
        String str2 = "serverFail";
        if (th instanceof DriveFailedImportCanSupportException) {
            ErrCode errCode = ((DriveFailedImportCanSupportException) th).getErrCode();
            if (errCode == ErrCode.FILE_NOT_FOUND) {
                str = "DEC27";
            } else if (errCode == ErrCode.PERMISSION_DENIED) {
                str = "DEC4";
            } else if (errCode == ErrCode.POLICY_DENIED) {
                str = "DEC15";
            } else if (errCode == ErrCode.OWNER_DELETED_FILE) {
                str = "DEC16";
            } else if (errCode == ErrCode.COPY_TIMEOUT) {
                str = "DEC32";
            } else if (errCode == ErrCode.COPY_FAILED) {
                str = "DEC31";
            } else {
                str = C7128a.m28545b(th);
                return new C0844e<>(str2, str);
            }
        } else if (th instanceof DriveCannotImportBySizeException) {
            str = "DEC12";
        } else if (th instanceof DriveCannotImportByTypeException) {
            str = "DEC11";
        } else if ((th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
            str2 = "overtime";
            str = "DEC2";
            return new C0844e<>(str2, str);
        } else if (this.f17915c.mo20038b() == null || !this.f17915c.mo20038b().mo20041b()) {
            str = "DEC3";
        } else {
            str = C7128a.m28545b(th);
            return new C0844e<>(str2, str);
        }
        str2 = "nativeFail";
        return new C0844e<>(str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Integer m26075a(boolean z, C7086a aVar) throws Exception {
        int a = C6476a.m26019a(aVar.mo27322a().mo27358a());
        if (aVar.mo27322a().f18787c > ((long) (this.f17914b.mo27226h() * 1024 * 1024)) && z) {
            throw new DriveCannotImportBySizeException(aVar);
        } else if (C6476a.m26021a(a)) {
            return Integer.valueOf(a);
        } else {
            throw new DriveCannotImportByTypeException(aVar);
        }
    }

    /* renamed from: a */
    public AbstractC68307f<Integer> mo25988a(String str, boolean z) {
        return C7058b.m28085a(this.f17916d).mo26542a(new FileInfoV1Puller.Params(str, null, null, null, null, null)).mo238026e($$Lambda$a$Mn9LaeDD8vaZ2lzWwLP5RhAD3Jg.INSTANCE).mo238020d(new Function(z) {
            /* class com.bytedance.ee.bear.drive.biz.importfile.request.$$Lambda$a$HPMzH9wYQA7BrllTEzaYxibu84 */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6496a.this.m26075a(this.f$1, (C7086a) obj);
            }
        });
    }
}
