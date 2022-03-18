package com.bytedance.ee.bear.drive.biz.preview.more.menu.delete;

import android.text.TextUtils;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/more/menu/delete/DriveSpaceFileDeleteMenuPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/contract/SimpleListDataChangeCallback;", "onDelete", "", "objToken", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileDeleteMenuPlugin$onAttachToHost$1 extends SimpleListDataChangeCallback {
    final /* synthetic */ DrivePluginHost $host;
    final /* synthetic */ DriveSpaceFileDeleteMenuPlugin this$0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.menu.delete.DriveSpaceFileDeleteMenuPlugin$onAttachToHost$1$a */
    static final class RunnableC6678a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WeakReference f18227a;

        RunnableC6678a(WeakReference weakReference) {
            this.f18227a = weakReference;
        }

        public final void run() {
            DrivePluginHost aVar = (DrivePluginHost) this.f18227a.get();
            if (aVar != null) {
                C6891a.m27235c(aVar);
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
    public void onDelete(String str) {
        WeakReference weakReference = new WeakReference(this.$host);
        if (TextUtils.equals(str, C6891a.m27230a((BasePlugin<DrivePluginHost>) this.this$0))) {
            C13479a.m54764b("DriveComponent", "DriveSpaceFileDeleteMenuPlugin() deleted file, close page");
            C13742g.m55706a(new RunnableC6678a(weakReference), 100);
        }
    }

    DriveSpaceFileDeleteMenuPlugin$onAttachToHost$1(DriveSpaceFileDeleteMenuPlugin driveSpaceFileDeleteMenuPlugin, DrivePluginHost aVar) {
        this.this$0 = driveSpaceFileDeleteMenuPlugin;
        this.$host = aVar;
    }
}
