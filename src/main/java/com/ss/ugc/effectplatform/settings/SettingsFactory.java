package com.ss.ugc.effectplatform.settings;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¨\u0006\b"}, d2 = {"Lcom/ss/ugc/effectplatform/settings/SettingsFactory;", "", "()V", "createSettings", "Lcom/ss/ugc/effectplatform/settings/Setttings;", "name", "", "context", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.g.b */
public final class SettingsFactory {

    /* renamed from: a */
    public static final SettingsFactory f164933a = new SettingsFactory();

    private SettingsFactory() {
    }

    /* renamed from: a */
    public final Setttings mo227815a(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (obj instanceof Context) {
            return new AndroidSettings((Context) obj, str);
        }
        throw new IllegalArgumentException("must parse context arguement in Settings!");
    }
}
