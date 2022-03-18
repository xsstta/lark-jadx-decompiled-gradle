package com.ss.android.lark.browser.biz.basic.jsapi.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.NavigationLeft;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class SetLeftHandlerV2 extends AbstractInjectJSApiHandler<NavigationLeft> implements Parcelable {
    public static final Parcelable.Creator<SetLeftHandlerV2> CREATOR = new Parcelable.Creator<SetLeftHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetLeftHandlerV2.C297063 */

        /* renamed from: a */
        public SetLeftHandlerV2[] newArray(int i) {
            return new SetLeftHandlerV2[i];
        }

        /* renamed from: a */
        public SetLeftHandlerV2 createFromParcel(Parcel parcel) {
            return new SetLeftHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public SetLeftHandlerV2() {
    }

    protected SetLeftHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NavigationLeft navigationLeft, final AbstractC25832c cVar) {
        Log.m165389i("SetLeftHandlerV2", "invoke api. " + navigationLeft);
        IWebContainerContract.IWebContainerView.IWebContainerTitleBar b = mo91999w().mo67308b();
        if (b == null) {
            Log.m165389i("SetLeftHandlerV2", "titlebar is null");
            return;
        }
        b.mo67325b((OnSingleClickListener) null);
        b.mo67332d(false);
        b.mo67326b("");
        if (!navigationLeft.isShowIcon()) {
            b.mo67330c(17170445);
        } else {
            b.mo67330c(R.drawable.titlebar_back_black_bg_selector);
        }
        if (navigationLeft.getText() == null) {
            b.mo67320a(UIHelper.getString(R.string.Lark_Legacy_LarkBack));
        } else {
            b.mo67320a(navigationLeft.getText());
        }
        if (navigationLeft.getText() == null || !TextUtils.isEmpty(navigationLeft.getText()) || navigationLeft.isShowIcon()) {
            b.mo67331c(true);
        } else {
            b.mo67331c(false);
        }
        if (navigationLeft.isControl()) {
            b.mo67319a(new OnSingleClickListener() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetLeftHandlerV2.C297041 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    KeyboardUtils.hideKeyboard(SetLeftHandlerV2.this.mo91999w().mo67314g().getContext());
                    SetLeftHandlerV2.this.mo91999w().mo67314g().clearFocus();
                    cVar.mo91902a("{}");
                }
            });
        } else {
            b.mo67319a(new OnSingleClickListener() {
                /* class com.ss.android.lark.browser.biz.basic.jsapi.navigation.SetLeftHandlerV2.C297052 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (SetLeftHandlerV2.this.mo91998v() != null && SetLeftHandlerV2.this.mo91998v().isAdded() && SetLeftHandlerV2.this.mo91997u() != null) {
                        KeyboardUtils.hideKeyboard(SetLeftHandlerV2.this.mo91997u());
                        if (SetLeftHandlerV2.this.mo91999w() != null && SetLeftHandlerV2.this.mo91999w().mo67314g() != null && SetLeftHandlerV2.this.mo91999w().mo67314g().canGoBack()) {
                            SetLeftHandlerV2.this.mo91999w().mo67314g().goBack();
                        } else if (SetLeftHandlerV2.this.mo91997u() != null) {
                            SetLeftHandlerV2.this.mo91997u().finish();
                        }
                    }
                }
            });
        }
    }
}
