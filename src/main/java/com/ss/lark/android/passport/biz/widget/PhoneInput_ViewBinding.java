package com.ss.lark.android.passport.biz.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class PhoneInput_ViewBinding extends BaseContactInput_ViewBinding {

    /* renamed from: a */
    private PhoneInput f164409a;

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput_ViewBinding, butterknife.Unbinder
    public void unbind() {
        PhoneInput phoneInput = this.f164409a;
        if (phoneInput != null) {
            this.f164409a = null;
            phoneInput.mRegionContainer = null;
            phoneInput.mRegionCode = null;
            phoneInput.mPhoneInput = null;
            phoneInput.mDivideAround = null;
            phoneInput.mIvChoose = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhoneInput_ViewBinding(PhoneInput phoneInput, View view) {
        super(phoneInput, view);
        this.f164409a = phoneInput;
        phoneInput.mRegionContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_country_select, "field 'mRegionContainer'", LinearLayout.class);
        phoneInput.mRegionCode = (TextView) Utils.findRequiredViewAsType(view, R.id.country_code, "field 'mRegionCode'", TextView.class);
        phoneInput.mPhoneInput = (PhoneDivideEditText) Utils.findRequiredViewAsType(view, R.id.phone_number_edit, "field 'mPhoneInput'", PhoneDivideEditText.class);
        phoneInput.mDivideAround = Utils.findRequiredView(view, R.id.inputRoot, "field 'mDivideAround'");
        phoneInput.mIvChoose = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_choose, "field 'mIvChoose'", ImageView.class);
    }
}
