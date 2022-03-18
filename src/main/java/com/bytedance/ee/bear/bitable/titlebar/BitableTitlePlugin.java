package com.bytedance.ee.bear.bitable.titlebar;

import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/titlebar/BitableTitlePlugin;", "Lcom/bytedance/ee/bear/document/titlebar/TitlePlugin;", "enableTemplatePreview", "", "(Z)V", "onLoadSuccess", "", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableTitlePlugin extends TitlePlugin {
    public static final Companion Companion = new Companion(null);

    public BitableTitlePlugin() {
        this(false, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/titlebar/BitableTitlePlugin$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.titlebar.BitableTitlePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.document.titlebar.TitlePlugin, com.bytedance.ee.bear.document.AbstractC5887o.AbstractC5888a
    public void onLoadSuccess() {
        super.onLoadSuccess();
        try {
            getTitleBar().mo19519b(true);
        } catch (Exception e) {
            C13479a.m54761a("BitableTitlePlugin", e);
        }
    }

    public BitableTitlePlugin(boolean z) {
        super(false, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitableTitlePlugin(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
