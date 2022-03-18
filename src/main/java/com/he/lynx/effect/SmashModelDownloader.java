package com.he.lynx.effect;

import com.he.lynx.HeliumApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SmashModelDownloader {
    public static IUrlHandler mUrlHandler;
    public static boolean mUseVersionForEffectRender;

    public interface IUrlHandler {
        String smashBaseUrl();
    }

    private static String getDownloadResBase() {
        IUrlHandler iUrlHandler = mUrlHandler;
        if (iUrlHandler != null) {
            return iUrlHandler.smashBaseUrl();
        }
        return null;
    }

    public static ByteBuffer lookup(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "lookup.pkm", null, 131088, "bcb0953ec5694562");
        }
        return requestModel(heliumApp, "lookup.pkm", null, 131088, "bcb0953ec5694562");
    }

    public static ByteBuffer tt_animoji(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "animoji_v5.0.model", "model/animoji/", 624338, "98e091c0a6b756d1");
        }
        return requestModel(heliumApp, "animoji_v5.0.model", "model/animoji/", 624338, "98e091c0a6b756d1");
    }

    public static ByteBuffer tt_face(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "tt_face_v10.0.model", "model/ttfacemodel/", 905491, "bc6ea2bbf900c42a");
        }
        return requestModel(heliumApp, "tt_face_v10.0.model", "model/ttfacemodel/", 905491, "bc6ea2bbf900c42a");
    }

    public static ByteBuffer tt_hairparser(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "tt_hair_v10.0.model", "model/hairparser/", 79992, "829fd1490039ad1a");
        }
        return requestModel(heliumApp, "tt_hair_v10.0.model", "model/hairparser/", 79992, "829fd1490039ad1a");
    }

    public static ByteBuffer tt_hand_box(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "tt_hand_box_reg_v12.0.model", "model/hand/", 529765, "3a20f7832ed58bc9");
        }
        return requestModel(heliumApp, "tt_hand_box_reg_v12.0.model", "model/hand/", 529765, "3a20f7832ed58bc9");
    }

    public static ByteBuffer tt_hand_det(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "tt_hand_det_v11.0.model", "model/hand/", 61985, "140f926684870d0d");
        }
        return requestModel(heliumApp, "tt_hand_det_v11.0.model", "model/hand/", 61985, "140f926684870d0d");
    }

    public static ByteBuffer tt_hand_gesture(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "tt_hand_gesture_v11.0.model", "model/hand/", 225333, "d9ba7886b1ebcdf9");
        }
        return requestModel(heliumApp, "tt_hand_gesture_v11.0.model", "model/hand/", 225333, "d9ba7886b1ebcdf9");
    }

    public static ByteBuffer tt_hand_kp(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "tt_hand_kp_v6.0.model", "model/hand/", 342490, "008b13a07caf7bb3");
        }
        return requestModel(heliumApp, "tt_hand_kp_v6.0.model", "model/hand/", 342490, "008b13a07caf7bb3");
    }

    public static ByteBuffer tt_portrait_matting(HeliumApp heliumApp) {
        if (mUseVersionForEffectRender) {
            return requestModel(heliumApp, "tt_matting_v12.0.model", "model/portrait_matting/", 207045, "b8a7e914fbe800b2");
        }
        return requestModel(heliumApp, "tt_matting_v12.0.model", "model/portrait_matting/", 207045, "b8a7e914fbe800b2");
    }

    private static String sha1(ByteBuffer byteBuffer) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(byteBuffer);
            byte[] digest = instance.digest();
            char[] cArr = new char[16];
            for (int i = 0; i < 8; i++) {
                int i2 = i << 1;
                cArr[i2] = "0123456789abcdef".charAt((digest[i] >> 4) & 15);
                cArr[i2 + 1] = "0123456789abcdef".charAt(digest[i] & 15);
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void lookUpCustom(HeliumApp heliumApp, String str) {
        requestResource("lookUpCustom.png", str + "/Qinyan2Composer/GESticker_qinyanbeauty/generalEffect/resource1/beauty/", 256615, "996e5c8d2bb836f6", getDownloadResBase());
    }

    public static void effect_tt_face(HeliumApp heliumApp, String str) {
        if (mUseVersionForEffectRender) {
            requestResource("tt_face_v10.0.model", str + "/ttfacemodel/", 905491, "bc6ea2bbf900c42a", getDownloadResBase());
            return;
        }
        requestResource("tt_face_v10.0.model", str + "/ttfacemodel/", 905491, "bc6ea2bbf900c42a", getDownloadResBase());
    }

    public static void effect_tt_face_extra(HeliumApp heliumApp, String str) {
        if (mUseVersionForEffectRender) {
            requestResource("tt_face_extra_v12.0.model", str + "/ttfacemodel/", 1035871, "9920c1e0af36abe5", getDownloadResBase());
            return;
        }
        requestResource("tt_face_extra_v12.0.model", str + "/ttfacemodel/", 1035871, "9920c1e0af36abe5", getDownloadResBase());
    }

    public static void effect_tt_skeleton(HeliumApp heliumApp, String str) {
        if (mUseVersionForEffectRender) {
            requestResource("tt_skeleton_v7.0.model", str + "/skeleton_model/", 400587, "4cfff1f96a7f0df4", getDownloadResBase());
            return;
        }
        requestResource("tt_skeleton_v7.0.model", str + "/skeleton_model/", 400587, "4cfff1f96a7f0df4", getDownloadResBase());
    }

    public static void effect_tt_slam(HeliumApp heliumApp, String str) {
        if (mUseVersionForEffectRender) {
            requestResource("ttslammodel_v5.0.model", str + "/slammodel/", 7168, "29b664ebb50aa18f", getDownloadResBase());
            return;
        }
        requestResource("ttslammodel_v5.0.model", str + "/slammodel/", 7168, "29b664ebb50aa18f", getDownloadResBase());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5 A[Catch:{ IOException -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102 A[Catch:{ IOException -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0107 A[Catch:{ IOException -> 0x0268 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer requestModel(com.he.lynx.HeliumApp r23, java.lang.String r24, java.lang.String r25, int r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 703
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.effect.SmashModelDownloader.requestModel(com.he.lynx.HeliumApp, java.lang.String, java.lang.String, int, java.lang.String):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2 A[SYNTHETIC, Splitter:B:33:0x00c2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean requestResource(java.lang.String r18, java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 704
        */
        throw new UnsupportedOperationException("Method not decompiled: com.he.lynx.effect.SmashModelDownloader.requestResource(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):boolean");
    }
}
