package com.ss.android.lark.message.card.component;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CardCalendarDialogFactory {

    public enum CardCalendarType {
        Date,
        Time,
        DateTime
    }

    /* renamed from: com.ss.android.lark.message.card.component.CardCalendarDialogFactory$c */
    public interface AbstractC45300c {
        void onTimeSelected(String str, long j);
    }

    /* renamed from: com.ss.android.lark.message.card.component.CardCalendarDialogFactory$1 */
    static /* synthetic */ class C452971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f114676a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.message.card.component.CardCalendarDialogFactory$CardCalendarType[] r0 = com.ss.android.lark.message.card.component.CardCalendarDialogFactory.CardCalendarType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.message.card.component.CardCalendarDialogFactory.C452971.f114676a = r0
                com.ss.android.lark.message.card.component.CardCalendarDialogFactory$CardCalendarType r1 = com.ss.android.lark.message.card.component.CardCalendarDialogFactory.CardCalendarType.Date     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.message.card.component.CardCalendarDialogFactory.C452971.f114676a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.message.card.component.CardCalendarDialogFactory$CardCalendarType r1 = com.ss.android.lark.message.card.component.CardCalendarDialogFactory.CardCalendarType.Time     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.message.card.component.CardCalendarDialogFactory.C452971.f114676a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.message.card.component.CardCalendarDialogFactory$CardCalendarType r1 = com.ss.android.lark.message.card.component.CardCalendarDialogFactory.CardCalendarType.DateTime     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.component.CardCalendarDialogFactory.C452971.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.message.card.component.CardCalendarDialogFactory$b */
    public static class View$OnClickListenerC45299b extends UDDialogController implements View.OnClickListener, ITimePickerDelegate.TimePickerListener {

        /* renamed from: a */
        private long f114680a = -1;

        /* renamed from: b */
        private CardCalendarType f114681b;

        /* renamed from: c */
        private AbstractC45300c f114682c;

        /* renamed from: d */
        private View f114683d;

        /* renamed from: e */
        private TextView f114684e;

        /* renamed from: f */
        private View f114685f;

        /* renamed from: g */
        private UDTimePicker f114686g;

        /* renamed from: h */
        private UDTimePicker f114687h;

        /* renamed from: i */
        private View f114688i;

        /* renamed from: j */
        private TextView f114689j;

        /* renamed from: k */
        private TextView f114690k;

        /* renamed from: l */
        private Calendar f114691l;

        /* renamed from: a */
        private Calendar m179896a() {
            Calendar selectedCalendar = this.f114686g.getSelectedCalendar();
            Calendar selectedCalendar2 = this.f114687h.getSelectedCalendar();
            Calendar instance = Calendar.getInstance();
            instance.set(selectedCalendar.get(1), selectedCalendar.get(2), selectedCalendar.get(5), selectedCalendar2.get(11), selectedCalendar2.get(12));
            return instance;
        }

        /* access modifiers changed from: protected */
        @Override // com.larksuite.component.universe_design.dialog.UDDialogController
        public View onCreateFooter() {
            View onCreateFooter = super.onCreateFooter();
            if (onCreateFooter != null && this.f114681b == CardCalendarType.DateTime) {
                this.f114689j = (TextView) onCreateFooter.findViewById(R.id.date_tab);
                this.f114690k = (TextView) onCreateFooter.findViewById(R.id.time_tab);
                View findViewById = onCreateFooter.findViewById(R.id.tab_layout);
                this.f114688i = findViewById;
                findViewById.setVisibility(0);
                this.f114689j.setOnClickListener(this);
                this.f114690k.setOnClickListener(this);
            }
            return onCreateFooter;
        }

        /* access modifiers changed from: protected */
        @Override // com.larksuite.component.universe_design.dialog.UDDialogController
        public View onCreateHeader() {
            View onCreateHeader = super.onCreateHeader();
            this.f114683d = onCreateHeader.findViewById(R.id.cancel_tv);
            this.f114684e = (TextView) onCreateHeader.findViewById(R.id.title_tv);
            this.f114685f = onCreateHeader.findViewById(R.id.confirm_tv);
            this.f114683d.setOnClickListener(this);
            this.f114685f.setOnClickListener(this);
            return onCreateHeader;
        }

        /* access modifiers changed from: protected */
        @Override // com.larksuite.component.universe_design.dialog.UDDialogController
        public View onCreateContent() {
            View onCreateContent = super.onCreateContent();
            int i = C452971.f114676a[this.f114681b.ordinal()];
            if (i == 1) {
                UDTimePicker uDTimePicker = (UDTimePicker) onCreateContent.findViewById(R.id.first_picker);
                this.f114686g = uDTimePicker;
                uDTimePicker.setPickerMode(PickerModel.YEAR_MONTH_DAY);
                this.f114686g.setSelectedCalendar(this.f114691l);
                this.f114686g.setDatePickerListener(this);
            } else if (i == 2) {
                UDTimePicker uDTimePicker2 = (UDTimePicker) onCreateContent.findViewById(R.id.first_picker);
                this.f114686g = uDTimePicker2;
                uDTimePicker2.setPickerMode(PickerModel.HOUR_MINUTE_24H);
                this.f114686g.setSelectedCalendar(this.f114691l);
                this.f114686g.setDatePickerListener(this);
            } else if (i == 3) {
                UDTimePicker uDTimePicker3 = (UDTimePicker) onCreateContent.findViewById(R.id.first_picker);
                this.f114686g = uDTimePicker3;
                uDTimePicker3.setPickerMode(PickerModel.YEAR_MONTH_DAY);
                this.f114686g.setSelectedCalendar(this.f114691l);
                UDTimePicker uDTimePicker4 = (UDTimePicker) onCreateContent.findViewById(R.id.second_picker);
                this.f114687h = uDTimePicker4;
                uDTimePicker4.setPickerMode(PickerModel.HOUR_MINUTE_24H);
                this.f114687h.setSelectedCalendar(this.f114691l);
                this.f114686g.setDatePickerListener(this);
                this.f114687h.setDatePickerListener(this);
            }
            return onCreateContent;
        }

        public View$OnClickListenerC45299b(Context context) {
            super(context);
        }

        public void onClick(View view) {
            if (view == this.f114683d) {
                getMDialog().dismiss();
            } else if (view != this.f114685f) {
                TextView textView = this.f114689j;
                if (view == textView) {
                    textView.setTextColor(C57582a.m223616d(getContext(), R.color.primary_pri_500));
                    this.f114690k.setTextColor(C57582a.m223616d(getContext(), R.color.text_title));
                    this.f114686g.setVisibility(0);
                    this.f114687h.setVisibility(8);
                } else if (view == this.f114690k) {
                    textView.setTextColor(C57582a.m223616d(getContext(), R.color.text_title));
                    this.f114690k.setTextColor(C57582a.m223616d(getContext(), R.color.primary_pri_500));
                    this.f114686g.setVisibility(8);
                    this.f114687h.setVisibility(0);
                }
            } else if (this.f114682c != null) {
                String str = null;
                int i = C452971.f114676a[this.f114681b.ordinal()];
                if (i == 1) {
                    str = "yyyy-MM-dd";
                } else if (i == 2) {
                    str = "HH:mm";
                } else if (i == 3) {
                    str = "yyyy-MM-dd HH:mm";
                }
                this.f114682c.onTimeSelected(m179895a(str, this.f114691l.getTime(), true), this.f114691l.getTimeInMillis());
                getMDialog().dismiss();
            }
        }

        @Override // com.larksuite.component.universe_design.dialog.UDDialogController
        public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
            if (uDBaseDialogBuilder instanceof C45298a) {
                C45298a aVar = (C45298a) uDBaseDialogBuilder;
                this.f114680a = aVar.f114677a;
                Calendar instance = Calendar.getInstance();
                this.f114691l = instance;
                long j = this.f114680a;
                if (j > -1) {
                    instance.setTimeInMillis(j);
                }
                this.f114681b = aVar.f114678b;
                this.f114682c = aVar.f114679c;
            }
            super.apply(uDBaseDialogBuilder, uDDialog);
        }

        /* renamed from: a */
        private String m179895a(String str, Date date, boolean z) {
            if (z) {
                str = str + " Z";
            }
            return new SimpleDateFormat(str, Locale.ENGLISH).format(date);
        }

        @Override // com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate.TimePickerListener
        /* renamed from: a */
        public void mo18000a(int i, int i2, int i3, int i4, int i5) {
            this.f114685f.setEnabled(true);
            int i6 = C452971.f114676a[this.f114681b.ordinal()];
            if (i6 == 1 || i6 == 2) {
                this.f114691l = this.f114686g.getSelectedCalendar();
            } else if (i6 == 3) {
                Calendar a = m179896a();
                this.f114691l = a;
                this.f114684e.setText(m179895a("yyyy-MM-dd HH:mm", a.getTime(), false));
            }
        }
    }

    /* renamed from: com.ss.android.lark.message.card.component.CardCalendarDialogFactory$a */
    public static class C45298a extends UDBaseDialogBuilder<C45298a> {

        /* renamed from: a */
        public long f114677a;

        /* renamed from: b */
        public CardCalendarType f114678b;

        /* renamed from: c */
        public AbstractC45300c f114679c;

        public C45298a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public C45298a mo160047a(long j) {
            this.f114677a = j;
            return this;
        }

        /* renamed from: a */
        public C45298a mo160048a(CardCalendarType cardCalendarType) {
            this.f114678b = cardCalendarType;
            return this;
        }

        /* renamed from: a */
        public C45298a mo160049a(AbstractC45300c cVar) {
            this.f114679c = cVar;
            return this;
        }
    }
}
