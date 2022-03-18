package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;

public abstract class BaseContactInput extends ConstraintLayout {

    /* renamed from: a */
    protected AbstractC65288b.AbstractC65292d f164322a;

    /* renamed from: b */
    private boolean f164323b = true;
    @BindView(6553)
    ImageView mClearBT;

    public abstract String getContent();

    /* renamed from: a */
    public void mo224507a() {
        this.f164323b = true;
        mo224508a(null);
    }

    /* renamed from: b */
    public void mo224509b() {
        this.f164323b = false;
        mo224508a(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo224510c() {
        if (this.f164322a == null || TextUtils.isEmpty(getContent())) {
            return false;
        }
        this.f164322a.mo222966a();
        return true;
    }

    public void setOnKeyboardDetectorListener(AbstractC65288b.AbstractC65292d dVar) {
        this.f164322a = dVar;
    }

    public BaseContactInput(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo224508a(String str) {
        int i;
        if (str == null) {
            str = getContent();
        }
        ImageView imageView = this.mClearBT;
        if (TextUtils.isEmpty(str) || !this.f164323b) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public BaseContactInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseContactInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
