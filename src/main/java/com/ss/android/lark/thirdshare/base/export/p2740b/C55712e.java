package com.ss.android.lark.thirdshare.base.export.p2740b;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55719c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.thirdshare.base.export.b.e */
public class C55712e extends AbstractC55713a<C55712e> {

    /* renamed from: a */
    private final ShareEntity f137410a;

    /* renamed from: b */
    private final ShareActionType.ShareItemInfo f137411b;

    /* renamed from: c */
    private final IShareDialog f137412c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m215772a(C55719c cVar, View view) {
        this.f137411b.mListener.onClickReal(cVar.itemView.getContext(), this.f137410a);
        this.f137412c.setClickItem(true);
        this.f137412c.mo189824d();
    }

    /* renamed from: a */
    public static List<C55712e> m215771a(ShareEntity shareEntity, IShareDialog cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<ShareActionType> it = shareEntity.getShareActionTypes().iterator();
        while (it.hasNext()) {
            ShareActionType.ShareItemInfo shareItemInfo = it.next().getShareItemInfo();
            if (shareItemInfo != null) {
                arrayList.add(new C55712e(shareEntity, shareItemInfo, cVar));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a
    /* renamed from: a */
    public void mo130630a(C55719c cVar, int i) {
        SquircleImageView squircleImageView = (SquircleImageView) cVar.mo189863a(R.id.tsShareIconIv);
        TextView textView = (TextView) cVar.mo189863a(R.id.tsShareNameTv);
        squircleImageView.setImageResource(this.f137411b.mIconId);
        if (this.f137411b.shouldApplyTint) {
            squircleImageView.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(squircleImageView.getContext(), R.color.icon_n1)));
        } else {
            squircleImageView.setImageTintList(null);
        }
        textView.setText(this.f137411b.getName());
        cVar.itemView.setOnClickListener(new View.OnClickListener(cVar) {
            /* class com.ss.android.lark.thirdshare.base.export.p2740b.$$Lambda$e$Qu7psnLWFnQaWuKwh04FTa6_w */
            public final /* synthetic */ C55719c f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C55712e.this.m215772a((C55712e) this.f$1, (C55719c) view);
            }
        });
    }

    public C55712e(ShareEntity shareEntity, ShareActionType.ShareItemInfo shareItemInfo, IShareDialog cVar) {
        super(R.layout.ts_share_dialog_item);
        this.f137410a = shareEntity;
        this.f137411b = shareItemInfo;
        this.f137412c = cVar;
    }
}
