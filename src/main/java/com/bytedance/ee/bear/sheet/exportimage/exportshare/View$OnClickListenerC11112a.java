package com.bytedance.ee.bear.sheet.exportimage.exportshare;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.export.p307b.AbstractC5756a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.exportimage.exportshare.a */
public class View$OnClickListenerC11112a extends AbstractC5756a<C11113b> implements View.OnClickListener {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    /* renamed from: f */
    public int mo23184f() {
        return R.string.CreationMobile_Sheets_Share;
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    /* renamed from: g */
    public void mo23185g() {
        super.mo23185g();
        ((C11113b) this.f16225c).onCancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11113b mo23186h() {
        return (C11113b) C4950k.m20474a(this, C11113b.class);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment, com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo23185g();
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            ((C11113b) this.f16225c).onClickItem((String) tag);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46245a(LinearLayout linearLayout, String[] strArr) {
        if (strArr != null) {
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.setMarginEnd(C13749l.m55738a(4));
            layoutParams.weight = 1.0f;
            for (String str : strArr) {
                if (TextUtils.equals("image", str)) {
                    linearLayout.addView(m46244a(str, R.drawable.export_share_image_selector, R.string.CreationMobile_Sheets_Pic), layoutParams);
                } else if (TextUtils.equals("text", str)) {
                    linearLayout.addView(m46244a(str, R.drawable.export_share_text_selector, R.string.CreationMobile_Sheets_Text), layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    /* renamed from: a */
    public void mo23182a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setPadding(C13749l.m55738a(4), C13749l.m55738a(24), 0, C13749l.m55738a(4));
        viewGroup.addView(linearLayout, layoutParams);
        ((C11113b) this.f16225c).getShareItems().mo5923a(this, new AbstractC1178x(linearLayout) {
            /* class com.bytedance.ee.bear.sheet.exportimage.exportshare.$$Lambda$a$WM6EnxbmiwJJesD5JH0rrNLn0wg */
            public final /* synthetic */ LinearLayout f$1;

            {
                this.f$1 = r2;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                View$OnClickListenerC11112a.this.m46245a((View$OnClickListenerC11112a) this.f$1, (LinearLayout) ((String[]) obj));
            }
        });
    }

    /* renamed from: a */
    private View m46244a(String str, int i, int i2) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.sheet_export_share_item_layout, (ViewGroup) null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.export_item_icon);
        appCompatImageView.setImageResource(i);
        appCompatImageView.setTag(str);
        appCompatImageView.setOnClickListener(this);
        TextView textView = (TextView) inflate.findViewById(R.id.export_item_text);
        textView.setText(i2);
        textView.setTag(str);
        textView.setOnClickListener(this);
        return inflate;
    }
}
