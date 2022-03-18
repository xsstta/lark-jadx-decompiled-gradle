package com.ss.android.vc.meeting.module.multi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.floatingwindow.InMeetingFloatView;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.multi.presenter.C62526c;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.multi.presenter.MeetingPageModel;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.trace.C63784a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0015H\u0002J\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\fJ\u0006\u0010!\u001a\u00020\u0015J\u0006\u0010\"\u001a\u00020\u0015J\b\u0010#\u001a\u00020\u0015H\u0002J0\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0002R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/vc/meeting/module/multi/InMeetingPageView;", "Landroid/widget/FrameLayout;", "presenter", "Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Lcom/ss/android/vc/meeting/module/multi/presenter/InMeetingPresenter;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "mGridViews", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/multi/InMeetingGridView;", "mMeeting", "Lcom/ss/android/vc/meeting/framework/meeting/Meeting;", "mPageId", "mPresenter", "active", "", "bindPageData", "", "page", "meeting", "destroy", "initGridView", "pageModel", "Lcom/ss/android/vc/meeting/module/multi/presenter/MeetingPageModel;", "refreshGridsSeparators", "refreshMeetingGrid", "rtcJoinId", "resetViewWeight", "rotate", "rotateGridLayout", "updateGridMargin", "view", "left", "top", "right", "bottom", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.d */
public final class InMeetingPageView extends FrameLayout {

    /* renamed from: a */
    public String f157268a;

    /* renamed from: b */
    public C61303k f157269b;

    /* renamed from: c */
    private final String f157270c;

    /* renamed from: d */
    private ArrayList<InMeetingGridView> f157271d;

    /* renamed from: e */
    private InMeetingPresenter f157272e;

    /* renamed from: f */
    private HashMap f157273f;

    /* renamed from: a */
    public View mo216111a(int i) {
        if (this.f157273f == null) {
            this.f157273f = new HashMap();
        }
        View view = (View) this.f157273f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f157273f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: e */
    public void mo216118e() {
        HashMap hashMap = this.f157273f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: g */
    private final void m244388g() {
        if (CollectionUtils.isEmpty(this.f157271d)) {
        }
    }

    /* renamed from: b */
    public final MeetingPageModel mo216115b() {
        InMeetingPageView dVar = this;
        if (dVar.f157269b == null || dVar.f157268a == null) {
            MeetingPageModel meetingPageModel = MeetingPageModel.f157340a;
            Intrinsics.checkExpressionValueIsNotNull(meetingPageModel, "MeetingPageModel.EmptyPage");
            return meetingPageModel;
        }
        C61303k kVar = this.f157269b;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        AbsGridContentControl aw = kVar.aw();
        String str = this.f157268a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageId");
        }
        MeetingPageModel d = aw.mo216147d(str);
        if (d != null) {
            return d;
        }
        MeetingPageModel meetingPageModel2 = MeetingPageModel.f157340a;
        Intrinsics.checkExpressionValueIsNotNull(meetingPageModel2, "MeetingPageModel.EmptyPage");
        return meetingPageModel2;
    }

    /* renamed from: a */
    public final void mo216112a() {
        if (mo216115b().mo216179c() != 0) {
            String str = this.f157270c;
            C60700b.m235843a(str, "[active]", "Page: " + mo216115b().mo216179c());
            int c = mo216115b().mo216179c();
            C61303k kVar = this.f157269b;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
            }
            mo216114a(c, kVar);
        }
    }

    /* renamed from: d */
    public final void mo216117d() {
        Iterator<InMeetingGridView> it = this.f157271d.iterator();
        while (it.hasNext()) {
            it.next().mo215960y();
        }
        String str = this.f157270c;
        C60700b.m235851b(str, "[destroy]", "Page View: " + ((InMeetingFloatView) mo216111a(R.id.float_view)));
        InMeetingFloatView inMeetingFloatView = (InMeetingFloatView) mo216111a(R.id.float_view);
        if (inMeetingFloatView != null) {
            inMeetingFloatView.mo213681f();
        }
    }

    /* renamed from: c */
    public final void mo216116c() {
        LinearLayout linearLayout = (LinearLayout) mo216111a(R.id.row_top);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "row_top");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = null;
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams3 != null) {
            layoutParams3.weight = 1.0f;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo216111a(R.id.row_bottom);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "row_bottom");
        ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        if (!(layoutParams4 instanceof LinearLayout.LayoutParams)) {
            layoutParams4 = null;
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        if (layoutParams5 != null) {
            layoutParams5.weight = 1.0f;
        }
        InMeetingGridView inMeetingGridView = (InMeetingGridView) mo216111a(R.id.grid1);
        Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView, "grid1");
        ViewGroup.LayoutParams layoutParams6 = inMeetingGridView.getLayoutParams();
        if (!(layoutParams6 instanceof LinearLayout.LayoutParams)) {
            layoutParams6 = null;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
        if (layoutParams7 != null) {
            layoutParams7.weight = 1.0f;
        }
        InMeetingGridView inMeetingGridView2 = (InMeetingGridView) mo216111a(R.id.grid2);
        Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView2, "grid2");
        ViewGroup.LayoutParams layoutParams8 = inMeetingGridView2.getLayoutParams();
        if (!(layoutParams8 instanceof LinearLayout.LayoutParams)) {
            layoutParams8 = null;
        }
        LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams8;
        if (layoutParams9 != null) {
            layoutParams9.weight = 1.0f;
        }
        InMeetingGridView inMeetingGridView3 = (InMeetingGridView) mo216111a(R.id.grid3);
        Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView3, "grid3");
        ViewGroup.LayoutParams layoutParams10 = inMeetingGridView3.getLayoutParams();
        if (!(layoutParams10 instanceof LinearLayout.LayoutParams)) {
            layoutParams10 = null;
        }
        LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) layoutParams10;
        if (layoutParams11 != null) {
            layoutParams11.weight = 1.0f;
        }
        InMeetingGridView inMeetingGridView4 = (InMeetingGridView) mo216111a(R.id.grid4);
        Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView4, "grid4");
        ViewGroup.LayoutParams layoutParams12 = inMeetingGridView4.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = layoutParams12;
        }
        LinearLayout.LayoutParams layoutParams13 = layoutParams2;
        if (layoutParams13 != null) {
            layoutParams13.weight = 1.0f;
        }
    }

    /* renamed from: f */
    private final void m244387f() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        C60700b.m235843a(this.f157270c, "[initGridView]", "initGridView");
        C63784a.m250428a("[VideoChat_InMeetingPageView_initGridView]");
        MeetingPageModel b = mo216115b();
        String str = this.f157270c;
        C60700b.m235843a(str, "[initGridView2]", "Page: " + b.mo216179c());
        if (b.mo216182f() == this.f157271d.size()) {
            List<C62526c> a = b.mo216174a();
            Intrinsics.checkExpressionValueIsNotNull(a, "pageViewModel.grids");
            int i = 0;
            for (T t : a) {
                InMeetingPresenter bVar = this.f157272e;
                Intrinsics.checkExpressionValueIsNotNull(t, "gridModel");
                this.f157271d.get(i).mo215910a(bVar, t);
                i++;
            }
        } else {
            ArrayList<InMeetingGridView> arrayList = this.f157271d;
            if (arrayList != null) {
                for (T t2 : arrayList) {
                    t2.mo215961z();
                    t2.mo215914c(true);
                }
            }
            this.f157271d.clear();
            mo216116c();
            int f = b.mo216182f();
            if (f == 1) {
                LinearLayout linearLayout = (LinearLayout) mo216111a(R.id.row_top);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "row_top");
                C60752f.m236079a((View) linearLayout);
                InMeetingGridView inMeetingGridView = (InMeetingGridView) mo216111a(R.id.grid1);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView, "grid1");
                C60752f.m236079a((View) inMeetingGridView);
                InMeetingPresenter bVar2 = this.f157272e;
                C62526c cVar = b.mo216174a().get(0);
                Intrinsics.checkExpressionValueIsNotNull(cVar, "pageViewModel.grids[0]");
                ((InMeetingGridView) mo216111a(R.id.grid1)).mo215910a(bVar2, cVar);
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid1));
                InMeetingGridView inMeetingGridView2 = (InMeetingGridView) mo216111a(R.id.grid2);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView2, "grid2");
                ViewGroup.LayoutParams layoutParams4 = inMeetingGridView2.getLayoutParams();
                if (!(layoutParams4 instanceof LinearLayout.LayoutParams)) {
                    layoutParams4 = null;
                }
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                if (layoutParams5 != null) {
                    layoutParams5.weight = BitmapDescriptorFactory.HUE_RED;
                }
                LinearLayout linearLayout2 = (LinearLayout) mo216111a(R.id.row_bottom);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "row_bottom");
                ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
                if (!(layoutParams6 instanceof LinearLayout.LayoutParams)) {
                    layoutParams = null;
                } else {
                    layoutParams = layoutParams6;
                }
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams;
                if (layoutParams7 != null) {
                    layoutParams7.weight = BitmapDescriptorFactory.HUE_RED;
                }
            } else if (f == 2) {
                LinearLayout linearLayout3 = (LinearLayout) mo216111a(R.id.row_top);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "row_top");
                C60752f.m236079a((View) linearLayout3);
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid1));
                InMeetingGridView inMeetingGridView3 = (InMeetingGridView) mo216111a(R.id.grid1);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView3, "grid1");
                C60752f.m236079a((View) inMeetingGridView3);
                InMeetingPresenter bVar3 = this.f157272e;
                C62526c cVar2 = b.mo216174a().get(0);
                Intrinsics.checkExpressionValueIsNotNull(cVar2, "pageViewModel.grids[0]");
                ((InMeetingGridView) mo216111a(R.id.grid1)).mo215910a(bVar3, cVar2);
                InMeetingGridView inMeetingGridView4 = (InMeetingGridView) mo216111a(R.id.grid2);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView4, "grid2");
                ViewGroup.LayoutParams layoutParams8 = inMeetingGridView4.getLayoutParams();
                if (!(layoutParams8 instanceof LinearLayout.LayoutParams)) {
                    layoutParams8 = null;
                }
                LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams8;
                if (layoutParams9 != null) {
                    layoutParams9.weight = BitmapDescriptorFactory.HUE_RED;
                }
                LinearLayout linearLayout4 = (LinearLayout) mo216111a(R.id.row_bottom);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "row_bottom");
                C60752f.m236079a((View) linearLayout4);
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid3));
                InMeetingGridView inMeetingGridView5 = (InMeetingGridView) mo216111a(R.id.grid3);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView5, "grid3");
                C60752f.m236079a((View) inMeetingGridView5);
                InMeetingPresenter bVar4 = this.f157272e;
                C62526c cVar3 = b.mo216174a().get(1);
                Intrinsics.checkExpressionValueIsNotNull(cVar3, "pageViewModel.grids[1]");
                ((InMeetingGridView) mo216111a(R.id.grid3)).mo215910a(bVar4, cVar3);
                InMeetingGridView inMeetingGridView6 = (InMeetingGridView) mo216111a(R.id.grid4);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView6, "grid4");
                ViewGroup.LayoutParams layoutParams10 = inMeetingGridView6.getLayoutParams();
                if (!(layoutParams10 instanceof LinearLayout.LayoutParams)) {
                    layoutParams2 = null;
                } else {
                    layoutParams2 = layoutParams10;
                }
                LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) layoutParams2;
                if (layoutParams11 != null) {
                    layoutParams11.weight = BitmapDescriptorFactory.HUE_RED;
                }
            } else if (f == 3) {
                LinearLayout linearLayout5 = (LinearLayout) mo216111a(R.id.row_top);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "row_top");
                C60752f.m236079a((View) linearLayout5);
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid1));
                InMeetingGridView inMeetingGridView7 = (InMeetingGridView) mo216111a(R.id.grid1);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView7, "grid1");
                C60752f.m236079a((View) inMeetingGridView7);
                InMeetingPresenter bVar5 = this.f157272e;
                C62526c cVar4 = b.mo216174a().get(0);
                Intrinsics.checkExpressionValueIsNotNull(cVar4, "pageViewModel.grids[0]");
                ((InMeetingGridView) mo216111a(R.id.grid1)).mo215910a(bVar5, cVar4);
                InMeetingGridView inMeetingGridView8 = (InMeetingGridView) mo216111a(R.id.grid2);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView8, "grid2");
                ViewGroup.LayoutParams layoutParams12 = inMeetingGridView8.getLayoutParams();
                if (!(layoutParams12 instanceof LinearLayout.LayoutParams)) {
                    layoutParams3 = null;
                } else {
                    layoutParams3 = layoutParams12;
                }
                LinearLayout.LayoutParams layoutParams13 = (LinearLayout.LayoutParams) layoutParams3;
                if (layoutParams13 != null) {
                    layoutParams13.weight = BitmapDescriptorFactory.HUE_RED;
                }
                LinearLayout linearLayout6 = (LinearLayout) mo216111a(R.id.row_bottom);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "row_bottom");
                C60752f.m236079a((View) linearLayout6);
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid3));
                InMeetingGridView inMeetingGridView9 = (InMeetingGridView) mo216111a(R.id.grid3);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView9, "grid3");
                C60752f.m236079a((View) inMeetingGridView9);
                InMeetingPresenter bVar6 = this.f157272e;
                C62526c cVar5 = b.mo216174a().get(1);
                Intrinsics.checkExpressionValueIsNotNull(cVar5, "pageViewModel.grids[1]");
                ((InMeetingGridView) mo216111a(R.id.grid3)).mo215910a(bVar6, cVar5);
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid4));
                InMeetingGridView inMeetingGridView10 = (InMeetingGridView) mo216111a(R.id.grid4);
                Intrinsics.checkExpressionValueIsNotNull(inMeetingGridView10, "grid4");
                C60752f.m236079a((View) inMeetingGridView10);
                InMeetingPresenter bVar7 = this.f157272e;
                C62526c cVar6 = b.mo216174a().get(2);
                Intrinsics.checkExpressionValueIsNotNull(cVar6, "pageViewModel.grids[2]");
                ((InMeetingGridView) mo216111a(R.id.grid4)).mo215910a(bVar7, cVar6);
            } else if (f == 4) {
                LinearLayout linearLayout7 = (LinearLayout) mo216111a(R.id.row_top);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "row_top");
                C60752f.m236079a((View) linearLayout7);
                LinearLayout linearLayout8 = (LinearLayout) mo216111a(R.id.row_bottom);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout8, "row_bottom");
                C60752f.m236079a((View) linearLayout8);
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid1));
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid2));
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid3));
                this.f157271d.add((InMeetingGridView) mo216111a(R.id.grid4));
                int i2 = 0;
                for (T t3 : this.f157271d) {
                    InMeetingPresenter bVar8 = this.f157272e;
                    C62526c cVar7 = b.mo216174a().get(i2);
                    Intrinsics.checkExpressionValueIsNotNull(cVar7, "pageViewModel.grids[index]");
                    t3.mo215910a(bVar8, cVar7);
                    C60752f.m236079a((View) t3);
                    i2++;
                }
            }
        }
        C63784a.m250429b("[VideoChat_InMeetingPageView_initGridView]");
    }

    /* renamed from: a */
    public final void mo216113a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "rtcJoinId");
        if (CollectionUtils.isEmpty(this.f157271d)) {
            C60700b.m235864f(this.f157270c, "[refreshMeetingGrid]", "Page view is not ready");
        } else if (this.f157271d.size() != mo216115b().mo216174a().size()) {
            C60700b.m235864f(this.f157270c, "[refreshMeetingGrid2]", "Page view is not consistent with the model.");
        } else {
            int i = 0;
            List<C62526c> a = mo216115b().mo216174a();
            Intrinsics.checkExpressionValueIsNotNull(a, "pageModel().grids");
            for (T t : a) {
                Intrinsics.checkExpressionValueIsNotNull(t, "model");
                if (ParticipantUtil.m248716a(t.mo216208m(), str)) {
                    this.f157271d.get(i).mo215937r();
                    return;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo216114a(int i, C61303k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "meeting");
        MeetingPageModel a = kVar.aw().mo216136a(i);
        if (a == null) {
            return false;
        }
        String e = a.mo216181e();
        Intrinsics.checkExpressionValueIsNotNull(e, "pageModel.pageId");
        this.f157268a = e;
        this.f157269b = kVar;
        if (mo216115b() == null) {
            return false;
        }
        C61303k kVar2 = this.f157269b;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeeting");
        }
        if (!kVar2.mo212065n()) {
            C60700b.m235861e(this.f157270c, "[bindPageData]", "meeting is finished.");
            return false;
        } else if (a.mo216179c() == 0 || this.f157272e.getMInMeetingActived()) {
            if (getChildCount() == 0) {
                LayoutInflater.from(getContext()).inflate(R.layout.fragment_in_meeting_page, (ViewGroup) this, true);
            }
            mo216118e();
            LinearLayout linearLayout = (LinearLayout) mo216111a(R.id.layout_grid_container);
            if (linearLayout != null) {
                C60752f.m236079a((View) linearLayout);
            }
            FrameLayout frameLayout = (FrameLayout) mo216111a(R.id.screen_container);
            if (frameLayout != null) {
                C60752f.m236083c(frameLayout);
            }
            InMeetingFloatView inMeetingFloatView = (InMeetingFloatView) mo216111a(R.id.float_view);
            if (inMeetingFloatView != null) {
                C60752f.m236083c(inMeetingFloatView);
            }
            m244387f();
            m244388g();
            return true;
        } else {
            String str = this.f157270c;
            C60700b.m235843a(str, "[bindPageData2]", "Page is inactive: " + a.mo216179c());
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InMeetingPageView(InMeetingPresenter bVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(bVar, "presenter");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f157270c = "InMeetingLightPageView";
        this.f157271d = new ArrayList<>();
        this.f157272e = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InMeetingPageView(InMeetingPresenter bVar, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, context, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }
}
