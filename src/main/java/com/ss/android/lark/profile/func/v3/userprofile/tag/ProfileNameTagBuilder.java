package com.ss.android.lark.profile.func.v3.userprofile.tag;

import android.content.Context;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/tag/ProfileNameTagBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isBlocked", "", "isDoNotDisturb", "isFemale", "isFrozen", "isMale", "isResigned", "workStatus", "", "build", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "newBlockTag", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "newDoNotDisturbTag", "newFemaleTag", "newFrozenTag", "newMaleTag", "newResignedTag", "newWorkStatusTag", "text", "setBlocked", "setDoNotDisturb", "setFemale", "setFrozen", "setMale", "setResigned", "setWorkStatus", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.c.b */
public final class ProfileNameTagBuilder {

    /* renamed from: a */
    private boolean f130451a;

    /* renamed from: b */
    private boolean f130452b;

    /* renamed from: c */
    private boolean f130453c;

    /* renamed from: d */
    private boolean f130454d;

    /* renamed from: e */
    private String f130455e;

    /* renamed from: f */
    private boolean f130456f;

    /* renamed from: g */
    private boolean f130457g;

    /* renamed from: h */
    private final Context f130458h;

    /* renamed from: b */
    private final UDTagsDrawable.TagModel m204250b() {
        return C52742c.m204267b(this.f130458h, R.drawable.ud_icon_male_filled, UDTagsDrawable.TagColorSet.DARK_BLUE, 0);
    }

    /* renamed from: c */
    private final UDTagsDrawable.TagModel m204252c() {
        return C52742c.m204267b(this.f130458h, R.drawable.ud_icon_female_filled, UDTagsDrawable.TagColorSet.DARK_CARMINE, 0);
    }

    /* renamed from: d */
    private final UDTagsDrawable.TagModel m204253d() {
        return C52742c.m204265a(this.f130458h, (int) R.string.Lark_NewContacts_BlockedLabel, UDTagsDrawable.TagColorSet.DARK_RAD, 1);
    }

    /* renamed from: e */
    private final UDTagsDrawable.TagModel m204254e() {
        return C52742c.m204267b(this.f130458h, R.drawable.ud_icon_alerts_off_filled, UDTagsDrawable.TagColorSet.DARK_RAD, 2);
    }

    /* renamed from: f */
    private final UDTagsDrawable.TagModel m204255f() {
        return C52742c.m204265a(this.f130458h, (int) R.string.Lark_Profile_AccountPausedLabel, UDTagsDrawable.TagColorSet.DARK_RAD, 1);
    }

    /* renamed from: g */
    private final UDTagsDrawable.TagModel m204256g() {
        return C52742c.m204265a(this.f130458h, (int) R.string.Lark_Legacy_DeactivatedLabel, UDTagsDrawable.TagColorSet.GRAY, 0);
    }

    /* renamed from: a */
    public final UDTagsDrawable mo180194a() {
        boolean z;
        UDTagsDrawable.Builder bVar = new UDTagsDrawable.Builder(this.f130458h);
        if (this.f130457g) {
            bVar.mo91384a(m204256g());
        } else {
            if (this.f130451a) {
                bVar.mo91384a(m204250b());
            } else if (this.f130452b) {
                bVar.mo91384a(m204252c());
            }
            if (this.f130453c) {
                bVar.mo91384a(m204253d());
            }
            if (this.f130456f) {
                bVar.mo91384a(m204255f());
            } else {
                if (this.f130454d) {
                    bVar.mo91384a(m204254e());
                }
                String str = this.f130455e;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        bVar.mo91384a(m204251b(str));
                    }
                }
            }
        }
        return bVar.mo91398i();
    }

    /* renamed from: c */
    public final ProfileNameTagBuilder mo180198c(boolean z) {
        ProfileNameTagBuilder bVar = this;
        bVar.f130453c = z;
        return bVar;
    }

    /* renamed from: d */
    public final ProfileNameTagBuilder mo180199d(boolean z) {
        ProfileNameTagBuilder bVar = this;
        bVar.f130454d = z;
        return bVar;
    }

    /* renamed from: e */
    public final ProfileNameTagBuilder mo180200e(boolean z) {
        ProfileNameTagBuilder bVar = this;
        bVar.f130456f = z;
        return bVar;
    }

    /* renamed from: f */
    public final ProfileNameTagBuilder mo180201f(boolean z) {
        ProfileNameTagBuilder bVar = this;
        bVar.f130457g = z;
        return bVar;
    }

    public ProfileNameTagBuilder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f130458h = context;
    }

    /* renamed from: a */
    public final ProfileNameTagBuilder mo180195a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "workStatus");
        ProfileNameTagBuilder bVar = this;
        bVar.f130455e = str;
        return bVar;
    }

    /* renamed from: b */
    private final UDTagsDrawable.TagModel m204251b(String str) {
        return C52742c.m204266a(this.f130458h, str, UDTagsDrawable.TagColorSet.DARK_RAD, 3);
    }

    /* renamed from: a */
    public final ProfileNameTagBuilder mo180196a(boolean z) {
        ProfileNameTagBuilder bVar = this;
        bVar.f130451a = z;
        bVar.f130452b = false;
        return bVar;
    }

    /* renamed from: b */
    public final ProfileNameTagBuilder mo180197b(boolean z) {
        ProfileNameTagBuilder bVar = this;
        bVar.f130452b = z;
        bVar.f130451a = false;
        return bVar;
    }
}
