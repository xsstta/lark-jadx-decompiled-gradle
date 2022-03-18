package com.ss.android.lark.sticker.ui.emoticon.manager;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.a */
public class C55157a {

    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.a$a */
    interface AbstractC55158a extends IModel {
        /* renamed from: a */
        void mo188113a(IGetDataCallback<List<StickerSet>> iGetDataCallback);

        /* renamed from: a */
        void mo188114a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo188115a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.a$b */
    public interface AbstractC55159b extends IView<AbstractC55160a> {

        /* renamed from: com.ss.android.lark.sticker.ui.emoticon.manager.a$b$a */
        public interface AbstractC55160a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo188116a();

            /* renamed from: a */
            void mo188117a(StickerSet stickerSet);

            /* renamed from: a */
            void mo188118a(List<StickerSet> list);
        }

        /* renamed from: a */
        void mo188100a();

        /* renamed from: a */
        void mo188103a(List<StickerSet> list);

        /* renamed from: b */
        void mo188104b();

        /* renamed from: c */
        void mo188105c();

        /* renamed from: d */
        void mo188106d();
    }
}
