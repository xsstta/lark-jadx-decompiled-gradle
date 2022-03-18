package com.ss.android.lark.main.app.widgets.desktop.avatar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.main.app.widgets.desktop.avatar.MainAvatarView;

public class MainAvatar extends ConstraintLayout {

    /* renamed from: a */
    C44443c f112754a;

    /* renamed from: b */
    public View f112755b;

    /* renamed from: c */
    private MainAvatarView.AbstractC44433a f112756c = new MainAvatarView.AbstractC44433a() {
        /* class com.ss.android.lark.main.app.widgets.desktop.avatar.MainAvatar.C444321 */

        @Override // com.ss.android.lark.main.app.widgets.desktop.avatar.MainAvatarView.AbstractC44433a
        /* renamed from: a */
        public void mo157825a(MainAvatarView mainAvatarView) {
            ButterKnife.bind(mainAvatarView, MainAvatar.this.f112755b);
        }
    };

    /* renamed from: b */
    public void mo157824b() {
        this.f112754a.destroy();
    }

    /* renamed from: c */
    private void m176343c() {
        C44443c cVar = new C44443c(new MainAvatarView(getContext(), this.f112756c), new C44439b());
        this.f112754a = cVar;
        cVar.create();
    }

    /* renamed from: a */
    public void mo157822a() {
        this.f112755b = LayoutInflater.from(getContext()).inflate(R.layout.main_avatar_layout, this);
        m176343c();
    }

    public MainAvatar(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo157823a(String str, String str2) {
        this.f112754a.mo157837a(str, str2);
    }

    public MainAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MainAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
