package com.ss.lark.android.passport.biz.feature.user_item_list.mvp;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.entity.UserItem;
import com.ss.lark.android.passport.biz.entity.UserItemListStep;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.a */
public class C65112a {

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.a$a */
    public interface AbstractC65113a extends AbstractC49025e {
        /* renamed from: a */
        void mo224292a(ICallback<BaseStepData> aVar);

        /* renamed from: a */
        void mo224293a(String str, ICallback<BaseStepData> aVar);

        /* renamed from: b */
        void mo224294b(String str, ICallback<BaseStepData> aVar);

        /* renamed from: c */
        UserItemListStep mo224295c();

        String cz_();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.a$b */
    public interface AbstractC65114b extends AbstractC49027g<AbstractC65115a> {

        /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.a$b$a */
        public interface AbstractC65115a extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo224297a();

            /* renamed from: a */
            void mo224298a(UserItem userItem);
        }

        /* renamed from: a */
        void mo224286a(UserItemListStep userItemListStep);

        /* renamed from: d */
        void mo224288d();

        /* renamed from: e */
        void mo224289e();
    }
}
