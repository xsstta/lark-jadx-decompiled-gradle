package com.huawei.hms.availableupdate;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.huawei.hms.availableupdate.d */
public class C23469d implements AbstractC23471e {

    /* renamed from: a */
    public final Context f57886a;

    /* renamed from: b */
    public final AbstractC23481k f57887b = new C23480j();

    /* renamed from: c */
    public final C23461a f57888c = new C23461a();

    /* renamed from: d */
    public AbstractC23474f f57889d;

    /* renamed from: e */
    public File f57890e;

    /* renamed from: b */
    public Context mo82126b() {
        return this.f57886a;
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23471e
    /* renamed from: a */
    public void mo82115a() {
        HMSLog.m86966i("UpdateDownload", "Enter cancel.");
        mo82124a((AbstractC23474f) null);
        this.f57887b.mo82154a();
    }

    /* renamed from: com.huawei.hms.availableupdate.d$a */
    public class C23470a extends C23463b {

        /* renamed from: b */
        public long f57891b = 0;

        /* renamed from: c */
        public int f57892c;

        /* renamed from: d */
        public final /* synthetic */ int f57893d;

        /* renamed from: e */
        public final /* synthetic */ String f57894e;

        /* renamed from: a */
        public final void mo82127a(int i) {
            C23469d.this.f57888c.mo82101a(C23469d.this.mo82126b(), i, this.f57894e);
            C23469d.this.mo82123a((C23469d) 2100, i, this.f57893d);
        }

        @Override // com.huawei.hms.availableupdate.C23463b, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            super.write(bArr, i, i2);
            int i3 = this.f57892c + i2;
            this.f57892c = i3;
            if (i3 <= 209715200) {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - this.f57891b) > 1000) {
                    this.f57891b = currentTimeMillis;
                    mo82127a(this.f57892c);
                }
                int i4 = this.f57892c;
                if (i4 == this.f57893d) {
                    mo82127a(i4);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23470a(File file, int i, int i2, String str) {
            super(file, i);
            this.f57893d = i2;
            this.f57894e = str;
            this.f57892c = C23469d.this.f57888c.mo82100a();
        }
    }

    public C23469d(Context context) {
        this.f57886a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final synchronized void mo82124a(AbstractC23474f fVar) {
        this.f57889d = fVar;
    }

    /* renamed from: a */
    public void mo82125a(C23477g gVar) throws C23479i {
        HMSLog.m86966i("UpdateDownload", "Enter downloadPackage.");
        C23463b bVar = null;
        try {
            String str = gVar.f57911b;
            if (TextUtils.isEmpty(str)) {
                HMSLog.m86964e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                mo82123a(2201, 0, 0);
                this.f57887b.close();
                IOUtils.closeQuietly((OutputStream) null);
                return;
            }
            this.f57888c.mo82102a(mo82126b(), str);
            if (!this.f57888c.mo82106b(gVar.f57912c, gVar.f57913d, gVar.f57914e)) {
                this.f57888c.mo82103a(gVar.f57912c, gVar.f57913d, gVar.f57914e);
                bVar = mo82122a(this.f57890e, gVar.f57913d, str);
            } else if (this.f57888c.mo82100a() != this.f57888c.mo82104b()) {
                bVar = mo82122a(this.f57890e, gVar.f57913d, str);
                bVar.mo82111a((long) this.f57888c.mo82100a());
            } else if (FileUtil.verifyHash(gVar.f57914e, this.f57890e)) {
                mo82123a(2000, 0, 0);
                this.f57887b.close();
                IOUtils.closeQuietly((OutputStream) null);
                return;
            } else {
                this.f57888c.mo82103a(gVar.f57912c, gVar.f57913d, gVar.f57914e);
                bVar = mo82122a(this.f57890e, gVar.f57913d, str);
            }
            int a = this.f57887b.mo82153a(gVar.f57912c, bVar, this.f57888c.mo82100a(), this.f57888c.mo82104b(), this.f57886a);
            if (a != 200 && a != 206) {
                HMSLog.m86964e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package, HTTP code: " + a);
                mo82123a(2201, 0, 0);
                this.f57887b.close();
                IOUtils.closeQuietly((OutputStream) bVar);
            } else if (!FileUtil.verifyHash(gVar.f57914e, this.f57890e)) {
                mo82123a(2202, 0, 0);
                this.f57887b.close();
                IOUtils.closeQuietly((OutputStream) bVar);
            } else {
                mo82123a(2000, 0, 0);
                this.f57887b.close();
                IOUtils.closeQuietly((OutputStream) bVar);
            }
        } catch (IOException e) {
            HMSLog.m86964e("UpdateDownload", "In DownloadHelper.downloadPackage, Failed to download." + e.getMessage());
            mo82123a(2201, 0, 0);
        } catch (Throwable th) {
            this.f57887b.close();
            IOUtils.closeQuietly((OutputStream) null);
            throw th;
        }
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23471e
    /* renamed from: a */
    public void mo82116a(AbstractC23474f fVar, C23477g gVar) {
        Checker.checkNonNull(fVar, "callback must not be null.");
        HMSLog.m86966i("UpdateDownload", "Enter downloadPackage.");
        mo82124a(fVar);
        if (gVar == null || !gVar.mo82152a()) {
            HMSLog.m86964e("UpdateDownload", "In downloadPackage, Invalid update info.");
            mo82123a(2201, 0, 0);
        } else if (!"mounted".equals(Environment.getExternalStorageState())) {
            HMSLog.m86964e("UpdateDownload", "In downloadPackage, Invalid external storage for downloading file.");
            mo82123a(2204, 0, 0);
        } else {
            String str = gVar.f57911b;
            if (TextUtils.isEmpty(str)) {
                HMSLog.m86964e("UpdateDownload", "In DownloadHelper.downloadPackage, Download the package,  packageName is null: ");
                mo82123a(2201, 0, 0);
                return;
            }
            Context context = this.f57886a;
            File localFile = UpdateProvider.getLocalFile(context, str + ".apk");
            this.f57890e = localFile;
            if (localFile == null) {
                HMSLog.m86964e("UpdateDownload", "In downloadPackage, Failed to get local file for downloading.");
                mo82123a(2204, 0, 0);
                return;
            }
            File parentFile = localFile.getParentFile();
            if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
                HMSLog.m86964e("UpdateDownload", "In downloadPackage, Failed to create directory for downloading file.");
                mo82123a(2201, 0, 0);
            } else if (parentFile.getUsableSpace() < ((long) (gVar.f57913d * 3))) {
                HMSLog.m86964e("UpdateDownload", "In downloadPackage, No space for downloading file.");
                mo82123a(2203, 0, 0);
            } else {
                try {
                    mo82125a(gVar);
                } catch (C23479i unused) {
                    HMSLog.m86967w("UpdateDownload", "In downloadPackage, Canceled to download the update file.");
                    mo82123a(2101, 0, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public final C23463b mo82122a(File file, int i, String str) throws IOException {
        return new C23470a(file, i, i, str);
    }

    /* renamed from: a */
    public final synchronized void mo82123a(int i, int i2, int i3) {
        AbstractC23474f fVar = this.f57889d;
        if (fVar != null) {
            fVar.mo82117a(i, i2, i3, this.f57890e);
        }
    }
}
