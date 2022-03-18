package com.ss.android.lark.mine.impl.index.v2.list.base;

import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\n\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/base/ISubComponent;", "", "content", "Landroid/view/View;", "getContent", "()Landroid/view/View;", "sidebarType", "", "getSidebarType", "()I", "enable", "", "SidebarType", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface ISubComponent {

    @Target({ElementType.TYPE, ElementType.TYPE_USE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/base/ISubComponent$SidebarType;", "", "Companion", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface SidebarType {
        public static final Companion Companion = Companion.f115372a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/base/ISubComponent$SidebarType$Companion;", "", "()V", "ADMIN", "", "CONTACT_US", "FAVOURITE", "FEISHU_EVENT", "JOIN", "MANAGER_DEVICES", "MINE_INDEX", "SETTINGS", GrsBaseInfo.CountryCodeSource.UNKNOWN, "WALLET", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent$SidebarType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f115372a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    int mo160827a();

    /* renamed from: b */
    boolean mo160829b();

    /* renamed from: h */
    View mo160836h();
}
