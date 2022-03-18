package com.ss.android.lark.mm.module.player.core.layer.p2319j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.C46627b;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitleLine;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.j.d */
public class C46668d {

    /* renamed from: a */
    private LinearLayout f117378a;

    /* renamed from: b */
    private C46627b f117379b;

    /* renamed from: c */
    private boolean f117380c;

    /* renamed from: c */
    public void mo163893c() {
        mo163887a();
        mo163892b();
    }

    /* renamed from: d */
    private List<MmSubtitleLine> m184569d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f117378a.getChildCount(); i++) {
            MmSubtitleLine a = mo163886a(this.f117378a.getChildAt(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private void m184570e() {
        long j = Long.MIN_VALUE;
        View view = null;
        for (int childCount = this.f117378a.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f117378a.getChildAt(childCount);
            MmSubtitleLine a = mo163886a(childAt);
            if (a != null && a.getStop_ms() < j) {
                j = a.getStop_ms();
                view = childAt;
            }
        }
        if (view != null) {
            this.f117378a.removeView(view);
        }
    }

    /* renamed from: a */
    public void mo163887a() {
        int i;
        int i2;
        int i3;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f117378a.getLayoutParams();
        if (!this.f117380c) {
            i2 = C57582a.m223600a(24);
            i3 = C57582a.m223600a(24);
            i = C57582a.m223600a(8);
        } else {
            i2 = C57582a.m223600a((int) SmEvents.EVENT_NO);
            i3 = C57582a.m223600a((int) SmEvents.EVENT_NO);
            i = C57582a.m223600a(20);
        }
        layoutParams.setMargins(i2, 0, i3, i);
        this.f117378a.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo163892b() {
        for (int childCount = this.f117378a.getChildCount() - 1; childCount >= 0; childCount--) {
            TextView textView = (TextView) this.f117378a.getChildAt(childCount);
            if (textView.getVisibility() == 0) {
                if (this.f117380c) {
                    textView.setTextSize(0, (float) C57582a.m223600a(16));
                } else {
                    textView.setTextSize(0, (float) C57582a.m223600a(10));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo163891a(boolean z) {
        this.f117380c = z;
    }

    /* renamed from: a */
    public MmSubtitleLine mo163886a(View view) {
        if (view.getTag() != null) {
            return (MmSubtitleLine) view.getTag();
        }
        return null;
    }

    /* renamed from: a */
    private void m184567a(long j) {
        MmSubtitleLine a;
        for (int childCount = this.f117378a.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f117378a.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && (a = mo163886a(childAt)) != null && !a.isMatch(j)) {
                C45855f.m181663b("PlayerSubtitlePanelController", "removeExpiredView " + this.f117378a.getChildCount() + " " + a);
                this.f117378a.removeView(childAt);
            }
        }
    }

    /* renamed from: a */
    private void m184568a(MmSubtitleLine mmSubtitleLine) {
        if (mmSubtitleLine != null) {
            TextView textView = (TextView) LayoutInflater.from(this.f117378a.getContext()).inflate(R.layout.mm_tv_subtitle, (ViewGroup) this.f117378a, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = (int) UIUtils.dip2Px(C45851c.m181646a(), 4.0f);
            mo163890a(textView, mmSubtitleLine);
            textView.setText(mmSubtitleLine.getContent());
            if (this.f117380c) {
                textView.setTextSize(0, (float) C57582a.m223600a(16));
            } else {
                textView.setTextSize(0, (float) C57582a.m223600a(10));
            }
            C45855f.m181663b("PlayerSubtitlePanelController", "addSubtitleView " + this.f117378a.getChildCount() + " " + mmSubtitleLine);
            this.f117378a.addView(textView, 0, layoutParams);
        }
    }

    public C46668d(LinearLayout linearLayout, C46627b bVar) {
        this.f117379b = bVar;
        this.f117378a = linearLayout;
    }

    /* renamed from: a */
    public void mo163890a(View view, MmSubtitleLine mmSubtitleLine) {
        if (view != null) {
            view.setTag(mmSubtitleLine);
        }
    }

    /* renamed from: a */
    public void mo163888a(long j, long j2) {
        mo163889a(j, this.f117379b.mo163821a().mo163830a().findLines(j));
    }

    /* renamed from: a */
    public void mo163889a(long j, List<MmSubtitleLine> list) {
        m184567a(j);
        if (!CollectionUtils.isEmpty(list)) {
            list.removeAll(m184569d());
            if (!CollectionUtils.isEmpty(list)) {
                int size = (m184569d().size() + list.size()) - 2;
                for (int i = 0; i < size; i++) {
                    m184570e();
                }
                for (MmSubtitleLine mmSubtitleLine : list) {
                    if (m184569d().size() >= 2) {
                        break;
                    }
                    m184568a(mmSubtitleLine);
                }
            }
        }
        this.f117378a.invalidate();
    }
}
