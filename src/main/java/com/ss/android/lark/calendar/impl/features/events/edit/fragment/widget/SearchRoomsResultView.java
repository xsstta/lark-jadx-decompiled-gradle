package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.ViewInfos;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.CalendarSubscribeIndicator;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ6\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\nj\b\u0012\u0004\u0012\u00020\u0010`\f2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00100\nj\b\u0012\u0004\u0012\u00020\u0010`\fJ\u001a\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/SearchRoomsResultView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "searchRoomsPageViews", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/SearchRoomsPageView;", "Lkotlin/collections/ArrayList;", "refreshSearchView", "", "availableRoomsItemModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "allRoomsItemModel", "setViewHolderListener", "onMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "onLoadMoreClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchRoomsResultView extends FrameLayout {

    /* renamed from: a */
    public static final Companion f80985a = new Companion(null);

    /* renamed from: b */
    private final ArrayList<SearchRoomsPageView> f80986b;

    /* renamed from: c */
    private HashMap f80987c;

    public SearchRoomsResultView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchRoomsResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo115972a(int i) {
        if (this.f80987c == null) {
            this.f80987c = new HashMap();
        }
        View view = (View) this.f80987c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80987c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/SearchRoomsResultView$Companion;", "", "()V", "DIVIDER_HEIGHT", "", "INDICATOR_HEIGHT", "INDICATOR_TITLE_TEXT_SIZE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.SearchRoomsResultView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo115973a(MeetingRoomViewHolder.OnItemClickListener aVar, LoadMoreViewHolder.OnItemClickListener aVar2) {
        Iterator<T> it = this.f80986b.iterator();
        while (it.hasNext()) {
            it.next().mo115970a(aVar, aVar2);
        }
    }

    /* renamed from: a */
    public final void mo115974a(ArrayList<ItemModel> arrayList, ArrayList<ItemModel> arrayList2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "availableRoomsItemModel");
        Intrinsics.checkParameterIsNotNull(arrayList2, "allRoomsItemModel");
        this.f80986b.get(0).mo115971a(arrayList);
        this.f80986b.get(1).mo115971a(arrayList2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRoomsResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        ArrayList<SearchRoomsPageView> arrayList = new ArrayList<>();
        this.f80986b = arrayList;
        LayoutInflater.from(context).inflate(R.layout.calendar_search_meeting_rooms_result, (ViewGroup) this, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        SearchRoomsPageView searchRoomsPageView = new SearchRoomsPageView(context, null, 0, 6, null);
        SearchRoomsPageView searchRoomsPageView2 = new SearchRoomsPageView(context, null, 0, 6, null);
        arrayList.add(searchRoomsPageView);
        arrayList.add(searchRoomsPageView2);
        final ArrayList arrayList2 = new ArrayList();
        String string = UIHelper.getString(R.string.Calendar_Edit_AvaliableRooms);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…ndar_Edit_AvaliableRooms)");
        arrayList2.add(new ViewInfos(searchRoomsPageView, string));
        String string2 = UIHelper.getString(R.string.Calendar_Edit_AllRooms);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(string.Calendar_Edit_AllRooms)");
        arrayList2.add(new ViewInfos(searchRoomsPageView2, string2));
        ViewPager viewPager = (ViewPager) mo115972a(R.id.searchViewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "searchViewPager");
        viewPager.setAdapter(new BuildingPageAdapter(arrayList2));
        C69619a aVar = new C69619a(context);
        aVar.setAdjustMode(true);
        aVar.setAdapter(new AbstractC69621a(this) {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.SearchRoomsResultView.C318101 */

            /* renamed from: a */
            final /* synthetic */ SearchRoomsResultView f80988a;

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
            /* renamed from: a */
            public int mo16055a() {
                return arrayList2.size();
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.SearchRoomsResultView$1$a */
            static final class View$OnClickListenerC31811a implements View.OnClickListener {

                /* renamed from: a */
                final /* synthetic */ C318101 f80990a;

                /* renamed from: b */
                final /* synthetic */ int f80991b;

                View$OnClickListenerC31811a(C318101 r1, int i) {
                    this.f80990a = r1;
                    this.f80991b = i;
                }

                public final void onClick(View view) {
                    ViewPager viewPager = (ViewPager) this.f80990a.f80988a.mo115972a(R.id.searchViewPager);
                    Intrinsics.checkExpressionValueIsNotNull(viewPager, "searchViewPager");
                    viewPager.setCurrentItem(this.f80991b);
                }
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
            /* renamed from: a */
            public AbstractC69623c mo16056a(Context context) {
                Intrinsics.checkParameterIsNotNull(context, "context");
                CalendarSubscribeIndicator aVar = new CalendarSubscribeIndicator(context);
                aVar.setColors(Integer.valueOf(C32634ae.m125178a(R.color.primary_pri_500)));
                aVar.setMode(0);
                aVar.setLineHeight((float) UIUtils.dp2px(context, 2.0f));
                aVar.setDividerHeight((float) UIUtils.dp2px(context, 1.0f));
                return aVar;
            }

            {
                this.f80988a = r1;
            }

            @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
            /* renamed from: a */
            public AbstractC69624d mo16057a(Context context, int i) {
                C69627a aVar = new C69627a(context);
                aVar.setTextSize(14.0f);
                aVar.setNormalColor(C32634ae.m125178a(R.color.text_placeholder));
                aVar.setSelectedColor(C32634ae.m125178a(R.color.primary_pri_500));
                aVar.setOnClickListener(new View$OnClickListenerC31811a(this, i));
                aVar.setText(((ViewInfos) arrayList2.get(i)).mo110524b());
                return aVar;
            }
        });
        MagicIndicator magicIndicator = (MagicIndicator) mo115972a(R.id.searchIndicator);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "searchIndicator");
        magicIndicator.setNavigator(aVar);
        ((MagicIndicator) mo115972a(R.id.searchIndicator)).setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
        C69634c.m267483a((MagicIndicator) mo115972a(R.id.searchIndicator), (ViewPager) mo115972a(R.id.searchViewPager));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchRoomsResultView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
