package com.ss.android.lark.mm.module.player.core.layer.p2317h;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.core.layer.p2317h.AbstractC46648a;
import com.ss.android.lark.mm.module.player.core.widget.AbstractC46697a;
import com.ss.android.lark.mm.module.player.core.widget.OnPlayerSpeedListener;
import com.ss.android.lark.mm.module.player.core.widget.PlayerSpeedPicker;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.h.c */
public class View$OnClickListenerC46653c extends RelativeLayout implements View.OnClickListener, AbstractC46648a.AbstractC46649a {

    /* renamed from: a */
    public AbstractC46648a.AbstractC46650b f117364a;

    /* renamed from: b */
    private PlayerSpeedPicker f117365b;

    /* renamed from: c */
    private View.OnClickListener f117366c = new View.OnClickListener() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2317h.View$OnClickListenerC46653c.View$OnClickListenerC466552 */

        public void onClick(View view) {
            Object tag = view.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                View$OnClickListenerC46653c.this.mo163861a();
                if (View$OnClickListenerC46653c.this.f117364a != null) {
                    float f = (float) intValue;
                    if (f != View$OnClickListenerC46653c.this.f117364a.mo163864a()) {
                        View$OnClickListenerC46653c.this.f117364a.mo163865a(f);
                    }
                }
            }
        }
    };

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2317h.AbstractC46648a.AbstractC46649a
    /* renamed from: a */
    public void mo163861a() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m184527b() {
        inflate(getContext(), R.layout.mm_player_layer_speed, this);
        PlayerSpeedPicker playerSpeedPicker = (PlayerSpeedPicker) findViewById(R.id.player_speed_picker);
        this.f117365b = playerSpeedPicker;
        playerSpeedPicker.setSpeedListener(new OnPlayerSpeedListener() {
            /* class com.ss.android.lark.mm.module.player.core.layer.p2317h.$$Lambda$c$HT70LNbeQ23ECUW4syEq3_SYcC4 */

            @Override // com.ss.android.lark.mm.module.player.core.widget.OnPlayerSpeedListener
            public final void onSpeed(float f) {
                View$OnClickListenerC46653c.this.m184526a((View$OnClickListenerC46653c) f);
            }
        });
        this.f117365b.setSpeedDepend(new AbstractC46697a() {
            /* class com.ss.android.lark.mm.module.player.core.layer.p2317h.View$OnClickListenerC46653c.C466541 */

            @Override // com.ss.android.lark.mm.module.player.core.widget.AbstractC46697a
            /* renamed from: a */
            public float mo163867a() {
                if (View$OnClickListenerC46653c.this.f117364a != null) {
                    return View$OnClickListenerC46653c.this.f117364a.mo163864a();
                }
                return 1.0f;
            }
        });
        this.f117365b.mo164004a();
        setVisibility(8);
        setOnClickListener(this);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2317h.AbstractC46648a.AbstractC46649a
    public void setCallback(AbstractC46648a.AbstractC46650b bVar) {
        this.f117364a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m184526a(float f) {
        AbstractC46648a.AbstractC46650b bVar = this.f117364a;
        if (bVar != null) {
            bVar.mo163865a(f);
        }
    }

    public void onClick(View view) {
        if (view == this) {
            mo163861a();
        }
    }

    public View$OnClickListenerC46653c(Context context) {
        super(context);
        m184527b();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2317h.AbstractC46648a.AbstractC46649a
    /* renamed from: a */
    public void mo163862a(List<Integer> list) {
        setVisibility(0);
        this.f117365b.mo164004a();
        AbstractC46648a.AbstractC46650b bVar = this.f117364a;
        if (bVar != null) {
            bVar.mo163864a();
        }
    }
}
