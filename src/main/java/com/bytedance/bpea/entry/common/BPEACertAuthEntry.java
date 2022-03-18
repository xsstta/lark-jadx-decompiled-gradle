package com.bytedance.bpea.entry.common;

import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.PrivacyCert;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/bpea/entry/common/BPEACertAuthEntry;", "", "()V", "Companion", "common-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bpea.a.b.a */
public final class BPEACertAuthEntry {

    /* renamed from: a */
    public static final Companion f11329a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J/\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J7\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0015"}, d2 = {"Lcom/bytedance/bpea/entry/common/BPEACertAuthEntry$Companion;", "", "()V", "checkAudioCert", "", "cert", "Lcom/bytedance/bpea/basics/PrivacyCert;", "entryType", "", "checkCert", "dataTypes", "", "(Lcom/bytedance/bpea/basics/PrivacyCert;[Ljava/lang/String;Ljava/lang/String;)V", "checkClipboardCert", "checkLocationCert", "checkMediaRecorderCert", "checkSDKCert", "sdkName", "methodName", "(Lcom/bytedance/bpea/basics/PrivacyCert;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "checkVideoCert", "common-entry_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bpea.a.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo14445a(PrivacyCert privacyCert, String str) throws BPEAException {
            Intrinsics.checkParameterIsNotNull(str, "entryType");
            mo14446a(privacyCert, new String[]{"video"}, str);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo14447b(PrivacyCert privacyCert, String str) throws BPEAException {
            Intrinsics.checkParameterIsNotNull(str, "entryType");
            mo14446a(privacyCert, new String[]{"audio"}, str);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo14446a(PrivacyCert privacyCert, String[] strArr, String str) throws BPEAException {
            Intrinsics.checkParameterIsNotNull(str, "entryType");
            PrivacyCertCheckerHolder.f11330a.mo14448a(privacyCert, C3585c.m15151a(strArr, str));
        }
    }
}
