package com.ss.android.vcxp;

import android.content.Context;
import android.os.Bundle;
import android.os.MemoryFile;
import android.os.ParcelFileDescriptor;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vcxp.p3184a.C63787b;
import com.ss.android.vcxp.p3185b.C63797b;
import com.ss.android.vcxp.p3185b.C63798c;
import com.ss.android.vcxp.p3186c.C63802a;
import com.ss.android.vcxp.p3186c.C63806d;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.vcxp.d */
public class C63807d {

    /* renamed from: a */
    public C63798c f161017a;

    /* renamed from: b */
    public Bundle f161018b;

    /* renamed from: a */
    public Bundle mo220464a() throws Exception {
        byte[] bArr;
        Method a;
        Bundle bundle = new Bundle();
        Class[] clsArr = new Class[this.f161017a.mo220440f().size()];
        for (int i = 0; i < this.f161017a.mo220440f().size(); i++) {
            String str = this.f161017a.mo220440f().get(i);
            if (str.equals(C63802a.f161005a)) {
                clsArr[i] = new byte[0].getClass();
            } else {
                clsArr[i] = C63787b.m250453a(str);
            }
        }
        Object[] objArr = new Object[this.f161017a.mo220441g().size()];
        String name = C63797b.class.getName();
        FileInputStream fileInputStream = null;
        for (int i2 = 0; i2 < this.f161017a.mo220441g().size(); i2++) {
            String str2 = this.f161017a.mo220441g().get(i2);
            Class cls = clsArr[i2];
            if (this.f161017a.mo220440f().get(i2).equals(name)) {
                C63797b bVar = new C63797b(str2);
                byte[] bArr2 = new byte[bVar.f160986b];
                if (fileInputStream == null) {
                    fileInputStream = new FileInputStream(((ParcelFileDescriptor) this.f161018b.getParcelable(bVar.f160985a)).getFileDescriptor());
                }
                fileInputStream.read(bArr2, 0, bVar.f160986b);
                if (bVar.f160988d) {
                    objArr[i2] = C63787b.m250459b(new String(bArr2), cls);
                } else {
                    objArr[i2] = bArr2;
                }
            } else if (cls.equals(Context.class)) {
                objArr[i2] = C63809f.f161023a.get();
            } else if (str2 == null) {
                objArr[i2] = null;
            } else {
                Object a2 = C63785a.m250433a(str2, cls);
                if (a2 != null) {
                    objArr[i2] = a2;
                } else {
                    objArr[i2] = C63787b.m250459b(str2, cls);
                }
            }
        }
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        Class a3 = C63787b.m250453a(this.f161017a.mo220435a());
        Method a4 = C63806d.m250514a(a3, this.f161017a.mo220438d(), this.f161017a.mo220439e());
        Object a5 = this.f161017a.mo220436b().isEmpty() ? null : C63785a.m250432a(this.f161017a.mo220436b());
        if (a5 == null && this.f161017a.mo220437c() && (a = C63806d.m250513a(a3)) != null) {
            a5 = a.invoke(null, new Object[0]);
        }
        if (a5 != null || this.f161017a.mo220436b().isEmpty()) {
            Object invoke = a4.invoke(a5, objArr);
            if (invoke != null) {
                Class<?> cls2 = invoke.getClass();
                if (C63806d.m250515b(cls2) != null) {
                    C63785a.m250442b(invoke);
                }
                bundle.putString("@resultClassName", cls2.getName());
            }
            if (this.f161017a.mo220442h()) {
                try {
                    MemoryFile memoryFile = new MemoryFile(this.f161017a.mo220443i(), this.f161017a.mo220444j());
                    OutputStream outputStream = memoryFile.getOutputStream();
                    boolean equals = true ^ invoke.getClass().equals(byte[].class);
                    if (equals) {
                        bArr = C63785a.m250446d(invoke).getBytes();
                    } else {
                        bArr = (byte[]) invoke;
                    }
                    outputStream.write(bArr, 0, bArr.length);
                    outputStream.close();
                    C63797b bVar2 = new C63797b(this.f161017a.mo220443i(), bArr.length, -1, equals);
                    bundle.putString("@resultBigData", bVar2.mo220434a());
                    bundle.putParcelable(bVar2.f160985a, ParcelFileDescriptor.dup((FileDescriptor) C63791b.f160976a.invoke(memoryFile, new Object[0])));
                } catch (Exception unused) {
                }
            } else {
                bundle.putString("@result", C63785a.m250446d(invoke));
            }
            return bundle;
        }
        C60700b.m235854c("GhostManager_XMethodInvoker", "" + C63809f.f161025c, "Failed: instanceId=" + this.f161017a.mo220436b());
        bundle.putInt("@error", 1);
        bundle.putString("@errorMessage", this.f161017a.mo220436b());
        return bundle;
    }

    /* renamed from: a */
    public static C63807d m250516a(Bundle bundle) {
        C63807d dVar = new C63807d();
        dVar.f161017a = (C63798c) C63787b.m250455a(bundle.getString("@params"), C63798c.class);
        dVar.f161018b = bundle;
        return dVar;
    }
}
