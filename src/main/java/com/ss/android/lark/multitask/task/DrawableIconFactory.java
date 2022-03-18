package com.ss.android.lark.multitask.task;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.task.Task;

public class DrawableIconFactory implements Task.IconFactory {
    public static final Parcelable.Creator<DrawableIconFactory> CREATOR = new Parcelable.Creator<DrawableIconFactory>() {
        /* class com.ss.android.lark.multitask.task.DrawableIconFactory.C483521 */

        /* renamed from: a */
        public DrawableIconFactory[] newArray(int i) {
            return new DrawableIconFactory[i];
        }

        /* renamed from: a */
        public DrawableIconFactory createFromParcel(Parcel parcel) {
            return new DrawableIconFactory(parcel);
        }
    };
    private final int id;
    private String name;

    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String saveArgs() {
        return this.name;
    }

    public String toString() {
        return "DrawableIconFactory{id=" + this.id + ", name='" + this.name + '\'' + '}';
    }

    public DrawableIconFactory(int i) {
        this(i, null);
    }

    protected DrawableIconFactory(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
    }

    public DrawableIconFactory(String str) {
        this(0, str);
    }

    public DrawableIconFactory(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }

    public Drawable createDrawableForTask(Context context, C48376q qVar) {
        if (this.name == null) {
            return ContextCompat.getDrawable(context, this.id);
        }
        try {
            return ContextCompat.getDrawable(context, context.getResources().getIdentifier(this.name, "drawable", context.getPackageName()));
        } catch (Resources.NotFoundException unused) {
            Log.m165397w("MULTITASK-DrawableIconFactory", "createDrawableForTask failed, name = " + this.name);
            return new ColorDrawable(0);
        }
    }

    @Override // com.ss.android.lark.multitask.task.Task.IconFactory
    public void createDrawableForTask(Context context, C48376q qVar, ImageView imageView) {
        imageView.setImageDrawable(createDrawableForTask(context, qVar));
    }
}
