package com.ss.android.lark.diskmanage.p1807a;

import java.io.File;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.diskmanage.a.h */
public class C36807h extends C36791d {
    C36807h(File file, int i, long j) {
        super(file, i, j);
        try {
            this.f94527a = C36792e.m145131b(file, i, 1, j);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
