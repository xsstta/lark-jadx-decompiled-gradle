package com.ss.android.lark.keyboard.hitpoint;

import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/hitpoint/KeyboardHitPointNew;", "", "()V", "TAG", "", "sendImKeyboardClick", "", "keyEvent", "param", "Lcom/ss/android/lark/statistics/extensions/IParam;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.hitpoint.b */
public final class KeyboardHitPointNew {

    /* renamed from: a */
    public static final KeyboardHitPointNew f103323a = new KeyboardHitPointNew();

    private KeyboardHitPointNew() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m160872a(String str, IParam cVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "keyEvent");
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        Map<String, Object> b = ChatParamUtils.m133148b();
        if (b == null || b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            JSONObject json = C54952a.m213205a(b, cVar).toJson();
            Log.m165389i("KeyboardHitPointNew", "sendImKeyboardClick: param json is " + json);
            Statistics.sendEvent(str, json);
        }
    }
}
