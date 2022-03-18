package com.ss.android.lark.widget.photo_picker.p2950e;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2909v.C57897d;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.e.b */
public class C58635b {

    /* renamed from: a */
    private String f144789a;

    /* renamed from: b */
    private HashMap<String, Object> f144790b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.e.b$a */
    public static class C58637a {

        /* renamed from: a */
        public static final C58635b f144791a = new C58635b();
    }

    /* renamed from: a */
    public static final C58635b m227434a() {
        return C58637a.f144791a;
    }

    private C58635b() {
        this.f144789a = "PhotoTransmitHelper";
        this.f144790b = new HashMap<>();
    }

    /* renamed from: b */
    private void m227436b() {
        int size = this.f144790b.size();
        if (size > 10) {
            String str = this.f144789a;
            Log.m165383e(str, "Transmit Too Many items: " + size);
        } else if (size > 1) {
            String str2 = this.f144789a;
            Log.m165397w(str2, "Transmit over ONE item: " + size);
        }
    }

    /* renamed from: a */
    private List<Photo> m227435a(List<Photo> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new Photo(list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<Photo> mo198706a(Context context, String str) {
        List<Photo> list = (List) this.f144790b.remove(str);
        if (list != null) {
            return m227435a(list);
        }
        File externalCacheDir = context.getExternalCacheDir();
        File file = new File(externalCacheDir, "intentData" + File.separator + str + ".data");
        List<Photo> a = PhotoParcelableUtils.f144788a.mo198704a(file.getAbsolutePath());
        if (file.delete()) {
            return a;
        }
        String str2 = this.f144789a;
        Log.m165397w(str2, "cannot remove file: " + file.getAbsolutePath());
        return a;
    }

    /* renamed from: a */
    public void mo198707a(Context context, String str, List<Photo> list) {
        this.f144790b.put(str, list);
        m227436b();
        if (!C57897d.m224697b(context)) {
            File externalCacheDir = context.getExternalCacheDir();
            PhotoParcelableUtils.f144788a.mo198705a(new File(externalCacheDir, "intentData" + File.separator + str + ".data").getAbsolutePath(), list);
        }
    }
}
