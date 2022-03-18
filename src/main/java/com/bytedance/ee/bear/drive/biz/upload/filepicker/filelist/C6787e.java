package com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.command.NoSuchFileOrDirectoryException;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.common.p336a.AbstractC6779c;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.common.p336a.C6777a;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.C6799a;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FilePathModel;
import com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6903b;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.e */
public class C6787e extends AbstractC6903b<C6793g> implements AbstractC6792f {

    /* renamed from: a */
    public FilePathModel f18441a;

    /* renamed from: b */
    public String f18442b;

    /* renamed from: c */
    private C6791c f18443c;

    /* renamed from: d */
    private boolean f18444d;

    /* renamed from: e */
    private boolean f18445e = true;

    /* renamed from: f */
    private LinkedList<C6789a> f18446f = new LinkedList<>();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public int mo25870a() {
        return R.layout.drivefilepicker_fragment_file_picker;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25873a(View view) {
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.AbstractC6792f
    /* renamed from: a */
    public void mo26648a(List<C6799a> list, String str) {
        C13479a.m54764b("PickerFragment", "onFetchListSuccess  " + list);
        this.f18442b = str;
        this.f18443c.f18452b.mo26631a(list, str);
        m26731b(str);
        m26734d();
    }

    /* renamed from: d */
    private void m26734d() {
        this.f18443c.f18455e.setChecked(m26737h());
    }

    /* renamed from: i */
    private void m26738i() {
        int size = ((C6793g) mo27144f()).mo26651a().size();
        m26724a(size);
        m26730b(size);
    }

    /* renamed from: c */
    private List<FilePathModel> m26732c() {
        ArrayList arrayList = new ArrayList();
        if (this.f18444d) {
            arrayList.add(new FilePathModel(this.f18443c.f18451a.getResources().getString(R.string.Drive_FilePicker_MobilePhone), ".storage_list_path"));
        }
        arrayList.add(this.f18441a);
        return arrayList;
    }

    /* renamed from: h */
    private boolean m26737h() {
        List<C6799a> curDirFileModelListWithoutDirectory = this.f18443c.f18452b.getCurDirFileModelListWithoutDirectory();
        if (curDirFileModelListWithoutDirectory.size() == 0) {
            return false;
        }
        boolean z = true;
        for (C6799a aVar : curDirFileModelListWithoutDirectory) {
            if (!aVar.mo26767b()) {
                z = false;
            }
        }
        C13479a.m54764b("PickerFragment", "isCurSelectAll  " + z);
        return z;
    }

    /* renamed from: g */
    private void m26736g() {
        List<C6799a> curDirFileModelListWithoutDirectory = this.f18443c.f18452b.getCurDirFileModelListWithoutDirectory();
        if (curDirFileModelListWithoutDirectory.size() != 0) {
            boolean z = !m26737h();
            for (C6799a aVar : curDirFileModelListWithoutDirectory) {
                aVar.mo26766a(z);
                ((C6793g) mo27144f()).mo26652a(aVar, z);
            }
            this.f18443c.f18455e.setChecked(z);
            this.f18443c.f18452b.mo26629a();
            m26738i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public void mo25878b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f18441a = (FilePathModel) arguments.getParcelable("extra_root_directory");
            this.f18444d = arguments.getBoolean("extra_is_multi_storage");
            this.f18445e = arguments.getBoolean("extras_multiple", true);
        }
        if (this.f18441a == null) {
            mo27143e();
            return;
        }
        C6777a.m26713a(getActivity(), new C6790b());
        mo26646a(this.f18441a.mo26682b());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m26733c(View view) {
        m26736g();
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.e$b */
    private class C6790b implements AbstractC6779c {
        private C6790b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.e$c */
    public class C6791c {

        /* renamed from: a */
        public View f18451a;

        /* renamed from: b */
        public FileSelectView f18452b;

        /* renamed from: c */
        public TextView f18453c;

        /* renamed from: d */
        public LinearLayout f18454d;

        /* renamed from: e */
        public UDCheckBox f18455e;

        /* renamed from: f */
        public Button f18456f;

        private C6791c() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6793g mo25877b(Context context) {
        return new C6793g(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.e$a */
    public class C6789a {

        /* renamed from: a */
        public int f18447a;

        /* renamed from: c */
        private String f18449c;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C6789a) {
                return TextUtils.equals(((C6789a) obj).f18449c, this.f18449c);
            }
            return false;
        }

        private C6789a(String str, int i) {
            this.f18447a = i;
            this.f18449c = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m26735d(View view) {
        m26727a(((C6793g) mo27144f()).mo26651a());
    }

    /* renamed from: a */
    private void m26724a(int i) {
        String str;
        if (i <= 1) {
            str = C10539a.m43639a(this.f18443c.f18451a.getContext(), R.string.Drive_FilePicker_FilesSinglular, "select_count", String.valueOf(i));
        } else {
            str = C10539a.m43639a(this.f18443c.f18451a.getContext(), R.string.Drive_FilePicker_FilesPlural, "select_count", String.valueOf(i));
        }
        this.f18443c.f18453c.setText(str);
    }

    /* renamed from: b */
    private ArrayList<String> m26729b(Map<String, C6799a> map) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, C6799a> entry : map.entrySet()) {
            arrayList.add(entry.getValue().mo26764a().getFullPath());
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m26730b(int i) {
        this.f18443c.f18456f.setBackground(getResources().getDrawable(R.drawable.facade_round_around_m, null));
        if (i == 0) {
            C13747j.m55726a(this.f18443c.f18456f, (int) R.color.fill_disable);
            this.f18443c.f18456f.setClickable(false);
            return;
        }
        C13747j.m55726a(this.f18443c.f18456f, (int) R.color.primary_pri_500);
        this.f18443c.f18456f.setClickable(true);
    }

    /* renamed from: a */
    private void m26727a(Map<String, C6799a> map) {
        C13479a.m54764b("PickerFragment", "sendPickedFileList  " + map);
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("extra_file_path_list", m26729b(map));
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    /* renamed from: b */
    private void m26731b(String str) {
        int indexOf = this.f18446f.indexOf(new C6789a(str, 0));
        if (indexOf >= 0) {
            this.f18443c.f18452b.setCurrentVerticalRVDistanceY(this.f18446f.get(indexOf).f18447a);
            LinkedList<C6789a> linkedList = this.f18446f;
            linkedList.subList(indexOf, linkedList.size()).clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public void mo26649b(View view) {
        C6791c cVar = new C6791c();
        this.f18443c = cVar;
        cVar.f18451a = view;
        C6791c cVar2 = this.f18443c;
        cVar2.f18452b = (FileSelectView) cVar2.f18451a.findViewById(R.id.navigation_view);
        C6791c cVar3 = this.f18443c;
        cVar3.f18453c = (TextView) cVar3.f18451a.findViewById(R.id.btn_cur_select);
        C6791c cVar4 = this.f18443c;
        cVar4.f18454d = (LinearLayout) cVar4.f18451a.findViewById(R.id.btn_select_all);
        C6791c cVar5 = this.f18443c;
        cVar5.f18455e = (UDCheckBox) cVar5.f18451a.findViewById(R.id.checkbox_select_all);
        C6791c cVar6 = this.f18443c;
        cVar6.f18456f = (Button) cVar6.f18451a.findViewById(R.id.btn_confirm);
    }

    /* renamed from: a */
    public void mo26646a(String str) {
        ((C6793g) mo27144f()).mo26653a(str);
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.AbstractC6792f
    /* renamed from: a */
    public void mo26647a(Throwable th) {
        C13479a.m54764b("PickerFragment", "onFetchListError  " + th);
        if (th instanceof NoSuchFileOrDirectoryException) {
            this.f18442b = ((NoSuchFileOrDirectoryException) th).getPath();
            this.f18443c.f18452b.mo26631a(new ArrayList(), this.f18442b);
            this.f18443c.f18455e.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26726a(String str, View view) {
        if (TextUtils.equals(str, ".storage_list_path")) {
            C6777a.m26712a(getActivity()).mo26614a();
        } else {
            mo26646a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m26725a(C6799a aVar, View view) {
        if (aVar.mo26768c()) {
            this.f18446f.add(new C6789a(this.f18442b, this.f18443c.f18452b.getCurrentVerticalRVFirstItemDistanceY()));
            mo26646a(aVar.mo26764a().getFullPath());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m26728a(C6799a aVar, boolean z) {
        int size = ((C6793g) mo27144f()).mo26651a().size();
        if (!this.f18445e && !z && size >= 1) {
            return false;
        }
        aVar.mo26766a(!z);
        ((C6793g) mo27144f()).mo26652a(aVar, !z);
        m26738i();
        m26734d();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: a */
    public void mo25874a(View view, Bundle bundle) {
        this.f18443c.f18452b.setOnFilePickedListener(new AbstractC6784b() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$e$fYTjsqL1xal1G4q6l4Jv9OYNM2k */

            @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.AbstractC6784b
            public final boolean onFilePicked(C6799a aVar, boolean z) {
                return C6787e.lambda$fYTjsqL1xal1G4q6l4Jv9OYNM2k(C6787e.this, aVar, z);
            }
        });
        this.f18443c.f18452b.setVerticalRVItemClickListener(new AbstractC6786d() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$e$gi8OE_AHL7x3lZ374Z1RyKeRyAw */

            @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.AbstractC6786d
            public final void onClicked(C6799a aVar, View view) {
                C6787e.lambda$gi8OE_AHL7x3lZ374Z1RyKeRyAw(C6787e.this, aVar, view);
            }
        });
        this.f18443c.f18452b.setHorizontalRVItemClickListener(new AbstractC6785c() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$e$g_ZqaktsuxcS3HoylcxfOatS2gA */

            @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.AbstractC6785c
            public final void onClicked(String str, View view) {
                C6787e.lambda$g_ZqaktsuxcS3HoylcxfOatS2gA(C6787e.this, str, view);
            }
        });
        this.f18443c.f18452b.setRootFilePathModelList(m26732c());
        this.f18443c.f18452b.setMimeTypeManager(C6920b.m27342f().mo27169d());
        ((C6793g) mo27144f()).mo27147a(this);
        this.f18443c.f18456f.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$e$ErEMQPZVbbdc9kkrcKUCunx5Kc */

            public final void onClick(View view) {
                C6787e.m269390lambda$ErEMQPZVbbdc9kkrcKUCunx5Kc(C6787e.this, view);
            }
        });
        this.f18443c.f18454d.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$e$jyaDQhBFLVlBUSkjsEiVaCsP0c */

            public final void onClick(View view) {
                C6787e.m269391lambda$jyaDQhBFLVlBUSkjsEiVaCsP0c(C6787e.this, view);
            }
        });
        if (!this.f18445e) {
            this.f18443c.f18454d.setFocusable(false);
            this.f18443c.f18454d.setClickable(false);
        }
        this.f18443c.f18455e.setClickable(false);
        m26724a(0);
        m26730b(0);
    }
}
