package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b;
import com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter;
import com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry;
import com.bytedance.ee.android.file.picker.lib.media.DocEntry;
import com.bytedance.ee.android.file.picker.lib.utils.CollectionUtils;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.bytedance.ee.android.file.picker.lib.utils.TemplateUtils;
import com.bytedance.ee.android.file.picker.lib.widget.C4129b;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.android.file.picker.lib.local.g */
public class C4079g implements AbstractC4060b.AbstractC4062b {

    /* renamed from: a */
    RecyclerView f12377a;

    /* renamed from: b */
    TextView f12378b;

    /* renamed from: c */
    View f12379c;

    /* renamed from: d */
    TextView f12380d;

    /* renamed from: e */
    public Context f12381e;

    /* renamed from: f */
    public LocalFilePickerAdapter f12382f;

    /* renamed from: g */
    public AbstractC4060b.AbstractC4062b.AbstractC4063a f12383g;

    /* renamed from: h */
    private final int f12384h;

    /* renamed from: i */
    private final String f12385i;

    /* renamed from: j */
    private AbstractC4083a f12386j;

    /* renamed from: k */
    private C4129b f12387k;

    /* renamed from: l */
    private boolean f12388l;

    /* renamed from: m */
    private boolean f12389m;

    /* renamed from: n */
    private boolean f12390n;

    /* renamed from: o */
    private int f12391o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.g$a */
    public interface AbstractC4083a {
        /* renamed from: a */
        Fragment mo15976a();

        /* renamed from: a */
        void mo15977a(C4079g gVar);
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    public void j_() {
        m17015d();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    /* renamed from: c */
    public void mo15856c() {
        this.f12383g = null;
        this.f12386j = null;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: b */
    public void mo15965b() {
        if (this.f12387k == null) {
            return;
        }
        if ((this.f12388l && this.f12382f.mo15922d() > 10) || (this.f12388l && this.f12389m && this.f12390n)) {
            this.f12387k.mo16187a();
        }
    }

    /* renamed from: d */
    private void m17015d() {
        this.f12386j.mo15977a(this);
        this.f12381e = this.f12377a.getContext();
        String str = this.f12385i;
        if (str != null) {
            this.f12380d.setText(str);
        } else if (this.f12384h == 0) {
            this.f12380d.setText(R.string.Lark_Legacy_Send);
        } else {
            this.f12380d.setText(R.string.Lark_File_FilePickerUpload);
        }
        this.f12379c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4079g.View$OnClickListenerC40801 */

            public void onClick(View view) {
                C4079g.this.f12383g.mo15970a();
            }
        });
        this.f12377a.setLayoutManager(new LocalFilePickerLayoutManager(this.f12381e));
        ((SimpleItemAnimator) this.f12377a.getItemAnimator()).setSupportsChangeAnimations(false);
        LocalFilePickerAdapter localFilePickerAdapter = new LocalFilePickerAdapter(LocalFilePickerAdapter.Mode.SELECT);
        this.f12382f = localFilePickerAdapter;
        this.f12377a.setAdapter(localFilePickerAdapter);
        this.f12377a.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4079g.C40812 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C4079g.this.f12382f.mo15916a(false);
                    C4079g.this.f12382f.notifyDataSetChanged();
                } else if (i == 1) {
                    C4079g.this.f12382f.mo15916a(true);
                } else if (i == 2) {
                    C4079g.this.f12382f.mo15916a(true);
                }
            }
        });
        this.f12382f.mo15913a((LocalFilePickerAdapter.AbstractC4058b) new LocalFilePickerAdapter.AbstractC4058b() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4079g.C40823 */

            @Override // com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.AbstractC4058b
            /* renamed from: a */
            public void mo15931a(C4059a aVar) {
                BaseFileEntry a = aVar.mo15933a();
                if (a != null) {
                    C4079g.this.f12383g.mo15971a(C4079g.this.f12381e, false, a);
                }
            }

            @Override // com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.AbstractC4058b
            /* renamed from: b */
            public void mo15932b(C4059a aVar) {
                BaseFileEntry a = aVar.mo15933a();
                if (a != null) {
                    C4079g.this.f12383g.mo15971a(C4079g.this.f12381e, true, a);
                }
            }
        });
        this.f12378b.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.android.file.picker.lib.local.$$Lambda$g$nJIe5GV5MTBMTFCtd9YGzT91BU8 */

            public final void onClick(View view) {
                C4079g.this.m17013a((C4079g) view);
            }
        });
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: a */
    public void mo15959a() {
        if (this.f12387k == null) {
            C4129b bVar = new C4129b();
            this.f12387k = bVar;
            bVar.mo16189a(true);
        }
        this.f12387k.mo16188a(this.f12381e);
    }

    /* renamed from: a */
    public void mo15864a(AbstractC4060b.AbstractC4062b.AbstractC4063a aVar) {
        this.f12383g = aVar;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: b */
    public void mo15966b(BaseFileEntry baseFileEntry) {
        this.f12382f.mo15914a(baseFileEntry, false);
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: a */
    public void mo15961a(BaseFileEntry baseFileEntry) {
        this.f12382f.mo15914a(baseFileEntry, true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m17013a(View view) {
        if (this.f12391o > 0 && this.f12382f != null) {
            LocalFileConfirmActivity.m16874a(this.f12386j.mo15976a(), this.f12382f.mo15920c(), this.f12382f.mo15923e(), this.f12382f.mo15924f());
        }
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: b */
    public void mo15967b(String str) {
        new C25639g(this.f12381e).mo89242c(str).mo89256o(R.color.text_title).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_center).mo89269b(R.string.Lark_Legacy_DialogOk).mo89271d(R.color.primary_pri_500)).mo89233b().show();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: a */
    public void mo15962a(String str) {
        LKUIToast.show(this.f12381e, str);
    }

    /* renamed from: a */
    private void m17014a(List<C4059a> list, int i) {
        if (!list.isEmpty()) {
            C4059a aVar = new C4059a();
            aVar.f12337b = i;
            aVar.f12338c = list.size();
            list.add(0, aVar);
        }
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: c */
    public void mo15969c(List<BaseFileEntry> list, List<Uri> list2) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.f12469a.mo16095a(list)) {
            for (BaseFileEntry baseFileEntry : list) {
                C4059a aVar = new C4059a();
                aVar.mo15935a(33, 34, baseFileEntry);
                aVar.mo15936a(list2.contains(baseFileEntry.getUri()));
                arrayList.add(aVar);
            }
            C4059a aVar2 = new C4059a();
            aVar2.f12337b = 33;
            aVar2.f12338c = arrayList.size();
            arrayList.add(0, aVar2);
        }
        this.f12382f.mo15921c(arrayList);
        this.f12390n = true;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: b */
    public void mo15968b(List<BaseFileEntry> list, List<Uri> list2) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.f12469a.mo16095a(list)) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator<BaseFileEntry> it = list.iterator();
            while (it.hasNext()) {
                DocEntry docEntry = (DocEntry) it.next();
                C4059a aVar = new C4059a();
                aVar.mo15936a(list2.contains(docEntry.getUri()));
                int docType = docEntry.getDocType();
                if (docType == 1) {
                    aVar.mo15935a(17, 18, docEntry);
                    arrayList2.add(aVar);
                } else if (docType == 2) {
                    aVar.mo15935a(19, 20, docEntry);
                    arrayList3.add(aVar);
                } else if (docType == 3) {
                    aVar.mo15935a(23, 24, docEntry);
                    arrayList5.add(aVar);
                } else if (docType == 4) {
                    aVar.mo15935a(21, 22, docEntry);
                    arrayList4.add(aVar);
                }
            }
            m17014a(arrayList2, 17);
            m17014a(arrayList3, 19);
            m17014a(arrayList4, 21);
            m17014a(arrayList5, 23);
            arrayList.addAll(arrayList2);
            arrayList.addAll(arrayList3);
            arrayList.addAll(arrayList4);
            arrayList.addAll(arrayList5);
        }
        this.f12382f.mo15919b(arrayList);
        this.f12389m = true;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: a */
    public void mo15963a(List<BaseFileEntry> list, List<Uri> list2) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.f12469a.mo16095a(list)) {
            for (BaseFileEntry baseFileEntry : list) {
                C4059a aVar = new C4059a();
                aVar.mo15935a(1, 2, baseFileEntry);
                aVar.mo15936a(list2.contains(baseFileEntry.getUri()));
                arrayList.add(aVar);
            }
            C4059a aVar2 = new C4059a();
            aVar2.f12337b = 1;
            aVar2.f12338c = arrayList.size();
            arrayList.add(0, aVar2);
        }
        this.f12382f.mo15915a((List<C4059a>) arrayList);
        this.f12388l = true;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: a */
    public void mo15964a(boolean z, List<Uri> list) {
        String str;
        long j = 0;
        for (Uri uri : list) {
            j += LarkUriUtil.m95306d(this.f12381e, uri);
        }
        String a = FileUtils.f12473a.mo16103a(j);
        int size = list.size();
        this.f12391o = size;
        if (size <= 1) {
            str = TemplateUtils.f12481a.mo16116a(this.f12381e, R.string.Lark_Legacy_FilesSinglular, "select_count", Integer.toString(this.f12391o));
        } else {
            str = TemplateUtils.f12481a.mo16116a(this.f12381e, R.string.Lark_Legacy_FilesPlural, "select_count", Integer.toString(this.f12391o));
        }
        if (j != 0) {
            str = str + " - " + a;
        }
        if (DesktopUtil.m144301a(this.f12381e)) {
            this.f12378b.setTextSize(14.0f);
        }
        this.f12378b.setText(str);
        this.f12379c.setEnabled(z);
        this.f12380d.setEnabled(z);
    }

    public C4079g(AbstractC4083a aVar, int i, String str) {
        this.f12386j = aVar;
        this.f12384h = i;
        this.f12385i = str;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b
    /* renamed from: a */
    public void mo15960a(int i, int i2, Intent intent) {
        if (i == 10000 && i2 == 20000) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("RESULT_KEY_UN_SELECTED_PATHS");
            for (C4059a aVar : this.f12382f.mo15918b()) {
                if (aVar != null && !aVar.mo15937b() && aVar.mo15947j()) {
                    Iterator it = parcelableArrayListExtra.iterator();
                    while (it.hasNext()) {
                        Uri uri = (Uri) it.next();
                        if (uri != null && uri.equals(aVar.mo15940e())) {
                            this.f12383g.mo15971a(this.f12381e, false, aVar.mo15933a());
                        }
                    }
                }
            }
            this.f12382f.notifyDataSetChanged();
        }
    }
}
