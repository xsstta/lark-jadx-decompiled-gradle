package com.bytedance.ee.bear.browser.plugin;

import android.view.View;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import java.util.List;

public interface TitleBar {

    public enum MenuType {
        Left,
        Right
    }

    public enum TitleGravity {
        Left,
        Center
    }

    /* renamed from: com.bytedance.ee.bear.browser.plugin.TitleBar$a */
    public interface AbstractC4938a {
        void onTitleBarStateChanged(C4940b bVar);
    }

    /* renamed from: a */
    View mo19507a(String str);

    /* renamed from: a */
    BaseTitleBar mo19508a();

    /* renamed from: a */
    void mo19509a(int i);

    /* renamed from: a */
    void mo19510a(TitleGravity titleGravity);

    /* renamed from: a */
    void mo19511a(AbstractC4938a aVar);

    /* renamed from: a */
    void mo19512a(CharSequence charSequence);

    /* renamed from: a */
    void mo19513a(List<MenuItem> list);

    /* renamed from: a */
    void mo19514a(List<MenuItem> list, MenuType menuType);

    /* renamed from: a */
    void mo19515a(boolean z);

    /* renamed from: b */
    void mo19516b(int i);

    /* renamed from: b */
    void mo19517b(AbstractC4938a aVar);

    /* renamed from: b */
    void mo19518b(CharSequence charSequence);

    /* renamed from: b */
    void mo19519b(boolean z);

    /* renamed from: b */
    boolean mo19520b();

    /* renamed from: c */
    C4940b mo19521c();

    /* renamed from: c */
    void mo19522c(boolean z);

    /* renamed from: d */
    void mo19523d();

    /* renamed from: d */
    void mo19524d(boolean z);

    /* renamed from: e */
    void mo19525e(boolean z);

    /* renamed from: f */
    void mo19526f(boolean z);

    /* renamed from: g */
    void mo19527g(boolean z);

    /* renamed from: h */
    void mo19528h(boolean z);

    /* renamed from: i */
    void mo19529i(boolean z);
}
