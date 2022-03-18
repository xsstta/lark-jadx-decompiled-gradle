package com.ss.android.lark.mediarecorder;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mediarecorder.recorder.MediaRecorderActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mediarecorder/MediaRecorder;", "", "()V", "Companion", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
/* renamed from: com.ss.android.lark.mediarecorder.a */
public final class MediaRecorder {

    /* renamed from: a */
    public static final Companion f113397a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mediarecorder/MediaRecorder$Companion;", "", "()V", "getMediaRecorderIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "config", "Lcom/ss/android/lark/mediarecorder/MediaRecorderConfig;", "startMediaRecorder", "", ShareHitPoint.f121868c, "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "mediarecorder_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.lark.mediarecorder.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo158509a(Activity activity, MediaRecorderConfig mediaRecorderConfig) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(mediaRecorderConfig, "config");
            Intent intent = new Intent(activity, MediaRecorderActivity.class);
            intent.putExtra("MEDIA_TAKE_CONFIG", mediaRecorderConfig);
            return intent;
        }
    }
}
