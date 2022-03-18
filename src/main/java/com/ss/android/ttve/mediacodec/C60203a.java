package com.ss.android.ttve.mediacodec;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.ttve.mediacodec.a */
public class C60203a {

    /* renamed from: d */
    private static Map<String, Integer> f150267d;

    /* renamed from: a */
    public MediaCodecInfo f150268a;

    /* renamed from: b */
    public int f150269b;

    /* renamed from: c */
    public String f150270c;

    /* renamed from: a */
    private static Map<String, Integer> m233983a() {
        Map<String, Integer> map = f150267d;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        f150267d = treeMap;
        treeMap.put("OMX.qcom.video.decoder.avc", 100);
        f150267d.put("OMX.qcom.video.decoder.hevc", 100);
        f150267d.put("OMX.qcom.video.decoder.hevcswvdec", 20);
        f150267d.put("OMX.qcom.video.decoder.mpeg4", 100);
        f150267d.put("OMX.qcom.video.decoder.mpeg2", 100);
        f150267d.put("OMX.qcom.video.decoder.vp8", 100);
        f150267d.put("OMX.qcom.video.decoder.vp9", 100);
        f150267d.put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
        f150267d.put("OMX.MTK.VIDEO.DECODER.AVC", 100);
        f150267d.put("OMX.MTK.VIDEO.DECODER.MPEG2", 100);
        f150267d.put("OMX.MTK.VIDEO.DECODER.MPEG4", 100);
        f150267d.put("OMX.MTK.VIDEO.DECODER.VP9", 100);
        f150267d.put("OMX.MTK.VIDEO.DECODER.VPX", 100);
        f150267d.put("OMX.Nvidia.h264.decode", 100);
        f150267d.put("OMX.Intel.hw_vd.h264", 100);
        f150267d.put("OMX.Intel.VideoDecoder.AVC", 99);
        f150267d.put("OMX.SEC.avc.dec", 100);
        f150267d.put("OMX.SEC.AVC.Decoder", 99);
        f150267d.put("OMX.SEC.avcdec", 98);
        f150267d.put("OMX.SEC.avc.sw.dec", 20);
        f150267d.put("OMX.SEC.hevc.sw.dec", 20);
        f150267d.put("OMX.SEC.mpeg4.dec", 100);
        f150267d.put("OMX.SEC.mpeg2.dec", 100);
        f150267d.put("OMX.SEC.vp8.dec", 100);
        f150267d.put("OMX.SEC.vp9.dec", 100);
        f150267d.put("OMX.Exynos.avc.dec", 100);
        f150267d.put("OMX.Exynos.AVC.Decoder", 99);
        f150267d.put("OMX.Exynos.MPEG4.Decoder", 100);
        f150267d.put("OMX.Exynos.MPEG2.Decoder", 100);
        f150267d.put("OMX.Exynos.VP8.Decoder", 100);
        f150267d.put("OMX.Exynos.VP9.Decoder", 100);
        f150267d.put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
        f150267d.put("OMX.rk.video_decoder.avc", 100);
        f150267d.put("OMX.amlogic.avc.decoder.awesome", 100);
        f150267d.put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
        f150267d.put("OMX.brcm.video.h264.hw.decoder", 40);
        f150267d.put("OMX.k3.video.decoder.avc", 40);
        f150267d.put("OMX.IMG.MSVDX.Decoder.AVC", 100);
        f150267d.put("OMX.hisi.video.decoder.avc", 100);
        f150267d.put("OMX.hisi.video.decoder.hevc", 100);
        f150267d.put("OMX.hisi.video.decoder.mpeg4", 100);
        f150267d.put("OMX.hisi.video.decoder.mpeg2", 100);
        f150267d.put("OMX.hisi.video.decoder.vp8", 100);
        f150267d.put("OMX.hisi.video.decoder.vp9", 100);
        f150267d.put("OMX.MARVELL.VIDEO.H264DECODER", 20);
        f150267d.put("OMX.sprd.soft.h264.decoder", 20);
        return f150267d;
    }

    /* renamed from: a */
    public static C60203a m233982a(MediaCodecInfo mediaCodecInfo, String str) {
        if (mediaCodecInfo == null) {
            return null;
        }
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        Integer num = m233983a().get(name);
        int i = 60;
        if (num != null) {
            i = num.intValue();
        } else {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                    i = 70;
                }
            } catch (Exception unused) {
            }
        }
        C60203a aVar = new C60203a();
        aVar.f150268a = mediaCodecInfo;
        aVar.f150270c = str;
        aVar.f150269b = i;
        return aVar;
    }
}
