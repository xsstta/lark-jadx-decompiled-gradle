package com.ss.android.openbusiness.p3003a;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.openbusiness.AbstractC59446a;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.activity.C59478b;
import com.ss.android.openbusiness.data.C59566a;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.ui.C59603c;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.openbusiness.a.d */
public class C59457d extends AbstractC59449c {

    /* renamed from: j */
    public final OpbScene f147613j;

    /* renamed from: k */
    private C59460e f147614k = new C59460e();

    /* renamed from: l */
    private final ItemTouchHelper f147615l;

    /* renamed from: m */
    private final String f147616m;

    /* renamed from: n */
    private int f147617n;

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: a */
    public int mo202728a(int i) {
        if (i == 0) {
            return 0;
        }
        return i == 1 ? 3 : -1;
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: b */
    public int mo202733b() {
        return 2;
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: b */
    public void mo202736b(C59447a aVar, int i) {
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: g */
    public boolean mo202742g(int i) {
        return true;
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: h */
    public boolean mo202743h(int i) {
        return i == 1;
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: i */
    public int mo202744i(int i) {
        if (i == 0) {
            return R.layout.opb_page_config_header;
        }
        if (i == 3) {
            return R.layout.opb_page_more_header;
        }
        return 0;
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: j */
    public int mo202745j(int i) {
        if (i == 6) {
            return R.layout.opb_page_more_footer;
        }
        return 0;
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: k */
    public int mo202746k(int i) {
        return R.layout.opb_app_item;
    }

    /* renamed from: e */
    public int mo202756e() {
        return this.f147617n;
    }

    /* renamed from: c */
    public CopyOnWriteArrayList<C59572d> mo202754c() {
        return this.f147614k.mo202759a();
    }

    /* renamed from: d */
    public CopyOnWriteArrayList<C59572d> mo202755d() {
        return this.f147614k.mo202760b();
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: b */
    public int mo202734b(int i) {
        if (i == 1) {
            return 6;
        }
        return super.mo202734b(i);
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: f */
    public int mo202741f(int i) {
        if (i == 0) {
            return this.f147614k.mo202759a().size();
        }
        if (i == 1) {
            return this.f147614k.mo202760b().size();
        }
        return 0;
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: a */
    public int mo202729a(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 5;
        }
        return super.mo202729a(i, i2);
    }

    /* renamed from: a */
    public void mo202753a(C59460e eVar, int i) {
        Log.m165389i("Opb_Adapter", "refresh data, maxConfigCount: " + i);
        this.f147614k = eVar;
        this.f147617n = i;
        mo202730a();
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: a */
    public void mo202731a(C59447a aVar, int i) {
        int i2;
        if (i == 0) {
            Log.m165389i("Opb_Adapter", "bind config header, config size: " + this.f147614k.mo202759a().size());
            TextView textView = (TextView) aVar.itemView.findViewById(R.id.opb_app_item_drag_tip);
            FrameLayout frameLayout = (FrameLayout) aVar.itemView.findViewById(R.id.opb_app_item_empty_tip);
            if (this.f147614k.mo202759a().size() > 0) {
                frameLayout.setVisibility(8);
            } else {
                frameLayout.setVisibility(0);
            }
            if (this.f147614k.mo202759a().size() > 1) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            ImageView imageView = (ImageView) aVar.itemView.findViewById(R.id.opb_config_tip);
            if (this.f147613j == OpbScene.MESSAGE_ACTION) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            aVar.itemView.findViewById(R.id.opb_config_tip_click).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.openbusiness.p3003a.C59457d.View$OnClickListenerC594581 */

                public void onClick(View view) {
                    ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(C59457d.this.f147597g).controller(new C59603c(C59457d.this.f147597g))).contentLayoutRes(R.layout.opb_external_tip)).title(R.string.Lark_OpenPlatform_ShortcutsPreviewTtl)).titleGravity(3)).cancelOnTouchOutside(false)).backgroundColor(R.color.bg_float)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_OpenPlatform_ScIGotItBttn, (DialogInterface.OnClickListener) null)).show();
                }
            });
        } else if (i == 1) {
            Log.m165389i("Opb_Adapter", "bind more header, apps size: " + this.f147614k.mo202760b().size());
            StringBuilder sb = new StringBuilder();
            Context context = this.f147597g;
            if (this.f147614k.mo202760b().size() == 0) {
                i2 = R.string.Lark_OpenPlatform_ScNoMoreAppsTryDesc;
            } else {
                i2 = R.string.Lark_OpenPlatform_ScCustomAppDesc;
            }
            sb.append(UIUtils.getString(context, i2));
            sb.append(" ");
            C59478b.m230864a(this.f147597g, (TextView) aVar.itemView.findViewById(R.id.opb_more_tip), sb.toString(), R.color.text_caption, UIUtils.getString(this.f147597g, R.string.Lark_OpenPlatform_ScCustomAppHyperlink), R.color.text_link_normal, new View.OnClickListener() {
                /* class com.ss.android.openbusiness.p3003a.C59457d.View$OnClickListenerC594592 */

                public void onClick(View view) {
                    String str;
                    AbstractC59446a a = C59480b.m230865a();
                    Context context = C59457d.this.f147597g;
                    if (C59457d.this.f147613j == OpbScene.MESSAGE_ACTION) {
                        str = C59566a.m231079a().mo202959b();
                    } else {
                        str = C59566a.m231079a().mo202960c();
                    }
                    a.mo144873a(context, str, null, false, null, null);
                }
            });
        }
    }

    @Override // com.ss.android.openbusiness.p3003a.AbstractC59449c
    /* renamed from: a */
    public void mo202732a(C59447a aVar, int i, int i2) {
        C59461f fVar;
        C59572d dVar;
        Log.m165389i("Opb_Adapter", "bind child view, " + i + " - " + i2);
        Object a = aVar.mo202723a();
        if (a instanceof C59461f) {
            Log.m165389i("Opb_Adapter", "reuse opbitemrender");
            fVar = (C59461f) a;
        } else {
            Log.m165389i("Opb_Adapter", "new opbitemrender");
            fVar = new C59461f(this.f147597g, this.f147613j, aVar.itemView, this.f147615l, this.f147616m, this.f147617n);
            aVar.mo202724a(fVar);
        }
        int a2 = mo202729a(i, i2);
        if (i == 0) {
            dVar = this.f147614k.mo202759a().get(i2);
        } else {
            dVar = this.f147614k.mo202760b().get(i2);
        }
        fVar.mo202761a(dVar, a2, i2, aVar, this.f147614k.mo202759a());
    }

    public C59457d(Context context, ItemTouchHelper itemTouchHelper, String str, OpbScene opbScene) {
        super(context);
        this.f147615l = itemTouchHelper;
        this.f147616m = str;
        this.f147613j = opbScene;
        Log.m165389i("Opb_Adapter", "new Adapter, uuid " + str);
    }
}
