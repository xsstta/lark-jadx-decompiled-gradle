package com.ss.android.lark.mediapicker.utils;

import android.content.Context;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.utils.o */
public class C44760o {

    /* renamed from: a */
    private HashMap<String, Object> f113361a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mediapicker.utils.o$a */
    public static class C44762a {

        /* renamed from: a */
        public static final C44760o f113362a = new C44760o();
    }

    /* renamed from: a */
    public static final C44760o m177512a() {
        return C44762a.f113362a;
    }

    private C44760o() {
        this.f113361a = new HashMap<>();
    }

    /* renamed from: b */
    private void m177514b() {
        int size = this.f113361a.size();
        if (size > 10) {
            C44677b.m177236a("Transmit Too Many items: " + size);
        } else if (size > 1) {
            C44677b.m177239b("Transmit over ONE item: " + size);
        }
    }

    /* renamed from: a */
    private List<LocalMedia> m177513a(List<LocalMedia> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new LocalMedia(list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<LocalMedia> mo158476a(Context context, String str) {
        List<LocalMedia> list = (List) this.f113361a.remove(str);
        if (list != null) {
            return m177513a(list);
        }
        File externalCacheDir = context.getExternalCacheDir();
        File file = new File(externalCacheDir, "intentData" + File.separator + str + ".data");
        List<LocalMedia> a = LocalMediaParcelableUtils.f113357a.mo158471a(file.getAbsolutePath());
        if (file.delete()) {
            return a;
        }
        C44677b.m177239b("cannot remove file: " + file.getAbsolutePath());
        return a;
    }

    /* renamed from: a */
    public void mo158477a(Context context, String str, List<LocalMedia> list) {
        this.f113361a.put(str, list);
        m177514b();
        File externalCacheDir = context.getExternalCacheDir();
        LocalMediaParcelableUtils.f113357a.mo158472a(new File(externalCacheDir, "intentData" + File.separator + str + ".data").getAbsolutePath(), list);
    }
}
