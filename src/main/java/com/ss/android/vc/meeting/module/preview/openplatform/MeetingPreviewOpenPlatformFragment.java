package com.ss.android.vc.meeting.module.preview.openplatform;

import android.os.Bundle;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0017\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0014J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006$"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/MeetingPreviewOpenPlatformFragment;", "Lcom/ss/android/vc/meeting/module/preview/MeetingPreviewBaseFragment;", "Lcom/ss/android/vc/meeting/module/preview/openplatform/MeetingPreviewOpenPlatformPresenter;", "()V", "cameraMute", "", "getCameraMute", "()Z", "setCameraMute", "(Z)V", "mTAG", "", "micMute", "getMicMute", "setMicMute", "reserveID", "getReserveID", "()Ljava/lang/String;", "setReserveID", "(Ljava/lang/String;)V", "speaker", "getSpeaker", "setSpeaker", "createPresenter", "fragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "viewDependency", "Lcom/ss/android/vc/meeting/module/preview/ViewDependency;", "getMeetingOrUniqueIds", "getPreviewPageDesc", "parseParams", "argument", "Landroid/os/Bundle;", "statisticsAfterPageShow", "", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.preview.c.b */
public final class MeetingPreviewOpenPlatformFragment extends AbstractC62684c<C62688d> {

    /* renamed from: f */
    public static Map<String, String> f157745f = new HashMap();

    /* renamed from: g */
    public static final Companion f157746g = new Companion(null);

    /* renamed from: h */
    private boolean f157747h = true;

    /* renamed from: i */
    private boolean f157748i = true;

    /* renamed from: j */
    private boolean f157749j = true;

    /* renamed from: k */
    private String f157750k;

    /* renamed from: l */
    private final String f157751l = "MeetingPreviewOpenPlatformFragment@";

    /* renamed from: m */
    private HashMap f157752m;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: d */
    public void mo216563d() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: e */
    public String mo216564e() {
        return "开放平台";
    }

    /* renamed from: f */
    public void mo216614f() {
        HashMap hashMap = this.f157752m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.vc.meeting.module.preview.AbstractC62684c
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo216614f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/MeetingPreviewOpenPlatformFragment$Companion;", "", "()V", "PARAM_OPEN_PLATFORM_CAMERA_MUTE", "", "PARAM_OPEN_PLATFORM_MIC_MUTE", "PARAM_OPEN_PLATFORM_RESERVE_ID", "PARAM_OPEN_PLATFORM_SPEAKER", "sReserveIdMeetingIdMap", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public String mo216561a() {
        String str = this.f157750k;
        if (str == null) {
            return "";
        }
        if (str != null) {
            return str;
        }
        Intrinsics.throwNpe();
        return str;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public boolean mo216587a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "argument");
        if (!super.mo216587a(getArguments())) {
            return false;
        }
        if (this.f157734a == 7) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                Intrinsics.throwNpe();
            }
            this.f157747h = arguments.getBoolean("param_open_platform_mic_mute", true);
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                Intrinsics.throwNpe();
            }
            this.f157748i = arguments2.getBoolean("param_open_platform_camera_mute", true);
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                Intrinsics.throwNpe();
            }
            this.f157749j = arguments3.getBoolean("param_open_platform_speaker", true);
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                Intrinsics.throwNpe();
            }
            String string = arguments4.getString("param_open_platform_reserve_id");
            this.f157750k = string;
            if (string == null) {
                C60700b.m235864f(this.f157751l, "[parseParams]", "reserveID id is null");
                return false;
            }
            String str = this.f157751l;
            C60700b.m235851b(str, "[parseParams2]", "micMute = " + this.f157747h + ", cameraMute = " + this.f157748i + ", speaker = " + this.f157749j + ", reserveID = " + this.f157750k);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62688d mo216560a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62688d(baseFragment, hVar, this.f157747h, this.f157748i, this.f157749j, this.f157750k);
    }
}
