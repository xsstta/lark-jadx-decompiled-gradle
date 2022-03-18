package com.ss.android.lark.mail.impl.client;

import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.MigrationFailureDetail;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.client.b */
public interface AbstractC41891b {

    /* renamed from: com.ss.android.lark.mail.impl.client.b$a */
    public interface AbstractC41892a extends IModel {
        /* renamed from: a */
        C1177w<List<MigrationFailureDetail>> mo150476a();
    }

    /* renamed from: com.ss.android.lark.mail.impl.client.b$b */
    public interface AbstractC41893b extends IView<AbstractC41894a> {

        /* renamed from: com.ss.android.lark.mail.impl.client.b$b$a */
        public interface AbstractC41894a extends IView.IViewDelegate {
            /* renamed from: a */
            C1177w<List<MigrationFailureDetail>> mo150477a();
        }
    }
}
