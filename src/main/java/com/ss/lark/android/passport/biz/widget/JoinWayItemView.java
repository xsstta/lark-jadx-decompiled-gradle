package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.entity.MenuInfo;
import com.ss.android.lark.passport.signinsdk_api.contants.ButtonType;

public class JoinWayItemView extends FrameLayout {

    /* renamed from: a */
    private TextView f164360a;

    /* renamed from: b */
    private ImageView f164361b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.lark.android.passport.biz.widget.JoinWayItemView$1 */
    public static /* synthetic */ class C652671 {

        /* renamed from: a */
        static final /* synthetic */ int[] f164362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.passport.signinsdk_api.contants.ButtonType[] r0 = com.ss.android.lark.passport.signinsdk_api.contants.ButtonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.lark.android.passport.biz.widget.JoinWayItemView.C652671.f164362a = r0
                com.ss.android.lark.passport.signinsdk_api.contants.ButtonType r1 = com.ss.android.lark.passport.signinsdk_api.contants.ButtonType.JOIN_CODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.lark.android.passport.biz.widget.JoinWayItemView.C652671.f164362a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.passport.signinsdk_api.contants.ButtonType r1 = com.ss.android.lark.passport.signinsdk_api.contants.ButtonType.JOIN_SCAN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.widget.JoinWayItemView.C652671.<clinit>():void");
        }
    }

    public JoinWayItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m256177a(ButtonType buttonType) {
        int i = C652671.f164362a[buttonType.ordinal()];
        if (i == 1) {
            return R.drawable.signin_sdk_tenant_code;
        }
        if (i != 2) {
            return R.drawable.signin_sdk_btn_icon_placeholder;
        }
        return R.drawable.signin_sdk_tenant_scan;
    }

    /* renamed from: a */
    private void m256178a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.signin_sdk_input_join_item, (ViewGroup) this, true);
        this.f164360a = (TextView) inflate.findViewById(R.id.tvName);
        this.f164361b = (ImageView) inflate.findViewById(R.id.ivLeft);
        setBackgroundResource(R.drawable.signin_sdk_card_bg);
    }

    public void setContent(MenuInfo menuInfo) {
        if (menuInfo != null) {
            this.f164360a.setText(menuInfo.text);
            ((C2124f) ComponentCallbacks2C2115c.m9141a(this).mo10413a(Integer.valueOf(m256177a(menuInfo.getButtonType()))).mo11143c((int) R.drawable.signin_sdk_btn_icon_placeholder)).mo10399a(this.f164361b);
        }
    }

    public JoinWayItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public JoinWayItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256178a(context);
    }
}
