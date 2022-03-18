package com.ss.android.lark.tangram.base.component;

import com.ss.android.lark.tangram.base.dependency.Dependency;
import com.ss.android.lark.tangram.base.render.DefaultContextIdCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 \u0014*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0014B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/tangram/base/component/ComponentWithDependency;", "Dp", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "Lcom/ss/android/lark/tangram/base/component/IComponent;", "dependency", "(Lcom/ss/android/lark/tangram/base/dependency/Dependency;)V", "getDependency", "()Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "setDependency", "Lcom/ss/android/lark/tangram/base/dependency/Dependency;", "uniqueId", "", "getUniqueId", "()Ljava/lang/String;", "setUniqueId", "(Ljava/lang/String;)V", "value", "viewTypeIdentity", "getViewTypeIdentity", "setViewTypeIdentity", "Companion", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.tangram.base.b.a */
public abstract class ComponentWithDependency<Dp extends Dependency> implements IComponent {

    /* renamed from: b */
    public static final Companion f136620b = new Companion(null);

    /* renamed from: a */
    private String f136621a = DefaultContextIdCreator.f136648a.mo188788a();

    /* renamed from: c */
    private Dp f136622c;

    /* renamed from: b */
    public String mo126266b() {
        return "android.view.View";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tangram/base/component/ComponentWithDependency$Companion;", "", "()V", "DEFAULT_VIEW_TYPE_IDENTITY", "", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.tangram.base.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.tangram.base.component.IComponent
    /* renamed from: e */
    public String mo188729e() {
        return this.f136621a;
    }

    /* renamed from: f */
    public final Dp mo188730f() {
        return this.f136622c;
    }

    public ComponentWithDependency(Dp dp) {
        this.f136622c = dp;
    }
}
