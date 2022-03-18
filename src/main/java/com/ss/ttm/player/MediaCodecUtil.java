package com.ss.ttm.player;

import android.util.Log;
import android.util.Pair;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaCodecUtil {
    private static final Map<String, Integer> DOLBY_VISION_STRING_TO_LEVEL;
    private static final Map<String, Integer> DOLBY_VISION_STRING_TO_PROFILE;
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    static {
        HashMap hashMap = new HashMap();
        DOLBY_VISION_STRING_TO_LEVEL = hashMap;
        hashMap.put(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1);
        hashMap.put("02", 2);
        hashMap.put("03", 4);
        hashMap.put("04", 8);
        hashMap.put("05", 16);
        hashMap.put("06", 32);
        hashMap.put("07", 64);
        Integer valueOf = Integer.valueOf((int) SmActions.ACTION_ONTHECALL_EXIT);
        hashMap.put("08", valueOf);
        Integer valueOf2 = Integer.valueOf((int) DynamicModule.f58006b);
        hashMap.put("09", valueOf2);
        HashMap hashMap2 = new HashMap();
        DOLBY_VISION_STRING_TO_PROFILE = hashMap2;
        hashMap2.put("00", 1);
        hashMap2.put(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 2);
        hashMap2.put("02", 4);
        hashMap2.put("03", 8);
        hashMap2.put("04", 16);
        hashMap2.put("05", 32);
        hashMap2.put("06", 64);
        hashMap2.put("07", valueOf);
        hashMap2.put("08", valueOf2);
        hashMap2.put("09", Integer.valueOf((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID));
    }

    public static String getDolbyCodecs(int i, int i2) {
        String str;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        return str + ".0" + i + ".0" + i2;
    }

    public static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer num = DOLBY_VISION_STRING_TO_PROFILE.get(group);
        if (num == null) {
            Log.w("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer num2 = DOLBY_VISION_STRING_TO_LEVEL.get(str2);
        if (num2 != null) {
            return new Pair<>(num, num2);
        }
        Log.w("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }
}
