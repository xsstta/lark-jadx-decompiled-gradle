package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;

public class SpaceTagTextView extends AppCompatTextView {

    /* renamed from: a */
    private UDTagsDrawable f32034a;

    /* renamed from: a */
    public UDTagsDrawable.TagModel mo16312a() {
        return null;
    }

    /* renamed from: b */
    private void m49223b() {
        mo45486a(mo16312a());
    }

    public SpaceTagTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo45486a(UDTagsDrawable.TagModel eVar) {
        if (eVar != null) {
            UDTagsDrawable i = new UDTagsDrawable.Builder(getContext()).mo91384a(eVar).mo91398i();
            this.f32034a = i;
            if (i != null) {
                i.mo91369a((TextView) this);
            }
        }
    }

    public SpaceTagTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.SpaceTagTextView);
    }

    public SpaceTagTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49223b();
    }
}
