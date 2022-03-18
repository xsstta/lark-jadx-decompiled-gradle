package com.ss.android.lark.sticker.ui.emoticon.detail;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.a */
public class C55130a {

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.a$a */
    interface AbstractC55131a extends IModel {
        /* renamed from: a */
        void mo188066a(String str, IGetDataCallback<C55094b> iGetDataCallback);

        /* renamed from: b */
        void mo188067b(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.a$b */
    public interface AbstractC55132b extends IView<AbstractC55133a> {

        /* renamed from: com.ss.android.lark.sticker.ui.emoticon.detail.a$b$a */
        public interface AbstractC55133a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo188068a(StickerSet stickerSet);

            /* renamed from: b */
            void mo188069b(StickerSet stickerSet);
        }

        /* renamed from: a */
        void mo188053a();

        /* renamed from: a */
        void mo188054a(StickerSet stickerSet);

        /* renamed from: b */
        void mo188056b();

        /* renamed from: c */
        void mo188057c();

        /* renamed from: d */
        void mo188058d();

        /* renamed from: e */
        void mo188059e();

        /* renamed from: f */
        void mo188060f();
    }
}
