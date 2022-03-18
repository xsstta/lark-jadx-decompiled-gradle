package com.ss.android.lark.keyboard.plugin.tool.voice.p2092c;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.c.c */
public class C41039c {

    /* renamed from: a */
    public static final Map<String, Integer> f104494a;

    /* renamed from: c */
    public static int m162710c(int i) {
        return i != 0 ? i != 2 ? R.drawable.ud_icon_voice_outlined : R.drawable.ud_icon_voice2text_outlined : R.drawable.ud_icon_voice_text_outlined;
    }

    /* renamed from: a */
    public static String m162705a() {
        return m162707a("zh_ch");
    }

    static {
        HashMap hashMap = new HashMap();
        f104494a = hashMap;
        hashMap.put("zh_ch", Integer.valueOf((int) R.string.Lark_Chat_AudioToChinese));
        hashMap.put("en_us", Integer.valueOf((int) R.string.Lark_Chat_AudioToEnglish));
    }

    /* renamed from: a */
    public static int m162704a(int i) {
        return UserSP.getInstance().getInt("user_audio_send_tab", i);
    }

    /* renamed from: b */
    public static void m162708b(int i) {
        UserSP.getInstance().putInt("user_audio_send_tab", i);
    }

    /* renamed from: a */
    public static String m162706a(Context context) {
        return C57582a.m223604a(context, f104494a.get(m162707a("zh_ch")).intValue());
    }

    /* renamed from: b */
    public static void m162709b(String str) {
        UserSP.getInstance().putString("user_audio_2_text_locale", str);
    }

    /* renamed from: a */
    public static String m162707a(String str) {
        return UserSP.getInstance().getString("user_audio_2_text_locale", str);
    }
}
