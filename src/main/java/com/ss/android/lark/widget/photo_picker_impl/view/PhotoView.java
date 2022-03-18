package com.ss.android.lark.widget.photo_picker_impl.view;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.widget.photo_picker_impl.base.IDependency;
import com.ss.android.lark.widget.photo_picker_impl.base.PPLog;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import com.ss.android.lark.widget.photo_picker_impl.view.base.Component;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0011J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u0011J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"J$\u0010#\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001aJ\u001a\u0010&\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020(0'R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/PhotoView;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "container", "Landroid/view/ViewGroup;", "components", "", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", "dependency", "Lcom/ss/android/lark/widget/photo_picker_impl/base/IDependency;", "(Landroid/view/ViewGroup;Ljava/util/List;Lcom/ss/android/lark/widget/photo_picker_impl/base/IDependency;)V", "mComponentStack", "Ljava/util/Stack;", "mViewComponentContainer", "Landroid/widget/FrameLayout;", "create", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onActivityResume", "onBackPressed", "", "onDestroy", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onStop", "setDataLoadNotify", "notify", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component$IDataLoadNotify;", "updatePhotoData", "append", "updateAll", "updatePhotoDirInfo", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.a */
public final class PhotoView<DATA extends Photo> {

    /* renamed from: a */
    public FrameLayout f145754a;

    /* renamed from: b */
    public final Stack<Component<?>> f145755b = new Stack<>();

    /* renamed from: c */
    public final List<Component<DATA>> f145756c;

    /* renamed from: d */
    public final IDependency f145757d;

    /* renamed from: e */
    private final ViewGroup f145758e;

    /* renamed from: c */
    public final void mo199633c() {
    }

    /* renamed from: b */
    public final boolean mo199632b() {
        if (!this.f145755b.empty()) {
            return this.f145755b.peek().mo197708c();
        }
        PPLog.f145728b.mo199574c("PhotoView", "ComponentStack is empty when onBackPressed");
        return false;
    }

    /* renamed from: a */
    public final void mo199627a() {
        FrameLayout frameLayout = new FrameLayout(this.f145758e.getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        this.f145758e.addView(frameLayout);
        this.f145754a = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwNpe();
        }
        C58892a aVar = new C58892a(this);
        for (T t : this.f145756c) {
            t.mo199642a(aVar);
            frameLayout.addView(t.mo199638a(frameLayout));
        }
        aVar.mo199636a(Reflection.getOrCreateKotlinClass(this.f145756c.get(0).getClass()), new TransationData());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u001e\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002J&\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/widget/photo_picker_impl/view/PhotoView$create$componentContext$1", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component$IComponentContext;", "finish", "", "component", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "getLocationInComponentContainer", "", "view", "Landroid/view/View;", "getLocationInTargetView", "target", "Landroid/view/ViewGroup;", "res", "start", "to", "Lkotlin/reflect/KClass;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.a$a */
    public static final class C58892a implements Component.IComponentContext {

        /* renamed from: a */
        final /* synthetic */ PhotoView f145759a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58892a(PhotoView aVar) {
            this.f145759a = aVar;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component.IComponentContext
        /* renamed from: a */
        public void mo199634a(Component<?> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "component");
            mo199635a(aVar, (TransationData) null);
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component.IComponentContext
        /* renamed from: a */
        public float[] mo199637a(View view) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            if (view == null) {
                return fArr;
            }
            FrameLayout frameLayout = this.f145759a.f145754a;
            if (frameLayout == null) {
                Intrinsics.throwNpe();
            }
            m228510a(view, frameLayout, fArr);
            return fArr;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component.IComponentContext
        /* renamed from: a */
        public void mo199636a(KClass<? extends Component<?>> kClass, TransationData dVar) {
            Intrinsics.checkParameterIsNotNull(kClass, "to");
            for (Component<DATA> aVar : this.f145759a.f145756c) {
                if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(aVar.getClass()), kClass)) {
                    Component<?> aVar2 = null;
                    if (!this.f145759a.f145755b.isEmpty()) {
                        aVar2 = this.f145759a.f145755b.peek();
                    }
                    this.f145759a.f145755b.push(aVar);
                    aVar.mo199641a(dVar);
                    if (aVar2 != null) {
                        aVar2.mo199647b();
                        return;
                    }
                    return;
                }
            }
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.view.base.Component.IComponentContext
        /* renamed from: a */
        public void mo199635a(Component<?> aVar, TransationData dVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "component");
            if (this.f145759a.f145755b.empty()) {
                PPLog.f145728b.mo199574c("PhotoView", "Component stack is Empty when finish " + aVar);
            } else if (Intrinsics.areEqual(this.f145759a.f145755b.peek(), aVar)) {
                this.f145759a.f145755b.pop().mo199647b();
                if (!this.f145759a.f145755b.empty()) {
                    this.f145759a.f145755b.peek().mo199641a((TransationData) null);
                } else {
                    this.f145759a.f145757d.mo197718a(dVar);
                }
            } else {
                Component<?> aVar2 = null;
                Iterator<Component<?>> it = this.f145759a.f145755b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Component<?> next = it.next();
                    if (Intrinsics.areEqual(next, aVar)) {
                        aVar2 = next;
                        break;
                    }
                }
                if (aVar2 != null) {
                    this.f145759a.f145755b.remove(aVar2);
                }
            }
        }

        /* renamed from: a */
        private final void m228510a(View view, ViewGroup viewGroup, float[] fArr) {
            if (!Intrinsics.areEqual(view, viewGroup)) {
                fArr[0] = fArr[0] + view.getX();
                fArr[1] = fArr[1] + view.getY();
                ViewParent parent = view.getParent();
                if (parent != null) {
                    m228510a((View) parent, viewGroup, fArr);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
        }
    }

    /* renamed from: a */
    public final void mo199629a(Component.IDataLoadNotify bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "notify");
        Iterator<T> it = this.f145756c.iterator();
        while (it.hasNext()) {
            it.next().mo199643a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo199631a(Map<Integer, PhotoDir> map) {
        Intrinsics.checkParameterIsNotNull(map, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Iterator<T> it = this.f145756c.iterator();
        while (it.hasNext()) {
            it.next().mo199645a(map);
        }
    }

    public PhotoView(ViewGroup viewGroup, List<Component<DATA>> list, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(list, "components");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f145758e = viewGroup;
        this.f145756c = list;
        this.f145757d = bVar;
    }

    /* renamed from: a */
    public void mo199628a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        for (Component<DATA> aVar : this.f145756c) {
            aVar.mo199640a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo199630a(List<DATA> list, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Iterator<T> it = this.f145756c.iterator();
        while (it.hasNext()) {
            it.next().mo199644a(list, i, z);
        }
    }
}
