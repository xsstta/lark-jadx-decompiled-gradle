package com.ss.android.lark.reaction.p2557b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.newemoji.EmojiMapManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.reaction.b.b */
public class C52986b {

    /* renamed from: a */
    private static Map<String, Integer> f130899a;

    static {
        HashMap hashMap = new HashMap((int) DynamicModule.f58006b);
        f130899a = hashMap;
        hashMap.put("SMILE", Integer.valueOf((int) R.drawable.emoji_smile));
        f130899a.put("DROOL", Integer.valueOf((int) R.drawable.emoji_drool));
        f130899a.put("SCOWL", Integer.valueOf((int) R.drawable.emoji_scowl));
        f130899a.put("HAUGHTY", Integer.valueOf((int) R.drawable.emoji_irritated));
        f130899a.put("NOSEPICK", Integer.valueOf((int) R.drawable.emoji_nosepick));
        f130899a.put("SOB", Integer.valueOf((int) R.drawable.emoji_sob));
        f130899a.put("ANGRY", Integer.valueOf((int) R.drawable.emoji_angry));
        f130899a.put("BLUSH", Integer.valueOf((int) R.drawable.emoji_grin));
        f130899a.put("SLEEP", Integer.valueOf((int) R.drawable.emoji_sleep));
        f130899a.put("SHY", Integer.valueOf((int) R.drawable.emoji_shy));
        f130899a.put("WINK", Integer.valueOf((int) R.drawable.emoji_wink));
        f130899a.put("DIZZY", Integer.valueOf((int) R.drawable.emoji_dizzy));
        f130899a.put("TOASTED", Integer.valueOf((int) R.drawable.emoji_toasted));
        f130899a.put("SILENT", Integer.valueOf((int) R.drawable.emoji_silent));
        f130899a.put("SMART", Integer.valueOf((int) R.drawable.emoji_smart));
        f130899a.put("ATTENTION", Integer.valueOf((int) R.drawable.emoji_attention));
        f130899a.put("WITTY", Integer.valueOf((int) R.drawable.emoji_witty));
        f130899a.put("YEAH", Integer.valueOf((int) R.drawable.emoji_yeah));
        f130899a.put("FACEPALM", Integer.valueOf((int) R.drawable.emoji_facepalm));
        f130899a.put("SLAP", Integer.valueOf((int) R.drawable.emoji_slap));
        f130899a.put("LAUGH", Integer.valueOf((int) R.drawable.emoji_laugh));
        f130899a.put("YAWN", Integer.valueOf((int) R.drawable.emoji_yawn));
        f130899a.put("SHOCKED", Integer.valueOf((int) R.drawable.emoji_shocked));
        f130899a.put("LOVE", Integer.valueOf((int) R.drawable.emoji_love));
        f130899a.put("DROWSY", Integer.valueOf((int) R.drawable.emoji_drowsy));
        f130899a.put("WHAT", Integer.valueOf((int) R.drawable.emoji_what));
        f130899a.put("CRY", Integer.valueOf((int) R.drawable.emoji_cry));
        f130899a.put("CLAP", Integer.valueOf((int) R.drawable.emoji_clap));
        f130899a.put("SHOWOFF", Integer.valueOf((int) R.drawable.emoji_showoff));
        f130899a.put("CHUCKLE", Integer.valueOf((int) R.drawable.emoji_chuckle));
        f130899a.put("PETRIFIED", Integer.valueOf((int) R.drawable.emoji_petrified));
        f130899a.put("THINKING", Integer.valueOf((int) R.drawable.emoji_thinking));
        f130899a.put("SPITBLOOD", Integer.valueOf((int) R.drawable.emoji_spitblood));
        f130899a.put("WHIMPER", Integer.valueOf((int) R.drawable.emoji_whimper));
        f130899a.put("SHHH", Integer.valueOf((int) R.drawable.emoji_shhh));
        f130899a.put("SMUG", Integer.valueOf((int) R.drawable.emoji_smug));
        f130899a.put("ERROR", Integer.valueOf((int) R.drawable.emoji_errr));
        f130899a.put("LOL", Integer.valueOf((int) R.drawable.emoji_lol));
        f130899a.put("SICK", Integer.valueOf((int) R.drawable.emoji_sick));
        f130899a.put("SMIRK", Integer.valueOf((int) R.drawable.emoji_smirk));
        f130899a.put("PROUD", Integer.valueOf((int) R.drawable.emoji_proud));
        f130899a.put("TRICK", Integer.valueOf((int) R.drawable.emoji_trick));
        f130899a.put("CRAZY", Integer.valueOf((int) R.drawable.emoji_crazy));
        f130899a.put("TEARS", Integer.valueOf((int) R.drawable.emoji_tears));
        f130899a.put("MONEY", Integer.valueOf((int) R.drawable.emoji_money));
        f130899a.put("KISS", Integer.valueOf((int) R.drawable.emoji_kiss));
        f130899a.put("TERROR", Integer.valueOf((int) R.drawable.emoji_terror));
        f130899a.put("JOYFUL", Integer.valueOf((int) R.drawable.emoji_joyful));
        f130899a.put("BLUBBER", Integer.valueOf((int) R.drawable.emoji_blubber));
        f130899a.put("HUSKY", Integer.valueOf((int) R.drawable.emoji_husky));
        f130899a.put("FOLLOWME", Integer.valueOf((int) R.drawable.emoji_followme));
        f130899a.put("THUMBSUP", Integer.valueOf((int) R.drawable.emoji_thumbsup));
        f130899a.put("APPLAUSE", Integer.valueOf((int) R.drawable.emoji_applaud));
        f130899a.put("THANKS", Integer.valueOf((int) R.drawable.emoji_thanks));
        f130899a.put("MUSCLE", Integer.valueOf((int) R.drawable.emoji_fighting));
        f130899a.put("OK", Integer.valueOf((int) R.drawable.emoji_ok));
        f130899a.put("HEART", Integer.valueOf((int) R.drawable.emoji_heart));
        f130899a.put("LIPS", Integer.valueOf((int) R.drawable.emoji_lips));
        f130899a.put("DETERGENT", Integer.valueOf((int) R.drawable.emoji_detergent));
        f130899a.put("AWESOME", Integer.valueOf((int) R.drawable.emoji_awesome));
        f130899a.put("ROSE", Integer.valueOf((int) R.drawable.emoji_rose));
        f130899a.put("CUCUMBER", Integer.valueOf((int) R.drawable.emoji_cucumber));
        f130899a.put("BEER", Integer.valueOf((int) R.drawable.emoji_beer));
        f130899a.put("ENOUGH", Integer.valueOf((int) R.drawable.emoji_enough));
        f130899a.put("WRONGED", Integer.valueOf((int) R.drawable.emoji_wronged));
        f130899a.put("OBSESSED", Integer.valueOf((int) R.drawable.emoji_obsessed));
        f130899a.put("LOOKDOWN", Integer.valueOf((int) R.drawable.emoji_lookdown));
        f130899a.put("SMOOCH", Integer.valueOf((int) R.drawable.emoji_smooch));
        f130899a.put("WAVE", Integer.valueOf((int) R.drawable.emoji_wave));
        f130899a.put("DONNOTGO", Integer.valueOf((int) R.drawable.emoji_donnotgo));
        f130899a.put("HEADSET", Integer.valueOf((int) R.drawable.emoji_headset));
        f130899a.put("HUG", Integer.valueOf((int) R.drawable.emoji_hug));
        f130899a.put("DULLSTARE", Integer.valueOf((int) R.drawable.emoji_dullstare));
        f130899a.put("INNOCENTSMILE", Integer.valueOf((int) R.drawable.emoji_innocentsmile));
        f130899a.put("TONGUE", Integer.valueOf((int) R.drawable.emoji_tongue));
        f130899a.put("DULL", Integer.valueOf((int) R.drawable.emoji_dull));
        f130899a.put("GLANCE", Integer.valueOf((int) R.drawable.emoji_glance));
        f130899a.put("SLIGHT", Integer.valueOf((int) R.drawable.emoji_slight));
        f130899a.put("BEAR", Integer.valueOf((int) R.drawable.emoji_bear));
        f130899a.put("SKULL", Integer.valueOf((int) R.drawable.emoji_skull));
        f130899a.put("BLACKFACE", Integer.valueOf((int) R.drawable.emoji_blackface));
        f130899a.put("EATING", Integer.valueOf((int) R.drawable.emoji_eating));
        f130899a.put("BETRAYED", Integer.valueOf((int) R.drawable.emoji_betrayed));
        f130899a.put("SWEAT", Integer.valueOf((int) R.drawable.emoji_sweat));
        f130899a.put("COMFORT", Integer.valueOf((int) R.drawable.emoji_comfort));
        f130899a.put("FROWN", Integer.valueOf((int) R.drawable.emoji_frown));
        f130899a.put("SPEECHLESS", Integer.valueOf((int) R.drawable.emoji_speechless));
        f130899a.put("XBLUSH", Integer.valueOf((int) R.drawable.emoji_blush));
        f130899a.put("EMBARRASSED", Integer.valueOf((int) R.drawable.emoji_embarrassed));
        f130899a.put("TEASE", Integer.valueOf((int) R.drawable.emoji_tease));
        f130899a.put("PRAISE", Integer.valueOf((int) R.drawable.emoji_praise));
        f130899a.put("BIGKISS", Integer.valueOf((int) R.drawable.emoji_bigkiss));
        f130899a.put("PUKE", Integer.valueOf((int) R.drawable.emoji_puke));
        f130899a.put("WOW", Integer.valueOf((int) R.drawable.emoji_wow));
        f130899a.put("HAMMER", Integer.valueOf((int) R.drawable.emoji_hammer));
        f130899a.put("STRIVE", Integer.valueOf((int) R.drawable.emoji_strive));
        f130899a.put("RAINBOWPUKE", Integer.valueOf((int) R.drawable.emoji_rainbowpuke));
        f130899a.put("WAIL", Integer.valueOf((int) R.drawable.emoji_wail));
        f130899a.put("FINGERHEART", Integer.valueOf((int) R.drawable.emoji_fingerheart));
        f130899a.put("FISTBUMP", Integer.valueOf((int) R.drawable.emoji_fistbump));
        f130899a.put("HIGHFIVE", Integer.valueOf((int) R.drawable.emoji_highfive));
        f130899a.put("UPPERLEFT", Integer.valueOf((int) R.drawable.emoji_upperleft));
        f130899a.put("SHAKE", Integer.valueOf((int) R.drawable.emoji_shake));
        f130899a.put("SALUTE", Integer.valueOf((int) R.drawable.emoji_salute));
        f130899a.put("DONE", Integer.valueOf((int) R.drawable.emoji_done));
        f130899a.put("18X", Integer.valueOf((int) R.drawable.emoji_eighteen));
        f130899a.put("CLEAVER", Integer.valueOf((int) R.drawable.emoji_cleaver));
        f130899a.put("JIAYI", Integer.valueOf((int) R.drawable.emoji_plusone));
        f130899a.put("WELLDONE", Integer.valueOf((int) R.drawable.emoji_welldone));
        f130899a.put("GOODJOB", Integer.valueOf((int) R.drawable.emoji_goodjob));
        f130899a.put("HEARTBROKEN", Integer.valueOf((int) R.drawable.emoji_heartbroken));
        f130899a.put("POOP", Integer.valueOf((int) R.drawable.emoji_poop));
        f130899a.put("GIFT", Integer.valueOf((int) R.drawable.emoji_gift));
        f130899a.put("CAKE", Integer.valueOf((int) R.drawable.emoji_cake));
        f130899a.put("PARTY", Integer.valueOf((int) R.drawable.emoji_party));
        f130899a.put("EYESCLOSED", Integer.valueOf((int) R.drawable.emoji_eyesclosed));
        f130899a.put("BOMB", Integer.valueOf((int) R.drawable.emoji_bomb));
        f130899a.put("FIREWORKS", Integer.valueOf((int) R.drawable.emoji_fireworks));
        f130899a.put("BULL", Integer.valueOf((int) R.drawable.emoji_bull));
        f130899a.put("CALF", Integer.valueOf((int) R.drawable.emoji_calf));
        f130899a.put("AWESOMEN", Integer.valueOf((int) R.drawable.emoji_awesomen));
        f130899a.put("2021", Integer.valueOf((int) R.drawable.emoji_twentytwentyone));
        f130899a.put("CANDIEDHAWS", Integer.valueOf((int) R.drawable.emoji_candiedhaws));
        f130899a.put("REDPACKET", Integer.valueOf((int) R.drawable.emoji_redpacket));
        f130899a.put("FORTUNE", Integer.valueOf((int) R.drawable.emoji_fortune));
        f130899a.put("LUCK", Integer.valueOf((int) R.drawable.emoji_luck));
        f130899a.put("FIRECRACKER", Integer.valueOf((int) R.drawable.emoji_firecracker));
        f130899a.put("EatingFood", Integer.valueOf((int) R.drawable.emoji_eatingfood));
        f130899a.put("Typing", Integer.valueOf((int) R.drawable.emoji_typing));
        f130899a.put("Lemon", Integer.valueOf((int) R.drawable.emoji_lemon));
        f130899a.put("Get", Integer.valueOf((int) R.drawable.emoji_get));
        f130899a.put("LGTM", Integer.valueOf((int) R.drawable.emoji_lgtm));
        f130899a.put("ThumbsDown", Integer.valueOf((int) R.drawable.emoji_thumbsdown));
        f130899a.put("Drumstick", Integer.valueOf((int) R.drawable.emoji_drumstick));
        f130899a.put("Pepper", Integer.valueOf((int) R.drawable.emoji_pepper));
        f130899a.put("BubbleTea", Integer.valueOf((int) R.drawable.emoji_bubbletea));
        f130899a.put("Coffee", Integer.valueOf((int) R.drawable.emoji_coffee));
        f130899a.put("Yes", Integer.valueOf((int) R.drawable.emoji_yes));
        f130899a.put("No", Integer.valueOf((int) R.drawable.emoji_no));
        f130899a.put("OKR", Integer.valueOf((int) R.drawable.emoji_okr));
        f130899a.put("CheckMark", Integer.valueOf((int) R.drawable.emoji_checkmark));
        f130899a.put("CrossMark", Integer.valueOf((int) R.drawable.emoji_crossmark));
        f130899a.put("MinusOne", Integer.valueOf((int) R.drawable.emoji_minusone));
        f130899a.put("Hundred", Integer.valueOf((int) R.drawable.emoji_hundred));
        f130899a.put("Pin", Integer.valueOf((int) R.drawable.emoji_pin));
        f130899a.put("Alarm", Integer.valueOf((int) R.drawable.emoji_alarm));
        f130899a.put("Loudspeaker", Integer.valueOf((int) R.drawable.emoji_loudspeaker));
        f130899a.put("Trophy", Integer.valueOf((int) R.drawable.emoji_trophy));
        f130899a.put("Fire", Integer.valueOf((int) R.drawable.emoji_fire));
        f130899a.put("Music", Integer.valueOf((int) R.drawable.emoji_music));
    }

    /* renamed from: b */
    public static Bitmap m205218b(String str) {
        return EmojiMapManager.f136337c.mo188269b(str, false);
    }

    /* renamed from: c */
    public static String m205219c(String str) {
        return EmojiMapManager.f136337c.mo188271c(str, false);
    }

    /* renamed from: d */
    public static void m205220d(String str) {
        EmojiMapManager.f136337c.mo188274d(str, false);
    }

    /* renamed from: a */
    public static int m205215a(String str) {
        Integer num = f130899a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m205221e(String str) {
        if (str == null || (!EmojiMapManager.f136337c.mo188270b(str) && !EmojiMapManager.f136337c.mo188272c(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m205217a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        EmojiMapManager.f136337c.mo188265a(str, false, iGetDataCallback);
    }

    /* renamed from: a */
    public static Drawable m205216a(Context context, String str) {
        return new BitmapDrawable(EmojiMapManager.f136337c.mo188269b(str, false));
    }
}
