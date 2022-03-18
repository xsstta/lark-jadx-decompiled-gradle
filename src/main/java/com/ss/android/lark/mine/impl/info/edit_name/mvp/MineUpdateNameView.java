package com.ss.android.lark.mine.impl.info.edit_name.mvp;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.common.C45422a;
import com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020&H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView;", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView;", "activity", "Landroid/app/Activity;", "viewDependency", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView$ViewDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView$ViewDependency;)V", "mMineNameClearBtnIV", "Landroid/widget/ImageView;", "getMMineNameClearBtnIV$core_mine_release", "()Landroid/widget/ImageView;", "setMMineNameClearBtnIV$core_mine_release", "(Landroid/widget/ImageView;)V", "mMineNameEditET", "Landroid/widget/EditText;", "getMMineNameEditET$core_mine_release", "()Landroid/widget/EditText;", "setMMineNameEditET$core_mine_release", "(Landroid/widget/EditText;)V", "mRightTV", "Landroid/widget/TextView;", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "getMTitleBar$core_mine_release", "()Lcom/ss/android/lark/ui/CommonTitleBar;", "setMTitleBar$core_mine_release", "(Lcom/ss/android/lark/ui/CommonTitleBar;)V", "mViewDelegate", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView$Delegate;", "create", "", "destroy", "initNameEdit", "initTitleBar", "initView", "onTitleRightTvClick", "setMineNamResult", "mineName", "", "setViewDelegate", "viewDelegate", "showMineName", "showToast", "content", "Companion", "ViewDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MineUpdateNameView implements IMineUpdateNameContract.IView {

    /* renamed from: a */
    public static final Companion f115524a = new Companion(null);

    /* renamed from: b */
    private IMineUpdateNameContract.IView.Delegate f115525b;

    /* renamed from: c */
    private TextView f115526c;

    /* renamed from: d */
    private final Activity f115527d;

    /* renamed from: e */
    private ViewDependency f115528e;
    @BindView(7378)
    public ImageView mMineNameClearBtnIV;
    @BindView(7379)
    public EditText mMineNameEditET;
    @BindView(7941)
    public CommonTitleBar mTitleBar;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView$ViewDependency;", "", "injectView", "", "targetView", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView;", "setNewMineNameResult", "newName", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo160960a(MineUpdateNameView mineUpdateNameView);

        /* renamed from: a */
        void mo160961a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView$Companion;", "", "()V", "MINE_NAME_EDIT_MAX_LENGTH", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m181361d() {
        m181363f();
        m181362e();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f115528e = null;
    }

    /* renamed from: a */
    public final EditText mo160962a() {
        EditText editText = this.mMineNameEditET;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMineNameEditET");
        }
        return editText;
    }

    /* renamed from: b */
    public final ImageView mo160965b() {
        ImageView imageView = this.mMineNameClearBtnIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMineNameClearBtnIV");
        }
        return imageView;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        ViewDependency bVar = this.f115528e;
        if (bVar != null) {
            bVar.mo160960a(this);
        }
        m181361d();
    }

    /* renamed from: e */
    private final void m181362e() {
        EditText editText = this.mMineNameEditET;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMineNameEditET");
        }
        editText.addTextChangedListener(new C45768d(editText, 32, editText, this));
        ImageView imageView = this.mMineNameClearBtnIV;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMineNameClearBtnIV");
        }
        imageView.setOnClickListener(new View$OnClickListenerC45767c(this));
    }

    /* renamed from: f */
    private final void m181363f() {
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setTitle(UIHelper.getString(R.string.Lark_Setting_NameEdit));
        commonTitleBar.addAction(new C45769e(UIHelper.getString(R.string.Lark_Setting_NameSave), this));
        TextView rightText = commonTitleBar.getRightText();
        Intrinsics.checkExpressionValueIsNotNull(rightText, "rightText");
        this.f115526c = rightText;
        if (rightText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRightTV");
        }
        rightText.setTextColor(UIHelper.getColor(R.color.lkui_B500));
    }

    /* renamed from: c */
    public final void mo160967c() {
        MineUpdateNameView mineUpdateNameView;
        EditText editText = this.mMineNameEditET;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMineNameEditET");
        }
        String obj = editText.getText().toString();
        if (obj != null) {
            if (!TextUtils.isEmpty(StringsKt.trim((CharSequence) obj).toString())) {
                mineUpdateNameView = this;
            } else {
                mineUpdateNameView = null;
            }
            MineUpdateNameView mineUpdateNameView2 = mineUpdateNameView;
            if (mineUpdateNameView2 != null) {
                KeyboardUtils.hideKeyboard(mineUpdateNameView2.f115527d);
                IMineUpdateNameContract.IView.Delegate aVar = mineUpdateNameView2.f115525b;
                if (aVar != null) {
                    EditText editText2 = mineUpdateNameView2.mMineNameEditET;
                    if (editText2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMineNameEditET");
                    }
                    aVar.mo160972a(editText2.getText().toString());
                }
                if (mineUpdateNameView2 != null) {
                    return;
                }
            }
            String string = UIHelper.getString(R.string.Lark_Setting_NameNoneRemind);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…k_Setting_NameNoneRemind)");
            mo160968c(string);
            Unit unit = Unit.INSTANCE;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    public void setViewDelegate(IMineUpdateNameContract.IView.Delegate aVar) {
        this.f115525b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView$initTitleBar$1$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView$e */
    public static final class C45769e extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ MineUpdateNameView f115532a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f115532a.mo160967c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45769e(String str, MineUpdateNameView mineUpdateNameView) {
            super(str);
            this.f115532a = mineUpdateNameView;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView$initNameEdit$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView$c */
    public static final class View$OnClickListenerC45767c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MineUpdateNameView f115529a;

        View$OnClickListenerC45767c(MineUpdateNameView mineUpdateNameView) {
            this.f115529a = mineUpdateNameView;
        }

        public final void onClick(View view) {
            this.f115529a.mo160962a().setText("");
        }
    }

    @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract.IView
    /* renamed from: c */
    public void mo160968c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        LKUIToast.show(this.f115527d, str);
    }

    @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract.IView
    /* renamed from: a */
    public void mo160964a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mineName");
        EditText editText = this.mMineNameEditET;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMineNameEditET");
        }
        editText.setText(str);
        editText.requestFocus();
    }

    @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract.IView
    /* renamed from: b */
    public void mo160966b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mineName");
        ViewDependency bVar = this.f115528e;
        if (bVar != null) {
            bVar.mo160961a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameView$initNameEdit$1$1", "Lcom/ss/android/lark/mine/common/AsciiTextWatcher;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.MineUpdateNameView$d */
    public static final class C45768d extends C45422a {

        /* renamed from: a */
        final /* synthetic */ EditText f115530a;

        /* renamed from: b */
        final /* synthetic */ MineUpdateNameView f115531b;

        @Override // com.ss.android.lark.mine.common.C45422a
        public void afterTextChanged(Editable editable) {
            String str;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                this.f115531b.mo160965b().setVisibility(8);
            } else {
                this.f115531b.mo160965b().setVisibility(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45768d(EditText editText, int i, EditText editText2, MineUpdateNameView mineUpdateNameView) {
            super(i, editText2);
            this.f115530a = editText;
            this.f115531b = mineUpdateNameView;
        }
    }

    public MineUpdateNameView(Activity activity, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f115527d = activity;
        this.f115528e = bVar;
    }
}
