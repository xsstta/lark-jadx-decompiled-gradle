package com.ss.android.bytedcert.config;

import android.util.Pair;
import java.util.Map;

public interface INetWork {
    int checkResponseException(Throwable th);

    String executeGet(String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) throws Exception;

    String executePost(String str, Map<String, String> map, String str2, Map<String, Object> map2) throws Exception;

    String executePost(String str, Map<String, String> map, Map<String, String> map2, Map<String, Object> map3) throws Exception;

    String executePostFile(String str, Map<String, String> map, Map<String, Pair<String, byte[]>> map2) throws Exception;

    int getExceptionStatusCode(Throwable th);
}
