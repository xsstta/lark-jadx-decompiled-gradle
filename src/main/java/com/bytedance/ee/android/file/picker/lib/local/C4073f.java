package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.loader.p045a.AbstractC1181a;
import com.bytedance.ee.android.file.picker.lib.callback.ICallback;
import com.bytedance.ee.android.file.picker.lib.callback.IGetDataCallback;
import com.bytedance.ee.android.file.picker.lib.callback.UIGetContinualDataCallback;
import com.bytedance.ee.android.file.picker.lib.dependency.C4048c;
import com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b;
import com.bytedance.ee.android.file.picker.lib.local.C4073f;
import com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry;
import com.bytedance.ee.android.file.picker.lib.mvp.BasePresenter;
import com.bytedance.ee.android.file.picker.lib.p235a.C4038a;
import com.bytedance.ee.android.file.picker.lib.statistics.FilePickerHitPoint;
import com.bytedance.ee.android.file.picker.lib.utils.FileEntryUtils;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.bytedance.ee.android.file.picker.lib.utils.TemplateUtils;
import com.bytedance.ee.android.file.picker.lib.utils.UIExecutor;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.android.file.picker.lib.local.f */
public class C4073f extends BasePresenter<AbstractC4060b.AbstractC4061a, AbstractC4060b.AbstractC4062b, AbstractC4060b.AbstractC4062b.AbstractC4063a> {

    /* renamed from: a */
    public AbstractC4078b f12369a;

    /* renamed from: d */
    private C4038a f12370d;

    /* renamed from: e */
    private AbstractC1181a f12371e;

    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.f$b */
    public interface AbstractC4078b {
        /* renamed from: a */
        int mo15993a();

        /* renamed from: a */
        void mo15994a(List<Uri> list, long j);

        /* renamed from: b */
        long mo15995b();

        /* renamed from: c */
        long mo15996c();

        /* renamed from: d */
        String mo15997d();

        /* renamed from: e */
        String mo15998e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC4060b.AbstractC4062b.AbstractC4063a mo15860d() {
        return new C4077a();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle, com.bytedance.ee.android.file.picker.lib.mvp.BasePresenter
    /* renamed from: c */
    public void mo15856c() {
        this.f12370d.mo15811a();
        super.mo15856c();
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle, com.bytedance.ee.android.file.picker.lib.mvp.BasePresenter
    public void j_() {
        super.j_();
        this.f12370d = new C4038a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.f$a */
    public class C4077a implements AbstractC4060b.AbstractC4062b.AbstractC4063a {
        @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b.AbstractC4063a
        /* renamed from: a */
        public void mo15970a() {
            List<Uri> a = ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15948a();
            FilePickerHitPoint.f12299a.mo15890a(a.size(), a.size(), 0);
            if (C4073f.this.f12369a != null) {
                C4073f.this.f12369a.mo15994a(a, ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).i_());
            }
        }

        private C4077a() {
        }

        @Override // com.bytedance.ee.android.file.picker.lib.local.AbstractC4060b.AbstractC4062b.AbstractC4063a
        /* renamed from: a */
        public void mo15971a(Context context, boolean z, BaseFileEntry baseFileEntry) {
            String str;
            boolean z2;
            if (z) {
                if (!C4073f.this.mo15987a(context) || !C4073f.this.mo15986a(baseFileEntry.getSize()) || !C4073f.this.mo15989b(baseFileEntry.getSize()) || !C4073f.this.mo15988a(context, baseFileEntry) || !((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15953a(baseFileEntry.getUri())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    ((AbstractC4060b.AbstractC4062b) C4073f.this.mo15861e()).mo15961a(baseFileEntry);
                    ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15950a(baseFileEntry.getSize());
                }
                str = "select";
            } else {
                z2 = ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15957b(baseFileEntry.getUri());
                if (z2) {
                    ((AbstractC4060b.AbstractC4062b) C4073f.this.mo15861e()).mo15966b(baseFileEntry);
                    ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15955b(baseFileEntry.getSize());
                }
                str = "select_cancel";
            }
            if (z2) {
                FilePickerHitPoint.Companion aVar = FilePickerHitPoint.f12299a;
                FileUtils gVar = FileUtils.f12473a;
                aVar.mo15892a(FileUtils.m17138a(baseFileEntry.getUri()), str, "disk");
            }
            List<Uri> a = ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15948a();
            ((AbstractC4060b.AbstractC4062b) C4073f.this.mo15861e()).mo15964a(!a.isEmpty(), a);
        }
    }

    /* renamed from: b */
    private void m16985b(Context context) {
        ((AbstractC4060b.AbstractC4061a) mo15862f()).mo15951a(context, this.f12371e, (IGetDataCallback) this.f12370d.mo15810a((ICallback) new UIGetContinualDataCallback(new IGetDataCallback<List<BaseFileEntry>>() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4073f.C40741 */

            /* renamed from: a */
            public void mo15818a(List<BaseFileEntry> list) {
                List<Uri> b = ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15954b();
                ((AbstractC4060b.AbstractC4062b) C4073f.this.mo15861e()).mo15963a(list, b);
                C4073f.this.mo15985a(b);
            }
        })));
    }

    /* renamed from: c */
    private void m16987c(Context context) {
        ((AbstractC4060b.AbstractC4061a) mo15862f()).mo15956b(context, this.f12371e, (IGetDataCallback) this.f12370d.mo15810a((ICallback) new UIGetContinualDataCallback(new IGetDataCallback<List<BaseFileEntry>>() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4073f.C40752 */

            /* renamed from: a */
            public void mo15818a(List<BaseFileEntry> list) {
                List<Uri> b = ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15954b();
                ((AbstractC4060b.AbstractC4062b) C4073f.this.mo15861e()).mo15968b(list, b);
                C4073f.this.mo15985a(b);
            }
        })));
    }

    /* renamed from: a */
    public void mo15985a(List<Uri> list) {
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15964a(!list.isEmpty(), list);
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15965b();
    }

    /* renamed from: a */
    public boolean mo15986a(long j) {
        String str;
        long j2;
        AbstractC4078b bVar = this.f12369a;
        if (bVar != null) {
            j2 = bVar.mo15996c();
            str = this.f12369a.mo15998e();
        } else {
            j2 = Long.MAX_VALUE;
            str = "";
        }
        if (j <= j2) {
            return true;
        }
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15967b(str);
        FilePickerHitPoint.f12299a.mo15891a(String.valueOf(j));
        return false;
    }

    /* renamed from: b */
    public boolean mo15989b(long j) {
        String str;
        long j2;
        AbstractC4078b bVar = this.f12369a;
        if (bVar != null) {
            j2 = bVar.mo15995b();
            str = this.f12369a.mo15997d();
        } else {
            j2 = Long.MAX_VALUE;
            str = "";
        }
        long i_ = ((AbstractC4060b.AbstractC4061a) mo15862f()).i_() + j;
        if (i_ <= j2) {
            return true;
        }
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15967b(str);
        FilePickerHitPoint.f12299a.mo15891a(String.valueOf(i_));
        return false;
    }

    /* renamed from: a */
    public boolean mo15987a(Context context) {
        int i;
        AbstractC4078b bVar = this.f12369a;
        if (bVar != null) {
            i = bVar.mo15993a();
        } else {
            i = Integer.MAX_VALUE;
        }
        if (((AbstractC4060b.AbstractC4061a) mo15862f()).mo15948a().size() != i) {
            return true;
        }
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15962a(TemplateUtils.f12481a.mo16116a(context, R.string.Lark_Legacy_SendAttachedFileSelectedExceedMaxLimit, "max_select_count", Integer.toString(i)));
        return false;
    }

    /* renamed from: b */
    private void m16986b(Context context, final int i) {
        ((AbstractC4060b.AbstractC4061a) mo15862f()).mo15952a(context, (IGetDataCallback) this.f12370d.mo15810a(new IGetDataCallback<List<BaseFileEntry>>() {
            /* class com.bytedance.ee.android.file.picker.lib.local.C4073f.C40763 */

            /* renamed from: a */
            public void mo15818a(List<BaseFileEntry> list) {
                UIExecutor.f12485a.mo16120a(new Runnable(i, list) {
                    /* class com.bytedance.ee.android.file.picker.lib.local.$$Lambda$f$3$xaFKiOLMRGiLN91QF_8_l1kFOc */
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ List f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C4073f.C40763.this.m17002a(this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m17002a(int i, List list) {
                List<BaseFileEntry> a;
                List<Uri> b = ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15954b();
                if (i == 202001 && (a = ((AbstractC4060b.AbstractC4061a) C4073f.this.mo15862f()).mo15949a(list)) != null) {
                    ((AbstractC4060b.AbstractC4062b) C4073f.this.mo15861e()).mo15968b(a, b);
                }
                ((AbstractC4060b.AbstractC4062b) C4073f.this.mo15861e()).mo15969c(list, b);
                C4073f.this.mo15985a(b);
            }
        }));
    }

    /* renamed from: a */
    public void mo15984a(Context context, int i) {
        C4048c.m16858c("loadData fileType: " + i);
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15959a();
        if (i != 202001) {
            m16985b(context);
            m16987c(context);
            m16986b(context, i);
            return;
        }
        List<Uri> b = ((AbstractC4060b.AbstractC4061a) mo15862f()).mo15954b();
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15963a(new ArrayList(), b);
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15968b(new ArrayList(), b);
        m16986b(context, i);
    }

    /* renamed from: a */
    public boolean mo15988a(Context context, BaseFileEntry baseFileEntry) {
        return FileEntryUtils.m17130a(baseFileEntry, context);
    }

    /* renamed from: a */
    public void mo15983a(int i, int i2, Intent intent) {
        ((AbstractC4060b.AbstractC4062b) mo15861e()).mo15960a(i, i2, intent);
    }

    C4073f(AbstractC4078b bVar, AbstractC4060b.AbstractC4061a aVar, AbstractC4060b.AbstractC4062b bVar2, AbstractC1181a aVar2) {
        super(aVar, bVar2);
        this.f12371e = aVar2;
        this.f12369a = bVar;
    }
}
