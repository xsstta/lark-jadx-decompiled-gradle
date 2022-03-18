package com.ss.android.lark.diskmanage.p1807a;

import java.io.File;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.a.a */
public class C36786a extends C36791d {
    @Override // com.ss.android.lark.diskmanage.p1807a.AbstractC36802f, com.ss.android.lark.diskmanage.p1807a.C36791d
    /* renamed from: a */
    public synchronized File mo135508a(String str) throws IOException {
        return ((C36787b) this.f94527a).mo135510a(str);
    }

    C36786a(File file, int i, long j) {
        super(file, i, j);
        try {
            this.f94527a = C36787b.m145102a(file, i, 1, j);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
