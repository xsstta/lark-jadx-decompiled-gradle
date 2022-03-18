package com.ss.android.lark.calendar.impl.features.events.edit.fragment.videomeeting;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OtherVideoMeetingConfigs;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.VideoMeeting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0002J\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010#\u001a\n $*\u0004\u0018\u00010\b0\bH\u0002J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u001fH\u0016J\u0010\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\fH\u0016J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\bH\u0016J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\b\u00102\u001a\u00020\u001fH\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u000e\u0010\u0015\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\n¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/IVideoMeetingViewModel;", "videoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;)V", "customVideoLabel", "Landroidx/lifecycle/MutableLiveData;", "", "getCustomVideoLabel", "()Landroidx/lifecycle/MutableLiveData;", "customVideoType", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs$IconType;", "getCustomVideoType", "customVideoUrl", "getCustomVideoUrl", "focusOnVideoLabelLiveData", "", "getFocusOnVideoLabelLiveData", "isOpenVideoMeeting", "", "otherVideoUrl", "quitFragment", "getQuitFragment", "showOtherConfigUrlCheckDialog", "getShowOtherConfigUrlCheckDialog", "videoMeetingTypeLiveData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "getVideoMeetingTypeLiveData", "checkOtherConfigValid", "checkSetOtherConfigs", "", "videoType", "create", "getSaveVideoMeeting", "getVideoLabelDefaultStr", "kotlin.jvm.PlatformType", "onBackPressed", "onBackWithVcChatClicked", "onChangeMeetingType", "onChangeOtherVideoType", "otherVideoType", "onEditOtherMeetingLabel", "meetingLabel", "onEditOtherMeetingUrl", "meetingUrl", "onTurnVideoSwitch", "isOpen", "refreshAllView", "refreshOtherVideo", "updateVideoLabel", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.d */
public final class EventVideoMeetingViewModel extends AbstractC1142af {
    private final C1177w<String> customVideoLabel = new C1177w<>();
    private final C1177w<EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType> customVideoType = new C1177w<>();
    private final C1177w<String> customVideoUrl = new C1177w<>();
    private final C1177w<Object> focusOnVideoLabelLiveData = new C1177w<>();
    private final C1177w<Boolean> isOpenVideoMeeting = new C1177w<>();
    private String otherVideoUrl = "";
    private final C1177w<Boolean> quitFragment = new C1177w<>();
    private final C1177w<Object> showOtherConfigUrlCheckDialog = new C1177w<>();
    private VideoMeeting videoMeeting;
    private final C1177w<VideoType> videoMeetingTypeLiveData = new C1177w<>();

    public C1177w<String> getCustomVideoLabel() {
        return this.customVideoLabel;
    }

    public C1177w<EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType> getCustomVideoType() {
        return this.customVideoType;
    }

    public C1177w<String> getCustomVideoUrl() {
        return this.customVideoUrl;
    }

    public C1177w<Object> getFocusOnVideoLabelLiveData() {
        return this.focusOnVideoLabelLiveData;
    }

    public C1177w<Boolean> getQuitFragment() {
        return this.quitFragment;
    }

    public C1177w<Object> getShowOtherConfigUrlCheckDialog() {
        return this.showOtherConfigUrlCheckDialog;
    }

    public C1177w<VideoType> getVideoMeetingTypeLiveData() {
        return this.videoMeetingTypeLiveData;
    }

    public C1177w<Boolean> isOpenVideoMeeting() {
        return this.isOpenVideoMeeting;
    }

    public final void create() {
        String str;
        if (this.videoMeeting.mo120054e() == VideoType.OTHER) {
            str = this.videoMeeting.mo120053d();
        } else {
            str = "";
        }
        this.otherVideoUrl = str;
        refreshAllView();
    }

    public void onBackPressed() {
        if (!checkOtherConfigValid()) {
            getQuitFragment().mo5926a((Boolean) true);
        }
    }

    public void onBackWithVcChatClicked() {
        this.videoMeeting.mo120045a(VideoType.VCHAT);
        getQuitFragment().mo5926a((Boolean) true);
    }

    private final String getVideoLabelDefaultStr() {
        EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType;
        OtherVideoMeetingConfigs f = this.videoMeeting.mo120056f();
        if (f != null) {
            iconType = f.mo120216b();
        } else {
            iconType = null;
        }
        if (iconType == EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.LIVE) {
            return C32634ae.m125182b(R.string.Calendar_Edit_JoinLivestream);
        }
        return C32634ae.m125182b(R.string.Calendar_Edit_JoinVC);
    }

    private final void refreshOtherVideo() {
        EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType;
        getCustomVideoUrl().mo5926a(this.otherVideoUrl);
        updateVideoLabel();
        C1177w<EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType> customVideoType2 = getCustomVideoType();
        OtherVideoMeetingConfigs f = this.videoMeeting.mo120056f();
        if (f == null || (iconType = f.mo120216b()) == null) {
            iconType = EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.VIDEO_MEETING;
        }
        customVideoType2.mo5926a(iconType);
    }

    private final void updateVideoLabel() {
        String str;
        boolean z;
        OtherVideoMeetingConfigs f = this.videoMeeting.mo120056f();
        if (f != null) {
            str = f.mo120213a();
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = getVideoLabelDefaultStr();
        }
        getCustomVideoLabel().mo5926a(str);
    }

    private final boolean checkOtherConfigValid() {
        boolean z;
        if (this.videoMeeting.mo120054e() == VideoType.OTHER) {
            String d = this.videoMeeting.mo120053d();
            if (d != null) {
                if (StringsKt.trim((CharSequence) d).toString().length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    getShowOtherConfigUrlCheckDialog().mo5926a(new Object());
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        return false;
    }

    private final void refreshAllView() {
        boolean z;
        boolean z2 = true;
        if (this.videoMeeting.mo120054e() != VideoType.NO_VIDEO_MEETING) {
            z = true;
        } else {
            z = false;
        }
        C1177w<Boolean> isOpenVideoMeeting2 = isOpenVideoMeeting();
        if (this.videoMeeting.mo120054e() == VideoType.NO_VIDEO_MEETING) {
            z2 = false;
        }
        isOpenVideoMeeting2.mo5926a(Boolean.valueOf(z2));
        if (z) {
            getVideoMeetingTypeLiveData().mo5926a(this.videoMeeting.mo120054e());
            if (this.videoMeeting.mo120054e() != VideoType.VCHAT) {
                refreshOtherVideo();
                getFocusOnVideoLabelLiveData().mo5926a((Object) null);
            }
        }
    }

    public final VideoMeeting getSaveVideoMeeting() {
        String str;
        OtherVideoMeetingConfigs f;
        String a;
        if (this.videoMeeting.mo120054e() == VideoType.OTHER) {
            OtherVideoMeetingConfigs f2 = this.videoMeeting.mo120056f();
            if (f2 == null || (a = f2.mo120213a()) == null) {
                str = null;
            } else if (a != null) {
                str = StringsKt.trim((CharSequence) a).toString();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            if (Intrinsics.areEqual(str, getVideoLabelDefaultStr()) && (f = this.videoMeeting.mo120056f()) != null) {
                f.mo120215a("");
            }
        }
        return this.videoMeeting;
    }

    public void onChangeMeetingType(VideoType videoType) {
        Intrinsics.checkParameterIsNotNull(videoType, "videoType");
        this.videoMeeting.mo120045a(videoType);
        getVideoMeetingTypeLiveData().mo5926a(this.videoMeeting.mo120054e());
        checkSetOtherConfigs(videoType);
        GeneralHitPoint.m124281y();
    }

    public void onEditOtherMeetingLabel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "meetingLabel");
        OtherVideoMeetingConfigs f = this.videoMeeting.mo120056f();
        if (f != null) {
            f.mo120215a(str);
        }
    }

    public void onEditOtherMeetingUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "meetingUrl");
        if (this.videoMeeting.mo120054e() == VideoType.OTHER) {
            this.otherVideoUrl = str;
            this.videoMeeting.mo120052c(str);
        }
    }

    public void onTurnVideoSwitch(boolean z) {
        if (!z) {
            this.videoMeeting.mo120045a(VideoType.NO_VIDEO_MEETING);
        } else {
            this.videoMeeting.mo120045a(VideoType.VCHAT);
        }
        getVideoMeetingTypeLiveData().mo5926a(this.videoMeeting.mo120054e());
    }

    public void onChangeOtherVideoType(EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType) {
        Intrinsics.checkParameterIsNotNull(iconType, "otherVideoType");
        OtherVideoMeetingConfigs f = this.videoMeeting.mo120056f();
        if (f != null) {
            f.mo120214a(iconType);
        }
        getCustomVideoType().mo5926a(iconType);
        getCustomVideoLabel().mo5926a(getVideoLabelDefaultStr());
    }

    public EventVideoMeetingViewModel(VideoMeeting aaVar) {
        Intrinsics.checkParameterIsNotNull(aaVar, "videoMeeting");
        this.videoMeeting = aaVar;
    }

    private final void checkSetOtherConfigs(VideoType videoType) {
        EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType;
        if (videoType == VideoType.OTHER) {
            if (this.videoMeeting.mo120056f() == null) {
                VideoMeeting aaVar = this.videoMeeting;
                OtherVideoMeetingConfigs tVar = new OtherVideoMeetingConfigs(null, null, 3, null);
                tVar.mo120214a(EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.VIDEO_MEETING);
                aaVar.mo120046a(tVar);
                updateVideoLabel();
                C1177w<EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType> customVideoType2 = getCustomVideoType();
                OtherVideoMeetingConfigs f = this.videoMeeting.mo120056f();
                if (f == null || (iconType = f.mo120216b()) == null) {
                    iconType = EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType.VIDEO_MEETING;
                }
                customVideoType2.mo5926a(iconType);
                this.otherVideoUrl = "";
            }
            this.videoMeeting.mo120052c(this.otherVideoUrl);
            getCustomVideoUrl().mo5926a(this.otherVideoUrl);
            getFocusOnVideoLabelLiveData().mo5926a((Object) null);
        }
    }
}
