package com.ss.android.lark.widget.photo_picker_impl;

import android.content.Intent;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker_impl.base.IDependency;
import com.ss.android.lark.widget.photo_picker_impl.base.IToolPlugin;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.model.IPhotoDataFactory;
import com.ss.android.lark.widget.photo_picker_impl.model.IPhotoModel;
import com.ss.android.lark.widget.photo_picker_impl.model.PhotoModel;
import com.ss.android.lark.widget.photo_picker_impl.presenter.PhotoPresenter;
import com.ss.android.lark.widget.photo_picker_impl.view.PhotoView;
import com.ss.android.lark.widget.photo_picker_impl.view.base.Component;
import com.ss.android.lark.widget.photo_picker_impl.view.base.IShowPluginFactory;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridComponent;
import com.ss.android.lark.widget.photo_picker_impl.view.grid.GridShowPlugin;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeComponent;
import com.ss.android.lark.widget.photo_picker_impl.view.large.LargeShowPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010%\u001a\u00020\u0006J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010&\u001a\u00020\bJ\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010'\u001a\u00020\nJ&\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0002J&\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u000e0\fJ.\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002 \u0010+\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00120\u00110\u0010J&\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010,\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u000e0\fJ&\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\fJ&\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0010J&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\fJ\u001e\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u000201J\u0006\u0010:\u001a\u000201J\u000e\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u000201J\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010C\u001a\u00020\u001eJ\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000#R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 X.¢\u0006\u0002\n\u0000R*\u0010!\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0\"j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#`$X\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/PhotoPickerInit;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "()V", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "mContainer", "Landroid/widget/FrameLayout;", "mDependency", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IDependency;", "mGridPanelBottomTool", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IToolPlugin;", "", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridComponent$GridToolContext;", "mGridPanelShowPluginFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/IShowPluginFactory;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/grid/GridShowPlugin;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mGridPanelTopTool", "mLargePanelBottomTool", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeComponent$LargeToolContext;", "mLargePanelShowPluginFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/view/large/LargeShowPlugin;", "mLargePanelTopTool", "mPhotoDataFactory", "Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoDataFactory;", "mPhotoModel", "Lcom/ss/android/lark/widget/photo_picker_impl/model/IPhotoModel;", "mPickerParams", "Lcom/ss/android/lark/widget/photo_picker/PickerParams;", "mPresenter", "Lcom/ss/android/lark/widget/photo_picker_impl/presenter/PhotoPresenter;", "mViewComponentList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", "Lkotlin/collections/ArrayList;", "activity", "container", "dependency", "getView", "Lcom/ss/android/lark/widget/photo_picker_impl/view/PhotoView;", "gridPanelBottomTool", "gridPanelShowPluginFactory", "gridPanelTopTool", "largePanelBottomTool", "largePanelShowPluginFactory", "largePanelTopTool", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onDestroy", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onStop", "photoDataFactory", "photoModel", "model", "setParams", "params", "start", "viewComponent", "component", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.a */
public final class PhotoPickerInit<DATA extends Photo> {

    /* renamed from: a */
    private FragmentActivity f145712a;

    /* renamed from: b */
    private FrameLayout f145713b;

    /* renamed from: c */
    private IDependency f145714c;

    /* renamed from: d */
    private PickerParams f145715d = PickerParams.f144865a.mo198927a(C58887a.INSTANCE);

    /* renamed from: e */
    private IPhotoDataFactory<DATA> f145716e;

    /* renamed from: f */
    private IPhotoModel<DATA> f145717f;

    /* renamed from: g */
    private final ArrayList<Component<DATA>> f145718g = new ArrayList<>();

    /* renamed from: h */
    private IShowPluginFactory<DATA, GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder>> f145719h;

    /* renamed from: i */
    private IToolPlugin<List<DATA>, GridComponent.GridToolContext> f145720i;

    /* renamed from: j */
    private IToolPlugin<List<DATA>, GridComponent.GridToolContext> f145721j;

    /* renamed from: k */
    private IShowPluginFactory<DATA, LargeShowPlugin<DATA>> f145722k;

    /* renamed from: l */
    private IToolPlugin<DATA, LargeComponent.LargeToolContext<DATA>> f145723l;

    /* renamed from: m */
    private IToolPlugin<DATA, LargeComponent.LargeToolContext<DATA>> f145724m;

    /* renamed from: n */
    private PhotoPresenter<DATA> f145725n;

    /* renamed from: b */
    public final boolean mo199560b() {
        PhotoPresenter<DATA> aVar = this.f145725n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        return aVar.mo199624b();
    }

    /* renamed from: c */
    public final PhotoPickerInit<DATA> mo199561c() {
        FragmentActivity fragmentActivity = this.f145712a;
        if (fragmentActivity != null) {
            FrameLayout frameLayout = this.f145713b;
            if (frameLayout != null) {
                IDependency bVar = this.f145714c;
                if (bVar != null) {
                    PhotoModel fVar = this.f145717f;
                    if (fVar == null) {
                        IPhotoDataFactory<DATA> bVar2 = this.f145716e;
                        if (bVar2 != null) {
                            fVar = new PhotoModel(fragmentActivity, this.f145715d, bVar2);
                        } else {
                            throw new IllegalArgumentException("PhotoDataFactory must not be null");
                        }
                    }
                    this.f145725n = new PhotoPresenter<>(m228418a(fragmentActivity, frameLayout, bVar), fVar);
                    return this;
                }
                throw new IllegalArgumentException("mDependency must not be null");
            }
            throw new IllegalArgumentException("container must not be null");
        }
        throw new IllegalArgumentException("Activity must not be null");
    }

    /* renamed from: a */
    public final void mo199558a() {
        PhotoPresenter<DATA> aVar = this.f145725n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        aVar.mo199622a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.a$a */
    static final class C58887a extends Lambda implements Function1<PickerParams.Builder, Unit> {
        public static final C58887a INSTANCE = new C58887a();

        C58887a() {
            super(1);
        }

        public final void invoke(PickerParams.Builder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PickerParams.Builder aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final PhotoPickerInit<DATA> mo199552a(FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(frameLayout, "container");
        this.f145713b = frameLayout;
        return this;
    }

    /* renamed from: a */
    public final PhotoPickerInit<DATA> mo199553a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        this.f145712a = fragmentActivity;
        return this;
    }

    /* renamed from: a */
    public final PhotoPickerInit<DATA> mo199554a(PickerParams gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "params");
        this.f145715d = gVar;
        return this;
    }

    /* renamed from: a */
    public final PhotoPickerInit<DATA> mo199555a(IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f145714c = bVar;
        return this;
    }

    /* renamed from: a */
    public final PhotoPickerInit<DATA> mo199556a(Component<DATA> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "component");
        this.f145718g.add(aVar);
        return this;
    }

    /* renamed from: a */
    public final PhotoPickerInit<DATA> mo199557a(IPhotoModel<DATA> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "model");
        this.f145717f = cVar;
        return this;
    }

    /* renamed from: a */
    private final PhotoView<DATA> m228418a(FragmentActivity fragmentActivity, FrameLayout frameLayout, IDependency bVar) {
        if (!this.f145718g.isEmpty()) {
            return new PhotoView<>(frameLayout, this.f145718g, bVar);
        }
        ArrayList arrayList = new ArrayList();
        IShowPluginFactory<DATA, GridShowPlugin<DATA, ? extends RecyclerView.ViewHolder>> bVar2 = this.f145719h;
        if (bVar2 == null) {
            Intrinsics.throwNpe();
        }
        IToolPlugin<List<DATA>, GridComponent.GridToolContext> fVar = this.f145721j;
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        IToolPlugin<List<DATA>, GridComponent.GridToolContext> fVar2 = this.f145720i;
        if (fVar2 == null) {
            Intrinsics.throwNpe();
        }
        GridComponent aVar = new GridComponent(bVar2, fVar, fVar2);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
        IShowPluginFactory<DATA, LargeShowPlugin<DATA>> bVar3 = this.f145722k;
        if (bVar3 == null) {
            Intrinsics.throwNpe();
        }
        IToolPlugin<DATA, LargeComponent.LargeToolContext<DATA>> fVar3 = this.f145723l;
        if (fVar3 == null) {
            Intrinsics.throwNpe();
        }
        IToolPlugin<DATA, LargeComponent.LargeToolContext<DATA>> fVar4 = this.f145724m;
        if (fVar4 == null) {
            Intrinsics.throwNpe();
        }
        LargeComponent aVar2 = new LargeComponent(supportFragmentManager, bVar3, fVar3, fVar4);
        arrayList.add(aVar);
        arrayList.add(aVar2);
        return new PhotoView<>(frameLayout, arrayList, bVar);
    }

    /* renamed from: a */
    public final void mo199559a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        PhotoPresenter<DATA> aVar = this.f145725n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        aVar.mo199623a(i, i2, intent);
    }
}
