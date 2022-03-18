package com.miui.easygo.util;

import android.content.Context;
import android.util.Log;
import com.miui.easygo.sdk.module.EasyGoServer;
import java.util.regex.PatternSyntaxException;

class FunctionUtil extends DatabaseUtil {
    FunctionUtil() {
    }

    public static boolean isAidlSupport(EasyGoServer easyGoServer) {
        String serviceVersion = easyGoServer.getServiceVersion();
        if (isNullOrEmpty(new String[]{serviceVersion})) {
            Log.e("FunctionUtil", "Server version is null or empty.");
            return false;
        }
        try {
            String[] split = serviceVersion.split("\\.");
            String[] split2 = "1.0".split("\\.");
            if (split.length != 2) {
                Log.e("FunctionUtil", "Server version is illegal.");
                return false;
            }
            if (C$r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix.parseUnsignedInt(split[0], 10) <= C$r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix.parseUnsignedInt(split2[0], 10)) {
                return true;
            }
            Log.e("FunctionUtil", "Server version is too high.");
            return false;
        } catch (NumberFormatException e) {
            Log.e("FunctionUtil", "IsAidlSupport exception, e = " + e.getMessage());
            return false;
        } catch (PatternSyntaxException e2) {
            Log.e("FunctionUtil", "IsAidlSupport exception, e = " + e2.getMessage());
            return false;
        }
    }

    public static boolean isLibSupprt(String str) {
        if (isNullOrEmpty(new String[]{str})) {
            Log.e("FunctionUtil", "Aar version is null or empty.");
            return false;
        }
        try {
            String[] split = str.split("\\.");
            String[] split2 = "1.0.1".split("\\.");
            if (split.length != 3) {
                Log.e("FunctionUtil", "Aar version is illegal, aarVer = " + str);
                return false;
            }
            int i = C$r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix.parseUnsignedInt(split2[0], 10);
            int i2 = C$r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix.parseUnsignedInt(split2[1], 10);
            int i3 = C$r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix.parseUnsignedInt(split[0], 10);
            int i4 = C$r8$backportedMethods$utility$Integer$2$parseUnsignedIntWithRadix.parseUnsignedInt(split[1], 10);
            if (i3 > i) {
                Log.e("FunctionUtil", "Aar version is too high, aarVer = " + str);
                return false;
            } else if (i3 != i || i4 <= i2) {
                return true;
            } else {
                Log.e("FunctionUtil", "Aar version is too high, aarVer = " + str);
                return false;
            }
        } catch (NumberFormatException e) {
            Log.e("FunctionUtil", "IsLibSupprt exception, e = " + e.getMessage());
            return false;
        } catch (PatternSyntaxException e2) {
            Log.e("FunctionUtil", "IsLibSupprt exception, e = " + e2.getMessage());
            return false;
        }
    }

    public static EasyGoServer getFunctionInfo(Context context, String str) {
        return queryServerInfo(context, str);
    }
}
