package com.ss.android.lark.widget.photo_picker.gallery.p2952a;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.a */
public interface AbstractC58689a {

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.a$a */
    public interface AbstractC58690a extends IModel {

        /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.a$a$a */
        public interface AbstractC58691a {
            /* renamed from: a */
            void mo199046a(int i);

            /* renamed from: a */
            void mo199047a(Context context, boolean z);
        }

        /* renamed from: a */
        void mo199044a(PhotoItem photoItem, IGetDataCallback<DataSource> iGetDataCallback);

        /* renamed from: b */
        void mo199045b(PhotoItem photoItem, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.a$b */
    public interface AbstractC58692b extends IView<AbstractC58693a> {

        /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.a$b$a */
        public interface AbstractC58693a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo199062a();

            /* renamed from: a */
            void mo199063a(PhotoItem photoItem);

            /* renamed from: a */
            void mo199064a(PhotoItem photoItem, boolean z, boolean z2);
        }

        /* renamed from: a */
        void mo199048a();

        /* renamed from: a */
        void mo199049a(float f);

        /* renamed from: a */
        void mo199050a(int i);

        /* renamed from: a */
        void mo199051a(DataSource dataSource, boolean z, boolean z2);

        /* renamed from: a */
        void mo199052a(PhotoItem photoItem);

        /* renamed from: a */
        void mo199053a(String str);

        /* renamed from: a */
        void mo199054a(boolean z);

        /* renamed from: b */
        void mo199055b();

        /* renamed from: b */
        void mo199056b(String str);

        /* renamed from: b */
        void mo199057b(boolean z);

        /* renamed from: c */
        void mo199058c();

        /* renamed from: c */
        void mo199059c(String str);

        /* renamed from: c */
        void mo199060c(boolean z);

        /* renamed from: d */
        void mo199061d();
    }
}
