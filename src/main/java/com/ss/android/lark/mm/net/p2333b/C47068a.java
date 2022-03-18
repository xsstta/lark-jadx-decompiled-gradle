package com.ss.android.lark.mm.net.p2333b;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.utils.MmRxThrowable;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.lark.mm.net.b.a */
public class C47068a {

    /* renamed from: a */
    public static final C47068a f118466a = new C47068a(LocationRequest.PRIORITY_HD_ACCURACY, "OK");

    /* renamed from: b */
    public static final C47068a f118467b = new C47068a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, "Bad Request");

    /* renamed from: c */
    public static final C47068a f118468c = new C47068a(401, "Unauthorized");

    /* renamed from: d */
    public static final C47068a f118469d = new C47068a(403, "Forbidden");

    /* renamed from: e */
    public static final C47068a f118470e = new C47068a(404, "Not Found");

    /* renamed from: f */
    public static final C47068a f118471f = new C47068a(409, "Conflict");

    /* renamed from: g */
    public static final C47068a f118472g = new C47068a(410, "Gone");

    /* renamed from: h */
    public static final C47068a f118473h = new C47068a(ParticipantRepo.f117150c, "Internal Server Error");

    /* renamed from: i */
    public static final C47068a f118474i = new C47068a(IByteRtcError.BRERR_JOIN_ROOM_ERROR, "respond json parse exception");

    /* renamed from: j */
    public static final C47068a f118475j = new C47068a(IByteRtcError.BRERR_NO_SUBSCRIBE_PERMISSION, "no cache avaliable exception");

    /* renamed from: k */
    public static final C47068a f118476k = new C47068a(IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, "base info invalid status");

    /* renamed from: l */
    public static final C47068a f118477l = new C47068a(IByteRtcError.BRRERR_DUPLICATE_LOGIN, "buffer is empty");

    /* renamed from: m */
    private int f118478m;

    /* renamed from: n */
    private String f118479n;

    /* renamed from: o */
    private int f118480o;

    public C47068a() {
    }

    /* renamed from: a */
    public int mo165306a() {
        return this.f118478m;
    }

    /* renamed from: b */
    public int mo165307b() {
        return this.f118480o;
    }

    /* renamed from: c */
    public String mo165308c() {
        return this.f118479n;
    }

    /* renamed from: d */
    public MmRxThrowable mo165309d() {
        return new MmRxThrowable(this.f118478m, this.f118479n);
    }

    public String toString() {
        return "mErrorCode=" + this.f118478m + ", mErrorMessage='" + this.f118479n;
    }

    public C47068a(int i, String str) {
        this.f118478m = i;
        this.f118479n = str;
    }

    /* renamed from: a */
    public static C47068a m186323a(int i, String str) {
        if (i == 200) {
            return f118466a;
        }
        if (i == 500) {
            return f118473h;
        }
        if (i == 400) {
            return f118467b;
        }
        if (i == 401) {
            return f118468c;
        }
        if (i == 403) {
            return f118469d;
        }
        if (i == 404) {
            return f118470e;
        }
        if (i == 409) {
            return f118471f;
        }
        if (i != 410) {
            return new C47068a(i, str);
        }
        return f118472g;
    }

    public C47068a(int i, int i2, String str) {
        this.f118478m = i;
        this.f118479n = str;
        this.f118480o = i2;
    }
}
