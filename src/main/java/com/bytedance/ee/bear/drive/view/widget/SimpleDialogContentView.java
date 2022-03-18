package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SimpleDialogContentView extends FrameLayout {

    /* renamed from: a */
    private static final int f20553a = C13749l.m55738a(50);

    /* renamed from: b */
    private TextView f20554b;

    /* renamed from: c */
    private TextView f20555c;

    /* renamed from: d */
    private TextView f20556d;

    /* renamed from: e */
    private TextView f20557e;

    /* renamed from: f */
    private View f20558f;

    /* renamed from: g */
    private AbstractC7566a f20559g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BtnOrientation {
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.widget.SimpleDialogContentView$a */
    public interface AbstractC7566a {
        /* renamed from: a */
        void mo29692a();

        /* renamed from: b */
        void mo29693b();
    }

    public void setClickListener(AbstractC7566a aVar) {
        this.f20559g = aVar;
    }

    public SimpleDialogContentView(Context context) {
        super(context);
        m30351a(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30352a(View view) {
        this.f20559g.mo29692a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m30353b(View view) {
        AbstractC7566a aVar = this.f20559g;
        if (aVar != null) {
            aVar.mo29693b();
        }
    }

    /* renamed from: a */
    private void m30351a(int i) {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_simple_dialog_content_view, this);
        this.f20556d = (TextView) findViewById(R.id.confirm_tv);
        this.f20557e = (TextView) findViewById(R.id.cancel_tv);
        this.f20554b = (TextView) findViewById(R.id.title_tv);
        this.f20555c = (TextView) findViewById(R.id.message_tv);
        this.f20558f = findViewById(R.id.btn_divider_view);
        this.f20556d.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.widget.$$Lambda$SimpleDialogContentView$zLfJC2dcpQjEUUVblO5HWojzd8Y */

            public final void onClick(View view) {
                SimpleDialogContentView.lambda$zLfJC2dcpQjEUUVblO5HWojzd8Y(SimpleDialogContentView.this, view);
            }
        });
        this.f20557e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.widget.$$Lambda$SimpleDialogContentView$4McBQXS_vxxhQkgWjtQPqC8hQK0 */

            public final void onClick(View view) {
                SimpleDialogContentView.lambda$4McBQXS_vxxhQkgWjtQPqC8hQK0(SimpleDialogContentView.this, view);
            }
        });
        if (i == 0) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.btn_content_rl);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = f20553a;
            relativeLayout.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f20558f.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams2.addRule(13, -1);
            layoutParams2.width = getResources().getDimensionPixelSize(R.dimen.drive_divider_size);
            layoutParams2.height = -1;
            this.f20558f.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f20557e.getLayoutParams();
            layoutParams3.addRule(0, this.f20558f.getId());
            this.f20557e.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f20556d.getLayoutParams();
            layoutParams4.removeRule(3);
            layoutParams4.addRule(1, this.f20558f.getId());
            this.f20556d.setLayoutParams(layoutParams4);
        }
    }

    public SimpleDialogContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30351a(1);
    }

    public SimpleDialogContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30351a(1);
    }
}
