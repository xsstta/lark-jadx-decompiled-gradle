package com.ss.android.lark.widget.photo_picker.p2943a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57759a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoDirectory;
import com.ss.android.lark.widget.photo_picker.p2943a.AbstractC58562a;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58609a;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58610b;
import com.ss.android.lark.widget.photo_picker.p2947b.AbstractC58611c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.a.b */
public class C58564b extends AbstractC58562a<C58571b> {

    /* renamed from: j */
    private static final int f144572j;

    /* renamed from: a */
    public AbstractC58611c f144573a;

    /* renamed from: b */
    public View.OnClickListener f144574b;

    /* renamed from: c */
    public AbstractC58610b f144575c;

    /* renamed from: g */
    public boolean f144576g;

    /* renamed from: h */
    public int f144577h;

    /* renamed from: i */
    public RecyclerView f144578i;

    /* renamed from: k */
    private LayoutInflater f144579k;

    /* renamed from: l */
    private IRequestCreator f144580l;

    /* renamed from: m */
    private AbstractC58609a f144581m;

    /* renamed from: n */
    private boolean f144582n;

    /* renamed from: o */
    private int f144583o;

    /* renamed from: p */
    private boolean f144584p;

    /* renamed from: q */
    private AbstractC58570a f144585q;

    /* renamed from: r */
    private final Context f144586r;

    /* renamed from: com.ss.android.lark.widget.photo_picker.a.b$a */
    public interface AbstractC58570a {
        /* renamed from: a */
        boolean mo198564a(Photo photo);
    }

    /* renamed from: a */
    public void mo198554a(List<Photo> list) {
        this.f144571f = list;
    }

    /* renamed from: a */
    public void mo198555a(boolean z) {
        this.f144582n = z;
    }

    static {
        int i;
        if (DesktopUtil.m144307b()) {
            i = 4;
        } else {
            i = 3;
        }
        f144572j = i;
    }

    /* renamed from: h */
    public boolean mo198558h() {
        if (!this.f144582n || this.f144570e != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public ArrayList<String> mo198557g() {
        ArrayList<String> arrayList = new ArrayList<>(mo198538b());
        for (Photo photo : this.f144571f) {
            arrayList.add(photo.getPath());
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i;
        if (this.f144569d.size() == 0) {
            i = 0;
        } else {
            i = mo198542e().size();
        }
        if (mo198558h()) {
            return i + 1;
        }
        Log.m165379d("PhotoGridAdapter", "photo counts: " + i);
        return i;
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.a.b$b */
    public static class C58571b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f144597a;

        /* renamed from: b */
        public CheckBox f144598b;

        /* renamed from: c */
        public View f144599c;

        /* renamed from: d */
        public TextView f144600d;

        /* renamed from: e */
        public View f144601e;

        /* renamed from: a */
        private void m227197a() {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f144598b.getLayoutParams();
            layoutParams.topMargin = UIUtils.dp2px(this.itemView.getContext(), (float) PhotoPickerUIConstants.f144602a);
            layoutParams.rightMargin = UIUtils.dp2px(this.itemView.getContext(), (float) PhotoPickerUIConstants.f144602a);
            layoutParams.width = UIUtils.dp2px(this.itemView.getContext(), (float) PhotoPickerUIConstants.f144603b);
            layoutParams.height = UIUtils.dp2px(this.itemView.getContext(), (float) PhotoPickerUIConstants.f144603b);
            this.f144598b.setTextSize((float) PhotoPickerUIConstants.f144605d);
            this.f144598b.setBackgroundResource(PhotoPickerUIConstants.f144604c);
        }

        public C58571b(View view) {
            super(view);
            this.f144597a = (ImageView) view.findViewById(R.id.iv_photo);
            this.f144598b = (CheckBox) view.findViewById(R.id.v_selected);
            this.f144599c = view.findViewById(R.id.v_mask);
            this.f144600d = (TextView) view.findViewById(R.id.tv_duration);
            this.f144601e = view.findViewById(R.id.video_info_container);
            m227197a();
        }
    }

    /* renamed from: a */
    public void mo198547a(View.OnClickListener onClickListener) {
        this.f144574b = onClickListener;
    }

    /* renamed from: b */
    public void mo198556b(boolean z) {
        this.f144576g = z;
    }

    /* renamed from: a */
    public void mo198548a(AbstractC58570a aVar) {
        this.f144585q = aVar;
    }

    /* renamed from: a */
    public void onViewRecycled(C58571b bVar) {
        ImageLoader.clear(bVar.f144597a);
        super.onViewRecycled(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (!mo198558h() || i != 0) {
            return 101;
        }
        return 100;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f144578i = recyclerView;
        m227178a(recyclerView.getContext(), this.f144583o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        Photo photo;
        List<Photo> e = mo198542e();
        if (getItemViewType(i) == 101) {
            if (!mo198558h() || i <= 1) {
                photo = e.get(i);
            } else {
                photo = e.get(i - 1);
            }
            if (photo != null) {
                return (long) photo.getId();
            }
        }
        return (long) i;
    }

    /* renamed from: a */
    public void mo198551a(AbstractC58609a aVar) {
        this.f144581m = aVar;
    }

    /* renamed from: a */
    public void mo198552a(AbstractC58610b bVar) {
        this.f144575c = bVar;
    }

    /* renamed from: a */
    public void mo198553a(AbstractC58611c cVar) {
        this.f144573a = cVar;
    }

    /* renamed from: a */
    private void m227178a(final Context context, final int i) {
        this.f144583o = i;
        this.f144578i.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.widget.photo_picker.p2943a.C58564b.ViewTreeObserver$OnGlobalLayoutListenerC585662 */

            public void onGlobalLayout() {
                if (!DesktopUtil.m144301a(context)) {
                    C58564b.this.f144577h = DeviceUtils.getScreenWidth(context) / i;
                } else {
                    C58564b bVar = C58564b.this;
                    bVar.f144577h = bVar.f144578i.getWidth() / i;
                }
                C58564b.this.f144578i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    /* renamed from: a */
    public C58571b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C58571b bVar = new C58571b(this.f144579k.inflate(R.layout.__picker_item_photo, viewGroup, false));
        if (i == 100) {
            bVar.f144598b.setVisibility(8);
            bVar.f144597a.setScaleType(ImageView.ScaleType.CENTER);
            bVar.f144597a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.p2943a.C58564b.View$OnClickListenerC585673 */

                public void onClick(View view) {
                    if (C58564b.this.f144574b != null) {
                        C58564b.this.f144574b.onClick(view);
                    }
                }
            });
        } else if (i == 101 && !this.f144584p) {
            bVar.f144598b.setVisibility(8);
        }
        return bVar;
    }

    /* renamed from: a */
    private void m227179a(C58571b bVar, Photo photo) {
        if (C57759a.m224180a(bVar.f144597a.getContext())) {
            String path = photo.getPath();
            DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.ALL;
            if (path != null && path.toLowerCase().endsWith(".gif")) {
                diskCacheStrategy = DiskCacheStrategy.SOURCE;
            }
            IRequestCreator diskCacheStrategy2 = ImageLoader.with(this.f144578i.getContext()).placeholder(R.drawable.__picker_ic_photo_black_48dp).error(R.drawable.__picker_ic_broken_image_black_48dp).load(path).centerCrop().thumbnail(0.5f).dontAnimate(false).diskCacheStrategy(diskCacheStrategy);
            int i = this.f144577h;
            diskCacheStrategy2.override(i, i).into(bVar.f144597a);
        }
    }

    /* renamed from: a */
    public void mo198546a(int i, Photo photo) {
        AbstractC58609a aVar = this.f144581m;
        boolean z = true;
        int i2 = 1;
        if (aVar != null) {
            int size = mo198540c().size();
            if (mo198537a(photo)) {
                i2 = -1;
            }
            z = aVar.mo147717a(i, photo, size + i2);
        }
        if (z) {
            mo198539b(photo);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void onBindViewHolder(final C58571b bVar, int i) {
        final Photo photo;
        AbstractC58570a aVar;
        if (getItemViewType(i) == 101) {
            List<Photo> e = mo198542e();
            if (mo198558h()) {
                photo = e.get(i - 1);
            } else {
                photo = e.get(i);
            }
            if (photo.isVideo()) {
                bVar.f144601e.setVisibility(0);
                bVar.f144600d.setText(C26279i.m95149a((int) photo.getDuration()));
            } else {
                bVar.f144601e.setVisibility(8);
            }
            m227179a(bVar, photo);
            boolean a = mo198537a(photo);
            bVar.f144598b.setChecked(a);
            if (a) {
                bVar.f144598b.setText(String.valueOf(this.f144571f.indexOf(photo) + 1));
            } else {
                bVar.f144598b.setText("");
            }
            bVar.f144597a.setSelected(a);
            bVar.f144599c.setVisibility(8);
            if (!a && (aVar = this.f144585q) != null && aVar.mo198564a(photo)) {
                bVar.f144599c.setVisibility(0);
            }
            bVar.f144597a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.p2943a.C58564b.View$OnClickListenerC585684 */

                public void onClick(View view) {
                    if (C58564b.this.f144573a != null && bVar.getAdapterPosition() != -1) {
                        int adapterPosition = bVar.getAdapterPosition();
                        if (C58564b.this.f144576g) {
                            C58564b.this.f144573a.mo147710a(view, adapterPosition, C58564b.this.mo198558h());
                            return;
                        }
                        bVar.f144598b.performClick();
                        if (C58564b.this.f144575c != null) {
                            C58564b.this.f144575c.mo198628a(view, adapterPosition);
                        }
                    }
                }
            });
            bVar.f144598b.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.p2943a.C58564b.View$OnClickListenerC585695 */

                public void onClick(View view) {
                    int adapterPosition = bVar.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C58564b.this.mo198546a(adapterPosition, photo);
                    }
                }
            });
            if (DesktopUtil.m144301a(this.f144578i.getContext())) {
                bVar.f144597a.setPadding(UIHelper.dp2px(2.0f), UIHelper.dp2px(2.0f), UIHelper.dp2px(2.0f), UIHelper.dp2px(2.0f));
                return;
            }
            return;
        }
        bVar.f144597a.setImageResource(R.drawable.__picker_ic_camera_new);
    }

    public C58564b(Context context, IRequestCreator iRequestCreator, List<PhotoDirectory> list) {
        this.f144582n = true;
        this.f144576g = true;
        this.f144583o = f144572j;
        this.f144584p = true;
        this.f144569d = list;
        this.f144580l = iRequestCreator;
        this.f144579k = LayoutInflater.from(context);
        this.f144586r = context;
        if (DesktopUtil.m144301a(context)) {
            setHasStableIds(true);
        }
    }

    public C58564b(Context context, IRequestCreator iRequestCreator, List<PhotoDirectory> list, ArrayList<Photo> arrayList, int i, boolean z) {
        this(context, iRequestCreator, list);
        this.f144571f = new ArrayList();
        this.f144584p = z;
        this.f144583o = i;
        if (arrayList != null) {
            m227167a(arrayList, new AbstractC58562a.AbstractC58563a<Photo>() {
                /* class com.ss.android.lark.widget.photo_picker.p2943a.C58564b.C585651 */

                /* renamed from: a */
                public boolean mo198544a(Photo photo) {
                    return photo != null;
                }
            });
            this.f144571f.addAll(arrayList);
        }
    }
}
