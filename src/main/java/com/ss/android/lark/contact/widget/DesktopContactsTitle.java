package com.ss.android.lark.contact.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;

public class DesktopContactsTitle extends ConstraintLayout {

    /* renamed from: a */
    public AbstractC36079a f93254a;

    /* renamed from: b */
    private String f93255b;

    /* renamed from: c */
    private int f93256c;
    @BindView(7367)
    ImageView mRightIcon;
    @BindView(8247)
    TextView mTitle;

    /* renamed from: com.ss.android.lark.contact.widget.DesktopContactsTitle$a */
    public interface AbstractC36079a {
        /* renamed from: a */
        void mo132664a(View view);
    }

    public void setOnRightActionListener(AbstractC36079a aVar) {
        this.f93254a = aVar;
    }

    public DesktopContactsTitle(Context context) {
        this(context, null);
    }

    public void setRightIcon(int i) {
        this.mRightIcon.setImageResource(i);
    }

    public void setTitle(String str) {
        this.f93255b = str;
        this.mTitle.setText(str);
    }

    /* renamed from: a */
    private void m141478a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.desktop_right_icon, R.attr.desktop_title_text});
            this.f93255b = obtainStyledAttributes.getString(1);
            this.f93256c = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_title_contacts_desktop, this));
        this.mTitle.setText(this.f93255b);
        this.mRightIcon.setImageResource(this.f93256c);
        this.mRightIcon.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.widget.DesktopContactsTitle.View$OnClickListenerC360781 */

            public void onClick(View view) {
                if (DesktopContactsTitle.this.f93254a != null) {
                    DesktopContactsTitle.this.f93254a.mo132664a(view);
                }
            }
        });
    }

    public DesktopContactsTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DesktopContactsTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m141478a(attributeSet);
    }
}
