package com.bytedance.ee.android.file.picker.lib.local;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter;
import com.bytedance.ee.android.file.picker.lib.utils.TemplateUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u000e\u001a\u00020\u00052\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000bj\b\u0012\u0004\u0012\u00020\u0010`\r2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000bj\b\u0012\u0004\u0012\u00020\u0010`\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0002J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u0013H\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/local/LocalFileConfirmFragment;", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "()V", "mOriginSelectCount", "", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "mUnSelectedUris", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "getItemCountByParentType", "list", "Lcom/bytedance/ee/android/file/picker/lib/local/FilePickerItem;", "parentType", "init", "", "initData", "initListView", "initTitleBar", "insertHead", "", "isRemoved", "", "uri", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSave", "setData", "adapter", "Lcom/bytedance/ee/android/file/picker/lib/local/LocalFilePickerAdapter;", "updateTitle", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.local.c */
public final class LocalFileConfirmFragment extends C36516a<FloatWindowParams> {

    /* renamed from: a */
    public ArrayList<Uri> f12341a = new ArrayList<>();

    /* renamed from: b */
    private int f12342b;

    /* renamed from: c */
    private CommonTitleBar f12343c;

    /* renamed from: d */
    private RecyclerView f12344d;

    /* renamed from: c */
    private final void m16955c() {
        m16956d();
        m16957e();
        m16958f();
    }

    /* renamed from: e */
    private final void m16957e() {
        CommonTitleBar commonTitleBar = this.f12343c;
        if (commonTitleBar != null) {
            commonTitleBar.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
            mo15972a();
            commonTitleBar.addAction(new C4066c(getResources().getString(R.string.Lark_Legacy_Save), R.color.primary_pri_500, this));
        }
    }

    /* renamed from: b */
    public final void mo15974b() {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("RESULT_KEY_UN_SELECTED_PATHS", this.f12341a);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(20000, intent);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* renamed from: d */
    private final void m16956d() {
        this.f12342b = 0;
        ArrayList<C4059a> arrayList = LocalFileConfirmActivity.f12300a;
        Intrinsics.checkExpressionValueIsNotNull(arrayList, "LocalFileConfirmActivity.sVideoData");
        ArrayList<C4059a> arrayList2 = LocalFileConfirmActivity.f12301b;
        Intrinsics.checkExpressionValueIsNotNull(arrayList2, "LocalFileConfirmActivity.sDocData");
        ArrayList<C4059a> arrayList3 = LocalFileConfirmActivity.f12302c;
        Intrinsics.checkExpressionValueIsNotNull(arrayList3, "LocalFileConfirmActivity.sReceiveData");
        for (C4059a aVar : CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2), (Iterable) arrayList3)) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "item");
            if (aVar.mo15947j()) {
                this.f12342b++;
            }
        }
    }

    /* renamed from: f */
    private final void m16958f() {
        RecyclerView recyclerView = this.f12344d;
        if (recyclerView != null) {
            LocalFilePickerAdapter localFilePickerAdapter = new LocalFilePickerAdapter(LocalFilePickerAdapter.Mode.CONFIRM);
            recyclerView.setAdapter(localFilePickerAdapter);
            recyclerView.setLayoutManager(new LocalFilePickerLayoutManager(getActivity()));
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
                recyclerView.addOnScrollListener(new C4065b(localFilePickerAdapter));
                mo15973a(localFilePickerAdapter);
                localFilePickerAdapter.mo15913a((LocalFilePickerAdapter.AbstractC4058b) new C4064a(localFilePickerAdapter, this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        }
    }

    /* renamed from: a */
    public final void mo15972a() {
        String str;
        int size = this.f12342b - this.f12341a.size();
        if (size <= 1) {
            TemplateUtils iVar = TemplateUtils.f12481a;
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            str = iVar.mo16116a(requireContext, R.string.Lark_Legacy_FilesSinglular, "select_count", String.valueOf(size));
        } else {
            TemplateUtils iVar2 = TemplateUtils.f12481a;
            Context requireContext2 = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext2, "requireContext()");
            str = iVar2.mo16116a(requireContext2, R.string.Lark_Legacy_FilesPlural, "select_count", String.valueOf(size));
        }
        CommonTitleBar commonTitleBar = this.f12343c;
        if (commonTitleBar != null) {
            commonTitleBar.setTitle(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/android/file/picker/lib/local/LocalFileConfirmFragment$initListView$1$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.c$b */
    public static final class C4065b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ LocalFilePickerAdapter f12347a;

        C4065b(LocalFilePickerAdapter localFilePickerAdapter) {
            this.f12347a = localFilePickerAdapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f12347a.mo15916a(false);
                this.f12347a.notifyDataSetChanged();
            } else if (i == 1) {
                this.f12347a.mo15916a(true);
            } else if (i == 2) {
                this.f12347a.mo15916a(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/android/file/picker/lib/local/LocalFileConfirmFragment$initTitleBar$1$1", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.c$c */
    public static final class C4066c extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ LocalFileConfirmFragment f12348a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            this.f12348a.mo15974b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4066c(String str, int i, LocalFileConfirmFragment cVar) {
            super(str, i);
            this.f12348a = cVar;
        }
    }

    /* renamed from: a */
    private final boolean m16954a(Uri uri) {
        return this.f12341a.contains(uri);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m16955c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/bytedance/ee/android/file/picker/lib/local/LocalFileConfirmFragment$initListView$1$2", "Lcom/bytedance/ee/android/file/picker/lib/local/LocalFilePickerAdapter$OnFileSelectListener;", "onFileCanceled", "", "item", "Lcom/bytedance/ee/android/file/picker/lib/local/FilePickerItem;", "onFileSelected", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.local.c$a */
    public static final class C4064a implements LocalFilePickerAdapter.AbstractC4058b {

        /* renamed from: a */
        final /* synthetic */ LocalFilePickerAdapter f12345a;

        /* renamed from: b */
        final /* synthetic */ LocalFileConfirmFragment f12346b;

        @Override // com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.AbstractC4058b
        /* renamed from: b */
        public void mo15932b(C4059a aVar) {
        }

        @Override // com.bytedance.ee.android.file.picker.lib.local.LocalFilePickerAdapter.AbstractC4058b
        /* renamed from: a */
        public void mo15931a(C4059a aVar) {
            if (aVar != null) {
                this.f12346b.f12341a.add(aVar.mo15940e());
                this.f12346b.mo15973a(this.f12345a);
                this.f12346b.mo15972a();
            }
        }

        C4064a(LocalFilePickerAdapter localFilePickerAdapter, LocalFileConfirmFragment cVar) {
            this.f12345a = localFilePickerAdapter;
            this.f12346b = cVar;
        }
    }

    /* renamed from: a */
    private final List<C4059a> m16953a(ArrayList<C4059a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<C4059a> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4059a next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "item");
            Uri e = next.mo15940e();
            Intrinsics.checkExpressionValueIsNotNull(e, "item.uri");
            if (!m16954a(e)) {
                int i2 = next.f12337b;
                if (i != i2) {
                    C4059a aVar = new C4059a();
                    int i3 = i2 - 1;
                    aVar.f12337b = i3;
                    aVar.f12338c = m16952a(arrayList, i3);
                    arrayList2.add(aVar);
                }
                arrayList2.add(next);
                i = i2;
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo15973a(LocalFilePickerAdapter localFilePickerAdapter) {
        ArrayList<C4059a> arrayList = LocalFileConfirmActivity.f12300a;
        Intrinsics.checkExpressionValueIsNotNull(arrayList, "LocalFileConfirmActivity.sVideoData");
        localFilePickerAdapter.mo15915a(m16953a(arrayList));
        ArrayList<C4059a> arrayList2 = LocalFileConfirmActivity.f12301b;
        Intrinsics.checkExpressionValueIsNotNull(arrayList2, "LocalFileConfirmActivity.sDocData");
        localFilePickerAdapter.mo15919b(m16953a(arrayList2));
        ArrayList<C4059a> arrayList3 = LocalFileConfirmActivity.f12302c;
        Intrinsics.checkExpressionValueIsNotNull(arrayList3, "LocalFileConfirmActivity.sReceiveData");
        localFilePickerAdapter.mo15921c(m16953a(arrayList3));
    }

    /* renamed from: a */
    private final int m16952a(ArrayList<C4059a> arrayList, int i) {
        Iterator<C4059a> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C4059a next = it.next();
            if (next.f12336a == i) {
                Intrinsics.checkExpressionValueIsNotNull(next, "item");
                Uri e = next.mo15940e();
                Intrinsics.checkExpressionValueIsNotNull(e, "item.uri");
                if (!m16954a(e)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.file_picker_activity_file_chooser_confirm, viewGroup, false);
        this.f12343c = (CommonTitleBar) inflate.findViewById(R.id.titlebar);
        this.f12344d = (RecyclerView) inflate.findViewById(R.id.rv_file);
        return inflate;
    }
}
