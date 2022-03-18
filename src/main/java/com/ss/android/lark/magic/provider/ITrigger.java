package com.ss.android.lark.magic.provider;

import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/magic/provider/ITrigger;", "", "trigger", "", "uniqueTag", "", "scenarioId", "event", "sourceParams", "", "triggerCallback", "Lcom/ss/android/lark/magic/provider/ITrigger$ITriggerCallback;", "ITriggerCallback", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.d.c */
public interface ITrigger {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/magic/provider/ITrigger$ITriggerCallback;", "", "onTriggerResponse", "", "triggerResponse", "Lcom/ss/android/lark/magic/provider/TriggerResponse;", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.magic.d.c$a */
    public interface ITriggerCallback {
        /* renamed from: a */
        void mo150032a(TriggerResponse eVar);
    }

    /* renamed from: a */
    void mo150024a(String str, String str2, String str3, Map<String, String> map, ITriggerCallback aVar);
}
