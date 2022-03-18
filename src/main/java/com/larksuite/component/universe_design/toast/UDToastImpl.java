package com.larksuite.component.universe_design.toast;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "", "cancel", "", "isShowing", "", "setIcon", "drawable", "Landroid/graphics/drawable/Drawable;", "resId", "", "setText", "s", "", "show", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.toast.d */
public interface UDToastImpl {
    /* renamed from: a */
    void mo91660a(int i);

    /* renamed from: a */
    void mo91663a(Drawable drawable);

    /* renamed from: c */
    boolean mo91668c();

    void cancel();

    void setText(CharSequence charSequence);

    void show();
}
