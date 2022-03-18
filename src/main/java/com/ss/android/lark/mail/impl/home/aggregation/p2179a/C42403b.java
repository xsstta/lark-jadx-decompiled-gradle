package com.ss.android.lark.mail.impl.home.aggregation.p2179a;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.utils.C43771m;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.aggregation.a.b */
public class C42403b extends BaseAdapter {

    /* renamed from: a */
    public final AbstractC42408b f107940a;

    /* renamed from: b */
    public final int f107941b;

    /* renamed from: c */
    public int f107942c;

    /* renamed from: d */
    public final int f107943d;

    /* renamed from: e */
    public MailLabelEntity f107944e;

    /* renamed from: f */
    private final String f107945f = "AggregationListAdapter";

    /* renamed from: g */
    private final ArrayList<MailLabelEntity> f107946g;

    /* renamed from: h */
    private final Context f107947h;

    /* renamed from: com.ss.android.lark.mail.impl.home.aggregation.a.b$b */
    public interface AbstractC42408b<T> {
        /* renamed from: a */
        String mo152640a(T t);

        /* renamed from: b */
        void mo152641b(T t);

        /* renamed from: c */
        void mo152642c(T t);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public MailLabelEntity mo152623a() {
        return this.f107944e;
    }

    /* renamed from: c */
    public ArrayList<MailLabelEntity> mo152630c() {
        return this.f107946g;
    }

    public int getCount() {
        return this.f107946g.size();
    }

    /* renamed from: b */
    public ArrayList<String> mo152627b() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f107946g.size(); i++) {
            if (this.f107946g.get(i).mo151536t() == 1) {
                arrayList.add(this.f107946g.get(i).mo151527k());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public MailLabelEntity getItem(int i) {
        return this.f107946g.get(i);
    }

    /* renamed from: c */
    public int mo152629c(MailLabelEntity mailLabelEntity) {
        ArrayList<MailLabelEntity> arrayList = this.f107946g;
        if (arrayList != null) {
            return arrayList.indexOf(mailLabelEntity);
        }
        return -1;
    }

    public boolean isEnabled(int i) {
        MailLabelEntity a = getItem(i);
        if (this.f107941b == 2 && a.mo151535s() == 4) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r0 != 3) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152625a(com.ss.android.lark.mail.impl.entity.MailLabelEntity r5) {
        /*
            r4 = this;
            int r0 = r4.f107941b
            r1 = 2
            if (r0 != r1) goto L_0x0008
            r4.f107944e = r5
            goto L_0x001e
        L_0x0008:
            r2 = 3
            if (r0 != r2) goto L_0x001e
            int r0 = r5.mo151536t()
            r3 = 1
            if (r0 == r3) goto L_0x001b
            if (r0 == r1) goto L_0x0017
            if (r0 == r2) goto L_0x001b
            goto L_0x001e
        L_0x0017:
            r5.mo151516e(r3)
            goto L_0x001e
        L_0x001b:
            r5.mo151516e(r1)
        L_0x001e:
            r4.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42403b.mo152625a(com.ss.android.lark.mail.impl.entity.MailLabelEntity):void");
    }

    /* renamed from: a */
    public void mo152626a(List<MailLabelEntity> list) {
        this.f107946g.clear();
        if (list != null) {
            this.f107946g.addAll(list);
        }
        int i = 0;
        while (true) {
            if (i >= this.f107946g.size()) {
                break;
            }
            List<String> B = this.f107946g.get(i).mo151493B();
            if (B == null) {
                this.f107942c = 0;
                break;
            } else {
                this.f107942c = Math.min(this.f107942c, B.size());
                i++;
            }
        }
        if (this.f107942c == Integer.MAX_VALUE) {
            this.f107942c = 0;
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo152628b(final MailLabelEntity mailLabelEntity) {
        Log.m165389i("AggregationListAdapter", "showSureRemoveDialog");
        AbstractC42408b bVar = this.f107940a;
        if (bVar != null) {
            String a = bVar.mo152640a(mailLabelEntity);
            Context context = this.f107947h;
            C43771m.m173505a(context, a, context.getResources().getString(R.string.Mail_Alert_Cancel), (int) R.color.text_title, this.f107947h.getResources().getString(R.string.Mail_CustomLabels_Remove), (int) R.color.function_danger_500, (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42403b.DialogInterface$OnClickListenerC424041 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (C42403b.this.f107940a != null) {
                        C42403b.this.f107940a.mo152642c(mailLabelEntity);
                    }
                }
            }).mo89239c();
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.aggregation.a.b$a */
    private class C42405a {

        /* renamed from: a */
        public View f107950a;

        /* renamed from: b */
        View f107951b;

        /* renamed from: c */
        ImageView f107952c = ((ImageView) this.f107950a.findViewById(R.id.lable_icon));

        /* renamed from: d */
        TextView f107953d = ((TextView) this.f107950a.findViewById(R.id.lable_text));

        /* renamed from: e */
        ImageView f107954e = ((ImageView) this.f107950a.findViewById(R.id.lable_remove));

        /* renamed from: f */
        ImageView f107955f = ((ImageView) this.f107950a.findViewById(R.id.lable_edit));

        /* renamed from: g */
        ImageView f107956g = ((ImageView) this.f107950a.findViewById(R.id.mail_aggregation_select_iv));

        /* renamed from: h */
        ImageView f107957h = ((ImageView) this.f107950a.findViewById(R.id.mail_aggregation_select_cb));

        /* renamed from: a */
        public void mo152637a(final MailLabelEntity mailLabelEntity, int i) {
            int i2;
            String str;
            if (C42403b.this.f107941b == 1) {
                this.f107950a.setBackgroundColor(UIHelper.getColor(R.color.bg_body));
            } else {
                this.f107950a.setBackgroundResource(R.drawable.mail_item_bg_selector_c11);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f107951b.getLayoutParams();
            int i3 = C42403b.this.f107943d;
            if (mailLabelEntity.mo151493B() == null) {
                i2 = 0;
            } else {
                i2 = mailLabelEntity.mo151493B().size() - C42403b.this.f107942c;
            }
            layoutParams.width = i3 * i2;
            this.f107951b.requestLayout();
            if (C57782ag.m224242a("0", mailLabelEntity.mo151527k())) {
                this.f107952c.setVisibility(8);
            } else {
                this.f107952c.setVisibility(0);
            }
            this.f107952c.setImageResource(mailLabelEntity.mo151500b());
            if (mailLabelEntity.mo151529m() || mailLabelEntity.mo151494a() == 2) {
                this.f107952c.setColorFilter(UIHelper.getColor(R.color.icon_n1));
            } else {
                this.f107952c.setColorFilter(mailLabelEntity.mo151505c());
            }
            this.f107953d.setText(mailLabelEntity.mo151528l());
            if (C42403b.this.f107941b == 1) {
                if (mailLabelEntity.mo151539w()) {
                    this.f107955f.setVisibility(0);
                    this.f107954e.setVisibility(0);
                } else {
                    this.f107955f.setVisibility(4);
                    this.f107954e.setVisibility(4);
                }
                this.f107956g.setVisibility(8);
                this.f107957h.setVisibility(8);
                this.f107955f.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42403b.C42405a.View$OnClickListenerC424061 */

                    public void onClick(View view) {
                        if (C42403b.this.f107940a != null) {
                            C42403b.this.f107940a.mo152641b(mailLabelEntity);
                        }
                    }
                });
                this.f107954e.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.home.aggregation.p2179a.C42403b.C42405a.View$OnClickListenerC424072 */

                    public void onClick(View view) {
                        C42403b.this.mo152628b(mailLabelEntity);
                    }
                });
            } else if (C42403b.this.f107941b == 2) {
                if (mailLabelEntity.mo151535s() == 4) {
                    this.f107950a.setAlpha(0.3f);
                } else {
                    this.f107950a.setAlpha(1.0f);
                }
                this.f107955f.setVisibility(8);
                this.f107954e.setVisibility(8);
                String k = mailLabelEntity.mo151527k();
                if (C42403b.this.f107944e != null) {
                    str = C42403b.this.f107944e.mo151527k();
                } else {
                    str = null;
                }
                if (C57782ag.m224242a(k, str)) {
                    this.f107956g.setVisibility(0);
                } else {
                    this.f107956g.setVisibility(4);
                }
                this.f107957h.setVisibility(8);
            } else if (C42403b.this.f107941b == 3) {
                this.f107955f.setVisibility(8);
                this.f107954e.setVisibility(8);
                this.f107956g.setVisibility(8);
                this.f107957h.setVisibility(0);
                int t = mailLabelEntity.mo151536t();
                if (t == 1) {
                    this.f107957h.setImageResource(R.drawable.mail_icon_uncheck);
                } else if (t == 2) {
                    this.f107957h.setImageResource(R.drawable.mail_icon_checkbox_layer_list);
                } else if (t == 3) {
                    this.f107957h.setImageResource(R.drawable.mail_icon_half_checkbox_layer_list);
                }
            }
        }

        public C42405a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View inflate = layoutInflater.inflate(R.layout.mail_aggregation_list_item, viewGroup, false);
            this.f107950a = inflate;
            this.f107951b = inflate.findViewById(R.id.left_indentation);
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C42405a aVar = new C42405a(LayoutInflater.from(viewGroup.getContext()), viewGroup);
            View view2 = aVar.f107950a;
            view2.setTag(aVar);
            view = view2;
        } else if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        ((C42405a) view.getTag()).mo152637a(this.f107946g.get(i), i);
        return view;
    }

    public C42403b(Context context, int i, ArrayList<MailLabelEntity> arrayList, AbstractC42408b bVar) {
        ArrayList<MailLabelEntity> arrayList2 = new ArrayList<>();
        this.f107946g = arrayList2;
        this.f107942c = Integer.MAX_VALUE;
        this.f107944e = null;
        this.f107947h = context;
        this.f107941b = i;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f107940a = bVar;
        this.f107943d = UIHelper.getDimens(R.dimen.mail_home_left_menu_left_indentation);
    }
}
