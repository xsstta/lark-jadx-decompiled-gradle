package com.ss.android.lark.moments.impl.common.widget.keyboard.identity;

import android.app.Activity;
import com.bytedance.lark.pb.moments.v1.AnonymityPolicy;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.rustadapter.setting.UserGlobalConfigAndSettingsManager;
import com.ss.android.lark.pb.moments_entities.MomentUser;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u0010J\u0006\u0010!\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0019J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentityPluginManager;", "", "activity", "Landroid/app/Activity;", "keyboardDependency", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;)V", "getActivity", "()Landroid/app/Activity;", "dependency", "com/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentityPluginManager$dependency$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentityPluginManager$dependency$1;", "getKeyboardDependency", "()Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;", "pluginMap", "", "", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "selectedPlugin", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectedPlugin;", "selectorPlugin", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentitySelectorPlugin;", "categoryChanged", "", "enable", "", "forceDisableAnonymous", "hideIdentityComponent", "identityChanged", "identityType", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "provideAnonymityPlugins", "pluginName", "recoverIdentityComponent", "refreshHasQuota", "hasQuota", "refreshNicknameUser", "nicknameUser", "Lcom/ss/android/lark/pb/moments_entities/MomentUser;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.c */
public final class MomentsIdentityPluginManager {

    /* renamed from: a */
    public final MomentsIdentitySelectorPlugin f119333a;

    /* renamed from: b */
    public final MomentsIdentitySelectedPlugin f119334b;

    /* renamed from: c */
    private final Map<String, IInputSupportAdditionPlugin> f119335c;

    /* renamed from: d */
    private final C47315a f119336d;

    /* renamed from: e */
    private final Activity f119337e;

    /* renamed from: f */
    private final IMomentsKeyboardManagerDependency f119338f;

    /* renamed from: d */
    public final Activity mo166310d() {
        return this.f119337e;
    }

    /* renamed from: e */
    public final IMomentsKeyboardManagerDependency mo166311e() {
        return this.f119338f;
    }

    /* renamed from: c */
    public final void mo166309c() {
        this.f119334b.mo166315d();
    }

    /* renamed from: b */
    public final void mo166307b() {
        this.f119334b.mo166318g();
        this.f119333a.mo166331i();
    }

    /* renamed from: a */
    public final void mo166303a() {
        this.f119334b.mo166317f();
        this.f119333a.mo166332j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/moments/impl/common/widget/keyboard/identity/MomentsIdentityPluginManager$dependency$1", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsIdentityDependency;", "onIdentityChanged", "", "isAnonymous", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "name", "", "avatarKey", "entityId", "onIdentityClicked", "", "show", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.c$a */
    public static final class C47315a implements IMomentsIdentityDependency {

        /* renamed from: a */
        final /* synthetic */ MomentsIdentityPluginManager f119339a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47315a(MomentsIdentityPluginManager cVar) {
            this.f119339a = cVar;
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsIdentityDependency
        /* renamed from: a */
        public void mo166296a(boolean z) {
            if (z) {
                this.f119339a.f119333a.mo166330h();
            } else {
                this.f119339a.f119333a.mo166331i();
            }
        }

        @Override // com.ss.android.lark.moments.impl.common.widget.keyboard.identity.IMomentsIdentityDependency
        /* renamed from: a */
        public boolean mo166297a(MomentsPublishViewModel.IdentityType identityType, String str, String str2, String str3) {
            int i;
            Intrinsics.checkParameterIsNotNull(identityType, "isAnonymous");
            if ((identityType == MomentsPublishViewModel.IdentityType.NICKNAME || identityType == MomentsPublishViewModel.IdentityType.ANONYMOUS) && this.f119339a.mo166311e().mo166301b()) {
                Activity d = this.f119339a.mo166310d();
                if (identityType == MomentsPublishViewModel.IdentityType.ANONYMOUS) {
                    i = R.string.Lark_Community_UnableAnonymousMentionToast;
                } else {
                    i = R.string.Lark_Community_UnableNicknameMentionToast;
                }
                LKUIToast.show(this.f119339a.mo166310d(), UIUtils.getString(d, i));
                return false;
            }
            this.f119339a.mo166311e().mo166299a(identityType);
            if (identityType == MomentsPublishViewModel.IdentityType.NORMAL) {
                this.f119339a.f119334b.mo166316e();
                return true;
            }
            MomentsIdentitySelectedPlugin dVar = this.f119339a.f119334b;
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            dVar.mo166313a(str, str2, str3);
            return true;
        }
    }

    /* renamed from: a */
    public final IInputSupportAdditionPlugin mo166302a(String str) {
        return this.f119335c.get(str);
    }

    /* renamed from: a */
    public final void mo166305a(MomentUser momentUser) {
        Intrinsics.checkParameterIsNotNull(momentUser, "nicknameUser");
        MomentsIdentitySelectorPlugin eVar = this.f119333a;
        String str = momentUser.mname;
        Intrinsics.checkExpressionValueIsNotNull(str, "nicknameUser.mname");
        String str2 = momentUser.mavatar_key;
        Intrinsics.checkExpressionValueIsNotNull(str2, "nicknameUser.mavatar_key");
        String str3 = momentUser.muser_id;
        Intrinsics.checkExpressionValueIsNotNull(str3, "nicknameUser.muser_id");
        eVar.mo166323a(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo166306a(boolean z) {
        if (!z && this.f119338f.mo166298a() != MomentsPublishViewModel.IdentityType.NORMAL) {
            this.f119338f.mo166299a(MomentsPublishViewModel.IdentityType.NORMAL);
            this.f119334b.mo166316e();
            this.f119333a.mo166328f();
        }
        this.f119333a.mo166325c(z);
    }

    /* renamed from: b */
    public final void mo166308b(boolean z) {
        AnonymityPolicy b = UserGlobalConfigAndSettingsManager.f120180a.mo167299b();
        if (!z) {
            if (this.f119338f.mo166298a() != MomentsPublishViewModel.IdentityType.NORMAL && b != null && Intrinsics.areEqual((Object) b.enabled, (Object) true) && b.scope == AnonymityPolicy.Scope.CATEGORY) {
                LKUIToast.show(this.f119337e, (int) R.string.Lark_Community_NoAnonymousInCategoryDesc);
            }
            this.f119338f.mo166299a(MomentsPublishViewModel.IdentityType.NORMAL);
            this.f119334b.mo166316e();
            this.f119333a.mo166328f();
        }
        this.f119333a.mo166324b(z);
        this.f119334b.mo166314b(z);
    }

    /* renamed from: a */
    public final void mo166304a(MomentsPublishViewModel.IdentityType identityType) {
        Intrinsics.checkParameterIsNotNull(identityType, "identityType");
        String str = "";
        if (identityType == MomentsPublishViewModel.IdentityType.NICKNAME) {
            if (this.f119338f.mo166301b()) {
                LKUIToast.show(this.f119337e, UIUtils.getString(this.f119337e, R.string.Lark_Community_UnableNicknameMentionToast));
                return;
            }
            com.bytedance.lark.pb.moments.v1.MomentUser d = UserGlobalConfigAndSettingsManager.f120180a.mo167303d();
            if (d != null) {
                MomentsIdentitySelectedPlugin dVar = this.f119334b;
                String str2 = d.name;
                if (str2 == null) {
                    str2 = str;
                }
                String str3 = d.avatar_key;
                if (str3 == null) {
                    str3 = str;
                }
                String str4 = d.user_id;
                if (str4 != null) {
                    str = str4;
                }
                dVar.mo166313a(str2, str3, str);
                this.f119333a.mo166326d();
            }
        } else if (identityType != MomentsPublishViewModel.IdentityType.ANONYMOUS) {
        } else {
            if (this.f119338f.mo166301b()) {
                LKUIToast.show(this.f119337e, UIUtils.getString(this.f119337e, R.string.Lark_Community_UnableAnonymousMentionToast));
                return;
            }
            String c = UserGlobalConfigAndSettingsManager.f120180a.mo167302c();
            MomentsIdentitySelectedPlugin dVar2 = this.f119334b;
            String string = UIUtils.getString(this.f119337e, R.string.Lark_Community_AnonymousUser);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(activi…_Community_AnonymousUser)");
            dVar2.mo166313a(string, c, str);
            this.f119333a.mo166327e();
        }
    }

    public MomentsIdentityPluginManager(Activity activity, IMomentsKeyboardManagerDependency bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(bVar, "keyboardDependency");
        this.f119337e = activity;
        this.f119338f = bVar;
        HashMap hashMap = new HashMap();
        this.f119335c = hashMap;
        C47315a aVar = new C47315a(this);
        this.f119336d = aVar;
        MomentsIdentitySelectorPlugin eVar = new MomentsIdentitySelectorPlugin(bVar, aVar);
        this.f119333a = eVar;
        MomentsIdentitySelectedPlugin dVar = new MomentsIdentitySelectedPlugin(aVar);
        this.f119334b = dVar;
        hashMap.put("input_addition", dVar);
        hashMap.put("input_pop", eVar);
    }
}
