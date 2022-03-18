package com.ss.android.vc.common.widget.avatarlist;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.avatarlist.C60835a;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteViewUserInfo;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.entity.VCParticipantAbbrInfo;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.common.widget.avatarlist.a */
public class C60835a {

    /* renamed from: com.ss.android.vc.common.widget.avatarlist.a$b */
    public static class C60839b {

        /* renamed from: a */
        public C60838a f152260a;

        /* renamed from: b */
        public ArrayList<C60840c> f152261b;

        public C60839b() {
        }

        /* renamed from: a */
        public void mo208628a(List<VCParticipantAbbrInfo> list, int i) {
            this.f152260a = new C60838a(list, i);
            this.f152261b = new ArrayList<>();
        }

        public C60839b(List<Participant> list, int i) {
            C60838a aVar = new C60838a();
            this.f152260a = aVar;
            aVar.mo208627a(list, i);
            this.f152261b = new ArrayList<>();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.common.widget.avatarlist.a$a */
    public static class C60838a {

        /* renamed from: a */
        public ArrayList<String> f152254a = new ArrayList<>();

        /* renamed from: b */
        public ArrayList<String> f152255b = new ArrayList<>();

        /* renamed from: c */
        public ArrayList<String> f152256c = new ArrayList<>();

        /* renamed from: d */
        public Map<String, ParticipantType> f152257d = new HashMap();

        /* renamed from: e */
        public ArrayList<String> f152258e = new ArrayList<>();

        /* renamed from: f */
        public HashMap<String, C60840c> f152259f = new HashMap<>();

        C60838a() {
        }

        /* renamed from: a */
        public int mo208626a() {
            int i;
            int i2;
            int i3;
            int i4;
            ArrayList<String> arrayList = this.f152254a;
            int i5 = 0;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            ArrayList<String> arrayList2 = this.f152255b;
            if (arrayList2 != null) {
                i2 = arrayList2.size();
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            ArrayList<String> arrayList3 = this.f152256c;
            if (arrayList3 != null) {
                i3 = arrayList3.size();
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            Map<String, ParticipantType> map = this.f152257d;
            if (map != null) {
                i4 = map.size();
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            ArrayList<String> arrayList4 = this.f152258e;
            if (arrayList4 != null) {
                i5 = arrayList4.size();
            }
            return i8 + i5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo208627a(List<Participant> list, int i) {
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Participant participant = list.get(i2);
                    if (participant != null && !TextUtils.isEmpty(participant.getId())) {
                        if (participant.getParticipantType() == ParticipantType.LARK_USER && !this.f152254a.contains(participant.getId())) {
                            this.f152254a.add(participant.getId());
                        } else if (participant.getParticipantType() == ParticipantType.ROOM && !this.f152255b.contains(participant.getId())) {
                            this.f152255b.add(participant.getId());
                        } else if (participant.getParticipantType() == ParticipantType.NEO_USER && !this.f152256c.contains(participant.getId())) {
                            this.f152256c.add(participant.getId());
                        } else if (participant.getParticipantType().isNewType() && !this.f152257d.containsKey(participant.getId())) {
                            this.f152257d.put(participant.getId(), participant.getParticipantType());
                        } else if (participant.getParticipantType().isUnknownType() && !this.f152258e.contains(participant.getId())) {
                            this.f152258e.add(participant.getId());
                        }
                        if (i != -1 && mo208626a() == i) {
                            return;
                        }
                    }
                }
            }
        }

        C60838a(List<VCParticipantAbbrInfo> list, int i) {
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    VCParticipantAbbrInfo tVar = list.get(i2);
                    if (tVar != null && !TextUtils.isEmpty(tVar.mo210170b().getUserId())) {
                        if (tVar.mo210170b().getParticipantType() == ParticipantType.LARK_USER && !this.f152254a.contains(tVar.mo210170b().getUserId())) {
                            this.f152254a.add(tVar.mo210170b().getUserId());
                        } else if (tVar.mo210170b().getParticipantType() == ParticipantType.ROOM && !this.f152255b.contains(tVar.mo210170b().getUserId())) {
                            this.f152255b.add(tVar.mo210170b().getUserId());
                        } else if (tVar.mo210170b().getParticipantType() == ParticipantType.NEO_USER && !this.f152256c.contains(tVar.mo210170b().getUserId())) {
                            this.f152256c.add(tVar.mo210170b().getUserId());
                        } else if (tVar.mo210170b().getParticipantType().isNewType() && !this.f152257d.containsKey(tVar.mo210170b().getUserId())) {
                            this.f152257d.put(tVar.mo210170b().getUserId(), tVar.mo210170b().getParticipantType());
                        } else if (tVar.mo210170b().getParticipantType().isUnknownType() && !this.f152258e.contains(tVar.mo210170b().getUserId())) {
                            this.f152258e.add(tVar.mo210170b().getUserId());
                        }
                        if (i != -1 && mo208626a() == i) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.vc.common.widget.avatarlist.a$c */
    public static class C60840c {

        /* renamed from: a */
        public String f152262a;

        /* renamed from: b */
        public String f152263b;

        /* renamed from: c */
        public String f152264c;

        /* renamed from: d */
        public ParticipantType f152265d;

        /* renamed from: a */
        public C60840c mo208629a(ParticipantType participantType) {
            this.f152265d = participantType;
            return this;
        }

        /* renamed from: b */
        public C60840c mo208631b(String str) {
            this.f152263b = str;
            return this;
        }

        /* renamed from: c */
        public C60840c mo208632c(String str) {
            this.f152264c = str;
            return this;
        }

        /* renamed from: a */
        public C60840c mo208630a(String str) {
            this.f152262a = str;
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ ObservableSource m236501d(C60839b bVar) throws Exception {
        return m236486a(bVar, bVar.f152260a.f152258e, ParticipantType.UNKNOWN);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ ObservableSource m236502e(C60839b bVar) throws Exception {
        return m236486a(bVar, bVar.f152260a.f152258e, ParticipantType.UNKNOWN);
    }

    /* renamed from: a */
    private static Observable<C60839b> m236485a(C60839b bVar) {
        return Observable.create(new ObservableOnSubscribe() {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$BzVcQTFMg16r0aT41K6SFsEJ6ws */

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C60835a.m236500c(C60835a.C60839b.this, observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Observable<C60839b> m236493b(C60839b bVar) {
        return Observable.create(new ObservableOnSubscribe() {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$NpTB7qNoRPaMqMsc6IRMxp6QQ8A */

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C60835a.m236497b(C60835a.C60839b.this, observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Observable<C60839b> m236498c(C60839b bVar) {
        return Observable.create(new ObservableOnSubscribe() {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$_vnctxhSvgKkcjODYR1Z1KeEiE */

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C60835a.m236490a(C60835a.C60839b.this, observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m236500c(C60839b bVar, ObservableEmitter observableEmitter) throws Exception {
        C60838a aVar = bVar.f152260a;
        if (aVar.f152254a == null || aVar.f152254a.size() <= 0) {
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
            return;
        }
        VideoChatModuleDependency.getChatDependency().getChattersByIds(aVar.f152254a, new VCAvatarRequestUtil$1(aVar, bVar, observableEmitter));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Observable<C60839b> m236487a(String str, C60839b bVar) {
        return Observable.create(new ObservableOnSubscribe(str) {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$sPhBDH1z7aei3cqc8ZyntwK75s */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C60835a.m236491a(C60835a.C60839b.this, this.f$1, observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m236497b(final C60839b bVar, final ObservableEmitter observableEmitter) throws Exception {
        final C60838a aVar = bVar.f152260a;
        if (aVar.f152255b == null || aVar.f152255b.size() <= 0) {
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
            return;
        }
        VcBizService.getRoomById(aVar.f152255b, new UIGetDataCallback<Map<String, Room>>() {
            /* class com.ss.android.vc.common.widget.avatarlist.C60835a.C608361 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                C60700b.m235864f("VCAvatarRequestUtil", "[getRoomById]", "onErrored: " + errorResult.toString());
                observableEmitter.onNext(bVar);
                observableEmitter.onComplete();
            }

            /* renamed from: a */
            public void onSuccessed(Map<String, Room> map) {
                String str;
                if (!(aVar.f152255b == null || map == null)) {
                    Iterator<String> it = aVar.f152255b.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        Room room = map.get(next);
                        try {
                            HashMap<String, C60840c> hashMap = bVar.f152260a.f152259f;
                            C60840c a = new C60840c().mo208630a(next);
                            String str2 = null;
                            if (room != null) {
                                str = room.avatarKey;
                            } else {
                                str = null;
                            }
                            C60840c b = a.mo208631b(str);
                            if (room != null) {
                                str2 = room.fullNameParticipant;
                            }
                            hashMap.put(next, b.mo208632c(str2).mo208629a(ParticipantType.ROOM));
                        } catch (Exception e) {
                            C60700b.m235864f("VCAvatarRequestUtil", "[getRoomAvatarInfoByIds]", "ArrayList insert error");
                            e.printStackTrace();
                        }
                    }
                }
                observableEmitter.onNext(bVar);
                observableEmitter.onComplete();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m236490a(C60839b bVar, ObservableEmitter observableEmitter) throws Exception {
        C60838a aVar = bVar.f152260a;
        if (aVar.f152256c == null || aVar.f152256c.size() <= 0) {
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
            return;
        }
        VideoChatModuleDependency.getChatDependency().getChattersByIds(aVar.f152256c, new VCAvatarRequestUtil$3(aVar, bVar, observableEmitter));
    }

    /* renamed from: a */
    private static Observable<C60839b> m236486a(C60839b bVar, List<String> list, ParticipantType participantType) {
        return Observable.create(new ObservableOnSubscribe(list, bVar, participantType) {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$t0fF0XXxcWvxUGg4lcO6x18TcvU */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ C60835a.C60839b f$1;
            public final /* synthetic */ ParticipantType f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C60835a.m236492a(this.f$0, this.f$1, this.f$2, observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io());
    }

    /* renamed from: b */
    public static Observable<ArrayList<C60840c>> m236494b(String str, List<VCParticipantAbbrInfo> list, int i) {
        C60839b bVar = new C60839b();
        bVar.mo208628a(list, i);
        return m236485a(bVar).flatMap($$Lambda$a$FWsehAZoTHdr97e5lgdHnp2DLU.INSTANCE).flatMap(new Function(str) {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$ZzGajHyJ0bO1bOJKYv4avVb1wg */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C60835a.m236487a(this.f$0, (C60835a.C60839b) obj);
            }
        }).flatMap($$Lambda$a$nzdSoptFn1GbPw3eXXZty5Ts3AI.INSTANCE).flatMap($$Lambda$a$_5k9Qz6kJweSmrpYWkGWo5EPxdg.INSTANCE).map(new Function(list, i, bVar) {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$lxOaVbOrQgbCcYu09uV7rrh9Ryo */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ C60835a.C60839b f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C60835a.m236489a(this.f$0, this.f$1, this.f$2, (C60835a.C60839b) obj);
            }
        });
    }

    /* renamed from: a */
    public static Observable<ArrayList<C60840c>> m236488a(String str, List<Participant> list, int i) {
        C60839b bVar = new C60839b(list, i);
        return m236485a(bVar).flatMap($$Lambda$a$FWsehAZoTHdr97e5lgdHnp2DLU.INSTANCE).flatMap(new Function(str) {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$20HePISwRKhFtavgwavxuggrgs */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C60835a.m236487a(this.f$0, (C60835a.C60839b) obj);
            }
        }).flatMap($$Lambda$a$nzdSoptFn1GbPw3eXXZty5Ts3AI.INSTANCE).flatMap($$Lambda$a$jG0bzGE5FmaEJNwwuDYFEYBc08.INSTANCE).map(new Function(list, i, bVar) {
            /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$a$tUfrdPE8T8HonXDwt7UMdqsRr2E */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ C60835a.C60839b f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C60835a.m236496b(this.f$0, this.f$1, this.f$2, (C60835a.C60839b) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m236491a(final C60839b bVar, String str, final ObservableEmitter observableEmitter) throws Exception {
        final C60838a aVar = bVar.f152260a;
        if (aVar.f152257d == null || aVar.f152257d.size() <= 0) {
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
            return;
        }
        UserInfoService.getNewTypeUserInfos(str, aVar.f152257d, new AbstractC63598b<List<ByteViewUserInfo>>() {
            /* class com.ss.android.vc.common.widget.avatarlist.C60835a.C608372 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VCAvatarRequestUtil", "[getNewTypeUserAvartarInfoByIds]", "onErrored: " + eVar);
                observableEmitter.onNext(bVar);
                observableEmitter.onComplete();
            }

            /* renamed from: a */
            public void onSuccess(List<ByteViewUserInfo> list) {
                if (!(aVar.f152257d == null || list == null)) {
                    for (ByteViewUserInfo byteViewUserInfo : list) {
                        bVar.f152260a.f152259f.put(byteViewUserInfo.user.getUserId(), new C60840c().mo208630a(byteViewUserInfo.user.getUserId()).mo208631b(byteViewUserInfo.avatar_key).mo208629a(byteViewUserInfo.user.getParticipantType()));
                    }
                }
                observableEmitter.onNext(bVar);
                observableEmitter.onComplete();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ ArrayList m236496b(List list, int i, C60839b bVar, C60839b bVar2) throws Exception {
        if (bVar2 == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Participant participant = (Participant) it.next();
            if (bVar2.f152261b.size() >= i) {
                break;
            }
            bVar2.f152261b.add(bVar.f152260a.f152259f.get(participant.getId()));
        }
        return bVar2.f152261b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ArrayList m236489a(List list, int i, C60839b bVar, C60839b bVar2) throws Exception {
        if (bVar2 == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VCParticipantAbbrInfo tVar = (VCParticipantAbbrInfo) it.next();
            if (bVar2.f152261b.size() >= i) {
                break;
            }
            bVar2.f152261b.add(bVar.f152260a.f152259f.get(tVar.mo210170b().getUserId()));
        }
        return bVar2.f152261b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m236492a(List list, C60839b bVar, ParticipantType participantType, ObservableEmitter observableEmitter) throws Exception {
        if (list == null || list.size() <= 0) {
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bVar.f152260a.f152259f.put(str, new C60840c().mo208630a(str).mo208629a(participantType));
        }
        observableEmitter.onNext(bVar);
        observableEmitter.onComplete();
    }
}
