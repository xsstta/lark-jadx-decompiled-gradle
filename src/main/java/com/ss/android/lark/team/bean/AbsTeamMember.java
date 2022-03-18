package com.ss.android.lark.team.bean;

import android.graphics.drawable.Drawable;
import com.ss.android.lark.team.entity.PickEntities;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/team/bean/AbsTeamMember;", "", "convertToSearchBaseInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getAvatarDrawable", "Landroid/graphics/drawable/Drawable;", "getAvatarKey", "", "getId", "getName", "memberType", "Lcom/ss/android/lark/team/entity/PickEntities$PickType;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.bean.a */
public interface AbsTeamMember {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.bean.a$a */
    public static final class C55361a {
        /* renamed from: a */
        public static Drawable m214878a(AbsTeamMember aVar) {
            return null;
        }
    }

    Drawable getAvatarDrawable();

    String getAvatarKey();

    String getId();

    PickEntities.PickType memberType();
}
