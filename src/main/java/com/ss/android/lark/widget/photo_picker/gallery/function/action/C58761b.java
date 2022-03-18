package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.utils.PhotoPreviewUtils;
import java.io.File;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.b */
public class C58761b implements AbstractC58768d {

    /* renamed from: a */
    public Context f145245a;

    /* renamed from: b */
    public File f145246b;

    /* renamed from: c */
    private boolean f145247c;

    /* renamed from: d */
    private PhotoItem f145248d;

    /* renamed from: e */
    private AbstractC58763a f145249e;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.b$a */
    public interface AbstractC58763a {
        /* renamed from: a */
        void mo198996a(String str, String str2);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return -1;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58761b.RunnableC587621 */

            public void run() {
                if (C58761b.this.f145245a instanceof Activity) {
                    ((Activity) C58761b.this.f145245a).setRequestedOrientation(1);
                }
                C58761b bVar = C58761b.this;
                bVar.mo199188a(bVar.f145246b);
            }
        };
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        return UIUtils.getString(this.f145245a, R.string.Lark_Legacy_Edit);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        return PhotoPreviewUtils.m227507a(this.f145248d, this.f145246b, this.f145247c);
    }

    /* renamed from: a */
    public void mo199188a(File file) {
        String E = C57881t.m224606E(this.f145245a.getApplicationContext());
        AbstractC58763a aVar = this.f145249e;
        if (aVar != null && file != null) {
            String absolutePath = file.getAbsolutePath();
            aVar.mo198996a(absolutePath, E + System.currentTimeMillis() + ".jpg");
        }
    }

    public C58761b(Context context, boolean z, PhotoItem photoItem, File file, AbstractC58763a aVar) {
        this.f145245a = context;
        this.f145247c = z;
        this.f145248d = photoItem;
        this.f145246b = file;
        this.f145249e = aVar;
    }
}
