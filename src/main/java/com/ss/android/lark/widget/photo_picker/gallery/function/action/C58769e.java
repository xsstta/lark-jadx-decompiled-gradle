package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.e */
public class C58769e implements AbstractC58768d {

    /* renamed from: a */
    public PhotoItem f145259a;

    /* renamed from: b */
    public AbstractC58771a f145260b;

    /* renamed from: c */
    private Context f145261c;

    /* renamed from: d */
    private boolean f145262d;

    /* renamed from: e */
    private String f145263e;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.e$a */
    public interface AbstractC58771a {
        /* renamed from: a */
        void mo199195a(String str);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return R.drawable.icon_view_in_chat_selector;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58769e.RunnableC587701 */

            public void run() {
                MessageIdentity messageIdentity;
                if (C58769e.this.f145259a != null && C58769e.this.f145260b != null && (messageIdentity = C58769e.this.f145259a.getMessageIdentity()) != null) {
                    C58769e.this.f145260b.mo199195a(messageIdentity.getMessageId());
                }
            }
        };
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        if (TextUtils.isEmpty(this.f145263e)) {
            return UIUtils.getString(this.f145261c, R.string.Lark_Legacy_JumpToChat);
        }
        return this.f145263e;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        boolean z;
        MessageIdentity messageIdentity;
        PhotoItem photoItem = this.f145259a;
        if (photoItem == null || (messageIdentity = photoItem.getMessageIdentity()) == null || !messageIdentity.isHideJumpChat()) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f145262d || z) {
            return false;
        }
        return true;
    }

    public C58769e(Context context, boolean z, PhotoItem photoItem, String str, AbstractC58771a aVar) {
        this.f145261c = context;
        this.f145262d = z;
        this.f145259a = photoItem;
        this.f145263e = str;
        this.f145260b = aVar;
    }
}
