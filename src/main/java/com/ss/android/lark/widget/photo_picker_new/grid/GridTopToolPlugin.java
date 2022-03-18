package com.ss.android.lark.widget.photo_picker_new.grid;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.ListPopupWindow;
import com.bytedance.common.utility.UIUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent;
import com.ss.android.lark.widget.photo_picker_new.SelectablePhoto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ,2\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\u001f\u001a\u00020\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\"0!H\u0016J\u0012\u0010#\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\u0012\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016J\f\u0010(\u001a\u00020\u001e*\u00020\u000fH\u0002J\u0014\u0010)\u001a\u00020\u001e*\u00020\u000f2\u0006\u0010*\u001a\u00020\u0019H\u0002J\f\u0010+\u001a\u00020\u001e*\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridTopToolPlugin;", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$GridToolContext;", "activity", "Landroid/app/Activity;", "support", "Lcom/ss/android/lark/widget/photo_picker_new/grid/GridTopToolPlugin$ISupport;", "(Landroid/app/Activity;Lcom/ss/android/lark/widget/photo_picker_new/grid/GridTopToolPlugin$ISupport;)V", "backIV", "Landroid/widget/ImageView;", "button", "Landroid/widget/Button;", "listPopupWindow", "Landroidx/appcompat/widget/ListPopupWindow;", "popupAnchor", "Landroid/view/View;", "toolContext", "getView", "parent", "Landroid/view/ViewGroup;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBind", "", "onBindPhotoDir", "dirInfos", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onStop", "setContext", "context", "addElevation", "adjustHeight", "dirCount", "adjustWidth", "Companion", "ISupport", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.a.d */
public final class GridTopToolPlugin implements IToolPlugin<List<SelectablePhoto>, GridComponent.GridToolContext> {

    /* renamed from: f */
    public static final Companion f143645f = new Companion(null);

    /* renamed from: a */
    public GridComponent.GridToolContext f143646a;

    /* renamed from: b */
    public Button f143647b;

    /* renamed from: c */
    public ListPopupWindow f143648c;

    /* renamed from: d */
    public final Activity f143649d;

    /* renamed from: e */
    public final ISupport f143650e;

    /* renamed from: g */
    private ImageView f143651g;

    /* renamed from: h */
    private View f143652h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridTopToolPlugin$ISupport;", "", "isCheckedOriginImage", "", "()Z", "isSelectVideo", "selectedPhoto", "", "Lcom/ss/android/lark/widget/photo_picker_new/SelectablePhoto;", "getSelectedPhoto", "()Ljava/util/List;", "changePhotoDir", "", "photoDirID", "", "photoDirName", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.d$b */
    public interface ISupport {
        /* renamed from: a */
        List<SelectablePhoto> mo197665a();

        /* renamed from: a */
        void mo197666a(int i, String str);

        /* renamed from: b */
        boolean mo197667b();

        /* renamed from: c */
        boolean mo197668c();
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197632a() {
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197633a(TransationData dVar) {
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public boolean mo197638a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/GridTopToolPlugin$Companion;", "", "()V", "COUNT_MAX", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo197639b(GridComponent.GridToolContext aVar) {
        this.f143646a = aVar;
    }

    /* renamed from: b */
    public final void mo197664b(ListPopupWindow listPopupWindow) {
        listPopupWindow.setBackgroundDrawable(UIHelper.getDrawable(R.drawable.__picker_bg_bottom_shadow));
    }

    /* renamed from: a */
    public final void mo197660a(ListPopupWindow listPopupWindow) {
        listPopupWindow.setWidth(-1);
        listPopupWindow.setHorizontalOffset(-UIUtils.getScreenWidth(this.f143649d));
        listPopupWindow.setDropDownGravity(48);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.d$c */
    public static final class View$OnClickListenerC58386c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridTopToolPlugin f143653a;

        View$OnClickListenerC58386c(GridTopToolPlugin dVar) {
            this.f143653a = dVar;
        }

        public final void onClick(View view) {
            TransationData dVar = new TransationData();
            dVar.mo199621a("selectedPhoto", this.f143653a.f143650e.mo197665a());
            dVar.mo199621a("checkedOrigin", Boolean.valueOf(this.f143653a.f143650e.mo197667b()));
            dVar.mo199621a("isVideo", Boolean.valueOf(this.f143653a.f143650e.mo197668c()));
            GridComponent.GridToolContext aVar = this.f143653a.f143646a;
            if (aVar != null) {
                aVar.mo199650a(dVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.d$e */
    static final class View$OnClickListenerC58388e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GridTopToolPlugin f143657a;

        /* renamed from: b */
        final /* synthetic */ List f143658b;

        View$OnClickListenerC58388e(GridTopToolPlugin dVar, List list) {
            this.f143657a = dVar;
            this.f143658b = list;
        }

        public final void onClick(View view) {
            ListPopupWindow listPopupWindow = this.f143657a.f143648c;
            if (listPopupWindow == null) {
                return;
            }
            if (listPopupWindow.isShowing()) {
                listPopupWindow.dismiss();
            } else if (!this.f143657a.f143649d.isFinishing()) {
                this.f143657a.mo197661a(listPopupWindow, this.f143658b.size());
                this.f143657a.mo197660a(listPopupWindow);
                this.f143657a.mo197664b(listPopupWindow);
                listPopupWindow.show();
                ListView listView = listPopupWindow.getListView();
                if (listView != null) {
                    listView.setOverScrollMode(2);
                }
            }
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public View mo197631a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_new_grid_top_tool, viewGroup, false);
        this.f143651g = (ImageView) inflate.findViewById(R.id.btn_back);
        this.f143647b = (Button) inflate.findViewById(R.id.button);
        this.f143652h = inflate.findViewById(R.id.popup_anchor);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        return inflate;
    }

    /* renamed from: a */
    public void mo197635a(List<SelectablePhoto> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ImageView imageView = this.f143651g;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC58386c(this));
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin
    /* renamed from: a */
    public void mo197637a(Map<Integer, PhotoDir> map) {
        Intrinsics.checkParameterIsNotNull(map, "dirInfos");
        Set<Map.Entry<Integer, PhotoDir>> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            arrayList.add((PhotoDir) it.next().getValue());
        }
        ArrayList arrayList2 = arrayList;
        PopupPhotoDirListAdapter eVar = new PopupPhotoDirListAdapter(arrayList2);
        ListPopupWindow listPopupWindow = new ListPopupWindow(this.f143649d);
        listPopupWindow.setAdapter(eVar);
        listPopupWindow.setAnchorView(this.f143652h);
        listPopupWindow.setModal(true);
        listPopupWindow.setOnItemClickListener(new C58387d(this, eVar, arrayList2));
        this.f143648c = listPopupWindow;
        Button button = this.f143647b;
        if (button != null) {
            button.setOnClickListener(new View$OnClickListenerC58388e(this, arrayList2));
        }
    }

    public GridTopToolPlugin(Activity activity, ISupport bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(bVar, "support");
        this.f143649d = activity;
        this.f143650e = bVar;
    }

    /* renamed from: a */
    public final void mo197661a(ListPopupWindow listPopupWindow, int i) {
        int i2;
        if (i >= 0 && 6 >= i) {
            i2 = -2;
        } else {
            i2 = this.f143649d.getResources().getDimensionPixelOffset(R.dimen.__picker_item_directory_height) * 6;
        }
        listPopupWindow.setHeight(i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/AdapterView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "position", "", "<anonymous parameter 3>", "", "onItemClick", "com/ss/android/lark/widget/photo_picker_new/grid/GridTopToolPlugin$onBindPhotoDir$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.d$d */
    static final class C58387d implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ GridTopToolPlugin f143654a;

        /* renamed from: b */
        final /* synthetic */ PopupPhotoDirListAdapter f143655b;

        /* renamed from: c */
        final /* synthetic */ List f143656c;

        C58387d(GridTopToolPlugin dVar, PopupPhotoDirListAdapter eVar, List list) {
            this.f143654a = dVar;
            this.f143655b = eVar;
            this.f143656c = list;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f143654a.f143650e.mo197666a(((PhotoDir) this.f143656c.get(i)).mo199609a(), ((PhotoDir) this.f143656c.get(i)).mo199612b());
            Button button = this.f143654a.f143647b;
            if (button != null) {
                button.setText(((PhotoDir) this.f143656c.get(i)).mo199612b());
            }
            ListPopupWindow listPopupWindow = this.f143654a.f143648c;
            if (listPopupWindow != null) {
                listPopupWindow.dismiss();
            }
        }
    }
}
