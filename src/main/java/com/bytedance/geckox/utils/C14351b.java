package com.bytedance.geckox.utils;

import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.geckox.utils.b */
public class C14351b {
    /* renamed from: a */
    public static String m57812a(List<CheckRequestBodyModel.TargetChannel> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        Collections.sort(list, new Comparator<CheckRequestBodyModel.TargetChannel>() {
            /* class com.bytedance.geckox.utils.C14351b.C143521 */

            /* renamed from: a */
            public int compare(CheckRequestBodyModel.TargetChannel targetChannel, CheckRequestBodyModel.TargetChannel targetChannel2) {
                if (targetChannel == null && targetChannel2 == null) {
                    return 0;
                }
                if (targetChannel == null) {
                    return -1;
                }
                if (targetChannel2 == null) {
                    return 1;
                }
                return targetChannel.channelName.compareTo(targetChannel2.channelName);
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (CheckRequestBodyModel.TargetChannel targetChannel : list) {
            if (targetChannel != null && !TextUtils.isEmpty(targetChannel.channelName)) {
                stringBuffer.append(targetChannel.channelName);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m57813a(Map<String, LoopRequestModel> map) {
        TreeMap treeMap = new TreeMap(new Comparator<String>() {
            /* class com.bytedance.geckox.utils.C14351b.C143543 */

            /* renamed from: a */
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        for (String str : map.keySet()) {
            LoopRequestModel loopRequestModel = map.get(str);
            treeMap.put(str, loopRequestModel.getDeployment().getGroupName() + "-" + m57812a(loopRequestModel.getDeployment().getTargetChannels()));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : treeMap.keySet()) {
            stringBuffer.append(str2);
            stringBuffer.append("-");
            stringBuffer.append((String) treeMap.get(str2));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m57811a(String str, Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() {
            /* class com.bytedance.geckox.utils.C14351b.C143532 */

            /* renamed from: a */
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        for (String str2 : map.keySet()) {
            treeMap.put(str2, str + "-" + m57812a(map.get(str2)));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str3 : treeMap.keySet()) {
            stringBuffer.append(str3);
            stringBuffer.append("-");
            stringBuffer.append((String) treeMap.get(str3));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m57814a(Map<String, String> map, String str, String str2, String str3) {
        if (map == null) {
            return null;
        }
        String str4 = map.get(str + "-" + str3);
        if (TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str2)) {
            str4 = map.get(str + "-" + str2);
        }
        if (TextUtils.isEmpty(str4)) {
            return map.get(str);
        }
        return str4;
    }
}
