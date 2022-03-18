package com.ss.android.lark.chat.service.impl;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.C29599ac;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29613e;
import com.ss.android.lark.biz.im.api.C29629v;
import com.ss.android.lark.biz.im.api.C29631w;
import com.ss.android.lark.biz.im.api.C29634z;
import com.ss.android.lark.biz.im.api.p1409b.C29609a;
import com.ss.android.lark.chat.api.service.p1597a.p1598a.p1599a.C32817a;
import com.ss.android.lark.chat.entity.message.AbstractC34011b;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.p1669a.C34007a;
import com.ss.android.lark.chat.entity.message.p1669a.C34009b;
import com.ss.android.lark.chat.entity.p1668h.AbstractC33998f;
import com.ss.android.lark.chat.entity.p1668h.C33993a;
import com.ss.android.lark.chat.entity.p1668h.C33994b;
import com.ss.android.lark.chat.entity.p1668h.C33995c;
import com.ss.android.lark.chat.entity.p1668h.C33996d;
import com.ss.android.lark.chat.entity.p1668h.C33997e;
import com.ss.android.lark.chat.entity.p1668h.C33999g;
import com.ss.android.lark.chat.entity.p1668h.C34000h;
import com.ss.android.lark.chat.entity.p1668h.C34001i;
import com.ss.android.lark.chat.entity.p1668h.C34002j;
import com.ss.android.lark.chat.entity.p1668h.C34003k;
import com.ss.android.lark.chat.service.AbstractC34126g;
import com.ss.android.lark.chat.service.impl.C34274u;
import com.ss.android.lark.chat.service.p1678a.p1679a.C34117a;
import com.ss.android.lark.dto.p1816e.C36872a;
import com.ss.android.lark.image.entity.C38826d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.statistics.PerfLog;
import java.io.File;

/* renamed from: com.ss.android.lark.chat.service.impl.q */
public class C34238q {

    /* renamed from: a */
    private static C34274u<Message.Type, AbstractC34011b, AbstractC33998f> f88543a;

    /* renamed from: com.ss.android.lark.chat.service.impl.q$b */
    private static abstract class AbstractC34241b<P extends AbstractC34011b, R extends AbstractC33998f> implements AbstractC34126g<P, R> {
        /* renamed from: a */
        public abstract R mo126788a(P p);

        private AbstractC34241b() {
        }

        /* renamed from: b */
        public final R mo126569a(P p) {
            R a = mo126788a((AbstractC34011b) p);
            a.f87822o = p.f87861o;
            a.f87824q = p.f87863q;
            a.f87823p = p.f87862p;
            a.f87820m = p.f87859m;
            a.f87821n = p.f87860n;
            a.f87819l = p.f87858l;
            a.f87818k = p.f87857k;
            a.f87825r = p.f87864r;
            a.f87826s = p.f87866t;
            a.f87827t = p.f87867u;
            return a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$h */
    public static class C34247h<T extends AbstractC34011b> implements C34274u.AbstractC34275a<Message.Type, T> {
        private C34247h() {
        }

        /* renamed from: a */
        public Message.Type mo126796a(T t) {
            return t.f87861o;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$a */
    public static class C34240a extends AbstractC34241b<C34007a, C33993a> {
        private C34240a() {
            super();
        }

        /* renamed from: a */
        public C33993a mo126788a(C34007a aVar) {
            return new C33993a(aVar.f87843a, aVar.f87844b, aVar.f87846d, aVar.f87847e, aVar.f87848f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$c */
    public static class C34242c extends AbstractC34241b<C36872a, C34117a> {
        private C34242c() {
            super();
        }

        /* renamed from: a */
        public C34117a mo126788a(C36872a aVar) {
            return new C34117a(aVar.f94795a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$d */
    public static class C34243d extends AbstractC34241b<C29613e, C33994b> {
        private C34243d() {
            super();
        }

        /* renamed from: a */
        public C33994b mo126788a(C29613e eVar) {
            String str = eVar.f74225b;
            if (str == null) {
                str = eVar.f74224a;
            }
            return new C33994b(str, eVar.f74226c, eVar.f74227d, eVar.f74228e, eVar.f74229f, eVar.f74230g, eVar.f74233j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$e */
    public static class C34244e extends AbstractC34241b<C29629v, C33995c> {
        private C34244e() {
            super();
        }

        /* renamed from: a */
        public C33995c mo126788a(C29629v vVar) {
            return new C33995c(vVar.f74264a, vVar.f74265b, vVar.f74266c, vVar.f74267d, vVar.f74268e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$f */
    public static class C34245f extends AbstractC34241b<C32817a, C33996d> {
        private C34245f() {
            super();
        }

        /* renamed from: a */
        public C33996d mo126788a(C32817a aVar) {
            return C33996d.m131837a(aVar.f84249a, aVar.f84250b, aVar.f84251c, aVar.f84252d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$g */
    public static class C34246g extends AbstractC34241b<C29631w, C33997e> {
        private C34246g() {
            super();
        }

        /* renamed from: b */
        private void m132873b(C29631w wVar) {
            if (TextUtils.isEmpty(wVar.f74276c) || wVar.f74275b <= 0 || wVar.f74274a <= 0) {
                if (TextUtils.isEmpty(wVar.f74276c)) {
                    wVar.f74276c = "video/mp4";
                }
                if (wVar.f74275b == 0) {
                    wVar.f74275b = wVar.f74277d.length();
                }
                if (wVar.f74274a == 0) {
                    wVar.f74274a = (long) ao.m224311b(wVar.f74277d.getAbsolutePath()).duration;
                }
            }
        }

        /* renamed from: a */
        public C33997e mo126788a(C29631w wVar) {
            boolean z;
            File file;
            int i;
            int i2;
            String str;
            m132873b(wVar);
            PerfLog.start("get_first_frame", wVar.f87868v, "");
            if (wVar.f74278e != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && wVar.f74278e.exists()) {
                file = wVar.f74278e;
            } else {
                file = wVar.f74277d;
            }
            String absolutePath = file.getAbsolutePath();
            String a = new C38826d(absolutePath).mo142328a(C29990c.m110930b().mo134528a());
            if (new File(a).exists()) {
                int[] b = C57820d.m224436b(a);
                i2 = Math.max(b[0], 0);
                int max = Math.max(b[1], 0);
                Log.m165389i("MessageDtoTransformer", "get cache video first frame：" + a);
                i = max;
                str = a;
            } else {
                Bitmap d = ao.m224315d(absolutePath);
                if (d != null) {
                    String a2 = C26311p.m95265a(d, a);
                    int height = d.getHeight();
                    i2 = d.getWidth();
                    str = a2;
                    i = height;
                } else {
                    Log.m165382e("Get video first frame failed，messageId:" + wVar.f87860n);
                    str = "";
                    i2 = 0;
                    i = 0;
                }
            }
            PerfLog.end("get_first_frame", wVar.f87868v, "");
            return new C33997e(str, i2, i, wVar.f74281h, wVar.f74276c, file.getName(), absolutePath, wVar.f74279f, wVar.f74274a, wVar.f74275b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$i */
    public static class C34248i extends AbstractC34241b<C29609a, C33999g> {
        private C34248i() {
            super();
        }

        /* renamed from: a */
        public C33999g mo126788a(C29609a aVar) {
            return new C33999g(aVar.f74214a, aVar.f74215b, aVar.f74217d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$j */
    public static class C34249j extends AbstractC34241b<C29634z, C34000h> {
        private C34249j() {
            super();
        }

        /* renamed from: a */
        public C34000h mo126788a(C29634z zVar) {
            return C34000h.m131838a(zVar.f74293a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$k */
    public static class C34250k extends AbstractC34241b<C29599ac, C34001i> {
        private C34250k() {
            super();
        }

        /* renamed from: a */
        public C34001i mo126788a(C29599ac acVar) {
            return new C34001i(acVar.f74170a.getId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$l */
    public static class C34251l extends AbstractC34241b<C34009b, C34002j> {
        private C34251l() {
            super();
        }

        /* renamed from: a */
        public C34002j mo126788a(C34009b bVar) {
            return new C34002j(bVar.f87855a.key, bVar.f87855a.width, bVar.f87855a.height, bVar.f87855a.stickerSetId, bVar.f87855a.stickerId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.q$m */
    public static class C34252m extends AbstractC34241b<C29601ad, C34003k> {
        private C34252m() {
            super();
        }

        /* renamed from: a */
        public C34003k mo126788a(C29601ad adVar) {
            return new C34003k(adVar.f74172a);
        }
    }

    /* renamed from: a */
    public static synchronized C34274u<Message.Type, AbstractC34011b, AbstractC33998f> m132859a() {
        C34274u<Message.Type, AbstractC34011b, AbstractC33998f> uVar;
        synchronized (C34238q.class) {
            if (f88543a == null) {
                C34274u<Message.Type, AbstractC34011b, AbstractC33998f> uVar2 = new C34274u<>(new C34247h());
                f88543a = uVar2;
                uVar2.mo126823a(Message.Type.TEXT, new C34252m());
                f88543a.mo126823a(Message.Type.AUDIO, new C34240a());
                f88543a.mo126823a(Message.Type.IMAGE, new C34244e());
                f88543a.mo126823a(Message.Type.POST, new C34248i());
                f88543a.mo126823a(Message.Type.STICKER, new C34251l());
                f88543a.mo126823a(Message.Type.FILE, new C34243d());
                f88543a.mo126823a(Message.Type.SHARE_GROUP_CHAT, new C34250k());
                f88543a.mo126823a(Message.Type.MEDIA, new C34246g());
                f88543a.mo126823a(Message.Type.CARD, new C34242c());
                f88543a.mo126823a(Message.Type.LOCATION, new C34245f());
                f88543a.mo126823a(Message.Type.SHARE_USER_CARD, new C34249j());
            }
            uVar = f88543a;
        }
        return uVar;
    }

    /* renamed from: a */
    public static AbstractC33998f m132858a(AbstractC34011b bVar) {
        return m132859a().mo126825c(bVar);
    }
}
