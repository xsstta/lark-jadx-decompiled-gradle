package com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b;

import android.content.Context;
import android.text.Spannable;
import android.view.KeyEvent;
import android.widget.EditText;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13233a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.d */
public class C13229d {

    /* renamed from: a */
    private Map<String, Integer> f35055a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.b.d$a */
    public static class C13231a {

        /* renamed from: a */
        public static C13229d f35056a = new C13229d();
    }

    /* renamed from: a */
    public static C13229d m53936a() {
        return C13231a.f35056a;
    }

    /* renamed from: b */
    public List<C13233a> mo49367b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : this.f35055a.entrySet()) {
            if (entry.getValue().intValue() != 0) {
                arrayList.add(new C13233a(entry.getKey()));
            } else {
                AppBrandLogger.m52829e("EmojiResMap", entry.getKey() + " invalid resource id");
            }
        }
        return arrayList;
    }

    private C13229d() {
        HashMap hashMap = new HashMap();
        this.f35055a = hashMap;
        hashMap.put("[微笑]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_smile")));
        this.f35055a.put("[爱慕]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_drool")));
        this.f35055a.put("[惊呆]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_scowl")));
        this.f35055a.put("[酷拽]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_irritated")));
        this.f35055a.put("[抠鼻]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_nosepick")));
        this.f35055a.put("[流泪]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_sob")));
        this.f35055a.put("[发怒]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_angry")));
        this.f35055a.put("[呲牙]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_grin")));
        this.f35055a.put("[鼾睡]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_sleep")));
        this.f35055a.put("[害羞]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_shy")));
        this.f35055a.put("[可爱]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_wink")));
        this.f35055a.put("[晕]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_dizzy")));
        this.f35055a.put("[衰]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_toasted")));
        this.f35055a.put("[闭嘴]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_silent")));
        this.f35055a.put("[机智]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_smart")));
        this.f35055a.put("[来看我]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_attention")));
        this.f35055a.put("[灵光一闪]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_witty")));
        this.f35055a.put("[耶]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_yeah")));
        this.f35055a.put("[捂脸]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_facepalm")));
        this.f35055a.put("[打脸]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_slap")));
        this.f35055a.put("[大笑]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_laugh")));
        this.f35055a.put("[哈欠]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_yawn")));
        this.f35055a.put("[震惊]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_shocked")));
        this.f35055a.put("[送心]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_love")));
        this.f35055a.put("[困]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_drowsy")));
        this.f35055a.put("[what]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_what")));
        this.f35055a.put("[泣不成声]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_cry")));
        this.f35055a.put("[小鼓掌]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_clap")));
        this.f35055a.put("[酷]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_showoff")));
        this.f35055a.put("[偷笑]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_chuckle")));
        this.f35055a.put("[石化]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_petrified")));
        this.f35055a.put("[思考]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_thinking")));
        this.f35055a.put("[吐血]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_spitblood")));
        this.f35055a.put("[可怜]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_whimper")));
        this.f35055a.put("[嘘]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_shhh")));
        this.f35055a.put("[撇嘴]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_smug")));
        this.f35055a.put("[黑线]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_errr")));
        this.f35055a.put("[笑哭]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_lol")));
        this.f35055a.put("[雾霾]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_sick")));
        this.f35055a.put("[奸笑]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_smirk")));
        this.f35055a.put("[得意]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_proud")));
        this.f35055a.put("[憨笑]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_trick")));
        this.f35055a.put("[抓狂]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_crazy")));
        this.f35055a.put("[泪奔]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_tears")));
        this.f35055a.put("[钱]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_money")));
        this.f35055a.put("[吻]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_kiss")));
        this.f35055a.put("[恐惧]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_terror")));
        this.f35055a.put("[笑]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_joyful")));
        this.f35055a.put("[快哭了]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_blubber")));
        this.f35055a.put("[翻白眼]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_husky")));
        this.f35055a.put("[互粉]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_followme")));
        this.f35055a.put("[赞]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_thumbsup")));
        this.f35055a.put("[鼓掌]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_applaud")));
        this.f35055a.put("[谢谢]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_thanks")));
        this.f35055a.put("[去污粉]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_detergent")));
        this.f35055a.put("[666]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_awesome")));
        this.f35055a.put("[玫瑰]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_rose")));
        this.f35055a.put("[胡瓜]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_cucumber")));
        this.f35055a.put("[啤酒]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_beer")));
        this.f35055a.put("[我想静静]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_enough")));
        this.f35055a.put("[委屈]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_wronged")));
        this.f35055a.put("[舔屏]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_obsessed")));
        this.f35055a.put("[鄙视]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_lookdown")));
        this.f35055a.put("[飞吻]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_smooch")));
        this.f35055a.put("[再见]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_wave")));
        this.f35055a.put("[紫薇别走]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_donnotgo")));
        this.f35055a.put("[听歌]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_headset")));
        this.f35055a.put("[求抱抱]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_hug")));
        this.f35055a.put("[吐舌]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_tongue")));
        this.f35055a.put("[呆无辜]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_dull")));
        this.f35055a.put("[看]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_glance")));
        this.f35055a.put("[白眼]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_slight")));
        this.f35055a.put("[熊吉]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_bear")));
        this.f35055a.put("[骷髅]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_skull")));
        this.f35055a.put("[黑脸]", Integer.valueOf(LarkHostDependManager.f34682b.mo49086a().mo48915a("drawable", "emoji_blackface")));
    }

    /* renamed from: a */
    public static void m53937a(EditText editText) {
        if (editText != null) {
            editText.dispatchKeyEvent(new KeyEvent(0, 0, 0, 67, 0, 0, 0, 0, 6));
        }
    }

    /* renamed from: a */
    public void mo49366a(Context context, Spannable spannable, int i, int i2, int i3, int i4, int i5, boolean z) {
        C13232e[] eVarArr;
        int length = spannable.length();
        if (length != 0) {
            for (C13232e eVar : (C13232e[]) spannable.getSpans(0, length, C13232e.class)) {
                spannable.removeSpan(eVar);
            }
            StringBuilder sb = new StringBuilder();
            int i6 = -1;
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = spannable.charAt(i7);
                if ('[' == charAt) {
                    sb.delete(0, sb.length());
                    sb.append(charAt);
                    i6 = i7;
                } else if (i6 >= 0 && ']' != charAt) {
                    sb.append(charAt);
                } else if (']' == charAt && i6 >= 0) {
                    sb.append(charAt);
                    String sb2 = sb.toString();
                    Integer num = this.f35055a.get(sb2);
                    if (num == null || num.intValue() == 0) {
                        AppBrandLogger.m52830i("EmojiResMap", "---emoji resourceId is not valid");
                    } else {
                        AppBrandLogger.m52830i("EmojiResMap", "add EmojiconSpan to text");
                        spannable.setSpan(new C13232e(context, num.intValue(), sb2, i, i2, i3), i6, sb2.length() + i6, 33);
                    }
                    i6 = -1;
                }
            }
        }
    }
}
