package com.ss.android.lark.sticker.ui.emoticon.preview;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.dto.StickerSetInfo;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.a */
public class C55182a {

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.a$a */
    interface AbstractC55183a extends IModel {
        /* renamed from: a */
        void mo188152a(String str, IGetDataCallback<C55094b> iGetDataCallback);

        /* renamed from: b */
        void mo188153b(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.a$b */
    public interface AbstractC55184b extends IView<AbstractC55185a> {

        /* renamed from: com.ss.android.lark.sticker.ui.emoticon.preview.a$b$a */
        public interface AbstractC55185a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo188154a(StickerSet stickerSet);

            /* renamed from: b */
            void mo188155b(StickerSet stickerSet);
        }

        /* renamed from: a */
        void mo188136a();

        /* renamed from: a */
        void mo188138a(StickerSet stickerSet);

        /* renamed from: a */
        void mo188139a(StickerSetInfo stickerSetInfo);

        /* renamed from: b */
        void mo188142b();

        /* renamed from: c */
        void mo188143c();

        /* renamed from: d */
        void mo188144d();
    }
}
