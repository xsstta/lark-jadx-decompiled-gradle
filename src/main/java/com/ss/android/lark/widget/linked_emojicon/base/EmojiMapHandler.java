package com.ss.android.lark.widget.linked_emojicon.base;

import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R-\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00048FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/widget/linked_emojicon/base/EmojiMapHandler;", "", "()V", "destToUnicodeMap", "", "", "", "destToUnicodeMap$annotations", "getDestToUnicodeMap", "()Ljava/util/Map;", "destToUnicodeMap$delegate", "Lkotlin/Lazy;", "emojiMap", "emojiMap$annotations", "getEmojiMap", "emojiMap$delegate", "generateDestToEmojiMap", "generateEmojiMap", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.linked_emojicon.base.a */
public final class EmojiMapHandler {

    /* renamed from: a */
    public static final EmojiMapHandler f144342a = new EmojiMapHandler();

    /* renamed from: b */
    private static final Lazy f144343b = LazyKt.lazy(C58501a.INSTANCE);

    /* renamed from: c */
    private static final Lazy f144344c = LazyKt.lazy(C58502b.INSTANCE);

    /* renamed from: a */
    public static final Map<String, Integer> m226958a() {
        return (Map) f144343b.getValue();
    }

    /* renamed from: b */
    public static final Map<Integer, Integer> m226959b() {
        return (Map) f144344c.getValue();
    }

    private EmojiMapHandler() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.linked_emojicon.base.a$a */
    static final class C58501a extends Lambda implements Function0<Map<String, ? extends Integer>> {
        public static final C58501a INSTANCE = new C58501a();

        C58501a() {
            super(0);
        }

        /* Return type fixed from 'java.util.Map<java.lang.String, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends Integer> invoke() {
            return EmojiMapHandler.f144342a.mo198294c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.linked_emojicon.base.a$b */
    static final class C58502b extends Lambda implements Function0<Map<Integer, ? extends Integer>> {
        public static final C58502b INSTANCE = new C58502b();

        C58502b() {
            super(0);
        }

        /* Return type fixed from 'java.util.Map<java.lang.Integer, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Map<Integer, ? extends Integer> invoke() {
            return EmojiMapHandler.f144342a.mo198295d();
        }
    }

    /* renamed from: c */
    public final Map<String, Integer> mo198294c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(129851, new String[]{"[Lark_Emoji_Blubber_0]", "[泣きそう]", "[快哭了]", "[Blubber]", "[Weeping]"});
        linkedHashMap.put(129882, new String[]{"[Trick]", "[Lark_Emoji_Trick_0]", "[憨笑]", "[馬鹿笑い]", "[Tease]"});
        linkedHashMap.put(129807, new String[]{"[ビール]", "[Lark_Emoji_Beer_0]", "[Beer]", "[啤酒]"});
        linkedHashMap.put(129871, new String[]{"[Lol]", "[Lark_Emoji_Lol_0]", "[笑い泣き]", "[笑哭]", "[泣き笑い]"});
        linkedHashMap.put(129810, new String[]{"[Eating]", "[お茶の間の皆さん]", "[吃瓜群众]", "[Lark_Emoji_Eating_0]", "[Onlooker]", "[見物する]"});
        linkedHashMap.put(129811, new String[]{"[撒花]", "[祝福]", "[Party]", "[Lark_Emoji_Party_0]", "[おめでとう]"});
        linkedHashMap.put(129896, new String[]{"[鼾睡]", "[Sleep]", "[Lark_Emoji_Sleep_0]", "[いびき]"});
        linkedHashMap.put(129906, new String[]{"[Grin]", "[ニヤリ]", "[Lark_Emoji_Grin_0]", "[呲牙]", "[歯を見せて笑う]"});
        linkedHashMap.put(129905, new String[]{"[キレそう]", "[Lark_Emoji_Crazy_0]", "[Crazy]", "[抓狂]"});
        linkedHashMap.put(129816, new String[]{"[Angry]", "[发怒]", "[Lark_Emoji_Angry_0]", "[怒り]"});
        linkedHashMap.put(129891, new String[]{"[Embarrassed]", "[照れ笑い]", "[Lark_Emoji_Embarrassed_0]", "[尬笑]", "[気まずい]"});
        linkedHashMap.put(129879, new String[]{"[翻白眼]", "[Lark_Emoji_Husky_0]", "[Husky]", "[白目をむく]", "[RollEyes]"});
        linkedHashMap.put(129792, new String[]{"[Salute]", "[礼]", "[抱拳]"});
        linkedHashMap.put(129841, new String[]{"[Petrified]", "[Lark_Emoji_Petrified_0]", "[石化]", "[固まる]"});
        linkedHashMap.put(129867, new String[]{"[InnocentSmile]", "[无辜笑]", "[Lark_Emoji_InnocentSmile_0]", "[無邪気な笑顔]", "[Innocent]", "[無邪気]"});
        linkedHashMap.put(129818, new String[]{"[Drowsy]", "[Lark_Emoji_Drowsy_0]", "[眠い]", "[困]"});
        linkedHashMap.put(129860, new String[]{"[Lark_Emoji_Detergent_0]", "[Detergent]", "[洗剤]", "[去污粉]"});
        linkedHashMap.put(129886, new String[]{"[酷拽]", "[Lark_Emoji_haughty_0]", "[クールでかっこいい]", "[Haughty]", "[Ruthless]"});
        linkedHashMap.put(129804, new String[]{"[小鼓掌]", "[Clap]", "[小さく拍手]", "[Lark_Emoji_Clap_0]"});
        linkedHashMap.put(129842, new String[]{"[左上]", "[Lark_Emoji_UpperLeft_0]", "[UpperLeft]", "[Click]", "[クリック]", "[点击]"});
        linkedHashMap.put(129869, new String[]{"[Big Kiss]", "[如花]", "[Lark_Emoji_BigKiss_0]", "[ビッグキス]", "[BigKiss]"});
        linkedHashMap.put(129817, new String[]{"[愛]", "[爱心]", "[Lark_Emoji_Heart_0]", "[Heart]", "[ハート]"});
        linkedHashMap.put(129848, new String[]{"[ケーキ]", "[蛋糕]", "[Lark_Emoji_Cake_0]", "[Cake]"});
        linkedHashMap.put(129861, new String[]{"[叩く]", "[Hammer]", "[敲打]", "[Lark_Emoji_Hammer_0]"});
        linkedHashMap.put(129836, new String[]{"[Lark_Emoji_Strive_0]", "[奋斗]", "[Strive]", "[頑張る]", "[Determined]"});
        linkedHashMap.put(129903, new String[]{"[Love]", "[送心]", "[ハートを送る]", "[Lark_Emoji_Love_0]", "[Support]"});
        linkedHashMap.put(129843, new String[]{"[Lark_Emoji_FollowMe_0]", "[FollowMe]", "[互粉]", "[相互フォロー]"});
        linkedHashMap.put(129832, new String[]{"[WellDone]", "[Lark_Emoji_WellDone_0]", "[V5]"});
        linkedHashMap.put(129822, new String[]{"[看]", "[Lark_Emoji_Glance_0]", "[Glance]", "[見る]"});
        linkedHashMap.put(129865, new String[]{"[あっかんべえ]", "[Tongue]", "[吐舌]", "[Lark_Emoji_Tongue_0]", "[TongueOut]", "[舌を出す]"});
        linkedHashMap.put(129859, new String[]{"[Wronged]", "[委屈]", "[Lark_Emoji_Wronged_0]", "[不満]", "[悔しい]"});
        linkedHashMap.put(129883, new String[]{"[赞]", "[Thumbsup]", "[Lark_Emoji_Thumbsup_0]", "[いいね]"});
        linkedHashMap.put(129840, new String[]{"[摸头]", "[頭をなでる]", "[Lark_Emoji_Comfort_0]", "[Comfort]", "[Hearten]"});
        linkedHashMap.put(129827, new String[]{"[雾霾]", "[スモッグ]", "[Lark_Emoji_Sick_0]", "[Sick]", "[病気]"});
        linkedHashMap.put(129902, new String[]{"[Money]", "[お金]", "[Lark_Emoji_Money_0]", "[钱]"});
        linkedHashMap.put(129812, new String[]{"[さようなら]", "[Wave]", "[Lark_Emoji_Wave_0]", "[再见]"});
        linkedHashMap.put(129849, new String[]{"[白眼]", "[白い目]", "[Slight]", "[Lark_Emoji_Slight_0]", "[SideGlance]"});
        linkedHashMap.put(129874, new String[]{"[比心]", "[Lark_Emoji_FingerHeart_0]", "[FingerHeart]", "[手でハートを作る]"});
        linkedHashMap.put(129793, new String[]{"[Lark_Emoji_Applaud_0]", "[Applaud]", "[鼓掌]", "[拍手]"});
        linkedHashMap.put(129806, new String[]{"[Lark_Emoji_Yeah_0]", "[Yes]", "[耶]", "[Yeah]", "[イエーイ]"});
        linkedHashMap.put(129823, new String[]{"[口をゆがめる]", "[撇嘴]", "[Lark_Emoji_Smug_0]", "[Smug]"});
        linkedHashMap.put(129858, new String[]{"[Lark_Emoji_What_0]", "[what]", "[何？]", "[What]", "[What?]", "[什么？]"});
        linkedHashMap.put(129845, new String[]{"[灵光一闪]", "[ひらめき]", "[Lark_Emoji_Witty_0]", "[Witty]"});
        linkedHashMap.put(129864, new String[]{"[行かないで]", "[紫薇别走]", "[Don't go]", "[Lark_Emoji_DonnotGo_0]", "[Amazed]"});
        linkedHashMap.put(129819, new String[]{"[Lark_Emoji_BlackFace_0]", "[黑脸]", "[不機嫌]", "[New Moon Face]", "[MoonFace]", "[黒顔]"});
        linkedHashMap.put(129897, new String[]{"[ナイフ]", "[Lark_Emoji_Cleaver_0]", "[Cleaver]", "[刀]", "[包丁]"});
        linkedHashMap.put(129799, new String[]{"[Chuckle]", "[Lark_Emoji_Chuckle_0]", "[偷笑]", "[盗み笑い]"});
        linkedHashMap.put(129890, new String[]{"[眉をひそめる]", "[Lark_Emoji_Frown_0]", "[Frown]", "[皱眉]"});
        linkedHashMap.put(129868, new String[]{"[泪奔]", "[あふれる涙]", "[Tears]", "[Lark_Emoji_Tears_0]"});
        linkedHashMap.put(129795, new String[]{"[眩暈]", "[Lark_Emoji_Dizzy_0]", "[晕]", "[Dizzy]", "[めまい]"});
        linkedHashMap.put(129881, new String[]{"[すごい]", "[给力]", "[GoodJob]", "[Lark_Emoji_GoodJob_0]"});
        linkedHashMap.put(129808, new String[]{"[Smirk]", "[陰険に笑う]", "[奸笑]", "[Lark_Emoji_Smirk_0]", "[にやにや]"});
        linkedHashMap.put(129898, new String[]{"[賢い]", "[Lark_Emoji_Smart_0]", "[机智]", "[Smart]"});
        linkedHashMap.put(129878, new String[]{"[恐怖]", "[Terror]", "[Lark_Emoji_Terror_0]", "[恐惧]", "[怖い]"});
        linkedHashMap.put(129802, new String[]{"[Lark_Emoji_Dull_0]", "[呆无辜]", "[Dull]", "[呆然]", "[唖然]"});
        linkedHashMap.put(129895, new String[]{"[凝視]", "[DullStare]", "[Lark_Emoji_DullStare_0]", "[凝视]", "[Boring]"});
        linkedHashMap.put(129835, new String[]{"[吐血]", "[Lark_Emoji_SpitBlood_0]", "[SpitBlood]"});
        linkedHashMap.put(129797, new String[]{"[Praise]", "[Lark_Emoji_Praise_0]", "[强]", "[強い]", "[よくできた]"});
        linkedHashMap.put(129853, new String[]{"[Lark_Emoji_Laugh_0]", "[大笑い]", "[大笑]", "[Laugh]"});
        linkedHashMap.put(129813, new String[]{"[Lark_Emoji_Betrayed_0]", "[Betrayed]", "[裏切り]", "[绿帽子]", "[Mad]", "[ムカつく]", "[气愤]"});
        linkedHashMap.put(129880, new String[]{"[汗]", "[Sweat]", "[Lark_Emoji_Sweat_0]"});
        linkedHashMap.put(129826, new String[]{"[泣不成声]", "[Lark_Emoji_Cry_0]", "[すすり泣き]", "[Cry]"});
        linkedHashMap.put(129862, new String[]{"[Bear]", "[Lark_Emoji_Bear_0]", "[熊吉]", "[Huh?]", "[クマ吉]", "[啊？]"});
        linkedHashMap.put(129824, new String[]{"[Lark_Emoji_Speechless_0]", "[汗を拭く]", "[擦汗]", "[Speechless]", "[无语]"});
        linkedHashMap.put(129805, new String[]{"[満足]", "[Lark_Emoji_Proud_0]", "[得意]", "[Proud]", "[ドヤ顔]"});
        linkedHashMap.put(129800, new String[]{"[ドクロ]", "[Lark_Emoji_Skull_0]", "[Skull]", "[骷髅]"});
        linkedHashMap.put(129825, new String[]{"[Lark_Emoji_Tease_0]", "[做鬼脸]", "[あっかんべえをする]", "[Goofy]", "[あっかんべえ]"});
        linkedHashMap.put(129877, new String[]{"[Lark_Emoji_Thanks_0]", "[ありがとう]", "[Thanks]", "[谢谢]"});
        linkedHashMap.put(129830, new String[]{"[Yawn]", "[哈欠]", "[あくび]", "[Lark_Emoji_Yawn_0]"});
        linkedHashMap.put(129834, new String[]{"[Joyful]", "[笑い]", "[笑]", "[Lark_Emoji_Joyful_0]"});
        linkedHashMap.put(129884, new String[]{"[害羞]", "[Lark_Emoji_Shy_0]", "[Shy]", "[恥ずかしい]"});
        linkedHashMap.put(129876, new String[]{"[Lark_Emoji_Wail_0]", "[Wail]", "[大泣き]", "[大哭]"});
        linkedHashMap.put(129899, new String[]{"[Hug]", "[抱きしめて]", "[求抱抱]", "[Lark_Emoji_Hug_0]"});
        linkedHashMap.put(129854, new String[]{"[軽蔑]", "[鄙视]", "[LookDown]", "[Lark_Emoji_LookDown_0]", "[見下す]"});
        linkedHashMap.put(129904, new String[]{"[Lark_Emoji_Lips_0]", "[キス]", "[kiss]", "[Lips]"});
        linkedHashMap.put(129855, new String[]{"[爱慕]", "[Lark_Emoji_Drool_0]", "[Drool]", "[うらやましい]", "[InLove]", "[ハート目]"});
        linkedHashMap.put(129893, new String[]{"[微笑]", "[Lark_Emoji_Smile_0]", "[Smile]", "[スマイル]"});
        linkedHashMap.put(129852, new String[]{"[私を見に来てください]", "[Attention]", "[来看我]", "[Lark_Emoji_Attention_0]"});
        linkedHashMap.put(129844, new String[]{"[可怜]", "[Whimper]", "[Lark_Emoji_Whimper_0]", "[かわいそう]"});
        linkedHashMap.put(129798, new String[]{"[Lark_Emoji_Wink_0]", "[かわいい]", "[Wink]", "[可爱]"});
        linkedHashMap.put(129794, new String[]{"[飞吻]", "[投げキッス]", "[Lark_Emoji_Smooch_0]", "[Smooch]", "[Mwah]", "[投げキス]"});
        linkedHashMap.put(129885, new String[]{"[打脸]", "[Lark_Emoji_Slap_0]", "[Slap]", "[ビンタする]", "[ビンタ]"});
        linkedHashMap.put(129863, new String[]{"[脸红]", "[赤面]", "[Lark_Emoji_Blush_0]", "[Blush]", "[Blushed]", "[おとなしい]"});
        linkedHashMap.put(129809, new String[]{"[听歌]", "[歌を聴く]", "[Headset]", "[Lark_Emoji_Headset_0]"});
        linkedHashMap.put(129814, new String[]{"[グータッチ]", "[FistBump]", "[Lark_Emoji_FistBump_0]", "[碰拳]"});
        linkedHashMap.put(129846, new String[]{"[照れ臭い]", "[Lark_Emoji_Facepalm_0]", "[Facepalm]", "[捂脸]", "[ダメだこりゃ]"});
        linkedHashMap.put(129850, new String[]{"[黙る]", "[Silent]", "[闭嘴]", "[Lark_Emoji_Silent_0]"});
        linkedHashMap.put(129815, new String[]{"[吻]", "[Lark_Emoji_Kiss_0]", "[Kiss]", "[キス顔]"});
        linkedHashMap.put(129828, new String[]{"[Lark_Emoji_Enough_0]", "[Enough]", "[我想静静]", "[静かになりたい]", "[Stop]"});
        linkedHashMap.put(129887, new String[]{"[炸弹]", "[Bomb]", "[Lark_Emoji_Bomb_0]", "[爆弾]"});
        linkedHashMap.put(129892, new String[]{"[きゅうり]", "[Lark_Emoji_Cucumber_0]", "[Cucumber]", "[胡瓜]"});
        linkedHashMap.put(129831, new String[]{"[Lark_Emoji_Gift_0]", "[プレゼント]", "[礼物]", "[Gift]"});
        linkedHashMap.put(129889, new String[]{"[驚き]", "[Lark_Emoji_Wow_0]", "[Wow]", "[惊喜]", "[わ〜]"});
        linkedHashMap.put(129839, new String[]{"[Shhh]", "[嘘]", "[シーッ]", "[Lark_Emoji_Shhh_0]"});
        linkedHashMap.put(129796, new String[]{"[Lark_Emoji_Sob_0]", "[流泪]", "[涙]", "[Sob]"});
        linkedHashMap.put(129870, new String[]{"[抠鼻]", "[鼻をほじる]", "[Lark_Emoji_NosePick_0]", "[NosePick]"});
        linkedHashMap.put(129866, new String[]{"[Rose]", "[玫瑰]", "[Lark_Emoji_Rose_0]", "[バラ]"});
        linkedHashMap.put(129907, new String[]{"[+1]"});
        linkedHashMap.put(129833, new String[]{"[Puke]", "[吐く]", "[Lark_Emoji_Puke_0]", "[吐]"});
        linkedHashMap.put(129847, new String[]{"[握手]", "[Lark_Emoji_Shake_0]", "[Shake]"});
        linkedHashMap.put(129801, new String[]{"[惊呆]", "[Lark_Emoji_Scowl_0]", "[Scowl]", "[驚いてぽかんとする]", "[Dumbstruck]", "[びっくり]"});
        linkedHashMap.put(129838, new String[]{"[クール]", "[Lark_Emoji_ShowOff_0]", "[Cool]", "[酷]", "[かっこいい]"});
        linkedHashMap.put(129872, new String[]{"[666]", "[Lark_Emoji_Awesome_0]", "[Awesome]"});
        linkedHashMap.put(129894, new String[]{"[画面を舐めるように見る]", "[Lark_Emoji_Obsessed_0]", "[舔屏]", "[Obsessed]", "[たまらない]"});
        linkedHashMap.put(129857, new String[]{"[悲しい]", "[伤心]", "[HeartBroken]", "[Lark_Emoji_HeartBroken_0]", "[心が折れる]"});
        linkedHashMap.put(129875, new String[]{"[震惊]", "[ショック]", "[Shocked]", "[Lark_Emoji_Shocked_0]"});
        linkedHashMap.put(129900, new String[]{"[Lark_Emoji_EyesClosed_0]", "[不看]", "[EyesClosed]", "[見ない]", "[見ざる]"});
        linkedHashMap.put(129821, new String[]{"[ハイタッチ]", "[击掌]", "[HighFive]", "[Lark_Emoji_HighFive_0]"});
        linkedHashMap.put(129873, new String[]{"[Errr]", "[縦線]", "[Lark_Emoji_Errr_0]", "[黑线]", "[言葉が出ない]"});
        linkedHashMap.put(129837, new String[]{"[口から虹を出す]", "[吐彩虹]", "[Lark_Emoji_RainbowPuke_0]", "[RainbowPuke]", "[Rainbow]", "[彩虹]", "[虹]"});
        linkedHashMap.put(129888, new String[]{"[加油]", "[Fighting]", "[Lark_Emoji_Fighting_0]", "[頑張れ]", "[Strength]"});
        linkedHashMap.put(129909, new String[]{"[終わった]", "[Done]", "[完成]", "[できた]"});
        linkedHashMap.put(129829, new String[]{"[衰弱する]", "[Lark_Emoji_Toasted_0]", "[Toasted]", "[衰]", "[黒こげ]"});
        linkedHashMap.put(129856, new String[]{"[Thinking]", "[思考]", "[Lark_Emoji_Thinking_0]"});
        linkedHashMap.put(129901, new String[]{"[Lark_Emoji_Poop_0]", "[Poop]", "[屎]", "[うんち]"});
        linkedHashMap.put(129803, new String[]{"[18禁]", "[18x]", "[Lark_Emoji_18x_0]", "[18+]"});
        linkedHashMap.put(129820, new String[]{"[Lark_Emoji_OK_0]", "[OK]"});
        linkedHashMap.put(129910, new String[]{"[Fireworks]", "[烟花]", "[花火]"});
        linkedHashMap.put(129911, new String[]{"[Bull]", "[公牛]", "[雄牛]"});
        linkedHashMap.put(129912, new String[]{"[Calf]", "[小牛]", "[子牛]"});
        linkedHashMap.put(129913, new String[]{"[Awesomen]", "[牛]", "[CoolSign]", "[最高]"});
        linkedHashMap.put(129914, new String[]{"[2021]", "[2021]"});
        linkedHashMap.put(129915, new String[]{"[Candiedhaws]", "[冰糖葫芦]", "[CandiedHaws]", "[サンザシ飴]"});
        linkedHashMap.put(129916, new String[]{"[Redpacket]", "[红包]", "[お年玉]", "[RedPacket]"});
        linkedHashMap.put(129917, new String[]{"[Fortune]", "[发]", "[發]"});
        linkedHashMap.put(129918, new String[]{"[Luck]", "[福]"});
        linkedHashMap.put(129919, new String[]{"[Firecracker]", "[爆竹]"});
        linkedHashMap.put(129920, new String[]{"[EatingFood]", "[吃饭]", "[Eating]", "[いただき]"});
        linkedHashMap.put(129921, new String[]{"[Typing]", "[敲键盘]", "[入力中]"});
        linkedHashMap.put(129922, new String[]{"[Lemon]", "[柠檬]", "[レモン]"});
        linkedHashMap.put(129923, new String[]{"[Get]", "[了解]"});
        linkedHashMap.put(129924, new String[]{"[LGTM]", "[LooksGoodToMe]", "[いいと思う]"});
        linkedHashMap.put(129925, new String[]{"[ThumbsDown]", "[拇指向下]", "[よくないね]"});
        linkedHashMap.put(129926, new String[]{"[Drumstick]", "[鸡腿]", "[鶏もも]"});
        linkedHashMap.put(129927, new String[]{"[Pepper]", "[辣椒]", "[唐辛子]"});
        linkedHashMap.put(129928, new String[]{"[BubbleTea]", "[奶茶]", "[タピオカ]"});
        linkedHashMap.put(129929, new String[]{"[Coffee]", "[咖啡]", "[コーヒー]"});
        linkedHashMap.put(129930, new String[]{"[Yes]"});
        linkedHashMap.put(129931, new String[]{"[No]"});
        linkedHashMap.put(129932, new String[]{"[OKR]"});
        linkedHashMap.put(129933, new String[]{"[CheckMark]", "[勾号]", "[チェック]"});
        linkedHashMap.put(129934, new String[]{"[CrossMark]", "[叉号]", "[バツ]"});
        linkedHashMap.put(129935, new String[]{"[MinusOne]", "[-1]"});
        linkedHashMap.put(129936, new String[]{"[Hundred]", "[100分]", "[100]", "[100 点]"});
        linkedHashMap.put(129937, new String[]{"[Pin]", "[图钉]", "[ピン留め]"});
        linkedHashMap.put(129938, new String[]{"[Alarm]", "[闹钟]", "[アラーム]"});
        linkedHashMap.put(129939, new String[]{"[Loudspeaker]", "[喇叭]", "[スピーカー]"});
        linkedHashMap.put(129940, new String[]{"[Trophy]", "[奖杯]", "[トロフィー]"});
        linkedHashMap.put(129941, new String[]{"[Fire]", "[火]", "[火]"});
        linkedHashMap.put(129942, new String[]{"[Music]", "[音乐]", "[音符]"});
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object[] objArr = (Object[]) entry.getValue();
            ArrayList arrayList2 = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList2.add(new Pair((String) obj, entry.getKey()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return MapsKt.toMap(arrayList);
    }

    /* renamed from: d */
    public final Map<Integer, Integer> mo198295d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(129893, Integer.valueOf((int) R.drawable.emoji_smile));
        linkedHashMap.put(129855, Integer.valueOf((int) R.drawable.emoji_drool));
        linkedHashMap.put(129801, Integer.valueOf((int) R.drawable.emoji_scowl));
        linkedHashMap.put(129886, Integer.valueOf((int) R.drawable.emoji_irritated));
        linkedHashMap.put(129870, Integer.valueOf((int) R.drawable.emoji_nosepick));
        linkedHashMap.put(129796, Integer.valueOf((int) R.drawable.emoji_sob));
        linkedHashMap.put(129816, Integer.valueOf((int) R.drawable.emoji_angry));
        linkedHashMap.put(129906, Integer.valueOf((int) R.drawable.emoji_grin));
        linkedHashMap.put(129896, Integer.valueOf((int) R.drawable.emoji_sleep));
        linkedHashMap.put(129884, Integer.valueOf((int) R.drawable.emoji_shy));
        linkedHashMap.put(129798, Integer.valueOf((int) R.drawable.emoji_wink));
        linkedHashMap.put(129795, Integer.valueOf((int) R.drawable.emoji_dizzy));
        linkedHashMap.put(129829, Integer.valueOf((int) R.drawable.emoji_toasted));
        linkedHashMap.put(129850, Integer.valueOf((int) R.drawable.emoji_silent));
        linkedHashMap.put(129898, Integer.valueOf((int) R.drawable.emoji_smart));
        linkedHashMap.put(129852, Integer.valueOf((int) R.drawable.emoji_attention));
        linkedHashMap.put(129845, Integer.valueOf((int) R.drawable.emoji_witty));
        linkedHashMap.put(129806, Integer.valueOf((int) R.drawable.emoji_yeah));
        linkedHashMap.put(129846, Integer.valueOf((int) R.drawable.emoji_facepalm));
        linkedHashMap.put(129885, Integer.valueOf((int) R.drawable.emoji_slap));
        linkedHashMap.put(129853, Integer.valueOf((int) R.drawable.emoji_laugh));
        linkedHashMap.put(129830, Integer.valueOf((int) R.drawable.emoji_yawn));
        linkedHashMap.put(129875, Integer.valueOf((int) R.drawable.emoji_shocked));
        linkedHashMap.put(129903, Integer.valueOf((int) R.drawable.emoji_love));
        linkedHashMap.put(129818, Integer.valueOf((int) R.drawable.emoji_drowsy));
        linkedHashMap.put(129858, Integer.valueOf((int) R.drawable.emoji_what));
        linkedHashMap.put(129826, Integer.valueOf((int) R.drawable.emoji_cry));
        linkedHashMap.put(129804, Integer.valueOf((int) R.drawable.emoji_clap));
        linkedHashMap.put(129838, Integer.valueOf((int) R.drawable.emoji_showoff));
        linkedHashMap.put(129799, Integer.valueOf((int) R.drawable.emoji_chuckle));
        linkedHashMap.put(129841, Integer.valueOf((int) R.drawable.emoji_petrified));
        linkedHashMap.put(129856, Integer.valueOf((int) R.drawable.emoji_thinking));
        linkedHashMap.put(129835, Integer.valueOf((int) R.drawable.emoji_spitblood));
        linkedHashMap.put(129844, Integer.valueOf((int) R.drawable.emoji_whimper));
        linkedHashMap.put(129839, Integer.valueOf((int) R.drawable.emoji_shhh));
        linkedHashMap.put(129823, Integer.valueOf((int) R.drawable.emoji_smug));
        linkedHashMap.put(129873, Integer.valueOf((int) R.drawable.emoji_errr));
        linkedHashMap.put(129871, Integer.valueOf((int) R.drawable.emoji_lol));
        linkedHashMap.put(129827, Integer.valueOf((int) R.drawable.emoji_sick));
        linkedHashMap.put(129808, Integer.valueOf((int) R.drawable.emoji_smirk));
        linkedHashMap.put(129805, Integer.valueOf((int) R.drawable.emoji_proud));
        linkedHashMap.put(129882, Integer.valueOf((int) R.drawable.emoji_trick));
        linkedHashMap.put(129905, Integer.valueOf((int) R.drawable.emoji_crazy));
        linkedHashMap.put(129868, Integer.valueOf((int) R.drawable.emoji_tears));
        linkedHashMap.put(129902, Integer.valueOf((int) R.drawable.emoji_money));
        linkedHashMap.put(129815, Integer.valueOf((int) R.drawable.emoji_kiss));
        linkedHashMap.put(129878, Integer.valueOf((int) R.drawable.emoji_terror));
        linkedHashMap.put(129834, Integer.valueOf((int) R.drawable.emoji_joyful));
        linkedHashMap.put(129851, Integer.valueOf((int) R.drawable.emoji_blubber));
        linkedHashMap.put(129879, Integer.valueOf((int) R.drawable.emoji_husky));
        linkedHashMap.put(129843, Integer.valueOf((int) R.drawable.emoji_followme));
        linkedHashMap.put(129883, Integer.valueOf((int) R.drawable.emoji_thumbsup));
        linkedHashMap.put(129793, Integer.valueOf((int) R.drawable.emoji_applaud));
        linkedHashMap.put(129877, Integer.valueOf((int) R.drawable.emoji_thanks));
        linkedHashMap.put(129888, Integer.valueOf((int) R.drawable.emoji_fighting));
        linkedHashMap.put(129820, Integer.valueOf((int) R.drawable.emoji_ok));
        linkedHashMap.put(129817, Integer.valueOf((int) R.drawable.emoji_heart));
        linkedHashMap.put(129904, Integer.valueOf((int) R.drawable.emoji_lips));
        linkedHashMap.put(129860, Integer.valueOf((int) R.drawable.emoji_detergent));
        linkedHashMap.put(129872, Integer.valueOf((int) R.drawable.emoji_awesome));
        linkedHashMap.put(129866, Integer.valueOf((int) R.drawable.emoji_rose));
        linkedHashMap.put(129892, Integer.valueOf((int) R.drawable.emoji_cucumber));
        linkedHashMap.put(129807, Integer.valueOf((int) R.drawable.emoji_beer));
        linkedHashMap.put(129828, Integer.valueOf((int) R.drawable.emoji_enough));
        linkedHashMap.put(129859, Integer.valueOf((int) R.drawable.emoji_wronged));
        linkedHashMap.put(129894, Integer.valueOf((int) R.drawable.emoji_obsessed));
        linkedHashMap.put(129854, Integer.valueOf((int) R.drawable.emoji_lookdown));
        linkedHashMap.put(129794, Integer.valueOf((int) R.drawable.emoji_smooch));
        linkedHashMap.put(129812, Integer.valueOf((int) R.drawable.emoji_wave));
        linkedHashMap.put(129864, Integer.valueOf((int) R.drawable.emoji_donnotgo));
        linkedHashMap.put(129809, Integer.valueOf((int) R.drawable.emoji_headset));
        linkedHashMap.put(129899, Integer.valueOf((int) R.drawable.emoji_hug));
        linkedHashMap.put(129895, Integer.valueOf((int) R.drawable.emoji_dullstare));
        linkedHashMap.put(129867, Integer.valueOf((int) R.drawable.emoji_innocentsmile));
        linkedHashMap.put(129865, Integer.valueOf((int) R.drawable.emoji_tongue));
        linkedHashMap.put(129802, Integer.valueOf((int) R.drawable.emoji_dull));
        linkedHashMap.put(129822, Integer.valueOf((int) R.drawable.emoji_glance));
        linkedHashMap.put(129849, Integer.valueOf((int) R.drawable.emoji_slight));
        linkedHashMap.put(129862, Integer.valueOf((int) R.drawable.emoji_bear));
        linkedHashMap.put(129800, Integer.valueOf((int) R.drawable.emoji_skull));
        linkedHashMap.put(129819, Integer.valueOf((int) R.drawable.emoji_blackface));
        linkedHashMap.put(129810, Integer.valueOf((int) R.drawable.emoji_eating));
        linkedHashMap.put(129813, Integer.valueOf((int) R.drawable.emoji_betrayed));
        linkedHashMap.put(129880, Integer.valueOf((int) R.drawable.emoji_sweat));
        linkedHashMap.put(129840, Integer.valueOf((int) R.drawable.emoji_comfort));
        linkedHashMap.put(129890, Integer.valueOf((int) R.drawable.emoji_frown));
        linkedHashMap.put(129824, Integer.valueOf((int) R.drawable.emoji_speechless));
        linkedHashMap.put(129863, Integer.valueOf((int) R.drawable.emoji_blush));
        linkedHashMap.put(129891, Integer.valueOf((int) R.drawable.emoji_embarrassed));
        linkedHashMap.put(129825, Integer.valueOf((int) R.drawable.emoji_tease));
        linkedHashMap.put(129797, Integer.valueOf((int) R.drawable.emoji_praise));
        linkedHashMap.put(129869, Integer.valueOf((int) R.drawable.emoji_bigkiss));
        linkedHashMap.put(129833, Integer.valueOf((int) R.drawable.emoji_puke));
        linkedHashMap.put(129889, Integer.valueOf((int) R.drawable.emoji_wow));
        linkedHashMap.put(129861, Integer.valueOf((int) R.drawable.emoji_hammer));
        linkedHashMap.put(129836, Integer.valueOf((int) R.drawable.emoji_strive));
        linkedHashMap.put(129837, Integer.valueOf((int) R.drawable.emoji_rainbowpuke));
        linkedHashMap.put(129876, Integer.valueOf((int) R.drawable.emoji_wail));
        linkedHashMap.put(129874, Integer.valueOf((int) R.drawable.emoji_fingerheart));
        linkedHashMap.put(129814, Integer.valueOf((int) R.drawable.emoji_fistbump));
        linkedHashMap.put(129821, Integer.valueOf((int) R.drawable.emoji_highfive));
        linkedHashMap.put(129842, Integer.valueOf((int) R.drawable.emoji_upperleft));
        linkedHashMap.put(129847, Integer.valueOf((int) R.drawable.emoji_shake));
        linkedHashMap.put(129792, Integer.valueOf((int) R.drawable.emoji_salute));
        linkedHashMap.put(129909, Integer.valueOf((int) R.drawable.emoji_done));
        linkedHashMap.put(129803, Integer.valueOf((int) R.drawable.emoji_eighteen));
        linkedHashMap.put(129897, Integer.valueOf((int) R.drawable.emoji_cleaver));
        linkedHashMap.put(129907, Integer.valueOf((int) R.drawable.emoji_plusone));
        linkedHashMap.put(129832, Integer.valueOf((int) R.drawable.emoji_welldone));
        linkedHashMap.put(129881, Integer.valueOf((int) R.drawable.emoji_goodjob));
        linkedHashMap.put(129857, Integer.valueOf((int) R.drawable.emoji_heartbroken));
        linkedHashMap.put(129901, Integer.valueOf((int) R.drawable.emoji_poop));
        linkedHashMap.put(129831, Integer.valueOf((int) R.drawable.emoji_gift));
        linkedHashMap.put(129848, Integer.valueOf((int) R.drawable.emoji_cake));
        linkedHashMap.put(129811, Integer.valueOf((int) R.drawable.emoji_party));
        linkedHashMap.put(129900, Integer.valueOf((int) R.drawable.emoji_eyesclosed));
        linkedHashMap.put(129887, Integer.valueOf((int) R.drawable.emoji_bomb));
        linkedHashMap.put(129910, Integer.valueOf((int) R.drawable.emoji_fireworks));
        linkedHashMap.put(129911, Integer.valueOf((int) R.drawable.emoji_bull));
        linkedHashMap.put(129912, Integer.valueOf((int) R.drawable.emoji_calf));
        linkedHashMap.put(129913, Integer.valueOf((int) R.drawable.emoji_awesomen));
        linkedHashMap.put(129914, Integer.valueOf((int) R.drawable.emoji_twentytwentyone));
        linkedHashMap.put(129915, Integer.valueOf((int) R.drawable.emoji_candiedhaws));
        linkedHashMap.put(129916, Integer.valueOf((int) R.drawable.emoji_redpacket));
        linkedHashMap.put(129917, Integer.valueOf((int) R.drawable.emoji_fortune));
        linkedHashMap.put(129918, Integer.valueOf((int) R.drawable.emoji_luck));
        linkedHashMap.put(129919, Integer.valueOf((int) R.drawable.emoji_firecracker));
        linkedHashMap.put(129920, Integer.valueOf((int) R.drawable.emoji_eatingfood));
        linkedHashMap.put(129921, Integer.valueOf((int) R.drawable.emoji_typing));
        linkedHashMap.put(129922, Integer.valueOf((int) R.drawable.emoji_lemon));
        linkedHashMap.put(129923, Integer.valueOf((int) R.drawable.emoji_get));
        linkedHashMap.put(129924, Integer.valueOf((int) R.drawable.emoji_lgtm));
        linkedHashMap.put(129925, Integer.valueOf((int) R.drawable.emoji_thumbsdown));
        linkedHashMap.put(129926, Integer.valueOf((int) R.drawable.emoji_drumstick));
        linkedHashMap.put(129927, Integer.valueOf((int) R.drawable.emoji_pepper));
        linkedHashMap.put(129928, Integer.valueOf((int) R.drawable.emoji_bubbletea));
        linkedHashMap.put(129929, Integer.valueOf((int) R.drawable.emoji_coffee));
        linkedHashMap.put(129930, Integer.valueOf((int) R.drawable.emoji_yes));
        linkedHashMap.put(129931, Integer.valueOf((int) R.drawable.emoji_no));
        linkedHashMap.put(129932, Integer.valueOf((int) R.drawable.emoji_okr));
        linkedHashMap.put(129933, Integer.valueOf((int) R.drawable.emoji_checkmark));
        linkedHashMap.put(129934, Integer.valueOf((int) R.drawable.emoji_crossmark));
        linkedHashMap.put(129935, Integer.valueOf((int) R.drawable.emoji_minusone));
        linkedHashMap.put(129936, Integer.valueOf((int) R.drawable.emoji_hundred));
        linkedHashMap.put(129937, Integer.valueOf((int) R.drawable.emoji_pin));
        linkedHashMap.put(129938, Integer.valueOf((int) R.drawable.emoji_alarm));
        linkedHashMap.put(129939, Integer.valueOf((int) R.drawable.emoji_loudspeaker));
        return linkedHashMap;
    }
}
