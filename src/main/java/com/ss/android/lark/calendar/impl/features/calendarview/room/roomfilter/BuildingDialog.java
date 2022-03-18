package com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.BuildingDialogAdapter;
import com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.BuildingFloorAdapter;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneBuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.VerticalDragLayout;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\u0014\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/widget/DragShrinkDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "buildingFloorListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog$OnBuildingFloorListener;", "getBuildingFloorListener", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog$OnBuildingFloorListener;", "setBuildingFloorListener", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog$OnBuildingFloorListener;)V", "isSecondLevelPage", "", "()Z", "setSecondLevelPage", "(Z)V", "mBuildingAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter;", "mFloorAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter;", "dismiss", "", "initBackArrow", "initBuildingView", "initConfirm", "initFloorView", "initSearchBar", "onBackPressed", "refreshData", "buildingsData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "show", "showBuilding", "showFloor", "OnBuildingFloorListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a */
public final class BuildingDialog extends DragShrinkDialog {

    /* renamed from: a */
    public final BuildingDialogAdapter f78183a;

    /* renamed from: b */
    public final BuildingFloorAdapter f78184b;

    /* renamed from: c */
    private OnBuildingFloorListener f78185c;

    /* renamed from: d */
    private boolean f78186d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog$OnBuildingFloorListener;", "", "onSearchTextChanged", "", "keyWord", "", "onSelectChanged", "selectBuildings", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a$a */
    public interface OnBuildingFloorListener {
        /* renamed from: a */
        void mo112285a(String str);

        /* renamed from: a */
        void mo112286a(List<OneBuildingFloorViewData> list);
    }

    /* renamed from: a */
    public final OnBuildingFloorListener mo112221a() {
        return this.f78185c;
    }

    /* renamed from: b */
    public final boolean mo112225b() {
        return this.f78186d;
    }

    public void onBackPressed() {
        dismiss();
    }

    /* renamed from: m */
    private final void m115725m() {
        ((ImageView) findViewById(R.id.buildingFilterBack)).setOnClickListener(new View$OnClickListenerC31016b(this));
    }

    /* renamed from: n */
    private final void m115726n() {
        ((TextView) findViewById(R.id.dialogConfirm)).setOnClickListener(new View$OnClickListenerC31018d(this));
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void dismiss() {
        KeyboardUtils.hideKeyboard(getContext(), (EditText) findViewById(R.id.buildingSearchEt));
        super.dismiss();
    }

    /* renamed from: k */
    private final void m115723k() {
        ((EditText) findViewById(R.id.buildingSearchEt)).addTextChangedListener(new C31020f(this));
        EditText editText = (EditText) findViewById(R.id.buildingSearchEt);
        Intrinsics.checkExpressionValueIsNotNull(editText, "buildingSearchEt");
        editText.setImeOptions(6);
        ((ImageView) findViewById(R.id.searchClearBtn)).setOnClickListener(new View$OnClickListenerC31021g(this));
    }

    /* renamed from: l */
    private final void m115724l() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.floorRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "floorRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.floorRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "floorRv");
        recyclerView2.setAdapter(this.f78184b);
        this.f78184b.mo112306a(new C31019e(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.widget.DragShrinkDialog, com.larksuite.framework.ui.BaseDialog
    public void show() {
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        findViewById.setBackground(new ColorDrawable(UIHelper.getColor(R.color.lkui_N900)));
        super.show();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115976a((float) DeviceUtils.getScreenHeight(getContext()), BitmapDescriptorFactory.HUE_RED, mo112527e());
    }

    /* renamed from: j */
    private final void m115722j() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.buildingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "buildingRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.buildingRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "buildingRv");
        recyclerView2.setAdapter(this.f78183a);
        ((ImageView) findViewById(R.id.buildingFilterBack)).setImageResource(R.drawable.ud_icon_close_small_outlined);
        this.f78183a.mo112298a(new C31017c(this));
    }

    /* renamed from: c */
    public final void mo112283c() {
        this.f78186d = false;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.buildingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "buildingContainer");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.floorContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "floorContainer");
        linearLayout2.setVisibility(8);
        ((ImageView) findViewById(R.id.buildingFilterBack)).setImageResource(R.drawable.ud_icon_close_small_outlined);
        TextView textView = (TextView) findViewById(R.id.buildingTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "buildingTitle");
        textView.setText(C32634ae.m125182b(R.string.Calendar_Edit_SelectBuildingTitle));
        TextView textView2 = (TextView) findViewById(R.id.dialogConfirm);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "dialogConfirm");
        textView2.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo112227d() {
        this.f78186d = true;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.buildingContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "buildingContainer");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.floorContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "floorContainer");
        linearLayout2.setVisibility(0);
        ((ImageView) findViewById(R.id.buildingFilterBack)).setImageResource(R.drawable.ud_icon_left_outlined);
        TextView textView = (TextView) findViewById(R.id.buildingTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "buildingTitle");
        textView.setText(C32634ae.m125182b(R.string.Calendar_Edit_SelectFloorTitle));
        TextView textView2 = (TextView) findViewById(R.id.dialogConfirm);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "dialogConfirm");
        textView2.setVisibility(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog$initBuildingView$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialogAdapter$OnItemClickListener;", "onItemClick", "", "buildingFloorData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a$c */
    public static final class C31017c implements BuildingDialogAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingDialog f78188a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31017c(BuildingDialog aVar) {
            this.f78188a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.BuildingDialogAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo112288a(OneBuildingFloorViewData gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "buildingFloorData");
            this.f78188a.f78184b.mo112307a(gVar);
            this.f78188a.mo112227d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a$d */
    public static final class View$OnClickListenerC31018d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingDialog f78189a;

        View$OnClickListenerC31018d(BuildingDialog aVar) {
            this.f78189a = aVar;
        }

        public final void onClick(View view) {
            this.f78189a.mo112528f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog$initFloorView$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingFloorAdapter$OnItemClickListener;", "onItemClick", "", "buildingFloorData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a$e */
    public static final class C31019e implements BuildingFloorAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingDialog f78190a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31019e(BuildingDialog aVar) {
            this.f78190a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.room.roomfilter.BuildingFloorAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo112290a(OneBuildingFloorViewData gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "buildingFloorData");
            this.f78190a.f78183a.mo112300b();
            gVar.mo112379a(true);
            OnBuildingFloorListener a = this.f78190a.mo112221a();
            if (a != null) {
                a.mo112286a(CollectionsKt.listOf(gVar));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/room/roomfilter/BuildingDialog$initSearchBar$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a$f */
    public static final class C31020f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BuildingDialog f78191a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31020f(BuildingDialog aVar) {
            this.f78191a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            EditText editText = (EditText) this.f78191a.findViewById(R.id.buildingSearchEt);
            Intrinsics.checkExpressionValueIsNotNull(editText, "buildingSearchEt");
            Editable text = editText.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                ImageView imageView = (ImageView) this.f78191a.findViewById(R.id.searchClearBtn);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "searchClearBtn");
                imageView.setVisibility(4);
            } else {
                ImageView imageView2 = (ImageView) this.f78191a.findViewById(R.id.searchClearBtn);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "searchClearBtn");
                imageView2.setVisibility(0);
            }
            OnBuildingFloorListener a = this.f78191a.mo112221a();
            if (a != null) {
                a.mo112285a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo112281a(OnBuildingFloorListener aVar) {
        this.f78185c = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a$b */
    public static final class View$OnClickListenerC31016b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingDialog f78187a;

        View$OnClickListenerC31016b(BuildingDialog aVar) {
            this.f78187a = aVar;
        }

        public final void onClick(View view) {
            if (this.f78187a.mo112225b()) {
                this.f78187a.f78183a.notifyDataSetChanged();
                this.f78187a.mo112283c();
                return;
            }
            this.f78187a.mo112528f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.c.a$g */
    public static final class View$OnClickListenerC31021g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingDialog f78192a;

        View$OnClickListenerC31021g(BuildingDialog aVar) {
            this.f78192a = aVar;
        }

        public final void onClick(View view) {
            EditText editText = (EditText) this.f78192a.findViewById(R.id.buildingSearchEt);
            Intrinsics.checkExpressionValueIsNotNull(editText, "buildingSearchEt");
            editText.getText().clear();
        }
    }

    /* renamed from: a */
    public final void mo112282a(List<OneBuildingFloorViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "buildingsData");
        if (list.isEmpty()) {
            TextView textView = (TextView) findViewById(R.id.emptyTip);
            Intrinsics.checkExpressionValueIsNotNull(textView, "emptyTip");
            textView.setVisibility(0);
        } else {
            TextView textView2 = (TextView) findViewById(R.id.emptyTip);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "emptyTip");
            textView2.setVisibility(8);
        }
        this.f78183a.mo112299a(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuildingDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78183a = new BuildingDialogAdapter();
        this.f78184b = new BuildingFloorAdapter();
        mo112524a(UIHelper.dp2px(88.0f));
        mo112526b(R.layout.dialog_room_view_building_filter);
        m115722j();
        m115723k();
        m115724l();
        m115725m();
        m115726n();
        ((VerticalDragLayout) findViewById(R.id.dragLayout)).mo115978d();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuildingDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.style.CalendarTransparentDialog : i);
    }
}
