package com.ss.android.lark.sticker.ui.emoticon.preview;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.dto.StickerSetInfo;
import com.ss.android.lark.sticker.p2714a.C55044n;
import com.ss.android.lark.sticker.ui.emoticon.preview.C55182a;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.e */
public class C55192e extends BasePresenter<C55182a.AbstractC55183a, C55182a.AbstractC55184b, C55182a.AbstractC55184b.AbstractC55185a> {

    /* renamed from: a */
    private StickerSetInfo f136235a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55182a.AbstractC55184b.AbstractC55185a createViewDelegate() {
        return new C55195a();
    }

    /* renamed from: b */
    private void m214128b() {
        ((C55182a.AbstractC55183a) getModel()).mo188152a(this.f136235a.getStickerSetId(), new UIGetDataCallback(new IGetDataCallback<C55094b>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.preview.C55192e.C551931 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("StickerPreviewPresenter", errorResult.toString());
                ((C55182a.AbstractC55184b) C55192e.this.getView()).mo188136a();
            }

            /* renamed from: a */
            public void onSuccess(C55094b bVar) {
                if (bVar != null) {
                    if (bVar.mo188014b()) {
                        ((C55182a.AbstractC55184b) C55192e.this.getView()).mo188138a(bVar.mo188011a());
                    } else {
                        ((C55182a.AbstractC55184b) C55192e.this.getView()).mo188142b();
                    }
                }
            }
        }));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C55182a.AbstractC55184b) getView()).mo188139a(this.f136235a);
        m214128b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.e$a */
    public class C55195a implements C55182a.AbstractC55184b.AbstractC55185a {
        private C55195a() {
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b.AbstractC55185a
        /* renamed from: a */
        public void mo188154a(StickerSet stickerSet) {
            if (stickerSet != null) {
                C55192e.this.mo188159a(stickerSet);
            }
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.preview.C55182a.AbstractC55184b.AbstractC55185a
        /* renamed from: b */
        public void mo188155b(StickerSet stickerSet) {
            if (stickerSet != null) {
                C55044n.m213720a().mo187872a(stickerSet);
            }
        }
    }

    /* renamed from: a */
    public void mo188159a(StickerSet stickerSet) {
        ((C55182a.AbstractC55183a) getModel()).mo188153b(stickerSet.getStickerSetId(), new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.preview.C55192e.C551942 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C55182a.AbstractC55184b) C55192e.this.getView()).mo188144d();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    ((C55182a.AbstractC55184b) C55192e.this.getView()).mo188143c();
                } else {
                    ((C55182a.AbstractC55184b) C55192e.this.getView()).mo188144d();
                }
            }
        }));
    }

    public C55192e(C55182a.AbstractC55184b bVar, StickerSetInfo stickerSetInfo) {
        super(new C55189d(), bVar);
        this.f136235a = stickerSetInfo;
    }
}
