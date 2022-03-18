package com.ss.android.lark.feed.app.model.p1864d;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26266d;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.interfaces.AbstractC38101j;
import com.ss.android.lark.feed.interfaces.AbstractC38115y;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57860r;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.feed.app.model.d.a */
public abstract class AbstractC37737a<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo138436a(FeedPreviewInfo feedPreviewInfo);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo138439b(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo);

    /* renamed from: com.ss.android.lark.feed.app.model.d.a$a */
    private static class C37739a {

        /* renamed from: a */
        public static final C37739a f96777a = new C37739a();

        /* renamed from: b */
        public volatile boolean f96778b = true;

        /* renamed from: c */
        public volatile boolean f96779c;

        /* renamed from: d */
        public volatile boolean f96780d;

        private C37739a() {
            m148558b();
        }

        /* renamed from: b */
        private void m148558b() {
            C37268c.m146766b().mo139200s().mo139318a(new AbstractC38115y() {
                /* class com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a.C37739a.C377401 */

                @Override // com.ss.android.lark.feed.interfaces.AbstractC38115y
                /* renamed from: b */
                public void mo137917b() {
                }

                @Override // com.ss.android.lark.feed.interfaces.AbstractC38115y
                /* renamed from: a */
                public void mo137915a() {
                    Log.m165389i("FeedModule_BasePacker", "onBeginChange");
                    C37739a.this.f96778b = true;
                }

                @Override // com.ss.android.lark.feed.interfaces.AbstractC38115y
                /* renamed from: a */
                public void mo137916a(boolean z) {
                    Log.m165389i("FeedModule_BasePacker", "onEndChange " + z);
                    C37739a.this.mo138440a();
                }
            });
            C37268c.m146767c().mo139337a(new AbstractC38101j() {
                /* class com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a.C37739a.C377412 */

                @Override // com.ss.android.lark.feed.interfaces.AbstractC38101j
                /* renamed from: a */
                public void mo138441a(boolean z) {
                    if (z) {
                        C37739a.this.f96778b = true;
                        Log.m165389i("FeedModule_BasePacker", "onLogStatusChange");
                        C37739a.this.mo138440a();
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo138440a() {
            if (this.f96778b) {
                synchronized (f96777a) {
                    if (this.f96778b) {
                        this.f96779c = C37268c.m146766b().mo139200s().mo139325d();
                        this.f96780d = C37268c.m146766b().mo139155B().mo139209b();
                        this.f96778b = false;
                        Log.m165389i("FeedModule_BasePacker", "ensureParamUpdate " + this.f96779c + " " + this.f96780d);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.model.d.a$1 */
    public static /* synthetic */ class C377381 {

        /* renamed from: a */
        static final /* synthetic */ int[] f96775a;

        /* renamed from: b */
        static final /* synthetic */ int[] f96776b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21|22|(3:23|24|26)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
            // Method dump skipped, instructions count: 124
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.model.p1864d.AbstractC37737a.C377381.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m148541a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.substring(str.length() - 1);
    }

    /* renamed from: b */
    private static String m148545b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.substring(str.length() - 1);
    }

    /* renamed from: a */
    private static String m148543a(Locale locale) {
        if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
            return Locale.CHINESE.getLanguage();
        }
        return locale.getLanguage();
    }

    /* renamed from: c */
    private String m148547c(FeedPreviewInfo feedPreviewInfo) {
        if (feedPreviewInfo.mo106051c() == Chat.Type.GROUP) {
            return UIHelper.getString(R.string.Lark_Legacy_GroupLabel);
        }
        if (feedPreviewInfo.mo106068f() == Chatter.ChatterType.USER) {
            return m148542a(feedPreviewInfo.mo106105s(), (String) null);
        }
        return feedPreviewInfo.mo106105s();
    }

    /* renamed from: e */
    private boolean m148551e(FeedPreviewInfo feedPreviewInfo) {
        if (feedPreviewInfo.mo105992P() != Message.Type.SYSTEM) {
            return false;
        }
        SystemMessageType Q = feedPreviewInfo.mo105993Q();
        if (Q == SystemMessageType.USER_CALL_E2EE_VOICE_DURATION || Q == SystemMessageType.USER_CALL_E2EE_VOICE_WHEN_REFUSED || Q == SystemMessageType.USER_CALL_E2EE_VOICE_ON_CANCELL || Q == SystemMessageType.USER_CALL_E2EE_VOICE_ON_MISSING || Q == SystemMessageType.USER_CALL_E2EE_VOICE_WHEN_OCCUPY) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m148552f(FeedPreviewInfo feedPreviewInfo) {
        if (feedPreviewInfo.mo105992P() == Message.Type.VIDEO_CHAT && (feedPreviewInfo.mo105995S() == FeedPreviewInfo.VideoChatContentType.MEETING_CARD || feedPreviewInfo.mo105995S() == FeedPreviewInfo.VideoChatContentType.CHAT_ROOM_CARD)) {
            return true;
        }
        if (feedPreviewInfo.mo105992P() != Message.Type.SYSTEM && feedPreviewInfo.mo105992P() != Message.Type.CARD) {
            return false;
        }
        SystemMessageType Q = feedPreviewInfo.mo105993Q();
        if (Q == SystemMessageType.VC_CALL_HOST_CANCEL || Q == SystemMessageType.VC_CALL_PARTI_NO_ANSWER || Q == SystemMessageType.VC_CALL_PARTI_CANCEL || Q == SystemMessageType.VC_CALL_HOST_BUSY || Q == SystemMessageType.VC_CALL_PARTI_BUSY || Q == SystemMessageType.VC_CALL_FINISH_NOTICE || Q == SystemMessageType.VC_CALL_DURATION || Q == SystemMessageType.VC_CALL_CONNECT_FAIL || Q == SystemMessageType.VC_CALL_DISCONNECT || Q == SystemMessageType.VC_MEETING_STARTED || Q == SystemMessageType.VC_MEETING_ENDED_OVER_ONE_HOUR || Q == SystemMessageType.VC_MEETING_ENDED_LESS_ONE_HOUR || Q == SystemMessageType.VC_MEETING_ENDED_LESS_ONE_MINUTE || Q == SystemMessageType.VC_DEFAULT_MEETING_ENDED_OVER_ONE_HOUR || Q == SystemMessageType.VC_DEFAULT_MEETING_ENDED_LESS_ONE_HOUR || Q == SystemMessageType.VC_DEFAULT_MEETING_ENDED_LESS_ONE_MIN || Q == SystemMessageType.VIDEO_MEETING_CHAT_ROOM_START || feedPreviewInfo.mo105994R() == FeedPreviewInfo.CardContentType.VCHAT) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private String m148553g(FeedPreviewInfo feedPreviewInfo) {
        if (feedPreviewInfo.mo106110x() == null) {
            return null;
        }
        String a = feedPreviewInfo.mo106110x().mo106135a();
        if (feedPreviewInfo.mo106079i()) {
            return a;
        }
        try {
            String a2 = C59035h.m229208a(C37268c.m146766b().mo139171a(a), true);
            if (a2.length() > 80) {
                return a2.substring(0, 80);
            }
            return a2;
        } catch (Exception e) {
            Log.m165383e("FeedModule_BasePacker", "buildDraftMessage" + e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private String mo138443b(FeedPreviewInfo feedPreviewInfo) {
        Throwable th;
        Exception e;
        if (!TextUtils.isEmpty(feedPreviewInfo.mo106104r()) || feedPreviewInfo.mo106101q() != FeedCard.Type.CHAT) {
            return feedPreviewInfo.mo106104r();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Context a = C37268c.m146766b().mo139170a();
        String c = m148547c(feedPreviewInfo);
        if (TextUtils.isEmpty(c)) {
            return c;
        }
        String str = C57881t.m224604C(a) + (c + ".jpg");
        if (!C26311p.m95290j(str)) {
            Bitmap a2 = C57860r.m224569a(UIUtils.dp2px(a, 100.0f), UIUtils.dp2px(a, 100.0f), c);
            File file = new File(str);
            if (!file.exists()) {
                FileOutputStream fileOutputStream = null;
                try {
                    file.createNewFile();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        a2.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream2);
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        C26266d.m95082a(fileOutputStream2);
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            Log.m165383e("FeedModule_BasePacker", "buildAvatarKey avatarKey failed" + e.getCause() + "   " + e.getMessage());
                            C26266d.m95082a(fileOutputStream);
                            Log.m165397w("FeedModule_BasePacker", "buildAvatarKey avatarKey is empty; id= " + feedPreviewInfo.mo106098p() + "filePath = " + str + " build cost = " + (System.currentTimeMillis() - currentTimeMillis));
                            return str;
                        } catch (Throwable th2) {
                            th = th2;
                            C26266d.m95082a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        C26266d.m95082a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    Log.m165383e("FeedModule_BasePacker", "buildAvatarKey avatarKey failed" + e.getCause() + "   " + e.getMessage());
                    C26266d.m95082a(fileOutputStream);
                    Log.m165397w("FeedModule_BasePacker", "buildAvatarKey avatarKey is empty; id= " + feedPreviewInfo.mo106098p() + "filePath = " + str + " build cost = " + (System.currentTimeMillis() - currentTimeMillis));
                    return str;
                }
            }
        }
        Log.m165397w("FeedModule_BasePacker", "buildAvatarKey avatarKey is empty; id= " + feedPreviewInfo.mo106098p() + "filePath = " + str + " build cost = " + (System.currentTimeMillis() - currentTimeMillis));
        return str;
    }

    /* renamed from: d */
    private FeedPreview.MutexMarkType m148550d(FeedPreviewInfo feedPreviewInfo) {
        if (feedPreviewInfo.mo105983G() == FeedPreviewInfo.EntityStatus.UNREAD && feedPreviewInfo.mo106051c() == Chat.Type.P2P) {
            return FeedPreview.MutexMarkType.UNREAD;
        }
        if (feedPreviewInfo.mo105983G() == FeedPreviewInfo.EntityStatus.PENDING) {
            return FeedPreview.MutexMarkType.SENDING;
        }
        if (feedPreviewInfo.mo105983G() == FeedPreviewInfo.EntityStatus.FAILED) {
            return FeedPreview.MutexMarkType.FAILED;
        }
        if (m148552f(feedPreviewInfo)) {
            if (feedPreviewInfo.mo106027a()) {
                return FeedPreview.MutexMarkType.VOICE_CALL;
            }
            if (feedPreviewInfo.mo105992P() == Message.Type.VIDEO_CHAT) {
                int i = C377381.f96775a[feedPreviewInfo.mo105995S().ordinal()];
                if (i == 1) {
                    return FeedPreview.MutexMarkType.CHAT_ROOM_CARD;
                }
                if (i == 2) {
                    return FeedPreview.MutexMarkType.VIDEO_MEETING;
                }
            } else {
                switch (C377381.f96776b[feedPreviewInfo.mo105993Q().ordinal()]) {
                    case 1:
                        return FeedPreview.MutexMarkType.VC_MEETING_STARTED;
                    case 2:
                        return FeedPreview.MutexMarkType.VC_MEETING_ENDED_OVER_ONE_HOUR;
                    case 3:
                        return FeedPreview.MutexMarkType.VC_MEETING_ENDED_LESS_ONE_HOUR;
                    case 4:
                        return FeedPreview.MutexMarkType.VC_MEETING_ENDED_LESS_ONE_MINUTE;
                    case 5:
                        return FeedPreview.MutexMarkType.VC_DEFAULT_MEETING_ENDED_OVER_ONE_HOUR;
                    case 6:
                        return FeedPreview.MutexMarkType.VC_DEFAULT_MEETING_ENDED_LESS_ONE_HOUR;
                    case 7:
                        return FeedPreview.MutexMarkType.VC_DEFAULT_MEETING_ENDED_LESS_ONE_MIN;
                    case 8:
                        return FeedPreview.MutexMarkType.CHAT_ROOM_START_MESSAGE;
                    default:
                        return FeedPreview.MutexMarkType.VIDEO_MEETING;
                }
            }
        }
        if (m148551e(feedPreviewInfo)) {
            return FeedPreview.MutexMarkType.ENCRYPTED_CALL;
        }
        if (feedPreviewInfo.mo105983G() == FeedPreviewInfo.EntityStatus.READ) {
            return FeedPreview.MutexMarkType.READ;
        }
        return FeedPreview.MutexMarkType.UNKNOWN;
    }

    /* renamed from: b */
    private static String m148546b(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            int lastIndexOf = str2.lastIndexOf(" ");
            if (lastIndexOf == str2.length() - 1 || lastIndexOf == str2.length()) {
                return str2.substring(0, lastIndexOf);
            }
            return str2.substring(lastIndexOf + 1);
        } else if (TextUtils.isEmpty(str)) {
            return str;
        } else {
            return str.substring(str.length() - 1);
        }
    }

    /* renamed from: a */
    private static String m148542a(String str, String str2) {
        String a = m148543a(C37268c.m146766b().mo139189h());
        if (a.equals(Locale.CHINESE.getLanguage())) {
            return m148545b(str);
        }
        if (a.equals(Locale.ENGLISH.getLanguage())) {
            return m148546b(str, str2);
        }
        if (a.equals(Locale.JAPANESE.getLanguage())) {
            return m148541a(str);
        }
        return m148546b(str, str2);
    }

    /* renamed from: c */
    private void m148548c(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        int i;
        if (!CollectionUtils.isEmpty(feedPreviewInfo.mo105996T())) {
            int i2 = 0;
            for (Reaction reaction : feedPreviewInfo.mo105996T()) {
                i2 += reaction.getCount();
            }
            feedPreview.setReactions(feedPreviewInfo.mo105996T());
            feedPreview.setReactionCount(i2);
            if (feedPreviewInfo.mo106051c() == Chat.Type.P2P) {
                i = -1;
            } else {
                i = 3;
            }
            feedPreview.setReactionDisplayCount(i);
        }
    }

    /* renamed from: d */
    private int m148549d(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        int number;
        int i = 0;
        if (C37264a.m146754c() && !CollectionUtils.isEmpty(feedPreviewInfo.mo106080j())) {
            i = 0 | FeedPreview.MarkType.URGENT.getNumber();
        }
        FeedPreviewInfo.AtInfo y = feedPreviewInfo.mo106111y();
        if (y != null) {
            if (y.mo106117b() == FeedPreviewInfo.AtInfo.AtType.ALL) {
                number = FeedPreview.MarkType.AT_ALL.getNumber();
            } else {
                if (y.mo106117b() == FeedPreviewInfo.AtInfo.AtType.USER) {
                    number = FeedPreview.MarkType.AT_USER.getNumber();
                }
                FeedPreview.AtInfo atInfo = new FeedPreview.AtInfo(y.mo106113a(), y.mo106130h(), y.mo106120c());
                atInfo.setAtDisplayTime(y.mo106124e());
                atInfo.setAtRankTime(y.mo106127f());
                atInfo.setAtContent(y.mo106129g());
                feedPreview.setAtInfo(atInfo);
            }
            i |= number;
            FeedPreview.AtInfo atInfo2 = new FeedPreview.AtInfo(y.mo106113a(), y.mo106130h(), y.mo106120c());
            atInfo2.setAtDisplayTime(y.mo106124e());
            atInfo2.setAtRankTime(y.mo106127f());
            atInfo2.setAtContent(y.mo106129g());
            feedPreview.setAtInfo(atInfo2);
        }
        feedPreview.setMuteUrgentInfo(feedPreviewInfo.mo106112z());
        feedPreview.setAtInfoCount(feedPreviewInfo.mo105977A());
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<T> mo138437a(FeedCard.Type type, List<FeedPreviewInfo> list) {
        int i = 0;
        for (FeedPreviewInfo feedPreviewInfo : list) {
            if (feedPreviewInfo.mo106101q() == type) {
                i++;
            }
        }
        if (i == 0) {
            return null;
        }
        C37739a.f96777a.mo138440a();
        ArrayList arrayList = new ArrayList(i);
        for (FeedPreviewInfo feedPreviewInfo2 : list) {
            if (feedPreviewInfo2.mo106101q() == type) {
                arrayList.add(mo138436a(feedPreviewInfo2));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138438a(FeedPreview feedPreview, FeedPreviewInfo feedPreviewInfo) {
        feedPreview.setId(feedPreviewInfo.mo106098p());
        feedPreview.setFeedType(feedPreviewInfo.mo106109w());
        feedPreview.setType(feedPreviewInfo.mo106101q());
        feedPreview.setDisplayTime(feedPreviewInfo.mo106089m() * 1000);
        feedPreview.setUpdateTime(feedPreviewInfo.mo106095o());
        feedPreview.setRankTime(feedPreviewInfo.mo106092n());
        feedPreview.setName(feedPreviewInfo.mo106105s());
        feedPreview.setAvatarKey(mo138443b(feedPreviewInfo));
        feedPreview.setAvatarId(feedPreviewInfo.ah());
        feedPreview.setUnreadCount(feedPreviewInfo.mo106106t());
        feedPreview.setRemind(feedPreviewInfo.mo106107u());
        feedPreview.setLastMessageId(feedPreviewInfo.aa());
        feedPreview.setShortCut(feedPreviewInfo.mo106108v());
        feedPreview.setMutexMarkType(m148550d(feedPreviewInfo));
        feedPreview.setMarkType(m148549d(feedPreview, feedPreviewInfo));
        feedPreview.setDelayed(feedPreviewInfo.mo105982F());
        feedPreview.setParentCardId(feedPreviewInfo.mo105986J());
        feedPreview.setOfflineOncall(feedPreviewInfo.mo105999W());
        feedPreview.setLastMessagePosition(feedPreviewInfo.mo105991O());
        feedPreview.setTranslateEmojiCode(feedPreviewInfo.af());
        feedPreview.setDraftMessage(m148553g(feedPreviewInfo));
        feedPreview.setCrossTenant(feedPreviewInfo.mo105984H());
        feedPreview.setSimpleTenant(C37739a.f96777a.f96779c);
        feedPreview.setCustomer(C37739a.f96777a.f96780d);
        m148548c(feedPreview, feedPreviewInfo);
        mo138439b(feedPreview, feedPreviewInfo);
        feedPreview.setTeamName(feedPreviewInfo.am());
        feedPreview.setTeamChatType(feedPreviewInfo.an());
        feedPreview.setCustomStatusIconKey(feedPreviewInfo.ap());
    }
}
