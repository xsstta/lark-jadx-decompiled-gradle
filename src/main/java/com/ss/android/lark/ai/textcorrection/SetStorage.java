package com.ss.android.lark.ai.textcorrection;

import android.text.TextUtils;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/SetStorage;", "", "key", "", "(Ljava/lang/String;)V", "cacheSet", "", "getKey", "()Ljava/lang/String;", "spStorage", "Lcom/ss/android/lark/util/share_preference/UserSP;", "add", "", "value", "contains", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.g */
public final class SetStorage {

    /* renamed from: a */
    private final UserSP f71730a;

    /* renamed from: b */
    private Set<String> f71731b;

    /* renamed from: c */
    private final String f71732c;

    /* renamed from: b */
    public final boolean mo101640b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        return this.f71731b.contains(str);
    }

    /* renamed from: a */
    public final boolean mo101639a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        if (this.f71731b.contains(str)) {
            return false;
        }
        this.f71731b.add(str);
        this.f71730a.putJSONArray(this.f71732c, CollectionsKt.toList(this.f71731b));
        return true;
    }

    public SetStorage(String str) {
        UserSP userSP;
        HashSet hashSet;
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f71732c = str;
        AbstractC28534a a = C28522a.m104531a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AIModule.getDependency()");
        if (!TextUtils.isEmpty(a.mo101564e())) {
            AbstractC28534a a2 = C28522a.m104531a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AIModule.getDependency()");
            userSP = UserSP.getUserSPById(a2.mo101564e());
            Intrinsics.checkExpressionValueIsNotNull(userSP, "UserSP.getUserSPById(AIM…Dependency().loginUserId)");
        } else {
            userSP = UserSP.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(userSP, "UserSP.getInstance()");
        }
        this.f71730a = userSP;
        List jSONArray = userSP.getJSONArray(str, String.class);
        if (jSONArray != null) {
            hashSet = new HashSet(jSONArray);
        } else {
            hashSet = new HashSet();
        }
        this.f71731b = hashSet;
    }
}
