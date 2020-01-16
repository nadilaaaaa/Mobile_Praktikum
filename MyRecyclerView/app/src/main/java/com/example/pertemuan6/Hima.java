package com.example.pertemuan6;

import android.os.Parcel;
import android.os.Parcelable;

public class Hima implements Parcelable {
    public static final Parcelable.Creator<Hima> CREATOR = new Parcelable.Creator<Hima>() {
        @Override
        public Hima createFromParcel(Parcel source) {
            return new Hima(source);
        }

        @Override
        public Hima[] newArray(int size) {
            return new Hima[size];
        }
    };
    String namahm;
    String deschm;
    String urlimg;

    public Hima(String namahm, String deschm, String urlimg) {
        this.namahm = namahm;
        this.deschm = deschm;
        this.urlimg = urlimg;
    }

    public Hima() {
    }

    protected Hima(Parcel in) {
        this.namahm = in.readString();
        this.deschm = in.readString();
        this.urlimg = in.readString();
    }

    public String getNamahm() {
        return namahm;
    }

    public void setNamahm(String namahm) {
        this.namahm = namahm;
    }

    public String getDeschm() {
        return deschm;
    }

    public void setDeschm(String deschm) {
        this.deschm = deschm;
    }

    public String getUrlimg() {
        return urlimg;
    }

    public void setUrlimg(String urlimg) {
        this.urlimg = urlimg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namahm);
        dest.writeString(this.deschm);
        dest.writeString(this.urlimg);
    }
}
