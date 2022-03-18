package com.ss.android.lark.mediapicker.album.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.AbstractC44634d;
import com.ss.android.lark.mediapicker.album.base.AbstractC44653g;
import com.ss.android.lark.mediapicker.album.base.C44627b;
import com.ss.android.lark.mediapicker.album.base.C44662k;
import com.ss.android.lark.mediapicker.entity.C44681b;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.entity.LocalMediaFolder;
import com.ss.android.lark.mediapicker.utils.C44754j;
import com.ss.android.lark.mediapicker.utils.C44755k;
import com.ss.android.lark.mediapicker.utils.C44757m;
import com.ss.android.lark.mediapicker.widget.OnSingleClickListener;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.e */
public abstract class AbstractC44641e implements AbstractC44653g.AbstractC44655b {

    /* renamed from: a */
    public AbstractC44634d f113149a;

    /* renamed from: b */
    public View$OnClickListenerC44650f f113150b;

    /* renamed from: c */
    public MediaPickerConfig f113151c;

    /* renamed from: d */
    public AbstractC44653g.AbstractC44655b.AbstractC44656a f113152d;

    /* renamed from: e */
    public C44632c f113153e;

    /* renamed from: f */
    public AbstractC44653g.AbstractC44655b.AbstractC44657b f113154f;

    /* renamed from: g */
    private Activity f113155g;

    /* renamed from: a */
    public abstract int mo158139a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C44632c mo158140a(View view);

    /* renamed from: a */
    public abstract AbstractC44634d mo158141a(Context context, MediaPickerConfig mediaPickerConfig);

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: b */
    public void mo158225b() {
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: c */
    public boolean mo158228c() {
        return this.f113153e.f113126e.isChecked();
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158219a(C44627b.C44630b bVar) {
        this.f113152d = bVar;
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: b */
    public void mo158226b(List<LocalMedia> list) {
        C44660j.m177158a().mo158244a(new C44681b(list, this.f113153e.f113126e.isChecked()));
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
            android.app.Activity r4 = r3.f113155g
            r0 = 2131832894(0x7f11303e, float:1.9298855E38)
            java.lang.String r4 = r4.getString(r0)
            goto L_0x0056
        L_0x0011:
            com.ss.android.lark.mediapicker.album.base.d r4 = r3.f113149a
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
            android.app.Activity r4 = r3.f113155g
            r1 = 2131832907(0x7f11304b, float:1.9298881E38)
            com.ss.android.lark.mediapicker.MediaPickerConfig r2 = r3.f113151c
            int r2 = r2.f113072e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = com.ss.android.lark.mediapicker.utils.C44757m.m177506a(r4, r1, r0, r2)
            goto L_0x0056
        L_0x0042:
            android.app.Activity r4 = r3.f113155g
            r1 = 2131832906(0x7f11304a, float:1.929888E38)
            com.ss.android.lark.mediapicker.MediaPickerConfig r2 = r3.f113151c
            int r2 = r2.f113071d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = com.ss.android.lark.mediapicker.utils.C44757m.m177506a(r4, r1, r0, r2)
            goto L_0x0056
        L_0x0054:
            java.lang.String r4 = ""
        L_0x0056:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0061
            android.app.Activity r0 = r3.f113155g
            com.larksuite.component.ui.toast.LKUIToast.show(r0, r4)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediapicker.album.base.AbstractC44641e.mo158142a(int):void");
    }

    /* renamed from: b */
    private void m177092b(View view) {
        C44632c a = mo158140a(view);
        this.f113153e = a;
        a.f113128g.setLayoutManager(new GridLayoutManager(this.f113155g, this.f113151c.f113077j));
        this.f113149a = mo158141a(this.f113155g, this.f113151c);
        View$OnClickListenerC44650f fVar = new View$OnClickListenerC44650f(this.f113155g);
        this.f113150b = fVar;
        fVar.mo158231a(new C44662k.AbstractC44664a() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446421 */

            @Override // com.ss.android.lark.mediapicker.album.base.C44662k.AbstractC44664a
            /* renamed from: a */
            public void mo158229a(String str, List<LocalMedia> list) {
                AbstractC44641e.this.f113153e.f113122a.setText(str);
                AbstractC44641e.this.f113149a.mo158208a(list);
                AbstractC44641e.this.f113153e.f113128g.scrollToPosition(0);
                AbstractC44641e.this.f113150b.dismiss();
            }
        });
        this.f113153e.f113122a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446432 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                if (AbstractC44641e.this.f113150b.isShowing()) {
                    AbstractC44641e.this.f113150b.dismiss();
                    return;
                }
                AbstractC44641e.this.f113150b.showAsDropDown(AbstractC44641e.this.f113153e.f113122a);
                AbstractC44641e.this.f113150b.mo158234b(AbstractC44641e.this.f113149a.mo158210b());
            }
        });
        this.f113149a.mo158206a(new AbstractC44634d.AbstractC44640c() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446443 */

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44640c
            /* renamed from: a */
            public boolean mo158217a(LocalMedia localMedia) {
                return AbstractC44641e.this.f113152d.mo158190a(localMedia);
            }
        });
        this.f113149a.mo158205a(new AbstractC44634d.AbstractC44639b() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446454 */

            @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44634d.AbstractC44639b
            /* renamed from: a */
            public void mo158216a(LocalMedia localMedia, int i) {
                if (AbstractC44641e.this.f113151c.f113080m) {
                    AbstractC44641e.this.mo158221a(Collections.singletonList(localMedia), Collections.emptyList());
                    return;
                }
                AbstractC44641e eVar = AbstractC44641e.this;
                eVar.mo158222a(eVar.f113149a.mo158212c(), AbstractC44641e.this.f113149a.mo158210b(), i);
            }
        });
        this.f113149a.mo158207a(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446465 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                AbstractC44641e.this.f113154f.mo158159c();
            }
        });
        this.f113153e.f113128g.setAdapter(this.f113149a);
        if (this.f113151c.f113087t) {
            this.f113153e.f113123b.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446476 */

                @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
                /* renamed from: a */
                public void mo158215a(View view) {
                    List<LocalMedia> b = AbstractC44641e.this.f113149a.mo158210b();
                    AbstractC44641e.this.mo158222a(b, b, 0);
                }
            });
        }
        this.f113153e.f113124c.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446487 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                AbstractC44641e.this.f113152d.mo158189a();
            }
        });
        m177093c(Collections.emptyList());
        int i = 8;
        if (this.f113151c.f113080m) {
            this.f113153e.f113127f.setVisibility(8);
            this.f113153e.f113123b.setVisibility(8);
            this.f113153e.f113124c.setVisibility(8);
        }
        this.f113153e.f113130i.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.album.base.AbstractC44641e.C446498 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                AbstractC44641e.this.f113154f.mo158158b();
            }
        });
        this.f113153e.f113126e.setChecked(this.f113151c.f113085r);
        View view2 = this.f113153e.f113127f;
        if (this.f113151c.f113084q) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    /* renamed from: c */
    private void m177093c(List<LocalMedia> list) {
        String str;
        int i;
        boolean z;
        if (list.size() > 0) {
            str = list.get(0).getMimeType();
        } else {
            str = "";
        }
        boolean c = C44754j.m177502c(str);
        View view = this.f113153e.f113127f;
        if (c || !this.f113151c.f113084q) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (list.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f113153e.f113123b.setVisibility(0);
            this.f113153e.f113124c.setEnabled(true);
            this.f113153e.f113125d.setEnabled(true);
            this.f113153e.f113125d.setText(C44757m.m177506a(this.f113155g, C44755k.m177504b(this.f113151c), "count", String.valueOf(list.size())));
            return;
        }
        this.f113153e.f113123b.setVisibility(8);
        this.f113153e.f113124c.setEnabled(false);
        this.f113153e.f113125d.setEnabled(false);
        this.f113153e.f113125d.setText(this.f113155g.getString(C44755k.m177503a(this.f113151c)));
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158220a(List<LocalMedia> list) {
        AbstractC44634d dVar = this.f113149a;
        if (dVar != null) {
            dVar.mo158211b(list);
            m177093c(list);
        }
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158224a(boolean z) {
        this.f113153e.f113126e.setChecked(z);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: b */
    public void mo158227b(List<LocalMedia> list, List<LocalMedia> list2) {
        this.f113149a.mo158208a(list);
        this.f113149a.mo158211b(list2);
        m177093c(list2);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158221a(List<LocalMedia> list, List<LocalMedia> list2) {
        this.f113154f.mo158157a(list, list2, this.f113153e.f113126e.isChecked());
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158218a(Context context, AbstractC44653g.AbstractC44655b.AbstractC44657b bVar, MediaPickerConfig mediaPickerConfig) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f113155g = activity;
            this.f113154f = bVar;
            this.f113151c = mediaPickerConfig;
            activity.setContentView(mo158139a());
            StatusBarUtil.setTransparent(this.f113155g);
            m177092b(this.f113155g.findViewById(R.id.root));
            return;
        }
        throw new IllegalArgumentException("context must be an activity! context: " + context);
    }

    /* renamed from: a */
    public void mo158222a(List<LocalMedia> list, List<LocalMedia> list2, int i) {
        this.f113154f.mo158156a(list, list2, i, this.f113153e.f113126e.isChecked(), this.f113151c);
    }

    @Override // com.ss.android.lark.mediapicker.album.base.AbstractC44653g.AbstractC44655b
    /* renamed from: a */
    public void mo158223a(List<LocalMediaFolder> list, List<LocalMedia> list2, List<LocalMedia> list3) {
        if (this.f113149a != null) {
            if (!list.isEmpty()) {
                this.f113153e.f113122a.setText(list.get(0).getName());
                this.f113150b.mo158232a(list);
            }
            this.f113149a.mo158208a(list2);
            this.f113149a.mo158211b(list3);
            m177093c(list3);
        }
    }
}
