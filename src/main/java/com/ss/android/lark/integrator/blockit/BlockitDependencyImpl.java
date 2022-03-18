package com.ss.android.lark.integrator.blockit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.component.blockit.AbstractC24049b;
import com.larksuite.component.blockit.AbstractC24073e;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockitEnv;
import com.larksuite.component.blockit.service.AbstractC24150c;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.core.container.impl.C24484d;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.Locale;
import org.json.JSONObject;

@ClaymoreImpl(AbstractC24049b.class)
public class BlockitDependencyImpl implements AbstractC24049b {
    @Override // com.larksuite.component.blockit.AbstractC24049b
    public Context getContext() {
        return LarkContext.getApplication();
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public Locale getLocale() {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageSetting();
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public String getSession() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public BlockitEnv getEnv() {
        int envType = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType();
        if (envType == 2) {
            return BlockitEnv.STAGING;
        }
        if (envType != 3) {
            return BlockitEnv.ONLINE;
        }
        return BlockitEnv.PRE_RELEASE;
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public void setBlockSync(AbstractC24150c cVar) {
        C24484d.m89301a(cVar);
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public void onEvent(String str, JSONObject jSONObject) {
        Statistics.sendEvent(str, jSONObject);
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public void openAppLink(Context context, String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).openInternal(context, str, 0);
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public void getMessengerView(BlockEntity blockEntity, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback) {
        MessageBlockUtils.m154431a(getContext(), blockEntity, aVar, iGetDataCallback);
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public void createTodo(Context context, BlockEntity blockEntity, BlockExtra blockExtra) {
        ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).createTodo(context, blockEntity, blockExtra);
    }

    @Override // com.larksuite.component.blockit.AbstractC24049b
    public void mountBlockByOPContainer(ViewGroup viewGroup, BlockEntity blockEntity, OPContainerBundle oPContainerBundle, AbstractC24073e eVar) {
        C24484d.m89296a(viewGroup, blockEntity, oPContainerBundle, eVar);
    }
}
