package com.ss.android.vc.meeting.module.meetingdialog.p3136a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.a.b */
public class C62189b {

    /* renamed from: a */
    protected final FragmentActivity f156211a;

    /* renamed from: b */
    protected final C61303k f156212b;

    /* renamed from: c */
    private final AbstractC61222a f156213c;

    /* renamed from: b */
    public void mo215110b() {
    }

    /* renamed from: a */
    public View mo215109a() {
        View inflate = LayoutInflater.from(this.f156211a).inflate(R.layout.dialog_charging_tips, (ViewGroup) null);
        ButterKnife.bind(this, inflate);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        return inflate;
    }

    public C62189b(FragmentActivity fragmentActivity, C61303k kVar, AbstractC61222a aVar) {
        this.f156211a = fragmentActivity;
        this.f156212b = kVar;
        this.f156213c = aVar;
    }
}
