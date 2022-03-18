package com.ss.android.lark.ug.dyflow.common;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ug.dyflow.common.data.FlowContext;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001 J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\tH&J.\u0010\u0010\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\tH&J.\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018j\u0002`\u001bH&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH&J\u0012\u0010\u001e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\u001f\u001a\u00020\u0007H&¨\u0006!"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "", "addStatusListener", "", "listener", "Lcom/ss/android/lark/ug/dyflow/common/IFlow$IFlowStatusListener;", "checkUriValid", "", "uri", "", "getFlowContext", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowContext;", "loadData", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "notifyComplete", "notifyExExit", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "stepId", "stepName", "register", "stepCreator", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "reportStepEvent", "slotId", "runStep", "start", "IFlowStatusListener", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.d */
public interface IFlow {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/IFlow$IFlowStatusListener;", "", "onComplete", "", "onExit", "onStart", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.d$a */
    public interface IFlowStatusListener {
        /* renamed from: a */
        void mo194712a();

        /* renamed from: b */
        void mo194713b();
    }

    /* renamed from: a */
    void mo194736a(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo194738a(String str, String str2);

    /* renamed from: a */
    void mo194739a(String str, String str2, int i, String str3);

    /* renamed from: a */
    boolean mo194741a();

    /* renamed from: a */
    boolean mo194742a(String str);

    /* renamed from: b */
    FlowContext mo194743b();

    /* renamed from: b */
    boolean mo194744b(String str);

    /* renamed from: c */
    void mo194745c();
}
