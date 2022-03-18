package com.ss.android.lark.profile.func.edit_profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.profile.statistics.UserProfileHitPointV3;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.utils.UIHelper;

public class EditAliasFragment extends BaseFragment {

    /* renamed from: a */
    View f129643a;

    /* renamed from: b */
    private String f129644b;

    /* renamed from: c */
    private String f129645c;

    /* renamed from: d */
    private String f129646d;

    /* renamed from: e */
    private String f129647e;

    /* renamed from: f */
    private CallbackManager f129648f;
    @BindView(6740)
    View mClearBtn;
    @BindView(7885)
    CommonTitleBar mCommonTitleBar;
    @BindView(7076)
    EditText mEditText;

    /* renamed from: e */
    private void m202853e() {
        this.mEditText.requestFocus();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f129648f.cancelCallbacks();
    }

    /* renamed from: d */
    private void m202852d() {
        if (DesktopUtil.m144301a((Context) getActivity())) {
            this.mCommonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            this.mEditText.setTextSize(14.0f);
        }
    }

    /* renamed from: a */
    public void mo179084a() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public void mo179085b() {
        ProfileHitPoint.m204738r();
        UserProfileHitPointV3.m204753b();
        String obj = this.mEditText.getText().toString();
        if (TextUtils.isEmpty(obj) || !TextUtils.isEmpty(obj.trim())) {
            C52239a.m202617d().mo133586p().mo133608a(this.f129644b, this.f129646d, obj, this.f129648f.wrapAndAddGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.profile.func.edit_profile.EditAliasFragment.C522757 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    EditAliasFragment.this.mo179084a();
                    Intent intent = new Intent();
                    if (str == null) {
                        str = "";
                    }
                    intent.putExtra("result_alias", str);
                    EditAliasFragment.this.setResult(-1, intent);
                    EditAliasFragment.this.finish();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(EditAliasFragment.this.getActivity(), (int) R.string.Lark_Legacy_PersoncardAliasSettingFailed);
                    Log.m165382e("Set alias failed:" + errorResult.toString());
                    EditAliasFragment.this.finish();
                }
            }));
        } else {
            LKUIToast.show(getContext(), (int) R.string.Lark_Legacy_ContentEmpty);
        }
    }

    /* renamed from: c */
    private void m202851c() {
        String str;
        int i;
        this.mCommonTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Legacy_Save, Integer.valueOf((int) R.color.lkui_B500))) {
            /* class com.ss.android.lark.profile.func.edit_profile.EditAliasFragment.C522691 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                super.performAction(view);
                EditAliasFragment.this.mo179085b();
            }
        });
        this.mCommonTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.edit_profile.EditAliasFragment.View$OnClickListenerC522702 */

            public void onClick(View view) {
                EditAliasFragment.this.mo179084a();
                EditAliasFragment.this.finish();
            }
        });
        this.mCommonTitleBar.getRightText().setPadding(0, 0, UIHelper.dp2px(16.0f), 0);
        this.mCommonTitleBar.getCenterText().setText(R.string.Lark_Legacy_EditAlias);
        EditText editText = this.mEditText;
        if (!TextUtils.isEmpty(this.f129647e)) {
            str = this.f129647e;
        } else if (!TextUtils.isEmpty(this.f129645c)) {
            str = this.f129645c;
        } else {
            str = "";
        }
        editText.setText(str);
        EditText editText2 = this.mEditText;
        String str2 = this.f129647e;
        if (str2 != null) {
            i = str2.length();
        } else {
            i = 0;
        }
        editText2.setSelection(i);
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.profile.func.edit_profile.EditAliasFragment.View$OnFocusChangeListenerC522713 */

            public void onFocusChange(View view, boolean z) {
                if (z) {
                    KeyboardUtils.showKeyboard(EditAliasFragment.this.mEditText.getContext());
                    EditAliasFragment.this.mClearBtn.setVisibility(0);
                    return;
                }
                EditAliasFragment.this.mClearBtn.setVisibility(8);
                KeyboardUtils.hideKeyboard(EditAliasFragment.this.mEditText.getContext(), EditAliasFragment.this.mEditText);
            }
        });
        this.mEditText.setFilters(new InputFilter[]{new EditTextLengthFilter(24, new EditTextLengthFilter.ExceedLengthListener() {
            /* class com.ss.android.lark.profile.func.edit_profile.EditAliasFragment.C522724 */

            @Override // com.ss.android.lark.utils.EditTextLengthFilter.ExceedLengthListener
            /* renamed from: a */
            public void mo134006a(CharSequence charSequence) {
            }
        })});
        this.mClearBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.edit_profile.EditAliasFragment.View$OnClickListenerC522735 */

            public void onClick(View view) {
                EditAliasFragment.this.mEditText.setText("");
            }
        });
        this.f129643a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.edit_profile.EditAliasFragment.View$OnClickListenerC522746 */

            public void onClick(View view) {
                EditAliasFragment.this.mEditText.clearFocus();
                EditAliasFragment.this.f129643a.setFocusable(true);
                EditAliasFragment.this.f129643a.setFocusableInTouchMode(true);
                EditAliasFragment.this.f129643a.requestFocus();
            }
        });
        m202852d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.bind(this, this.f129643a);
        Bundle arguments = getArguments();
        this.f129644b = arguments.getString("chatter_id");
        this.f129645c = arguments.getString("chatter_name");
        this.f129646d = arguments.getString("contact_token");
        this.f129647e = arguments.getString("alias");
        this.f129648f = new CallbackManager();
        m202851c();
        m202853e();
        UserProfileHitPointV3.m204752a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.activity_edit_alias, viewGroup, false);
        this.f129643a = inflate;
        return inflate;
    }
}
