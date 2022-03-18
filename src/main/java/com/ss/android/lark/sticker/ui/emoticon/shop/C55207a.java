package com.ss.android.lark.sticker.ui.emoticon.shop;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.dto.PushStickerSetsResponse;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.a */
public class C55207a {

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.a$a */
    interface AbstractC55208a extends IModel {
        /* renamed from: a */
        List<StickerSetProgressInfo> mo188209a(PushStickerSetsResponse pushStickerSetsResponse);

        /* renamed from: a */
        void mo188210a(IGetDataCallback<List<StickerSetProgressInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo188211a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo188212b(IGetDataCallback<List<StickerSetProgressInfo>> iGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.a$b */
    public interface AbstractC55209b extends IView<AbstractC55210a> {

        /* renamed from: com.ss.android.lark.sticker.ui.emoticon.shop.a$b$a */
        public interface AbstractC55210a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo188213a();

            /* renamed from: a */
            void mo188214a(StickerSet stickerSet);

            /* renamed from: b */
            void mo188215b(StickerSet stickerSet);
        }

        /* renamed from: a */
        void mo188198a();

        /* renamed from: a */
        void mo188199a(StickerSet stickerSet);

        /* renamed from: a */
        void mo188203a(List<StickerSetProgressInfo> list);

        /* renamed from: b */
        void mo188204b();
    }
}
