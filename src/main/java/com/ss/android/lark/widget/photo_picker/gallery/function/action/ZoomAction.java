package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.ImageUtils;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ZoomAction implements AbstractC58768d {

    /* renamed from: a */
    public int f145223a;

    /* renamed from: b */
    public AbstractC58755a f145224b;

    /* renamed from: c */
    private Context f145225c;

    /* renamed from: d */
    private File f145226d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ZOOM_TYPE {
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.ZoomAction$a */
    public interface AbstractC58755a {
        /* renamed from: a */
        void mo199182a(int i);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        return "";
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.ZoomAction.RunnableC587541 */

            public void run() {
                if (ZoomAction.this.f145224b != null) {
                    ZoomAction.this.f145224b.mo199182a(ZoomAction.this.f145223a);
                }
            }
        };
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        if (this.f145223a == 0) {
            return R.drawable.icon_zoom_in_selector;
        }
        return R.drawable.icon_zoom_out_selector;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        boolean z;
        File file = this.f145226d;
        if (file == null || ImageUtils.m224131a(file) != ImageUtils.ImageType.TYPE_GIF) {
            z = false;
        } else {
            z = true;
        }
        if (!DesktopUtil.m144307b() || z) {
            return false;
        }
        return true;
    }

    public ZoomAction(Context context, int i, File file, AbstractC58755a aVar) {
        this.f145225c = context;
        this.f145223a = i;
        this.f145226d = file;
        this.f145224b = aVar;
    }
}
