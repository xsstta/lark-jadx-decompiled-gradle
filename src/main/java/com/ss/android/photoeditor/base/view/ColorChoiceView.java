package com.ss.android.photoeditor.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.p3010b.C59613d;
import java.util.HashMap;
import java.util.Map;

public class ColorChoiceView extends LinearLayout {

    /* renamed from: a */
    private TextView f148060a;

    /* renamed from: b */
    private TextView f148061b;

    /* renamed from: c */
    private TextView f148062c;

    /* renamed from: d */
    private TextView f148063d;

    /* renamed from: e */
    private TextView f148064e;

    /* renamed from: f */
    private TextView f148065f;

    /* renamed from: g */
    private TextView f148066g;

    /* renamed from: h */
    private Map<TextView, Integer> f148067h;

    /* renamed from: i */
    private Map<ChoiceColor, TextView> f148068i;

    /* renamed from: j */
    private Map<TextView, ChoiceColor> f148069j;

    /* renamed from: k */
    private AbstractC59657a f148070k;

    /* renamed from: l */
    private final View.OnClickListener f148071l = new View.OnClickListener() {
        /* class com.ss.android.photoeditor.base.view.ColorChoiceView.View$OnClickListenerC596561 */

        public void onClick(View view) {
            ColorChoiceView.this.mo203191a((TextView) view);
        }
    };

    /* renamed from: com.ss.android.photoeditor.base.view.ColorChoiceView$a */
    public interface AbstractC59657a {
        /* renamed from: a */
        void mo203195a(int i, ChoiceColor choiceColor);
    }

    /* renamed from: a */
    private void m231379a() {
        inflate(getContext(), R.layout.view_color_selector, this);
        this.f148068i = new HashMap();
        this.f148069j = new HashMap();
        m231381c();
        m231380b();
    }

    /* renamed from: b */
    private void m231380b() {
        HashMap hashMap = new HashMap();
        this.f148067h = hashMap;
        hashMap.put(this.f148060a, Integer.valueOf(C25653b.m91893a(getResources().getColor(R.color.lkui_N00), 1.0f)));
        this.f148067h.put(this.f148061b, Integer.valueOf(C25653b.m91893a(getResources().getColor(R.color.lkui_N900), 1.0f)));
        this.f148067h.put(this.f148062c, Integer.valueOf(C25653b.m91893a(getResources().getColor(R.color.lkui_W500), 1.0f)));
        this.f148067h.put(this.f148063d, Integer.valueOf(C25653b.m91893a(getResources().getColor(R.color.lkui_T500), 1.0f)));
        this.f148067h.put(this.f148064e, Integer.valueOf(C25653b.m91893a(getResources().getColor(R.color.lkui_Y500), 1.0f)));
        this.f148067h.put(this.f148065f, Integer.valueOf(C25653b.m91893a(getResources().getColor(R.color.lkui_R500), 1.0f)));
        this.f148067h.put(this.f148066g, Integer.valueOf(C25653b.m91893a(getResources().getColor(R.color.lkui_C500), 1.0f)));
    }

    /* renamed from: c */
    private void m231381c() {
        this.f148060a = (TextView) findViewById(R.id.tv_paint_color_white);
        this.f148061b = (TextView) findViewById(R.id.tv_paint_color_black);
        this.f148062c = (TextView) findViewById(R.id.tv_paint_color_blue);
        this.f148063d = (TextView) findViewById(R.id.tv_paint_color_green);
        this.f148064e = (TextView) findViewById(R.id.tv_paint_color_yellow);
        this.f148065f = (TextView) findViewById(R.id.tv_paint_color_red);
        this.f148066g = (TextView) findViewById(R.id.tv_paint_color_pink);
        this.f148068i.put(ChoiceColor.WHITE, this.f148060a);
        this.f148068i.put(ChoiceColor.BLACK, this.f148061b);
        this.f148068i.put(ChoiceColor.BLUE, this.f148062c);
        this.f148068i.put(ChoiceColor.GREEN, this.f148063d);
        this.f148068i.put(ChoiceColor.YELLOW, this.f148064e);
        this.f148068i.put(ChoiceColor.RED, this.f148065f);
        this.f148068i.put(ChoiceColor.PINK, this.f148066g);
        this.f148069j.put(this.f148060a, ChoiceColor.WHITE);
        this.f148069j.put(this.f148061b, ChoiceColor.BLACK);
        this.f148069j.put(this.f148062c, ChoiceColor.BLUE);
        this.f148069j.put(this.f148063d, ChoiceColor.GREEN);
        this.f148069j.put(this.f148064e, ChoiceColor.YELLOW);
        this.f148069j.put(this.f148065f, ChoiceColor.RED);
        this.f148069j.put(this.f148066g, ChoiceColor.PINK);
        this.f148060a.setOnClickListener(this.f148071l);
        this.f148061b.setOnClickListener(this.f148071l);
        this.f148062c.setOnClickListener(this.f148071l);
        this.f148063d.setOnClickListener(this.f148071l);
        this.f148064e.setOnClickListener(this.f148071l);
        this.f148065f.setOnClickListener(this.f148071l);
        this.f148066g.setOnClickListener(this.f148071l);
    }

    public void setOnColorChangedListener(AbstractC59657a aVar) {
        this.f148070k = aVar;
    }

    public ColorChoiceView(Context context) {
        super(context);
        m231379a();
    }

    /* renamed from: a */
    public void mo203192a(ChoiceColor choiceColor) {
        TextView textView = this.f148068i.get(choiceColor);
        if (textView != null) {
            mo203191a(textView);
        }
    }

    /* renamed from: a */
    public void mo203190a(int i) {
        for (TextView textView : this.f148067h.keySet()) {
            if (this.f148067h.get(textView).intValue() == i) {
                mo203191a(textView);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo203191a(TextView textView) {
        int intValue = this.f148067h.get(textView).intValue();
        int a = C59613d.m231216a(22);
        int a2 = C59613d.m231216a(18);
        for (TextView textView2 : this.f148067h.keySet()) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            layoutParams.width = a2;
            layoutParams.height = a2;
            textView2.setLayoutParams(layoutParams);
            textView2.setSelected(false);
        }
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        layoutParams2.width = a;
        layoutParams2.height = a;
        textView.setLayoutParams(layoutParams2);
        textView.setSelected(true);
        AbstractC59657a aVar = this.f148070k;
        if (aVar != null) {
            aVar.mo203195a(intValue, this.f148069j.get(textView));
        }
    }

    public ColorChoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m231379a();
    }

    public enum ChoiceColor {
        RED(1),
        WHITE(2),
        BLACK(3),
        GREEN(4),
        YELLOW(5),
        BLUE(6),
        PINK(7);
        
        public final int ID;

        private ChoiceColor(int i) {
            this.ID = i;
        }
    }

    public ColorChoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m231379a();
    }
}
