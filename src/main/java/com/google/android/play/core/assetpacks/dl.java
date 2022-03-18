package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.Task;
import java.util.List;
import java.util.Map;

interface dl {
    /* renamed from: a */
    Task<List<String>> mo78779a(Map<String, Long> map);

    /* renamed from: a */
    void mo78780a();

    /* renamed from: a */
    void mo78781a(int i);

    /* renamed from: a */
    void mo78782a(int i, String str);

    /* renamed from: a */
    void mo78783a(int i, String str, String str2, int i2);

    /* renamed from: a */
    void mo78785a(List<String> list);

    /* renamed from: b */
    Task<ParcelFileDescriptor> mo78786b(int i, String str, String str2, int i2);
}
