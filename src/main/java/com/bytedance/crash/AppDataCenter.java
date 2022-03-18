package com.bytedance.crash;

import com.bytedance.crash.runtime.p229c.C3848b;
import com.bytedance.crash.util.ListMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppDataCenter extends ListMap<CrashType, AttachUserData> {
    private ICrashFilter mFilter;
    private final Map<String, String> mTagMap = new HashMap();

    public ICrashFilter getCrashFilter() {
        return this.mFilter;
    }

    public Map<String, String> getTagMap() {
        return this.mTagMap;
    }

    /* access modifiers changed from: package-private */
    public void setCrashFilter(ICrashFilter iCrashFilter) {
        this.mFilter = iCrashFilter;
    }

    public List<AttachUserData> getAttachUserData(CrashType crashType) {
        return getList(crashType);
    }

    /* access modifiers changed from: package-private */
    public void addTags(Map<? extends String, ? extends String> map) {
        this.mTagMap.putAll(map);
        C3848b.m15952c();
    }

    /* access modifiers changed from: package-private */
    public void removeAttachCrashContext(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            removeAll(attachUserData);
        } else {
            removeInList(crashType, attachUserData);
        }
    }

    /* access modifiers changed from: package-private */
    public void addTag(String str, String str2) {
        if (str2 == null) {
            this.mTagMap.remove(str);
        } else {
            this.mTagMap.put(str, str2);
        }
        C3848b.m15952c();
    }

    /* access modifiers changed from: package-private */
    public void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            addMulti(attachUserData, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE, CrashType.CUSTOM_JAVA);
            return;
        }
        add(crashType, attachUserData);
    }
}
