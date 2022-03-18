package com.ss.android.lark.feed.app.model.p1863c;

import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.utils.LarkContext;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.app.model.c.c */
public class C37712c {

    /* renamed from: a */
    private static final Map<String, String> f96669a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Options f96670b;

    /* renamed from: b */
    public static void m148280b() {
        f96669a.clear();
    }

    /* renamed from: c */
    private static Options m148281c() {
        if (f96670b == null) {
            m148277a();
        }
        return f96670b;
    }

    /* renamed from: a */
    public static synchronized void m148277a() {
        boolean z;
        synchronized (C37712c.class) {
            if (C37262a.m146726a().mo139203v().mo139302e() == 1) {
                z = true;
            } else {
                z = false;
            }
            Options aVar = f96670b;
            if (aVar == null || aVar.mo191608h() != z) {
                Options aVar2 = new Options();
                aVar2.mo191592a(DisplayPattern.RELATIVE);
                aVar2.mo191593a(LengthType.SHORT);
                aVar2.mo191594a(TimePreciseness.MINUTE);
                aVar2.mo191603d(true);
                aVar2.mo191599b(z);
                f96670b = aVar2;
                m148280b();
            }
        }
    }

    /* renamed from: a */
    public static String m148276a(long j) {
        if (j == 0) {
            return "";
        }
        return TimeFormatUtils.m219292g(LarkContext.getApplication(), new Date(j), m148281c());
    }

    /* renamed from: b */
    public static String m148279b(UIFeedCard uIFeedCard) {
        Map<String, String> map = f96669a;
        String str = map.get(uIFeedCard.getId());
        if (str != null) {
            return str;
        }
        String a = m148276a(uIFeedCard.getDisplayTime());
        map.put(uIFeedCard.getId(), a);
        return a;
    }

    /* renamed from: a */
    public static void m148278a(UIFeedCard uIFeedCard) {
        f96669a.put(uIFeedCard.getId(), m148276a(uIFeedCard.getDisplayTime()));
    }
}
