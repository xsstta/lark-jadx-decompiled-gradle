package com.tt.refer.impl.business.file;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12784c;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.infra.file.Stats;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40645l;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.util.C67586c;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.impl.business.file.log.FileLogManager;
import com.tt.refer.impl.business.file.log.LogItem;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.io.C69104g;
import kotlin.io.OnErrorAction;

/* renamed from: com.tt.refer.impl.business.file.a */
public abstract class AbstractC67918a implements ITTFileService {

    /* renamed from: a */
    static final /* synthetic */ boolean f171068a = true;

    /* renamed from: k */
    private static final SparseArray<String> f171069k = new SparseArray<String>() {
        /* class com.tt.refer.impl.business.file.AbstractC67918a.C679202 */

        {
            put(49152, "socket");
            put(40960, "symbolic_link");
            put(32768, "regular_file");
            put(24576, "block_device");
            put(16384, "directory");
            put(8192, "character_device");
            put(4096, "FIFO_pipe");
        }
    };

    /* renamed from: b */
    private String f171070b = "";

    /* renamed from: c */
    private String f171071c = "";

    /* renamed from: d */
    private String f171072d = "";

    /* renamed from: e */
    private String f171073e = "";

    /* renamed from: f */
    private File f171074f;

    /* renamed from: g */
    private File f171075g;

    /* renamed from: h */
    private File f171076h;

    /* renamed from: i */
    private IAppContext f171077i;

    /* renamed from: j */
    private final Map<String, Boolean> f171078j = new ConcurrentHashMap<String, Boolean>() {
        /* class com.tt.refer.impl.business.file.AbstractC67918a.C679191 */

        {
            put("temp", false);
            put("private_tmp", false);
        }
    };

    /* renamed from: com.tt.refer.impl.business.file.a$a */
    public static class C67921a {

        /* renamed from: a */
        public String f171079a;

        /* renamed from: b */
        public long f171080b;

        /* renamed from: c */
        public long f171081c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.refer.impl.business.file.a$b */
    public interface AbstractC67922b<T> {
        T act() throws TTFileException;
    }

    /* renamed from: q */
    private String m264305q() {
        return "/codeRootPath";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo50170a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo50171b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract long mo50172c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo50173d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo50174e();

    /* renamed from: a */
    public C67921a mo235597a(String str) {
        File file = new File(mo235615c(str));
        if (!mo235623e(file) || !file.exists()) {
            return null;
        }
        C67921a aVar = new C67921a();
        aVar.f171079a = str;
        aVar.f171080b = mo235596a(file);
        aVar.f171081c = mo235608b(file);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50369a(File file, String str) {
        if (!this.f171078j.get(str).booleanValue()) {
            synchronized (AbstractC67918a.class) {
                if (!this.f171078j.get(str).booleanValue()) {
                    this.f171078j.put(str, Boolean.valueOf((boolean) f171068a));
                    long currentTimeMillis = System.currentTimeMillis();
                    IOUtils.clearDir(file);
                    AppBrandLogger.m52830i("AbsFileManager", "clearTempDir cost time == ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "dir:" + file.getPath());
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo235601a(long j) {
        long dirSizeNonRecursive = IOUtils.getDirSizeNonRecursive(mo235637j());
        if (j + dirSizeNonRecursive <= mo50172c()) {
            return false;
        }
        AppBrandLogger.m52830i("user dir size:" + dirSizeNonRecursive + " prepareSaveSize:" + j + " user dir limit size:" + mo50172c(), new Object[0]);
        return f171068a;
    }

    /* renamed from: a */
    public String mo235598a(String str, String str2, StringBuilder sb) {
        File file;
        String c = mo235615c(str);
        if (TextUtils.isEmpty(str2)) {
            File j = mo235637j();
            file = new File(j, System.currentTimeMillis() + IOUtils.getFileExtension(c));
        } else {
            file = new File(mo235615c(str2));
        }
        File file2 = new File(c);
        if (!mo235623e(file2)) {
            sb.append(String.format("permission denied, %s %s", "saveFile", str));
            return null;
        } else if (!mo235627f(file)) {
            sb.append(String.format("permission denied, %s %s", "saveFile", str2));
            return null;
        } else if (!file2.exists()) {
            sb.append(String.format("no such file or directory, %s %s", "saveFile", str));
            return null;
        } else if (!file.getParentFile().exists()) {
            try {
                sb.append(String.format("no such file or directory, %s %s", "saveFile", mo235609b(file.getParentFile().getCanonicalPath())));
            } catch (IOException e) {
                sb.append(String.format("no such file or directory, %s %s", "saveFile", mo235609b(file.getParent())));
                AppBrandLogger.stacktrace(5, "AbsFileManager", e.getStackTrace());
            }
            return null;
        } else if (mo235601a(file2.length())) {
            sb.append("user dir saved file size limit exceeded");
            return null;
        } else if (TextUtils.equals(str, str2)) {
            AppBrandLogger.m52828d("AbsFileManager", "TextUtils.equals(tempPath, targetFilePath)");
            return mo235618d(file);
        } else if (IOUtils.copyFile(new File(c), file, false) == 0) {
            return mo235618d(file);
        } else {
            sb.append("copy file fail");
            return null;
        }
    }

    /* renamed from: a */
    private String m264276a(String str, String str2, String str3) {
        String substring = str.substring(str3.length());
        if (TextUtils.isEmpty(substring) || !substring.startsWith(File.separator)) {
            return str2 + File.separator + str.substring(str3.length());
        }
        return str2 + str.substring(str3.length());
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235603a(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("fileExist", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar, "fileExist") {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$e8IhLTXtidyeJ75wKXzI_WtJjv0 */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264267a(this.f$1, this.f$2, this.f$3);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public byte[] mo235613b(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return mo235607a(gVar, (Long) null, (Long) null, (Long) null, hVar);
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public byte[] mo235607a(TTFile gVar, Long l, Long l2, Long l3, TTFileContext hVar) {
        return (byte[]) m264274a("readFile", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar, "readFile", l, l2, l3) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$1G7hdQ07CNGnCsgnr9bwDmz0WX4 */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ Long f$4;
            public final /* synthetic */ Long f$5;
            public final /* synthetic */ Long f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264281a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ byte[] m264281a(TTFile gVar, TTFileContext hVar, String str, Long l, Long l2, Long l3) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (mo235626f(gVar, hVar.mo235659a(str))) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (!mo235603a(gVar, hVar.mo235659a(str))) {
                throw new TTFileException(TTFileError.f171110l, gVar);
            } else if (!mo235629g(gVar, hVar)) {
                if (l == null) {
                    l = 0L;
                }
                long a = m264265a(gVar);
                if (l2 == null) {
                    l2 = Long.valueOf(a - l.longValue());
                }
                if (l.longValue() < 0 || (l.longValue() > 0 && l.longValue() >= a)) {
                    throw new TTFileException(TTParamError.f171125b, gVar);
                } else if (l2.longValue() < 0 || l2.longValue() > a) {
                    throw new TTFileException(TTParamError.f171124a, gVar);
                } else {
                    AppBrandLogger.m52830i("AbsFileManager", "threshold", l3);
                    if (l3 != null && l3.longValue() > 0 && l2.longValue() > l3.longValue()) {
                        throw new TTFileException(TTFileError.f171118t, gVar);
                    } else if (file.exists()) {
                        AppBrandLogger.m52830i("AbsFileManager", "read in local dir");
                        return C67070z.m261396a(m264282b(gVar, file).getAbsolutePath(), l.longValue(), l2.longValue());
                    } else {
                        AppBrandLogger.m52830i("AbsFileManager", "read in pkg");
                        return StreamLoader.loadByteFromStream(gVar.mo235647a(), mo235641m());
                    }
                }
            } else {
                throw new TTFileException(TTFileError.f171115q, gVar);
            }
        } else {
            throw new TTFileException(TTFileError.f171108j, gVar);
        }
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public void mo235600a(byte[] bArr, TTFile gVar, TTFileContext hVar) throws TTFileException {
        m264274a("writeFile", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar, bArr) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$3ZxogOvy60hdNQs0nnY24H5ap58 */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;
            public final /* synthetic */ byte[] f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264273a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Object m264273a(TTFile gVar, TTFileContext hVar, byte[] bArr) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (!mo235617c(gVar, false, hVar.mo235659a("writeFile"))) {
            throw new TTFileException(TTFileError.f171109k, gVar);
        } else if (bArr == null) {
            throw new TTFileException(TTBizError.f171092a, gVar);
        } else if (!mo235603a(gVar, hVar.mo235659a("writeFile"))) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (!file.getParentFile().exists()) {
                throw new TTFileException(TTFileError.f171112n, gVar);
            } else if (!mo235601a((long) bArr.length)) {
                try {
                    C67070z.m261393a(file.getAbsolutePath(), bArr);
                    m264280a(file, hVar.mo235660b(), "writeFile");
                    m264279a(gVar, file);
                    return null;
                } catch (IOException e) {
                    throw new TTFileException(TTSystemError.f171128a, gVar, e);
                }
            } else {
                throw new TTFileException(TTFileError.f171117s, gVar);
            }
        } else {
            throw new TTFileException(TTFileError.f171111m, gVar);
        }
    }

    /* renamed from: a */
    private void m264280a(File file, String str, String str2) {
        File[] listFiles;
        if (file.isFile()) {
            FileLogManager.m264460a(m264266a(file, file.length(), str2, str, mo235618d(file)));
        } else if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                m264280a(file2, str, str2);
            }
        }
    }

    /* renamed from: a */
    private void m264279a(TTFile gVar, File file) {
        if (!TTFileHelper.m264257a().isEncryptDisable()) {
            try {
                C12784c.m52843a(file);
            } catch (EncryptException e) {
                AppBrandLogger.m52829e("AbsFileManager", "encryptFile Exception", e);
                throw new TTFileException(TTFileError.f171120v, gVar, e);
            }
        }
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public void mo235599a(ByteBuffer byteBuffer, TTFile gVar, TTFileContext hVar) throws TTFileException {
        m264274a("writeFile", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar, byteBuffer) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$NPTtJ3RHy8Y9GT3bDpTYXrTuVTg */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;
            public final /* synthetic */ ByteBuffer f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264272a(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Object m264272a(TTFile gVar, TTFileContext hVar, ByteBuffer byteBuffer) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (!mo235617c(gVar, false, hVar.mo235659a("writeFile"))) {
            throw new TTFileException(TTFileError.f171109k, gVar);
        } else if (byteBuffer == null) {
            throw new TTFileException(TTBizError.f171092a, gVar);
        } else if (!mo235603a(gVar, hVar)) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (!file.getParentFile().exists()) {
                throw new TTFileException(TTFileError.f171112n, gVar);
            } else if (!mo235601a(C67070z.m261384a(byteBuffer))) {
                C67070z.m261395a(file.getAbsolutePath(), byteBuffer);
                m264279a(gVar, file);
                return null;
            } else {
                throw new TTFileException(TTFileError.f171117s, gVar);
            }
        } else {
            throw new TTFileException(TTFileError.f171111m, gVar);
        }
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235604a(TTFile gVar, boolean z, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("createDirectory", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar, z) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$D7ePBZrj6FOOfNRBptvOOV57yxc */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264284b(this.f$1, this.f$2, this.f$3);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235602a(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("copyFile", gVar, gVar2, hVar, new AbstractC67922b(gVar, gVar2, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$mzQR5V6r47WTs3SeMpsLXPsqo4E */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFile f$2;
            public final /* synthetic */ TTFileContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264294g(this.f$1, this.f$2, this.f$3);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235605a(File file, TTFile gVar, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("copySystemFile", (TTFile) null, gVar, hVar, new AbstractC67922b(file, gVar, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$XZiLUrgN9ukBywnlvq27LLB7frs */
            public final /* synthetic */ File f$1;
            public final /* synthetic */ TTFile f$2;
            public final /* synthetic */ TTFileContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264288c(this.f$1, this.f$2, this.f$3);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: a */
    public boolean mo235606a(InputStream inputStream, TTFile gVar, TTFileContext hVar) {
        return ((Boolean) m264274a("copySystemFile", (TTFile) null, gVar, hVar, new AbstractC67922b(inputStream, gVar, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$BDkj5rMHsMLH_6ehi8icd34Q4V4 */
            public final /* synthetic */ InputStream f$1;
            public final /* synthetic */ TTFile f$2;
            public final /* synthetic */ TTFileContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264285b(this.f$1, this.f$2, this.f$3);
            }
        })).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Object m264271a(TTFile gVar, TTFile gVar2, TTFileContext hVar, String str) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            AppBrandLogger.m52830i("AbsFileManager", "srcTTFile is invalid: " + gVar);
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (gVar2 == null || gVar2.mo235650d()) {
            AppBrandLogger.m52830i("AbsFileManager", "destTTFile is invalid: " + gVar2);
            throw new TTFileException(TTBizError.f171093b, gVar2);
        } else if (!mo235626f(gVar, hVar.mo235659a(str))) {
            throw new TTFileException(TTFileError.f171108j, gVar);
        } else if (!mo235617c(gVar2, false, hVar.mo235659a(str))) {
            throw new TTFileException(TTFileError.f171109k, gVar2);
        } else if (!mo235603a(gVar, hVar.mo235659a(str))) {
            throw new TTFileException(TTFileError.f171110l, gVar);
        } else if (!mo235629g(gVar, hVar.mo235659a(str))) {
            String c = mo235615c(gVar.mo235647a());
            File c2 = m264286c(gVar, new File(c));
            if (c2.getAbsolutePath().equals(c)) {
                AppBrandLogger.m52830i("AbsFileManager", "targetFile is not encrypted");
                mo235610b(gVar, gVar2, hVar.mo235659a(str));
                return null;
            }
            mo235612b(c2, gVar2, hVar.mo235659a(str));
            return null;
        } else {
            throw new TTFileException(TTFileError.f171115q, gVar);
        }
    }

    /* renamed from: a */
    private <T> T m264274a(String str, TTFile gVar, TTFile gVar2, TTFileContext hVar, AbstractC67922b<T> bVar) throws TTFileException {
        int i;
        Object obj;
        OPMonitor oPMonitor = new OPMonitor(C40645l.f103104b);
        oPMonitor.timing();
        if (hVar.mo235658a() != null) {
            oPMonitor.tracing(hVar.mo235658a());
        }
        oPMonitor.addCategoryValue("tag", hVar.mo235660b());
        oPMonitor.addCategoryValue("primitive_api", str);
        Object obj2 = null;
        int i2 = 0;
        if (gVar != null) {
            String a = gVar.mo235647a();
            if (a == null) {
                i = 0;
            } else {
                i = a.length();
            }
            oPMonitor.addCategoryValue("src_file_path_length", Integer.valueOf(i)).addCategoryValue("src_file_last_path_componment_length", Integer.valueOf(gVar.mo235654h() == null ? 0 : gVar.mo235654h().length())).addCategoryValue("src_file_extension", gVar.mo235656j());
            if (a != null) {
                if (a == null) {
                    obj = null;
                } else {
                    obj = C67070z.m261398b(a.getBytes());
                }
                oPMonitor.addCategoryValue("src_file_path", obj);
            }
        }
        if (gVar2 != null) {
            String a2 = gVar2.mo235647a();
            OPMonitor addCategoryValue = oPMonitor.addCategoryValue("dest_file_path_length", a2 == null ? 0 : a2);
            if (gVar2.mo235654h() != null) {
                i2 = gVar2.mo235654h().length();
            }
            addCategoryValue.addCategoryValue("dest_file_last_path_componment_length", Integer.valueOf(i2)).addCategoryValue("dest_file_extension", gVar2.mo235656j());
            if (a2 != null) {
                if (a2 != null) {
                    obj2 = C67070z.m261398b(a2.getBytes());
                }
                oPMonitor.addCategoryValue("dest_file_path", obj2);
            }
        }
        if (m264295g("ecosystem.filesystem.extra_timing.before")) {
            long currentTimeMillis = System.currentTimeMillis();
            if (gVar != null) {
                m264278a(oPMonitor, gVar.mo235647a(), "src_file_exist_before", "src_file_size_before", "src_file_type_before");
            }
            if (gVar2 != null) {
                m264278a(oPMonitor, gVar2.mo235647a(), "dest_file_exist_before", "dest_file_size_before", "dest_file_type_before");
            }
            oPMonitor.addMetricValue("extra_info_timing_before", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        try {
            T act = bVar.act();
            oPMonitor.setResultTypeSuccess();
            oPMonitor.timing();
            oPMonitor.addCommonParams(m264307s());
            if (m264295g("ecosystem.filesystem.extra_timing.after")) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (gVar != null) {
                    m264278a(oPMonitor, gVar.mo235647a(), "src_file_exist_after", "src_file_size_after", "src_file_type_after");
                }
                if (gVar2 != null) {
                    m264278a(oPMonitor, gVar2.mo235647a(), "dest_file_exist_after", "dest_file_size_after", "dest_file_type_after");
                }
                oPMonitor.addMetricValue("extra_info_timing_after", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
            }
            oPMonitor.flush();
            return act;
        } catch (TTFileException e) {
            oPMonitor.setError(e);
            oPMonitor.addCategoryValue("error_code", Integer.valueOf(e.getTtFileError().mo235661a()));
            oPMonitor.addCategoryValue("error_domain", "ecosystem.filesystem.error");
            if (e.getTtFileError() instanceof TTSystemError) {
                oPMonitor.addCategoryValue("error_code", Integer.valueOf(TTFileError.f171106h.mo235661a()));
                oPMonitor.addCategoryValue("system_error_msg", e.getCause() == null ? e.getMessage() : e.getCause().getMessage());
                oPMonitor.addCategoryValue("system_error_code", Integer.valueOf(e.getTtFileError().mo235661a()));
            } else if (e.getTtFileError() instanceof TTBizError) {
                oPMonitor.addCategoryValue("error_code", Integer.valueOf(TTFileError.f171107i.mo235661a()));
                oPMonitor.addCategoryValue("biz_error_code", Integer.valueOf(e.getTtFileError().mo235661a()));
            } else if (e.getTtFileError() instanceof TTParamError) {
                oPMonitor.addCategoryValue("error_msg", "invalid param, " + ((TTParamError) e.getTtFileError()).mo235663b());
            }
            oPMonitor.setResultTypeFail();
            oPMonitor.timing();
            oPMonitor.addCommonParams(m264307s());
            throw e;
        } catch (Exception e2) {
            oPMonitor.setError(e2);
            oPMonitor.addCategoryValue("error_domain", "ecosystem.filesystem.error");
            oPMonitor.addCategoryValue("error_code", Integer.valueOf(TTFileError.f171106h.mo235661a()));
            oPMonitor.addCategoryValue("system_error_msg", e2.getCause() == null ? e2.getMessage() : e2.getCause().getMessage());
            oPMonitor.setResultTypeFail();
            oPMonitor.timing();
            oPMonitor.addCommonParams(m264307s());
            throw e2;
        } catch (Throwable th) {
            if (m264295g("ecosystem.filesystem.extra_timing.after")) {
                long currentTimeMillis3 = System.currentTimeMillis();
                if (gVar != null) {
                    m264278a(oPMonitor, gVar.mo235647a(), "src_file_exist_after", "src_file_size_after", "src_file_type_after");
                }
                if (gVar2 != null) {
                    m264278a(oPMonitor, gVar2.mo235647a(), "dest_file_exist_after", "dest_file_size_after", "dest_file_type_after");
                }
                oPMonitor.addMetricValue("extra_info_timing_after", Long.valueOf(System.currentTimeMillis() - currentTimeMillis3));
            }
            oPMonitor.flush();
            throw th;
        }
    }

    /* renamed from: a */
    private void m264278a(OPMonitor oPMonitor, String str, String str2, String str3, String str4) {
        File file = new File(mo235615c(str));
        oPMonitor.addCategoryValue(str2, Boolean.valueOf(file.exists()));
        if (file.exists()) {
            Stats fileStats = Stats.getFileStats(file.getAbsolutePath());
            if (fileStats != null) {
                oPMonitor.addCategoryValue(str3, Long.valueOf(fileStats.getSize()));
                oPMonitor.addCategoryValue(str4, m264275a(fileStats.getMode()));
                return;
            }
            AppBrandLogger.m52829e("AbsFileManager", "stats is null, file:" + file);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public IAppContext mo235641m() {
        return this.f171077i;
    }

    /* renamed from: j */
    public File mo235637j() {
        File f = m264292f("user");
        SandboxInfoReporter.m264431a(f, this.f171077i);
        return f;
    }

    /* renamed from: f */
    public File mo235625f() {
        if (this.f171076h == null) {
            this.f171076h = new File(C12791h.m52861a(this.f171077i.getApplicationContext()), mo50170a());
        }
        return this.f171076h;
    }

    /* renamed from: h */
    public File mo235631h() {
        File f = m264292f("temp");
        mo50369a(f, "temp");
        SandboxInfoReporter.m264432a("temp", f, this.f171077i, new Runnable(f) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$YiouEI8MbwzcAOZR9ENQEUrNXU0 */
            public final /* synthetic */ File f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                AbstractC67918a.m264289c(this.f$0);
            }
        });
        return f;
    }

    /* renamed from: i */
    public File mo235634i() {
        File f = m264292f("private_tmp");
        mo50369a(f, "private_tmp");
        SandboxInfoReporter.m264432a("private_tmp", f, this.f171077i, new Runnable(f) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$lSZaufFhMO3666VkP0NZt1GQaA4 */
            public final /* synthetic */ File f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                AbstractC67918a.m264289c(this.f$0);
            }
        });
        return f;
    }

    /* renamed from: k */
    public File mo235639k() {
        if (this.f171075g == null) {
            File file = new File(this.f171077i.getApplicationContext().getFilesDir(), mo50171b());
            m264289c(file);
            this.f171075g = file;
        }
        return this.f171075g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AbstractC67722a.AbstractC67723a mo235642n() {
        return (AbstractC67722a.AbstractC67723a) ((AbstractC67722a) this.f171077i.findServiceByInterface(AbstractC67722a.class)).mo235130i();
    }

    /* renamed from: o */
    private String m264303o() {
        if (TextUtils.isEmpty(this.f171070b)) {
            try {
                this.f171070b = mo235631h().getCanonicalPath();
            } catch (IOException e) {
                AppBrandLogger.m52829e("AbsFileManager", "get temp file path ", e);
            }
        }
        return this.f171070b;
    }

    /* renamed from: p */
    private String m264304p() {
        if (TextUtils.isEmpty(this.f171072d)) {
            try {
                this.f171072d = mo235637j().getCanonicalPath();
            } catch (IOException e) {
                AppBrandLogger.m52829e("AbsFileManager", "get user file path ", e);
            }
        }
        return this.f171072d;
    }

    /* renamed from: r */
    private String m264306r() {
        if (TextUtils.isEmpty(this.f171073e)) {
            try {
                this.f171073e = C12791h.m52865c(this.f171077i.getApplicationContext()).getCanonicalPath();
            } catch (IOException e) {
                AppBrandLogger.m52829e("AbsFileManager", "get root file path ", e);
            }
        }
        return this.f171073e;
    }

    /* renamed from: s */
    private HashMap m264307s() {
        IAppContext iAppContext = this.f171077i;
        if (iAppContext == null) {
            AppBrandLogger.m52829e("AbsFileManager", "appContext is null");
            return new HashMap();
        }
        AbstractC67796c cVar = (AbstractC67796c) iAppContext.findServiceByInterface(AbstractC67796c.class);
        if (cVar != null) {
            return cVar.mo88674b();
        }
        AppBrandLogger.m52829e("AbsFileManager", "infoService is null");
        return new HashMap();
    }

    /* renamed from: l */
    public File mo235640l() {
        File file = this.f171074f;
        if (file != null) {
            return file;
        }
        String e = mo50174e();
        if (TextUtils.isEmpty(e)) {
            return mo235639k();
        }
        File file2 = new File(mo235639k(), e);
        m264289c(file2);
        this.f171074f = file2;
        return file2;
    }

    /* renamed from: g */
    public List<C67921a> mo235628g() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = mo235637j().listFiles();
        if (listFiles == null) {
            AppBrandLogger.m52830i("AbsFileManager", "user dir is not a director:" + m264304p());
            return arrayList;
        }
        for (File file : listFiles) {
            C67921a aVar = new C67921a();
            aVar.f171080b = mo235596a(file);
            aVar.f171079a = mo235618d(file);
            aVar.f171081c = mo235608b(file);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo235596a(File file) {
        return file.lastModified();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo235608b(File file) {
        return file.length();
    }

    /* renamed from: a */
    private static String m264275a(int i) {
        return f171069k.get(i & 61440, "unknown");
    }

    /* renamed from: d */
    public boolean mo235621d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("ttfile://user");
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo235624e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("ttfile://temp");
        }
        return false;
    }

    public AbstractC67918a(IAppContext iAppContext) {
        this.f171077i = iAppContext;
    }

    /* renamed from: g */
    private boolean m264295g(String str) {
        AbstractC67724a aVar = (AbstractC67724a) this.f171077i.findServiceByInterface(AbstractC67724a.class);
        if (aVar != null) {
            return aVar.mo50456b(str);
        }
        AppBrandLogger.m52829e("AbsFileManager", "hostService == null");
        return false;
    }

    /* renamed from: d */
    public String mo235618d(File file) {
        try {
            return mo235609b(file.getCanonicalPath());
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "AbsFileManager", e.getStackTrace());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Boolean m264290d(TTFile gVar) throws TTFileException {
        if (gVar != null && !gVar.mo235650d()) {
            return Boolean.valueOf(mo235623e(new File(mo235615c(gVar.mo235647a()))));
        }
        throw new TTFileException(TTBizError.f171093b, gVar);
    }

    /* renamed from: j */
    public boolean mo235638j(File file) {
        try {
            if (mo235630g(file)) {
                return false;
            }
            String canonicalPath = file.getCanonicalPath();
            if (!TextUtils.isEmpty(canonicalPath)) {
                return canonicalPath.startsWith(m264304p());
            }
            return false;
        } catch (IOException e) {
            AppBrandLogger.m52829e("AbsFileManager", "isFileInUser exception, file:" + file, e);
        }
    }

    /* renamed from: a */
    private long m264265a(TTFile gVar) {
        File file = new File(mo235615c(gVar.mo235647a()));
        if (file.exists()) {
            AppBrandLogger.m52830i("AbsFileManager", "local file length:" + file.length());
            return m264282b(gVar, file).length();
        }
        TTAPkgFile findFile = StreamLoader.findFile(gVar.mo235647a(), this.f171077i);
        if (findFile != null) {
            AppBrandLogger.m52830i("AbsFileManager", "pkg file length:" + findFile.getSize());
            return (long) findFile.getSize();
        }
        AppBrandLogger.m52830i("AbsFileManager", "file not exists in getTTFileLength");
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m264283b(TTFile gVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        }
        File file = new File(mo235615c(gVar.mo235647a()));
        if (!file.exists()) {
            return false;
        }
        long fileLength = IOUtils.fileLength(file);
        if (fileLength != -1) {
            return Boolean.valueOf(mo235601a(fileLength));
        }
        AppBrandLogger.m52830i("AbsFileManager", "file length calculation timeout");
        return Boolean.valueOf((boolean) f171068a);
    }

    /* renamed from: f */
    private File m264292f(String str) {
        String str2;
        String e = mo50174e();
        boolean isEmpty = TextUtils.isEmpty(e) ^ f171068a;
        File f = mo235625f();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        if (isEmpty) {
            str2 = e + File.separator + mo50173d();
        } else {
            str2 = mo50173d();
        }
        sb.append(str2);
        File file = new File(f, sb.toString());
        if ("user".equals(str)) {
            SandboxInfoReporter.m264432a(str, file, this.f171077i, new Runnable(file) {
                /* class com.tt.refer.impl.business.file.$$Lambda$a$5FKCOIfyPbz5J59gkSDvZYYLoo0 */
                public final /* synthetic */ File f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    AbstractC67918a.m264289c(this.f$0);
                }
            });
        } else {
            m264289c(file);
        }
        return file;
    }

    /* renamed from: h */
    public boolean mo235633h(File file) {
        try {
            return mo235631h().equals(file);
        } catch (Exception e) {
            AppBrandLogger.m52829e("AbsFileManager", "isTempDir exception, file:" + file, e);
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo235636i(File file) {
        try {
            if (mo235633h(file)) {
                return false;
            }
            String canonicalPath = file.getCanonicalPath();
            if (!TextUtils.isEmpty(canonicalPath)) {
                return canonicalPath.startsWith(m264303o());
            }
            return false;
        } catch (IOException e) {
            AppBrandLogger.m52829e("AbsFileManager", "isFileInTemp exception, file:" + file, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean m264287c(TTFile gVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        }
        File file = new File(mo235615c(gVar.mo235647a()));
        boolean isDirectory = file.isDirectory();
        boolean isDirectoryOfPkg = StreamLoader.isDirectoryOfPkg(gVar.mo235647a(), mo235641m());
        boolean z = f171068a;
        AppBrandLogger.m52830i("AbsFileManager", "isDirectory:" + isDirectory + " file:" + file.getAbsolutePath());
        AppBrandLogger.m52830i("AbsFileManager", "isDirectoryOfPkg:" + isDirectoryOfPkg + " file:" + gVar.mo235647a());
        if (!isDirectory && !isDirectoryOfPkg) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public boolean mo235630g(File file) {
        try {
            return mo235637j().equals(file);
        } catch (Exception e) {
            AppBrandLogger.m52829e("AbsFileManager", "isUserDir exception, file:" + file, e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m264289c(File file) {
        AppBrandLogger.m52830i("AbsFileManager", "ensure dir:" + file);
        synchronized (AbstractC67918a.class) {
            if (file.exists() && !file.isDirectory()) {
                AppBrandLogger.m52829e("AbsFileManager", "dirty dir, dir is not dir, dir:" + file);
                if (!file.delete()) {
                    AppBrandLogger.m52829e("AbsFileManager", "dirty dir delete failed, dir:" + file);
                }
            }
            if (!file.exists() && !file.mkdirs()) {
                AppBrandLogger.m52829e("AbsFileManager", "dir create failed:" + file.getAbsolutePath());
            }
        }
    }

    /* renamed from: e */
    public boolean mo235623e(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            if (TextUtils.isEmpty(canonicalPath)) {
                return false;
            }
            if (!TextUtils.equals(canonicalPath, m264304p())) {
                if (!canonicalPath.startsWith(m264304p() + File.separator)) {
                    if (!TextUtils.equals(canonicalPath, m264303o())) {
                        if (!canonicalPath.startsWith(m264303o() + File.separator)) {
                            if (!TextUtils.equals(canonicalPath, m264305q())) {
                                if (canonicalPath.startsWith(m264305q() + File.separator)) {
                                    return f171068a;
                                }
                                return false;
                            }
                        }
                    }
                }
            }
            return f171068a;
        } catch (IOException e) {
            AppBrandLogger.stacktrace(6, "AbsFileManager", e.getStackTrace());
        }
    }

    /* renamed from: f */
    public boolean mo235627f(File file) {
        try {
            if (mo235630g(file)) {
                return false;
            }
            String canonicalPath = file.getCanonicalPath();
            if (TextUtils.isEmpty(canonicalPath)) {
                return false;
            }
            if (canonicalPath.startsWith(m264304p() + File.separator)) {
                return f171068a;
            }
            return false;
        } catch (IOException e) {
            AppBrandLogger.m52829e("AbsFileManager", "canWrite exception, file:" + file, e);
        }
    }

    /* renamed from: b */
    public String mo235609b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(m264304p())) {
            return "ttfile://user" + str.substring(m264304p().length());
        } else if (str.startsWith(m264303o())) {
            return "ttfile://temp" + str.substring(m264303o().length());
        } else if (TextUtils.isEmpty(m264305q()) || !str.startsWith(m264305q())) {
            return str;
        } else {
            if (str.length() - m264305q().length() > 0) {
                return str.substring(m264305q().length() + 1);
            }
            return str.substring(m264305q().length());
        }
    }

    /* renamed from: c */
    public String mo235615c(String str) {
        if (TextUtils.isEmpty(str)) {
            return m264305q();
        }
        if (str.startsWith("ttfile://user")) {
            return m264276a(str, m264304p(), "ttfile://user");
        }
        if (str.startsWith("ttfile://temp")) {
            return m264276a(str, m264303o(), "ttfile://temp");
        }
        if (str.startsWith("http") || str.startsWith(m264305q()) || str.startsWith(m264304p()) || str.startsWith(m264303o()) || str.startsWith(m264306r())) {
            return str;
        }
        return m264305q() + File.separator + str;
    }

    /* renamed from: b */
    private File m264282b(TTFile gVar, File file) {
        if (!TTFileHelper.m264257a().isDecryptDisable()) {
            return m264286c(gVar, file);
        }
        return file;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ OnErrorAction m264277a(File file, IOException iOException) {
        AppBrandLogger.m52829e("AbsFileManager", "file exception", file, iOException);
        return OnErrorAction.TERMINATE;
    }

    /* renamed from: c */
    private File m264286c(TTFile gVar, File file) {
        try {
            return C12784c.m52845b(file);
        } catch (DecryptException e) {
            AppBrandLogger.m52830i("AbsFileManager", "getDecryptFile Exception", e);
            throw new TTFileException(TTFileError.f171121w, gVar, e);
        }
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: e */
    public List<String> mo235622e(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return (List) m264274a("listContents", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$KwaziVySKz6BKMjMg4x2sdJ1gZ8 */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264297k(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m264269a(TTFile gVar, boolean z) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        }
        File file = new File(mo235615c(gVar.mo235647a()));
        if (mo235627f(file)) {
            return Boolean.valueOf((boolean) f171068a);
        }
        if (z) {
            return Boolean.valueOf(mo235636i(file));
        }
        return false;
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: c */
    public Stats mo235614c(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return (Stats) m264274a("attributesOfFile", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$6l8z8xg1cRY4hafxbKCcT3zCRMU */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264301m(this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: f */
    public boolean mo235626f(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("canRead", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$sJIaes0vhk_xy3WQnZ1D7Mn7BTM */
            public final /* synthetic */ TTFile f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264290d(this.f$1);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: g */
    public boolean mo235629g(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("isDirectory", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$Bvcb0WvmuUvlDTCEAJRARymYRI */
            public final /* synthetic */ TTFile f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264287c(this.f$1);
            }
        })).booleanValue();
    }

    /* renamed from: h */
    public boolean mo235632h(TTFile gVar, TTFileContext hVar) {
        return ((Boolean) m264274a("isOverSizeLimit", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$RxlLFbrNZHV7SgO0AxzEhBRuCwo */
            public final /* synthetic */ TTFile f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264283b(this.f$1);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: i */
    public File mo235635i(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return (File) m264274a("getSystemFile", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$v78dCuGnMstBtyvCsaGgJCY_4 */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264296j(this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m264299l(TTFile gVar, TTFileContext hVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (mo235617c(gVar, f171068a, hVar.mo235659a("removeFile"))) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (!mo235603a(gVar, hVar.mo235659a("removeFile"))) {
                return Boolean.valueOf((boolean) f171068a);
            }
            if (!mo235629g(gVar, hVar.mo235659a("removeFile"))) {
                return Boolean.valueOf(file.delete());
            }
            throw new TTFileException(TTFileError.f171115q, gVar);
        } else {
            throw new TTFileException(TTFileError.f171109k, gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Stats m264301m(TTFile gVar, TTFileContext hVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (mo235626f(gVar, hVar.mo235659a("attributesOfFile"))) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (file.exists()) {
                return Stats.getFileStats(m264282b(gVar, file).getAbsolutePath());
            }
            throw new TTFileException(TTFileError.f171110l, gVar);
        } else {
            throw new TTFileException(TTFileError.f171108j, gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ File m264296j(TTFile gVar, TTFileContext hVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (!mo235603a(gVar, hVar.mo235659a("getSystemFile"))) {
            throw new TTFileException(TTFileError.f171110l, gVar);
        } else if (mo235629g(gVar, hVar.mo235659a("getSystemFile"))) {
            throw new TTFileException(TTFileError.f171115q, gVar);
        } else if (gVar.mo235649c()) {
            return new File(mo235615c(gVar.mo235647a()));
        } else {
            TTAPkgFile findFile = StreamLoader.findFile(gVar.mo235647a(), this.f171077i);
            if (f171068a || findFile != null) {
                String waitExtractFinishIfNeeded = StreamLoader.waitExtractFinishIfNeeded(gVar.mo235647a(), this.f171077i);
                AppBrandLogger.m52830i("AbsFileManager", "pkgExtractedPath", waitExtractFinishIfNeeded, "ttFile", gVar);
                if (!waitExtractFinishIfNeeded.equals(gVar.mo235647a())) {
                    return new File(waitExtractFinishIfNeeded);
                }
                File i = mo235634i();
                File file = new File(i, System.currentTimeMillis() + gVar.mo235655i());
                if (StreamLoader.extractToFile(gVar.mo235647a(), file.getParent(), file.getName(), this.f171077i)) {
                    return file;
                }
                AppBrandLogger.m52830i("AbsFileManager", "extractToFile failed", gVar);
                throw new TTFileException(TTBizError.f171097f);
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ List m264297k(TTFile gVar, TTFileContext hVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (mo235626f(gVar, hVar.mo235659a("listContents"))) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (!mo235603a(gVar, hVar.mo235659a("listContents"))) {
                throw new TTFileException(TTFileError.f171110l, gVar);
            } else if (file.exists()) {
                if (file.isDirectory()) {
                    String[] list = file.list();
                    if (list != null) {
                        return Arrays.asList(list);
                    }
                    AppBrandLogger.m52829e("AbsFileManager", "children is null, file:" + file.getAbsolutePath());
                    throw new TTFileException(TTBizError.f171094c, gVar);
                }
                throw new TTFileException(TTFileError.f171114p, gVar);
            } else if (StreamLoader.getLoadTask(mo235641m()) == null) {
                AppBrandLogger.m52830i("AbsFileManager", "loadTask is null and file not exists, file:" + file.getAbsolutePath());
                throw new TTFileException(TTBizError.f171095d, gVar);
            } else if (StreamLoader.isDirectoryOfPkg(gVar.mo235647a(), mo235641m())) {
                Set<String> listTTAPKG = StreamLoader.listTTAPKG(gVar.mo235647a(), mo235641m());
                if (listTTAPKG != null) {
                    return new ArrayList(listTTAPKG);
                }
                AppBrandLogger.m52830i("AbsFileManager", "fileNames is null");
                throw new TTFileException(TTBizError.f171094c, gVar);
            } else {
                throw new TTFileException(TTFileError.f171114p, gVar);
            }
        } else {
            throw new TTFileException(TTFileError.f171108j, gVar);
        }
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: d */
    public boolean mo235620d(TTFile gVar, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("removeFile", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$r0BsfzfHYPrxJNE3nxcjlurQ4Q */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264299l(this.f$1, this.f$2);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: c */
    public void mo235616c(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        m264274a("unzip", gVar, gVar2, hVar, new AbstractC67922b(gVar, gVar2, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$2BkGxHF5nIhVNM7_3ySvizJXrU */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFile f$2;
            public final /* synthetic */ TTFileContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264291e(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public boolean mo235610b(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("moveFile", gVar, gVar2, hVar, new AbstractC67922b(gVar, gVar2, hVar) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$wEIGIHzCu896lFs7xhcsiwDvQbc */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFile f$2;
            public final /* synthetic */ TTFileContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264293f(this.f$1, this.f$2, this.f$3);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public boolean mo235611b(TTFile gVar, boolean z, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("removeDirectory", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, hVar, z) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$2OQXhPyGksku5HlX13zLQtpx8vw */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFileContext f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264268a(this.f$1, this.f$2, this.f$3);
            }
        })).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean m264288c(File file, TTFile gVar, TTFileContext hVar) throws TTFileException {
        boolean z = f171068a;
        if (file == null || !file.exists()) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("copy file, from file is null:");
            sb.append(file);
            sb.append(" exists:");
            if (file == null || !file.exists()) {
                z = false;
            }
            sb.append(z);
            objArr[0] = sb.toString();
            AppBrandLogger.m52830i("AbsFileManager", objArr);
            return false;
        }
        if (file.isDirectory()) {
            AppBrandLogger.m52830i("AbsFileManager", "copy file, from file is directory, file:" + file.getAbsolutePath());
        }
        try {
            return Boolean.valueOf(mo235606a(new FileInputStream(file), gVar, hVar.mo235659a("copySystemFile")));
        } catch (FileNotFoundException e) {
            AppBrandLogger.m52829e("AbsFileManager", "file not found exception", e);
            return false;
        }
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: d */
    public void mo235619d(TTFile gVar, TTFile gVar2, TTFileContext hVar) {
        m264274a("decryptFile", gVar, gVar2, hVar, new AbstractC67922b(gVar, gVar2, hVar, "decryptFile") {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$b3FAv0JpdbzcYloTjmK0V0NEJXM */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ TTFile f$2;
            public final /* synthetic */ TTFileContext f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264271a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m264284b(TTFile gVar, TTFileContext hVar, boolean z) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (mo235617c(gVar, false, hVar.mo235659a("createDirectory"))) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (mo235603a(gVar, hVar.mo235659a("createDirectory"))) {
                throw new TTFileException(TTFileError.f171111m, gVar);
            } else if (z || file.getParentFile().exists()) {
                return Boolean.valueOf(file.mkdirs());
            } else {
                throw new TTFileException(TTFileError.f171112n, gVar);
            }
        } else {
            throw new TTFileException(TTFileError.f171109k, gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Object m264291e(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (gVar2 == null || gVar2.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar2);
        } else {
            File file = new File(mo235615c(gVar.mo235647a()));
            File file2 = new File(mo235615c(gVar2.mo235647a()));
            StreamLoader.waitExtractFinishIfNeeded(file.getAbsolutePath(), mo235641m());
            if (!mo235626f(gVar, hVar.mo235659a("unzip"))) {
                throw new TTFileException(TTFileError.f171108j, gVar2);
            } else if (!mo235617c(gVar2, false, hVar.mo235659a("unzip"))) {
                throw new TTFileException(TTFileError.f171109k, gVar2);
            } else if (!mo235603a(gVar, hVar.mo235659a("unzip"))) {
                throw new TTFileException(TTFileError.f171110l, gVar);
            } else if (mo235603a(gVar2, hVar.mo235659a("unzip"))) {
                throw new TTFileException(TTFileError.f171111m, gVar2);
            } else if (!mo235603a(gVar2.mo235648b(), hVar.mo235659a("unzip"))) {
                throw new TTFileException(TTFileError.f171112n, gVar2);
            } else if (mo235629g(gVar, hVar.mo235659a("unzip"))) {
                throw new TTFileException(TTFileError.f171115q, gVar);
            } else if (!mo235601a(IOUtils.getZipTrueSize(file.getAbsolutePath()))) {
                try {
                    IOUtils.unZipFolder(file.getAbsolutePath(), file2.getAbsolutePath(), (boolean) f171068a);
                    return null;
                } catch (Exception e) {
                    AppBrandLogger.m52829e("AbsFileManager", "unzip exception", e);
                    throw new TTFileException(TTBizError.f171096e, gVar);
                }
            } else {
                throw new TTFileException(TTFileError.f171117s, gVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ Boolean m264293f(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (gVar2 == null || gVar2.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar2);
        } else {
            File file = new File(mo235615c(gVar.mo235647a()));
            File file2 = new File(mo235615c(gVar2.mo235647a()));
            if (!mo235617c(gVar, f171068a, hVar.mo235659a("moveFile"))) {
                throw new TTFileException(TTFileError.f171109k, gVar);
            } else if (!mo235617c(gVar2, false, hVar.mo235659a("moveFile"))) {
                throw new TTFileException(TTFileError.f171109k, gVar2);
            } else if (IOUtils.isSubPath(file, file2)) {
                AppBrandLogger.m52830i("AbsFileManager", "is subpath, src:" + file.getAbsolutePath() + " dest:" + file2.getAbsolutePath());
                throw new TTFileException(TTFileError.f171116r);
            } else if (!file.exists()) {
                throw new TTFileException(TTFileError.f171110l, gVar);
            } else if (file2.exists()) {
                throw new TTFileException(TTFileError.f171111m, gVar2);
            } else if (!file2.getParentFile().exists()) {
                throw new TTFileException(TTFileError.f171112n, gVar2);
            } else if (!mo235636i(file) || !mo235632h(gVar, hVar.mo235659a("moveFile"))) {
                boolean renameTo = file.renameTo(file2);
                m264280a(file2, hVar.mo235660b(), "moveFile");
                return Boolean.valueOf(renameTo);
            } else {
                throw new TTFileException(TTFileError.f171117s, gVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m264267a(TTFile gVar, TTFileContext hVar, String str) throws TTFileException {
        boolean z;
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (!mo235626f(gVar, hVar.mo235659a(str))) {
            throw new TTFileException(TTFileError.f171108j, gVar);
        } else if (!new File(mo235615c(gVar.mo235647a())).exists()) {
            if (StreamLoader.findFile(gVar.mo235647a(), mo235641m()) != null || StreamLoader.isDirectoryOfPkg(gVar.mo235647a(), mo235641m())) {
                z = f171068a;
            } else {
                z = false;
            }
            AppBrandLogger.m52830i("AbsFileManager", "filePath:" + gVar.mo235647a() + "existsInPkg: " + z);
            return Boolean.valueOf(z);
        } else {
            AppBrandLogger.m52830i("AbsFileManager", "filePath:" + gVar.mo235647a() + "exists: true");
            return Boolean.valueOf((boolean) f171068a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Boolean m264285b(InputStream inputStream, TTFile gVar, TTFileContext hVar) throws TTFileException {
        if (inputStream == null) {
            AppBrandLogger.m52830i("AbsFileManager", "copy file, from inputStream is null");
            return false;
        } else if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (!mo235617c(gVar, false, hVar.mo235659a("copySystemFile")) && !mo235636i(file)) {
                throw new TTFileException(TTFileError.f171109k, gVar);
            } else if (!file.exists()) {
                if (file.isDirectory()) {
                    AppBrandLogger.m52830i("AbsFileManager", "copy file, to file is directory, file:" + file.getAbsolutePath());
                }
                if (mo235638j(file)) {
                    File i = mo235634i();
                    File file2 = new File(i, System.currentTimeMillis() + gVar.mo235655i());
                    if (!C67586c.m263048a(inputStream, file2)) {
                        AppBrandLogger.m52829e("AbsFileManager", "copy file failed, tempExists:" + file2.exists() + "tempIsDir:" + file2.isDirectory() + "tempIsFile:" + file2.isFile() + "temp:" + file2);
                        return false;
                    } else if (mo235601a(file2.length())) {
                        file2.delete();
                        throw new TTFileException(TTFileError.f171117s);
                    } else if (!file2.renameTo(file)) {
                        AppBrandLogger.m52829e("AbsFileManager", "rename failed, from:" + file2.getPath() + " to:" + file.getPath() + " toExists:" + file.exists() + " toIsFile:" + file.isFile() + " toIsDir:" + file.isDirectory());
                        file2.delete();
                        return false;
                    } else {
                        m264280a(file, hVar.mo235660b(), "copySystemFile");
                        m264279a(gVar, file);
                        return Boolean.valueOf((boolean) f171068a);
                    }
                } else {
                    boolean a = C67586c.m263048a(inputStream, file);
                    if (a) {
                        m264280a(file, hVar.mo235660b(), "copySystemFile");
                        m264279a(gVar, file);
                    }
                    return Boolean.valueOf(a);
                }
            } else {
                throw new TTFileException(TTFileError.f171111m, gVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Boolean m264294g(TTFile gVar, TTFile gVar2, TTFileContext hVar) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (gVar2 == null || gVar2.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar2);
        } else {
            File file = new File(mo235615c(gVar.mo235647a()));
            File file2 = new File(mo235615c(gVar2.mo235647a()));
            if (!mo235626f(gVar, hVar.mo235659a("copyFile"))) {
                throw new TTFileException(TTFileError.f171108j, gVar);
            } else if (!mo235617c(gVar2, false, hVar.mo235659a("copyFile"))) {
                throw new TTFileException(TTFileError.f171109k, gVar2);
            } else if (IOUtils.isSubPath(file, file2)) {
                AppBrandLogger.m52830i("AbsFileManager", "is subpath, src:" + file.getAbsolutePath() + " dest:" + file2.getAbsolutePath());
                throw new TTFileException(TTFileError.f171116r);
            } else if (!mo235603a(gVar, hVar.mo235659a("copyFile"))) {
                throw new TTFileException(TTFileError.f171110l, gVar);
            } else if (mo235603a(gVar2, hVar.mo235659a("copyFile"))) {
                throw new TTFileException(TTFileError.f171111m, gVar2);
            } else if (!file2.getParentFile().exists()) {
                throw new TTFileException(TTFileError.f171112n, gVar2);
            } else if (mo235632h(gVar, hVar.mo235659a("copyFile"))) {
                throw new TTFileException(TTFileError.f171117s, gVar);
            } else if (file.exists()) {
                boolean a = C69104g.m265932a(file, file2, (boolean) f171068a, $$Lambda$a$2Sdd0SglTgCH7D0kwqT4Wii6ZM.INSTANCE);
                m264280a(file2, hVar.mo235660b(), "copyFile");
                return Boolean.valueOf(a);
            } else {
                boolean extractToFile = StreamLoader.extractToFile(gVar.mo235647a(), file2.getParent(), file2.getName(), mo235641m());
                m264280a(file2, hVar.mo235660b(), "copyFile");
                return Boolean.valueOf(extractToFile);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m264268a(TTFile gVar, TTFileContext hVar, boolean z) throws TTFileException {
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        } else if (mo235617c(gVar, f171068a, hVar.mo235659a("removeDirectory"))) {
            File file = new File(mo235615c(gVar.mo235647a()));
            if (!mo235603a(gVar, hVar.mo235659a("removeDirectory"))) {
                return Boolean.valueOf((boolean) f171068a);
            }
            if (!mo235629g(gVar, hVar.mo235659a("removeDirectory"))) {
                throw new TTFileException(TTFileError.f171114p, gVar);
            } else if (!z) {
                String[] list = file.list();
                if (list != null && list.length != 0) {
                    throw new TTFileException(TTFileError.f171113o, gVar);
                } else if (file.delete()) {
                    return Boolean.valueOf((boolean) f171068a);
                } else {
                    AppBrandLogger.m52829e("AbsFileManager", "cannot delete:" + file.getAbsolutePath() + " isDir:" + file.isDirectory());
                    throw new TTFileException(TTSystemError.f171129b, gVar);
                }
            } else {
                C67586c.m263051b(file);
                return Boolean.valueOf((boolean) f171068a);
            }
        } else {
            throw new TTFileException(TTFileError.f171109k, gVar);
        }
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: b */
    public boolean mo235612b(File file, TTFile gVar, TTFileContext hVar) throws TTFileException {
        return ((Boolean) m264274a("moveSystemFile", (TTFile) null, gVar, hVar, new AbstractC67922b(file, gVar, hVar, "moveSystemFile") {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$sJxhLYEync4cuKO3x35ZOP87CCA */
            public final /* synthetic */ File f$1;
            public final /* synthetic */ TTFile f$2;
            public final /* synthetic */ TTFileContext f$3;
            public final /* synthetic */ String f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264270a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        })).booleanValue();
    }

    @Override // com.tt.refer.impl.business.file.ITTFileService
    /* renamed from: c */
    public boolean mo235617c(TTFile gVar, boolean z, TTFileContext hVar) {
        return ((Boolean) m264274a("canWrite", (TTFile) null, gVar, hVar, new AbstractC67922b(gVar, z) {
            /* class com.tt.refer.impl.business.file.$$Lambda$a$UX4uKKMgVPQOK6JC3cuL2r1hnU */
            public final /* synthetic */ TTFile f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.tt.refer.impl.business.file.AbstractC67918a.AbstractC67922b
            public final Object act() {
                return AbstractC67918a.this.m264269a(this.f$1, this.f$2);
            }
        })).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m264270a(File file, TTFile gVar, TTFileContext hVar, String str) throws TTFileException {
        boolean z = f171068a;
        if (file == null || !file.exists()) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("move file, from file is null:");
            sb.append(file);
            sb.append(" exists:");
            if (file == null || !file.exists()) {
                z = false;
            }
            sb.append(z);
            objArr[0] = sb.toString();
            AppBrandLogger.m52830i("AbsFileManager", objArr);
            return false;
        }
        if (file.isDirectory()) {
            AppBrandLogger.m52830i("AbsFileManager", "move file, from file is directory, file:" + file.getAbsolutePath());
        }
        if (gVar == null || gVar.mo235650d()) {
            throw new TTFileException(TTBizError.f171093b, gVar);
        }
        File file2 = new File(mo235615c(gVar.mo235647a()));
        if (!mo235617c(gVar, false, hVar.mo235659a(str)) && !mo235636i(file2)) {
            throw new TTFileException(TTFileError.f171109k, gVar);
        } else if (!file2.exists()) {
            if (mo235638j(file2)) {
                AppBrandLogger.m52830i("AbsFileManager", "to in user, to:" + file2);
                if (mo235601a(file.length())) {
                    throw new TTFileException(TTFileError.f171117s);
                }
            }
            boolean renameTo = file.renameTo(file2);
            if (!renameTo) {
                AppBrandLogger.m52830i("AbsFileManager", "moveSystemFile fail. from", file, " toFile", file2);
            } else {
                m264280a(file2, hVar.mo235660b(), str);
                m264279a(gVar, file2);
            }
            return Boolean.valueOf(renameTo);
        } else {
            throw new TTFileException(TTFileError.f171111m, gVar);
        }
    }

    /* renamed from: a */
    private LogItem m264266a(File file, long j, String str, String str2, String str3) {
        return new LogItem(file.getAbsolutePath(), str3, j, file.lastModified(), file.lastModified(), ((AbstractC67724a) this.f171077i.findServiceByInterface(AbstractC67724a.class)).mo50471l(), ((AbstractC67724a) this.f171077i.findServiceByInterface(AbstractC67724a.class)).mo50469j(), this.f171077i.getAppId(), this.f171077i.getAppType().name(), str2, str, System.currentTimeMillis());
    }
}
