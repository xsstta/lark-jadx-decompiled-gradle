package com.ss.android.lark.sticker.ui.p2718c;

import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.api.custom.PushCustomizedStickersRequest;
import com.ss.android.lark.sticker.dto.C55076b;
import com.ss.android.lark.sticker.dto.C55078d;
import com.ss.android.lark.sticker.dto.UISticker;
import com.ss.android.lark.sticker.p2714a.C55020j;
import com.ss.android.lark.sticker.p2714a.C55027k;
import com.ss.android.lark.sticker.ui.C55079a;
import com.ss.android.lark.sticker.ui.C55227h;
import com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a;
import com.ss.android.lark.sticker.ui.statistics.StickerHitPoint;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.c.a */
public class C55096a implements C55079a.AbstractC55080a {

    /* renamed from: a */
    CallbackManager f136070a = new CallbackManager();

    /* renamed from: b */
    public C55079a.AbstractC55080a.AbstractC55081a f136071b;

    /* renamed from: c */
    public List<UISticker> f136072c = new ArrayList();

    /* renamed from: d */
    public List<Sticker> f136073d = new ArrayList();

    /* renamed from: e */
    public C55027k f136074e;

    /* renamed from: f */
    private int f136075f = 0;

    /* renamed from: g */
    private C55020j.AbstractC55025a f136076g = new C55020j.AbstractC55025a() {
        /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C550971 */

        @Override // com.ss.android.lark.sticker.p2714a.C55020j.AbstractC55025a
        /* renamed from: a */
        public void mo143359a(final PushCustomizedStickersRequest pushCustomizedStickersRequest, final boolean z, final boolean z2) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C550971.RunnableC550981 */

                public void run() {
                    C55096a.this.mo188017a(pushCustomizedStickersRequest, z, z2);
                }
            });
        }
    };

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: a */
    public List<UISticker> mo187966a() {
        return this.f136072c;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f136074e = C55027k.m213686a();
        C55020j.m213679a().mo187841a(this.f136076g);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C55020j.m213679a().mo187843b(this.f136076g);
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: a */
    public void mo187967a(C55079a.AbstractC55080a.AbstractC55081a aVar) {
        this.f136071b = aVar;
    }

    /* renamed from: d */
    public void mo188018d(AbstractC55093a<List<UISticker>> aVar) {
        mo188016a(this.f136075f, 50, aVar);
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: b */
    public void mo187972b(List<UISticker> list) {
        this.f136072c.clear();
        this.f136072c.addAll(list);
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: a */
    public void mo187969a(List<Sticker> list) {
        this.f136073d.clear();
        this.f136073d.addAll(list);
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: c */
    public void mo187973c(final AbstractC55093a<List<UISticker>> aVar) {
        UIGetDataCallback wrapAndAddGetDataCallback = this.f136070a.wrapAndAddGetDataCallback(new IGetDataCallback<List<Sticker>>() {
            /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.AnonymousClass10 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC55093a aVar = aVar;
                if (aVar != null) {
                    aVar.mo188009a(errorResult);
                    aVar.mo188008a();
                }
            }

            /* renamed from: a */
            public void onSuccess(List<Sticker> list) {
                if (aVar != null) {
                    if (list.size() != 0) {
                        C55096a aVar = C55096a.this;
                        aVar.f136072c = aVar.mo188015a(aVar.f136072c, list);
                        aVar.mo188010a(C55096a.this.f136072c);
                    }
                    C55096a.this.f136073d.clear();
                    aVar.mo188008a();
                    StickerHitPoint.f136296a.mo188233b();
                }
            }
        });
        if (this.f136073d.size() > 0) {
            this.f136074e.mo187855b(this.f136073d, wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: c */
    private List<UISticker> m213882c(List<UISticker> list) {
        for (UISticker uISticker : list) {
            for (UISticker uISticker2 : this.f136072c) {
                if (uISticker.equals(uISticker2)) {
                    uISticker.setSelected(uISticker2.getSelected());
                }
            }
        }
        C55227h.m214224b(list);
        return list;
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: b */
    public void mo187971b(final AbstractC55093a<List<UISticker>> aVar) {
        UIGetDataCallback wrapAndAddGetDataCallback = this.f136070a.wrapAndAddGetDataCallback(new IGetDataCallback<List<Sticker>>() {
            /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551079 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC55093a aVar = aVar;
                if (aVar != null) {
                    aVar.mo188009a(errorResult);
                    aVar.mo188008a();
                }
            }

            /* renamed from: a */
            public void onSuccess(List<Sticker> list) {
                if (aVar != null) {
                    C55096a.this.f136073d.clear();
                    C55096a.this.mo188018d(aVar);
                    aVar.mo188008a();
                }
            }
        });
        if (this.f136073d.size() > 0) {
            for (int i = 0; i < this.f136073d.size(); i++) {
                this.f136073d.get(i).setPosition(i);
            }
            ArrayList<Sticker> arrayList = new ArrayList();
            arrayList.addAll(this.f136073d);
            ArrayList arrayList2 = new ArrayList();
            for (Sticker sticker : arrayList) {
                arrayList2.add(sticker.getStickerId());
            }
            for (UISticker uISticker : this.f136072c) {
                Sticker sticker2 = uISticker.getSticker();
                if (!arrayList2.contains(sticker2.getStickerId())) {
                    arrayList.add(sticker2);
                }
            }
            this.f136074e.mo187857c(arrayList, wrapAndAddGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: a */
    public void mo187968a(final AbstractC55093a<List<UISticker>> aVar) {
        Observable.create(new ObservableOnSubscribe<List<UISticker>>() {
            /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551046 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<List<UISticker>> observableEmitter) throws Exception {
                observableEmitter.onNext(C55096a.this.f136074e.mo187854b(C55096a.this.f136074e.mo187853b()));
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<UISticker>>() {
            /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551024 */

            /* renamed from: a */
            public void accept(List<UISticker> list) throws Exception {
                if (aVar != null) {
                    C55096a.this.f136072c.clear();
                    C55096a.this.f136072c.addAll(list);
                    aVar.mo188010a(C55096a.this.f136072c);
                    C55096a.this.mo188018d(aVar);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551035 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AbstractC55093a<List<UISticker>> aVar = aVar;
                if (aVar != null) {
                    C55096a.this.mo188018d(aVar);
                }
            }
        });
    }

    /* renamed from: a */
    public List<UISticker> mo188015a(List<UISticker> list, List<Sticker> list2) {
        Iterator<UISticker> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Sticker sticker = it.next().getSticker();
            sticker.setPosition(i);
            for (Sticker sticker2 : list2) {
                if (sticker.getOriginImageKey().equals(sticker2.getOriginImageKey())) {
                    it.remove();
                    i--;
                }
            }
            i++;
        }
        return list;
    }

    /* renamed from: a */
    public void mo188016a(final int i, final int i2, final AbstractC55093a<List<UISticker>> aVar) {
        C57865c.m224574a(new C57865c.AbstractC57873d<JSONObject>() {
            /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551057 */

            /* renamed from: a */
            public JSONObject produce() {
                boolean z;
                C55027k a = C55027k.m213686a();
                C55076b a2 = a.mo187846a(i, i2);
                List<Sticker> arrayList = new ArrayList<>();
                if (a2 != null) {
                    arrayList = a2.mo187953a();
                    z = a2.mo187954b();
                    ArrayList arrayList2 = new ArrayList();
                    for (Sticker sticker : arrayList) {
                        arrayList2.add(sticker.getOriginImageKey());
                    }
                } else {
                    z = false;
                }
                List<UISticker> arrayList3 = new ArrayList<>();
                if (!CollectionUtils.isEmpty(arrayList)) {
                    arrayList3 = a.mo187854b(arrayList);
                } else {
                    AbstractC55093a aVar = aVar;
                    if (aVar != null) {
                        if (z) {
                            Log.m165388i("no more stickers !");
                        } else {
                            aVar.mo188009a(new ErrorResult("get sticker fail, from = " + i + " to = " + i + i2));
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_ui_sticker", (Object) arrayList3);
                jSONObject.put("params_complete", (Object) Boolean.valueOf(z));
                return jSONObject;
            }
        }, new C57865c.AbstractC57871b<JSONObject>() {
            /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551068 */

            /* renamed from: a */
            public void consume(JSONObject jSONObject) {
                List list = (List) jSONObject.get("params_ui_sticker");
                boolean booleanValue = ((Boolean) jSONObject.get("params_complete")).booleanValue();
                if (list.size() > 0) {
                    if (i == 0) {
                        C55096a.this.f136072c.clear();
                    }
                    C55096a.this.f136072c.addAll(list);
                    aVar.mo188010a(C55096a.this.f136072c);
                    if (!booleanValue && list.size() == 50) {
                        C55096a.this.mo188016a(i + 50, 50, aVar);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo188017a(PushCustomizedStickersRequest pushCustomizedStickersRequest, boolean z, boolean z2) {
        if (pushCustomizedStickersRequest != null && !z && !z2) {
            List<Sticker> a = pushCustomizedStickersRequest.mo187897a();
            if (!CollectionUtils.isEmpty(a)) {
                this.f136072c = m213882c(this.f136074e.mo187854b(a));
                this.f136073d.clear();
                this.f136073d.addAll(C55227h.m214225c(this.f136072c));
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f136072c);
                this.f136071b.mo187974a(arrayList);
            }
        }
    }

    @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a
    /* renamed from: a */
    public void mo187970a(final List<String> list, final boolean z, final AbstractC55093a<List<UISticker>> aVar) {
        if (list.size() != 0) {
            Observable.create(new ObservableOnSubscribe<List<UISticker>>() {
                /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551003 */

                @Override // io.reactivex.ObservableOnSubscribe
                public void subscribe(final ObservableEmitter<List<UISticker>> observableEmitter) {
                    C55096a.this.f136074e.mo187851a(list, z, new IGetDataCallback<C55078d>() {
                        /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C551003.C551011 */

                        /* renamed from: a */
                        public void onSuccess(C55078d dVar) {
                            List<UISticker> b = C55096a.this.f136074e.mo187854b(dVar.mo187957a());
                            if (dVar.mo187958b().size() > 0) {
                                C55096a.this.f136071b.mo187975a(dVar.mo187958b(), list.size(), z);
                            }
                            observableEmitter.onNext(b);
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            ObservableEmitter observableEmitter = observableEmitter;
                            observableEmitter.onError(new Throwable(errorResult.getErrorCode() + "", new Throwable(errorResult.getErrorMsg())));
                        }
                    });
                }
            }).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<UISticker>>() {
                /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.AnonymousClass11 */

                /* renamed from: a */
                public void accept(List<UISticker> list) throws Exception {
                    if (aVar != null) {
                        if (CollectionUtils.isNotEmpty(list)) {
                            C55096a.this.f136072c.addAll(list);
                            aVar.mo188010a(C55096a.this.f136072c);
                        }
                        aVar.mo188008a();
                        StickerHitPoint.f136296a.mo188229a();
                    }
                }
            }, new Consumer<Throwable>() {
                /* class com.ss.android.lark.sticker.ui.p2718c.C55096a.C550992 */

                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    int i;
                    if (aVar != null) {
                        try {
                            i = Integer.parseInt(th.getMessage());
                        } catch (Exception unused) {
                            i = 2;
                        }
                        aVar.mo188009a(new ErrorResult(i, th.getCause().getMessage()));
                        aVar.mo188008a();
                    }
                }
            });
        }
    }
}
