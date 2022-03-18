package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class CalendarPermissionDialog extends BaseDialog {

    /* renamed from: a */
    View f78403a;

    /* renamed from: b */
    AbstractC31084a f78404b;
    @BindView(9845)
    ImageView closeDialog;
    @BindView(11524)
    TextView noPermContent;
    @BindView(11526)
    TextView openPrivateSetting;

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.CalendarPermissionDialog$a */
    public interface AbstractC31084a {
        /* renamed from: a */
        void mo112552a();
    }

    /* renamed from: a */
    private void m115992a() {
        this.closeDialog.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.CalendarPermissionDialog.View$OnClickListenerC310821 */

            public void onClick(View view) {
                CalendarPermissionDialog.this.dismiss();
            }
        });
        this.openPrivateSetting.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.widget.CalendarPermissionDialog.View$OnClickListenerC310832 */

            public void onClick(View view) {
                if (CalendarPermissionDialog.this.f78404b != null) {
                    CalendarPermissionDialog.this.f78404b.mo112552a();
                    CalendarPermissionDialog.this.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo112549a(int i) {
        this.noPermContent.setText(UIHelper.mustacheFormat(i));
    }

    public CalendarPermissionDialog(Activity activity, AbstractC31084a aVar) {
        super(activity, R.style.CalendarPermissionWindow);
        View inflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.dialog_calendar_permission, (ViewGroup) null);
        this.f78403a = inflate;
        setContentView(inflate);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        ButterKnife.bind(this, this.f78403a);
        this.f78404b = aVar;
        m115992a();
    }
}
