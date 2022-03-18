package com.ss.android.lark.team.bean;

import android.graphics.drawable.Drawable;
import com.ss.android.lark.team.entity.PickEntities;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/bean/FakeFunctionTeamMember;", "Lcom/ss/android/lark/team/bean/AbsTeamMember;", "id", "", "drawable", "Landroid/graphics/drawable/Drawable;", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "convertToSearchBaseInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getAvatarDrawable", "getAvatarKey", "getId", "getName", "memberType", "Lcom/ss/android/lark/team/entity/PickEntities$PickType;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.bean.c */
public final class FakeFunctionTeamMember implements AbsTeamMember {

    /* renamed from: a */
    private final String f136677a;

    /* renamed from: b */
    private final Drawable f136678b;

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public String getAvatarKey() {
        return "";
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public Drawable getAvatarDrawable() {
        return this.f136678b;
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public String getId() {
        return this.f136677a;
    }

    @Override // com.ss.android.lark.team.bean.AbsTeamMember
    public PickEntities.PickType memberType() {
        return PickEntities.PickType.UNKNOWN;
    }

    public FakeFunctionTeamMember(String str, Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f136677a = str;
        this.f136678b = drawable;
    }
}
