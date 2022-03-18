package com.ss.android.lark.profile.func.v3.edit_profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.edittext.ILengthChecker;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.func.v3.userprofile.p2537d.C52743a;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\"\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0010H\u0014J\u001a\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020\u0010H\u0002J\b\u0010(\u001a\u00020\u0010H\u0002J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/edit_profile/EditAliasFragmentV3;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "aliasDescription", "", "aliasImage", "Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "aliasImageKey", "aliasName", "focusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "hasEdited", "", "userId", "userName", "bindAddImageViewClick", "", "bindAliasImageView", "checkValid", "enableSave", "initArguments", "initView", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFinish", "onViewCreated", "view", "unBindAddImageViewClick", "unBindAliasImageView", "updateAliasImage", "action", "imageKey", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a */
public final class EditAliasFragmentV3 extends BaseFragment {

    /* renamed from: d */
    public static final Companion f130334d = new Companion(null);

    /* renamed from: a */
    public String f130335a = "";

    /* renamed from: b */
    public String f130336b = "";

    /* renamed from: c */
    public boolean f130337c;

    /* renamed from: e */
    private String f130338e = "";

    /* renamed from: f */
    private String f130339f = "";

    /* renamed from: g */
    private String f130340g = "";

    /* renamed from: h */
    private ImageSetPassThrough f130341h;

    /* renamed from: i */
    private final View.OnFocusChangeListener f130342i = new View$OnFocusChangeListenerC52650d(this);

    /* renamed from: j */
    private HashMap f130343j;

    /* renamed from: a */
    public View mo179937a(int i) {
        if (this.f130343j == null) {
            this.f130343j = new HashMap();
        }
        View view = (View) this.f130343j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f130343j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo179939b() {
        HashMap hashMap = this.f130343j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo179939b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/edit_profile/EditAliasFragmentV3$Companion;", "", "()V", "ALIAS_NAME_MAX_LENGTH", "", "DESCRIPTION_MAX_LENGTH", "EXTRA_ACTION", "", "EXTRA_ACTION_CHANGE", "EXTRA_ACTION_DELETE", "EXTRA_IMAGE_KEY", "REQUEST_CODE_ALBUM", "REQUEST_CODE_PREVIEW_IMAGE", "TAG", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/v3/edit_profile/EditAliasFragmentV3$initView$6$1", "Lcom/larksuite/component/universe_design/edittext/ILengthChecker;", "getLength", "", "text", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$i */
    public static final class C52656i implements ILengthChecker {
        C52656i() {
        }

        @Override // com.larksuite.component.universe_design.edittext.ILengthChecker
        /* renamed from: a */
        public int mo90948a(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "text");
            return EditTextLengthFilter.f142484a.mo196212a(charSequence, 0, charSequence.length());
        }
    }

    /* renamed from: g */
    private final void m204061g() {
        UIUtils.hide((TextView) mo179937a(R.id.tv_add_image));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onFinish() {
        KeyboardUtils.hideKeyboard(requireActivity());
        super.onFinish();
    }

    /* renamed from: c */
    private final void m204057c() {
        boolean z;
        if (this.f130335a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165397w("EditAliasFragmentV3", "userId is empty");
            finish();
        }
    }

    /* renamed from: f */
    private final void m204060f() {
        UIUtils.show((TextView) mo179937a(R.id.tv_add_image));
        ((TextView) mo179937a(R.id.tv_add_image)).setOnClickListener(new View$OnClickListenerC52648b(this));
    }

    /* renamed from: d */
    private final void m204058d() {
        String str;
        String str2 = "";
        String string = requireArguments().getString("user_id", str2);
        Intrinsics.checkExpressionValueIsNotNull(string, "requireArguments().getSt…vityV3.EXTRA_USER_ID, \"\")");
        this.f130335a = string;
        String string2 = requireArguments().getString("user_name", str2);
        Intrinsics.checkExpressionValueIsNotNull(string2, "requireArguments().getSt…tyV3.EXTRA_USER_NAME, \"\")");
        this.f130338e = string2;
        String string3 = requireArguments().getString("alias_name", str2);
        Intrinsics.checkExpressionValueIsNotNull(string3, "requireArguments().getSt…yV3.EXTRA_ALIAS_NAME, \"\")");
        this.f130339f = string3;
        String string4 = requireArguments().getString("alias_description", str2);
        Intrinsics.checkExpressionValueIsNotNull(string4, "requireArguments().getSt…RA_ALIAS_DESCRIPTION, \"\")");
        this.f130340g = string4;
        Serializable serializable = requireArguments().getSerializable("alias_image");
        if (!(serializable instanceof ImageSetPassThrough)) {
            serializable = null;
        }
        ImageSetPassThrough imageSetPassThrough = (ImageSetPassThrough) serializable;
        this.f130341h = imageSetPassThrough;
        if (!(imageSetPassThrough == null || (str = imageSetPassThrough.key) == null)) {
            str2 = str;
        }
        this.f130336b = str2;
    }

    /* renamed from: h */
    private final void m204062h() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo179937a(R.id.iv_alias);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        appCompatImageView.setBackgroundColor(UDColorUtils.getColor(requireContext, R.color.bg_content_base));
        appCompatImageView.setOnClickListener(new View$OnClickListenerC52649c(this));
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo179937a(R.id.iv_alias);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "iv_alias");
        ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = null;
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams3 != null) {
            layoutParams3.height = C52743a.m204272a(428);
            layoutParams2 = layoutParams3;
        }
        appCompatImageView.setLayoutParams(layoutParams2);
    }

    /* renamed from: i */
    private final void m204063i() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo179937a(R.id.iv_alias);
        if (appCompatImageView != null) {
            ConstraintLayout.LayoutParams layoutParams = null;
            appCompatImageView.setImageDrawable(null);
            appCompatImageView.setOnClickListener(null);
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            appCompatImageView.setBackgroundColor(UDColorUtils.getColor(requireContext, R.color.udtoken_component_outlined_bg));
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo179937a(R.id.iv_alias);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "iv_alias");
            ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
            if (!(layoutParams2 instanceof ConstraintLayout.LayoutParams)) {
                layoutParams2 = null;
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            if (layoutParams3 != null) {
                layoutParams3.height = C52743a.m204272a(194);
                layoutParams = layoutParams3;
            }
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo179938a() {
        View rightView = ((CommonTitleBar) mo179937a(R.id.alias_title_bar)).getRightView(0);
        if (rightView != null) {
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            ((TextView) rightView).setTextColor(UDColorUtils.getColor(requireContext, R.color.text_link_normal));
            this.f130337c = true;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: e */
    private final void m204059e() {
        boolean z;
        String str;
        int i;
        int i2;
        ((CommonTitleBar) mo179937a(R.id.alias_title_bar)).addAction(new C52651e(this, UIHelper.getString(R.string.Lark_Legacy_Save), R.color.text_disable));
        ((CommonTitleBar) mo179937a(R.id.alias_title_bar)).setLeftClickListener(new View$OnClickListenerC52653f(this));
        ((TextView) mo179937a(R.id.tv_alias_name)).setOnClickListener(View$OnClickListenerC52654g.f130350a);
        UDEditText uDEditText = (UDEditText) mo179937a(R.id.et_name);
        boolean z2 = true;
        if (this.f130339f.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = this.f130339f;
        } else {
            str = this.f130338e;
        }
        uDEditText.setText(str);
        uDEditText.setOnFocusChangeListener(this.f130342i);
        uDEditText.setFilters(new InputFilter[]{new EditTextLengthFilter(24, null, 2, null)});
        ((TextView) mo179937a(R.id.tv_description)).setOnClickListener(View$OnClickListenerC52655h.f130351a);
        UDEditText uDEditText2 = (UDEditText) mo179937a(R.id.et_description);
        uDEditText2.setText(this.f130340g);
        uDEditText2.setOnFocusChangeListener(this.f130342i);
        uDEditText2.setFilters(new InputFilter[]{new EditTextLengthFilter(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, null, 2, null)});
        uDEditText2.mo90925a(new C52656i());
        if (TextUtils.isEmpty(this.f130336b)) {
            m204063i();
            m204060f();
        } else {
            m204061g();
            ImageSetPassThrough imageSetPassThrough = this.f130341h;
            if (imageSetPassThrough != null) {
                ImageLoader.with(requireContext()).load(new PassThroughImage(imageSetPassThrough.key, imageSetPassThrough.fs_unit, imageSetPassThrough.crypto)).into((AppCompatImageView) mo179937a(R.id.iv_alias));
            }
            m204062h();
        }
        UserProfileHitPointV3.Companion aVar = UserProfileHitPointV3.f130746c;
        UDEditText uDEditText3 = (UDEditText) mo179937a(R.id.et_name);
        Intrinsics.checkExpressionValueIsNotNull(uDEditText3, "et_name");
        Editable text = uDEditText3.getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        UDEditText uDEditText4 = (UDEditText) mo179937a(R.id.et_description);
        Intrinsics.checkExpressionValueIsNotNull(uDEditText4, "et_description");
        Editable text2 = uDEditText4.getText();
        if (text2 != null) {
            i2 = text2.length();
        } else {
            i2 = 0;
        }
        if (this.f130336b.length() <= 0) {
            z2 = false;
        }
        aVar.mo180560a(i, i2, z2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$g */
    public static final class View$OnClickListenerC52654g implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC52654g f130350a = new View$OnClickListenerC52654g();

        View$OnClickListenerC52654g() {
        }

        public final void onClick(View view) {
            view.requestFocus();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$h */
    public static final class View$OnClickListenerC52655h implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC52655h f130351a = new View$OnClickListenerC52655h();

        View$OnClickListenerC52655h() {
        }

        public final void onClick(View view) {
            view.requestFocus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/profile/func/v3/edit_profile/EditAliasFragmentV3$initView$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$e */
    public static final class C52651e extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ EditAliasFragmentV3 f130347a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/profile/func/v3/edit_profile/EditAliasFragmentV3$initView$1$performAction$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$e$a */
        public static final class C52652a implements IGetDataCallback<Unit> {

            /* renamed from: a */
            final /* synthetic */ C52651e f130348a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C52652a(C52651e eVar) {
                this.f130348a = eVar;
            }

            /* renamed from: a */
            public void onSuccess(Unit unit) {
                this.f130348a.f130347a.setResult(-1);
                this.f130348a.f130347a.finish();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165397w("EditAliasFragmentV3", "save alias faild");
            }
        }

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            String str;
            String str2;
            if (this.f130347a.f130337c) {
                UIGetDataCallback wrapAndAddGetDataCallback = this.f130347a.mCallbackManager.wrapAndAddGetDataCallback(new C52652a(this));
                UDEditText uDEditText = (UDEditText) this.f130347a.mo179937a(R.id.et_name);
                Intrinsics.checkExpressionValueIsNotNull(uDEditText, "et_name");
                Editable text = uDEditText.getText();
                if (text != null) {
                    str = text;
                }
                String obj = StringsKt.trim(str).toString();
                UDEditText uDEditText2 = (UDEditText) this.f130347a.mo179937a(R.id.et_description);
                Intrinsics.checkExpressionValueIsNotNull(uDEditText2, "et_description");
                Editable text2 = uDEditText2.getText();
                if (text2 != null) {
                    str2 = text2;
                }
                String obj2 = StringsKt.trim(str2).toString();
                EditAliasModel bVar = EditAliasModel.f130352a;
                String str3 = this.f130347a.f130335a;
                String str4 = this.f130347a.f130336b;
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
                bVar.mo179947a(str3, obj, obj2, str4, wrapAndAddGetDataCallback);
                UserProfileHitPointV3.f130746c.mo180605x();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52651e(EditAliasFragmentV3 aVar, String str, int i) {
            super(str, i);
            this.f130347a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$f */
    public static final class View$OnClickListenerC52653f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditAliasFragmentV3 f130349a;

        View$OnClickListenerC52653f(EditAliasFragmentV3 aVar) {
            this.f130349a = aVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180606y();
            this.f130349a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/v3/edit_profile/EditAliasFragmentV3$bindAddImageViewClick$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$b */
    public static final class View$OnClickListenerC52648b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditAliasFragmentV3 f130344a;

        View$OnClickListenerC52648b(EditAliasFragmentV3 aVar) {
            this.f130344a = aVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180551A();
            this.f130344a.mo179938a();
            C52239a.m202617d().mo133547a(this.f130344a.requireActivity(), (AppCompatImageView) this.f130344a.mo179937a(R.id.iv_alias), 529);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/profile/func/v3/edit_profile/EditAliasFragmentV3$bindAliasImageView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$c */
    public static final class View$OnClickListenerC52649c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditAliasFragmentV3 f130345a;

        View$OnClickListenerC52649c(EditAliasFragmentV3 aVar) {
            this.f130345a = aVar;
        }

        public final void onClick(View view) {
            UserProfileHitPointV3.f130746c.mo180607z();
            UserProfileHitPointV3.f130746c.mo180552B();
            this.f130345a.mo179938a();
            C52239a.m202617d().mo133552a(this.f130345a.requireActivity(), this.f130345a.f130336b, this.f130345a.f130335a, (AppCompatImageView) this.f130345a.mo179937a(R.id.iv_alias), 530);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m204058d();
        m204057c();
        m204059e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.edit_profile.a$d */
    static final class View$OnFocusChangeListenerC52650d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ EditAliasFragmentV3 f130346a;

        View$OnFocusChangeListenerC52650d(EditAliasFragmentV3 aVar) {
            this.f130346a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFocusChange(android.view.View r3, boolean r4) {
            /*
                r2 = this;
                if (r4 == 0) goto L_0x0008
                com.ss.android.lark.profile.func.v3.edit_profile.a r3 = r2.f130346a
                r3.mo179938a()
                goto L_0x0049
            L_0x0008:
                com.ss.android.lark.profile.func.v3.edit_profile.a r4 = r2.f130346a
                r0 = 2131299146(0x7f090b4a, float:1.8216285E38)
                android.view.View r4 = r4.mo179937a(r0)
                com.larksuite.component.universe_design.edittext.UDEditText r4 = (com.larksuite.component.universe_design.edittext.UDEditText) r4
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
                boolean r0 = r4.isFocused()
                if (r0 != 0) goto L_0x0036
                com.ss.android.lark.profile.func.v3.edit_profile.a r0 = r2.f130346a
                r1 = 2131299140(0x7f090b44, float:1.8216273E38)
                android.view.View r0 = r0.mo179937a(r1)
                com.larksuite.component.universe_design.edittext.UDEditText r0 = (com.larksuite.component.universe_design.edittext.UDEditText) r0
                java.lang.String r1 = "et_description"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                boolean r0 = r0.isFocused()
                if (r0 != 0) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                if (r0 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r4 = 0
            L_0x003b:
                if (r4 == 0) goto L_0x0049
                java.lang.String r4 = "v"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                android.content.Context r4 = r3.getContext()
                com.larksuite.framework.utils.KeyboardUtils.hideKeyboard(r4, r3)
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.v3.edit_profile.EditAliasFragmentV3.View$OnFocusChangeListenerC52650d.onFocusChange(android.view.View, boolean):void");
        }
    }

    /* renamed from: a */
    private final void m204056a(String str, String str2) {
        boolean z;
        String str3;
        int hashCode = str.hashCode();
        if (hashCode != -1361636432) {
            if (hashCode == -1335458389 && str.equals("delete")) {
                this.f130336b = "";
                m204063i();
                m204060f();
            }
        } else if (str.equals("change")) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str3 = str2;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                this.f130336b = str2;
                m204061g();
                ImageLoader.with(requireContext()).load(new C38824b(str2)).into((AppCompatImageView) mo179937a(R.id.iv_alias));
                m204062h();
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_edit_alias_v3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        Intent intent2;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            if (i2 == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                intent2 = intent;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                String stringExtra = intent.getStringExtra("image_key");
                String str = "";
                if (stringExtra == null) {
                    stringExtra = str;
                }
                Intrinsics.checkExpressionValueIsNotNull(stringExtra, "data.getStringExtra(EXTRA_IMAGE_KEY) ?: \"\"");
                String stringExtra2 = intent.getStringExtra("action");
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "data.getStringExtra(EXTRA_ACTION) ?: \"\"");
                if (i == 529 || i == 530) {
                    m204056a(str, stringExtra);
                }
            }
        }
    }
}
