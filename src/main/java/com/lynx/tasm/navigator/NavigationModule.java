package com.lynx.tasm.navigator;

import android.content.Context;
import com.lynx.jsbridge.LynxMethod;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.utils.C26959m;
import java.util.HashMap;

public class NavigationModule extends LynxModule {
    public static String NAME = "NavigationModule";

    @LynxMethod
    public String getString() {
        return NAME;
    }

    @LynxMethod
    public void goBack() {
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC269174 */

            public void run() {
                C26925c.m97826a().mo95762b();
            }
        });
    }

    public NavigationModule(Context context) {
        super(context);
    }

    @LynxMethod
    public void registerRoute(final ReadableMap readableMap) {
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC269141 */

            public void run() {
                C26925c.m97826a().mo95760a(readableMap);
            }
        });
    }

    public NavigationModule(Context context, Object obj) {
        super(context, obj);
    }

    @LynxMethod
    public void navigateTo(final String str, final ReadableMap readableMap) {
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC269152 */

            public void run() {
                HashMap<String, Object> hashMap = new HashMap<>();
                ReadableMap readableMap = readableMap;
                if (readableMap != null) {
                    hashMap = readableMap.toHashMap();
                }
                C26925c.m97826a().mo95761a(str, hashMap);
            }
        });
    }

    @LynxMethod
    public void replace(final String str, final ReadableMap readableMap) {
        C26959m.m97969a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC269163 */

            public void run() {
                HashMap<String, Object> hashMap = new HashMap<>();
                ReadableMap readableMap = readableMap;
                if (readableMap != null) {
                    hashMap = readableMap.toHashMap();
                }
                C26925c.m97826a().mo95763b(str, hashMap);
            }
        });
    }
}
