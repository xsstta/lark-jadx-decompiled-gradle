package com.ss.android.lark.contact.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.contact.widget.a */
public class C36081a extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private final Rect f93260c;

    /* renamed from: d */
    private final AbstractC36082a f93261d;

    /* renamed from: com.ss.android.lark.contact.widget.a$a */
    public interface AbstractC36082a {
        void onClick(int i);
    }

    /* renamed from: f */
    private void m141484f() {
        AbstractC36082a aVar = this.f93261d;
        if (aVar != null) {
            aVar.onClick(1);
        }
        Log.m165379d("MoreActionDialogFragment", "clickManage");
        u_();
    }

    /* renamed from: g */
    private void m141485g() {
        AbstractC36082a aVar = this.f93261d;
        if (aVar != null) {
            aVar.onClick(0);
        }
        Log.m165379d("MoreActionDialogFragment", "clickExit");
        u_();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m141482a(View view) {
        m141485g();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m141483b(View view) {
        m141484f();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5510a(2, R.style.MoreAction_DialogTheme);
    }

    public C36081a(Rect rect, AbstractC36082a aVar) {
        this.f93260c = rect;
        this.f93261d = aVar;
    }

    /* renamed from: a */
    public static C36081a m141481a(FragmentActivity fragmentActivity, View view, AbstractC36082a aVar) {
        Bundle bundle = new Bundle();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        rect.offsetTo(iArr[0], iArr[1]);
        bundle.putParcelable("anchor", rect);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C36081a aVar2 = new C36081a(rect, aVar);
        aVar2.mo5511a(supportFragmentManager, "MoreActionDialogFragment");
        return aVar2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window = v_().getWindow();
        window.setGravity(8388661);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = UIHelper.dp2px(12.0f);
        attributes.y = (this.f93260c.bottom - this.f93260c.top) + UIHelper.dp2px(12.0f);
        window.setAttributes(attributes);
        View inflate = layoutInflater.inflate(R.layout.department_structure_more_action_layout, viewGroup, false);
        inflate.findViewById(R.id.layout_manage).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.widget.$$Lambda$a$rRicp8XMyf0BmOaApCP7kGhb7rg */

            public final void onClick(View view) {
                C36081a.this.m141483b((C36081a) view);
            }
        });
        inflate.findViewById(R.id.layout_exit).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.widget.$$Lambda$a$z259I11komR7goVowu0I4p_bQmk */

            public final void onClick(View view) {
                C36081a.this.m141482a((C36081a) view);
            }
        });
        return inflate;
    }
}
