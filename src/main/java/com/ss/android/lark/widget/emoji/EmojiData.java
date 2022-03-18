package com.ss.android.lark.widget.emoji;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.widget.C58314a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class EmojiData extends Enum<EmojiData> {
    private static final /* synthetic */ EmojiData[] $VALUES;
    public static final EmojiData EMOJI0 = new EmojiData("EMOJI0", 0, "[Lark_Emoji_Smile_0]", "[微笑]", "SMILE", 240, 159, 173, 165);
    public static final EmojiData EMOJI1 = new EmojiData("EMOJI1", 1, "[Lark_Emoji_Drool_0]", "[爱慕]", "DROOL", 240, 159, 172, 191);
    public static final EmojiData EMOJI10 = new EmojiData("EMOJI10", 10, "[Lark_Emoji_Wink_0]", "[可爱]", "WINK", 240, 159, 172, 134);
    public static final EmojiData EMOJI100 = new EmojiData("EMOJI100", 101, "[Lark_Emoji_UpperLeft_0]", "[左上]", "UPPERLEFT", 240, 159, 172, 178);
    public static final EmojiData EMOJI101 = new EmojiData("EMOJI101", 102, "[Lark_Emoji_Shake_0]", "[握手]", "SHAKE", 240, 159, 172, 183);
    public static final EmojiData EMOJI102 = new EmojiData("EMOJI102", 103, "[Salute]", "[抱拳]", "SALUTE", 240, 159, 172, SmActions.ACTION_ONTHECALL_EXIT);
    public static final EmojiData EMOJI103 = new EmojiData("EMOJI103", LocationRequest.PRIORITY_NO_POWER, "[Lark_Emoji_18x_0]", "[18禁]", "18X", 240, 159, 172, 139);
    public static final EmojiData EMOJI104 = new EmojiData("EMOJI104", 106, "[Lark_Emoji_Cleaver_0]", "[刀]", "CLEAVER", 240, 159, 173, 169);
    public static final EmojiData EMOJI105 = new EmojiData("EMOJI105", ActivityIdentificationData.WALKING, "[+1]", "[+1]", "JIAYI", 240, 159, 173, 179);
    public static final EmojiData EMOJI106 = new EmojiData("EMOJI106", 108, "[Lark_Emoji_WellDone_0]", "[V5]", "WELLDONE", 240, 159, 172, 168);
    public static final EmojiData EMOJI107 = new EmojiData("EMOJI107", SmEvents.EVENT_NR, "[Lark_Emoji_GoodJob_0]", "[给力]", "GOODJOB", 240, 159, 173, 153);
    public static final EmojiData EMOJI108 = new EmojiData("EMOJI108", 56, "[Lark_Emoji_Heart_0]", "[爱心]", "HEART", 240, 159, 172, 153);
    public static final EmojiData EMOJI109 = new EmojiData("EMOJI109", SmEvents.EVENT_NO, "[Lark_Emoji_HeartBroken_0]", "[伤心]", "HEARTBROKEN", 240, 159, 173, 129);
    public static final EmojiData EMOJI11 = new EmojiData("EMOJI11", 11, "[Lark_Emoji_Dizzy_0]", "[晕]", "DIZZY", 240, 159, 172, 131);
    public static final EmojiData EMOJI110 = new EmojiData("EMOJI110", SmEvents.EVENT_NT, "[Lark_Emoji_Poop_0]", "[屎]", "POOP", 240, 159, 173, 173);
    public static final EmojiData EMOJI111 = new EmojiData("EMOJI111", SmEvents.EVENT_NE_RR, "[Lark_Emoji_Gift_0]", "[礼物]", "GIFT", 240, 159, 172, 167);
    public static final EmojiData EMOJI112 = new EmojiData("EMOJI112", SmEvents.EVENT_RE, "[Lark_Emoji_Cake_0]", "[蛋糕]", "CAKE", 240, 159, 172, 184);
    public static final EmojiData EMOJI113 = new EmojiData("EMOJI113", SmEvents.EVENT_TO, "[Lark_Emoji_Party_0]", "[撒花]", "PARTY", 240, 159, 172, MediaPlayer.MEDIA_PLAYER_OPTION_ABR_STREAM_INFO);
    public static final EmojiData EMOJI114 = new EmojiData("EMOJI114", 115, "[Lark_Emoji_EyesClosed_0]", "[不看]", "EYESCLOSED", 240, 159, 173, 172);
    public static final EmojiData EMOJI115 = new EmojiData("EMOJI115", SmEvents.EVENT_RS, "[Lark_Emoji_Bomb_0]", "[炸弹]", "BOMB", 240, 159, 173, 159);
    public static final EmojiData EMOJI116 = new EmojiData("EMOJI116", 104, "[Done]", "[完成]", "DONE", 240, 159, 173, 181);
    public static final EmojiData EMOJI117 = new EmojiData("EMOJI117", 117, "[Fireworks]", "[烟花]", "FIREWORKS", 240, 159, 173, 182);
    public static final EmojiData EMOJI118 = new EmojiData("EMOJI118", 118, "[Bull]", "[公牛]", "BULL", 240, 159, 173, 183);
    public static final EmojiData EMOJI119 = new EmojiData("EMOJI119", 119, "[Calf]", "[小牛]", "CALF", 240, 159, 173, 184);
    public static final EmojiData EMOJI12 = new EmojiData("EMOJI12", 12, "[Lark_Emoji_Toasted_0]", "[衰]", "TOASTED", 240, 159, 172, 165);
    public static final EmojiData EMOJI120 = new EmojiData("EMOJI120", SmEvents.EVENT_NW, "[Awesomen]", "[牛]", "AWESOMEN", 240, 159, 173, 185);
    public static final EmojiData EMOJI121 = new EmojiData("EMOJI121", SmActions.ACTION_INIT_ENTRY, "[2021]", "[2021]", "2021", 240, 159, 173, 186);
    public static final EmojiData EMOJI122 = new EmojiData("EMOJI122", SmActions.ACTION_INIT_EXIT, "[Candiedhaws]", "[冰糖葫芦]", "CANDIEDHAWS", 240, 159, 173, 187);
    public static final EmojiData EMOJI123 = new EmojiData("EMOJI123", SmActions.ACTION_CALLING_ENTRY, "[Redpacket]", "[红包]", "REDPACKET", 240, 159, 173, 188);
    public static final EmojiData EMOJI124 = new EmojiData("EMOJI124", SmActions.ACTION_CALLING_EXIT, "[Fortune]", "[发]", "FORTUNE", 240, 159, 173, 189);
    public static final EmojiData EMOJI125 = new EmojiData("EMOJI125", SmActions.ACTION_RINGING_ENTRY, "[Luck]", "[福]", "LUCK", 240, 159, 173, 190);
    public static final EmojiData EMOJI126 = new EmojiData("EMOJI126", SmActions.ACTION_RINGING_EXIT, "[Firecracker]", "[爆竹]", "FIRECRACKER", 240, 159, 173, 191);
    public static final EmojiData EMOJI13 = new EmojiData("EMOJI13", 13, "[Lark_Emoji_Silent_0]", "[闭嘴]", "SILENT", 240, 159, 172, 186);
    public static final EmojiData EMOJI14 = new EmojiData("EMOJI14", 14, "[Lark_Emoji_Smart_0]", "[机智]", "SMART", 240, 159, 173, 170);
    public static final EmojiData EMOJI15 = new EmojiData("EMOJI15", 15, "[Lark_Emoji_Attention_0]", "[来看我]", "ATTENTION", 240, 159, 172, 188);
    public static final EmojiData EMOJI16 = new EmojiData("EMOJI16", 16, "[Lark_Emoji_Witty_0]", "[灵光一闪]", "WITTY", 240, 159, 172, 181);
    public static final EmojiData EMOJI17 = new EmojiData("EMOJI17", 17, "[Lark_Emoji_Yeah_0]", "[耶]", "YEAH", 240, 159, 172, 142);
    public static final EmojiData EMOJI18 = new EmojiData("EMOJI18", 18, "[Lark_Emoji_Facepalm_0]", "[捂脸]", "FACEPALM", 240, 159, 172, 182);
    public static final EmojiData EMOJI19 = new EmojiData("EMOJI19", 19, "[Lark_Emoji_Slap_0]", "[打脸]", "SLAP", 240, 159, 173, 157);
    public static final EmojiData EMOJI2 = new EmojiData("EMOJI2", 2, "[Lark_Emoji_Scowl_0]", "[惊呆]", "SCOWL", 240, 159, 172, 137);
    public static final EmojiData EMOJI20 = new EmojiData("EMOJI20", 20, "[Lark_Emoji_Laugh_0]", "[大笑]", "LAUGH", 240, 159, 172, 189);
    public static final EmojiData EMOJI21 = new EmojiData("EMOJI21", 21, "[Lark_Emoji_Yawn_0]", "[哈欠]", "YAWN", 240, 159, 172, 166);
    public static final EmojiData EMOJI22 = new EmojiData("EMOJI22", 22, "[Lark_Emoji_Shocked_0]", "[震惊]", "SHOCKED", 240, 159, 173, MediaPlayer.MEDIA_PLAYER_OPTION_ABR_STREAM_INFO);
    public static final EmojiData EMOJI23 = new EmojiData("EMOJI23", 23, "[Lark_Emoji_Love_0]", "[送心]", "LOVE", 240, 159, 173, 175);
    public static final EmojiData EMOJI24 = new EmojiData("EMOJI24", 24, "[Lark_Emoji_Drowsy_0]", "[困]", "DROWSY", 240, 159, 172, 154);
    public static final EmojiData EMOJI25 = new EmojiData("EMOJI25", 25, "[Lark_Emoji_What_0]", "[what]", "WHAT", 240, 159, 173, 130);
    public static final EmojiData EMOJI26 = new EmojiData("EMOJI26", 26, "[Lark_Emoji_Cry_0]", "[泣不成声]", "CRY", 240, 159, 172, 162);
    public static final EmojiData EMOJI27 = new EmojiData("EMOJI27", 27, "[Lark_Emoji_Clap_0]", "[小鼓掌]", "CLAP", 240, 159, 172, 140);
    public static final EmojiData EMOJI28 = new EmojiData("EMOJI28", 28, "[Lark_Emoji_ShowOff_0]", "[酷]", "SHOWOFF", 240, 159, 172, 174);
    public static final EmojiData EMOJI29 = new EmojiData("EMOJI29", 29, "[Lark_Emoji_Chuckle_0]", "[偷笑]", "CHUCKLE", 240, 159, 172, 135);
    public static final EmojiData EMOJI3 = new EmojiData("EMOJI3", 3, "[Lark_Emoji_haughty_0]", "[酷拽]", "HAUGHTY", 240, 159, 173, 158);
    public static final EmojiData EMOJI30 = new EmojiData("EMOJI30", 30, "[Lark_Emoji_Petrified_0]", "[石化]", "PETRIFIED", 240, 159, 172, 177);
    public static final EmojiData EMOJI31 = new EmojiData("EMOJI31", 31, "[Lark_Emoji_Thinking_0]", "[思考]", "THINKING", 240, 159, 173, SmActions.ACTION_ONTHECALL_EXIT);
    public static final EmojiData EMOJI32 = new EmojiData("EMOJI32", 32, "[Lark_Emoji_SpitBlood_0]", "[吐血]", "SPITBLOOD", 240, 159, 172, 171);
    public static final EmojiData EMOJI33 = new EmojiData("EMOJI33", 33, "[Lark_Emoji_Whimper_0]", "[可怜]", "WHIMPER", 240, 159, 172, 180);
    public static final EmojiData EMOJI34 = new EmojiData("EMOJI34", 34, "[Lark_Emoji_Shhh_0]", "[嘘]", "SHHH", 240, 159, 172, 175);
    public static final EmojiData EMOJI35 = new EmojiData("EMOJI35", 35, "[Lark_Emoji_Smug_0]", "[撇嘴]", "SMUG", 240, 159, 172, 159);
    public static final EmojiData EMOJI36 = new EmojiData("EMOJI36", 36, "[Lark_Emoji_Errr_0]", "[黑线]", "ERROR", 240, 159, 173, SmEvents.EVENT_UA_ERROR);
    public static final EmojiData EMOJI37 = new EmojiData("EMOJI37", 37, "[Lark_Emoji_Lol_0]", "[笑哭]", "LOL", 240, 159, 173, 143);
    public static final EmojiData EMOJI38 = new EmojiData("EMOJI38", 38, "[Lark_Emoji_Sick_0]", "[雾霾]", "SICK", 240, 159, 172, 163);
    public static final EmojiData EMOJI39 = new EmojiData("EMOJI39", 39, "[Lark_Emoji_Smirk_0]", "[奸笑]", "SMIRK", 240, 159, 172, SmEvents.EVENT_UA_SUCCESS);
    public static final EmojiData EMOJI4 = new EmojiData("EMOJI4", 4, "[Lark_Emoji_NosePick_0]", "[抠鼻]", "NOSEPICK", 240, 159, 173, 142);
    public static final EmojiData EMOJI40 = new EmojiData("EMOJI40", 40, "[Lark_Emoji_Proud_0]", "[得意]", "PROUD", 240, 159, 172, SmActions.ACTION_IDLE_ENTRY);
    public static final EmojiData EMOJI41 = new EmojiData("EMOJI41", 41, "[Lark_Emoji_Trick_0]", "[憨笑]", "TRICK", 240, 159, 173, 154);
    public static final EmojiData EMOJI42 = new EmojiData("EMOJI42", 42, "[Lark_Emoji_Crazy_0]", "[抓狂]", "CRAZY", 240, 159, 173, 177);
    public static final EmojiData EMOJI43 = new EmojiData("EMOJI43", 43, "[Lark_Emoji_Tears_0]", "[泪奔]", "TEARS", 240, 159, 173, 140);
    public static final EmojiData EMOJI44 = new EmojiData("EMOJI44", 44, "[Lark_Emoji_Money_0]", "[钱]", "MONEY", 240, 159, 173, 174);
    public static final EmojiData EMOJI45 = new EmojiData("EMOJI45", 45, "[Lark_Emoji_Kiss_0]", "[吻]", "KISS", 240, 159, 172, 151);
    public static final EmojiData EMOJI46 = new EmojiData("EMOJI46", 46, "[Lark_Emoji_Terror_0]", "[恐惧]", "TERROR", 240, 159, 173, 150);
    public static final EmojiData EMOJI47 = new EmojiData("EMOJI47", 47, "[Lark_Emoji_Joyful_0]", "[笑]", "JOYFUL", 240, 159, 172, 170);
    public static final EmojiData EMOJI48 = new EmojiData("EMOJI48", 48, "[Lark_Emoji_Blubber_0]", "[快哭了]", "BLUBBER", 240, 159, 172, 187);
    public static final EmojiData EMOJI49 = new EmojiData("EMOJI49", 49, "[Lark_Emoji_Husky_0]", "[翻白眼]", "HUSKY", 240, 159, 173, 151);
    public static final EmojiData EMOJI5 = new EmojiData("EMOJI5", 5, "[Lark_Emoji_Sob_0]", "[流泪]", "SOB", 240, 159, 172, 132);
    public static final EmojiData EMOJI50 = new EmojiData("EMOJI50", 50, "[Lark_Emoji_FollowMe_0]", "[互粉]", "FOLLOWME", 240, 159, 172, 179);
    public static final EmojiData EMOJI51 = new EmojiData("EMOJI51", 51, "[Lark_Emoji_Thumbsup_0]", "[赞]", "THUMBSUP", 240, 159, 173, 155);
    public static final EmojiData EMOJI52 = new EmojiData("EMOJI52", 52, "[Lark_Emoji_Applaud_0]", "[鼓掌]", "APPLAUSE", 240, 159, 172, 129);
    public static final EmojiData EMOJI53 = new EmojiData("EMOJI53", 53, "[Lark_Emoji_Thanks_0]", "[谢谢]", "THANKS", 240, 159, 173, 149);
    public static final EmojiData EMOJI54 = new EmojiData("EMOJI54", 57, "[Lark_Emoji_Lips_0]", "[kiss]", "LIPS", 240, 159, 173, 176);
    public static final EmojiData EMOJI55 = new EmojiData("EMOJI55", 58, "[Lark_Emoji_Detergent_0]", "[去污粉]", "DETERGENT", 240, 159, 173, 132);
    public static final EmojiData EMOJI56 = new EmojiData("EMOJI56", 59, "[Lark_Emoji_Awesome_0]", "[666]", "AWESOME", 240, 159, 173, SmEvents.EVENT_UA_SUCCESS);
    public static final EmojiData EMOJI57 = new EmojiData("EMOJI57", 60, "[Lark_Emoji_Rose_0]", "[玫瑰]", "ROSE", 240, 159, 173, 138);
    public static final EmojiData EMOJI58 = new EmojiData("EMOJI58", 61, "[Lark_Emoji_Cucumber_0]", "[胡瓜]", "CUCUMBER", 240, 159, 173, 164);
    public static final EmojiData EMOJI59 = new EmojiData("EMOJI59", 62, "[Lark_Emoji_Beer_0]", "[啤酒]", "BEER", 240, 159, 172, 143);
    public static final EmojiData EMOJI6 = new EmojiData("EMOJI6", 6, "[Lark_Emoji_Angry_0]", "[发怒]", "ANGRY", 240, 159, 172, 152);
    public static final EmojiData EMOJI60 = new EmojiData("EMOJI60", 63, "[Lark_Emoji_Enough_0]", "[我想静静]", "ENOUGH", 240, 159, 172, 164);
    public static final EmojiData EMOJI61 = new EmojiData("EMOJI61", 64, "[Lark_Emoji_Wronged_0]", "[委屈]", "WRONGED", 240, 159, 173, 131);
    public static final EmojiData EMOJI62 = new EmojiData("EMOJI62", 65, "[Lark_Emoji_Obsessed_0]", "[舔屏]", "OBSESSED", 240, 159, 173, 166);
    public static final EmojiData EMOJI63 = new EmojiData("EMOJI63", 66, "[Lark_Emoji_LookDown_0]", "[鄙视]", "LOOKDOWN", 240, 159, 172, 190);
    public static final EmojiData EMOJI64 = new EmojiData("EMOJI64", 67, "[Lark_Emoji_Smooch_0]", "[飞吻]", "SMOOCH", 240, 159, 172, 130);
    public static final EmojiData EMOJI65 = new EmojiData("EMOJI65", 68, "[Lark_Emoji_Wave_0]", "[再见]", "WAVE", 240, 159, 172, 148);
    public static final EmojiData EMOJI66 = new EmojiData("EMOJI66", 69, "[Lark_Emoji_DonnotGo_0]", "[紫薇别走]", "DONNOTGO", 240, 159, 173, 136);
    public static final EmojiData EMOJI67 = new EmojiData("EMOJI67", 70, "[Lark_Emoji_Headset_0]", "[听歌]", "HEADSET", 240, 159, 172, SmEvents.EVENT_UA_ERROR);
    public static final EmojiData EMOJI68 = new EmojiData("EMOJI68", 71, "[Lark_Emoji_Hug_0]", "[求抱抱]", "HUG", 240, 159, 173, 171);
    public static final EmojiData EMOJI69 = new EmojiData("EMOJI69", 72, "[Lark_Emoji_DullStare_0]", "[周冬雨的凝视]", "DULLSTARE", 240, 159, 173, 167);
    public static final EmojiData EMOJI7 = new EmojiData("EMOJI7", 7, "[Lark_Emoji_Grin_0]", "[呲牙]", "BLUSH", 240, 159, 173, 178);
    public static final EmojiData EMOJI70 = new EmojiData("EMOJI70", 73, "[Lark_Emoji_InnocentSmile_0]", "[马思纯的微笑]", "INNOCENTSMILE", 240, 159, 173, 139);
    public static final EmojiData EMOJI71 = new EmojiData("EMOJI71", 74, "[Lark_Emoji_Tongue_0]", "[吐舌]", "TONGUE", 240, 159, 173, 137);
    public static final EmojiData EMOJI72 = new EmojiData("EMOJI72", 75, "[Lark_Emoji_Dull_0]", "[呆无辜]", "DULL", 240, 159, 172, 138);
    public static final EmojiData EMOJI73 = new EmojiData("EMOJI73", 76, "[Lark_Emoji_Glance_0]", "[看]", "GLANCE", 240, 159, 172, 158);
    public static final EmojiData EMOJI74 = new EmojiData("EMOJI74", 77, "[Lark_Emoji_Slight_0]", "[白眼]", "SLIGHT", 240, 159, 172, 185);
    public static final EmojiData EMOJI75 = new EmojiData("EMOJI75", 78, "[Lark_Emoji_Bear_0]", "[熊吉]", "BEAR", 240, 159, 173, 134);
    public static final EmojiData EMOJI76 = new EmojiData("EMOJI76", 79, "[Lark_Emoji_Skull_0]", "[骷髅]", "SKULL", 240, 159, 172, 136);
    public static final EmojiData EMOJI77 = new EmojiData("EMOJI77", 80, "[Lark_Emoji_BlackFace_0]", "[黑脸]", "BLACKFACE", 240, 159, 172, 155);
    public static final EmojiData EMOJI78 = new EmojiData("EMOJI78", 81, "[Lark_Emoji_Eating_0]", "[吃瓜群众]", "EATING", 240, 159, 172, 146);
    public static final EmojiData EMOJI79 = new EmojiData("EMOJI79", 82, "[Lark_Emoji_Betrayed_0]", "[绿帽子]", "BETRAYED", 240, 159, 172, 149);
    public static final EmojiData EMOJI8 = new EmojiData("EMOJI8", 8, "[Lark_Emoji_Sleep_0]", "[鼾睡]", "SLEEP", 240, 159, 173, 168);
    public static final EmojiData EMOJI80 = new EmojiData("EMOJI80", 83, "[Lark_Emoji_Sweat_0]", "[汗]", "SWEAT", 240, 159, 173, 152);
    public static final EmojiData EMOJI81 = new EmojiData("EMOJI81", 84, "[Lark_Emoji_Comfort_0]", "[摸头]", "COMFORT", 240, 159, 172, 176);
    public static final EmojiData EMOJI82 = new EmojiData("EMOJI82", 85, "[Lark_Emoji_Frown_0]", "[皱眉]", "FROWN", 240, 159, 173, 162);
    public static final EmojiData EMOJI83 = new EmojiData("EMOJI83", 86, "[Lark_Emoji_Speechless_0]", "[擦汗]", "SPEECHLESS", 240, 159, 172, 160);
    public static final EmojiData EMOJI84 = new EmojiData("EMOJI84", 87, "[Lark_Emoji_Blush_0]", "[红脸]", "XBLUSH", 240, 159, 173, 135);
    public static final EmojiData EMOJI85 = new EmojiData("EMOJI85", 88, "[Lark_Emoji_Embarrassed_0]", "[尬笑]", "EMBARRASSED", 240, 159, 173, 163);
    public static final EmojiData EMOJI86 = new EmojiData("EMOJI86", 89, "[Lark_Emoji_Tease_0]", "[做鬼脸]", "TEASE", 240, 159, 172, 161);
    public static final EmojiData EMOJI87 = new EmojiData("EMOJI87", 90, "[Lark_Emoji_Praise_0]", "[强]", "PRAISE", 240, 159, 172, 133);
    public static final EmojiData EMOJI88 = new EmojiData("EMOJI88", 91, "[Lark_Emoji_BigKiss_0]", "[如花]", "BIGKISS", 240, 159, 173, SmActions.ACTION_IDLE_ENTRY);
    public static final EmojiData EMOJI89 = new EmojiData("EMOJI89", 92, "[Lark_Emoji_Puke_0]", "[吐]", "PUKE", 240, 159, 172, 169);
    public static final EmojiData EMOJI9 = new EmojiData("EMOJI9", 9, "[Lark_Emoji_Shy_0]", "[害羞]", "SHY", 240, 159, 173, 156);
    public static final EmojiData EMOJI90 = new EmojiData("EMOJI90", 93, "[Lark_Emoji_Wow_0]", "[惊喜]", "WOW", 240, 159, 173, 161);
    public static final EmojiData EMOJI92 = new EmojiData("EMOJI92", 95, "[Lark_Emoji_Strive_0]", "[奋斗]", "STRIVE", 240, 159, 172, 172);
    public static final EmojiData EMOJI93 = new EmojiData("EMOJI93", 96, "[Lark_Emoji_RainbowPuke_0]", "[吐彩虹]", "RAINBOWPUKE", 240, 159, 172, 173);
    public static final EmojiData EMOJI94 = new EmojiData("EMOJI94", 97, "[Lark_Emoji_Wail_0]", "[大哭]", "WAIL", 240, 159, 173, 148);
    public static final EmojiData EMOJI95 = new EmojiData("EMOJI95", 98, "[Lark_Emoji_FingerHeart_0]", "[比心]", "FINGERHEART", 240, 159, 173, 146);
    public static final EmojiData EMOJI96 = new EmojiData("EMOJI96", 54, "[Lark_Emoji_Fighting_0]", "[加油]", "MUSCLE", 240, 159, 173, 160);
    public static final EmojiData EMOJI97 = new EmojiData("EMOJI97", 99, "[Lark_Emoji_FistBump_0]", "[碰拳]", "FISTBUMP", 240, 159, 172, 150);
    public static final EmojiData EMOJI98 = new EmojiData("EMOJI98", 55, "[Lark_Emoji_OK_0]", "[OK]", "OK", 240, 159, 172, 156);
    public static final EmojiData EMOJI99 = new EmojiData("EMOJI99", 100, "[Lark_Emoji_HighFive_0]", "[击掌]", "HIGHFIVE", 240, 159, 172, 157);
    public static final EmojiData MOJI91 = new EmojiData("MOJI91", 94, "[Lark_Emoji_Hammer_0]", "[敲打]", "HAMMER", 240, 159, 173, 133);
    public static final String[] SPRING_REACTION_LIST = {"FIREWORKS", "BULL", "CALF", "AWESOMEN", "2021", "CANDIEDHAWS", "REDPACKET", "FORTUNE", "LUCK", "FIRECRACKER"};
    private static final String[] sDefaultReactionOrder = {"OK", "THUMBSUP", "HEART", "APPLAUSE", "BLUSH", "MUSCLE", "JIAYI", "GLANCE", "CUCUMBER", "FINGERHEART", "FACEPALM", "CRY", "LOVE", "WITTY", "FISTBUMP", "SLIGHT", "LAUGH", "PARTY", "CLAP", "SMIRK", "TOASTED", "DULL", "BOMB", "EYESCLOSED", "INNOCENTSMILE", "PRAISE", "LOL", "SLAP", "PROUD", "DULLSTARE", "ROSE", "SPITBLOOD", "YEAH", "SMILE", "EATING", "SMOOCH", "SMART", "SILENT", "SHY", "TONGUE", "BEER", "BLACKFACE", "BEAR", "DIZZY", "YAWN", "DROOL", "SCOWL", "HAUGHTY", "NOSEPICK", "SOB", "ANGRY", "SLEEP", "WINK", "SHOCKED", "DROWSY", "WHAT", "SHOWOFF", "CHUCKLE", "PETRIFIED", "THINKING", "WHIMPER", "SHHH", "SMUG", "ERROR", "SICK", "TRICK", "CRAZY", "TEARS", "MONEY", "KISS", "TERROR", "JOYFUL", "BLUBBER", "HUSKY", "THANKS", "LIPS", "ENOUGH", "WRONGED", "OBSESSED", "LOOKDOWN", "WAVE", "DONNOTGO", "HEADSET", "HUG", "SKULL", "BETRAYED", "SWEAT", "COMFORT", "FROWN", "SPEECHLESS", "XBLUSH", "EMBARRASSED", "TEASE", "BIGKISS", "PUKE", "WOW", "HAMMER", "STRIVE", "RAINBOWPUKE", "WAIL", "HIGHFIVE", "UPPERLEFT", "SHAKE", "SALUTE", "DONE", "18X", "CLEAVER", "HEARTBROKEN", "POOP", "GIFT", "CAKE"};
    private static HashMap<String, String> sKeyCodeMap = new HashMap<>((int) DynamicModule.f58006b);
    private static List<String> sReactionOrderList = new ArrayList((int) DynamicModule.f58006b);
    private static HashMap<String, String> sReactionToEmojiMap = new HashMap<>((int) DynamicModule.f58006b);
    private static HashMap<String, C58441b> sReactionToEmojiconMap = new HashMap<>((int) DynamicModule.f58006b);
    private String emojiStr;
    private String oldStr;
    private String reactionKey;
    private byte[] value;
    private byte value1;
    private byte value2;
    private byte value3;
    private byte value4;

    public String getEmojiKey() {
        return this.emojiStr;
    }

    public String getReactionKey() {
        return this.reactionKey;
    }

    static {
        EmojiData[] emojiDataArr = new EmojiData[SmActions.ACTION_ONTHECALL_ENTRY];
        emojiDataArr[0] = EMOJI0;
        emojiDataArr[1] = EMOJI1;
        emojiDataArr[2] = EMOJI2;
        emojiDataArr[3] = EMOJI3;
        emojiDataArr[4] = EMOJI4;
        emojiDataArr[5] = EMOJI5;
        emojiDataArr[6] = EMOJI6;
        emojiDataArr[7] = EMOJI7;
        emojiDataArr[8] = EMOJI8;
        emojiDataArr[9] = EMOJI9;
        emojiDataArr[10] = EMOJI10;
        emojiDataArr[11] = EMOJI11;
        emojiDataArr[12] = EMOJI12;
        emojiDataArr[13] = EMOJI13;
        emojiDataArr[14] = EMOJI14;
        emojiDataArr[15] = EMOJI15;
        emojiDataArr[16] = EMOJI16;
        emojiDataArr[17] = EMOJI17;
        emojiDataArr[18] = EMOJI18;
        emojiDataArr[19] = EMOJI19;
        emojiDataArr[20] = EMOJI20;
        emojiDataArr[21] = EMOJI21;
        emojiDataArr[22] = EMOJI22;
        emojiDataArr[23] = EMOJI23;
        emojiDataArr[24] = EMOJI24;
        emojiDataArr[25] = EMOJI25;
        emojiDataArr[26] = EMOJI26;
        emojiDataArr[27] = EMOJI27;
        emojiDataArr[28] = EMOJI28;
        emojiDataArr[29] = EMOJI29;
        emojiDataArr[30] = EMOJI30;
        emojiDataArr[31] = EMOJI31;
        emojiDataArr[32] = EMOJI32;
        emojiDataArr[33] = EMOJI33;
        emojiDataArr[34] = EMOJI34;
        emojiDataArr[35] = EMOJI35;
        emojiDataArr[36] = EMOJI36;
        emojiDataArr[37] = EMOJI37;
        emojiDataArr[38] = EMOJI38;
        emojiDataArr[39] = EMOJI39;
        emojiDataArr[40] = EMOJI40;
        emojiDataArr[41] = EMOJI41;
        emojiDataArr[42] = EMOJI42;
        emojiDataArr[43] = EMOJI43;
        emojiDataArr[44] = EMOJI44;
        emojiDataArr[45] = EMOJI45;
        emojiDataArr[46] = EMOJI46;
        emojiDataArr[47] = EMOJI47;
        emojiDataArr[48] = EMOJI48;
        emojiDataArr[49] = EMOJI49;
        emojiDataArr[50] = EMOJI50;
        emojiDataArr[51] = EMOJI51;
        emojiDataArr[52] = EMOJI52;
        emojiDataArr[53] = EMOJI53;
        emojiDataArr[54] = EMOJI96;
        emojiDataArr[55] = EMOJI98;
        emojiDataArr[56] = EMOJI108;
        emojiDataArr[57] = EMOJI54;
        emojiDataArr[58] = EMOJI55;
        emojiDataArr[59] = EMOJI56;
        emojiDataArr[60] = EMOJI57;
        emojiDataArr[61] = EMOJI58;
        emojiDataArr[62] = EMOJI59;
        emojiDataArr[63] = EMOJI60;
        emojiDataArr[64] = EMOJI61;
        emojiDataArr[65] = EMOJI62;
        emojiDataArr[66] = EMOJI63;
        emojiDataArr[67] = EMOJI64;
        emojiDataArr[68] = EMOJI65;
        emojiDataArr[69] = EMOJI66;
        emojiDataArr[70] = EMOJI67;
        emojiDataArr[71] = EMOJI68;
        emojiDataArr[72] = EMOJI69;
        emojiDataArr[73] = EMOJI70;
        emojiDataArr[74] = EMOJI71;
        emojiDataArr[75] = EMOJI72;
        emojiDataArr[76] = EMOJI73;
        emojiDataArr[77] = EMOJI74;
        emojiDataArr[78] = EMOJI75;
        emojiDataArr[79] = EMOJI76;
        emojiDataArr[80] = EMOJI77;
        emojiDataArr[81] = EMOJI78;
        emojiDataArr[82] = EMOJI79;
        emojiDataArr[83] = EMOJI80;
        emojiDataArr[84] = EMOJI81;
        emojiDataArr[85] = EMOJI82;
        emojiDataArr[86] = EMOJI83;
        emojiDataArr[87] = EMOJI84;
        emojiDataArr[88] = EMOJI85;
        emojiDataArr[89] = EMOJI86;
        emojiDataArr[90] = EMOJI87;
        emojiDataArr[91] = EMOJI88;
        emojiDataArr[92] = EMOJI89;
        emojiDataArr[93] = EMOJI90;
        emojiDataArr[94] = MOJI91;
        emojiDataArr[95] = EMOJI92;
        emojiDataArr[96] = EMOJI93;
        emojiDataArr[97] = EMOJI94;
        emojiDataArr[98] = EMOJI95;
        emojiDataArr[99] = EMOJI97;
        emojiDataArr[100] = EMOJI99;
        emojiDataArr[101] = EMOJI100;
        emojiDataArr[102] = EMOJI101;
        emojiDataArr[103] = EMOJI102;
        emojiDataArr[104] = EMOJI116;
        emojiDataArr[105] = EMOJI103;
        emojiDataArr[106] = EMOJI104;
        emojiDataArr[107] = EMOJI105;
        emojiDataArr[108] = EMOJI106;
        emojiDataArr[109] = EMOJI107;
        emojiDataArr[110] = EMOJI109;
        emojiDataArr[111] = EMOJI110;
        emojiDataArr[112] = EMOJI111;
        emojiDataArr[113] = EMOJI112;
        emojiDataArr[114] = EMOJI113;
        emojiDataArr[115] = EMOJI114;
        emojiDataArr[116] = EMOJI115;
        emojiDataArr[117] = EMOJI117;
        emojiDataArr[118] = EMOJI118;
        emojiDataArr[119] = EMOJI119;
        emojiDataArr[120] = EMOJI120;
        emojiDataArr[121] = EMOJI121;
        emojiDataArr[122] = EMOJI122;
        emojiDataArr[123] = EMOJI123;
        emojiDataArr[124] = EMOJI124;
        emojiDataArr[125] = EMOJI125;
        emojiDataArr[126] = EMOJI126;
        $VALUES = emojiDataArr;
        init();
    }

    public static EmojiData[] values() {
        return (EmojiData[]) $VALUES.clone();
    }

    private static void initReactionOrderList() {
        sReactionOrderList.addAll(Arrays.asList(sDefaultReactionOrder));
        sReactionOrderList.addAll(Arrays.asList(SPRING_REACTION_LIST));
    }

    public static List<C58441b> getAllByType() {
        ArrayList arrayList = new ArrayList(values().length);
        EmojiData[] values = values();
        for (EmojiData emojiData : values) {
            C58441b bVar = new C58441b();
            bVar.mo197873a(emojiData.value);
            bVar.mo197872a(emojiData.emojiStr);
            bVar.mo197874b(emojiData.oldStr);
            bVar.mo197877c(emojiData.reactionKey);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public static List<C58441b> getDefaultReactionOrder() {
        ArrayList arrayList = new ArrayList();
        for (String str : sReactionOrderList) {
            C58441b bVar = sReactionToEmojiconMap.get(str);
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private static void init() {
        List<C58441b> allByType = getAllByType();
        initReactionOrderList();
        for (C58441b bVar : allByType) {
            String a = bVar.mo197871a();
            String c = bVar.mo197876c();
            String substring = a.substring(1, a.length() - 1);
            String e = bVar.mo197879e();
            String d = bVar.mo197878d();
            String substring2 = d.substring(1, d.length() - 1);
            sKeyCodeMap.put(c, substring);
            sKeyCodeMap.put(substring, c);
            sKeyCodeMap.put(substring2, c);
            sReactionToEmojiconMap.put(e, bVar);
            if (sReactionOrderList.contains(e)) {
                sReactionToEmojiMap.put(e, a);
            }
        }
    }

    public static EmojiData valueOf(String str) {
        return (EmojiData) Enum.valueOf(EmojiData.class, str);
    }

    public static void backspace(EditText editText) {
        if (editText != null) {
            editText.dispatchKeyEvent(new KeyEvent(0, 0, 0, 67, 0, 0, 0, 0, 6));
        }
    }

    public static String getEmojiKeyFromReactionKey(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && (str2 = sReactionToEmojiMap.get(str)) != null) {
            return str2;
        }
        return "";
    }

    public static C58441b getEmojiconFromReactionKey(String str) {
        C58441b bVar;
        if (!TextUtils.isEmpty(str) && (bVar = sReactionToEmojiconMap.get(str)) != null) {
            return bVar;
        }
        return null;
    }

    public static String getKeyFromEmojiCode(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && (str2 = sKeyCodeMap.get(str)) != null) {
            return str2;
        }
        return "";
    }

    public static String getEmojiCodeFromKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (sKeyCodeMap.containsKey(str)) {
            return sKeyCodeMap.get(str);
        }
        return "[" + str + "]";
    }

    public static boolean isDeleteEmojicon(C58441b bVar) {
        if (bVar == null || bVar.mo197875b() == null) {
            return false;
        }
        byte[] b = bVar.mo197875b();
        if (b[0] == -16 && b[1] == -97 && b[2] == -108 && b[3] == -103) {
            return true;
        }
        return false;
    }

    public static void filterUnSupportEmoji(List<C58441b> list) {
        List asList = Arrays.asList("[Lark_Emoji_Attention_0]", "[Lark_Emoji_WellDone_0]", "[Lark_Emoji_GoodJob_0]", "[Lark_Emoji_Detergent_0]", "[Lark_Emoji_Awesome_0]", "[Lark_Emoji_FollowMe_0]");
        List asList2 = Arrays.asList(SPRING_REACTION_LIST);
        Iterator<C58441b> it = list.iterator();
        while (it.hasNext()) {
            C58441b next = it.next();
            if (asList.contains(next.mo197871a())) {
                it.remove();
            } else if (!C58314a.m226104a().mo102816a() && asList2.contains(next.mo197879e())) {
                it.remove();
            }
        }
    }

    private EmojiData(String str, int i, String str2, String str3, String str4, int i2, int i3, int i4, int i5) {
        this.emojiStr = str2;
        this.oldStr = str3;
        this.reactionKey = str4;
        byte b = (byte) i2;
        this.value1 = b;
        byte b2 = (byte) i3;
        this.value2 = b2;
        byte b3 = (byte) i4;
        this.value3 = b3;
        byte b4 = (byte) i5;
        this.value4 = b4;
        this.value = new byte[]{b, b2, b3, b4};
    }
}
