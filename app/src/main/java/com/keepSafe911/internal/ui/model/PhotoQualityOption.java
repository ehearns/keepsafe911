package com.keepSafe911.internal.ui.model;

import com.keepSafe911.internal.configuration.AnncaConfiguration;
import com.keepSafe911.internal.utils.Size;


/**
 * Created by memfis on 12/1/16.
 */

public class PhotoQualityOption implements CharSequence {

    @AnncaConfiguration.MediaQuality
    private int mediaQuality;
    private String title;

    public PhotoQualityOption(@AnncaConfiguration.MediaQuality int mediaQuality, Size size) {
        this.mediaQuality = mediaQuality;

        title = String.valueOf(size.getWidth()) + " x " + String.valueOf(size.getHeight());
    }

    @AnncaConfiguration.MediaQuality
    public int getMediaQuality() {
        return mediaQuality;
    }

    @Override
    public int length() {
        return title.length();
    }

    @Override
    public char charAt(int index) {
        return title.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return title.subSequence(start, end);
    }

    @Override
    public String toString() {
        return title;
    }
}
