package com.ss.android.lark.sticker.ui.emoticon.shop;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.dto.AbstractC55075a;
import com.ss.android.lark.sticker.dto.PushStickerSetsResponse;
import com.ss.android.lark.sticker.p2714a.C55038m;
import com.ss.android.lark.sticker.p2714a.C55044n;
import com.ss.android.lark.sticker.ui.emoticon.shop.C55207a;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.e */
public class C55218e extends BasePresenter<C55207a.AbstractC55208a, C55207a.AbstractC55209b, C55207a.AbstractC55209b.AbstractC55210a> {

    /* renamed from: a */
    private AbstractC55075a f136283a = new AbstractC55075a() {
        /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55218e.C552191 */

        @Override // com.ss.android.lark.sticker.dto.AbstractC55075a
        /* renamed from: a */
        public void mo143356a(PushStickerSetsResponse pushStickerSetsResponse) {
            C55218e.this.mo188220a(pushStickerSetsResponse);
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.e$a */
    public class C55224a implements C55207a.AbstractC55209b.AbstractC55210a {
        @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55209b.AbstractC55210a
        /* renamed from: a */
        public void mo188213a() {
            C55218e.this.mo188222c();
        }

        private C55224a() {
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55209b.AbstractC55210a
        /* renamed from: a */
        public void mo188214a(StickerSet stickerSet) {
            if (stickerSet != null) {
                C55218e.this.mo188219a(stickerSet);
            }
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.shop.C55207a.AbstractC55209b.AbstractC55210a
        /* renamed from: b */
        public void mo188215b(StickerSet stickerSet) {
            if (stickerSet != null) {
                C55044n.m213720a().mo187872a(stickerSet);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55207a.AbstractC55209b.AbstractC55210a createViewDelegate() {
        return new C55224a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C55038m.m213715a().mo187866a(this.f136283a);
        mo188221b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C55038m.m213715a().mo187868b(this.f136283a);
        super.destroy();
    }

    /* renamed from: b */
    public void mo188221b() {
        ((C55207a.AbstractC55208a) getModel()).mo188210a(new UIGetDataCallback(new IGetDataCallback<List<StickerSetProgressInfo>>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55218e.C552213 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188198a();
            }

            /* renamed from: a */
            public void onSuccess(List<StickerSetProgressInfo> list) {
                if (CollectionUtils.isEmpty(list)) {
                    ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188198a();
                } else {
                    ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188203a(list);
                }
            }
        }));
    }

    /* renamed from: c */
    public void mo188222c() {
        ((C55207a.AbstractC55208a) getModel()).mo188212b(new UIGetDataCallback(new IGetDataCallback<List<StickerSetProgressInfo>>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55218e.C552224 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188198a();
            }

            /* renamed from: a */
            public void onSuccess(List<StickerSetProgressInfo> list) {
                if (CollectionUtils.isEmpty(list)) {
                    ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188198a();
                } else {
                    ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188203a(list);
                }
            }
        }));
    }

    public C55218e(C55207a.AbstractC55209b bVar) {
        super(new C55214d(), bVar);
    }

    /* renamed from: a */
    public void mo188220a(final PushStickerSetsResponse pushStickerSetsResponse) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55218e.RunnableC552235 */

            public void run() {
                ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188203a(((C55207a.AbstractC55208a) C55218e.this.getModel()).mo188209a(pushStickerSetsResponse));
            }
        });
    }

    /* renamed from: a */
    public void mo188219a(final StickerSet stickerSet) {
        ((C55207a.AbstractC55208a) getModel()).mo188211a(stickerSet.getStickerSetId(), new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.shop.C55218e.C552202 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188199a(stickerSet);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C55207a.AbstractC55209b) C55218e.this.getView()).mo188204b();
            }
        }));
    }
}
