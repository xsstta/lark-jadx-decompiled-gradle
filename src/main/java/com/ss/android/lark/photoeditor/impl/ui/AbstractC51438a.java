package com.ss.android.lark.photoeditor.impl.ui;

import android.graphics.Bitmap;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import java.io.File;

/* renamed from: com.ss.android.lark.photoeditor.impl.ui.a */
public interface AbstractC51438a {

    /* renamed from: com.ss.android.lark.photoeditor.impl.ui.a$a */
    public interface AbstractC51439a extends IModel {

        /* renamed from: com.ss.android.lark.photoeditor.impl.ui.a$a$a */
        public interface AbstractC51440a {
            /* renamed from: a */
            void mo177107a(File file);

            /* renamed from: a */
            void mo177108a(String str);
        }

        /* renamed from: a */
        void mo177105a(Bitmap bitmap, AbstractC59737a.AbstractC59738a aVar);

        /* renamed from: a */
        void mo177106a(Bitmap bitmap, String str, AbstractC51440a aVar);
    }

    /* renamed from: com.ss.android.lark.photoeditor.impl.ui.a$b */
    public interface AbstractC51441b extends IView<AbstractC51442a> {

        /* renamed from: com.ss.android.lark.photoeditor.impl.ui.a$b$a */
        public interface AbstractC51442a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo177116a(Bitmap bitmap);

            /* renamed from: a */
            void mo177117a(Bitmap bitmap, AbstractC59737a.AbstractC59738a aVar);

            /* renamed from: a */
            void mo177118a(String str);
        }

        /* renamed from: a */
        void mo177109a(int i);

        /* renamed from: a */
        void mo177110a(String str);

        /* renamed from: a */
        void mo177111a(String str, boolean z, boolean z2, String str2);

        /* renamed from: a */
        boolean mo177112a();

        /* renamed from: b */
        void mo177113b();

        /* renamed from: c */
        void mo177114c();

        /* renamed from: d */
        void mo177115d();
    }
}
