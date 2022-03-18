package com.ss.android.lark.widget.photo_picker_impl.view.base;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.widget.photo_picker_impl.bean.Photo;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import com.ss.android.lark.widget.photo_picker_impl.bean.TransationData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u000223B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001bH&J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\nH&J\u000e\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0006J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\bH\u0016J$\u0010$\u001a\u00020\n2\u0012\u0010%\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00000&2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001bJ&\u0010'\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0015H&J\u001c\u0010+\u001a\u00020\n2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020.0-H\u0016J\f\u0010/\u001a\u00020\n*\u00020\u0019H\u0004J\u0014\u00100\u001a\u00020\n*\u00020\u00192\u0006\u00101\u001a\u00020\u0017H\u0004R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", "DATA", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/Photo;", "", "()V", "mContext", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component$IComponentContext;", "mDataLoadNotify", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component$IDataLoadNotify;", "finish", "", "getComponentContext", "loadMore", "loadPre", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "onResume", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onStop", "setComponentContext", "context", "setDataLoadNotify", "notify", "start", "to", "Lkotlin/reflect/KClass;", "updateData", "", "append", "updateAll", "updatePhotoDirInfos", "dirInfos", "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "clear", "clearAndAdd", "child", "IComponentContext", "IDataLoadNotify", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.a.a */
public abstract class Component<DATA extends Photo> {

    /* renamed from: a */
    private IDataLoadNotify f145760a;

    /* renamed from: b */
    private IComponentContext f145761b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\u001e\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J&\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component$IComponentContext;", "", "finish", "", "component", "Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/widget/photo_picker_impl/bean/TransationData;", "getLocationInComponentContainer", "", "view", "Landroid/view/View;", "start", "to", "Lkotlin/reflect/KClass;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.a.a$a */
    public interface IComponentContext {
        /* renamed from: a */
        void mo199634a(Component<?> aVar);

        /* renamed from: a */
        void mo199635a(Component<?> aVar, TransationData dVar);

        /* renamed from: a */
        void mo199636a(KClass<? extends Component<?>> kClass, TransationData dVar);

        /* renamed from: a */
        float[] mo199637a(View view);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_impl/view/base/Component$IDataLoadNotify;", "", "loadMore", "", "loadPre", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker_impl.d.a.a$b */
    public interface IDataLoadNotify {
        /* renamed from: a */
        void mo199625a();

        /* renamed from: b */
        void mo199626b();
    }

    /* renamed from: a */
    public abstract View mo199638a(ViewGroup viewGroup);

    /* renamed from: a */
    public void mo199640a(int i, int i2, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    /* renamed from: a */
    public abstract void mo199641a(TransationData dVar);

    /* renamed from: a */
    public abstract void mo199644a(List<DATA> list, int i, boolean z);

    /* renamed from: a */
    public void mo199645a(Map<Integer, PhotoDir> map) {
        Intrinsics.checkParameterIsNotNull(map, "dirInfos");
    }

    /* renamed from: b */
    public abstract void mo199647b();

    /* renamed from: c */
    public abstract boolean mo197708c();

    /* renamed from: a */
    public final IComponentContext mo199639a() {
        IComponentContext aVar = this.f145761b;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        return aVar;
    }

    /* renamed from: d */
    public void mo199648d() {
        IDataLoadNotify bVar = this.f145760a;
        if (bVar != null) {
            bVar.mo199625a();
        }
    }

    /* renamed from: e */
    public void mo199649e() {
        IDataLoadNotify bVar = this.f145760a;
        if (bVar != null) {
            bVar.mo199626b();
        }
    }

    /* renamed from: a */
    public final void mo199642a(IComponentContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        this.f145761b = aVar;
    }

    /* renamed from: a */
    public void mo199643a(IDataLoadNotify bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "notify");
        this.f145760a = bVar;
    }

    /* renamed from: a */
    public final void mo199646a(KClass<? extends Component<?>> kClass, TransationData dVar) {
        Intrinsics.checkParameterIsNotNull(kClass, "to");
        IComponentContext aVar = this.f145761b;
        if (aVar != null) {
            aVar.mo199636a(kClass, dVar);
        }
    }
}
