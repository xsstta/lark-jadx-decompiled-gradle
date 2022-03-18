package com.ss.android.lark.calendar.impl.features.meetingroom.profile.content;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetMeetingRoomsStatusInformationResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.StatusInformation;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "initData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;)V", "isMeetingRoomInfoLoading", "", "profileLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileContentData;", "getProfileLiveData", "()Landroidx/lifecycle/MutableLiveData;", "startLoadLiveData", "", "getStartLoadLiveData", "loadMeetingRoomInfo", "", "saveInstanceState", "outState", "Landroid/os/Bundle;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.d */
public final class ProfileViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    public final MeetingRoomProfileBaseData initData;
    public boolean isMeetingRoomInfoLoading;
    private final C1177w<ProfileContentData> profileLiveData = new C1177w<>();
    private final C1177w<Integer> startLoadLiveData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileViewModel$Companion;", "", "()V", "STATUS_ERR", "", "STATUS_LOADING", "STATUS_SUC", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<ProfileContentData> getProfileLiveData() {
        return this.profileLiveData;
    }

    public final C1177w<Integer> getStartLoadLiveData() {
        return this.startLoadLiveData;
    }

    public final void loadMeetingRoomInfo() {
        if (!this.isMeetingRoomInfoLoading) {
            this.isMeetingRoomInfoLoading = true;
            this.startLoadLiveData.mo5926a((Integer) 1);
            CalendarSDKService.f83473a.mo118925a(this.initData.mo117294b(), this.initData.mo117297c(), CollectionsKt.listOf(this.initData.mo117289a()), this.initData.mo117300e(), new C32143b(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/profile/content/ProfileViewModel$loadMeetingRoomInfo$callBack$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetMeetingRoomsStatusInformationResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.a.d$b */
    public static final class C32143b implements IGetDataCallback<GetMeetingRoomsStatusInformationResponse> {

        /* renamed from: a */
        final /* synthetic */ ProfileViewModel f82164a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32143b(ProfileViewModel dVar) {
            this.f82164a = dVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82164a.isMeetingRoomInfoLoading = false;
            this.f82164a.getStartLoadLiveData().mo5926a((Integer) 3);
        }

        /* renamed from: a */
        public void onSuccess(GetMeetingRoomsStatusInformationResponse iVar) {
            StatusInformation zVar;
            Intrinsics.checkParameterIsNotNull(iVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f82164a.isMeetingRoomInfoLoading = false;
            Map<String, StatusInformation> a = iVar.mo120090a();
            if (a != null) {
                zVar = a.get(this.f82164a.initData.mo117289a());
            } else {
                zVar = null;
            }
            if (zVar == null) {
                onError(new ErrorResult("meeting room statusInformation is empty"));
                return;
            }
            this.f82164a.getStartLoadLiveData().mo5926a((Integer) 2);
            this.f82164a.getProfileLiveData().mo5926a(new ProfileContentData(this.f82164a.initData, zVar));
        }
    }

    public final void saveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        this.initData.mo117291a(bundle);
    }

    public ProfileViewModel(MeetingRoomProfileBaseData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "initData");
        this.initData = aVar;
    }
}
