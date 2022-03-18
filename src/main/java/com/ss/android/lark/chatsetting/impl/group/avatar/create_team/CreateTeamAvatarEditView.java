package com.ss.android.lark.chatsetting.impl.group.avatar.create_team;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chatsetting.impl.group.avatar.create_team.ICreateTeamAvatarEditContract;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/ICreateTeamAvatarEditContract$IView;", "viewDependency", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;", "activity", "Landroid/app/Activity;", "avatarKey", "", "(Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;Landroid/app/Activity;Ljava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "getViewDependency", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditView$ViewDependency;", "finishWithData", "", "avatarMeta", "Lcom/ss/android/lark/chat/entity/chat/AvatarMeta;", "getAvatarKey", "initDefaultAvatar", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.c */
public final class CreateTeamAvatarEditView extends AvatarEditView implements ICreateTeamAvatarEditContract.IView {

    /* renamed from: a */
    public static final Companion f89274a = new Companion(null);

    /* renamed from: m */
    private final AvatarEditView.AbstractC34588a f89275m;

    /* renamed from: n */
    private final Activity f89276n;

    /* renamed from: o */
    private final String f89277o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/create_team/CreateTeamAvatarEditView$Companion;", "", "()V", "RESULT_AVATAR_KEY", "", "RESULT_AVATAR_META", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: a */
    public String mo127765a() {
        return this.f89277o;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AvatarEditView
    /* renamed from: b */
    public void mo127767b() {
        this.mDefaultAvatar.mo127827a(true, R.drawable.ud_icon_community_tab_filled);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.create_team.ICreateTeamAvatarEditContract.IView
    /* renamed from: a */
    public void mo127766a(String str, AvatarMeta avatarMeta) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(avatarMeta, "avatarMeta");
        Bundle bundle = new Bundle();
        bundle.putString("result_avatar_key", str);
        bundle.putSerializable("result_avatar_meta", avatarMeta);
        this.f89310d.mo127748a(bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateTeamAvatarEditView(AvatarEditView.AbstractC34588a aVar, Activity activity, String str) {
        super(aVar, activity, 1);
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        this.f89275m = aVar;
        this.f89276n = activity;
        this.f89277o = str;
    }
}
