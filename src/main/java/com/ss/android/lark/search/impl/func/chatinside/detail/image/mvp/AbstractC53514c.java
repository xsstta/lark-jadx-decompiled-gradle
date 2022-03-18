package com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp;

import android.view.View;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.c */
public interface AbstractC53514c {

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.c$a */
    public interface AbstractC53515a extends IModel {
        /* renamed from: a */
        void mo182660a(IGetDataCallback<List<ChatInsideSearchImageViewData>> iGetDataCallback);

        /* renamed from: a */
        void mo182662a(String str, IGetDataCallback<Message> iGetDataCallback);

        /* renamed from: a */
        void mo182663a(List<String> list, IGetDataCallback<List<ChatInsideSearchImageViewData>> iGetDataCallback);

        /* renamed from: a */
        boolean mo182664a();

        /* renamed from: b */
        List<ImageSet> mo182665b();

        /* renamed from: b */
        void mo182666b(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: c */
        String mo182667c();

        /* renamed from: d */
        boolean mo182668d();
    }

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.c$b */
    public interface AbstractC53516b extends IView<AbstractC53517a> {

        /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp.c$b$a */
        public interface AbstractC53517a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo182681a();

            /* renamed from: a */
            void mo182682a(View view, ImageSet imageSet);

            /* renamed from: a */
            void mo182683a(String str, String str2, boolean z);

            /* renamed from: b */
            boolean mo182684b();

            /* renamed from: c */
            void mo182685c();
        }

        /* renamed from: a */
        void mo182648a(String str, int i);

        /* renamed from: a */
        void mo182649a(List<ChatInsideSearchImageViewData> list, boolean z);

        /* renamed from: a */
        void mo182650a(boolean z);

        /* renamed from: b */
        void mo182651b();

        /* renamed from: b */
        void mo182652b(String str, int i);

        /* renamed from: b */
        void mo182653b(boolean z);

        /* renamed from: c */
        void mo182654c();

        /* renamed from: d */
        ArrayList<String> mo182655d();

        /* renamed from: e */
        void mo182656e();

        /* renamed from: f */
        List<ChatInsideSearchImageViewData> mo182657f();

        /* renamed from: g */
        boolean mo182658g();
    }
}
