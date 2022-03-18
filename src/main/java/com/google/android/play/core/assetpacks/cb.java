package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C22630b;
import java.io.File;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final class cb {

    /* renamed from: a */
    private static final C22630b f55837a = new C22630b("MergeSliceTaskHandler");

    /* renamed from: b */
    private final C22614x f55838b;

    cb(C22614x xVar) {
        this.f55838b = xVar;
    }

    /* renamed from: a */
    private static void m82065a(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            File[] listFiles = file.listFiles();
            for (File file3 : listFiles) {
                m82065a(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new ay(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new ay(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new ay(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo78788a(ca caVar) {
        File b = this.f55838b.mo78830b(caVar.f55804k, caVar.f55834a, caVar.f55835b, caVar.f55836c);
        if (b.exists()) {
            File c = this.f55838b.mo78833c(caVar.f55804k, caVar.f55834a, caVar.f55835b);
            if (!c.exists()) {
                c.mkdirs();
            }
            m82065a(b, c);
            try {
                this.f55838b.mo78827a(caVar.f55804k, caVar.f55834a, caVar.f55835b, this.f55838b.mo78838d(caVar.f55804k, caVar.f55834a, caVar.f55835b) + 1);
            } catch (IOException e) {
                f55837a.mo78873b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new ay("Writing merge checkpoint failed.", e, caVar.f55803j);
            }
        } else {
            throw new ay(String.format("Cannot find verified files for slice %s.", caVar.f55836c), caVar.f55803j);
        }
    }
}
