package com.ss.android.openbusiness.p3003a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.event.p3008a.C59593a;
import com.ss.android.openbusiness.event.p3008a.C59597e;
import com.ss.android.openbusiness.event.p3008a.C59598f;
import com.ss.android.openbusiness.ui.C59601a;
import java.util.List;

/* renamed from: com.ss.android.openbusiness.a.f */
public class C59461f {

    /* renamed from: a */
    public final Context f147622a;

    /* renamed from: b */
    public final View f147623b;

    /* renamed from: c */
    public final TextView f147624c;

    /* renamed from: d */
    public final OpbScene f147625d;

    /* renamed from: e */
    public final ItemTouchHelper f147626e;

    /* renamed from: f */
    public final String f147627f;

    /* renamed from: g */
    public final int f147628g;

    /* renamed from: h */
    public int f147629h;

    /* renamed from: i */
    public ImageView f147630i;

    /* renamed from: j */
    private final SquircleImageView f147631j;

    /* renamed from: k */
    private final TextView f147632k;

    /* renamed from: l */
    private final LinearLayout f147633l;

    /* renamed from: m */
    private final ImageView f147634m;

    /* renamed from: n */
    private final FrameLayout f147635n;

    /* renamed from: o */
    private final TextView f147636o;

    /* renamed from: p */
    private final View f147637p;

    /* renamed from: q */
    private ImageView f147638q;

    /* renamed from: a */
    private void m230831a(ImageView imageView, int i) {
        m230832a(imageView, i, R.color.icon_n3);
    }

    /* renamed from: a */
    private void m230832a(ImageView imageView, int i, int i2) {
        Context context = imageView.getContext();
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, i, UDColorUtils.getColor(context, i2)));
    }

    /* renamed from: a */
    public void mo202761a(final C59572d dVar, int i, final int i2, final C59447a aVar, final List<C59572d> list) {
        String str;
        Log.m165389i("Opb_ItemRender", "renderItem " + i + ", " + i2 + ", " + dVar.mo202975g());
        if (dVar.mo202976h() != null) {
            C59601a.m231145a(this.f147622a, dVar.mo202976h().getKey(), this.f147631j);
        } else {
            Log.m165383e("Opb_ItemRender", "icon empty");
        }
        this.f147637p.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f147636o.setEnabled(true);
        this.f147624c.setEnabled(true);
        ((CardView) this.f147623b).setCardElevation(BitmapDescriptorFactory.HUE_RED);
        TextView textView = this.f147636o;
        if (this.f147625d == OpbScene.MESSAGE_ACTION) {
            str = dVar.mo202969a();
        } else {
            str = dVar.mo202975g();
        }
        textView.setText(str);
        this.f147636o.setCompoundDrawables(null, null, null, null);
        String e = dVar.mo202973e();
        TextView textView2 = this.f147624c;
        StringBuilder sb = new StringBuilder();
        sb.append(UIUtils.getString(this.f147622a, R.string.Lark_OpenPlatform_ScIntroTtl));
        if (TextUtils.isEmpty(e)) {
            e = UIUtils.getString(this.f147622a, R.string.Lark_OpenPlatform_NoneDesc);
        }
        sb.append(e);
        textView2.setText(sb.toString());
        this.f147624c.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.openbusiness.p3003a.C59461f.ViewTreeObserver$OnPreDrawListenerC594621 */

            public boolean onPreDraw() {
                C59461f.this.f147624c.getViewTreeObserver().removeOnPreDrawListener(this);
                TextPaint paint = C59461f.this.f147624c.getPaint();
                paint.setTextSize(C59461f.this.f147624c.getTextSize());
                int measureText = (int) paint.measureText(C59461f.this.f147624c.getText().toString());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C59461f.this.f147630i.getLayoutParams();
                if (measureText > C59461f.this.f147624c.getWidth()) {
                    layoutParams.gravity = 48;
                    layoutParams.topMargin = UIUtils.dp2px(C59461f.this.f147622a, 3.0f);
                } else {
                    layoutParams.topMargin = 0;
                    layoutParams.gravity = 16;
                }
                C59461f.this.f147630i.setLayoutParams(layoutParams);
                return false;
            }
        });
        this.f147630i.setImageResource(R.drawable.ud_icon_describe_outlined);
        this.f147630i.setEnabled(dVar.mo202972d().booleanValue());
        if (this.f147625d == OpbScene.MESSAGE_ACTION) {
            m230831a(this.f147638q, R.drawable.ud_icon_app_default_outlined);
            TextView textView3 = this.f147632k;
            textView3.setText(UIUtils.getString(this.f147622a, R.string.Lark_OpenPlatform_ScAppTtl) + dVar.mo202975g());
        } else {
            m230831a(this.f147638q, R.drawable.ud_icon_tab_more_outlined);
            this.f147632k.setText(R.string.Lark_OpenPlatform_ScViewMoreDetailsBttn);
        }
        if (i == 1) {
            m230831a(this.f147634m, R.drawable.ud_icon_no_outlined);
            this.f147635n.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnClickListenerC594632 */

                public void onClick(View view) {
                    Log.m165389i("Opb_ItemRender", "send remove item event, " + dVar.mo202974f() + ", " + i2);
                    EventBus.getDefault().trigger(new C59593a(false, dVar, i2));
                }
            });
            this.f147623b.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnLongClickListenerC594643 */

                public boolean onLongClick(View view) {
                    Log.m165389i("Opb_ItemRender", "start drag");
                    if (list.size() < 2) {
                        return true;
                    }
                    C59461f.this.f147623b.post(new Runnable() {
                        /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnLongClickListenerC594643.RunnableC594651 */

                        public void run() {
                            EventBus.getDefault().trigger(new C59598f());
                            C59461f.this.f147626e.startDrag(aVar);
                        }
                    });
                    return true;
                }
            });
        } else {
            Log.m165389i("Opb_ItemRender", "show operate icon, " + list.size() + ", " + this.f147628g);
            if (list.size() >= this.f147628g) {
                m230832a(this.f147634m, R.drawable.ud_icon_more_add_outlined, R.color.icon_disable);
            } else {
                m230831a(this.f147634m, R.drawable.ud_icon_more_add_outlined);
            }
            this.f147635n.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnClickListenerC594664 */

                public void onClick(View view) {
                    if (list.size() >= C59461f.this.f147628g) {
                        UDToast.show(C59461f.this.f147622a, UIHelper.mustacheFormat((int) R.string.Lark_OpenPlatform_ScMaxFreqAppsMsg, "max_count", String.valueOf(C59461f.this.f147628g)));
                        return;
                    }
                    Log.m165389i("Opb_ItemRender", "send add event, " + dVar.mo202974f() + ", " + i2);
                    EventBus.getDefault().trigger(new C59593a(true, dVar, i2));
                }
            });
        }
        this.f147633l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnClickListenerC594675 */

            public void onClick(View view) {
                int i;
                if (TextUtils.isEmpty(dVar.mo202971c())) {
                    Log.m165389i("Opb_ItemRender", "detail link empty, open profile " + dVar.mo202974f());
                    UDDialogBuilder eVar = new UDDialogBuilder(C59461f.this.f147622a);
                    if (TextUtils.isEmpty(dVar.mo202979k())) {
                        i = R.string.Lark_OpenPlatform_ScMblViewAppInfoNoDocs;
                    } else {
                        i = R.string.Lark_OpenPlatform_ScMblViewAppInfoWithDocs;
                    }
                    eVar.message(i);
                    eVar.messagePadding(-1, 24, -1, -1);
                    if (!TextUtils.isEmpty(dVar.mo202979k())) {
                        eVar.addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_OpenPlatform_ScMblViewDocBttn, new DialogInterface.OnClickListener() {
                            /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnClickListenerC594675.DialogInterface$OnClickListenerC594681 */

                            public void onClick(DialogInterface dialogInterface, int i) {
                                C59480b.m230865a().mo144873a(C59461f.this.f147622a, dVar.mo202979k(), null, false, null, null);
                            }
                        });
                        if (!TextUtils.isEmpty(dVar.mo202978j())) {
                            eVar.addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_OpenPlatform_ScMblContactDevBttn, new DialogInterface.OnClickListener() {
                                /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnClickListenerC594675.DialogInterface$OnClickListenerC594692 */

                                public void onClick(DialogInterface dialogInterface, int i) {
                                    C59480b.m230865a().mo144869a(C59461f.this.f147622a, dVar.mo202978j());
                                }
                            });
                        }
                        eVar.addActionButton(R.id.ud_dialog_btn_secondary2, R.string.Lark_OpenPlatform_ScIGotItBttn, (DialogInterface.OnClickListener) null);
                    } else {
                        if (!TextUtils.isEmpty(dVar.mo202978j())) {
                            eVar.addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_OpenPlatform_ScMblContactDevBttn, new DialogInterface.OnClickListener() {
                                /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnClickListenerC594675.DialogInterface$OnClickListenerC594703 */

                                public void onClick(DialogInterface dialogInterface, int i) {
                                    C59480b.m230865a().mo144869a(C59461f.this.f147622a, dVar.mo202978j());
                                }
                            });
                        }
                        eVar.addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_OpenPlatform_ScIGotItBttn, (DialogInterface.OnClickListener) null);
                    }
                    eVar.cancelOnTouchOutside(false);
                    eVar.actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL);
                    eVar.show();
                    return;
                }
                int i2 = 1000;
                if (C59461f.this.f147625d == OpbScene.MESSAGE_ACTION) {
                    i2 = 1516;
                } else if (C59461f.this.f147625d == OpbScene.PLUS_MENU_GROUP) {
                    i2 = 1510;
                } else if (C59461f.this.f147625d == OpbScene.PLUS_MENU_SINGLE) {
                    i2 = 1509;
                }
                C59480b.m230865a().mo144870a(C59461f.this.f147622a, dVar.mo202971c(), i2);
            }
        });
        if (!dVar.mo202972d().booleanValue()) {
            Log.m165389i("Opb_ItemRender", "not available on mobile");
            new UDTagsDrawable.Builder(this.f147622a).mo91384a(new UDTagsDrawable.TagModel.Builder(this.f147622a).mo91418a(UIUtils.getString(this.f147622a, R.string.Lark_OpenPlatform_ScMblForPcDesc)).mo91422c(this.f147622a.getResources().getColor(R.color.text_caption)).mo91419b(this.f147622a.getResources().getColor(R.color.udtoken_tag_neutral_bg_normal)).mo91427g()).mo91398i().mo91369a(this.f147636o);
            this.f147637p.setAlpha(0.5f);
            this.f147636o.setEnabled(false);
            this.f147624c.setEnabled(false);
            return;
        }
        this.f147623b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.openbusiness.p3003a.C59461f.View$OnClickListenerC594716 */

            public void onClick(View view) {
                Log.m165389i("Opb_ItemRender", "send open app event, " + C59461f.this.f147627f + ", " + dVar.mo202977i() + ", " + dVar.mo202974f() + ", " + dVar.mo202970b());
                EventBus.getDefault().trigger(new C59597e(C59461f.this.f147627f, dVar.mo202977i(), dVar.mo202974f(), dVar.mo202970b()));
            }
        });
    }

    public C59461f(Context context, OpbScene opbScene, View view, ItemTouchHelper itemTouchHelper, String str, int i) {
        this.f147622a = context;
        this.f147625d = opbScene;
        this.f147626e = itemTouchHelper;
        this.f147627f = str;
        this.f147628g = i;
        this.f147623b = view.findViewById(R.id.opb_app_item_content);
        this.f147636o = (TextView) view.findViewById(R.id.opb_app_item_name);
        this.f147631j = (SquircleImageView) view.findViewById(R.id.opb_app_item_icon);
        this.f147624c = (TextView) view.findViewById(R.id.opb_app_item_desc);
        this.f147632k = (TextView) view.findViewById(R.id.opb_app_item_from);
        this.f147635n = (FrameLayout) view.findViewById(R.id.opb_app_item_option_click);
        this.f147634m = (ImageView) view.findViewById(R.id.opb_app_item_option);
        this.f147629h = UIUtils.dp2px(context, 70.0f);
        this.f147633l = (LinearLayout) view.findViewById(R.id.opb_app_item_from_click);
        this.f147637p = view.findViewById(R.id.opb_app_item_icon_mask);
        this.f147638q = (ImageView) view.findViewById(R.id.opb_app_item_from_icon_left);
        this.f147630i = (ImageView) view.findViewById(R.id.opb_app_item_desc_left);
    }
}
