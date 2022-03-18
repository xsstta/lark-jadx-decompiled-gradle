package com.ss.android.lark.profile.func.v3.userprofile.fields.fragment;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileState;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel;
import com.ss.android.lark.profile.func.v3.userprofile.fields.BinderPoolV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.FieldAdapter;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias.AliasItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias.AliasItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias.IAliasItemDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias_description.AliasAndDescriptionBinder;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias_description.AliasAndDescriptionViewData;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.DepartmentItemListDataSourceV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.DepartmentNameBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.IDepartmentItemDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.description.DescriptionItemBinder;
import com.ss.android.lark.profile.func.v3.userprofile.fields.description.DescriptionViewData;
import com.ss.android.lark.profile.func.v3.userprofile.fields.link.ILinkDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.link.LinkItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.link.LinkItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.list_type.LinkItemListDataSourceV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.list_type.LinkListItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.list_type.TextItemListDataSourceV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.list_type.TextListItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.listinfos.InfoListItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.IPhoneNumberDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.PhoneNumberItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.PhoneNumberItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.status.IStatusDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.status.StatusItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.status.StatusItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.text.ITextDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.text.TextItemBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.text.TextItemViewDataV3;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002QRB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002012\u0006\u00103\u001a\u000204H\u0002J\"\u00105\u001a\u0002012\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010:H\u0016J&\u0010;\u001a\u0004\u0018\u00010\u00192\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u000e\u0010B\u001a\u0002012\u0006\u0010C\u001a\u000204J\u001a\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020\u00192\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001c\u0010F\u001a\u0002012\u0006\u0010C\u001a\u0002042\f\u0010G\u001a\b\u0012\u0004\u0012\u00020'0HJ\b\u0010I\u001a\u000201H\u0002J\u000e\u0010J\u001a\u0002012\u0006\u0010K\u001a\u000207J\u000e\u0010J\u001a\u0002012\u0006\u0010L\u001a\u00020'J\u000e\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020OJ\u0012\u0010P\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010OH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006S"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/larksuite/arch/jack/JackView;", "()V", "dependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$IPersonalInfoDependency;", "fieldAdapter", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/FieldAdapter;", "getFieldAdapter", "()Lcom/ss/android/lark/profile/func/v3/userprofile/fields/FieldAdapter;", "setFieldAdapter", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/FieldAdapter;)V", "launcherService", "Lcom/ss/android/lark/biz/core/api/IProfileLauncherService;", "getLauncherService", "()Lcom/ss/android/lark/biz/core/api/IProfileLauncherService;", "setLauncherService", "(Lcom/ss/android/lark/biz/core/api/IProfileLauncherService;)V", "profileModuleDependency", "Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "getProfileModuleDependency", "()Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;", "setProfileModuleDependency", "(Lcom/ss/android/lark/profile/dependency/IProfileModuleDependency;)V", "rootView", "Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "getViewModel", "()Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getAliasItemDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/IAliasItemDependencyV3;", "getBinderPool", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/BinderPoolV3;", "getDepartmentItemDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/IDepartmentItemDependencyV3;", "getEncryptUserId", "", "getLinkItemDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/ILinkDependencyV3;", "getPhoneNumberDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/IPhoneNumberDependencyV3;", "getStatusItemDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/IStatusDependencyV3;", "getTextItemDependency", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/text/ITextDependencyV3;", "initSubscribe", "", "initView", "context", "Landroid/app/Activity;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onShowPhoneNumberClick", "activity", "onViewCreated", "view", "queryPhoneNumber", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "showPhoneNumberConfirm", "showToast", "msgId", "msg", "updateInfo", "baseViewData", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "updateItemViewData", "Companion", "IPersonalInfoDependency", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
@AndroidEntryPoint
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b */
public final class PersonalInfoFragment extends AbstractC52764a implements JackView {

    /* renamed from: e */
    public static final Companion f130528e = new Companion(null);

    /* renamed from: a */
    public FieldAdapter f130529a;
    @Inject

    /* renamed from: b */
    public AbstractC29542ad f130530b;
    @Inject

    /* renamed from: c */
    public IProfileModuleDependency f130531c;

    /* renamed from: d */
    public final IPersonalInfoDependency f130532d = new C52765c(this);

    /* renamed from: f */
    private final Lazy f130533f;

    /* renamed from: g */
    private View f130534g;

    /* renamed from: h */
    private HashMap f130535h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J8\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$IPersonalInfoDependency;", "", "copy2Clipboard", "", "content", "", "openRouterActivity", "url", "openUrl", "startAliasEditorActivity", "userId", "userName", "aliasName", "aliasDescription", "aliasImage", "Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$b */
    public interface IPersonalInfoDependency {
        /* renamed from: a */
        void mo180292a(String str);

        /* renamed from: a */
        void mo180293a(String str, String str2, String str3, String str4, ImageSetPassThrough imageSetPassThrough);

        /* renamed from: b */
        void mo180294b(String str);

        /* renamed from: c */
        void mo180295c(String str);
    }

    /* renamed from: f */
    public final UserProfileViewModel mo180286f() {
        return (UserProfileViewModel) this.f130533f.getValue();
    }

    /* renamed from: k */
    public void mo180291k() {
        HashMap hashMap = this.f130535h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo180291k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$Companion;", "", "()V", "TAG", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo180283a(Activity activity, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo180286f().withState(new C52777l(this, activity, iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo180284a(BaseInfoViewDataV3 bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "baseViewData");
        FieldAdapter bVar2 = this.f130529a;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
        }
        if (CollectionUtils.isNotEmpty(bVar2.getItems())) {
            int i = 0;
            FieldAdapter bVar3 = this.f130529a;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
            }
            int size = bVar3.getItems().size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                FieldAdapter bVar4 = this.f130529a;
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
                }
                if (TextUtils.equals(((BaseInfoViewDataV3) bVar4.getItems().get(i)).mo180256d(), bVar.mo180256d())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                FieldAdapter bVar5 = this.f130529a;
                if (bVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
                }
                bVar5.getItems().set(i, bVar);
                FieldAdapter bVar6 = this.f130529a;
                if (bVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
                }
                bVar6.notifyItemChanged(i);
                return;
            }
            return;
        }
        FieldAdapter bVar7 = this.f130529a;
        if (bVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
        }
        bVar7.add(bVar);
    }

    /* renamed from: a */
    public final void mo180285a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LKUIToast.show(activity, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$getPhoneNumberDependency$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/phone_number/IPhoneNumberDependencyV3;", "getContext", "Landroid/content/Context;", "onItemClick", "", "phoneNumber", "", "isCompleted", "", "onLongClickItem", "content", "onShowClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$g */
    public static final class C52770g implements IPhoneNumberDependencyV3 {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130540a;

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.IPhoneNumberDependencyV3
        /* renamed from: b */
        public void mo180299b() {
            this.f130540a.mo180290j();
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3
        /* renamed from: a */
        public Context mo180100a() {
            return this.f130540a.getActivity();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$g$a */
        static final class C52771a extends Lambda implements Function1<UserProfileState, Unit> {
            final /* synthetic */ boolean $isCompleted;
            final /* synthetic */ String $phoneNumber;
            final /* synthetic */ C52770g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52771a(C52770g gVar, boolean z, String str) {
                super(1);
                this.this$0 = gVar;
                this.$isCompleted = z;
                this.$phoneNumber = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                invoke(azVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UserProfileState azVar) {
                Intrinsics.checkParameterIsNotNull(azVar, "it");
                if (azVar.mo180006L()) {
                    Log.m165389i("PersonalInfoFragment", "could not call self");
                } else if (!this.$isCompleted || TextUtils.isEmpty(this.$phoneNumber)) {
                    Log.m165389i("PersonalInfoFragment", "phoneNumber is not Completed");
                } else {
                    FragmentActivity activity = this.this$0.f130540a.getActivity();
                    if (activity != null) {
                        ProfileHitPoint.m204731k();
                        this.this$0.f130540a.mo180289i().mo133584n().mo133664a(activity, azVar.mo180022a(), this.$phoneNumber);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52770g(PersonalInfoFragment bVar) {
            this.f130540a = bVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.IPhoneNumberDependencyV3
        /* renamed from: a */
        public void mo180297a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130540a.f130532d.mo180295c(str);
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.IPhoneNumberDependencyV3
        /* renamed from: a */
        public void mo180298a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            this.f130540a.mo180286f().withState(new C52771a(this, z, str));
        }
    }

    /* renamed from: n */
    private final ITextDependencyV3 m204353n() {
        return new C52773i(this);
    }

    /* renamed from: o */
    private final IAliasItemDependencyV3 m204354o() {
        return new C52766d(this);
    }

    /* renamed from: p */
    private final ILinkDependencyV3 m204355p() {
        return new C52769f(this);
    }

    /* renamed from: q */
    private final IStatusDependencyV3 m204356q() {
        return new C52772h(this);
    }

    /* renamed from: r */
    private final IPhoneNumberDependencyV3 m204357r() {
        return new C52770g(this);
    }

    /* renamed from: s */
    private final IDepartmentItemDependencyV3 m204358s() {
        return new C52768e(this);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$getAliasItemDependency$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/alias/IAliasItemDependencyV3;", "getContext", "Landroid/content/Context;", "onAliasItemClick", "", "onAliasItemLongClick", "content", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$d */
    public static final class C52766d implements IAliasItemDependencyV3 {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130537a;

        @Override // com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3
        /* renamed from: a */
        public Context mo180100a() {
            return this.f130537a.getActivity();
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.alias.IAliasItemDependencyV3
        /* renamed from: b */
        public void mo180245b() {
            this.f130537a.mo180286f().withState(new C52767a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$d$a */
        static final class C52767a extends Lambda implements Function1<UserProfileState, Unit> {
            final /* synthetic */ C52766d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52767a(C52766d dVar) {
                super(1);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                invoke(azVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UserProfileState azVar) {
                String str;
                Intrinsics.checkParameterIsNotNull(azVar, "it");
                AliasItemViewDataV3 q = azVar.mo180052q();
                if (q == null || (str = q.mo180242a()) == null) {
                    str = "";
                }
                this.this$0.f130537a.f130532d.mo180293a(azVar.mo180045j(), azVar.mo180022a(), str, azVar.mo180018X(), azVar.mo180019Y());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52766d(PersonalInfoFragment bVar) {
            this.f130537a = bVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.alias.IAliasItemDependencyV3
        /* renamed from: a */
        public void mo180244a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130537a.f130532d.mo180295c(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$getDepartmentItemDependency$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/IDepartmentItemDependencyV3;", "getContext", "Landroid/content/Context;", "onDepartmentItemLongClick", "", "content", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$e */
    public static final class C52768e implements IDepartmentItemDependencyV3 {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130538a;

        @Override // com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3
        /* renamed from: a */
        public Context mo180100a() {
            return this.f130538a.getActivity();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52768e(PersonalInfoFragment bVar) {
            this.f130538a = bVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.department.IDepartmentItemDependencyV3
        /* renamed from: a */
        public void mo180260a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130538a.f130532d.mo180295c(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$getLinkItemDependency$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/link/ILinkDependencyV3;", "getContext", "Landroid/content/Context;", "onItemClick", "", "url", "", "id", "onItemLongClick", "content", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$f */
    public static final class C52769f implements ILinkDependencyV3 {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130539a;

        @Override // com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3
        /* renamed from: a */
        public Context mo180100a() {
            return this.f130539a.getActivity();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52769f(PersonalInfoFragment bVar) {
            this.f130539a = bVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.link.ILinkDependencyV3
        /* renamed from: a */
        public void mo180267a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130539a.f130532d.mo180295c(str);
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.link.ILinkDependencyV3
        /* renamed from: a */
        public void mo180268a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(str2, "id");
            this.f130539a.f130532d.mo180294b(str);
            UserProfileHitPointV3.f130746c.mo180563a(str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$getStatusItemDependency$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/status/IStatusDependencyV3;", "getContext", "Landroid/content/Context;", "onPhoneNumberClick", "", "phoneNumber", "", "onURLClick", "url", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$h */
    public static final class C52772h implements IStatusDependencyV3 {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130541a;

        @Override // com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3
        /* renamed from: a */
        public Context mo180100a() {
            return this.f130541a.getActivity();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52772h(PersonalInfoFragment bVar) {
            this.f130541a = bVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.status.IStatusDependencyV3
        /* renamed from: a */
        public void mo180301a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            this.f130541a.f130532d.mo180292a(str);
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.status.IStatusDependencyV3
        /* renamed from: b */
        public void mo180302b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "phoneNumber");
            FragmentActivity activity = this.f130541a.getActivity();
            if (activity != null) {
                this.f130541a.mo180289i().mo133584n().mo133665a((Context) activity, str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$getTextItemDependency$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/text/ITextDependencyV3;", "getContext", "Landroid/content/Context;", "onTextItemLongClick", "", "content", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$i */
    public static final class C52773i implements ITextDependencyV3 {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130542a;

        @Override // com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3
        /* renamed from: a */
        public Context mo180100a() {
            return this.f130542a.getActivity();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52773i(PersonalInfoFragment bVar) {
            this.f130542a = bVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.text.ITextDependencyV3
        /* renamed from: a */
        public void mo180303a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            this.f130542a.f130532d.mo180295c(str);
        }
    }

    /* renamed from: g */
    public final FieldAdapter mo180287g() {
        FieldAdapter bVar = this.f130529a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
        }
        return bVar;
    }

    /* renamed from: h */
    public final AbstractC29542ad mo180288h() {
        AbstractC29542ad adVar = this.f130530b;
        if (adVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("launcherService");
        }
        return adVar;
    }

    /* renamed from: i */
    public final IProfileModuleDependency mo180289i() {
        IProfileModuleDependency iProfileModuleDependency = this.f130531c;
        if (iProfileModuleDependency == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileModuleDependency");
        }
        return iProfileModuleDependency;
    }

    public PersonalInfoFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserProfileViewModel.class);
        this.f130533f = LazyKt.lazy(new PersonalInfoFragment$$special$$inlined$activityViewModel$1(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    /* renamed from: l */
    private final void m204351l() {
        ISubscriber.C24024a.m87810a(this, mo180286f(), C52780c.INSTANCE, (SubscriptionConfig) null, new C52774j(this), 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo180290j() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            new C25639g(activity).mo89254m(R.string.Lark_Profile_PhoneV7).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Profile_PhoneV8, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Profile_PhoneV9, new DialogInterface$OnClickListenerC52779m(activity, this)).mo89239c();
        }
    }

    /* renamed from: m */
    private final BinderPoolV3 m204352m() {
        BinderPoolV3 aVar = new BinderPoolV3();
        String name = TextItemViewDataV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "TextItemViewDataV3::class.java.name");
        aVar.mo180234a(name, new TextItemBinderV3(m204353n()));
        String name2 = AliasItemViewDataV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "AliasItemViewDataV3::class.java.name");
        aVar.mo180234a(name2, new AliasItemBinderV3(m204354o()));
        String name3 = LinkItemViewDataV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name3, "LinkItemViewDataV3::class.java.name");
        aVar.mo180234a(name3, new LinkItemBinderV3(m204355p()));
        String name4 = StatusItemViewDataV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name4, "StatusItemViewDataV3::class.java.name");
        aVar.mo180234a(name4, new StatusItemBinderV3(m204356q()));
        String name5 = PhoneNumberItemViewDataV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name5, "PhoneNumberItemViewDataV3::class.java.name");
        aVar.mo180234a(name5, new PhoneNumberItemBinderV3(m204357r()));
        String name6 = DepartmentItemListDataSourceV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name6, "DepartmentItemListDataSourceV3::class.java.name");
        aVar.mo180234a(name6, new InfoListItemBinderV3(new DepartmentNameBinderV3(m204358s())));
        String name7 = TextItemListDataSourceV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name7, "TextItemListDataSourceV3::class.java.name");
        aVar.mo180234a(name7, new InfoListItemBinderV3(new TextListItemBinderV3(m204353n())));
        String name8 = LinkItemListDataSourceV3.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name8, "LinkItemListDataSourceV3::class.java.name");
        aVar.mo180234a(name8, new InfoListItemBinderV3(new LinkListItemBinderV3(m204355p())));
        String name9 = AliasAndDescriptionViewData.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name9, "AliasAndDescriptionViewData::class.java.name");
        aVar.mo180234a(name9, new AliasAndDescriptionBinder(m204354o()));
        String name10 = DescriptionViewData.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name10, "DescriptionViewData::class.java.name");
        aVar.mo180234a(name10, new DescriptionItemBinder(m204354o()));
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$onShowPhoneNumberClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$k */
    public static final class C52775k implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130543a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "userProfileState", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$k$a */
        public static final class C52776a extends Lambda implements Function1<UserProfileState, Unit> {
            final /* synthetic */ String $data;
            final /* synthetic */ C52775k this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52776a(C52775k kVar, String str) {
                super(1);
                this.this$0 = kVar;
                this.$data = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
                invoke(azVar);
                return Unit.INSTANCE;
            }

            public final void invoke(UserProfileState azVar) {
                Intrinsics.checkParameterIsNotNull(azVar, "userProfileState");
                PhoneNumberItemViewDataV3 r = azVar.mo180053r();
                if (r != null) {
                    r.mo180329a(true);
                    r.mo180328a(this.$data);
                    this.this$0.f130543a.mo180284a(r);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52775k(PersonalInfoFragment bVar) {
            this.f130543a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f130543a.mo180286f().withState(new C52776a(this, str));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("PersonalInfoFragment", errorResult.getDebugMsg());
            this.f130543a.mo180281a(R.string.Lark_Legacy_ProfileDetailGettingPhoneFailed);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J8\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$dependency$1", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$IPersonalInfoDependency;", "copy2Clipboard", "", "content", "", "openRouterActivity", "url", "openUrl", "startAliasEditorActivity", "userId", "userName", "aliasName", "aliasDescription", "aliasImage", "Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$c */
    public static final class C52765c implements IPersonalInfoDependency {

        /* renamed from: a */
        final /* synthetic */ PersonalInfoFragment f130536a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52765c(PersonalInfoFragment bVar) {
            this.f130536a = bVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.PersonalInfoFragment.IPersonalInfoDependency
        /* renamed from: a */
        public void mo180292a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            FragmentActivity activity = this.f130536a.getActivity();
            if (activity != null) {
                this.f130536a.mo180289i().mo133550a(activity, str);
            }
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.PersonalInfoFragment.IPersonalInfoDependency
        /* renamed from: b */
        public void mo180294b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            FragmentActivity activity = this.f130536a.getActivity();
            if (activity != null) {
                this.f130536a.mo180289i().mo133568d(activity, str);
            }
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.PersonalInfoFragment.IPersonalInfoDependency
        /* renamed from: c */
        public void mo180295c(String str) {
            Object systemService;
            Intrinsics.checkParameterIsNotNull(str, "content");
            FragmentActivity activity = this.f130536a.getActivity();
            if (activity != null && (systemService = activity.getSystemService("clipboard")) != null) {
                String str2 = str;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str2));
                    LKUIToast.show(activity, (int) R.string.Lark_Legacy_Copied);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.PersonalInfoFragment.IPersonalInfoDependency
        /* renamed from: a */
        public void mo180293a(String str, String str2, String str3, String str4, ImageSetPassThrough imageSetPassThrough) {
            Intrinsics.checkParameterIsNotNull(str4, "aliasDescription");
            FragmentActivity activity = this.f130536a.getActivity();
            if (activity == null) {
                return;
            }
            if (C52239a.m202617d().mo133561a("messenger.profile.more_alias")) {
                this.f130536a.mo180288h().mo105568a(this.f130536a.getActivity(), this.f130536a, str, str2, str3, str4, imageSetPassThrough, 529);
                return;
            }
            PersonalInfoFragment bVar = this.f130536a;
            this.f130536a.mo180288h().mo105567a(activity, bVar, str, str2, bVar.mo180286f().getToken(), str3, 529);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$j */
    public static final class C52774j extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ PersonalInfoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52774j(PersonalInfoFragment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(azVar, "$receiver");
            List<BaseInfoViewDataV3> l = azVar.mo180047l();
            if (l == null || l.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.m165397w("PersonalInfoFragment", "fieldViewDataList is empty");
            } else {
                this.this$0.mo180287g().resetAll(azVar.mo180047l());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$l */
    public static final class C52777l extends Lambda implements Function1<UserProfileState, Unit> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ IGetDataCallback $callback;
        final /* synthetic */ PersonalInfoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52777l(PersonalInfoFragment bVar, Activity activity, IGetDataCallback iGetDataCallback) {
            super(1);
            this.this$0 = bVar;
            this.$activity = activity;
            this.$callback = iGetDataCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserProfileState azVar) {
            invoke(azVar);
            return Unit.INSTANCE;
        }

        public final void invoke(UserProfileState azVar) {
            Intrinsics.checkParameterIsNotNull(azVar, "it");
            this.this$0.mo180289i().mo133584n().mo133663a(this.$activity, azVar.mo180045j(), this.this$0.getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<String>(this) {
                /* class com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.PersonalInfoFragment.C52777l.C527781 */

                /* renamed from: a */
                final /* synthetic */ C52777l f130544a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f130544a = r1;
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    this.f130544a.$callback.onSuccess(str);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    Log.m165383e("PersonalInfoFragment", errorResult.getDebugMsg());
                    this.f130544a.$callback.onError(errorResult);
                }
            }));
        }
    }

    /* renamed from: a */
    public final void mo180282a(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        mo180283a(activity, new C52775k(this));
    }

    /* renamed from: b */
    private final void m204350b(Activity activity) {
        View view = this.f130534g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        CommonRecyclerView commonRecyclerView = (CommonRecyclerView) view.findViewById(R.id.rv_fields);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView, "rootView.rv_fields");
        Activity activity2 = activity;
        commonRecyclerView.setLayoutManager(new LinearLayoutManager(activity2, 1, false));
        this.f130529a = new FieldAdapter(activity2, m204352m());
        View view2 = this.f130534g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        CommonRecyclerView commonRecyclerView2 = (CommonRecyclerView) view2.findViewById(R.id.rv_fields);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView2, "rootView.rv_fields");
        FieldAdapter bVar = this.f130529a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fieldAdapter");
        }
        commonRecyclerView2.setAdapter(bVar);
        View view3 = this.f130534g;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        CommonRecyclerView commonRecyclerView3 = (CommonRecyclerView) view3.findViewById(R.id.rv_fields);
        Intrinsics.checkExpressionValueIsNotNull(commonRecyclerView3, "rootView.rv_fields");
        commonRecyclerView3.setItemAnimator(null);
    }

    /* renamed from: a */
    public final void mo180281a(int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = UIUtils.getString(activity, i);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(it, msgId)");
            mo180285a(string);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick", "com/ss/android/lark/profile/func/v3/userprofile/fields/fragment/PersonalInfoFragment$showPhoneNumberConfirm$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.b$m */
    public static final class DialogInterface$OnClickListenerC52779m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f130545a;

        /* renamed from: b */
        final /* synthetic */ PersonalInfoFragment f130546b;

        DialogInterface$OnClickListenerC52779m(FragmentActivity fragmentActivity, PersonalInfoFragment bVar) {
            this.f130545a = fragmentActivity;
            this.f130546b = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PersonalInfoFragment bVar = this.f130546b;
            FragmentActivity fragmentActivity = this.f130545a;
            Intrinsics.checkExpressionValueIsNotNull(fragmentActivity, "it");
            bVar.mo180282a(fragmentActivity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        m204350b(requireActivity);
        m204351l();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo180286f().onActivityResult(i, i2, intent);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_personal_info, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…l_info, container, false)");
        this.f130534g = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }
}
