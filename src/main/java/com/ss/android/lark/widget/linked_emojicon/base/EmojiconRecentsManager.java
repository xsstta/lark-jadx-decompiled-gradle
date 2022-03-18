package com.ss.android.lark.widget.linked_emojicon.base;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.lark.widget.linked_emojicon.base.emoji.Emojicon;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class EmojiconRecentsManager extends ArrayList<Emojicon> {
    private static final Object LOCK = new Object();
    private static volatile EmojiconRecentsManager mInstance = null;
    private static int maximumSize = 40;
    private Context mContext;

    private void loadRecents() {
        StringTokenizer stringTokenizer = new StringTokenizer(getPreferences(this.mContext).getString("recent_emojis", ""), ",");
        while (stringTokenizer.hasMoreTokens()) {
            add(Emojicon.m226971a(stringTokenizer.nextToken()));
        }
    }

    private void saveRecents() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(((Emojicon) get(i)).mo198302a());
            if (i < size - 1) {
                sb.append(",");
            }
        }
        getPreferences(this.mContext).edit().putString("recent_emojis", sb.toString()).commit();
    }

    private SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences("emojicon", 0);
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        saveRecents();
        return remove;
    }

    private EmojiconRecentsManager(Context context) {
        this.mContext = context;
        loadRecents();
    }

    public int getRecentPage(Context context) {
        return getPreferences(context).getInt("recent_page", 0);
    }

    public void push(Emojicon emojicon) {
        if (contains(emojicon)) {
            super.remove(emojicon);
        }
        add(0, emojicon);
    }

    public static EmojiconRecentsManager getInstance(Context context) {
        if (mInstance == null) {
            synchronized (EmojiconRecentsManager.class) {
                if (mInstance == null) {
                    mInstance = new EmojiconRecentsManager(context);
                }
            }
        }
        return mInstance;
    }

    public boolean add(Emojicon emojicon) {
        boolean add = super.add((Object) emojicon);
        while (size() > maximumSize) {
            super.remove(0);
        }
        saveRecents();
        return add;
    }

    public void setRecentPage(Context context, int i) {
        getPreferences(context).edit().putInt("recent_page", i).commit();
    }

    public void add(int i, Emojicon emojicon) {
        super.add(i, (Object) emojicon);
        if (i == 0) {
            while (true) {
                int size = size();
                int i2 = maximumSize;
                if (size <= i2) {
                    break;
                }
                super.remove(i2);
            }
        } else {
            while (size() > maximumSize) {
                super.remove(0);
            }
        }
        saveRecents();
    }
}
