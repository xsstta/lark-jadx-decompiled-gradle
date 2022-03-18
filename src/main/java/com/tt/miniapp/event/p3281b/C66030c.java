package com.tt.miniapp.event.p3281b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b.c */
public class C66030c {
    /* renamed from: a */
    public static String m258558a(C66029b bVar) {
        return bVar.f166687b.toString();
    }

    /* renamed from: a */
    public static String m258559a(String str) {
        if (TextUtils.isEmpty(str)) {
            return CharacterUtils.empty();
        }
        String[] split = str.split("@");
        if (split.length != 2) {
            return CharacterUtils.empty();
        }
        return split[0];
    }

    /* renamed from: a */
    public static String m258560a(String str, C66029b bVar) {
        return bVar.f166686a + "@" + CharacterUtils.md5Hex(str + bVar.f166689d);
    }

    /* renamed from: a */
    public static String m258561a(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return CharacterUtils.empty();
        }
        if ("mp_page_load_start".equals(str) || "mp_page_load_result".equals(str)) {
            return jSONObject.optString("page_path", CharacterUtils.empty());
        }
        return CharacterUtils.empty();
    }
}
