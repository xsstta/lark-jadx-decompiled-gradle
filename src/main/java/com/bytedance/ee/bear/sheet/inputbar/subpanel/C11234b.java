package com.bytedance.ee.bear.sheet.inputbar.subpanel;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.TextSegment;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetInputData;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.subpanel.b */
public class C11234b extends AbstractC11233a {

    /* renamed from: c */
    public UDCheckBox f30225c;

    /* renamed from: d */
    public UDCheckBox f30226d;

    /* renamed from: e */
    public UDTimePicker f30227e;

    /* renamed from: f */
    public String f30228f = "date";

    /* renamed from: g */
    private TextView f30229g;

    /* renamed from: h */
    private TextView f30230h;

    /* renamed from: i */
    private C11237a f30231i = new C11237a();

    /* renamed from: j */
    private C11088a f30232j;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.inputbar.subpanel.AbstractC11233a
    /* renamed from: a */
    public int mo43069a() {
        return R.layout.sheet_date_keyboard_fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: i */
    public void mo43083i() {
        this.f30225c = (UDCheckBox) getView().findViewById(R.id.date_selector);
        this.f30226d = (UDCheckBox) getView().findViewById(R.id.time_selector);
        this.f30229g = (TextView) getView().findViewById(R.id.tv_confirm);
        this.f30230h = (TextView) getView().findViewById(R.id.tv_clear);
        this.f30227e = (UDTimePicker) getView().findViewById(R.id.timepicker_view);
    }

    /* renamed from: j */
    public void mo43084j() {
        this.f30225c.setOnCheckedChangeListener(new UDCheckBox.OnCheckedChangeListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.C11234b.C112351 */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                if (z) {
                    if (C11234b.this.f30226d.isChecked()) {
                        C11234b.this.f30228f = "datetime";
                        C11234b.this.f30227e.setPickerMode(PickerModel.MONTHDAY_HOUR_MINUTE_24H);
                    } else {
                        C11234b.this.f30228f = "date";
                        C11234b.this.f30227e.setPickerMode(PickerModel.YEAR_MONTH_DAY);
                    }
                } else if (C11234b.this.f30226d.isChecked()) {
                    C11234b.this.f30228f = "time";
                    C11234b.this.f30227e.setPickerMode(PickerModel.HOUR_MINUTE_24H);
                } else {
                    C11234b.this.f30225c.setChecked(true);
                }
                C11234b bVar = C11234b.this;
                bVar.mo43082d(bVar.f30228f);
                C11234b.this.f30224a.setDateKeyboardCurType(C11234b.this.f30228f);
            }
        });
        this.f30226d.setOnCheckedChangeListener(new UDCheckBox.OnCheckedChangeListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.C11234b.C112362 */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                if (z) {
                    if (C11234b.this.f30225c.isChecked()) {
                        C11234b.this.f30228f = "datetime";
                        C11234b.this.f30227e.setPickerMode(PickerModel.MONTHDAY_HOUR_MINUTE_24H);
                    } else {
                        C11234b.this.f30228f = "time";
                        C11234b.this.f30227e.setPickerMode(PickerModel.HOUR_MINUTE_24H);
                    }
                } else if (C11234b.this.f30225c.isChecked()) {
                    C11234b.this.f30228f = "date";
                    C11234b.this.f30227e.setPickerMode(PickerModel.YEAR_MONTH_DAY);
                } else {
                    C11234b.this.f30226d.setChecked(true);
                }
                C11234b bVar = C11234b.this;
                bVar.mo43082d(bVar.f30228f);
                C11234b.this.f30224a.setDateKeyboardCurType(C11234b.this.f30228f);
            }
        });
        this.f30229g.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$b$XAxHDnPTqfo1bKfCABm80tDZvC8 */

            public final void onClick(View view) {
                C11234b.lambda$XAxHDnPTqfo1bKfCABm80tDZvC8(C11234b.this, view);
            }
        });
        this.f30230h.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$b$ZZq6KISdxyK_3sC3noZoSGAsfms */

            public final void onClick(View view) {
                C11234b.lambda$ZZq6KISdxyK_3sC3noZoSGAsfms(C11234b.this, view);
            }
        });
        mo43076f().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$b$N7912a5JGvAUCevgGEBmLWysm1c */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11234b.lambda$N7912a5JGvAUCevgGEBmLWysm1c(C11234b.this, (SheetInputData.InputData) obj);
            }
        });
        mo43075e().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$b$kwU4vi_Bholj8ZOzb5AWfjJmCeU */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11234b.lambda$kwU4vi_Bholj8ZOzb5AWfjJmCeU(C11234b.this, (String) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.subpanel.b$a */
    public class C11237a {

        /* renamed from: a */
        int f30235a;

        /* renamed from: b */
        int f30236b;

        /* renamed from: c */
        int f30237c;

        /* renamed from: d */
        int f30238d;

        /* renamed from: e */
        int f30239e;

        private C11237a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m46742f(String str) {
        m46738a(str, mo43077g());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46736a(View view) {
        m46741e("");
        this.f30232j.mo42298s();
    }

    /* renamed from: a */
    private String m46734a(List<BaseSegment> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        BaseSegment baseSegment = list.get(0);
        if (baseSegment instanceof TextSegment) {
            return ((TextSegment) baseSegment).getText();
        }
        return "";
    }

    /* renamed from: d */
    public void mo43082d(String str) {
        Editable b = mo43072b().mo5927b();
        if (b != null) {
            mo43070a(b).subscribe(new Consumer(str) {
                /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.$$Lambda$b$gNgPelS_wqQGCfBaVguVKdglvyA */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C11234b.lambda$gNgPelS_wqQGCfBaVguVKdglvyA(C11234b.this, this.f$1, (List) obj);
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.inputbar.subpanel.AbstractC11233a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30232j = new C11088a();
        this.f30232j.mo42260a(((DocViewModel) C4950k.m20474a(this, DocViewModel.class)).getBearUrl());
    }

    /* renamed from: e */
    private void m46741e(String str) {
        if (mo43078h() || TextUtils.isEmpty(str)) {
            Editable b = mo43072b().mo5927b();
            if (b != null) {
                b.clear();
                b.insert(0, str);
                return;
            }
            return;
        }
        TextSegment textSegment = new TextSegment(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(textSegment);
        mo43071a(1, arrayList, mo43074d().mo5927b(), this.f30228f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46737a(SheetInputData.InputData inputData) {
        if (!inputData.getFormat().equals("date")) {
            this.f30225c.setChecked(true);
            this.f30226d.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46739b(View view) {
        String str;
        Date date = new Date(this.f30227e.getSelectedCalendar().getTimeInMillis());
        if (this.f30225c.isChecked() && this.f30226d.isChecked()) {
            this.f30232j.mo42301v();
            str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        } else if (this.f30225c.isChecked()) {
            this.f30232j.mo42299t();
            str = new SimpleDateFormat("yyyy-MM-dd").format(date);
        } else {
            this.f30232j.mo42300u();
            str = new SimpleDateFormat("HH:mm:ss").format(date);
        }
        m46741e(str);
        this.f30232j.mo42297r();
    }

    /* renamed from: b */
    public void mo43080b(String str) {
        try {
            if (str.contains(":")) {
                String[] split = str.split(":");
                this.f30231i.f30238d = Integer.valueOf(split[0]).intValue();
                this.f30231i.f30239e = Integer.valueOf(split[1]).intValue();
                this.f30227e.setPickerMode(PickerModel.HOUR_MINUTE_24H);
                this.f30227e.setSelectedCalendar(new GregorianCalendar(this.f30231i.f30235a, this.f30231i.f30236b - 1, this.f30231i.f30237c, this.f30231i.f30238d, this.f30231i.f30239e));
            }
        } catch (Exception e) {
            C13479a.m54758a("SheetDateKeyboardFragment", "unformatted input, error: " + e.toString());
        }
    }

    /* renamed from: c */
    public void mo43081c(String str) {
        String[] strArr;
        try {
            if (str.contains("/")) {
                strArr = str.split("/");
            } else if (str.contains("-")) {
                strArr = str.split("-");
            } else {
                return;
            }
            this.f30231i.f30235a = Integer.parseInt(strArr[0]);
            this.f30231i.f30236b = Integer.parseInt(strArr[1]);
            if (strArr[2].contains(" ")) {
                String[] split = strArr[2].split(" ");
                this.f30231i.f30237c = Integer.parseInt(split[0]);
                m46735a(this.f30231i.f30235a, this.f30231i.f30236b, this.f30231i.f30237c);
                if (split[1].contains(":")) {
                    String[] split2 = split[1].split(":");
                    this.f30231i.f30238d = Integer.parseInt(split2[0]);
                    this.f30231i.f30239e = Integer.parseInt(split2[1]);
                    this.f30227e.setPickerMode(PickerModel.MONTHDAY_HOUR_MINUTE_24H);
                    this.f30227e.setSelectedCalendar(new GregorianCalendar(this.f30231i.f30235a, this.f30231i.f30236b - 1, this.f30231i.f30237c, this.f30231i.f30238d, this.f30231i.f30239e));
                }
            }
        } catch (Exception e) {
            C13479a.m54758a("SheetDateKeyboardFragment", "unformatted input, error: " + e.toString());
        }
    }

    /* renamed from: a */
    public void mo43079a(String str) {
        String[] strArr;
        try {
            if (str.contains("/")) {
                strArr = str.split("/");
            } else if (str.contains("-")) {
                strArr = str.split("-");
            } else {
                return;
            }
            this.f30231i.f30235a = Integer.valueOf(strArr[0]).intValue();
            this.f30231i.f30236b = Integer.valueOf(strArr[1]).intValue();
            this.f30231i.f30237c = Integer.valueOf(strArr[2]).intValue();
            m46735a(this.f30231i.f30235a, this.f30231i.f30236b, this.f30231i.f30237c);
            this.f30227e.setPickerMode(PickerModel.YEAR_MONTH_DAY);
            this.f30227e.setSelectedCalendar(new GregorianCalendar(this.f30231i.f30235a, this.f30231i.f30236b - 1, this.f30231i.f30237c, this.f30231i.f30238d, this.f30231i.f30239e));
        } catch (Exception e) {
            C13479a.m54758a("SheetDateKeyboardFragment", "unformatted input, error: " + e.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46740b(String str, List list) throws Exception {
        mo43071a(3, list, mo43074d().mo5927b(), str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo43083i();
        mo43084j();
    }

    /* renamed from: a */
    private void m46738a(String str, List<BaseSegment> list) {
        if ("date".equals(str)) {
            this.f30228f = "date";
            mo43079a(m46734a(list));
            this.f30225c.setChecked(true);
            this.f30226d.setChecked(false);
        } else if ("time".equals(str)) {
            this.f30228f = "time";
            mo43080b(m46734a(list));
            this.f30226d.setChecked(true);
            this.f30225c.setChecked(false);
        } else if ("datetime".equals(str)) {
            this.f30228f = "datetime";
            mo43081c(m46734a(list));
            this.f30225c.setChecked(true);
            this.f30226d.setChecked(true);
        }
    }

    /* renamed from: a */
    private void m46735a(int i, int i2, int i3) {
        if (i <= 12 && i3 > 31) {
            this.f30231i.f30235a = i3;
            this.f30231i.f30236b = i;
            this.f30231i.f30237c = i2;
        }
    }
}
