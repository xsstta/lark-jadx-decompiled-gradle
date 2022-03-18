package com.bytedance.ee.bear.photopicker.photo.p520a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.photopicker.photo.C10497a;
import com.bytedance.ee.bear.photopicker.photo.C10524b;
import com.bytedance.ee.bear.photopicker.photo.C10531c;
import com.bytedance.ee.bear.photopicker.photo.ErrorResult;
import com.bytedance.ee.bear.photopicker.photo.MediaPickerViewLayoutManager;
import com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d;
import com.bytedance.ee.bear.photopicker.photo.p520a.C10501b;
import com.bytedance.ee.bear.photopicker.photo.p521b.C10528b;
import com.bytedance.ee.bear.photopicker.photo.p521b.C10529c;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.photopicker.photo.a.c */
public abstract class AbstractC10506c implements AbstractC10513d.AbstractC10517b {

    /* renamed from: a */
    public C10531c f28248a;

    /* renamed from: b */
    protected FileSelectConfig f28249b;

    /* renamed from: c */
    public AbstractC10513d.AbstractC10517b.AbstractC10518a f28250c;

    /* renamed from: d */
    protected AbstractC10513d.AbstractC10517b.AbstractC10519b f28251d;

    /* renamed from: e */
    private Context f28252e;

    /* renamed from: f */
    private C10497a f28253f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C10497a mo39883a(View view);

    /* renamed from: a */
    public abstract C10531c mo39884a(Context context, FileSelectConfig fileSelectConfig);

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: a */
    public void mo39885a() {
        this.f28253f.f28234i.setVisibility(0);
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: b */
    public boolean mo39894b() {
        return this.f28253f.f28230e.isChecked();
    }

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.a.c$6 */
    static /* synthetic */ class C105126 {

        /* renamed from: a */
        static final /* synthetic */ int[] f28260a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.photopicker.photo.ErrorResult$CheckMediaError[] r0 = com.bytedance.ee.bear.photopicker.photo.ErrorResult.CheckMediaError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.C105126.f28260a = r0
                com.bytedance.ee.bear.photopicker.photo.ErrorResult$CheckMediaError r1 = com.bytedance.ee.bear.photopicker.photo.ErrorResult.CheckMediaError.CANNOT_CHECK_BOTH_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.C105126.f28260a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.photopicker.photo.ErrorResult$CheckMediaError r1 = com.bytedance.ee.bear.photopicker.photo.ErrorResult.CheckMediaError.CANNOT_CHECK_MORE_THAN_SET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.C105126.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: b */
    public void mo39893b(List<Photo> list) {
        this.f28251d.mo39824a(list, this.f28253f.f28230e.isChecked());
        this.f28250c.mo39881b();
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: a */
    public void mo39888a(C10501b.C10504b bVar) {
        this.f28250c = bVar;
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: a */
    public void mo39887a(ErrorResult.CheckMediaError checkMediaError) {
        String str;
        int i = C105126.f28260a[checkMediaError.ordinal()];
        if (i == 1) {
            str = this.f28252e.getString(R.string.Lark_MediaPicker_CannotPickBothType);
        } else if (i != 2) {
            str = "";
        } else {
            List<Photo> a = this.f28248a.mo39903a();
            boolean z = false;
            if (!a.isEmpty() && C10524b.m43606b(a.get(0).getMimeType())) {
                z = true;
            }
            if (z) {
                str = C10529c.m43610a(this.f28252e, R.string.Lark_MediaPicker_PickVideoOverflow, "count", String.valueOf(1));
            } else {
                str = C10529c.m43610a(this.f28252e, R.string.Lark_MediaPicker_PickImageOverflow, "count", String.valueOf(this.f28249b.maxSelectImageNum));
            }
        }
        if (!TextUtils.isEmpty(str)) {
            UDToast.show(this.f28252e, str);
        }
    }

    /* renamed from: b */
    private void m43559b(View view) {
        this.f28253f = mo39883a(view);
        this.f28248a = mo39884a(this.f28252e, this.f28249b);
        final MediaPickerViewLayoutManager mediaPickerViewLayoutManager = new MediaPickerViewLayoutManager(this.f28252e, 0, false);
        this.f28253f.f28232g.setLayoutManager(mediaPickerViewLayoutManager);
        this.f28253f.f28232g.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.C105071 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                mediaPickerViewLayoutManager.mo39832a();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                mediaPickerViewLayoutManager.mo39832a();
            }
        });
        this.f28248a.mo39907a(new C10531c.AbstractC10536c() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.C105082 */

            @Override // com.bytedance.ee.bear.photopicker.photo.C10531c.AbstractC10536c
            /* renamed from: a */
            public boolean mo39895a(Photo photo) {
                return AbstractC10506c.this.f28250c.mo39880a(photo);
            }
        });
        this.f28248a.mo39906a(new C10531c.AbstractC10535b() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.C105093 */

            @Override // com.bytedance.ee.bear.photopicker.photo.C10531c.AbstractC10535b
            /* renamed from: a */
            public void mo39896a(Photo photo, int i, View view) {
                if (AbstractC10506c.this.f28249b.singleSelect) {
                    AbstractC10506c.this.mo39893b(Collections.singletonList(photo));
                    return;
                }
                AbstractC10506c cVar = AbstractC10506c.this;
                cVar.mo39891a(cVar.f28248a.mo39910b(), AbstractC10506c.this.f28248a.mo39903a(), i, view);
            }
        });
        this.f28253f.f28232g.setAdapter(this.f28248a);
        this.f28253f.f28227b.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.View$OnClickListenerC105104 */

            public void onClick(View view) {
                List<Photo> a = AbstractC10506c.this.f28248a.mo39903a();
                AbstractC10506c.this.mo39891a(a, a, 0, view);
            }
        });
        this.f28253f.f28228c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10506c.View$OnClickListenerC105115 */

            public void onClick(View view) {
                AbstractC10506c.this.f28250c.mo39879a();
            }
        });
        m43560c(Collections.EMPTY_LIST);
        if (this.f28249b.singleSelect) {
            this.f28253f.f28227b.setVisibility(8);
            this.f28253f.f28228c.setVisibility(8);
        }
        this.f28253f.f28230e.setChecked(this.f28249b.isOrigin);
        if (this.f28249b.singleSelect || !this.f28249b.showOrigin) {
            this.f28253f.f28231f.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m43560c(List<Photo> list) {
        String str;
        boolean z;
        int i;
        boolean z2;
        if (list.size() > 0) {
            str = list.get(0).getMimeType();
        } else {
            str = "";
        }
        if (C10524b.m43606b(str) || !this.f28249b.showOrigin) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f28253f.f28231f;
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
            this.f28253f.f28227b.setVisibility(0);
            this.f28253f.f28228c.setEnabled(true);
            this.f28253f.f28229d.setEnabled(true);
            this.f28253f.f28229d.setText(C10529c.m43610a(this.f28252e, C10528b.m43609b(this.f28249b), "count", String.valueOf(list.size())));
            return;
        }
        this.f28253f.f28227b.setVisibility(8);
        this.f28253f.f28228c.setEnabled(false);
        this.f28253f.f28229d.setEnabled(false);
        this.f28253f.f28229d.setText(C10528b.m43608a(this.f28249b));
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: a */
    public void mo39889a(List<Photo> list) {
        C10531c cVar = this.f28248a;
        if (cVar != null) {
            cVar.mo39912b(list);
            m43560c(list);
        }
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: a */
    public void mo39892a(boolean z) {
        this.f28253f.f28230e.setChecked(z);
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: a */
    public void mo39890a(List<Photo> list, List<Photo> list2) {
        this.f28253f.f28234i.setVisibility(8);
        C10531c cVar = this.f28248a;
        if (cVar != null) {
            cVar.mo39908a(list);
            this.f28248a.mo39912b(list2);
            m43560c(list2);
        }
    }

    @Override // com.bytedance.ee.bear.photopicker.photo.p520a.AbstractC10513d.AbstractC10517b
    /* renamed from: a */
    public void mo39886a(Context context, AbstractC10513d.AbstractC10517b.AbstractC10519b bVar, FileSelectConfig fileSelectConfig) {
        this.f28252e = context;
        this.f28251d = bVar;
        this.f28249b = fileSelectConfig;
        m43559b(bVar.mo39820a());
    }

    /* renamed from: a */
    public void mo39891a(List<Photo> list, List<Photo> list2, int i, View view) {
        this.f28251d.mo39823a(list, list2, i, this.f28253f.f28230e.isChecked(), this.f28249b, view);
    }
}
