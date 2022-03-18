package com.ss.android.photoeditor.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.ttve.utils.C60275a;

public class TextStickerEditText extends AppCompatEditText {

    /* renamed from: a */
    protected int f148639a;

    /* renamed from: b */
    protected Paint f148640b;

    /* renamed from: c */
    protected Path f148641c;

    /* renamed from: d */
    protected int f148642d;

    /* renamed from: e */
    protected int f148643e;

    /* renamed from: f */
    private int f148644f;

    /* renamed from: g */
    private int f148645g;

    /* renamed from: h */
    private int f148646h;

    /* renamed from: i */
    private int f148647i;

    /* renamed from: j */
    private int f148648j;

    /* renamed from: a */
    public void mo203564a() {
        setText("");
        setTextColor(getContext().getResources().getColor(R.color.lkui_R500));
        this.f148642d = 0;
        this.f148644f = 1;
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String obj = getText().toString();
        String[] strArr = new String[getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = obj.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public TextStickerEditText(Context context) {
        this(context, null);
    }

    public void setMaxWidth(int i) {
        if (i > 0) {
            super.setMaxWidth(i);
        }
    }

    private void setAligin(int i) {
        this.f148645g = i;
        if (i == 1) {
            setGravity(3);
        } else if (i == 2) {
            setGravity(17);
        } else if (i == 3) {
            setGravity(5);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getLineCount() > 1) {
            setAligin(1);
        } else {
            setAligin(2);
        }
        if (this.f148644f != 1 && !TextUtils.isEmpty(getText().toString())) {
            this.f148640b.setColor(this.f148642d);
            m231979a(canvas);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo203566a(Context context) {
        this.f148639a = (int) C60275a.m234185a(context, 6.0f);
        this.f148643e = (int) C60275a.m234185a(context, 8.0f);
        Paint paint = new Paint();
        this.f148640b = paint;
        paint.setColor(this.f148642d);
        this.f148640b.setStyle(Paint.Style.FILL);
        this.f148640b.setAntiAlias(true);
        this.f148640b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f148640b.setPathEffect(new CornerPathEffect((float) this.f148643e));
        this.f148641c = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f148639a, getLineSpacingMultiplier());
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0134 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m231979a(android.graphics.Canvas r22) {
        /*
        // Method dump skipped, instructions count: 595
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.text.TextStickerEditText.m231979a(android.graphics.Canvas):void");
    }

    public TextStickerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148642d = -1;
        this.f148644f = 1;
        this.f148645g = 2;
        mo203566a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f148646h = getMeasuredWidth() / 2;
        this.f148647i = getPaddingTop();
    }

    /* renamed from: a */
    public void mo203565a(int i, int i2) {
        setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i2);
        if (i == 1) {
            this.f148644f = 1;
            this.f148642d = i2;
            setBackground(null);
            setTextColor(i2);
        } else if (i == 2) {
            this.f148644f = 2;
            this.f148642d = i2;
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }
}
