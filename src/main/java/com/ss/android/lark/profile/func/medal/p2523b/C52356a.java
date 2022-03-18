package com.ss.android.lark.profile.func.medal.p2523b;

import com.ss.android.lark.pb.ug.I18nVal;
import com.ss.android.lark.pb.ug.MedalItem;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"parse", "", "Lcom/ss/android/lark/pb/ug/I18nVal;", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalStatus;", "Lcom/ss/android/lark/pb/ug/MedalItem$MedalStatus;", "core_profile_profile_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.b.a */
public final class C52356a {
    /* renamed from: a */
    public static final MedalWallAdapter.MedalStatus m203083a(MedalItem.MedalStatus medalStatus) {
        Intrinsics.checkParameterIsNotNull(medalStatus, "$this$parse");
        int i = C52357b.f129799a[medalStatus.ordinal()];
        if (i == 1) {
            return MedalWallAdapter.MedalStatus.INVALID;
        }
        if (i == 2) {
            return MedalWallAdapter.MedalStatus.VALID;
        }
        if (i != 3) {
            return MedalWallAdapter.MedalStatus.WORN;
        }
        return MedalWallAdapter.MedalStatus.WORN;
    }

    /* renamed from: a */
    public static final String m203084a(I18nVal i18nVal) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(i18nVal, "$this$parse");
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        String i = d.mo133579i();
        Intrinsics.checkExpressionValueIsNotNull(i, "ProfileModule.getDependency().languageLocaleTag");
        if (i != null) {
            String lowerCase = i.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            String str = i18nVal.mi18n_vals.get(lowerCase);
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = i18nVal.mdefault_val;
            }
            if (str != null) {
                return str;
            }
            return "";
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
