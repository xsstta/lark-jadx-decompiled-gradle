package com.ss.android.vc.meeting.module.preview;

import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.dependency.IVideoChatDependency;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J!\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/MeetingDeviceSwitchStateUtil;", "", "()V", "SP_KEY_FLOAT_PERMISSION_REQUEST_SHOW_TIME", "", "SP_KEY_LAST_AUDIO_SWITCH_STATE", "SP_KEY_LAST_CAMERA_SWITCH_STATE", "SP_KEY_LAST_GALLERY_VIDEO_SHOW_STATE", "SP_KEY_LOCAL_SHARE_AUTO_CONNECT", "getFloatPermissionRequestShowTime", "", "getLocalShareAutoConnect", "", "isLastAudioStateOn", "isLastCameraStateOn", "isLastGalleryVideoShow", "saveCameraAndAudioState", "", "isCameraOn", "isAudioOn", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "saveFloatPermissionRequestShowTime", "time", "(Ljava/lang/Integer;)V", "saveLastGalleryVideoShow", "show", "(Ljava/lang/Boolean;)V", "saveLocalShareAutoConnect", "autoConnect", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.preview.b */
public final class MeetingDeviceSwitchStateUtil {

    /* renamed from: a */
    public static final MeetingDeviceSwitchStateUtil f157723a = new MeetingDeviceSwitchStateUtil();

    private MeetingDeviceSwitchStateUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m245165a() {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        C57744a a = C57744a.m224104a();
        return a.getBoolean("sp_key_last_camera_switch_state_" + hashCode, true);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m245167b() {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        C57744a a = C57744a.m224104a();
        return a.getBoolean("sp_key_last_audio_switch_state_" + hashCode, true);
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m245168c() {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        C57744a a = C57744a.m224104a();
        return a.getBoolean("sp_key_last_gallery_video_show_state_" + hashCode, true);
    }

    @JvmStatic
    /* renamed from: d */
    public static final int m245169d() {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        C57744a a = C57744a.m224104a();
        return a.getInt("sp_key_float_permission_request_show_time_" + hashCode, 0);
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m245170e() {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        C57744a a = C57744a.m224104a();
        return a.getBoolean("sp_key_local_share_auto_connect_" + hashCode, true);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m245162a(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C57744a a = C57744a.m224104a();
            a.putBoolean("sp_key_last_gallery_video_show_state_" + hashCode, booleanValue);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m245166b(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C57744a a = C57744a.m224104a();
            a.putBoolean("sp_key_local_share_auto_connect_" + hashCode, booleanValue);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m245164a(Integer num) {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        if (num != null) {
            int d = m245169d() + num.intValue();
            C57744a a = C57744a.m224104a();
            a.putInt("sp_key_float_permission_request_show_time_" + hashCode, d);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m245163a(Boolean bool, Boolean bool2) {
        StringBuilder sb = new StringBuilder();
        IVideoChatDependency dependency = VideoChatModuleDependency.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "VideoChatModuleDependency.getDependency()");
        sb.append(dependency.getUserId());
        sb.append(VideoChatModuleDependency.m236629b());
        int hashCode = sb.toString().hashCode();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C57744a a = C57744a.m224104a();
            a.putBoolean("sp_key_last_camera_switch_state_" + hashCode, booleanValue);
        }
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            C57744a a2 = C57744a.m224104a();
            a2.putBoolean("sp_key_last_audio_switch_state_" + hashCode, booleanValue2);
        }
    }
}
