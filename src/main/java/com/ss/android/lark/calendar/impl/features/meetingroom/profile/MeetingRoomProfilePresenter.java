package com.ss.android.lark.calendar.impl.features.meetingroom.profile;

import android.os.Bundle;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetMeetingRoomsStatusInformationResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.StatusInformation;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomModelApi;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewApi;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewAction;", "view", "model", "mFragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$FragmentDependency;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewApi;Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomModelApi;Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$FragmentDependency;)V", "isMeetingRoomInfoLoading", "", "getMFragmentDependency", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$FragmentDependency;", "setMFragmentDependency", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$FragmentDependency;)V", "create", "", "getViewAction", "loadMeetingRoomInfo", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "FragmentDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.d */
public final class MeetingRoomProfilePresenter extends BasePresenterCalendar<MeetingRoomProfileContract.IMeetingRoomModelApi, MeetingRoomProfileContract.IMeetingRoomViewApi, MeetingRoomProfileContract.IMeetingRoomViewData, MeetingRoomProfileContract.IMeetingRoomViewAction> {

    /* renamed from: a */
    public boolean f82178a;

    /* renamed from: b */
    private FragmentDependency f82179b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$FragmentDependency;", "", "openChatByChatterId", "", BottomDialog.f17198f, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.d$a */
    public interface FragmentDependency {
        /* renamed from: a */
        void mo117224a(String str);
    }

    /* renamed from: d */
    public final FragmentDependency mo117323d() {
        return this.f82179b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$getViewAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewAction;", "onLoadAgainViewClicked", "", "onSubscriberClicked", BottomDialog.f17198f, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.d$b */
    public static final class C32145b implements MeetingRoomProfileContract.IMeetingRoomViewAction {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomProfilePresenter f82180a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewAction
        /* renamed from: a */
        public void mo117270a() {
            this.f82180a.mo117320a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32145b(MeetingRoomProfilePresenter dVar) {
            this.f82180a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileContract.IMeetingRoomViewAction
        /* renamed from: a */
        public void mo117271a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            this.f82180a.mo117323d().mo117224a(str);
        }
    }

    /* renamed from: c */
    public MeetingRoomProfileContract.IMeetingRoomViewAction mo109713b() {
        return new C32145b(this);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((MeetingRoomProfileContract.IMeetingRoomViewApi) mo118651s()).mo117272a();
        mo117320a();
    }

    /* renamed from: a */
    public final void mo117320a() {
        if (!this.f82178a) {
            this.f82178a = true;
            MeetingRoomProfileBaseData a = ((MeetingRoomProfileContract.IMeetingRoomModelApi) mo118652t()).mo117267a();
            C32146c cVar = new C32146c(this, a);
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            long b = a.mo117294b();
            long c = a.mo117297c();
            List<String> listOf = CollectionsKt.listOf(a.mo117289a());
            String e = a.mo117300e();
            UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(cVar);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callBack)");
            aVar.mo118925a(b, c, listOf, e, wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: a */
    public final void mo117321a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        ((MeetingRoomProfileContract.IMeetingRoomModelApi) mo118652t()).mo117268a(bundle);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfilePresenter$loadMeetingRoomInfo$callBack$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetMeetingRoomsStatusInformationResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.d$c */
    public static final class C32146c implements IGetDataCallback<GetMeetingRoomsStatusInformationResponse> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomProfilePresenter f82181a;

        /* renamed from: b */
        final /* synthetic */ MeetingRoomProfileBaseData f82182b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82181a.f82178a = false;
            ((MeetingRoomProfileContract.IMeetingRoomViewApi) this.f82181a.mo118651s()).mo117273b();
            ((MeetingRoomProfileContract.IMeetingRoomViewApi) this.f82181a.mo118651s()).mo117274c();
        }

        /* renamed from: a */
        public void onSuccess(GetMeetingRoomsStatusInformationResponse iVar) {
            StatusInformation zVar;
            Intrinsics.checkParameterIsNotNull(iVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f82181a.f82178a = false;
            Map<String, StatusInformation> a = iVar.mo120090a();
            if (a != null) {
                zVar = a.get(this.f82182b.mo117289a());
            } else {
                zVar = null;
            }
            if (zVar == null) {
                onError(new ErrorResult("meeting room statusInformation is empty"));
                return;
            }
            ((MeetingRoomProfileContract.IMeetingRoomModelApi) this.f82181a.mo118652t()).mo117269a(zVar);
            ((MeetingRoomProfileContract.IMeetingRoomViewApi) this.f82181a.mo118651s()).mo117273b();
            ((MeetingRoomProfileContract.IMeetingRoomViewApi) this.f82181a.mo118651s()).mo117275d();
        }

        C32146c(MeetingRoomProfilePresenter dVar, MeetingRoomProfileBaseData aVar) {
            this.f82181a = dVar;
            this.f82182b = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomProfilePresenter(MeetingRoomProfileContract.IMeetingRoomViewApi cVar, MeetingRoomProfileContract.IMeetingRoomModelApi aVar, FragmentDependency aVar2) {
        super(cVar, aVar);
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar2, "mFragmentDependency");
        this.f82179b = aVar2;
    }
}
