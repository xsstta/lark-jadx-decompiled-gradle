package com.ss.android.lark.mm.module.share.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.share.PermissionDialog;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.permission.PermissionEntry;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJU\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0014J5\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\u000e\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0014R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/module/share/user/UserListItemView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "repoId", "", "user", "Lcom/ss/android/lark/mm/module/share/model/User;", "bindData", "", "allowExternalShare", "", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "onSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isSelected", "init", "setAvatar", "setCheckEnabled", "isEnabled", "setCheckStyleAndAction", "setDesc", "setModifyEnabled", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserListItemView extends RelativeLayout {

    /* renamed from: a */
    public String f118377a;

    /* renamed from: b */
    public User f118378b;

    /* renamed from: c */
    private HashMap f118379c;

    /* renamed from: a */
    public View mo165252a(int i) {
        if (this.f118379c == null) {
            this.f118379c = new HashMap();
        }
        View view = (View) this.f118379c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118379c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m186167a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_user_list_item, this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, UIUtils.dp2px(getContext(), 80.0f)));
    }

    /* renamed from: b */
    private final void m186169b() {
        boolean z;
        String str;
        User user = this.f118378b;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        if (user.isGroup()) {
            BoldTextView boldTextView = (BoldTextView) mo165252a(R.id.tvDesc);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvDesc");
            User user2 = this.f118378b;
            if (user2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String groupDescription = user2.getGroupDescription();
            if (groupDescription == null) {
                groupDescription = ResString.f118656a.mo165504a(R.string.MMWeb_G_GroupNoDescription);
            }
            boldTextView.setText(groupDescription);
        } else {
            BoldTextView boldTextView2 = (BoldTextView) mo165252a(R.id.tvDesc);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvDesc");
            User user3 = this.f118378b;
            if (user3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String departmentName = user3.getDepartmentName();
            if (departmentName != null) {
                str = departmentName;
            } else {
                User user4 = this.f118378b;
                if (user4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("user");
                }
                str = user4.getTenantName();
            }
            boldTextView2.setText(str);
        }
        BoldTextView boldTextView3 = (BoldTextView) mo165252a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvDesc");
        BoldTextView boldTextView4 = (BoldTextView) mo165252a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvDesc");
        CharSequence text = boldTextView4.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        }
        boldTextView3.setVisibility(i);
    }

    /* renamed from: c */
    private final void m186170c() {
        Object tag = ((UDCheckBox) mo165252a(R.id.ivCheck)).getTag(R.id.mm_image_view_tag);
        StringBuilder sb = new StringBuilder();
        User user = this.f118378b;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        sb.append(user.getUserId());
        User user2 = this.f118378b;
        if (user2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        sb.append(user2.getAvatarUrl());
        User user3 = this.f118378b;
        if (user3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        sb.append(user3.getAvatarKey());
        String sb2 = sb.toString();
        if (!Intrinsics.areEqual(tag, sb2)) {
            ((UDCheckBox) mo165252a(R.id.ivCheck)).setTag(R.id.mm_image_view_tag, sb2);
            UDAvatar uDAvatar = (UDAvatar) mo165252a(R.id.ivIcon);
            User user4 = this.f118378b;
            if (user4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String userId = user4.getUserId();
            User user5 = this.f118378b;
            if (user5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            String avatarUrl = user5.getAvatarUrl();
            User user6 = this.f118378b;
            if (user6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("user");
            }
            C45853e.m181659a(uDAvatar, userId, avatarUrl, user6.getAvatarKey());
        }
        ((UDAvatar) mo165252a(R.id.ivIcon)).setOnClickListener(new View$OnClickListenerC47034b(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.user.UserListItemView$c */
    public static final class View$OnClickListenerC47035c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC47035c f118386a = new View$OnClickListenerC47035c();

        View$OnClickListenerC47035c() {
        }

        public final void onClick(View view) {
            C45858j.m181677a((int) R.string.MMWeb_G_NoExternalSharing);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserListItemView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ User m186166a(UserListItemView userListItemView) {
        User user = userListItemView.f118378b;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        return user;
    }

    public final void setModifyEnabled(boolean z) {
        ((PermissionEntry) mo165252a(R.id.permissionAction)).setModifyEnabled(z);
    }

    public final void setCheckEnabled(boolean z) {
        int i;
        UDCheckBox uDCheckBox = (UDCheckBox) mo165252a(R.id.ivCheck);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivCheck");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        uDCheckBox.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.user.UserListItemView$a */
    public static final class View$OnClickListenerC47033a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserListItemView f118380a;

        /* renamed from: b */
        final /* synthetic */ String f118381b;

        /* renamed from: c */
        final /* synthetic */ User f118382c;

        /* renamed from: d */
        final /* synthetic */ boolean f118383d;

        /* renamed from: e */
        final /* synthetic */ SharePermission f118384e;

        View$OnClickListenerC47033a(UserListItemView userListItemView, String str, User user, boolean z, SharePermission sharePermission) {
            this.f118380a = userListItemView;
            this.f118381b = str;
            this.f118382c = user;
            this.f118383d = z;
            this.f118384e = sharePermission;
        }

        public final void onClick(View view) {
            PermissionDialog bVar = new PermissionDialog(this.f118381b, this.f118382c, this.f118383d, this.f118384e);
            Context context = this.f118380a.getContext();
            if (context != null) {
                FragmentManager supportFragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "(context as AppCompatAct…y).supportFragmentManager");
                bVar.mo5511a(supportFragmentManager, "permission");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.user.UserListItemView$b */
    public static final class View$OnClickListenerC47034b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserListItemView f118385a;

        View$OnClickListenerC47034b(UserListItemView userListItemView) {
            this.f118385a = userListItemView;
        }

        public final void onClick(View view) {
            int i;
            C47083e.m186423a(this.f118385a.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("profile_picture").mo165413a("page_name", "detail_page").mo165413a("from_source", UserListItemView.m186166a(this.f118385a).getFromSource()).mo165421c());
            C47083e.m186423a(this.f118385a.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("profile").mo165423e("none").mo165424f(UserListItemView.m186166a(this.f118385a).getFromSource()).mo165421c());
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            IMmDepend.AbstractC45879g hostDepend = a.getHostDepend();
            Context context = this.f118385a.getContext();
            String userId = UserListItemView.m186166a(this.f118385a).getUserId();
            BaseUserType.Companion aVar = BaseUserType.Companion;
            Integer userType = UserListItemView.m186166a(this.f118385a).getUserType();
            if (userType != null) {
                i = userType.intValue();
            } else {
                i = BaseUserType.UNKNOWN.getValue();
            }
            hostDepend.mo144633a(context, userId, aVar.mo161469a(i));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.user.UserListItemView$d */
    public static final class View$OnClickListenerC47036d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserListItemView f118387a;

        /* renamed from: b */
        final /* synthetic */ Function1 f118388b;

        View$OnClickListenerC47036d(UserListItemView userListItemView, Function1 function1) {
            this.f118387a = userListItemView;
            this.f118388b = function1;
        }

        public final void onClick(View view) {
            ShareRepo b;
            UDCheckBox uDCheckBox = (UDCheckBox) this.f118387a.mo165252a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivCheck");
            if (uDCheckBox.isChecked() || (b = ShareRepo.f118326e.mo165209b(this.f118387a.f118377a)) == null || !b.mo165204g()) {
                UDCheckBox uDCheckBox2 = (UDCheckBox) this.f118387a.mo165252a(R.id.ivCheck);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "ivCheck");
                UDCheckBox uDCheckBox3 = (UDCheckBox) this.f118387a.mo165252a(R.id.ivCheck);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "ivCheck");
                uDCheckBox2.setChecked(true ^ uDCheckBox3.isChecked());
                User a = UserListItemView.m186166a(this.f118387a);
                UDCheckBox uDCheckBox4 = (UDCheckBox) this.f118387a.mo165252a(R.id.ivCheck);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "ivCheck");
                a.setSelected(uDCheckBox4.isChecked());
                Function1 function1 = this.f118388b;
                if (function1 != null) {
                    UDCheckBox uDCheckBox5 = (UDCheckBox) this.f118387a.mo165252a(R.id.ivCheck);
                    Intrinsics.checkExpressionValueIsNotNull(uDCheckBox5, "ivCheck");
                    Unit unit = (Unit) function1.invoke(Boolean.valueOf(uDCheckBox5.isChecked()));
                    return;
                }
                return;
            }
            C45858j.m181677a((int) R.string.MMWeb_G_CollaboratorsMaximumReached);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186168a(boolean z, Function1<? super Boolean, Unit> function1) {
        boolean z2;
        UDCheckBox uDCheckBox = (UDCheckBox) mo165252a(R.id.ivCheck);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivCheck");
        uDCheckBox.setClickable(false);
        UDCheckBox uDCheckBox2 = (UDCheckBox) mo165252a(R.id.ivCheck);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "ivCheck");
        User user = this.f118378b;
        if (user == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        uDCheckBox2.setChecked(user.isSelected());
        if (function1 == null) {
            setOnClickListener(null);
            return;
        }
        User user2 = this.f118378b;
        if (user2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("user");
        }
        if (!Intrinsics.areEqual((Object) user2.isExternal(), (Object) true) || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            UDCheckBox uDCheckBox3 = (UDCheckBox) mo165252a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "ivCheck");
            uDCheckBox3.setEnabled(false);
            if (z2) {
                setOnClickListener(View$OnClickListenerC47035c.f118386a);
            } else {
                setOnClickListener(null);
            }
        } else {
            UDCheckBox uDCheckBox4 = (UDCheckBox) mo165252a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "ivCheck");
            uDCheckBox4.setEnabled(true);
            setOnClickListener(new View$OnClickListenerC47036d(this, function1));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserListItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserListItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118377a = "";
        m186167a();
    }

    /* renamed from: a */
    public final void mo165253a(String str, User user, boolean z, boolean z2, SharePermission sharePermission, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        this.f118377a = str;
        this.f118378b = user;
        m186168a(z, function1);
        m186170c();
        ((UserNameView) mo165252a(R.id.userName)).mo165261a(user);
        m186169b();
        ((PermissionEntry) mo165252a(R.id.permissionAction)).mo165180a(user, sharePermission);
        ((PermissionEntry) mo165252a(R.id.permissionAction)).setOnClickListener(new View$OnClickListenerC47033a(this, str, user, z2, sharePermission));
    }
}
