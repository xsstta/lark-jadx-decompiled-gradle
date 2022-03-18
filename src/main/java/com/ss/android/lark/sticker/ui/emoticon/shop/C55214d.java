package com.ss.android.lark.sticker.ui.emoticon.shop;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.api.C55060f;
import com.ss.android.lark.sticker.api.C55063h;
import com.ss.android.lark.sticker.api.GetStickerSetsStoreRequest;
import com.ss.android.lark.sticker.dto.PushStickerSetsResponse;
import com.ss.android.lark.sticker.p2714a.C55044n;
import com.ss.android.lark.sticker.ui.emoticon.shop.C55207a;
import com.ss.android.lark.utils.C57782ag;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.d */
public class C55214d extends BaseModel implements C55207a.AbstractC55208a {

    /* renamed from: a */
    public List<StickerSetProgressInfo> f136272a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f136273b;

    /* renamed from: c */
    public int f136274c = 0;

    /* renamed from: d */
    public volatile boolean f136275d = false;

    /* renamed from: e */
    private volatile long f136276e = -1;

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.d$3 */
    static /* synthetic */ class C552173 {

        /* renamed from: a */
        static final /* synthetic */ int[] f136282a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.sticker.dto.PushStickerSetsResponse$Operation[] r0 = com.ss.android.lark.sticker.dto.PushStickerSetsResponse.Operation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.sticker.ui.emoticon.shop.C55214d.C552173.f136282a = r0
                com.ss.android.lark.sticker.dto.PushStickerSetsResponse$Operation r1 = com.ss.android.lark.sticker.dto.PushStickerSetsResponse.Operation.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.sticker.ui.emoticon.shop.C55214d.C552173.f136282a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.sticker.dto.PushStickerSetsResponse$Operation r1 = com.ss.android.lark.sticker.dto.PushStickerSetsResponse.Operation.DELETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.sticker.ui.emoticon.shop.C55214d.C552173.f136282a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.sticker.dto.PushStickerSetsResponse$Operation r1 = com.ss.android.lark.sticker.dto.PushStickerSetsResponse.Operation.REORDER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.sticker.ui.emoticon.shop.C55214d.C552173.f136282a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.sticker.dto.PushStickerSetsResponse$Operation r1 = com.ss.android.lark.sticker.dto.PushStickerSetsResponse.Operation.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.sticker.ui.emoticon.shop.C55214d.C552173.<clinit>():void");
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55208a
    /* renamed from: a */
    public void mo188210a(IGetDataCallback<List<StickerSetProgressInfo>> iGetDataCallback) {
        m214195a(0, 15, iGetDataCallback);
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55208a
    /* renamed from: b */
    public void mo188212b(IGetDataCallback<List<StickerSetProgressInfo>> iGetDataCallback) {
        if (this.f136273b) {
            m214195a(this.f136274c, 15, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55208a
    /* renamed from: a */
    public List<StickerSetProgressInfo> mo188209a(PushStickerSetsResponse pushStickerSetsResponse) {
        Log.m165389i("StickerSetShopModel", "push sticker sets. operation = " + pushStickerSetsResponse.mo187916a() + " size = " + pushStickerSetsResponse.mo187917b().size());
        if (this.f136276e > pushStickerSetsResponse.mo187918c()) {
            Log.m165389i("StickerSetShopModel", "update time is early than last push time, ignore this.");
            return this.f136272a;
        }
        this.f136276e = pushStickerSetsResponse.mo187918c();
        int i = C552173.f136282a[pushStickerSetsResponse.mo187916a().ordinal()];
        if (i == 1) {
            for (StickerSet stickerSet : pushStickerSetsResponse.mo187917b()) {
                m214196a(stickerSet, true);
            }
        } else if (i == 2) {
            for (StickerSet stickerSet2 : pushStickerSetsResponse.mo187917b()) {
                m214196a(stickerSet2, false);
            }
        } else if (i == 4) {
            Log.m165397w("StickerSetShopModel", "operation is UNKNOWN!");
        }
        return this.f136272a;
    }

    /* renamed from: a */
    private void m214196a(StickerSet stickerSet, boolean z) {
        int i;
        Iterator<StickerSetProgressInfo> it = this.f136272a.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            StickerSetProgressInfo next = it.next();
            if (C57782ag.m224242a(next.getStickerSetId(), stickerSet.getStickerSetId())) {
                i = this.f136272a.indexOf(next);
                break;
            }
        }
        if (i >= 0) {
            this.f136272a.remove(i);
            StickerSetProgressInfo stickerSetProgressInfo = new StickerSetProgressInfo();
            stickerSetProgressInfo.setStickerSet(stickerSet);
            if (z) {
                stickerSet.setPerm(StickerSet.Perm.OWN);
            } else {
                stickerSet.setPerm(StickerSet.Perm.ALONE);
            }
            this.f136272a.add(i, stickerSetProgressInfo);
        }
    }

    @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55208a
    /* renamed from: a */
    public void mo188211a(String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (iGetDataCallback != null) {
            C55063h hVar = new C55063h();
            hVar.mo187911a(Collections.singletonList(str));
            C55044n.m213720a().mo187878a(hVar, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55214d.C552162 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool != null) {
                        iGetDataCallback.onSuccess(bool);
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    private void m214195a(final int i, int i2, final IGetDataCallback<List<StickerSetProgressInfo>> iGetDataCallback) {
        if (iGetDataCallback != null && !this.f136275d) {
            this.f136275d = true;
            GetStickerSetsStoreRequest a = new GetStickerSetsStoreRequest.C55051a(GetStickerSetsStoreRequest.FilterType.ALL).mo187889b(i).mo187887a(i2).mo187888a();
            C55044n.m213720a().mo187873a(a, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<C55060f>() {
                /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55214d.C552151 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C55214d.this.f136275d = false;
                    iGetDataCallback.onError(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(C55060f fVar) {
                    C55214d.this.f136275d = false;
                    if (fVar != null) {
                        C55214d.this.f136273b = fVar.mo187904b();
                        C55214d.this.f136274c = fVar.mo187905c();
                        List<StickerSet> a = fVar.mo187903a();
                        if (!CollectionUtils.isEmpty(a)) {
                            if (i == 0) {
                                C55214d.this.f136272a.clear();
                            }
                            for (StickerSet stickerSet : a) {
                                StickerSetProgressInfo stickerSetProgressInfo = new StickerSetProgressInfo();
                                stickerSetProgressInfo.setStickerSet(stickerSet);
                                C55214d.this.f136272a.add(stickerSetProgressInfo);
                            }
                            iGetDataCallback.onSuccess(C55214d.this.f136272a);
                        }
                    }
                }
            }));
        }
    }
}
