package com.ss.android.lark.sticker.ui.emoticon.manager;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sticker.dto.AbstractC55075a;
import com.ss.android.lark.sticker.dto.PushStickerSetsResponse;
import com.ss.android.lark.sticker.p2714a.C55038m;
import com.ss.android.lark.sticker.ui.emoticon.manager.C55157a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.f */
public class C55170f extends BasePresenter<C55157a.AbstractC55158a, C55157a.AbstractC55159b, C55157a.AbstractC55159b.AbstractC55160a> {

    /* renamed from: a */
    private AbstractC55075a f136207a = new AbstractC55075a() {
        /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55170f.C551711 */

        @Override // com.ss.android.lark.sticker.dto.AbstractC55075a
        /* renamed from: a */
        public void mo143356a(PushStickerSetsResponse pushStickerSetsResponse) {
            C55170f.this.mo188125b();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.f$a */
    public class C55175a implements C55157a.AbstractC55159b.AbstractC55160a {
        @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b.AbstractC55160a
        /* renamed from: a */
        public void mo188116a() {
            C55170f.this.mo188125b();
        }

        private C55175a() {
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b.AbstractC55160a
        /* renamed from: a */
        public void mo188117a(StickerSet stickerSet) {
            if (stickerSet != null) {
                C55170f.this.mo188123a(stickerSet.getStickerSetId());
            }
        }

        @Override // com.ss.android.lark.sticker.ui.emoticon.manager.C55157a.AbstractC55159b.AbstractC55160a
        /* renamed from: a */
        public void mo188118a(List<StickerSet> list) {
            if (!CollectionUtils.isEmpty(list)) {
                ArrayList arrayList = new ArrayList();
                for (StickerSet stickerSet : list) {
                    arrayList.add(stickerSet.getStickerSetId());
                }
                C55170f.this.mo188124a(arrayList);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55157a.AbstractC55159b.AbstractC55160a createViewDelegate() {
        return new C55175a();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C55038m.m213715a().mo187866a(this.f136207a);
        mo188125b();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C55038m.m213715a().mo187868b(this.f136207a);
        super.destroy();
    }

    /* renamed from: b */
    public void mo188125b() {
        ((C55157a.AbstractC55158a) getModel()).mo188113a(new UIGetDataCallback(new IGetDataCallback<List<StickerSet>>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55170f.C551722 */

            /* renamed from: a */
            public void onSuccess(List<StickerSet> list) {
                ((C55157a.AbstractC55159b) C55170f.this.getView()).mo188103a(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("StickerSetManagerPresenter", errorResult.toString());
            }
        }));
    }

    public C55170f(C55157a.AbstractC55159b bVar) {
        super(new C55166e(), bVar);
    }

    /* renamed from: a */
    public void mo188123a(final String str) {
        ((C55157a.AbstractC55158a) getModel()).mo188114a(str, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55170f.C551744 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("StickerSetManagerPresenter", errorResult.toString());
                ((C55157a.AbstractC55159b) C55170f.this.getView()).mo188106d();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (!bool.booleanValue()) {
                    Log.m165383e("StickerSetManagerPresenter", "failed to deleteStickerSets, stickerSetId:" + str);
                    ((C55157a.AbstractC55159b) C55170f.this.getView()).mo188106d();
                    return;
                }
                ((C55157a.AbstractC55159b) C55170f.this.getView()).mo188105c();
            }
        }));
    }

    /* renamed from: a */
    public void mo188124a(List<String> list) {
        ((C55157a.AbstractC55158a) getModel()).mo188115a(list, new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.sticker.ui.emoticon.manager.C55170f.C551733 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("StickerSetManagerPresenter", errorResult.toString());
                ((C55157a.AbstractC55159b) C55170f.this.getView()).mo188104b();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (!bool.booleanValue()) {
                    ((C55157a.AbstractC55159b) C55170f.this.getView()).mo188104b();
                    Log.m165383e("StickerSetManagerPresenter", "failed to patchStickerSets.");
                    return;
                }
                ((C55157a.AbstractC55159b) C55170f.this.getView()).mo188100a();
            }
        }));
    }
}
