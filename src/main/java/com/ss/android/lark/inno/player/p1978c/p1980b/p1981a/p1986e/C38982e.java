package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.p1978c.p1988c.C38992a;
import com.ss.android.lark.inno.player.widget.C39087c;
import com.ss.android.lark.inno.player.widget.C39088d;
import com.ss.android.lark.inno.player.widget.PlayerOptionBottomDialog;
import com.ss.android.lark.inno.player.widget.VcSeekBar;
import com.ss.android.lark.inno.player.widget.VcTitleBar;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.inno.utils.VcTimeUtils;
import com.ss.android.lark.mm.module.player.core.layer.p2321l.C46681a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.e.e */
public class C38982e extends AbstractC38973a<AbstractC38974b> {

    /* renamed from: a */
    List<String> f100150a = Arrays.asList(C45851c.m181647a(R.string.tools_chaoqing), C45851c.m181647a(R.string.tools_gaoqing), C45851c.m181647a(R.string.tools_biaoqing));

    /* renamed from: b */
    List<Integer> f100151b = Arrays.asList(1, 2, 3);

    /* renamed from: c */
    List<String> f100152c = Arrays.asList("3.0X", "2.0X", "1.5X", "1.25X", "1.0X", "0.75X", "0.5X");

    /* renamed from: d */
    List<Float> f100153d = Arrays.asList(Float.valueOf(3.0f), Float.valueOf(2.0f), Float.valueOf(1.5f), Float.valueOf(1.25f), Float.valueOf(1.0f), Float.valueOf(0.75f), Float.valueOf(0.5f));

    /* renamed from: e */
    private C38984a f100154e;

    /* renamed from: f */
    private C39088d f100155f;

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: c */
    public void mo142632c() {
        mo142587a();
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        this.f100155f.mo142958a();
    }

    /* renamed from: d */
    public void mo142658d() {
        ((AbstractC38974b) getDepend()).mo142647k();
        this.f100154e.f100163g.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    public int getSelectedResolutionIndex() {
        if (((AbstractC38974b) getDepend()).mo142641e() == null) {
            return 0;
        }
        int i = ((AbstractC38974b) getDepend()).mo142641e().f100175b;
        if (this.f100151b.contains(Integer.valueOf(i))) {
            return this.f100151b.indexOf(Integer.valueOf(i));
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getSelectedSpeedIndex() {
        float d = ((AbstractC38974b) getDepend()).mo142640d();
        if (this.f100153d.contains(Float.valueOf(d))) {
            return this.f100153d.indexOf(Float.valueOf(d));
        }
        return 0;
    }

    /* renamed from: e */
    private void m153831e() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_toolbar, (ViewGroup) this, true);
        C38984a aVar = new C38984a(this);
        this.f100154e = aVar;
        C46681a.m184654a(aVar.f100157a, C57582a.m223600a(10));
        this.f100154e.f100157a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$e$Bzz6hsswOqCsk5nQWgKFyVSD10 */

            public final void onClick(View view) {
                C38982e.m270579lambda$Bzz6hsswOqCsk5nQWgKFyVSD10(C38982e.this, view);
            }
        });
        this.f100154e.f100160d.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_expand_outlined, ContextCompat.getColor(getContext(), R.color.static_white)));
        this.f100154e.f100160d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$e$2aw5ewarmdKPzhtP4xOxBbg84 */

            public final void onClick(View view) {
                C38982e.m270578lambda$2aw5ewarmdKPzhtP4xOxBbg84(C38982e.this, view);
            }
        });
        this.f100154e.f100161e.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38982e.C389831 */

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                ((AbstractC38974b) C38982e.this.getDepend()).mo142636a(seekBar.getProgress());
                C38982e.this.mo142658d();
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C38982e.this.mo142628a(i, seekBar.getMax(), true);
                C38982e.this.mo142657a(i, seekBar.getMax());
            }
        });
        this.f100154e.f100164h.setTitleText(ResString.f118656a.mo165504a(R.string.mm_tools_long_text2));
        this.f100154e.f100162f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$e$PcSJ1Yt8wOKxYhw4Il5kc8L2P0 */

            public final void onClick(View view) {
                C38982e.m270580lambda$PcSJ1Yt8wOKxYhw4Il5kc8L2P0(C38982e.this, view);
            }
        });
        this.f100154e.f100165i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$e$8bUr97lE806tLTyo8q37J346PrQ */

            public final void onClick(View view) {
                C38982e.lambda$8bUr97lE806tLTyo8q37J346PrQ(C38982e.this, view);
            }
        });
        this.f100155f = new C39088d(this);
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: c */
    public void mo142633c(boolean z) {
        this.f100155f.mo142959a(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m153829c(View view) {
        ((AbstractC38974b) getDepend()).mo142642f();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142627a(int i) {
        this.f100154e.f100165i.setText(C39093c.m154344a(i));
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: b */
    public void mo142631b(boolean z) {
        this.f100155f.mo142962b(z);
    }

    /* renamed from: c */
    private C38992a.C38994a m153828c(int i) {
        return new C38992a.C38994a(((AbstractC38974b) getDepend()).mo142641e().mo142683b(i).f100176a, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153823a(View view) {
        if (getContext() instanceof FragmentActivity) {
            C39087c.m154330a(C45851c.m181647a(R.string.tools_xuanzeqingxidu), this.f100150a, Integer.valueOf(getSelectedResolutionIndex()), new PlayerOptionBottomDialog.Builder.OnItemClickListener() {
                /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$e$CyJvbPtzIEJtX6Y4KAUaPpEw0y8 */

                @Override // com.ss.android.lark.inno.player.widget.PlayerOptionBottomDialog.Builder.OnItemClickListener
                public final void onClick(DialogInterface$OnCancelListenerC1021b bVar, int i) {
                    C38982e.lambda$CyJvbPtzIEJtX6Y4KAUaPpEw0y8(C38982e.this, bVar, i);
                }
            }).mo5511a(((FragmentActivity) getContext()).getSupportFragmentManager(), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inno.player.c.b.a.e.e$a */
    public static class C38984a {

        /* renamed from: a */
        public ImageView f100157a;

        /* renamed from: b */
        public TextView f100158b;

        /* renamed from: c */
        public TextView f100159c;

        /* renamed from: d */
        public ImageView f100160d;

        /* renamed from: e */
        public VcSeekBar f100161e;

        /* renamed from: f */
        public TextView f100162f;

        /* renamed from: g */
        public TextView f100163g;

        /* renamed from: h */
        public VcTitleBar f100164h;

        /* renamed from: i */
        public TextView f100165i;

        public C38984a(View view) {
            this.f100157a = (ImageView) view.findViewById(R.id.video_play);
            this.f100158b = (TextView) view.findViewById(R.id.video_position);
            this.f100159c = (TextView) view.findViewById(R.id.video_duration);
            this.f100160d = (ImageView) view.findViewById(R.id.video_expand);
            this.f100161e = (VcSeekBar) view.findViewById(R.id.video_seekbar);
            this.f100162f = (TextView) view.findViewById(R.id.video_speed);
            this.f100163g = (TextView) view.findViewById(R.id.video_progress_tip);
            this.f100164h = (VcTitleBar) view.findViewById(R.id.video_title_bar);
            this.f100165i = (TextView) view.findViewById(R.id.video_resolution);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m153826b(View view) {
        if (getContext() instanceof FragmentActivity) {
            C39087c.m154330a(getContext().getString(R.string.tools_beisushezhi), this.f100152c, Integer.valueOf(getSelectedSpeedIndex()), new PlayerOptionBottomDialog.Builder.OnItemClickListener() {
                /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$e$1yQPuo1LzMn_KuumDNWXlzn9bDk */

                @Override // com.ss.android.lark.inno.player.widget.PlayerOptionBottomDialog.Builder.OnItemClickListener
                public final void onClick(DialogInterface$OnCancelListenerC1021b bVar, int i) {
                    C38982e.lambda$1yQPuo1LzMn_KuumDNWXlzn9bDk(C38982e.this, bVar, i);
                }
            }).mo5511a(((FragmentActivity) getContext()).getSupportFragmentManager(), "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m153830d(View view) {
        if (((AbstractC38974b) getDepend()).mo142639c()) {
            ((AbstractC38974b) getDepend()).mo142638b();
            this.f100154e.f100157a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_play_filled, ContextCompat.getColor(getContext(), R.color.static_white)));
            return;
        }
        ((AbstractC38974b) getDepend()).mo142634a();
        this.f100154e.f100157a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_pause_livestream_outlined, ContextCompat.getColor(getContext(), R.color.static_white)));
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142626a(float f) {
        if (((double) f) == 1.0d) {
            this.f100154e.f100162f.setText(R.string.tools_beisu);
        } else if (this.f100153d.contains(Float.valueOf(f))) {
            TextView textView = this.f100154e.f100162f;
            textView.setText(f + "X");
        }
    }

    public C38982e(Context context) {
        super(context);
        m153831e();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: b */
    public void mo142630b(int i) {
        C45855f.m181663b("LiveVideoToolbarLayerView", "[updateBufferPosition]bufferPosition: " + i);
        this.f100154e.f100161e.setSecondaryProgress(i);
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142629a(boolean z) {
        if (z) {
            this.f100154e.f100157a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_pause_livestream_outlined, ContextCompat.getColor(getContext(), R.color.static_white)));
        } else {
            this.f100154e.f100157a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_play_filled, ContextCompat.getColor(getContext(), R.color.static_white)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153824a(DialogInterface$OnCancelListenerC1021b bVar, int i) {
        ((AbstractC38974b) getDepend()).mo142637a(m153828c(this.f100151b.get(i).intValue()));
        bVar.mo5513b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m153827b(DialogInterface$OnCancelListenerC1021b bVar, int i) {
        ((AbstractC38974b) getDepend()).mo142635a(this.f100153d.get(i).floatValue());
        bVar.mo5513b();
    }

    /* renamed from: b */
    private String m153825b(int i, int i2) {
        return VcTimeUtils.m154338a(VcTimeUtils.Scene.Video, (long) i) + "/" + VcTimeUtils.m154338a(VcTimeUtils.Scene.Video, (long) i2);
    }

    /* renamed from: a */
    public void mo142657a(int i, int i2) {
        if (this.f100154e.f100161e.f100329a) {
            ((AbstractC38974b) getDepend()).mo142646j();
            this.f100154e.f100163g.setVisibility(0);
            this.f100154e.f100163g.setText(m153825b(i, i2));
        }
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142628a(int i, int i2, boolean z) {
        if (!this.f100154e.f100161e.f100329a || z) {
            this.f100154e.f100161e.setProgress(i);
            this.f100154e.f100161e.setMax(i2);
            this.f100154e.f100158b.setText(VcTimeUtils.m154338a(VcTimeUtils.Scene.Video, (long) i));
            TextView textView = this.f100154e.f100159c;
            textView.setText("/" + VcTimeUtils.m154338a(VcTimeUtils.Scene.Video, (long) i2));
        }
    }
}
