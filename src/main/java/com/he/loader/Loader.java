package com.he.loader;

import android.net.Uri;

public interface Loader {
    void load(String str, Resolver resolver);

    Uri loadMedia(String str);

    byte[] loadSync(String str);

    void loadUrl(String str, Resolver resolver);
}
