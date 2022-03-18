package com.bytedance.apm.util;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.ttm.player.MediaPlayer;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.bytedance.apm.util.y */
public class C3143y {
    /* renamed from: a */
    public static String m13087a(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URL(str);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(url.getProtocol());
            stringBuffer.append("://");
            stringBuffer.append(url.getHost());
            if (url.getPort() != -1) {
                stringBuffer.append(":");
                stringBuffer.append(url.getPort());
            }
            stringBuffer.append(url.getPath());
            return stringBuffer.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m13088a(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m13089a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = str + "?";
            }
            str = str.endsWith("?") ? str + m13088a("sdk_version", "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13088a(String.valueOf((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL), "UTF-8") : str + ContainerUtils.FIELD_DELIMITER + m13088a("sdk_version", "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13088a(String.valueOf((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL), "UTF-8");
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        str = str.endsWith("?") ? str + m13088a(entry.getKey().toString(), "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13088a(map.get(entry.getKey()).toString(), "UTF-8") : str + ContainerUtils.FIELD_DELIMITER + m13088a(entry.getKey().toString(), "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13088a(map.get(entry.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str;
    }
}
