package com.ss.android.lark.upgrade.setting.p2898a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.upgrade.setting.a.a */
public class C57664a implements AbstractC54125a {

    /* renamed from: a */
    private final Context f142112a;

    /* renamed from: b */
    private FrameLayout f142113b;

    /* renamed from: c */
    private TextView f142114c;

    /* renamed from: d */
    private boolean f142115d;

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: a */
    public /* synthetic */ void mo132391a() {
        AbstractC54126b.CC.$default$a(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    public /* synthetic */ void aA_() {
        AbstractC54126b.CC.$default$aA_(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: d */
    public void mo132396d() {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: e */
    public void mo132397e() {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public /* synthetic */ boolean mo132398f() {
        return AbstractC54125a.CC.$default$f(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public /* synthetic */ void mo132399g() {
        AbstractC54126b.CC.$default$g(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        return m223874j();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        return m223874j();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        return SystemSettingComponentType.APP_VERSION.getValue();
    }

    /* renamed from: k */
    private String m223875k() {
        return String.format("%s %s", UIHelper.getString(R.string.Lark_NewSettings_AboutFeishuCurrentVersionMobile), C57824f.m224459a(this.f142112a));
    }

    /* renamed from: l */
    private String m223876l() {
        return String.format("%s %s\nUID: %s\nDID:%s\nOS: Android %s", UIHelper.getString(R.string.Lark_NewSettings_AboutFeishuCurrentVersionMobile), C57824f.m224459a(this.f142112a), C57607a.m223662a().mo177710d(), C57607a.m223662a().mo177709c(), Build.VERSION.RELEASE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo195753h() {
        String str;
        ClipboardManager clipboardManager = (ClipboardManager) this.f142112a.getSystemService("clipboard");
        if (clipboardManager == null) {
            return true;
        }
        if (this.f142115d) {
            str = m223876l();
        } else {
            str = m223875k();
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Debug info", str));
        UDToast.makeToast(this.f142112a, (int) R.string.Lark_Legacy_Copied).show();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo195754i() {
        if (C57607a.m223662a().mo177706a("lark.core.version.bugfix")) {
            this.f142115d = true;
            ClipboardManager clipboardManager = (ClipboardManager) this.f142112a.getSystemService("clipboard");
            if (clipboardManager != null) {
                String l = m223876l();
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Debug info", l));
                this.f142114c.setText(l);
                UDToast.makeToast(this.f142112a, (int) R.string.Lark_Legacy_Copied).show();
            }
        }
    }

    /* renamed from: j */
    private View m223874j() {
        if (this.f142113b == null) {
            this.f142113b = new FrameLayout(this.f142112a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = UIUtils.dp2px(this.f142112a, 8.0f);
            this.f142113b.setPadding(0, UIUtils.dp2px(this.f142112a, 2.0f), 0, UIUtils.dp2px(this.f142112a, 26.0f));
            this.f142114c = new AppCompatTextView(this.f142112a);
            String a = C57824f.m224459a(this.f142112a);
            this.f142114c.setText(String.format("%s %s", UIHelper.getString(R.string.Lark_NewSettings_AboutFeishuCurrentVersionMobile), a));
            this.f142114c.setTextSize(12.0f);
            this.f142114c.setTextColor(UIUtils.getColor(this.f142112a, R.color.text_placeholder));
            this.f142114c.setGravity(17);
            this.f142113b.addView(this.f142114c, layoutParams);
            this.f142113b.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.upgrade.setting.p2898a.C57664a.View$OnLongClickListenerC576651 */

                public boolean onLongClick(View view) {
                    return C57664a.this.mo195753h();
                }
            });
            this.f142113b.setOnClickListener(new ThreeTimesClickListener() {
                /* class com.ss.android.lark.upgrade.setting.p2898a.C57664a.C576662 */

                @Override // com.ss.android.lark.upgrade.setting.appversion.ThreeTimesClickListener
                /* renamed from: a */
                public void mo195756a(View view) {
                    C57664a.this.mo195754i();
                }
            });
        }
        return this.f142113b;
    }

    public C57664a(Context context) {
        this.f142112a = context;
    }
}
