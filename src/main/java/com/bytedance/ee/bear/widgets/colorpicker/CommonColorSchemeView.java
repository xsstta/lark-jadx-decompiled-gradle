package com.bytedance.ee.bear.widgets.colorpicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;

public class CommonColorSchemeView extends LinearLayout {

    /* renamed from: a */
    private CommonColorPicker f31886a;

    /* renamed from: b */
    private RecyclerView f31887b;

    /* renamed from: c */
    private C11828b f31888c;

    /* renamed from: d */
    private AbstractC11827a f31889d;

    /* renamed from: e */
    private ColorScheme[] f31890e;

    /* renamed from: f */
    private String f31891f;

    /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView$a */
    public interface AbstractC11827a {
        /* renamed from: a */
        void mo18274a(String str);

        /* renamed from: b */
        void mo18275b(String str);
    }

    public static class ColorScheme implements NonProguard {
        private String[] colorList;
        private String defaultColor;
        private String topicColor;

        public ColorScheme() {
        }

        public String[] getColorList() {
            return this.colorList;
        }

        public String getDefaultColor() {
            return this.defaultColor;
        }

        public String getTopicColor() {
            return this.topicColor;
        }

        public void setColorList(String[] strArr) {
            this.colorList = strArr;
        }

        public void setDefaultColor(String str) {
            this.defaultColor = str;
        }

        public void setTopicColor(String str) {
            this.topicColor = str;
        }

        public ColorScheme(String str, String str2, String[] strArr) {
            this.topicColor = str;
            this.defaultColor = str2;
            this.colorList = strArr;
        }
    }

    /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView$b */
    public static class C11828b extends RecyclerView.Adapter<C11831b> {

        /* renamed from: a */
        public String[] f31892a;

        /* renamed from: b */
        public AbstractC11830a f31893b;

        /* renamed from: c */
        private String f31894c;

        /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView$b$a */
        public interface AbstractC11830a {
            void onSpecificColorSelected(String str);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            String[] strArr = this.f31892a;
            if (strArr == null) {
                return 0;
            }
            return strArr.length;
        }

        /* renamed from: a */
        public void mo45331a(AbstractC11830a aVar) {
            this.f31893b = aVar;
        }

        /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView$b$b */
        public class C11831b extends RecyclerView.ViewHolder {

            /* renamed from: a */
            View f31897a;

            /* renamed from: b */
            View f31898b;

            /* renamed from: a */
            public void mo45334a(int i) {
                ViewGroup.LayoutParams layoutParams = this.f31897a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                    this.f31897a.setLayoutParams(layoutParams);
                }
            }

            public C11831b(View view) {
                super(view);
                this.f31897a = view.findViewById(R.id.outer_layer);
                this.f31898b = view.findViewById(R.id.check_flag);
            }
        }

        /* renamed from: a */
        public void mo45333a(String[] strArr, String str) {
            this.f31892a = strArr;
            this.f31894c = str;
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public C11831b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C11831b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.common_color_scheme_specific_item, (ViewGroup) null));
        }

        /* renamed from: a */
        public void onBindViewHolder(C11831b bVar, int i) {
            int i2;
            final String str = this.f31892a[i];
            if (!TextUtils.isEmpty(str)) {
                Resources resources = bVar.itemView.getContext().getResources();
                bVar.mo45334a((C13749l.m55736a() - (resources.getDimensionPixelSize(R.dimen.space_kit_len_16) * 2)) / getItemCount());
                boolean equalsIgnoreCase = str.equalsIgnoreCase(this.f31894c);
                View view = bVar.f31898b;
                int i3 = 0;
                if (equalsIgnoreCase) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                if (i == 0) {
                    bVar.f31897a.setBackground(resources.getDrawable(R.drawable.common_specific_color_outer_left_layer));
                } else if (i == getItemCount() - 1) {
                    bVar.f31897a.setBackground(resources.getDrawable(R.drawable.common_specific_color_outer_right_layer));
                } else {
                    bVar.f31897a.setBackground(resources.getDrawable(R.drawable.common_specific_color_outer_middle_layer));
                }
                GradientDrawable gradientDrawable = (GradientDrawable) bVar.f31897a.getBackground().mutate();
                gradientDrawable.setColor(ColorUtils.m55697a(str));
                if ("#ffffff".equalsIgnoreCase(str) || "#ffffffff".equalsIgnoreCase(str)) {
                    i3 = resources.getDimensionPixelSize(R.dimen.space_kit_len_1);
                }
                gradientDrawable.setStroke(i3, resources.getColor(R.color.space_kit_n300));
                bVar.f31897a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.C11828b.C118291 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        C11828b bVar = C11828b.this;
                        bVar.mo45333a(bVar.f31892a, str);
                        if (C11828b.this.f31893b != null) {
                            C11828b.this.f31893b.onSpecificColorSelected(str);
                        }
                    }
                });
            }
        }
    }

    public void setDelegate(AbstractC11827a aVar) {
        this.f31889d = aVar;
    }

    public CommonColorSchemeView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m49065b(String str) {
        AbstractC11827a aVar = this.f31889d;
        if (aVar != null) {
            aVar.mo18275b(str);
        }
    }

    public void setTopicColorViewType(int i) {
        this.f31886a.setViewType(i);
    }

    public void setSpecificColorPickerHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.f31887b.getLayoutParams();
        layoutParams.height = i;
        this.f31887b.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49066c(String str) {
        this.f31891f = str;
        ColorScheme[] colorSchemeArr = this.f31890e;
        int length = colorSchemeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ColorScheme colorScheme = colorSchemeArr[i];
            if (this.f31891f.equalsIgnoreCase(colorScheme.getTopicColor())) {
                this.f31888c.mo45333a(colorScheme.getColorList(), colorScheme.getDefaultColor());
                break;
            }
            i++;
        }
        AbstractC11827a aVar = this.f31889d;
        if (aVar != null) {
            aVar.mo18274a(str);
        }
    }

    public CommonColorSchemeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo45320a(ColorScheme[] colorSchemeArr, String str) {
        if (!(colorSchemeArr == null || colorSchemeArr.length == 0)) {
            String[] strArr = new String[colorSchemeArr.length];
            int i = 0;
            String str2 = "";
            boolean z = false;
            for (int i2 = 0; i2 < colorSchemeArr.length; i2++) {
                strArr[i2] = colorSchemeArr[i2].getTopicColor();
                if (!(TextUtils.isEmpty(str) || colorSchemeArr[i2].getColorList() == null || colorSchemeArr[i2].getColorList().length == 0)) {
                    for (String str3 : colorSchemeArr[i2].getColorList()) {
                        if (str.equalsIgnoreCase(str3) && (strArr[i2].equalsIgnoreCase(this.f31891f) || TextUtils.isEmpty(str2))) {
                            str2 = strArr[i2];
                            this.f31888c.mo45333a(colorSchemeArr[i2].getColorList(), str);
                            z = true;
                        }
                    }
                }
            }
            this.f31890e = colorSchemeArr;
            this.f31891f = str2;
            this.f31886a.mo45306a(strArr, str2);
            RecyclerView recyclerView = this.f31887b;
            if (!z) {
                i = 8;
            }
            recyclerView.setVisibility(i);
        }
    }

    public CommonColorSchemeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.common_color_scheme_view, (ViewGroup) this, true);
        CommonColorPicker commonColorPicker = (CommonColorPicker) findViewById(R.id.topic_color_picker);
        this.f31886a = commonColorPicker;
        commonColorPicker.setOnSelectColorListener(new CommonColorPicker.OnSelectColorListener() {
            /* class com.bytedance.ee.bear.widgets.colorpicker.$$Lambda$CommonColorSchemeView$kAORTyBeSe7Mzn3x_l9uvvqpUrY */

            @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker.OnSelectColorListener
            public final void onColorSelected(String str) {
                CommonColorSchemeView.this.m49066c(str);
            }
        });
        this.f31887b = (RecyclerView) findViewById(R.id.specific_colors_recycler_view);
        C11828b bVar = new C11828b();
        this.f31888c = bVar;
        bVar.mo45331a(new C11828b.AbstractC11830a() {
            /* class com.bytedance.ee.bear.widgets.colorpicker.$$Lambda$CommonColorSchemeView$RXDjXfN2lnoQViZpY8CiVgtRwG4 */

            @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.C11828b.AbstractC11830a
            public final void onSpecificColorSelected(String str) {
                CommonColorSchemeView.this.m49065b(str);
            }
        });
        this.f31887b.setAdapter(this.f31888c);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f31887b.setLayoutManager(linearLayoutManager);
    }

    /* renamed from: a */
    public void mo45319a(int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = this.f31886a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, i2, i3, i4);
            this.f31886a.setLayoutParams(layoutParams);
        }
    }
}
