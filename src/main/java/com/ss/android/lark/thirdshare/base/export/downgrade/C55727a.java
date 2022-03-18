package com.ss.android.lark.thirdshare.base.export.downgrade;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.downgrade.C55727a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.thirdshare.base.export.downgrade.a */
public class C55727a {

    /* renamed from: a */
    public DialogC25637f f137431a;

    private C55727a(final Context context, final String str, final String str2, final CtaBtnStyle ctaBtnStyle, final Runnable runnable, final String str3, final Runnable runnable2) {
        this.f137431a = new C25639g(context).mo89260s(R.layout.ts_share_paste_panel).mo89226a(new DialogInterface.OnCancelListener(runnable2) {
            /* class com.ss.android.lark.thirdshare.base.export.downgrade.$$Lambda$a$X_po4bdJVnDixsA89Hwnv4DJX6c */
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.run();
            }
        }).mo89230a(new C25639g.AbstractC25641b() {
            /* class com.ss.android.lark.thirdshare.base.export.downgrade.C55727a.C557281 */

            /* renamed from: a */
            private Drawable m215831a() {
                StateListDrawable stateListDrawable = new StateListDrawable();
                float dp2px = (float) UIHelper.dp2px(6.0f);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dp2px);
                gradientDrawable.setColor(ctaBtnStyle.getPressedColor(context));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(dp2px);
                gradientDrawable2.setColor(ctaBtnStyle.getNormalColor(context));
                stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
                stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable2);
                return stateListDrawable;
            }

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: b */
            public void mo89274b(DialogC25637f fVar) {
                super.mo89274b(fVar);
                TextView textView = (TextView) fVar.findViewById(R.id.sdpContentTv);
                LinearLayout linearLayout = (LinearLayout) fVar.findViewById(R.id.sdpCtaLl);
                TextView textView2 = (TextView) fVar.findViewById(R.id.sdpCtaTv);
                View findViewById = fVar.findViewById(R.id.sdpCtaLogoView);
                TextView textView3 = (TextView) fVar.findViewById(R.id.sdpCancelTv);
                ((TextView) fVar.findViewById(R.id.sdpTitleTv)).setText(str);
                if (TextUtils.isEmpty(str2)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str2);
                }
                linearLayout.setBackground(m215831a());
                Drawable logoDrawable = ctaBtnStyle.getLogoDrawable(context);
                if (logoDrawable != null) {
                    findViewById.setBackground(logoDrawable);
                    findViewById.setVisibility(0);
                } else {
                    findViewById.setVisibility(8);
                }
                textView2.setTextColor(ctaBtnStyle.getTextColor(context));
                textView2.setText(ctaBtnStyle.getText(context));
                linearLayout.setOnClickListener(new View.OnClickListener(runnable) {
                    /* class com.ss.android.lark.thirdshare.base.export.downgrade.$$Lambda$a$1$4Ua6ZPA9xNChKIMEFV2AxJwATyA */
                    public final /* synthetic */ Runnable f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C55727a.C557281.m215833b(DialogC25637f.this, this.f$1, view);
                    }
                });
                if (TextUtils.isEmpty(str3)) {
                    textView3.setText(UIHelper.getString(R.string.Lark_Invitation_TeamCodeClose));
                } else {
                    textView3.setText(str3);
                }
                textView3.setOnClickListener(new View.OnClickListener(runnable2) {
                    /* class com.ss.android.lark.thirdshare.base.export.downgrade.$$Lambda$a$1$kYJLkftudT_jrtnSyaRA43uoWwA */
                    public final /* synthetic */ Runnable f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        C55727a.C557281.m215832a(DialogC25637f.this, this.f$1, view);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m215832a(DialogC25637f fVar, Runnable runnable, View view) {
                fVar.dismiss();
                runnable.run();
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ void m215833b(DialogC25637f fVar, Runnable runnable, View view) {
                fVar.dismiss();
                runnable.run();
            }
        }).mo89233b();
    }

    /* renamed from: a */
    public static void m215829a(Context context, String str, String str2, String str3, CtaBtnStyle ctaBtnStyle, Runnable runnable, String str4, Runnable runnable2) {
        if (ViewUtils.m224153b(context)) {
            if (TextUtils.isEmpty(str)) {
                Log.m165389i("ThirdShare", "copyText is empty.");
            } else {
                C55680a.m215712a((CharSequence) str);
            }
            new C55727a(context, str2, str3, ctaBtnStyle, runnable, str4, runnable2).f137431a.show();
        }
    }
}
