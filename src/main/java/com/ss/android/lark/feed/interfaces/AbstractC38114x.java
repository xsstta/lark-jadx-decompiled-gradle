package com.ss.android.lark.feed.interfaces;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.biz.im.api.ShortcutInfoLoadResult;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.interfaces.x */
public interface AbstractC38114x {
    /* renamed from: a */
    ShortcutInfoLoadResult mo139424a();

    /* renamed from: a */
    ShortcutInfoLoadResult mo139425a(String str);

    /* renamed from: a */
    List<Shortcut> mo139426a(List<String> list);

    /* renamed from: a */
    void mo139427a(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback);

    /* renamed from: a */
    void mo139428a(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback, int i);

    /* renamed from: b */
    void mo139429b(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback);

    /* renamed from: b */
    void mo139430b(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback, int i);

    /* renamed from: b */
    boolean mo139431b(String str);
}
