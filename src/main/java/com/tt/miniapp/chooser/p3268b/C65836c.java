package com.tt.miniapp.chooser.p3268b;

import com.tt.miniapp.entity.Folder;
import java.util.ArrayList;

/* renamed from: com.tt.miniapp.chooser.b.c */
public class C65836c {
    /* renamed from: a */
    public String mo230564a(String str) {
        String[] split = str.split("/");
        return split[split.length - 2];
    }

    /* renamed from: a */
    public int mo230563a(ArrayList<Folder> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).f166623a.equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
