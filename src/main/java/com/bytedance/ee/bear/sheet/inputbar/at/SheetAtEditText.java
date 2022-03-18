package com.bytedance.ee.bear.sheet.inputbar.at;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.bear.widget.AtEditText;
import com.larksuite.suite.R;
import io.reactivex.Single;
import java.util.List;

public class SheetAtEditText extends AtEditText implements AbstractC11189a {
    @Override // com.bytedance.ee.bear.widget.AtEditText
    public C11207c getPresenter() {
        if (this.f31603b == null) {
            this.f31603b = new C11207c(this);
        }
        return (C11207c) this.f31603b;
    }

    public Single<List<BaseSegment>> getSegments() {
        return getPresenter().mo42830d();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPresenter().mo18345c();
    }

    public SheetAtEditText(Context context) {
        this(context, null);
    }

    public void setCellStyle(SegmentStyle segmentStyle) {
        getPresenter().mo42826a(segmentStyle);
    }

    public void setSegments(List<BaseSegment> list) {
        getPresenter().mo42828a(list);
    }

    public SheetAtEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public SheetAtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnPasteListener(getPresenter());
        setFilters(new InputFilter[]{getPresenter().mo42831e()});
    }
}
