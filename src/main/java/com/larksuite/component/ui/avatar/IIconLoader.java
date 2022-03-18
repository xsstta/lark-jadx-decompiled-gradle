package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.widget.ImageView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ui/avatar/IIconLoader;", "", "load", "", "context", "Landroid/content/Context;", "key", "", "entityId", "fsUnit", "width", "", "height", "imageView", "Landroid/widget/ImageView;", "callback", "Lcom/larksuite/component/ui/avatar/ILoadCallback;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.l */
public interface IIconLoader {
    /* renamed from: a */
    void mo89027a(Context context, String str, String str2, String str3, int i, int i2, ImageView imageView);

    /* renamed from: a */
    void mo89028a(Context context, String str, String str2, String str3, int i, int i2, ILoadCallback nVar);
}
