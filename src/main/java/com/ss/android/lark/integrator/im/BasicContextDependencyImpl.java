package com.ss.android.lark.integrator.im;

import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.integrator.im.dependency.AbstractC39570l;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

@ClaymoreImpl(AbstractC39570l.class)
public class BasicContextDependencyImpl implements AbstractC39570l {
    public Context getContext() {
        return LarkContext.getApplication();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39570l
    public boolean isUsPackage() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isUsPackage();
    }
}
