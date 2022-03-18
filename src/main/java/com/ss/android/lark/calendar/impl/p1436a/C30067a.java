package com.ss.android.lark.calendar.impl.p1436a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.SearchBar;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.EditSelectStateView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendBuildingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.BuildingAppendSearchView;
import com.ss.android.lark.ui.CommonTitleBar;

/* renamed from: com.ss.android.lark.calendar.impl.a.a */
public final class C30067a {

    /* renamed from: a */
    public final AppendBuildingView f74909a;

    /* renamed from: b */
    public final CommonTitleBar f74910b;

    /* renamed from: c */
    public final AppendResourceTitleBar f74911c;

    /* renamed from: d */
    public final RelativeLayout f74912d;

    /* renamed from: e */
    public final CalendarLoadingView f74913e;

    /* renamed from: f */
    public final FrameLayout f74914f;

    /* renamed from: g */
    public final TextView f74915g;

    /* renamed from: h */
    public final View f74916h;

    /* renamed from: i */
    public final FrameLayout f74917i;

    /* renamed from: j */
    public final FrameLayout f74918j;

    /* renamed from: k */
    public final MeetingRoomSearchFilters f74919k;

    /* renamed from: l */
    public final View f74920l;

    /* renamed from: m */
    public final MultiLevelView f74921m;

    /* renamed from: n */
    public final ProgressBar f74922n;

    /* renamed from: o */
    public final SearchBar f74923o;

    /* renamed from: p */
    public final View f74924p;

    /* renamed from: q */
    public final BuildingAppendSearchView f74925q;

    /* renamed from: r */
    public final EditSelectStateView f74926r;

    /* renamed from: s */
    public final RelativeLayout f74927s;

    /* renamed from: t */
    public final View f74928t;

    /* renamed from: u */
    private final FrameLayout f74929u;

    /* renamed from: a */
    public FrameLayout mo108413a() {
        return this.f74929u;
    }

    /* renamed from: a */
    public static C30067a m111265a(View view) {
        int i = R.id.appendBuildingView;
        AppendBuildingView appendBuildingView = (AppendBuildingView) view.findViewById(R.id.appendBuildingView);
        if (appendBuildingView != null) {
            i = R.id.boardroom_building_title_bar;
            CommonTitleBar commonTitleBar = (CommonTitleBar) view.findViewById(R.id.boardroom_building_title_bar);
            if (commonTitleBar != null) {
                i = R.id.boardroom_building_title_bar_2;
                AppendResourceTitleBar appendResourceTitleBar = (AppendResourceTitleBar) view.findViewById(R.id.boardroom_building_title_bar_2);
                if (appendResourceTitleBar != null) {
                    i = R.id.building_loading_container;
                    RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.building_loading_container);
                    if (relativeLayout != null) {
                        i = R.id.calendar_loading_view;
                        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) view.findViewById(R.id.calendar_loading_view);
                        if (calendarLoadingView != null) {
                            i = R.id.child_fragment_container;
                            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.child_fragment_container);
                            if (frameLayout != null) {
                                i = R.id.fetch_failed;
                                TextView textView = (TextView) view.findViewById(R.id.fetch_failed);
                                if (textView != null) {
                                    i = R.id.filterTopDivider;
                                    View findViewById = view.findViewById(R.id.filterTopDivider);
                                    if (findViewById != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) view;
                                        i = R.id.load_status_bar;
                                        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.load_status_bar);
                                        if (frameLayout3 != null) {
                                            i = R.id.meetingRoomFilter;
                                            MeetingRoomSearchFilters meetingRoomSearchFilters = (MeetingRoomSearchFilters) view.findViewById(R.id.meetingRoomFilter);
                                            if (meetingRoomSearchFilters != null) {
                                                i = R.id.meetingRoomFilterDivider;
                                                View findViewById2 = view.findViewById(R.id.meetingRoomFilterDivider);
                                                if (findViewById2 != null) {
                                                    i = R.id.multiLevelView;
                                                    MultiLevelView multiLevelView = (MultiLevelView) view.findViewById(R.id.multiLevelView);
                                                    if (multiLevelView != null) {
                                                        i = R.id.progress_bar;
                                                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
                                                        if (progressBar != null) {
                                                            i = R.id.search_bar;
                                                            SearchBar searchBar = (SearchBar) view.findViewById(R.id.search_bar);
                                                            if (searchBar != null) {
                                                                i = R.id.searchBarBottomDivider;
                                                                View findViewById3 = view.findViewById(R.id.searchBarBottomDivider);
                                                                if (findViewById3 != null) {
                                                                    i = R.id.searchRoomsResultView;
                                                                    BuildingAppendSearchView buildingAppendSearchView = (BuildingAppendSearchView) view.findViewById(R.id.searchRoomsResultView);
                                                                    if (buildingAppendSearchView != null) {
                                                                        i = R.id.selectAllBt;
                                                                        EditSelectStateView editSelectStateView = (EditSelectStateView) view.findViewById(R.id.selectAllBt);
                                                                        if (editSelectStateView != null) {
                                                                            i = R.id.selectAllContainer;
                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.selectAllContainer);
                                                                            if (relativeLayout2 != null) {
                                                                                i = R.id.selectAllDivider;
                                                                                View findViewById4 = view.findViewById(R.id.selectAllDivider);
                                                                                if (findViewById4 != null) {
                                                                                    return new C30067a(frameLayout2, appendBuildingView, commonTitleBar, appendResourceTitleBar, relativeLayout, calendarLoadingView, frameLayout, textView, findViewById, frameLayout2, frameLayout3, meetingRoomSearchFilters, findViewById2, multiLevelView, progressBar, searchBar, findViewById3, buildingAppendSearchView, editSelectStateView, relativeLayout2, findViewById4);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: a */
    public static C30067a m111264a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_append_meeting_room_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111265a(inflate);
    }

    private C30067a(FrameLayout frameLayout, AppendBuildingView appendBuildingView, CommonTitleBar commonTitleBar, AppendResourceTitleBar appendResourceTitleBar, RelativeLayout relativeLayout, CalendarLoadingView calendarLoadingView, FrameLayout frameLayout2, TextView textView, View view, FrameLayout frameLayout3, FrameLayout frameLayout4, MeetingRoomSearchFilters meetingRoomSearchFilters, View view2, MultiLevelView multiLevelView, ProgressBar progressBar, SearchBar searchBar, View view3, BuildingAppendSearchView buildingAppendSearchView, EditSelectStateView editSelectStateView, RelativeLayout relativeLayout2, View view4) {
        this.f74929u = frameLayout;
        this.f74909a = appendBuildingView;
        this.f74910b = commonTitleBar;
        this.f74911c = appendResourceTitleBar;
        this.f74912d = relativeLayout;
        this.f74913e = calendarLoadingView;
        this.f74914f = frameLayout2;
        this.f74915g = textView;
        this.f74916h = view;
        this.f74917i = frameLayout3;
        this.f74918j = frameLayout4;
        this.f74919k = meetingRoomSearchFilters;
        this.f74920l = view2;
        this.f74921m = multiLevelView;
        this.f74922n = progressBar;
        this.f74923o = searchBar;
        this.f74924p = view3;
        this.f74925q = buildingAppendSearchView;
        this.f74926r = editSelectStateView;
        this.f74927s = relativeLayout2;
        this.f74928t = view4;
    }
}
