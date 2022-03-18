package com.ss.android.lark.keyboard.plugin.input;

import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "", "()V", "map", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "get", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "put", "", "value", "putAll", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.j */
public final class TransationData {

    /* renamed from: a */
    private HashMap<String, Object> f103507a = new HashMap<>();

    /* renamed from: a */
    public final <T> T mo147174a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return (T) this.f103507a.get(str);
    }

    /* renamed from: a */
    public final void mo147175a(TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f103507a.putAll(jVar.f103507a);
    }

    /* renamed from: a */
    public final void mo147176a(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (obj != null) {
            this.f103507a.put(str, obj);
        }
    }
}
