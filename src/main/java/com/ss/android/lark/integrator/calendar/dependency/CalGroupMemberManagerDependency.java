package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30049m;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J4\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalGroupMemberManagerDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IGroupMemberManagerDependency;", "()V", "mIMApi", "Lcom/ss/android/lark/biz/im/api/IIMApi;", "kotlin.jvm.PlatformType", "getGroupKeyChatIds", "", "goSelectFreeBusyMember", "", "activity", "Landroid/app/Activity;", "chatId", "pickedChatters", "Ljava/util/ArrayList;", "requestCode", "", "goSelectFreeBusyMemberFragment", "fragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/DrawerParams;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.l */
public final class CalGroupMemberManagerDependency implements AbstractC30049m {

    /* renamed from: a */
    private final IIMApi f100514a = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30049m
    /* renamed from: a */
    public String mo108239a() {
        String groupKeyChatIds = this.f100514a.getGroupKeyChatIds();
        Intrinsics.checkExpressionValueIsNotNull(groupKeyChatIds, "mIMApi.getGroupKeyChatIds()");
        return groupKeyChatIds;
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30049m
    /* renamed from: a */
    public void mo108240a(Activity activity, String str, ArrayList<String> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(arrayList, "pickedChatters");
        this.f100514a.selectFreeBusyMember(activity, str, arrayList, i);
    }
}
