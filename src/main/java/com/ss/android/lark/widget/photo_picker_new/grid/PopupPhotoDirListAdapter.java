package com.ss.android.lark.widget.photo_picker_new.grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker_impl.bean.PhotoDir;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/PopupPhotoDirListAdapter;", "Landroid/widget/BaseAdapter;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "(Ljava/util/List;)V", "dirData", "", "getCount", "", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "view", "parent", "Landroid/view/ViewGroup;", "setData", "", "ViewHolder", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.d.a.e */
public final class PopupPhotoDirListAdapter extends BaseAdapter {

    /* renamed from: a */
    private final List<PhotoDir> f143659a;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f143659a.size();
    }

    /* renamed from: a */
    public PhotoDir getItem(int i) {
        return this.f143659a.get(i);
    }

    public PopupPhotoDirListAdapter(List<PhotoDir> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ArrayList arrayList = new ArrayList();
        this.f143659a = arrayList;
        arrayList.addAll(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker_new/grid/PopupPhotoDirListAdapter$ViewHolder;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "ivCover", "Landroid/widget/ImageView;", "tvCount", "Landroid/widget/TextView;", "tvName", "bindData", "", "context", "Landroid/content/Context;", "directory", "Lcom/ss/android/lark/widget/photo_picker_impl/bean/PhotoDir;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.d.a.e$a */
    private static final class ViewHolder {

        /* renamed from: a */
        private ImageView f143660a;

        /* renamed from: b */
        private TextView f143661b;

        /* renamed from: c */
        private TextView f143662c;

        public ViewHolder(View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            View findViewById = view.findViewById(R.id.iv_dir_cover);
            if (findViewById != null) {
                this.f143660a = (ImageView) findViewById;
                View findViewById2 = view.findViewById(R.id.tv_dir_name);
                if (findViewById2 != null) {
                    this.f143661b = (TextView) findViewById2;
                    View findViewById3 = view.findViewById(R.id.tv_dir_count);
                    if (findViewById3 != null) {
                        this.f143662c = (TextView) findViewById3;
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        }

        /* renamed from: a */
        public final void mo197677a(Context context, PhotoDir cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "directory");
            ImageLoader.with(context).load(cVar.mo199617e()).thumbnail(0.1f).into(this.f143660a);
            this.f143661b.setText(cVar.mo199612b());
            this.f143662c.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PickerImageCount, "image_count", String.valueOf(cVar.mo199616d())));
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (view == null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.__picker_item_directory, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "convertView");
            ViewHolder aVar = new ViewHolder(inflate);
            inflate.setTag(aVar);
            aVar.mo197677a(viewGroup.getContext(), this.f143659a.get(i));
            return inflate;
        }
        Object tag = view.getTag();
        if (tag != null) {
            ((ViewHolder) tag).mo197677a(viewGroup.getContext(), this.f143659a.get(i));
            return view;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.widget.photo_picker_new.grid.PopupPhotoDirListAdapter.ViewHolder");
    }
}
