package com.bytedance.geckox.p757a.p758a;

import com.bytedance.geckox.p757a.C14201c;
import com.bytedance.geckox.utils.C14357e;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.geckox.a.a.e */
class C14198e extends AbstractC14195b {
    C14198e() {
    }

    @Override // com.bytedance.geckox.p757a.p758a.AbstractC14195b
    /* renamed from: a */
    public void mo52077a() {
        for (String str : this.f37349f) {
            List<File> b = C14357e.m57824b(new File(this.f37348e, str));
            if (b != null && b.size() > this.f37347d.mo52075b()) {
                for (File file : b.subList(0, b.size() - this.f37347d.mo52075b())) {
                    boolean a = C14201c.m57332a(file.getAbsolutePath());
                    if (this.f37347d.mo52076c() != null) {
                        this.f37347d.mo52076c().mo52079a(file.getName(), a);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.geckox.p757a.p758a.AbstractC14195b
    /* renamed from: a */
    public void mo52078a(C14194a aVar, File file, List<String> list) {
        super.mo52078a(aVar, file, list);
    }
}
