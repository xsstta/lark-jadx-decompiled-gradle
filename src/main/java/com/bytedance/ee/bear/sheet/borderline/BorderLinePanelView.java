package com.bytedance.ee.bear.sheet.borderline;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.borderline.C11063c;
import com.bytedance.ee.bear.sheet.selectcolor.SheetSelectColorData;
import com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView;
import com.larksuite.suite.R;

public class BorderLinePanelView extends LinearLayout {

    /* renamed from: a */
    public BorderLineData f29711a;

    /* renamed from: b */
    public String f29712b;

    /* renamed from: c */
    private RecyclerView f29713c;

    /* renamed from: d */
    private C11063c f29714d;

    /* renamed from: e */
    private CommonColorSchemeView f29715e;

    /* renamed from: f */
    private String f29716f;

    /* renamed from: g */
    private String f29717g;

    /* renamed from: h */
    private String f29718h;

    /* renamed from: i */
    private AbstractC11057a f29719i;

    /* renamed from: com.bytedance.ee.bear.sheet.borderline.BorderLinePanelView$a */
    public interface AbstractC11057a {
        /* renamed from: a */
        void mo42137a(String str, String str2, String str3);
    }

    /* renamed from: a */
    public void mo42133a() {
        this.f29712b = null;
        this.f29718h = null;
        BorderLineData borderLineData = this.f29711a;
        if (borderLineData != null && borderLineData.getBorderLineParam() != null) {
            this.f29714d.mo42150a(this.f29711a.getBorderLineParam().getBorder(), (String) null);
            this.f29715e.mo45320a(m46003a(this.f29711a.getBorderLineParam().getColor()), null);
        }
    }

    public void setDelegate(AbstractC11057a aVar) {
        this.f29719i = aVar;
    }

    public BorderLinePanelView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m46002a(String str) {
        mo42134a(str, this.f29718h, "border");
    }

    /* renamed from: a */
    private CommonColorSchemeView.ColorScheme[] m46003a(SheetSelectColorData.ColorScheme[] colorSchemeArr) {
        if (colorSchemeArr == null) {
            return null;
        }
        CommonColorSchemeView.ColorScheme[] colorSchemeArr2 = new CommonColorSchemeView.ColorScheme[colorSchemeArr.length];
        for (int i = 0; i < colorSchemeArr.length; i++) {
            colorSchemeArr2[i] = new CommonColorSchemeView.ColorScheme(colorSchemeArr[i].getTopicColor(), colorSchemeArr[i].getDefaultColor(), colorSchemeArr[i].getColorList());
        }
        return colorSchemeArr2;
    }

    public void setBorderLineData(BorderLineData borderLineData) {
        this.f29711a = borderLineData;
        this.f29716f = borderLineData.getBorderLineParam().getDefaultValue().getBorder();
        this.f29717g = borderLineData.getBorderLineParam().getDefaultValue().getColor();
        this.f29714d.mo42150a(borderLineData.getBorderLineParam().getBorder(), this.f29712b);
        this.f29715e.mo45320a(m46003a(borderLineData.getBorderLineParam().getColor()), this.f29718h);
    }

    public BorderLinePanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BorderLinePanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.sheet_border_line_panel_view, (ViewGroup) this, true);
        this.f29713c = (RecyclerView) findViewById(R.id.border_recycler_view);
        C11063c cVar = new C11063c();
        this.f29714d = cVar;
        this.f29713c.setAdapter(cVar);
        this.f29713c.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f29713c.addItemDecoration(new BorderStyleDecoration());
        this.f29714d.mo42148a(new C11063c.AbstractC11065a() {
            /* class com.bytedance.ee.bear.sheet.borderline.$$Lambda$BorderLinePanelView$ZCV2AoY8N_kfjlyfgXAfzIipoME */

            @Override // com.bytedance.ee.bear.sheet.borderline.C11063c.AbstractC11065a
            public final void onBorderStyleSelected(String str) {
                BorderLinePanelView.lambda$ZCV2AoY8N_kfjlyfgXAfzIipoME(BorderLinePanelView.this, str);
            }
        });
        CommonColorSchemeView commonColorSchemeView = (CommonColorSchemeView) findViewById(R.id.color_scheme_view);
        this.f29715e = commonColorSchemeView;
        commonColorSchemeView.setDelegate(new CommonColorSchemeView.AbstractC11827a() {
            /* class com.bytedance.ee.bear.sheet.borderline.BorderLinePanelView.C110561 */

            @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
            /* renamed from: b */
            public void mo18275b(String str) {
                BorderLinePanelView borderLinePanelView = BorderLinePanelView.this;
                borderLinePanelView.mo42134a(borderLinePanelView.f29712b, str, "color");
            }

            @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
            /* renamed from: a */
            public void mo18274a(String str) {
                BorderLinePanelView borderLinePanelView = BorderLinePanelView.this;
                borderLinePanelView.mo42134a(borderLinePanelView.f29712b, SheetSelectColorData.findDefaultColor(BorderLinePanelView.this.f29711a.getBorderLineParam().getColor(), str), "color");
            }
        });
    }

    /* renamed from: a */
    public void mo42134a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = this.f29716f;
        }
        this.f29712b = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f29717g;
        }
        this.f29718h = str2;
        BorderLineData borderLineData = this.f29711a;
        if (!(borderLineData == null || borderLineData.getBorderLineParam() == null)) {
            this.f29714d.mo42150a(this.f29711a.getBorderLineParam().getBorder(), this.f29712b);
            this.f29715e.mo45320a(m46003a(this.f29711a.getBorderLineParam().getColor()), this.f29718h);
        }
        AbstractC11057a aVar = this.f29719i;
        if (aVar != null) {
            aVar.mo42137a(this.f29712b, this.f29718h, str3);
        }
    }
}
