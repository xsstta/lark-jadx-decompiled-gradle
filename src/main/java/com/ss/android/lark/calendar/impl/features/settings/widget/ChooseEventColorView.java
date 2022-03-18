package com.ss.android.lark.calendar.impl.features.settings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.ListenableLinearLayout;

public class ChooseEventColorView extends ListenableLinearLayout {

    /* renamed from: a */
    public AbstractC32472a f83251a;

    /* renamed from: b */
    private Context f83252b;

    /* renamed from: c */
    private int f83253c = ((int) UDDimenUtils.m93308a(getContext(), 4));
    @BindView(10074)
    ViewGroup mContentContainer;

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.widget.ChooseEventColorView$a */
    public interface AbstractC32472a {
    }

    /* renamed from: a */
    private void m123972a() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.dialog_choose_event_color, this));
        this.f83252b = getContext();
    }

    public void setChangeColorViewDelegate(AbstractC32472a aVar) {
        this.f83251a = aVar;
    }

    public ChooseEventColorView(Context context) {
        super(context);
        m123972a();
    }

    public ChooseEventColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m123972a();
    }
}
