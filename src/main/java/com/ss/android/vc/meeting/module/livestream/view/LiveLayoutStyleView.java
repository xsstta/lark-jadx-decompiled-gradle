package com.ss.android.vc.meeting.module.livestream.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class LiveLayoutStyleView extends LinearLayout {

    /* renamed from: a */
    public Style f155983a = Style.LIST;

    /* renamed from: b */
    public AbstractC62094a f155984b;

    /* renamed from: c */
    private RadioButton f155985c;

    /* renamed from: d */
    private RadioButton f155986d;

    /* renamed from: e */
    private RadioButton f155987e;

    /* renamed from: f */
    private int f155988f;

    /* renamed from: com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView$a */
    public interface AbstractC62094a {
        void onStyle(Style style);
    }

    public enum Style {
        LIST(1),
        GALLERY(2),
        FULLSCREEN(3),
        UNKNOWN(0);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Style valueOf(int i) {
            return forNumber(i);
        }

        public static Style forNumber(int i) {
            if (i == 1) {
                return LIST;
            }
            if (i == 2) {
                return GALLERY;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return FULLSCREEN;
        }

        private Style(int i) {
            this.value = i;
        }
    }

    public Style getStyle() {
        return this.f155983a;
    }

    public View getGuideAnchorView() {
        return findViewById(R.id.layoutstyle_title);
    }

    public void setOnStyleListener(AbstractC62094a aVar) {
        this.f155984b = aVar;
    }

    public void setStyle(Style style) {
        mo214842a(style, style);
    }

    public LiveLayoutStyleView(Context context) {
        super(context);
        m242583a(context, (AttributeSet) null);
    }

    public LiveLayoutStyleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242583a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = getResources().getConfiguration().orientation;
        if (this.f155988f != i3) {
            this.f155988f = i3;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public void mo214842a(Style style, Style style2) {
        boolean z;
        boolean z2;
        if (!style.equals(Style.UNKNOWN)) {
            this.f155983a = style;
        } else {
            this.f155983a = style2;
        }
        RadioButton radioButton = this.f155985c;
        boolean z3 = true;
        if (this.f155983a == Style.LIST) {
            z = true;
        } else {
            z = false;
        }
        radioButton.setChecked(z);
        RadioButton radioButton2 = this.f155986d;
        if (this.f155983a == Style.GALLERY) {
            z2 = true;
        } else {
            z2 = false;
        }
        radioButton2.setChecked(z2);
        RadioButton radioButton3 = this.f155987e;
        if (this.f155983a != Style.FULLSCREEN) {
            z3 = false;
        }
        radioButton3.setChecked(z3);
    }

    /* renamed from: a */
    private void m242583a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.dialog_live_setting_item_layoutstyle, this);
        this.f155985c = (RadioButton) findViewById(R.id.cb_list);
        this.f155986d = (RadioButton) findViewById(R.id.cb_grid);
        this.f155987e = (RadioButton) findViewById(R.id.cb_fullscreen);
        findViewById(R.id.layoutstyle_list).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.C620911 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (LiveLayoutStyleView.this.f155984b != null && LiveLayoutStyleView.this.f155983a != Style.LIST) {
                    LiveLayoutStyleView.this.setStyle(Style.LIST);
                    LiveLayoutStyleView.this.f155984b.onStyle(Style.LIST);
                }
            }
        });
        findViewById(R.id.layoutstyle_gallery).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.C620922 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (LiveLayoutStyleView.this.f155984b != null && LiveLayoutStyleView.this.f155983a != Style.GALLERY) {
                    LiveLayoutStyleView.this.setStyle(Style.GALLERY);
                    LiveLayoutStyleView.this.f155984b.onStyle(Style.GALLERY);
                }
            }
        });
        findViewById(R.id.layoutstyle_fullscreen).setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.LiveLayoutStyleView.C620933 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (LiveLayoutStyleView.this.f155984b != null && LiveLayoutStyleView.this.f155983a != Style.FULLSCREEN) {
                    LiveLayoutStyleView.this.setStyle(Style.FULLSCREEN);
                    LiveLayoutStyleView.this.f155984b.onStyle(Style.FULLSCREEN);
                }
            }
        });
    }

    public LiveLayoutStyleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242583a(context, attributeSet);
    }
}
