package com.bytedance.ee.bear.browser.plugin.lazy;

public enum PluginMountStrategy {
    Immediate,
    FirstFind,
    FirstJSCall,
    LoadFinish
}
