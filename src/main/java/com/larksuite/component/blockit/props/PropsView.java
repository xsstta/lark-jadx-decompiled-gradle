package com.larksuite.component.blockit.props;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Map;

public class PropsView extends SpannableTailTextView {

    /* renamed from: b */
    private C24135e f59675b;

    /* renamed from: c */
    private Map<String, Object> f59676c;

    public C24135e getConfig() {
        return this.f59675b;
    }

    public PropsView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo86631a(List<C24136f> list) {
        setText(C24133c.m88158a(list, this.f59676c));
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void setConfig(C24135e eVar) {
        this.f59675b = eVar;
        if (eVar != null) {
            if (eVar.f59687a > 0) {
                setTextSize(0, (float) eVar.f59687a);
            } else {
                setTextSize(14.0f);
            }
            if (eVar.f59688b > 0) {
                setTextColor(eVar.f59688b);
            } else {
                setTextColor(getResources().getColor(R.color.lkui_B700));
            }
            if (eVar.f59689c > BitmapDescriptorFactory.HUE_RED) {
                setLineSpacing(eVar.f59689c, 1.0f);
            }
            if (eVar.f59690d > 0) {
                setMaxLines(eVar.f59690d);
            } else {
                setMaxLines(Integer.MAX_VALUE);
            }
        }
    }

    public PropsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PropsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo86632a(List<C24136f> list, C24135e eVar, Map<String, Object> map) {
        this.f59676c = map;
        setConfig(eVar);
        mo86631a(list);
    }
}
