package com.ss.android.lark.profile.func.v3.userprofile.view;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/view/StatusCardBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "statusAvatarKey", "", "getStatusAvatarKey", "()Ljava/lang/String;", "setStatusAvatarKey", "(Ljava/lang/String;)V", "statusTitle", "getStatusTitle", "setStatusTitle", "avatarKey", "key", "title", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.view.b */
public final class StatusCardBuilder extends UDBaseDialogBuilder<StatusCardBuilder> {

    /* renamed from: a */
    private String f130671a = "";

    /* renamed from: b */
    private String f130672b = "";

    /* renamed from: a */
    public final String mo180475a() {
        return this.f130671a;
    }

    /* renamed from: b */
    public final String mo180477b() {
        return this.f130672b;
    }

    /* renamed from: a */
    public final StatusCardBuilder mo180474a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        StatusCardBuilder bVar = this;
        bVar.f130671a = str;
        return bVar;
    }

    /* renamed from: b */
    public final StatusCardBuilder mo180476b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        StatusCardBuilder bVar = this;
        bVar.f130672b = str;
        return bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusCardBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        controller(new StatusCardController(context));
    }
}
