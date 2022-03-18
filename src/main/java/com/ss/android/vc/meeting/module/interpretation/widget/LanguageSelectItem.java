package com.ss.android.vc.meeting.module.interpretation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LineHeightTextView;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.module.interpretation.p3128c.C61958a;

public class LanguageSelectItem extends FrameLayout {

    /* renamed from: a */
    private LanguageLabel f155749a;

    /* renamed from: b */
    private LineHeightTextView f155750b;

    /* renamed from: c */
    private View f155751c;

    public enum Style {
        Selected,
        NotSelected,
        NoEdit
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem$1 */
    public static /* synthetic */ class C619911 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155752a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem$Style[] r0 = com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.C619911.f155752a = r0
                com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem$Style r1 = com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.Style.Selected     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.C619911.f155752a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem$Style r1 = com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.Style.NotSelected     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.C619911.f155752a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem$Style r1 = com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.Style.NoEdit     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.interpretation.widget.LanguageSelectItem.C619911.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m242184a() {
        LayoutInflater.from(getContext()).inflate(R.layout.language_selcet_item, this);
        this.f155749a = (LanguageLabel) findViewById(R.id.txt_label);
        this.f155750b = (LineHeightTextView) findViewById(R.id.txt_language);
        this.f155751c = findViewById(R.id.v_arrow);
    }

    public LanguageSelectItem(Context context) {
        super(context);
        m242184a();
    }

    public void setArrowVisibility(int i) {
        this.f155751c.setVisibility(i);
    }

    public void setLabel(String str) {
        this.f155749a.setText(str);
    }

    public void setLanguage(String str) {
        this.f155750b.setText(str);
    }

    public void setLanguage(LanguageType languageType) {
        if (languageType != null) {
            this.f155749a.setText(languageType.iconStr);
            C61958a.m242072a(languageType, this.f155750b);
        }
    }

    public void setStyle(Style style) {
        int i = C619911.f155752a[style.ordinal()];
        if (i == 1) {
            this.f155749a.setVisibility(0);
            this.f155750b.setVisibility(0);
            this.f155750b.setTextColor(C60773o.m236126d(R.color.text_title));
            this.f155751c.setVisibility(0);
        } else if (i == 2) {
            this.f155749a.setVisibility(8);
            this.f155750b.setVisibility(0);
            this.f155750b.setTextColor(C60773o.m236126d(R.color.text_placeholder));
            this.f155751c.setVisibility(0);
        } else if (i == 3) {
            this.f155749a.setVisibility(0);
            this.f155750b.setVisibility(0);
            this.f155750b.setTextColor(C60773o.m236126d(R.color.text_placeholder));
            this.f155751c.setVisibility(8);
        }
    }

    public LanguageSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242184a();
    }

    public LanguageSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242184a();
    }
}
