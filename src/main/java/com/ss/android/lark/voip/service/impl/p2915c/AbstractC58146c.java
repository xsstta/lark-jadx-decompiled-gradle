package com.ss.android.lark.voip.service.impl.p2915c;

import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.vc.irtc.AbstractC61058j;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;

/* renamed from: com.ss.android.lark.voip.service.impl.c.c */
public interface AbstractC58146c {

    /* renamed from: a */
    public static final int[] f143038a = {IByteRtcError.BRERR_INVALID_TOKEN, IByteRtcError.BRERR_JOIN_ROOM_ERROR, IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, IByteRtcError.BRERR_NO_SUBSCRIBE_PERMISSION, IByteRtcError.BRRERR_DUPLICATE_LOGIN, IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE, IByteRtcError.BRERR_INVALID_SDP, IByteRtcError.BRERR_ADM_INIT_FAILE, IByteRtcError.BRERR_START_CALL, IByteRtcError.BRERR_ADM_NO_PERMISSION, -1023, IByteRtcError.BRERR_INM_NO_PERMISSON};

    /* renamed from: a */
    void mo197035a();

    /* renamed from: a */
    void mo197036a(VoiceCall voiceCall, byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    void mo197041a(AbstractC61058j jVar);

    /* renamed from: a */
    void mo197037a(boolean z);

    /* renamed from: b */
    void mo197043b(AbstractC61058j jVar);

    /* renamed from: b */
    void mo197039b(boolean z);

    /* renamed from: c */
    String mo197044c();

    /* renamed from: c */
    void mo197045c(boolean z);

    /* renamed from: d */
    void mo197046d();

    /* renamed from: e */
    void mo197047e();
}
