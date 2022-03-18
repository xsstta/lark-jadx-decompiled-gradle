package com.ss.android.vc.meeting.module.multi.viewpager;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.multi.InMeetingPageView;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0013J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\tH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010'\u001a\u00020\u0013H\u0016J\u0006\u0010(\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/viewpager/MeetingPageAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Lcom/ss/android/vc/meeting/module/multi/viewpager/IInMeetingPager;", "presenter", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "pageBuilder", "Lcom/ss/android/vc/meeting/module/multi/viewpager/IMeetingPageBuilder;", "(Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;Lcom/ss/android/vc/meeting/module/multi/viewpager/IMeetingPageBuilder;)V", "TAG", "", "mContainer", "Landroid/view/ViewGroup;", "mPageBuilder", "mPageViewCaches", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/multi/viewpager/PageHolder;", "Lkotlin/collections/ArrayList;", "mPresenter", "active", "", "buildPageViewItem", "container", "position", "", "destroy", "destroyItem", "object", "", "getCount", "getItemPosition", "getPageViewByRtcJoinId", "Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;", "rtcJoinId", "getSharePageView", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "notifyDataSetChanged", "rotate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.viewpager.b */
public final class MeetingPageAdapter extends PagerAdapter {

    /* renamed from: a */
    public ViewGroup f157366a;

    /* renamed from: b */
    private final String f157367b = "MeetingPageAdapter";

    /* renamed from: c */
    private InMeetingPresenter f157368c;

    /* renamed from: d */
    private ArrayList<PageHolder> f157369d;

    /* renamed from: e */
    private IMeetingPageBuilder f157370e;

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        C61303k meeting = this.f157368c.getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "mPresenter.meeting");
        return meeting.aw().mo216145c();
    }

    /* renamed from: a */
    public final void mo216229a() {
        if (this.f157366a != null) {
            ViewGroup viewGroup = this.f157366a;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup viewGroup2 = this.f157366a;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                }
                View childAt = viewGroup2.getChildAt(i);
                if (!(childAt instanceof InMeetingPageView)) {
                    childAt = null;
                }
                InMeetingPageView dVar = (InMeetingPageView) childAt;
                if (dVar != null) {
                    dVar.mo216117d();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo216230b() {
        if (this.f157366a != null) {
            ViewGroup viewGroup = this.f157366a;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup viewGroup2 = this.f157366a;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                }
                View childAt = viewGroup2.getChildAt(i);
                if (!(childAt instanceof InMeetingPageView)) {
                    childAt = null;
                }
                InMeetingPageView dVar = (InMeetingPageView) childAt;
                if (dVar != null) {
                    dVar.mo216112a();
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "object");
        C60700b.m235843a(this.f157367b, "[MeetingPageAdapter2] [getItemPosition]", "getItemPosition");
        PageHolder cVar = (PageHolder) obj;
        if (cVar.mo216233b() < 0) {
            return -2;
        }
        int b = cVar.mo216233b();
        C61303k meeting = this.f157368c.getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "mPresenter.meeting");
        if (b >= meeting.aw().mo216145c()) {
            return -2;
        }
        InMeetingPageView a = cVar.mo216231a();
        int b2 = cVar.mo216233b();
        C61303k meeting2 = this.f157368c.getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting2, "mPresenter.meeting");
        a.mo216114a(b2, meeting2);
        return -1;
    }

    /* renamed from: a */
    public InMeetingPageView mo216228a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        if (this.f157366a == null) {
            return null;
        }
        ViewGroup viewGroup = this.f157366a;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup2 = this.f157366a;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            }
            View childAt = viewGroup2.getChildAt(i);
            if (!(childAt instanceof InMeetingPageView)) {
                childAt = null;
            }
            InMeetingPageView dVar = (InMeetingPageView) childAt;
            if (dVar != null && dVar.mo216115b().mo216177a(str)) {
                return dVar;
            }
        }
        return null;
    }

    public MeetingPageAdapter(InMeetingPresenter bVar, IMeetingPageBuilder aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "presenter");
        Intrinsics.checkParameterIsNotNull(aVar, "pageBuilder");
        this.f157368c = bVar;
        this.f157369d = new ArrayList<>();
        this.f157370e = aVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(obj, "object");
        if (view == ((PageHolder) obj).mo216231a()) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Trace.beginSection("APM-MeetingPageAdapter2-instantiateItem");
        System.currentTimeMillis();
        PageHolder a = m244576a(viewGroup, i);
        if (this.f157366a == null) {
            this.f157366a = viewGroup;
        }
        viewGroup.addView(a.mo216231a());
        InMeetingPageView a2 = a.mo216231a();
        C61303k meeting = this.f157368c.getMeeting();
        Intrinsics.checkExpressionValueIsNotNull(meeting, "mPresenter.meeting");
        a2.mo216114a(i, meeting);
        Trace.endSection();
        return a;
    }

    /* renamed from: a */
    private final PageHolder m244576a(ViewGroup viewGroup, int i) {
        PageHolder cVar;
        String str = this.f157367b;
        C60700b.m235851b(str, "[MeetingPageAdapter2] [buildPageViewItem]", "position = " + i + "，cacheSize=" + this.f157369d.size());
        if (!this.f157369d.isEmpty()) {
            cVar = this.f157369d.remove(0);
        } else {
            cVar = this.f157370e.mo216170a(this.f157368c, viewGroup, i);
        }
        Intrinsics.checkExpressionValueIsNotNull(cVar, "if (mPageViewCaches.isNo…iner, position)\n        }");
        cVar.mo216232a(i);
        return cVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(obj, "object");
        String str = this.f157367b;
        C60700b.m235851b(str, "[MeetingPageAdapter2] [destroyItem]", "position = " + i);
        PageHolder cVar = (PageHolder) obj;
        cVar.mo216231a().mo216117d();
        viewGroup.removeView(cVar.mo216231a());
        this.f157369d.add(cVar);
    }
}
