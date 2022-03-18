package com.tt.miniapp.feedback.entrance.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImageUploadView extends LinearLayout {

    /* renamed from: a */
    private Context f166951a;

    /* renamed from: b */
    private GridView f166952b;

    /* renamed from: c */
    private AbstractC66150c f166953c;

    /* renamed from: d */
    private AbstractC66149b f166954d;

    /* renamed from: e */
    private C66145a f166955e;

    /* renamed from: f */
    private ArrayList<C66152e> f166956f;

    /* renamed from: g */
    private int f166957g;

    /* renamed from: h */
    private int f166958h;

    /* renamed from: i */
    private int f166959i;

    /* renamed from: j */
    private boolean f166960j;

    /* renamed from: k */
    private int f166961k;

    /* renamed from: l */
    private int f166962l;

    public AbstractC66149b getImageClickListener() {
        return this.f166954d;
    }

    public ArrayList<C66152e> getImageList() {
        return this.f166956f;
    }

    public AbstractC66150c getImageLoaderInterface() {
        return this.f166953c;
    }

    public int getMaxNum() {
        return this.f166962l;
    }

    public int getOneLineShowNum() {
        return this.f166961k;
    }

    public int getmAddLabel() {
        return this.f166958h;
    }

    public int getmDelLabel() {
        return this.f166959i;
    }

    public int getmPicSize() {
        return this.f166957g;
    }

    public void setImageList(ArrayList<C66152e> arrayList) {
        this.f166956f = arrayList;
    }

    public ImageUploadView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public ImageUploadView mo231347a(int i) {
        this.f166957g = i;
        this.f166955e.mo231369b(i);
        return this;
    }

    /* renamed from: b */
    public ImageUploadView mo231353b(int i) {
        this.f166961k = i;
        this.f166952b.setNumColumns(i);
        return this;
    }

    /* renamed from: c */
    public ImageUploadView mo231354c(int i) {
        this.f166962l = i;
        this.f166955e.mo231365a(i);
        return this;
    }

    /* renamed from: a */
    public ImageUploadView mo231348a(AbstractC66149b bVar) {
        this.f166954d = bVar;
        this.f166955e.mo231366a(bVar);
        return this;
    }

    /* renamed from: d */
    public void mo231355d(int i) {
        this.f166956f.remove(i);
        C66145a aVar = this.f166955e;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public ImageUploadView mo231349a(AbstractC66150c cVar) {
        this.f166953c = cVar;
        this.f166955e.mo231367a(cVar);
        return this;
    }

    /* renamed from: a */
    public ImageUploadView mo231350a(boolean z) {
        this.f166960j = z;
        this.f166955e.mo231368a(z);
        return this;
    }

    /* renamed from: a */
    public void mo231351a(C66152e eVar) {
        if (eVar != null) {
            this.f166956f.add(eVar);
            C66145a aVar = this.f166955e;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    public ImageUploadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static int m258975a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private void m258976a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.add_res, R.attr.del_res, R.attr.is_show_del, R.attr.max_num, R.attr.one_line_show_num, R.attr.pic_size});
        this.f166957g = obtainStyledAttributes.getDimensionPixelSize(5, m258975a(context, 80.0f));
        this.f166960j = obtainStyledAttributes.getBoolean(2, true);
        this.f166958h = obtainStyledAttributes.getResourceId(0, 2131234519);
        this.f166959i = obtainStyledAttributes.getResourceId(1, R.drawable.microapp_m_deleteimage_feedback);
        this.f166961k = obtainStyledAttributes.getInt(4, 4);
        this.f166962l = obtainStyledAttributes.getInt(3, 9);
        obtainStyledAttributes.recycle();
        this.f166956f = new ArrayList<>();
        GridView gridView = new GridView(context);
        this.f166952b = gridView;
        gridView.setNumColumns(this.f166961k);
        C66145a aVar = new C66145a(context, this.f166956f);
        this.f166955e = aVar;
        aVar.mo231369b(this.f166957g);
        this.f166955e.mo231371d(this.f166958h);
        this.f166955e.mo231370c(this.f166959i);
        this.f166952b.setAdapter((ListAdapter) this.f166955e);
        addView(this.f166952b);
    }

    /* renamed from: a */
    public void mo231352a(List<C66152e> list, boolean z) {
        if (list != null) {
            for (C66152e eVar : list) {
                Iterator<C66152e> it = getImageList().iterator();
                while (it.hasNext()) {
                    C66152e next = it.next();
                    if (eVar.mo231382b() == next.mo231382b()) {
                        if (z) {
                            next.mo231381a(2);
                        } else {
                            it.remove();
                        }
                    }
                }
            }
            C66145a aVar = this.f166955e;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    public ImageUploadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f166951a = context;
        m258976a(context, attributeSet);
    }
}
