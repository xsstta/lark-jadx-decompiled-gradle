package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.ee.android.file.picker.lib.media.BaseFileEntry;
import com.bytedance.ee.android.file.picker.lib.media.FileEntry;
import com.bytedance.ee.android.file.picker.lib.media.VideoEntry;
import com.bytedance.ee.android.file.picker.lib.utils.DateTimeUtils;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.android.file.picker.lib.local.a */
public class C4059a {

    /* renamed from: a */
    public int f12336a = -1;

    /* renamed from: b */
    public int f12337b;

    /* renamed from: c */
    public int f12338c;

    /* renamed from: d */
    private boolean f12339d;

    /* renamed from: e */
    private BaseFileEntry f12340e;

    /* renamed from: j */
    public boolean mo15947j() {
        return this.f12339d;
    }

    /* renamed from: l */
    private boolean m16913l() {
        if (this.f12337b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m16915n() {
        if (this.f12337b == 34) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public <T extends BaseFileEntry> T mo15933a() {
        if (m16912k()) {
            return (T) this.f12340e;
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo15937b() {
        if (this.f12337b % 2 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String mo15938c() {
        if (m16912k()) {
            return this.f12340e.getName();
        }
        return null;
    }

    /* renamed from: e */
    public Uri mo15940e() {
        if (m16912k()) {
            return this.f12340e.getUri();
        }
        return null;
    }

    /* renamed from: k */
    private boolean m16912k() {
        if (m16913l() || m16914m() || m16915n()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m16914m() {
        int i;
        if (mo15937b() || (i = this.f12337b) < 18 || i > 24) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public String mo15939d() {
        if (m16912k()) {
            return FileUtils.f12473a.mo16103a(this.f12340e.getSize());
        }
        return null;
    }

    /* renamed from: f */
    public String mo15942f() {
        if (m16913l()) {
            return DateTimeUtils.f12470a.mo16096a(((VideoEntry) mo15933a()).getDuration());
        }
        return null;
    }

    /* renamed from: g */
    public String mo15943g() {
        if (m16913l()) {
            return ((VideoEntry) mo15933a()).getThumbPath();
        }
        return null;
    }

    /* renamed from: h */
    public Drawable mo15944h() {
        if (m16915n()) {
            return ((FileEntry) mo15933a()).getApkIcon();
        }
        return null;
    }

    public int hashCode() {
        int i;
        int i2 = ((((this.f12337b * 31) + this.f12338c) * 31) + (this.f12339d ? 1 : 0)) * 31;
        BaseFileEntry baseFileEntry = this.f12340e;
        if (baseFileEntry != null) {
            i = baseFileEntry.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    /* renamed from: i */
    public int mo15946i() {
        if (m16913l()) {
            return R.drawable.icon_file_video_rectangle;
        }
        if (m16914m()) {
            return this.f12340e.getIconResId();
        }
        if (m16915n()) {
            return this.f12340e.getIconResId();
        }
        return R.drawable.icon_file_default_rectangle;
    }

    /* renamed from: a */
    public void mo15936a(boolean z) {
        this.f12339d = z;
    }

    /* renamed from: a */
    public static boolean m16911a(int i) {
        if (i % 2 == 1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4059a aVar = (C4059a) obj;
        if (this.f12337b != aVar.f12337b || this.f12338c != aVar.f12338c || this.f12339d != aVar.f12339d) {
            return false;
        }
        BaseFileEntry baseFileEntry = this.f12340e;
        BaseFileEntry baseFileEntry2 = aVar.f12340e;
        if (baseFileEntry != null) {
            return baseFileEntry.equals(baseFileEntry2);
        }
        if (baseFileEntry2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo15934a(Context context) {
        int i = this.f12337b;
        if (i == 1) {
            return UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_FileTypeVideo);
        }
        if (i == 17) {
            return UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_FileTypeExcel);
        }
        if (i == 19) {
            return UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_FileTypeWord);
        }
        if (i == 21) {
            return UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_FileTypePpt);
        }
        if (i == 23) {
            return UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_FileTypePdf);
        }
        if (i != 33) {
            return UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_FileTypeOther);
        }
        return UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_FileTypeReceive);
    }

    /* renamed from: a */
    public void mo15935a(int i, int i2, BaseFileEntry baseFileEntry) {
        this.f12336a = i;
        this.f12337b = i2;
        this.f12340e = baseFileEntry;
    }
}
