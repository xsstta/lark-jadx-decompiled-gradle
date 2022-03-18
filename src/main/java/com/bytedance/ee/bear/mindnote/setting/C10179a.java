package com.bytedance.ee.bear.mindnote.setting;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.mindnote.setting.a */
public class C10179a extends DialogInterface$OnCancelListenerC1021b implements AbstractC7666d {

    /* renamed from: c */
    public C10182b f27474c;

    /* renamed from: d */
    private List<SettingNormalImageView> f27475d = new ArrayList(4);

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo5513b();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f27474c.processOnClick("", "");
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ == null) {
            window = null;
        } else {
            window = v_.getWindow();
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            attributes.dimAmount = 0.5f;
            attributes.gravity = 80;
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.AnimationDialog);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.mindnote.setting.a$a */
    public class C10181a implements AbstractC10184c {
        C10181a() {
        }

        @Override // com.bytedance.ee.bear.mindnote.setting.AbstractC10184c
        /* renamed from: a */
        public void mo38939a(String str, String str2) {
            if (C10179a.this.f27474c != null) {
                C10179a.this.f27474c.processOnClick(str, str2);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10182b bVar = (C10182b) C4950k.m20474a(this, C10182b.class);
        this.f27474c = bVar;
        bVar.getData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.mindnote.setting.$$Lambda$a$Cx1DL0yuMlpEEDqk2LxvxbT0lPI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10179a.this.m42410a((C10179a) ((MindNoteSettingData) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m42410a(MindNoteSettingData mindNoteSettingData) {
        if (mindNoteSettingData != null) {
            for (SettingNormalImageView settingNormalImageView : this.f27475d) {
                if (TextUtils.equals(mindNoteSettingData.getActiveStructureKey(), settingNormalImageView.getWrapper().mo38944a())) {
                    settingNormalImageView.setSelected(true);
                } else {
                    settingNormalImageView.setSelected(false);
                }
            }
        }
    }

    /* renamed from: a */
    private void m42409a(View view) {
        ((CommonActionPanelLayout) view.findViewById(R.id.bottom_panel)).setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.mindnote.setting.C10179a.C101801 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                C10179a.this.u_();
            }
        });
        SettingNormalImageView settingNormalImageView = (SettingNormalImageView) view.findViewById(R.id.tool_left_view_img);
        SettingNormalImageView settingNormalImageView2 = (SettingNormalImageView) view.findViewById(R.id.tool_right_view_img);
        SettingNormalImageView settingNormalImageView3 = (SettingNormalImageView) view.findViewById(R.id.tool_bilateral_view_img);
        SettingNormalImageView settingNormalImageView4 = (SettingNormalImageView) view.findViewById(R.id.tool_down_view_img);
        settingNormalImageView.setWrapper(new View$OnClickListenerC10185d("left", "structure", new C10181a()));
        settingNormalImageView2.setWrapper(new View$OnClickListenerC10185d("right", "structure", new C10181a()));
        settingNormalImageView3.setWrapper(new View$OnClickListenerC10185d("default", "structure", new C10181a()));
        settingNormalImageView4.setWrapper(new View$OnClickListenerC10185d("org", "structure", new C10181a()));
        this.f27475d.clear();
        this.f27475d.add(settingNormalImageView);
        this.f27475d.add(settingNormalImageView2);
        this.f27475d.add(settingNormalImageView3);
        this.f27475d.add(settingNormalImageView4);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m42409a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mindnote_setting_fragment, viewGroup, false);
    }
}
