package com.ss.android.ugc.effectmanager.common.utils;

import android.content.res.AssetManager;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/common/utils/AssetUtils;", "", "()V", "loadJson", "", "assetManager", "Landroid/content/res/AssetManager;", "jsonFilePath", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.common.h.a */
public final class AssetUtils {

    /* renamed from: a */
    public static final AssetUtils f151325a = new AssetUtils();

    private AssetUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m235231a(AssetManager assetManager, String str) {
        Throwable th;
        BufferedReader bufferedReader;
        Exception e;
        Exception e2;
        Intrinsics.checkParameterIsNotNull(assetManager, "assetManager");
        BufferedReader bufferedReader2 = null;
        InputStreamReader inputStreamReader = null;
        if (str != null) {
            try {
                InputStreamReader inputStreamReader2 = new InputStreamReader(assetManager.open(str));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader2);
                    try {
                        StringBuilder sb = new StringBuilder();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        while (true) {
                            T t = (T) bufferedReader.readLine();
                            objectRef.element = t;
                            if (t != null) {
                                sb.append((String) objectRef.element);
                            } else {
                                String sb2 = sb.toString();
                                C60524b.m235232a(inputStreamReader2);
                                C60524b.m235232a(bufferedReader);
                                return sb2;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        inputStreamReader = inputStreamReader2;
                        try {
                            EPLog.m235177a("AssetUtils", "#loadJson::jsonFilePath=" + str, e);
                            C60524b.m235232a(inputStreamReader);
                            C60524b.m235232a(bufferedReader);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            C60524b.m235232a(inputStreamReader);
                            C60524b.m235232a(bufferedReader2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader2 = bufferedReader;
                        inputStreamReader = inputStreamReader2;
                        C60524b.m235232a(inputStreamReader);
                        C60524b.m235232a(bufferedReader2);
                        throw th;
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    inputStreamReader = inputStreamReader2;
                    e = e2;
                    bufferedReader = bufferedReader2;
                    EPLog.m235177a("AssetUtils", "#loadJson::jsonFilePath=" + str, e);
                    C60524b.m235232a(inputStreamReader);
                    C60524b.m235232a(bufferedReader);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader = inputStreamReader2;
                    C60524b.m235232a(inputStreamReader);
                    C60524b.m235232a(bufferedReader2);
                    throw th;
                }
            } catch (Exception e5) {
                e2 = e5;
                e = e2;
                bufferedReader = bufferedReader2;
                EPLog.m235177a("AssetUtils", "#loadJson::jsonFilePath=" + str, e);
                C60524b.m235232a(inputStreamReader);
                C60524b.m235232a(bufferedReader);
                return null;
            } catch (Throwable th5) {
                th = th5;
                C60524b.m235232a(inputStreamReader);
                C60524b.m235232a(bufferedReader2);
                throw th;
            }
        } else {
            C60524b.m235232a(inputStreamReader);
            C60524b.m235232a(bufferedReader2);
            return null;
        }
    }
}
