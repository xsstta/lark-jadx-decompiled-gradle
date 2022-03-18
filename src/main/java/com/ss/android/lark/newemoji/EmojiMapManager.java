package com.ss.android.lark.newemoji;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency;
import com.ss.android.lark.newemoji.loader.EmojiImageResource;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002HIB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\fH\u0002J\u0018\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\nJ\u0018\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\nJ\u0016\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\nJ\u0006\u00102\u001a\u00020\fJ\u0018\u00103\u001a\u00020\"2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000105H\u0002J\u000e\u00106\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0004J\u000e\u00107\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0004J\u0018\u00108\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0015H\u0002J\b\u0010:\u001a\u00020\"H\u0002J\u001a\u0010;\u001a\u00020\"2\b\u0010<\u001a\u0004\u0018\u00010\u00132\b\u0010=\u001a\u0004\u0018\u00010\u0004J\u0016\u0010>\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\nJ$\u0010>\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010@\u001a\u00020\"2\b\u0010?\u001a\u0004\u0018\u00010AJ\b\u0010B\u001a\u00020\"H\u0002J\u0010\u0010C\u001a\u00020\"2\b\u0010<\u001a\u0004\u0018\u00010\u0013J\u001c\u0010D\u001a\u00020\"2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00150F2\u0006\u0010G\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0011R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0002R(\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0011¨\u0006J"}, d2 = {"Lcom/ss/android/lark/newemoji/EmojiMapManager;", "", "()V", "KEY", "", "TAG", "VERSION", "callbackList", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "currentVersion", "", "currentVersion$annotations", "descToEmoji", "descToEmoji$annotations", "getDescToEmoji", "()Ljava/util/concurrent/ConcurrentHashMap;", "emojiChangeListeners", "Lcom/ss/android/lark/newemoji/EmojiMapManager$EmojisChangedConsumer;", "emojiMap", "Lcom/ss/android/lark/newemoji/EmojiEntity;", "emojiMap$annotations", "getEmojiMap", "mRwDataLock", "Ljava/util/concurrent/locks/ReadWriteLock;", "mThreadPool", "Ljava/util/concurrent/ExecutorService;", "originVersion", "originVersion$annotations", "reactionMap", "reactionMap$annotations", "getReactionMap", "createLocalEmoji", "", "resString", "emojiKey", "reactionKey", "imageKey", "resDrawable", "isDeleted", "oldEmojiKey", "getBitmapFromDrawable", "Landroid/graphics/Bitmap;", "resId", "getEmojiBitmapSimple", "key", "isEmoji", "getEmojiImageKey", "getEmojiText", "getEmojiVersion", "getResMapFromNet", "triggerKeys", "", "isBitmapExist", "isImageKeyExist", "loadBitmapFromNet", "emojiEntity", "onFetchIconSuccess", "registerListener", "listener", "iconKey", "requestBitmap", "callback", "resetMap", "Lcom/ss/android/lark/newemoji/EmojiMapManager$IResetEmojisCallback;", "setDefaultData", "unRegisterListener", "updateMap", "set", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "EmojisChangedConsumer", "IResetEmojisCallback", "lark-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.t.b */
public final class EmojiMapManager {

    /* renamed from: a */
    public static int f136335a = 5;

    /* renamed from: b */
    public static int f136336b = 5;

    /* renamed from: c */
    public static final EmojiMapManager f136337c;

    /* renamed from: d */
    private static final ConcurrentHashMap<String, C55244a> f136338d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, C55244a> f136339e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<String, String> f136340f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static final ExecutorService f136341g;

    /* renamed from: h */
    private static final ConcurrentHashMap<IGetDataCallback<Boolean>, String> f136342h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final ConcurrentHashMap<EmojisChangedConsumer, String> f136343i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private static ReadWriteLock f136344j = new ReentrantReadWriteLock();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/newemoji/EmojiMapManager$EmojisChangedConsumer;", "", "iShouldUnregisterThis", "", "onFetchIconSuccess", "lark-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.t.b$a */
    public interface EmojisChangedConsumer {
        /* renamed from: a */
        void mo188276a();

        /* renamed from: b */
        void mo188277b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/newemoji/EmojiMapManager$IResetEmojisCallback;", "", "onResult", "", "lark-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.t.b$b */
    public interface IResetEmojisCallback {
        /* renamed from: a */
        void mo185549a();
    }

    private EmojiMapManager() {
    }

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C55244a> m214274a() {
        return f136338d;
    }

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C55244a> m214278b() {
        return f136339e;
    }

    /* renamed from: c */
    public static final ConcurrentHashMap<String, String> m214280c() {
        return f136340f;
    }

    /* renamed from: d */
    public final void mo188273d() {
        LarkEmojiModuleDependency.IEmojiDependency a = LarkEmojiModuleDependency.m214269a();
        boolean a2 = a != null ? a.mo43822a() : false;
        m214276a(R.string.Emoji_Smile, "Lark_Emoji_Smile_0", "SMILE", "emoji_smile.png", R.drawable.emoji_smile, false, "微笑");
        m214276a(R.string.Emoji_Drool, "Lark_Emoji_Drool_0", "DROOL", "emoji_drool.png", R.drawable.emoji_drool, false, "爱慕");
        m214276a(R.string.Emoji_Scowl, "Lark_Emoji_Scowl_0", "SCOWL", "emoji_scowl.png", R.drawable.emoji_scowl, false, "惊呆");
        m214276a(R.string.Emoji_Irritated, "Lark_Emoji_haughty_0", "HAUGHTY", "emoji_irritated_v2.png", R.drawable.emoji_irritated, false, "酷拽");
        m214276a(R.string.Emoji_NosePick, "Lark_Emoji_NosePick_0", "NOSEPICK", "emoji_nosepick.png", R.drawable.emoji_nosepick, false, "抠鼻");
        m214276a(R.string.Emoji_Sob, "Lark_Emoji_Sob_0", "SOB", "emoji_sob.png", R.drawable.emoji_sob, false, "流泪");
        m214276a(R.string.Emoji_Angry, "Lark_Emoji_Angry_0", "ANGRY", "emoji_angry.png", R.drawable.emoji_angry, false, "发怒");
        m214276a(R.string.Emoji_Grin, "Lark_Emoji_Grin_0", "BLUSH", "emoji_grin.png", R.drawable.emoji_grin, false, "呲牙");
        m214276a(R.string.Emoji_Sleep, "Lark_Emoji_Sleep_0", "SLEEP", "emoji_sleep.png", R.drawable.emoji_sleep, false, "鼾睡");
        m214276a(R.string.Emoji_Shy, "Lark_Emoji_Shy_0", "SHY", "emoji_shy.png", R.drawable.emoji_shy, false, "害羞");
        m214276a(R.string.Emoji_Wink, "Lark_Emoji_Wink_0", "WINK", "emoji_wink.png", R.drawable.emoji_wink, false, "可爱");
        m214276a(R.string.Emoji_Dizzy, "Lark_Emoji_Dizzy_0", "DIZZY", "emoji_dizzy.png", R.drawable.emoji_dizzy, false, "晕");
        m214276a(R.string.Emoji_Toasted, "Lark_Emoji_Toasted_0", "TOASTED", "emoji_toasted.png", R.drawable.emoji_toasted, false, "衰");
        m214276a(R.string.Emoji_Silent, "Lark_Emoji_Silent_0", "SILENT", "emoji_silent.png", R.drawable.emoji_silent, false, "闭嘴");
        m214276a(R.string.Emoji_Smart, "Lark_Emoji_Smart_0", "SMART", "emoji_smart.png", R.drawable.emoji_smart, false, "机智");
        m214276a(R.string.Emoji_Attention, "Lark_Emoji_Attention_0", "ATTENTION", "emoji_attention.png", R.drawable.emoji_attention, true, "来看我");
        m214276a(R.string.Emoji_Witty, "Lark_Emoji_Witty_0", "WITTY", "emoji_witty.png", R.drawable.emoji_witty, false, "灵光一闪");
        m214276a(R.string.Emoji_Yeah, "Lark_Emoji_Yeah_0", "YEAH", "emoji_yeah.png", R.drawable.emoji_yeah, false, "耶");
        m214276a(R.string.Emoji_Facepalm, "Lark_Emoji_Facepalm_0", "FACEPALM", "emoji_facepalm.png", R.drawable.emoji_facepalm, false, "捂脸");
        m214276a(R.string.Emoji_Slap, "Lark_Emoji_Slap_0", "SLAP", "emoji_slap.png", R.drawable.emoji_slap, false, "打脸");
        m214276a(R.string.Emoji_Laugh, "Lark_Emoji_Laugh_0", "LAUGH", "emoji_laugh.png", R.drawable.emoji_laugh, false, "大笑");
        m214276a(R.string.Emoji_Yawn, "Lark_Emoji_Yawn_0", "YAWN", "emoji_yawn.png", R.drawable.emoji_yawn, false, "哈欠");
        m214276a(R.string.Emoji_Shocked, "Lark_Emoji_Shocked_0", "SHOCKED", "emoji_shocked.png", R.drawable.emoji_shocked, false, "震惊");
        m214276a(R.string.Emoji_Love, "Lark_Emoji_Love_0", "LOVE", "emoji_love.png", R.drawable.emoji_love, false, "送心");
        m214276a(R.string.Emoji_Drowsy, "Lark_Emoji_Drowsy_0", "DROWSY", "emoji_drowsy.png", R.drawable.emoji_drowsy, false, "困");
        m214276a(R.string.Emoji_What, "Lark_Emoji_What_0", "WHAT", "emoji_what.png", R.drawable.emoji_what, false, "what");
        m214276a(R.string.Emoji_Cry, "Lark_Emoji_Cry_0", "CRY", "emoji_cry.png", R.drawable.emoji_cry, false, "泣不成声");
        m214276a(R.string.Emoji_Clap, "Lark_Emoji_Clap_0", "CLAP", "emoji_clap.png", R.drawable.emoji_clap, false, "小鼓掌");
        m214276a(R.string.Emoji_ShowOff, "Lark_Emoji_ShowOff_0", "SHOWOFF", "emoji_showoff.png", R.drawable.emoji_showoff, false, "酷");
        m214276a(R.string.Emoji_Chuckle, "Lark_Emoji_Chuckle_0", "CHUCKLE", "emoji_chuckle.png", R.drawable.emoji_chuckle, false, "偷笑");
        m214276a(R.string.Emoji_Petrified, "Lark_Emoji_Petrified_0", "PETRIFIED", "emoji_petrified.png", R.drawable.emoji_petrified, false, "石化");
        m214276a(R.string.Emoji_Thinking, "Lark_Emoji_Thinking_0", "THINKING", "emoji_thinking.png", R.drawable.emoji_thinking, false, "思考");
        m214276a(R.string.Emoji_SpitBlood, "Lark_Emoji_SpitBlood_0", "SPITBLOOD", "emoji_spitblood.png", R.drawable.emoji_spitblood, false, "吐血");
        m214276a(R.string.Emoji_Whimper, "Lark_Emoji_Whimper_0", "WHIMPER", "emoji_whimper.png", R.drawable.emoji_whimper, false, "可怜");
        m214276a(R.string.Emoji_Shhh, "Lark_Emoji_Shhh_0", "SHHH", "emoji_shhh.png", R.drawable.emoji_shhh, false, "嘘");
        m214276a(R.string.Emoji_Smug, "Lark_Emoji_Smug_0", "SMUG", "emoji_smug.png", R.drawable.emoji_smug, false, "撇嘴");
        m214276a(R.string.Emoji_Errr, "Lark_Emoji_Errr_0", "ERROR", "emoji_errr.png", R.drawable.emoji_errr, false, "黑线");
        m214276a(R.string.Emoji_Lol, "Lark_Emoji_Lol_0", "LOL", "emoji_lol.png", R.drawable.emoji_lol, false, "笑哭");
        m214276a(R.string.Emoji_Sick, "Lark_Emoji_Sick_0", "SICK", "emoji_sick.png", R.drawable.emoji_sick, false, "雾霾");
        m214276a(R.string.Emoji_Smirk, "Lark_Emoji_Smirk_0", "SMIRK", "emoji_smirk.png", R.drawable.emoji_smirk, false, "奸笑");
        m214276a(R.string.Emoji_Proud, "Lark_Emoji_Proud_0", "PROUD", "emoji_proud.png", R.drawable.emoji_proud, false, "得意");
        m214276a(R.string.Emoji_Trick, "Lark_Emoji_Trick_0", "TRICK", "emoji_trick.png", R.drawable.emoji_trick, false, "憨笑");
        m214276a(R.string.Emoji_Crazy, "Lark_Emoji_Crazy_0", "CRAZY", "emoji_crazy.png", R.drawable.emoji_crazy, false, "抓狂");
        m214276a(R.string.Emoji_Tears, "Lark_Emoji_Tears_0", "TEARS", "emoji_tears.png", R.drawable.emoji_tears, false, "泪奔");
        m214276a(R.string.Emoji_Kiss, "Lark_Emoji_Kiss_0", "KISS", "emoji_kiss.png", R.drawable.emoji_kiss, false, "吻");
        m214276a(R.string.Emoji_Terror, "Lark_Emoji_Terror_0", "TERROR", "emoji_terror.png", R.drawable.emoji_terror, false, "恐惧");
        m214276a(R.string.Emoji_Joyful, "Lark_Emoji_Joyful_0", "JOYFUL", "emoji_joyful.png", R.drawable.emoji_joyful, false, "笑");
        m214276a(R.string.Emoji_Blubber, "Lark_Emoji_Blubber_0", "BLUBBER", "emoji_blubber.png", R.drawable.emoji_blubber, false, "快哭了");
        m214276a(R.string.Emoji_Husky, "Lark_Emoji_Husky_0", "HUSKY", "emoji_husky.png", R.drawable.emoji_husky, false, "翻白眼");
        m214276a(R.string.Emoji_FollowMe, "Lark_Emoji_FollowMe_0", "FOLLOWME", "emoji_followme.png", R.drawable.emoji_followme, true, "互粉");
        m214276a(R.string.Emoji_Thumbsup, "Lark_Emoji_Thumbsup_0", "THUMBSUP", "emoji_thumbsup.png", R.drawable.emoji_thumbsup, false, "赞");
        m214276a(R.string.Emoji_Applaud, "Lark_Emoji_Applaud_0", "APPLAUSE", "emoji_applaud.png", R.drawable.emoji_applaud, false, "鼓掌");
        m214276a(R.string.Emoji_Thanks, "Lark_Emoji_Thanks_0", "THANKS", "emoji_thanks.png", R.drawable.emoji_thanks, false, "谢谢");
        m214276a(R.string.Emoji_Fighting, "Lark_Emoji_Fighting_0", "MUSCLE", "emoji_fighting.png", R.drawable.emoji_fighting, false, "加油");
        m214276a(R.string.Emoji_Heart, "Lark_Emoji_Heart_0", "HEART", "emoji_heart.png", R.drawable.emoji_heart, false, "爱心");
        m214276a(R.string.Emoji_Lips, "Lark_Emoji_Lips_0", "LIPS", "emoji_lips.png", R.drawable.emoji_lips, false, "kiss");
        m214276a(R.string.Emoji_Detergent, "Lark_Emoji_Detergent_0", "DETERGENT", "emoji_detergent.png", R.drawable.emoji_detergent, true, "去污粉");
        m214276a(R.string.Emoji_Awesome, "Lark_Emoji_Awesome_0", "AWESOME", "emoji_awesome.png", R.drawable.emoji_awesome, true, "666");
        m214276a(R.string.Emoji_Rose, "Lark_Emoji_Rose_0", "ROSE", "emoji_rose.png", R.drawable.emoji_rose, false, "玫瑰");
        m214276a(R.string.Emoji_Cucumber, "Lark_Emoji_Cucumber_0", "CUCUMBER", "emoji_cucumber_v3.png", R.drawable.emoji_cucumber, false, "胡瓜");
        m214276a(R.string.Emoji_Beer, "Lark_Emoji_Beer_0", "BEER", "emoji_beer.png", R.drawable.emoji_beer, false, "啤酒");
        m214276a(R.string.Emoji_Enough, "Lark_Emoji_Enough_0", "ENOUGH", "emoji_enough.png", R.drawable.emoji_enough, false, "我想静静");
        m214276a(R.string.Emoji_Wronged, "Lark_Emoji_Wronged_0", "WRONGED", "emoji_wronged.png", R.drawable.emoji_wronged, false, "委屈");
        m214276a(R.string.Emoji_Obsessed, "Lark_Emoji_Obsessed_0", "OBSESSED", "emoji_obsessed.png", R.drawable.emoji_obsessed, false, "舔屏");
        m214276a(R.string.Emoji_LookDown, "Lark_Emoji_LookDown_0", "LOOKDOWN", "emoji_lookdown.png", R.drawable.emoji_lookdown, false, "鄙视");
        m214276a(R.string.Emoji_Smooch, "Lark_Emoji_Smooch_0", "SMOOCH", "emoji_smooch.png", R.drawable.emoji_smooch, false, "飞吻");
        m214276a(R.string.Emoji_Wave, "Lark_Emoji_Wave_0", "WAVE", "emoji_wave.png", R.drawable.emoji_wave, false, "再见");
        m214276a(R.string.Emoji_DonnotGo, "Lark_Emoji_DonnotGo_0", "DONNOTGO", "emoji_donnotgo.png", R.drawable.emoji_donnotgo, false, "紫薇别走");
        m214276a(R.string.Emoji_Headset, "Lark_Emoji_Headset_0", "HEADSET", "emoji_headset_v3.png", R.drawable.emoji_headset, false, "听歌");
        m214276a(R.string.Emoji_Hug, "Lark_Emoji_Hug_0", "HUG", "emoji_hug.png", R.drawable.emoji_hug, false, "求抱抱");
        m214276a(R.string.Emoji_DullStare, "Lark_Emoji_DullStare_0", "DULLSTARE", "emoji_dullstare.png", R.drawable.emoji_dullstare, false, "周冬雨的凝视");
        m214276a(R.string.Emoji_InnocentSmile, "Lark_Emoji_InnocentSmile_0", "INNOCENTSMILE", "emoji_innocentsmile.png", R.drawable.emoji_innocentsmile, false, "马思纯的微笑");
        m214276a(R.string.Emoji_Tongue, "Lark_Emoji_Tongue_0", "TONGUE", "emoji_tongue.png", R.drawable.emoji_tongue, false, "吐舌");
        m214276a(R.string.Emoji_Dull, "Lark_Emoji_Dull_0", "DULL", "emoji_dull.png", R.drawable.emoji_dull, false, "呆无辜");
        m214276a(R.string.Emoji_Glance, "Lark_Emoji_Glance_0", "GLANCE", "emoji_glance.png", R.drawable.emoji_glance, false, "看");
        m214276a(R.string.Emoji_Slight, "Lark_Emoji_Slight_0", "SLIGHT", "emoji_slight.png", R.drawable.emoji_slight, false, "白眼");
        m214276a(R.string.Emoji_Bear, "Lark_Emoji_Bear_0", "BEAR", "emoji_bear.png", R.drawable.emoji_bear, false, "熊吉");
        m214276a(R.string.Emoji_Skull, "Lark_Emoji_Skull_0", "SKULL", "emoji_skull.png", R.drawable.emoji_skull, false, "骷髅");
        m214276a(R.string.Emoji_BlackFace, "Lark_Emoji_BlackFace_0", "BLACKFACE", "emoji_blackface.png", R.drawable.emoji_blackface, false, "黑脸");
        m214276a(R.string.Emoji_Eating, "Lark_Emoji_Eating_0", "EATING", "emoji_eating.png", R.drawable.emoji_eating, false, "吃瓜群众");
        m214276a(R.string.Emoji_Sweat, "Lark_Emoji_Sweat_0", "SWEAT", "emoji_sweat.png", R.drawable.emoji_sweat, false, "汗");
        m214276a(R.string.Emoji_Comfort, "Lark_Emoji_Comfort_0", "COMFORT", "emoji_comfort.png", R.drawable.emoji_comfort, false, "摸头");
        m214276a(R.string.Emoji_Frown, "Lark_Emoji_Frown_0", "FROWN", "emoji_frown.png", R.drawable.emoji_frown, false, "皱眉");
        m214276a(R.string.Emoji_Speechless, "Lark_Emoji_Speechless_0", "SPEECHLESS", "emoji_speechless.png", R.drawable.emoji_speechless, false, "擦汗");
        m214276a(R.string.Emoji_Blush, "Lark_Emoji_Blush_0", "XBLUSH", "emoji_blush.png", R.drawable.emoji_blush, false, "红脸");
        m214276a(R.string.Emoji_Embarrassed, "Lark_Emoji_Embarrassed_0", "EMBARRASSED", "emoji_embarrassed.png", R.drawable.emoji_embarrassed, false, "尬笑");
        m214276a(R.string.Emoji_Tease, "Lark_Emoji_Tease_0", "TEASE", "emoji_tease.png", R.drawable.emoji_tease, false, "做鬼脸");
        m214276a(R.string.Emoji_Praise, "Lark_Emoji_Praise_0", "PRAISE", "emoji_praise.png", R.drawable.emoji_praise, false, "强");
        m214276a(R.string.Emoji_BigKiss, "Lark_Emoji_BigKiss_0", "BIGKISS", "emoji_bigkiss.png", R.drawable.emoji_bigkiss, false, "如花");
        m214276a(R.string.Emoji_Puke, "Lark_Emoji_Puke_0", "PUKE", "emoji_puke.png", R.drawable.emoji_puke, false, "吐");
        m214276a(R.string.Emoji_Wow, "Lark_Emoji_Wow_0", "WOW", "emoji_wow.png", R.drawable.emoji_wow, false, "惊喜");
        m214276a(R.string.Emoji_Hammer, "Lark_Emoji_Hammer_0", "HAMMER", "emoji_hammer.png", R.drawable.emoji_hammer, false, "敲打");
        m214276a(R.string.Emoji_Strive, "Lark_Emoji_Strive_0", "STRIVE", "emoji_strive.png", R.drawable.emoji_strive, false, "奋斗");
        m214276a(R.string.Emoji_RainbowPuke, "Lark_Emoji_RainbowPuke_0", "RAINBOWPUKE", "emoji_rainbowpuke_v2.png", R.drawable.emoji_rainbowpuke, false, "吐彩虹");
        m214276a(R.string.Emoji_Wail, "Lark_Emoji_Wail_0", "WAIL", "emoji_wail.png", R.drawable.emoji_wail, false, "大哭");
        m214276a(R.string.Emoji_FingerHeart, "Lark_Emoji_FingerHeart_0", "FINGERHEART", "emoji_fingerheart.png", R.drawable.emoji_fingerheart, false, "比心");
        m214276a(R.string.Emoji_FistBump, "Lark_Emoji_FistBump_0", "FISTBUMP", "emoji_fistbump.png", R.drawable.emoji_fistbump, false, "碰拳");
        m214276a(R.string.Emoji_HighFive, "Lark_Emoji_HighFive_0", "HIGHFIVE", "emoji_highfive.png", R.drawable.emoji_highfive, false, "击掌");
        m214276a(R.string.Emoji_UpperLeft, "Lark_Emoji_UpperLeft_0", "UPPERLEFT", "emoji_upperleft.png", R.drawable.emoji_upperleft, false, "左上");
        m214276a(R.string.Emoji_Shake, "Lark_Emoji_Shake_0", "SHAKE", "emoji_shake.png", R.drawable.emoji_shake, false, "握手");
        m214276a(R.string.Emoji_Salute, "Salute", "SALUTE", "emoji_salute.png", R.drawable.emoji_salute, false, "抱拳");
        m214276a(R.string.Emoji_Done, "Done", "DONE", "emoji_done.png", R.drawable.emoji_done, false, "完成");
        m214276a(R.string.Emoji_Eighteen, "Lark_Emoji_18x_0", "18X", "emoji_eighteen.png", R.drawable.emoji_eighteen, false, "18禁");
        m214276a(R.string.Emoji_Cleaver, "Lark_Emoji_Cleaver_0", "CLEAVER", "emoji_cleaver_v2.png", R.drawable.emoji_cleaver, false, "刀");
        m214276a(R.string.Emoji_PlusOne, "+1", "JIAYI", "emoji_plusone.png", R.drawable.emoji_plusone, false, "+1");
        m214276a(R.string.Emoji_WellDone, "Lark_Emoji_WellDone_0", "WELLDONE", "emoji_welldone.png", R.drawable.emoji_welldone, true, "V5");
        m214276a(R.string.Emoji_GoodJob, "Lark_Emoji_GoodJob_0", "GOODJOB", "emoji_goodjob.png", R.drawable.emoji_goodjob, true, "给力");
        m214276a(R.string.Emoji_HeartBroken, "Lark_Emoji_HeartBroken_0", "HEARTBROKEN", "emoji_heartbroken.png", R.drawable.emoji_heartbroken, false, "伤心");
        m214276a(R.string.Emoji_Poop, "Lark_Emoji_Poop_0", "POOP", "emoji_poop.png", R.drawable.emoji_poop, false, "屎");
        m214276a(R.string.Emoji_Gift, "Lark_Emoji_Gift_0", "GIFT", "emoji_gift.png", R.drawable.emoji_gift, false, "礼物");
        m214276a(R.string.Emoji_Cake, "Lark_Emoji_Cake_0", "CAKE", "emoji_cake.png", R.drawable.emoji_cake, false, "蛋糕");
        m214276a(R.string.Emoji_Party, "Lark_Emoji_Party_0", "PARTY", "emoji_party.png", R.drawable.emoji_party, false, "撒花");
        m214276a(R.string.Emoji_EyesClosed, "Lark_Emoji_EyesClosed_0", "EYESCLOSED", "emoji_eyesclosed.png", R.drawable.emoji_eyesclosed, false, "不看");
        m214276a(R.string.Emoji_Bomb, "Lark_Emoji_Bomb_0", "BOMB", "emoji_bomb.png", R.drawable.emoji_bomb, false, "炸弹");
        m214276a(R.string.Emoji_Fireworks, "Fireworks", "FIREWORKS", "emoji_fireworks.png", R.drawable.emoji_fireworks, false, "");
        m214276a(R.string.Emoji_Bull, "Bull", "BULL", "emoji_bull.png", R.drawable.emoji_bull, false, "");
        m214276a(R.string.Emoji_Calf, "Calf", "CALF", "emoji_calf.png", R.drawable.emoji_calf, false, "");
        m214276a(R.string.Emoji_Candiedhaws, "Candiedhaws", "CANDIEDHAWS", "emoji_candiedhaws.png", R.drawable.emoji_candiedhaws, false, "");
        m214276a(R.string.Emoji_Redpacket, "Redpacket", "REDPACKET", "emoji_redpacket.png", R.drawable.emoji_redpacket, false, "");
        m214276a(R.string.Emoji_Luck, "Luck", "LUCK", "emoji_luck.png", R.drawable.emoji_luck, false, "");
        m214276a(R.string.Emoji_Firecracker, "Firecracker", "FIRECRACKER", "emoji_firecracker.png", R.drawable.emoji_firecracker, false, "");
        m214276a(R.string.Emoji_EatingFood, "EatingFood", "EatingFood", "emoji_eatingfood_v2.png", R.drawable.emoji_eatingfood, false, null);
        m214276a(R.string.Emoji_Typing, "Typing", "Typing", "emoji_typing.png", R.drawable.emoji_typing, false, null);
        m214276a(R.string.Emoji_Lemon, "Lemon", "Lemon", "emoji_lemon_v2.png", R.drawable.emoji_lemon, false, null);
        m214276a(R.string.Emoji_Get, "Get", "Get", "emoji_get_v3.png", R.drawable.emoji_get, false, null);
        m214276a(R.string.Emoji_LGTM, "LGTM", "LGTM", "emoji_lgtm_v3.png", R.drawable.emoji_lgtm, false, null);
        m214276a(R.string.Emoji_ThumbsDown, "ThumbsDown", "ThumbsDown", "emoji_thumbsdown.png", R.drawable.emoji_thumbsdown, false, null);
        m214276a(R.string.Emoji_Drumstick, "Drumstick", "Drumstick", "emoji_drumstick.png", R.drawable.emoji_drumstick, false, null);
        m214276a(R.string.Emoji_Pepper, "Pepper", "Pepper", "emoji_pepper.png", R.drawable.emoji_pepper, false, null);
        m214276a(R.string.Emoji_BubbleTea, "BubbleTea", "BubbleTea", "emoji_bubbletea.png", R.drawable.emoji_bubbletea, false, null);
        m214276a(R.string.Emoji_Coffee, "Coffee", "Coffee", "emoji_coffee.png", R.drawable.emoji_coffee, false, null);
        m214276a(R.string.Emoji_Yes, "Yes", "Yes", "emoji_yes_v2.png", R.drawable.emoji_yes, false, null);
        m214276a(R.string.Emoji_No, "No", "No", "emoji_no.png", R.drawable.emoji_no, false, null);
        m214276a(R.string.Emoji_OKR, "OKR", "OKR", "emoji_okr.png", R.drawable.emoji_okr, false, null);
        m214276a(R.string.Emoji_CheckMark, "CheckMark", "CheckMark", "emoji_checkmark.png", R.drawable.emoji_checkmark, false, null);
        m214276a(R.string.Emoji_CrossMark, "CrossMark", "CrossMark", "emoji_crossmark.png", R.drawable.emoji_crossmark, false, null);
        m214276a(R.string.Emoji_MinusOne, "MinusOne", "MinusOne", "emoji_minusone_v3.png", R.drawable.emoji_minusone, false, null);
        m214276a(R.string.Emoji_Hundred, "Hundred", "Hundred", "emoji_hundred.png", R.drawable.emoji_hundred, false, null);
        m214276a(R.string.Emoji_Pin, "Pin", "Pin", "emoji_pin.png", R.drawable.emoji_pin, false, null);
        m214276a(R.string.Emoji_Alarm, "Alarm", "Alarm", "emoji_alarm.png", R.drawable.emoji_alarm, false, null);
        m214276a(R.string.Emoji_Loudspeaker, "Loudspeaker", "Loudspeaker", "emoji_loudspeaker.png", R.drawable.emoji_loudspeaker, false, null);
        m214276a(R.string.Emoji_Trophy, "Trophy", "Trophy", "emoji_trophy.png", R.drawable.emoji_trophy, false, null);
        m214276a(R.string.Emoji_Fire, "Fire", "Fire", "emoji_fire.png", R.drawable.emoji_fire, false, null);
        m214276a(R.string.Emoji_Music, "Music", "Music", "emoji_music_v2.png", R.drawable.emoji_music, false, null);
        m214276a(R.string.Emoji_Basketball, "Basketball", "Basketball", "emoji_basketball_v2.png", R.drawable.emoji_basketball, false, null);
        m214276a(R.string.Emoji_Soccer, "Soccer", "Soccer", "emoji_soccer_v2.png", R.drawable.emoji_soccer, false, null);
        m214276a(R.string.Emoji_GeneralBusinessTrip, "GeneralBusinessTrip", "GeneralBusinessTrip", "emoji_generalbusinesstrip_v2.png", R.drawable.emoji_generalbusinesstrip, false, null);
        m214276a(R.string.Emoji_GeneralDoNotDisturb, "GeneralDoNotDisturb", "GeneralDoNotDisturb", "emoji_generaldonotdisturb_v2.png", R.drawable.emoji_generaldonotdisturb, false, null);
        m214276a(R.string.Emoji_GeneralInMeetingBusy, "GeneralInMeetingBusy", "GeneralInMeetingBusy", "emoji_generalInmeetingbusy_v2.png", R.drawable.emoji_generalinmeetingbusy, false, null);
        m214276a(R.string.Emoji_GeneralMoonRest, "GeneralMoonRest", "GeneralMoonRest", "emoji_generalmoonrest_v2.png", R.drawable.emoji_generalmoonrest, false, null);
        m214276a(R.string.Emoji_GeneralSun, "GeneralSun", "GeneralSun", "emoji_generalsun.png", R.drawable.emoji_generalsun, false, null);
        m214276a(R.string.Emoji_GeneralTravellingCar, "GeneralTravellingCar", "GeneralTravellingCar", "emoji_generaltravellingcar.png", R.drawable.emoji_generaltravellingcar, false, null);
        m214276a(R.string.Emoji_GeneralWorkFromHome, "GeneralWorkFromHome", "GeneralWorkFromHome", "emoji_generalworkfromhome.png", R.drawable.emoji_generalworkfromhome, false, null);
        m214276a(R.string.Emoji_Status_PrivateMessage, "Status_PrivateMessage", "Status_PrivateMessage", "emoji_status_privatemessage.png", R.drawable.emoji_status_privatemessage, false, null);
        m214276a(R.string.Emoji_StatusBus, "StatusBus", "StatusBus", "emoji_statusbus.png", R.drawable.emoji_statusbus, false, null);
        m214276a(R.string.Emoji_StatusEnjoyLife, "StatusEnjoyLife", "StatusEnjoyLife", "emoji_statusenjoylife.png", R.drawable.emoji_statusenjoylife, false, null);
        m214276a(R.string.Emoji_StatusFlashOfInspiration, "StatusFlashOfInspiration", "StatusFlashOfInspiration", "emoji_statusflashofinspiration.png", R.drawable.emoji_statusflashofinspiration, false, null);
        m214276a(R.string.Emoji_StatusInFlight, "StatusInFlight", "StatusInFlight", "emoji_statusinflight.png", R.drawable.emoji_statusinflight, false, null);
        m214276a(R.string.Emoji_StatusReading, "StatusReading", "StatusReading", "emoji_statusreading.png", R.drawable.emoji_statusreading, false, null);
        m214276a(R.string.Emoji_2022, "2022", "2022", "emoji_2022.png", R.drawable.emoji_twentytwentytwo, false, null);
        if (a2) {
            m214276a(R.string.Emoji_Money, "Lark_Emoji_Money_0", "MONEY", "emoji_dollar.png", R.drawable.emoji_dollar, false, "钱");
            m214276a(R.string.Emoji_OK, "Lark_Emoji_OK_0", "OK", "emoji_ok_v2.png", R.drawable.emoji_ok, false, "OK");
            m214276a(R.string.Emoji_Betrayed, "Lark_Emoji_Betrayed_0", "BETRAYED", "emoji_mad.png", R.drawable.emoji_mad, false, "绿帽子");
            m214276a(R.string.Emoji_Awesomen, "Awesomen", "AWESOMEN", "emoji_socool_v2.png", R.drawable.emoji_socool, false, "");
            m214276a(R.string.Emoji_TwentyTwentyone, "2021", "2021", "emoji_balloon_v2.png", R.drawable.emoji_balloon, false, "");
            m214276a(R.string.Emoji_Fortune, "Fortune", "FORTUNE", "emoji_gold.png", R.drawable.emoji_gold, false, "");
            return;
        }
        m214276a(R.string.Emoji_Money, "Lark_Emoji_Money_0", "MONEY", "emoji_money.png", R.drawable.emoji_money, false, "钱");
        m214276a(R.string.Emoji_OK, "Lark_Emoji_OK_0", "OK", "emoji_ok_v2.png", R.drawable.emoji_ok, false, "OK");
        m214276a(R.string.Emoji_Betrayed, "Lark_Emoji_Betrayed_0", "BETRAYED", "emoji_betrayed.png", R.drawable.emoji_betrayed, false, "绿帽子");
        m214276a(R.string.Emoji_Awesomen, "Awesomen", "AWESOMEN", "emoji_awesomen_v2.png", R.drawable.emoji_awesomen, false, "");
        m214276a(R.string.Emoji_TwentyTwentyone, "2021", "2021", "emoji_twentytwentyone_v2.png", R.drawable.emoji_twentytwentyone, false, "");
        m214276a(R.string.Emoji_Fortune, "Fortune", "FORTUNE", "emoji_fortune.png", R.drawable.emoji_fortune, false, "");
    }

    /* renamed from: f */
    private final void m214282f() {
        ExecutorService executorService = f136341g;
        executorService.execute(RunnableC55246d.f136346a);
        executorService.execute(RunnableC55247e.f136347a);
    }

    /* renamed from: e */
    public final int mo188275e() {
        f136344j.readLock().lock();
        try {
            return f136336b;
        } finally {
            f136344j.readLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.t.b$d */
    public static final class RunnableC55246d implements Runnable {

        /* renamed from: a */
        public static final RunnableC55246d f136346a = new RunnableC55246d();

        RunnableC55246d() {
        }

        public final void run() {
            boolean z;
            EmojiMapManager bVar = EmojiMapManager.f136337c;
            if (!EmojiMapManager.f136342h.isEmpty()) {
                EmojiMapManager bVar2 = EmojiMapManager.f136337c;
                Iterator it = EmojiMapManager.f136342h.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "iterator.next()");
                    Map.Entry entry = (Map.Entry) next;
                    EmojiMapManager bVar3 = EmojiMapManager.f136337c;
                    Object value = entry.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
                    if (!bVar3.mo188270b((String) value)) {
                        EmojiMapManager bVar4 = EmojiMapManager.f136337c;
                        Object value2 = entry.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value2, "entry.value");
                        if (!bVar4.mo188272c((String) value2)) {
                            z = false;
                            ((IGetDataCallback) entry.getKey()).onSuccess(Boolean.valueOf(z));
                            it.remove();
                        }
                    }
                    z = true;
                    ((IGetDataCallback) entry.getKey()).onSuccess(Boolean.valueOf(z));
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.t.b$e */
    public static final class RunnableC55247e implements Runnable {

        /* renamed from: a */
        public static final RunnableC55247e f136347a = new RunnableC55247e();

        RunnableC55247e() {
        }

        public final void run() {
            EmojiMapManager bVar = EmojiMapManager.f136337c;
            if (!EmojiMapManager.f136343i.isEmpty()) {
                EmojiMapManager bVar2 = EmojiMapManager.f136337c;
                Iterator it = EmojiMapManager.f136343i.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkExpressionValueIsNotNull(next, "iterator.next()");
                    final Map.Entry entry = (Map.Entry) next;
                    EmojiMapManager bVar3 = EmojiMapManager.f136337c;
                    Object value = entry.getValue();
                    Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
                    if (!bVar3.mo188270b((String) value)) {
                        EmojiMapManager bVar4 = EmojiMapManager.f136337c;
                        Object value2 = entry.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value2, "entry.value");
                        if (!bVar4.mo188272c((String) value2)) {
                        }
                    }
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.newemoji.EmojiMapManager.RunnableC55247e.RunnableC552481 */

                        public final void run() {
                            ((EmojisChangedConsumer) entry.getKey()).mo188276a();
                        }
                    });
                    it.remove();
                }
                EmojiMapManager bVar5 = EmojiMapManager.f136337c;
                for (EmojisChangedConsumer aVar : EmojiMapManager.f136343i.keySet()) {
                    aVar.mo188277b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.t.b$f */
    public static final class RunnableC55249f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IResetEmojisCallback f136349a;

        RunnableC55249f(IResetEmojisCallback bVar) {
            this.f136349a = bVar;
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            EmojiMapManager bVar = EmojiMapManager.f136337c;
            EmojiMapManager.f136344j.writeLock().lock();
            try {
                EmojiMapManager.m214280c().clear();
                EmojiMapManager.m214274a().clear();
                EmojiMapManager.m214278b().clear();
                EmojiMapManager.f136336b = EmojiMapManager.f136335a;
                EmojiMapManager bVar2 = EmojiMapManager.f136337c;
                EmojiMapManager.f136344j.writeLock().unlock();
                EmojiMapManager.f136337c.mo188273d();
                EmojiMapManager.f136337c.mo188266a((List<String>) null);
                IResetEmojisCallback bVar3 = this.f136349a;
                if (bVar3 != null) {
                    bVar3.mo185549a();
                }
            } catch (Throwable th) {
                EmojiMapManager bVar4 = EmojiMapManager.f136337c;
                EmojiMapManager.f136344j.writeLock().unlock();
                throw th;
            }
        }
    }

    static {
        EmojiMapManager bVar = new EmojiMapManager();
        f136337c = bVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkExpressionValueIsNotNull(newSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
        f136341g = newSingleThreadExecutor;
        bVar.mo188273d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/newemoji/EmojiMapManager$loadBitmapFromNet$1", "Lcom/ss/android/lark/image/api/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", "resource", "lark-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.t.b$c */
    public static final class C55245c extends C38818i<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C55244a f136345a;

        C55245c(C55244a aVar) {
            this.f136345a = aVar;
        }

        /* renamed from: a */
        public void mo49248a(Bitmap bitmap) {
            if (bitmap != null) {
                EmojiMapManager bVar = EmojiMapManager.f136337c;
                EmojiMapManager.f136344j.writeLock().lock();
                try {
                    this.f136345a.mo188257a(bitmap);
                } finally {
                    EmojiMapManager bVar2 = EmojiMapManager.f136337c;
                    EmojiMapManager.f136344j.writeLock().unlock();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo188266a(List<String> list) {
        LarkEmojiModuleDependency.IEmojiDependency a = LarkEmojiModuleDependency.m214269a();
        if (a != null) {
            a.mo43821a(f136336b, list);
        }
    }

    /* renamed from: b */
    public final boolean mo188270b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        C55244a aVar = f136339e.get(str);
        if (aVar == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(aVar, "reactionMap[reactionKey] ?: return false");
        if (aVar.mo188261e() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo188272c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        C55244a aVar = f136339e.get(str);
        if (aVar == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(aVar, "reactionMap[reactionKey] ?: return false");
        return !TextUtils.isEmpty(aVar.mo188260d());
    }

    /* renamed from: a */
    public final void mo188264a(IResetEmojisCallback bVar) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().execute(new RunnableC55249f(bVar));
    }

    /* renamed from: a */
    public final boolean mo188268a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        C55244a aVar = f136339e.get(str);
        if (aVar != null) {
            return aVar.mo188262f();
        }
        return true;
    }

    /* renamed from: a */
    private final void m214277a(String str, C55244a aVar) {
        ImageLoader.with(UIHelper.getContext()).load(new EmojiImageResource(str)).asBitmap().into(new C55245c(aVar));
    }

    /* renamed from: c */
    public final String mo188271c(String str, boolean z) {
        ConcurrentHashMap<String, C55244a> concurrentHashMap;
        String d;
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (z) {
            concurrentHashMap = f136338d;
        } else {
            concurrentHashMap = f136339e;
        }
        C55244a aVar = concurrentHashMap.get(str);
        if (aVar == null || (d = aVar.mo188260d()) == null) {
            return null;
        }
        return d;
    }

    /* renamed from: a */
    public final String mo188263a(String str, boolean z) {
        ConcurrentHashMap<String, C55244a> concurrentHashMap;
        String c;
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (z) {
            concurrentHashMap = f136338d;
        } else {
            concurrentHashMap = f136339e;
        }
        C55244a aVar = concurrentHashMap.get(str);
        return (aVar == null || (c = aVar.mo188259c()) == null) ? str : c;
    }

    /* renamed from: b */
    public final Bitmap mo188269b(String str, boolean z) {
        ConcurrentHashMap<String, C55244a> concurrentHashMap;
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (z) {
            concurrentHashMap = f136338d;
        } else {
            concurrentHashMap = f136339e;
        }
        C55244a aVar = concurrentHashMap.get(str);
        if (aVar != null) {
            return aVar.mo188261e();
        }
        Statistics.sendEvent("emoji_show_fallback", new JSONObject().put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, f136336b).put("key", str));
        return null;
    }

    /* renamed from: d */
    public final void mo188274d(String str, boolean z) {
        ConcurrentHashMap<String, C55244a> concurrentHashMap;
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                concurrentHashMap = f136338d;
            } else {
                concurrentHashMap = f136339e;
            }
            C55244a aVar = concurrentHashMap.get(str);
            if (aVar == null) {
                Log.m165389i("EmojiMapManager", "key = " + str + ", emoji entity is null, get emojis from net.");
                mo188266a(CollectionsKt.listOf(str));
            } else if (aVar.mo188261e() == null) {
                Log.m165389i("EmojiMapManager", "key = " + str + ", emoji bitmap is null, load bitmap.");
                String d = aVar.mo188260d();
                Intrinsics.checkExpressionValueIsNotNull(d, "emojiEntity.imageKey");
                m214277a(d, aVar);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo188267a(Set<? extends C55244a> set, int i) {
        String str;
        Intrinsics.checkParameterIsNotNull(set, "set");
        if (!CollectionUtils.isEmpty(set)) {
            Log.m165389i("EmojiMapManager", "update map, version = " + i + ", change count = " + set.size());
            f136344j.writeLock().lock();
            try {
                f136336b = i;
                for (T t : set) {
                    ConcurrentHashMap<String, C55244a> concurrentHashMap = f136338d;
                    C55244a aVar = concurrentHashMap.get(t.mo188256a());
                    if (aVar != null) {
                        str = aVar.mo188259c();
                    } else {
                        str = null;
                    }
                    String a = t.mo188256a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "it.emojiKey");
                    concurrentHashMap.put(a, t);
                    String b = t.mo188258b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "it.reactionKey");
                    f136339e.put(b, t);
                    if (str != null && !C57782ag.m224242a(t.mo188259c(), str)) {
                        f136340f.remove(str);
                    }
                    String c = t.mo188259c();
                    Intrinsics.checkExpressionValueIsNotNull(c, "it.text");
                    String a2 = t.mo188256a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "it.emojiKey");
                    f136340f.put(c, a2);
                }
                f136344j.writeLock().unlock();
                for (T t2 : set) {
                    if (t2.mo188261e() == null) {
                        EmojiMapManager bVar = f136337c;
                        String d = t2.mo188260d();
                        Intrinsics.checkExpressionValueIsNotNull(d, "it.imageKey");
                        bVar.m214277a(d, t2);
                    }
                }
                m214282f();
            } catch (Throwable th) {
                f136344j.writeLock().unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo188265a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        boolean z2;
        ConcurrentHashMap<String, C55244a> concurrentHashMap;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        boolean z3 = false;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            iGetDataCallback.onError(new ErrorResult("key is null"));
            return;
        }
        if (z) {
            concurrentHashMap = f136338d;
        } else {
            concurrentHashMap = f136339e;
        }
        C55244a aVar = concurrentHashMap.get(str);
        if (aVar != null) {
            String d = aVar.mo188260d();
            Intrinsics.checkExpressionValueIsNotNull(d, "emojiEntity.imageKey");
            if (d.length() > 0) {
                z3 = true;
            }
            if (z3 || aVar.mo188261e() != null) {
                iGetDataCallback.onSuccess(true);
                return;
            }
        }
        f136342h.put(iGetDataCallback, str);
        mo188274d(str, z);
    }

    /* renamed from: a */
    private final void m214276a(int i, String str, String str2, String str3, int i2, boolean z, String str4) {
        boolean z2;
        String string = UIHelper.getString(i);
        C55244a aVar = new C55244a(str, str2, string, str3, i2, Boolean.valueOf(z));
        ConcurrentHashMap<String, C55244a> concurrentHashMap = f136338d;
        concurrentHashMap.put(str, aVar);
        f136339e.put(str2, aVar);
        Intrinsics.checkExpressionValueIsNotNull(string, "text");
        f136340f.put(string, str);
        if (str4 != null) {
            if (str4.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                concurrentHashMap.put(str4, aVar);
            }
        }
    }
}
