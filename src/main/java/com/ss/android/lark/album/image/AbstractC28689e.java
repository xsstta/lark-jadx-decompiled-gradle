package com.ss.android.lark.album.image;

import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.image.ImageSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.album.image.e */
public interface AbstractC28689e {

    /* renamed from: com.ss.android.lark.album.image.e$a */
    public interface AbstractC28690a extends IModel {
        /* renamed from: a */
        void mo102019a(IGetDataCallback<List<ChatImageViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo102021a(List<String> list, IGetDataCallback<List<ChatImageViewData>> iGetDataCallback);

        /* renamed from: a */
        boolean mo102022a();

        /* renamed from: b */
        List<ImageSet> mo102023b();

        /* renamed from: c */
        String mo102024c();

        /* renamed from: d */
        boolean mo102025d();
    }

    /* renamed from: com.ss.android.lark.album.image.e$b */
    public interface AbstractC28691b extends IView<AbstractC28692a> {

        /* renamed from: com.ss.android.lark.album.image.e$b$a */
        public interface AbstractC28692a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo102036a();

            /* renamed from: a */
            void mo102037a(View view, ImageSet imageSet);

            /* renamed from: b */
            boolean mo102038b();

            /* renamed from: c */
            void mo102039c();
        }

        /* renamed from: a */
        void mo101976a(List<ChatImageViewData> list, boolean z);

        /* renamed from: a */
        void mo101977a(boolean z);

        /* renamed from: b */
        void mo101978b();

        /* renamed from: b */
        void mo101979b(boolean z);

        /* renamed from: c */
        void mo101980c();

        /* renamed from: d */
        ArrayList<String> mo101981d();

        /* renamed from: e */
        void mo101982e();

        /* renamed from: f */
        List<ChatImageViewData> mo101983f();
    }
}
