package com.ss.android.lark.inno.player.live.layer.unmute;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/unmute/LiveUnmuteView;", "Lcom/ss/android/lark/inno/player/layer/BaseLayerView;", "Lcom/ss/android/lark/inno/player/live/layer/unmute/ILiveUnmuteViewDepend;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.live.a.g.c */
public final class LiveUnmuteView extends AbstractC39016b<ILiveUnmuteViewDepend> {

    /* renamed from: a */
    private HashMap f100299a;

    /* renamed from: a */
    public View mo142838a(int i) {
        if (this.f100299a == null) {
            this.f100299a = new HashMap();
        }
        View view = (View) this.f100299a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100299a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveUnmuteView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.inno_live_layer_unmute, (ViewGroup) this, true);
        ((TextView) mo142838a(R.id.live_click_to_unmute)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.lark.inno.player.live.layer.unmute.LiveUnmuteView.View$OnClickListenerC390611 */

            /* renamed from: a */
            final /* synthetic */ LiveUnmuteView f100300a;

            {
                this.f100300a = r1;
            }

            public final void onClick(View view) {
                ((ILiveUnmuteViewDepend) this.f100300a.getDepend()).mo142836a(false);
                if (!((ILiveUnmuteViewDepend) this.f100300a.getDepend()).mo142837a()) {
                    this.f100300a.mo142588b();
                }
            }
        });
    }
}
