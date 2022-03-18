package com.ss.android.lark.userprotocol.impl.app.p2903a;

import android.app.Activity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.core.api.AbstractC29571p;
import com.ss.android.lark.userprotocol.impl.app.UserProtocolDialog;
import com.ss.android.lark.userprotocol.impl.p2902a.AbstractC57715a;

/* renamed from: com.ss.android.lark.userprotocol.impl.app.a.a */
public class C57727a {

    /* renamed from: com.ss.android.lark.userprotocol.impl.app.a.a$a */
    public interface AbstractC57728a extends IModel {
        /* renamed from: a */
        void mo195899a(IGetDataCallback<AbstractC57715a.C57716a> iGetDataCallback);

        /* renamed from: a */
        void mo195900a(String str, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.userprotocol.impl.app.a.a$b */
    public interface AbstractC57729b extends IView<AbstractC57730a> {

        /* renamed from: com.ss.android.lark.userprotocol.impl.app.a.a$b$a */
        public interface AbstractC57730a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo195901a();

        /* renamed from: a */
        void mo195902a(Activity activity, UserProtocolDialog.C57724b bVar, UserProtocolDialog.AbstractC57723a aVar, AbstractC29571p pVar);
    }
}
