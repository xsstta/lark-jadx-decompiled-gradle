package com.bytedance.ee.bear.lynx.api;

import android.view.ViewGroup;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0016\u0017J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J<\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H'J>\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0014\u001a\u00020\u00052\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H'J\u001c\u0010\u0015\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0011H&¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView;", "", "destroy", "", "getContainerId", "", "getLynxBid", "getLynxContainerEventListener", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView$LynxViewEventListener;", "setLynxContainerEventListener", "lst", "showCardAtContainer", "viewContainer", "Landroid/view/ViewGroup;", "viewType", "", "templateData", "", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "templateUrl", "updateContent", "LynxViewEventListener", "ViewType", "lynx-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface CCMLynxCardView {

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView$ViewType;", "", "Companion", "lynx-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    public @interface ViewType {
        public static final Companion Companion = Companion.f23738a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView$ViewType$Companion;", "", "()V", "BANNER", "", "lynx-api_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.api.CCMLynxCardView$ViewType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f23738a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView$LynxViewEventListener;", "", "closeContainer", "", "onClick", "params", "", "", "onShow", "lynx-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.api.CCMLynxCardView$a */
    public interface LynxViewEventListener {
        /* renamed from: a */
        void mo16942a();

        /* renamed from: a */
        void mo16943a(Map<String, String> map);

        /* renamed from: b */
        void mo16944b();
    }

    /* renamed from: a */
    LynxViewEventListener mo33874a();

    /* renamed from: a */
    void mo33875a(ViewGroup viewGroup, int i, Map<String, ? extends Object> map, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    void mo33876a(ViewGroup viewGroup, String str, Map<String, ? extends Object> map, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    void mo33877a(LynxViewEventListener aVar);

    /* renamed from: b */
    void mo33878b();
}
