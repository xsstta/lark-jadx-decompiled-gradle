package com.tt.miniapp.p3312p.p3315c;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import android.util.Size;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.tt.miniapp.p3312p.C66567b;
import com.tt.miniapp.p3312p.p3313a.AbstractC66561a;
import com.tt.miniapp.p3312p.p3313a.C66562b;
import java.io.File;

/* renamed from: com.tt.miniapp.p.c.a */
public class C66570a {
    /* renamed from: b */
    public static int m260077b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("MediaEditUtil", "", e);
            return 0;
        }
    }

    /* renamed from: c */
    public static Size m260078c(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (Integer.parseInt(mediaMetadataRetriever.extractMetadata(24)) == 90) {
                return new Size(Integer.parseInt(extractMetadata2), Integer.parseInt(extractMetadata));
            }
            return new Size(Integer.parseInt(extractMetadata), Integer.parseInt(extractMetadata2));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("MediaEditUtil", "", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m260076a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return CharacterUtils.empty();
        }
        File file = new File(str);
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf > 0) {
            name = name.substring(0, lastIndexOf);
        }
        if (name.indexOf("-edited") > 0) {
            str2 = name + "-" + System.currentTimeMillis() + ".mp4";
        } else {
            str2 = name + "-edited" + ".mp4";
        }
        return new File(file.getParentFile(), str2).getAbsolutePath();
    }

    /* renamed from: a */
    public static int m260075a(String str, String str2, C66562b.C66563a[] aVarArr, AbstractC66561a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (aVar != null) {
                aVar.mo88648a(IByteRtcError.BRERR_JOIN_ROOM_ERROR, "empty videoPath");
            }
            return IByteRtcError.BRERR_JOIN_ROOM_ERROR;
        } else if (aVarArr == null || aVarArr.length <= 0) {
            if (aVar != null) {
                aVar.mo88648a(IByteRtcError.BRERR_JOIN_ROOM_ERROR, "audioParams is invalid");
            }
            return IByteRtcError.BRERR_JOIN_ROOM_ERROR;
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = m260076a(str);
            }
            C66562b.C66564b bVar = new C66562b.C66564b();
            bVar.mo232154a(new C66562b.C66565c(str, 0, -1, 1.0f));
            bVar.mo232155a(str2);
            Size c = m260078c(str);
            if (c != null) {
                bVar.mo232152a(c);
            }
            for (C66562b.C66563a aVar2 : aVarArr) {
                if (aVar2 != null) {
                    bVar.mo232153a(aVar2);
                }
            }
            return C66567b.m260068a().mo232158a(bVar.mo232156a(), aVar);
        }
    }
}
