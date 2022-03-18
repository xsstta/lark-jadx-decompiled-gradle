package com.ss.android.lark.money.redpacket.history.fragment.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.money.redpacket.dto.RedPacketHistoryResponse;
import com.ss.android.lark.money.redpacket.history.fragment.p2371b.C48135a;
import java.util.List;

/* renamed from: com.ss.android.lark.money.redpacket.history.fragment.mvp.a */
public interface AbstractC48144a {

    /* renamed from: com.ss.android.lark.money.redpacket.history.fragment.mvp.a$a */
    public interface AbstractC48145a extends IModel {
        /* renamed from: a */
        void mo168538a(int i, IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback);

        /* renamed from: a */
        void mo168539a(IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        boolean mo168540a();

        /* renamed from: b */
        void mo168541b(IGetDataCallback<RedPacketHistoryResponse> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.money.redpacket.history.fragment.mvp.a$b */
    public interface AbstractC48146b extends IView<AbstractC48147a> {

        /* renamed from: com.ss.android.lark.money.redpacket.history.fragment.mvp.a$b$a */
        public interface AbstractC48147a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo168542a(int i);

            /* renamed from: a */
            void mo168543a(String str, boolean z);

            /* renamed from: a */
            boolean mo168544a();

            /* renamed from: b */
            void mo168545b();
        }

        /* renamed from: a */
        void mo168522a();

        /* renamed from: a */
        void mo168523a(int i);

        /* renamed from: a */
        void mo168524a(int i, long j, int i2);

        /* renamed from: a */
        void mo168526a(String str);

        /* renamed from: a */
        void mo168527a(String str, String str2);

        /* renamed from: a */
        void mo168528a(List<C48135a> list);

        /* renamed from: b */
        void mo168529b();

        /* renamed from: b */
        void mo168530b(List<C48135a> list);

        /* renamed from: c */
        void mo168531c();

        /* renamed from: d */
        void mo168532d();

        /* renamed from: e */
        void mo168533e();
    }
}
