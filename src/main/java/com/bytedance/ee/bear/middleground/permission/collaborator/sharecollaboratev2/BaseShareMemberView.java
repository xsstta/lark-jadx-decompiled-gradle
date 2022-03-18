package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter;
import com.bytedance.ee.bear.middleground.permission.lock.LockBannerView;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.image.UDAvatarList;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u0000 )*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004:\u0001)B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J(\u0010\u001f\u001a\u00020\u00192\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\u0006\u0010$\u001a\u00020\bH\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/BaseShareMemberView;", "T", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberPresenter;", "Landroid/widget/LinearLayout;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;", "context", "Landroid/content/Context;", ShareHitPoint.f121869d, "", "showDivider", "", "(Landroid/content/Context;IZ)V", "adapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/CollaboratorAvatarAdapter;", "getAdapter", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/CollaboratorAvatarAdapter;", "presenter", "getPresenter", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberPresenter;", "setPresenter", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberPresenter;)V", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberPresenter;", "getType", "()I", "hideLockBanner", "", "hideSkeleton", "init", "initView", "onAttachedToWindow", "onDetachedFromWindow", "showCollaborates", "userInfos", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "count", "showErrorTips", "throwable", "", "showLockBanner", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a */
public abstract class BaseShareMemberView<T extends IShareMemberPresenter> extends LinearLayout implements IShareMemberView {

    /* renamed from: b */
    public static final Companion f25749b = new Companion(null);

    /* renamed from: a */
    protected T f25750a;

    /* renamed from: c */
    private final C9604b f25751c = new C9604b();

    /* renamed from: d */
    private final int f25752d;

    /* renamed from: e */
    private final boolean f25753e;

    /* renamed from: f */
    private HashMap f25754f;

    /* renamed from: a */
    public View mo36752a(int i) {
        if (this.f25754f == null) {
            this.f25754f = new HashMap();
        }
        View view = (View) this.f25754f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25754f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView
    /* renamed from: b */
    public void mo36757b() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/BaseShareMemberView$Companion;", "", "()V", "ALPHA_DISABLE", "", "ALPHA_ENABLE", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final C9604b getAdapter() {
        return this.f25751c;
    }

    public int getType() {
        return this.f25752d;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView
    /* renamed from: a */
    public void mo36753a() {
        ((LockBannerView) mo36752a((int) R.id.lockBanner)).mo37769b();
    }

    public final T getPresenter() {
        T t = this.f25750a;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T t = this.f25750a;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        t.mo36769a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T t = this.f25750a;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        t.mo36771b();
        mo36757b();
    }

    /* renamed from: b */
    private final void m39733b(Context context) {
        mo36754a(context);
    }

    public final void setPresenter(T t) {
        Intrinsics.checkParameterIsNotNull(t, "<set-?>");
        this.f25750a = t;
    }

    /* renamed from: a */
    public void mo36754a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.permission_share_collaborate_view_v2, this);
        ((UDAvatarList) mo36752a((int) R.id.memberList)).setAdapter(this.f25751c);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView
    /* renamed from: a */
    public void mo36755a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (C5203d.m21235a(th, 1002) || C5203d.m21235a(th, 4)) {
            C13479a.m54764b("BaseShareMemberView", "code = delete or forbidden, ignore");
        } else {
            Toast.showFailureText(getContext(), getContext().getString(R.string.Doc_Share_LoadFailed));
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView
    /* renamed from: a */
    public void mo36756a(ArrayList<UserInfo> arrayList, int i) {
        Intrinsics.checkParameterIsNotNull(arrayList, "userInfos");
        this.f25751c.mo36788a(arrayList, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseShareMemberView(Context context, int i, boolean z) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f25752d = i;
        this.f25753e = z;
        m39733b(context);
    }
}
