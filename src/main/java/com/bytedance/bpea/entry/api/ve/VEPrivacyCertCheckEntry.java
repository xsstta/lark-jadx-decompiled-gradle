package com.bytedance.bpea.entry.api.ve;

import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.BPEACertAuthEntry;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry;", "", "()V", "AudioRecord", "Camera", "MediaRecorder", "ve-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bpea.a.a.a.a */
public final class VEPrivacyCertCheckEntry {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$AudioRecord;", "", "()V", "Companion", "ve-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bpea.a.a.a.a$a */
    public static final class AudioRecord {

        /* renamed from: a */
        public static final Companion f11327a = new Companion(null);

        @JvmStatic
        /* renamed from: a */
        public static final void m15137a(PrivacyCert privacyCert) throws BPEAException {
            f11327a.mo14440a(privacyCert);
        }

        @JvmStatic
        /* renamed from: b */
        public static final void m15138b(PrivacyCert privacyCert) throws BPEAException {
            f11327a.mo14441b(privacyCert);
        }

        @JvmStatic
        /* renamed from: c */
        public static final void m15139c(PrivacyCert privacyCert) throws BPEAException {
            f11327a.mo14442c(privacyCert);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$AudioRecord$Companion;", "", "()V", "release", "", "privacyCert", "Lcom/bytedance/bpea/basics/PrivacyCert;", "start", "stop", "ve-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.bpea.a.a.a.a$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final void mo14440a(PrivacyCert privacyCert) throws BPEAException {
                BPEACertAuthEntry.f11329a.mo14447b(privacyCert, "startAudioRecord");
            }

            @JvmStatic
            /* renamed from: b */
            public final void mo14441b(PrivacyCert privacyCert) throws BPEAException {
                BPEACertAuthEntry.f11329a.mo14447b(privacyCert, "stopAudioRecord");
            }

            @JvmStatic
            /* renamed from: c */
            public final void mo14442c(PrivacyCert privacyCert) throws BPEAException {
                BPEACertAuthEntry.f11329a.mo14447b(privacyCert, "releaseAudioRecord");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$Camera;", "", "()V", "Companion", "ve-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bpea.a.a.a.a$b */
    public static final class Camera {

        /* renamed from: a */
        public static final Companion f11328a = new Companion(null);

        @JvmStatic
        /* renamed from: a */
        public static final void m15143a(PrivacyCert privacyCert) throws BPEAException {
            f11328a.mo14443a(privacyCert);
        }

        @JvmStatic
        /* renamed from: b */
        public static final void m15144b(PrivacyCert privacyCert) throws BPEAException {
            f11328a.mo14444b(privacyCert);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/bpea/entry/api/ve/VEPrivacyCertCheckEntry$Camera$Companion;", "", "()V", "close", "", "privacyCert", "Lcom/bytedance/bpea/basics/PrivacyCert;", "open", "ve-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.bpea.a.a.a.a$b$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final void mo14443a(PrivacyCert privacyCert) throws BPEAException {
                BPEACertAuthEntry.f11329a.mo14445a(privacyCert, "openCamera");
            }

            @JvmStatic
            /* renamed from: b */
            public final void mo14444b(PrivacyCert privacyCert) throws BPEAException {
                BPEACertAuthEntry.f11329a.mo14445a(privacyCert, "closeCamera");
            }
        }
    }
}
