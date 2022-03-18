package com.ss.android.lark.sticker.ui;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.sticker.dto.UISticker;
import com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.a */
public class C55079a {

    /* renamed from: com.ss.android.lark.sticker.ui.a$a */
    public interface AbstractC55080a extends IModel {

        /* renamed from: com.ss.android.lark.sticker.ui.a$a$a */
        public interface AbstractC55081a {
            /* renamed from: a */
            void mo187974a(List<UISticker> list);

            /* renamed from: a */
            void mo187975a(List<String> list, int i, boolean z);
        }

        /* renamed from: a */
        List<UISticker> mo187966a();

        /* renamed from: a */
        void mo187967a(AbstractC55081a aVar);

        /* renamed from: a */
        void mo187968a(AbstractC55093a<List<UISticker>> aVar);

        /* renamed from: a */
        void mo187969a(List<Sticker> list);

        /* renamed from: a */
        void mo187970a(List<String> list, boolean z, AbstractC55093a<List<UISticker>> aVar);

        /* renamed from: b */
        void mo187971b(AbstractC55093a<List<UISticker>> aVar);

        /* renamed from: b */
        void mo187972b(List<UISticker> list);

        /* renamed from: c */
        void mo187973c(AbstractC55093a<List<UISticker>> aVar);
    }

    /* renamed from: com.ss.android.lark.sticker.ui.a$b */
    public interface AbstractC55082b extends IView<AbstractC55083a> {

        /* renamed from: com.ss.android.lark.sticker.ui.a$b$a */
        public interface AbstractC55083a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo187984a();

            /* renamed from: a */
            void mo187985a(List<Sticker> list, List<UISticker> list2);

            /* renamed from: a */
            void mo187986a(List<String> list, boolean z);

            /* renamed from: b */
            void mo187987b();

            /* renamed from: c */
            void mo187988c();
        }

        /* renamed from: a */
        void mo187976a();

        /* renamed from: a */
        void mo187977a(int i);

        /* renamed from: a */
        void mo187978a(ErrorResult errorResult);

        /* renamed from: a */
        void mo187979a(List<UISticker> list);

        /* renamed from: a */
        void mo187980a(List<String> list, int i, boolean z);

        /* renamed from: b */
        void mo187981b();

        /* renamed from: c */
        void mo187982c();

        /* renamed from: d */
        void mo187983d();
    }
}
