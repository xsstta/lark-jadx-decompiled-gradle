package com.ss.android.lark.sticker.ui.emoticon.detail;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.p2714a.C55044n;
import com.ss.android.lark.sticker.ui.emoticon.detail.C55130a;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.e */
public class C55140e extends BasePresenter<C55130a.AbstractC55131a, C55130a.AbstractC55132b, C55130a.AbstractC55132b.AbstractC55133a> {

    /* renamed from: a */
    private StickerSet f136159a;

    /* renamed from: b */
    private String f136160b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55130a.AbstractC55132b.AbstractC55133a createViewDelegate() {
        return new C55143a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f136159a != null) {
            ((C55130a.AbstractC55132b) getView()).mo188054a(this.f136159a);
        } else if (!TextUtils.isEmpty(this.f136160b)) {
            m213987a(this.f136160b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.e$a */
    public class C55143a implements C55130a.AbstractC55132b.AbstractC55133a {
        private C55143a() {
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b.AbstractC55133a
        /* renamed from: a */
        public void mo188068a(StickerSet stickerSet) {
            if (stickerSet != null) {
                C55044n.m213720a().mo187872a(stickerSet);
            }
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.detail.C55130a.AbstractC55132b.AbstractC55133a
        /* renamed from: b */
        public void mo188069b(StickerSet stickerSet) {
            if (stickerSet != null) {
                C55140e.this.mo188073a(stickerSet);
            }
        }
    }

    /* renamed from: a */
    private void m213987a(String str) {
        ((C55130a.AbstractC55132b) getView()).mo188059e();
        ((C55130a.AbstractC55131a) getModel()).mo188066a(str, new UIGetDataCallback(new IGetDataCallback<C55094b>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.C55140e.C551411 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("StickerSetDetailPresenter", errorResult.toString());
                ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188060f();
                ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188058d();
            }

            /* renamed from: a */
            public void onSuccess(C55094b bVar) {
                ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188060f();
                if (bVar.mo188014b()) {
                    ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188054a(bVar.mo188011a());
                } else {
                    ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188057c();
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo188073a(StickerSet stickerSet) {
        ((C55130a.AbstractC55131a) getModel()).mo188067b(stickerSet.getStickerSetId(), new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.detail.C55140e.C551422 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188056b();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188053a();
                } else {
                    ((C55130a.AbstractC55132b) C55140e.this.getView()).mo188056b();
                }
            }
        }));
    }

    public C55140e(C55130a.AbstractC55132b bVar, StickerSet stickerSet) {
        super(new C55137d(), bVar);
        this.f136159a = stickerSet;
    }

    public C55140e(C55130a.AbstractC55132b bVar, String str) {
        super(new C55137d(), bVar);
        this.f136160b = str;
    }
}
