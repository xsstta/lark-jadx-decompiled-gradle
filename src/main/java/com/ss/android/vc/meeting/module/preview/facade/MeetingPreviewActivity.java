package com.ss.android.vc.meeting.module.preview.facade;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.suite.R;
import com.ss.android.lark.p1786d.AbstractC36434e;
import com.ss.android.lark.p1786d.AbstractC36435f;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.vc.common.base.BaseActivity;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.permission.C60795b;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import io.reactivex.p3457e.C68296b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MeetingPreviewActivity extends BaseActivity implements AbstractC36435f {

    /* renamed from: b */
    private AbstractC62684c f157857b;

    /* renamed from: c */
    private AbstractC62684c f157858c;

    /* renamed from: d */
    private List<AbstractC61214a> f157859d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private int f157860e;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.base.BaseActivity
    /* renamed from: e */
    public boolean mo208278e() {
        return false;
    }

    @Override // com.ss.android.lark.p1786d.AbstractC36435f
    /* renamed from: a */
    public AbstractC36434e mo129674a() {
        return C36443k.m143598a(this);
    }

    public void finish() {
        super.finishAndRemoveTask();
        overridePendingTransition(0, R.anim.activity_bottom_out);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        super.onStart();
        C60700b.m235851b("MeetingPreviewActivity", "[onStart]", "onStart");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        C60700b.m235851b("MeetingPreviewActivity", "[onStop]", "onStop");
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        C60700b.m235851b("MeetingPreviewActivity", "[onBackPressed]", "onBackPressed");
        if (this.f157859d.size() > 0) {
            List<AbstractC61214a> list = this.f157859d;
            list.get(list.size() - 1).bS_();
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: b */
    public void mo216698b(AbstractC61214a aVar) {
        this.f157859d.remove(aVar);
    }

    /* renamed from: a */
    public void mo216697a(AbstractC61214a aVar) {
        this.f157859d.add(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewActivity:onNewIntent");
        m245448a(intent);
        TimeConsumeUtils.m248928a(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingPreviewActivity:onCreate");
        m245448a(getIntent());
        overridePendingTransition(R.anim.vc_activity_bottom_in, R.anim.fix_black_screen_anim);
        getWindow().setSoftInputMode(16);
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: a */
    private void m245448a(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("param_preview_type", Integer.MIN_VALUE);
            this.f157860e = intExtra;
            AbstractC62684c a = MeetingPreviewLauncher.m245463a(intExtra);
            this.f157857b = a;
            if (a == null) {
                finish();
                return;
            }
            a.setArguments(intent.getExtras());
            if (this.f157858c != this.f157857b) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                AbstractC62684c cVar = this.f157858c;
                if (cVar != null) {
                    beginTransaction.hide(cVar);
                }
                if (this.f157857b.isAdded()) {
                    beginTransaction.show(this.f157857b).commitAllowingStateLoss();
                } else {
                    beginTransaction.replace(16908290, this.f157857b).commitAllowingStateLoss();
                }
                this.f157858c = this.f157857b;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        C60700b.m235851b("MeetingPreviewActivity", "[onActivityResult]", i + " " + i2);
        LabsUtils.m242894a(i, intent);
        if (i == 19991) {
            String a = C60795b.m236288a();
            if (!TextUtils.isEmpty(a)) {
                if (C60795b.m236296a(this, a)) {
                    i3 = 0;
                } else {
                    i3 = -1;
                }
                C60795b.m236289a(i, new String[]{a}, new int[]{i3}, this);
            }
        }
    }
}
