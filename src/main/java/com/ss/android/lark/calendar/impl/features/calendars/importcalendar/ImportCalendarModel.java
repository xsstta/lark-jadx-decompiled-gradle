package com.ss.android.lark.calendar.impl.features.calendars.importcalendar;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract;
import com.ss.android.lark.calendar.impl.features.local.C31934h;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0002J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\fH\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingModel;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "mGoogleBindPushListener", "Lcom/ss/android/lark/calendar/impl/rustadapter/push/CalendarPushHandleCallBack;", "modelDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel$ModelDelegate;", "create", "", "destroy", "importGoogleCalendar", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "loadLocalCalendar", "", "", "registerGoogleBindPush", "setModelDelegate", "unRegisterGoogleBindPush", "ModelDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.c */
public final class ImportCalendarModel extends BaseModel implements ImportCalendarContract.IGoogleCalendarSettingModel {

    /* renamed from: a */
    public final String f76022a = ImportCalendarModel.class.getSimpleName();

    /* renamed from: b */
    public ModelDelegate f76023b;

    /* renamed from: c */
    private final AbstractC32524a f76024c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarModel$ModelDelegate;", "", "onReceiveBindPush", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.c$a */
    public interface ModelDelegate {
        /* renamed from: a */
        void mo109626a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m112870b();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m112871c();
    }

    /* renamed from: b */
    private final void m112870b() {
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f76024c);
    }

    /* renamed from: c */
    private final void m112871c() {
        CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_BIND_GOOGLE_NOTIFICATION, this.f76024c);
    }

    public ImportCalendarModel() {
        super.create();
        this.f76024c = new C30363b(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingModel
    /* renamed from: a */
    public Map<String, Boolean> mo109597a() {
        C31934h.m121506a().mo116561b();
        C31934h a = C31934h.m121506a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LocalSettingManager.getInstance()");
        Map<String, Boolean> c = a.mo116563c();
        Intrinsics.checkExpressionValueIsNotNull(c, "LocalSettingManager.getInstance().calAccSettingMap");
        return c;
    }

    /* renamed from: a */
    public final void mo109653a(ModelDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "modelDelegate");
        this.f76023b = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ ModelDelegate m112869a(ImportCalendarModel cVar) {
        ModelDelegate aVar = cVar.f76023b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("modelDelegate");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "Lorg/jetbrains/annotations/NotNull;", "onPush"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.c$b */
    static final class C30363b implements AbstractC32524a {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarModel f76025a;

        C30363b(ImportCalendarModel cVar) {
            this.f76025a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
        public final void onPush(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Object obj = jSONObject.get("bound");
            if (obj != null) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = jSONObject.get("account");
                if (obj2 != null) {
                    String str = (String) obj2;
                    if (booleanValue) {
                        ImportCalendarModel.m112869a(this.f76025a).mo109626a();
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        }
    }
}
