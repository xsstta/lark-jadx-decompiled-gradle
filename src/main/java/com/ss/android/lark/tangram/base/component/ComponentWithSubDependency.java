package com.ss.android.lark.tangram.base.component;

import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.style.TCStyle;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R:\u0010\b\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\tj\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u0001`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/tangram/base/component/ComponentWithSubDependency;", "Dp", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "Lcom/ss/android/lark/tangram/base/component/ComponentWithDependency;", "dependency", "style", "Lcom/ss/android/lark/tangram/base/style/TCStyle;", "(Lcom/ss/android/lark/tangram/base/dependency/Dependency;Lcom/ss/android/lark/tangram/base/style/TCStyle;)V", "children", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getChildren", "()Ljava/util/ArrayList;", "setChildren", "(Ljava/util/ArrayList;)V", "getStyle", "()Lcom/ss/android/lark/tangram/base/style/TCStyle;", "setStyle", "(Lcom/ss/android/lark/tangram/base/style/TCStyle;)V", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.b.b */
public abstract class ComponentWithSubDependency<Dp extends Dependency> extends ComponentWithDependency<Dp> {

    /* renamed from: a */
    private ArrayList<ComponentWithDependency<Dp>> f136623a;

    /* renamed from: c */
    private TCStyle f136624c;

    /* renamed from: g */
    public final ArrayList<ComponentWithDependency<Dp>> mo188732g() {
        return this.f136623a;
    }

    @Override // com.ss.android.lark.tangram.base.component.IComponent
    /* renamed from: h */
    public TCStyle mo188733h() {
        return this.f136624c;
    }

    /* renamed from: a */
    public final void mo188731a(ArrayList<ComponentWithDependency<Dp>> arrayList) {
        this.f136623a = arrayList;
    }

    public ComponentWithSubDependency(Dp dp, TCStyle tCStyle) {
        super(dp);
        this.f136624c = tCStyle;
    }
}
