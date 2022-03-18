package com.bytedance.ee.bear.bitable.card.viewmodel.fetch;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.FieldCommandResultCode;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.commands.SetFieldAttrBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.CommonActionType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionRequestBean;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.permission.PermissionResult;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import io.reactivex.Single;
import java.util.List;

public interface ICardFetcher {

    public enum FetchMode {
        FETCH_LEFT,
        FETCH_RIGHT,
        FETCH_UPDATE,
        FETCH_ONE
    }

    /* renamed from: a */
    Single<FieldCommandResultCode> mo18629a(SetFieldAttrBean setFieldAttrBean);

    /* renamed from: a */
    <T> Single<T> mo18630a(CommonActionType commonActionType, JSONObject jSONObject, Class<T> cls);

    /* renamed from: a */
    Single<C4525a> mo18631a(C4535b bVar, String str);

    /* renamed from: a */
    Single<List<C4525a>> mo18632a(C4535b bVar, String str, FetchMode fetchMode);

    /* renamed from: a */
    Single<List<C4525a>> mo18633a(C4535b bVar, String[] strArr);

    /* renamed from: a */
    Single<String[]> mo18634a(String str, String str2);

    /* renamed from: a */
    Single<C4535b> mo18635a(String str, String str2, String str3);

    /* renamed from: a */
    Single<PermissionResult> mo18636a(PermissionRequestBean[] permissionRequestBeanArr);

    /* renamed from: b */
    Single<String[]> mo18637b(String str, String str2, String str3);
}
