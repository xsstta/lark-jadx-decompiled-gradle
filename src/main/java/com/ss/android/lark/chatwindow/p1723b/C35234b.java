package com.ss.android.lark.chatwindow.p1723b;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.AbstractC32905i;
import com.ss.android.lark.chat.api.service.AbstractC32906j;
import com.ss.android.lark.chat.service.impl.C34146aa;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.newemoji.EmojiMapManager;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.chatwindow.b.b */
public class C35234b implements AbstractC32905i {

    /* renamed from: a */
    private static final String[] f90989a = {"MUSCLE", "APPLAUSE", "OK", "THUMBSUP", "HEART", "JIAYI", "DONE", "BLUSH", "FACEPALM"};

    /* renamed from: b */
    private final String[] f90990b;

    /* renamed from: c */
    private final ExecutorService f90991c;

    /* renamed from: d */
    private volatile List<String> f90992d;

    /* renamed from: e */
    private final AbstractC32906j f90993e;

    /* renamed from: f */
    private final List<String> f90994f;

    /* renamed from: g */
    private AbstractC36450aa.AbstractC36451a f90995g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chatwindow.b.b$a */
    public static class C35236a {

        /* renamed from: a */
        public static final C35234b f90996a = new C35234b();
    }

    /* renamed from: e */
    public static C35234b m137579e() {
        return C35236a.f90996a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m137585l() {
        this.f90994f.clear();
        m137580g();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Boolean m137583j() {
        mo129693a(this.f90993e.mo121406a(false));
        return true;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32905i
    /* renamed from: a */
    public void mo121399a() {
        this.f90991c.execute(new Runnable() {
            /* class com.ss.android.lark.chatwindow.p1723b.$$Lambda$b$Jo6ZW1BWmqR10gJFDKk6eSJw0 */

            public final void run() {
                C35234b.this.m137584k();
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32905i
    /* renamed from: c */
    public synchronized List<String> mo121403c() {
        m137578c(this.f90994f);
        return this.f90994f;
    }

    /* renamed from: g */
    private void m137580g() {
        this.f90994f.addAll(new ArrayList(Arrays.asList(this.f90990b)));
        this.f90991c.execute(new Runnable() {
            /* class com.ss.android.lark.chatwindow.p1723b.$$Lambda$b$YY5cdT2NSMxdwfnA_AOWTbVDwE */

            public final void run() {
                C35234b.this.m137582i();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m137582i() {
        List<String> a = C34146aa.m132620b().mo121405a();
        if (!CollectionUtils.isEmpty(a)) {
            synchronized (this) {
                this.f90994f.clear();
                this.f90994f.addAll(a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m137584k() {
        mo129693a(this.f90993e.mo121406a(true));
        mo129693a(this.f90993e.mo121406a(false));
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32905i
    /* renamed from: b */
    public List<String> mo121402b() {
        m137578c(this.f90992d);
        if (this.f90992d.size() <= 6) {
            return this.f90992d;
        }
        return this.f90992d.subList(0, 6);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32905i
    /* renamed from: d */
    public List<String> mo121404d() {
        m137578c(this.f90992d);
        if (this.f90992d != null) {
            return this.f90992d;
        }
        return new ArrayList();
    }

    /* renamed from: f */
    public void mo129694f() {
        this.f90992d = new ArrayList();
        this.f90992d.addAll(Arrays.asList(f90989a));
    }

    private C35234b() {
        this.f90990b = new String[]{"OK", "THUMBSUP", "THANKS", "MUSCLE", "FINGERHEART", "APPLAUSE", "FISTBUMP", "JIAYI", "DONE", "SMILE", "BLUSH", "LAUGH", "SMIRK", "LOL", "FACEPALM", "LOVE", "WINK", "PROUD", "WITTY", "SMART", "SCOWL", "THINKING", "SOB", "CRY", "ERROR", "NOSEPICK", "HAUGHTY", "SLAP", "SPITBLOOD", "TOASTED", "BLACKFACE", "GLANCE", "DULL", "ROSE", "HEART", "PARTY", "INNOCENTSMILE", "SHY", "CHUCKLE", "JOYFUL", "WOW", "TRICK", "YEAH", "ENOUGH", "TEARS", "EMBARRASSED", "KISS", "SMOOCH", "DROOL", "OBSESSED", "MONEY", "TEASE", "SHOWOFF", "COMFORT", "CLAP", "PRAISE", "STRIVE", "XBLUSH", "SILENT", "WAVE", "EATING", "WHAT", "FROWN", "DULLSTARE", "DIZZY", "LOOKDOWN", "WAIL", "CRAZY", "WHIMPER", "HUG", "BLUBBER", "WRONGED", "HUSKY", "SHHH", "SMUG", "ANGRY", "HAMMER", "SHOCKED", "TERROR", "PETRIFIED", "SKULL", "SWEAT", "SPEECHLESS", "SLEEP", "DROWSY", "YAWN", "SICK", "PUKE", "BIGKISS", "BETRAYED", "HEADSET", "DONNOTGO", "EatingFood", "Typing", "Lemon", "Get", "LGTM", "SALUTE", "SHAKE", "HIGHFIVE", "UPPERLEFT", "ThumbsDown", "SLIGHT", "TONGUE", "EYESCLOSED", "BEAR", "BULL", "CALF", "LIPS", "BEER", "CAKE", "GIFT", "CUCUMBER", "Drumstick", "Pepper", "CANDIEDHAWS", "BubbleTea", "Coffee", "Yes", "No", "OKR", "CheckMark", "CrossMark", "MinusOne", "Hundred", "2​021", "AWESOMEN", "Pin", "Alarm", "Loudspeaker", "Trophy", "Fire", "RAINBOWPUKE", "Music", "FIREWORKS", "REDPACKET", "FORTUNE", "LUCK", "FIRECRACKER", "HEARTBROKEN", "BOMB", "POOP", "18X", "CLEAVER"};
        this.f90994f = new ArrayList();
        this.f90995g = new AbstractC36450aa.AbstractC36451a() {
            /* class com.ss.android.lark.chatwindow.p1723b.$$Lambda$b$SMImRCIERgHIKrPgUnFw_b9xl0g */

            @Override // com.ss.android.lark.dependency.AbstractC36450aa.AbstractC36451a
            public final void onAccountChange() {
                C35234b.this.m137585l();
            }
        };
        this.f90991c = CoreThreadPool.getDefault().getCachedThreadPool();
        this.f90993e = C34146aa.m132620b();
        mo129694f();
        m137580g();
        C29990c.m110930b().mo134515N().mo134397a(this.f90995g);
    }

    /* renamed from: b */
    private boolean m137577b(List<String> list) {
        return CollectionUtils.isEmpty(list);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32905i
    /* renamed from: a */
    public void mo121400a(IGetDataCallback<Boolean> iGetDataCallback) {
        $$Lambda$b$0K0z2i1F6oZVFiYsAXpOfauMO8c r0 = new C57865c.AbstractC57873d() {
            /* class com.ss.android.lark.chatwindow.p1723b.$$Lambda$b$0K0z2i1F6oZVFiYsAXpOfauMO8c */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
            public final Object produce() {
                return C35234b.this.m137583j();
            }
        };
        iGetDataCallback.getClass();
        C57865c.m224574a(r0, new C57865c.AbstractC57871b() {
            /* class com.ss.android.lark.chatwindow.p1723b.$$Lambda$TGu9AXOT_jQ2JIhbC97YPyNCNlM */

            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
            public final void consume(Object obj) {
                IGetDataCallback.this.onSuccess((Boolean) obj);
            }
        });
    }

    /* renamed from: c */
    private void m137578c(List<String> list) {
        if (!CollectionUtils.isEmpty(list)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (EmojiMapManager.f136337c.mo188268a(it.next())) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32905i
    /* renamed from: a */
    public synchronized void mo121401a(String str) {
        ArrayList arrayList = new ArrayList(this.f90992d);
        if (arrayList.contains(str)) {
            arrayList.remove(str);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
        arrayList.add(0, str);
        mo129693a(arrayList);
    }

    /* renamed from: a */
    public synchronized void mo129693a(List<String> list) {
        if (!m137577b(list)) {
            if (!m137576a(this.f90992d, list)) {
                this.f90992d = new ArrayList(list);
            }
        }
    }

    /* renamed from: a */
    private boolean m137576a(List<String> list, List<String> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!C26325y.m95335a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
