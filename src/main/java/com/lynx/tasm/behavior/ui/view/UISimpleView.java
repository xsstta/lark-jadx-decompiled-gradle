package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.UIGroup;

public abstract class UISimpleView<T extends ViewGroup> extends UIGroup<T> {
    public UISimpleView(Context context) {
        this((AbstractC26684l) context);
    }

    public UISimpleView(AbstractC26684l lVar) {
        this(lVar, null);
    }

    public UISimpleView(AbstractC26684l lVar, Object obj) {
        super(lVar, obj);
    }
}
