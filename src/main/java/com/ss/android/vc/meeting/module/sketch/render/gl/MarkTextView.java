package com.ss.android.vc.meeting.module.sketch.render.gl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.sketch.render.gl.shape.GLMark;

public class MarkTextView extends AppCompatTextView {
    public GLMark mark;

    private void initView() {
        String str;
        setTextSize(1, 8.0f);
        int a = C60773o.m236115a(4.0d);
        setPadding(a, a, a, a);
        setTextColor(C60773o.m236126d(R.color.static_white));
        setBackgroundResource(R.drawable.sketch_mark_bg);
        GLMark gLMark = this.mark;
        if (gLMark == null) {
            str = "";
        } else {
            str = gLMark.getData().username;
        }
        setText(str);
        setMaxWidth(UIHelper.dp2px(200.0f));
    }

    public MarkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public MarkTextView(Context context, GLMark gLMark) {
        super(context);
        this.mark = gLMark;
        initView();
    }

    public MarkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }
}
