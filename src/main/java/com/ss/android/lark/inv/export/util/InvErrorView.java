package com.ss.android.lark.inv.export.util;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;

public class InvErrorView extends LinearLayout {

    /* renamed from: a */
    private ImageView f101921a;

    /* renamed from: b */
    private TextView f101922b;

    /* renamed from: a */
    public void mo145638a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo145640b() {
        setVisibility(8);
    }

    /* renamed from: c */
    private void m158952c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inv_error_view, (ViewGroup) this, true);
        setOrientation(1);
        setGravity(1);
        setBackgroundColor(UIHelper.getColor(R.color.bg_base));
        setPadding(0, m158951a(getContext()) / 3, 0, 0);
        setVisibility(8);
        setZ(-16.0f);
        this.f101921a = (ImageView) findViewById(R.id.invErrorIv);
        this.f101922b = (TextView) findViewById(R.id.invErrorTv);
        if (DesktopUtil.m144307b()) {
            DesktopUtil.m144299a(this.f101922b);
        }
    }

    public InvErrorView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo145639a(CharSequence charSequence) {
        setVisibility(0);
        this.f101922b.setText(charSequence);
    }

    /* renamed from: a */
    private int m158951a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return -1;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public InvErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m158952c();
    }
}
