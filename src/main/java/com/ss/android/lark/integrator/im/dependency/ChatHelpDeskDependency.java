package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl;
import com.ss.android.lark.dependency.IHelpdeskDependency;
import com.ss.android.lark.helpdesk_api.IHelpdeskApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.openbanner.ContainerTag;
import com.ss.android.lark.pb.openbanner.TargetType;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/integrator/im/dependency/ChatHelpDeskDependency;", "Lcom/ss/android/lark/dependency/IHelpdeskDependency;", "()V", "TAG", "", "helpdeskApi", "Lcom/ss/android/lark/helpdesk_api/IHelpdeskApi;", "getKbTopExtendData", "", "targetId", "context", "getKbTopView", "Landroid/view/View;", "Landroid/content/Context;", "initRecycleViewData", "registerKbTopExtendControl", "listener", "Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;", "registerKbTopExtendPush", "unRegisterKbTopExtendPush", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.dependency.f */
public final class ChatHelpDeskDependency implements IHelpdeskDependency {

    /* renamed from: a */
    private final String f101039a = "ChatHelpDeskDependency";

    /* renamed from: b */
    private final IHelpdeskApi f101040b = ((IHelpdeskApi) ApiUtils.getApi(IHelpdeskApi.class));

    @Override // com.ss.android.lark.dependency.IHelpdeskDependency
    /* renamed from: a */
    public void mo134726a() {
        IHelpdeskApi iHelpdeskApi = this.f101040b;
        if (iHelpdeskApi != null) {
            iHelpdeskApi.registerKbTopExtendPush();
        } else {
            Log.m165383e(this.f101039a, "helpdeskApi is  null");
        }
    }

    @Override // com.ss.android.lark.dependency.IHelpdeskDependency
    /* renamed from: b */
    public void mo134730b() {
        IHelpdeskApi iHelpdeskApi = this.f101040b;
        if (iHelpdeskApi != null) {
            iHelpdeskApi.unRegisterKbTopExtendPush();
        } else {
            Log.m165383e(this.f101039a, "helpdeskApi is  null");
        }
    }

    @Override // com.ss.android.lark.dependency.IHelpdeskDependency
    /* renamed from: a */
    public View mo134725a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        IHelpdeskApi iHelpdeskApi = this.f101040b;
        if (iHelpdeskApi != null) {
            View kbTopView = iHelpdeskApi.getKbTopView(context);
            Intrinsics.checkExpressionValueIsNotNull(kbTopView, "helpdeskApi.getKbTopView(context)");
            return kbTopView;
        }
        Log.m165383e(this.f101039a, "helpdeskApi is  null");
        return new View(context);
    }

    @Override // com.ss.android.lark.dependency.IHelpdeskDependency
    /* renamed from: a */
    public void mo134727a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        IHelpdeskApi iHelpdeskApi = this.f101040b;
        if (iHelpdeskApi != null) {
            iHelpdeskApi.initRecycleViewData(context, str);
        } else {
            Log.m165383e(this.f101039a, "helpdeskApi is  null");
        }
    }

    @Override // com.ss.android.lark.dependency.IHelpdeskDependency
    /* renamed from: a */
    public void mo134728a(KbTopExtendControl aVar, Context context) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        Intrinsics.checkParameterIsNotNull(context, "context");
        IHelpdeskApi iHelpdeskApi = this.f101040b;
        if (iHelpdeskApi != null) {
            iHelpdeskApi.registerKbTopExtendControl(aVar, context);
        } else {
            Log.m165383e(this.f101039a, "helpdeskApi is  null");
        }
    }

    @Override // com.ss.android.lark.dependency.IHelpdeskDependency
    /* renamed from: a */
    public void mo134729a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        IHelpdeskApi iHelpdeskApi = this.f101040b;
        if (iHelpdeskApi != null) {
            iHelpdeskApi.getKbTopExtendData(str, TargetType.CHAT.getValue(), ContainerTag.ChatFooterBanner.getValue(), str2);
        } else {
            Log.m165383e(this.f101039a, "helpdeskApi is  null");
        }
    }
}
