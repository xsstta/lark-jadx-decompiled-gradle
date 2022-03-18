package com.ss.android.lark.widget.photo_picker_impl.view.grid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.photo_picker_impl.base.IAnimInfoProvider;
import com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin;
import com.ss.android.lark.widget.photo_picker_impl.base.PPLog;
import com.ss.android.lark.widget.photo_picker_impl.bean.AnimInfo;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.view.base.Component;
import com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridPhotoAdapter;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001/B_\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\u0012\u001a\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u001a\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u001aH\u0016J&\u0010(\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020!H\u0016J\u001c\u0010+\u001a\u00020\u001a2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020.0-H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", "mFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridShowPlugin;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mTopToolPlugin", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$GridToolContext;", "mBottomToolPlugin", "(Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;)V", "TAG", "", "mAdapter", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridPhotoAdapter;", "mLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "mRV", "Landroidx/recyclerview/widget/RecyclerView;", "mRootView", "Landroid/view/View;", "initAdapter", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreateView", "parent", "Landroid/view/ViewGroup;", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onStop", "updateData", "append", "updateAll", "updatePhotoDirInfos", "dirInfos", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "GridToolContext", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.a */
public class GridComponent<DATA extends Photo> extends Component<DATA> {

    /* renamed from: a */
    public GridPhotoAdapter<DATA> f145762a;

    /* renamed from: b */
    public GridLayoutManager f145763b;

    /* renamed from: c */
    private final String f145764c = "PP_GridComponent";

    /* renamed from: d */
    private RecyclerView f145765d;

    /* renamed from: e */
    private View f145766e;

    /* renamed from: f */
    private final IShowPluginFactory<DATA, GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder>> f145767f;

    /* renamed from: g */
    private final IToolPlugin<List<DATA>, GridToolContext> f145768g;

    /* renamed from: h */
    private final IToolPlugin<List<DATA>, GridToolContext> f145769h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J&\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$GridToolContext;", "", "finish", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "startComponent", "to", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.a$a */
    public interface GridToolContext {
        /* renamed from: a */
        void mo199650a(TransationData dVar);

        /* renamed from: a */
        void mo199651a(KClass<? extends Component<?>> kClass, TransationData dVar);
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: b */
    public void mo199647b() {
        IToolPlugin<List<DATA>, GridToolContext> fVar = this.f145768g;
        if (fVar != null) {
            fVar.mo197632a();
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar2 = this.f145769h;
        if (fVar2 != null) {
            fVar2.mo197632a();
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: c */
    public boolean mo197708c() {
        mo199639a().mo199634a(this);
        return true;
    }

    /* renamed from: f */
    private final GridPhotoAdapter<DATA> m228537f() {
        GridPhotoAdapter<DATA> bVar = new GridPhotoAdapter<>(this.f145767f);
        bVar.mo199655a(new C58893b(this, bVar));
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$onCreateView$gridToolContext$1", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$GridToolContext;", "finish", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "startComponent", "to", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.a$d */
    public static final class C58896d implements GridToolContext {

        /* renamed from: a */
        final /* synthetic */ GridComponent f145779a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58896d(GridComponent aVar) {
            this.f145779a = aVar;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent.GridToolContext
        /* renamed from: a */
        public void mo199650a(TransationData dVar) {
            this.f145779a.mo199639a().mo199635a(this.f145779a, dVar);
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent.GridToolContext
        /* renamed from: a */
        public void mo199651a(KClass<? extends Component<?>> kClass, TransationData dVar) {
            Intrinsics.checkParameterIsNotNull(kClass, "to");
            this.f145779a.mo199646a(kClass, dVar);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public void mo199641a(TransationData dVar) {
        View view = this.f145766e;
        if (view != null) {
            view.setVisibility(0);
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar = this.f145768g;
        if (fVar != null) {
            fVar.mo197633a(dVar);
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar2 = this.f145769h;
        if (fVar2 != null) {
            fVar2.mo197633a(dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$initAdapter$1", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridPhotoAdapter$IOnItemClickListener;", "onClick", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "", "(Landroid/view/View;Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;I)V", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.a$b */
    public static final class C58893b implements GridPhotoAdapter.IOnItemClickListener<DATA> {

        /* renamed from: a */
        final /* synthetic */ GridComponent f145770a;

        /* renamed from: b */
        final /* synthetic */ GridPhotoAdapter f145771b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$initAdapter$1$onClick$transData$1$2", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IAnimInfoProvider;", "getAnimInfoById", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/AnimInfo;", "id", "", "getAnimInfoByPosition", "position", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.a$b$a */
        public static final class C58894a implements IAnimInfoProvider {

            /* renamed from: a */
            final /* synthetic */ C58893b f145772a;

            /* renamed from: b */
            final /* synthetic */ float[] f145773b;

            /* renamed from: c */
            final /* synthetic */ View f145774c;

            /* renamed from: d */
            final /* synthetic */ int f145775d;

            /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
            @Override // com.ss.android.lark.widget.photo_picker_impl.base.IAnimInfoProvider
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.ss.android.lark.widget.photo_picker_impl.bean.AnimInfo mo199563a(int r4) {
                /*
                    r3 = this;
                    com.ss.android.lark.widget.photo_picker_impl.d.b.a$b r0 = r3.f145772a
                    com.ss.android.lark.widget.photo_picker_impl.d.b.b r0 = r0.f145771b
                    java.lang.Integer r4 = r0.mo199653a(r4)
                    r0 = 0
                    if (r4 == 0) goto L_0x001e
                    java.lang.Number r4 = (java.lang.Number) r4
                    int r4 = r4.intValue()
                    com.ss.android.lark.widget.photo_picker_impl.d.b.a$b r1 = r3.f145772a
                    com.ss.android.lark.widget.photo_picker_impl.d.b.a r1 = r1.f145770a
                    androidx.recyclerview.widget.GridLayoutManager r1 = r1.f145763b
                    if (r1 == 0) goto L_0x001e
                    android.view.View r4 = r1.findViewByPosition(r4)
                    goto L_0x001f
                L_0x001e:
                    r4 = r0
                L_0x001f:
                    com.ss.android.lark.widget.photo_picker_impl.d.b.a$b r1 = r3.f145772a
                    com.ss.android.lark.widget.photo_picker_impl.d.b.a r1 = r1.f145770a
                    com.ss.android.lark.widget.photo_picker_impl.d.a.a$a r1 = r1.mo199639a()
                    float[] r1 = r1.mo199637a(r4)
                    if (r4 == 0) goto L_0x005c
                    com.ss.android.lark.widget.photo_picker_impl.b.a r0 = new com.ss.android.lark.widget.photo_picker_impl.b.a
                    r0.<init>()
                    r2 = 0
                    r2 = r1[r2]
                    java.lang.Float r2 = java.lang.Float.valueOf(r2)
                    r0.mo199581a(r2)
                    r2 = 1
                    r1 = r1[r2]
                    java.lang.Float r1 = java.lang.Float.valueOf(r1)
                    r0.mo199584b(r1)
                    int r1 = r4.getMeasuredWidth()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0.mo199582a(r1)
                    int r4 = r4.getMeasuredHeight()
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r0.mo199585b(r4)
                L_0x005c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent.C58893b.C58894a.mo199563a(int):com.ss.android.lark.widget.photo_picker_impl.b.a");
            }

            C58894a(C58893b bVar, float[] fArr, View view, int i) {
                this.f145772a = bVar;
                this.f145773b = fArr;
                this.f145774c = view;
                this.f145775d = i;
            }
        }

        C58893b(GridComponent aVar, GridPhotoAdapter bVar) {
            this.f145770a = aVar;
            this.f145771b = bVar;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.grid.GridPhotoAdapter.IOnItemClickListener
        /* renamed from: a */
        public void mo199652a(View view, DATA data, int i) {
            ArrayList<DATA> arrayList;
            boolean z;
            int i2;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(data, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            float[] a = this.f145770a.mo199639a().mo199637a(view);
            TransationData dVar = new TransationData();
            AnimInfo aVar = new AnimInfo();
            aVar.mo199581a(Float.valueOf(a[0]));
            aVar.mo199584b(Float.valueOf(a[1]));
            aVar.mo199582a(Integer.valueOf(view.getMeasuredWidth()));
            aVar.mo199585b(Integer.valueOf(view.getMeasuredHeight()));
            dVar.mo199621a("animInfo", aVar);
            GridPhotoAdapter<DATA> bVar = this.f145770a.f145762a;
            if (bVar != null) {
                arrayList = bVar.mo199654a();
            } else {
                arrayList = null;
            }
            ArrayList<DATA> arrayList2 = arrayList;
            ArrayList<DATA> arrayList3 = arrayList2;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String b = arrayList2.get(0).mo199595b();
                if (b == null || b.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2 = (ArrayList<DATA>) CollectionsKt.takeLast(arrayList2, arrayList2.size() - 1);
                    i2 = Math.max(0, i - 1);
                    dVar.mo199621a("showData", arrayList2);
                    dVar.mo199621a("showPosition", Integer.valueOf(i2));
                    dVar.mo199621a("infoProvider", new C58894a(this, a, view, i));
                    this.f145770a.mo199646a(Reflection.getOrCreateKotlinClass(LargeComponent.class), dVar);
                }
            }
            i2 = i;
            dVar.mo199621a("showData", arrayList2);
            dVar.mo199621a("showPosition", Integer.valueOf(i2));
            dVar.mo199621a("infoProvider", new C58894a(this, a, view, i));
            this.f145770a.mo199646a(Reflection.getOrCreateKotlinClass(LargeComponent.class), dVar);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public View mo199638a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pp_grid_component_view, viewGroup, false);
        Context context = viewGroup.getContext();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.f145767f.mo197709a());
        GridPhotoAdapter<DATA> f = m228537f();
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(f);
        recyclerView.addOnScrollListener(new C58895c(this, gridLayoutManager, f));
        this.f145765d = recyclerView;
        this.f145762a = f;
        this.f145763b = gridLayoutManager;
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.fl_top_container);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.fl_bottom_container);
        C58896d dVar = new C58896d(this);
        IToolPlugin<List<DATA>, GridToolContext> fVar = this.f145768g;
        if (fVar != null) {
            fVar.mo197639b(dVar);
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar2 = this.f145769h;
        if (fVar2 != null) {
            fVar2.mo197639b(dVar);
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar3 = this.f145768g;
        if (fVar3 != null) {
            Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "topContainer");
            View a = fVar3.mo197631a(viewGroup2);
            if (a != null) {
                viewGroup2.addView(a);
            }
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar4 = this.f145769h;
        if (fVar4 != null) {
            Intrinsics.checkExpressionValueIsNotNull(viewGroup3, "bottomContainer");
            View a2 = fVar4.mo197631a(viewGroup3);
            if (a2 != null) {
                viewGroup3.addView(a2);
            }
        }
        this.f145766e = inflate;
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        inflate.setVisibility(8);
        return inflate;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public void mo199645a(Map<Integer, PhotoDir> map) {
        Intrinsics.checkParameterIsNotNull(map, "dirInfos");
        IToolPlugin<List<DATA>, GridToolContext> fVar = this.f145768g;
        if (fVar != null) {
            fVar.mo197637a(map);
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar2 = this.f145769h;
        if (fVar2 != null) {
            fVar2.mo197637a(map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$onCreateView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.b.a$c */
    public static final class C58895c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ GridComponent f145776a;

        /* renamed from: b */
        final /* synthetic */ GridLayoutManager f145777b;

        /* renamed from: c */
        final /* synthetic */ GridPhotoAdapter f145778c;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i == 0 && this.f145777b.findLastVisibleItemPosition() > (this.f145778c.getItemCount() / 3) * 2) {
                this.f145776a.mo199648d();
            }
        }

        C58895c(GridComponent aVar, GridLayoutManager gridLayoutManager, GridPhotoAdapter bVar) {
            this.f145776a = aVar;
            this.f145777b = gridLayoutManager;
            this.f145778c = bVar;
        }
    }

    public GridComponent(IShowPluginFactory<DATA, GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder>> bVar, IToolPlugin<List<DATA>, GridToolContext> fVar, IToolPlugin<List<DATA>, GridToolContext> fVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "mFactory");
        this.f145767f = bVar;
        this.f145768g = fVar;
        this.f145769h = fVar2;
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public void mo199640a(int i, int i2, Intent intent) {
        IToolPlugin<List<DATA>, GridToolContext> fVar;
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        IToolPlugin<List<DATA>, GridToolContext> fVar2 = this.f145768g;
        if ((fVar2 == null || !fVar2.mo197638a(i, i2, intent)) && (fVar = this.f145769h) != null && fVar.mo197638a(i, i2, intent)) {
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component
    /* renamed from: a */
    public void mo199644a(List<DATA> list, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        PPLog.Companion aVar = PPLog.f145728b;
        String str = this.f145764c;
        aVar.mo199573b(str, " updateData size = " + list.size() + " , append = " + i);
        GridPhotoAdapter<DATA> bVar = this.f145762a;
        if (bVar != null) {
            bVar.mo199656a(list, z);
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar = this.f145768g;
        if (fVar != null) {
            fVar.mo197635a(list);
        }
        IToolPlugin<List<DATA>, GridToolContext> fVar2 = this.f145769h;
        if (fVar2 != null) {
            fVar2.mo197635a(list);
        }
    }
}
