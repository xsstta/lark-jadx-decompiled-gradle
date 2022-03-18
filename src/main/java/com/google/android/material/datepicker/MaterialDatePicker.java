package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p983d.View$OnTouchListenerC22219a;
import com.google.android.material.p988i.C22312b;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class MaterialDatePicker<S> extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    static final Object f54319c = "CONFIRM_BUTTON_TAG";

    /* renamed from: d */
    static final Object f54320d = "CANCEL_BUTTON_TAG";

    /* renamed from: e */
    static final Object f54321e = "TOGGLE_BUTTON_TAG";

    /* renamed from: f */
    public final LinkedHashSet<AbstractC22253g<? super S>> f54322f = new LinkedHashSet<>();

    /* renamed from: g */
    public final LinkedHashSet<View.OnClickListener> f54323g = new LinkedHashSet<>();

    /* renamed from: h */
    public DateSelector<S> f54324h;

    /* renamed from: i */
    public CheckableImageButton f54325i;

    /* renamed from: j */
    public Button f54326j;

    /* renamed from: k */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f54327k = new LinkedHashSet<>();

    /* renamed from: l */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f54328l = new LinkedHashSet<>();

    /* renamed from: m */
    private int f54329m;

    /* renamed from: n */
    private AbstractC22261l<S> f54330n;

    /* renamed from: o */
    private CalendarConstraints f54331o;

    /* renamed from: p */
    private C22241f<S> f54332p;

    /* renamed from: q */
    private int f54333q;

    /* renamed from: r */
    private CharSequence f54334r;

    /* renamed from: s */
    private boolean f54335s;

    /* renamed from: t */
    private int f54336t;

    /* renamed from: u */
    private TextView f54337u;

    /* renamed from: v */
    private MaterialShapeDrawable f54338v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    /* renamed from: f */
    public static long m80418f() {
        return Month.m80427a().f54347e;
    }

    /* renamed from: h */
    public final S mo77349h() {
        return this.f54324h.mo77315a();
    }

    /* renamed from: g */
    public String mo77348g() {
        return this.f54324h.mo77316a(getContext());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStop() {
        this.f54330n.mo77437g();
        super.onStop();
    }

    /* renamed from: i */
    public void mo77350i() {
        String g = mo77348g();
        this.f54337u.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), g));
        this.f54337u.setText(g);
    }

    /* renamed from: j */
    public void mo77351j() {
        AbstractC22261l<S> lVar;
        this.f54332p = C22241f.m80494a(this.f54324h, m80413b(requireContext()), this.f54331o);
        if (this.f54325i.isChecked()) {
            lVar = C22254h.m80511a(this.f54324h, this.f54331o);
        } else {
            lVar = this.f54332p;
        }
        this.f54330n = lVar;
        mo77350i();
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.mtrl_calendar_frame, this.f54330n);
        beginTransaction.commitNow();
        this.f54330n.mo77436a(new AbstractC22260k<S>() {
            /* class com.google.android.material.datepicker.MaterialDatePicker.C222283 */

            /* access modifiers changed from: package-private */
            @Override // com.google.android.material.datepicker.AbstractC22260k
            /* renamed from: a */
            public void mo77354a() {
                MaterialDatePicker.this.f54326j.setEnabled(false);
            }

            @Override // com.google.android.material.datepicker.AbstractC22260k
            /* renamed from: a */
            public void mo77355a(S s) {
                MaterialDatePicker.this.mo77350i();
                MaterialDatePicker.this.f54326j.setEnabled(MaterialDatePicker.this.f54324h.mo77319b());
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = J_().getWindow();
        if (this.f54335s) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f54338v);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f54338v, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC22219a(J_(), rect));
        }
        mo77351j();
    }

    /* renamed from: b */
    private int m80413b(Context context) {
        int i = this.f54329m;
        if (i != 0) {
            return i;
        }
        return this.f54324h.mo77318b(context);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f54327k.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    /* renamed from: a */
    static boolean m80412a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C22312b.m80789a(context, (int) R.attr.materialCalendarStyle, C22241f.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: c */
    private void m80414c(Context context) {
        boolean z;
        this.f54325i.setTag(f54321e);
        this.f54325i.setImageDrawable(m80415d(context));
        CheckableImageButton checkableImageButton = this.f54325i;
        if (this.f54336t != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        ViewCompat.m4043a(this.f54325i, (C0859a) null);
        mo77347a(this.f54325i);
        this.f54325i.setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.datepicker.MaterialDatePicker.View$OnClickListenerC222294 */

            public void onClick(View view) {
                MaterialDatePicker.this.f54326j.setEnabled(MaterialDatePicker.this.f54324h.mo77319b());
                MaterialDatePicker.this.f54325i.toggle();
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                materialDatePicker.mo77347a(materialDatePicker.f54325i);
                MaterialDatePicker.this.mo77351j();
            }
        });
    }

    /* renamed from: d */
    private static Drawable m80415d(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0215a.m655b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0215a.m655b(context, R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: f */
    private static int m80417f(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = Month.m80427a().f54345c;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f54329m = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f54324h = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f54331o = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f54333q = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f54334r = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f54336t = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f54328l.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: e */
    private static int m80416e(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height) + (C22256i.f54426a * resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + ((C22256i.f54426a - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public final Dialog mo946a(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m80413b(requireContext()));
        Context context = dialog.getContext();
        this.f54335s = m80412a(context);
        int a = C22312b.m80789a(context, (int) R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, 2131887367);
        this.f54338v = materialShapeDrawable;
        materialShapeDrawable.mo77965a(context);
        this.f54338v.mo77973g(ColorStateList.valueOf(a));
        this.f54338v.mo77985r(ViewCompat.m4104s(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f54329m);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f54324h);
        CalendarConstraints.C22221a aVar = new CalendarConstraints.C22221a(this.f54331o);
        if (this.f54332p.mo77402a() != null) {
            aVar.mo77304a(this.f54332p.mo77402a().f54347e);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar.mo77305a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f54333q);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f54334r);
    }

    /* renamed from: a */
    public void mo77347a(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f54325i.isChecked()) {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f54325i.setContentDescription(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f54335s) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f54335s) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m80417f(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m80417f(context), -1));
            findViewById2.setMinimumHeight(m80416e(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f54337u = textView;
        ViewCompat.m4084h((View) textView, 1);
        this.f54325i = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f54334r;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f54333q);
        }
        m80414c(context);
        this.f54326j = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.f54324h.mo77319b()) {
            this.f54326j.setEnabled(true);
        } else {
            this.f54326j.setEnabled(false);
        }
        this.f54326j.setTag(f54319c);
        this.f54326j.setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.datepicker.MaterialDatePicker.View$OnClickListenerC222261 */

            public void onClick(View view) {
                Iterator<AbstractC22253g<? super S>> it = MaterialDatePicker.this.f54322f.iterator();
                while (it.hasNext()) {
                    it.next().mo77415a((Object) MaterialDatePicker.this.mo77349h());
                }
                MaterialDatePicker.this.u_();
            }
        });
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag(f54320d);
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.datepicker.MaterialDatePicker.View$OnClickListenerC222272 */

            public void onClick(View view) {
                Iterator<View.OnClickListener> it = MaterialDatePicker.this.f54323g.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                MaterialDatePicker.this.u_();
            }
        });
        return inflate;
    }
}
