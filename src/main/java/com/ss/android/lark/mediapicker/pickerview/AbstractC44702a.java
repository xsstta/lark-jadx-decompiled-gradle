package com.ss.android.lark.mediapicker.pickerview;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d;
import com.ss.android.lark.mediapicker.album.base.AbstractC44653g;
import com.ss.android.lark.mediapicker.album.base.C44627b;
import com.ss.android.lark.mediapicker.album.base.C44632c;
import com.ss.android.lark.mediapicker.album.base.C44660j;
import com.ss.android.lark.mediapicker.entity.C44681b;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.utils.C44754j;
import com.ss.android.lark.mediapicker.utils.C44755k;
import com.ss.android.lark.mediapicker.utils.C44757m;
import com.ss.android.lark.mediapicker.widget.OnSingleClickListener;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.pickerview.a */
public abstract class AbstractC44702a implements AbstractC44653g.AbstractC44655b {

    /* renamed from: a */
    public AbstractC44634d f113264a;

    /* renamed from: b */
    protected MediaPickerConfig f113265b;

    /* renamed from: c */
    public AbstractC44653g.AbstractC44655b.AbstractC44656a f113266c;

    /* renamed from: d */
    protected AbstractC44653g.AbstractC44655b.AbstractC44657b f113267d;

    /* renamed from: e */
    private Context f113268e;

    /* renamed from: f */
    private C44632c f113269f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C44632c mo158378a(View view);

    /* renamed from: a */
    public abstract AbstractC44634d mo158379a(Context context, MediaPickerConfig mediaPickerConfig);

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: b */
    public void mo158225b() {
        this.f113269f.f113131j.setVisibility(0);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: c */
    public boolean mo158228c() {
        return this.f113269f.f113126e.isChecked();
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158219a(C44627b.C44630b bVar) {
        this.f113266c = bVar;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: b */
    public void mo158226b(List<LocalMedia> list) {
        C44660j.m177158a().mo158244a(new C44681b(list, this.f113269f.f113126e.isChecked()));
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158220a(List<LocalMedia> list) {
        AbstractC44634d dVar = this.f113264a;
        if (dVar != null) {
            dVar.mo158211b(list);
            m177290c(list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158142a(int r4) {
        /*
            r3 = this;
            r0 = -2
            if (r4 == r0) goto L_0x0011
            r0 = -1
            if (r4 == r0) goto L_0x0007
            goto L_0x0054
        L_0x0007:
            android.content.Context r4 = r3.f113268e
            r0 = 2131832894(0x7f11303e, float:1.9298855E38)
            java.lang.String r4 = r4.getString(r0)
            goto L_0x0056
        L_0x0011:
            com.ss.android.lark.mediapicker.album.base.d r4 = r3.f113264a
            java.util.List r4 = r4.mo158210b()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0054
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            com.ss.android.lark.mediapicker.entity.LocalMedia r4 = (com.ss.android.lark.mediapicker.entity.LocalMedia) r4
            java.lang.String r4 = r4.getMimeType()
            boolean r4 = com.ss.android.lark.mediapicker.utils.C44754j.m177502c(r4)
            java.lang.String r0 = "count"
            if (r4 == 0) goto L_0x0042
            android.content.Context r4 = r3.f113268e
            r1 = 2131832907(0x7f11304b, float:1.9298881E38)
            com.ss.android.lark.mediapicker.MediaPickerConfig r2 = r3.f113265b
            int r2 = r2.f113072e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = com.ss.android.lark.mediapicker.utils.C44757m.m177506a(r4, r1, r0, r2)
            goto L_0x0056
        L_0x0042:
            android.content.Context r4 = r3.f113268e
            r1 = 2131832906(0x7f11304a, float:1.929888E38)
            com.ss.android.lark.mediapicker.MediaPickerConfig r2 = r3.f113265b
            int r2 = r2.f113071d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = com.ss.android.lark.mediapicker.utils.C44757m.m177506a(r4, r1, r0, r2)
            goto L_0x0056
        L_0x0054:
            java.lang.String r4 = ""
        L_0x0056:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0061
            android.content.Context r0 = r3.f113268e
            com.larksuite.component.ui.toast.LKUIToast.show(r0, r4)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediapicker.pickerview.AbstractC44702a.mo158142a(int):void");
    }

    /* renamed from: b */
    private void m177289b(View view) {
        C44632c a = mo158378a(view);
        this.f113269f = a;
        a.f113128g.setLayoutManager(new LinearLayoutManager(this.f113268e, 0, false));
        AbstractC44634d a2 = mo158379a(this.f113268e, this.f113265b);
        this.f113264a = a2;
        a2.mo158206a(new AbstractC44634d.AbstractC44640c() {
            /* class com.ss.android.lark.mediapicker.pickerview.AbstractC44702a.C447031 */

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44640c
            /* renamed from: a */
            public boolean mo158217a(LocalMedia localMedia) {
                return AbstractC44702a.this.f113266c.mo158190a(localMedia);
            }
        });
        this.f113264a.mo158205a(new AbstractC44634d.AbstractC44639b() {
            /* class com.ss.android.lark.mediapicker.pickerview.AbstractC44702a.C447042 */

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44639b
            /* renamed from: a */
            public void mo158216a(LocalMedia localMedia, int i) {
                if (AbstractC44702a.this.f113265b.f113080m) {
                    AbstractC44702a.this.mo158221a(Collections.singletonList(localMedia), Collections.emptyList());
                    return;
                }
                AbstractC44702a aVar = AbstractC44702a.this;
                aVar.mo158380a(aVar.f113264a.mo158212c(), AbstractC44702a.this.f113264a.mo158210b(), i);
            }
        });
        this.f113269f.f113128g.setAdapter(this.f113264a);
        this.f113269f.f113123b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.pickerview.AbstractC44702a.C447053 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                List<LocalMedia> b = AbstractC44702a.this.f113264a.mo158210b();
                AbstractC44702a.this.mo158380a(b, b, 0);
            }
        });
        this.f113269f.f113124c.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.pickerview.AbstractC44702a.C447064 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                AbstractC44702a.this.f113266c.mo158189a();
            }
        });
        m177290c(Collections.EMPTY_LIST);
        if (this.f113265b.f113080m) {
            this.f113269f.f113123b.setVisibility(8);
            this.f113269f.f113124c.setVisibility(8);
        }
        this.f113269f.f113126e.setChecked(this.f113265b.f113085r);
        if (this.f113265b.f113080m || !this.f113265b.f113084q) {
            this.f113269f.f113127f.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m177290c(List<LocalMedia> list) {
        String str;
        boolean z;
        int i;
        boolean z2;
        if (list.size() > 0) {
            str = list.get(0).getMimeType();
        } else {
            str = "";
        }
        if (C44754j.m177502c(str) || !this.f113265b.f113084q) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f113269f.f113127f;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (list.size() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f113269f.f113123b.setVisibility(0);
            this.f113269f.f113124c.setEnabled(true);
            this.f113269f.f113125d.setEnabled(true);
            this.f113269f.f113125d.setText(C44757m.m177506a(this.f113268e, C44755k.m177504b(this.f113265b), "count", String.valueOf(list.size())));
            return;
        }
        this.f113269f.f113123b.setVisibility(8);
        this.f113269f.f113124c.setEnabled(false);
        this.f113269f.f113125d.setEnabled(false);
        this.f113269f.f113125d.setText(C44755k.m177503a(this.f113265b));
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158224a(boolean z) {
        this.f113269f.f113126e.setChecked(z);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: b */
    public void mo158227b(List<LocalMedia> list, List<LocalMedia> list2) {
        this.f113264a.mo158208a(list);
        this.f113264a.mo158211b(list2);
        m177290c(list2);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158221a(List<LocalMedia> list, List<LocalMedia> list2) {
        this.f113267d.mo158157a(list, list2, this.f113269f.f113126e.isChecked());
        this.f113266c.mo158191b();
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158218a(Context context, AbstractC44653g.AbstractC44655b.AbstractC44657b bVar, MediaPickerConfig mediaPickerConfig) {
        this.f113268e = context;
        this.f113267d = bVar;
        this.f113265b = mediaPickerConfig;
        m177289b(bVar.mo158154a());
    }

    /* renamed from: a */
    public void mo158380a(List<LocalMedia> list, List<LocalMedia> list2, int i) {
        this.f113267d.mo158156a(list, list2, i, this.f113269f.f113126e.isChecked(), this.f113265b);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158223a(List<LocalMediaFolder> list, List<LocalMedia> list2, List<LocalMedia> list3) {
        this.f113269f.f113131j.setVisibility(8);
        AbstractC44634d dVar = this.f113264a;
        if (dVar != null) {
            dVar.mo158208a(list2);
            this.f113264a.mo158211b(list3);
            m177290c(list3);
        }
    }
}
