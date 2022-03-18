package com.ss.android.lark.calendar.impl.features.settings.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.webianks.library.scroll_choice.ScrollChoice;

public class ScrollSingleChoice_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ScrollSingleChoice f83262a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ScrollSingleChoice scrollSingleChoice = this.f83262a;
        if (scrollSingleChoice != null) {
            this.f83262a = null;
            scrollSingleChoice.mScrollChoiceContainer = null;
            scrollSingleChoice.mBlankView = null;
            scrollSingleChoice.mScrollChoice = null;
            scrollSingleChoice.mTvCancel = null;
            scrollSingleChoice.mTvSure = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ScrollSingleChoice_ViewBinding(ScrollSingleChoice scrollSingleChoice, View view) {
        this.f83262a = scrollSingleChoice;
        scrollSingleChoice.mScrollChoiceContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.scroll_choice_container, "field 'mScrollChoiceContainer'", ViewGroup.class);
        scrollSingleChoice.mBlankView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.ll_blank_view, "field 'mBlankView'", ViewGroup.class);
        scrollSingleChoice.mScrollChoice = (ScrollChoice) Utils.findRequiredViewAsType(view, R.id.scroll_choice, "field 'mScrollChoice'", ScrollChoice.class);
        scrollSingleChoice.mTvCancel = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_cancel, "field 'mTvCancel'", TextView.class);
        scrollSingleChoice.mTvSure = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_sure, "field 'mTvSure'", TextView.class);
    }
}
