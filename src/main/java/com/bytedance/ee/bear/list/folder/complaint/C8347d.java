package com.bytedance.ee.bear.list.folder.complaint;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folder.complaint.d */
public class C8347d extends C7667e {

    /* renamed from: a */
    private String f22553a;

    /* renamed from: b */
    private String f22554b;

    /* renamed from: c */
    private View f22555c;

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("FolderComplaintSuccessFragment", "onDestroy()...");
    }

    /* renamed from: b */
    private void m34577b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22553a = arguments.getString("title");
            this.f22554b = arguments.getString("desc");
        }
    }

    /* renamed from: a */
    private void m34576a() {
        C13479a.m54764b("FolderComplaintSuccessFragment", "initMVP()...");
        ((TextView) this.f22555c.findViewById(R.id.list_folder_name)).setText(this.f22553a);
        ((TextView) this.f22555c.findViewById(R.id.list_folder_desc)).setText(this.f22554b);
        ((BaseTitleBar) this.f22555c.findViewById(R.id.list_folder_title_bar)).setLeftClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.complaint.C8347d.C83481 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8347d.this.getActivity() != null) {
                    C8347d.this.getActivity().onBackPressed();
                }
            }
        });
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("FolderComplaintSuccessFragment", "onCreate()...");
        m34577b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m34576a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_folder_complaint_success_layout, viewGroup, false);
        this.f22555c = inflate;
        return inflate;
    }
}
