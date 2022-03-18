package com.ss.android.lark.chat.service.impl;

import android.app.Application;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.Location;
import com.bytedance.lark.pb.basic.v1.LocationContent;
import com.bytedance.lark.pb.basic.v1.MediaContent;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.basic.v1.QuasiContent;
import com.bytedance.lark.pb.im.v1.CreateQuasiMessageRequest;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UriCompatUtil;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Message;
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
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57337z;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import okio.ByteString;

/* renamed from: com.ss.android.lark.chat.service.impl.s */
public class C34258s {

    /* renamed from: a */
    private static C34274u<Message.Type, AbstractC33998f, QuasiContent.C15137a> f88557a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.s$h */
    public static class C34267h<T extends AbstractC33998f> implements C34274u.AbstractC34275a<Message.Type, T> {
        private C34267h() {
        }

        /* renamed from: a */
        public Message.Type mo126796a(T t) {
            return t.f87822o;
        }
    }

    /* renamed from: a */
    public static synchronized C34274u<Message.Type, AbstractC33998f, QuasiContent.C15137a> m132916a() {
        C34274u<Message.Type, AbstractC33998f, QuasiContent.C15137a> uVar;
        synchronized (C34258s.class) {
            if (f88557a == null) {
                C34274u<Message.Type, AbstractC33998f, QuasiContent.C15137a> uVar2 = new C34274u<>(new C34267h());
                f88557a = uVar2;
                uVar2.mo126823a(Message.Type.TEXT, new C34272m());
                f88557a.mo126823a(Message.Type.AUDIO, new C34260a());
                f88557a.mo126823a(Message.Type.IMAGE, new C34264e());
                f88557a.mo126823a(Message.Type.POST, new C34268i());
                f88557a.mo126823a(Message.Type.STICKER, new C34271l());
                f88557a.mo126823a(Message.Type.FILE, new C34263d());
                f88557a.mo126823a(Message.Type.SHARE_GROUP_CHAT, new C34270k());
                f88557a.mo126823a(Message.Type.MEDIA, new C34266g());
                f88557a.mo126823a(Message.Type.CARD, new C34262c());
                f88557a.mo126823a(Message.Type.LOCATION, new C34265f());
                f88557a.mo126823a(Message.Type.SHARE_USER_CARD, new C34269j());
            }
            uVar = f88557a;
        }
        return uVar;
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$c */
    public static class C34262c extends AbstractC34261b<C34117a> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C34117a aVar) {
            this.f88558a.mo60980a(Message.Type.CARD);
            this.f88559b.mo55172a(C29990c.m110930b().mo134589q().mo134419a(aVar.f88299a));
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$j */
    public static class C34269j extends AbstractC34261b<C34000h> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C34000h hVar) {
            this.f88558a.mo60980a(Message.Type.SHARE_USER_CARD);
            this.f88559b.mo55198l(hVar.f87831a).build();
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$k */
    public static class C34270k extends AbstractC34261b<C34001i> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C34001i iVar) {
            this.f88558a.mo60980a(Message.Type.SHARE_GROUP_CHAT);
            this.f88559b.mo55190d(iVar.f87832a);
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$m */
    public static class C34272m extends AbstractC34261b<C34003k> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C34003k kVar) {
            this.f88558a.mo60980a(Message.Type.TEXT).mo60990f(kVar.f87821n);
            this.f88559b.mo55176a(C57337z.m222241a(kVar.f87838a));
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$i */
    public static class C34268i extends AbstractC34261b<C33999g> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C33999g gVar) {
            this.f88558a.mo60980a(Message.Type.POST).mo60990f(gVar.f87821n);
            this.f88559b.mo55180a(gVar.f87828a).mo55183b(Boolean.valueOf(gVar.f87830c)).mo55176a(C57337z.m222241a(gVar.f87829b));
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$l */
    public static class C34271l extends AbstractC34261b<C34002j> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C34002j jVar) {
            this.f88558a.mo60980a(Message.Type.STICKER);
            this.f88559b.mo55191e(jVar.f87833a).mo55184b(Integer.valueOf(jVar.f87834b)).mo55188c(Integer.valueOf(jVar.f87835c)).mo55196j(jVar.f87836d).mo55197k(jVar.f87837e).build();
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$a */
    public static class C34260a extends AbstractC34261b<C33993a> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C33993a aVar) {
            byte[] bArr;
            byte[] bArr2;
            this.f88558a.mo60980a(Message.Type.AUDIO);
            this.f88558a.mo60989e(aVar.f87789c);
            if (!TextUtils.isEmpty(aVar.f87787a)) {
                bArr = C26311p.m95276a(aVar.f87787a);
            } else {
                bArr = null;
            }
            QuasiContent.C15137a aVar2 = this.f88559b;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = new byte[0];
            }
            aVar2.mo55187b(ByteString.of(bArr2)).mo55178a(Integer.valueOf(aVar.f87788b)).mo55191e(aVar.f87790d).mo55186b(aVar.f87791e);
            if (bArr == null) {
                Log.m165382e("audio message is empty, path:" + aVar.f87787a);
            }
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$e */
    public static class C34264e extends AbstractC34261b<C33995c> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C33995c cVar) {
            byte[] bArr;
            this.f88558a.mo60980a(Message.Type.IMAGE).mo60990f(cVar.f87821n);
            byte[] a = C26311p.m95276a(cVar.f87799a);
            QuasiContent.C15137a aVar = this.f88559b;
            if (a != null) {
                bArr = a;
            } else {
                bArr = new byte[0];
            }
            aVar.mo55181a(ByteString.of(bArr)).mo55184b(Integer.valueOf(cVar.f87800b)).mo55188c(Integer.valueOf(cVar.f87801c)).mo55177a(Boolean.valueOf(cVar.f87803e)).build();
            if (a == null) {
                Log.m165382e("audio message is empty, path:" + cVar.f87799a);
            }
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$g */
    public static class C34266g extends AbstractC34261b<C33997e> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C33997e eVar) {
            this.f88558a.mo60980a(Message.Type.MEDIA);
            byte[] a = C26311p.m95276a(eVar.f87808a);
            if (a == null) {
                a = new byte[0];
            }
            this.f88559b.mo55181a(ByteString.of(a)).mo55184b(Integer.valueOf(eVar.f87809b)).mo55188c(Integer.valueOf(eVar.f87810c)).mo55189c(eVar.f87814g).mo55195i(eVar.f87815h).mo55175a(MediaContent.Source.fromValue(eVar.f87811d.getNumber())).mo55193g(eVar.f87812e).mo55192f(eVar.f87813f).mo55178a(Integer.valueOf((int) eVar.f87816i)).mo55179a(Long.valueOf(eVar.f87817j));
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$f */
    public static class C34265f extends AbstractC34261b<C33996d> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C33996d dVar) {
            this.f88558a.mo60980a(Message.Type.LOCATION);
            LocationContent a = new LocationContent.C15039a().mo54953a(dVar.f87804a.getLongitude()).mo54955b(dVar.f87804a.getLatitude()).mo54952a(Integer.valueOf(dVar.f87804a.getZoomLevel())).mo54956c(dVar.f87804a.getVendor()).mo54951a(Boolean.valueOf(dVar.f87804a.isInternal())).mo54950a(new Location.C15037a().mo54944a(dVar.f87804a.getLocationDescription().getName()).mo54946b(dVar.f87804a.getLocationDescription().getDescription()).build()).build();
            byte[] a2 = C26311p.m95276a(dVar.f87805b);
            QuasiContent.C15137a aVar = this.f88559b;
            if (a2 == null) {
                a2 = new byte[0];
            }
            aVar.mo55181a(ByteString.of(a2)).mo55184b(Integer.valueOf(dVar.f87806c)).mo55188c(Integer.valueOf(dVar.f87807d)).mo55174a(a).build();
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$d */
    public static class C34263d extends AbstractC34261b<C33994b> {
        /* renamed from: a */
        public QuasiContent.C15137a mo126569a(C33994b bVar) {
            this.f88558a.mo60980a(Message.Type.FILE).mo60990f(bVar.f87821n);
            if (bVar.f87794c != 2) {
                String str = bVar.f87793b;
                if (!TextUtils.isEmpty(str)) {
                    this.f88559b.mo55192f(str.replaceAll("\n", "-"));
                }
                if (!TextUtils.isEmpty(bVar.f87792a)) {
                    this.f88559b.mo55189c(bVar.f87792a);
                    return this.f88559b;
                }
                Uri uri = bVar.f87798g;
                if (uri == null) {
                    Log.m165383e("FileRequestTransformer", "uri is null");
                    return this.f88559b;
                }
                this.f88559b.mo55194h(uri.toString());
                Application application = LarkContext.getApplication();
                if (application == null) {
                    Log.m165383e("FileRequestTransformer", "context is null");
                    return this.f88559b;
                }
                try {
                    ParcelFileDescriptor openFileDescriptor = application.getContentResolver().openFileDescriptor(uri, "r");
                    if (openFileDescriptor != null) {
                        long detachFd = (long) openFileDescriptor.detachFd();
                        Log.m165389i("FileRequestTransformer", "get fd success:" + detachFd);
                        this.f88559b.mo55185b(Long.valueOf(detachFd));
                    } else {
                        Log.m165383e("FileRequestTransformer", "pfd is null for uri: " + uri);
                    }
                } catch (Exception e) {
                    Log.m165384e("FileRequestTransformer", "get fd failed", e);
                }
                if (this.f88559b.f40151w == null) {
                    try {
                        File a = UriCompatUtil.m95039a(application, uri);
                        if (a == null || !a.exists()) {
                            Log.m165383e("FileRequestTransformer", "failed to get file path for uri: " + uri);
                        } else {
                            this.f88559b.mo55189c(a.getAbsolutePath());
                        }
                    } catch (Exception e2) {
                        Log.m165383e("FileRequestTransformer", "failed to get file path: " + e2.getMessage());
                    }
                }
            } else {
                this.f88559b.mo55191e(bVar.f87795d).mo55192f(bVar.f87793b).mo55193g(bVar.f87797f).mo55179a(Long.valueOf(bVar.f87796e)).mo55173a(File.Source.NUT_STORE);
            }
            return this.f88559b;
        }
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.s$b */
    public static abstract class AbstractC34261b<T extends AbstractC33998f> implements AbstractC34126g<T, QuasiContent.C15137a> {

        /* renamed from: a */
        CreateQuasiMessageRequest.C17374a f88558a;

        /* renamed from: b */
        QuasiContent.C15137a f88559b;

        /* renamed from: a */
        public void mo126809a(CreateQuasiMessageRequest.C17374a aVar, QuasiContent.C15137a aVar2) {
            this.f88558a = aVar;
            this.f88559b = aVar2;
        }
    }

    /* renamed from: a */
    public static QuasiContent.C15137a m132915a(AbstractC33998f fVar, CreateQuasiMessageRequest.C17374a aVar, QuasiContent.C15137a aVar2) {
        AbstractC34126g<AbstractC33998f, QuasiContent.C15137a> b = m132916a().mo126824b(fVar);
        ((AbstractC34261b) b).mo126809a(aVar, aVar2);
        b.mo126569a(fVar);
        return aVar2;
    }
}
