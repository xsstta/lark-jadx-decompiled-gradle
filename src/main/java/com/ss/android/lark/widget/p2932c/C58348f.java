package com.ss.android.lark.widget.p2932c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.C58348f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.c.f */
public class C58348f {

    /* renamed from: com.ss.android.lark.widget.c.f$d */
    public interface AbstractC58353d {
        void onMenuItemClick(int i, View view);
    }

    /* renamed from: com.ss.android.lark.widget.c.f$a */
    public static class C58350a {

        /* renamed from: a */
        private List<C58351b> f143563a = new ArrayList();

        /* renamed from: b */
        private Context f143564b;

        /* renamed from: c */
        private float f143565c = 14.0f;

        /* renamed from: d */
        private int f143566d = 12;

        /* renamed from: e */
        private Drawable f143567e = null;

        /* renamed from: f */
        private AbstractC58353d f143568f = null;

        /* renamed from: g */
        private int f143569g = 8388611;

        /* renamed from: a */
        public PopupWindow mo197581a() {
            return C58348f.m226213a(this.f143564b, this.f143565c, this.f143566d, this.f143567e, this.f143569g, this.f143563a, this.f143568f);
        }

        /* renamed from: a */
        public C58350a mo197582a(float f) {
            this.f143565c = f;
            return this;
        }

        /* renamed from: b */
        public C58350a mo197589b(int i) {
            this.f143569g = i;
            return this;
        }

        /* renamed from: a */
        public C58350a mo197583a(int i) {
            this.f143566d = i;
            return this;
        }

        public C58350a(Context context) {
            this.f143564b = context;
        }

        /* renamed from: a */
        public C58350a mo197586a(Drawable drawable) {
            this.f143567e = drawable;
            return this;
        }

        /* renamed from: a */
        public C58350a mo197587a(AbstractC58353d dVar) {
            this.f143568f = dVar;
            return this;
        }

        /* renamed from: a */
        public C58350a mo197588a(List<C58351b> list) {
            this.f143563a.addAll(list);
            return this;
        }

        /* renamed from: a */
        public C58350a mo197584a(int i, String str, Drawable drawable) {
            this.f143563a.add(new C58351b(i, str, drawable, false));
            return this;
        }

        /* renamed from: a */
        public C58350a mo197585a(int i, String str, Drawable drawable, boolean z) {
            this.f143563a.add(new C58351b(i, str, drawable, z));
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.widget.c.f$c */
    private static class C58352c extends RecyclerView.ViewHolder {
        public C58352c(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m226214a(AbstractC58353d dVar, PopupWindow popupWindow, View view) {
        dVar.onMenuItemClick(((Integer) view.getTag()).intValue(), view);
        popupWindow.dismiss();
    }

    /* renamed from: com.ss.android.lark.widget.c.f$b */
    public static class C58351b {

        /* renamed from: a */
        public int f143570a;

        /* renamed from: b */
        public String f143571b;

        /* renamed from: c */
        public Drawable f143572c;

        /* renamed from: d */
        public boolean f143573d;

        public C58351b(int i, String str, Drawable drawable, boolean z) {
            this.f143570a = i;
            this.f143571b = str;
            this.f143572c = drawable;
            this.f143573d = z;
        }
    }

    /* renamed from: a */
    public static PopupWindow m226213a(final Context context, final float f, final int i, Drawable drawable, final int i2, final List<C58351b> list, AbstractC58353d dVar) {
        final $$Lambda$f$Qf29kGfB1tYAZJDW0nfUQaTAHlA r5;
        PopupWindow popupWindow = new PopupWindow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.setPadding(i, i, i, i);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        if (dVar != null) {
            r5 = new View.OnClickListener(popupWindow) {
                /* class com.ss.android.lark.widget.p2932c.$$Lambda$f$Qf29kGfB1tYAZJDW0nfUQaTAHlA */
                public final /* synthetic */ PopupWindow f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C58348f.m226214a(C58348f.AbstractC58353d.this, this.f$1, view);
                }
            };
        } else {
            r5 = null;
        }
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            /* class com.ss.android.lark.widget.p2932c.C58348f.C583491 */

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return list.size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                TextView textView = (TextView) viewHolder.itemView;
                C58351b bVar = (C58351b) list.get(i);
                textView.setText(bVar.f143571b);
                textView.setTag(Integer.valueOf(bVar.f143570a));
                textView.setSelected(bVar.f143573d);
                textView.setCompoundDrawablesWithIntrinsicBounds(bVar.f143572c, (Drawable) null, (Drawable) null, (Drawable) null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                TextView textView = new TextView(context);
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                textView.setMinWidth(UIUtils.dp2px(context, 80.0f));
                textView.setLayoutParams(layoutParams);
                textView.setTextSize(f);
                textView.setGravity(i2);
                textView.setTextColor(textView.getContext().getResources().getColor(R.color.lkui_N900));
                textView.setCompoundDrawablePadding(i);
                textView.setPadding(UIHelper.dp2px(16.0f), UIHelper.dp2px(11.0f), UIHelper.dp2px(16.0f), UIHelper.dp2px(11.0f));
                textView.setOnClickListener(r5);
                textView.setMaxLines(1);
                textView.setOnTouchListener(new View.OnTouchListener(textView) {
                    /* class com.ss.android.lark.widget.p2932c.$$Lambda$f$1$67Mv6FrUYbUt2zgXkzogJLnI */
                    public final /* synthetic */ TextView f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C58348f.C583491.m226216b(this.f$0, view, motionEvent);
                    }
                });
                textView.setOnHoverListener(new View.OnHoverListener(textView) {
                    /* class com.ss.android.lark.widget.p2932c.$$Lambda$f$1$GsogMRha_mNtlnqw4_qB5xHdYTs */
                    public final /* synthetic */ TextView f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final boolean onHover(View view, MotionEvent motionEvent) {
                        return C58348f.C583491.m226215a(this.f$0, view, motionEvent);
                    }
                });
                return new C58352c(textView);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public static /* synthetic */ boolean m226216b(TextView textView, View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    textView.setBackgroundResource(R.color.lkui_N300);
                    return false;
                } else if (action != 1 && action != 3) {
                    return false;
                } else {
                    textView.setBackgroundResource(R.color.lkui_N00);
                    return false;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ boolean m226215a(TextView textView, View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 9) {
                    textView.setHovered(true);
                    textView.setBackgroundResource(R.color.lkui_N200);
                } else if (action == 10) {
                    textView.setHovered(false);
                    textView.setBackgroundResource(R.color.lkui_N00);
                }
                return false;
            }
        });
        frameLayout.addView(recyclerView);
        frameLayout.setPadding(0, 10, 0, 10);
        popupWindow.setContentView(frameLayout);
        popupWindow.setBackgroundDrawable(drawable);
        popupWindow.setOutsideTouchable(true);
        return popupWindow;
    }
}
