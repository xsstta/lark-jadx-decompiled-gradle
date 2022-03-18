package com.ss.android.lark.integrator.im;

import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.integrator.im.dependency.AbstractC39577t;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.k */
class C39704k implements AbstractC39577t {
    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39577t
    /* renamed from: a */
    public boolean mo143637a() {
        return false;
    }

    C39704k() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39577t
    /* renamed from: b */
    public void mo143638b(List<IOpenMessageCellFactory> list) {
        list.addAll(((IVCApi) ApiUtils.getApi(IVCApi.class)).getVCMessageCellFactories());
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39577t
    /* renamed from: c */
    public void mo143639c(List<IOpenMessageCellFactory> list) {
        list.addAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarThreadCellFactories());
        list.addAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoThreadCellFactories());
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39577t
    /* renamed from: a */
    public void mo143636a(List<IOpenMessageCellFactory> list) {
        list.addAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoMessageCellFactories());
        list.addAll(((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarMessageCellFactories());
        list.addAll(((IVCApi) ApiUtils.getApi(IVCApi.class)).getVCMessageCellFactories());
    }
}
