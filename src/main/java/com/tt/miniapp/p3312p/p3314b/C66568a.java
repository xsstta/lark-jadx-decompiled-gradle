package com.tt.miniapp.p3312p.p3314b;

import android.media.MediaMetadataRetriever;
import android.util.Size;
import android.util.SparseArray;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.tt.miniapp.p3312p.p3313a.AbstractC66561a;
import com.tt.miniapp.p3312p.p3313a.AbstractC66566c;
import com.tt.miniapp.p3312p.p3313a.C66562b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.p3399t.AbstractC67687c;
import com.tt.option.p3399t.AbstractC67688d;
import java.io.File;

/* renamed from: com.tt.miniapp.p.b.a */
public class C66568a implements AbstractC66566c {

    /* renamed from: a */
    public SparseArray<AbstractC67687c> f168089a = new SparseArray<>();

    /* renamed from: b */
    private String f168090b = (AppbrandContext.getInst().getApplicationContext().getExternalCacheDir() + File.separator + "VideoEdit");

    @Override // com.tt.miniapp.p3312p.p3313a.AbstractC66566c
    /* renamed from: b */
    public int mo232159b() {
        return this.f168089a.size();
    }

    /* renamed from: a */
    private static int m260071a() {
        return ContextSingletonInstance.getInstance().mediaTaskId.getAndIncrement();
    }

    public C66568a() {
        File file = new File(this.f168090b);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    private int m260072a(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("MediaEditImpl", "", e);
            return 0;
        }
    }

    @Override // com.tt.miniapp.p3312p.p3313a.AbstractC66566c
    /* renamed from: a */
    public int mo232158a(C66562b bVar, final AbstractC66561a aVar) {
        char c;
        final AbstractC67687c videoEditor = HostDependManager.getInst().getVideoEditor(AppbrandContext.getInst().getApplicationContext(), this.f168090b);
        if (videoEditor == null) {
            if (aVar != null) {
                aVar.mo88648a(IByteRtcError.BRERR_INVALID_TOKEN, "getVideoEditor fail");
            }
            return IByteRtcError.BRERR_INVALID_TOKEN;
        }
        final int a = m260071a();
        int size = bVar.mo232148c().size();
        if (size == 0) {
            if (aVar != null) {
                aVar.mo88648a(IByteRtcError.BRERR_JOIN_ROOM_ERROR, "invalid params,videoPath can not be empty");
            }
            return IByteRtcError.BRERR_JOIN_ROOM_ERROR;
        }
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int i = size - 1;
        String[] strArr2 = new String[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            C66562b.C66565c cVar = bVar.mo232148c().get(i3);
            strArr[i3] = cVar.f168084a;
            iArr[i3] = cVar.f168085b;
            iArr2[i3] = cVar.f168086c;
            fArr[i3] = cVar.f168087d;
            if (iArr[i3] < 0) {
                iArr[i3] = i2;
            }
            if (iArr2[i3] == -1) {
                iArr2[i3] = m260072a(strArr[i3]);
            }
            AppBrandLogger.m52828d("MediaEditImpl", "VideoElement: " + cVar.toString());
            if (i3 < i) {
                if (i3 < bVar.mo232150e().size()) {
                    strArr2[i3] = bVar.mo232150e().get(i3);
                } else {
                    strArr2[i3] = "";
                }
                AppBrandLogger.m52828d("MediaEditImpl", "Transition: " + strArr2[i3]);
            }
            i3++;
            size = size;
            i2 = 0;
        }
        int a2 = videoEditor.mo234949a(strArr, iArr, iArr2, strArr2, fArr);
        if (a2 == 0) {
            for (C66562b.C66563a aVar2 : bVar.mo232149d()) {
                if (aVar2.f168072b < 0) {
                    aVar2.f168072b = 0;
                }
                if (aVar2.f168073c == -1) {
                    aVar2.f168073c = m260072a(aVar2.f168071a);
                }
                if (aVar2.f168074d < 0) {
                    c = 0;
                    aVar2.f168074d = 0;
                } else {
                    c = 0;
                }
                if (aVar2.f168075e == -1) {
                    aVar2.f168075e = m260072a(strArr[c]);
                }
                AppBrandLogger.m52828d("MediaEditImpl", "AudioElement: " + aVar2);
                videoEditor.mo234948a(aVar2.f168071a, aVar2.f168072b, aVar2.f168073c, aVar2.f168074d, aVar2.f168075e);
            }
            videoEditor.mo234947a();
            Size b = bVar.mo232147b();
            final long currentTimeMillis = System.currentTimeMillis();
            final String a3 = bVar.mo232146a();
            if (!videoEditor.mo234950a(a3, b, new AbstractC67688d() {
                /* class com.tt.miniapp.p3312p.p3314b.C66568a.C665691 */
            })) {
                if (aVar != null) {
                    aVar.mo88648a(IByteRtcError.BRRERR_DUPLICATE_LOGIN, "VideoEditor compile return fail");
                }
                return IByteRtcError.BRRERR_DUPLICATE_LOGIN;
            }
            this.f168089a.put(a, videoEditor);
            return a;
        } else if (aVar == null) {
            return IByteRtcError.BRERR_JOIN_ROOM_ERROR;
        } else {
            aVar.mo88648a(a2, "VideoEditor init fail,maybe params invalid,please check");
            return IByteRtcError.BRERR_JOIN_ROOM_ERROR;
        }
    }
}
