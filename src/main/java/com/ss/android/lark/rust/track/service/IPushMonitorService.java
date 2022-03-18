package com.ss.android.lark.rust.track.service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/rust/track/service/IPushMonitorService;", "", "init", "", "notifyAppLagRequest", "lagLevel", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "LagLevel", "PushStatus", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IPushMonitorService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/rust/track/service/IPushMonitorService$LagLevel;", "", "Companion", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LagLevel {
        public static final Companion Companion = Companion.f131522a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/rust/track/service/IPushMonitorService$LagLevel$Companion;", "", "()V", "FATALLY", "", "MODERATELY", "NONE", "SEVERELY", "SLIGHTLY", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.rust.track.service.IPushMonitorService$LagLevel$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f131522a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/rust/track/service/IPushMonitorService$PushStatus;", "", "Companion", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface PushStatus {
        public static final Companion Companion = Companion.f131523a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/rust/track/service/IPushMonitorService$PushStatus$Companion;", "", "()V", "DOWNGRADE", "", "NORMAL", "features_rust-track_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.rust.track.service.IPushMonitorService$PushStatus$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f131523a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    void mo181594a();
}
