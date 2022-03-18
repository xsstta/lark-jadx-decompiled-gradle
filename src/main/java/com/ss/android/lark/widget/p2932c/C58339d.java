package com.ss.android.lark.widget.p2932c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.p2905b.C57810a;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.c.d */
public class C58339d {

    /* renamed from: com.ss.android.lark.widget.c.d$1 */
    static class C583401 {
    }

    /* renamed from: com.ss.android.lark.widget.c.d$a */
    public static class C58341a {

        /* renamed from: a */
        public int f143531a;

        /* renamed from: b */
        public String f143532b;

        /* renamed from: c */
        public AbstractC58343b f143533c;

        /* renamed from: d */
        public int f143534d = -1;

        /* renamed from: e */
        public int f143535e = -1;

        /* renamed from: f */
        public int f143536f = -1;

        /* renamed from: g */
        public int f143537g = -1;

        /* renamed from: h */
        public int f143538h = -1;

        /* renamed from: i */
        public boolean f143539i = true;

        /* renamed from: j */
        public boolean f143540j;

        /* renamed from: k */
        public boolean f143541k = true;

        /* renamed from: l */
        public int f143542l = -1;

        /* renamed from: m */
        public int f143543m = -1;

        /* renamed from: com.ss.android.lark.widget.c.d$a$a */
        private static class C58342a {

            /* renamed from: a */
            View f143544a;

            /* renamed from: b */
            TextView f143545b;

            /* renamed from: c */
            View f143546c;

            /* renamed from: d */
            View f143547d;

            /* renamed from: e */
            View f143548e;

            /* renamed from: f */
            View f143549f;

            private C58342a() {
            }

            /* synthetic */ C58342a(C583401 r1) {
                this();
            }
        }

        /* renamed from: a */
        public AbstractC58343b mo197569a() {
            return this.f143533c;
        }

        /* renamed from: a */
        public C58341a mo197568a(int i) {
            this.f143535e = i;
            return this;
        }

        /* renamed from: b */
        public void mo197571b(int i) {
            this.f143536f = i;
        }

        /* renamed from: c */
        public C58341a mo197573c(int i) {
            this.f143537g = i;
            return this;
        }

        /* renamed from: d */
        public void mo197574d(int i) {
            this.f143542l = i;
        }

        /* renamed from: e */
        public void mo197575e(int i) {
            this.f143543m = i;
        }

        /* renamed from: b */
        public void mo197572b(boolean z) {
            this.f143539i = z;
        }

        /* renamed from: a */
        public void mo197570a(boolean z) {
            this.f143540j = z;
        }

        public C58341a(AbstractC58343b bVar) {
            this.f143533c = bVar;
        }

        public C58341a(String str, AbstractC58343b bVar) {
            this.f143532b = str;
            this.f143533c = bVar;
        }

        public C58341a(int i, String str, AbstractC58343b bVar) {
            this.f143531a = i;
            this.f143532b = str;
            this.f143533c = bVar;
        }

        /* renamed from: a */
        public View mo197542a(BaseAdapter baseAdapter, Context context, int i, View view, ViewGroup viewGroup) {
            C58342a aVar;
            int i2 = 0;
            if (view == null || !(view.getTag() instanceof C58342a)) {
                C58342a aVar2 = new C58342a(null);
                View inflate = LayoutInflater.from(context).inflate(R.layout.global_dialog_list_item, viewGroup, false);
                aVar2.f143544a = inflate;
                aVar2.f143546c = inflate.findViewById(R.id.divider);
                aVar2.f143545b = (TextView) inflate.findViewById(R.id.text_menu);
                aVar2.f143547d = inflate.findViewById(R.id.content);
                aVar2.f143548e = inflate.findViewById(R.id.header_divider);
                aVar2.f143549f = inflate.findViewById(R.id.layout_container);
                inflate.setTag(aVar2);
                aVar = aVar2;
                view = inflate;
            } else {
                aVar = (C58342a) view.getTag();
            }
            aVar.f143545b.setText(this.f143532b);
            if (!this.f143539i) {
                aVar.f143546c.setVisibility(8);
            } else if (i == baseAdapter.getCount() - 1) {
                aVar.f143546c.setVisibility(8);
            } else {
                aVar.f143546c.setVisibility(0);
            }
            if (this.f143536f != -1) {
                aVar.f143545b.setTextSize((float) this.f143536f);
            }
            if (this.f143535e != -1) {
                aVar.f143545b.setTextColor(context.getResources().getColor(this.f143535e));
            } else {
                aVar.f143545b.setTextColor(context.getResources().getColor(R.color.text_title));
            }
            int i3 = this.f143534d;
            if (i3 != -1) {
                view.setBackgroundResource(i3);
            }
            if (this.f143537g != -1) {
                aVar.f143546c.setBackgroundResource(this.f143537g);
            }
            if (this.f143542l != -1) {
                aVar.f143549f.getLayoutParams().height = this.f143542l;
            }
            View view2 = aVar.f143548e;
            if (!this.f143540j) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            return view;
        }
    }

    /* renamed from: com.ss.android.lark.widget.c.d$b */
    public interface AbstractC58343b {
        void onMenuItemClick();
    }

    /* renamed from: com.ss.android.lark.widget.c.d$c */
    public static class C58344c {

        /* renamed from: a */
        public Dialog f143550a;

        /* renamed from: b */
        public View.OnClickListener f143551b;

        /* renamed from: c */
        private C58337c f143552c;

        /* renamed from: d */
        private View f143553d;

        /* renamed from: a */
        public Dialog mo197576a() {
            return this.f143550a;
        }

        /* renamed from: a */
        public C58344c mo197577a(View.OnClickListener onClickListener) {
            this.f143551b = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C58344c mo197578a(boolean z) {
            if (z) {
                this.f143553d.setVisibility(0);
                this.f143553d.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.widget.p2932c.C58339d.C58344c.View$OnClickListenerC583451 */

                    public void onClick(View view) {
                        if (C58344c.this.f143551b != null) {
                            C58344c.this.f143551b.onClick(view);
                        }
                        if (C58344c.this.f143550a != null && C58344c.this.f143550a.isShowing()) {
                            C58344c.this.f143550a.dismiss();
                        }
                    }
                });
            } else {
                this.f143553d.setVisibility(8);
            }
            return this;
        }

        public C58344c(Context context, List<C58341a> list, String str) {
            m226208a(context, list, str);
        }

        /* renamed from: a */
        private void m226208a(Context context, final List<C58341a> list, String str) {
            this.f143550a = new BaseDialog(context, R.style.PopDialog);
            View inflate = LayoutInflater.from(context).inflate(R.layout.global_dialog_list, (ViewGroup) null);
            ListView listView = (ListView) inflate.findViewById(R.id.list_dialog);
            this.f143553d = inflate.findViewById(R.id.menu_cancel_item);
            this.f143552c = new C58337c(context, list);
            if (!TextUtils.isEmpty(str)) {
                this.f143552c.mo197562a(true);
                TextView textView = (TextView) inflate.findViewById(R.id.title_dialog);
                textView.setText(str);
                textView.setVisibility(0);
                inflate.findViewById(R.id.divider_title).setVisibility(0);
            }
            listView.setAdapter((ListAdapter) this.f143552c);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                /* class com.ss.android.lark.widget.p2932c.C58339d.C58344c.C583462 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C58341a aVar = (C58341a) list.get(i);
                    if (aVar != null && aVar.f143533c != null) {
                        aVar.f143533c.onMenuItemClick();
                        if (C58344c.this.f143550a.isShowing()) {
                            C58344c.this.f143550a.dismiss();
                        }
                    }
                }
            });
            this.f143550a.setContentView(inflate);
            this.f143550a.setCanceledOnTouchOutside(true);
        }
    }

    /* renamed from: a */
    public static Dialog m226190a(Context context, View view) {
        if (view == null) {
            return null;
        }
        Dialog b = m226197b(context, view);
        m226194a(context, b);
        return b;
    }

    /* renamed from: b */
    private static Dialog m226197b(Context context, View view) {
        if (view == null) {
            return null;
        }
        BaseDialog baseDialog = new BaseDialog(context, R.style.PopDialog);
        baseDialog.setContentView(view);
        baseDialog.setCanceledOnTouchOutside(true);
        return baseDialog;
    }

    /* renamed from: a */
    public static void m226194a(Context context, Dialog dialog) {
        if (!(context instanceof Activity) || C57582a.m223607a((Activity) context)) {
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = context.getResources().getDisplayMetrics().widthPixels;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            if (DesktopUtil.m144301a(context)) {
                window.setWindowAnimations(R.style.AnimFadeInFadeOut);
            } else {
                window.setWindowAnimations(R.style.AnimBottom);
            }
            window.setDimAmount(0.3f);
            dialog.show();
        }
    }

    /* renamed from: a */
    public static void m226195a(Context context, List<C58341a> list) {
        m226194a(context, m226192a(context, list, false));
    }

    /* renamed from: a */
    public static Dialog m226192a(Context context, List<C58341a> list, boolean z) {
        return m226191a(context, list, null, z, null);
    }

    /* renamed from: b */
    public static Dialog m226198b(Context context, List<C58341a> list, boolean z) {
        Dialog a = m226192a(context, list, z);
        C57810a.m224336a(context, a);
        return a;
    }

    /* renamed from: a */
    public static void m226196a(Context context, List<C58341a> list, String str) {
        C57810a.m224336a(context, m226191a(context, list, str, false, null));
    }

    /* renamed from: a */
    public static Dialog m226193a(Context context, List<C58341a> list, boolean z, View.OnClickListener onClickListener) {
        Dialog a = m226191a(context, list, null, z, onClickListener);
        C57810a.m224336a(context, a);
        return a;
    }

    /* renamed from: a */
    private static Dialog m226191a(Context context, List<C58341a> list, String str, boolean z, View.OnClickListener onClickListener) {
        return new C58344c(context, list, str).mo197578a(z).mo197577a(onClickListener).mo197576a();
    }
}
