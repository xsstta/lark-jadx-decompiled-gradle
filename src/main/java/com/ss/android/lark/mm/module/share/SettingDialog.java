package com.ss.android.lark.mm.module.share;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.C46000a;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.share.InviteActivity;
import com.ss.android.lark.mm.module.share.fragment.FragmentType;
import com.ss.android.lark.mm.module.share.model.LinkShare;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.module.share.setting.CollaboratorsView;
import com.ss.android.lark.mm.module.share.setting.SettingPanel;
import com.ss.android.lark.mm.module.share.social.SocialPanel;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent;
import com.ss.android.lark.mm.widget.BaseDialog;
import com.ss.android.lark.mm.widget.BoldTextView;
import io.reactivex.disposables.C68289a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 @2\u00020\u0001:\u0001@BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0002J\"\u0010+\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010.\u001a\u00020$H\u0002J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u000209H\u0016J\u001a\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0003H\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001c¨\u0006A"}, d2 = {"Lcom/ss/android/lark/mm/module/share/SettingDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "repoId", "", "url", "allowShare", "", "allowLinkShare", "allowExternalShare", "canTransfer", "title", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "trackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "fromSource", "", "(Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;Lcom/ss/android/lark/mm/module/share/model/SharePermission;Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;I)V", "getAllowExternalShare", "()Z", "getAllowLinkShare", "getAllowShare", "getCanTransfer", "comDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getFromSource", "()I", "getRepoId", "()Ljava/lang/String;", "getSelfPermission", "()Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "getTitle", "getTrackContext", "()Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "getUrl", "bindCollaboratorData", "", "userList", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "bindData", "repo", "Lcom/ss/android/lark/mm/module/share/repo/ShareRepo;", "bindSettingData", "linkShare", "Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "initData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.d */
public final class SettingDialog extends BaseDialog {

    /* renamed from: c */
    public static final Companion f118277c = new Companion(null);

    /* renamed from: d */
    private final C68289a f118278d = new C68289a();

    /* renamed from: e */
    private final String f118279e;

    /* renamed from: f */
    private final String f118280f;

    /* renamed from: g */
    private final boolean f118281g;

    /* renamed from: h */
    private final boolean f118282h;

    /* renamed from: i */
    private final boolean f118283i;

    /* renamed from: j */
    private final boolean f118284j;

    /* renamed from: k */
    private final String f118285k;

    /* renamed from: l */
    private final SharePermission f118286l;

    /* renamed from: m */
    private final C47084f f118287m;

    /* renamed from: n */
    private final int f118288n;

    /* renamed from: o */
    private HashMap f118289o;

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f118289o == null) {
            this.f118289o = new HashMap();
        }
        View view = (View) this.f118289o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118289o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f118289o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/share/SettingDialog$Companion;", "", "()V", "create", "Lcom/ss/android/lark/mm/module/share/SettingDialog;", "repoId", "", "url", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "trackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "fromSource", "", "showLazy", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "tag", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/SettingDialog$Companion$showLazy$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.share.d$a$a */
        public static final class C46980a extends Lambda implements Function0<Unit> {
            final /* synthetic */ AppCompatActivity $activity$inlined;
            final /* synthetic */ MmBaseInfo $baseInfo$inlined;
            final /* synthetic */ int $fromSource$inlined;
            final /* synthetic */ String $repoId$inlined;
            final /* synthetic */ String $tag$inlined;
            final /* synthetic */ C47084f $trackContext$inlined;
            final /* synthetic */ String $url$inlined;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46980a(AppCompatActivity appCompatActivity, String str, String str2, MmBaseInfo mmBaseInfo, C47084f fVar, int i, String str3) {
                super(0);
                this.$activity$inlined = appCompatActivity;
                this.$repoId$inlined = str;
                this.$url$inlined = str2;
                this.$baseInfo$inlined = mmBaseInfo;
                this.$trackContext$inlined = fVar;
                this.$fromSource$inlined = i;
                this.$tag$inlined = str3;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                if (this.$activity$inlined.isFinishing() || this.$activity$inlined.isDestroyed()) {
                    ShareRepo.f118326e.mo165208a(this.$repoId$inlined);
                    return;
                }
                SettingDialog a = SettingDialog.f118277c.mo164976a(this.$repoId$inlined, this.$url$inlined, this.$baseInfo$inlined, this.$trackContext$inlined, this.$fromSource$inlined);
                FragmentManager supportFragmentManager = this.$activity$inlined.getSupportFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
                a.mo5511a(supportFragmentManager, this.$tag$inlined);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SettingDialog mo164976a(String str, String str2, MmBaseInfo mmBaseInfo, C47084f fVar, int i) {
            boolean z;
            SharePermission sharePermission;
            boolean z2;
            boolean z3;
            Integer num;
            String str3;
            if (mmBaseInfo != null) {
                z = mmBaseInfo.isAllowShare();
            } else {
                z = false;
            }
            if (mmBaseInfo == null || (sharePermission = C46000a.m182255a(mmBaseInfo)) == null) {
                sharePermission = SharePermission.NONE;
            }
            if (mmBaseInfo != null) {
                z2 = mmBaseInfo.isAllowLinkShare();
            } else {
                z2 = false;
            }
            if (mmBaseInfo != null) {
                z3 = mmBaseInfo.isAllowExternalShare();
            } else {
                z3 = false;
            }
            ObjectStatus.Companion aVar = ObjectStatus.Companion;
            if (mmBaseInfo != null) {
                num = Integer.valueOf(mmBaseInfo.getObjectStatus());
            } else {
                num = null;
            }
            boolean g = aVar.mo161612g(num);
            if (mmBaseInfo == null || (str3 = mmBaseInfo.getTopic()) == null) {
                str3 = "";
            }
            return new SettingDialog(str, str2, z, z2, z3, g, str3, sharePermission, fVar, i);
        }

        /* renamed from: a */
        public final void mo164977a(String str, C47084f fVar, MmBaseInfo mmBaseInfo, AppCompatActivity appCompatActivity, String str2, int i) {
            String a;
            ShareRepo b;
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(appCompatActivity, "activity");
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
            if (!supportFragmentManager.isStateSaved() && (b = ShareRepo.f118326e.mo165209b((a = ShareRepo.f118326e.mo165207a(str, fVar)))) != null) {
                b.mo165196a(new C46980a(appCompatActivity, a, str, mmBaseInfo, fVar, i, str2));
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m186040a(Companion aVar, String str, C47084f fVar, MmBaseInfo mmBaseInfo, AppCompatActivity appCompatActivity, String str2, int i, int i2, Object obj) {
            int i3;
            if ((i2 & 32) != 0) {
                i3 = 14;
            } else {
                i3 = i;
            }
            aVar.mo164977a(str, fVar, mmBaseInfo, appCompatActivity, str2, i3);
        }
    }

    /* renamed from: g */
    public final String mo164970g() {
        return this.f118279e;
    }

    /* renamed from: h */
    public final boolean mo164971h() {
        return this.f118283i;
    }

    /* renamed from: i */
    public final boolean mo164972i() {
        return this.f118284j;
    }

    /* renamed from: j */
    public final SharePermission mo164973j() {
        return this.f118286l;
    }

    /* renamed from: k */
    public final C47084f mo164974k() {
        return this.f118287m;
    }

    /* renamed from: l */
    public final int mo164975l() {
        return this.f118288n;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/SettingDialog$initData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.d$d */
    public static final class C46983d extends Lambda implements Function0<Unit> {
        final /* synthetic */ ShareRepo $this_apply;
        final /* synthetic */ SettingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46983d(ShareRepo shareRepo, SettingDialog dVar) {
            super(0);
            this.$this_apply = shareRepo;
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164969a(this.$this_apply);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.d$e */
    public static final class C46984e extends Lambda implements Function0<Unit> {
        final /* synthetic */ SettingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46984e(SettingDialog dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.u_();
        }
    }

    /* renamed from: m */
    private final void m186029m() {
        ShareRepo b = ShareRepo.f118326e.mo165209b(this.f118279e);
        if (b != null) {
            this.f118278d.mo237937a(b.mo165190a(ShareRepo.DataSource.ShareInfo, new C46983d(b, this)));
            mo164969a(b);
        }
        ((SocialPanel) mo142944a(R.id.socialPanel)).setRepoId(this.f118279e);
        ((SocialPanel) mo142944a(R.id.socialPanel)).mo165244a(this.f118280f, this.f118285k, new C46984e(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isInvite", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.d$b */
    public static final class C46981b extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SettingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46981b(SettingDialog dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            FragmentType fragmentType;
            InviteActivity.Companion aVar = InviteActivity.f118242b;
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            String g = this.this$0.mo164970g();
            if (z) {
                fragmentType = FragmentType.Search;
            } else {
                fragmentType = FragmentType.Permission;
            }
            aVar.mo164949a(requireContext, g, fragmentType, this.this$0.mo164971h(), this.this$0.mo164972i(), this.this$0.mo164973j(), this.this$0.mo164975l());
        }
    }

    /* renamed from: a */
    private final void m186027a(List<User> list) {
        ((CollaboratorsView) mo142944a(R.id.collaboratorEntry)).mo165222a(list, new C46981b(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        this.f118278d.dispose();
        ShareRepo.f118326e.mo165208a(this.f118279e);
    }

    /* renamed from: a */
    public final void mo164969a(ShareRepo shareRepo) {
        List<User> b = shareRepo.mo165199b();
        LinkShare c = shareRepo.mo165201c();
        if (this.f118281g) {
            LinearLayout linearLayout = (LinearLayout) mo142944a(R.id.containerSetting);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerSetting");
            linearLayout.setVisibility(0);
            m186027a(b);
            m186028a(this.f118282h, this.f118283i, c);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo142944a(R.id.containerSocial);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "containerSocial");
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        linearLayout2.setBackground(requireContext.getResources().getDrawable(R.drawable.mm_bg_dialog_share_social));
        ((SocialPanel) mo142944a(R.id.socialPanel)).setDarkMode(true);
        BoldTextView boldTextView = (BoldTextView) mo142944a(R.id.tvSocialTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvSocialTitle");
        boldTextView.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m186029m();
        C47083e.m186424a(this.f118287m, "vc_minutes_share_view");
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public void mo5511a(FragmentManager fragmentManager, String str) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "manager");
        try {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "manager.beginTransaction()");
            beginTransaction.add(this, str).addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
        } catch (IllegalStateException e) {
            C45855f.m181666e("IllegalStateException", e.getMessage());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_dialog_share_setting, viewGroup, false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isOpen", "", "isInternal", "isViewOnly", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.d$c */
    public static final class C46982c extends Lambda implements Function3<Boolean, Boolean, Boolean, Unit> {
        final /* synthetic */ SettingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46982c(SettingDialog dVar) {
            super(3);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, boolean z2, boolean z3) {
            new ClickButtonEvent("link_share", null, Integer.valueOf(z ? 1 : 0), null, null, null, "header_share", 58, null).mo165435a(this.this$0.mo164974k()).mo165437a();
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.this$0.mo164970g());
            if (b != null) {
                b.mo165197a(z, z2, z3);
            }
        }
    }

    /* renamed from: a */
    private final void m186028a(boolean z, boolean z2, LinkShare linkShare) {
        ((SettingPanel) mo142944a(R.id.shareSetting)).mo165236a(z, z2, linkShare, new C46982c(this));
    }

    public SettingDialog(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, SharePermission sharePermission, C47084f fVar, int i) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        this.f118279e = str;
        this.f118280f = str2;
        this.f118281g = z;
        this.f118282h = z2;
        this.f118283i = z3;
        this.f118284j = z4;
        this.f118285k = str3;
        this.f118286l = sharePermission;
        this.f118287m = fVar;
        this.f118288n = i;
    }
}
