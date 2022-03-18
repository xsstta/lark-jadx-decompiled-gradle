package com.ss.android.lark.thirdshare.base.export.p2740b;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55718b;
import com.ss.android.lark.utils.ViewUtils;
import java.util.List;

/* renamed from: com.ss.android.lark.thirdshare.base.export.b.d */
public final class C55708d implements IShareDialog {

    /* renamed from: a */
    public boolean f137403a;

    /* renamed from: b */
    public final ShareEntity f137404b;

    /* renamed from: c */
    private final DialogC25637f f137405c;

    @Override // com.ss.android.lark.thirdshare.base.export.dialog.IShareDialog
    /* renamed from: d */
    public void mo189824d() {
        this.f137405c.dismiss();
    }

    @Override // com.ss.android.lark.thirdshare.base.export.dialog.IShareDialog
    public void setClickItem(boolean z) {
        this.f137403a = z;
    }

    private C55708d(Context context, ShareEntity shareEntity) {
        this.f137404b = shareEntity;
        this.f137405c = new C25639g(context).mo89222a(1.0f).mo89257p(80).mo89261t(0).mo89260s(R.layout.ts_share_dialog).mo89227a(new DialogInterface.OnDismissListener() {
            /* class com.ss.android.lark.thirdshare.base.export.p2740b.C55708d.DialogInterface$OnDismissListenerC557102 */

            public void onDismiss(DialogInterface dialogInterface) {
                if (C55708d.this.f137404b.getCallback() != null) {
                    C55708d.this.f137404b.getCallback().onDismiss(C55708d.this.f137403a);
                }
            }
        }).mo89230a(new C25639g.AbstractC25641b() {
            /* class com.ss.android.lark.thirdshare.base.export.p2740b.C55708d.C557091 */

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: b */
            public void mo89274b(DialogC25637f fVar) {
                super.mo89274b(fVar);
                C55708d dVar = C55708d.this;
                dVar.mo189840a(fVar, C55712e.m215771a(dVar.f137404b, C55708d.this));
            }
        }).mo89233b();
    }

    /* renamed from: a */
    public static void m215767a(Context context, ShareEntity shareEntity) {
        if (ViewUtils.m224153b(context)) {
            if (!(shareEntity == null || shareEntity.getCallback() == null)) {
                shareEntity.getCallback().onShow();
            }
            new C55708d(context, shareEntity).f137405c.show();
        }
    }

    /* renamed from: a */
    public void mo189840a(final DialogC25637f fVar, List<C55712e> list) {
        RecyclerView recyclerView = (RecyclerView) fVar.findViewById(R.id.tsShareRv);
        C55718b bVar = new C55718b();
        bVar.mo189862a(list);
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(fVar.getContext(), 0, false));
        ((TextView) fVar.findViewById(R.id.tsShareCancelTv)).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.thirdshare.base.export.p2740b.C55708d.View$OnClickListenerC557113 */

            public void onClick(View view) {
                fVar.dismiss();
                if (C55708d.this.f137404b.getCallback() != null) {
                    C55708d.this.f137404b.getCallback().onFailed(ShareActionType.UNKNOWN, OnShareCallback.CANCELED);
                }
            }
        });
    }
}
