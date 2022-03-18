package com.ss.lark.android.avatar.ui;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;

/* renamed from: com.ss.lark.android.avatar.ui.j */
public interface AbstractC64247j {

    /* renamed from: com.ss.lark.android.avatar.ui.j$a */
    public interface AbstractC64248a extends IModel {
        /* renamed from: a */
        void mo222692a(String str, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.lark.android.avatar.ui.j$b */
    public interface AbstractC64249b extends IView<AbstractC64250a> {

        /* renamed from: com.ss.lark.android.avatar.ui.j$b$a */
        public interface AbstractC64250a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo222698a(String str);

            /* renamed from: b */
            void mo222699b(String str);
        }

        /* renamed from: a */
        void mo222623a();

        /* renamed from: a */
        void mo222624a(PhotoItem photoItem);

        /* renamed from: a */
        void mo222626a(String str);

        /* renamed from: a */
        void mo222627a(boolean z);

        /* renamed from: b */
        void mo222628b();

        /* renamed from: b */
        void mo222629b(String str);

        /* renamed from: c */
        void mo222630c();

        /* renamed from: d */
        boolean mo222631d();

        /* renamed from: e */
        String mo222632e();
    }
}
