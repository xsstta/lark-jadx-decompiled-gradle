package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.viewpager.CanScrollViewPager;
import com.ss.android.vc.statistics.event2.MeetingOnTheCallEvent2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.d */
public class C62370d {

    /* renamed from: a */
    public final C61303k f156829a;

    /* renamed from: b */
    public List<View> f156830b = new ArrayList();

    /* renamed from: c */
    public ParticipantViewPagerViewHolder f156831c;

    /* renamed from: d */
    public ParticipantViewPagerViewHolder f156832d;

    /* renamed from: e */
    private final FragmentActivity f156833e;

    /* renamed from: f */
    private final FrameLayout f156834f;

    /* renamed from: g */
    private CanScrollViewPager f156835g;

    /* renamed from: h */
    private TabLayout f156836h;

    /* renamed from: i */
    private PagerAdapter f156837i;

    /* renamed from: c */
    private ViewPager.OnPageChangeListener m243734c() {
        return new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62370d.C623711 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i == 0) {
                    C62370d.this.f156831c.mo215636b().notifyDataSetChanged();
                    MeetingOnTheCallEvent2.m249823a().mo220309b(C62370d.this.f156829a, "all_participants");
                } else if (i == 1) {
                    C62370d.this.f156832d.mo215636b().notifyDataSetChanged();
                    MeetingOnTheCallEvent2.m249823a().mo220309b(C62370d.this.f156829a, "suggestions");
                }
            }
        };
    }

    /* renamed from: d */
    private PagerAdapter m243735d() {
        return new PagerAdapter() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62370d.C623722 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getItemPosition(Object obj) {
                return -2;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public boolean isViewFromObject(View view, Object obj) {
                return view == obj;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return C62370d.this.f156830b.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public CharSequence getPageTitle(int i) {
                if (i == 0) {
                    int i2 = R.string.View_M_AllNumber;
                    if (C62370d.this.f156829a.al().mo213183j()) {
                        i2 = R.string.View_G_MainRoom;
                    }
                    return C62370d.this.mo215665a(UIHelper.mustacheFormat(i2, "number", String.valueOf(C62370d.this.f156831c.mo215636b().mo215608b())));
                } else if (i != 1) {
                    return "";
                } else {
                    return C62370d.this.mo215665a(UIHelper.mustacheFormat((int) R.string.View_M_SuggestionsNumberBraces, "number", String.valueOf(C62370d.this.f156832d.mo215636b().getItemCount())));
                }
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public Object instantiateItem(ViewGroup viewGroup, int i) {
                viewGroup.addView(C62370d.this.f156830b.get(i));
                return C62370d.this.f156830b.get(i);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                viewGroup.removeView((View) obj);
            }
        };
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m243736e() {
        this.f156835g.setAdapter(this.f156837i);
    }

    /* renamed from: a */
    public void mo215666a() {
        ParticipantViewPagerViewHolder participantViewPagerViewHolder = this.f156831c;
        if (participantViewPagerViewHolder != null) {
            participantViewPagerViewHolder.mo215637c();
        }
        ParticipantViewPagerViewHolder participantViewPagerViewHolder2 = this.f156832d;
        if (participantViewPagerViewHolder2 != null) {
            participantViewPagerViewHolder2.mo215637c();
        }
    }

    /* renamed from: b */
    private void m243733b() {
        this.f156834f.addView(LayoutInflater.from(this.f156833e).inflate(R.layout.fragment_participant_list, (ViewGroup) null));
        this.f156836h = (TabLayout) this.f156834f.findViewById(R.id.meeting_tablayout);
        CanScrollViewPager canScrollViewPager = (CanScrollViewPager) this.f156834f.findViewById(R.id.meeting_viewpager);
        this.f156835g = canScrollViewPager;
        this.f156836h.setupWithViewPager(canScrollViewPager);
        this.f156831c = new ParticipantViewPagerViewHolder(this.f156833e, this.f156829a, this.f156835g, this.f156836h);
        this.f156832d = new ParticipantViewPagerViewHolder(this.f156833e, this.f156829a, this.f156835g, this.f156836h);
        this.f156830b.add(this.f156831c.mo215635a("page1"));
        this.f156830b.add(this.f156832d.mo215635a("page2"));
        this.f156837i = m243735d();
        this.f156835g.post(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.$$Lambda$d$AFxhYHk5vvzI6b22gPsVgkPqbJM */

            public final void run() {
                C62370d.lambda$AFxhYHk5vvzI6b22gPsVgkPqbJM(C62370d.this);
            }
        });
        this.f156835g.addOnPageChangeListener(m243734c());
    }

    /* renamed from: a */
    public SpannableString mo215665a(String str) {
        SpannableString spannableString = new SpannableString(str);
        if (Build.VERSION.SDK_INT >= 28) {
            spannableString.setSpan(new TypefaceSpan(Typeface.DEFAULT), 0, spannableString.length(), 33);
        }
        return spannableString;
    }

    public C62370d(FragmentActivity fragmentActivity, C61303k kVar, FrameLayout frameLayout) {
        this.f156833e = fragmentActivity;
        this.f156829a = kVar;
        this.f156834f = frameLayout;
        m243733b();
    }
}
