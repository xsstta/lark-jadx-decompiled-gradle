package com.ss.android.lark.money.redpacket.send;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;

/* renamed from: com.ss.android.lark.money.redpacket.send.a */
public class C48173a {

    /* renamed from: com.ss.android.lark.money.redpacket.send.a$a */
    interface AbstractC48174a extends IModel {
        /* renamed from: a */
        String mo168621a();

        /* renamed from: a */
        void mo168622a(Context context, String str);

        /* renamed from: a */
        void mo168623a(IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo168624a(boolean z, double d, int i, String str, Long l, IGetDataCallback<C48178c> iGetDataCallback);

        /* renamed from: a */
        boolean mo168625a(ErrorResult errorResult);

        /* renamed from: b */
        String mo168626b();

        /* renamed from: c */
        String mo168627c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.money.redpacket.send.a$b */
    public interface AbstractC48175b extends IView<AbstractC48176a> {

        /* renamed from: com.ss.android.lark.money.redpacket.send.a$b$a */
        public interface AbstractC48176a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo168628a(Context context, boolean z, double d, int i, String str, Long l);
        }

        /* renamed from: a */
        void mo168591a();

        /* renamed from: a */
        void mo168592a(int i);

        /* renamed from: a */
        void mo168593a(RedPacketCover redPacketCover);

        /* renamed from: a */
        void mo168595a(String str);

        /* renamed from: a */
        void mo168596a(String str, String str2);

        /* renamed from: a */
        void mo168597a(String str, boolean z, C48178c cVar, Runnable runnable);

        /* renamed from: b */
        void mo168599b();
    }
}
