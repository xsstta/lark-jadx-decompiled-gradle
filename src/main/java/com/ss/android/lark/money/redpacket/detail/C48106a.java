package com.ss.android.lark.money.redpacket.detail;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.money.redpacket.dto.RedPacketDataWrapper;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetailItem;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.money.redpacket.detail.a */
public class C48106a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.money.redpacket.detail.a$a */
    public interface AbstractC48107a extends IModel {
        /* renamed from: a */
        void mo168440a(IGetDataCallback<List<RedPacketDetailItem>> iGetDataCallback);

        /* renamed from: a */
        void mo168441a(boolean z, boolean z2);

        /* renamed from: a */
        boolean mo168442a();

        /* renamed from: b */
        void mo168443b(IGetDataCallback<RedPacketDataWrapper> iGetDataCallback);

        /* renamed from: b */
        boolean mo168444b();

        /* renamed from: c */
        RedPacketInfo mo168445c();

        /* renamed from: c */
        void mo168446c(IGetDataCallback<RedPacketDataWrapper> iGetDataCallback);

        /* renamed from: d */
        List<RedPacketDetailItem> mo168447d();

        /* renamed from: e */
        String mo168448e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.money.redpacket.detail.a$b */
    public interface AbstractC48108b extends IView<AbstractC48109a> {

        /* renamed from: com.ss.android.lark.money.redpacket.detail.a$b$a */
        public interface AbstractC48109a extends IView.IViewDelegate {
            /* renamed from: a */
            boolean mo168449a();

            /* renamed from: b */
            void mo168450b();

            /* renamed from: c */
            void mo168451c();

            /* renamed from: d */
            void mo168452d();
        }

        /* renamed from: a */
        void mo168414a();

        /* renamed from: a */
        void mo168416a(RedPacketDataWrapper redPacketDataWrapper);

        /* renamed from: a */
        void mo168417a(RedPacketInfo redPacketInfo, List<RedPacketDetailItem> list);

        /* renamed from: a */
        void mo168418a(String str);

        /* renamed from: a */
        void mo168419a(String str, RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail);

        /* renamed from: a */
        void mo168420a(String str, boolean z, String str2);

        /* renamed from: a */
        void mo168421a(List<RedPacketDetailItem> list);

        /* renamed from: a */
        void mo168422a(boolean z);

        /* renamed from: b */
        void mo168423b();

        /* renamed from: c */
        void mo168424c();

        /* renamed from: d */
        void mo168425d();

        /* renamed from: e */
        void mo168426e();

        /* renamed from: f */
        void mo168427f();

        /* renamed from: g */
        void mo168428g();

        /* renamed from: h */
        void mo168429h();
    }
}
