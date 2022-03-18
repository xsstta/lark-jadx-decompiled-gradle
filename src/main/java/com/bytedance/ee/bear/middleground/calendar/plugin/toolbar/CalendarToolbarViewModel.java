package com.bytedance.ee.bear.middleground.calendar.plugin.toolbar;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.middleground.calendar.toolbar.ToolbarModel;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/calendar/plugin/toolbar/CalendarToolbarViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mJsCallbackFunction_SetToolBar", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "toolbarData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/middleground/calendar/toolbar/ToolbarModel;", "getToolbarCallBackFunction", "getToolbarData", "Landroidx/lifecycle/LiveData;", "setToolbarCallBackFunction", "", "callBackFunction", "updateToolbarData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-calendar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.bear.middleground.calendar.plugin.toolbar.a */
public final class CalendarToolbarViewModel extends AbstractC1142af {
    private AbstractC7947h mJsCallbackFunction_SetToolBar;
    private final C1177w<ToolbarModel> toolbarData = new C1177w<>();

    public final AbstractC7947h getToolbarCallBackFunction() {
        return this.mJsCallbackFunction_SetToolBar;
    }

    public final LiveData<ToolbarModel> getToolbarData() {
        return this.toolbarData;
    }

    public final void setToolbarCallBackFunction(AbstractC7947h hVar) {
        this.mJsCallbackFunction_SetToolBar = hVar;
    }

    public final void updateToolbarData(ToolbarModel toolbarModel) {
        Intrinsics.checkParameterIsNotNull(toolbarModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.toolbarData.mo5929b(toolbarModel);
    }
}
