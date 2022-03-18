package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import android.text.TextUtils;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.ugc.effectmanager.C60484c;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60561a;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60564d;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60566f;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.irtc.AbstractC61024c;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.meetingdialog.labs.C62269o;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.effect.EffectModel;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.statistics.p3180a.C63688c;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.c */
public class C62228c {

    /* renamed from: a */
    static volatile boolean f156337a;

    /* renamed from: b */
    static final C62227b f156338b = new C62227b();

    /* renamed from: c */
    public static final LabsUtils.AbstractC62208a f156339c = new LabsUtils.AbstractC62208a() {
        /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622378 */

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62208a
        /* renamed from: a */
        public void mo215195a(String str) {
            C61237h.m238223a().mo210528b(str);
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils.AbstractC62208a
        /* renamed from: a */
        public void mo215196a(String str, String str2, String str3, int i, int[] iArr, String[] strArr, int i2, String str4) {
            C61237h.m238223a().mo210514a(str, str2, str3, i, iArr, strArr, i2, str4);
        }
    };

    /* renamed from: a */
    public static boolean m243014a(EffectModel effectModel) {
        m243005a();
        boolean a = EffectPlayground.f156365a.mo215313a(effectModel.effect);
        boolean b = m243018b(effectModel);
        C60700b.m235851b("EffectManagerWrapper", "[isEffectReady]", effectModel.getName() + ", isEffectReady isReady: " + a + ", isDownloading: " + b);
        return a;
    }

    /* renamed from: b */
    public static AbstractC61024c m243015b() {
        return new AbstractC61024c() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622291 */

            @Override // com.ss.android.vc.irtc.AbstractC61024c
            /* renamed from: a */
            public long mo210647a(long j) {
                C62228c.m243005a();
                long createNativeResourceFinder = C60484c.m235025b().mo207074f().createNativeResourceFinder(j);
                C60700b.m235851b("EffectManagerWrapper", "[getResourceFinder]", j + ", createResourceFinder: " + createNativeResourceFinder);
                return createNativeResourceFinder;
            }
        };
    }

    /* renamed from: d */
    public static List<EffectModel> m243022d() {
        return f156338b.mo215294b();
    }

    /* renamed from: a */
    public static void m243005a() {
        if (!f156337a) {
            synchronized (C62228c.class) {
                if (!f156337a) {
                    f156337a = EffectPlayground.f156365a.mo215312a(ar.m236694a());
                }
            }
            C60700b.m235851b("EffectManagerWrapper", "[initEffect]", "isInited = " + f156337a);
        }
    }

    /* renamed from: c */
    public static void m243019c() {
        m243005a();
        boolean i = LabsUtils.m242917i();
        boolean h = LabsUtils.m242916h();
        boolean g = LabsUtils.m242915g();
        C60700b.m235851b("EffectManagerWrapper", "[preload]", "preload animoji:" + i + ", filter:" + h + ", touchup:" + g);
        if (i) {
            m243011a((AbstractC63598b<List<EffectModel>>) null);
        }
        if (h) {
            m243016b((AbstractC63598b<List<EffectModel>>) null);
        }
        if (g) {
            m243024e(null);
        }
    }

    /* renamed from: b */
    public static boolean m243018b(EffectModel effectModel) {
        return EffectPlayground.f156365a.mo215311a().mo208015b(effectModel.effect);
    }

    /* renamed from: b */
    public static void m243016b(final AbstractC63598b<List<EffectModel>> bVar) {
        C62227b bVar2 = f156338b;
        List<EffectModel> d = bVar2.mo215296d();
        List<EffectModel> e = bVar2.mo215297e();
        if (d == null || e == null) {
            m243020c(new AbstractC63598b<List<EffectModel>>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.AnonymousClass12 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    AbstractC63598b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(eVar);
                    }
                }

                /* renamed from: a */
                public void onSuccess(List<EffectModel> list) {
                    AbstractC63598b bVar;
                    if (C62228c.f156338b.mo215297e() != null && (bVar = bVar) != null) {
                        bVar.onSuccess(C62228c.f156338b.mo215295c());
                    }
                }
            });
            m243023d(new AbstractC63598b<List<EffectModel>>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.AnonymousClass13 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    AbstractC63598b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(eVar);
                    }
                }

                /* renamed from: a */
                public void onSuccess(List<EffectModel> list) {
                    AbstractC63598b bVar;
                    if (C62228c.f156338b.mo215296d() != null && (bVar = bVar) != null) {
                        bVar.onSuccess(C62228c.f156338b.mo215295c());
                    }
                }
            });
        } else if (bVar != null) {
            bVar.onSuccess(bVar2.mo215295c());
        }
    }

    /* renamed from: c */
    public static void m243020c(AbstractC63598b<List<EffectModel>> bVar) {
        Integer num;
        List<EffectModel> d = f156338b.mo215296d();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (d == null) {
            num = null;
        } else {
            num = Integer.valueOf(d.size());
        }
        sb.append(num);
        C60700b.m235851b("EffectManagerWrapper", "[fetchNormalFilter]", sb.toString());
        if (d == null) {
            m243021c("vc-beautyandfilter", "normalfilter", FilterEffect.class, bVar);
        } else if (bVar != null) {
            bVar.onSuccess(d);
        }
    }

    /* renamed from: d */
    public static void m243023d(AbstractC63598b<List<EffectModel>> bVar) {
        Integer num;
        List<EffectModel> e = f156338b.mo215297e();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (e == null) {
            num = null;
        } else {
            num = Integer.valueOf(e.size());
        }
        sb.append(num);
        C60700b.m235851b("EffectManagerWrapper", "[fetchBeautyFilter]", sb.toString());
        if (e == null) {
            m243021c("vc-beautyandfilter", "beautyfilter", FilterEffect.class, bVar);
        } else if (bVar != null) {
            bVar.onSuccess(e);
        }
    }

    /* renamed from: e */
    public static void m243024e(AbstractC63598b<List<EffectModel>> bVar) {
        Integer num;
        List<EffectModel> b = f156338b.mo215294b();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (b == null) {
            num = null;
        } else {
            num = Integer.valueOf(b.size());
        }
        sb.append(num);
        C60700b.m235851b("EffectManagerWrapper", "[fetchTouchUp]", sb.toString());
        if (b == null) {
            m243021c("vc-beautyandfilter", "beauty", BeautifyEffect.class, bVar);
        } else if (bVar != null) {
            bVar.onSuccess(b);
        }
    }

    /* renamed from: a */
    public static void m243011a(AbstractC63598b<List<EffectModel>> bVar) {
        Integer num;
        List<EffectModel> a = f156338b.mo215291a();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (a == null) {
            num = null;
        } else {
            num = Integer.valueOf(a.size());
        }
        sb.append(num);
        C60700b.m235851b("EffectManagerWrapper", "[fetchAnimoji4]", sb.toString());
        if (a == null) {
            m243021c("default", "online335-980", AnimojiEffect.class, bVar);
        } else if (bVar != null) {
            bVar.onSuccess(a);
        }
    }

    /* renamed from: a */
    public static void m243013a(boolean z) {
        C60700b.m235851b("EffectManagerWrapper", "[loadEffect]", "loadEffect byAccountChanged: " + z);
        if (z) {
            f156338b.mo215298f();
            C62269o.m243186d();
        }
        boolean i = LabsUtils.m242917i();
        boolean h = LabsUtils.m242916h();
        boolean g = LabsUtils.m242915g();
        C60700b.m235851b("EffectManagerWrapper", "[loadEffect2]", " animoji:" + i + ", filter:" + h + ", touchup:" + g);
        if (i) {
            m243011a((AbstractC63598b<List<EffectModel>>) null);
        }
        if (h) {
            m243016b(new AbstractC63598b<List<EffectModel>>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622389 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* renamed from: a */
                public void onSuccess(List<EffectModel> list) {
                    C60700b.m235851b("EffectManagerWrapper", "[loadEffect3]", "filter effects: " + list.size());
                    JSONObject b = C62269o.m243179b();
                    String optString = b.optString("selectedFilter");
                    if (!TextUtils.isEmpty(optString)) {
                        for (EffectModel effectModel : list) {
                            if (optString.equals(effectModel.getResourceId())) {
                                int optInt = b.optInt(optString, -1);
                                if (optInt != -1) {
                                    effectModel.setTagUserValue(optInt);
                                    C62269o.m243174a(effectModel, C62228c.f156339c);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            });
        }
        if (g) {
            m243024e(new AbstractC63598b<List<EffectModel>>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.AnonymousClass10 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m243026a(EffectModel effectModel) {
                    C62228c.m243008a(effectModel, C62228c.f156339c, true);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public static /* synthetic */ void m243027b(EffectModel effectModel) {
                    C62228c.m243008a(effectModel, C62228c.f156339c, true);
                }

                /* renamed from: a */
                public void onSuccess(List<EffectModel> list) {
                    JSONObject b = C62269o.m243179b();
                    int optInt = b.optInt("selectedBeautyStyle", -1);
                    boolean z = true;
                    boolean z2 = !TextUtils.isEmpty(b.optString("selectedBeauty"));
                    Iterator<EffectModel> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        EffectModel next = it.next();
                        int optInt2 = C62269o.m243179b().optInt(next.getResourceId());
                        int tagDefaultValue = next.getTagDefaultValue();
                        if (!(optInt2 == -1 || optInt2 == tagDefaultValue)) {
                            break;
                        }
                    }
                    C60700b.m235851b("EffectManagerWrapper", "[fetchTouchUp]", "beautifyStyle: " + optInt + ", hasSetTag: " + z + ", hasSetBeauty: " + z2);
                    for (EffectModel effectModel : list) {
                        int optInt3 = b.optInt(effectModel.getResourceId(), -1);
                        if (optInt == EffectModel.BeautifyStyle.AUTO.getValue()) {
                            effectModel.setTagUserValue(C62269o.m243171a(effectModel, EffectModel.BeautifyStyle.AUTO));
                            C62228c.m243007a(effectModel, C62228c.f156339c);
                        } else if (optInt == EffectModel.BeautifyStyle.ORIGINAL.getValue()) {
                            effectModel.setTagUserValue(C62269o.m243171a(effectModel, EffectModel.BeautifyStyle.ORIGINAL));
                            C62228c.m243007a(effectModel, C62228c.f156339c);
                        } else if (optInt == EffectModel.BeautifyStyle.CUSTOMIZE.getValue()) {
                            if (optInt3 != -1) {
                                effectModel.setTagUserValue(optInt3);
                                C62228c.m243007a(effectModel, C62228c.f156339c);
                            } else {
                                C60735ab.m236018e(new Runnable() {
                                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.$$Lambda$c$10$kPbWZLIDKU6t98wkzqzrOCwtMTs */

                                    public final void run() {
                                        C62228c.AnonymousClass10.m243027b(EffectModel.this);
                                    }
                                });
                            }
                        } else if (!z && z2) {
                            effectModel.setTagUserValue(C62269o.m243171a(effectModel, EffectModel.BeautifyStyle.AUTO));
                            C62228c.m243007a(effectModel, C62228c.f156339c);
                        } else if (optInt3 != -1) {
                            effectModel.setTagUserValue(optInt3);
                            C62228c.m243007a(effectModel, C62228c.f156339c);
                        } else {
                            C60735ab.m236018e(new Runnable() {
                                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.$$Lambda$c$10$ofGzYEPOf4jwQyu22I4PkPs5bl0 */

                                public final void run() {
                                    C62228c.AnonymousClass10.m243026a(EffectModel.this);
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m243007a(EffectModel effectModel, LabsUtils.AbstractC62208a aVar) {
        m243008a(effectModel, aVar, false);
    }

    /* renamed from: a */
    public static void m243009a(final EffectModel effectModel, final AbstractC63598b<EffectModel> bVar) {
        m243005a();
        if (m243018b(effectModel)) {
            C60700b.m235851b("EffectManagerWrapper", "[fetchEffect]", effectModel.getName() + ", is downloading");
            return;
        }
        EffectPlayground.f156365a.mo215311a().mo208007a(effectModel.effect, new AbstractC60564d() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622313 */

            /* renamed from: a */
            long f156356a;

            @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60564d
            /* renamed from: a */
            public void mo207384a(Effect effect, int i, long j) {
            }

            @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j
            /* renamed from: a */
            public void mo207390a(Effect effect) {
                C60700b.m235851b("EffectManagerWrapper", "[fetchEffect3]", "onStart " + effect.getName());
                this.f156356a = System.currentTimeMillis();
            }

            /* renamed from: b */
            public void mo207223a(Effect effect) {
                C60700b.m235851b("EffectManagerWrapper", "[fetchEffect4]", effect.getName() + ", fetchEffect onSuccess ms-" + (System.currentTimeMillis() - this.f156356a));
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(effectModel);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j
            /* renamed from: a */
            public void mo207391a(Effect effect, C60519c cVar) {
                C60700b.m235864f("EffectManagerWrapper", "[fetchEffect2]", effectModel.getName() + ", fetchEffect onFail " + cVar);
                if (cVar.mo207221c() != -2) {
                    C63688c.m249673a("platform_sdk", cVar.mo207221c(), cVar.toString(), cVar.toString());
                }
                if (bVar != null) {
                    C63602e eVar = new C63602e(null);
                    eVar.mo219900a(cVar.mo207221c());
                    eVar.mo219901a(cVar.mo207217a());
                    bVar.onError(eVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m243008a(EffectModel effectModel, final LabsUtils.AbstractC62208a aVar, final boolean z) {
        if (!m243014a(effectModel)) {
            C60700b.m235851b("EffectManagerWrapper", "[applyEffect]", "effectmodel : " + effectModel.getName() + " not ready and to download");
            m243009a(effectModel, new AbstractC63598b<EffectModel>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.AnonymousClass11 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                }

                /* renamed from: a */
                public void onSuccess(EffectModel effectModel) {
                    if (!z) {
                        C62269o.m243174a(effectModel, aVar);
                    }
                }
            });
        } else if (!z) {
            C62269o.m243174a(effectModel, aVar);
        }
    }

    /* renamed from: a */
    public static void m243010a(final EffectModel effectModel, List<EffectModel> list, final AbstractC63598b<EffectModel> bVar) {
        C60700b.m235851b("EffectManagerWrapper", "[fetchEffectList]", "begin effects size = " + list.size());
        m243005a();
        ArrayList arrayList = new ArrayList(list.size());
        for (final EffectModel effectModel2 : list) {
            arrayList.add(Observable.create(new ObservableOnSubscribe<EffectModel>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622324 */

                @Override // io.reactivex.ObservableOnSubscribe
                public void subscribe(final ObservableEmitter<EffectModel> observableEmitter) throws Exception {
                    C62228c.m243009a(effectModel2, new AbstractC63598b<EffectModel>() {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622324.C622331 */

                        /* renamed from: a */
                        public void onSuccess(EffectModel effectModel) {
                            C60700b.m235851b("EffectManagerWrapper", "[fetchEffectList2]", "fetch effect = " + effectModel2.getEffectId() + " success");
                            observableEmitter.onNext(effectModel);
                            observableEmitter.onComplete();
                        }

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            C60700b.m235851b("EffectManagerWrapper", "[fetchEffectList3]", "fetch effect = " + effectModel2.getEffectId() + " error");
                            observableEmitter.onError(eVar.f160599b);
                        }
                    });
                }
            }));
        }
        Observable.zip(arrayList, new Function<Object[], List<EffectModel>>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622367 */

            /* renamed from: a */
            public List<EffectModel> apply(Object[] objArr) throws Exception {
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList.add((EffectModel) obj);
                }
                return arrayList;
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer<List<EffectModel>>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622345 */

            /* renamed from: a */
            public void accept(List<EffectModel> list) throws Exception {
                C60700b.m235851b("EffectManagerWrapper", "[fetchEffectList4]", "success");
                AbstractC63598b bVar = bVar;
                if (bVar != null) {
                    bVar.onSuccess(effectModel);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622356 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C60700b.m235851b("EffectManagerWrapper", "[fetchEffectList5]", "error");
                if (bVar != null) {
                    bVar.onError(new C63602e(null));
                }
            }
        });
    }

    /* renamed from: a */
    public static <T extends EffectModel> void m243012a(final String str, final String str2, final Class<T> cls, final AbstractC63598b<List<EffectModel>> bVar) {
        m243005a();
        EffectPlayground.f156365a.mo215311a().mo208014b(str, str2, 0, 0, 0, "0", new AbstractC60566f() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.AnonymousClass15 */

            /* renamed from: a */
            public void mo207223a(CategoryPageModel categoryPageModel) {
                C62228c.m243006a(categoryPageModel, str, str2, cls, bVar);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60566f
            /* renamed from: a */
            public void mo207386a(C60519c cVar) {
                C60700b.m235864f("EffectManagerWrapper", "[fetchCategoryEffectFromCache]", cVar.toString());
                C62228c.m243017b(str, str2, cls, bVar);
            }
        });
    }

    /* renamed from: b */
    public static <T extends EffectModel> void m243017b(final String str, final String str2, final Class<T> cls, final AbstractC63598b<List<EffectModel>> bVar) {
        m243005a();
        EffectPlayground.f156365a.mo215311a().mo208008a(str, str2, 0, 0, 0, "0", new AbstractC60566f() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.C622302 */

            /* renamed from: a */
            public void mo207223a(CategoryPageModel categoryPageModel) {
                C62228c.m243006a(categoryPageModel, str, str2, cls, bVar);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60566f
            /* renamed from: a */
            public void mo207386a(C60519c cVar) {
                C60700b.m235864f("EffectManagerWrapper", "[fetchEffectList3]", str2 + ", fetchEffectList onFail: " + cVar.toString());
                if (cVar.mo207221c() != -2) {
                    C63688c.m249673a("platform_sdk", cVar.mo207221c(), cVar.toString(), cVar.toString());
                }
                if (bVar != null) {
                    C63602e eVar = new C63602e(null);
                    eVar.mo219900a(cVar.mo207221c());
                    eVar.mo219901a(cVar.mo207217a());
                    bVar.onError(eVar);
                }
            }
        });
    }

    /* renamed from: c */
    private static <T extends EffectModel> void m243021c(final String str, final String str2, final Class<T> cls, final AbstractC63598b<List<EffectModel>> bVar) {
        m243005a();
        EffectPlayground.f156365a.mo215311a().mo208009a(str, str2, new AbstractC60561a() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.C62228c.AnonymousClass14 */

            @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60561a
            /* renamed from: a */
            public void mo207380a(C60519c cVar) {
                C60700b.m235864f("EffectManagerWrapper", "[checkCategoryIsUpdate]", str + " " + str2 + cVar.toString());
                C60735ab.m236018e(new Runnable(str, str2, cls, bVar) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.$$Lambda$c$14$eP9j1V7YNjFL7Z_HQlqkdZI3cpo */
                    public final /* synthetic */ String f$0;
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ Class f$2;
                    public final /* synthetic */ AbstractC63598b f$3;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C62228c.m243017b(this.f$0, this.f$1, this.f$2, this.f$3);
                    }
                });
            }

            @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60561a
            /* renamed from: a */
            public void mo207381a(boolean z) {
                C60700b.m235851b("EffectManagerWrapper", "[checkCategoryIsUpdate]", str + " " + str2 + ", needUpdate: " + z);
                if (z) {
                    C60735ab.m236018e(new Runnable(str, str2, cls, bVar) {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.$$Lambda$c$14$6tik9SLJ7_4PKWCcAaWS3SwAT6M */
                        public final /* synthetic */ String f$0;
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ Class f$2;
                        public final /* synthetic */ AbstractC63598b f$3;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            C62228c.m243017b(this.f$0, this.f$1, this.f$2, this.f$3);
                        }
                    });
                } else {
                    C60735ab.m236018e(new Runnable(str, str2, cls, bVar) {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.labs.effect.$$Lambda$c$14$up5cIUkqGXCXISv1OAkgxqFPjLU */
                        public final /* synthetic */ String f$0;
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ Class f$2;
                        public final /* synthetic */ AbstractC63598b f$3;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            C62228c.m243012a(this.f$0, this.f$1, this.f$2, this.f$3);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public static <T extends EffectModel> void m243006a(CategoryPageModel categoryPageModel, String str, String str2, Class<T> cls, AbstractC63598b<List<EffectModel>> bVar) {
        CategoryEffectModel categoryEffects;
        String a = C62226a.m242996a(str, str2);
        List<EffectModel> a2 = f156338b.mo215292a(a);
        if (a2 == null) {
            a2 = new ArrayList<>();
            if (!(categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null)) {
                List<Effect> effects = categoryEffects.getEffects();
                try {
                    Constructor<T> constructor = cls.getConstructor(String.class, String.class, Effect.class);
                    Iterator<Effect> it = effects.iterator();
                    while (it.hasNext()) {
                        a2.add(constructor.newInstance(str, str2, it.next()));
                    }
                } catch (Exception e) {
                    C60700b.m235864f("EffectManagerWrapper", "[fetchEffectList]", str2 + ", fetchEffectList: " + e.getMessage());
                }
            }
            f156338b.mo215293a(a, a2);
            C60700b.m235851b("EffectManagerWrapper", "[fetchEffectList2]", str2 + ", fetchEffectList size: " + a2.size());
        }
        if (bVar != null) {
            bVar.onSuccess(a2);
        }
    }
}
