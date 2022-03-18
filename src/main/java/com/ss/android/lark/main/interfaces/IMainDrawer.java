package com.ss.android.lark.main.interfaces;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.lark.maincore.AbstractC44548e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IMainDrawer {

    @Retention(RetentionPolicy.SOURCE)
    public @interface STATUS {
    }

    /* renamed from: a */
    void mo157182a();

    /* renamed from: a */
    void mo157183a(int i);

    /* renamed from: a */
    void mo157184a(FragmentManager fragmentManager, AbstractC44548e eVar);

    View getContentView();
}
