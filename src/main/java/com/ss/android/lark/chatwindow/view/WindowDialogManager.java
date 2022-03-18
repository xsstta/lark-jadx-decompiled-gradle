package com.ss.android.lark.chatwindow.view;

import android.app.Dialog;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\u000bR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/WindowDialogManager;", "", "()V", "mDialogMap", "", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Dialog;", "mPopupWindowMap", "Landroid/widget/PopupWindow;", "addWindow", "", "window", "clearWindows", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatwindow.view.d */
public final class WindowDialogManager {

    /* renamed from: a */
    public static final WindowDialogManager f91123a = new WindowDialogManager();

    /* renamed from: b */
    private static final Map<Integer, WeakReference<Dialog>> f91124b = new HashMap(8);

    /* renamed from: c */
    private static final Map<Integer, WeakReference<PopupWindow>> f91125c = new HashMap(8);

    private WindowDialogManager() {
    }

    /* renamed from: a */
    public final void mo129818a() {
        for (Map.Entry<Integer, WeakReference<Dialog>> entry : f91124b.entrySet()) {
            Dialog dialog = entry.getValue().get();
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        f91124b.clear();
        for (Map.Entry<Integer, WeakReference<PopupWindow>> entry2 : f91125c.entrySet()) {
            PopupWindow popupWindow = entry2.getValue().get();
            if (popupWindow != null && popupWindow.isShowing()) {
                popupWindow.dismiss();
            }
        }
        f91125c.clear();
    }

    /* renamed from: a */
    public final void mo129819a(Dialog dialog) {
        boolean z;
        if (dialog != null) {
            Map<Integer, WeakReference<Dialog>> map = f91124b;
            map.put(Integer.valueOf(dialog.hashCode()), new WeakReference<>(dialog));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, WeakReference<Dialog>> entry : map.entrySet()) {
                if (entry.getValue().get() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo129820a(PopupWindow popupWindow) {
        boolean z;
        if (popupWindow != null) {
            Map<Integer, WeakReference<PopupWindow>> map = f91125c;
            map.put(Integer.valueOf(popupWindow.hashCode()), new WeakReference<>(popupWindow));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, WeakReference<PopupWindow>> entry : map.entrySet()) {
                if (entry.getValue().get() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
