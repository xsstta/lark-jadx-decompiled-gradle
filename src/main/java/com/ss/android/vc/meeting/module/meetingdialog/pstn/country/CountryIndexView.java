package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LineHeightTextView;
import java.util.List;

public class CountryIndexView extends LinearLayout {

    /* renamed from: a */
    private AbstractC62399a f156948a;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountryIndexView$a */
    public interface AbstractC62399a {
        /* renamed from: a */
        void mo215739a(String str);
    }

    /* renamed from: a */
    private void m243875a() {
        setOrientation(1);
    }

    public void setIndexListener(AbstractC62399a aVar) {
        this.f156948a = aVar;
    }

    public CountryIndexView(Context context) {
        super(context);
        m243875a();
    }

    /* renamed from: a */
    private void m243876a(String str) {
        AbstractC62399a aVar = this.f156948a;
        if (aVar != null) {
            aVar.mo215739a(str);
        }
    }

    public void setIndex(List<String> list) {
        removeAllViews();
        for (String str : list) {
            LineHeightTextView lineHeightTextView = new LineHeightTextView(getContext());
            lineHeightTextView.setTextColor(C60773o.m236126d(R.color.ud_N500));
            lineHeightTextView.setTextSize(12.0f);
            lineHeightTextView.setGravity(17);
            lineHeightTextView.setText(str);
            lineHeightTextView.setOnClickListener(new View.OnClickListener(str) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$CountryIndexView$rrU9reftcJlQRWbIeOE11hM4jyk */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    CountryIndexView.lambda$rrU9reftcJlQRWbIeOE11hM4jyk(CountryIndexView.this, this.f$1, view);
                }
            });
            addView(lineHeightTextView, new LinearLayout.LayoutParams(UIHelper.dp2px(11.0f), -2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243877a(String str, View view) {
        m243876a(str);
    }

    public CountryIndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m243875a();
    }

    public CountryIndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m243875a();
    }
}
