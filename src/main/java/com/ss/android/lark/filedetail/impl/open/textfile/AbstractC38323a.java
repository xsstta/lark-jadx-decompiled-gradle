package com.ss.android.lark.filedetail.impl.open.textfile;

import android.view.View;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.filedetail.impl.open.OpenFileInfo;

/* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.a */
public interface AbstractC38323a {

    /* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.a$a */
    public interface AbstractC38324a extends IModel {

        /* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.a$a$a */
        public interface AbstractC38325a {
        }

        /* renamed from: a */
        void mo140125a(AbstractC38325a aVar);
    }

    /* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.a$b */
    public interface AbstractC38326b extends IView<AbstractC38327a> {

        /* renamed from: com.ss.android.lark.filedetail.impl.open.textfile.a$b$a */
        public interface AbstractC38327a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo140112a(View view, OpenFileInfo openFileInfo);

        /* renamed from: a */
        void mo140113a(OpenFileInfo openFileInfo);

        /* renamed from: a */
        void mo140115a(String str);
    }
}
