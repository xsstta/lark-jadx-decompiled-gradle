package com.bytedance.ee.bear.list.folder.complaint;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.folder.complaint.C8345c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folder.complaint.a */
public class C8343a extends C7667e implements C8345c.AbstractC8346a {

    /* renamed from: a */
    private String f22544a;

    /* renamed from: b */
    private String f22545b;

    /* renamed from: c */
    private String f22546c;

    /* renamed from: d */
    private View f22547d;

    /* renamed from: e */
    private C8345c f22548e;

    /* renamed from: c */
    private void m34568c() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22544a = arguments.getString("token");
            this.f22545b = arguments.getString("title");
            this.f22546c = arguments.getString("desc");
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.C8345c.AbstractC8346a
    /* renamed from: a */
    public void mo32785a() {
        if (getActivity() instanceof FolderComplaintActivity) {
            ((FolderComplaintActivity) getActivity()).mo32773c();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C8345c cVar = this.f22548e;
        if (cVar != null) {
            cVar.destroy();
        }
        C13479a.m54764b("FolderComplaintFragment", "onDestroy()...");
    }

    /* renamed from: b */
    private void m34567b() {
        C13479a.m54764b("FolderComplaintFragment", "initMVP()...");
        C8345c cVar = new C8345c(new C8344b(this.f22544a), new FolderComplaintView(this.f22547d, this.f22545b, this.f22546c), this, getContext());
        this.f22548e = cVar;
        cVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("FolderComplaintFragment", "onCreate()...");
        m34568c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m34567b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_folder_complaint_layout, viewGroup, false);
        this.f22547d = inflate;
        return inflate;
    }
}
