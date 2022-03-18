package com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.bytedance.lark.pb.calendar.v1.CalendarWithMembers;
import com.ss.android.lark.calendar.impl.features.calendars.detail.p1448b.C30244f;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarMemberInfo;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.C32510h;
import com.ss.android.lark.calendar.impl.framework.viewmodel.StatusData;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\tJ \u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/H\u0002J\u0012\u00101\u001a\u00020&2\b\u00102\u001a\u0004\u0018\u00010\tH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "()V", "_editInfoData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditInfo;", "_pageStatus", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "_saveStatus", "", "_selfInfo", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "<set-?>", "calServerId", "getCalServerId", "()Ljava/lang/String;", "editInfo", "getEditInfo", "()Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditInfo;", "editInfoData", "Landroidx/lifecycle/LiveData;", "getEditInfoData", "()Landroidx/lifecycle/LiveData;", "isNewCreate", "()Z", "pageStatus", "getPageStatus", "saveStatus", "getSaveStatus", "selfInfo", "getSelfInfo", "doAction", ShareHitPoint.f121869d, "payload", "", "doSave", "Lkotlinx/coroutines/Job;", "initEdit", "initNewCreate", "summary", "updateSelfMember", "", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "members", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "uploadCover", "coverPath", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.a.b */
public final class CalendarEditViewModel extends AbstractC1142af implements ActionDispatcher {
    public static final Companion Companion = new Companion(null);
    public final C1177w<CalendarEditInfo> _editInfoData;
    public final C1177w<StatusData<String>> _pageStatus;
    public final C1177w<Boolean> _saveStatus;
    public final C1177w<CalendarMemberInfo> _selfInfo;
    private String calServerId = "";
    private final LiveData<CalendarEditInfo> editInfoData;
    public boolean isNewCreate;
    private final LiveData<StatusData<String>> pageStatus;
    private final LiveData<Boolean> saveStatus;
    private final LiveData<CalendarMemberInfo> selfInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u001b\u0010\u0017\u001a\u00020\u0012*\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u0019J\u001b\u0010\u001a\u001a\u00020\u0012*\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0002\b\u001dJ\u001b\u0010\u001e\u001a\u00020\u0012*\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0002\b\u001fJ\u0019\u0010 \u001a\u00020\u0012*\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\b#J\u001b\u0010$\u001a\u00020\u0012*\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0002\b%R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/edit/viewmodel/CalendarEditViewModel$Companion;", "", "()V", "ACTION_CHANGE_COLOR", "", "ACTION_CHANGE_COVER", "ACTION_CHANGE_DESC", "ACTION_CHANGE_NOTE", "ACTION_CHANGE_SHARE_OPTION", "ACTION_CHANGE_SUMMARY", "ACTION_SAVE", "PAGE_STATUS_CREATE", "PAGE_STATUS_SAVE", "PAGE_STATUS_SUMMARY_EMPTY", "PAGE_STATUS_TOO_MANY_TEXT", "PAGE_STATUS_UPLOAD_COVER", "TAG", "changeColor", "", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "color", "", "changeColor$calendar_impl_release", "changeCover", "localPath", "changeCover$calendar_impl_release", "changeDesc", "text", "", "changeDesc$calendar_impl_release", "changeNote", "changeNote$calendar_impl_release", "changeShareOption", "shareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "changeShareOption$calendar_impl_release", "changeSummary", "changeSummary$calendar_impl_release", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo109336a(ActionDispatcher aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$changeColor");
            return aVar.doAction("ACTION_CHANGE_COLOR", Integer.valueOf(i));
        }

        /* renamed from: b */
        public final boolean mo109340b(ActionDispatcher aVar, CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$changeNote");
            return aVar.doAction("ACTION_CHANGE_NOTE", charSequence);
        }

        /* renamed from: c */
        public final boolean mo109341c(ActionDispatcher aVar, CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$changeDesc");
            return aVar.doAction("ACTION_CHANGE_DESC", charSequence);
        }

        /* renamed from: a */
        public final boolean mo109337a(ActionDispatcher aVar, Calendar.CalendarShareOptions calendarShareOptions) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$changeShareOption");
            Intrinsics.checkParameterIsNotNull(calendarShareOptions, "shareOption");
            return aVar.doAction("ACTION_CHANGE_SHARE_OPTION", calendarShareOptions);
        }

        /* renamed from: a */
        public final boolean mo109338a(ActionDispatcher aVar, CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$changeSummary");
            return aVar.doAction("ACTION_CHANGE_SUMMARY", charSequence);
        }

        /* renamed from: a */
        public final boolean mo109339a(ActionDispatcher aVar, String str) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$changeCover");
            return aVar.doAction("ACTION_CHANGE_COVER", str);
        }
    }

    public final String getCalServerId() {
        return this.calServerId;
    }

    public final LiveData<CalendarEditInfo> getEditInfoData() {
        return this.editInfoData;
    }

    public final LiveData<StatusData<String>> getPageStatus() {
        return this.pageStatus;
    }

    public final LiveData<Boolean> getSaveStatus() {
        return this.saveStatus;
    }

    public final LiveData<CalendarMemberInfo> getSelfInfo() {
        return this.selfInfo;
    }

    public final boolean isNewCreate() {
        return this.isNewCreate;
    }

    public final CalendarEditInfo getEditInfo() {
        return this.editInfoData.mo5927b();
    }

    private final Job doSave() {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30263b(this, null), 3, null);
    }

    public CalendarEditViewModel() {
        C1177w<StatusData<String>> wVar = new C1177w<>();
        this._pageStatus = wVar;
        this.pageStatus = wVar;
        C1177w<CalendarEditInfo> wVar2 = new C1177w<>();
        this._editInfoData = wVar2;
        this.editInfoData = wVar2;
        C1177w<CalendarMemberInfo> wVar3 = new C1177w<>();
        this._selfInfo = wVar3;
        this.selfInfo = wVar3;
        C1177w<Boolean> wVar4 = new C1177w<>();
        this._saveStatus = wVar4;
        this.saveStatus = wVar4;
    }

    private final Job uploadCover(String str) {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30266e(this, str, null), 3, null);
    }

    public final Job initEdit(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calServerId");
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30264c(this, str, null), 3, null);
    }

    public final Job initNewCreate(String str) {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30265d(this, str, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditViewModel$initEdit$1", mo239173f = "CalendarEditViewModel.kt", mo239174i = {0}, mo239175l = {98}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.a.b$c */
    public static final class C30264c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $calServerId;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CalendarEditViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30264c(CalendarEditViewModel bVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$calServerId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30264c cVar2 = new C30264c(this.this$0, this.$calServerId, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30264c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Calendar calendar;
            CalendarMemberInfo eVar;
            CalendarTenantInfo calendarTenantInfo;
            List<CalendarMember> list;
            List<CalendarWithMembers> list2;
            CalendarWithMembers calendarWithMembers;
            Map<String, CalendarTenantInfo> map;
            List<CalendarWithMembers> list3;
            CalendarMember a;
            Map<String, Calendar> map2;
            Object a2 = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Log.m165389i("CalendarEditViewModel", "initEdit(" + this.$calServerId + ')');
                this.this$0.isNewCreate = false;
                C32510h.m124467a(this.this$0._pageStatus, null, null, 2, null);
                C32510h.m124464a(this.this$0._editInfoData, null);
                C32510h.m124464a(this.this$0._saveStatus, null);
                C32510h.m124464a(this.this$0._selfInfo, null);
                CalendarDetailService aVar = CalendarDetailService.f83432a;
                String str = this.$calServerId;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118835a(str, this);
                if (obj == a2) {
                    return a2;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkSender.C53233d dVar = (SdkSender.C53233d) obj;
            T t = dVar.f131572a;
            if (t == null || (map2 = t.calendars) == null) {
                calendar = null;
            } else {
                calendar = map2.get(this.$calServerId);
            }
            if (calendar != null) {
                T t2 = dVar.f131572a;
                if (t2 == null || (list3 = t2.calendar_with_members) == null || (a = C30237a.m112285a(list3, calendar)) == null) {
                    eVar = null;
                } else {
                    eVar = C30244f.m112361a(calendar, a);
                }
                T t3 = dVar.f131572a;
                if (t3 == null || (map = t3.calendar_tenant_info_map) == null) {
                    calendarTenantInfo = null;
                } else {
                    calendarTenantInfo = map.get(this.$calServerId);
                }
                C32510h.m124464a(this.this$0._editInfoData, new CalendarEditInfo(this.this$0.isNewCreate(), calendar, eVar, calendarTenantInfo));
                CalendarEditViewModel bVar = this.this$0;
                T t4 = dVar.f131572a;
                if (t4 == null || (list2 = t4.calendar_with_members) == null || (calendarWithMembers = (CalendarWithMembers) CollectionsKt.firstOrNull((List) list2)) == null) {
                    list = null;
                } else {
                    list = calendarWithMembers.calendar_members;
                }
                bVar.updateSelfMember(calendar, list);
                C32510h.m124471b(this.this$0._pageStatus, null, null, 2, null);
            } else {
                C32510h.m124469a(this.this$0._pageStatus, dVar.f131573b, null, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditViewModel$initNewCreate$1", mo239173f = "CalendarEditViewModel.kt", mo239174i = {0}, mo239175l = {78}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.a.b$d */
    public static final class C30265d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $summary;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CalendarEditViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30265d(CalendarEditViewModel bVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$summary = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30265d dVar = new C30265d(this.this$0, this.$summary, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30265d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                Log.m165389i("CalendarEditViewModel", "initNewCreate");
                this.this$0.isNewCreate = true;
                C32510h.m124467a(this.this$0._pageStatus, null, null, 2, null);
                C32510h.m124464a(this.this$0._editInfoData, null);
                C32510h.m124464a(this.this$0._saveStatus, null);
                C32510h.m124464a(this.this$0._selfInfo, null);
                CalendarDetailService aVar = CalendarDetailService.f83432a;
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118840b(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CalendarTenantInfo b = CalendarDetailService.f83432a.mo118837b();
            C1177w<CalendarEditInfo> wVar = this.this$0._editInfoData;
            CalendarEditInfo aVar2 = new CalendarEditInfo(this.this$0.isNewCreate(), (Calendar) obj, null, b);
            aVar2.mo109298a(this.$summary);
            C32510h.m124464a(wVar, aVar2);
            C32510h.m124471b(this.this$0._pageStatus, null, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditViewModel$uploadCover$1", mo239173f = "CalendarEditViewModel.kt", mo239174i = {0, 0}, mo239175l = {158}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "editInfo"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.a.b$e */
    public static final class C30266e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $coverPath;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CalendarEditViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30266e(CalendarEditViewModel bVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$coverPath = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30266e eVar = new C30266e(this.this$0, this.$coverPath, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30266e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CalendarEditInfo aVar;
            String str;
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z2 = false;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarEditInfo editInfo = this.this$0.getEditInfo();
                Log.m165389i("CalendarEditViewModel", "uploadCover(" + this.$coverPath + "): " + editInfo);
                if (editInfo != null) {
                    String str2 = this.$coverPath;
                    if (str2 == null || str2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C32510h.m124467a(this.this$0._pageStatus, "PAGE_STATUS_UPLOAD_COVER", null, 2, null);
                        CalendarDetailService aVar2 = CalendarDetailService.f83432a;
                        File file = new File(this.$coverPath);
                        this.L$0 = ahVar;
                        this.L$1 = editInfo;
                        this.label = 1;
                        obj = aVar2.mo118833a(file, this);
                        if (obj == a) {
                            return a;
                        }
                        aVar = editInfo;
                    }
                }
                return Unit.INSTANCE;
            } else if (i == 1) {
                aVar = (CalendarEditInfo) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkSender.C53233d dVar = (SdkSender.C53233d) obj;
            T t = dVar.f131572a;
            if (t != null) {
                str = t.key;
            } else {
                str = null;
            }
            if (str != null) {
                if (str.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar.mo109299a(this.$coverPath, str);
                    C32510h.m124465a(this.this$0._editInfoData, (Object) null, 1, (Object) null);
                    C32510h.m124471b(this.this$0._pageStatus, "PAGE_STATUS_UPLOAD_COVER", null, 2, null);
                    return Unit.INSTANCE;
                }
            }
            C32510h.m124469a(this.this$0._pageStatus, dVar.f131573b, "PAGE_STATUS_UPLOAD_COVER", null, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditViewModel$doSave$1", mo239173f = "CalendarEditViewModel.kt", mo239174i = {0, 0, 0, 0, 1, 1, 1, 1}, mo239175l = {192, 194}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "editInfo", "saveOrCreatePageStatus", "newSaveInfo", "$this$launch", "editInfo", "saveOrCreatePageStatus", "newSaveInfo"}, mo239178s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.edit.a.b$b */
    public static final class C30263b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CalendarEditViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30263b(CalendarEditViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30263b bVar = new C30263b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30263b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 341
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.edit.viewmodel.CalendarEditViewModel.C30263b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void updateSelfMember(Calendar calendar, List<CalendarMember> list) {
        T t;
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        String a = loginDependency.mo108269a();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(t.user_id, a)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                C32510h.m124464a(this._selfInfo, C30244f.m112361a(calendar, t2));
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher
    public boolean doAction(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        CalendarEditInfo editInfo = getEditInfo();
        int i = 0;
        if (editInfo != null) {
            switch (str.hashCode()) {
                case -702694624:
                    if (str.equals("ACTION_CHANGE_SUMMARY")) {
                        if (!(obj instanceof CharSequence)) {
                            obj = null;
                        }
                        editInfo.mo109298a((CharSequence) obj);
                        C32510h.m124464a(this._saveStatus, Boolean.valueOf(editInfo.mo109318r()));
                        return true;
                    }
                    break;
                case -528748058:
                    if (str.equals("ACTION_SAVE")) {
                        doSave();
                        return true;
                    }
                    break;
                case -371858021:
                    if (str.equals("ACTION_CHANGE_SHARE_OPTION")) {
                        if (!(obj instanceof Calendar.CalendarShareOptions)) {
                            obj = null;
                        }
                        Calendar.CalendarShareOptions calendarShareOptions = (Calendar.CalendarShareOptions) obj;
                        if (calendarShareOptions != null) {
                            editInfo.mo109297a(calendarShareOptions);
                            C32510h.m124465a(this._editInfoData, (Object) null, 1, (Object) null);
                        }
                        return true;
                    }
                    break;
                case 44639543:
                    if (str.equals("ACTION_CHANGE_DESC")) {
                        if (!(obj instanceof CharSequence)) {
                            obj = null;
                        }
                        editInfo.mo109302c((CharSequence) obj);
                        C32510h.m124464a(this._saveStatus, Boolean.valueOf(editInfo.mo109318r()));
                        return true;
                    }
                    break;
                case 44947096:
                    if (str.equals("ACTION_CHANGE_NOTE")) {
                        if (!(obj instanceof CharSequence)) {
                            obj = null;
                        }
                        editInfo.mo109300b((CharSequence) obj);
                        C32510h.m124464a(this._saveStatus, Boolean.valueOf(editInfo.mo109318r()));
                        return true;
                    }
                    break;
                case 1383193949:
                    if (str.equals("ACTION_CHANGE_COLOR")) {
                        if (!(obj instanceof Integer)) {
                            obj = null;
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            i = num.intValue();
                        }
                        editInfo.mo109296a(i);
                        C32510h.m124465a(this._editInfoData, (Object) null, 1, (Object) null);
                        return true;
                    }
                    break;
                case 1383203249:
                    if (str.equals("ACTION_CHANGE_COVER")) {
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        uploadCover((String) obj);
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
