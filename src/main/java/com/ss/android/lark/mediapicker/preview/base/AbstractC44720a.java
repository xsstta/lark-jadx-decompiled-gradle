package com.ss.android.lark.mediapicker.preview.base;

import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.jaeger.library.StatusBarUtil;
import com.ss.android.lark.mediapicker.MediaPickerConfig;
import com.ss.android.lark.mediapicker.album.base.C44660j;
import com.ss.android.lark.mediapicker.entity.C44681b;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import com.ss.android.lark.mediapicker.entity.LocalMedia;
import com.ss.android.lark.mediapicker.preview.base.AbstractC44726b;
import com.ss.android.lark.mediapicker.utils.C44754j;
import com.ss.android.lark.mediapicker.utils.C44755k;
import com.ss.android.lark.mediapicker.utils.C44757m;
import com.ss.android.lark.mediapicker.widget.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.preview.base.a */
public abstract class AbstractC44720a implements AbstractC44726b.AbstractC44728b {

    /* renamed from: a */
    private C44732e f113306a;

    /* renamed from: b */
    public FragmentActivity f113307b;

    /* renamed from: c */
    public AbstractC44726b.AbstractC44728b.AbstractC44729a f113308c;

    /* renamed from: d */
    public int f113309d;

    /* renamed from: e */
    public C44738i f113310e;

    /* renamed from: f */
    protected C44733f f113311f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo158400a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C44732e mo158401a(C44733f fVar);

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    public void mo158402a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo158403a(C44738i iVar) {
    }

    /* renamed from: b */
    public abstract C44738i mo158404b();

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    public void mo158420a(boolean z) {
        mo158425d(z);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: d */
    public boolean mo158426d() {
        C44738i iVar = this.f113310e;
        if (iVar == null || !iVar.f113342g.isChecked()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: c */
    public boolean mo158424c() {
        C44738i iVar = this.f113310e;
        if (iVar == null || iVar.f113344i == null || !m177366a(this.f113310e.f113344i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m177366a(FrameLayout frameLayout) {
        if (frameLayout.getVisibility() != 0 || frameLayout.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: b */
    public void mo158422b(boolean z) {
        int i;
        View view = this.f113310e.f113343h;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: c */
    private void m177368c(List<LocalMedia> list) {
        C44660j.m177158a().mo158244a(new C44681b(list, this.f113310e.f113342g.isChecked()));
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: c */
    public void mo158423c(boolean z) {
        boolean z2;
        int i = 0;
        if (!z || !this.f113311f.f113324d.f113079l) {
            z2 = false;
        } else {
            z2 = true;
        }
        View view = this.f113310e.f113339d;
        if (!z2) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: d */
    public void mo158425d(boolean z) {
        C44738i iVar = this.f113310e;
        if (iVar != null && iVar.f113336a != null) {
            this.f113310e.f113336a.setChecked(z);
            if (z) {
                this.f113310e.f113336a.setText(String.valueOf(this.f113308c.mo158445e(this.f113310e.f113338c.getCurrentItem()) + 1));
                return;
            }
            this.f113310e.f113336a.setText("");
        }
    }

    /* renamed from: b */
    private void m177367b(List<LocalMedia> list) {
        boolean z;
        if (list.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f113310e.f113341f.setText(C44757m.m177506a(this.f113307b, C44755k.m177504b(this.f113311f.f113324d), "count", String.valueOf(list.size())));
        } else {
            this.f113310e.f113341f.setText(this.f113307b.getString(C44755k.m177503a(this.f113311f.f113324d)));
        }
        m177368c(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158414a(int r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mediapicker.preview.base.AbstractC44720a.mo158414a(int):void");
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    public void mo158416a(EditInfo editInfo) {
        this.f113306a.mo158449a(editInfo);
        C44660j.m177158a().mo158243a(editInfo);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: b */
    public void mo158421b(C44733f fVar) {
        mo158403a(this.f113310e);
        this.f113311f = fVar;
        this.f113310e.f113342g.setChecked(fVar.f113325e);
        this.f113309d = fVar.f113323c;
        this.f113306a = mo158401a(fVar);
        this.f113310e.f113338c.setAdapter(this.f113306a);
        this.f113310e.f113338c.addOnPageChangeListener(new ViewPager.C1581f() {
            /* class com.ss.android.lark.mediapicker.preview.base.AbstractC44720a.C447211 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
            public void onPageSelected(int i) {
                AbstractC44720a.this.f113309d = i;
                AbstractC44720a.this.f113308c.mo158443c(AbstractC44720a.this.f113309d);
            }
        });
        this.f113310e.f113338c.setCurrentItem(this.f113309d);
        m177367b(fVar.f113322b);
        this.f113308c.mo158443c(this.f113309d);
        this.f113310e.f113336a.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.preview.base.AbstractC44720a.C447222 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                AbstractC44720a.this.mo158425d(AbstractC44720a.this.f113308c.mo158442b(AbstractC44720a.this.f113310e.f113338c.getCurrentItem()));
            }
        });
        this.f113310e.f113340e.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.preview.base.AbstractC44720a.C447233 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                AbstractC44720a.this.f113308c.mo158439a(AbstractC44720a.this.f113310e.f113338c.getCurrentItem());
            }
        });
        this.f113310e.f113342g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.mediapicker.preview.base.AbstractC44720a.C447244 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractC44720a.this.f113308c.mo158441a(z);
            }
        });
        this.f113310e.f113337b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mediapicker.preview.base.AbstractC44720a.C447255 */

            @Override // com.ss.android.lark.mediapicker.widget.OnSingleClickListener
            /* renamed from: a */
            public void mo158215a(View view) {
                AbstractC44720a.this.f113307b.onBackPressed();
            }
        });
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    public void mo158417a(AbstractC44726b.AbstractC44728b.AbstractC44729a aVar) {
        this.f113308c = aVar;
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    public void mo158418a(List<LocalMedia> list) {
        m177367b(list);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    public void mo158415a(FragmentActivity fragmentActivity, MediaPickerConfig mediaPickerConfig) {
        this.f113307b = fragmentActivity;
        fragmentActivity.setContentView(mo158400a());
        C44738i b = mo158404b();
        this.f113310e = b;
        StatusBarUtil.setTranslucentForImageView(fragmentActivity, 0, b.f113337b);
    }

    @Override // com.ss.android.lark.mediapicker.preview.base.AbstractC44726b.AbstractC44728b
    /* renamed from: a */
    public void mo158419a(List<LocalMedia> list, List<LocalMedia> list2) {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list2);
        if (!list.isEmpty() && C44754j.m177502c(list.get(0).getMimeType())) {
            intent.putExtra("PICKED_VIDEO", true);
        }
        ArrayList<String> arrayList3 = new ArrayList<>();
        for (LocalMedia localMedia : list) {
            arrayList3.add(localMedia.getPath());
        }
        intent.putStringArrayListExtra("PICKED_MEDIAS_URLS", arrayList3);
        intent.putExtra("PICKED_MEDIAS", arrayList);
        intent.putExtra("EDITED_MEDIAS", arrayList2);
        intent.putExtra("PICKED_ORIGIN", this.f113310e.f113336a.isChecked());
        intent.putExtra("isSend", true);
        this.f113307b.setResult(-1, intent);
        this.f113307b.finish();
    }
}
