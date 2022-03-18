package com.bytedance.ee.bear.more.pageview2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.bear.middleground.record.p497a.AbstractC10116a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.MoreViewModel;
import com.bytedance.ee.bear.more.PageViewResult;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.PageviewResult;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p705h.C13666a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.more.pageview2.a */
public class C10240a extends C4860a {

    /* renamed from: c */
    public C10241a f27639c;

    /* renamed from: d */
    public String f27640d;

    /* renamed from: e */
    public MoreViewModel f27641e;

    /* renamed from: f */
    public int f27642f;

    /* renamed from: g */
    public String f27643g;

    /* renamed from: h */
    boolean f27644h = true;

    /* renamed from: i */
    boolean f27645i = true;

    /* renamed from: j */
    private final String f27646j = "PageViewFragment";

    /* renamed from: k */
    private IMoreInfo f27647k;

    /* renamed from: l */
    private DialogInterface.OnDismissListener f27648l;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.more.pageview2.a$a */
    public class C10241a {

        /* renamed from: a */
        TextView f27649a;

        /* renamed from: b */
        TextView f27650b;

        /* renamed from: c */
        TextView f27651c;

        /* renamed from: d */
        TextView f27652d;

        /* renamed from: e */
        TextView f27653e;

        /* renamed from: f */
        TextView f27654f;

        /* renamed from: g */
        ImageView f27655g;

        /* renamed from: h */
        SpaceEmptyState f27656h;

        /* renamed from: i */
        PageviewTextView f27657i;

        /* renamed from: j */
        PageviewTextView f27658j;

        /* renamed from: k */
        PageviewItemView f27659k;

        /* renamed from: l */
        PageviewItemView f27660l;

        /* renamed from: m */
        PageviewItemView f27661m;

        /* renamed from: n */
        PageviewItemView f27662n;

        /* renamed from: b */
        public void mo39186b() {
            this.f27654f.setVisibility(0);
            this.f27656h.setVisibility(8);
        }

        /* renamed from: c */
        public void mo39187c() {
            this.f27654f.setVisibility(8);
            this.f27656h.setVisibility(0);
        }

        /* renamed from: a */
        public void mo39183a() {
            this.f27659k.setTitle(C13749l.m55745a(C10240a.this.getContext(), (int) R.string.Doc_Doc_ReaderCount));
            this.f27660l.setTitle(C13749l.m55745a(C10240a.this.getContext(), (int) R.string.Doc_Doc_ReadingCount));
            this.f27661m.setTitle(C13749l.m55745a(C10240a.this.getContext(), (int) R.string.CreationMobile_Stats_Basic_comments));
            this.f27662n.setTitle(C13749l.m55745a(C10240a.this.getContext(), (int) R.string.Doc_More_ThumbUpCount));
            this.f27657i.setTitle(C13749l.m55745a(C10240a.this.getContext(), (int) R.string.CreationMobile_Stats_Visits_tab));
            this.f27657i.setImageResource(R.drawable.ud_icon_visible_outlined);
            this.f27658j.setTitle(C13749l.m55745a(C10240a.this.getContext(), (int) R.string.CreationMobile_Common_PrivacySettings_tab));
            this.f27658j.setImageResource(R.drawable.ud_icon_setting_outlined);
            this.f27658j.mo39179a();
            this.f27657i.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.more.pageview2.C10240a.C10241a.View$OnClickListenerC102421 */

                public void onClick(View view) {
                    ((AbstractC10116a) KoinJavaComponent.m268610a(AbstractC10116a.class)).mo38525a("record", "ccm_space_docs_details_record_view");
                    ((AbstractC10116a) KoinJavaComponent.m268610a(AbstractC10116a.class)).mo38523a(C10240a.this.f27643g, C10240a.this.f27642f);
                }
            });
            this.f27658j.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.more.pageview2.C10240a.C10241a.View$OnClickListenerC102432 */

                public void onClick(View view) {
                    ((AbstractC10116a) KoinJavaComponent.m268610a(AbstractC10116a.class)).mo38525a("record", "ccm_space_docs_details_record_view");
                    ((AbstractC10116a) KoinJavaComponent.m268610a(AbstractC10116a.class)).mo38524a(C10240a.this.f27643g, C10240a.this.f27642f, "basic");
                }
            });
            C10240a.this.f27639c.f27654f.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.more.pageview2.C10240a.C10241a.View$OnClickListenerC102443 */

                public void onClick(View view) {
                    C10240a.this.f27639c.f27654f.setVisibility(8);
                    C10240a.this.f27641e.getPageView(C10240a.this.f27642f, C10240a.this.f27643g);
                }
            });
            this.f27656h.setPrimaryClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.more.pageview2.C10240a.C10241a.View$OnClickListenerC102454 */

                public void onClick(View view) {
                    C10240a.this.f27641e.getPageView(C10240a.this.f27642f, C10240a.this.f27643g);
                }
            });
            this.f27655g.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.more.pageview2.C10240a.C10241a.View$OnClickListenerC102465 */

                public void onClick(View view) {
                    ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38967a();
                }
            });
        }

        /* renamed from: a */
        private String m42734a(int i) {
            return new DecimalFormat("###,###,###").format((long) i);
        }

        /* renamed from: a */
        public void mo39185a(PageviewResult pageviewResult) {
            this.f27656h.setVisibility(8);
            this.f27653e.setText(m42734a(pageviewResult.getCharacterCount()));
            this.f27652d.setText(m42734a(pageviewResult.getWordCount()));
        }

        /* renamed from: b */
        private String m42736b(int i) {
            if (i < 1000) {
                return new DecimalFormat("###").format((long) i);
            }
            if (i < 1000000) {
                return new DecimalFormat("###" + C13749l.m55745a(C10240a.this.getContext(), (int) R.string.CreationMobile_Common_Units_thousand)).format((long) (i / 1000));
            }
            return new DecimalFormat("###" + C13749l.m55745a(C10240a.this.getContext(), (int) R.string.CreationMobile_Common_Units_million)).format((long) (i / 1000000));
        }

        /* renamed from: a */
        private void m42735a(View view) {
            this.f27649a = (TextView) view.findViewById(R.id.title);
            this.f27650b = (TextView) view.findViewById(R.id.subtitle1_value);
            this.f27651c = (TextView) view.findViewById(R.id.subtitle2_value);
            this.f27652d = (TextView) view.findViewById(R.id.subtitle3_value);
            this.f27653e = (TextView) view.findViewById(R.id.subtitle4_value);
            this.f27655g = (ImageView) view.findViewById(R.id.leftIconIV);
            this.f27654f = (TextView) view.findViewById(R.id.reloading);
            this.f27656h = (SpaceEmptyState) view.findViewById(R.id.empty_state);
            this.f27657i = (PageviewTextView) view.findViewById(R.id.item_text_1);
            this.f27658j = (PageviewTextView) view.findViewById(R.id.item_text_2);
            this.f27659k = (PageviewItemView) view.findViewById(R.id.item_ret_1);
            this.f27660l = (PageviewItemView) view.findViewById(R.id.item_ret_2);
            this.f27661m = (PageviewItemView) view.findViewById(R.id.item_ret_3);
            this.f27662n = (PageviewItemView) view.findViewById(R.id.item_ret_4);
        }

        /* renamed from: a */
        public void mo39184a(PageViewResult pageViewResult) {
            String str;
            this.f27656h.setVisibility(8);
            TextView textView = this.f27651c;
            if (pageViewResult.creationTime == 0) {
                str = "";
            } else {
                str = C13723a.m55664d(C10240a.this.getContext(), pageViewResult.creationTime * 1000);
            }
            textView.setText(str);
            this.f27650b.setText(C13666a.m55443a(C10240a.this.f27640d, pageViewResult.ownerName, pageViewResult.ownerEnName));
            this.f27659k.setValue(m42736b(pageViewResult.uv));
            this.f27660l.setValue(m42736b(pageViewResult.pv));
            this.f27661m.setValue(m42736b(pageViewResult.commentsCount));
            this.f27662n.setValue(m42736b(pageViewResult.likeCount));
            this.f27659k.setTodayValue(m42736b(pageViewResult.uvToday));
            this.f27660l.setTodayValue(m42736b(pageViewResult.pvToday));
            this.f27661m.setTodayValue(m42736b(pageViewResult.commentsCountToday));
            this.f27662n.setTodayValue(m42736b(pageViewResult.likeCountToday));
        }

        public C10241a(View view) {
            m42735a(view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f27641e.setIsOpenPageView(false);
        this.f27641e.closeMore();
    }

    /* renamed from: f */
    private void m42731f() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            C13479a.m54758a("PageViewFragment", "getArguments() == null");
            return;
        }
        this.f27642f = arguments.getInt("documentType");
        this.f27643g = arguments.getString("token");
    }

    /* renamed from: g */
    private void m42732g() {
        MoreViewModel fVar = (MoreViewModel) aj.m5366a(getActivity()).mo6005a(MoreViewModel.class);
        this.f27641e = fVar;
        fVar.getMoreInfoLiveData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.more.pageview2.$$Lambda$a$bpi5ASbn5vj95wrQAXIN6RvETk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10240a.this.m42730a((C10240a) ((IMoreInfo) obj));
            }
        });
        this.f27641e.getPageViewResultLiveData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.more.pageview2.$$Lambda$a$9biji4YU3c9OidpstvPPQ9dFS9M */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10240a.this.m42728a((C10240a) ((PageViewResult) obj));
            }
        });
        this.f27641e.getPageviewResultLiveData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.more.pageview2.$$Lambda$a$pcr9Jkta5UPm3yIzs_PgTRQGUJ0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10240a.this.m42729a((C10240a) ((PageviewResult) obj));
            }
        });
    }

    /* renamed from: a */
    public void mo39182a(DialogInterface.OnDismissListener onDismissListener) {
        this.f27648l = onDismissListener;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f27648l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27640d = C4484g.m18494b().mo17252c();
        m42731f();
        m42732g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m42728a(PageViewResult pageViewResult) {
        if (pageViewResult == null) {
            this.f27644h = false;
            if (this.f27645i) {
                this.f27639c.mo39186b();
            } else {
                this.f27639c.mo39187c();
            }
        } else {
            this.f27644h = true;
            if (this.f27645i) {
                this.f27639c.f27654f.setVisibility(4);
            }
            this.f27639c.mo39184a(pageViewResult);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m42729a(PageviewResult pageviewResult) {
        if (pageviewResult == null) {
            this.f27645i = false;
            if (this.f27644h) {
                this.f27639c.mo39186b();
            } else {
                this.f27639c.mo39187c();
            }
        } else {
            this.f27645i = true;
            if (this.f27644h) {
                this.f27639c.f27654f.setVisibility(4);
            }
            this.f27639c.mo39185a(pageviewResult);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m42730a(IMoreInfo dVar) {
        this.f27647k = dVar;
        if (dVar != null && !dVar.mo39048o()) {
            this.f27639c.f27657i.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C10241a aVar = new C10241a(view);
        this.f27639c = aVar;
        aVar.mo39183a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pageview_layout_fragment, viewGroup, false);
    }

    /* renamed from: a */
    public static C10240a m42727a(Context context, int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("documentType", i);
        bundle.putString("token", str);
        return (C10240a) Fragment.instantiate(context, C10240a.class.getName(), bundle);
    }
}
