package com.ss.android.lark.calendar.impl.features.messagecard.helper;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0010\u001a\u00020\u00062\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/CalendarCardHelper;", "", "()V", "CHAT_NAME_MAX_LENGTH", "", "GROUP_ID_FOR_BOT", "", "calendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "getCalendarEventService", "()Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "loginDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "getLoginDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "getBotMessageAttendee", "attendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "chatNames", "", "showNotJoinableDialog", "", "context", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.c */
public final class CalendarCardHelper {

    /* renamed from: a */
    public static final CalendarCardHelper f82294a = new CalendarCardHelper();

    /* renamed from: b */
    private static final AbstractC30054s f82295b = C30022a.f74882a.loginDependency();

    /* renamed from: c */
    private static final C32533b f82296c = C32533b.m124620a();

    private CalendarCardHelper() {
    }

    /* renamed from: a */
    public final AbstractC30054s mo117525a() {
        return f82295b;
    }

    /* renamed from: b */
    public final C32533b mo117526b() {
        return f82296c;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122670a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        new C25639g(context).mo89242c(C32634ae.m125182b(R.string.Calendar_Share_UnableToJoinEvent)).mo89224a(R.id.lkui_dialog_btn_center, R.string.Calendar_Common_GotIt, (DialogInterface.OnClickListener) null).mo89239c();
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m122669a(ArrayList<AbstractC30026d> arrayList, Map<String, String> map) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        ArrayList<AbstractC30026d> arrayList2 = arrayList;
        boolean z2 = true;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                StringBuilder sb2 = new StringBuilder();
                AbstractC30039ah utilsDependency = C30022a.f74882a.utilsDependency();
                AbstractC30026d dVar = arrayList.get(i);
                Intrinsics.checkExpressionValueIsNotNull(dVar, "attendeeList[index]");
                sb2.append(utilsDependency.mo108197a(dVar.getId(), C30022a.f74882a.chatModuleDependency().mo108219a(arrayList.get(i))));
                sb2.append("  ");
                sb.append(sb2.toString());
            }
        }
        if (map != null && !map.isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (value.length() > 14) {
                    StringBuilder sb3 = new StringBuilder();
                    if (value != null) {
                        String substring = value.substring(0, 14);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb3.append(substring);
                        sb3.append("...");
                        value = sb3.toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                sb.append(C30022a.f74882a.utilsDependency().mo108197a("bot_group_none_id", value));
            }
        }
        String sb4 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb4, "stringBuilder.toString()");
        return sb4;
    }
}
