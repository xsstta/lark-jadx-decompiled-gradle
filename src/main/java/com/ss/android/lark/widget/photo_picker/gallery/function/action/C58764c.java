package com.ss.android.lark.widget.photo_picker.gallery.function.action;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.p2951f.C58659h;
import com.ss.android.lark.widget.photo_picker.p2951f.C58660i;
import java.io.File;
import java.util.Collections;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.function.action.c */
public class C58764c implements AbstractC58768d {

    /* renamed from: a */
    public final Context f145251a;

    /* renamed from: b */
    public final PhotoItem f145252b;

    /* renamed from: c */
    public final IRequestCreator f145253c;

    /* renamed from: d */
    private final boolean f145254d;

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: d */
    public int mo199179d() {
        return -1;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: a */
    public Runnable mo199177a() {
        return new Runnable() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58764c.RunnableC587651 */

            public void run() {
                C58764c.this.mo199190b();
            }
        };
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: c */
    public String mo199178c() {
        return UIUtils.getString(this.f145251a, R.string.Lark_Legacy_MenuForward);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.function.action.AbstractC58768d
    /* renamed from: e */
    public boolean mo199180e() {
        boolean z;
        MessageIdentity messageIdentity;
        PhotoItem photoItem = this.f145252b;
        if (photoItem == null || (messageIdentity = photoItem.getMessageIdentity()) == null || !messageIdentity.isHideForward()) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f145254d || this.f145252b == null || z || DesktopUtil.m144301a(this.f145251a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo199190b() {
        boolean z;
        Message message;
        PhotoItem photoItem = this.f145252b;
        if (photoItem != null) {
            final ImageContent a = C58660i.m227523a(photoItem);
            boolean z2 = false;
            if (this.f145252b.getMessageIdentity() == null || this.f145252b.getMessageIdentity().getSourceType() == Message.SourceType.TYPE_FROM_MERGEFORWARD || !TextUtils.isEmpty(this.f145252b.getToken())) {
                z = true;
            } else {
                z = false;
            }
            if (this.f145252b.getMessageIdentity() == null) {
                message = null;
            } else {
                message = C58612c.m227290a().mo102856c(this.f145252b.getMessageIdentity().getMessageId());
            }
            if (this.f145252b.getMessageIdentity() != null && this.f145252b.getMessageIdentity().getSourceType() == Message.SourceType.TYPE_FROM_CHAT_HISTORY) {
                if (message != null && message.getType() == Message.Type.POST) {
                    z2 = true;
                }
                z = z2;
            }
            if (z) {
                C57865c.m224574a(new C57865c.AbstractC57873d<File>() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58764c.C587662 */

                    /* renamed from: a */
                    public File produce() {
                        try {
                            return C58612c.m227290a().mo102827a(C58764c.this.f145253c, C58764c.this.f145252b.getCurrentUrl(), C58764c.this.f145252b.getImageKey(), C58764c.this.f145252b.getEntityId(), C58659h.m227515a(C58764c.this.f145252b), C58764c.this.f145252b.getType());
                        } catch (Exception e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }, new C57865c.AbstractC57871b<File>() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.function.action.C58764c.C587673 */

                    /* renamed from: a */
                    public void consume(File file) {
                        if (file != null) {
                            Image image = new Image();
                            image.setUrls(Collections.singletonList(file.getAbsolutePath()));
                            a.getImageSet().setOrigin(image);
                            a.getImageSet().setMessageIdentity(null);
                            C58612c.m227290a().mo102838a(C58764c.this.f145251a, a);
                            return;
                        }
                        LKUIToast.show(C58764c.this.f145251a, (int) R.string.Lark_Legacy_SaveFailTip);
                    }
                });
            } else if (message == null || message.getType() != Message.Type.STICKER) {
                C58612c.m227290a().mo102838a(this.f145251a, a);
            } else {
                C58612c.m227290a().mo102840a(this.f145251a, message.getId(), (StickerContent) message.getContent());
            }
        }
    }

    public C58764c(Context context, boolean z, PhotoItem photoItem) {
        this.f145251a = context;
        this.f145254d = z;
        this.f145252b = photoItem;
        this.f145253c = ImageLoader.with(context);
    }
}
